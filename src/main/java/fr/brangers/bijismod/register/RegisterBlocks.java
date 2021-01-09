package fr.brangers.bijismod.register;

import fr.brangers.bijismod.BijisMod;
import fr.brangers.bijismod.blocks.SocialKubOreBlock;
import fr.brangers.bijismod.utils.Create;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.OreBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class RegisterBlocks {

    private static Item.Settings builder = new Item.Settings().group(ItemGroup.DECORATIONS);

    public static Block KUBIUM_ORE;

    public static void registerBlock() {
        KUBIUM_ORE = Create.create(new SocialKubOreBlock(FabricBlockSettings.of(Material.STONE)), builder, "kubium_ore");
    }
}
