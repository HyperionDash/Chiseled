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
        dropSelf(ChiseledBlocks.OAK_TRIM);
        dropSelf(ChiseledBlocks.VERTICAL_OAK_PLANKS);
        dropSelf(ChiseledBlocks.VERTICAL_OAK_STAIRS);
        add(ChiseledBlocks.VERTICAL_OAK_SLAB, createSlabItemTable(ChiseledBlocks.VERTICAL_OAK_SLAB));
        dropSelf(ChiseledBlocks.SPRUCE_TRIM);
        dropSelf(ChiseledBlocks.VERTICAL_SPRUCE_PLANKS);
        dropSelf(ChiseledBlocks.VERTICAL_SPRUCE_STAIRS);
        add(ChiseledBlocks.VERTICAL_SPRUCE_SLAB, createSlabItemTable(ChiseledBlocks.VERTICAL_SPRUCE_SLAB));
        dropSelf(ChiseledBlocks.BIRCH_TRIM);
        dropSelf(ChiseledBlocks.VERTICAL_BIRCH_PLANKS);
        dropSelf(ChiseledBlocks.VERTICAL_BIRCH_STAIRS);
        add(ChiseledBlocks.VERTICAL_BIRCH_SLAB, createSlabItemTable(ChiseledBlocks.VERTICAL_BIRCH_SLAB));
        dropSelf(ChiseledBlocks.JUNGLE_TRIM);
        dropSelf(ChiseledBlocks.VERTICAL_JUNGLE_PLANKS);
        dropSelf(ChiseledBlocks.VERTICAL_JUNGLE_STAIRS);
        add(ChiseledBlocks.VERTICAL_JUNGLE_SLAB, createSlabItemTable(ChiseledBlocks.VERTICAL_JUNGLE_SLAB));
        dropSelf(ChiseledBlocks.ACACIA_TRIM);
        dropSelf(ChiseledBlocks.VERTICAL_ACACIA_PLANKS);
        dropSelf(ChiseledBlocks.VERTICAL_ACACIA_STAIRS);
        add(ChiseledBlocks.VERTICAL_ACACIA_SLAB, createSlabItemTable(ChiseledBlocks.VERTICAL_ACACIA_SLAB));
        dropSelf(ChiseledBlocks.DARK_OAK_TRIM);
        dropSelf(ChiseledBlocks.VERTICAL_DARK_OAK_PLANKS);
        dropSelf(ChiseledBlocks.VERTICAL_DARK_OAK_STAIRS);
        add(ChiseledBlocks.VERTICAL_DARK_OAK_SLAB, createSlabItemTable(ChiseledBlocks.VERTICAL_DARK_OAK_SLAB));
        dropSelf(ChiseledBlocks.MANGROVE_TRIM);
        dropSelf(ChiseledBlocks.VERTICAL_MANGROVE_PLANKS);
        dropSelf(ChiseledBlocks.VERTICAL_MANGROVE_STAIRS);
        add(ChiseledBlocks.VERTICAL_MANGROVE_SLAB, createSlabItemTable(ChiseledBlocks.VERTICAL_MANGROVE_SLAB));
        dropSelf(ChiseledBlocks.CHERRY_TRIM);
        dropSelf(ChiseledBlocks.VERTICAL_CHERRY_PLANKS);
        dropSelf(ChiseledBlocks.VERTICAL_CHERRY_STAIRS);
        add(ChiseledBlocks.VERTICAL_CHERRY_SLAB, createSlabItemTable(ChiseledBlocks.VERTICAL_CHERRY_SLAB));
        dropSelf(ChiseledBlocks.PALE_OAK_TRIM);
        dropSelf(ChiseledBlocks.VERTICAL_PALE_OAK_PLANKS);
        dropSelf(ChiseledBlocks.VERTICAL_PALE_OAK_STAIRS);
        add(ChiseledBlocks.VERTICAL_PALE_OAK_SLAB, createSlabItemTable(ChiseledBlocks.VERTICAL_PALE_OAK_SLAB));
        dropSelf(ChiseledBlocks.BAMBOO_TRIM);
        dropSelf(ChiseledBlocks.VERTICAL_BAMBOO_PLANKS);
        dropSelf(ChiseledBlocks.VERTICAL_BAMBOO_STAIRS);
        add(ChiseledBlocks.VERTICAL_BAMBOO_SLAB, createSlabItemTable(ChiseledBlocks.VERTICAL_BAMBOO_SLAB));
        dropSelf(ChiseledBlocks.CRIMSON_TRIM);
        dropSelf(ChiseledBlocks.VERTICAL_CRIMSON_PLANKS);
        dropSelf(ChiseledBlocks.VERTICAL_CRIMSON_STAIRS);
        add(ChiseledBlocks.VERTICAL_CRIMSON_SLAB, createSlabItemTable(ChiseledBlocks.VERTICAL_CRIMSON_SLAB));
        dropSelf(ChiseledBlocks.WARPED_TRIM);
        dropSelf(ChiseledBlocks.VERTICAL_WARPED_PLANKS);
        dropSelf(ChiseledBlocks.VERTICAL_WARPED_STAIRS);
        add(ChiseledBlocks.VERTICAL_WARPED_SLAB, createSlabItemTable(ChiseledBlocks.VERTICAL_WARPED_SLAB));

        dropSelf(ChiseledBlocks.STONE_WALL);
        dropSelf(ChiseledBlocks.POLISHED_STONE);
        dropSelf(ChiseledBlocks.POLISHED_STONE_STAIRS);
        add(ChiseledBlocks.POLISHED_STONE_SLAB, createSlabItemTable(ChiseledBlocks.POLISHED_STONE_SLAB));
        dropSelf(ChiseledBlocks.POLISHED_STONE_WALL);
        dropSelf(ChiseledBlocks.SMOOTH_STONE_STAIRS);
        dropSelf(ChiseledBlocks.MOSSY_CHISELED_STONE_BRICKS);
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
    }
}