package kayla.pulderessence.block.custom;

import net.minecraft.block.*;

public class ModMachineBlock extends Block {
    private Boolean lit;
    private int progress;

    public ModMachineBlock(Settings settings) {
        super(settings);
    }

    public void tick() {
        if(hasRecipe()) {
            if (checkRecipe()==true) {
                dropResult();
            } else {
                progress++;
            }
        }

    }

    private void dropResult() {
        
    }

    private boolean checkRecipe() {}

    public boolean hasRecipe() {}

    public Boolean getLit() {
        return lit;
    }

    public void setLit(Boolean var) {
        lit = var;
    }
}
