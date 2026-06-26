uniform sampler2D DiffuseSampler;
varying vec2 texCoord;

uniform vec2 u_bhPos0;
uniform vec2 u_bhPos1;
uniform float u_bhEh0;
uniform float u_bhEh1;
uniform float u_bhEr0;
uniform float u_bhEr1;
uniform float u_bhCount;
uniform float u_gravityStrength;

void main() {
    vec2 totalOffset = vec2(0.0);
    bool insideEH = false;

    // Black hole 0
    if (u_bhCount >= 1.0) {
        vec2 toCenter = texCoord - u_bhPos0;
        float dist = length(toCenter);
        if (dist <= u_bhEh0) {
            insideEH = true;
        } else {
            float maxRad = max(u_bhEr0, u_bhEh0 * 1.5);
            float cr2 = maxRad * maxRad * u_gravityStrength;
            totalOffset += toCenter * (cr2 / (dist * dist));
        }
    }

    // Black hole 1
    if (u_bhCount >= 2.0 && !insideEH) {
        vec2 toCenter = texCoord - u_bhPos1;
        float dist = length(toCenter);
        if (dist <= u_bhEh1) {
            insideEH = true;
        } else {
            float maxRad = max(u_bhEr1, u_bhEh1 * 1.5);
            float cr2 = maxRad * maxRad * u_gravityStrength;
            totalOffset += toCenter * (cr2 / (dist * dist));
        }
    }

    if (insideEH) {
        gl_FragColor = vec4(0.0, 0.0, 0.0, 1.0);
        return;
    }

    vec2 sampleCoord = texCoord - totalOffset;
    vec2 clampedCoord = clamp(sampleCoord, 0.0, 1.0);
    vec4 lensedColor = texture2D(DiffuseSampler, clampedCoord);
    vec4 origColor = texture2D(DiffuseSampler, texCoord);
    float edgeDist = min(min(sampleCoord.x, 1.0 - sampleCoord.x), min(sampleCoord.y, 1.0 - sampleCoord.y));
    float blend = smoothstep(0.0, 0.05, edgeDist);
    gl_FragColor = mix(origColor, lensedColor, blend);

    // Photon sphere glow ring for each black hole
    for (int i = 0; i < int(u_bhCount); i++) {
        vec2 pos = i == 0 ? u_bhPos0 : u_bhPos1;
        float eh = i == 0 ? u_bhEh0 : u_bhEh1;
        vec2 toCenter = texCoord - pos;
        float dist = length(toCenter);
        float psr = eh * 1.5;
        float ringSigma = psr * 0.15;
        float glowDist = dist - psr;
        float glow = exp(-(glowDist * glowDist) / (2.0 * ringSigma * ringSigma));
        vec4 ringColor = vec4(1.0, 0.65, 0.2, 1.0) * glow * 0.55;
        gl_FragColor = mix(gl_FragColor, ringColor, glow * 0.55);
    }
}
