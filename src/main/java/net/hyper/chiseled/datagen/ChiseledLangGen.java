package net.hyper.chiseled.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.hyper.chiseled.registry.ChiseledBlocks;
import net.minecraft.core.HolderLookup;
import java.util.concurrent.CompletableFuture;

public class ChiseledLangGen extends FabricLanguageProvider {
    public ChiseledLangGen(FabricPackOutput dataOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(dataOutput, registryLookup);
    }

    public void generateTranslations(HolderLookup.Provider registryLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add(ChiseledBlocks.OAK_TRIM, "Oak Trim");
        translationBuilder.add(ChiseledBlocks.VERTICAL_OAK_PLANKS, "Vertical Oak Planks");
        translationBuilder.add(ChiseledBlocks.VERTICAL_OAK_STAIRS, "Vertical Oak Stairs");
        translationBuilder.add(ChiseledBlocks.VERTICAL_OAK_SLAB, "Vertical Oak Slab");
        translationBuilder.add(ChiseledBlocks.SPRUCE_TRIM, "Spruce Trim");
        translationBuilder.add(ChiseledBlocks.VERTICAL_SPRUCE_PLANKS, "Vertical Spruce Planks");
        translationBuilder.add(ChiseledBlocks.VERTICAL_SPRUCE_STAIRS, "Vertical Spruce Stairs");
        translationBuilder.add(ChiseledBlocks.VERTICAL_SPRUCE_SLAB, "Vertical Spruce Slab");
        translationBuilder.add(ChiseledBlocks.BIRCH_TRIM, "Birch Trim");
        translationBuilder.add(ChiseledBlocks.VERTICAL_BIRCH_PLANKS, "Vertical Birch Planks");
        translationBuilder.add(ChiseledBlocks.VERTICAL_BIRCH_STAIRS, "Vertical Birch Stairs");
        translationBuilder.add(ChiseledBlocks.VERTICAL_BIRCH_SLAB, "Vertical Birch Slab");
        translationBuilder.add(ChiseledBlocks.JUNGLE_TRIM, "Jungle Trim");
        translationBuilder.add(ChiseledBlocks.VERTICAL_JUNGLE_PLANKS, "Vertical Jungle Planks");
        translationBuilder.add(ChiseledBlocks.VERTICAL_JUNGLE_STAIRS, "Vertical Jungle Stairs");
        translationBuilder.add(ChiseledBlocks.VERTICAL_JUNGLE_SLAB, "Vertical Jungle Slab");
        translationBuilder.add(ChiseledBlocks.ACACIA_TRIM, "Acacia Trim");
        translationBuilder.add(ChiseledBlocks.VERTICAL_ACACIA_PLANKS, "Vertical Acacia Planks");
        translationBuilder.add(ChiseledBlocks.VERTICAL_ACACIA_STAIRS, "Vertical Acacia Stairs");
        translationBuilder.add(ChiseledBlocks.VERTICAL_ACACIA_SLAB, "Vertical Acacia Slab");
        translationBuilder.add(ChiseledBlocks.DARK_OAK_TRIM, "Dark Oak Trim");
        translationBuilder.add(ChiseledBlocks.VERTICAL_DARK_OAK_PLANKS, "Vertical Dark Oak Planks");
        translationBuilder.add(ChiseledBlocks.VERTICAL_DARK_OAK_STAIRS, "Vertical Dark Oak Stairs");
        translationBuilder.add(ChiseledBlocks.VERTICAL_DARK_OAK_SLAB, "Vertical Dark Oak Slab");
        translationBuilder.add(ChiseledBlocks.MANGROVE_TRIM, "Mangrove Trim");
        translationBuilder.add(ChiseledBlocks.VERTICAL_MANGROVE_PLANKS, "Vertical Mangrove Planks");
        translationBuilder.add(ChiseledBlocks.VERTICAL_MANGROVE_STAIRS, "Vertical Mangrove Stairs");
        translationBuilder.add(ChiseledBlocks.VERTICAL_MANGROVE_SLAB, "Vertical Mangrove Slab");
        translationBuilder.add(ChiseledBlocks.CHERRY_TRIM, "Cherry Trim");
        translationBuilder.add(ChiseledBlocks.VERTICAL_CHERRY_PLANKS, "Vertical Cherry Planks");
        translationBuilder.add(ChiseledBlocks.VERTICAL_CHERRY_STAIRS, "Vertical Cherry Stairs");
        translationBuilder.add(ChiseledBlocks.VERTICAL_CHERRY_SLAB, "Vertical Cherry Slab");
        translationBuilder.add(ChiseledBlocks.PALE_OAK_TRIM, "Pale Oak Trim");
        translationBuilder.add(ChiseledBlocks.VERTICAL_PALE_OAK_PLANKS, "Vertical Pale Oak Planks");
        translationBuilder.add(ChiseledBlocks.VERTICAL_PALE_OAK_STAIRS, "Vertical Pale Oak Stairs");
        translationBuilder.add(ChiseledBlocks.VERTICAL_PALE_OAK_SLAB, "Vertical Pale Oak Slab");
        translationBuilder.add(ChiseledBlocks.BAMBOO_TRIM, "Bamboo Trim");
        translationBuilder.add(ChiseledBlocks.VERTICAL_BAMBOO_PLANKS, "Vertical Bamboo Planks");
        translationBuilder.add(ChiseledBlocks.VERTICAL_BAMBOO_STAIRS, "Vertical Bamboo Stairs");
        translationBuilder.add(ChiseledBlocks.VERTICAL_BAMBOO_SLAB, "Vertical Bamboo Slab");
        translationBuilder.add(ChiseledBlocks.CRIMSON_TRIM, "Crimson Trim");
        translationBuilder.add(ChiseledBlocks.VERTICAL_CRIMSON_PLANKS, "Vertical Crimson Planks");
        translationBuilder.add(ChiseledBlocks.VERTICAL_CRIMSON_STAIRS, "Vertical Crimson Stairs");
        translationBuilder.add(ChiseledBlocks.VERTICAL_CRIMSON_SLAB, "Vertical Crimson Slab");
        translationBuilder.add(ChiseledBlocks.WARPED_TRIM, "Warped Trim");
        translationBuilder.add(ChiseledBlocks.VERTICAL_WARPED_PLANKS, "Vertical Warped Planks");
        translationBuilder.add(ChiseledBlocks.VERTICAL_WARPED_STAIRS, "Vertical Warped Stairs");
        translationBuilder.add(ChiseledBlocks.VERTICAL_WARPED_SLAB, "Vertical Warped Slab");

        translationBuilder.add(ChiseledBlocks.STONE_WALL, "Stone Wall");
        translationBuilder.add(ChiseledBlocks.POLISHED_STONE, "Polished Stone");
        translationBuilder.add(ChiseledBlocks.POLISHED_STONE_STAIRS, "Polished Stone Stairs");
        translationBuilder.add(ChiseledBlocks.POLISHED_STONE_SLAB, "Polished Stone Slab");
        translationBuilder.add(ChiseledBlocks.POLISHED_STONE_WALL, "Polished Stone Wall");
        translationBuilder.add(ChiseledBlocks.SMOOTH_STONE_STAIRS, "Smooth Stone Stairs");
        translationBuilder.add(ChiseledBlocks.MOSSY_CHISELED_STONE_BRICKS, "Mossy Chiseled Stone Bricks");
        translationBuilder.add(ChiseledBlocks.CUT_STONE_BRICKS, "Cut Stone Bricks");
        translationBuilder.add(ChiseledBlocks.CRACKED_CUT_STONE_BRICKS, "Cracked Cut Stone Bricks");
        translationBuilder.add(ChiseledBlocks.CUT_STONE_BRICK_STAIRS, "Cut Stone Brick Stairs");
        translationBuilder.add(ChiseledBlocks.CUT_STONE_BRICK_SLAB, "Cut Stone Brick Slab");
        translationBuilder.add(ChiseledBlocks.MOSSY_CUT_STONE_BRICKS, "Mossy Cut Stone Bricks");
        translationBuilder.add(ChiseledBlocks.MOSSY_CUT_STONE_BRICK_STAIRS, "Mossy Cut Stone Brick Stairs");
        translationBuilder.add(ChiseledBlocks.MOSSY_CUT_STONE_BRICK_SLAB, "Mossy Cut Stone Brick Slab");
        translationBuilder.add(ChiseledBlocks.STONE_TILES, "Stone Tiles");
        translationBuilder.add(ChiseledBlocks.CRACKED_STONE_TILES, "Cracked Stone Tiles");
        translationBuilder.add(ChiseledBlocks.STONE_TILE_STAIRS, "Stone Tile Stairs");
        translationBuilder.add(ChiseledBlocks.STONE_TILE_SLAB, "Stone Tile Slab");
        translationBuilder.add(ChiseledBlocks.STONE_TILE_WALL, "Stone Tile Wall");
        translationBuilder.add(ChiseledBlocks.MOSSY_STONE_TILES, "Mossy Stone Tiles");
        translationBuilder.add(ChiseledBlocks.MOSSY_STONE_TILE_STAIRS, "Mossy Stone Tile Stairs");
        translationBuilder.add(ChiseledBlocks.MOSSY_STONE_TILE_SLAB, "Mossy Stone Tile Slab");
        translationBuilder.add(ChiseledBlocks.MOSSY_STONE_TILE_WALL, "Mossy Stone Tile Wall");

        translationBuilder.add("itemgroup.chiseled.chiseled", "Chiseled");
        translationBuilder.add("text.chiseled.asset_overrides", "Asset Overrides");
        translationBuilder.add("text.chiseled.data_overrides", "Data Overrides");
    }
}