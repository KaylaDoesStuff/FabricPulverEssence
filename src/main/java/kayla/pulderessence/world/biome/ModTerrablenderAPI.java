package kayla.pulderessence.world.biome;

import kayla.pulderessence.PulderEssence;
import kayla.pulderessence.world.biome.surface.ModMaterialRules;
import net.minecraft.util.Identifier;
import terrablender.api.Regions;
import terrablender.api.SurfaceRuleManager;
import terrablender.api.TerraBlenderApi;

public class ModTerrablenderAPI implements TerraBlenderApi {
    @Override
    public void onTerraBlenderInitialized() {
        Regions.register(new ModOverworldRegion(new Identifier(PulderEssence.MOD_ID, "overworld"), 4));
        Regions.register(new ModNetherRegion(new Identifier(PulderEssence.MOD_ID, "nether"), 8));

        SurfaceRuleManager.addSurfaceRules(SurfaceRuleManager.RuleCategory.OVERWORLD, PulderEssence.MOD_ID, ModMaterialRules.makeRules());
    }
}
