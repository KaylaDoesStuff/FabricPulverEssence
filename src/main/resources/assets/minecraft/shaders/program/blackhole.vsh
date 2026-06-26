#version 150

out vec2 texCoord;

void main() {
    int id = gl_VertexID;
    float x = float(((id & 1) ^ (id >> 1)) * 2 - 1);
    float y = float((id >> 1) * 2 - 1);
    gl_Position = vec4(x, y, 0.0, 1.0);
    texCoord = gl_Position.xy * 0.5 + 0.5;
}
