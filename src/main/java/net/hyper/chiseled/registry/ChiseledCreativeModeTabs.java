package net.hyper.chiseled.registry;

import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.hyper.chiseled.Chiseled;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.*;

public interface ChiseledCreativeModeTabs {
    CreativeModeTab CHISELED = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Chiseled.id("chiseled"),
            FabricCreativeModeTab.builder().icon(() -> new ItemStack(ChiseledBlockItems.POLISHED_STONE))
                    .title(Component.translatable("itemgroup.chiseled.chiseled"))
                    .displayItems((displayContext, entries) -> {
                        entries.accept(ChiseledBlockItems.STONE_WALL);
                        entries.accept(ChiseledBlockItems.POLISHED_STONE);
                        entries.accept(ChiseledBlockItems.POLISHED_STONE_STAIRS);
                        entries.accept(ChiseledBlockItems.POLISHED_STONE_SLAB);
                        entries.accept(ChiseledBlockItems.POLISHED_STONE_WALL);
                        entries.accept(ChiseledBlockItems.SMOOTH_STONE_STAIRS);
                        entries.accept(ChiseledBlockItems.CUT_STONE_BRICKS);
                        entries.accept(ChiseledBlockItems.CRACKED_CUT_STONE_BRICKS);
                        entries.accept(ChiseledBlockItems.CUT_STONE_BRICK_STAIRS);
                        entries.accept(ChiseledBlockItems.CUT_STONE_BRICK_SLAB);
                        entries.accept(ChiseledBlockItems.MOSSY_CUT_STONE_BRICKS);
                        entries.accept(ChiseledBlockItems.MOSSY_CUT_STONE_BRICK_STAIRS);
                        entries.accept(ChiseledBlockItems.MOSSY_CUT_STONE_BRICK_SLAB);
                        entries.accept(ChiseledBlockItems.STONE_TILES);
                        entries.accept(ChiseledBlockItems.CRACKED_STONE_TILES);
                        entries.accept(ChiseledBlockItems.STONE_TILE_STAIRS);
                        entries.accept(ChiseledBlockItems.STONE_TILE_SLAB);
                        entries.accept(ChiseledBlockItems.STONE_TILE_WALL);
                        entries.accept(ChiseledBlockItems.MOSSY_STONE_TILES);
                        entries.accept(ChiseledBlockItems.MOSSY_STONE_TILE_STAIRS);
                        entries.accept(ChiseledBlockItems.MOSSY_STONE_TILE_SLAB);
                        entries.accept(ChiseledBlockItems.MOSSY_STONE_TILE_WALL);

                        entries.accept(ChiseledBlockItems.POLISHED_GRANITE_WALL);
                        entries.accept(ChiseledBlockItems.POLISHED_GRANITE_PILLAR);
                        entries.accept(ChiseledBlockItems.POLISHED_GRANITE_BRICKS);
                        entries.accept(ChiseledBlockItems.CRACKED_POLISHED_GRANITE_BRICKS);
                        entries.accept(ChiseledBlockItems.POLISHED_GRANITE_BRICK_STAIRS);
                        entries.accept(ChiseledBlockItems.POLISHED_GRANITE_BRICK_SLAB);
                        entries.accept(ChiseledBlockItems.POLISHED_GRANITE_BRICK_WALL);
                        entries.accept(ChiseledBlockItems.CUT_POLISHED_GRANITE_BRICKS);
                        entries.accept(ChiseledBlockItems.CRACKED_CUT_POLISHED_GRANITE_BRICKS);
                        entries.accept(ChiseledBlockItems.CUT_POLISHED_GRANITE_BRICK_STAIRS);
                        entries.accept(ChiseledBlockItems.CUT_POLISHED_GRANITE_BRICK_SLAB);
                        entries.accept(ChiseledBlockItems.POLISHED_GRANITE_TILES);
                        entries.accept(ChiseledBlockItems.CRACKED_POLISHED_GRANITE_TILES);
                        entries.accept(ChiseledBlockItems.POLISHED_GRANITE_TILE_STAIRS);
                        entries.accept(ChiseledBlockItems.POLISHED_GRANITE_TILE_SLAB);
                        entries.accept(ChiseledBlockItems.POLISHED_GRANITE_TILE_WALL);

                        entries.accept(ChiseledBlockItems.POLISHED_DIORITE_WALL);
                        entries.accept(ChiseledBlockItems.POLISHED_DIORITE_PILLAR);
                        entries.accept(ChiseledBlockItems.POLISHED_DIORITE_BRICKS);
                        entries.accept(ChiseledBlockItems.CRACKED_POLISHED_DIORITE_BRICKS);
                        entries.accept(ChiseledBlockItems.POLISHED_DIORITE_BRICK_STAIRS);
                        entries.accept(ChiseledBlockItems.POLISHED_DIORITE_BRICK_SLAB);
                        entries.accept(ChiseledBlockItems.POLISHED_DIORITE_BRICK_WALL);
                        entries.accept(ChiseledBlockItems.CUT_POLISHED_DIORITE_BRICKS);
                        entries.accept(ChiseledBlockItems.CRACKED_CUT_POLISHED_DIORITE_BRICKS);
                        entries.accept(ChiseledBlockItems.CUT_POLISHED_DIORITE_BRICK_STAIRS);
                        entries.accept(ChiseledBlockItems.CUT_POLISHED_DIORITE_BRICK_SLAB);
                        entries.accept(ChiseledBlockItems.POLISHED_DIORITE_TILES);
                        entries.accept(ChiseledBlockItems.CRACKED_POLISHED_DIORITE_TILES);
                        entries.accept(ChiseledBlockItems.POLISHED_DIORITE_TILE_STAIRS);
                        entries.accept(ChiseledBlockItems.POLISHED_DIORITE_TILE_SLAB);
                        entries.accept(ChiseledBlockItems.POLISHED_DIORITE_TILE_WALL);

                        entries.accept(ChiseledBlockItems.POLISHED_ANDESITE_WALL);
                        entries.accept(ChiseledBlockItems.POLISHED_ANDESITE_PILLAR);
                        entries.accept(ChiseledBlockItems.POLISHED_ANDESITE_BRICKS);
                        entries.accept(ChiseledBlockItems.CRACKED_POLISHED_ANDESITE_BRICKS);
                        entries.accept(ChiseledBlockItems.POLISHED_ANDESITE_BRICK_STAIRS);
                        entries.accept(ChiseledBlockItems.POLISHED_ANDESITE_BRICK_SLAB);
                        entries.accept(ChiseledBlockItems.POLISHED_ANDESITE_BRICK_WALL);
                        entries.accept(ChiseledBlockItems.CUT_POLISHED_ANDESITE_BRICKS);
                        entries.accept(ChiseledBlockItems.CRACKED_CUT_POLISHED_ANDESITE_BRICKS);
                        entries.accept(ChiseledBlockItems.CUT_POLISHED_ANDESITE_BRICK_STAIRS);
                        entries.accept(ChiseledBlockItems.CUT_POLISHED_ANDESITE_BRICK_SLAB);
                        entries.accept(ChiseledBlockItems.POLISHED_ANDESITE_TILES);
                        entries.accept(ChiseledBlockItems.CRACKED_POLISHED_ANDESITE_TILES);
                        entries.accept(ChiseledBlockItems.POLISHED_ANDESITE_TILE_STAIRS);
                        entries.accept(ChiseledBlockItems.POLISHED_ANDESITE_TILE_SLAB);
                        entries.accept(ChiseledBlockItems.POLISHED_ANDESITE_TILE_WALL);

                        entries.accept(ChiseledBlockItems.CUT_DEEPSLATE_BRICKS);
                        entries.accept(ChiseledBlockItems.CRACKED_CUT_DEEPSLATE_BRICKS);
                        entries.accept(ChiseledBlockItems.CUT_DEEPSLATE_BRICK_STAIRS);
                        entries.accept(ChiseledBlockItems.CUT_DEEPSLATE_BRICK_SLAB);

                        entries.accept(ChiseledBlockItems.CALCITE_STAIRS);
                        entries.accept(ChiseledBlockItems.CALCITE_SLAB);
                        entries.accept(ChiseledBlockItems.CALCITE_WALL);
                        entries.accept(ChiseledBlockItems.POLISHED_CALCITE);
                        entries.accept(ChiseledBlockItems.POLISHED_CALCITE_STAIRS);
                        entries.accept(ChiseledBlockItems.POLISHED_CALCITE_SLAB);
                        entries.accept(ChiseledBlockItems.POLISHED_CALCITE_WALL);
                        entries.accept(ChiseledBlockItems.CALCITE_BRICKS);
                        entries.accept(ChiseledBlockItems.CALCITE_BRICK_STAIRS);
                        entries.accept(ChiseledBlockItems.CALCITE_BRICK_SLAB);
                        entries.accept(ChiseledBlockItems.CALCITE_BRICK_WALL);
                        entries.accept(ChiseledBlockItems.CUT_CALCITE_BRICKS);
                        entries.accept(ChiseledBlockItems.CUT_CALCITE_BRICK_STAIRS);
                        entries.accept(ChiseledBlockItems.CUT_CALCITE_BRICK_SLAB);
                        entries.accept(ChiseledBlockItems.CALCITE_TILES);
                        entries.accept(ChiseledBlockItems.CALCITE_TILE_STAIRS);
                        entries.accept(ChiseledBlockItems.CALCITE_TILE_SLAB);
                        entries.accept(ChiseledBlockItems.CALCITE_TILE_WALL);

                        entries.accept(ChiseledBlockItems.DRIPSTONE_STAIRS);
                        entries.accept(ChiseledBlockItems.DRIPSTONE_SLAB);
                        entries.accept(ChiseledBlockItems.DRIPSTONE_WALL);
                        entries.accept(ChiseledBlockItems.POLISHED_DRIPSTONE);
                        entries.accept(ChiseledBlockItems.POLISHED_DRIPSTONE_STAIRS);
                        entries.accept(ChiseledBlockItems.POLISHED_DRIPSTONE_SLAB);
                        entries.accept(ChiseledBlockItems.POLISHED_DRIPSTONE_WALL);
                        entries.accept(ChiseledBlockItems.DRIPSTONE_BRICKS);
                        entries.accept(ChiseledBlockItems.DRIPSTONE_BRICK_STAIRS);
                        entries.accept(ChiseledBlockItems.DRIPSTONE_BRICK_SLAB);
                        entries.accept(ChiseledBlockItems.DRIPSTONE_BRICK_WALL);
                        entries.accept(ChiseledBlockItems.CUT_DRIPSTONE_BRICKS);
                        entries.accept(ChiseledBlockItems.CUT_DRIPSTONE_BRICK_STAIRS);
                        entries.accept(ChiseledBlockItems.CUT_DRIPSTONE_BRICK_SLAB);
                        entries.accept(ChiseledBlockItems.DRIPSTONE_TILES);
                        entries.accept(ChiseledBlockItems.DRIPSTONE_TILE_STAIRS);
                        entries.accept(ChiseledBlockItems.DRIPSTONE_TILE_SLAB);
                        entries.accept(ChiseledBlockItems.DRIPSTONE_TILE_WALL);

                        entries.accept(ChiseledBlockItems.MIXED_BRICKS);
                        entries.accept(ChiseledBlockItems.MIXED_BRICK_STAIRS);
                        entries.accept(ChiseledBlockItems.MIXED_BRICK_SLAB);
                        entries.accept(ChiseledBlockItems.MIXED_BRICK_WALL);
                        entries.accept(ChiseledBlockItems.MOSSY_BRICKS);
                        entries.accept(ChiseledBlockItems.MOSSY_BRICK_STAIRS);
                        entries.accept(ChiseledBlockItems.MOSSY_BRICK_SLAB);
                        entries.accept(ChiseledBlockItems.MOSSY_BRICK_WALL);

                        entries.accept(ChiseledBlockItems.PACKED_MUD_STAIRS);
                        entries.accept(ChiseledBlockItems.PACKED_MUD_SLAB);
                        entries.accept(ChiseledBlockItems.PACKED_MUD_WALL);
                        entries.accept(ChiseledBlockItems.POLISHED_MUD);
                        entries.accept(ChiseledBlockItems.POLISHED_MUD_STAIRS);
                        entries.accept(ChiseledBlockItems.POLISHED_MUD_SLAB);
                        entries.accept(ChiseledBlockItems.POLISHED_MUD_WALL);
                        entries.accept(ChiseledBlockItems.MOSSY_MUD_BRICKS);
                        entries.accept(ChiseledBlockItems.MOSSY_MUD_BRICK_STAIRS);
                        entries.accept(ChiseledBlockItems.MOSSY_MUD_BRICK_SLAB);
                        entries.accept(ChiseledBlockItems.MOSSY_MUD_BRICK_WALL);
                        entries.accept(ChiseledBlockItems.CUT_MUD_BRICKS);
                        entries.accept(ChiseledBlockItems.CUT_MUD_BRICK_STAIRS);
                        entries.accept(ChiseledBlockItems.CUT_MUD_BRICK_SLAB);
                        entries.accept(ChiseledBlockItems.MOSSY_CUT_MUD_BRICKS);
                        entries.accept(ChiseledBlockItems.MOSSY_CUT_MUD_BRICK_STAIRS);
                        entries.accept(ChiseledBlockItems.MOSSY_CUT_MUD_BRICK_SLAB);
                        entries.accept(ChiseledBlockItems.MUD_TILES);
                        entries.accept(ChiseledBlockItems.MUD_TILE_STAIRS);
                        entries.accept(ChiseledBlockItems.MUD_TILE_SLAB);
                        entries.accept(ChiseledBlockItems.MUD_TILE_WALL);
                        entries.accept(ChiseledBlockItems.MOSSY_MUD_TILES);
                        entries.accept(ChiseledBlockItems.MOSSY_MUD_TILE_STAIRS);
                        entries.accept(ChiseledBlockItems.MOSSY_MUD_TILE_SLAB);
                        entries.accept(ChiseledBlockItems.MOSSY_MUD_TILE_WALL);

                        entries.accept(ChiseledBlockItems.HONEYCOMB_STAIRS);
                        entries.accept(ChiseledBlockItems.HONEYCOMB_SLAB);
                        entries.accept(ChiseledBlockItems.HONEYCOMB_WALL);
                        entries.accept(ChiseledBlockItems.HONEYCOMB_BRICKS);
                        entries.accept(ChiseledBlockItems.HONEYCOMB_BRICK_STAIRS);
                        entries.accept(ChiseledBlockItems.HONEYCOMB_BRICK_SLAB);
                        entries.accept(ChiseledBlockItems.HONEYCOMB_BRICK_WALL);
                        entries.accept(ChiseledBlockItems.CUT_HONEYCOMB_BRICKS);
                        entries.accept(ChiseledBlockItems.CUT_HONEYCOMB_BRICK_STAIRS);
                        entries.accept(ChiseledBlockItems.CUT_HONEYCOMB_BRICK_SLAB);
                        entries.accept(ChiseledBlockItems.HONEYCOMB_TILES);
                        entries.accept(ChiseledBlockItems.HONEYCOMB_TILE_STAIRS);
                        entries.accept(ChiseledBlockItems.HONEYCOMB_TILE_SLAB);
                        entries.accept(ChiseledBlockItems.HONEYCOMB_TILE_WALL);

                        entries.accept(ChiseledBlockItems.SMOOTH_SANDSTONE_WALL);
                        entries.accept(ChiseledBlockItems.SANDSTONE_BRICKS);
                        entries.accept(ChiseledBlockItems.SANDSTONE_BRICK_STAIRS);
                        entries.accept(ChiseledBlockItems.SANDSTONE_BRICK_SLAB);
                        entries.accept(ChiseledBlockItems.SANDSTONE_BRICK_WALL);
                        entries.accept(ChiseledBlockItems.CUT_SANDSTONE_BRICKS);
                        entries.accept(ChiseledBlockItems.CUT_SANDSTONE_BRICK_STAIRS);
                        entries.accept(ChiseledBlockItems.CUT_SANDSTONE_BRICK_SLAB);
                        entries.accept(ChiseledBlockItems.SANDSTONE_TILES);
                        entries.accept(ChiseledBlockItems.SANDSTONE_TILE_STAIRS);
                        entries.accept(ChiseledBlockItems.SANDSTONE_TILE_SLAB);
                        entries.accept(ChiseledBlockItems.SANDSTONE_TILE_WALL);

                        entries.accept(ChiseledBlockItems.SMOOTH_RED_SANDSTONE_WALL);
                        entries.accept(ChiseledBlockItems.RED_SANDSTONE_BRICKS);
                        entries.accept(ChiseledBlockItems.RED_SANDSTONE_BRICK_STAIRS);
                        entries.accept(ChiseledBlockItems.RED_SANDSTONE_BRICK_SLAB);
                        entries.accept(ChiseledBlockItems.RED_SANDSTONE_BRICK_WALL);
                        entries.accept(ChiseledBlockItems.CUT_RED_SANDSTONE_BRICKS);
                        entries.accept(ChiseledBlockItems.CUT_RED_SANDSTONE_BRICK_STAIRS);
                        entries.accept(ChiseledBlockItems.CUT_RED_SANDSTONE_BRICK_SLAB);
                        entries.accept(ChiseledBlockItems.RED_SANDSTONE_TILES);
                        entries.accept(ChiseledBlockItems.RED_SANDSTONE_TILE_STAIRS);
                        entries.accept(ChiseledBlockItems.RED_SANDSTONE_TILE_SLAB);
                        entries.accept(ChiseledBlockItems.RED_SANDSTONE_TILE_WALL);

                        entries.accept(ChiseledBlockItems.CUT_CINNABAR_BRICKS);
                        entries.accept(ChiseledBlockItems.CUT_CINNABAR_BRICK_STAIRS);
                        entries.accept(ChiseledBlockItems.CUT_CINNABAR_BRICK_SLAB);
                        entries.accept(ChiseledBlockItems.CINNABAR_TILES);
                        entries.accept(ChiseledBlockItems.CINNABAR_TILE_STAIRS);
                        entries.accept(ChiseledBlockItems.CINNABAR_TILE_SLAB);
                        entries.accept(ChiseledBlockItems.CINNABAR_TILE_WALL);
                        
                        entries.accept(ChiseledBlockItems.CUT_SULFUR_BRICKS);
                        entries.accept(ChiseledBlockItems.CUT_SULFUR_BRICK_STAIRS);
                        entries.accept(ChiseledBlockItems.CUT_SULFUR_BRICK_SLAB);
                        entries.accept(ChiseledBlockItems.SULFUR_TILES);
                        entries.accept(ChiseledBlockItems.SULFUR_TILE_STAIRS);
                        entries.accept(ChiseledBlockItems.SULFUR_TILE_SLAB);
                        entries.accept(ChiseledBlockItems.SULFUR_TILE_WALL);

                        entries.accept(ChiseledBlockItems.PRISMARINE_BRICK_WALL);
                        entries.accept(ChiseledBlockItems.CUT_PRISMARINE_BRICKS);
                        entries.accept(ChiseledBlockItems.CUT_PRISMARINE_BRICK_STAIRS);
                        entries.accept(ChiseledBlockItems.CUT_PRISMARINE_BRICK_SLAB);
                        entries.accept(ChiseledBlockItems.DARK_PRISMARINE_WALL);
                        entries.accept(ChiseledBlockItems.DARK_PRISMARINE_BRICKS);
                        entries.accept(ChiseledBlockItems.DARK_PRISMARINE_BRICK_STAIRS);
                        entries.accept(ChiseledBlockItems.DARK_PRISMARINE_BRICK_SLAB);
                        entries.accept(ChiseledBlockItems.DARK_PRISMARINE_BRICK_WALL);
                        entries.accept(ChiseledBlockItems.CUT_DARK_PRISMARINE_BRICKS);
                        entries.accept(ChiseledBlockItems.CUT_DARK_PRISMARINE_BRICK_STAIRS);
                        entries.accept(ChiseledBlockItems.CUT_DARK_PRISMARINE_BRICK_SLAB);

                        entries.accept(ChiseledBlockItems.PACKED_SNOW_BRICKS);
                        entries.accept(ChiseledBlockItems.PACKED_SNOW_BRICK_STAIRS);
                        entries.accept(ChiseledBlockItems.PACKED_SNOW_BRICK_SLAB);
                        entries.accept(ChiseledBlockItems.CUT_PACKED_SNOW_BRICKS);
                        entries.accept(ChiseledBlockItems.CUT_PACKED_SNOW_BRICK_STAIRS);
                        entries.accept(ChiseledBlockItems.CUT_PACKED_SNOW_BRICK_SLAB);
                        entries.accept(ChiseledBlockItems.PACKED_SNOW_TILES);
                        entries.accept(ChiseledBlockItems.PACKED_SNOW_TILE_STAIRS);
                        entries.accept(ChiseledBlockItems.PACKED_SNOW_TILE_SLAB);

                        entries.accept(ChiseledBlockItems.CRACKED_RED_NETHER_BRICKS);
                        entries.accept(ChiseledBlockItems.RED_NETHER_BRICK_FENCE);
                        entries.accept(ChiseledBlockItems.CHISELED_RED_NETHER_BRICKS);

                        entries.accept(ChiseledBlockItems.SMOOTH_BASALT_STAIRS);
                        entries.accept(ChiseledBlockItems.SMOOTH_BASALT_SLAB);
                        entries.accept(ChiseledBlockItems.SMOOTH_BASALT_WALL);
                        entries.accept(ChiseledBlockItems.BASALT_BRICKS);
                        entries.accept(ChiseledBlockItems.BASALT_BRICK_STAIRS);
                        entries.accept(ChiseledBlockItems.BASALT_BRICK_SLAB);
                        entries.accept(ChiseledBlockItems.BASALT_BRICK_WALL);
                        entries.accept(ChiseledBlockItems.CUT_BASALT_BRICKS);
                        entries.accept(ChiseledBlockItems.CUT_BASALT_BRICK_STAIRS);
                        entries.accept(ChiseledBlockItems.CUT_BASALT_BRICK_SLAB);
                        entries.accept(ChiseledBlockItems.BASALT_TILES);
                        entries.accept(ChiseledBlockItems.BASALT_TILE_STAIRS);
                        entries.accept(ChiseledBlockItems.BASALT_TILE_SLAB);
                        entries.accept(ChiseledBlockItems.BASALT_TILE_WALL);

                        entries.accept(ChiseledBlockItems.CUT_POLISHED_BLACKSTONE_BRICKS);
                        entries.accept(ChiseledBlockItems.CRACKED_CUT_POLISHED_BLACKSTONE_BRICKS);
                        entries.accept(ChiseledBlockItems.CUT_POLISHED_BLACKSTONE_BRICK_STAIRS);
                        entries.accept(ChiseledBlockItems.CUT_POLISHED_BLACKSTONE_BRICK_SLAB);
                        entries.accept(ChiseledBlockItems.POLISHED_BLACKSTONE_TILES);
                        entries.accept(ChiseledBlockItems.CRACKED_POLISHED_BLACKSTONE_TILES);
                        entries.accept(ChiseledBlockItems.POLISHED_BLACKSTONE_TILE_STAIRS);
                        entries.accept(ChiseledBlockItems.POLISHED_BLACKSTONE_TILE_SLAB);
                        entries.accept(ChiseledBlockItems.POLISHED_BLACKSTONE_TILE_WALL);

                        entries.accept(ChiseledBlockItems.END_STONE_STAIRS);
                        entries.accept(ChiseledBlockItems.END_STONE_SLAB);
                        entries.accept(ChiseledBlockItems.END_STONE_WALL);
                        entries.accept(ChiseledBlockItems.POLISHED_END_STONE);
                        entries.accept(ChiseledBlockItems.POLISHED_END_STONE_STAIRS);
                        entries.accept(ChiseledBlockItems.POLISHED_END_STONE_SLAB);
                        entries.accept(ChiseledBlockItems.POLISHED_END_STONE_WALL);
                        entries.accept(ChiseledBlockItems.CRACKED_END_STONE_BRICKS);
                        entries.accept(ChiseledBlockItems.CUT_END_STONE_BRICKS);
                        entries.accept(ChiseledBlockItems.CRACKED_CUT_END_STONE_BRICKS);
                        entries.accept(ChiseledBlockItems.CUT_END_STONE_BRICK_STAIRS);
                        entries.accept(ChiseledBlockItems.CUT_END_STONE_BRICK_SLAB);
                        entries.accept(ChiseledBlockItems.END_STONE_TILES);
                        entries.accept(ChiseledBlockItems.CRACKED_END_STONE_TILES);
                        entries.accept(ChiseledBlockItems.END_STONE_TILE_STAIRS);
                        entries.accept(ChiseledBlockItems.END_STONE_TILE_SLAB);
                        entries.accept(ChiseledBlockItems.END_STONE_TILE_WALL);

                        entries.accept(ChiseledBlockItems.QUARTZ_WALL);
                        entries.accept(ChiseledBlockItems.SMOOTH_QUARTZ_WALL);
                        entries.accept(ChiseledBlockItems.QUARTZ_BRICK_STAIRS);
                        entries.accept(ChiseledBlockItems.QUARTZ_BRICK_SLAB);
                        entries.accept(ChiseledBlockItems.QUARTZ_BRICK_WALL);
                        entries.accept(ChiseledBlockItems.CUT_QUARTZ_BRICKS);
                        entries.accept(ChiseledBlockItems.CUT_QUARTZ_BRICK_STAIRS);
                        entries.accept(ChiseledBlockItems.CUT_QUARTZ_BRICK_SLAB);
                        entries.accept(ChiseledBlockItems.QUARTZ_TILES);
                        entries.accept(ChiseledBlockItems.QUARTZ_TILE_STAIRS);
                        entries.accept(ChiseledBlockItems.QUARTZ_TILE_SLAB);
                        entries.accept(ChiseledBlockItems.QUARTZ_TILE_WALL);

                        entries.accept(ChiseledBlockItems.AMETHYST_STAIRS);
                        entries.accept(ChiseledBlockItems.AMETHYST_SLAB);
                        entries.accept(ChiseledBlockItems.AMETHYST_WALL);
                        entries.accept(ChiseledBlockItems.AMETHYST_BRICKS);
                        entries.accept(ChiseledBlockItems.AMETHYST_BRICK_STAIRS);
                        entries.accept(ChiseledBlockItems.AMETHYST_BRICK_SLAB);
                        entries.accept(ChiseledBlockItems.AMETHYST_BRICK_WALL);
                        entries.accept(ChiseledBlockItems.CUT_AMETHYST_BRICKS);
                        entries.accept(ChiseledBlockItems.CUT_AMETHYST_BRICK_STAIRS);
                        entries.accept(ChiseledBlockItems.CUT_AMETHYST_BRICK_SLAB);
                        entries.accept(ChiseledBlockItems.AMETHYST_TILES);
                        entries.accept(ChiseledBlockItems.AMETHYST_TILE_STAIRS);
                        entries.accept(ChiseledBlockItems.AMETHYST_TILE_SLAB);
                        entries.accept(ChiseledBlockItems.AMETHYST_TILE_WALL);

                        entries.accept(ChiseledBlockItems.TERRACOTTA_BRICKS);
                        entries.accept(ChiseledBlockItems.TERRACOTTA_BRICK_STAIRS);
                        entries.accept(ChiseledBlockItems.TERRACOTTA_BRICK_SLAB);
                        entries.accept(ChiseledBlockItems.TERRACOTTA_BRICK_WALL);
                        entries.accept(ChiseledBlockItems.WHITE_TERRACOTTA_BRICKS);
                        entries.accept(ChiseledBlockItems.WHITE_TERRACOTTA_BRICK_STAIRS);
                        entries.accept(ChiseledBlockItems.WHITE_TERRACOTTA_BRICK_SLAB);
                        entries.accept(ChiseledBlockItems.WHITE_TERRACOTTA_BRICK_WALL);
                        entries.accept(ChiseledBlockItems.LIGHT_GRAY_TERRACOTTA_BRICKS);
                        entries.accept(ChiseledBlockItems.LIGHT_GRAY_TERRACOTTA_BRICK_STAIRS);
                        entries.accept(ChiseledBlockItems.LIGHT_GRAY_TERRACOTTA_BRICK_SLAB);
                        entries.accept(ChiseledBlockItems.LIGHT_GRAY_TERRACOTTA_BRICK_WALL);
                        entries.accept(ChiseledBlockItems.GRAY_TERRACOTTA_BRICKS);
                        entries.accept(ChiseledBlockItems.GRAY_TERRACOTTA_BRICK_STAIRS);
                        entries.accept(ChiseledBlockItems.GRAY_TERRACOTTA_BRICK_SLAB);
                        entries.accept(ChiseledBlockItems.GRAY_TERRACOTTA_BRICK_WALL);
                        entries.accept(ChiseledBlockItems.BLACK_TERRACOTTA_BRICKS);
                        entries.accept(ChiseledBlockItems.BLACK_TERRACOTTA_BRICK_STAIRS);
                        entries.accept(ChiseledBlockItems.BLACK_TERRACOTTA_BRICK_SLAB);
                        entries.accept(ChiseledBlockItems.BLACK_TERRACOTTA_BRICK_WALL);
                        entries.accept(ChiseledBlockItems.BROWN_TERRACOTTA_BRICKS);
                        entries.accept(ChiseledBlockItems.BROWN_TERRACOTTA_BRICK_STAIRS);
                        entries.accept(ChiseledBlockItems.BROWN_TERRACOTTA_BRICK_SLAB);
                        entries.accept(ChiseledBlockItems.BROWN_TERRACOTTA_BRICK_WALL);
                        entries.accept(ChiseledBlockItems.RED_TERRACOTTA_BRICKS);
                        entries.accept(ChiseledBlockItems.RED_TERRACOTTA_BRICK_STAIRS);
                        entries.accept(ChiseledBlockItems.RED_TERRACOTTA_BRICK_SLAB);
                        entries.accept(ChiseledBlockItems.RED_TERRACOTTA_BRICK_WALL);
                        entries.accept(ChiseledBlockItems.ORANGE_TERRACOTTA_BRICKS);
                        entries.accept(ChiseledBlockItems.ORANGE_TERRACOTTA_BRICK_STAIRS);
                        entries.accept(ChiseledBlockItems.ORANGE_TERRACOTTA_BRICK_SLAB);
                        entries.accept(ChiseledBlockItems.ORANGE_TERRACOTTA_BRICK_WALL);
                        entries.accept(ChiseledBlockItems.YELLOW_TERRACOTTA_BRICKS);
                        entries.accept(ChiseledBlockItems.YELLOW_TERRACOTTA_BRICK_STAIRS);
                        entries.accept(ChiseledBlockItems.YELLOW_TERRACOTTA_BRICK_SLAB);
                        entries.accept(ChiseledBlockItems.YELLOW_TERRACOTTA_BRICK_WALL);
                        entries.accept(ChiseledBlockItems.LIME_TERRACOTTA_BRICKS);
                        entries.accept(ChiseledBlockItems.LIME_TERRACOTTA_BRICK_STAIRS);
                        entries.accept(ChiseledBlockItems.LIME_TERRACOTTA_BRICK_SLAB);
                        entries.accept(ChiseledBlockItems.LIME_TERRACOTTA_BRICK_WALL);
                        entries.accept(ChiseledBlockItems.GREEN_TERRACOTTA_BRICKS);
                        entries.accept(ChiseledBlockItems.GREEN_TERRACOTTA_BRICK_STAIRS);
                        entries.accept(ChiseledBlockItems.GREEN_TERRACOTTA_BRICK_SLAB);
                        entries.accept(ChiseledBlockItems.GREEN_TERRACOTTA_BRICK_WALL);
                        entries.accept(ChiseledBlockItems.CYAN_TERRACOTTA_BRICKS);
                        entries.accept(ChiseledBlockItems.CYAN_TERRACOTTA_BRICK_STAIRS);
                        entries.accept(ChiseledBlockItems.CYAN_TERRACOTTA_BRICK_SLAB);
                        entries.accept(ChiseledBlockItems.CYAN_TERRACOTTA_BRICK_WALL);
                        entries.accept(ChiseledBlockItems.LIGHT_BLUE_TERRACOTTA_BRICKS);
                        entries.accept(ChiseledBlockItems.LIGHT_BLUE_TERRACOTTA_BRICK_STAIRS);
                        entries.accept(ChiseledBlockItems.LIGHT_BLUE_TERRACOTTA_BRICK_SLAB);
                        entries.accept(ChiseledBlockItems.LIGHT_BLUE_TERRACOTTA_BRICK_WALL);
                        entries.accept(ChiseledBlockItems.BLUE_TERRACOTTA_BRICKS);
                        entries.accept(ChiseledBlockItems.BLUE_TERRACOTTA_BRICK_STAIRS);
                        entries.accept(ChiseledBlockItems.BLUE_TERRACOTTA_BRICK_SLAB);
                        entries.accept(ChiseledBlockItems.BLUE_TERRACOTTA_BRICK_WALL);
                        entries.accept(ChiseledBlockItems.PURPLE_TERRACOTTA_BRICKS);
                        entries.accept(ChiseledBlockItems.PURPLE_TERRACOTTA_BRICK_STAIRS);
                        entries.accept(ChiseledBlockItems.PURPLE_TERRACOTTA_BRICK_SLAB);
                        entries.accept(ChiseledBlockItems.PURPLE_TERRACOTTA_BRICK_WALL);
                        entries.accept(ChiseledBlockItems.MAGENTA_TERRACOTTA_BRICKS);
                        entries.accept(ChiseledBlockItems.MAGENTA_TERRACOTTA_BRICK_STAIRS);
                        entries.accept(ChiseledBlockItems.MAGENTA_TERRACOTTA_BRICK_SLAB);
                        entries.accept(ChiseledBlockItems.MAGENTA_TERRACOTTA_BRICK_WALL);
                        entries.accept(ChiseledBlockItems.PINK_TERRACOTTA_BRICKS);
                        entries.accept(ChiseledBlockItems.PINK_TERRACOTTA_BRICK_STAIRS);
                        entries.accept(ChiseledBlockItems.PINK_TERRACOTTA_BRICK_SLAB);
                        entries.accept(ChiseledBlockItems.PINK_TERRACOTTA_BRICK_WALL);
                    }).build());

    static void init() {
        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.BUILDING_BLOCKS).register(entries -> {
            entries.insertAfter(Items.STONE_SLAB, ChiseledBlockItems.STONE_WALL);
            entries.insertAfter(Items.MOSSY_COBBLESTONE_WALL, ChiseledBlockItems.POLISHED_STONE,
                    ChiseledBlockItems.POLISHED_STONE_STAIRS,
                    ChiseledBlockItems.POLISHED_STONE_SLAB,
                    ChiseledBlockItems.POLISHED_STONE_WALL);
            entries.insertAfter(Items.SMOOTH_STONE, ChiseledBlockItems.SMOOTH_STONE_STAIRS);
            entries.insertAfter(Items.MOSSY_STONE_BRICK_WALL, ChiseledBlockItems.CUT_STONE_BRICKS,
                    ChiseledBlockItems.CRACKED_CUT_STONE_BRICKS,
                    ChiseledBlockItems.CUT_STONE_BRICK_STAIRS,
                    ChiseledBlockItems.CUT_STONE_BRICK_SLAB,
                    ChiseledBlockItems.MOSSY_CUT_STONE_BRICKS,
                    ChiseledBlockItems.MOSSY_CUT_STONE_BRICK_STAIRS,
                    ChiseledBlockItems.MOSSY_CUT_STONE_BRICK_SLAB,
                    ChiseledBlockItems.STONE_TILES,
                    ChiseledBlockItems.CRACKED_STONE_TILES,
                    ChiseledBlockItems.STONE_TILE_STAIRS,
                    ChiseledBlockItems.STONE_TILE_SLAB,
                    ChiseledBlockItems.STONE_TILE_WALL,
                    ChiseledBlockItems.MOSSY_STONE_TILES,
                    ChiseledBlockItems.MOSSY_STONE_TILE_STAIRS,
                    ChiseledBlockItems.MOSSY_STONE_TILE_SLAB,
                    ChiseledBlockItems.MOSSY_STONE_TILE_WALL);

            entries.insertAfter(Items.POLISHED_GRANITE_SLAB, ChiseledBlockItems.POLISHED_GRANITE_WALL,
                    ChiseledBlockItems.POLISHED_GRANITE_PILLAR,
                    ChiseledBlockItems.POLISHED_GRANITE_BRICKS,
                    ChiseledBlockItems.CRACKED_POLISHED_GRANITE_BRICKS,
                    ChiseledBlockItems.POLISHED_GRANITE_BRICK_STAIRS,
                    ChiseledBlockItems.POLISHED_GRANITE_BRICK_SLAB,
                    ChiseledBlockItems.POLISHED_GRANITE_BRICK_WALL,
                    ChiseledBlockItems.CUT_POLISHED_GRANITE_BRICKS,
                    ChiseledBlockItems.CRACKED_CUT_POLISHED_GRANITE_BRICKS,
                    ChiseledBlockItems.CUT_POLISHED_GRANITE_BRICK_STAIRS,
                    ChiseledBlockItems.CUT_POLISHED_GRANITE_BRICK_SLAB,
                    ChiseledBlockItems.POLISHED_GRANITE_TILES,
                    ChiseledBlockItems.CRACKED_POLISHED_GRANITE_TILES,
                    ChiseledBlockItems.POLISHED_GRANITE_TILE_STAIRS,
                    ChiseledBlockItems.POLISHED_GRANITE_TILE_SLAB,
                    ChiseledBlockItems.POLISHED_GRANITE_TILE_WALL);

            entries.insertAfter(Items.POLISHED_DIORITE_SLAB, ChiseledBlockItems.POLISHED_DIORITE_WALL,
                    ChiseledBlockItems.POLISHED_DIORITE_PILLAR,
                    ChiseledBlockItems.POLISHED_DIORITE_BRICKS,
                    ChiseledBlockItems.CRACKED_POLISHED_DIORITE_BRICKS,
                    ChiseledBlockItems.POLISHED_DIORITE_BRICK_STAIRS,
                    ChiseledBlockItems.POLISHED_DIORITE_BRICK_SLAB,
                    ChiseledBlockItems.POLISHED_DIORITE_BRICK_WALL,
                    ChiseledBlockItems.CUT_POLISHED_DIORITE_BRICKS,
                    ChiseledBlockItems.CRACKED_CUT_POLISHED_DIORITE_BRICKS,
                    ChiseledBlockItems.CUT_POLISHED_DIORITE_BRICK_STAIRS,
                    ChiseledBlockItems.CUT_POLISHED_DIORITE_BRICK_SLAB,
                    ChiseledBlockItems.POLISHED_DIORITE_TILES,
                    ChiseledBlockItems.CRACKED_POLISHED_DIORITE_TILES,
                    ChiseledBlockItems.POLISHED_DIORITE_TILE_STAIRS,
                    ChiseledBlockItems.POLISHED_DIORITE_TILE_SLAB,
                    ChiseledBlockItems.POLISHED_DIORITE_TILE_WALL);

            entries.insertAfter(Items.POLISHED_ANDESITE_SLAB, ChiseledBlockItems.POLISHED_ANDESITE_WALL,
                    ChiseledBlockItems.POLISHED_ANDESITE_PILLAR,
                    ChiseledBlockItems.POLISHED_ANDESITE_BRICKS,
                    ChiseledBlockItems.CRACKED_POLISHED_ANDESITE_BRICKS,
                    ChiseledBlockItems.POLISHED_ANDESITE_BRICK_STAIRS,
                    ChiseledBlockItems.POLISHED_ANDESITE_BRICK_SLAB,
                    ChiseledBlockItems.POLISHED_ANDESITE_BRICK_WALL,
                    ChiseledBlockItems.CUT_POLISHED_ANDESITE_BRICKS,
                    ChiseledBlockItems.CRACKED_CUT_POLISHED_ANDESITE_BRICKS,
                    ChiseledBlockItems.CUT_POLISHED_ANDESITE_BRICK_STAIRS,
                    ChiseledBlockItems.CUT_POLISHED_ANDESITE_BRICK_SLAB,
                    ChiseledBlockItems.POLISHED_ANDESITE_TILES,
                    ChiseledBlockItems.CRACKED_POLISHED_ANDESITE_TILES,
                    ChiseledBlockItems.POLISHED_ANDESITE_TILE_STAIRS,
                    ChiseledBlockItems.POLISHED_ANDESITE_TILE_SLAB,
                    ChiseledBlockItems.POLISHED_ANDESITE_TILE_WALL);

            entries.insertAfter(Items.DEEPSLATE_BRICK_WALL, ChiseledBlockItems.CUT_DEEPSLATE_BRICKS,
                    ChiseledBlockItems.CRACKED_CUT_DEEPSLATE_BRICKS,
                    ChiseledBlockItems.CUT_DEEPSLATE_BRICK_STAIRS,
                    ChiseledBlockItems.CUT_DEEPSLATE_BRICK_SLAB);

            entries.insertBefore(Items.TUFF, Items.CALCITE,
                    ChiseledBlockItems.CALCITE_STAIRS,
                    ChiseledBlockItems.CALCITE_SLAB,
                    ChiseledBlockItems.CALCITE_WALL,
                    ChiseledBlockItems.POLISHED_CALCITE,
                    ChiseledBlockItems.POLISHED_CALCITE_STAIRS,
                    ChiseledBlockItems.POLISHED_CALCITE_SLAB,
                    ChiseledBlockItems.POLISHED_CALCITE_WALL,
                    ChiseledBlockItems.CALCITE_BRICKS,
                    ChiseledBlockItems.CALCITE_BRICK_STAIRS,
                    ChiseledBlockItems.CALCITE_BRICK_SLAB,
                    ChiseledBlockItems.CALCITE_BRICK_WALL,
                    ChiseledBlockItems.CUT_CALCITE_BRICKS,
                    ChiseledBlockItems.CUT_CALCITE_BRICK_STAIRS,
                    ChiseledBlockItems.CUT_CALCITE_BRICK_SLAB,
                    ChiseledBlockItems.CALCITE_TILES,
                    ChiseledBlockItems.CALCITE_TILE_STAIRS,
                    ChiseledBlockItems.CALCITE_TILE_SLAB,
                    ChiseledBlockItems.CALCITE_TILE_WALL);

            entries.insertAfter(Items.CHISELED_TUFF_BRICKS, Items.DRIPSTONE_BLOCK,
                    ChiseledBlockItems.DRIPSTONE_STAIRS,
                    ChiseledBlockItems.DRIPSTONE_SLAB,
                    ChiseledBlockItems.DRIPSTONE_WALL,
                    ChiseledBlockItems.POLISHED_DRIPSTONE,
                    ChiseledBlockItems.POLISHED_DRIPSTONE_STAIRS,
                    ChiseledBlockItems.POLISHED_DRIPSTONE_SLAB,
                    ChiseledBlockItems.POLISHED_DRIPSTONE_WALL,
                    ChiseledBlockItems.DRIPSTONE_BRICKS,
                    ChiseledBlockItems.DRIPSTONE_BRICK_STAIRS,
                    ChiseledBlockItems.DRIPSTONE_BRICK_SLAB,
                    ChiseledBlockItems.DRIPSTONE_BRICK_WALL,
                    ChiseledBlockItems.CUT_DRIPSTONE_BRICKS,
                    ChiseledBlockItems.CUT_DRIPSTONE_BRICK_STAIRS,
                    ChiseledBlockItems.CUT_DRIPSTONE_BRICK_SLAB,
                    ChiseledBlockItems.DRIPSTONE_TILES,
                    ChiseledBlockItems.DRIPSTONE_TILE_STAIRS,
                    ChiseledBlockItems.DRIPSTONE_TILE_SLAB,
                    ChiseledBlockItems.DRIPSTONE_TILE_WALL);

            entries.insertAfter(Items.BRICK_WALL, ChiseledBlockItems.MIXED_BRICKS,
                    ChiseledBlockItems.MIXED_BRICK_STAIRS,
                    ChiseledBlockItems.MIXED_BRICK_SLAB,
                    ChiseledBlockItems.MIXED_BRICK_WALL,
                    ChiseledBlockItems.MOSSY_BRICKS,
                    ChiseledBlockItems.MOSSY_BRICK_STAIRS,
                    ChiseledBlockItems.MOSSY_BRICK_SLAB,
                    ChiseledBlockItems.MOSSY_BRICK_WALL);

            entries.insertAfter(Items.PACKED_MUD, ChiseledBlockItems.PACKED_MUD_STAIRS,
                    ChiseledBlockItems.PACKED_MUD_SLAB,
                    ChiseledBlockItems.PACKED_MUD_WALL,
                    ChiseledBlockItems.POLISHED_MUD,
                    ChiseledBlockItems.POLISHED_MUD_STAIRS,
                    ChiseledBlockItems.POLISHED_MUD_SLAB,
                    ChiseledBlockItems.POLISHED_MUD_WALL);

            entries.insertAfter(Items.MUD_BRICK_WALL, ChiseledBlockItems.MOSSY_MUD_BRICKS,
                    ChiseledBlockItems.MOSSY_MUD_BRICK_STAIRS,
                    ChiseledBlockItems.MOSSY_MUD_BRICK_SLAB,
                    ChiseledBlockItems.MOSSY_MUD_BRICK_WALL,
                    ChiseledBlockItems.CUT_MUD_BRICKS,
                    ChiseledBlockItems.CUT_MUD_BRICK_STAIRS,
                    ChiseledBlockItems.CUT_MUD_BRICK_SLAB,
                    ChiseledBlockItems.MOSSY_CUT_MUD_BRICKS,
                    ChiseledBlockItems.MOSSY_CUT_MUD_BRICK_STAIRS,
                    ChiseledBlockItems.MOSSY_CUT_MUD_BRICK_SLAB,
                    ChiseledBlockItems.MUD_TILES,
                    ChiseledBlockItems.MUD_TILE_STAIRS,
                    ChiseledBlockItems.MUD_TILE_SLAB,
                    ChiseledBlockItems.MUD_TILE_WALL,
                    ChiseledBlockItems.MOSSY_MUD_TILES,
                    ChiseledBlockItems.MOSSY_MUD_TILE_STAIRS,
                    ChiseledBlockItems.MOSSY_MUD_TILE_SLAB,
                    ChiseledBlockItems.MOSSY_MUD_TILE_WALL);

            entries.insertAfter(Items.CHISELED_RESIN_BRICKS, Items.HONEYCOMB_BLOCK,
                    ChiseledBlockItems.HONEYCOMB_STAIRS,
                    ChiseledBlockItems.HONEYCOMB_SLAB,
                    ChiseledBlockItems.HONEYCOMB_WALL,
                    ChiseledBlockItems.HONEYCOMB_BRICKS,
                    ChiseledBlockItems.HONEYCOMB_BRICK_STAIRS,
                    ChiseledBlockItems.HONEYCOMB_BRICK_SLAB,
                    ChiseledBlockItems.HONEYCOMB_BRICK_WALL,
                    ChiseledBlockItems.CUT_HONEYCOMB_BRICKS,
                    ChiseledBlockItems.CUT_HONEYCOMB_BRICK_STAIRS,
                    ChiseledBlockItems.CUT_HONEYCOMB_BRICK_SLAB,
                    ChiseledBlockItems.HONEYCOMB_TILES,
                    ChiseledBlockItems.HONEYCOMB_TILE_STAIRS,
                    ChiseledBlockItems.HONEYCOMB_TILE_SLAB,
                    ChiseledBlockItems.HONEYCOMB_TILE_WALL);

            entries.insertAfter(Items.SMOOTH_SANDSTONE_SLAB, ChiseledBlockItems.SMOOTH_SANDSTONE_WALL);
            entries.insertAfter(Items.CUT_STANDSTONE_SLAB, ChiseledBlockItems.SANDSTONE_BRICKS,
                    ChiseledBlockItems.SANDSTONE_BRICK_STAIRS,
                    ChiseledBlockItems.SANDSTONE_BRICK_SLAB,
                    ChiseledBlockItems.SANDSTONE_BRICK_WALL,
                    ChiseledBlockItems.CUT_SANDSTONE_BRICKS,
                    ChiseledBlockItems.CUT_SANDSTONE_BRICK_STAIRS,
                    ChiseledBlockItems.CUT_SANDSTONE_BRICK_SLAB,
                    ChiseledBlockItems.SANDSTONE_TILES,
                    ChiseledBlockItems.SANDSTONE_TILE_STAIRS,
                    ChiseledBlockItems.SANDSTONE_TILE_SLAB,
                    ChiseledBlockItems.SANDSTONE_TILE_WALL);

            entries.insertAfter(Items.SMOOTH_RED_SANDSTONE_SLAB, ChiseledBlockItems.SMOOTH_RED_SANDSTONE_WALL);
            entries.insertAfter(Items.CUT_RED_SANDSTONE_SLAB, ChiseledBlockItems.RED_SANDSTONE_BRICKS,
                    ChiseledBlockItems.RED_SANDSTONE_BRICK_STAIRS,
                    ChiseledBlockItems.RED_SANDSTONE_BRICK_SLAB,
                    ChiseledBlockItems.RED_SANDSTONE_BRICK_WALL,
                    ChiseledBlockItems.CUT_RED_SANDSTONE_BRICKS,
                    ChiseledBlockItems.CUT_RED_SANDSTONE_BRICK_STAIRS,
                    ChiseledBlockItems.CUT_RED_SANDSTONE_BRICK_SLAB,
                    ChiseledBlockItems.RED_SANDSTONE_TILES,
                    ChiseledBlockItems.RED_SANDSTONE_TILE_STAIRS,
                    ChiseledBlockItems.RED_SANDSTONE_TILE_SLAB,
                    ChiseledBlockItems.RED_SANDSTONE_TILE_WALL);

            entries.insertAfter(Items.CINNABAR_BRICK_WALL, ChiseledBlockItems.CUT_CINNABAR_BRICKS,
                    ChiseledBlockItems.CUT_CINNABAR_BRICK_STAIRS,
                    ChiseledBlockItems.CUT_CINNABAR_BRICK_SLAB,
                    ChiseledBlockItems.CINNABAR_TILES,
                    ChiseledBlockItems.CINNABAR_TILE_STAIRS,
                    ChiseledBlockItems.CINNABAR_TILE_SLAB,
                    ChiseledBlockItems.CINNABAR_TILE_WALL);

            entries.insertAfter(Items.SULFUR_BRICK_WALL, ChiseledBlockItems.CUT_SULFUR_BRICKS,
                    ChiseledBlockItems.CUT_SULFUR_BRICK_STAIRS,
                    ChiseledBlockItems.CUT_SULFUR_BRICK_SLAB,
                    ChiseledBlockItems.SULFUR_TILES,
                    ChiseledBlockItems.SULFUR_TILE_STAIRS,
                    ChiseledBlockItems.SULFUR_TILE_SLAB,
                    ChiseledBlockItems.SULFUR_TILE_WALL);

            entries.insertAfter(Items.PRISMARINE_BRICK_SLAB, ChiseledBlockItems.PRISMARINE_BRICK_WALL,
                    ChiseledBlockItems.CUT_PRISMARINE_BRICKS,
                    ChiseledBlockItems.CUT_PRISMARINE_BRICK_STAIRS,
                    ChiseledBlockItems.CUT_PRISMARINE_BRICK_SLAB);
            entries.insertAfter(Items.DARK_PRISMARINE_SLAB, ChiseledBlockItems.DARK_PRISMARINE_WALL,
                    ChiseledBlockItems.DARK_PRISMARINE_BRICKS,
                    ChiseledBlockItems.DARK_PRISMARINE_BRICK_STAIRS,
                    ChiseledBlockItems.DARK_PRISMARINE_BRICK_SLAB,
                    ChiseledBlockItems.DARK_PRISMARINE_BRICK_WALL,
                    ChiseledBlockItems.CUT_DARK_PRISMARINE_BRICKS,
                    ChiseledBlockItems.CUT_DARK_PRISMARINE_BRICK_STAIRS,
                    ChiseledBlockItems.CUT_DARK_PRISMARINE_BRICK_SLAB,
                    Items.SNOW_BLOCK,
                    ChiseledBlockItems.PACKED_SNOW_BRICKS,
                    ChiseledBlockItems.PACKED_SNOW_BRICK_STAIRS,
                    ChiseledBlockItems.PACKED_SNOW_BRICK_SLAB,
                    ChiseledBlockItems.CUT_PACKED_SNOW_BRICKS,
                    ChiseledBlockItems.CUT_PACKED_SNOW_BRICK_STAIRS,
                    ChiseledBlockItems.CUT_PACKED_SNOW_BRICK_SLAB,
                    ChiseledBlockItems.PACKED_SNOW_TILES,
                    ChiseledBlockItems.PACKED_SNOW_TILE_STAIRS,
                    ChiseledBlockItems.PACKED_SNOW_TILE_SLAB);

            entries.insertAfter(Items.RED_NETHER_BRICKS, ChiseledBlockItems.CRACKED_RED_NETHER_BRICKS);
            entries.insertAfter(Items.RED_NETHER_BRICK_WALL, ChiseledBlockItems.RED_NETHER_BRICK_FENCE,
                    ChiseledBlockItems.CHISELED_RED_NETHER_BRICKS);

            entries.insertAfter(Items.SMOOTH_BASALT, ChiseledBlockItems.SMOOTH_BASALT_STAIRS,
                    ChiseledBlockItems.SMOOTH_BASALT_SLAB,
                    ChiseledBlockItems.SMOOTH_BASALT_WALL);
            entries.insertAfter(Items.POLISHED_BASALT, ChiseledBlockItems.BASALT_BRICKS,
                    ChiseledBlockItems.BASALT_BRICK_STAIRS,
                    ChiseledBlockItems.BASALT_BRICK_SLAB,
                    ChiseledBlockItems.BASALT_BRICK_WALL,
                    ChiseledBlockItems.CUT_BASALT_BRICKS,
                    ChiseledBlockItems.CUT_BASALT_BRICK_STAIRS,
                    ChiseledBlockItems.CUT_BASALT_BRICK_SLAB,
                    ChiseledBlockItems.BASALT_TILES,
                    ChiseledBlockItems.BASALT_TILE_STAIRS,
                    ChiseledBlockItems.BASALT_TILE_SLAB,
                    ChiseledBlockItems.BASALT_TILE_WALL);

            entries.insertAfter(Items.POLISHED_BLACKSTONE_BRICK_WALL, ChiseledBlockItems.CUT_POLISHED_BLACKSTONE_BRICKS,
                    ChiseledBlockItems.CRACKED_CUT_POLISHED_BLACKSTONE_BRICKS,
                    ChiseledBlockItems.CUT_POLISHED_BLACKSTONE_BRICK_STAIRS,
                    ChiseledBlockItems.CUT_POLISHED_BLACKSTONE_BRICK_SLAB,
                    ChiseledBlockItems.POLISHED_BLACKSTONE_TILES,
                    ChiseledBlockItems.CRACKED_POLISHED_BLACKSTONE_TILES,
                    ChiseledBlockItems.POLISHED_BLACKSTONE_TILE_STAIRS,
                    ChiseledBlockItems.POLISHED_BLACKSTONE_TILE_SLAB,
                    ChiseledBlockItems.POLISHED_BLACKSTONE_TILE_WALL);

            entries.insertAfter(Items.END_STONE, ChiseledBlockItems.END_STONE_STAIRS,
                    ChiseledBlockItems.END_STONE_SLAB,
                    ChiseledBlockItems.END_STONE_WALL,
                    ChiseledBlockItems.POLISHED_END_STONE,
                    ChiseledBlockItems.POLISHED_END_STONE_STAIRS,
                    ChiseledBlockItems.POLISHED_END_STONE_SLAB,
                    ChiseledBlockItems.POLISHED_END_STONE_WALL);
            entries.insertAfter(Items.END_STONE_BRICKS, ChiseledBlockItems.CRACKED_END_STONE_BRICKS);
            entries.insertAfter(Items.END_STONE_BRICK_WALL, ChiseledBlockItems.CUT_END_STONE_BRICKS,
                    ChiseledBlockItems.CRACKED_CUT_END_STONE_BRICKS,
                    ChiseledBlockItems.CUT_END_STONE_BRICK_STAIRS,
                    ChiseledBlockItems.CUT_END_STONE_BRICK_SLAB,
                    ChiseledBlockItems.END_STONE_TILES,
                    ChiseledBlockItems.CRACKED_END_STONE_TILES,
                    ChiseledBlockItems.END_STONE_TILE_STAIRS,
                    ChiseledBlockItems.END_STONE_TILE_SLAB,
                    ChiseledBlockItems.END_STONE_TILE_WALL);

            entries.insertAfter(Items.NETHERITE_BLOCK, Items.QUARTZ_BLOCK,
                    Items.QUARTZ_STAIRS,
                    Items.QUARTZ_SLAB,
                    ChiseledBlockItems.QUARTZ_WALL,
                    Items.CHISELED_QUARTZ_BLOCK,
                    Items.QUARTZ_PILLAR,
                    Items.SMOOTH_QUARTZ,
                    Items.SMOOTH_QUARTZ_STAIRS,
                    Items.SMOOTH_QUARTZ_SLAB,
                    ChiseledBlockItems.SMOOTH_QUARTZ_WALL,
                    Items.QUARTZ_BRICKS,
                    ChiseledBlockItems.QUARTZ_BRICK_STAIRS,
                    ChiseledBlockItems.QUARTZ_BRICK_SLAB,
                    ChiseledBlockItems.QUARTZ_BRICK_WALL,
                    ChiseledBlockItems.CUT_QUARTZ_BRICKS,
                    ChiseledBlockItems.CUT_QUARTZ_BRICK_STAIRS,
                    ChiseledBlockItems.CUT_QUARTZ_BRICK_SLAB,
                    ChiseledBlockItems.QUARTZ_TILES,
                    ChiseledBlockItems.QUARTZ_TILE_STAIRS,
                    ChiseledBlockItems.QUARTZ_TILE_SLAB,
                    ChiseledBlockItems.QUARTZ_TILE_WALL);

            entries.insertAfter(Items.AMETHYST_BLOCK, ChiseledBlockItems.AMETHYST_STAIRS,
                    ChiseledBlockItems.AMETHYST_SLAB,
                    ChiseledBlockItems.AMETHYST_WALL,
                    ChiseledBlockItems.AMETHYST_BRICKS,
                    ChiseledBlockItems.AMETHYST_BRICK_STAIRS,
                    ChiseledBlockItems.AMETHYST_BRICK_SLAB,
                    ChiseledBlockItems.AMETHYST_BRICK_WALL,
                    ChiseledBlockItems.CUT_AMETHYST_BRICKS,
                    ChiseledBlockItems.CUT_AMETHYST_BRICK_STAIRS,
                    ChiseledBlockItems.CUT_AMETHYST_BRICK_SLAB,
                    ChiseledBlockItems.AMETHYST_TILES,
                    ChiseledBlockItems.AMETHYST_TILE_STAIRS,
                    ChiseledBlockItems.AMETHYST_TILE_SLAB,
                    ChiseledBlockItems.AMETHYST_TILE_WALL);
        });

        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.COLORED_BLOCKS).register(entries -> {
            entries.insertAfter(Items.TERRACOTTA,
                    ChiseledBlockItems.TERRACOTTA_BRICKS,
                    ChiseledBlockItems.TERRACOTTA_BRICK_STAIRS,
                    ChiseledBlockItems.TERRACOTTA_BRICK_SLAB,
                    ChiseledBlockItems.TERRACOTTA_BRICK_WALL);
            entries.insertAfter(Items.DYED_TERRACOTTA.white(),
                    ChiseledBlockItems.WHITE_TERRACOTTA_BRICKS,
                    ChiseledBlockItems.WHITE_TERRACOTTA_BRICK_STAIRS,
                    ChiseledBlockItems.WHITE_TERRACOTTA_BRICK_SLAB,
                    ChiseledBlockItems.WHITE_TERRACOTTA_BRICK_WALL);
            entries.insertAfter(Items.DYED_TERRACOTTA.lightGray(),
                    ChiseledBlockItems.LIGHT_GRAY_TERRACOTTA_BRICKS,
                    ChiseledBlockItems.LIGHT_GRAY_TERRACOTTA_BRICK_STAIRS,
                    ChiseledBlockItems.LIGHT_GRAY_TERRACOTTA_BRICK_SLAB,
                    ChiseledBlockItems.LIGHT_GRAY_TERRACOTTA_BRICK_WALL);
            entries.insertAfter(Items.DYED_TERRACOTTA.gray(),
                    ChiseledBlockItems.GRAY_TERRACOTTA_BRICKS,
                    ChiseledBlockItems.GRAY_TERRACOTTA_BRICK_STAIRS,
                    ChiseledBlockItems.GRAY_TERRACOTTA_BRICK_SLAB,
                    ChiseledBlockItems.GRAY_TERRACOTTA_BRICK_WALL);
            entries.insertAfter(Items.DYED_TERRACOTTA.black(),
                    ChiseledBlockItems.BLACK_TERRACOTTA_BRICKS,
                    ChiseledBlockItems.BLACK_TERRACOTTA_BRICK_STAIRS,
                    ChiseledBlockItems.BLACK_TERRACOTTA_BRICK_SLAB,
                    ChiseledBlockItems.BLACK_TERRACOTTA_BRICK_WALL);
            entries.insertAfter(Items.DYED_TERRACOTTA.brown(),
                    ChiseledBlockItems.BROWN_TERRACOTTA_BRICKS,
                    ChiseledBlockItems.BROWN_TERRACOTTA_BRICK_STAIRS,
                    ChiseledBlockItems.BROWN_TERRACOTTA_BRICK_SLAB,
                    ChiseledBlockItems.BROWN_TERRACOTTA_BRICK_WALL);
            entries.insertAfter(Items.DYED_TERRACOTTA.red(),
                    ChiseledBlockItems.RED_TERRACOTTA_BRICKS,
                    ChiseledBlockItems.RED_TERRACOTTA_BRICK_STAIRS,
                    ChiseledBlockItems.RED_TERRACOTTA_BRICK_SLAB,
                    ChiseledBlockItems.RED_TERRACOTTA_BRICK_WALL);
            entries.insertAfter(Items.DYED_TERRACOTTA.orange(),
                    ChiseledBlockItems.ORANGE_TERRACOTTA_BRICKS,
                    ChiseledBlockItems.ORANGE_TERRACOTTA_BRICK_STAIRS,
                    ChiseledBlockItems.ORANGE_TERRACOTTA_BRICK_SLAB,
                    ChiseledBlockItems.ORANGE_TERRACOTTA_BRICK_WALL);
            entries.insertAfter(Items.DYED_TERRACOTTA.yellow(),
                    ChiseledBlockItems.YELLOW_TERRACOTTA_BRICKS,
                    ChiseledBlockItems.YELLOW_TERRACOTTA_BRICK_STAIRS,
                    ChiseledBlockItems.YELLOW_TERRACOTTA_BRICK_SLAB,
                    ChiseledBlockItems.YELLOW_TERRACOTTA_BRICK_WALL);
            entries.insertAfter(Items.DYED_TERRACOTTA.lime(),
                    ChiseledBlockItems.LIME_TERRACOTTA_BRICKS,
                    ChiseledBlockItems.LIME_TERRACOTTA_BRICK_STAIRS,
                    ChiseledBlockItems.LIME_TERRACOTTA_BRICK_SLAB,
                    ChiseledBlockItems.LIME_TERRACOTTA_BRICK_WALL);
            entries.insertAfter(Items.DYED_TERRACOTTA.green(),
                    ChiseledBlockItems.GREEN_TERRACOTTA_BRICKS,
                    ChiseledBlockItems.GREEN_TERRACOTTA_BRICK_STAIRS,
                    ChiseledBlockItems.GREEN_TERRACOTTA_BRICK_SLAB,
                    ChiseledBlockItems.GREEN_TERRACOTTA_BRICK_WALL);
            entries.insertAfter(Items.DYED_TERRACOTTA.cyan(),
                    ChiseledBlockItems.CYAN_TERRACOTTA_BRICKS,
                    ChiseledBlockItems.CYAN_TERRACOTTA_BRICK_STAIRS,
                    ChiseledBlockItems.CYAN_TERRACOTTA_BRICK_SLAB,
                    ChiseledBlockItems.CYAN_TERRACOTTA_BRICK_WALL);
            entries.insertAfter(Items.DYED_TERRACOTTA.lightBlue(),
                    ChiseledBlockItems.LIGHT_BLUE_TERRACOTTA_BRICKS,
                    ChiseledBlockItems.LIGHT_BLUE_TERRACOTTA_BRICK_STAIRS,
                    ChiseledBlockItems.LIGHT_BLUE_TERRACOTTA_BRICK_SLAB,
                    ChiseledBlockItems.LIGHT_BLUE_TERRACOTTA_BRICK_WALL);
            entries.insertAfter(Items.DYED_TERRACOTTA.blue(),
                    ChiseledBlockItems.BLUE_TERRACOTTA_BRICKS,
                    ChiseledBlockItems.BLUE_TERRACOTTA_BRICK_STAIRS,
                    ChiseledBlockItems.BLUE_TERRACOTTA_BRICK_SLAB,
                    ChiseledBlockItems.BLUE_TERRACOTTA_BRICK_WALL);
            entries.insertAfter(Items.DYED_TERRACOTTA.purple(),
                    ChiseledBlockItems.PURPLE_TERRACOTTA_BRICKS,
                    ChiseledBlockItems.PURPLE_TERRACOTTA_BRICK_STAIRS,
                    ChiseledBlockItems.PURPLE_TERRACOTTA_BRICK_SLAB,
                    ChiseledBlockItems.PURPLE_TERRACOTTA_BRICK_WALL);
            entries.insertAfter(Items.DYED_TERRACOTTA.magenta(),
                    ChiseledBlockItems.MAGENTA_TERRACOTTA_BRICKS,
                    ChiseledBlockItems.MAGENTA_TERRACOTTA_BRICK_STAIRS,
                    ChiseledBlockItems.MAGENTA_TERRACOTTA_BRICK_SLAB,
                    ChiseledBlockItems.MAGENTA_TERRACOTTA_BRICK_WALL);
            entries.insertAfter(Items.DYED_TERRACOTTA.pink(),
                    ChiseledBlockItems.PINK_TERRACOTTA_BRICKS,
                    ChiseledBlockItems.PINK_TERRACOTTA_BRICK_STAIRS,
                    ChiseledBlockItems.PINK_TERRACOTTA_BRICK_SLAB,
                    ChiseledBlockItems.PINK_TERRACOTTA_BRICK_WALL);
        });
    }
}