package net.hyper.chiseled.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.hyper.chiseled.registry.ChiseledBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.item.crafting.CookingBookCategory;
import net.minecraft.world.level.block.Blocks;

import java.util.List;
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
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.STONE_WALL, 6)
                        .pattern("   ")
                        .pattern("###")
                        .pattern("###")
                        .define('#', Blocks.STONE)
                        .unlockedBy(getHasName(ChiseledBlocks.STONE_WALL), has(Blocks.STONE))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.STONE_WALL, Blocks.STONE);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_STONE, 4)
                        .pattern("## ")
                        .pattern("## ")
                        .pattern("   ")
                        .define('#', Blocks.STONE)
                        .unlockedBy(getHasName(ChiseledBlocks.POLISHED_STONE), has(Blocks.STONE))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_STONE, Blocks.STONE);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_STONE_STAIRS, 4)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .define('#', ChiseledBlocks.POLISHED_STONE)
                        .unlockedBy(getHasName(ChiseledBlocks.POLISHED_STONE_STAIRS), has(ChiseledBlocks.POLISHED_STONE))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_STONE_STAIRS, Blocks.STONE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_STONE_STAIRS, ChiseledBlocks.POLISHED_STONE);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_STONE_SLAB, 6)
                        .pattern("   ")
                        .pattern("###")
                        .pattern("   ")
                        .define('#', ChiseledBlocks.POLISHED_STONE)
                        .unlockedBy(getHasName(ChiseledBlocks.POLISHED_STONE_SLAB), has(ChiseledBlocks.POLISHED_STONE))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_STONE_SLAB, Blocks.STONE,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_STONE_SLAB, ChiseledBlocks.POLISHED_STONE,2);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_STONE_WALL, 6)
                        .pattern("   ")
                        .pattern("###")
                        .pattern("###")
                        .define('#', ChiseledBlocks.POLISHED_STONE)
                        .unlockedBy(getHasName(ChiseledBlocks.POLISHED_STONE_WALL), has(ChiseledBlocks.POLISHED_STONE))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_STONE_WALL, Blocks.STONE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_STONE_WALL, ChiseledBlocks.POLISHED_STONE);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.SMOOTH_STONE_STAIRS, 4)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .define('#', Blocks.SMOOTH_STONE)
                        .unlockedBy(getHasName(ChiseledBlocks.SMOOTH_STONE_STAIRS), has(Blocks.SMOOTH_STONE))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.SMOOTH_STONE_STAIRS, Blocks.SMOOTH_STONE);
                shaped(RecipeCategory.BUILDING_BLOCKS, Blocks.STONE_BRICKS, 4)
                        .pattern("## ")
                        .pattern("## ")
                        .pattern("   ")
                        .define('#', ChiseledBlocks.POLISHED_STONE)
                        .unlockedBy(getHasName(Blocks.STONE_BRICKS), has(ChiseledBlocks.POLISHED_STONE))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, Blocks.STONE_BRICKS, ChiseledBlocks.POLISHED_STONE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, Blocks.STONE_BRICK_STAIRS, ChiseledBlocks.POLISHED_STONE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, Blocks.STONE_BRICK_SLAB, ChiseledBlocks.POLISHED_STONE, 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, Blocks.STONE_BRICK_WALL, ChiseledBlocks.POLISHED_STONE);
                shapeless(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MOSSY_CHISELED_STONE_BRICKS)
                        .requires(Blocks.CHISELED_STONE_BRICKS)
                        .requires(Blocks.MOSS_BLOCK)
                        .unlockedBy(getHasName(ChiseledBlocks.MOSSY_CHISELED_STONE_BRICKS), has(Blocks.CHISELED_STONE_BRICKS))
                        .save(output, "mossy_chiseled_stone_bricks_from_moss");
                shapeless(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MOSSY_CHISELED_STONE_BRICKS)
                        .requires(Blocks.CHISELED_STONE_BRICKS)
                        .requires(Blocks.VINE)
                        .unlockedBy(getHasName(ChiseledBlocks.MOSSY_CHISELED_STONE_BRICKS), has(Blocks.CHISELED_STONE_BRICKS))
                        .save(output, "mossy_chiseled_stone_bricks_from_vine");
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_STONE_BRICKS)
                        .pattern(" # ")
                        .pattern(" # ")
                        .pattern("   ")
                        .define('#', ChiseledBlocks.POLISHED_STONE_SLAB)
                        .unlockedBy(getHasName(ChiseledBlocks.CUT_STONE_BRICKS), has(ChiseledBlocks.POLISHED_STONE_SLAB))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_STONE_BRICKS, Blocks.STONE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_STONE_BRICKS, ChiseledBlocks.POLISHED_STONE);
                oreSmelting(List.of(ChiseledBlocks.CUT_STONE_BRICKS), RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS, ChiseledBlocks.CRACKED_CUT_STONE_BRICKS, 0.1f, 200, "cracked_cut_stone_bricks");
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_STONE_BRICK_STAIRS, 4)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .define('#', ChiseledBlocks.CUT_STONE_BRICKS)
                        .unlockedBy(getHasName(ChiseledBlocks.CUT_STONE_BRICK_STAIRS), has(ChiseledBlocks.CUT_STONE_BRICKS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_STONE_BRICK_STAIRS, Blocks.STONE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_STONE_BRICK_STAIRS, ChiseledBlocks.POLISHED_STONE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_STONE_BRICK_STAIRS, ChiseledBlocks.CUT_STONE_BRICKS);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_STONE_BRICK_SLAB, 6)
                        .pattern("   ")
                        .pattern("###")
                        .pattern("   ")
                        .define('#', ChiseledBlocks.CUT_STONE_BRICKS)
                        .unlockedBy(getHasName(ChiseledBlocks.CUT_STONE_BRICK_SLAB), has(ChiseledBlocks.CUT_STONE_BRICKS))
                        .save(output);
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
                        .save(output, "mossy_cut_bricks_stone_from_vine");
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MOSSY_CUT_STONE_BRICK_STAIRS, 4)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .define('#', ChiseledBlocks.MOSSY_CUT_STONE_BRICKS)
                        .unlockedBy(getHasName(ChiseledBlocks.MOSSY_CUT_STONE_BRICK_STAIRS), has(ChiseledBlocks.MOSSY_CUT_STONE_BRICKS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MOSSY_CUT_STONE_BRICK_STAIRS, ChiseledBlocks.MOSSY_CUT_STONE_BRICKS);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MOSSY_CUT_STONE_BRICK_SLAB, 6)
                        .pattern("   ")
                        .pattern("###")
                        .pattern("   ")
                        .define('#', ChiseledBlocks.MOSSY_CUT_STONE_BRICKS)
                        .unlockedBy(getHasName(ChiseledBlocks.MOSSY_CUT_STONE_BRICK_SLAB), has(ChiseledBlocks.MOSSY_CUT_STONE_BRICKS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MOSSY_CUT_STONE_BRICK_SLAB, ChiseledBlocks.MOSSY_CUT_STONE_BRICKS,2);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.STONE_TILES, 4)
                        .pattern("## ")
                        .pattern("## ")
                        .pattern("   ")
                        .define('#', Blocks.STONE_BRICKS)
                        .unlockedBy(getHasName(ChiseledBlocks.STONE_TILES), has(Blocks.STONE_BRICKS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.STONE_TILES, Blocks.STONE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.STONE_TILES, ChiseledBlocks.POLISHED_STONE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.STONE_TILES, Blocks.STONE_BRICKS);
                oreSmelting(List.of(ChiseledBlocks.STONE_TILES), RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS, ChiseledBlocks.CRACKED_STONE_TILES, 0.1f, 200, "cracked_stone_tiles");
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.STONE_TILE_STAIRS, 4)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .define('#', ChiseledBlocks.STONE_TILES)
                        .unlockedBy(getHasName(ChiseledBlocks.STONE_TILE_STAIRS), has(ChiseledBlocks.STONE_TILES))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.STONE_TILE_STAIRS, Blocks.STONE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.STONE_TILE_STAIRS, ChiseledBlocks.POLISHED_STONE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.STONE_TILE_STAIRS, Blocks.STONE_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.STONE_TILE_STAIRS, ChiseledBlocks.STONE_TILES);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.STONE_TILE_SLAB, 6)
                        .pattern("   ")
                        .pattern("###")
                        .pattern("   ")
                        .define('#', ChiseledBlocks.STONE_TILES)
                        .unlockedBy(getHasName(ChiseledBlocks.STONE_TILE_SLAB), has(ChiseledBlocks.STONE_TILES))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.STONE_TILE_SLAB, Blocks.STONE,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.STONE_TILE_SLAB, ChiseledBlocks.POLISHED_STONE,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.STONE_TILE_SLAB, Blocks.STONE_BRICKS,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.STONE_TILE_SLAB, ChiseledBlocks.STONE_TILES,2);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.STONE_TILE_WALL, 6)
                        .pattern("   ")
                        .pattern("###")
                        .pattern("###")
                        .define('#', ChiseledBlocks.STONE_TILES)
                        .unlockedBy(getHasName(ChiseledBlocks.STONE_TILE_WALL), has(ChiseledBlocks.STONE_TILES))
                        .save(output);
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
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MOSSY_STONE_TILE_STAIRS, 4)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .define('#', ChiseledBlocks.MOSSY_STONE_TILES)
                        .unlockedBy(getHasName(ChiseledBlocks.MOSSY_STONE_TILE_STAIRS), has(ChiseledBlocks.MOSSY_STONE_TILES))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MOSSY_STONE_TILE_STAIRS, ChiseledBlocks.MOSSY_STONE_TILES);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MOSSY_STONE_TILE_SLAB, 6)
                        .pattern("   ")
                        .pattern("###")
                        .pattern("   ")
                        .define('#', ChiseledBlocks.MOSSY_STONE_TILES)
                        .unlockedBy(getHasName(ChiseledBlocks.MOSSY_STONE_TILE_SLAB), has(ChiseledBlocks.MOSSY_STONE_TILES))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MOSSY_STONE_TILE_SLAB, ChiseledBlocks.MOSSY_STONE_TILES,2);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MOSSY_STONE_TILE_WALL, 6)
                        .pattern("   ")
                        .pattern("###")
                        .pattern("###")
                        .define('#', ChiseledBlocks.MOSSY_STONE_TILES)
                        .unlockedBy(getHasName(ChiseledBlocks.MOSSY_STONE_TILE_WALL), has(ChiseledBlocks.MOSSY_STONE_TILES))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MOSSY_STONE_TILE_WALL, ChiseledBlocks.MOSSY_STONE_TILES);

                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_GRANITE_WALL, 6)
                        .pattern("   ")
                        .pattern("###")
                        .pattern("###")
                        .define('#', Blocks.POLISHED_GRANITE)
                        .unlockedBy(getHasName(ChiseledBlocks.POLISHED_GRANITE_WALL), has(Blocks.POLISHED_GRANITE))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_GRANITE_WALL, Blocks.GRANITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_GRANITE_WALL, Blocks.POLISHED_GRANITE);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_GRANITE_BRICKS, 4)
                        .pattern("## ")
                        .pattern("## ")
                        .pattern("   ")
                        .define('#', Blocks.POLISHED_GRANITE)
                        .unlockedBy(getHasName(ChiseledBlocks.POLISHED_GRANITE_BRICKS), has(Blocks.POLISHED_GRANITE))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_GRANITE_BRICKS, Blocks.GRANITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_GRANITE_BRICKS, Blocks.POLISHED_GRANITE);
                oreSmelting(List.of(ChiseledBlocks.POLISHED_GRANITE_BRICKS), RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS, ChiseledBlocks.CRACKED_POLISHED_GRANITE_BRICKS, 0.1f, 200, "cracked_polished_granite_bricks");
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_GRANITE_BRICK_STAIRS, 4)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .define('#', ChiseledBlocks.POLISHED_GRANITE_BRICKS)
                        .unlockedBy(getHasName(ChiseledBlocks.POLISHED_GRANITE_BRICK_STAIRS), has(ChiseledBlocks.POLISHED_GRANITE_BRICKS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_GRANITE_BRICK_STAIRS, Blocks.GRANITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_GRANITE_BRICK_STAIRS, Blocks.POLISHED_GRANITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_GRANITE_BRICK_STAIRS, ChiseledBlocks.POLISHED_GRANITE_BRICKS);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_GRANITE_BRICK_SLAB, 6)
                        .pattern("   ")
                        .pattern("###")
                        .pattern("   ")
                        .define('#', ChiseledBlocks.POLISHED_GRANITE_BRICKS)
                        .unlockedBy(getHasName(ChiseledBlocks.POLISHED_GRANITE_BRICK_SLAB), has(ChiseledBlocks.POLISHED_GRANITE_BRICKS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_GRANITE_BRICK_SLAB, Blocks.GRANITE,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_GRANITE_BRICK_SLAB, Blocks.POLISHED_GRANITE,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_GRANITE_BRICK_SLAB, ChiseledBlocks.POLISHED_GRANITE_BRICKS,2);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_GRANITE_BRICK_WALL, 6)
                        .pattern("   ")
                        .pattern("###")
                        .pattern("###")
                        .define('#', ChiseledBlocks.POLISHED_GRANITE_BRICKS)
                        .unlockedBy(getHasName(ChiseledBlocks.POLISHED_GRANITE_BRICK_WALL), has(ChiseledBlocks.POLISHED_GRANITE_BRICKS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_GRANITE_BRICK_WALL, Blocks.GRANITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_GRANITE_BRICK_WALL, Blocks.POLISHED_GRANITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_GRANITE_BRICK_WALL, ChiseledBlocks.POLISHED_GRANITE_BRICKS);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_POLISHED_GRANITE_BRICKS)
                        .pattern(" # ")
                        .pattern(" # ")
                        .pattern("   ")
                        .define('#', Blocks.POLISHED_GRANITE_SLAB)
                        .unlockedBy(getHasName(ChiseledBlocks.CUT_POLISHED_GRANITE_BRICKS), has(Blocks.POLISHED_GRANITE_SLAB))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_POLISHED_GRANITE_BRICKS, Blocks.GRANITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_POLISHED_GRANITE_BRICKS, Blocks.POLISHED_GRANITE);
                oreSmelting(List.of(ChiseledBlocks.CUT_POLISHED_GRANITE_BRICKS), RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS, ChiseledBlocks.CRACKED_CUT_POLISHED_GRANITE_BRICKS, 0.1f, 200, "cracked_cut_polished_granite_bricks");
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_POLISHED_GRANITE_BRICK_STAIRS, 4)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .define('#', ChiseledBlocks.CUT_POLISHED_GRANITE_BRICKS)
                        .unlockedBy(getHasName(ChiseledBlocks.CUT_POLISHED_GRANITE_BRICK_STAIRS), has(ChiseledBlocks.CUT_POLISHED_GRANITE_BRICKS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_POLISHED_GRANITE_BRICK_STAIRS, Blocks.GRANITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_POLISHED_GRANITE_BRICK_STAIRS, Blocks.POLISHED_GRANITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_POLISHED_GRANITE_BRICK_STAIRS, ChiseledBlocks.CUT_POLISHED_GRANITE_BRICKS);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_POLISHED_GRANITE_BRICK_SLAB, 6)
                        .pattern("   ")
                        .pattern("###")
                        .pattern("   ")
                        .define('#', ChiseledBlocks.CUT_POLISHED_GRANITE_BRICKS)
                        .unlockedBy(getHasName(ChiseledBlocks.CUT_POLISHED_GRANITE_BRICK_SLAB), has(ChiseledBlocks.CUT_POLISHED_GRANITE_BRICKS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_POLISHED_GRANITE_BRICK_SLAB, Blocks.GRANITE,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_POLISHED_GRANITE_BRICK_SLAB, Blocks.POLISHED_GRANITE,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_POLISHED_GRANITE_BRICK_SLAB, ChiseledBlocks.CUT_POLISHED_GRANITE_BRICKS,2);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_GRANITE_TILES, 4)
                        .pattern("## ")
                        .pattern("## ")
                        .pattern("   ")
                        .define('#', ChiseledBlocks.POLISHED_GRANITE_BRICKS)
                        .unlockedBy(getHasName(ChiseledBlocks.POLISHED_GRANITE_TILES), has(Blocks.POLISHED_GRANITE))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_GRANITE_TILES, Blocks.GRANITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_GRANITE_TILES, Blocks.POLISHED_GRANITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_GRANITE_TILES, ChiseledBlocks.POLISHED_GRANITE_BRICKS);
                oreSmelting(List.of(ChiseledBlocks.POLISHED_GRANITE_TILES), RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS, ChiseledBlocks.CRACKED_POLISHED_GRANITE_TILES, 0.1f, 200, "cracked_polished_granite_tiles");
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_GRANITE_TILE_STAIRS, 4)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .define('#', ChiseledBlocks.POLISHED_GRANITE_TILES)
                        .unlockedBy(getHasName(ChiseledBlocks.POLISHED_GRANITE_TILE_STAIRS), has(ChiseledBlocks.POLISHED_GRANITE_TILES))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_GRANITE_TILE_STAIRS, Blocks.GRANITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_GRANITE_TILE_STAIRS, Blocks.POLISHED_GRANITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_GRANITE_TILE_STAIRS, ChiseledBlocks.POLISHED_GRANITE_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_GRANITE_TILE_STAIRS, ChiseledBlocks.POLISHED_GRANITE_TILES);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_GRANITE_TILE_SLAB, 6)
                        .pattern("   ")
                        .pattern("###")
                        .pattern("   ")
                        .define('#', ChiseledBlocks.POLISHED_GRANITE_TILES)
                        .unlockedBy(getHasName(ChiseledBlocks.POLISHED_GRANITE_TILE_SLAB), has(ChiseledBlocks.POLISHED_GRANITE_TILES))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_GRANITE_TILE_SLAB, Blocks.GRANITE,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_GRANITE_TILE_SLAB, Blocks.POLISHED_GRANITE,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_GRANITE_TILE_SLAB, ChiseledBlocks.POLISHED_GRANITE_BRICKS, 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_GRANITE_TILE_SLAB, ChiseledBlocks.POLISHED_GRANITE_TILES,2);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_GRANITE_TILE_WALL, 6)
                        .pattern("   ")
                        .pattern("###")
                        .pattern("###")
                        .define('#', ChiseledBlocks.POLISHED_GRANITE_TILES)
                        .unlockedBy(getHasName(ChiseledBlocks.POLISHED_GRANITE_TILE_WALL), has(ChiseledBlocks.POLISHED_GRANITE_TILES))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_GRANITE_TILE_WALL, Blocks.GRANITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_GRANITE_TILE_WALL, Blocks.POLISHED_GRANITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_GRANITE_TILE_WALL, ChiseledBlocks.POLISHED_GRANITE_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_GRANITE_TILE_WALL, ChiseledBlocks.POLISHED_GRANITE_TILES);

                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_DIORITE_WALL, 6)
                        .pattern("   ")
                        .pattern("###")
                        .pattern("###")
                        .define('#', Blocks.POLISHED_DIORITE)
                        .unlockedBy(getHasName(ChiseledBlocks.POLISHED_DIORITE_WALL), has(Blocks.POLISHED_DIORITE))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_DIORITE_WALL, Blocks.DIORITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_DIORITE_WALL, Blocks.POLISHED_DIORITE);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_DIORITE_BRICKS, 4)
                        .pattern("## ")
                        .pattern("## ")
                        .pattern("   ")
                        .define('#', Blocks.POLISHED_DIORITE)
                        .unlockedBy(getHasName(ChiseledBlocks.POLISHED_DIORITE_BRICKS), has(Blocks.POLISHED_DIORITE))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_DIORITE_BRICKS, Blocks.DIORITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_DIORITE_BRICKS, Blocks.POLISHED_DIORITE);
                oreSmelting(List.of(ChiseledBlocks.POLISHED_DIORITE_BRICKS), RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS, ChiseledBlocks.CRACKED_POLISHED_DIORITE_BRICKS, 0.1f, 200, "cracked_polished_diorite_bricks");
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_DIORITE_BRICK_STAIRS, 4)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .define('#', ChiseledBlocks.POLISHED_DIORITE_BRICKS)
                        .unlockedBy(getHasName(ChiseledBlocks.POLISHED_DIORITE_BRICK_STAIRS), has(ChiseledBlocks.POLISHED_DIORITE_BRICKS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_DIORITE_BRICK_STAIRS, Blocks.DIORITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_DIORITE_BRICK_STAIRS, Blocks.POLISHED_DIORITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_DIORITE_BRICK_STAIRS, ChiseledBlocks.POLISHED_DIORITE_BRICKS);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_DIORITE_BRICK_SLAB, 6)
                        .pattern("   ")
                        .pattern("###")
                        .pattern("   ")
                        .define('#', ChiseledBlocks.POLISHED_DIORITE_BRICKS)
                        .unlockedBy(getHasName(ChiseledBlocks.POLISHED_DIORITE_BRICK_SLAB), has(ChiseledBlocks.POLISHED_DIORITE_BRICKS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_DIORITE_BRICK_SLAB, Blocks.DIORITE,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_DIORITE_BRICK_SLAB, Blocks.POLISHED_DIORITE,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_DIORITE_BRICK_SLAB, ChiseledBlocks.POLISHED_DIORITE_BRICKS,2);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_DIORITE_BRICK_WALL, 6)
                        .pattern("   ")
                        .pattern("###")
                        .pattern("###")
                        .define('#', ChiseledBlocks.POLISHED_DIORITE_BRICKS)
                        .unlockedBy(getHasName(ChiseledBlocks.POLISHED_DIORITE_BRICK_WALL), has(ChiseledBlocks.POLISHED_DIORITE_BRICKS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_DIORITE_BRICK_WALL, Blocks.DIORITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_DIORITE_BRICK_WALL, Blocks.POLISHED_DIORITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_DIORITE_BRICK_WALL, ChiseledBlocks.POLISHED_DIORITE_BRICKS);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_POLISHED_DIORITE_BRICKS)
                        .pattern(" # ")
                        .pattern(" # ")
                        .pattern("   ")
                        .define('#', Blocks.POLISHED_DIORITE_SLAB)
                        .unlockedBy(getHasName(ChiseledBlocks.CUT_POLISHED_DIORITE_BRICKS), has(Blocks.POLISHED_DIORITE_SLAB))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_POLISHED_DIORITE_BRICKS, Blocks.DIORITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_POLISHED_DIORITE_BRICKS, Blocks.POLISHED_DIORITE);
                oreSmelting(List.of(ChiseledBlocks.CUT_POLISHED_DIORITE_BRICKS), RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS, ChiseledBlocks.CRACKED_CUT_POLISHED_DIORITE_BRICKS, 0.1f, 200, "cracked_cut_polished_diorite_bricks");
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_POLISHED_DIORITE_BRICK_STAIRS, 4)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .define('#', ChiseledBlocks.CUT_POLISHED_DIORITE_BRICKS)
                        .unlockedBy(getHasName(ChiseledBlocks.CUT_POLISHED_DIORITE_BRICK_STAIRS), has(ChiseledBlocks.CUT_POLISHED_DIORITE_BRICKS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_POLISHED_DIORITE_BRICK_STAIRS, Blocks.DIORITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_POLISHED_DIORITE_BRICK_STAIRS, Blocks.POLISHED_DIORITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_POLISHED_DIORITE_BRICK_STAIRS, ChiseledBlocks.CUT_POLISHED_DIORITE_BRICKS);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_POLISHED_DIORITE_BRICK_SLAB, 6)
                        .pattern("   ")
                        .pattern("###")
                        .pattern("   ")
                        .define('#', ChiseledBlocks.CUT_POLISHED_DIORITE_BRICKS)
                        .unlockedBy(getHasName(ChiseledBlocks.CUT_POLISHED_DIORITE_BRICK_SLAB), has(ChiseledBlocks.CUT_POLISHED_DIORITE_BRICKS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_POLISHED_DIORITE_BRICK_SLAB, Blocks.DIORITE,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_POLISHED_DIORITE_BRICK_SLAB, Blocks.POLISHED_DIORITE,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_POLISHED_DIORITE_BRICK_SLAB, ChiseledBlocks.CUT_POLISHED_DIORITE_BRICKS,2);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_DIORITE_TILES, 4)
                        .pattern("## ")
                        .pattern("## ")
                        .pattern("   ")
                        .define('#', ChiseledBlocks.POLISHED_DIORITE_BRICKS)
                        .unlockedBy(getHasName(ChiseledBlocks.POLISHED_DIORITE_TILES), has(Blocks.POLISHED_DIORITE))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_DIORITE_TILES, Blocks.DIORITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_DIORITE_TILES, Blocks.POLISHED_DIORITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_DIORITE_TILES, ChiseledBlocks.POLISHED_DIORITE_BRICKS);
                oreSmelting(List.of(ChiseledBlocks.POLISHED_DIORITE_TILES), RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS, ChiseledBlocks.CRACKED_POLISHED_DIORITE_TILES, 0.1f, 200, "cracked_polished_diorite_tiles");
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_DIORITE_TILE_STAIRS, 4)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .define('#', ChiseledBlocks.POLISHED_DIORITE_TILES)
                        .unlockedBy(getHasName(ChiseledBlocks.POLISHED_DIORITE_TILE_STAIRS), has(ChiseledBlocks.POLISHED_DIORITE_TILES))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_DIORITE_TILE_STAIRS, Blocks.DIORITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_DIORITE_TILE_STAIRS, Blocks.POLISHED_DIORITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_DIORITE_TILE_STAIRS, ChiseledBlocks.POLISHED_DIORITE_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_DIORITE_TILE_STAIRS, ChiseledBlocks.POLISHED_DIORITE_TILES);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_DIORITE_TILE_SLAB, 6)
                        .pattern("   ")
                        .pattern("###")
                        .pattern("   ")
                        .define('#', ChiseledBlocks.POLISHED_DIORITE_TILES)
                        .unlockedBy(getHasName(ChiseledBlocks.POLISHED_DIORITE_TILE_SLAB), has(ChiseledBlocks.POLISHED_DIORITE_TILES))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_DIORITE_TILE_SLAB, Blocks.DIORITE,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_DIORITE_TILE_SLAB, Blocks.POLISHED_DIORITE,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_DIORITE_TILE_SLAB, ChiseledBlocks.POLISHED_DIORITE_BRICKS, 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_DIORITE_TILE_SLAB, ChiseledBlocks.POLISHED_DIORITE_TILES,2);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_DIORITE_TILE_WALL, 6)
                        .pattern("   ")
                        .pattern("###")
                        .pattern("###")
                        .define('#', ChiseledBlocks.POLISHED_DIORITE_TILES)
                        .unlockedBy(getHasName(ChiseledBlocks.POLISHED_DIORITE_TILE_WALL), has(ChiseledBlocks.POLISHED_DIORITE_TILES))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_DIORITE_TILE_WALL, Blocks.DIORITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_DIORITE_TILE_WALL, Blocks.POLISHED_DIORITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_DIORITE_TILE_WALL, ChiseledBlocks.POLISHED_DIORITE_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_DIORITE_TILE_WALL, ChiseledBlocks.POLISHED_DIORITE_TILES);

                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_ANDESITE_WALL, 6)
                        .pattern("   ")
                        .pattern("###")
                        .pattern("###")
                        .define('#', Blocks.POLISHED_ANDESITE)
                        .unlockedBy(getHasName(ChiseledBlocks.POLISHED_ANDESITE_WALL), has(Blocks.POLISHED_ANDESITE))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_ANDESITE_WALL, Blocks.ANDESITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_ANDESITE_WALL, Blocks.POLISHED_ANDESITE);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_ANDESITE_BRICKS, 4)
                        .pattern("## ")
                        .pattern("## ")
                        .pattern("   ")
                        .define('#', Blocks.POLISHED_ANDESITE)
                        .unlockedBy(getHasName(ChiseledBlocks.POLISHED_ANDESITE_BRICKS), has(Blocks.POLISHED_ANDESITE))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_ANDESITE_BRICKS, Blocks.ANDESITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_ANDESITE_BRICKS, Blocks.POLISHED_ANDESITE);
                oreSmelting(List.of(ChiseledBlocks.POLISHED_ANDESITE_BRICKS), RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS, ChiseledBlocks.CRACKED_POLISHED_ANDESITE_BRICKS, 0.1f, 200, "cracked_polished_andesite_bricks");
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_ANDESITE_BRICK_STAIRS, 4)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .define('#', ChiseledBlocks.POLISHED_ANDESITE_BRICKS)
                        .unlockedBy(getHasName(ChiseledBlocks.POLISHED_ANDESITE_BRICK_STAIRS), has(ChiseledBlocks.POLISHED_ANDESITE_BRICKS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_ANDESITE_BRICK_STAIRS, Blocks.ANDESITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_ANDESITE_BRICK_STAIRS, Blocks.POLISHED_ANDESITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_ANDESITE_BRICK_STAIRS, ChiseledBlocks.POLISHED_ANDESITE_BRICKS);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_ANDESITE_BRICK_SLAB, 6)
                        .pattern("   ")
                        .pattern("###")
                        .pattern("   ")
                        .define('#', ChiseledBlocks.POLISHED_ANDESITE_BRICKS)
                        .unlockedBy(getHasName(ChiseledBlocks.POLISHED_ANDESITE_BRICK_SLAB), has(ChiseledBlocks.POLISHED_ANDESITE_BRICKS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_ANDESITE_BRICK_SLAB, Blocks.ANDESITE,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_ANDESITE_BRICK_SLAB, Blocks.POLISHED_ANDESITE,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_ANDESITE_BRICK_SLAB, ChiseledBlocks.POLISHED_ANDESITE_BRICKS,2);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_ANDESITE_BRICK_WALL, 6)
                        .pattern("   ")
                        .pattern("###")
                        .pattern("###")
                        .define('#', ChiseledBlocks.POLISHED_ANDESITE_BRICKS)
                        .unlockedBy(getHasName(ChiseledBlocks.POLISHED_ANDESITE_BRICK_WALL), has(ChiseledBlocks.POLISHED_ANDESITE_BRICKS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_ANDESITE_BRICK_WALL, Blocks.ANDESITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_ANDESITE_BRICK_WALL, Blocks.POLISHED_ANDESITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_ANDESITE_BRICK_WALL, ChiseledBlocks.POLISHED_ANDESITE_BRICKS);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_POLISHED_ANDESITE_BRICKS)
                        .pattern(" # ")
                        .pattern(" # ")
                        .pattern("   ")
                        .define('#', Blocks.POLISHED_ANDESITE_SLAB)
                        .unlockedBy(getHasName(ChiseledBlocks.CUT_POLISHED_ANDESITE_BRICKS), has(Blocks.POLISHED_ANDESITE_SLAB))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_POLISHED_ANDESITE_BRICKS, Blocks.ANDESITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_POLISHED_ANDESITE_BRICKS, Blocks.POLISHED_ANDESITE);
                oreSmelting(List.of(ChiseledBlocks.CUT_POLISHED_ANDESITE_BRICKS), RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS, ChiseledBlocks.CRACKED_CUT_POLISHED_ANDESITE_BRICKS, 0.1f, 200, "cracked_cut_polished_andesite_bricks");
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_POLISHED_ANDESITE_BRICK_STAIRS, 4)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .define('#', ChiseledBlocks.CUT_POLISHED_ANDESITE_BRICKS)
                        .unlockedBy(getHasName(ChiseledBlocks.CUT_POLISHED_ANDESITE_BRICK_STAIRS), has(ChiseledBlocks.CUT_POLISHED_ANDESITE_BRICKS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_POLISHED_ANDESITE_BRICK_STAIRS, Blocks.ANDESITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_POLISHED_ANDESITE_BRICK_STAIRS, Blocks.POLISHED_ANDESITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_POLISHED_ANDESITE_BRICK_STAIRS, ChiseledBlocks.CUT_POLISHED_ANDESITE_BRICKS);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_POLISHED_ANDESITE_BRICK_SLAB, 6)
                        .pattern("   ")
                        .pattern("###")
                        .pattern("   ")
                        .define('#', ChiseledBlocks.CUT_POLISHED_ANDESITE_BRICKS)
                        .unlockedBy(getHasName(ChiseledBlocks.CUT_POLISHED_ANDESITE_BRICK_SLAB), has(ChiseledBlocks.CUT_POLISHED_ANDESITE_BRICKS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_POLISHED_ANDESITE_BRICK_SLAB, Blocks.ANDESITE,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_POLISHED_ANDESITE_BRICK_SLAB, Blocks.POLISHED_ANDESITE,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_POLISHED_ANDESITE_BRICK_SLAB, ChiseledBlocks.CUT_POLISHED_ANDESITE_BRICKS,2);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_ANDESITE_TILES, 4)
                        .pattern("## ")
                        .pattern("## ")
                        .pattern("   ")
                        .define('#', ChiseledBlocks.POLISHED_ANDESITE_BRICKS)
                        .unlockedBy(getHasName(ChiseledBlocks.POLISHED_ANDESITE_TILES), has(Blocks.POLISHED_ANDESITE))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_ANDESITE_TILES, Blocks.ANDESITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_ANDESITE_TILES, Blocks.POLISHED_ANDESITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_ANDESITE_TILES, ChiseledBlocks.POLISHED_ANDESITE_BRICKS);
                oreSmelting(List.of(ChiseledBlocks.POLISHED_ANDESITE_TILES), RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS, ChiseledBlocks.CRACKED_POLISHED_ANDESITE_TILES, 0.1f, 200, "cracked_polished_andesite_tiles");
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_ANDESITE_TILE_STAIRS, 4)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .define('#', ChiseledBlocks.POLISHED_ANDESITE_TILES)
                        .unlockedBy(getHasName(ChiseledBlocks.POLISHED_ANDESITE_TILE_STAIRS), has(ChiseledBlocks.POLISHED_ANDESITE_TILES))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_ANDESITE_TILE_STAIRS, Blocks.ANDESITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_ANDESITE_TILE_STAIRS, Blocks.POLISHED_ANDESITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_ANDESITE_TILE_STAIRS, ChiseledBlocks.POLISHED_ANDESITE_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_ANDESITE_TILE_STAIRS, ChiseledBlocks.POLISHED_ANDESITE_TILES);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_ANDESITE_TILE_SLAB, 6)
                        .pattern("   ")
                        .pattern("###")
                        .pattern("   ")
                        .define('#', ChiseledBlocks.POLISHED_ANDESITE_TILES)
                        .unlockedBy(getHasName(ChiseledBlocks.POLISHED_ANDESITE_TILE_SLAB), has(ChiseledBlocks.POLISHED_ANDESITE_TILES))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_ANDESITE_TILE_SLAB, Blocks.ANDESITE,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_ANDESITE_TILE_SLAB, Blocks.POLISHED_ANDESITE,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_ANDESITE_TILE_SLAB, ChiseledBlocks.POLISHED_ANDESITE_BRICKS, 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_ANDESITE_TILE_SLAB, ChiseledBlocks.POLISHED_ANDESITE_TILES,2);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_ANDESITE_TILE_WALL, 6)
                        .pattern("   ")
                        .pattern("###")
                        .pattern("###")
                        .define('#', ChiseledBlocks.POLISHED_ANDESITE_TILES)
                        .unlockedBy(getHasName(ChiseledBlocks.POLISHED_ANDESITE_TILE_WALL), has(ChiseledBlocks.POLISHED_ANDESITE_TILES))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_ANDESITE_TILE_WALL, Blocks.ANDESITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_ANDESITE_TILE_WALL, Blocks.POLISHED_ANDESITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_ANDESITE_TILE_WALL, ChiseledBlocks.POLISHED_ANDESITE_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_ANDESITE_TILE_WALL, ChiseledBlocks.POLISHED_ANDESITE_TILES);

                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_DEEPSLATE_BRICKS)
                        .pattern(" # ")
                        .pattern(" # ")
                        .pattern("   ")
                        .define('#', Blocks.POLISHED_DEEPSLATE_SLAB)
                        .unlockedBy(getHasName(ChiseledBlocks.CUT_DEEPSLATE_BRICKS), has(Blocks.POLISHED_DEEPSLATE_SLAB))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_DEEPSLATE_BRICKS, Blocks.DEEPSLATE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_DEEPSLATE_BRICKS, Blocks.COBBLED_DEEPSLATE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_DEEPSLATE_BRICKS, Blocks.POLISHED_DEEPSLATE);
                oreSmelting(List.of(ChiseledBlocks.CUT_DEEPSLATE_BRICKS), RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS, ChiseledBlocks.CRACKED_CUT_DEEPSLATE_BRICKS, 0.1f, 200, "cracked_cut_deepslate_bricks");
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_DEEPSLATE_BRICK_STAIRS, 4)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .define('#', ChiseledBlocks.CUT_DEEPSLATE_BRICKS)
                        .unlockedBy(getHasName(ChiseledBlocks.CUT_DEEPSLATE_BRICK_STAIRS), has(ChiseledBlocks.CUT_DEEPSLATE_BRICKS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_DEEPSLATE_BRICK_STAIRS, Blocks.DEEPSLATE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_DEEPSLATE_BRICK_STAIRS, Blocks.COBBLED_DEEPSLATE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_DEEPSLATE_BRICK_STAIRS, Blocks.POLISHED_DEEPSLATE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_DEEPSLATE_BRICK_STAIRS, ChiseledBlocks.CUT_DEEPSLATE_BRICKS);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_DEEPSLATE_BRICK_SLAB, 6)
                        .pattern("   ")
                        .pattern("###")
                        .pattern("   ")
                        .define('#', ChiseledBlocks.CUT_DEEPSLATE_BRICKS)
                        .unlockedBy(getHasName(ChiseledBlocks.CUT_DEEPSLATE_BRICK_SLAB), has(ChiseledBlocks.CUT_DEEPSLATE_BRICKS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_DEEPSLATE_BRICK_SLAB, Blocks.DEEPSLATE,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_DEEPSLATE_BRICK_SLAB, Blocks.COBBLED_DEEPSLATE,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_DEEPSLATE_BRICK_SLAB, Blocks.POLISHED_DEEPSLATE, 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_DEEPSLATE_BRICK_SLAB, ChiseledBlocks.CUT_DEEPSLATE_BRICKS,2);

                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CALCITE_STAIRS, 4)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .define('#', Blocks.CALCITE)
                        .unlockedBy(getHasName(ChiseledBlocks.CALCITE_STAIRS), has(Blocks.CALCITE))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CALCITE_STAIRS, Blocks.CALCITE);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CALCITE_SLAB, 6)
                        .pattern("   ")
                        .pattern("###")
                        .pattern("   ")
                        .define('#', Blocks.CALCITE)
                        .unlockedBy(getHasName(ChiseledBlocks.CALCITE_SLAB), has(Blocks.CALCITE))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CALCITE_SLAB, Blocks.CALCITE,2);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CALCITE_WALL, 6)
                        .pattern("   ")
                        .pattern("###")
                        .pattern("###")
                        .define('#', Blocks.CALCITE)
                        .unlockedBy(getHasName(ChiseledBlocks.CALCITE_WALL), has(Blocks.CALCITE))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CALCITE_WALL, Blocks.CALCITE);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_CALCITE, 4)
                        .pattern("## ")
                        .pattern("## ")
                        .pattern("   ")
                        .define('#', Blocks.CALCITE)
                        .unlockedBy(getHasName(ChiseledBlocks.POLISHED_CALCITE), has(Blocks.CALCITE))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_CALCITE, Blocks.CALCITE);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_CALCITE_STAIRS, 4)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .define('#', ChiseledBlocks.POLISHED_CALCITE)
                        .unlockedBy(getHasName(ChiseledBlocks.POLISHED_CALCITE_STAIRS), has(ChiseledBlocks.POLISHED_CALCITE))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_CALCITE_STAIRS, Blocks.CALCITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_CALCITE_STAIRS, ChiseledBlocks.POLISHED_CALCITE);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_CALCITE_SLAB, 6)
                        .pattern("   ")
                        .pattern("###")
                        .pattern("   ")
                        .define('#', ChiseledBlocks.POLISHED_CALCITE)
                        .unlockedBy(getHasName(ChiseledBlocks.POLISHED_CALCITE_SLAB), has(ChiseledBlocks.POLISHED_CALCITE))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_CALCITE_SLAB, Blocks.CALCITE, 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_CALCITE_SLAB, ChiseledBlocks.POLISHED_CALCITE,2);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_CALCITE_WALL, 6)
                        .pattern("   ")
                        .pattern("###")
                        .pattern("###")
                        .define('#', ChiseledBlocks.POLISHED_CALCITE)
                        .unlockedBy(getHasName(ChiseledBlocks.POLISHED_CALCITE_WALL), has(ChiseledBlocks.POLISHED_CALCITE))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_CALCITE_WALL, Blocks.CALCITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_CALCITE_WALL, ChiseledBlocks.POLISHED_CALCITE);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CALCITE_BRICKS, 4)
                        .pattern("## ")
                        .pattern("## ")
                        .pattern("   ")
                        .define('#', ChiseledBlocks.POLISHED_CALCITE)
                        .unlockedBy(getHasName(ChiseledBlocks.CALCITE_BRICKS), has(ChiseledBlocks.POLISHED_CALCITE))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CALCITE_BRICKS, Blocks.CALCITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CALCITE_BRICKS, ChiseledBlocks.POLISHED_CALCITE);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CALCITE_BRICK_STAIRS, 4)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .define('#', ChiseledBlocks.CALCITE_BRICKS)
                        .unlockedBy(getHasName(ChiseledBlocks.CALCITE_BRICK_STAIRS), has(ChiseledBlocks.CALCITE_BRICKS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CALCITE_BRICK_STAIRS, Blocks.CALCITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CALCITE_BRICK_STAIRS, ChiseledBlocks.POLISHED_CALCITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CALCITE_BRICK_STAIRS, ChiseledBlocks.CALCITE_BRICKS);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CALCITE_BRICK_SLAB, 6)
                        .pattern("   ")
                        .pattern("###")
                        .pattern("   ")
                        .define('#', ChiseledBlocks.CALCITE_BRICKS)
                        .unlockedBy(getHasName(ChiseledBlocks.CALCITE_BRICK_SLAB), has(ChiseledBlocks.CALCITE_BRICKS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CALCITE_BRICK_SLAB, Blocks.CALCITE, 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CALCITE_BRICK_SLAB, ChiseledBlocks.POLISHED_CALCITE,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CALCITE_BRICK_SLAB, ChiseledBlocks.CALCITE_BRICKS,2);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CALCITE_BRICK_WALL, 6)
                        .pattern("   ")
                        .pattern("###")
                        .pattern("###")
                        .define('#', ChiseledBlocks.CALCITE_BRICKS)
                        .unlockedBy(getHasName(ChiseledBlocks.CALCITE_BRICK_WALL), has(ChiseledBlocks.CALCITE_BRICKS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CALCITE_BRICK_WALL, Blocks.CALCITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CALCITE_BRICK_WALL, ChiseledBlocks.POLISHED_CALCITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CALCITE_BRICK_WALL, ChiseledBlocks.CALCITE_BRICKS);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_CALCITE_BRICKS)
                        .pattern(" # ")
                        .pattern(" # ")
                        .pattern("   ")
                        .define('#', ChiseledBlocks.POLISHED_CALCITE_SLAB)
                        .unlockedBy(getHasName(ChiseledBlocks.CALCITE_BRICKS), has(ChiseledBlocks.POLISHED_CALCITE))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_CALCITE_BRICKS, Blocks.CALCITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_CALCITE_BRICKS, ChiseledBlocks.POLISHED_CALCITE);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_CALCITE_BRICK_STAIRS, 4)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .define('#', ChiseledBlocks.CUT_CALCITE_BRICKS)
                        .unlockedBy(getHasName(ChiseledBlocks.CUT_CALCITE_BRICK_STAIRS), has(ChiseledBlocks.CUT_CALCITE_BRICKS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_CALCITE_BRICK_STAIRS, Blocks.CALCITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_CALCITE_BRICK_STAIRS, ChiseledBlocks.POLISHED_CALCITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_CALCITE_BRICK_STAIRS, ChiseledBlocks.CUT_CALCITE_BRICKS);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_CALCITE_BRICK_SLAB, 6)
                        .pattern("   ")
                        .pattern("###")
                        .pattern("   ")
                        .define('#', ChiseledBlocks.CUT_CALCITE_BRICKS)
                        .unlockedBy(getHasName(ChiseledBlocks.CUT_CALCITE_BRICK_SLAB), has(ChiseledBlocks.CUT_CALCITE_BRICKS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_CALCITE_BRICK_SLAB, Blocks.CALCITE, 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_CALCITE_BRICK_SLAB, ChiseledBlocks.POLISHED_CALCITE,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_CALCITE_BRICK_SLAB, ChiseledBlocks.CUT_CALCITE_BRICKS,2);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CALCITE_TILES, 4)
                        .pattern("## ")
                        .pattern("## ")
                        .pattern("   ")
                        .define('#', ChiseledBlocks.CALCITE_BRICKS)
                        .unlockedBy(getHasName(ChiseledBlocks.CALCITE_TILES), has(ChiseledBlocks.CALCITE_BRICKS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CALCITE_TILES, Blocks.CALCITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CALCITE_TILES, ChiseledBlocks.POLISHED_CALCITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CALCITE_TILES, ChiseledBlocks.CALCITE_BRICKS);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CALCITE_TILE_STAIRS, 4)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .define('#', ChiseledBlocks.CALCITE_TILES)
                        .unlockedBy(getHasName(ChiseledBlocks.CALCITE_TILE_STAIRS), has(ChiseledBlocks.CALCITE_TILES))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CALCITE_TILE_STAIRS, Blocks.CALCITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CALCITE_TILE_STAIRS, ChiseledBlocks.POLISHED_CALCITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CALCITE_TILE_STAIRS, ChiseledBlocks.CALCITE_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CALCITE_TILE_STAIRS, ChiseledBlocks.CALCITE_TILES);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CALCITE_TILE_SLAB, 6)
                        .pattern("   ")
                        .pattern("###")
                        .pattern("   ")
                        .define('#', ChiseledBlocks.CALCITE_TILES)
                        .unlockedBy(getHasName(ChiseledBlocks.CALCITE_TILE_SLAB), has(ChiseledBlocks.CALCITE_TILES))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CALCITE_TILE_SLAB, Blocks.CALCITE, 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CALCITE_TILE_SLAB, ChiseledBlocks.POLISHED_CALCITE,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CALCITE_TILE_SLAB, ChiseledBlocks.CALCITE_BRICKS, 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CALCITE_TILE_SLAB, ChiseledBlocks.CALCITE_TILES,2);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CALCITE_TILE_WALL, 6)
                        .pattern("   ")
                        .pattern("###")
                        .pattern("###")
                        .define('#', ChiseledBlocks.CALCITE_TILES)
                        .unlockedBy(getHasName(ChiseledBlocks.CALCITE_TILE_WALL), has(ChiseledBlocks.CALCITE_TILES))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CALCITE_TILE_WALL, Blocks.CALCITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CALCITE_TILE_WALL, ChiseledBlocks.POLISHED_CALCITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CALCITE_TILE_WALL, ChiseledBlocks.CALCITE_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CALCITE_TILE_WALL, ChiseledBlocks.CALCITE_TILES);

                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.DRIPSTONE_STAIRS, 4)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .define('#', Blocks.DRIPSTONE_BLOCK)
                        .unlockedBy(getHasName(ChiseledBlocks.DRIPSTONE_STAIRS), has(Blocks.DRIPSTONE_BLOCK))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.DRIPSTONE_STAIRS, Blocks.DRIPSTONE_BLOCK);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.DRIPSTONE_SLAB, 6)
                        .pattern("   ")
                        .pattern("###")
                        .pattern("   ")
                        .define('#', Blocks.DRIPSTONE_BLOCK)
                        .unlockedBy(getHasName(ChiseledBlocks.DRIPSTONE_SLAB), has(Blocks.DRIPSTONE_BLOCK))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.DRIPSTONE_SLAB, Blocks.DRIPSTONE_BLOCK,2);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.DRIPSTONE_WALL, 6)
                        .pattern("   ")
                        .pattern("###")
                        .pattern("###")
                        .define('#', Blocks.DRIPSTONE_BLOCK)
                        .unlockedBy(getHasName(ChiseledBlocks.DRIPSTONE_WALL), has(Blocks.DRIPSTONE_BLOCK))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.DRIPSTONE_WALL, Blocks.DRIPSTONE_BLOCK);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_DRIPSTONE, 4)
                        .pattern("## ")
                        .pattern("## ")
                        .pattern("   ")
                        .define('#', Blocks.DRIPSTONE_BLOCK)
                        .unlockedBy(getHasName(ChiseledBlocks.POLISHED_DRIPSTONE), has(Blocks.DRIPSTONE_BLOCK))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_DRIPSTONE, Blocks.DRIPSTONE_BLOCK);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_DRIPSTONE_STAIRS, 4)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .define('#', ChiseledBlocks.POLISHED_DRIPSTONE)
                        .unlockedBy(getHasName(ChiseledBlocks.POLISHED_DRIPSTONE_STAIRS), has(ChiseledBlocks.POLISHED_DRIPSTONE))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_DRIPSTONE_STAIRS, Blocks.DRIPSTONE_BLOCK);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_DRIPSTONE_STAIRS, ChiseledBlocks.POLISHED_DRIPSTONE);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_DRIPSTONE_SLAB, 6)
                        .pattern("   ")
                        .pattern("###")
                        .pattern("   ")
                        .define('#', ChiseledBlocks.POLISHED_DRIPSTONE)
                        .unlockedBy(getHasName(ChiseledBlocks.POLISHED_DRIPSTONE_SLAB), has(ChiseledBlocks.POLISHED_DRIPSTONE))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_DRIPSTONE_SLAB, Blocks.DRIPSTONE_BLOCK, 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_DRIPSTONE_SLAB, ChiseledBlocks.POLISHED_DRIPSTONE,2);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_DRIPSTONE_WALL, 6)
                        .pattern("   ")
                        .pattern("###")
                        .pattern("###")
                        .define('#', ChiseledBlocks.POLISHED_DRIPSTONE)
                        .unlockedBy(getHasName(ChiseledBlocks.POLISHED_DRIPSTONE_WALL), has(ChiseledBlocks.POLISHED_DRIPSTONE))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_DRIPSTONE_WALL, Blocks.DRIPSTONE_BLOCK);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_DRIPSTONE_WALL, ChiseledBlocks.POLISHED_DRIPSTONE);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.DRIPSTONE_BRICKS, 4)
                        .pattern("## ")
                        .pattern("## ")
                        .pattern("   ")
                        .define('#', ChiseledBlocks.POLISHED_DRIPSTONE)
                        .unlockedBy(getHasName(ChiseledBlocks.DRIPSTONE_BRICKS), has(ChiseledBlocks.POLISHED_DRIPSTONE))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.DRIPSTONE_BRICKS, Blocks.DRIPSTONE_BLOCK);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.DRIPSTONE_BRICKS, ChiseledBlocks.POLISHED_DRIPSTONE);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.DRIPSTONE_BRICK_STAIRS, 4)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .define('#', ChiseledBlocks.DRIPSTONE_BRICKS)
                        .unlockedBy(getHasName(ChiseledBlocks.DRIPSTONE_BRICK_STAIRS), has(ChiseledBlocks.DRIPSTONE_BRICKS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.DRIPSTONE_BRICK_STAIRS, Blocks.DRIPSTONE_BLOCK);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.DRIPSTONE_BRICK_STAIRS, ChiseledBlocks.POLISHED_DRIPSTONE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.DRIPSTONE_BRICK_STAIRS, ChiseledBlocks.DRIPSTONE_BRICKS);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.DRIPSTONE_BRICK_SLAB, 6)
                        .pattern("   ")
                        .pattern("###")
                        .pattern("   ")
                        .define('#', ChiseledBlocks.DRIPSTONE_BRICKS)
                        .unlockedBy(getHasName(ChiseledBlocks.DRIPSTONE_BRICK_SLAB), has(ChiseledBlocks.DRIPSTONE_BRICKS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.DRIPSTONE_BRICK_SLAB, Blocks.DRIPSTONE_BLOCK, 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.DRIPSTONE_BRICK_SLAB, ChiseledBlocks.POLISHED_DRIPSTONE,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.DRIPSTONE_BRICK_SLAB, ChiseledBlocks.DRIPSTONE_BRICKS,2);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.DRIPSTONE_BRICK_WALL, 6)
                        .pattern("   ")
                        .pattern("###")
                        .pattern("###")
                        .define('#', ChiseledBlocks.DRIPSTONE_BRICKS)
                        .unlockedBy(getHasName(ChiseledBlocks.DRIPSTONE_BRICK_WALL), has(ChiseledBlocks.DRIPSTONE_BRICKS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.DRIPSTONE_BRICK_WALL, Blocks.DRIPSTONE_BLOCK);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.DRIPSTONE_BRICK_WALL, ChiseledBlocks.POLISHED_DRIPSTONE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.DRIPSTONE_BRICK_WALL, ChiseledBlocks.DRIPSTONE_BRICKS);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_DRIPSTONE_BRICKS)
                        .pattern(" # ")
                        .pattern(" # ")
                        .pattern("   ")
                        .define('#', ChiseledBlocks.POLISHED_DRIPSTONE_SLAB)
                        .unlockedBy(getHasName(ChiseledBlocks.DRIPSTONE_BRICKS), has(ChiseledBlocks.POLISHED_DRIPSTONE))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_DRIPSTONE_BRICKS, Blocks.DRIPSTONE_BLOCK);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_DRIPSTONE_BRICKS, ChiseledBlocks.POLISHED_DRIPSTONE);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_DRIPSTONE_BRICK_STAIRS, 4)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .define('#', ChiseledBlocks.CUT_DRIPSTONE_BRICKS)
                        .unlockedBy(getHasName(ChiseledBlocks.CUT_DRIPSTONE_BRICK_STAIRS), has(ChiseledBlocks.CUT_DRIPSTONE_BRICKS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_DRIPSTONE_BRICK_STAIRS, Blocks.DRIPSTONE_BLOCK);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_DRIPSTONE_BRICK_STAIRS, ChiseledBlocks.POLISHED_DRIPSTONE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_DRIPSTONE_BRICK_STAIRS, ChiseledBlocks.CUT_DRIPSTONE_BRICKS);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_DRIPSTONE_BRICK_SLAB, 6)
                        .pattern("   ")
                        .pattern("###")
                        .pattern("   ")
                        .define('#', ChiseledBlocks.CUT_DRIPSTONE_BRICKS)
                        .unlockedBy(getHasName(ChiseledBlocks.CUT_DRIPSTONE_BRICK_SLAB), has(ChiseledBlocks.CUT_DRIPSTONE_BRICKS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_DRIPSTONE_BRICK_SLAB, Blocks.DRIPSTONE_BLOCK, 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_DRIPSTONE_BRICK_SLAB, ChiseledBlocks.POLISHED_DRIPSTONE,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_DRIPSTONE_BRICK_SLAB, ChiseledBlocks.CUT_DRIPSTONE_BRICKS,2);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.DRIPSTONE_TILES, 4)
                        .pattern("## ")
                        .pattern("## ")
                        .pattern("   ")
                        .define('#', ChiseledBlocks.DRIPSTONE_BRICKS)
                        .unlockedBy(getHasName(ChiseledBlocks.DRIPSTONE_TILES), has(ChiseledBlocks.DRIPSTONE_BRICKS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.DRIPSTONE_TILES, Blocks.DRIPSTONE_BLOCK);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.DRIPSTONE_TILES, ChiseledBlocks.POLISHED_DRIPSTONE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.DRIPSTONE_TILES, ChiseledBlocks.DRIPSTONE_BRICKS);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.DRIPSTONE_TILE_STAIRS, 4)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .define('#', ChiseledBlocks.DRIPSTONE_TILES)
                        .unlockedBy(getHasName(ChiseledBlocks.DRIPSTONE_TILE_STAIRS), has(ChiseledBlocks.DRIPSTONE_TILES))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.DRIPSTONE_TILE_STAIRS, Blocks.DRIPSTONE_BLOCK);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.DRIPSTONE_TILE_STAIRS, ChiseledBlocks.POLISHED_DRIPSTONE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.DRIPSTONE_TILE_STAIRS, ChiseledBlocks.DRIPSTONE_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.DRIPSTONE_TILE_STAIRS, ChiseledBlocks.DRIPSTONE_TILES);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.DRIPSTONE_TILE_SLAB, 6)
                        .pattern("   ")
                        .pattern("###")
                        .pattern("   ")
                        .define('#', ChiseledBlocks.DRIPSTONE_TILES)
                        .unlockedBy(getHasName(ChiseledBlocks.DRIPSTONE_TILE_SLAB), has(ChiseledBlocks.DRIPSTONE_TILES))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.DRIPSTONE_TILE_SLAB, Blocks.DRIPSTONE_BLOCK, 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.DRIPSTONE_TILE_SLAB, ChiseledBlocks.POLISHED_DRIPSTONE,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.DRIPSTONE_TILE_SLAB, ChiseledBlocks.DRIPSTONE_BRICKS, 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.DRIPSTONE_TILE_SLAB, ChiseledBlocks.DRIPSTONE_TILES,2);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.DRIPSTONE_TILE_WALL, 6)
                        .pattern("   ")
                        .pattern("###")
                        .pattern("###")
                        .define('#', ChiseledBlocks.DRIPSTONE_TILES)
                        .unlockedBy(getHasName(ChiseledBlocks.DRIPSTONE_TILE_WALL), has(ChiseledBlocks.DRIPSTONE_TILES))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.DRIPSTONE_TILE_WALL, Blocks.DRIPSTONE_BLOCK);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.DRIPSTONE_TILE_WALL, ChiseledBlocks.POLISHED_DRIPSTONE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.DRIPSTONE_TILE_WALL, ChiseledBlocks.DRIPSTONE_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.DRIPSTONE_TILE_WALL, ChiseledBlocks.DRIPSTONE_TILES);

                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MIXED_BRICKS, 4)
                        .pattern("## ")
                        .pattern("## ")
                        .pattern("   ")
                        .define('#', Blocks.BRICKS)
                        .unlockedBy(getHasName(ChiseledBlocks.MIXED_BRICKS), has(Blocks.BRICKS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MIXED_BRICKS, Blocks.BRICKS);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MIXED_BRICK_STAIRS, 4)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .define('#', ChiseledBlocks.MIXED_BRICKS)
                        .unlockedBy(getHasName(ChiseledBlocks.MIXED_BRICK_STAIRS), has(ChiseledBlocks.MIXED_BRICKS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MIXED_BRICK_STAIRS, Blocks.BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MIXED_BRICK_STAIRS, ChiseledBlocks.MIXED_BRICKS);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MIXED_BRICK_SLAB, 6)
                        .pattern("   ")
                        .pattern("###")
                        .pattern("   ")
                        .define('#', ChiseledBlocks.MIXED_BRICKS)
                        .unlockedBy(getHasName(ChiseledBlocks.MIXED_BRICK_SLAB), has(ChiseledBlocks.MIXED_BRICKS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MIXED_BRICK_SLAB, Blocks.BRICKS, 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MIXED_BRICK_SLAB, ChiseledBlocks.MIXED_BRICKS, 2);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MIXED_BRICK_WALL, 6)
                        .pattern("   ")
                        .pattern("###")
                        .pattern("###")
                        .define('#', ChiseledBlocks.MIXED_BRICKS)
                        .unlockedBy(getHasName(ChiseledBlocks.MIXED_BRICK_WALL), has(ChiseledBlocks.MIXED_BRICKS))
                        .save(output);
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
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MOSSY_BRICK_STAIRS, 4)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .define('#', ChiseledBlocks.MOSSY_BRICKS)
                        .unlockedBy(getHasName(ChiseledBlocks.MOSSY_BRICK_STAIRS), has(ChiseledBlocks.MOSSY_BRICKS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MOSSY_BRICK_STAIRS, ChiseledBlocks.MOSSY_BRICKS);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MOSSY_BRICK_SLAB, 6)
                        .pattern("   ")
                        .pattern("###")
                        .pattern("   ")
                        .define('#', ChiseledBlocks.MOSSY_BRICKS)
                        .unlockedBy(getHasName(ChiseledBlocks.MOSSY_BRICK_SLAB), has(ChiseledBlocks.MOSSY_BRICKS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MOSSY_BRICK_SLAB, ChiseledBlocks.MOSSY_BRICKS, 2);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MOSSY_BRICK_WALL, 6)
                        .pattern("   ")
                        .pattern("###")
                        .pattern("###")
                        .define('#', ChiseledBlocks.MOSSY_BRICKS)
                        .unlockedBy(getHasName(ChiseledBlocks.MOSSY_BRICK_WALL), has(ChiseledBlocks.MOSSY_BRICKS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MOSSY_BRICK_WALL, ChiseledBlocks.MOSSY_BRICKS);

                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.PACKED_MUD_STAIRS, 4)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .define('#', Blocks.PACKED_MUD)
                        .unlockedBy(getHasName(ChiseledBlocks.PACKED_MUD_STAIRS), has(Blocks.PACKED_MUD))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.PACKED_MUD_STAIRS, Blocks.PACKED_MUD);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.PACKED_MUD_SLAB, 6)
                        .pattern("   ")
                        .pattern("###")
                        .pattern("   ")
                        .define('#', Blocks.PACKED_MUD)
                        .unlockedBy(getHasName(ChiseledBlocks.PACKED_MUD_SLAB), has(Blocks.PACKED_MUD))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.PACKED_MUD_SLAB, Blocks.PACKED_MUD, 2);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.PACKED_MUD_WALL, 6)
                        .pattern("   ")
                        .pattern("###")
                        .pattern("###")
                        .define('#', Blocks.PACKED_MUD)
                        .unlockedBy(getHasName(ChiseledBlocks.PACKED_MUD_WALL), has(Blocks.PACKED_MUD))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.PACKED_MUD_WALL, Blocks.PACKED_MUD);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_MUD, 4)
                        .pattern("## ")
                        .pattern("## ")
                        .pattern("   ")
                        .define('#', Blocks.PACKED_MUD)
                        .unlockedBy(getHasName(ChiseledBlocks.POLISHED_MUD), has(Blocks.PACKED_MUD))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_MUD, Blocks.PACKED_MUD);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_MUD_STAIRS, 4)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .define('#', ChiseledBlocks.POLISHED_MUD)
                        .unlockedBy(getHasName(ChiseledBlocks.POLISHED_MUD_STAIRS), has(ChiseledBlocks.POLISHED_MUD))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_MUD_STAIRS, Blocks.PACKED_MUD);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_MUD_STAIRS, ChiseledBlocks.POLISHED_MUD);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_MUD_SLAB, 6)
                        .pattern("   ")
                        .pattern("###")
                        .pattern("   ")
                        .define('#', ChiseledBlocks.POLISHED_MUD)
                        .unlockedBy(getHasName(ChiseledBlocks.POLISHED_MUD_SLAB), has(ChiseledBlocks.POLISHED_MUD))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_MUD_SLAB, Blocks.PACKED_MUD, 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_MUD_SLAB, ChiseledBlocks.POLISHED_MUD, 2);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_MUD_WALL, 6)
                        .pattern("   ")
                        .pattern("###")
                        .pattern("###")
                        .define('#', ChiseledBlocks.POLISHED_MUD)
                        .unlockedBy(getHasName(ChiseledBlocks.POLISHED_MUD_WALL), has(ChiseledBlocks.POLISHED_MUD))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_MUD_WALL, Blocks.PACKED_MUD);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_MUD_WALL, ChiseledBlocks.POLISHED_MUD);
                shaped(RecipeCategory.BUILDING_BLOCKS, Blocks.MUD_BRICKS, 4)
                        .pattern("## ")
                        .pattern("## ")
                        .pattern("   ")
                        .define('#', ChiseledBlocks.POLISHED_MUD)
                        .unlockedBy(getHasName(Blocks.MUD_BRICKS), has(ChiseledBlocks.POLISHED_MUD))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, Blocks.MUD_BRICKS, Blocks.PACKED_MUD);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, Blocks.MUD_BRICKS, ChiseledBlocks.POLISHED_MUD);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, Blocks.MUD_BRICK_STAIRS, Blocks.PACKED_MUD);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, Blocks.MUD_BRICK_STAIRS, ChiseledBlocks.POLISHED_MUD);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, Blocks.MUD_BRICK_SLAB, Blocks.PACKED_MUD, 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, Blocks.MUD_BRICK_SLAB, ChiseledBlocks.POLISHED_MUD, 2);
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
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MOSSY_MUD_BRICK_STAIRS, 4)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .define('#', ChiseledBlocks.MOSSY_MUD_BRICKS)
                        .unlockedBy(getHasName(ChiseledBlocks.MOSSY_MUD_BRICK_STAIRS), has(ChiseledBlocks.MOSSY_MUD_BRICKS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MOSSY_MUD_BRICK_STAIRS, ChiseledBlocks.MOSSY_MUD_BRICKS);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MOSSY_MUD_BRICK_SLAB, 6)
                        .pattern("   ")
                        .pattern("###")
                        .pattern("   ")
                        .define('#', ChiseledBlocks.MOSSY_MUD_BRICKS)
                        .unlockedBy(getHasName(ChiseledBlocks.MOSSY_MUD_BRICK_SLAB), has(ChiseledBlocks.MOSSY_MUD_BRICKS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MOSSY_MUD_BRICK_SLAB, ChiseledBlocks.MOSSY_MUD_BRICKS);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MOSSY_MUD_BRICK_WALL, 6)
                        .pattern("   ")
                        .pattern("###")
                        .pattern("###")
                        .define('#', ChiseledBlocks.MOSSY_MUD_BRICKS)
                        .unlockedBy(getHasName(ChiseledBlocks.MOSSY_MUD_BRICK_WALL), has(ChiseledBlocks.MOSSY_MUD_BRICKS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MOSSY_MUD_BRICK_WALL, ChiseledBlocks.MOSSY_MUD_BRICKS);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_MUD_BRICKS)
                        .pattern(" # ")
                        .pattern(" # ")
                        .pattern("   ")
                        .define('#', ChiseledBlocks.POLISHED_MUD_SLAB)
                        .unlockedBy(getHasName(ChiseledBlocks.CUT_MUD_BRICKS), has(ChiseledBlocks.POLISHED_MUD))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_MUD_BRICKS, Blocks.PACKED_MUD);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_MUD_BRICKS, ChiseledBlocks.POLISHED_MUD);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_MUD_BRICK_STAIRS, 4)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .define('#', ChiseledBlocks.CUT_MUD_BRICKS)
                        .unlockedBy(getHasName(ChiseledBlocks.CUT_MUD_BRICK_STAIRS), has(ChiseledBlocks.CUT_MUD_BRICKS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_MUD_BRICK_STAIRS, Blocks.PACKED_MUD);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_MUD_BRICK_STAIRS, ChiseledBlocks.POLISHED_MUD);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_MUD_BRICK_STAIRS, ChiseledBlocks.CUT_MUD_BRICKS);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_MUD_BRICK_SLAB, 6)
                        .pattern("   ")
                        .pattern("###")
                        .pattern("   ")
                        .define('#', ChiseledBlocks.CUT_MUD_BRICKS)
                        .unlockedBy(getHasName(ChiseledBlocks.CUT_MUD_BRICK_SLAB), has(ChiseledBlocks.CUT_MUD_BRICKS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_MUD_BRICK_SLAB, Blocks.PACKED_MUD, 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_MUD_BRICK_SLAB, ChiseledBlocks.POLISHED_MUD, 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_MUD_BRICK_SLAB, ChiseledBlocks.CUT_MUD_BRICKS, 2);
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
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MOSSY_CUT_MUD_BRICK_STAIRS, 4)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .define('#', ChiseledBlocks.MOSSY_CUT_MUD_BRICKS)
                        .unlockedBy(getHasName(ChiseledBlocks.MOSSY_CUT_MUD_BRICK_STAIRS), has(ChiseledBlocks.MOSSY_CUT_MUD_BRICKS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MOSSY_CUT_MUD_BRICK_STAIRS, ChiseledBlocks.MOSSY_CUT_MUD_BRICKS);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MOSSY_CUT_MUD_BRICK_SLAB, 6)
                        .pattern("   ")
                        .pattern("###")
                        .pattern("   ")
                        .define('#', ChiseledBlocks.MOSSY_CUT_MUD_BRICKS)
                        .unlockedBy(getHasName(ChiseledBlocks.MOSSY_CUT_MUD_BRICK_SLAB), has(ChiseledBlocks.MOSSY_CUT_MUD_BRICKS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MOSSY_CUT_MUD_BRICK_SLAB, ChiseledBlocks.MOSSY_CUT_MUD_BRICKS, 2);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MUD_TILES, 4)
                        .pattern("## ")
                        .pattern("## ")
                        .pattern("   ")
                        .define('#', Blocks.MUD_BRICKS)
                        .unlockedBy(getHasName(ChiseledBlocks.MUD_TILES), has(Blocks.MUD_BRICKS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MUD_TILES, Blocks.PACKED_MUD);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MUD_TILES, ChiseledBlocks.POLISHED_MUD);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MUD_TILES, Blocks.MUD_BRICKS);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MUD_TILE_STAIRS, 4)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .define('#', ChiseledBlocks.MUD_TILES)
                        .unlockedBy(getHasName(ChiseledBlocks.MUD_TILE_STAIRS), has(ChiseledBlocks.MUD_TILES))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MUD_TILE_STAIRS, Blocks.PACKED_MUD);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MUD_TILE_STAIRS, ChiseledBlocks.POLISHED_MUD);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MUD_TILE_STAIRS, Blocks.MUD_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MUD_TILE_STAIRS, ChiseledBlocks.MUD_TILES);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MUD_TILE_SLAB, 6)
                        .pattern("   ")
                        .pattern("###")
                        .pattern("   ")
                        .define('#', ChiseledBlocks.MUD_TILES)
                        .unlockedBy(getHasName(ChiseledBlocks.MUD_TILE_SLAB), has(ChiseledBlocks.MUD_TILES))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MUD_TILE_SLAB, Blocks.PACKED_MUD, 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MUD_TILE_SLAB, ChiseledBlocks.POLISHED_MUD, 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MUD_TILE_SLAB, Blocks.MUD_BRICKS, 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MUD_TILE_SLAB, ChiseledBlocks.MUD_TILES, 2);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MUD_TILE_WALL, 6)
                        .pattern("   ")
                        .pattern("###")
                        .pattern("###")
                        .define('#', ChiseledBlocks.MUD_TILES)
                        .unlockedBy(getHasName(ChiseledBlocks.MUD_TILE_WALL), has(ChiseledBlocks.MUD_TILES))
                        .save(output);
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
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MOSSY_MUD_TILE_STAIRS, 4)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .define('#', ChiseledBlocks.MOSSY_MUD_TILES)
                        .unlockedBy(getHasName(ChiseledBlocks.MOSSY_MUD_TILE_STAIRS), has(ChiseledBlocks.MOSSY_MUD_TILES))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MOSSY_MUD_TILE_STAIRS, ChiseledBlocks.MOSSY_MUD_TILES);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MOSSY_MUD_TILE_SLAB, 6)
                        .pattern("   ")
                        .pattern("###")
                        .pattern("   ")
                        .define('#', ChiseledBlocks.MOSSY_MUD_TILES)
                        .unlockedBy(getHasName(ChiseledBlocks.MOSSY_MUD_TILE_SLAB), has(ChiseledBlocks.MOSSY_MUD_TILES))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MOSSY_MUD_TILE_SLAB, ChiseledBlocks.MOSSY_MUD_TILES, 2);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MOSSY_MUD_TILE_WALL, 6)
                        .pattern("   ")
                        .pattern("###")
                        .pattern("###")
                        .define('#', ChiseledBlocks.MOSSY_MUD_TILES)
                        .unlockedBy(getHasName(ChiseledBlocks.MOSSY_MUD_TILE_WALL), has(ChiseledBlocks.MOSSY_MUD_TILES))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MOSSY_MUD_TILE_WALL, ChiseledBlocks.MOSSY_MUD_TILES);
            }
        };
    }

    @Override
    public String getName() {
        return "recipegen";
    }
}