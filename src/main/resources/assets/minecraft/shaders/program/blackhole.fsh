uniform sampler2D DiffuseSampler;
varying vec2 texCoord;

uniform vec2 u_blackHolePos;
uniform float u_eventHorizon;
uniform float u_einsteinRadius;
uniform float u_photonSphereRadius;
uniform float u_gravityStrength;

void main() {
    vec2 toCenter = texCoord - u_blackHolePos;
    float dist = length(toCenter);

    // Event horizon — pitch black
    if (dist <= u_eventHorizon) {
        gl_FragColor = vec4(0.0, 0.0, 0.0, 1.0);
        return;
    }

    // Fall back to simple outward warp if Einstein radius isn't useful
    float maxRad = max(u_einsteinRadius, u_photonSphereRadius);

    // β = θ − θ_E²/θ   (Schwarzschild lens equation)
    // Two image branches:
    //   θ > θ_E — primary image, source on same side, β ≥ 0
    //   θ < θ_E — secondary image, source wraps 180° around, β ≤ 0
    float criticalRad2 = maxRad * maxRad * u_gravityStrength;
    float beta;
    vec2 sampleDir;
    if (dist * dist > criticalRad2) {
        beta = dist - criticalRad2 / dist;
        sampleDir = normalize(toCenter);
    } else {
        beta = criticalRad2 / dist - dist;
        sampleDir = -normalize(toCenter);
    }

    vec2 sampleCoord = u_blackHolePos + sampleDir * beta;
    vec2 clampedCoord = clamp(sampleCoord, 0.0, 1.0);
    vec4 lensedColor = texture2D(DiffuseSampler, clampedCoord);
    vec4 origColor = texture2D(DiffuseSampler, texCoord);
    float edgeDist = min(min(sampleCoord.x, 1.0 - sampleCoord.x), min(sampleCoord.y, 1.0 - sampleCoord.y));
    float blend = smoothstep(0.0, 0.05, edgeDist);
    gl_FragColor = mix(origColor, lensedColor, blend);

    // Photon sphere glow ring — warm emission where light orbits (r = 1.5·r_s)
    float ringSigma = u_photonSphereRadius * 0.15;
    float glowDist = dist - u_photonSphereRadius;
    float glow = exp(-(glowDist * glowDist) / (2.0 * ringSigma * ringSigma));
    vec4 ringColor = vec4(1.0, 0.65, 0.2, 1.0) * glow * 0.55;
    gl_FragColor = mix(gl_FragColor, ringColor, glow * 0.55);
}
