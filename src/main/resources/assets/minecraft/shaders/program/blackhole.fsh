#version 150

uniform sampler2D DiffuseSampler;
uniform sampler2D u_blackHoleData;

uniform int u_blackHoleCount;
uniform float u_tanHalfFov;

uniform vec2 InSize;
uniform vec2 OutSize;

in vec2 texCoord;
in vec2 oneTexel;

out vec4 fragColor;

void main() {
    vec2 uv = texCoord;
    vec4 sceneColor = texture(DiffuseSampler, uv);
    float aspect = InSize.x / InSize.y;

    for (int i = 0; i < u_blackHoleCount; i++) {
        float minDist = 1e10;
        vec4 data = vec4(0.0);
        bool found = false;

        for (int ray = 0; ray < 5; ray++) {
            vec4 sampleData = texelFetch(u_blackHoleData, ivec2(i, ray), 0);
            if (sampleData.a < 0.004 && sampleData.r + sampleData.g + sampleData.b < 0.001) continue;
            vec2 sampleUV = vec2(sampleData.r, sampleData.g);
            float d = length(uv - sampleUV);
            if (d < minDist) {
                minDist = d;
                data = sampleData;
                found = true;
            }
        }

        if (!found) continue;

        float occlusion = step(0.5, data.a);

        float r_s = data.b;
        if (r_s < 0.00001) continue;

        vec2 bhUV = vec2(data.r, data.g);
        vec2 delta = uv - bhUV;
        vec2 deltaAspect = vec2(delta.x * aspect, delta.y);
        float dist = length(deltaAspect);

        float shadowRadius = r_s * 2.598;
        float b_crit = shadowRadius;

        float x_low = b_crit + 0.001;
        float x_high = 50.0 * r_s;
        for (int iter = 0; iter < 16; iter++) {
            float x_mid = (x_low + x_high) * 0.5;
            float val = x_mid * sqrt(max(x_mid * x_mid - b_crit * b_crit, 0.001));
            if (val < r_s / u_tanHalfFov) {
                x_low = x_mid;
            } else {
                x_high = x_mid;
            }
        }

        vec2 dir = deltaAspect / max(dist, 0.0001);

        float b_crit2_over_d2 = b_crit * b_crit / (dist * dist);
        float deflection_outer = r_s / (u_tanHalfFov * dist * sqrt(max(1.0 - b_crit2_over_d2, 0.001)));

        float deflection_inner = -log(max(dist / b_crit - 1.0, 0.001));

        float blend = smoothstep(4.5 * r_s, 5.5 * r_s, dist);
        float deflection = mix(deflection_inner, deflection_outer, blend);

        vec2 deflectedUV = bhUV + vec2(dir.x / aspect, dir.y) * (dist - deflection);
        deflectedUV = clamp(deflectedUV, vec2(0.001), vec2(0.999));

        vec4 lensedColor = texture(DiffuseSampler, deflectedUV);

        float eps = r_s * 0.01;

        float d_b_p = (dist + eps) / b_crit;
        float d_bco2_p = b_crit * b_crit / ((dist + eps) * (dist + eps));
        float d_out_p = r_s / (u_tanHalfFov * (dist + eps) * sqrt(max(1.0 - d_bco2_p, 0.001)));
        float d_in_p = -log(max(d_b_p - 1.0, 0.001));
        float d_blnd_p = mix(d_in_p, d_out_p, smoothstep(4.5 * r_s, 5.5 * r_s, dist + eps));

        float d_b_m = (dist - eps) / b_crit;
        float d_bco2_m = b_crit * b_crit / ((dist - eps) * (dist - eps));
        float d_out_m = r_s / (u_tanHalfFov * (dist - eps) * sqrt(max(1.0 - d_bco2_m, 0.001)));
        float d_in_m = -log(max(d_b_m - 1.0, 0.001));
        float d_blnd_m = mix(d_in_m, d_out_m, smoothstep(4.5 * r_s, 5.5 * r_s, dist - eps));

        float d_alpha = (d_blnd_p - d_blnd_m) / (2.0 * eps);
        float lambda_t = 1.0 - deflection / dist;
        float lambda_r = 1.0 - d_alpha;
        float mu = 1.0 / max(abs(lambda_t * lambda_r), 0.001);
        mu = clamp(mu, 1.0, 8.0);

        if (dist < shadowRadius) {
            sceneColor = mix(sceneColor, vec4(0.0, 0.0, 0.0, 1.0), occlusion);
        } else {
            sceneColor.rgb = mix(sceneColor.rgb, lensedColor.rgb * mu, occlusion);
        }
    }

    fragColor = sceneColor;
    fragColor.a = 1.0;
}
