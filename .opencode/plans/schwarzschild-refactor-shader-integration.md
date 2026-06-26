# Schwarzschild Refactor + Shader Integration Plan

## Phase 1: Refactor TimeDilation.java

### Goals
- Make the Schwarzschild radius explicit in code
- Keep `r_s = mass * 1.0` (backward compatible)
- Expose source data for the renderer

### Changes

**Add constant and helper:**
```java
// Conversion: 1 mass unit → 1 block of Schwarzschild radius (r_s = 2GM/c² in mod units)
private static final double R_S_PER_MASS = 1.0;

private record MassSource(BlockPos pos, double mass) {
    double schwarzschildRadius() {
        return mass * R_S_PER_MASS;
    }
}
```

**Update `getDilationFactor()` — explicit r_s:**
```java
double r_s = source.schwarzschildRadius();
sum += r_s / dist;
```
Then `factor = sqrt(1 - sum)` unchanged. A comment references the standard metric:
`// dτ/dt = sqrt(1 - r_s/r) — outside observer sees dilated entity time`

**New public record and accessor for renderer:**
```java
public record SchwarzschildSource(BlockPos pos, double r_s) {}

public static List<SchwarzschildSource> getSources(World world) {
    List<MassSource> sources = MASS_SOURCES.get(key(world));
    if (sources == null) return List.of();
    List<SchwarzschildSource> result = new ArrayList<>();
    synchronized (sources) {
        for (MassSource s : sources) {
            result.add(new SchwarzschildSource(s.pos, s.schwarzschildRadius()));
        }
    }
    return result;
}
```

## Phase 2: Move shader files to resources

Files are currently at:
- `src/main/java/kayla/pulderessence/shaders/program/blackhole.fsh`
- `src/main/java/kayla/pulderessence/shaders/post/blackhole.json`

Move to (correct Fabric resource location):
- `src/main/resources/assets/pulderessence/shaders/program/blackhole.fsh`
- `src/main/resources/assets/pulderessence/shaders/post/blackhole.json`

Delete the old `src/main/java/kayla/pulderessence/shaders/` directory.

## Phase 3: New BlackholeRenderer client class

Create `src/main/java/kayla/pulderessence/client/BlackholeRenderer.java`:

- Loads `shaders/post/blackhole.json` via `ShaderEffect`
- Each frame (via mixin on `GameRenderer.render()` or Fabric rendering event):
  1. Query `TimeDilation.getSources(world)` for mass sources
  2. For each source, project `BlockPos` → screen UV using the camera's view/projection matrices
  3. Compute screen-space angular radius: `u_eventHorizon = r_s / distance_to_eye * vfov_factor`
  4. Assign `u_gravityStrength` proportional to `r_s`
  5. Update `ShaderEffect` uniforms (`glUniform2f`/`glUniform1f`)
  6. If at least one source is on-screen, enable the shader pass

## Phase 4: Register the renderer

- Add Fabric rendering event listener (client-side) that calls `BlackholeRenderer.tick()`
- The renderer returns `true` if the shader should be active; the event handler injects the post-process pass

Deferred until Phase 3 implementation: which exact mixin or event hook to use (likely `@Inject` into `GameRenderer.renderWorld` or `AfterEntities` rendering event).
