package fr.brangers.bijismod.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.OreBlock;

import java.util.Random;

public class SocialKubOreBlock extends OreBlock {
    public SocialKubOreBlock(FabricBlockSettings of) {
        super(of);
    }

    @Override
    protected int getExperienceWhenMined(Random random) {
        return super.getExperienceWhenMined(random);
    }
}
