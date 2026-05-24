package net.hyper.chiseled.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.hyper.chiseled.registry.ChiseledBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Blocks;

import java.util.concurrent.CompletableFuture;

public class ChiseledRecipeGen extends FabricRecipeProvider {
    public ChiseledRecipeGen(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeProvider createRecipeProvider(HolderLookup.Provider wrapperLookup, RecipeOutput recipeExporter) {
        return new RecipeProvider(wrapperLookup, recipeExporter) {
            @Override
            public void buildRecipes() {
                wall(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.STONE_WALL, Blocks.STONE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.STONE_WALL, Blocks.STONE);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_STONE,4)
                        .pattern("##")
                        .pattern("##")
                        .define('#', Blocks.STONE)
                        .unlockedBy(getHasName(ChiseledBlocks.POLISHED_STONE), has(Blocks.STONE))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_STONE, Blocks.STONE);
                stairBuilder(ChiseledBlocks.POLISHED_STONE_STAIRS, Ingredient.of(ChiseledBlocks.POLISHED_STONE))
                        .unlockedBy(getHasName(ChiseledBlocks.POLISHED_STONE_STAIRS), has(ChiseledBlocks.POLISHED_STONE))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_STONE_STAIRS, Blocks.STONE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_STONE_STAIRS, ChiseledBlocks.POLISHED_STONE);
                slab(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_STONE_SLAB, ChiseledBlocks.POLISHED_STONE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_STONE_SLAB, Blocks.STONE,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_STONE_SLAB, ChiseledBlocks.POLISHED_STONE,2);
                wall(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_STONE_WALL, ChiseledBlocks.POLISHED_STONE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_STONE_WALL, Blocks.STONE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_STONE_WALL, ChiseledBlocks.POLISHED_STONE);
                stairBuilder(ChiseledBlocks.SMOOTH_STONE_STAIRS, Ingredient.of(Blocks.SMOOTH_STONE))
                        .unlockedBy(getHasName(ChiseledBlocks.SMOOTH_STONE_STAIRS), has(Blocks.SMOOTH_STONE))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.SMOOTH_STONE_STAIRS, Blocks.SMOOTH_STONE);
                shaped(RecipeCategory.BUILDING_BLOCKS, Blocks.STONE_BRICKS,4)
                        .pattern("##")
                        .pattern("##")
                        .define('#', ChiseledBlocks.POLISHED_STONE)
                        .unlockedBy(getHasName(Blocks.STONE_BRICKS), has(ChiseledBlocks.POLISHED_STONE))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, Blocks.STONE_BRICKS, ChiseledBlocks.POLISHED_STONE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, Blocks.STONE_BRICK_STAIRS, ChiseledBlocks.POLISHED_STONE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, Blocks.STONE_BRICK_SLAB, ChiseledBlocks.POLISHED_STONE,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, Blocks.STONE_BRICK_WALL, ChiseledBlocks.POLISHED_STONE);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_STONE_BRICKS)
                        .pattern("#")
                        .pattern("#")
                        .define('#', ChiseledBlocks.POLISHED_STONE_SLAB)
                        .unlockedBy(getHasName(ChiseledBlocks.CUT_STONE_BRICKS), has(ChiseledBlocks.POLISHED_STONE))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_STONE_BRICKS, Blocks.STONE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_STONE_BRICKS, ChiseledBlocks.POLISHED_STONE);
                smeltingResultFromBase(ChiseledBlocks.CRACKED_CUT_STONE_BRICKS, ChiseledBlocks.CUT_STONE_BRICKS);
                stairBuilder(ChiseledBlocks.CUT_STONE_BRICK_STAIRS, Ingredient.of(ChiseledBlocks.CUT_STONE_BRICKS))
                        .unlockedBy(getHasName(ChiseledBlocks.CUT_STONE_BRICK_STAIRS), has(ChiseledBlocks.CUT_STONE_BRICKS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_STONE_BRICK_STAIRS, Blocks.STONE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_STONE_BRICK_STAIRS, ChiseledBlocks.POLISHED_STONE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_STONE_BRICK_STAIRS, ChiseledBlocks.CUT_STONE_BRICKS);
                slab(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_STONE_BRICK_SLAB, ChiseledBlocks.CUT_STONE_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_STONE_BRICK_SLAB, Blocks.STONE,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_STONE_BRICK_SLAB, ChiseledBlocks.POLISHED_STONE,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_STONE_BRICK_SLAB, ChiseledBlocks.CUT_STONE_BRICKS,2);
                shapeless(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MOSSY_CUT_STONE_BRICKS)
                        .requires(ChiseledBlocks.CUT_STONE_BRICKS)
                        .requires(Blocks.MOSS_BLOCK)
                        .unlockedBy(getHasName(ChiseledBlocks.MOSSY_CUT_STONE_BRICKS), has(ChiseledBlocks.CUT_STONE_BRICKS))
                        .save(output, "mossy_cut_stone_bricks_from_moss");
                shapeless(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MOSSY_CUT_STONE_BRICKS)
                        .requires(ChiseledBlocks.CUT_STONE_BRICKS)
                        .requires(Blocks.VINE)
                        .unlockedBy(getHasName(ChiseledBlocks.MOSSY_CUT_STONE_BRICKS), has(ChiseledBlocks.CUT_STONE_BRICKS))
                        .save(output, "mossy_cut_stone_bricks_from_vine");
                stairBuilder(ChiseledBlocks.MOSSY_CUT_STONE_BRICK_STAIRS, Ingredient.of(ChiseledBlocks.MOSSY_CUT_STONE_BRICKS))
                        .unlockedBy(getHasName(ChiseledBlocks.MOSSY_CUT_STONE_BRICK_STAIRS), has(ChiseledBlocks.MOSSY_CUT_STONE_BRICKS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MOSSY_CUT_STONE_BRICK_STAIRS, ChiseledBlocks.MOSSY_CUT_STONE_BRICKS);
                slab(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MOSSY_CUT_STONE_BRICK_SLAB, ChiseledBlocks.MOSSY_CUT_STONE_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MOSSY_CUT_STONE_BRICK_SLAB, ChiseledBlocks.MOSSY_CUT_STONE_BRICKS,2);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.STONE_TILES,4)
                        .pattern("##")
                        .pattern("##")
                        .define('#', Blocks.STONE_BRICKS)
                        .unlockedBy(getHasName(ChiseledBlocks.STONE_TILES), has(Blocks.STONE_BRICKS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.STONE_TILES, Blocks.STONE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.STONE_TILES, ChiseledBlocks.POLISHED_STONE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.STONE_TILES, Blocks.STONE_BRICKS);
                smeltingResultFromBase(ChiseledBlocks.CRACKED_STONE_TILES, ChiseledBlocks.STONE_TILES);
                stairBuilder(ChiseledBlocks.STONE_TILE_STAIRS, Ingredient.of(ChiseledBlocks.STONE_TILES))
                        .unlockedBy(getHasName(ChiseledBlocks.STONE_TILE_STAIRS), has(ChiseledBlocks.STONE_TILES))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.STONE_TILE_STAIRS, Blocks.STONE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.STONE_TILE_STAIRS, ChiseledBlocks.POLISHED_STONE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.STONE_TILE_STAIRS, Blocks.STONE_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.STONE_TILE_STAIRS, ChiseledBlocks.STONE_TILES);
                slab(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.STONE_TILE_SLAB, ChiseledBlocks.STONE_TILES);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.STONE_TILE_SLAB, Blocks.STONE,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.STONE_TILE_SLAB, ChiseledBlocks.POLISHED_STONE,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.STONE_TILE_SLAB, Blocks.STONE_BRICKS,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.STONE_TILE_SLAB, ChiseledBlocks.STONE_TILES,2);
                wall(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.STONE_TILE_WALL, ChiseledBlocks.STONE_TILES);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.STONE_TILE_WALL, Blocks.STONE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.STONE_TILE_WALL, ChiseledBlocks.POLISHED_STONE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.STONE_TILE_WALL, Blocks.STONE_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.STONE_TILE_WALL, ChiseledBlocks.STONE_TILES);
                shapeless(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MOSSY_STONE_TILES)
                        .requires(ChiseledBlocks.STONE_TILES)
                        .requires(Blocks.MOSS_BLOCK)
                        .unlockedBy(getHasName(ChiseledBlocks.MOSSY_STONE_TILES), has(ChiseledBlocks.STONE_TILES))
                        .save(output, "mossy_stone_tiles_from_moss");
                shapeless(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MOSSY_STONE_TILES)
                        .requires(ChiseledBlocks.STONE_TILES)
                        .requires(Blocks.VINE)
                        .unlockedBy(getHasName(ChiseledBlocks.MOSSY_STONE_TILES), has(ChiseledBlocks.STONE_TILES))
                        .save(output, "mossy_stone_tiles_from_vine");
                stairBuilder(ChiseledBlocks.MOSSY_STONE_TILE_STAIRS, Ingredient.of(ChiseledBlocks.MOSSY_STONE_TILES))
                        .unlockedBy(getHasName(ChiseledBlocks.MOSSY_STONE_TILE_STAIRS), has(ChiseledBlocks.MOSSY_STONE_TILES))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MOSSY_STONE_TILE_STAIRS, ChiseledBlocks.MOSSY_STONE_TILES);
                slab(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MOSSY_STONE_TILE_SLAB, ChiseledBlocks.MOSSY_STONE_TILES);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MOSSY_STONE_TILE_SLAB, ChiseledBlocks.MOSSY_STONE_TILES,2);
                wall(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MOSSY_STONE_TILE_WALL, ChiseledBlocks.MOSSY_STONE_TILES);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MOSSY_STONE_TILE_WALL, ChiseledBlocks.MOSSY_STONE_TILES);

                wall(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_GRANITE_WALL, Blocks.POLISHED_GRANITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_GRANITE_WALL, Blocks.GRANITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_GRANITE_WALL, Blocks.POLISHED_GRANITE);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_GRANITE_BRICKS,4)
                        .pattern("##")
                        .pattern("##")
                        .define('#', Blocks.POLISHED_GRANITE)
                        .unlockedBy(getHasName(ChiseledBlocks.POLISHED_GRANITE_BRICKS), has(Blocks.POLISHED_GRANITE))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_GRANITE_BRICKS, Blocks.GRANITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_GRANITE_BRICKS, Blocks.POLISHED_GRANITE);
                smeltingResultFromBase(ChiseledBlocks.CRACKED_POLISHED_GRANITE_BRICKS, ChiseledBlocks.POLISHED_GRANITE_BRICKS);
                stairBuilder(ChiseledBlocks.POLISHED_GRANITE_BRICK_STAIRS, Ingredient.of(ChiseledBlocks.POLISHED_GRANITE_BRICKS))
                        .unlockedBy(getHasName(ChiseledBlocks.POLISHED_GRANITE_BRICK_STAIRS), has(ChiseledBlocks.POLISHED_GRANITE_BRICKS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_GRANITE_BRICK_STAIRS, Blocks.GRANITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_GRANITE_BRICK_STAIRS, Blocks.POLISHED_GRANITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_GRANITE_BRICK_STAIRS, ChiseledBlocks.POLISHED_GRANITE_BRICKS);
                slab(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_GRANITE_BRICK_SLAB, ChiseledBlocks.POLISHED_GRANITE_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_GRANITE_BRICK_SLAB, Blocks.GRANITE,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_GRANITE_BRICK_SLAB, Blocks.POLISHED_GRANITE,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_GRANITE_BRICK_SLAB, ChiseledBlocks.POLISHED_GRANITE_BRICKS,2);
                wall(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_GRANITE_BRICK_WALL, ChiseledBlocks.POLISHED_GRANITE_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_GRANITE_BRICK_WALL, Blocks.GRANITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_GRANITE_BRICK_WALL, Blocks.POLISHED_GRANITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_GRANITE_BRICK_WALL, ChiseledBlocks.POLISHED_GRANITE_BRICKS);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_POLISHED_GRANITE_BRICKS)
                        .pattern("#")
                        .pattern("#")
                        .define('#', Blocks.POLISHED_GRANITE_SLAB)
                        .unlockedBy(getHasName(ChiseledBlocks.CUT_POLISHED_GRANITE_BRICKS), has(Blocks.POLISHED_GRANITE))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_POLISHED_GRANITE_BRICKS, Blocks.GRANITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_POLISHED_GRANITE_BRICKS, Blocks.POLISHED_GRANITE);
                smeltingResultFromBase(ChiseledBlocks.CRACKED_CUT_POLISHED_GRANITE_BRICKS, ChiseledBlocks.CUT_POLISHED_GRANITE_BRICKS);
                stairBuilder(ChiseledBlocks.CUT_POLISHED_GRANITE_BRICK_STAIRS, Ingredient.of(ChiseledBlocks.CUT_POLISHED_GRANITE_BRICKS))
                        .unlockedBy(getHasName(ChiseledBlocks.CUT_POLISHED_GRANITE_BRICK_STAIRS), has(ChiseledBlocks.CUT_POLISHED_GRANITE_BRICKS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_POLISHED_GRANITE_BRICK_STAIRS, Blocks.GRANITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_POLISHED_GRANITE_BRICK_STAIRS, Blocks.POLISHED_GRANITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_POLISHED_GRANITE_BRICK_STAIRS, ChiseledBlocks.CUT_POLISHED_GRANITE_BRICKS);
                slab(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_POLISHED_GRANITE_BRICK_SLAB, ChiseledBlocks.CUT_POLISHED_GRANITE_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_POLISHED_GRANITE_BRICK_SLAB, Blocks.GRANITE,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_POLISHED_GRANITE_BRICK_SLAB, Blocks.POLISHED_GRANITE,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_POLISHED_GRANITE_BRICK_SLAB, ChiseledBlocks.CUT_POLISHED_GRANITE_BRICKS,2);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_GRANITE_TILES,4)
                        .pattern("##")
                        .pattern("##")
                        .define('#', ChiseledBlocks.POLISHED_GRANITE_BRICKS)
                        .unlockedBy(getHasName(ChiseledBlocks.POLISHED_GRANITE_TILES), has(ChiseledBlocks.POLISHED_GRANITE_BRICKS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_GRANITE_TILES, Blocks.GRANITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_GRANITE_TILES, Blocks.POLISHED_GRANITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_GRANITE_TILES, ChiseledBlocks.POLISHED_GRANITE_BRICKS);
                smeltingResultFromBase(ChiseledBlocks.CRACKED_POLISHED_GRANITE_TILES, ChiseledBlocks.POLISHED_GRANITE_TILES);
                stairBuilder(ChiseledBlocks.POLISHED_GRANITE_TILE_STAIRS, Ingredient.of(ChiseledBlocks.POLISHED_GRANITE_TILES))
                        .unlockedBy(getHasName(ChiseledBlocks.POLISHED_GRANITE_TILE_STAIRS), has(ChiseledBlocks.POLISHED_GRANITE_TILES))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_GRANITE_TILE_STAIRS, Blocks.GRANITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_GRANITE_TILE_STAIRS, Blocks.POLISHED_GRANITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_GRANITE_TILE_STAIRS, ChiseledBlocks.POLISHED_GRANITE_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_GRANITE_TILE_STAIRS, ChiseledBlocks.POLISHED_GRANITE_TILES);
                slab(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_GRANITE_TILE_SLAB, ChiseledBlocks.POLISHED_GRANITE_TILES);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_GRANITE_TILE_SLAB, Blocks.GRANITE,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_GRANITE_TILE_SLAB, Blocks.POLISHED_GRANITE,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_GRANITE_TILE_SLAB, ChiseledBlocks.POLISHED_GRANITE_BRICKS, 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_GRANITE_TILE_SLAB, ChiseledBlocks.POLISHED_GRANITE_TILES,2);
                wall(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_GRANITE_TILE_WALL, ChiseledBlocks.POLISHED_GRANITE_TILES);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_GRANITE_TILE_WALL, Blocks.GRANITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_GRANITE_TILE_WALL, Blocks.POLISHED_GRANITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_GRANITE_TILE_WALL, ChiseledBlocks.POLISHED_GRANITE_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_GRANITE_TILE_WALL, ChiseledBlocks.POLISHED_GRANITE_TILES);

                wall(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_DIORITE_WALL, Blocks.POLISHED_DIORITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_DIORITE_WALL, Blocks.DIORITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_DIORITE_WALL, Blocks.POLISHED_DIORITE);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_DIORITE_BRICKS,4)
                        .pattern("##")
                        .pattern("##")
                        .define('#', Blocks.POLISHED_DIORITE)
                        .unlockedBy(getHasName(ChiseledBlocks.POLISHED_DIORITE_BRICKS), has(Blocks.POLISHED_DIORITE))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_DIORITE_BRICKS, Blocks.DIORITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_DIORITE_BRICKS, Blocks.POLISHED_DIORITE);
                smeltingResultFromBase(ChiseledBlocks.CRACKED_POLISHED_DIORITE_BRICKS, ChiseledBlocks.POLISHED_DIORITE_BRICKS);
                stairBuilder(ChiseledBlocks.POLISHED_DIORITE_BRICK_STAIRS, Ingredient.of(ChiseledBlocks.POLISHED_DIORITE_BRICKS))
                        .unlockedBy(getHasName(ChiseledBlocks.POLISHED_DIORITE_BRICK_STAIRS), has(ChiseledBlocks.POLISHED_DIORITE_BRICKS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_DIORITE_BRICK_STAIRS, Blocks.DIORITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_DIORITE_BRICK_STAIRS, Blocks.POLISHED_DIORITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_DIORITE_BRICK_STAIRS, ChiseledBlocks.POLISHED_DIORITE_BRICKS);
                slab(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_DIORITE_BRICK_SLAB, ChiseledBlocks.POLISHED_DIORITE_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_DIORITE_BRICK_SLAB, Blocks.DIORITE,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_DIORITE_BRICK_SLAB, Blocks.POLISHED_DIORITE,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_DIORITE_BRICK_SLAB, ChiseledBlocks.POLISHED_DIORITE_BRICKS,2);
                wall(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_DIORITE_BRICK_WALL, ChiseledBlocks.POLISHED_DIORITE_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_DIORITE_BRICK_WALL, Blocks.DIORITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_DIORITE_BRICK_WALL, Blocks.POLISHED_DIORITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_DIORITE_BRICK_WALL, ChiseledBlocks.POLISHED_DIORITE_BRICKS);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_POLISHED_DIORITE_BRICKS)
                        .pattern("#")
                        .pattern("#")
                        .define('#', Blocks.POLISHED_DIORITE_SLAB)
                        .unlockedBy(getHasName(ChiseledBlocks.CUT_POLISHED_DIORITE_BRICKS), has(Blocks.POLISHED_DIORITE))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_POLISHED_DIORITE_BRICKS, Blocks.DIORITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_POLISHED_DIORITE_BRICKS, Blocks.POLISHED_DIORITE);
                smeltingResultFromBase(ChiseledBlocks.CRACKED_CUT_POLISHED_DIORITE_BRICKS, ChiseledBlocks.CUT_POLISHED_DIORITE_BRICKS);
                stairBuilder(ChiseledBlocks.CUT_POLISHED_DIORITE_BRICK_STAIRS, Ingredient.of(ChiseledBlocks.CUT_POLISHED_DIORITE_BRICKS))
                        .unlockedBy(getHasName(ChiseledBlocks.CUT_POLISHED_DIORITE_BRICK_STAIRS), has(ChiseledBlocks.CUT_POLISHED_DIORITE_BRICKS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_POLISHED_DIORITE_BRICK_STAIRS, Blocks.DIORITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_POLISHED_DIORITE_BRICK_STAIRS, Blocks.POLISHED_DIORITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_POLISHED_DIORITE_BRICK_STAIRS, ChiseledBlocks.CUT_POLISHED_DIORITE_BRICKS);
                slab(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_POLISHED_DIORITE_BRICK_SLAB, ChiseledBlocks.CUT_POLISHED_DIORITE_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_POLISHED_DIORITE_BRICK_SLAB, Blocks.DIORITE,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_POLISHED_DIORITE_BRICK_SLAB, Blocks.POLISHED_DIORITE,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_POLISHED_DIORITE_BRICK_SLAB, ChiseledBlocks.CUT_POLISHED_DIORITE_BRICKS,2);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_DIORITE_TILES,4)
                        .pattern("##")
                        .pattern("##")
                        .define('#', ChiseledBlocks.POLISHED_DIORITE_BRICKS)
                        .unlockedBy(getHasName(ChiseledBlocks.POLISHED_DIORITE_TILES), has(ChiseledBlocks.POLISHED_DIORITE_BRICKS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_DIORITE_TILES, Blocks.DIORITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_DIORITE_TILES, Blocks.POLISHED_DIORITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_DIORITE_TILES, ChiseledBlocks.POLISHED_DIORITE_BRICKS);
                smeltingResultFromBase(ChiseledBlocks.CRACKED_POLISHED_DIORITE_TILES, ChiseledBlocks.POLISHED_DIORITE_TILES);
                stairBuilder(ChiseledBlocks.POLISHED_DIORITE_TILE_STAIRS, Ingredient.of(ChiseledBlocks.POLISHED_DIORITE_TILES))
                        .unlockedBy(getHasName(ChiseledBlocks.POLISHED_DIORITE_TILE_STAIRS), has(ChiseledBlocks.POLISHED_DIORITE_TILES))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_DIORITE_TILE_STAIRS, Blocks.DIORITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_DIORITE_TILE_STAIRS, Blocks.POLISHED_DIORITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_DIORITE_TILE_STAIRS, ChiseledBlocks.POLISHED_DIORITE_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_DIORITE_TILE_STAIRS, ChiseledBlocks.POLISHED_DIORITE_TILES);
                slab(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_DIORITE_TILE_SLAB, ChiseledBlocks.POLISHED_DIORITE_TILES);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_DIORITE_TILE_SLAB, Blocks.DIORITE,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_DIORITE_TILE_SLAB, Blocks.POLISHED_DIORITE,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_DIORITE_TILE_SLAB, ChiseledBlocks.POLISHED_DIORITE_BRICKS, 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_DIORITE_TILE_SLAB, ChiseledBlocks.POLISHED_DIORITE_TILES,2);
                wall(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_DIORITE_TILE_WALL, ChiseledBlocks.POLISHED_DIORITE_TILES);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_DIORITE_TILE_WALL, Blocks.DIORITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_DIORITE_TILE_WALL, Blocks.POLISHED_DIORITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_DIORITE_TILE_WALL, ChiseledBlocks.POLISHED_DIORITE_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_DIORITE_TILE_WALL, ChiseledBlocks.POLISHED_DIORITE_TILES);

                wall(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_ANDESITE_WALL, Blocks.POLISHED_ANDESITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_ANDESITE_WALL, Blocks.ANDESITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_ANDESITE_WALL, Blocks.POLISHED_ANDESITE);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_ANDESITE_BRICKS,4)
                        .pattern("##")
                        .pattern("##")
                        .define('#', Blocks.POLISHED_ANDESITE)
                        .unlockedBy(getHasName(ChiseledBlocks.POLISHED_ANDESITE_BRICKS), has(Blocks.POLISHED_ANDESITE))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_ANDESITE_BRICKS, Blocks.ANDESITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_ANDESITE_BRICKS, Blocks.POLISHED_ANDESITE);
                smeltingResultFromBase(ChiseledBlocks.CRACKED_POLISHED_ANDESITE_BRICKS, ChiseledBlocks.POLISHED_ANDESITE_BRICKS);
                stairBuilder(ChiseledBlocks.POLISHED_ANDESITE_BRICK_STAIRS, Ingredient.of(ChiseledBlocks.POLISHED_ANDESITE_BRICKS))
                        .unlockedBy(getHasName(ChiseledBlocks.POLISHED_ANDESITE_BRICK_STAIRS), has(ChiseledBlocks.POLISHED_ANDESITE_BRICKS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_ANDESITE_BRICK_STAIRS, Blocks.ANDESITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_ANDESITE_BRICK_STAIRS, Blocks.POLISHED_ANDESITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_ANDESITE_BRICK_STAIRS, ChiseledBlocks.POLISHED_ANDESITE_BRICKS);
                slab(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_ANDESITE_BRICK_SLAB, ChiseledBlocks.POLISHED_ANDESITE_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_ANDESITE_BRICK_SLAB, Blocks.ANDESITE,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_ANDESITE_BRICK_SLAB, Blocks.POLISHED_ANDESITE,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_ANDESITE_BRICK_SLAB, ChiseledBlocks.POLISHED_ANDESITE_BRICKS,2);
                wall(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_ANDESITE_BRICK_WALL, ChiseledBlocks.POLISHED_ANDESITE_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_ANDESITE_BRICK_WALL, Blocks.ANDESITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_ANDESITE_BRICK_WALL, Blocks.POLISHED_ANDESITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_ANDESITE_BRICK_WALL, ChiseledBlocks.POLISHED_ANDESITE_BRICKS);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_POLISHED_ANDESITE_BRICKS)
                        .pattern("#")
                        .pattern("#")
                        .define('#', Blocks.POLISHED_ANDESITE_SLAB)
                        .unlockedBy(getHasName(ChiseledBlocks.CUT_POLISHED_ANDESITE_BRICKS), has(Blocks.POLISHED_ANDESITE))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_POLISHED_ANDESITE_BRICKS, Blocks.ANDESITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_POLISHED_ANDESITE_BRICKS, Blocks.POLISHED_ANDESITE);
                smeltingResultFromBase(ChiseledBlocks.CRACKED_CUT_POLISHED_ANDESITE_BRICKS, ChiseledBlocks.CUT_POLISHED_ANDESITE_BRICKS);
                stairBuilder(ChiseledBlocks.CUT_POLISHED_ANDESITE_BRICK_STAIRS, Ingredient.of(ChiseledBlocks.CUT_POLISHED_ANDESITE_BRICKS))
                        .unlockedBy(getHasName(ChiseledBlocks.CUT_POLISHED_ANDESITE_BRICK_STAIRS), has(ChiseledBlocks.CUT_POLISHED_ANDESITE_BRICKS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_POLISHED_ANDESITE_BRICK_STAIRS, Blocks.ANDESITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_POLISHED_ANDESITE_BRICK_STAIRS, Blocks.POLISHED_ANDESITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_POLISHED_ANDESITE_BRICK_STAIRS, ChiseledBlocks.CUT_POLISHED_ANDESITE_BRICKS);
                slab(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_POLISHED_ANDESITE_BRICK_SLAB, ChiseledBlocks.CUT_POLISHED_ANDESITE_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_POLISHED_ANDESITE_BRICK_SLAB, Blocks.ANDESITE,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_POLISHED_ANDESITE_BRICK_SLAB, Blocks.POLISHED_ANDESITE,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_POLISHED_ANDESITE_BRICK_SLAB, ChiseledBlocks.CUT_POLISHED_ANDESITE_BRICKS,2);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_ANDESITE_TILES,4)
                        .pattern("##")
                        .pattern("##")
                        .define('#', ChiseledBlocks.POLISHED_ANDESITE_BRICKS)
                        .unlockedBy(getHasName(ChiseledBlocks.POLISHED_ANDESITE_TILES), has(ChiseledBlocks.POLISHED_ANDESITE_BRICKS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_ANDESITE_TILES, Blocks.ANDESITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_ANDESITE_TILES, Blocks.POLISHED_ANDESITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_ANDESITE_TILES, ChiseledBlocks.POLISHED_ANDESITE_BRICKS);
                smeltingResultFromBase(ChiseledBlocks.CRACKED_POLISHED_ANDESITE_TILES, ChiseledBlocks.POLISHED_ANDESITE_TILES);
                stairBuilder(ChiseledBlocks.POLISHED_ANDESITE_TILE_STAIRS, Ingredient.of(ChiseledBlocks.POLISHED_ANDESITE_TILES))
                        .unlockedBy(getHasName(ChiseledBlocks.POLISHED_ANDESITE_TILE_STAIRS), has(ChiseledBlocks.POLISHED_ANDESITE_TILES))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_ANDESITE_TILE_STAIRS, Blocks.ANDESITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_ANDESITE_TILE_STAIRS, Blocks.POLISHED_ANDESITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_ANDESITE_TILE_STAIRS, ChiseledBlocks.POLISHED_ANDESITE_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_ANDESITE_TILE_STAIRS, ChiseledBlocks.POLISHED_ANDESITE_TILES);
                slab(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_ANDESITE_TILE_SLAB, ChiseledBlocks.POLISHED_ANDESITE_TILES);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_ANDESITE_TILE_SLAB, Blocks.ANDESITE,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_ANDESITE_TILE_SLAB, Blocks.POLISHED_ANDESITE,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_ANDESITE_TILE_SLAB, ChiseledBlocks.POLISHED_ANDESITE_BRICKS, 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_ANDESITE_TILE_SLAB, ChiseledBlocks.POLISHED_ANDESITE_TILES,2);
                wall(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_ANDESITE_TILE_WALL, ChiseledBlocks.POLISHED_ANDESITE_TILES);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_ANDESITE_TILE_WALL, Blocks.ANDESITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_ANDESITE_TILE_WALL, Blocks.POLISHED_ANDESITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_ANDESITE_TILE_WALL, ChiseledBlocks.POLISHED_ANDESITE_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_ANDESITE_TILE_WALL, ChiseledBlocks.POLISHED_ANDESITE_TILES);

                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_DEEPSLATE_BRICKS)
                        .pattern("#")
                        .pattern("#")
                        .define('#', Blocks.POLISHED_DEEPSLATE_SLAB)
                        .unlockedBy(getHasName(ChiseledBlocks.CUT_DEEPSLATE_BRICKS), has(Blocks.POLISHED_DEEPSLATE))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_DEEPSLATE_BRICKS, Blocks.DEEPSLATE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_DEEPSLATE_BRICKS, Blocks.COBBLED_DEEPSLATE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_DEEPSLATE_BRICKS, Blocks.POLISHED_DEEPSLATE);
                smeltingResultFromBase(ChiseledBlocks.CRACKED_CUT_DEEPSLATE_BRICKS, ChiseledBlocks.CUT_DEEPSLATE_BRICKS);
                stairBuilder(ChiseledBlocks.CUT_DEEPSLATE_BRICK_STAIRS, Ingredient.of(ChiseledBlocks.CUT_DEEPSLATE_BRICKS))
                        .unlockedBy(getHasName(ChiseledBlocks.CUT_DEEPSLATE_BRICK_STAIRS), has(ChiseledBlocks.CUT_DEEPSLATE_BRICKS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_DEEPSLATE_BRICK_STAIRS, Blocks.DEEPSLATE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_DEEPSLATE_BRICK_STAIRS, Blocks.COBBLED_DEEPSLATE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_DEEPSLATE_BRICK_STAIRS, Blocks.POLISHED_DEEPSLATE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_DEEPSLATE_BRICK_STAIRS, ChiseledBlocks.CUT_DEEPSLATE_BRICKS);
                slab(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_DEEPSLATE_BRICK_SLAB, ChiseledBlocks.CUT_DEEPSLATE_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_DEEPSLATE_BRICK_SLAB, Blocks.DEEPSLATE,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_DEEPSLATE_BRICK_SLAB, Blocks.COBBLED_DEEPSLATE,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_DEEPSLATE_BRICK_SLAB, Blocks.POLISHED_DEEPSLATE,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_DEEPSLATE_BRICK_SLAB, ChiseledBlocks.CUT_DEEPSLATE_BRICKS,2);

                stairBuilder(ChiseledBlocks.CALCITE_STAIRS, Ingredient.of(Blocks.CALCITE))
                        .unlockedBy(getHasName(ChiseledBlocks.CALCITE_STAIRS), has(Blocks.CALCITE))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CALCITE_STAIRS, Blocks.CALCITE);
                slab(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CALCITE_SLAB, Blocks.CALCITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CALCITE_SLAB, Blocks.CALCITE,2);
                wall(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CALCITE_WALL, Blocks.CALCITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CALCITE_WALL, Blocks.CALCITE);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_CALCITE,4)
                        .pattern("##")
                        .pattern("##")
                        .define('#', Blocks.CALCITE)
                        .unlockedBy(getHasName(ChiseledBlocks.POLISHED_CALCITE), has(Blocks.CALCITE))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_CALCITE, Blocks.CALCITE);
                stairBuilder(ChiseledBlocks.POLISHED_CALCITE_STAIRS, Ingredient.of(ChiseledBlocks.POLISHED_CALCITE))
                        .unlockedBy(getHasName(ChiseledBlocks.POLISHED_CALCITE_STAIRS), has(ChiseledBlocks.POLISHED_CALCITE))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_CALCITE_STAIRS, Blocks.CALCITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_CALCITE_STAIRS, ChiseledBlocks.POLISHED_CALCITE);
                slab(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_CALCITE_SLAB, ChiseledBlocks.POLISHED_CALCITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_CALCITE_SLAB, Blocks.CALCITE, 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_CALCITE_SLAB, ChiseledBlocks.POLISHED_CALCITE,2);
                wall(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_CALCITE_WALL, ChiseledBlocks.POLISHED_CALCITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_CALCITE_WALL, Blocks.CALCITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_CALCITE_WALL, ChiseledBlocks.POLISHED_CALCITE);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CALCITE_BRICKS,4)
                        .pattern("##")
                        .pattern("##")
                        .define('#', ChiseledBlocks.POLISHED_CALCITE)
                        .unlockedBy(getHasName(ChiseledBlocks.CALCITE_BRICKS), has(ChiseledBlocks.POLISHED_CALCITE))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CALCITE_BRICKS, Blocks.CALCITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CALCITE_BRICKS, ChiseledBlocks.POLISHED_CALCITE);
                smeltingResultFromBase(ChiseledBlocks.CRACKED_CALCITE_BRICKS, ChiseledBlocks.CALCITE_BRICKS);
                stairBuilder(ChiseledBlocks.CALCITE_BRICK_STAIRS, Ingredient.of(ChiseledBlocks.CALCITE_BRICKS))
                        .unlockedBy(getHasName(ChiseledBlocks.CALCITE_BRICK_STAIRS), has(ChiseledBlocks.CALCITE_BRICKS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CALCITE_BRICK_STAIRS, Blocks.CALCITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CALCITE_BRICK_STAIRS, ChiseledBlocks.POLISHED_CALCITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CALCITE_BRICK_STAIRS, ChiseledBlocks.CALCITE_BRICKS);
                slab(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CALCITE_BRICK_SLAB, ChiseledBlocks.CALCITE_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CALCITE_BRICK_SLAB, Blocks.CALCITE,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CALCITE_BRICK_SLAB, ChiseledBlocks.POLISHED_CALCITE,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CALCITE_BRICK_SLAB, ChiseledBlocks.CALCITE_BRICKS,2);
                wall(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CALCITE_BRICK_WALL, ChiseledBlocks.CALCITE_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CALCITE_BRICK_WALL, Blocks.CALCITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CALCITE_BRICK_WALL, ChiseledBlocks.POLISHED_CALCITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CALCITE_BRICK_WALL, ChiseledBlocks.CALCITE_BRICKS);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_CALCITE_BRICKS)
                        .pattern("#")
                        .pattern("#")
                        .define('#', ChiseledBlocks.POLISHED_CALCITE_SLAB)
                        .unlockedBy(getHasName(ChiseledBlocks.CUT_CALCITE_BRICKS), has(ChiseledBlocks.POLISHED_CALCITE))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_CALCITE_BRICKS, Blocks.CALCITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_CALCITE_BRICKS, ChiseledBlocks.POLISHED_CALCITE);
                smeltingResultFromBase(ChiseledBlocks.CRACKED_CUT_CALCITE_BRICKS, ChiseledBlocks.CUT_CALCITE_BRICKS);
                stairBuilder(ChiseledBlocks.CUT_CALCITE_BRICK_STAIRS, Ingredient.of(ChiseledBlocks.CUT_CALCITE_BRICKS))
                        .unlockedBy(getHasName(ChiseledBlocks.CUT_CALCITE_BRICK_STAIRS), has(ChiseledBlocks.CUT_CALCITE_BRICKS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_CALCITE_BRICK_STAIRS, Blocks.CALCITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_CALCITE_BRICK_STAIRS, ChiseledBlocks.POLISHED_CALCITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_CALCITE_BRICK_STAIRS, ChiseledBlocks.CUT_CALCITE_BRICKS);
                slab(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_CALCITE_BRICK_SLAB, ChiseledBlocks.CUT_CALCITE_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_CALCITE_BRICK_SLAB, Blocks.CALCITE,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_CALCITE_BRICK_SLAB, ChiseledBlocks.POLISHED_CALCITE,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_CALCITE_BRICK_SLAB, ChiseledBlocks.CUT_CALCITE_BRICKS,2);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CALCITE_TILES,4)
                        .pattern("##")
                        .pattern("##")
                        .define('#', ChiseledBlocks.CALCITE_BRICKS)
                        .unlockedBy(getHasName(ChiseledBlocks.CALCITE_TILES), has(ChiseledBlocks.CALCITE_BRICKS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CALCITE_TILES, Blocks.CALCITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CALCITE_TILES, ChiseledBlocks.POLISHED_CALCITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CALCITE_TILES, ChiseledBlocks.CALCITE_BRICKS);
                smeltingResultFromBase(ChiseledBlocks.CRACKED_CALCITE_TILES, ChiseledBlocks.CALCITE_TILES);
                stairBuilder(ChiseledBlocks.CALCITE_TILE_STAIRS, Ingredient.of(ChiseledBlocks.CALCITE_TILES))
                        .unlockedBy(getHasName(ChiseledBlocks.CALCITE_TILE_STAIRS), has(ChiseledBlocks.CALCITE_TILES))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CALCITE_TILE_STAIRS, Blocks.CALCITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CALCITE_TILE_STAIRS, ChiseledBlocks.POLISHED_CALCITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CALCITE_TILE_STAIRS, ChiseledBlocks.CALCITE_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CALCITE_TILE_STAIRS, ChiseledBlocks.CALCITE_TILES);
                slab(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CALCITE_TILE_SLAB, ChiseledBlocks.CALCITE_TILES);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CALCITE_TILE_SLAB, Blocks.CALCITE,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CALCITE_TILE_SLAB, ChiseledBlocks.POLISHED_CALCITE,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CALCITE_TILE_SLAB, ChiseledBlocks.CALCITE_BRICKS,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CALCITE_TILE_SLAB, ChiseledBlocks.CALCITE_TILES,2);
                wall(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CALCITE_TILE_WALL, ChiseledBlocks.CALCITE_TILES);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CALCITE_TILE_WALL, Blocks.CALCITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CALCITE_TILE_WALL, ChiseledBlocks.POLISHED_CALCITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CALCITE_TILE_WALL, ChiseledBlocks.CALCITE_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CALCITE_TILE_WALL, ChiseledBlocks.CALCITE_TILES);

                stairBuilder(ChiseledBlocks.DRIPSTONE_STAIRS, Ingredient.of(Blocks.DRIPSTONE_BLOCK))
                        .unlockedBy(getHasName(ChiseledBlocks.DRIPSTONE_STAIRS), has(Blocks.DRIPSTONE_BLOCK))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.DRIPSTONE_STAIRS, Blocks.DRIPSTONE_BLOCK);
                slab(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.DRIPSTONE_SLAB, Blocks.DRIPSTONE_BLOCK);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.DRIPSTONE_SLAB, Blocks.DRIPSTONE_BLOCK,2);
                wall(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.DRIPSTONE_WALL, Blocks.DRIPSTONE_BLOCK);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.DRIPSTONE_WALL, Blocks.DRIPSTONE_BLOCK);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_DRIPSTONE,4)
                        .pattern("##")
                        .pattern("##")
                        .define('#', Blocks.DRIPSTONE_BLOCK)
                        .unlockedBy(getHasName(ChiseledBlocks.POLISHED_DRIPSTONE), has(Blocks.DRIPSTONE_BLOCK))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_DRIPSTONE, Blocks.DRIPSTONE_BLOCK);
                stairBuilder(ChiseledBlocks.POLISHED_DRIPSTONE_STAIRS, Ingredient.of(ChiseledBlocks.POLISHED_DRIPSTONE))
                        .unlockedBy(getHasName(ChiseledBlocks.POLISHED_DRIPSTONE_STAIRS), has(ChiseledBlocks.POLISHED_DRIPSTONE))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_DRIPSTONE_STAIRS, Blocks.DRIPSTONE_BLOCK);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_DRIPSTONE_STAIRS, ChiseledBlocks.POLISHED_DRIPSTONE);
                slab(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_DRIPSTONE_SLAB, ChiseledBlocks.POLISHED_DRIPSTONE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_DRIPSTONE_SLAB, Blocks.DRIPSTONE_BLOCK, 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_DRIPSTONE_SLAB, ChiseledBlocks.POLISHED_DRIPSTONE,2);
                wall(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_DRIPSTONE_WALL, ChiseledBlocks.POLISHED_DRIPSTONE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_DRIPSTONE_WALL, Blocks.DRIPSTONE_BLOCK);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_DRIPSTONE_WALL, ChiseledBlocks.POLISHED_DRIPSTONE);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.DRIPSTONE_BRICKS,4)
                        .pattern("##")
                        .pattern("##")
                        .define('#', ChiseledBlocks.POLISHED_DRIPSTONE)
                        .unlockedBy(getHasName(ChiseledBlocks.DRIPSTONE_BRICKS), has(ChiseledBlocks.POLISHED_DRIPSTONE))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.DRIPSTONE_BRICKS, Blocks.DRIPSTONE_BLOCK);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.DRIPSTONE_BRICKS, ChiseledBlocks.POLISHED_DRIPSTONE);
                smeltingResultFromBase(ChiseledBlocks.CRACKED_DRIPSTONE_BRICKS, ChiseledBlocks.DRIPSTONE_BRICKS);
                stairBuilder(ChiseledBlocks.DRIPSTONE_BRICK_STAIRS, Ingredient.of(ChiseledBlocks.DRIPSTONE_BRICKS))
                        .unlockedBy(getHasName(ChiseledBlocks.DRIPSTONE_BRICK_STAIRS), has(ChiseledBlocks.DRIPSTONE_BRICKS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.DRIPSTONE_BRICK_STAIRS, Blocks.DRIPSTONE_BLOCK);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.DRIPSTONE_BRICK_STAIRS, ChiseledBlocks.POLISHED_DRIPSTONE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.DRIPSTONE_BRICK_STAIRS, ChiseledBlocks.DRIPSTONE_BRICKS);
                slab(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.DRIPSTONE_BRICK_SLAB, ChiseledBlocks.DRIPSTONE_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.DRIPSTONE_BRICK_SLAB, Blocks.DRIPSTONE_BLOCK,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.DRIPSTONE_BRICK_SLAB, ChiseledBlocks.POLISHED_DRIPSTONE,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.DRIPSTONE_BRICK_SLAB, ChiseledBlocks.DRIPSTONE_BRICKS,2);
                wall(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.DRIPSTONE_BRICK_WALL, ChiseledBlocks.DRIPSTONE_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.DRIPSTONE_BRICK_WALL, Blocks.DRIPSTONE_BLOCK);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.DRIPSTONE_BRICK_WALL, ChiseledBlocks.POLISHED_DRIPSTONE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.DRIPSTONE_BRICK_WALL, ChiseledBlocks.DRIPSTONE_BRICKS);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_DRIPSTONE_BRICKS)
                        .pattern("#")
                        .pattern("#")
                        .define('#', ChiseledBlocks.POLISHED_DRIPSTONE_SLAB)
                        .unlockedBy(getHasName(ChiseledBlocks.CUT_DRIPSTONE_BRICKS), has(ChiseledBlocks.POLISHED_DRIPSTONE))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_DRIPSTONE_BRICKS, Blocks.DRIPSTONE_BLOCK);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_DRIPSTONE_BRICKS, ChiseledBlocks.POLISHED_DRIPSTONE);
                smeltingResultFromBase(ChiseledBlocks.CRACKED_CUT_DRIPSTONE_BRICKS, ChiseledBlocks.CUT_DRIPSTONE_BRICKS);
                stairBuilder(ChiseledBlocks.CUT_DRIPSTONE_BRICK_STAIRS, Ingredient.of(ChiseledBlocks.CUT_DRIPSTONE_BRICKS))
                        .unlockedBy(getHasName(ChiseledBlocks.CUT_DRIPSTONE_BRICK_STAIRS), has(ChiseledBlocks.CUT_DRIPSTONE_BRICKS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_DRIPSTONE_BRICK_STAIRS, Blocks.DRIPSTONE_BLOCK);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_DRIPSTONE_BRICK_STAIRS, ChiseledBlocks.POLISHED_DRIPSTONE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_DRIPSTONE_BRICK_STAIRS, ChiseledBlocks.CUT_DRIPSTONE_BRICKS);
                slab(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_DRIPSTONE_BRICK_SLAB, ChiseledBlocks.CUT_DRIPSTONE_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_DRIPSTONE_BRICK_SLAB, Blocks.DRIPSTONE_BLOCK,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_DRIPSTONE_BRICK_SLAB, ChiseledBlocks.POLISHED_DRIPSTONE,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_DRIPSTONE_BRICK_SLAB, ChiseledBlocks.CUT_DRIPSTONE_BRICKS,2);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.DRIPSTONE_TILES,4)
                        .pattern("##")
                        .pattern("##")
                        .define('#', ChiseledBlocks.DRIPSTONE_BRICKS)
                        .unlockedBy(getHasName(ChiseledBlocks.DRIPSTONE_TILES), has(ChiseledBlocks.DRIPSTONE_BRICKS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.DRIPSTONE_TILES, Blocks.DRIPSTONE_BLOCK);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.DRIPSTONE_TILES, ChiseledBlocks.POLISHED_DRIPSTONE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.DRIPSTONE_TILES, ChiseledBlocks.DRIPSTONE_BRICKS);
                smeltingResultFromBase(ChiseledBlocks.CRACKED_DRIPSTONE_TILES, ChiseledBlocks.DRIPSTONE_TILES);
                stairBuilder(ChiseledBlocks.DRIPSTONE_TILE_STAIRS, Ingredient.of(ChiseledBlocks.DRIPSTONE_TILES))
                        .unlockedBy(getHasName(ChiseledBlocks.DRIPSTONE_TILE_STAIRS), has(ChiseledBlocks.DRIPSTONE_TILES))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.DRIPSTONE_TILE_STAIRS, Blocks.DRIPSTONE_BLOCK);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.DRIPSTONE_TILE_STAIRS, ChiseledBlocks.POLISHED_DRIPSTONE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.DRIPSTONE_TILE_STAIRS, ChiseledBlocks.DRIPSTONE_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.DRIPSTONE_TILE_STAIRS, ChiseledBlocks.DRIPSTONE_TILES);
                slab(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.DRIPSTONE_TILE_SLAB, ChiseledBlocks.DRIPSTONE_TILES);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.DRIPSTONE_TILE_SLAB, Blocks.DRIPSTONE_BLOCK,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.DRIPSTONE_TILE_SLAB, ChiseledBlocks.POLISHED_DRIPSTONE,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.DRIPSTONE_TILE_SLAB, ChiseledBlocks.DRIPSTONE_BRICKS,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.DRIPSTONE_TILE_SLAB, ChiseledBlocks.DRIPSTONE_TILES,2);
                wall(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.DRIPSTONE_TILE_WALL, ChiseledBlocks.DRIPSTONE_TILES);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.DRIPSTONE_TILE_WALL, Blocks.DRIPSTONE_BLOCK);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.DRIPSTONE_TILE_WALL, ChiseledBlocks.POLISHED_DRIPSTONE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.DRIPSTONE_TILE_WALL, ChiseledBlocks.DRIPSTONE_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.DRIPSTONE_TILE_WALL, ChiseledBlocks.DRIPSTONE_TILES);

                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MIXED_BRICKS,4)
                        .pattern("##")
                        .pattern("##")
                        .define('#', Blocks.BRICKS)
                        .unlockedBy(getHasName(ChiseledBlocks.MIXED_BRICKS), has(Blocks.BRICKS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MIXED_BRICKS, Blocks.BRICKS);
                stairBuilder(ChiseledBlocks.MIXED_BRICK_STAIRS, Ingredient.of(ChiseledBlocks.MIXED_BRICKS))
                        .unlockedBy(getHasName(ChiseledBlocks.MIXED_BRICK_STAIRS), has(ChiseledBlocks.MIXED_BRICKS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MIXED_BRICK_STAIRS, Blocks.BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MIXED_BRICK_STAIRS, ChiseledBlocks.MIXED_BRICKS);
                slab(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MIXED_BRICK_SLAB, ChiseledBlocks.MIXED_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MIXED_BRICK_SLAB, Blocks.BRICKS,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MIXED_BRICK_SLAB, ChiseledBlocks.MIXED_BRICKS,2);
                wall(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MIXED_BRICK_WALL, ChiseledBlocks.MIXED_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MIXED_BRICK_WALL, Blocks.BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MIXED_BRICK_WALL, ChiseledBlocks.MIXED_BRICKS);
                shapeless(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MOSSY_BRICKS)
                        .requires(Blocks.BRICKS)
                        .requires(Blocks.MOSS_BLOCK)
                        .unlockedBy(getHasName(ChiseledBlocks.MOSSY_BRICKS), has(Blocks.BRICKS))
                        .save(output, "mossy_bricks_from_moss");
                shapeless(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MOSSY_BRICKS)
                        .requires(Blocks.BRICKS)
                        .requires(Blocks.VINE)
                        .unlockedBy(getHasName(ChiseledBlocks.MOSSY_BRICKS), has(Blocks.BRICKS))
                        .save(output, "mossy_bricks_from_vine");
                stairBuilder(ChiseledBlocks.MOSSY_BRICK_STAIRS, Ingredient.of(ChiseledBlocks.MOSSY_BRICKS))
                        .unlockedBy(getHasName(ChiseledBlocks.MOSSY_BRICK_STAIRS), has(ChiseledBlocks.MOSSY_BRICKS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MOSSY_BRICK_STAIRS, ChiseledBlocks.MOSSY_BRICKS);
                slab(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MOSSY_BRICK_SLAB, ChiseledBlocks.MOSSY_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MOSSY_BRICK_SLAB, ChiseledBlocks.MOSSY_BRICKS,2);
                wall(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MOSSY_BRICK_WALL, ChiseledBlocks.MOSSY_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MOSSY_BRICK_WALL, ChiseledBlocks.MOSSY_BRICKS);

                stairBuilder(ChiseledBlocks.PACKED_MUD_STAIRS, Ingredient.of(Blocks.PACKED_MUD))
                        .unlockedBy(getHasName(ChiseledBlocks.PACKED_MUD_STAIRS), has(Blocks.PACKED_MUD))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.PACKED_MUD_STAIRS, Blocks.PACKED_MUD);
                slab(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.PACKED_MUD_SLAB, Blocks.PACKED_MUD);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.PACKED_MUD_SLAB, Blocks.PACKED_MUD,2);
                wall(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.PACKED_MUD_WALL, Blocks.PACKED_MUD);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.PACKED_MUD_WALL, Blocks.PACKED_MUD);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_MUD,4)
                        .pattern("##")
                        .pattern("##")
                        .define('#', Blocks.PACKED_MUD)
                        .unlockedBy(getHasName(ChiseledBlocks.POLISHED_MUD), has(Blocks.PACKED_MUD))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_MUD, Blocks.PACKED_MUD);
                stairBuilder(ChiseledBlocks.POLISHED_MUD_STAIRS, Ingredient.of(ChiseledBlocks.POLISHED_MUD))
                        .unlockedBy(getHasName(ChiseledBlocks.POLISHED_MUD_STAIRS), has(ChiseledBlocks.POLISHED_MUD))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_MUD_STAIRS, Blocks.PACKED_MUD);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_MUD_STAIRS, ChiseledBlocks.POLISHED_MUD);
                slab(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_MUD_SLAB, ChiseledBlocks.POLISHED_MUD);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_MUD_SLAB, Blocks.PACKED_MUD,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_MUD_SLAB, ChiseledBlocks.POLISHED_MUD,2);
                wall(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_MUD_WALL, ChiseledBlocks.POLISHED_MUD);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_MUD_WALL, Blocks.PACKED_MUD);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_MUD_WALL, ChiseledBlocks.POLISHED_MUD);
                shaped(RecipeCategory.BUILDING_BLOCKS, Blocks.MUD_BRICKS,4)
                        .pattern("##")
                        .pattern("##")
                        .define('#', ChiseledBlocks.POLISHED_MUD)
                        .unlockedBy(getHasName(Blocks.MUD_BRICKS), has(ChiseledBlocks.POLISHED_MUD))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, Blocks.MUD_BRICKS, Blocks.PACKED_MUD);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, Blocks.MUD_BRICKS, ChiseledBlocks.POLISHED_MUD);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, Blocks.MUD_BRICK_STAIRS, Blocks.PACKED_MUD);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, Blocks.MUD_BRICK_STAIRS, ChiseledBlocks.POLISHED_MUD);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, Blocks.MUD_BRICK_SLAB, Blocks.PACKED_MUD,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, Blocks.MUD_BRICK_SLAB, ChiseledBlocks.POLISHED_MUD,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, Blocks.MUD_BRICK_WALL, Blocks.PACKED_MUD);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, Blocks.MUD_BRICK_WALL, ChiseledBlocks.POLISHED_MUD);
                shapeless(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MOSSY_MUD_BRICKS)
                        .requires(Blocks.MUD_BRICKS)
                        .requires(Blocks.MOSS_BLOCK)
                        .unlockedBy(getHasName(ChiseledBlocks.MOSSY_MUD_BRICKS), has(Blocks.MUD_BRICKS))
                        .save(output, "mossy_mud_bricks_from_moss");
                shapeless(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MOSSY_MUD_BRICKS)
                        .requires(Blocks.MUD_BRICKS)
                        .requires(Blocks.VINE)
                        .unlockedBy(getHasName(ChiseledBlocks.MOSSY_MUD_BRICKS), has(Blocks.MUD_BRICKS))
                        .save(output, "mossy_mud_bricks_from_vine");
                stairBuilder(ChiseledBlocks.MOSSY_MUD_BRICK_STAIRS, Ingredient.of(ChiseledBlocks.MOSSY_MUD_BRICKS))
                        .unlockedBy(getHasName(ChiseledBlocks.MOSSY_MUD_BRICK_STAIRS), has(ChiseledBlocks.MOSSY_MUD_BRICKS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MOSSY_MUD_BRICK_STAIRS, ChiseledBlocks.MOSSY_MUD_BRICKS);
                slab(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MOSSY_MUD_BRICK_SLAB, ChiseledBlocks.MOSSY_MUD_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MOSSY_MUD_BRICK_SLAB, ChiseledBlocks.MOSSY_MUD_BRICKS,2);
                wall(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MOSSY_MUD_BRICK_WALL, ChiseledBlocks.MOSSY_MUD_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MOSSY_MUD_BRICK_WALL, ChiseledBlocks.MOSSY_MUD_BRICKS);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_MUD_BRICKS)
                        .pattern("#")
                        .pattern("#")
                        .define('#', ChiseledBlocks.POLISHED_MUD_SLAB)
                        .unlockedBy(getHasName(ChiseledBlocks.CUT_MUD_BRICKS), has(ChiseledBlocks.POLISHED_MUD))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_MUD_BRICKS, Blocks.PACKED_MUD);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_MUD_BRICKS, ChiseledBlocks.POLISHED_MUD);
                stairBuilder(ChiseledBlocks.CUT_MUD_BRICK_STAIRS, Ingredient.of(ChiseledBlocks.CUT_MUD_BRICKS))
                        .unlockedBy(getHasName(ChiseledBlocks.CUT_MUD_BRICK_STAIRS), has(ChiseledBlocks.CUT_MUD_BRICKS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_MUD_BRICK_STAIRS, Blocks.PACKED_MUD);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_MUD_BRICK_STAIRS, ChiseledBlocks.POLISHED_MUD);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_MUD_BRICK_STAIRS, ChiseledBlocks.CUT_MUD_BRICKS);
                slab(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_MUD_BRICK_SLAB, ChiseledBlocks.CUT_MUD_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_MUD_BRICK_SLAB, Blocks.PACKED_MUD,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_MUD_BRICK_SLAB, ChiseledBlocks.POLISHED_MUD,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_MUD_BRICK_SLAB, ChiseledBlocks.CUT_MUD_BRICKS,2);
                shapeless(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MOSSY_CUT_MUD_BRICKS)
                        .requires(ChiseledBlocks.CUT_MUD_BRICKS)
                        .requires(Blocks.MOSS_BLOCK)
                        .unlockedBy(getHasName(ChiseledBlocks.MOSSY_CUT_MUD_BRICKS), has(ChiseledBlocks.CUT_MUD_BRICKS))
                        .save(output, "mossy_cut_mud_bricks_from_moss");
                shapeless(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MOSSY_CUT_MUD_BRICKS)
                        .requires(ChiseledBlocks.CUT_MUD_BRICKS)
                        .requires(Blocks.VINE)
                        .unlockedBy(getHasName(ChiseledBlocks.MOSSY_CUT_MUD_BRICKS), has(ChiseledBlocks.CUT_MUD_BRICKS))
                        .save(output, "mossy_cut_mud_bricks_from_vine");
                stairBuilder(ChiseledBlocks.MOSSY_CUT_MUD_BRICK_STAIRS, Ingredient.of(ChiseledBlocks.MOSSY_CUT_MUD_BRICKS))
                        .unlockedBy(getHasName(ChiseledBlocks.MOSSY_CUT_MUD_BRICK_STAIRS), has(ChiseledBlocks.MOSSY_CUT_MUD_BRICKS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MOSSY_CUT_MUD_BRICK_STAIRS, ChiseledBlocks.MOSSY_CUT_MUD_BRICKS);
                slab(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MOSSY_CUT_MUD_BRICK_SLAB, ChiseledBlocks.MOSSY_CUT_MUD_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MOSSY_CUT_MUD_BRICK_SLAB, ChiseledBlocks.MOSSY_CUT_MUD_BRICKS,2);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MUD_TILES,4)
                        .pattern("##")
                        .pattern("##")
                        .define('#', Blocks.MUD_BRICKS)
                        .unlockedBy(getHasName(ChiseledBlocks.MUD_TILES), has(Blocks.MUD_BRICKS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MUD_TILES, Blocks.PACKED_MUD);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MUD_TILES, ChiseledBlocks.POLISHED_MUD);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MUD_TILES, Blocks.MUD_BRICKS);
                stairBuilder(ChiseledBlocks.MUD_TILE_STAIRS, Ingredient.of(ChiseledBlocks.MUD_TILES))
                        .unlockedBy(getHasName(ChiseledBlocks.MUD_TILE_STAIRS), has(ChiseledBlocks.MUD_TILES))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MUD_TILE_STAIRS, Blocks.PACKED_MUD);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MUD_TILE_STAIRS, ChiseledBlocks.POLISHED_MUD);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MUD_TILE_STAIRS, Blocks.MUD_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MUD_TILE_STAIRS, ChiseledBlocks.MUD_TILES);
                slab(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MUD_TILE_SLAB, ChiseledBlocks.MUD_TILES);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MUD_TILE_SLAB, Blocks.PACKED_MUD,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MUD_TILE_SLAB, ChiseledBlocks.POLISHED_MUD,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MUD_TILE_SLAB, Blocks.MUD_BRICKS,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MUD_TILE_SLAB, ChiseledBlocks.MUD_TILES,2);
                wall(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MUD_TILE_WALL, ChiseledBlocks.MUD_TILES);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MUD_TILE_WALL, Blocks.PACKED_MUD);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MUD_TILE_WALL, ChiseledBlocks.POLISHED_MUD);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MUD_TILE_WALL, Blocks.MUD_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MUD_TILE_WALL, ChiseledBlocks.MUD_TILES);
                shapeless(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MOSSY_MUD_TILES)
                        .requires(ChiseledBlocks.MUD_TILES)
                        .requires(Blocks.MOSS_BLOCK)
                        .unlockedBy(getHasName(ChiseledBlocks.MOSSY_MUD_TILES), has(ChiseledBlocks.MUD_TILES))
                        .save(output, "mossy_mud_tiles_from_moss");
                shapeless(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MOSSY_MUD_TILES)
                        .requires(ChiseledBlocks.MUD_TILES)
                        .requires(Blocks.VINE)
                        .unlockedBy(getHasName(ChiseledBlocks.MOSSY_MUD_TILES), has(ChiseledBlocks.MUD_TILES))
                        .save(output, "mossy_mud_tiles_from_vine");
                stairBuilder(ChiseledBlocks.MOSSY_MUD_TILE_STAIRS, Ingredient.of(ChiseledBlocks.MOSSY_MUD_TILES))
                        .unlockedBy(getHasName(ChiseledBlocks.MOSSY_MUD_TILE_STAIRS), has(ChiseledBlocks.MOSSY_MUD_TILES))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MOSSY_MUD_TILE_STAIRS, ChiseledBlocks.MOSSY_MUD_TILES);
                slab(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MOSSY_MUD_TILE_SLAB, ChiseledBlocks.MOSSY_MUD_TILES);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MOSSY_MUD_TILE_SLAB, ChiseledBlocks.MOSSY_MUD_TILES,2);
                wall(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MOSSY_MUD_TILE_WALL, ChiseledBlocks.MOSSY_MUD_TILES);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MOSSY_MUD_TILE_WALL, ChiseledBlocks.MOSSY_MUD_TILES);

                wall(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.SMOOTH_SANDSTONE_WALL, Blocks.SMOOTH_SANDSTONE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.SMOOTH_SANDSTONE_WALL, Blocks.SMOOTH_SANDSTONE);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.SANDSTONE_BRICKS,4)
                        .pattern("##")
                        .pattern("##")
                        .define('#', Blocks.SMOOTH_SANDSTONE)
                        .unlockedBy(getHasName(ChiseledBlocks.SANDSTONE_BRICKS), has(Blocks.SMOOTH_SANDSTONE))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.SANDSTONE_BRICKS, Blocks.SMOOTH_SANDSTONE);
                stairBuilder(ChiseledBlocks.SANDSTONE_BRICK_STAIRS, Ingredient.of(ChiseledBlocks.SANDSTONE_BRICKS))
                        .unlockedBy(getHasName(ChiseledBlocks.SANDSTONE_BRICK_STAIRS), has(ChiseledBlocks.SANDSTONE_BRICKS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.SANDSTONE_BRICK_STAIRS, Blocks.SMOOTH_SANDSTONE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.SANDSTONE_BRICK_STAIRS, ChiseledBlocks.SANDSTONE_BRICKS);
                slab(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.SANDSTONE_BRICK_SLAB, ChiseledBlocks.SANDSTONE_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.SANDSTONE_BRICK_SLAB, Blocks.SMOOTH_SANDSTONE,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.SANDSTONE_BRICK_SLAB, ChiseledBlocks.SANDSTONE_BRICKS,2);
                wall(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.SANDSTONE_BRICK_WALL, ChiseledBlocks.SANDSTONE_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.SANDSTONE_BRICK_WALL, Blocks.SMOOTH_SANDSTONE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.SANDSTONE_BRICK_WALL, ChiseledBlocks.SANDSTONE_BRICKS);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_SANDSTONE_BRICKS)
                        .pattern("#")
                        .pattern("#")
                        .define('#', Blocks.SMOOTH_SANDSTONE_SLAB)
                        .unlockedBy(getHasName(ChiseledBlocks.CUT_SANDSTONE_BRICKS), has(Blocks.SMOOTH_SANDSTONE))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_SANDSTONE_BRICKS, Blocks.SMOOTH_SANDSTONE);
                stairBuilder(ChiseledBlocks.CUT_SANDSTONE_BRICK_STAIRS, Ingredient.of(ChiseledBlocks.CUT_SANDSTONE_BRICKS))
                        .unlockedBy(getHasName(ChiseledBlocks.CUT_SANDSTONE_BRICK_STAIRS), has(ChiseledBlocks.CUT_SANDSTONE_BRICKS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_SANDSTONE_BRICK_STAIRS, Blocks.SMOOTH_SANDSTONE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_SANDSTONE_BRICK_STAIRS, ChiseledBlocks.CUT_SANDSTONE_BRICKS);
                slab(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_SANDSTONE_BRICK_SLAB, ChiseledBlocks.CUT_SANDSTONE_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_SANDSTONE_BRICK_SLAB, Blocks.SMOOTH_SANDSTONE,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_SANDSTONE_BRICK_SLAB, ChiseledBlocks.CUT_SANDSTONE_BRICKS,2);

                wall(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.SMOOTH_RED_SANDSTONE_WALL, Blocks.SMOOTH_RED_SANDSTONE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.SMOOTH_RED_SANDSTONE_WALL, Blocks.SMOOTH_RED_SANDSTONE);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.RED_SANDSTONE_BRICKS,4)
                        .pattern("##")
                        .pattern("##")
                        .define('#', Blocks.SMOOTH_RED_SANDSTONE)
                        .unlockedBy(getHasName(ChiseledBlocks.RED_SANDSTONE_BRICKS), has(Blocks.SMOOTH_RED_SANDSTONE))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.RED_SANDSTONE_BRICKS, Blocks.SMOOTH_RED_SANDSTONE);
                stairBuilder(ChiseledBlocks.RED_SANDSTONE_BRICK_STAIRS, Ingredient.of(ChiseledBlocks.RED_SANDSTONE_BRICKS))
                        .unlockedBy(getHasName(ChiseledBlocks.RED_SANDSTONE_BRICK_STAIRS), has(ChiseledBlocks.RED_SANDSTONE_BRICKS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.RED_SANDSTONE_BRICK_STAIRS, Blocks.SMOOTH_RED_SANDSTONE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.RED_SANDSTONE_BRICK_STAIRS, ChiseledBlocks.RED_SANDSTONE_BRICKS);
                slab(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.RED_SANDSTONE_BRICK_SLAB, ChiseledBlocks.RED_SANDSTONE_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.RED_SANDSTONE_BRICK_SLAB, Blocks.SMOOTH_RED_SANDSTONE,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.RED_SANDSTONE_BRICK_SLAB, ChiseledBlocks.RED_SANDSTONE_BRICKS,2);
                wall(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.RED_SANDSTONE_BRICK_WALL, ChiseledBlocks.RED_SANDSTONE_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.RED_SANDSTONE_BRICK_WALL, Blocks.SMOOTH_RED_SANDSTONE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.RED_SANDSTONE_BRICK_WALL, ChiseledBlocks.RED_SANDSTONE_BRICKS);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_RED_SANDSTONE_BRICKS)
                        .pattern("#")
                        .pattern("#")
                        .define('#', Blocks.SMOOTH_RED_SANDSTONE_SLAB)
                        .unlockedBy(getHasName(ChiseledBlocks.CUT_RED_SANDSTONE_BRICKS), has(Blocks.SMOOTH_RED_SANDSTONE))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_RED_SANDSTONE_BRICKS, Blocks.SMOOTH_RED_SANDSTONE);
                stairBuilder(ChiseledBlocks.CUT_RED_SANDSTONE_BRICK_STAIRS, Ingredient.of(ChiseledBlocks.CUT_RED_SANDSTONE_BRICKS))
                        .unlockedBy(getHasName(ChiseledBlocks.CUT_RED_SANDSTONE_BRICK_STAIRS), has(ChiseledBlocks.CUT_RED_SANDSTONE_BRICKS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_RED_SANDSTONE_BRICK_STAIRS, Blocks.SMOOTH_RED_SANDSTONE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_RED_SANDSTONE_BRICK_STAIRS, ChiseledBlocks.CUT_RED_SANDSTONE_BRICKS);
                slab(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_RED_SANDSTONE_BRICK_SLAB, ChiseledBlocks.CUT_RED_SANDSTONE_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_RED_SANDSTONE_BRICK_SLAB, Blocks.SMOOTH_RED_SANDSTONE,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_RED_SANDSTONE_BRICK_SLAB, ChiseledBlocks.CUT_RED_SANDSTONE_BRICKS,2);

                stairBuilder(ChiseledBlocks.HONEYCOMB_STAIRS, Ingredient.of(Blocks.HONEYCOMB_BLOCK))
                        .unlockedBy(getHasName(ChiseledBlocks.HONEYCOMB_STAIRS), has(Blocks.HONEYCOMB_BLOCK))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.HONEYCOMB_STAIRS, Blocks.HONEYCOMB_BLOCK);
                slab(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.HONEYCOMB_SLAB, Blocks.HONEYCOMB_BLOCK);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.HONEYCOMB_SLAB, Blocks.HONEYCOMB_BLOCK,2);
                wall(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.HONEYCOMB_WALL, Blocks.HONEYCOMB_BLOCK);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.HONEYCOMB_WALL, Blocks.HONEYCOMB_BLOCK);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.HONEYCOMB_BRICKS,4)
                        .pattern("##")
                        .pattern("##")
                        .define('#', Blocks.HONEYCOMB_BLOCK)
                        .unlockedBy(getHasName(ChiseledBlocks.HONEYCOMB_BRICKS), has(Blocks.HONEYCOMB_BLOCK))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.HONEYCOMB_BRICKS, Blocks.HONEYCOMB_BLOCK);
                stairBuilder(ChiseledBlocks.HONEYCOMB_BRICK_STAIRS, Ingredient.of(ChiseledBlocks.HONEYCOMB_BRICKS))
                        .unlockedBy(getHasName(ChiseledBlocks.HONEYCOMB_BRICK_STAIRS), has(ChiseledBlocks.HONEYCOMB_BRICKS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.HONEYCOMB_BRICK_STAIRS, Blocks.HONEYCOMB_BLOCK);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.HONEYCOMB_BRICK_STAIRS, ChiseledBlocks.HONEYCOMB_BRICKS);
                slab(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.HONEYCOMB_BRICK_SLAB, ChiseledBlocks.HONEYCOMB_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.HONEYCOMB_BRICK_SLAB, Blocks.HONEYCOMB_BLOCK,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.HONEYCOMB_BRICK_SLAB, ChiseledBlocks.HONEYCOMB_BRICKS,2);
                wall(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.HONEYCOMB_BRICK_WALL, ChiseledBlocks.HONEYCOMB_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.HONEYCOMB_BRICK_WALL, Blocks.HONEYCOMB_BLOCK);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.HONEYCOMB_BRICK_WALL, ChiseledBlocks.HONEYCOMB_BRICKS);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_HONEYCOMB_BRICKS)
                        .pattern("#")
                        .pattern("#")
                        .define('#', ChiseledBlocks.HONEYCOMB_SLAB)
                        .unlockedBy(getHasName(ChiseledBlocks.CUT_HONEYCOMB_BRICKS), has(Blocks.HONEYCOMB_BLOCK))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_HONEYCOMB_BRICKS, Blocks.HONEYCOMB_BLOCK);
                stairBuilder(ChiseledBlocks.CUT_HONEYCOMB_BRICK_STAIRS, Ingredient.of(ChiseledBlocks.CUT_HONEYCOMB_BRICKS))
                        .unlockedBy(getHasName(ChiseledBlocks.CUT_HONEYCOMB_BRICK_STAIRS), has(ChiseledBlocks.CUT_HONEYCOMB_BRICKS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_HONEYCOMB_BRICK_STAIRS, Blocks.HONEYCOMB_BLOCK);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_HONEYCOMB_BRICK_STAIRS, ChiseledBlocks.CUT_HONEYCOMB_BRICKS);
                slab(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_HONEYCOMB_BRICK_SLAB, ChiseledBlocks.CUT_HONEYCOMB_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_HONEYCOMB_BRICK_SLAB, Blocks.HONEYCOMB_BLOCK,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_HONEYCOMB_BRICK_SLAB, ChiseledBlocks.CUT_HONEYCOMB_BRICKS,2);
            }
        };
    }

    @Override
    public String getName() {
        return "RecipeGen";
    }
}