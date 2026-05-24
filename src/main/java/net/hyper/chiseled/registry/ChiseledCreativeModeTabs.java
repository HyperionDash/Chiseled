package net.hyper.chiseled.registry;

import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.hyper.chiseled.Chiseled;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;

public class ChiseledCreativeModeTabs {
    public static final CreativeModeTab CHISELED = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(Chiseled.MOD_ID, "chiseled"),
            FabricCreativeModeTab.builder().icon(() -> new ItemStack(ChiseledBlocks.POLISHED_STONE))
                    .title(Component.translatable("itemgroup.chiseled.chiseled"))
                    .displayItems((displayContext, entries) -> {
                        entries.accept(ChiseledBlocks.STONE_WALL);
                        entries.accept(ChiseledBlocks.POLISHED_STONE);
                        entries.accept(ChiseledBlocks.POLISHED_STONE_STAIRS);
                        entries.accept(ChiseledBlocks.POLISHED_STONE_SLAB);
                        entries.accept(ChiseledBlocks.POLISHED_STONE_WALL);
                        entries.accept(ChiseledBlocks.SMOOTH_STONE_STAIRS);
                        entries.accept(ChiseledBlocks.CUT_STONE_BRICKS);
                        entries.accept(ChiseledBlocks.CRACKED_CUT_STONE_BRICKS);
                        entries.accept(ChiseledBlocks.CUT_STONE_BRICK_STAIRS);
                        entries.accept(ChiseledBlocks.CUT_STONE_BRICK_SLAB);
                        entries.accept(ChiseledBlocks.MOSSY_CUT_STONE_BRICKS);
                        entries.accept(ChiseledBlocks.MOSSY_CUT_STONE_BRICK_STAIRS);
                        entries.accept(ChiseledBlocks.MOSSY_CUT_STONE_BRICK_SLAB);
                        entries.accept(ChiseledBlocks.STONE_TILES);
                        entries.accept(ChiseledBlocks.CRACKED_STONE_TILES);
                        entries.accept(ChiseledBlocks.STONE_TILE_STAIRS);
                        entries.accept(ChiseledBlocks.STONE_TILE_SLAB);
                        entries.accept(ChiseledBlocks.STONE_TILE_WALL);
                        entries.accept(ChiseledBlocks.MOSSY_STONE_TILES);
                        entries.accept(ChiseledBlocks.MOSSY_STONE_TILE_STAIRS);
                        entries.accept(ChiseledBlocks.MOSSY_STONE_TILE_SLAB);
                        entries.accept(ChiseledBlocks.MOSSY_STONE_TILE_WALL);

                        entries.accept(ChiseledBlocks.POLISHED_GRANITE_WALL);
                        entries.accept(ChiseledBlocks.POLISHED_GRANITE_BRICKS);
                        entries.accept(ChiseledBlocks.CRACKED_POLISHED_GRANITE_BRICKS);
                        entries.accept(ChiseledBlocks.POLISHED_GRANITE_BRICK_STAIRS);
                        entries.accept(ChiseledBlocks.POLISHED_GRANITE_BRICK_SLAB);
                        entries.accept(ChiseledBlocks.POLISHED_GRANITE_BRICK_WALL);
                        entries.accept(ChiseledBlocks.CUT_POLISHED_GRANITE_BRICKS);
                        entries.accept(ChiseledBlocks.CRACKED_CUT_POLISHED_GRANITE_BRICKS);
                        entries.accept(ChiseledBlocks.CUT_POLISHED_GRANITE_BRICK_STAIRS);
                        entries.accept(ChiseledBlocks.CUT_POLISHED_GRANITE_BRICK_SLAB);
                        entries.accept(ChiseledBlocks.POLISHED_GRANITE_TILES);
                        entries.accept(ChiseledBlocks.CRACKED_POLISHED_GRANITE_TILES);
                        entries.accept(ChiseledBlocks.POLISHED_GRANITE_TILE_STAIRS);
                        entries.accept(ChiseledBlocks.POLISHED_GRANITE_TILE_SLAB);
                        entries.accept(ChiseledBlocks.POLISHED_GRANITE_TILE_WALL);

                        entries.accept(ChiseledBlocks.POLISHED_DIORITE_WALL);
                        entries.accept(ChiseledBlocks.POLISHED_DIORITE_BRICKS);
                        entries.accept(ChiseledBlocks.CRACKED_POLISHED_DIORITE_BRICKS);
                        entries.accept(ChiseledBlocks.POLISHED_DIORITE_BRICK_STAIRS);
                        entries.accept(ChiseledBlocks.POLISHED_DIORITE_BRICK_SLAB);
                        entries.accept(ChiseledBlocks.POLISHED_DIORITE_BRICK_WALL);
                        entries.accept(ChiseledBlocks.CUT_POLISHED_DIORITE_BRICKS);
                        entries.accept(ChiseledBlocks.CRACKED_CUT_POLISHED_DIORITE_BRICKS);
                        entries.accept(ChiseledBlocks.CUT_POLISHED_DIORITE_BRICK_STAIRS);
                        entries.accept(ChiseledBlocks.CUT_POLISHED_DIORITE_BRICK_SLAB);
                        entries.accept(ChiseledBlocks.POLISHED_DIORITE_TILES);
                        entries.accept(ChiseledBlocks.CRACKED_POLISHED_DIORITE_TILES);
                        entries.accept(ChiseledBlocks.POLISHED_DIORITE_TILE_STAIRS);
                        entries.accept(ChiseledBlocks.POLISHED_DIORITE_TILE_SLAB);
                        entries.accept(ChiseledBlocks.POLISHED_DIORITE_TILE_WALL);
                        
                        entries.accept(ChiseledBlocks.POLISHED_ANDESITE_WALL);
                        entries.accept(ChiseledBlocks.POLISHED_ANDESITE_BRICKS);
                        entries.accept(ChiseledBlocks.CRACKED_POLISHED_ANDESITE_BRICKS);
                        entries.accept(ChiseledBlocks.POLISHED_ANDESITE_BRICK_STAIRS);
                        entries.accept(ChiseledBlocks.POLISHED_ANDESITE_BRICK_SLAB);
                        entries.accept(ChiseledBlocks.POLISHED_ANDESITE_BRICK_WALL);
                        entries.accept(ChiseledBlocks.CUT_POLISHED_ANDESITE_BRICKS);
                        entries.accept(ChiseledBlocks.CRACKED_CUT_POLISHED_ANDESITE_BRICKS);
                        entries.accept(ChiseledBlocks.CUT_POLISHED_ANDESITE_BRICK_STAIRS);
                        entries.accept(ChiseledBlocks.CUT_POLISHED_ANDESITE_BRICK_SLAB);
                        entries.accept(ChiseledBlocks.POLISHED_ANDESITE_TILES);
                        entries.accept(ChiseledBlocks.CRACKED_POLISHED_ANDESITE_TILES);
                        entries.accept(ChiseledBlocks.POLISHED_ANDESITE_TILE_STAIRS);
                        entries.accept(ChiseledBlocks.POLISHED_ANDESITE_TILE_SLAB);
                        entries.accept(ChiseledBlocks.POLISHED_ANDESITE_TILE_WALL);

                        entries.accept(ChiseledBlocks.CUT_DEEPSLATE_BRICKS);
                        entries.accept(ChiseledBlocks.CRACKED_CUT_DEEPSLATE_BRICKS);
                        entries.accept(ChiseledBlocks.CUT_DEEPSLATE_BRICK_STAIRS);
                        entries.accept(ChiseledBlocks.CUT_DEEPSLATE_BRICK_SLAB);

                        entries.accept(ChiseledBlocks.CALCITE_STAIRS);
                        entries.accept(ChiseledBlocks.CALCITE_SLAB);
                        entries.accept(ChiseledBlocks.CALCITE_WALL);
                        entries.accept(ChiseledBlocks.POLISHED_CALCITE);
                        entries.accept(ChiseledBlocks.POLISHED_CALCITE_STAIRS);
                        entries.accept(ChiseledBlocks.POLISHED_CALCITE_SLAB);
                        entries.accept(ChiseledBlocks.POLISHED_CALCITE_WALL);
                        entries.accept(ChiseledBlocks.CALCITE_BRICKS);
                        entries.accept(ChiseledBlocks.CRACKED_CALCITE_BRICKS);
                        entries.accept(ChiseledBlocks.CALCITE_BRICK_STAIRS);
                        entries.accept(ChiseledBlocks.CALCITE_BRICK_SLAB);
                        entries.accept(ChiseledBlocks.CALCITE_BRICK_WALL);
                        entries.accept(ChiseledBlocks.CUT_CALCITE_BRICKS);
                        entries.accept(ChiseledBlocks.CRACKED_CUT_CALCITE_BRICKS);
                        entries.accept(ChiseledBlocks.CUT_CALCITE_BRICK_STAIRS);
                        entries.accept(ChiseledBlocks.CUT_CALCITE_BRICK_SLAB);
                        entries.accept(ChiseledBlocks.CALCITE_TILES);
                        entries.accept(ChiseledBlocks.CRACKED_CALCITE_TILES);
                        entries.accept(ChiseledBlocks.CALCITE_TILE_STAIRS);
                        entries.accept(ChiseledBlocks.CALCITE_TILE_SLAB);
                        entries.accept(ChiseledBlocks.CALCITE_TILE_WALL);

                        entries.accept(ChiseledBlocks.DRIPSTONE_STAIRS);
                        entries.accept(ChiseledBlocks.DRIPSTONE_SLAB);
                        entries.accept(ChiseledBlocks.DRIPSTONE_WALL);
                        entries.accept(ChiseledBlocks.POLISHED_DRIPSTONE);
                        entries.accept(ChiseledBlocks.POLISHED_DRIPSTONE_STAIRS);
                        entries.accept(ChiseledBlocks.POLISHED_DRIPSTONE_SLAB);
                        entries.accept(ChiseledBlocks.POLISHED_DRIPSTONE_WALL);
                        entries.accept(ChiseledBlocks.DRIPSTONE_BRICKS);
                        entries.accept(ChiseledBlocks.CRACKED_DRIPSTONE_BRICKS);
                        entries.accept(ChiseledBlocks.DRIPSTONE_BRICK_STAIRS);
                        entries.accept(ChiseledBlocks.DRIPSTONE_BRICK_SLAB);
                        entries.accept(ChiseledBlocks.DRIPSTONE_BRICK_WALL);
                        entries.accept(ChiseledBlocks.CUT_DRIPSTONE_BRICKS);
                        entries.accept(ChiseledBlocks.CRACKED_CUT_DRIPSTONE_BRICKS);
                        entries.accept(ChiseledBlocks.CUT_DRIPSTONE_BRICK_STAIRS);
                        entries.accept(ChiseledBlocks.CUT_DRIPSTONE_BRICK_SLAB);
                        entries.accept(ChiseledBlocks.DRIPSTONE_TILES);
                        entries.accept(ChiseledBlocks.CRACKED_DRIPSTONE_TILES);
                        entries.accept(ChiseledBlocks.DRIPSTONE_TILE_STAIRS);
                        entries.accept(ChiseledBlocks.DRIPSTONE_TILE_SLAB);
                        entries.accept(ChiseledBlocks.DRIPSTONE_TILE_WALL);
                        
                        entries.accept(ChiseledBlocks.MIXED_BRICKS);
                        entries.accept(ChiseledBlocks.MIXED_BRICK_STAIRS);
                        entries.accept(ChiseledBlocks.MIXED_BRICK_SLAB);
                        entries.accept(ChiseledBlocks.MIXED_BRICK_WALL);
                        entries.accept(ChiseledBlocks.MOSSY_BRICKS);
                        entries.accept(ChiseledBlocks.MOSSY_BRICK_STAIRS);
                        entries.accept(ChiseledBlocks.MOSSY_BRICK_SLAB);
                        entries.accept(ChiseledBlocks.MOSSY_BRICK_WALL);

                        entries.accept(ChiseledBlocks.PACKED_MUD_STAIRS);
                        entries.accept(ChiseledBlocks.PACKED_MUD_SLAB);
                        entries.accept(ChiseledBlocks.PACKED_MUD_WALL);
                        entries.accept(ChiseledBlocks.POLISHED_MUD);
                        entries.accept(ChiseledBlocks.POLISHED_MUD_STAIRS);
                        entries.accept(ChiseledBlocks.POLISHED_MUD_SLAB);
                        entries.accept(ChiseledBlocks.POLISHED_MUD_WALL);
                        entries.accept(ChiseledBlocks.MOSSY_MUD_BRICKS);
                        entries.accept(ChiseledBlocks.MOSSY_MUD_BRICK_STAIRS);
                        entries.accept(ChiseledBlocks.MOSSY_MUD_BRICK_SLAB);
                        entries.accept(ChiseledBlocks.MOSSY_MUD_BRICK_WALL);
                        entries.accept(ChiseledBlocks.CUT_MUD_BRICKS);
                        entries.accept(ChiseledBlocks.CUT_MUD_BRICK_STAIRS);
                        entries.accept(ChiseledBlocks.CUT_MUD_BRICK_SLAB);
                        entries.accept(ChiseledBlocks.MOSSY_CUT_MUD_BRICKS);
                        entries.accept(ChiseledBlocks.MOSSY_CUT_MUD_BRICK_STAIRS);
                        entries.accept(ChiseledBlocks.MOSSY_CUT_MUD_BRICK_SLAB);
                        entries.accept(ChiseledBlocks.MUD_TILES);
                        entries.accept(ChiseledBlocks.MUD_TILE_STAIRS);
                        entries.accept(ChiseledBlocks.MUD_TILE_SLAB);
                        entries.accept(ChiseledBlocks.MUD_TILE_WALL);
                        entries.accept(ChiseledBlocks.MOSSY_MUD_TILES);
                        entries.accept(ChiseledBlocks.MOSSY_MUD_TILE_STAIRS);
                        entries.accept(ChiseledBlocks.MOSSY_MUD_TILE_SLAB);
                        entries.accept(ChiseledBlocks.MOSSY_MUD_TILE_WALL);

                        entries.accept(ChiseledBlocks.HONEYCOMB_STAIRS);
                        entries.accept(ChiseledBlocks.HONEYCOMB_SLAB);
                        entries.accept(ChiseledBlocks.HONEYCOMB_WALL);
                        entries.accept(ChiseledBlocks.HONEYCOMB_BRICKS);
                        entries.accept(ChiseledBlocks.HONEYCOMB_BRICK_STAIRS);
                        entries.accept(ChiseledBlocks.HONEYCOMB_BRICK_SLAB);
                        entries.accept(ChiseledBlocks.HONEYCOMB_BRICK_WALL);
                        entries.accept(ChiseledBlocks.CUT_HONEYCOMB_BRICKS);
                        entries.accept(ChiseledBlocks.CUT_HONEYCOMB_BRICK_STAIRS);
                        entries.accept(ChiseledBlocks.CUT_HONEYCOMB_BRICK_SLAB);

                        entries.accept(ChiseledBlocks.SMOOTH_SANDSTONE_WALL);
                        entries.accept(ChiseledBlocks.SANDSTONE_BRICKS);
                        entries.accept(ChiseledBlocks.SANDSTONE_BRICK_STAIRS);
                        entries.accept(ChiseledBlocks.SANDSTONE_BRICK_SLAB);
                        entries.accept(ChiseledBlocks.SANDSTONE_BRICK_WALL);
                        entries.accept(ChiseledBlocks.CUT_SANDSTONE_BRICKS);
                        entries.accept(ChiseledBlocks.CUT_SANDSTONE_BRICK_STAIRS);
                        entries.accept(ChiseledBlocks.CUT_SANDSTONE_BRICK_SLAB);

                        entries.accept(ChiseledBlocks.SMOOTH_RED_SANDSTONE_WALL);
                        entries.accept(ChiseledBlocks.RED_SANDSTONE_BRICKS);
                        entries.accept(ChiseledBlocks.RED_SANDSTONE_BRICK_STAIRS);
                        entries.accept(ChiseledBlocks.RED_SANDSTONE_BRICK_SLAB);
                        entries.accept(ChiseledBlocks.RED_SANDSTONE_BRICK_WALL);
                        entries.accept(ChiseledBlocks.CUT_RED_SANDSTONE_BRICKS);
                        entries.accept(ChiseledBlocks.CUT_RED_SANDSTONE_BRICK_STAIRS);
                        entries.accept(ChiseledBlocks.CUT_RED_SANDSTONE_BRICK_SLAB);
                    }).build());

    public static void init() {
        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.BUILDING_BLOCKS).register(entries -> {
            entries.insertAfter(Blocks.STONE_SLAB, ChiseledBlocks.STONE_WALL);
            entries.insertAfter(Blocks.MOSSY_COBBLESTONE_WALL, ChiseledBlocks.POLISHED_STONE,
                    ChiseledBlocks.POLISHED_STONE_STAIRS,
                    ChiseledBlocks.POLISHED_STONE_SLAB,
                    ChiseledBlocks.POLISHED_STONE_WALL);
            entries.insertAfter(Blocks.SMOOTH_STONE, ChiseledBlocks.SMOOTH_STONE_STAIRS);
            entries.insertAfter(Blocks.MOSSY_STONE_BRICK_WALL, ChiseledBlocks.CUT_STONE_BRICKS,
                    ChiseledBlocks.CRACKED_CUT_STONE_BRICKS,
                    ChiseledBlocks.CUT_STONE_BRICK_STAIRS,
                    ChiseledBlocks.CUT_STONE_BRICK_SLAB,
                    ChiseledBlocks.MOSSY_CUT_STONE_BRICKS,
                    ChiseledBlocks.MOSSY_CUT_STONE_BRICK_STAIRS,
                    ChiseledBlocks.MOSSY_CUT_STONE_BRICK_SLAB,
                    ChiseledBlocks.STONE_TILES,
                    ChiseledBlocks.CRACKED_STONE_TILES,
                    ChiseledBlocks.STONE_TILE_STAIRS,
                    ChiseledBlocks.STONE_TILE_SLAB,
                    ChiseledBlocks.STONE_TILE_WALL,
                    ChiseledBlocks.MOSSY_STONE_TILES,
                    ChiseledBlocks.MOSSY_STONE_TILE_STAIRS,
                    ChiseledBlocks.MOSSY_STONE_TILE_SLAB,
                    ChiseledBlocks.MOSSY_STONE_TILE_WALL);

            entries.insertAfter(Blocks.POLISHED_GRANITE_SLAB, ChiseledBlocks.POLISHED_GRANITE_WALL,
                    ChiseledBlocks.POLISHED_GRANITE_BRICKS,
                    ChiseledBlocks.CRACKED_POLISHED_GRANITE_BRICKS,
                    ChiseledBlocks.POLISHED_GRANITE_BRICK_STAIRS,
                    ChiseledBlocks.POLISHED_GRANITE_BRICK_SLAB,
                    ChiseledBlocks.POLISHED_GRANITE_BRICK_WALL,
                    ChiseledBlocks.CUT_POLISHED_GRANITE_BRICKS,
                    ChiseledBlocks.CRACKED_CUT_POLISHED_GRANITE_BRICKS,
                    ChiseledBlocks.CUT_POLISHED_GRANITE_BRICK_STAIRS,
                    ChiseledBlocks.CUT_POLISHED_GRANITE_BRICK_SLAB,
                    ChiseledBlocks.POLISHED_GRANITE_TILES,
                    ChiseledBlocks.CRACKED_POLISHED_GRANITE_TILES,
                    ChiseledBlocks.POLISHED_GRANITE_TILE_STAIRS,
                    ChiseledBlocks.POLISHED_GRANITE_TILE_SLAB,
                    ChiseledBlocks.POLISHED_GRANITE_TILE_WALL);
            
            entries.insertAfter(Blocks.POLISHED_DIORITE_SLAB, ChiseledBlocks.POLISHED_DIORITE_WALL,
                    ChiseledBlocks.POLISHED_DIORITE_BRICKS,
                    ChiseledBlocks.CRACKED_POLISHED_DIORITE_BRICKS,
                    ChiseledBlocks.POLISHED_DIORITE_BRICK_STAIRS,
                    ChiseledBlocks.POLISHED_DIORITE_BRICK_SLAB,
                    ChiseledBlocks.POLISHED_DIORITE_BRICK_WALL,
                    ChiseledBlocks.CUT_POLISHED_DIORITE_BRICKS,
                    ChiseledBlocks.CRACKED_CUT_POLISHED_DIORITE_BRICKS,
                    ChiseledBlocks.CUT_POLISHED_DIORITE_BRICK_STAIRS,
                    ChiseledBlocks.CUT_POLISHED_DIORITE_BRICK_SLAB,
                    ChiseledBlocks.POLISHED_DIORITE_TILES,
                    ChiseledBlocks.CRACKED_POLISHED_DIORITE_TILES,
                    ChiseledBlocks.POLISHED_DIORITE_TILE_STAIRS,
                    ChiseledBlocks.POLISHED_DIORITE_TILE_SLAB,
                    ChiseledBlocks.POLISHED_DIORITE_TILE_WALL);

            entries.insertAfter(Blocks.POLISHED_ANDESITE_SLAB, ChiseledBlocks.POLISHED_ANDESITE_WALL,
                    ChiseledBlocks.POLISHED_ANDESITE_BRICKS,
                    ChiseledBlocks.CRACKED_POLISHED_ANDESITE_BRICKS,
                    ChiseledBlocks.POLISHED_ANDESITE_BRICK_STAIRS,
                    ChiseledBlocks.POLISHED_ANDESITE_BRICK_SLAB,
                    ChiseledBlocks.POLISHED_ANDESITE_BRICK_WALL,
                    ChiseledBlocks.CUT_POLISHED_ANDESITE_BRICKS,
                    ChiseledBlocks.CRACKED_CUT_POLISHED_ANDESITE_BRICKS,
                    ChiseledBlocks.CUT_POLISHED_ANDESITE_BRICK_STAIRS,
                    ChiseledBlocks.CUT_POLISHED_ANDESITE_BRICK_SLAB,
                    ChiseledBlocks.POLISHED_ANDESITE_TILES,
                    ChiseledBlocks.CRACKED_POLISHED_ANDESITE_TILES,
                    ChiseledBlocks.POLISHED_ANDESITE_TILE_STAIRS,
                    ChiseledBlocks.POLISHED_ANDESITE_TILE_SLAB,
                    ChiseledBlocks.POLISHED_ANDESITE_TILE_WALL);

            entries.insertAfter(Blocks.POLISHED_DEEPSLATE_WALL, ChiseledBlocks.CUT_DEEPSLATE_BRICKS,
                    ChiseledBlocks.CRACKED_CUT_DEEPSLATE_BRICKS,
                    ChiseledBlocks.CUT_DEEPSLATE_BRICK_STAIRS,
                    ChiseledBlocks.CUT_DEEPSLATE_BRICK_SLAB);

            entries.insertBefore(Blocks.TUFF, Blocks.CALCITE,
                    ChiseledBlocks.CALCITE_STAIRS,
                    ChiseledBlocks.CALCITE_SLAB,
                    ChiseledBlocks.CALCITE_WALL,
                    ChiseledBlocks.POLISHED_CALCITE,
                    ChiseledBlocks.POLISHED_CALCITE_STAIRS,
                    ChiseledBlocks.POLISHED_CALCITE_SLAB,
                    ChiseledBlocks.POLISHED_CALCITE_WALL,
                    ChiseledBlocks.CALCITE_BRICKS,
                    ChiseledBlocks.CRACKED_CALCITE_BRICKS,
                    ChiseledBlocks.CALCITE_BRICK_STAIRS,
                    ChiseledBlocks.CALCITE_BRICK_SLAB,
                    ChiseledBlocks.CALCITE_BRICK_WALL,
                    ChiseledBlocks.CUT_CALCITE_BRICKS,
                    ChiseledBlocks.CRACKED_CUT_CALCITE_BRICKS,
                    ChiseledBlocks.CUT_CALCITE_BRICK_STAIRS,
                    ChiseledBlocks.CUT_CALCITE_BRICK_SLAB,
                    ChiseledBlocks.CALCITE_TILES,
                    ChiseledBlocks.CRACKED_CALCITE_TILES,
                    ChiseledBlocks.CALCITE_TILE_STAIRS,
                    ChiseledBlocks.CALCITE_TILE_SLAB,
                    ChiseledBlocks.CALCITE_TILE_WALL);

            entries.insertAfter(Blocks.CHISELED_TUFF_BRICKS, Blocks.DRIPSTONE_BLOCK,
                    ChiseledBlocks.DRIPSTONE_STAIRS,
                    ChiseledBlocks.DRIPSTONE_SLAB,
                    ChiseledBlocks.DRIPSTONE_WALL,
                    ChiseledBlocks.POLISHED_DRIPSTONE,
                    ChiseledBlocks.POLISHED_DRIPSTONE_STAIRS,
                    ChiseledBlocks.POLISHED_DRIPSTONE_SLAB,
                    ChiseledBlocks.POLISHED_DRIPSTONE_WALL,
                    ChiseledBlocks.DRIPSTONE_BRICKS,
                    ChiseledBlocks.CRACKED_DRIPSTONE_BRICKS,
                    ChiseledBlocks.DRIPSTONE_BRICK_STAIRS,
                    ChiseledBlocks.DRIPSTONE_BRICK_SLAB,
                    ChiseledBlocks.DRIPSTONE_BRICK_WALL,
                    ChiseledBlocks.CUT_DRIPSTONE_BRICKS,
                    ChiseledBlocks.CRACKED_CUT_DRIPSTONE_BRICKS,
                    ChiseledBlocks.CUT_DRIPSTONE_BRICK_STAIRS,
                    ChiseledBlocks.CUT_DRIPSTONE_BRICK_SLAB,
                    ChiseledBlocks.DRIPSTONE_TILES,
                    ChiseledBlocks.CRACKED_DRIPSTONE_TILES,
                    ChiseledBlocks.DRIPSTONE_TILE_STAIRS,
                    ChiseledBlocks.DRIPSTONE_TILE_SLAB,
                    ChiseledBlocks.DRIPSTONE_TILE_WALL);

            entries.insertAfter(Blocks.BRICK_WALL, ChiseledBlocks.MIXED_BRICKS,
                    ChiseledBlocks.MIXED_BRICK_STAIRS,
                    ChiseledBlocks.MIXED_BRICK_SLAB,
                    ChiseledBlocks.MIXED_BRICK_WALL,
                    ChiseledBlocks.MOSSY_BRICKS,
                    ChiseledBlocks.MOSSY_BRICK_STAIRS,
                    ChiseledBlocks.MOSSY_BRICK_SLAB,
                    ChiseledBlocks.MOSSY_BRICK_WALL);

            entries.insertAfter(Blocks.PACKED_MUD, ChiseledBlocks.PACKED_MUD_STAIRS,
                    ChiseledBlocks.PACKED_MUD_SLAB,
                    ChiseledBlocks.PACKED_MUD_WALL,
                    ChiseledBlocks.POLISHED_MUD,
                    ChiseledBlocks.POLISHED_MUD_STAIRS,
                    ChiseledBlocks.POLISHED_MUD_SLAB,
                    ChiseledBlocks.POLISHED_MUD_WALL);

            entries.insertAfter(Blocks.MUD_BRICK_WALL, ChiseledBlocks.MOSSY_MUD_BRICKS,
                    ChiseledBlocks.MOSSY_MUD_BRICK_STAIRS,
                    ChiseledBlocks.MOSSY_MUD_BRICK_SLAB,
                    ChiseledBlocks.MOSSY_MUD_BRICK_WALL,
                    ChiseledBlocks.CUT_MUD_BRICKS,
                    ChiseledBlocks.CUT_MUD_BRICK_STAIRS,
                    ChiseledBlocks.CUT_MUD_BRICK_SLAB,
                    ChiseledBlocks.MOSSY_CUT_MUD_BRICKS,
                    ChiseledBlocks.MOSSY_CUT_MUD_BRICK_STAIRS,
                    ChiseledBlocks.MOSSY_CUT_MUD_BRICK_SLAB,
                    ChiseledBlocks.MUD_TILES,
                    ChiseledBlocks.MUD_TILE_STAIRS,
                    ChiseledBlocks.MUD_TILE_SLAB,
                    ChiseledBlocks.MUD_TILE_WALL,
                    ChiseledBlocks.MOSSY_MUD_TILES,
                    ChiseledBlocks.MOSSY_MUD_TILE_STAIRS,
                    ChiseledBlocks.MOSSY_MUD_TILE_SLAB,
                    ChiseledBlocks.MOSSY_MUD_TILE_WALL);

            entries.insertAfter(Blocks.CHISELED_RESIN_BRICKS, Blocks.HONEYCOMB_BLOCK,
                    ChiseledBlocks.HONEYCOMB_STAIRS,
                    ChiseledBlocks.HONEYCOMB_SLAB,
                    ChiseledBlocks.HONEYCOMB_WALL,
                    ChiseledBlocks.HONEYCOMB_BRICKS,
                    ChiseledBlocks.HONEYCOMB_BRICK_STAIRS,
                    ChiseledBlocks.HONEYCOMB_BRICK_SLAB,
                    ChiseledBlocks.HONEYCOMB_BRICK_WALL,
                    ChiseledBlocks.CUT_HONEYCOMB_BRICKS,
                    ChiseledBlocks.CUT_HONEYCOMB_BRICK_STAIRS,
                    ChiseledBlocks.CUT_HONEYCOMB_BRICK_SLAB);

            entries.insertAfter(Blocks.SMOOTH_SANDSTONE_SLAB, ChiseledBlocks.SMOOTH_SANDSTONE_WALL);
            entries.insertAfter(Blocks.CUT_SANDSTONE_SLAB, ChiseledBlocks.SANDSTONE_BRICKS,
                    ChiseledBlocks.SANDSTONE_BRICK_STAIRS,
                    ChiseledBlocks.SANDSTONE_BRICK_SLAB,
                    ChiseledBlocks.SANDSTONE_BRICK_WALL,
                    ChiseledBlocks.CUT_SANDSTONE_BRICKS,
                    ChiseledBlocks.CUT_SANDSTONE_BRICK_STAIRS,
                    ChiseledBlocks.CUT_SANDSTONE_BRICK_SLAB);

            entries.insertAfter(Blocks.SMOOTH_RED_SANDSTONE_SLAB, ChiseledBlocks.SMOOTH_RED_SANDSTONE_WALL);
            entries.insertAfter(Blocks.CUT_RED_SANDSTONE_SLAB, ChiseledBlocks.RED_SANDSTONE_BRICKS,
                    ChiseledBlocks.RED_SANDSTONE_BRICK_STAIRS,
                    ChiseledBlocks.RED_SANDSTONE_BRICK_SLAB,
                    ChiseledBlocks.RED_SANDSTONE_BRICK_WALL,
                    ChiseledBlocks.CUT_RED_SANDSTONE_BRICKS,
                    ChiseledBlocks.CUT_RED_SANDSTONE_BRICK_STAIRS,
                    ChiseledBlocks.CUT_RED_SANDSTONE_BRICK_SLAB);

            //entries.insertAfter(Blocks.POLISHED_BLACKSTONE_BRICK_WALL, Blocks.QUARTZ_BLOCK,
            //        Blocks.QUARTZ_STAIRS,
            //        Blocks.QUARTZ_SLAB,
            //        ChiseledBlocks.QUARTZ_WALL,
            //        Blocks.CHISELED_QUARTZ_BLOCK,
            //        Blocks.QUARTZ_PILLAR,
            //        Blocks.SMOOTH_QUARTZ,
            //        Blocks.SMOOTH_QUARTZ_STAIRS,
            //        Blocks.SMOOTH_QUARTZ_SLAB,
            //        ChiseledBlocks.SMOOTH_QUARTZ_WALL,
            //        Blocks.QUARTZ_BRICKS
            //        );
        });
    }
}