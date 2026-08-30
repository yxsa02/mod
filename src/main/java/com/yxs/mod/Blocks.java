package com.yxs.mod;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public final class Blocks {
    public static final Block EXAMPLE_BLOCK = register("mbox", 
        new Block(Block.Settings.create().strength(4.0f)));

    private static <T extends Block> T register(String path, T block) {
        Registry.register(Registries.BLOCK, new Identifier("tutorial", path), block);
        Registry.register(Registries.ITEM, new Identifier("tutorial", path), 
            new BlockItem(block, new Item.Settings()));
        return block;
    }

    public static void initialize() {
        // 空方法，仅用于触发类加载
    }
}