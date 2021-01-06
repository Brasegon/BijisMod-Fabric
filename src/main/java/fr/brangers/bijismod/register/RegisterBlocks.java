package fr.brangers.bijismod.register;

import fr.brangers.bijismod.BijisMod;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class RegisterBlocks {

    private static Item.Settings builder = new Item.Settings().group(ItemGroup.DECORATIONS);

    public static Block BASIC_BLOCK;


    public static void registerBlock() {
        initBlock(BASIC_BLOCK = new Block(FabricBlockSettings.of(Material.METAL)), builder, setup("basic_block"));
    }

    private static void initBlock(Block block, Item.Settings builder, Identifier name) {
        Registry.register(Registry.BLOCK, name, block);
        BlockItem itemBlock = new BlockItem(block, builder);
        Registry.register(Registry.ITEM, name, itemBlock);
    }

    private static Identifier setup(String name) {
        return new Identifier(BijisMod.MODID, name);
    }
}
