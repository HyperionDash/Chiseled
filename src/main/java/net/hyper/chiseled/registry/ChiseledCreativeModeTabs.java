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

public interface ChiseledCreativeModeTabs {
    CreativeModeTab CHISELED = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Chiseled.id("chiseled"),
            FabricCreativeModeTab.builder().icon(() -> new ItemStack(ChiseledItems.POLISHED_STONE))
                    .title(Component.translatable("itemgroup.chiseled.chiseled"))
                    .displayItems((displayContext, entries) -> {
                        entries.accept(ChiseledItems.STONE_WALL);
                        entries.accept(ChiseledItems.POLISHED_STONE);
                        entries.accept(ChiseledItems.POLISHED_STONE_STAIRS);
                        entries.accept(ChiseledItems.POLISHED_STONE_SLAB);
                        entries.accept(ChiseledItems.POLISHED_STONE_WALL);
                        entries.accept(ChiseledItems.SMOOTH_STONE_STAIRS);
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

                        entries.accept(ChiseledItems.CUT_DEEPSLATE_BRICKS);
                        entries.accept(ChiseledItems.CRACKED_CUT_DEEPSLATE_BRICKS);
                        entries.accept(ChiseledItems.CUT_DEEPSLATE_BRICK_STAIRS);
                        entries.accept(ChiseledItems.CUT_DEEPSLATE_BRICK_SLAB);

                        entries.accept(ChiseledItems.CALCITE_STAIRS);
                        entries.accept(ChiseledItems.CALCITE_SLAB);
                        entries.accept(ChiseledItems.CALCITE_WALL);
                        entries.accept(ChiseledItems.POLISHED_CALCITE);
                        entries.accept(ChiseledItems.POLISHED_CALCITE_STAIRS);
                        entries.accept(ChiseledItems.POLISHED_CALCITE_SLAB);
                        entries.accept(ChiseledItems.POLISHED_CALCITE_WALL);
                        entries.accept(ChiseledItems.CALCITE_BRICKS);
                        entries.accept(ChiseledItems.CALCITE_BRICK_STAIRS);
                        entries.accept(ChiseledItems.CALCITE_BRICK_SLAB);
                        entries.accept(ChiseledItems.CALCITE_BRICK_WALL);
                        entries.accept(ChiseledItems.CUT_CALCITE_BRICKS);
                        entries.accept(ChiseledItems.CUT_CALCITE_BRICK_STAIRS);
                        entries.accept(ChiseledItems.CUT_CALCITE_BRICK_SLAB);
                        entries.accept(ChiseledItems.CALCITE_TILES);
                        entries.accept(ChiseledItems.CALCITE_TILE_STAIRS);
                        entries.accept(ChiseledItems.CALCITE_TILE_SLAB);
                        entries.accept(ChiseledItems.CALCITE_TILE_WALL);

                        entries.accept(ChiseledItems.DRIPSTONE_STAIRS);
                        entries.accept(ChiseledItems.DRIPSTONE_SLAB);
                        entries.accept(ChiseledItems.DRIPSTONE_WALL);
                        entries.accept(ChiseledItems.POLISHED_DRIPSTONE);
                        entries.accept(ChiseledItems.POLISHED_DRIPSTONE_STAIRS);
                        entries.accept(ChiseledItems.POLISHED_DRIPSTONE_SLAB);
                        entries.accept(ChiseledItems.POLISHED_DRIPSTONE_WALL);
                        entries.accept(ChiseledItems.DRIPSTONE_BRICKS);
                        entries.accept(ChiseledItems.DRIPSTONE_BRICK_STAIRS);
                        entries.accept(ChiseledItems.DRIPSTONE_BRICK_SLAB);
                        entries.accept(ChiseledItems.DRIPSTONE_BRICK_WALL);
                        entries.accept(ChiseledItems.CUT_DRIPSTONE_BRICKS);
                        entries.accept(ChiseledItems.CUT_DRIPSTONE_BRICK_STAIRS);
                        entries.accept(ChiseledItems.CUT_DRIPSTONE_BRICK_SLAB);
                        entries.accept(ChiseledItems.DRIPSTONE_TILES);
                        entries.accept(ChiseledItems.DRIPSTONE_TILE_STAIRS);
                        entries.accept(ChiseledItems.DRIPSTONE_TILE_SLAB);
                        entries.accept(ChiseledItems.DRIPSTONE_TILE_WALL);

                        entries.accept(ChiseledItems.MIXED_BRICKS);
                        entries.accept(ChiseledItems.MIXED_BRICK_STAIRS);
                        entries.accept(ChiseledItems.MIXED_BRICK_SLAB);
                        entries.accept(ChiseledItems.MIXED_BRICK_WALL);
                        entries.accept(ChiseledItems.MOSSY_BRICKS);
                        entries.accept(ChiseledItems.MOSSY_BRICK_STAIRS);
                        entries.accept(ChiseledItems.MOSSY_BRICK_SLAB);
                        entries.accept(ChiseledItems.MOSSY_BRICK_WALL);

                        entries.accept(ChiseledItems.PACKED_MUD_STAIRS);
                        entries.accept(ChiseledItems.PACKED_MUD_SLAB);
                        entries.accept(ChiseledItems.PACKED_MUD_WALL);
                        entries.accept(ChiseledItems.POLISHED_MUD);
                        entries.accept(ChiseledItems.POLISHED_MUD_STAIRS);
                        entries.accept(ChiseledItems.POLISHED_MUD_SLAB);
                        entries.accept(ChiseledItems.POLISHED_MUD_WALL);
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
                        entries.accept(ChiseledItems.SANDSTONE_BRICKS);
                        entries.accept(ChiseledItems.SANDSTONE_BRICK_STAIRS);
                        entries.accept(ChiseledItems.SANDSTONE_BRICK_SLAB);
                        entries.accept(ChiseledItems.SANDSTONE_BRICK_WALL);
                        entries.accept(ChiseledItems.CUT_SANDSTONE_BRICKS);
                        entries.accept(ChiseledItems.CUT_SANDSTONE_BRICK_STAIRS);
                        entries.accept(ChiseledItems.CUT_SANDSTONE_BRICK_SLAB);
                        entries.accept(ChiseledItems.SANDSTONE_TILES);
                        entries.accept(ChiseledItems.SANDSTONE_TILE_STAIRS);
                        entries.accept(ChiseledItems.SANDSTONE_TILE_SLAB);
                        entries.accept(ChiseledItems.SANDSTONE_TILE_WALL);

                        entries.accept(ChiseledItems.SMOOTH_RED_SANDSTONE_WALL);
                        entries.accept(ChiseledItems.RED_SANDSTONE_BRICKS);
                        entries.accept(ChiseledItems.RED_SANDSTONE_BRICK_STAIRS);
                        entries.accept(ChiseledItems.RED_SANDSTONE_BRICK_SLAB);
                        entries.accept(ChiseledItems.RED_SANDSTONE_BRICK_WALL);
                        entries.accept(ChiseledItems.CUT_RED_SANDSTONE_BRICKS);
                        entries.accept(ChiseledItems.CUT_RED_SANDSTONE_BRICK_STAIRS);
                        entries.accept(ChiseledItems.CUT_RED_SANDSTONE_BRICK_SLAB);
                        entries.accept(ChiseledItems.RED_SANDSTONE_TILES);
                        entries.accept(ChiseledItems.RED_SANDSTONE_TILE_STAIRS);
                        entries.accept(ChiseledItems.RED_SANDSTONE_TILE_SLAB);
                        entries.accept(ChiseledItems.RED_SANDSTONE_TILE_WALL);

                        entries.accept(ChiseledItems.CUT_CINNABAR_BRICKS);
                        entries.accept(ChiseledItems.CUT_CINNABAR_BRICK_STAIRS);
                        entries.accept(ChiseledItems.CUT_CINNABAR_BRICK_SLAB);
                        entries.accept(ChiseledItems.CINNABAR_TILES);
                        entries.accept(ChiseledItems.CINNABAR_TILE_STAIRS);
                        entries.accept(ChiseledItems.CINNABAR_TILE_SLAB);
                        entries.accept(ChiseledItems.CINNABAR_TILE_WALL);
                        
                        entries.accept(ChiseledItems.CUT_SULFUR_BRICKS);
                        entries.accept(ChiseledItems.CUT_SULFUR_BRICK_STAIRS);
                        entries.accept(ChiseledItems.CUT_SULFUR_BRICK_SLAB);
                        entries.accept(ChiseledItems.SULFUR_TILES);
                        entries.accept(ChiseledItems.SULFUR_TILE_STAIRS);
                        entries.accept(ChiseledItems.SULFUR_TILE_SLAB);
                        entries.accept(ChiseledItems.SULFUR_TILE_WALL);

                        entries.accept(ChiseledItems.PRISMARINE_BRICK_WALL);
                        entries.accept(ChiseledItems.CUT_PRISMARINE_BRICKS);
                        entries.accept(ChiseledItems.CUT_PRISMARINE_BRICK_STAIRS);
                        entries.accept(ChiseledItems.CUT_PRISMARINE_BRICK_SLAB);
                        entries.accept(ChiseledItems.DARK_PRISMARINE_WALL);
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

                        entries.accept(ChiseledItems.SMOOTH_BASALT_STAIRS);
                        entries.accept(ChiseledItems.SMOOTH_BASALT_SLAB);
                        entries.accept(ChiseledItems.SMOOTH_BASALT_WALL);
                        entries.accept(ChiseledItems.BASALT_BRICKS);
                        entries.accept(ChiseledItems.BASALT_BRICK_STAIRS);
                        entries.accept(ChiseledItems.BASALT_BRICK_SLAB);
                        entries.accept(ChiseledItems.BASALT_BRICK_WALL);
                        entries.accept(ChiseledItems.CUT_BASALT_BRICKS);
                        entries.accept(ChiseledItems.CUT_BASALT_BRICK_STAIRS);
                        entries.accept(ChiseledItems.CUT_BASALT_BRICK_SLAB);
                        entries.accept(ChiseledItems.BASALT_TILES);
                        entries.accept(ChiseledItems.BASALT_TILE_STAIRS);
                        entries.accept(ChiseledItems.BASALT_TILE_SLAB);
                        entries.accept(ChiseledItems.BASALT_TILE_WALL);

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

                        entries.accept(ChiseledItems.CHISELED_LAPIS);

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

                        entries.accept(ChiseledItems.AMETHYST_STAIRS);
                        entries.accept(ChiseledItems.AMETHYST_SLAB);
                        entries.accept(ChiseledItems.AMETHYST_WALL);
                        entries.accept(ChiseledItems.AMETHYST_BRICKS);
                        entries.accept(ChiseledItems.AMETHYST_BRICK_STAIRS);
                        entries.accept(ChiseledItems.AMETHYST_BRICK_SLAB);
                        entries.accept(ChiseledItems.AMETHYST_BRICK_WALL);
                        entries.accept(ChiseledItems.CUT_AMETHYST_BRICKS);
                        entries.accept(ChiseledItems.CUT_AMETHYST_BRICK_STAIRS);
                        entries.accept(ChiseledItems.CUT_AMETHYST_BRICK_SLAB);

                        entries.accept(ChiseledItems.TERRACOTTA_BRICKS);
                        entries.accept(ChiseledItems.TERRACOTTA_BRICK_STAIRS);
                        entries.accept(ChiseledItems.TERRACOTTA_BRICK_SLAB);
                        entries.accept(ChiseledItems.TERRACOTTA_BRICK_WALL);
                        entries.accept(ChiseledItems.WHITE_TERRACOTTA_BRICKS);
                        entries.accept(ChiseledItems.WHITE_TERRACOTTA_BRICK_STAIRS);
                        entries.accept(ChiseledItems.WHITE_TERRACOTTA_BRICK_SLAB);
                        entries.accept(ChiseledItems.WHITE_TERRACOTTA_BRICK_WALL);
                        entries.accept(ChiseledItems.LIGHT_GRAY_TERRACOTTA_BRICKS);
                        entries.accept(ChiseledItems.LIGHT_GRAY_TERRACOTTA_BRICK_STAIRS);
                        entries.accept(ChiseledItems.LIGHT_GRAY_TERRACOTTA_BRICK_SLAB);
                        entries.accept(ChiseledItems.LIGHT_GRAY_TERRACOTTA_BRICK_WALL);
                        entries.accept(ChiseledItems.GRAY_TERRACOTTA_BRICKS);
                        entries.accept(ChiseledItems.GRAY_TERRACOTTA_BRICK_STAIRS);
                        entries.accept(ChiseledItems.GRAY_TERRACOTTA_BRICK_SLAB);
                        entries.accept(ChiseledItems.GRAY_TERRACOTTA_BRICK_WALL);
                        entries.accept(ChiseledItems.BLACK_TERRACOTTA_BRICKS);
                        entries.accept(ChiseledItems.BLACK_TERRACOTTA_BRICK_STAIRS);
                        entries.accept(ChiseledItems.BLACK_TERRACOTTA_BRICK_SLAB);
                        entries.accept(ChiseledItems.BLACK_TERRACOTTA_BRICK_WALL);
                        entries.accept(ChiseledItems.BROWN_TERRACOTTA_BRICKS);
                        entries.accept(ChiseledItems.BROWN_TERRACOTTA_BRICK_STAIRS);
                        entries.accept(ChiseledItems.BROWN_TERRACOTTA_BRICK_SLAB);
                        entries.accept(ChiseledItems.BROWN_TERRACOTTA_BRICK_WALL);
                        entries.accept(ChiseledItems.RED_TERRACOTTA_BRICKS);
                        entries.accept(ChiseledItems.RED_TERRACOTTA_BRICK_STAIRS);
                        entries.accept(ChiseledItems.RED_TERRACOTTA_BRICK_SLAB);
                        entries.accept(ChiseledItems.RED_TERRACOTTA_BRICK_WALL);
                        entries.accept(ChiseledItems.ORANGE_TERRACOTTA_BRICKS);
                        entries.accept(ChiseledItems.ORANGE_TERRACOTTA_BRICK_STAIRS);
                        entries.accept(ChiseledItems.ORANGE_TERRACOTTA_BRICK_SLAB);
                        entries.accept(ChiseledItems.ORANGE_TERRACOTTA_BRICK_WALL);
                        entries.accept(ChiseledItems.YELLOW_TERRACOTTA_BRICKS);
                        entries.accept(ChiseledItems.YELLOW_TERRACOTTA_BRICK_STAIRS);
                        entries.accept(ChiseledItems.YELLOW_TERRACOTTA_BRICK_SLAB);
                        entries.accept(ChiseledItems.YELLOW_TERRACOTTA_BRICK_WALL);
                        entries.accept(ChiseledItems.LIME_TERRACOTTA_BRICKS);
                        entries.accept(ChiseledItems.LIME_TERRACOTTA_BRICK_STAIRS);
                        entries.accept(ChiseledItems.LIME_TERRACOTTA_BRICK_SLAB);
                        entries.accept(ChiseledItems.LIME_TERRACOTTA_BRICK_WALL);
                        entries.accept(ChiseledItems.GREEN_TERRACOTTA_BRICKS);
                        entries.accept(ChiseledItems.GREEN_TERRACOTTA_BRICK_STAIRS);
                        entries.accept(ChiseledItems.GREEN_TERRACOTTA_BRICK_SLAB);
                        entries.accept(ChiseledItems.GREEN_TERRACOTTA_BRICK_WALL);
                        entries.accept(ChiseledItems.CYAN_TERRACOTTA_BRICKS);
                        entries.accept(ChiseledItems.CYAN_TERRACOTTA_BRICK_STAIRS);
                        entries.accept(ChiseledItems.CYAN_TERRACOTTA_BRICK_SLAB);
                        entries.accept(ChiseledItems.CYAN_TERRACOTTA_BRICK_WALL);
                        entries.accept(ChiseledItems.LIGHT_BLUE_TERRACOTTA_BRICKS);
                        entries.accept(ChiseledItems.LIGHT_BLUE_TERRACOTTA_BRICK_STAIRS);
                        entries.accept(ChiseledItems.LIGHT_BLUE_TERRACOTTA_BRICK_SLAB);
                        entries.accept(ChiseledItems.LIGHT_BLUE_TERRACOTTA_BRICK_WALL);
                        entries.accept(ChiseledItems.BLUE_TERRACOTTA_BRICKS);
                        entries.accept(ChiseledItems.BLUE_TERRACOTTA_BRICK_STAIRS);
                        entries.accept(ChiseledItems.BLUE_TERRACOTTA_BRICK_SLAB);
                        entries.accept(ChiseledItems.BLUE_TERRACOTTA_BRICK_WALL);
                        entries.accept(ChiseledItems.PURPLE_TERRACOTTA_BRICKS);
                        entries.accept(ChiseledItems.PURPLE_TERRACOTTA_BRICK_STAIRS);
                        entries.accept(ChiseledItems.PURPLE_TERRACOTTA_BRICK_SLAB);
                        entries.accept(ChiseledItems.PURPLE_TERRACOTTA_BRICK_WALL);
                        entries.accept(ChiseledItems.MAGENTA_TERRACOTTA_BRICKS);
                        entries.accept(ChiseledItems.MAGENTA_TERRACOTTA_BRICK_STAIRS);
                        entries.accept(ChiseledItems.MAGENTA_TERRACOTTA_BRICK_SLAB);
                        entries.accept(ChiseledItems.MAGENTA_TERRACOTTA_BRICK_WALL);
                        entries.accept(ChiseledItems.PINK_TERRACOTTA_BRICKS);
                        entries.accept(ChiseledItems.PINK_TERRACOTTA_BRICK_STAIRS);
                        entries.accept(ChiseledItems.PINK_TERRACOTTA_BRICK_SLAB);
                        entries.accept(ChiseledItems.PINK_TERRACOTTA_BRICK_WALL);
                    }).build());

    static void init() {
        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.BUILDING_BLOCKS).register(entries -> {
            entries.insertAfter(Items.STONE_SLAB, ChiseledItems.STONE_WALL);
            entries.insertAfter(Items.MOSSY_COBBLESTONE_WALL, ChiseledItems.POLISHED_STONE,
                    ChiseledItems.POLISHED_STONE_STAIRS,
                    ChiseledItems.POLISHED_STONE_SLAB,
                    ChiseledItems.POLISHED_STONE_WALL);
            entries.insertAfter(Items.SMOOTH_STONE, ChiseledItems.SMOOTH_STONE_STAIRS);
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

            entries.insertAfter(Items.DEEPSLATE_BRICK_WALL, ChiseledItems.CUT_DEEPSLATE_BRICKS,
                    ChiseledItems.CRACKED_CUT_DEEPSLATE_BRICKS,
                    ChiseledItems.CUT_DEEPSLATE_BRICK_STAIRS,
                    ChiseledItems.CUT_DEEPSLATE_BRICK_SLAB);

            entries.insertBefore(Items.TUFF, Items.CALCITE,
                    ChiseledItems.CALCITE_STAIRS,
                    ChiseledItems.CALCITE_SLAB,
                    ChiseledItems.CALCITE_WALL,
                    ChiseledItems.POLISHED_CALCITE,
                    ChiseledItems.POLISHED_CALCITE_STAIRS,
                    ChiseledItems.POLISHED_CALCITE_SLAB,
                    ChiseledItems.POLISHED_CALCITE_WALL,
                    ChiseledItems.CALCITE_BRICKS,
                    ChiseledItems.CALCITE_BRICK_STAIRS,
                    ChiseledItems.CALCITE_BRICK_SLAB,
                    ChiseledItems.CALCITE_BRICK_WALL,
                    ChiseledItems.CUT_CALCITE_BRICKS,
                    ChiseledItems.CUT_CALCITE_BRICK_STAIRS,
                    ChiseledItems.CUT_CALCITE_BRICK_SLAB,
                    ChiseledItems.CALCITE_TILES,
                    ChiseledItems.CALCITE_TILE_STAIRS,
                    ChiseledItems.CALCITE_TILE_SLAB,
                    ChiseledItems.CALCITE_TILE_WALL);

            entries.insertAfter(Items.CHISELED_TUFF_BRICKS, Items.DRIPSTONE_BLOCK,
                    ChiseledItems.DRIPSTONE_STAIRS,
                    ChiseledItems.DRIPSTONE_SLAB,
                    ChiseledItems.DRIPSTONE_WALL,
                    ChiseledItems.POLISHED_DRIPSTONE,
                    ChiseledItems.POLISHED_DRIPSTONE_STAIRS,
                    ChiseledItems.POLISHED_DRIPSTONE_SLAB,
                    ChiseledItems.POLISHED_DRIPSTONE_WALL,
                    ChiseledItems.DRIPSTONE_BRICKS,
                    ChiseledItems.DRIPSTONE_BRICK_STAIRS,
                    ChiseledItems.DRIPSTONE_BRICK_SLAB,
                    ChiseledItems.DRIPSTONE_BRICK_WALL,
                    ChiseledItems.CUT_DRIPSTONE_BRICKS,
                    ChiseledItems.CUT_DRIPSTONE_BRICK_STAIRS,
                    ChiseledItems.CUT_DRIPSTONE_BRICK_SLAB,
                    ChiseledItems.DRIPSTONE_TILES,
                    ChiseledItems.DRIPSTONE_TILE_STAIRS,
                    ChiseledItems.DRIPSTONE_TILE_SLAB,
                    ChiseledItems.DRIPSTONE_TILE_WALL);

            entries.insertAfter(Items.BRICK_WALL, ChiseledItems.MIXED_BRICKS,
                    ChiseledItems.MIXED_BRICK_STAIRS,
                    ChiseledItems.MIXED_BRICK_SLAB,
                    ChiseledItems.MIXED_BRICK_WALL,
                    ChiseledItems.MOSSY_BRICKS,
                    ChiseledItems.MOSSY_BRICK_STAIRS,
                    ChiseledItems.MOSSY_BRICK_SLAB,
                    ChiseledItems.MOSSY_BRICK_WALL);

            entries.insertAfter(Items.PACKED_MUD, ChiseledItems.PACKED_MUD_STAIRS,
                    ChiseledItems.PACKED_MUD_SLAB,
                    ChiseledItems.PACKED_MUD_WALL,
                    ChiseledItems.POLISHED_MUD,
                    ChiseledItems.POLISHED_MUD_STAIRS,
                    ChiseledItems.POLISHED_MUD_SLAB,
                    ChiseledItems.POLISHED_MUD_WALL);

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

            entries.insertAfter(Items.SMOOTH_SANDSTONE_SLAB, ChiseledItems.SMOOTH_SANDSTONE_WALL);
            entries.insertAfter(Items.CUT_STANDSTONE_SLAB, ChiseledItems.SANDSTONE_BRICKS,
                    ChiseledItems.SANDSTONE_BRICK_STAIRS,
                    ChiseledItems.SANDSTONE_BRICK_SLAB,
                    ChiseledItems.SANDSTONE_BRICK_WALL,
                    ChiseledItems.CUT_SANDSTONE_BRICKS,
                    ChiseledItems.CUT_SANDSTONE_BRICK_STAIRS,
                    ChiseledItems.CUT_SANDSTONE_BRICK_SLAB,
                    ChiseledItems.SANDSTONE_TILES,
                    ChiseledItems.SANDSTONE_TILE_STAIRS,
                    ChiseledItems.SANDSTONE_TILE_SLAB,
                    ChiseledItems.SANDSTONE_TILE_WALL);

            entries.insertAfter(Items.SMOOTH_RED_SANDSTONE_SLAB, ChiseledItems.SMOOTH_RED_SANDSTONE_WALL);
            entries.insertAfter(Items.CUT_RED_SANDSTONE_SLAB, ChiseledItems.RED_SANDSTONE_BRICKS,
                    ChiseledItems.RED_SANDSTONE_BRICK_STAIRS,
                    ChiseledItems.RED_SANDSTONE_BRICK_SLAB,
                    ChiseledItems.RED_SANDSTONE_BRICK_WALL,
                    ChiseledItems.CUT_RED_SANDSTONE_BRICKS,
                    ChiseledItems.CUT_RED_SANDSTONE_BRICK_STAIRS,
                    ChiseledItems.CUT_RED_SANDSTONE_BRICK_SLAB,
                    ChiseledItems.RED_SANDSTONE_TILES,
                    ChiseledItems.RED_SANDSTONE_TILE_STAIRS,
                    ChiseledItems.RED_SANDSTONE_TILE_SLAB,
                    ChiseledItems.RED_SANDSTONE_TILE_WALL);

            entries.insertAfter(Items.CINNABAR_BRICK_WALL, ChiseledItems.CUT_CINNABAR_BRICKS,
                    ChiseledItems.CUT_CINNABAR_BRICK_STAIRS,
                    ChiseledItems.CUT_CINNABAR_BRICK_SLAB,
                    ChiseledItems.CINNABAR_TILES,
                    ChiseledItems.CINNABAR_TILE_STAIRS,
                    ChiseledItems.CINNABAR_TILE_SLAB,
                    ChiseledItems.CINNABAR_TILE_WALL);

            entries.insertAfter(Items.SULFUR_BRICK_WALL, ChiseledItems.CUT_SULFUR_BRICKS,
                    ChiseledItems.CUT_SULFUR_BRICK_STAIRS,
                    ChiseledItems.CUT_SULFUR_BRICK_SLAB,
                    ChiseledItems.SULFUR_TILES,
                    ChiseledItems.SULFUR_TILE_STAIRS,
                    ChiseledItems.SULFUR_TILE_SLAB,
                    ChiseledItems.SULFUR_TILE_WALL);

            entries.insertAfter(Items.PRISMARINE_BRICK_SLAB, ChiseledItems.PRISMARINE_BRICK_WALL,
                    ChiseledItems.CUT_PRISMARINE_BRICKS,
                    ChiseledItems.CUT_PRISMARINE_BRICK_STAIRS,
                    ChiseledItems.CUT_PRISMARINE_BRICK_SLAB);
            entries.insertAfter(Items.DARK_PRISMARINE_SLAB, ChiseledItems.DARK_PRISMARINE_WALL,
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

            entries.insertAfter(Items.SMOOTH_BASALT, ChiseledItems.SMOOTH_BASALT_STAIRS,
                    ChiseledItems.SMOOTH_BASALT_SLAB,
                    ChiseledItems.SMOOTH_BASALT_WALL);
            entries.insertAfter(Items.POLISHED_BASALT, ChiseledItems.BASALT_BRICKS,
                    ChiseledItems.BASALT_BRICK_STAIRS,
                    ChiseledItems.BASALT_BRICK_SLAB,
                    ChiseledItems.BASALT_BRICK_WALL,
                    ChiseledItems.CUT_BASALT_BRICKS,
                    ChiseledItems.CUT_BASALT_BRICK_STAIRS,
                    ChiseledItems.CUT_BASALT_BRICK_SLAB,
                    ChiseledItems.BASALT_TILES,
                    ChiseledItems.BASALT_TILE_STAIRS,
                    ChiseledItems.BASALT_TILE_SLAB,
                    ChiseledItems.BASALT_TILE_WALL);

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
                    ChiseledItems.POLISHED_END_STONE_WALL);
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

            entries.insertAfter(Items.LAPIS_BLOCK, ChiseledItems.CHISELED_LAPIS);

            entries.insertAfter(Items.NETHERITE_BLOCK, Items.QUARTZ_BLOCK,
                    Items.QUARTZ_STAIRS,
                    Items.QUARTZ_SLAB,
                    ChiseledItems.QUARTZ_WALL,
                    Items.CHISELED_QUARTZ_BLOCK,
                    Items.QUARTZ_PILLAR,
                    Items.SMOOTH_QUARTZ,
                    Items.SMOOTH_QUARTZ_STAIRS,
                    Items.SMOOTH_QUARTZ_SLAB,
                    ChiseledItems.SMOOTH_QUARTZ_WALL,
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

            entries.insertAfter(Items.AMETHYST_BLOCK, ChiseledItems.AMETHYST_STAIRS,
                    ChiseledItems.AMETHYST_SLAB,
                    ChiseledItems.AMETHYST_WALL,
                    ChiseledItems.AMETHYST_BRICKS,
                    ChiseledItems.AMETHYST_BRICK_STAIRS,
                    ChiseledItems.AMETHYST_BRICK_SLAB,
                    ChiseledItems.AMETHYST_BRICK_WALL,
                    ChiseledItems.CUT_AMETHYST_BRICKS,
                    ChiseledItems.CUT_AMETHYST_BRICK_STAIRS,
                    ChiseledItems.CUT_AMETHYST_BRICK_SLAB);
        });

        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.COLORED_BLOCKS).register(entries -> {
            entries.insertAfter(Items.TERRACOTTA,
                    ChiseledItems.TERRACOTTA_BRICKS,
                    ChiseledItems.TERRACOTTA_BRICK_STAIRS,
                    ChiseledItems.TERRACOTTA_BRICK_SLAB,
                    ChiseledItems.TERRACOTTA_BRICK_WALL);
            entries.insertAfter(Items.DYED_TERRACOTTA.white(),
                    ChiseledItems.WHITE_TERRACOTTA_BRICKS,
                    ChiseledItems.WHITE_TERRACOTTA_BRICK_STAIRS,
                    ChiseledItems.WHITE_TERRACOTTA_BRICK_SLAB,
                    ChiseledItems.WHITE_TERRACOTTA_BRICK_WALL);
            entries.insertAfter(Items.DYED_TERRACOTTA.lightGray(),
                    ChiseledItems.LIGHT_GRAY_TERRACOTTA_BRICKS,
                    ChiseledItems.LIGHT_GRAY_TERRACOTTA_BRICK_STAIRS,
                    ChiseledItems.LIGHT_GRAY_TERRACOTTA_BRICK_SLAB,
                    ChiseledItems.LIGHT_GRAY_TERRACOTTA_BRICK_WALL);
            entries.insertAfter(Items.DYED_TERRACOTTA.gray(),
                    ChiseledItems.GRAY_TERRACOTTA_BRICKS,
                    ChiseledItems.GRAY_TERRACOTTA_BRICK_STAIRS,
                    ChiseledItems.GRAY_TERRACOTTA_BRICK_SLAB,
                    ChiseledItems.GRAY_TERRACOTTA_BRICK_WALL);
            entries.insertAfter(Items.DYED_TERRACOTTA.black(),
                    ChiseledItems.BLACK_TERRACOTTA_BRICKS,
                    ChiseledItems.BLACK_TERRACOTTA_BRICK_STAIRS,
                    ChiseledItems.BLACK_TERRACOTTA_BRICK_SLAB,
                    ChiseledItems.BLACK_TERRACOTTA_BRICK_WALL);
            entries.insertAfter(Items.DYED_TERRACOTTA.brown(),
                    ChiseledItems.BROWN_TERRACOTTA_BRICKS,
                    ChiseledItems.BROWN_TERRACOTTA_BRICK_STAIRS,
                    ChiseledItems.BROWN_TERRACOTTA_BRICK_SLAB,
                    ChiseledItems.BROWN_TERRACOTTA_BRICK_WALL);
            entries.insertAfter(Items.DYED_TERRACOTTA.red(),
                    ChiseledItems.RED_TERRACOTTA_BRICKS,
                    ChiseledItems.RED_TERRACOTTA_BRICK_STAIRS,
                    ChiseledItems.RED_TERRACOTTA_BRICK_SLAB,
                    ChiseledItems.RED_TERRACOTTA_BRICK_WALL);
            entries.insertAfter(Items.DYED_TERRACOTTA.orange(),
                    ChiseledItems.ORANGE_TERRACOTTA_BRICKS,
                    ChiseledItems.ORANGE_TERRACOTTA_BRICK_STAIRS,
                    ChiseledItems.ORANGE_TERRACOTTA_BRICK_SLAB,
                    ChiseledItems.ORANGE_TERRACOTTA_BRICK_WALL);
            entries.insertAfter(Items.DYED_TERRACOTTA.yellow(),
                    ChiseledItems.YELLOW_TERRACOTTA_BRICKS,
                    ChiseledItems.YELLOW_TERRACOTTA_BRICK_STAIRS,
                    ChiseledItems.YELLOW_TERRACOTTA_BRICK_SLAB,
                    ChiseledItems.YELLOW_TERRACOTTA_BRICK_WALL);
            entries.insertAfter(Items.DYED_TERRACOTTA.lime(),
                    ChiseledItems.LIME_TERRACOTTA_BRICKS,
                    ChiseledItems.LIME_TERRACOTTA_BRICK_STAIRS,
                    ChiseledItems.LIME_TERRACOTTA_BRICK_SLAB,
                    ChiseledItems.LIME_TERRACOTTA_BRICK_WALL);
            entries.insertAfter(Items.DYED_TERRACOTTA.green(),
                    ChiseledItems.GREEN_TERRACOTTA_BRICKS,
                    ChiseledItems.GREEN_TERRACOTTA_BRICK_STAIRS,
                    ChiseledItems.GREEN_TERRACOTTA_BRICK_SLAB,
                    ChiseledItems.GREEN_TERRACOTTA_BRICK_WALL);
            entries.insertAfter(Items.DYED_TERRACOTTA.cyan(),
                    ChiseledItems.CYAN_TERRACOTTA_BRICKS,
                    ChiseledItems.CYAN_TERRACOTTA_BRICK_STAIRS,
                    ChiseledItems.CYAN_TERRACOTTA_BRICK_SLAB,
                    ChiseledItems.CYAN_TERRACOTTA_BRICK_WALL);
            entries.insertAfter(Items.DYED_TERRACOTTA.lightBlue(),
                    ChiseledItems.LIGHT_BLUE_TERRACOTTA_BRICKS,
                    ChiseledItems.LIGHT_BLUE_TERRACOTTA_BRICK_STAIRS,
                    ChiseledItems.LIGHT_BLUE_TERRACOTTA_BRICK_SLAB,
                    ChiseledItems.LIGHT_BLUE_TERRACOTTA_BRICK_WALL);
            entries.insertAfter(Items.DYED_TERRACOTTA.blue(),
                    ChiseledItems.BLUE_TERRACOTTA_BRICKS,
                    ChiseledItems.BLUE_TERRACOTTA_BRICK_STAIRS,
                    ChiseledItems.BLUE_TERRACOTTA_BRICK_SLAB,
                    ChiseledItems.BLUE_TERRACOTTA_BRICK_WALL);
            entries.insertAfter(Items.DYED_TERRACOTTA.purple(),
                    ChiseledItems.PURPLE_TERRACOTTA_BRICKS,
                    ChiseledItems.PURPLE_TERRACOTTA_BRICK_STAIRS,
                    ChiseledItems.PURPLE_TERRACOTTA_BRICK_SLAB,
                    ChiseledItems.PURPLE_TERRACOTTA_BRICK_WALL);
            entries.insertAfter(Items.DYED_TERRACOTTA.magenta(),
                    ChiseledItems.MAGENTA_TERRACOTTA_BRICKS,
                    ChiseledItems.MAGENTA_TERRACOTTA_BRICK_STAIRS,
                    ChiseledItems.MAGENTA_TERRACOTTA_BRICK_SLAB,
                    ChiseledItems.MAGENTA_TERRACOTTA_BRICK_WALL);
            entries.insertAfter(Items.DYED_TERRACOTTA.pink(),
                    ChiseledItems.PINK_TERRACOTTA_BRICKS,
                    ChiseledItems.PINK_TERRACOTTA_BRICK_STAIRS,
                    ChiseledItems.PINK_TERRACOTTA_BRICK_SLAB,
                    ChiseledItems.PINK_TERRACOTTA_BRICK_WALL);
        });
    }
}