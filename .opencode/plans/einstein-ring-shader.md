# Einstein Ring Shader Implementation

## Physics

The Schwarzschild lens equation (point mass, source at infinity):

```
β = θ − θ_E² / θ     where   θ_E = sqrt(2 · r_s / D)
```

- β = source angular position
- θ = observed image angular position
- θ_E = Einstein radius
- r_s = Schwarzschild radius of the mass
- D = distance from camera to mass

Two images exist when |β| < 2·θ_E:
- **Primary** (θ > θ_E): same side as source, normal distortion
- **Secondary** (θ < θ_E): opposite side, image inverted, wraps 180° around

At θ = θ_E, β = 0 → source directly behind lens → infinite magnification →
the bright Einstein ring caustic.

## Changes

### `blackhole.fsh`

Replace the current `gravityStrength/(d − eventHorizon)` warp with the
proper lens equation:

```glsl
uniform float u_einsteinRadius;   // Einstein ring radius in UV units

void main() {
    vec2 toCenter = texCoord - u_blackHolePos;
    float dist = length(toCenter);

    // Event horizon — pitch black
    if (dist <= u_eventHorizon) {
        gl_FragColor = vec4(0.0, 0.0, 0.0, 1.0);
        return;
    }

    // Distinguish primary/secondary image branch
    float thetaE = u_einsteinRadius;
    float beta;
    vec2 dir;
    if (dist > thetaE) {
        // Primary image — source on same side
        beta = dist - (thetaE * thetaE) / dist;
        dir = normalize(toCenter);
    } else {
        // Secondary image — source wraps 180° around
        beta = dist - (thetaE * thetaE) / (-dist);
        dir = -normalize(toCenter);
    }

    vec2 sampleCoord = u_blackHolePos + dir * abs(beta);
    sampleCoord = clamp(sampleCoord, 0.0, 1.0);
    gl_FragColor = texture2D(DiffuseSampler, sampleCoord);
}
```

### `blackhole.json`

Add the new uniform:

```json
{ "name": "u_einsteinRadius", "values": [ 0.1 ] }
```

### `BlackholeRenderer.java`

Compute the Einstein radius from r_s and camera distance:

```java
double screenRadPerUV = 2.0 * Math.toRadians(fov / 2.0);
double eventHorizonUV = Math.atan(source.r_s() / dist) / screenRadPerUV;
double einsteinRadiusUV = Math.sqrt(2.0 * source.r_s() / dist) / screenRadPerUV;

setUniform(program, "u_blackHolePos", screenX, screenY);
setUniform(program, "u_eventHorizon", (float) eventHorizonUV);
setUniform(program, "u_einsteinRadius", (float) einsteinRadiusUV);
setUniform(program, "u_gravityStrength", (float) (einsteinRadiusUV * 2.0));
```

Note: `u_gravityStrength` becomes the lensing strength derived from the
Einstein radius — kept as a fallback/tuning parameter.

## Visual signature

- **Bright ring** at angular radius θ_E — the Einstein ring
- **Inside the ring**: background wrapped 180° around (inverted)
- **Outside the ring**: normal outward lensing distortion
- **Event horizon**: pitch black at center
