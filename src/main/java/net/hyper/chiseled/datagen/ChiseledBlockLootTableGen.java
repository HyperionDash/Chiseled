package net.hyper.chiseled.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootSubProvider;
import net.hyper.chiseled.registry.ChiseledBlocks;
import net.minecraft.core.HolderLookup;
import java.util.concurrent.CompletableFuture;

public class ChiseledBlockLootTableGen extends FabricBlockLootSubProvider {
    public ChiseledBlockLootTableGen(FabricPackOutput dataOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        dropSelf(ChiseledBlocks.STONE_WALL);
        dropSelf(ChiseledBlocks.POLISHED_STONE);
        dropSelf(ChiseledBlocks.POLISHED_STONE_STAIRS);
        add(ChiseledBlocks.POLISHED_STONE_SLAB, createSlabItemTable(ChiseledBlocks.POLISHED_STONE_SLAB));
        dropSelf(ChiseledBlocks.POLISHED_STONE_WALL);
        dropSelf(ChiseledBlocks.SMOOTH_STONE_STAIRS);
        dropSelf(ChiseledBlocks.CUT_STONE_BRICKS);
        dropSelf(ChiseledBlocks.CRACKED_CUT_STONE_BRICKS);
        dropSelf(ChiseledBlocks.CUT_STONE_BRICK_STAIRS);
        add(ChiseledBlocks.CUT_STONE_BRICK_SLAB, createSlabItemTable(ChiseledBlocks.CUT_STONE_BRICK_SLAB));
        dropSelf(ChiseledBlocks.MOSSY_CUT_STONE_BRICKS);
        dropSelf(ChiseledBlocks.MOSSY_CUT_STONE_BRICK_STAIRS);
        add(ChiseledBlocks.MOSSY_CUT_STONE_BRICK_SLAB, createSlabItemTable(ChiseledBlocks.MOSSY_CUT_STONE_BRICK_SLAB));
        dropSelf(ChiseledBlocks.STONE_TILES);
        dropSelf(ChiseledBlocks.CRACKED_STONE_TILES);
        dropSelf(ChiseledBlocks.STONE_TILE_STAIRS);
        add(ChiseledBlocks.STONE_TILE_SLAB, createSlabItemTable(ChiseledBlocks.STONE_TILE_SLAB));
        dropSelf(ChiseledBlocks.STONE_TILE_WALL);
        dropSelf(ChiseledBlocks.MOSSY_STONE_TILES);
        dropSelf(ChiseledBlocks.MOSSY_STONE_TILE_STAIRS);
        add(ChiseledBlocks.MOSSY_STONE_TILE_SLAB, createSlabItemTable(ChiseledBlocks.MOSSY_STONE_TILE_SLAB));
        dropSelf(ChiseledBlocks.MOSSY_STONE_TILE_WALL);

        dropSelf(ChiseledBlocks.POLISHED_GRANITE_WALL);
        dropSelf(ChiseledBlocks.POLISHED_GRANITE_BRICKS);
        dropSelf(ChiseledBlocks.CRACKED_POLISHED_GRANITE_BRICKS);
        dropSelf(ChiseledBlocks.POLISHED_GRANITE_BRICK_STAIRS);
        add(ChiseledBlocks.POLISHED_GRANITE_BRICK_SLAB, createSlabItemTable(ChiseledBlocks.POLISHED_GRANITE_BRICK_SLAB));
        dropSelf(ChiseledBlocks.POLISHED_GRANITE_BRICK_WALL);
        dropSelf(ChiseledBlocks.CUT_POLISHED_GRANITE_BRICKS);
        dropSelf(ChiseledBlocks.CRACKED_CUT_POLISHED_GRANITE_BRICKS);
        dropSelf(ChiseledBlocks.CUT_POLISHED_GRANITE_BRICK_STAIRS);
        add(ChiseledBlocks.CUT_POLISHED_GRANITE_BRICK_SLAB, createSlabItemTable(ChiseledBlocks.CUT_POLISHED_GRANITE_BRICK_SLAB));
        dropSelf(ChiseledBlocks.POLISHED_GRANITE_TILES);
        dropSelf(ChiseledBlocks.CRACKED_POLISHED_GRANITE_TILES);
        dropSelf(ChiseledBlocks.POLISHED_GRANITE_TILE_STAIRS);
        add(ChiseledBlocks.POLISHED_GRANITE_TILE_SLAB, createSlabItemTable(ChiseledBlocks.POLISHED_GRANITE_TILE_SLAB));
        dropSelf(ChiseledBlocks.POLISHED_GRANITE_TILE_WALL);

        dropSelf(ChiseledBlocks.POLISHED_DIORITE_WALL);
        dropSelf(ChiseledBlocks.POLISHED_DIORITE_BRICKS);
        dropSelf(ChiseledBlocks.CRACKED_POLISHED_DIORITE_BRICKS);
        dropSelf(ChiseledBlocks.POLISHED_DIORITE_BRICK_STAIRS);
        add(ChiseledBlocks.POLISHED_DIORITE_BRICK_SLAB, createSlabItemTable(ChiseledBlocks.POLISHED_DIORITE_BRICK_SLAB));
        dropSelf(ChiseledBlocks.POLISHED_DIORITE_BRICK_WALL);
        dropSelf(ChiseledBlocks.CUT_POLISHED_DIORITE_BRICKS);
        dropSelf(ChiseledBlocks.CRACKED_CUT_POLISHED_DIORITE_BRICKS);
        dropSelf(ChiseledBlocks.CUT_POLISHED_DIORITE_BRICK_STAIRS);
        add(ChiseledBlocks.CUT_POLISHED_DIORITE_BRICK_SLAB, createSlabItemTable(ChiseledBlocks.CUT_POLISHED_DIORITE_BRICK_SLAB));
        dropSelf(ChiseledBlocks.POLISHED_DIORITE_TILES);
        dropSelf(ChiseledBlocks.CRACKED_POLISHED_DIORITE_TILES);
        dropSelf(ChiseledBlocks.POLISHED_DIORITE_TILE_STAIRS);
        add(ChiseledBlocks.POLISHED_DIORITE_TILE_SLAB, createSlabItemTable(ChiseledBlocks.POLISHED_DIORITE_TILE_SLAB));
        dropSelf(ChiseledBlocks.POLISHED_DIORITE_TILE_WALL);

        dropSelf(ChiseledBlocks.POLISHED_ANDESITE_WALL);
        dropSelf(ChiseledBlocks.POLISHED_ANDESITE_BRICKS);
        dropSelf(ChiseledBlocks.CRACKED_POLISHED_ANDESITE_BRICKS);
        dropSelf(ChiseledBlocks.POLISHED_ANDESITE_BRICK_STAIRS);
        add(ChiseledBlocks.POLISHED_ANDESITE_BRICK_SLAB, createSlabItemTable(ChiseledBlocks.POLISHED_ANDESITE_BRICK_SLAB));
        dropSelf(ChiseledBlocks.POLISHED_ANDESITE_BRICK_WALL);
        dropSelf(ChiseledBlocks.CUT_POLISHED_ANDESITE_BRICKS);
        dropSelf(ChiseledBlocks.CRACKED_CUT_POLISHED_ANDESITE_BRICKS);
        dropSelf(ChiseledBlocks.CUT_POLISHED_ANDESITE_BRICK_STAIRS);
        add(ChiseledBlocks.CUT_POLISHED_ANDESITE_BRICK_SLAB, createSlabItemTable(ChiseledBlocks.CUT_POLISHED_ANDESITE_BRICK_SLAB));
        dropSelf(ChiseledBlocks.POLISHED_ANDESITE_TILES);
        dropSelf(ChiseledBlocks.CRACKED_POLISHED_ANDESITE_TILES);
        dropSelf(ChiseledBlocks.POLISHED_ANDESITE_TILE_STAIRS);
        add(ChiseledBlocks.POLISHED_ANDESITE_TILE_SLAB, createSlabItemTable(ChiseledBlocks.POLISHED_ANDESITE_TILE_SLAB));
        dropSelf(ChiseledBlocks.POLISHED_ANDESITE_TILE_WALL);

        dropSelf(ChiseledBlocks.CUT_DEEPSLATE_BRICKS);
        dropSelf(ChiseledBlocks.CRACKED_CUT_DEEPSLATE_BRICKS);
        dropSelf(ChiseledBlocks.CUT_DEEPSLATE_BRICK_STAIRS);
        add(ChiseledBlocks.CUT_DEEPSLATE_BRICK_SLAB, createSlabItemTable(ChiseledBlocks.CUT_DEEPSLATE_BRICK_SLAB));

        dropSelf(ChiseledBlocks.CALCITE_STAIRS);
        add(ChiseledBlocks.CALCITE_SLAB, createSlabItemTable(ChiseledBlocks.CALCITE_SLAB));
        dropSelf(ChiseledBlocks.CALCITE_WALL);
        dropSelf(ChiseledBlocks.POLISHED_CALCITE);
        dropSelf(ChiseledBlocks.POLISHED_CALCITE_STAIRS);
        add(ChiseledBlocks.POLISHED_CALCITE_SLAB, createSlabItemTable(ChiseledBlocks.POLISHED_CALCITE_SLAB));
        dropSelf(ChiseledBlocks.POLISHED_CALCITE_WALL);
        dropSelf(ChiseledBlocks.CALCITE_BRICKS);
        dropSelf(ChiseledBlocks.CRACKED_CALCITE_BRICKS);
        dropSelf(ChiseledBlocks.CALCITE_BRICK_STAIRS);
        add(ChiseledBlocks.CALCITE_BRICK_SLAB, createSlabItemTable(ChiseledBlocks.CALCITE_BRICK_SLAB));
        dropSelf(ChiseledBlocks.CALCITE_BRICK_WALL);
        dropSelf(ChiseledBlocks.CUT_CALCITE_BRICKS);
        dropSelf(ChiseledBlocks.CRACKED_CUT_CALCITE_BRICKS);
        dropSelf(ChiseledBlocks.CUT_CALCITE_BRICK_STAIRS);
        add(ChiseledBlocks.CUT_CALCITE_BRICK_SLAB, createSlabItemTable(ChiseledBlocks.CUT_CALCITE_BRICK_SLAB));
        dropSelf(ChiseledBlocks.CALCITE_TILES);
        dropSelf(ChiseledBlocks.CRACKED_CALCITE_TILES);
        dropSelf(ChiseledBlocks.CALCITE_TILE_STAIRS);
        add(ChiseledBlocks.CALCITE_TILE_SLAB, createSlabItemTable(ChiseledBlocks.CALCITE_TILE_SLAB));
        dropSelf(ChiseledBlocks.CALCITE_TILE_WALL);

        dropSelf(ChiseledBlocks.DRIPSTONE_STAIRS);
        add(ChiseledBlocks.DRIPSTONE_SLAB, createSlabItemTable(ChiseledBlocks.DRIPSTONE_SLAB));
        dropSelf(ChiseledBlocks.DRIPSTONE_WALL);
        dropSelf(ChiseledBlocks.POLISHED_DRIPSTONE);
        dropSelf(ChiseledBlocks.POLISHED_DRIPSTONE_STAIRS);
        add(ChiseledBlocks.POLISHED_DRIPSTONE_SLAB, createSlabItemTable(ChiseledBlocks.POLISHED_DRIPSTONE_SLAB));
        dropSelf(ChiseledBlocks.POLISHED_DRIPSTONE_WALL);
        dropSelf(ChiseledBlocks.DRIPSTONE_BRICKS);
        dropSelf(ChiseledBlocks.CRACKED_DRIPSTONE_BRICKS);
        dropSelf(ChiseledBlocks.DRIPSTONE_BRICK_STAIRS);
        add(ChiseledBlocks.DRIPSTONE_BRICK_SLAB, createSlabItemTable(ChiseledBlocks.DRIPSTONE_BRICK_SLAB));
        dropSelf(ChiseledBlocks.DRIPSTONE_BRICK_WALL);
        dropSelf(ChiseledBlocks.CUT_DRIPSTONE_BRICKS);
        dropSelf(ChiseledBlocks.CRACKED_CUT_DRIPSTONE_BRICKS);
        dropSelf(ChiseledBlocks.CUT_DRIPSTONE_BRICK_STAIRS);
        add(ChiseledBlocks.CUT_DRIPSTONE_BRICK_SLAB, createSlabItemTable(ChiseledBlocks.CUT_DRIPSTONE_BRICK_SLAB));
        dropSelf(ChiseledBlocks.DRIPSTONE_TILES);
        dropSelf(ChiseledBlocks.CRACKED_DRIPSTONE_TILES);
        dropSelf(ChiseledBlocks.DRIPSTONE_TILE_STAIRS);
        add(ChiseledBlocks.DRIPSTONE_TILE_SLAB, createSlabItemTable(ChiseledBlocks.DRIPSTONE_TILE_SLAB));
        dropSelf(ChiseledBlocks.DRIPSTONE_TILE_WALL);

        dropSelf(ChiseledBlocks.MIXED_BRICKS);
        dropSelf(ChiseledBlocks.MIXED_BRICK_STAIRS);
        add(ChiseledBlocks.MIXED_BRICK_SLAB, createSlabItemTable(ChiseledBlocks.MIXED_BRICK_SLAB));
        dropSelf(ChiseledBlocks.MIXED_BRICK_WALL);
        dropSelf(ChiseledBlocks.MOSSY_BRICKS);
        dropSelf(ChiseledBlocks.MOSSY_BRICK_STAIRS);
        add(ChiseledBlocks.MOSSY_BRICK_SLAB, createSlabItemTable(ChiseledBlocks.MOSSY_BRICK_SLAB));
        dropSelf(ChiseledBlocks.MOSSY_BRICK_WALL);

        dropSelf(ChiseledBlocks.PACKED_MUD_STAIRS);
        add(ChiseledBlocks.PACKED_MUD_SLAB, createSlabItemTable(ChiseledBlocks.PACKED_MUD_SLAB));
        dropSelf(ChiseledBlocks.PACKED_MUD_WALL);
        dropSelf(ChiseledBlocks.POLISHED_MUD);
        dropSelf(ChiseledBlocks.POLISHED_MUD_STAIRS);
        add(ChiseledBlocks.POLISHED_MUD_SLAB, createSlabItemTable(ChiseledBlocks.POLISHED_MUD_SLAB));
        dropSelf(ChiseledBlocks.POLISHED_MUD_WALL);
        dropSelf(ChiseledBlocks.MOSSY_MUD_BRICKS);
        dropSelf(ChiseledBlocks.MOSSY_MUD_BRICK_STAIRS);
        add(ChiseledBlocks.MOSSY_MUD_BRICK_SLAB, createSlabItemTable(ChiseledBlocks.MOSSY_MUD_BRICK_SLAB));
        dropSelf(ChiseledBlocks.MOSSY_MUD_BRICK_WALL);
        dropSelf(ChiseledBlocks.CUT_MUD_BRICKS);
        dropSelf(ChiseledBlocks.CUT_MUD_BRICK_STAIRS);
        add(ChiseledBlocks.CUT_MUD_BRICK_SLAB, createSlabItemTable(ChiseledBlocks.CUT_MUD_BRICK_SLAB));
        dropSelf(ChiseledBlocks.MOSSY_CUT_MUD_BRICKS);
        dropSelf(ChiseledBlocks.MOSSY_CUT_MUD_BRICK_STAIRS);
        add(ChiseledBlocks.MOSSY_CUT_MUD_BRICK_SLAB, createSlabItemTable(ChiseledBlocks.MOSSY_CUT_MUD_BRICK_SLAB));
        dropSelf(ChiseledBlocks.MUD_TILES);
        dropSelf(ChiseledBlocks.MUD_TILE_STAIRS);
        add(ChiseledBlocks.MUD_TILE_SLAB, createSlabItemTable(ChiseledBlocks.MUD_TILE_SLAB));
        dropSelf(ChiseledBlocks.MUD_TILE_WALL);
        dropSelf(ChiseledBlocks.MOSSY_MUD_TILES);
        dropSelf(ChiseledBlocks.MOSSY_MUD_TILE_STAIRS);
        add(ChiseledBlocks.MOSSY_MUD_TILE_SLAB, createSlabItemTable(ChiseledBlocks.MOSSY_MUD_TILE_SLAB));
        dropSelf(ChiseledBlocks.MOSSY_MUD_TILE_WALL);
    }
}