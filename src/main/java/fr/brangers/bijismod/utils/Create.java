package fr.brangers.bijismod.utils;

import fr.brangers.bijismod.BijisMod;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Create {
    public static Block create(Block block, Item.Settings builder, String name) {
        Registry.register(Registry.BLOCK, identity(name), block);
        BlockItem itemBlock = new BlockItem(block, builder);
        Registry.register(Registry.ITEM, name, itemBlock);
        return block;
    }

    private static Identifier identity(String name) {
        return new Identifier(BijisMod.MODID, name);
    }
}
