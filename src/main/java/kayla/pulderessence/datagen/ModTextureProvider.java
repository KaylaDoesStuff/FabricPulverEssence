package kayla.pulderessence.datagen;

import kayla.pulderessence.PulderEssence;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.data.DataOutput;
import net.minecraft.data.DataProvider;
import net.minecraft.data.DataWriter;

import com.google.common.hash.HashCode;
import com.google.common.hash.Hashing;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.util.concurrent.CompletableFuture;

public class ModTextureProvider implements DataProvider {
    private final FabricDataOutput output;

    public ModTextureProvider(FabricDataOutput output) {
        this.output = output;
    }

    @Override
    public CompletableFuture<?> run(DataWriter writer) {
        try {
            // Generate center.png — radial gradient, white at center to gray at edges
            BufferedImage center = new BufferedImage(16, 16, BufferedImage.TYPE_INT_ARGB);
            for (int y = 0; y < 16; y++) {
                for (int x = 0; x < 16; x++) {
                    double dx = x - 7.5;
                    double dy = y - 7.5;
                    double dist = Math.sqrt(dx * dx + dy * dy) / 7.5;
                    int gray = 255 - (int) (dist * 140);
                    gray = Math.max(64, Math.min(255, gray));
                    center.setRGB(x, y, 0xFF000000 | (gray << 16) | (gray << 8) | gray);
                }
            }
            writePng(writer, "textures/block/cable/center.png", center);

            // Generate arm.png — linear gradient, bright at bottom to dark at top
            BufferedImage arm = new BufferedImage(16, 16, BufferedImage.TYPE_INT_ARGB);
            for (int y = 0; y < 16; y++) {
                double t = (15 - y) / 15.0;
                int gray = 200 - (int) (t * 120);
                gray = Math.max(48, Math.min(255, gray));
                for (int x = 0; x < 16; x++) {
                    arm.setRGB(x, y, 0xFF000000 | (gray << 16) | (gray << 8) | gray);
                }
            }
            writePng(writer, "textures/block/cable/arm.png", arm);

            // Generate wire.png — vertical wire bar shape
            BufferedImage wire = new BufferedImage(16, 16, BufferedImage.TYPE_INT_ARGB);
            for (int y = 0; y < 16; y++) {
                for (int x = 0; x < 16; x++) {
                    double dx = Math.abs(x - 7.5);
                    int gray;
                    if (dx < 2.5) {
                        gray = 255 - (int) (dx * 30);
                    } else if (dx < 5) {
                        gray = 180 - (int) ((dx - 2.5) * 60);
                    } else {
                        gray = 32;
                    }
                    gray = Math.max(16, Math.min(255, gray));
                    wire.setRGB(x, y, 0xFF000000 | (gray << 16) | (gray << 8) | gray);
                }
            }
            writePng(writer, "textures/item/wire.png", wire);

        } catch (IOException e) {
            return CompletableFuture.failedFuture(e);
        }
        return CompletableFuture.completedFuture(null);
    }

    private void writePng(DataWriter writer, String relativePath, BufferedImage image) throws IOException {
        Path path = output.getPath().resolve("assets/" + PulderEssence.MOD_ID + "/" + relativePath);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ImageIO.write(image, "PNG", baos);
        byte[] data = baos.toByteArray();
        HashCode hash = Hashing.sha1().hashBytes(data);
        writer.write(path, data, hash);
    }

    @Override
    public String getName() {
        return "Cable Textures";
    }
}
