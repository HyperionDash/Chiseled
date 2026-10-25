package net.hyper.chiseled.registry;

import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.hyper.chiseled.Chiseled;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public interface ChiseledCreativeModeTabs {
    CreativeModeTab CHISELED = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, Chiseled.id("chiseled"),
            FabricCreativeModeTab.builder().icon(() -> new ItemStack(ChiseledItems.POLISHED_STONE))
                    .title(Component.translatable("itemGroup.chiseled.chiseled"))
                    .displayItems((_, entries) -> {
                        entries.accept(ChiseledItems.STONE_WALL);
                        entries.accept(ChiseledItems.POLISHED_STONE);
                        entries.accept(ChiseledItems.POLISHED_STONE_STAIRS);
                        entries.accept(ChiseledItems.POLISHED_STONE_SLAB);
                        entries.accept(ChiseledItems.POLISHED_STONE_WALL);
                        entries.accept(ChiseledItems.STONE_PILLAR);
                        entries.accept(ChiseledItems.CUT_STONE_BRICKS);
                        entries.accept(ChiseledItems.CRACKED_CUT_STONE_BRICKS);
                        entries.accept(ChiseledItems.CUT_STONE_BRICK_STAIRS);
                        entries.accept(ChiseledItems.CUT_STONE_BRICK_SLAB);
                        entries.accept(ChiseledItems.MOSSY_CUT_STONE_BRICKS);
                        entries.accept(ChiseledItems.MOSSY_CUT_STONE_BRICK_STAIRS);
                        entries.accept(ChiseledItems.MOSSY_CUT_STONE_BRICK_SLAB);
                        entries.accept(ChiseledItems.STONE_TILES);
                        entries.accept(ChiseledItems.CRACKED_STONE_TILES);
                        entries.accept(ChiseledItems.STONE_TILE_STAIRS);
                        entries.accept(ChiseledItems.STONE_TILE_SLAB);
                        entries.accept(ChiseledItems.STONE_TILE_WALL);
                        entries.accept(ChiseledItems.MOSSY_STONE_TILES);
                        entries.accept(ChiseledItems.MOSSY_STONE_TILE_STAIRS);
                        entries.accept(ChiseledItems.MOSSY_STONE_TILE_SLAB);
                        entries.accept(ChiseledItems.MOSSY_STONE_TILE_WALL);

                        entries.accept(ChiseledItems.POLISHED_GRANITE_WALL);
                        entries.accept(ChiseledItems.POLISHED_GRANITE_PILLAR);
                        entries.accept(ChiseledItems.POLISHED_GRANITE_BRICKS);
                        entries.accept(ChiseledItems.CRACKED_POLISHED_GRANITE_BRICKS);
                        entries.accept(ChiseledItems.POLISHED_GRANITE_BRICK_STAIRS);
                        entries.accept(ChiseledItems.POLISHED_GRANITE_BRICK_SLAB);
                        entries.accept(ChiseledItems.POLISHED_GRANITE_BRICK_WALL);
                        entries.accept(ChiseledItems.CUT_POLISHED_GRANITE_BRICKS);
                        entries.accept(ChiseledItems.CRACKED_CUT_POLISHED_GRANITE_BRICKS);
                        entries.accept(ChiseledItems.CUT_POLISHED_GRANITE_BRICK_STAIRS);
                        entries.accept(ChiseledItems.CUT_POLISHED_GRANITE_BRICK_SLAB);
                        entries.accept(ChiseledItems.POLISHED_GRANITE_TILES);
                        entries.accept(ChiseledItems.CRACKED_POLISHED_GRANITE_TILES);
                        entries.accept(ChiseledItems.POLISHED_GRANITE_TILE_STAIRS);
                        entries.accept(ChiseledItems.POLISHED_GRANITE_TILE_SLAB);
                        entries.accept(ChiseledItems.POLISHED_GRANITE_TILE_WALL);

                        entries.accept(ChiseledItems.POLISHED_DIORITE_WALL);
                        entries.accept(ChiseledItems.POLISHED_DIORITE_PILLAR);
                        entries.accept(ChiseledItems.POLISHED_DIORITE_BRICKS);
                        entries.accept(ChiseledItems.CRACKED_POLISHED_DIORITE_BRICKS);
                        entries.accept(ChiseledItems.POLISHED_DIORITE_BRICK_STAIRS);
                        entries.accept(ChiseledItems.POLISHED_DIORITE_BRICK_SLAB);
                        entries.accept(ChiseledItems.POLISHED_DIORITE_BRICK_WALL);
                        entries.accept(ChiseledItems.CUT_POLISHED_DIORITE_BRICKS);
                        entries.accept(ChiseledItems.CRACKED_CUT_POLISHED_DIORITE_BRICKS);
                        entries.accept(ChiseledItems.CUT_POLISHED_DIORITE_BRICK_STAIRS);
                        entries.accept(ChiseledItems.CUT_POLISHED_DIORITE_BRICK_SLAB);
                        entries.accept(ChiseledItems.POLISHED_DIORITE_TILES);
                        entries.accept(ChiseledItems.CRACKED_POLISHED_DIORITE_TILES);
                        entries.accept(ChiseledItems.POLISHED_DIORITE_TILE_STAIRS);
                        entries.accept(ChiseledItems.POLISHED_DIORITE_TILE_SLAB);
                        entries.accept(ChiseledItems.POLISHED_DIORITE_TILE_WALL);

                        entries.accept(ChiseledItems.POLISHED_ANDESITE_WALL);
                        entries.accept(ChiseledItems.POLISHED_ANDESITE_PILLAR);
                        entries.accept(ChiseledItems.POLISHED_ANDESITE_BRICKS);
                        entries.accept(ChiseledItems.CRACKED_POLISHED_ANDESITE_BRICKS);
                        entries.accept(ChiseledItems.POLISHED_ANDESITE_BRICK_STAIRS);
                        entries.accept(ChiseledItems.POLISHED_ANDESITE_BRICK_SLAB);
                        entries.accept(ChiseledItems.POLISHED_ANDESITE_BRICK_WALL);
                        entries.accept(ChiseledItems.CUT_POLISHED_ANDESITE_BRICKS);
                        entries.accept(ChiseledItems.CRACKED_CUT_POLISHED_ANDESITE_BRICKS);
                        entries.accept(ChiseledItems.CUT_POLISHED_ANDESITE_BRICK_STAIRS);
                        entries.accept(ChiseledItems.CUT_POLISHED_ANDESITE_BRICK_SLAB);
                        entries.accept(ChiseledItems.POLISHED_ANDESITE_TILES);
                        entries.accept(ChiseledItems.CRACKED_POLISHED_ANDESITE_TILES);
                        entries.accept(ChiseledItems.POLISHED_ANDESITE_TILE_STAIRS);
                        entries.accept(ChiseledItems.POLISHED_ANDESITE_TILE_SLAB);
                        entries.accept(ChiseledItems.POLISHED_ANDESITE_TILE_WALL);

                        entries.accept(ChiseledItems.DEEPSLATE_PILLAR);
                        entries.accept(ChiseledItems.CUT_DEEPSLATE_BRICKS);
                        entries.accept(ChiseledItems.CRACKED_CUT_DEEPSLATE_BRICKS);
                        entries.accept(ChiseledItems.CUT_DEEPSLATE_BRICK_STAIRS);
                        entries.accept(ChiseledItems.CUT_DEEPSLATE_BRICK_SLAB);
                        
                        entries.accept(ChiseledItems.CRACKED_BRICKS);
                        entries.accept(ChiseledItems.WEATHERED_BRICKS);
                        entries.accept(ChiseledItems.WEATHERED_BRICK_STAIRS);
                        entries.accept(ChiseledItems.WEATHERED_BRICK_SLAB);
                        entries.accept(ChiseledItems.WEATHERED_BRICK_WALL);
                        entries.accept(ChiseledItems.MOSSY_BRICKS);
                        entries.accept(ChiseledItems.MOSSY_BRICK_STAIRS);
                        entries.accept(ChiseledItems.MOSSY_BRICK_SLAB);
                        entries.accept(ChiseledItems.MOSSY_BRICK_WALL);

                        entries.accept(ChiseledItems.PACKED_MUD_STAIRS);
                        entries.accept(ChiseledItems.PACKED_MUD_SLAB);
                        entries.accept(ChiseledItems.PACKED_MUD_WALL);
                        entries.accept(ChiseledItems.MOSSY_MUD_BRICKS);
                        entries.accept(ChiseledItems.MOSSY_MUD_BRICK_STAIRS);
                        entries.accept(ChiseledItems.MOSSY_MUD_BRICK_SLAB);
                        entries.accept(ChiseledItems.MOSSY_MUD_BRICK_WALL);
                        entries.accept(ChiseledItems.CUT_MUD_BRICKS);
                        entries.accept(ChiseledItems.CUT_MUD_BRICK_STAIRS);
                        entries.accept(ChiseledItems.CUT_MUD_BRICK_SLAB);
                        entries.accept(ChiseledItems.MOSSY_CUT_MUD_BRICKS);
                        entries.accept(ChiseledItems.MOSSY_CUT_MUD_BRICK_STAIRS);
                        entries.accept(ChiseledItems.MOSSY_CUT_MUD_BRICK_SLAB);
                        entries.accept(ChiseledItems.MUD_TILES);
                        entries.accept(ChiseledItems.MUD_TILE_STAIRS);
                        entries.accept(ChiseledItems.MUD_TILE_SLAB);
                        entries.accept(ChiseledItems.MUD_TILE_WALL);
                        entries.accept(ChiseledItems.MOSSY_MUD_TILES);
                        entries.accept(ChiseledItems.MOSSY_MUD_TILE_STAIRS);
                        entries.accept(ChiseledItems.MOSSY_MUD_TILE_SLAB);
                        entries.accept(ChiseledItems.MOSSY_MUD_TILE_WALL);

                        entries.accept(ChiseledItems.SMOOTH_SANDSTONE_WALL);
                        entries.accept(ChiseledItems.SMOOTH_SANDSTONE_PILLAR);
                        entries.accept(ChiseledItems.SMOOTH_SANDSTONE_BRICKS);
                        entries.accept(ChiseledItems.SMOOTH_SANDSTONE_BRICK_STAIRS);
                        entries.accept(ChiseledItems.SMOOTH_SANDSTONE_BRICK_SLAB);
                        entries.accept(ChiseledItems.SMOOTH_SANDSTONE_BRICK_WALL);
                        entries.accept(ChiseledItems.CUT_SMOOTH_SANDSTONE_BRICKS);
                        entries.accept(ChiseledItems.CUT_SMOOTH_SANDSTONE_BRICK_STAIRS);
                        entries.accept(ChiseledItems.CUT_SMOOTH_SANDSTONE_BRICK_SLAB);
                        entries.accept(ChiseledItems.SMOOTH_SANDSTONE_TILES);
                        entries.accept(ChiseledItems.SMOOTH_SANDSTONE_TILE_STAIRS);
                        entries.accept(ChiseledItems.SMOOTH_SANDSTONE_TILE_SLAB);
                        entries.accept(ChiseledItems.SMOOTH_SANDSTONE_TILE_WALL);
                        entries.accept(ChiseledItems.SMOOTH_RED_SANDSTONE_WALL);
                        entries.accept(ChiseledItems.SMOOTH_RED_SANDSTONE_PILLAR);
                        entries.accept(ChiseledItems.SMOOTH_RED_SANDSTONE_BRICKS);
                        entries.accept(ChiseledItems.SMOOTH_RED_SANDSTONE_BRICK_STAIRS);
                        entries.accept(ChiseledItems.SMOOTH_RED_SANDSTONE_BRICK_SLAB);
                        entries.accept(ChiseledItems.SMOOTH_RED_SANDSTONE_BRICK_WALL);
                        entries.accept(ChiseledItems.CUT_SMOOTH_RED_SANDSTONE_BRICKS);
                        entries.accept(ChiseledItems.CUT_SMOOTH_RED_SANDSTONE_BRICK_STAIRS);
                        entries.accept(ChiseledItems.CUT_SMOOTH_RED_SANDSTONE_BRICK_SLAB);
                        entries.accept(ChiseledItems.SMOOTH_RED_SANDSTONE_TILES);
                        entries.accept(ChiseledItems.SMOOTH_RED_SANDSTONE_TILE_STAIRS);
                        entries.accept(ChiseledItems.SMOOTH_RED_SANDSTONE_TILE_SLAB);
                        entries.accept(ChiseledItems.SMOOTH_RED_SANDSTONE_TILE_WALL);

                        entries.accept(ChiseledItems.CRACKED_CINNABAR_BRICKS);
                        entries.accept(ChiseledItems.CUT_CINNABAR_BRICKS);
                        entries.accept(ChiseledItems.CRACKED_CUT_CINNABAR_BRICKS);
                        entries.accept(ChiseledItems.CUT_CINNABAR_BRICK_STAIRS);
                        entries.accept(ChiseledItems.CUT_CINNABAR_BRICK_SLAB);
                        entries.accept(ChiseledItems.CINNABAR_TILES);
                        entries.accept(ChiseledItems.CRACKED_CINNABAR_TILES);
                        entries.accept(ChiseledItems.CINNABAR_TILE_STAIRS);
                        entries.accept(ChiseledItems.CINNABAR_TILE_SLAB);
                        entries.accept(ChiseledItems.CINNABAR_TILE_WALL);

                        entries.accept(ChiseledItems.CRACKED_SULFUR_BRICKS);
                        entries.accept(ChiseledItems.CUT_SULFUR_BRICKS);
                        entries.accept(ChiseledItems.CRACKED_CUT_SULFUR_BRICKS);
                        entries.accept(ChiseledItems.CUT_SULFUR_BRICK_STAIRS);
                        entries.accept(ChiseledItems.CUT_SULFUR_BRICK_SLAB);
                        entries.accept(ChiseledItems.SULFUR_TILES);
                        entries.accept(ChiseledItems.CRACKED_SULFUR_TILES);
                        entries.accept(ChiseledItems.SULFUR_TILE_STAIRS);
                        entries.accept(ChiseledItems.SULFUR_TILE_SLAB);
                        entries.accept(ChiseledItems.SULFUR_TILE_WALL);

                        entries.accept(ChiseledItems.POLISHED_PRISMARINE);
                        entries.accept(ChiseledItems.POLISHED_PRISMARINE_STAIRS);
                        entries.accept(ChiseledItems.POLISHED_PRISMARINE_SLAB);
                        entries.accept(ChiseledItems.POLISHED_PRISMARINE_WALL);
                        entries.accept(ChiseledItems.PRISMARINE_BRICK_WALL);
                        entries.accept(ChiseledItems.CUT_PRISMARINE_BRICKS);
                        entries.accept(ChiseledItems.CUT_PRISMARINE_BRICK_STAIRS);
                        entries.accept(ChiseledItems.CUT_PRISMARINE_BRICK_SLAB);

                        entries.accept(ChiseledItems.DARK_PRISMARINE_WALL);
                        entries.accept(ChiseledItems.POLISHED_DARK_PRISMARINE);
                        entries.accept(ChiseledItems.POLISHED_DARK_PRISMARINE_STAIRS);
                        entries.accept(ChiseledItems.POLISHED_DARK_PRISMARINE_SLAB);
                        entries.accept(ChiseledItems.POLISHED_DARK_PRISMARINE_WALL);
                        entries.accept(ChiseledItems.DARK_PRISMARINE_BRICKS);
                        entries.accept(ChiseledItems.DARK_PRISMARINE_BRICK_STAIRS);
                        entries.accept(ChiseledItems.DARK_PRISMARINE_BRICK_SLAB);
                        entries.accept(ChiseledItems.DARK_PRISMARINE_BRICK_WALL);
                        entries.accept(ChiseledItems.CUT_DARK_PRISMARINE_BRICKS);
                        entries.accept(ChiseledItems.CUT_DARK_PRISMARINE_BRICK_STAIRS);
                        entries.accept(ChiseledItems.CUT_DARK_PRISMARINE_BRICK_SLAB);

                        entries.accept(ChiseledItems.CRACKED_RED_NETHER_BRICKS);
                        entries.accept(ChiseledItems.RED_NETHER_BRICK_FENCE);
                        entries.accept(ChiseledItems.CHISELED_RED_NETHER_BRICKS);

                        entries.accept(ChiseledItems.POLISHED_BLACKSTONE_PILLAR);
                        entries.accept(ChiseledItems.CUT_POLISHED_BLACKSTONE_BRICKS);
                        entries.accept(ChiseledItems.CRACKED_CUT_POLISHED_BLACKSTONE_BRICKS);
                        entries.accept(ChiseledItems.CUT_POLISHED_BLACKSTONE_BRICK_STAIRS);
                        entries.accept(ChiseledItems.CUT_POLISHED_BLACKSTONE_BRICK_SLAB);
                        entries.accept(ChiseledItems.POLISHED_BLACKSTONE_TILES);
                        entries.accept(ChiseledItems.CRACKED_POLISHED_BLACKSTONE_TILES);
                        entries.accept(ChiseledItems.POLISHED_BLACKSTONE_TILE_STAIRS);
                        entries.accept(ChiseledItems.POLISHED_BLACKSTONE_TILE_SLAB);
                        entries.accept(ChiseledItems.POLISHED_BLACKSTONE_TILE_WALL);

                        entries.accept(ChiseledItems.END_STONE_STAIRS);
                        entries.accept(ChiseledItems.END_STONE_SLAB);
                        entries.accept(ChiseledItems.END_STONE_WALL);
                        entries.accept(ChiseledItems.POLISHED_END_STONE);
                        entries.accept(ChiseledItems.POLISHED_END_STONE_STAIRS);
                        entries.accept(ChiseledItems.POLISHED_END_STONE_SLAB);
                        entries.accept(ChiseledItems.POLISHED_END_STONE_WALL);
                        entries.accept(ChiseledItems.END_STONE_PILLAR);
                        entries.accept(ChiseledItems.CRACKED_END_STONE_BRICKS);
                        entries.accept(ChiseledItems.CUT_END_STONE_BRICKS);
                        entries.accept(ChiseledItems.CRACKED_CUT_END_STONE_BRICKS);
                        entries.accept(ChiseledItems.CUT_END_STONE_BRICK_STAIRS);
                        entries.accept(ChiseledItems.CUT_END_STONE_BRICK_SLAB);
                        entries.accept(ChiseledItems.END_STONE_TILES);
                        entries.accept(ChiseledItems.CRACKED_END_STONE_TILES);
                        entries.accept(ChiseledItems.END_STONE_TILE_STAIRS);
                        entries.accept(ChiseledItems.END_STONE_TILE_SLAB);
                        entries.accept(ChiseledItems.END_STONE_TILE_WALL);

                        entries.accept(ChiseledItems.QUARTZ_WALL);
                        entries.accept(ChiseledItems.SMOOTH_QUARTZ_WALL);
                        entries.accept(ChiseledItems.QUARTZ_BRICK_STAIRS);
                        entries.accept(ChiseledItems.QUARTZ_BRICK_SLAB);
                        entries.accept(ChiseledItems.QUARTZ_BRICK_WALL);
                        entries.accept(ChiseledItems.CUT_QUARTZ_BRICKS);
                        entries.accept(ChiseledItems.CUT_QUARTZ_BRICK_STAIRS);
                        entries.accept(ChiseledItems.CUT_QUARTZ_BRICK_SLAB);
                        entries.accept(ChiseledItems.QUARTZ_TILES);
                        entries.accept(ChiseledItems.QUARTZ_TILE_STAIRS);
                        entries.accept(ChiseledItems.QUARTZ_TILE_SLAB);
                        entries.accept(ChiseledItems.QUARTZ_TILE_WALL);

                        entries.accept(ChiseledItems.TERRACOTTA_STAIRS);
                        entries.accept(ChiseledItems.TERRACOTTA_SLAB);
                        entries.accept(ChiseledItems.TERRACOTTA_WALL);
                        entries.accept(ChiseledItems.TERRACOTTA_BRICKS);
                        entries.accept(ChiseledItems.TERRACOTTA_BRICK_STAIRS);
                        entries.accept(ChiseledItems.TERRACOTTA_BRICK_SLAB);
                        entries.accept(ChiseledItems.TERRACOTTA_BRICK_WALL);
                        entries.accept(ChiseledItems.WHITE_CONCRETE_WALL);
                        entries.accept(ChiseledItems.WHITE_TERRACOTTA_STAIRS);
                        entries.accept(ChiseledItems.WHITE_TERRACOTTA_SLAB);
                        entries.accept(ChiseledItems.WHITE_TERRACOTTA_WALL);
                        entries.accept(ChiseledItems.WHITE_TERRACOTTA_BRICKS);
                        entries.accept(ChiseledItems.WHITE_TERRACOTTA_BRICK_STAIRS);
                        entries.accept(ChiseledItems.WHITE_TERRACOTTA_BRICK_SLAB);
                        entries.accept(ChiseledItems.WHITE_TERRACOTTA_BRICK_WALL);
                        entries.accept(ChiseledItems.LIGHT_GRAY_CONCRETE_WALL);
                        entries.accept(ChiseledItems.LIGHT_GRAY_TERRACOTTA_STAIRS);
                        entries.accept(ChiseledItems.LIGHT_GRAY_TERRACOTTA_SLAB);
                        entries.accept(ChiseledItems.LIGHT_GRAY_TERRACOTTA_WALL);
                        entries.accept(ChiseledItems.LIGHT_GRAY_TERRACOTTA_BRICKS);
                        entries.accept(ChiseledItems.LIGHT_GRAY_TERRACOTTA_BRICK_STAIRS);
                        entries.accept(ChiseledItems.LIGHT_GRAY_TERRACOTTA_BRICK_SLAB);
                        entries.accept(ChiseledItems.LIGHT_GRAY_TERRACOTTA_BRICK_WALL);
                        entries.accept(ChiseledItems.GRAY_CONCRETE_WALL);
                        entries.accept(ChiseledItems.GRAY_TERRACOTTA_STAIRS);
                        entries.accept(ChiseledItems.GRAY_TERRACOTTA_SLAB);
                        entries.accept(ChiseledItems.GRAY_TERRACOTTA_WALL);
                        entries.accept(ChiseledItems.GRAY_TERRACOTTA_BRICKS);
                        entries.accept(ChiseledItems.GRAY_TERRACOTTA_BRICK_STAIRS);
                        entries.accept(ChiseledItems.GRAY_TERRACOTTA_BRICK_SLAB);
                        entries.accept(ChiseledItems.GRAY_TERRACOTTA_BRICK_WALL);
                        entries.accept(ChiseledItems.BLACK_CONCRETE_WALL);
                        entries.accept(ChiseledItems.BLACK_TERRACOTTA_STAIRS);
                        entries.accept(ChiseledItems.BLACK_TERRACOTTA_SLAB);
                        entries.accept(ChiseledItems.BLACK_TERRACOTTA_WALL);
                        entries.accept(ChiseledItems.BLACK_TERRACOTTA_BRICKS);
                        entries.accept(ChiseledItems.BLACK_TERRACOTTA_BRICK_STAIRS);
                        entries.accept(ChiseledItems.BLACK_TERRACOTTA_BRICK_SLAB);
                        entries.accept(ChiseledItems.BLACK_TERRACOTTA_BRICK_WALL);
                        entries.accept(ChiseledItems.BROWN_CONCRETE_WALL);
                        entries.accept(ChiseledItems.BROWN_TERRACOTTA_STAIRS);
                        entries.accept(ChiseledItems.BROWN_TERRACOTTA_SLAB);
                        entries.accept(ChiseledItems.BROWN_TERRACOTTA_WALL);
                        entries.accept(ChiseledItems.BROWN_TERRACOTTA_BRICKS);
                        entries.accept(ChiseledItems.BROWN_TERRACOTTA_BRICK_STAIRS);
                        entries.accept(ChiseledItems.BROWN_TERRACOTTA_BRICK_SLAB);
                        entries.accept(ChiseledItems.BROWN_TERRACOTTA_BRICK_WALL);
                        entries.accept(ChiseledItems.RED_CONCRETE_WALL);
                        entries.accept(ChiseledItems.RED_TERRACOTTA_STAIRS);
                        entries.accept(ChiseledItems.RED_TERRACOTTA_SLAB);
                        entries.accept(ChiseledItems.RED_TERRACOTTA_WALL);
                        entries.accept(ChiseledItems.RED_TERRACOTTA_BRICKS);
                        entries.accept(ChiseledItems.RED_TERRACOTTA_BRICK_STAIRS);
                        entries.accept(ChiseledItems.RED_TERRACOTTA_BRICK_SLAB);
                        entries.accept(ChiseledItems.RED_TERRACOTTA_BRICK_WALL);
                        entries.accept(ChiseledItems.ORANGE_CONCRETE_WALL);
                        entries.accept(ChiseledItems.ORANGE_TERRACOTTA_STAIRS);
                        entries.accept(ChiseledItems.ORANGE_TERRACOTTA_SLAB);
                        entries.accept(ChiseledItems.ORANGE_TERRACOTTA_WALL);
                        entries.accept(ChiseledItems.ORANGE_TERRACOTTA_BRICKS);
                        entries.accept(ChiseledItems.ORANGE_TERRACOTTA_BRICK_STAIRS);
                        entries.accept(ChiseledItems.ORANGE_TERRACOTTA_BRICK_SLAB);
                        entries.accept(ChiseledItems.ORANGE_TERRACOTTA_BRICK_WALL);
                        entries.accept(ChiseledItems.YELLOW_CONCRETE_WALL);
                        entries.accept(ChiseledItems.YELLOW_TERRACOTTA_STAIRS);
                        entries.accept(ChiseledItems.YELLOW_TERRACOTTA_SLAB);
                        entries.accept(ChiseledItems.YELLOW_TERRACOTTA_WALL);
                        entries.accept(ChiseledItems.YELLOW_TERRACOTTA_BRICKS);
                        entries.accept(ChiseledItems.YELLOW_TERRACOTTA_BRICK_STAIRS);
                        entries.accept(ChiseledItems.YELLOW_TERRACOTTA_BRICK_SLAB);
                        entries.accept(ChiseledItems.YELLOW_TERRACOTTA_BRICK_WALL);
                        entries.accept(ChiseledItems.LIME_CONCRETE_WALL);
                        entries.accept(ChiseledItems.LIME_TERRACOTTA_STAIRS);
                        entries.accept(ChiseledItems.LIME_TERRACOTTA_SLAB);
                        entries.accept(ChiseledItems.LIME_TERRACOTTA_WALL);
                        entries.accept(ChiseledItems.LIME_TERRACOTTA_BRICKS);
                        entries.accept(ChiseledItems.LIME_TERRACOTTA_BRICK_STAIRS);
                        entries.accept(ChiseledItems.LIME_TERRACOTTA_BRICK_SLAB);
                        entries.accept(ChiseledItems.LIME_TERRACOTTA_BRICK_WALL);
                        entries.accept(ChiseledItems.GREEN_CONCRETE_WALL);
                        entries.accept(ChiseledItems.GREEN_TERRACOTTA_STAIRS);
                        entries.accept(ChiseledItems.GREEN_TERRACOTTA_SLAB);
                        entries.accept(ChiseledItems.GREEN_TERRACOTTA_WALL);
                        entries.accept(ChiseledItems.GREEN_TERRACOTTA_BRICKS);
                        entries.accept(ChiseledItems.GREEN_TERRACOTTA_BRICK_STAIRS);
                        entries.accept(ChiseledItems.GREEN_TERRACOTTA_BRICK_SLAB);
                        entries.accept(ChiseledItems.GREEN_TERRACOTTA_BRICK_WALL);
                        entries.accept(ChiseledItems.CYAN_CONCRETE_WALL);
                        entries.accept(ChiseledItems.CYAN_TERRACOTTA_STAIRS);
                        entries.accept(ChiseledItems.CYAN_TERRACOTTA_SLAB);
                        entries.accept(ChiseledItems.CYAN_TERRACOTTA_WALL);
                        entries.accept(ChiseledItems.CYAN_TERRACOTTA_BRICKS);
                        entries.accept(ChiseledItems.CYAN_TERRACOTTA_BRICK_STAIRS);
                        entries.accept(ChiseledItems.CYAN_TERRACOTTA_BRICK_SLAB);
                        entries.accept(ChiseledItems.CYAN_TERRACOTTA_BRICK_WALL);
                        entries.accept(ChiseledItems.LIGHT_BLUE_CONCRETE_WALL);
                        entries.accept(ChiseledItems.LIGHT_BLUE_TERRACOTTA_STAIRS);
                        entries.accept(ChiseledItems.LIGHT_BLUE_TERRACOTTA_SLAB);
                        entries.accept(ChiseledItems.LIGHT_BLUE_TERRACOTTA_WALL);
                        entries.accept(ChiseledItems.LIGHT_BLUE_TERRACOTTA_BRICKS);
                        entries.accept(ChiseledItems.LIGHT_BLUE_TERRACOTTA_BRICK_STAIRS);
                        entries.accept(ChiseledItems.LIGHT_BLUE_TERRACOTTA_BRICK_SLAB);
                        entries.accept(ChiseledItems.LIGHT_BLUE_TERRACOTTA_BRICK_WALL);
                        entries.accept(ChiseledItems.BLUE_CONCRETE_WALL);
                        entries.accept(ChiseledItems.BLUE_TERRACOTTA_STAIRS);
                        entries.accept(ChiseledItems.BLUE_TERRACOTTA_SLAB);
                        entries.accept(ChiseledItems.BLUE_TERRACOTTA_WALL);
                        entries.accept(ChiseledItems.BLUE_TERRACOTTA_BRICKS);
                        entries.accept(ChiseledItems.BLUE_TERRACOTTA_BRICK_STAIRS);
                        entries.accept(ChiseledItems.BLUE_TERRACOTTA_BRICK_SLAB);
                        entries.accept(ChiseledItems.BLUE_TERRACOTTA_BRICK_WALL);
                        entries.accept(ChiseledItems.PURPLE_CONCRETE_WALL);
                        entries.accept(ChiseledItems.PURPLE_TERRACOTTA_STAIRS);
                        entries.accept(ChiseledItems.PURPLE_TERRACOTTA_SLAB);
                        entries.accept(ChiseledItems.PURPLE_TERRACOTTA_WALL);
                        entries.accept(ChiseledItems.PURPLE_TERRACOTTA_BRICKS);
                        entries.accept(ChiseledItems.PURPLE_TERRACOTTA_BRICK_STAIRS);
                        entries.accept(ChiseledItems.PURPLE_TERRACOTTA_BRICK_SLAB);
                        entries.accept(ChiseledItems.PURPLE_TERRACOTTA_BRICK_WALL);
                        entries.accept(ChiseledItems.MAGENTA_CONCRETE_WALL);
                        entries.accept(ChiseledItems.MAGENTA_TERRACOTTA_STAIRS);
                        entries.accept(ChiseledItems.MAGENTA_TERRACOTTA_SLAB);
                        entries.accept(ChiseledItems.MAGENTA_TERRACOTTA_WALL);
                        entries.accept(ChiseledItems.MAGENTA_TERRACOTTA_BRICKS);
                        entries.accept(ChiseledItems.MAGENTA_TERRACOTTA_BRICK_STAIRS);
                        entries.accept(ChiseledItems.MAGENTA_TERRACOTTA_BRICK_SLAB);
                        entries.accept(ChiseledItems.MAGENTA_TERRACOTTA_BRICK_WALL);
                        entries.accept(ChiseledItems.PINK_CONCRETE_WALL);
                        entries.accept(ChiseledItems.PINK_TERRACOTTA_STAIRS);
                        entries.accept(ChiseledItems.PINK_TERRACOTTA_SLAB);
                        entries.accept(ChiseledItems.PINK_TERRACOTTA_WALL);
                        entries.accept(ChiseledItems.PINK_TERRACOTTA_BRICKS);
                        entries.accept(ChiseledItems.PINK_TERRACOTTA_BRICK_STAIRS);
                        entries.accept(ChiseledItems.PINK_TERRACOTTA_BRICK_SLAB);
                        entries.accept(ChiseledItems.PINK_TERRACOTTA_BRICK_WALL);
                    }).build());

    static void init() {
        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.BUILDING_BLOCKS).register(entries -> {
            entries.insertAfter(Items.STONE_SLAB, ChiseledItems.STONE_WALL);
            entries.insertAfter(Items.SMOOTH_STONE_SLAB, ChiseledItems.POLISHED_STONE,
                    ChiseledItems.POLISHED_STONE_STAIRS,
                    ChiseledItems.POLISHED_STONE_SLAB,
                    ChiseledItems.POLISHED_STONE_WALL,
                    ChiseledItems.STONE_PILLAR);
            entries.insertAfter(Items.MOSSY_STONE_BRICK_WALL, ChiseledItems.CUT_STONE_BRICKS,
                    ChiseledItems.CRACKED_CUT_STONE_BRICKS,
                    ChiseledItems.CUT_STONE_BRICK_STAIRS,
                    ChiseledItems.CUT_STONE_BRICK_SLAB,
                    ChiseledItems.MOSSY_CUT_STONE_BRICKS,
                    ChiseledItems.MOSSY_CUT_STONE_BRICK_STAIRS,
                    ChiseledItems.MOSSY_CUT_STONE_BRICK_SLAB,
                    ChiseledItems.STONE_TILES,
                    ChiseledItems.CRACKED_STONE_TILES,
                    ChiseledItems.STONE_TILE_STAIRS,
                    ChiseledItems.STONE_TILE_SLAB,
                    ChiseledItems.STONE_TILE_WALL,
                    ChiseledItems.MOSSY_STONE_TILES,
                    ChiseledItems.MOSSY_STONE_TILE_STAIRS,
                    ChiseledItems.MOSSY_STONE_TILE_SLAB,
                    ChiseledItems.MOSSY_STONE_TILE_WALL);

            entries.insertAfter(Items.POLISHED_GRANITE_SLAB, ChiseledItems.POLISHED_GRANITE_WALL,
                    ChiseledItems.POLISHED_GRANITE_PILLAR,
                    ChiseledItems.POLISHED_GRANITE_BRICKS,
                    ChiseledItems.CRACKED_POLISHED_GRANITE_BRICKS,
                    ChiseledItems.POLISHED_GRANITE_BRICK_STAIRS,
                    ChiseledItems.POLISHED_GRANITE_BRICK_SLAB,
                    ChiseledItems.POLISHED_GRANITE_BRICK_WALL,
                    ChiseledItems.CUT_POLISHED_GRANITE_BRICKS,
                    ChiseledItems.CRACKED_CUT_POLISHED_GRANITE_BRICKS,
                    ChiseledItems.CUT_POLISHED_GRANITE_BRICK_STAIRS,
                    ChiseledItems.CUT_POLISHED_GRANITE_BRICK_SLAB,
                    ChiseledItems.POLISHED_GRANITE_TILES,
                    ChiseledItems.CRACKED_POLISHED_GRANITE_TILES,
                    ChiseledItems.POLISHED_GRANITE_TILE_STAIRS,
                    ChiseledItems.POLISHED_GRANITE_TILE_SLAB,
                    ChiseledItems.POLISHED_GRANITE_TILE_WALL);

            entries.insertAfter(Items.POLISHED_DIORITE_SLAB, ChiseledItems.POLISHED_DIORITE_WALL,
                    ChiseledItems.POLISHED_DIORITE_PILLAR,
                    ChiseledItems.POLISHED_DIORITE_BRICKS,
                    ChiseledItems.CRACKED_POLISHED_DIORITE_BRICKS,
                    ChiseledItems.POLISHED_DIORITE_BRICK_STAIRS,
                    ChiseledItems.POLISHED_DIORITE_BRICK_SLAB,
                    ChiseledItems.POLISHED_DIORITE_BRICK_WALL,
                    ChiseledItems.CUT_POLISHED_DIORITE_BRICKS,
                    ChiseledItems.CRACKED_CUT_POLISHED_DIORITE_BRICKS,
                    ChiseledItems.CUT_POLISHED_DIORITE_BRICK_STAIRS,
                    ChiseledItems.CUT_POLISHED_DIORITE_BRICK_SLAB,
                    ChiseledItems.POLISHED_DIORITE_TILES,
                    ChiseledItems.CRACKED_POLISHED_DIORITE_TILES,
                    ChiseledItems.POLISHED_DIORITE_TILE_STAIRS,
                    ChiseledItems.POLISHED_DIORITE_TILE_SLAB,
                    ChiseledItems.POLISHED_DIORITE_TILE_WALL);

            entries.insertAfter(Items.POLISHED_ANDESITE_SLAB, ChiseledItems.POLISHED_ANDESITE_WALL,
                    ChiseledItems.POLISHED_ANDESITE_PILLAR,
                    ChiseledItems.POLISHED_ANDESITE_BRICKS,
                    ChiseledItems.CRACKED_POLISHED_ANDESITE_BRICKS,
                    ChiseledItems.POLISHED_ANDESITE_BRICK_STAIRS,
                    ChiseledItems.POLISHED_ANDESITE_BRICK_SLAB,
                    ChiseledItems.POLISHED_ANDESITE_BRICK_WALL,
                    ChiseledItems.CUT_POLISHED_ANDESITE_BRICKS,
                    ChiseledItems.CRACKED_CUT_POLISHED_ANDESITE_BRICKS,
                    ChiseledItems.CUT_POLISHED_ANDESITE_BRICK_STAIRS,
                    ChiseledItems.CUT_POLISHED_ANDESITE_BRICK_SLAB,
                    ChiseledItems.POLISHED_ANDESITE_TILES,
                    ChiseledItems.CRACKED_POLISHED_ANDESITE_TILES,
                    ChiseledItems.POLISHED_ANDESITE_TILE_STAIRS,
                    ChiseledItems.POLISHED_ANDESITE_TILE_SLAB,
                    ChiseledItems.POLISHED_ANDESITE_TILE_WALL);

            entries.insertAfter(Items.POLISHED_DEEPSLATE_WALL, ChiseledItems.DEEPSLATE_PILLAR);
            entries.insertAfter(Items.DEEPSLATE_BRICK_WALL, ChiseledItems.CUT_DEEPSLATE_BRICKS,
                    ChiseledItems.CRACKED_CUT_DEEPSLATE_BRICKS,
                    ChiseledItems.CUT_DEEPSLATE_BRICK_STAIRS,
                    ChiseledItems.CUT_DEEPSLATE_BRICK_SLAB);

            entries.insertAfter(Items.BRICKS, ChiseledItems.CRACKED_BRICKS);
            entries.insertAfter(Items.BRICK_WALL, ChiseledItems.WEATHERED_BRICKS,
                    ChiseledItems.WEATHERED_BRICK_STAIRS,
                    ChiseledItems.WEATHERED_BRICK_SLAB,
                    ChiseledItems.WEATHERED_BRICK_WALL,
                    ChiseledItems.MOSSY_BRICKS,
                    ChiseledItems.MOSSY_BRICK_STAIRS,
                    ChiseledItems.MOSSY_BRICK_SLAB,
                    ChiseledItems.MOSSY_BRICK_WALL);

            entries.insertAfter(Items.PACKED_MUD, ChiseledItems.PACKED_MUD_STAIRS,
                    ChiseledItems.PACKED_MUD_SLAB,
                    ChiseledItems.PACKED_MUD_WALL);
            entries.insertAfter(Items.MUD_BRICK_WALL, ChiseledItems.MOSSY_MUD_BRICKS,
                    ChiseledItems.MOSSY_MUD_BRICK_STAIRS,
                    ChiseledItems.MOSSY_MUD_BRICK_SLAB,
                    ChiseledItems.MOSSY_MUD_BRICK_WALL,
                    ChiseledItems.CUT_MUD_BRICKS,
                    ChiseledItems.CUT_MUD_BRICK_STAIRS,
                    ChiseledItems.CUT_MUD_BRICK_SLAB,
                    ChiseledItems.MOSSY_CUT_MUD_BRICKS,
                    ChiseledItems.MOSSY_CUT_MUD_BRICK_STAIRS,
                    ChiseledItems.MOSSY_CUT_MUD_BRICK_SLAB,
                    ChiseledItems.MUD_TILES,
                    ChiseledItems.MUD_TILE_STAIRS,
                    ChiseledItems.MUD_TILE_SLAB,
                    ChiseledItems.MUD_TILE_WALL,
                    ChiseledItems.MOSSY_MUD_TILES,
                    ChiseledItems.MOSSY_MUD_TILE_STAIRS,
                    ChiseledItems.MOSSY_MUD_TILE_SLAB,
                    ChiseledItems.MOSSY_MUD_TILE_WALL);

            entries.insertAfter(Items.SMOOTH_SANDSTONE_SLAB, ChiseledItems.SMOOTH_SANDSTONE_WALL,
                    ChiseledItems.SMOOTH_SANDSTONE_PILLAR);
            entries.insertAfter(Items.CUT_STANDSTONE_SLAB, ChiseledItems.SMOOTH_SANDSTONE_BRICKS,
                    ChiseledItems.SMOOTH_SANDSTONE_BRICK_STAIRS,
                    ChiseledItems.SMOOTH_SANDSTONE_BRICK_SLAB,
                    ChiseledItems.SMOOTH_SANDSTONE_BRICK_WALL,
                    ChiseledItems.CUT_SMOOTH_SANDSTONE_BRICKS,
                    ChiseledItems.CUT_SMOOTH_SANDSTONE_BRICK_STAIRS,
                    ChiseledItems.CUT_SMOOTH_SANDSTONE_BRICK_SLAB,
                    ChiseledItems.SMOOTH_SANDSTONE_TILES,
                    ChiseledItems.SMOOTH_SANDSTONE_TILE_STAIRS,
                    ChiseledItems.SMOOTH_SANDSTONE_TILE_SLAB,
                    ChiseledItems.SMOOTH_SANDSTONE_TILE_WALL);
            entries.insertAfter(Items.SMOOTH_RED_SANDSTONE_SLAB, ChiseledItems.SMOOTH_RED_SANDSTONE_WALL,
                    ChiseledItems.SMOOTH_RED_SANDSTONE_PILLAR);
            entries.insertAfter(Items.CUT_RED_SANDSTONE_SLAB, ChiseledItems.SMOOTH_RED_SANDSTONE_BRICKS,
                    ChiseledItems.SMOOTH_RED_SANDSTONE_BRICK_STAIRS,
                    ChiseledItems.SMOOTH_RED_SANDSTONE_BRICK_SLAB,
                    ChiseledItems.SMOOTH_RED_SANDSTONE_BRICK_WALL,
                    ChiseledItems.CUT_SMOOTH_RED_SANDSTONE_BRICKS,
                    ChiseledItems.CUT_SMOOTH_RED_SANDSTONE_BRICK_STAIRS,
                    ChiseledItems.CUT_SMOOTH_RED_SANDSTONE_BRICK_SLAB,
                    ChiseledItems.SMOOTH_RED_SANDSTONE_TILES,
                    ChiseledItems.SMOOTH_RED_SANDSTONE_TILE_STAIRS,
                    ChiseledItems.SMOOTH_RED_SANDSTONE_TILE_SLAB,
                    ChiseledItems.SMOOTH_RED_SANDSTONE_TILE_WALL);

            entries.insertAfter(Items.CINNABAR_BRICKS, ChiseledItems.CRACKED_CINNABAR_BRICKS);
            entries.insertAfter(Items.CINNABAR_BRICK_WALL, ChiseledItems.CUT_CINNABAR_BRICKS,
                    ChiseledItems.CRACKED_CUT_CINNABAR_BRICKS,
                    ChiseledItems.CUT_CINNABAR_BRICK_STAIRS,
                    ChiseledItems.CUT_CINNABAR_BRICK_SLAB,
                    ChiseledItems.CINNABAR_TILES,
                    ChiseledItems.CRACKED_CINNABAR_TILES,
                    ChiseledItems.CINNABAR_TILE_STAIRS,
                    ChiseledItems.CINNABAR_TILE_SLAB,
                    ChiseledItems.CINNABAR_TILE_WALL);

            entries.insertAfter(Items.SULFUR_BRICKS, ChiseledItems.CRACKED_SULFUR_BRICKS);
            entries.insertAfter(Items.SULFUR_BRICK_WALL, ChiseledItems.CUT_SULFUR_BRICKS,
                    ChiseledItems.CRACKED_CUT_SULFUR_BRICKS,
                    ChiseledItems.CUT_SULFUR_BRICK_STAIRS,
                    ChiseledItems.CUT_SULFUR_BRICK_SLAB,
                    ChiseledItems.SULFUR_TILES,
                    ChiseledItems.CRACKED_SULFUR_TILES,
                    ChiseledItems.SULFUR_TILE_STAIRS,
                    ChiseledItems.SULFUR_TILE_SLAB,
                    ChiseledItems.SULFUR_TILE_WALL);

            entries.insertAfter(Items.PRISMARINE_WALL, ChiseledItems.POLISHED_PRISMARINE,
                    ChiseledItems.POLISHED_PRISMARINE_STAIRS,
                    ChiseledItems.POLISHED_PRISMARINE_SLAB,
                    ChiseledItems.POLISHED_PRISMARINE_WALL);
            entries.insertAfter(Items.PRISMARINE_BRICK_SLAB, ChiseledItems.PRISMARINE_BRICK_WALL,
                    ChiseledItems.CUT_PRISMARINE_BRICKS,
                    ChiseledItems.CUT_PRISMARINE_BRICK_STAIRS,
                    ChiseledItems.CUT_PRISMARINE_BRICK_SLAB);

            entries.insertAfter(Items.DARK_PRISMARINE_SLAB, ChiseledItems.DARK_PRISMARINE_WALL,
                    ChiseledItems.POLISHED_DARK_PRISMARINE,
                    ChiseledItems.POLISHED_DARK_PRISMARINE_STAIRS,
                    ChiseledItems.POLISHED_DARK_PRISMARINE_SLAB,
                    ChiseledItems.POLISHED_DARK_PRISMARINE_WALL,
                    ChiseledItems.DARK_PRISMARINE_BRICKS,
                    ChiseledItems.DARK_PRISMARINE_BRICK_STAIRS,
                    ChiseledItems.DARK_PRISMARINE_BRICK_SLAB,
                    ChiseledItems.DARK_PRISMARINE_BRICK_WALL,
                    ChiseledItems.CUT_DARK_PRISMARINE_BRICKS,
                    ChiseledItems.CUT_DARK_PRISMARINE_BRICK_STAIRS,
                    ChiseledItems.CUT_DARK_PRISMARINE_BRICK_SLAB);

            entries.insertAfter(Items.RED_NETHER_BRICKS, ChiseledItems.CRACKED_RED_NETHER_BRICKS);
            entries.insertAfter(Items.RED_NETHER_BRICK_WALL, ChiseledItems.RED_NETHER_BRICK_FENCE,
                    ChiseledItems.CHISELED_RED_NETHER_BRICKS);

            entries.insertAfter(Items.POLISHED_BLACKSTONE_BUTTON, ChiseledItems.POLISHED_BLACKSTONE_PILLAR);
            entries.insertAfter(Items.POLISHED_BLACKSTONE_BRICK_WALL, ChiseledItems.CUT_POLISHED_BLACKSTONE_BRICKS,
                    ChiseledItems.CRACKED_CUT_POLISHED_BLACKSTONE_BRICKS,
                    ChiseledItems.CUT_POLISHED_BLACKSTONE_BRICK_STAIRS,
                    ChiseledItems.CUT_POLISHED_BLACKSTONE_BRICK_SLAB,
                    ChiseledItems.POLISHED_BLACKSTONE_TILES,
                    ChiseledItems.CRACKED_POLISHED_BLACKSTONE_TILES,
                    ChiseledItems.POLISHED_BLACKSTONE_TILE_STAIRS,
                    ChiseledItems.POLISHED_BLACKSTONE_TILE_SLAB,
                    ChiseledItems.POLISHED_BLACKSTONE_TILE_WALL);

            entries.insertAfter(Items.END_STONE, ChiseledItems.END_STONE_STAIRS,
                    ChiseledItems.END_STONE_SLAB,
                    ChiseledItems.END_STONE_WALL,
                    ChiseledItems.POLISHED_END_STONE,
                    ChiseledItems.POLISHED_END_STONE_STAIRS,
                    ChiseledItems.POLISHED_END_STONE_SLAB,
                    ChiseledItems.POLISHED_END_STONE_WALL,
                    ChiseledItems.END_STONE_PILLAR);
            entries.insertAfter(Items.END_STONE_BRICKS, ChiseledItems.CRACKED_END_STONE_BRICKS);
            entries.insertAfter(Items.END_STONE_BRICK_WALL, ChiseledItems.CUT_END_STONE_BRICKS,
                    ChiseledItems.CRACKED_CUT_END_STONE_BRICKS,
                    ChiseledItems.CUT_END_STONE_BRICK_STAIRS,
                    ChiseledItems.CUT_END_STONE_BRICK_SLAB,
                    ChiseledItems.END_STONE_TILES,
                    ChiseledItems.CRACKED_END_STONE_TILES,
                    ChiseledItems.END_STONE_TILE_STAIRS,
                    ChiseledItems.END_STONE_TILE_SLAB,
                    ChiseledItems.END_STONE_TILE_WALL);

            entries.insertAfter(Items.QUARTZ_BLOCK, Items.QUARTZ_STAIRS,
                    Items.QUARTZ_SLAB,
                    ChiseledItems.QUARTZ_WALL,
                    Items.CHISELED_QUARTZ_BLOCK,
                    Items.SMOOTH_QUARTZ,
                    Items.SMOOTH_QUARTZ_STAIRS,
                    Items.SMOOTH_QUARTZ_SLAB,
                    ChiseledItems.SMOOTH_QUARTZ_WALL,
                    Items.QUARTZ_PILLAR,
                    Items.QUARTZ_BRICKS,
                    ChiseledItems.QUARTZ_BRICK_STAIRS,
                    ChiseledItems.QUARTZ_BRICK_SLAB,
                    ChiseledItems.QUARTZ_BRICK_WALL,
                    ChiseledItems.CUT_QUARTZ_BRICKS,
                    ChiseledItems.CUT_QUARTZ_BRICK_STAIRS,
                    ChiseledItems.CUT_QUARTZ_BRICK_SLAB,
                    ChiseledItems.QUARTZ_TILES,
                    ChiseledItems.QUARTZ_TILE_STAIRS,
                    ChiseledItems.QUARTZ_TILE_SLAB,
                    ChiseledItems.QUARTZ_TILE_WALL);
        });
        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.COLORED_BLOCKS).register(entries -> {
            entries.insertAfter(Items.DYED_TERRACOTTA.pink(),
                    ChiseledItems.TERRACOTTA_STAIRS,
                    ChiseledItems.WHITE_TERRACOTTA_STAIRS,
                    ChiseledItems.LIGHT_GRAY_TERRACOTTA_STAIRS,
                    ChiseledItems.GRAY_TERRACOTTA_STAIRS,
                    ChiseledItems.BLACK_TERRACOTTA_STAIRS,
                    ChiseledItems.BROWN_TERRACOTTA_STAIRS,
                    ChiseledItems.RED_TERRACOTTA_STAIRS,
                    ChiseledItems.ORANGE_TERRACOTTA_STAIRS,
                    ChiseledItems.YELLOW_TERRACOTTA_STAIRS,
                    ChiseledItems.LIME_TERRACOTTA_STAIRS,
                    ChiseledItems.GREEN_TERRACOTTA_STAIRS,
                    ChiseledItems.CYAN_TERRACOTTA_STAIRS,
                    ChiseledItems.LIGHT_BLUE_TERRACOTTA_STAIRS,
                    ChiseledItems.BLUE_TERRACOTTA_STAIRS,
                    ChiseledItems.PURPLE_TERRACOTTA_STAIRS,
                    ChiseledItems.MAGENTA_TERRACOTTA_STAIRS,
                    ChiseledItems.PINK_TERRACOTTA_STAIRS,
                    ChiseledItems.TERRACOTTA_SLAB,
                    ChiseledItems.WHITE_TERRACOTTA_SLAB,
                    ChiseledItems.LIGHT_GRAY_TERRACOTTA_SLAB,
                    ChiseledItems.GRAY_TERRACOTTA_SLAB,
                    ChiseledItems.BLACK_TERRACOTTA_SLAB,
                    ChiseledItems.BROWN_TERRACOTTA_SLAB,
                    ChiseledItems.RED_TERRACOTTA_SLAB,
                    ChiseledItems.ORANGE_TERRACOTTA_SLAB,
                    ChiseledItems.YELLOW_TERRACOTTA_SLAB,
                    ChiseledItems.LIME_TERRACOTTA_SLAB,
                    ChiseledItems.GREEN_TERRACOTTA_SLAB,
                    ChiseledItems.CYAN_TERRACOTTA_SLAB,
                    ChiseledItems.LIGHT_BLUE_TERRACOTTA_SLAB,
                    ChiseledItems.BLUE_TERRACOTTA_SLAB,
                    ChiseledItems.PURPLE_TERRACOTTA_SLAB,
                    ChiseledItems.MAGENTA_TERRACOTTA_SLAB,
                    ChiseledItems.PINK_TERRACOTTA_SLAB,
                    ChiseledItems.TERRACOTTA_WALL,
                    ChiseledItems.WHITE_TERRACOTTA_WALL,
                    ChiseledItems.LIGHT_GRAY_TERRACOTTA_WALL,
                    ChiseledItems.GRAY_TERRACOTTA_WALL,
                    ChiseledItems.BLACK_TERRACOTTA_WALL,
                    ChiseledItems.BROWN_TERRACOTTA_WALL,
                    ChiseledItems.RED_TERRACOTTA_WALL,
                    ChiseledItems.ORANGE_TERRACOTTA_WALL,
                    ChiseledItems.YELLOW_TERRACOTTA_WALL,
                    ChiseledItems.LIME_TERRACOTTA_WALL,
                    ChiseledItems.GREEN_TERRACOTTA_WALL,
                    ChiseledItems.CYAN_TERRACOTTA_WALL,
                    ChiseledItems.LIGHT_BLUE_TERRACOTTA_WALL,
                    ChiseledItems.BLUE_TERRACOTTA_WALL,
                    ChiseledItems.PURPLE_TERRACOTTA_WALL,
                    ChiseledItems.MAGENTA_TERRACOTTA_WALL,
                    ChiseledItems.PINK_TERRACOTTA_WALL,
                    ChiseledItems.TERRACOTTA_BRICKS,
                    ChiseledItems.WHITE_TERRACOTTA_BRICKS,
                    ChiseledItems.LIGHT_GRAY_TERRACOTTA_BRICKS,
                    ChiseledItems.GRAY_TERRACOTTA_BRICKS,
                    ChiseledItems.BLACK_TERRACOTTA_BRICKS,
                    ChiseledItems.BROWN_TERRACOTTA_BRICKS,
                    ChiseledItems.RED_TERRACOTTA_BRICKS,
                    ChiseledItems.ORANGE_TERRACOTTA_BRICKS,
                    ChiseledItems.YELLOW_TERRACOTTA_BRICKS,
                    ChiseledItems.LIME_TERRACOTTA_BRICKS,
                    ChiseledItems.GREEN_TERRACOTTA_BRICKS,
                    ChiseledItems.CYAN_TERRACOTTA_BRICKS,
                    ChiseledItems.LIGHT_BLUE_TERRACOTTA_BRICKS,
                    ChiseledItems.BLUE_TERRACOTTA_BRICKS,
                    ChiseledItems.PURPLE_TERRACOTTA_BRICKS,
                    ChiseledItems.MAGENTA_TERRACOTTA_BRICKS,
                    ChiseledItems.PINK_TERRACOTTA_BRICKS,
                    ChiseledItems.TERRACOTTA_BRICK_STAIRS,
                    ChiseledItems.WHITE_TERRACOTTA_BRICK_STAIRS,
                    ChiseledItems.LIGHT_GRAY_TERRACOTTA_BRICK_STAIRS,
                    ChiseledItems.GRAY_TERRACOTTA_BRICK_STAIRS,
                    ChiseledItems.BLACK_TERRACOTTA_BRICK_STAIRS,
                    ChiseledItems.BROWN_TERRACOTTA_BRICK_STAIRS,
                    ChiseledItems.RED_TERRACOTTA_BRICK_STAIRS,
                    ChiseledItems.ORANGE_TERRACOTTA_BRICK_STAIRS,
                    ChiseledItems.YELLOW_TERRACOTTA_BRICK_STAIRS,
                    ChiseledItems.LIME_TERRACOTTA_BRICK_STAIRS,
                    ChiseledItems.GREEN_TERRACOTTA_BRICK_STAIRS,
                    ChiseledItems.CYAN_TERRACOTTA_BRICK_STAIRS,
                    ChiseledItems.LIGHT_BLUE_TERRACOTTA_BRICK_STAIRS,
                    ChiseledItems.BLUE_TERRACOTTA_BRICK_STAIRS,
                    ChiseledItems.PURPLE_TERRACOTTA_BRICK_STAIRS,
                    ChiseledItems.MAGENTA_TERRACOTTA_BRICK_STAIRS,
                    ChiseledItems.PINK_TERRACOTTA_BRICK_STAIRS,
                    ChiseledItems.TERRACOTTA_BRICK_SLAB,
                    ChiseledItems.WHITE_TERRACOTTA_BRICK_SLAB,
                    ChiseledItems.LIGHT_GRAY_TERRACOTTA_BRICK_SLAB,
                    ChiseledItems.GRAY_TERRACOTTA_BRICK_SLAB,
                    ChiseledItems.BLACK_TERRACOTTA_BRICK_SLAB,
                    ChiseledItems.BROWN_TERRACOTTA_BRICK_SLAB,
                    ChiseledItems.RED_TERRACOTTA_BRICK_SLAB,
                    ChiseledItems.ORANGE_TERRACOTTA_BRICK_SLAB,
                    ChiseledItems.YELLOW_TERRACOTTA_BRICK_SLAB,
                    ChiseledItems.LIME_TERRACOTTA_BRICK_SLAB,
                    ChiseledItems.GREEN_TERRACOTTA_BRICK_SLAB,
                    ChiseledItems.CYAN_TERRACOTTA_BRICK_SLAB,
                    ChiseledItems.LIGHT_BLUE_TERRACOTTA_BRICK_SLAB,
                    ChiseledItems.BLUE_TERRACOTTA_BRICK_SLAB,
                    ChiseledItems.PURPLE_TERRACOTTA_BRICK_SLAB,
                    ChiseledItems.MAGENTA_TERRACOTTA_BRICK_SLAB,
                    ChiseledItems.PINK_TERRACOTTA_BRICK_SLAB,
                    ChiseledItems.TERRACOTTA_BRICK_WALL,
                    ChiseledItems.WHITE_TERRACOTTA_BRICK_WALL,
                    ChiseledItems.LIGHT_GRAY_TERRACOTTA_BRICK_WALL,
                    ChiseledItems.GRAY_TERRACOTTA_BRICK_WALL,
                    ChiseledItems.BLACK_TERRACOTTA_BRICK_WALL,
                    ChiseledItems.BROWN_TERRACOTTA_BRICK_WALL,
                    ChiseledItems.RED_TERRACOTTA_BRICK_WALL,
                    ChiseledItems.ORANGE_TERRACOTTA_BRICK_WALL,
                    ChiseledItems.YELLOW_TERRACOTTA_BRICK_WALL,
                    ChiseledItems.LIME_TERRACOTTA_BRICK_WALL,
                    ChiseledItems.GREEN_TERRACOTTA_BRICK_WALL,
                    ChiseledItems.CYAN_TERRACOTTA_BRICK_WALL,
                    ChiseledItems.LIGHT_BLUE_TERRACOTTA_BRICK_WALL,
                    ChiseledItems.BLUE_TERRACOTTA_BRICK_WALL,
                    ChiseledItems.PURPLE_TERRACOTTA_BRICK_WALL,
                    ChiseledItems.MAGENTA_TERRACOTTA_BRICK_WALL,
                    ChiseledItems.PINK_TERRACOTTA_BRICK_WALL);
            entries.insertAfter(Items.CONCRETE_SLAB.pink(),
                    ChiseledItems.WHITE_CONCRETE_WALL,
                    ChiseledItems.LIGHT_GRAY_CONCRETE_WALL,
                    ChiseledItems.GRAY_CONCRETE_WALL,
                    ChiseledItems.BLACK_CONCRETE_WALL,
                    ChiseledItems.BROWN_CONCRETE_WALL,
                    ChiseledItems.RED_CONCRETE_WALL,
                    ChiseledItems.ORANGE_CONCRETE_WALL,
                    ChiseledItems.YELLOW_CONCRETE_WALL,
                    ChiseledItems.LIME_CONCRETE_WALL,
                    ChiseledItems.GREEN_CONCRETE_WALL,
                    ChiseledItems.CYAN_CONCRETE_WALL,
                    ChiseledItems.LIGHT_BLUE_CONCRETE_WALL,
                    ChiseledItems.BLUE_CONCRETE_WALL,
                    ChiseledItems.PURPLE_CONCRETE_WALL,
                    ChiseledItems.MAGENTA_CONCRETE_WALL,
                    ChiseledItems.PINK_CONCRETE_WALL);
        });
    }
}
