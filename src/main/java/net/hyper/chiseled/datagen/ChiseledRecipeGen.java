package net.hyper.chiseled.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.hyper.chiseled.registry.ChiseledItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
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
            void brickRecipes(Item craftingOutput, Item craftingInput, Item... stonecutterInputs) {
                shaped(RecipeCategory.BUILDING_BLOCKS, craftingOutput,4).pattern("##").pattern("##").define('#', craftingInput).unlockedBy(getHasName(craftingInput), has(craftingInput)).save(output);
                for (Item stonecutterInput : stonecutterInputs) stonecuttingRecipes(craftingOutput, stonecutterInput);
            }
            void cutBrickRecipes(Item craftingOutput, Item craftingInput, Item... stonecutterInputs) {
                shaped(RecipeCategory.BUILDING_BLOCKS, craftingOutput).pattern("#").pattern("#").define('#', craftingInput).unlockedBy(getHasName(craftingInput), has(craftingInput)).save(output);
                for (Item stonecutterInput : stonecutterInputs) stonecuttingRecipes(craftingOutput, stonecutterInput);
            }
            void pillarRecipes(Item craftingOutput, Item craftingInput, Item... stonecutterInputs) {
                shaped(RecipeCategory.BUILDING_BLOCKS, craftingOutput, 2).pattern("#").pattern("#").define('#', craftingInput).unlockedBy(getHasName(craftingInput), has(craftingInput)).save(output);
                for (Item stonecutterInput : stonecutterInputs) stonecuttingRecipes(craftingOutput, stonecutterInput);
            }
            void stairRecipes(Item craftingOutput, Item craftingInput, Item... stonecutterInputs) {
                stairBuilder(craftingOutput, Ingredient.of(craftingInput)).unlockedBy(getHasName(craftingInput), has(craftingInput)).save(output);
                for (Item stonecutterInput : stonecutterInputs) stonecuttingRecipes(craftingOutput, stonecutterInput);
            }
            void slabRecipes(Item craftingOutput, Item craftingInput, Item... stonecutterInputs) {
                slab(RecipeCategory.BUILDING_BLOCKS, craftingOutput, craftingInput);
                for (Item stonecutterInput : stonecutterInputs) stonecuttingRecipes(craftingOutput, stonecutterInput, 2);
            }
            void wallRecipes(Item craftingOutput, Item craftingInput, Item... stonecutterInputs) {
                wall(RecipeCategory.BUILDING_BLOCKS, craftingOutput, craftingInput);
                for (Item stonecutterInput : stonecutterInputs) stonecuttingRecipes(craftingOutput, stonecutterInput);
            }
            void stonecuttingRecipes(Item output, Item input, int count) {
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, output, input, count);
            }
            void stonecuttingRecipes(Item output, Item input) {
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, output, input);
            }
            void mossyRecipes(Item craftingOutput, Item craftingInput) {
                shapeless(RecipeCategory.BUILDING_BLOCKS, craftingOutput).requires(craftingInput).requires(Blocks.MOSS_BLOCK).unlockedBy(getHasName(craftingInput), has(craftingInput)).save(output, getItemName(craftingOutput)+"_from_moss");
                shapeless(RecipeCategory.BUILDING_BLOCKS, craftingOutput).requires(craftingInput).requires(Blocks.VINE).unlockedBy(getHasName(craftingInput), has(craftingInput)).save(output, getItemName(craftingOutput)+"_from_vine");
            }

            @Override
            public void buildRecipes() {
                wallRecipes(ChiseledItems.STONE_WALL, Items.STONE, Items.STONE);
                brickRecipes(ChiseledItems.POLISHED_STONE, Items.STONE, Items.STONE);
                stairRecipes(ChiseledItems.POLISHED_STONE_STAIRS, ChiseledItems.POLISHED_STONE, Items.STONE, ChiseledItems.POLISHED_STONE);
                slabRecipes(ChiseledItems.POLISHED_STONE_SLAB, ChiseledItems.POLISHED_STONE, Items.STONE, ChiseledItems.POLISHED_STONE);
                wallRecipes(ChiseledItems.POLISHED_STONE_WALL, ChiseledItems.POLISHED_STONE, Items.STONE, ChiseledItems.POLISHED_STONE);
                stairRecipes(ChiseledItems.SMOOTH_STONE_STAIRS, Items.SMOOTH_STONE, Items.SMOOTH_STONE);
                brickRecipes(Items.STONE_BRICKS, ChiseledItems.POLISHED_STONE, ChiseledItems.POLISHED_STONE);
                stonecuttingRecipes(Items.STONE_BRICK_STAIRS, ChiseledItems.POLISHED_STONE);
                stonecuttingRecipes(Items.STONE_BRICK_SLAB, ChiseledItems.POLISHED_STONE, 2);
                stonecuttingRecipes(Items.STONE_BRICK_WALL, ChiseledItems.POLISHED_STONE);
                cutBrickRecipes(ChiseledItems.CUT_STONE_BRICKS, ChiseledItems.POLISHED_STONE_SLAB, Items.STONE, ChiseledItems.POLISHED_STONE);
                smeltingResultFromBase(ChiseledItems.CRACKED_CUT_STONE_BRICKS, ChiseledItems.CUT_STONE_BRICKS);
                stairRecipes(ChiseledItems.CUT_STONE_BRICK_STAIRS, ChiseledItems.CUT_STONE_BRICKS, Items.STONE, ChiseledItems.POLISHED_STONE, ChiseledItems.CUT_STONE_BRICKS);
                slabRecipes(ChiseledItems.CUT_STONE_BRICK_SLAB, ChiseledItems.CUT_STONE_BRICKS, Items.STONE, ChiseledItems.POLISHED_STONE, ChiseledItems.CUT_STONE_BRICKS);
                mossyRecipes(ChiseledItems.MOSSY_CUT_STONE_BRICKS, ChiseledItems.CUT_STONE_BRICKS);
                stairRecipes(ChiseledItems.MOSSY_CUT_STONE_BRICK_STAIRS, ChiseledItems.MOSSY_CUT_STONE_BRICKS, ChiseledItems.MOSSY_CUT_STONE_BRICKS);
                slabRecipes(ChiseledItems.MOSSY_CUT_STONE_BRICK_SLAB, ChiseledItems.MOSSY_CUT_STONE_BRICKS, ChiseledItems.MOSSY_CUT_STONE_BRICKS);
                brickRecipes(ChiseledItems.STONE_TILES, Items.STONE_BRICKS, Items.STONE, ChiseledItems.POLISHED_STONE, Items.STONE_BRICKS);
                smeltingResultFromBase(ChiseledItems.CRACKED_STONE_TILES, ChiseledItems.STONE_TILES);
                stairRecipes(ChiseledItems.STONE_TILE_STAIRS, ChiseledItems.STONE_TILES, Items.STONE, ChiseledItems.POLISHED_STONE, Items.STONE_BRICKS, ChiseledItems.STONE_TILES);
                slabRecipes(ChiseledItems.STONE_TILE_SLAB, ChiseledItems.STONE_TILES, Items.STONE, ChiseledItems.POLISHED_STONE, Items.STONE_BRICKS, ChiseledItems.STONE_TILES);
                wallRecipes(ChiseledItems.STONE_TILE_WALL, ChiseledItems.STONE_TILES, Items.STONE, ChiseledItems.POLISHED_STONE, Items.STONE_BRICKS, ChiseledItems.STONE_TILES);
                mossyRecipes(ChiseledItems.MOSSY_STONE_TILES, ChiseledItems.STONE_TILES);
                stairRecipes(ChiseledItems.MOSSY_STONE_TILE_STAIRS, ChiseledItems.MOSSY_STONE_TILES, ChiseledItems.MOSSY_STONE_TILES);
                slabRecipes(ChiseledItems.MOSSY_STONE_TILE_SLAB, ChiseledItems.MOSSY_STONE_TILES, ChiseledItems.MOSSY_STONE_TILES);
                wallRecipes(ChiseledItems.MOSSY_STONE_TILE_WALL, ChiseledItems.MOSSY_STONE_TILES, ChiseledItems.MOSSY_STONE_TILES);

                wallRecipes(ChiseledItems.POLISHED_GRANITE_WALL, Items.POLISHED_GRANITE, Items.GRANITE, Items.POLISHED_GRANITE);
                brickRecipes(ChiseledItems.POLISHED_GRANITE_BRICKS, Items.POLISHED_GRANITE, Items.GRANITE, Items.POLISHED_GRANITE);
                smeltingResultFromBase(ChiseledItems.CRACKED_POLISHED_GRANITE_BRICKS, ChiseledItems.POLISHED_GRANITE_BRICKS);
                stairRecipes(ChiseledItems.POLISHED_GRANITE_BRICK_STAIRS, ChiseledItems.POLISHED_GRANITE_BRICKS, Items.GRANITE, Items.POLISHED_GRANITE, ChiseledItems.POLISHED_GRANITE_BRICKS);
                slabRecipes(ChiseledItems.POLISHED_GRANITE_BRICK_SLAB, ChiseledItems.POLISHED_GRANITE_BRICKS, Items.GRANITE, Items.POLISHED_GRANITE, ChiseledItems.POLISHED_GRANITE_BRICKS);
                wallRecipes(ChiseledItems.POLISHED_GRANITE_BRICK_WALL, ChiseledItems.POLISHED_GRANITE_BRICKS, Items.GRANITE, Items.POLISHED_GRANITE, ChiseledItems.POLISHED_GRANITE_BRICKS);
                pillarRecipes(ChiseledItems.POLISHED_GRANITE_PILLAR, Items.POLISHED_GRANITE, Items.GRANITE, Items.POLISHED_GRANITE);
                cutBrickRecipes(ChiseledItems.CUT_POLISHED_GRANITE_BRICKS, Items.POLISHED_GRANITE_SLAB, Items.GRANITE, Items.POLISHED_GRANITE);
                smeltingResultFromBase(ChiseledItems.CRACKED_CUT_POLISHED_GRANITE_BRICKS, ChiseledItems.CUT_POLISHED_GRANITE_BRICKS);
                stairRecipes(ChiseledItems.CUT_POLISHED_GRANITE_BRICK_STAIRS, ChiseledItems.CUT_POLISHED_GRANITE_BRICKS, Items.GRANITE, Items.POLISHED_GRANITE, ChiseledItems.CUT_POLISHED_GRANITE_BRICKS);
                slabRecipes(ChiseledItems.CUT_POLISHED_GRANITE_BRICK_SLAB, ChiseledItems.CUT_POLISHED_GRANITE_BRICKS, Items.GRANITE, Items.POLISHED_GRANITE, ChiseledItems.CUT_POLISHED_GRANITE_BRICKS);
                brickRecipes(ChiseledItems.POLISHED_GRANITE_TILES, ChiseledItems.POLISHED_GRANITE_BRICKS, Items.GRANITE, Items.POLISHED_GRANITE, ChiseledItems.POLISHED_GRANITE_BRICKS);
                smeltingResultFromBase(ChiseledItems.CRACKED_POLISHED_GRANITE_TILES, ChiseledItems.POLISHED_GRANITE_TILES);
                stairRecipes(ChiseledItems.POLISHED_GRANITE_TILE_STAIRS, ChiseledItems.POLISHED_GRANITE_TILES, Items.GRANITE, Items.POLISHED_GRANITE, ChiseledItems.POLISHED_GRANITE_BRICKS, ChiseledItems.POLISHED_GRANITE_TILES);
                slabRecipes(ChiseledItems.POLISHED_GRANITE_TILE_SLAB, ChiseledItems.POLISHED_GRANITE_TILES, Items.GRANITE, Items.POLISHED_GRANITE, ChiseledItems.POLISHED_GRANITE_BRICKS, ChiseledItems.POLISHED_GRANITE_TILES);
                wallRecipes(ChiseledItems.POLISHED_GRANITE_TILE_WALL, ChiseledItems.POLISHED_GRANITE_TILES, Items.GRANITE, Items.POLISHED_GRANITE, ChiseledItems.POLISHED_GRANITE_BRICKS, ChiseledItems.POLISHED_GRANITE_TILES);

                wallRecipes(ChiseledItems.POLISHED_DIORITE_WALL, Items.POLISHED_DIORITE, Items.DIORITE, Items.POLISHED_DIORITE);
                brickRecipes(ChiseledItems.POLISHED_DIORITE_BRICKS, Items.POLISHED_DIORITE, Items.DIORITE, Items.POLISHED_DIORITE);
                smeltingResultFromBase(ChiseledItems.CRACKED_POLISHED_DIORITE_BRICKS, ChiseledItems.POLISHED_DIORITE_BRICKS);
                stairRecipes(ChiseledItems.POLISHED_DIORITE_BRICK_STAIRS, ChiseledItems.POLISHED_DIORITE_BRICKS, Items.DIORITE, Items.POLISHED_DIORITE, ChiseledItems.POLISHED_DIORITE_BRICKS);
                slabRecipes(ChiseledItems.POLISHED_DIORITE_BRICK_SLAB, ChiseledItems.POLISHED_DIORITE_BRICKS, Items.DIORITE, Items.POLISHED_DIORITE, ChiseledItems.POLISHED_DIORITE_BRICKS);
                wallRecipes(ChiseledItems.POLISHED_DIORITE_BRICK_WALL, ChiseledItems.POLISHED_DIORITE_BRICKS, Items.DIORITE, Items.POLISHED_DIORITE, ChiseledItems.POLISHED_DIORITE_BRICKS);
                pillarRecipes(ChiseledItems.POLISHED_DIORITE_PILLAR, Items.POLISHED_DIORITE, Items.DIORITE, Items.POLISHED_DIORITE);
                cutBrickRecipes(ChiseledItems.CUT_POLISHED_DIORITE_BRICKS, Items.POLISHED_DIORITE_SLAB, Items.DIORITE, Items.POLISHED_DIORITE);
                smeltingResultFromBase(ChiseledItems.CRACKED_CUT_POLISHED_DIORITE_BRICKS, ChiseledItems.CUT_POLISHED_DIORITE_BRICKS);
                stairRecipes(ChiseledItems.CUT_POLISHED_DIORITE_BRICK_STAIRS, ChiseledItems.CUT_POLISHED_DIORITE_BRICKS, Items.DIORITE, Items.POLISHED_DIORITE, ChiseledItems.CUT_POLISHED_DIORITE_BRICKS);
                slabRecipes(ChiseledItems.CUT_POLISHED_DIORITE_BRICK_SLAB, ChiseledItems.CUT_POLISHED_DIORITE_BRICKS, Items.DIORITE, Items.POLISHED_DIORITE, ChiseledItems.CUT_POLISHED_DIORITE_BRICKS);
                brickRecipes(ChiseledItems.POLISHED_DIORITE_TILES, ChiseledItems.POLISHED_DIORITE_BRICKS, Items.DIORITE, Items.POLISHED_DIORITE, ChiseledItems.POLISHED_DIORITE_BRICKS);
                smeltingResultFromBase(ChiseledItems.CRACKED_POLISHED_DIORITE_TILES, ChiseledItems.POLISHED_DIORITE_TILES);
                stairRecipes(ChiseledItems.POLISHED_DIORITE_TILE_STAIRS, ChiseledItems.POLISHED_DIORITE_TILES, Items.DIORITE, Items.POLISHED_DIORITE, ChiseledItems.POLISHED_DIORITE_BRICKS, ChiseledItems.POLISHED_DIORITE_TILES);
                slabRecipes(ChiseledItems.POLISHED_DIORITE_TILE_SLAB, ChiseledItems.POLISHED_DIORITE_TILES, Items.DIORITE, Items.POLISHED_DIORITE, ChiseledItems.POLISHED_DIORITE_BRICKS, ChiseledItems.POLISHED_DIORITE_TILES);
                wallRecipes(ChiseledItems.POLISHED_DIORITE_TILE_WALL, ChiseledItems.POLISHED_DIORITE_TILES, Items.DIORITE, Items.POLISHED_DIORITE, ChiseledItems.POLISHED_DIORITE_BRICKS, ChiseledItems.POLISHED_DIORITE_TILES);

                wallRecipes(ChiseledItems.POLISHED_ANDESITE_WALL, Items.POLISHED_ANDESITE, Items.ANDESITE, Items.POLISHED_ANDESITE);
                brickRecipes(ChiseledItems.POLISHED_ANDESITE_BRICKS, Items.POLISHED_ANDESITE, Items.ANDESITE, Items.POLISHED_ANDESITE);
                smeltingResultFromBase(ChiseledItems.CRACKED_POLISHED_ANDESITE_BRICKS, ChiseledItems.POLISHED_ANDESITE_BRICKS);
                stairRecipes(ChiseledItems.POLISHED_ANDESITE_BRICK_STAIRS, ChiseledItems.POLISHED_ANDESITE_BRICKS, Items.ANDESITE, Items.POLISHED_ANDESITE, ChiseledItems.POLISHED_ANDESITE_BRICKS);
                slabRecipes(ChiseledItems.POLISHED_ANDESITE_BRICK_SLAB, ChiseledItems.POLISHED_ANDESITE_BRICKS, Items.ANDESITE, Items.POLISHED_ANDESITE, ChiseledItems.POLISHED_ANDESITE_BRICKS);
                wallRecipes(ChiseledItems.POLISHED_ANDESITE_BRICK_WALL, ChiseledItems.POLISHED_ANDESITE_BRICKS, Items.ANDESITE, Items.POLISHED_ANDESITE, ChiseledItems.POLISHED_ANDESITE_BRICKS);
                pillarRecipes(ChiseledItems.POLISHED_ANDESITE_PILLAR, Items.POLISHED_ANDESITE, Items.ANDESITE, Items.POLISHED_ANDESITE);
                cutBrickRecipes(ChiseledItems.CUT_POLISHED_ANDESITE_BRICKS, Items.POLISHED_ANDESITE_SLAB, Items.ANDESITE, Items.POLISHED_ANDESITE);
                smeltingResultFromBase(ChiseledItems.CRACKED_CUT_POLISHED_ANDESITE_BRICKS, ChiseledItems.CUT_POLISHED_ANDESITE_BRICKS);
                stairRecipes(ChiseledItems.CUT_POLISHED_ANDESITE_BRICK_STAIRS, ChiseledItems.CUT_POLISHED_ANDESITE_BRICKS, Items.ANDESITE, Items.POLISHED_ANDESITE, ChiseledItems.CUT_POLISHED_ANDESITE_BRICKS);
                slabRecipes(ChiseledItems.CUT_POLISHED_ANDESITE_BRICK_SLAB, ChiseledItems.CUT_POLISHED_ANDESITE_BRICKS, Items.ANDESITE, Items.POLISHED_ANDESITE, ChiseledItems.CUT_POLISHED_ANDESITE_BRICKS);
                brickRecipes(ChiseledItems.POLISHED_ANDESITE_TILES, ChiseledItems.POLISHED_ANDESITE_BRICKS, Items.ANDESITE, Items.POLISHED_ANDESITE, ChiseledItems.POLISHED_ANDESITE_BRICKS);
                smeltingResultFromBase(ChiseledItems.CRACKED_POLISHED_ANDESITE_TILES, ChiseledItems.POLISHED_ANDESITE_TILES);
                stairRecipes(ChiseledItems.POLISHED_ANDESITE_TILE_STAIRS, ChiseledItems.POLISHED_ANDESITE_TILES, Items.ANDESITE, Items.POLISHED_ANDESITE, ChiseledItems.POLISHED_ANDESITE_BRICKS, ChiseledItems.POLISHED_ANDESITE_TILES);
                slabRecipes(ChiseledItems.POLISHED_ANDESITE_TILE_SLAB, ChiseledItems.POLISHED_ANDESITE_TILES, Items.ANDESITE, Items.POLISHED_ANDESITE, ChiseledItems.POLISHED_ANDESITE_BRICKS, ChiseledItems.POLISHED_ANDESITE_TILES);
                wallRecipes(ChiseledItems.POLISHED_ANDESITE_TILE_WALL, ChiseledItems.POLISHED_ANDESITE_TILES, Items.ANDESITE, Items.POLISHED_ANDESITE, ChiseledItems.POLISHED_ANDESITE_BRICKS, ChiseledItems.POLISHED_ANDESITE_TILES);

                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CUT_DEEPSLATE_BRICKS)
                        .pattern("#")
                        .pattern("#")
                        .define('#', Blocks.POLISHED_DEEPSLATE_SLAB)
                        .unlockedBy(getHasName(ChiseledItems.CUT_DEEPSLATE_BRICKS), has(Blocks.POLISHED_DEEPSLATE))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CUT_DEEPSLATE_BRICKS, Blocks.DEEPSLATE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CUT_DEEPSLATE_BRICKS, Blocks.COBBLED_DEEPSLATE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CUT_DEEPSLATE_BRICKS, Blocks.POLISHED_DEEPSLATE);
                smeltingResultFromBase(ChiseledItems.CRACKED_CUT_DEEPSLATE_BRICKS, ChiseledItems.CUT_DEEPSLATE_BRICKS);
                stairBuilder(ChiseledItems.CUT_DEEPSLATE_BRICK_STAIRS, Ingredient.of(ChiseledItems.CUT_DEEPSLATE_BRICKS))
                        .unlockedBy(getHasName(ChiseledItems.CUT_DEEPSLATE_BRICK_STAIRS), has(ChiseledItems.CUT_DEEPSLATE_BRICKS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CUT_DEEPSLATE_BRICK_STAIRS, Blocks.DEEPSLATE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CUT_DEEPSLATE_BRICK_STAIRS, Blocks.COBBLED_DEEPSLATE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CUT_DEEPSLATE_BRICK_STAIRS, Blocks.POLISHED_DEEPSLATE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CUT_DEEPSLATE_BRICK_STAIRS, ChiseledItems.CUT_DEEPSLATE_BRICKS);
                slab(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CUT_DEEPSLATE_BRICK_SLAB, ChiseledItems.CUT_DEEPSLATE_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CUT_DEEPSLATE_BRICK_SLAB, Blocks.DEEPSLATE,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CUT_DEEPSLATE_BRICK_SLAB, Blocks.COBBLED_DEEPSLATE,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CUT_DEEPSLATE_BRICK_SLAB, Blocks.POLISHED_DEEPSLATE,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CUT_DEEPSLATE_BRICK_SLAB, ChiseledItems.CUT_DEEPSLATE_BRICKS,2);

                stairBuilder(ChiseledItems.CALCITE_STAIRS, Ingredient.of(Blocks.CALCITE))
                        .unlockedBy(getHasName(ChiseledItems.CALCITE_STAIRS), has(Blocks.CALCITE))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CALCITE_STAIRS, Blocks.CALCITE);
                slab(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CALCITE_SLAB, Blocks.CALCITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CALCITE_SLAB, Blocks.CALCITE,2);
                wall(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CALCITE_WALL, Blocks.CALCITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CALCITE_WALL, Blocks.CALCITE);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.POLISHED_CALCITE,4)
                        .pattern("##")
                        .pattern("##")
                        .define('#', Blocks.CALCITE)
                        .unlockedBy(getHasName(ChiseledItems.POLISHED_CALCITE), has(Blocks.CALCITE))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.POLISHED_CALCITE, Blocks.CALCITE);
                stairBuilder(ChiseledItems.POLISHED_CALCITE_STAIRS, Ingredient.of(ChiseledItems.POLISHED_CALCITE))
                        .unlockedBy(getHasName(ChiseledItems.POLISHED_CALCITE_STAIRS), has(ChiseledItems.POLISHED_CALCITE))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.POLISHED_CALCITE_STAIRS, Blocks.CALCITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.POLISHED_CALCITE_STAIRS, ChiseledItems.POLISHED_CALCITE);
                slab(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.POLISHED_CALCITE_SLAB, ChiseledItems.POLISHED_CALCITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.POLISHED_CALCITE_SLAB, Blocks.CALCITE, 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.POLISHED_CALCITE_SLAB, ChiseledItems.POLISHED_CALCITE,2);
                wall(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.POLISHED_CALCITE_WALL, ChiseledItems.POLISHED_CALCITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.POLISHED_CALCITE_WALL, Blocks.CALCITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.POLISHED_CALCITE_WALL, ChiseledItems.POLISHED_CALCITE);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CALCITE_BRICKS,4)
                        .pattern("##")
                        .pattern("##")
                        .define('#', ChiseledItems.POLISHED_CALCITE)
                        .unlockedBy(getHasName(ChiseledItems.CALCITE_BRICKS), has(ChiseledItems.POLISHED_CALCITE))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CALCITE_BRICKS, Blocks.CALCITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CALCITE_BRICKS, ChiseledItems.POLISHED_CALCITE);
                stairBuilder(ChiseledItems.CALCITE_BRICK_STAIRS, Ingredient.of(ChiseledItems.CALCITE_BRICKS))
                        .unlockedBy(getHasName(ChiseledItems.CALCITE_BRICK_STAIRS), has(ChiseledItems.CALCITE_BRICKS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CALCITE_BRICK_STAIRS, Blocks.CALCITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CALCITE_BRICK_STAIRS, ChiseledItems.POLISHED_CALCITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CALCITE_BRICK_STAIRS, ChiseledItems.CALCITE_BRICKS);
                slab(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CALCITE_BRICK_SLAB, ChiseledItems.CALCITE_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CALCITE_BRICK_SLAB, Blocks.CALCITE,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CALCITE_BRICK_SLAB, ChiseledItems.POLISHED_CALCITE,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CALCITE_BRICK_SLAB, ChiseledItems.CALCITE_BRICKS,2);
                wall(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CALCITE_BRICK_WALL, ChiseledItems.CALCITE_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CALCITE_BRICK_WALL, Blocks.CALCITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CALCITE_BRICK_WALL, ChiseledItems.POLISHED_CALCITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CALCITE_BRICK_WALL, ChiseledItems.CALCITE_BRICKS);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CUT_CALCITE_BRICKS)
                        .pattern("#")
                        .pattern("#")
                        .define('#', ChiseledItems.POLISHED_CALCITE_SLAB)
                        .unlockedBy(getHasName(ChiseledItems.CUT_CALCITE_BRICKS), has(ChiseledItems.POLISHED_CALCITE))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CUT_CALCITE_BRICKS, Blocks.CALCITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CUT_CALCITE_BRICKS, ChiseledItems.POLISHED_CALCITE);
                stairBuilder(ChiseledItems.CUT_CALCITE_BRICK_STAIRS, Ingredient.of(ChiseledItems.CUT_CALCITE_BRICKS))
                        .unlockedBy(getHasName(ChiseledItems.CUT_CALCITE_BRICK_STAIRS), has(ChiseledItems.CUT_CALCITE_BRICKS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CUT_CALCITE_BRICK_STAIRS, Blocks.CALCITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CUT_CALCITE_BRICK_STAIRS, ChiseledItems.POLISHED_CALCITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CUT_CALCITE_BRICK_STAIRS, ChiseledItems.CUT_CALCITE_BRICKS);
                slab(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CUT_CALCITE_BRICK_SLAB, ChiseledItems.CUT_CALCITE_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CUT_CALCITE_BRICK_SLAB, Blocks.CALCITE,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CUT_CALCITE_BRICK_SLAB, ChiseledItems.POLISHED_CALCITE,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CUT_CALCITE_BRICK_SLAB, ChiseledItems.CUT_CALCITE_BRICKS,2);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CALCITE_TILES,4)
                        .pattern("##")
                        .pattern("##")
                        .define('#', ChiseledItems.CALCITE_BRICKS)
                        .unlockedBy(getHasName(ChiseledItems.CALCITE_TILES), has(ChiseledItems.CALCITE_BRICKS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CALCITE_TILES, Blocks.CALCITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CALCITE_TILES, ChiseledItems.POLISHED_CALCITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CALCITE_TILES, ChiseledItems.CALCITE_BRICKS);
                stairBuilder(ChiseledItems.CALCITE_TILE_STAIRS, Ingredient.of(ChiseledItems.CALCITE_TILES))
                        .unlockedBy(getHasName(ChiseledItems.CALCITE_TILE_STAIRS), has(ChiseledItems.CALCITE_TILES))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CALCITE_TILE_STAIRS, Blocks.CALCITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CALCITE_TILE_STAIRS, ChiseledItems.POLISHED_CALCITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CALCITE_TILE_STAIRS, ChiseledItems.CALCITE_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CALCITE_TILE_STAIRS, ChiseledItems.CALCITE_TILES);
                slab(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CALCITE_TILE_SLAB, ChiseledItems.CALCITE_TILES);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CALCITE_TILE_SLAB, Blocks.CALCITE,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CALCITE_TILE_SLAB, ChiseledItems.POLISHED_CALCITE,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CALCITE_TILE_SLAB, ChiseledItems.CALCITE_BRICKS,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CALCITE_TILE_SLAB, ChiseledItems.CALCITE_TILES,2);
                wall(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CALCITE_TILE_WALL, ChiseledItems.CALCITE_TILES);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CALCITE_TILE_WALL, Blocks.CALCITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CALCITE_TILE_WALL, ChiseledItems.POLISHED_CALCITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CALCITE_TILE_WALL, ChiseledItems.CALCITE_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CALCITE_TILE_WALL, ChiseledItems.CALCITE_TILES);

                stairBuilder(ChiseledItems.DRIPSTONE_STAIRS, Ingredient.of(Blocks.DRIPSTONE_BLOCK))
                        .unlockedBy(getHasName(ChiseledItems.DRIPSTONE_STAIRS), has(Blocks.DRIPSTONE_BLOCK))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.DRIPSTONE_STAIRS, Blocks.DRIPSTONE_BLOCK);
                slab(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.DRIPSTONE_SLAB, Blocks.DRIPSTONE_BLOCK);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.DRIPSTONE_SLAB, Blocks.DRIPSTONE_BLOCK,2);
                wall(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.DRIPSTONE_WALL, Blocks.DRIPSTONE_BLOCK);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.DRIPSTONE_WALL, Blocks.DRIPSTONE_BLOCK);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.POLISHED_DRIPSTONE,4)
                        .pattern("##")
                        .pattern("##")
                        .define('#', Blocks.DRIPSTONE_BLOCK)
                        .unlockedBy(getHasName(ChiseledItems.POLISHED_DRIPSTONE), has(Blocks.DRIPSTONE_BLOCK))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.POLISHED_DRIPSTONE, Blocks.DRIPSTONE_BLOCK);
                stairBuilder(ChiseledItems.POLISHED_DRIPSTONE_STAIRS, Ingredient.of(ChiseledItems.POLISHED_DRIPSTONE))
                        .unlockedBy(getHasName(ChiseledItems.POLISHED_DRIPSTONE_STAIRS), has(ChiseledItems.POLISHED_DRIPSTONE))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.POLISHED_DRIPSTONE_STAIRS, Blocks.DRIPSTONE_BLOCK);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.POLISHED_DRIPSTONE_STAIRS, ChiseledItems.POLISHED_DRIPSTONE);
                slab(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.POLISHED_DRIPSTONE_SLAB, ChiseledItems.POLISHED_DRIPSTONE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.POLISHED_DRIPSTONE_SLAB, Blocks.DRIPSTONE_BLOCK, 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.POLISHED_DRIPSTONE_SLAB, ChiseledItems.POLISHED_DRIPSTONE,2);
                wall(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.POLISHED_DRIPSTONE_WALL, ChiseledItems.POLISHED_DRIPSTONE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.POLISHED_DRIPSTONE_WALL, Blocks.DRIPSTONE_BLOCK);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.POLISHED_DRIPSTONE_WALL, ChiseledItems.POLISHED_DRIPSTONE);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.DRIPSTONE_BRICKS,4)
                        .pattern("##")
                        .pattern("##")
                        .define('#', ChiseledItems.POLISHED_DRIPSTONE)
                        .unlockedBy(getHasName(ChiseledItems.DRIPSTONE_BRICKS), has(ChiseledItems.POLISHED_DRIPSTONE))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.DRIPSTONE_BRICKS, Blocks.DRIPSTONE_BLOCK);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.DRIPSTONE_BRICKS, ChiseledItems.POLISHED_DRIPSTONE);
                stairBuilder(ChiseledItems.DRIPSTONE_BRICK_STAIRS, Ingredient.of(ChiseledItems.DRIPSTONE_BRICKS))
                        .unlockedBy(getHasName(ChiseledItems.DRIPSTONE_BRICK_STAIRS), has(ChiseledItems.DRIPSTONE_BRICKS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.DRIPSTONE_BRICK_STAIRS, Blocks.DRIPSTONE_BLOCK);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.DRIPSTONE_BRICK_STAIRS, ChiseledItems.POLISHED_DRIPSTONE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.DRIPSTONE_BRICK_STAIRS, ChiseledItems.DRIPSTONE_BRICKS);
                slab(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.DRIPSTONE_BRICK_SLAB, ChiseledItems.DRIPSTONE_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.DRIPSTONE_BRICK_SLAB, Blocks.DRIPSTONE_BLOCK,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.DRIPSTONE_BRICK_SLAB, ChiseledItems.POLISHED_DRIPSTONE,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.DRIPSTONE_BRICK_SLAB, ChiseledItems.DRIPSTONE_BRICKS,2);
                wall(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.DRIPSTONE_BRICK_WALL, ChiseledItems.DRIPSTONE_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.DRIPSTONE_BRICK_WALL, Blocks.DRIPSTONE_BLOCK);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.DRIPSTONE_BRICK_WALL, ChiseledItems.POLISHED_DRIPSTONE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.DRIPSTONE_BRICK_WALL, ChiseledItems.DRIPSTONE_BRICKS);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CUT_DRIPSTONE_BRICKS)
                        .pattern("#")
                        .pattern("#")
                        .define('#', ChiseledItems.POLISHED_DRIPSTONE_SLAB)
                        .unlockedBy(getHasName(ChiseledItems.CUT_DRIPSTONE_BRICKS), has(ChiseledItems.POLISHED_DRIPSTONE))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CUT_DRIPSTONE_BRICKS, Blocks.DRIPSTONE_BLOCK);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CUT_DRIPSTONE_BRICKS, ChiseledItems.POLISHED_DRIPSTONE);
                stairBuilder(ChiseledItems.CUT_DRIPSTONE_BRICK_STAIRS, Ingredient.of(ChiseledItems.CUT_DRIPSTONE_BRICKS))
                        .unlockedBy(getHasName(ChiseledItems.CUT_DRIPSTONE_BRICK_STAIRS), has(ChiseledItems.CUT_DRIPSTONE_BRICKS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CUT_DRIPSTONE_BRICK_STAIRS, Blocks.DRIPSTONE_BLOCK);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CUT_DRIPSTONE_BRICK_STAIRS, ChiseledItems.POLISHED_DRIPSTONE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CUT_DRIPSTONE_BRICK_STAIRS, ChiseledItems.CUT_DRIPSTONE_BRICKS);
                slab(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CUT_DRIPSTONE_BRICK_SLAB, ChiseledItems.CUT_DRIPSTONE_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CUT_DRIPSTONE_BRICK_SLAB, Blocks.DRIPSTONE_BLOCK,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CUT_DRIPSTONE_BRICK_SLAB, ChiseledItems.POLISHED_DRIPSTONE,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CUT_DRIPSTONE_BRICK_SLAB, ChiseledItems.CUT_DRIPSTONE_BRICKS,2);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.DRIPSTONE_TILES,4)
                        .pattern("##")
                        .pattern("##")
                        .define('#', ChiseledItems.DRIPSTONE_BRICKS)
                        .unlockedBy(getHasName(ChiseledItems.DRIPSTONE_TILES), has(ChiseledItems.DRIPSTONE_BRICKS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.DRIPSTONE_TILES, Blocks.DRIPSTONE_BLOCK);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.DRIPSTONE_TILES, ChiseledItems.POLISHED_DRIPSTONE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.DRIPSTONE_TILES, ChiseledItems.DRIPSTONE_BRICKS);
                stairBuilder(ChiseledItems.DRIPSTONE_TILE_STAIRS, Ingredient.of(ChiseledItems.DRIPSTONE_TILES))
                        .unlockedBy(getHasName(ChiseledItems.DRIPSTONE_TILE_STAIRS), has(ChiseledItems.DRIPSTONE_TILES))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.DRIPSTONE_TILE_STAIRS, Blocks.DRIPSTONE_BLOCK);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.DRIPSTONE_TILE_STAIRS, ChiseledItems.POLISHED_DRIPSTONE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.DRIPSTONE_TILE_STAIRS, ChiseledItems.DRIPSTONE_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.DRIPSTONE_TILE_STAIRS, ChiseledItems.DRIPSTONE_TILES);
                slab(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.DRIPSTONE_TILE_SLAB, ChiseledItems.DRIPSTONE_TILES);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.DRIPSTONE_TILE_SLAB, Blocks.DRIPSTONE_BLOCK,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.DRIPSTONE_TILE_SLAB, ChiseledItems.POLISHED_DRIPSTONE,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.DRIPSTONE_TILE_SLAB, ChiseledItems.DRIPSTONE_BRICKS,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.DRIPSTONE_TILE_SLAB, ChiseledItems.DRIPSTONE_TILES,2);
                wall(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.DRIPSTONE_TILE_WALL, ChiseledItems.DRIPSTONE_TILES);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.DRIPSTONE_TILE_WALL, Blocks.DRIPSTONE_BLOCK);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.DRIPSTONE_TILE_WALL, ChiseledItems.POLISHED_DRIPSTONE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.DRIPSTONE_TILE_WALL, ChiseledItems.DRIPSTONE_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.DRIPSTONE_TILE_WALL, ChiseledItems.DRIPSTONE_TILES);

                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.MIXED_BRICKS,4)
                        .pattern("##")
                        .pattern("##")
                        .define('#', Blocks.BRICKS)
                        .unlockedBy(getHasName(ChiseledItems.MIXED_BRICKS), has(Blocks.BRICKS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.MIXED_BRICKS, Blocks.BRICKS);
                stairBuilder(ChiseledItems.MIXED_BRICK_STAIRS, Ingredient.of(ChiseledItems.MIXED_BRICKS))
                        .unlockedBy(getHasName(ChiseledItems.MIXED_BRICK_STAIRS), has(ChiseledItems.MIXED_BRICKS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.MIXED_BRICK_STAIRS, Blocks.BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.MIXED_BRICK_STAIRS, ChiseledItems.MIXED_BRICKS);
                slab(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.MIXED_BRICK_SLAB, ChiseledItems.MIXED_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.MIXED_BRICK_SLAB, Blocks.BRICKS,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.MIXED_BRICK_SLAB, ChiseledItems.MIXED_BRICKS,2);
                wall(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.MIXED_BRICK_WALL, ChiseledItems.MIXED_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.MIXED_BRICK_WALL, Blocks.BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.MIXED_BRICK_WALL, ChiseledItems.MIXED_BRICKS);
                shapeless(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.MOSSY_BRICKS)
                        .requires(Blocks.BRICKS)
                        .requires(Blocks.MOSS_BLOCK)
                        .unlockedBy(getHasName(ChiseledItems.MOSSY_BRICKS), has(Blocks.BRICKS))
                        .save(output, "mossy_bricks_from_moss");
                shapeless(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.MOSSY_BRICKS)
                        .requires(Blocks.BRICKS)
                        .requires(Blocks.VINE)
                        .unlockedBy(getHasName(ChiseledItems.MOSSY_BRICKS), has(Blocks.BRICKS))
                        .save(output, "mossy_bricks_from_vine");
                stairBuilder(ChiseledItems.MOSSY_BRICK_STAIRS, Ingredient.of(ChiseledItems.MOSSY_BRICKS))
                        .unlockedBy(getHasName(ChiseledItems.MOSSY_BRICK_STAIRS), has(ChiseledItems.MOSSY_BRICKS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.MOSSY_BRICK_STAIRS, ChiseledItems.MOSSY_BRICKS);
                slab(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.MOSSY_BRICK_SLAB, ChiseledItems.MOSSY_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.MOSSY_BRICK_SLAB, ChiseledItems.MOSSY_BRICKS,2);
                wall(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.MOSSY_BRICK_WALL, ChiseledItems.MOSSY_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.MOSSY_BRICK_WALL, ChiseledItems.MOSSY_BRICKS);

                stairBuilder(ChiseledItems.PACKED_MUD_STAIRS, Ingredient.of(Blocks.PACKED_MUD))
                        .unlockedBy(getHasName(ChiseledItems.PACKED_MUD_STAIRS), has(Blocks.PACKED_MUD))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.PACKED_MUD_STAIRS, Blocks.PACKED_MUD);
                slab(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.PACKED_MUD_SLAB, Blocks.PACKED_MUD);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.PACKED_MUD_SLAB, Blocks.PACKED_MUD,2);
                wall(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.PACKED_MUD_WALL, Blocks.PACKED_MUD);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.PACKED_MUD_WALL, Blocks.PACKED_MUD);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.POLISHED_MUD,4)
                        .pattern("##")
                        .pattern("##")
                        .define('#', Blocks.PACKED_MUD)
                        .unlockedBy(getHasName(ChiseledItems.POLISHED_MUD), has(Blocks.PACKED_MUD))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.POLISHED_MUD, Blocks.PACKED_MUD);
                stairBuilder(ChiseledItems.POLISHED_MUD_STAIRS, Ingredient.of(ChiseledItems.POLISHED_MUD))
                        .unlockedBy(getHasName(ChiseledItems.POLISHED_MUD_STAIRS), has(ChiseledItems.POLISHED_MUD))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.POLISHED_MUD_STAIRS, Blocks.PACKED_MUD);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.POLISHED_MUD_STAIRS, ChiseledItems.POLISHED_MUD);
                slab(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.POLISHED_MUD_SLAB, ChiseledItems.POLISHED_MUD);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.POLISHED_MUD_SLAB, Blocks.PACKED_MUD,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.POLISHED_MUD_SLAB, ChiseledItems.POLISHED_MUD,2);
                wall(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.POLISHED_MUD_WALL, ChiseledItems.POLISHED_MUD);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.POLISHED_MUD_WALL, Blocks.PACKED_MUD);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.POLISHED_MUD_WALL, ChiseledItems.POLISHED_MUD);
                shaped(RecipeCategory.BUILDING_BLOCKS, Blocks.MUD_BRICKS,4)
                        .pattern("##")
                        .pattern("##")
                        .define('#', ChiseledItems.POLISHED_MUD)
                        .unlockedBy(getHasName(Blocks.MUD_BRICKS), has(ChiseledItems.POLISHED_MUD))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, Blocks.MUD_BRICKS, Blocks.PACKED_MUD);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, Blocks.MUD_BRICKS, ChiseledItems.POLISHED_MUD);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, Blocks.MUD_BRICK_STAIRS, Blocks.PACKED_MUD);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, Blocks.MUD_BRICK_STAIRS, ChiseledItems.POLISHED_MUD);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, Blocks.MUD_BRICK_SLAB, Blocks.PACKED_MUD,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, Blocks.MUD_BRICK_SLAB, ChiseledItems.POLISHED_MUD,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, Blocks.MUD_BRICK_WALL, Blocks.PACKED_MUD);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, Blocks.MUD_BRICK_WALL, ChiseledItems.POLISHED_MUD);
                shapeless(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.MOSSY_MUD_BRICKS)
                        .requires(Blocks.MUD_BRICKS)
                        .requires(Blocks.MOSS_BLOCK)
                        .unlockedBy(getHasName(ChiseledItems.MOSSY_MUD_BRICKS), has(Blocks.MUD_BRICKS))
                        .save(output, "mossy_mud_bricks_from_moss");
                shapeless(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.MOSSY_MUD_BRICKS)
                        .requires(Blocks.MUD_BRICKS)
                        .requires(Blocks.VINE)
                        .unlockedBy(getHasName(ChiseledItems.MOSSY_MUD_BRICKS), has(Blocks.MUD_BRICKS))
                        .save(output, "mossy_mud_bricks_from_vine");
                stairBuilder(ChiseledItems.MOSSY_MUD_BRICK_STAIRS, Ingredient.of(ChiseledItems.MOSSY_MUD_BRICKS))
                        .unlockedBy(getHasName(ChiseledItems.MOSSY_MUD_BRICK_STAIRS), has(ChiseledItems.MOSSY_MUD_BRICKS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.MOSSY_MUD_BRICK_STAIRS, ChiseledItems.MOSSY_MUD_BRICKS);
                slab(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.MOSSY_MUD_BRICK_SLAB, ChiseledItems.MOSSY_MUD_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.MOSSY_MUD_BRICK_SLAB, ChiseledItems.MOSSY_MUD_BRICKS,2);
                wall(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.MOSSY_MUD_BRICK_WALL, ChiseledItems.MOSSY_MUD_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.MOSSY_MUD_BRICK_WALL, ChiseledItems.MOSSY_MUD_BRICKS);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CUT_MUD_BRICKS)
                        .pattern("#")
                        .pattern("#")
                        .define('#', ChiseledItems.POLISHED_MUD_SLAB)
                        .unlockedBy(getHasName(ChiseledItems.CUT_MUD_BRICKS), has(ChiseledItems.POLISHED_MUD))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CUT_MUD_BRICKS, Blocks.PACKED_MUD);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CUT_MUD_BRICKS, ChiseledItems.POLISHED_MUD);
                stairBuilder(ChiseledItems.CUT_MUD_BRICK_STAIRS, Ingredient.of(ChiseledItems.CUT_MUD_BRICKS))
                        .unlockedBy(getHasName(ChiseledItems.CUT_MUD_BRICK_STAIRS), has(ChiseledItems.CUT_MUD_BRICKS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CUT_MUD_BRICK_STAIRS, Blocks.PACKED_MUD);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CUT_MUD_BRICK_STAIRS, ChiseledItems.POLISHED_MUD);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CUT_MUD_BRICK_STAIRS, ChiseledItems.CUT_MUD_BRICKS);
                slab(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CUT_MUD_BRICK_SLAB, ChiseledItems.CUT_MUD_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CUT_MUD_BRICK_SLAB, Blocks.PACKED_MUD,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CUT_MUD_BRICK_SLAB, ChiseledItems.POLISHED_MUD,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CUT_MUD_BRICK_SLAB, ChiseledItems.CUT_MUD_BRICKS,2);
                shapeless(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.MOSSY_CUT_MUD_BRICKS)
                        .requires(ChiseledItems.CUT_MUD_BRICKS)
                        .requires(Blocks.MOSS_BLOCK)
                        .unlockedBy(getHasName(ChiseledItems.MOSSY_CUT_MUD_BRICKS), has(ChiseledItems.CUT_MUD_BRICKS))
                        .save(output, "mossy_cut_mud_bricks_from_moss");
                shapeless(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.MOSSY_CUT_MUD_BRICKS)
                        .requires(ChiseledItems.CUT_MUD_BRICKS)
                        .requires(Blocks.VINE)
                        .unlockedBy(getHasName(ChiseledItems.MOSSY_CUT_MUD_BRICKS), has(ChiseledItems.CUT_MUD_BRICKS))
                        .save(output, "mossy_cut_mud_bricks_from_vine");
                stairBuilder(ChiseledItems.MOSSY_CUT_MUD_BRICK_STAIRS, Ingredient.of(ChiseledItems.MOSSY_CUT_MUD_BRICKS))
                        .unlockedBy(getHasName(ChiseledItems.MOSSY_CUT_MUD_BRICK_STAIRS), has(ChiseledItems.MOSSY_CUT_MUD_BRICKS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.MOSSY_CUT_MUD_BRICK_STAIRS, ChiseledItems.MOSSY_CUT_MUD_BRICKS);
                slab(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.MOSSY_CUT_MUD_BRICK_SLAB, ChiseledItems.MOSSY_CUT_MUD_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.MOSSY_CUT_MUD_BRICK_SLAB, ChiseledItems.MOSSY_CUT_MUD_BRICKS,2);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.MUD_TILES,4)
                        .pattern("##")
                        .pattern("##")
                        .define('#', Blocks.MUD_BRICKS)
                        .unlockedBy(getHasName(ChiseledItems.MUD_TILES), has(Blocks.MUD_BRICKS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.MUD_TILES, Blocks.PACKED_MUD);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.MUD_TILES, ChiseledItems.POLISHED_MUD);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.MUD_TILES, Blocks.MUD_BRICKS);
                stairBuilder(ChiseledItems.MUD_TILE_STAIRS, Ingredient.of(ChiseledItems.MUD_TILES))
                        .unlockedBy(getHasName(ChiseledItems.MUD_TILE_STAIRS), has(ChiseledItems.MUD_TILES))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.MUD_TILE_STAIRS, Blocks.PACKED_MUD);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.MUD_TILE_STAIRS, ChiseledItems.POLISHED_MUD);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.MUD_TILE_STAIRS, Blocks.MUD_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.MUD_TILE_STAIRS, ChiseledItems.MUD_TILES);
                slab(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.MUD_TILE_SLAB, ChiseledItems.MUD_TILES);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.MUD_TILE_SLAB, Blocks.PACKED_MUD,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.MUD_TILE_SLAB, ChiseledItems.POLISHED_MUD,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.MUD_TILE_SLAB, Blocks.MUD_BRICKS,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.MUD_TILE_SLAB, ChiseledItems.MUD_TILES,2);
                wall(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.MUD_TILE_WALL, ChiseledItems.MUD_TILES);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.MUD_TILE_WALL, Blocks.PACKED_MUD);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.MUD_TILE_WALL, ChiseledItems.POLISHED_MUD);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.MUD_TILE_WALL, Blocks.MUD_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.MUD_TILE_WALL, ChiseledItems.MUD_TILES);
                shapeless(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.MOSSY_MUD_TILES)
                        .requires(ChiseledItems.MUD_TILES)
                        .requires(Blocks.MOSS_BLOCK)
                        .unlockedBy(getHasName(ChiseledItems.MOSSY_MUD_TILES), has(ChiseledItems.MUD_TILES))
                        .save(output, "mossy_mud_tiles_from_moss");
                shapeless(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.MOSSY_MUD_TILES)
                        .requires(ChiseledItems.MUD_TILES)
                        .requires(Blocks.VINE)
                        .unlockedBy(getHasName(ChiseledItems.MOSSY_MUD_TILES), has(ChiseledItems.MUD_TILES))
                        .save(output, "mossy_mud_tiles_from_vine");
                stairBuilder(ChiseledItems.MOSSY_MUD_TILE_STAIRS, Ingredient.of(ChiseledItems.MOSSY_MUD_TILES))
                        .unlockedBy(getHasName(ChiseledItems.MOSSY_MUD_TILE_STAIRS), has(ChiseledItems.MOSSY_MUD_TILES))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.MOSSY_MUD_TILE_STAIRS, ChiseledItems.MOSSY_MUD_TILES);
                slab(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.MOSSY_MUD_TILE_SLAB, ChiseledItems.MOSSY_MUD_TILES);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.MOSSY_MUD_TILE_SLAB, ChiseledItems.MOSSY_MUD_TILES,2);
                wall(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.MOSSY_MUD_TILE_WALL, ChiseledItems.MOSSY_MUD_TILES);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.MOSSY_MUD_TILE_WALL, ChiseledItems.MOSSY_MUD_TILES);
                
                wall(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.SMOOTH_SANDSTONE_WALL, Blocks.SMOOTH_SANDSTONE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.SMOOTH_SANDSTONE_WALL, Blocks.SMOOTH_SANDSTONE);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.SANDSTONE_BRICKS,4)
                        .pattern("##")
                        .pattern("##")
                        .define('#', Blocks.SMOOTH_SANDSTONE)
                        .unlockedBy(getHasName(ChiseledItems.SANDSTONE_BRICKS), has(Blocks.SMOOTH_SANDSTONE))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.SANDSTONE_BRICKS, Blocks.SMOOTH_SANDSTONE);
                stairBuilder(ChiseledItems.SANDSTONE_BRICK_STAIRS, Ingredient.of(ChiseledItems.SANDSTONE_BRICKS))
                        .unlockedBy(getHasName(ChiseledItems.SANDSTONE_BRICK_STAIRS), has(ChiseledItems.SANDSTONE_BRICKS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.SANDSTONE_BRICK_STAIRS, Blocks.SMOOTH_SANDSTONE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.SANDSTONE_BRICK_STAIRS, ChiseledItems.SANDSTONE_BRICKS);
                slab(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.SANDSTONE_BRICK_SLAB, ChiseledItems.SANDSTONE_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.SANDSTONE_BRICK_SLAB, Blocks.SMOOTH_SANDSTONE,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.SANDSTONE_BRICK_SLAB, ChiseledItems.SANDSTONE_BRICKS,2);
                wall(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.SANDSTONE_BRICK_WALL, ChiseledItems.SANDSTONE_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.SANDSTONE_BRICK_WALL, Blocks.SMOOTH_SANDSTONE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.SANDSTONE_BRICK_WALL, ChiseledItems.SANDSTONE_BRICKS);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CUT_SANDSTONE_BRICKS)
                        .pattern("#")
                        .pattern("#")
                        .define('#', Blocks.SMOOTH_SANDSTONE_SLAB)
                        .unlockedBy(getHasName(ChiseledItems.CUT_SANDSTONE_BRICKS), has(Blocks.SMOOTH_SANDSTONE))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CUT_SANDSTONE_BRICKS, Blocks.SMOOTH_SANDSTONE);
                stairBuilder(ChiseledItems.CUT_SANDSTONE_BRICK_STAIRS, Ingredient.of(ChiseledItems.CUT_SANDSTONE_BRICKS))
                        .unlockedBy(getHasName(ChiseledItems.CUT_SANDSTONE_BRICK_STAIRS), has(ChiseledItems.CUT_SANDSTONE_BRICKS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CUT_SANDSTONE_BRICK_STAIRS, Blocks.SMOOTH_SANDSTONE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CUT_SANDSTONE_BRICK_STAIRS, ChiseledItems.CUT_SANDSTONE_BRICKS);
                slab(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CUT_SANDSTONE_BRICK_SLAB, ChiseledItems.CUT_SANDSTONE_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CUT_SANDSTONE_BRICK_SLAB, Blocks.SMOOTH_SANDSTONE,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CUT_SANDSTONE_BRICK_SLAB, ChiseledItems.CUT_SANDSTONE_BRICKS,2);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.SANDSTONE_TILES,4)
                        .pattern("##")
                        .pattern("##")
                        .define('#', ChiseledItems.SANDSTONE_BRICKS)
                        .unlockedBy(getHasName(ChiseledItems.SANDSTONE_TILES), has(ChiseledItems.SANDSTONE_BRICKS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.SANDSTONE_TILES, Blocks.SMOOTH_SANDSTONE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.SANDSTONE_TILES, ChiseledItems.SANDSTONE_BRICKS);
                stairBuilder(ChiseledItems.SANDSTONE_TILE_STAIRS, Ingredient.of(ChiseledItems.SANDSTONE_TILES))
                        .unlockedBy(getHasName(ChiseledItems.SANDSTONE_TILE_STAIRS), has(ChiseledItems.SANDSTONE_TILES))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.SANDSTONE_TILE_STAIRS, Blocks.SMOOTH_SANDSTONE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.SANDSTONE_TILE_STAIRS, ChiseledItems.SANDSTONE_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.SANDSTONE_TILE_STAIRS, ChiseledItems.SANDSTONE_TILES);
                slab(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.SANDSTONE_TILE_SLAB, ChiseledItems.SANDSTONE_TILES);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.SANDSTONE_TILE_SLAB, Blocks.SMOOTH_SANDSTONE,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.SANDSTONE_TILE_SLAB, ChiseledItems.SANDSTONE_BRICKS,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.SANDSTONE_TILE_SLAB, ChiseledItems.SANDSTONE_TILES,2);
                wall(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.SANDSTONE_TILE_WALL, ChiseledItems.SANDSTONE_TILES);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.SANDSTONE_TILE_WALL, Blocks.SMOOTH_SANDSTONE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.SANDSTONE_TILE_WALL, ChiseledItems.SANDSTONE_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.SANDSTONE_TILE_WALL, ChiseledItems.SANDSTONE_TILES);

                wall(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.SMOOTH_RED_SANDSTONE_WALL, Blocks.SMOOTH_RED_SANDSTONE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.SMOOTH_RED_SANDSTONE_WALL, Blocks.SMOOTH_RED_SANDSTONE);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.RED_SANDSTONE_BRICKS,4)
                        .pattern("##")
                        .pattern("##")
                        .define('#', Blocks.SMOOTH_RED_SANDSTONE)
                        .unlockedBy(getHasName(ChiseledItems.RED_SANDSTONE_BRICKS), has(Blocks.SMOOTH_RED_SANDSTONE))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.RED_SANDSTONE_BRICKS, Blocks.SMOOTH_RED_SANDSTONE);
                stairBuilder(ChiseledItems.RED_SANDSTONE_BRICK_STAIRS, Ingredient.of(ChiseledItems.RED_SANDSTONE_BRICKS))
                        .unlockedBy(getHasName(ChiseledItems.RED_SANDSTONE_BRICK_STAIRS), has(ChiseledItems.RED_SANDSTONE_BRICKS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.RED_SANDSTONE_BRICK_STAIRS, Blocks.SMOOTH_RED_SANDSTONE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.RED_SANDSTONE_BRICK_STAIRS, ChiseledItems.RED_SANDSTONE_BRICKS);
                slab(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.RED_SANDSTONE_BRICK_SLAB, ChiseledItems.RED_SANDSTONE_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.RED_SANDSTONE_BRICK_SLAB, Blocks.SMOOTH_RED_SANDSTONE,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.RED_SANDSTONE_BRICK_SLAB, ChiseledItems.RED_SANDSTONE_BRICKS,2);
                wall(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.RED_SANDSTONE_BRICK_WALL, ChiseledItems.RED_SANDSTONE_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.RED_SANDSTONE_BRICK_WALL, Blocks.SMOOTH_RED_SANDSTONE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.RED_SANDSTONE_BRICK_WALL, ChiseledItems.RED_SANDSTONE_BRICKS);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CUT_RED_SANDSTONE_BRICKS)
                        .pattern("#")
                        .pattern("#")
                        .define('#', Blocks.SMOOTH_RED_SANDSTONE_SLAB)
                        .unlockedBy(getHasName(ChiseledItems.CUT_RED_SANDSTONE_BRICKS), has(Blocks.SMOOTH_RED_SANDSTONE))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CUT_RED_SANDSTONE_BRICKS, Blocks.SMOOTH_RED_SANDSTONE);
                stairBuilder(ChiseledItems.CUT_RED_SANDSTONE_BRICK_STAIRS, Ingredient.of(ChiseledItems.CUT_RED_SANDSTONE_BRICKS))
                        .unlockedBy(getHasName(ChiseledItems.CUT_RED_SANDSTONE_BRICK_STAIRS), has(ChiseledItems.CUT_RED_SANDSTONE_BRICKS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CUT_RED_SANDSTONE_BRICK_STAIRS, Blocks.SMOOTH_RED_SANDSTONE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CUT_RED_SANDSTONE_BRICK_STAIRS, ChiseledItems.CUT_RED_SANDSTONE_BRICKS);
                slab(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CUT_RED_SANDSTONE_BRICK_SLAB, ChiseledItems.CUT_RED_SANDSTONE_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CUT_RED_SANDSTONE_BRICK_SLAB, Blocks.SMOOTH_RED_SANDSTONE,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CUT_RED_SANDSTONE_BRICK_SLAB, ChiseledItems.CUT_RED_SANDSTONE_BRICKS,2);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.RED_SANDSTONE_TILES,4)
                        .pattern("##")
                        .pattern("##")
                        .define('#', ChiseledItems.RED_SANDSTONE_BRICKS)
                        .unlockedBy(getHasName(ChiseledItems.RED_SANDSTONE_TILES), has(ChiseledItems.RED_SANDSTONE_BRICKS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.RED_SANDSTONE_TILES, Blocks.SMOOTH_RED_SANDSTONE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.RED_SANDSTONE_TILES, ChiseledItems.RED_SANDSTONE_BRICKS);
                stairBuilder(ChiseledItems.RED_SANDSTONE_TILE_STAIRS, Ingredient.of(ChiseledItems.RED_SANDSTONE_TILES))
                        .unlockedBy(getHasName(ChiseledItems.RED_SANDSTONE_TILE_STAIRS), has(ChiseledItems.RED_SANDSTONE_TILES))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.RED_SANDSTONE_TILE_STAIRS, Blocks.SMOOTH_RED_SANDSTONE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.RED_SANDSTONE_TILE_STAIRS, ChiseledItems.RED_SANDSTONE_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.RED_SANDSTONE_TILE_STAIRS, ChiseledItems.RED_SANDSTONE_TILES);
                slab(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.RED_SANDSTONE_TILE_SLAB, ChiseledItems.RED_SANDSTONE_TILES);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.RED_SANDSTONE_TILE_SLAB, Blocks.SMOOTH_RED_SANDSTONE,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.RED_SANDSTONE_TILE_SLAB, ChiseledItems.RED_SANDSTONE_BRICKS,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.RED_SANDSTONE_TILE_SLAB, ChiseledItems.RED_SANDSTONE_TILES,2);
                wall(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.RED_SANDSTONE_TILE_WALL, ChiseledItems.RED_SANDSTONE_TILES);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.RED_SANDSTONE_TILE_WALL, Blocks.SMOOTH_RED_SANDSTONE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.RED_SANDSTONE_TILE_WALL, ChiseledItems.RED_SANDSTONE_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.RED_SANDSTONE_TILE_WALL, ChiseledItems.RED_SANDSTONE_TILES);

                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CUT_CINNABAR_BRICKS)
                        .pattern("#")
                        .pattern("#")
                        .define('#', Blocks.POLISHED_CINNABAR_SLAB)
                        .unlockedBy(getHasName(ChiseledItems.CUT_CINNABAR_BRICKS), has(Blocks.POLISHED_CINNABAR))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CUT_CINNABAR_BRICKS, Blocks.CINNABAR);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CUT_CINNABAR_BRICKS, Blocks.POLISHED_CINNABAR);
                stairBuilder(ChiseledItems.CUT_CINNABAR_BRICK_STAIRS, Ingredient.of(ChiseledItems.CUT_CINNABAR_BRICKS))
                        .unlockedBy(getHasName(ChiseledItems.CUT_CINNABAR_BRICK_STAIRS), has(ChiseledItems.CUT_CINNABAR_BRICKS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CUT_CINNABAR_BRICK_STAIRS, Blocks.CINNABAR);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CUT_CINNABAR_BRICK_STAIRS, Blocks.POLISHED_CINNABAR);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CUT_CINNABAR_BRICK_STAIRS, ChiseledItems.CUT_CINNABAR_BRICKS);
                slab(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CUT_CINNABAR_BRICK_SLAB, ChiseledItems.CUT_CINNABAR_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CUT_CINNABAR_BRICK_SLAB, Blocks.CINNABAR,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CUT_CINNABAR_BRICK_SLAB, Blocks.POLISHED_CINNABAR,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CUT_CINNABAR_BRICK_SLAB, ChiseledItems.CUT_CINNABAR_BRICKS,2);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CINNABAR_TILES,4)
                        .pattern("##")
                        .pattern("##")
                        .define('#', Blocks.CINNABAR_BRICKS)
                        .unlockedBy(getHasName(ChiseledItems.CINNABAR_TILES), has(Blocks.CINNABAR_BRICKS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CINNABAR_TILES, Blocks.CINNABAR);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CINNABAR_TILES, Blocks.POLISHED_CINNABAR);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CINNABAR_TILES, Blocks.CINNABAR_BRICKS);
                stairBuilder(ChiseledItems.CINNABAR_TILE_STAIRS, Ingredient.of(ChiseledItems.CINNABAR_TILES))
                        .unlockedBy(getHasName(ChiseledItems.CINNABAR_TILE_STAIRS), has(ChiseledItems.CINNABAR_TILES))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CINNABAR_TILE_STAIRS, Blocks.CINNABAR);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CINNABAR_TILE_STAIRS, Blocks.POLISHED_CINNABAR);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CINNABAR_TILE_STAIRS, Blocks.CINNABAR_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CINNABAR_TILE_STAIRS, ChiseledItems.CINNABAR_TILES);
                slab(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CINNABAR_TILE_SLAB, ChiseledItems.CINNABAR_TILES);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CINNABAR_TILE_SLAB, Blocks.CINNABAR,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CINNABAR_TILE_SLAB, Blocks.POLISHED_CINNABAR,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CINNABAR_TILE_SLAB, Blocks.CINNABAR_BRICKS,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CINNABAR_TILE_SLAB, ChiseledItems.CINNABAR_TILES,2);
                wall(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CINNABAR_TILE_WALL, ChiseledItems.CINNABAR_TILES);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CINNABAR_TILE_WALL, Blocks.CINNABAR);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CINNABAR_TILE_WALL, Blocks.POLISHED_CINNABAR);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CINNABAR_TILE_WALL, Blocks.CINNABAR_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CINNABAR_TILE_WALL, ChiseledItems.CINNABAR_TILES);

                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CUT_SULFUR_BRICKS)
                        .pattern("#")
                        .pattern("#")
                        .define('#', Blocks.POLISHED_SULFUR_SLAB)
                        .unlockedBy(getHasName(ChiseledItems.CUT_SULFUR_BRICKS), has(Blocks.POLISHED_SULFUR))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CUT_SULFUR_BRICKS, Blocks.SULFUR);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CUT_SULFUR_BRICKS, Blocks.POLISHED_SULFUR);
                stairBuilder(ChiseledItems.CUT_SULFUR_BRICK_STAIRS, Ingredient.of(ChiseledItems.CUT_SULFUR_BRICKS))
                        .unlockedBy(getHasName(ChiseledItems.CUT_SULFUR_BRICK_STAIRS), has(ChiseledItems.CUT_SULFUR_BRICKS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CUT_SULFUR_BRICK_STAIRS, Blocks.SULFUR);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CUT_SULFUR_BRICK_STAIRS, Blocks.POLISHED_SULFUR);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CUT_SULFUR_BRICK_STAIRS, ChiseledItems.CUT_SULFUR_BRICKS);
                slab(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CUT_SULFUR_BRICK_SLAB, ChiseledItems.CUT_SULFUR_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CUT_SULFUR_BRICK_SLAB, Blocks.SULFUR,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CUT_SULFUR_BRICK_SLAB, Blocks.POLISHED_SULFUR,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CUT_SULFUR_BRICK_SLAB, ChiseledItems.CUT_SULFUR_BRICKS,2);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.SULFUR_TILES,4)
                        .pattern("##")
                        .pattern("##")
                        .define('#', Blocks.SULFUR_BRICKS)
                        .unlockedBy(getHasName(ChiseledItems.SULFUR_TILES), has(Blocks.SULFUR_BRICKS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.SULFUR_TILES, Blocks.SULFUR);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.SULFUR_TILES, Blocks.POLISHED_SULFUR);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.SULFUR_TILES, Blocks.SULFUR_BRICKS);
                stairBuilder(ChiseledItems.SULFUR_TILE_STAIRS, Ingredient.of(ChiseledItems.SULFUR_TILES))
                        .unlockedBy(getHasName(ChiseledItems.SULFUR_TILE_STAIRS), has(ChiseledItems.SULFUR_TILES))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.SULFUR_TILE_STAIRS, Blocks.SULFUR);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.SULFUR_TILE_STAIRS, Blocks.POLISHED_SULFUR);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.SULFUR_TILE_STAIRS, Blocks.SULFUR_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.SULFUR_TILE_STAIRS, ChiseledItems.SULFUR_TILES);
                slab(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.SULFUR_TILE_SLAB, ChiseledItems.SULFUR_TILES);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.SULFUR_TILE_SLAB, Blocks.SULFUR,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.SULFUR_TILE_SLAB, Blocks.POLISHED_SULFUR,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.SULFUR_TILE_SLAB, Blocks.SULFUR_BRICKS,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.SULFUR_TILE_SLAB, ChiseledItems.SULFUR_TILES,2);
                wall(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.SULFUR_TILE_WALL, ChiseledItems.SULFUR_TILES);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.SULFUR_TILE_WALL, Blocks.SULFUR);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.SULFUR_TILE_WALL, Blocks.POLISHED_SULFUR);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.SULFUR_TILE_WALL, Blocks.SULFUR_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.SULFUR_TILE_WALL, ChiseledItems.SULFUR_TILES);
                
                shaped(RecipeCategory.BUILDING_BLOCKS, Blocks.PRISMARINE_BRICKS,4)
                        .pattern("##")
                        .pattern("##")
                        .define('#', Blocks.PRISMARINE)
                        .unlockedBy(getHasName(Blocks.PRISMARINE_BRICKS), has(Blocks.PRISMARINE))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, Blocks.PRISMARINE_BRICKS, Blocks.PRISMARINE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, Blocks.PRISMARINE_BRICK_STAIRS, Blocks.PRISMARINE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, Blocks.PRISMARINE_BRICK_SLAB, Blocks.PRISMARINE);
                wall(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.PRISMARINE_BRICK_WALL, Blocks.PRISMARINE_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.PRISMARINE_BRICK_WALL, Blocks.PRISMARINE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.PRISMARINE_BRICK_WALL, Blocks.PRISMARINE_BRICKS);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CUT_PRISMARINE_BRICKS)
                        .pattern("#")
                        .pattern("#")
                        .define('#', Blocks.PRISMARINE_SLAB)
                        .unlockedBy(getHasName(ChiseledItems.CUT_PRISMARINE_BRICKS), has(Blocks.PRISMARINE))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CUT_PRISMARINE_BRICKS, Blocks.PRISMARINE);
                stairBuilder(ChiseledItems.CUT_PRISMARINE_BRICK_STAIRS, Ingredient.of(ChiseledItems.CUT_PRISMARINE_BRICKS))
                        .unlockedBy(getHasName(ChiseledItems.CUT_PRISMARINE_BRICK_STAIRS), has(ChiseledItems.CUT_PRISMARINE_BRICKS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CUT_PRISMARINE_BRICK_STAIRS, Blocks.PRISMARINE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CUT_PRISMARINE_BRICK_STAIRS, ChiseledItems.CUT_PRISMARINE_BRICKS);
                slab(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CUT_PRISMARINE_BRICK_SLAB, ChiseledItems.CUT_PRISMARINE_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CUT_PRISMARINE_BRICK_SLAB, Blocks.PRISMARINE,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CUT_PRISMARINE_BRICK_SLAB, ChiseledItems.CUT_PRISMARINE_BRICKS,2);
                shaped(RecipeCategory.BUILDING_BLOCKS, Blocks.DARK_PRISMARINE,4)
                        .pattern(" # ")
                        .pattern("#0#")
                        .pattern(" # ")
                        .define('#', Items.PRISMARINE_SHARD)
                        .define('0', Items.DYE.black())
                        .unlockedBy(getHasName(Blocks.DARK_PRISMARINE), has(Items.PRISMARINE_SHARD))
                        .save(output);
                wall(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.DARK_PRISMARINE_WALL, Blocks.DARK_PRISMARINE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.DARK_PRISMARINE_WALL, Blocks.DARK_PRISMARINE);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.DARK_PRISMARINE_BRICKS,4)
                        .pattern("##")
                        .pattern("##")
                        .define('#', Blocks.DARK_PRISMARINE)
                        .unlockedBy(getHasName(ChiseledItems.DARK_PRISMARINE_BRICKS), has(Blocks.DARK_PRISMARINE))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.DARK_PRISMARINE_BRICKS, Blocks.DARK_PRISMARINE);
                stairBuilder(ChiseledItems.DARK_PRISMARINE_BRICK_STAIRS, Ingredient.of(ChiseledItems.DARK_PRISMARINE_BRICKS))
                        .unlockedBy(getHasName(ChiseledItems.DARK_PRISMARINE_BRICK_STAIRS), has(ChiseledItems.DARK_PRISMARINE_BRICKS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.DARK_PRISMARINE_BRICK_STAIRS, Blocks.DARK_PRISMARINE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.DARK_PRISMARINE_BRICK_STAIRS, ChiseledItems.DARK_PRISMARINE_BRICKS);
                slab(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.DARK_PRISMARINE_BRICK_SLAB, ChiseledItems.DARK_PRISMARINE_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.DARK_PRISMARINE_BRICK_SLAB, Blocks.DARK_PRISMARINE,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.DARK_PRISMARINE_BRICK_SLAB, ChiseledItems.DARK_PRISMARINE_BRICKS,2);
                wall(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.DARK_PRISMARINE_BRICK_WALL, ChiseledItems.DARK_PRISMARINE_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.DARK_PRISMARINE_BRICK_WALL, Blocks.DARK_PRISMARINE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.DARK_PRISMARINE_BRICK_WALL, ChiseledItems.DARK_PRISMARINE_BRICKS);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CUT_DARK_PRISMARINE_BRICKS)
                        .pattern("#")
                        .pattern("#")
                        .define('#', Blocks.DARK_PRISMARINE_SLAB)
                        .unlockedBy(getHasName(ChiseledItems.CUT_DARK_PRISMARINE_BRICKS), has(Blocks.DARK_PRISMARINE))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CUT_DARK_PRISMARINE_BRICKS, Blocks.DARK_PRISMARINE);
                stairBuilder(ChiseledItems.CUT_DARK_PRISMARINE_BRICK_STAIRS, Ingredient.of(ChiseledItems.CUT_DARK_PRISMARINE_BRICKS))
                        .unlockedBy(getHasName(ChiseledItems.CUT_DARK_PRISMARINE_BRICK_STAIRS), has(ChiseledItems.CUT_DARK_PRISMARINE_BRICKS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CUT_DARK_PRISMARINE_BRICK_STAIRS, Blocks.DARK_PRISMARINE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CUT_DARK_PRISMARINE_BRICK_STAIRS, ChiseledItems.CUT_DARK_PRISMARINE_BRICKS);
                slab(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CUT_DARK_PRISMARINE_BRICK_SLAB, ChiseledItems.CUT_DARK_PRISMARINE_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CUT_DARK_PRISMARINE_BRICK_SLAB, Blocks.DARK_PRISMARINE,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CUT_DARK_PRISMARINE_BRICK_SLAB, ChiseledItems.CUT_DARK_PRISMARINE_BRICKS,2);

                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.TERRACOTTA_BRICKS,4)
                        .pattern("##")
                        .pattern("##")
                        .define('#', Blocks.TERRACOTTA)
                        .unlockedBy(getHasName(ChiseledItems.TERRACOTTA_BRICKS), has(Blocks.TERRACOTTA))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.TERRACOTTA_BRICKS, Blocks.TERRACOTTA);
                stairBuilder(ChiseledItems.TERRACOTTA_BRICK_STAIRS, Ingredient.of(ChiseledItems.TERRACOTTA_BRICKS))
                        .unlockedBy(getHasName(ChiseledItems.TERRACOTTA_BRICK_STAIRS), has(ChiseledItems.TERRACOTTA_BRICKS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.TERRACOTTA_BRICK_STAIRS, Blocks.TERRACOTTA);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.TERRACOTTA_BRICK_STAIRS, ChiseledItems.TERRACOTTA_BRICKS);
                slab(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.TERRACOTTA_BRICK_SLAB, ChiseledItems.TERRACOTTA_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.TERRACOTTA_BRICK_SLAB, Blocks.TERRACOTTA,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.TERRACOTTA_BRICK_SLAB, ChiseledItems.TERRACOTTA_BRICKS,2);
                wall(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.TERRACOTTA_BRICK_WALL, ChiseledItems.TERRACOTTA_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.TERRACOTTA_BRICK_WALL, Blocks.TERRACOTTA);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.TERRACOTTA_BRICK_WALL, ChiseledItems.TERRACOTTA_BRICKS);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.WHITE_TERRACOTTA_BRICKS,4)
                        .pattern("##")
                        .pattern("##")
                        .define('#', Blocks.DYED_TERRACOTTA.white())
                        .unlockedBy(getHasName(ChiseledItems.WHITE_TERRACOTTA_BRICKS), has(Blocks.DYED_TERRACOTTA.white()))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.WHITE_TERRACOTTA_BRICKS, Blocks.DYED_TERRACOTTA.white());
                stairBuilder(ChiseledItems.WHITE_TERRACOTTA_BRICK_STAIRS, Ingredient.of(ChiseledItems.WHITE_TERRACOTTA_BRICKS))
                        .unlockedBy(getHasName(ChiseledItems.WHITE_TERRACOTTA_BRICK_STAIRS), has(ChiseledItems.WHITE_TERRACOTTA_BRICKS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.WHITE_TERRACOTTA_BRICK_STAIRS, Blocks.DYED_TERRACOTTA.white());
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.WHITE_TERRACOTTA_BRICK_STAIRS, ChiseledItems.WHITE_TERRACOTTA_BRICKS);
                slab(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.WHITE_TERRACOTTA_BRICK_SLAB, ChiseledItems.WHITE_TERRACOTTA_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.WHITE_TERRACOTTA_BRICK_SLAB, Blocks.DYED_TERRACOTTA.white(),2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.WHITE_TERRACOTTA_BRICK_SLAB, ChiseledItems.WHITE_TERRACOTTA_BRICKS,2);
                wall(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.WHITE_TERRACOTTA_BRICK_WALL, ChiseledItems.WHITE_TERRACOTTA_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.WHITE_TERRACOTTA_BRICK_WALL, Blocks.DYED_TERRACOTTA.white());
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.WHITE_TERRACOTTA_BRICK_WALL, ChiseledItems.WHITE_TERRACOTTA_BRICKS);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.LIGHT_GRAY_TERRACOTTA_BRICKS,4)
                        .pattern("##")
                        .pattern("##")
                        .define('#', Blocks.DYED_TERRACOTTA.lightGray())
                        .unlockedBy(getHasName(ChiseledItems.LIGHT_GRAY_TERRACOTTA_BRICKS), has(Blocks.DYED_TERRACOTTA.lightGray()))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.LIGHT_GRAY_TERRACOTTA_BRICKS, Blocks.DYED_TERRACOTTA.lightGray());
                stairBuilder(ChiseledItems.LIGHT_GRAY_TERRACOTTA_BRICK_STAIRS, Ingredient.of(ChiseledItems.LIGHT_GRAY_TERRACOTTA_BRICKS))
                        .unlockedBy(getHasName(ChiseledItems.LIGHT_GRAY_TERRACOTTA_BRICK_STAIRS), has(ChiseledItems.LIGHT_GRAY_TERRACOTTA_BRICKS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.LIGHT_GRAY_TERRACOTTA_BRICK_STAIRS, Blocks.DYED_TERRACOTTA.lightGray());
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.LIGHT_GRAY_TERRACOTTA_BRICK_STAIRS, ChiseledItems.LIGHT_GRAY_TERRACOTTA_BRICKS);
                slab(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.LIGHT_GRAY_TERRACOTTA_BRICK_SLAB, ChiseledItems.LIGHT_GRAY_TERRACOTTA_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.LIGHT_GRAY_TERRACOTTA_BRICK_SLAB, Blocks.DYED_TERRACOTTA.lightGray(),2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.LIGHT_GRAY_TERRACOTTA_BRICK_SLAB, ChiseledItems.LIGHT_GRAY_TERRACOTTA_BRICKS,2);
                wall(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.LIGHT_GRAY_TERRACOTTA_BRICK_WALL, ChiseledItems.LIGHT_GRAY_TERRACOTTA_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.LIGHT_GRAY_TERRACOTTA_BRICK_WALL, Blocks.DYED_TERRACOTTA.lightGray());
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.LIGHT_GRAY_TERRACOTTA_BRICK_WALL, ChiseledItems.LIGHT_GRAY_TERRACOTTA_BRICKS);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.GRAY_TERRACOTTA_BRICKS,4)
                        .pattern("##")
                        .pattern("##")
                        .define('#', Blocks.DYED_TERRACOTTA.gray())
                        .unlockedBy(getHasName(ChiseledItems.GRAY_TERRACOTTA_BRICKS), has(Blocks.DYED_TERRACOTTA.gray()))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.GRAY_TERRACOTTA_BRICKS, Blocks.DYED_TERRACOTTA.gray());
                stairBuilder(ChiseledItems.GRAY_TERRACOTTA_BRICK_STAIRS, Ingredient.of(ChiseledItems.GRAY_TERRACOTTA_BRICKS))
                        .unlockedBy(getHasName(ChiseledItems.GRAY_TERRACOTTA_BRICK_STAIRS), has(ChiseledItems.GRAY_TERRACOTTA_BRICKS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.GRAY_TERRACOTTA_BRICK_STAIRS, Blocks.DYED_TERRACOTTA.gray());
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.GRAY_TERRACOTTA_BRICK_STAIRS, ChiseledItems.GRAY_TERRACOTTA_BRICKS);
                slab(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.GRAY_TERRACOTTA_BRICK_SLAB, ChiseledItems.GRAY_TERRACOTTA_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.GRAY_TERRACOTTA_BRICK_SLAB, Blocks.DYED_TERRACOTTA.gray(),2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.GRAY_TERRACOTTA_BRICK_SLAB, ChiseledItems.GRAY_TERRACOTTA_BRICKS,2);
                wall(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.GRAY_TERRACOTTA_BRICK_WALL, ChiseledItems.GRAY_TERRACOTTA_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.GRAY_TERRACOTTA_BRICK_WALL, Blocks.DYED_TERRACOTTA.gray());
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.GRAY_TERRACOTTA_BRICK_WALL, ChiseledItems.GRAY_TERRACOTTA_BRICKS);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.BLACK_TERRACOTTA_BRICKS,4)
                        .pattern("##")
                        .pattern("##")
                        .define('#', Blocks.DYED_TERRACOTTA.black())
                        .unlockedBy(getHasName(ChiseledItems.BLACK_TERRACOTTA_BRICKS), has(Blocks.DYED_TERRACOTTA.black()))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.BLACK_TERRACOTTA_BRICKS, Blocks.DYED_TERRACOTTA.black());
                stairBuilder(ChiseledItems.BLACK_TERRACOTTA_BRICK_STAIRS, Ingredient.of(ChiseledItems.BLACK_TERRACOTTA_BRICKS))
                        .unlockedBy(getHasName(ChiseledItems.BLACK_TERRACOTTA_BRICK_STAIRS), has(ChiseledItems.BLACK_TERRACOTTA_BRICKS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.BLACK_TERRACOTTA_BRICK_STAIRS, Blocks.DYED_TERRACOTTA.black());
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.BLACK_TERRACOTTA_BRICK_STAIRS, ChiseledItems.BLACK_TERRACOTTA_BRICKS);
                slab(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.BLACK_TERRACOTTA_BRICK_SLAB, ChiseledItems.BLACK_TERRACOTTA_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.BLACK_TERRACOTTA_BRICK_SLAB, Blocks.DYED_TERRACOTTA.black(),2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.BLACK_TERRACOTTA_BRICK_SLAB, ChiseledItems.BLACK_TERRACOTTA_BRICKS,2);
                wall(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.BLACK_TERRACOTTA_BRICK_WALL, ChiseledItems.BLACK_TERRACOTTA_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.BLACK_TERRACOTTA_BRICK_WALL, Blocks.DYED_TERRACOTTA.black());
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.BLACK_TERRACOTTA_BRICK_WALL, ChiseledItems.BLACK_TERRACOTTA_BRICKS);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.BROWN_TERRACOTTA_BRICKS,4)
                        .pattern("##")
                        .pattern("##")
                        .define('#', Blocks.DYED_TERRACOTTA.brown())
                        .unlockedBy(getHasName(ChiseledItems.BROWN_TERRACOTTA_BRICKS), has(Blocks.DYED_TERRACOTTA.brown()))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.BROWN_TERRACOTTA_BRICKS, Blocks.DYED_TERRACOTTA.brown());
                stairBuilder(ChiseledItems.BROWN_TERRACOTTA_BRICK_STAIRS, Ingredient.of(ChiseledItems.BROWN_TERRACOTTA_BRICKS))
                        .unlockedBy(getHasName(ChiseledItems.BROWN_TERRACOTTA_BRICK_STAIRS), has(ChiseledItems.BROWN_TERRACOTTA_BRICKS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.BROWN_TERRACOTTA_BRICK_STAIRS, Blocks.DYED_TERRACOTTA.brown());
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.BROWN_TERRACOTTA_BRICK_STAIRS, ChiseledItems.BROWN_TERRACOTTA_BRICKS);
                slab(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.BROWN_TERRACOTTA_BRICK_SLAB, ChiseledItems.BROWN_TERRACOTTA_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.BROWN_TERRACOTTA_BRICK_SLAB, Blocks.DYED_TERRACOTTA.brown(),2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.BROWN_TERRACOTTA_BRICK_SLAB, ChiseledItems.BROWN_TERRACOTTA_BRICKS,2);
                wall(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.BROWN_TERRACOTTA_BRICK_WALL, ChiseledItems.BROWN_TERRACOTTA_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.BROWN_TERRACOTTA_BRICK_WALL, Blocks.DYED_TERRACOTTA.brown());
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.BROWN_TERRACOTTA_BRICK_WALL, ChiseledItems.BROWN_TERRACOTTA_BRICKS);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.RED_TERRACOTTA_BRICKS,4)
                        .pattern("##")
                        .pattern("##")
                        .define('#', Blocks.DYED_TERRACOTTA.red())
                        .unlockedBy(getHasName(ChiseledItems.RED_TERRACOTTA_BRICKS), has(Blocks.DYED_TERRACOTTA.red()))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.RED_TERRACOTTA_BRICKS, Blocks.DYED_TERRACOTTA.red());
                stairBuilder(ChiseledItems.RED_TERRACOTTA_BRICK_STAIRS, Ingredient.of(ChiseledItems.RED_TERRACOTTA_BRICKS))
                        .unlockedBy(getHasName(ChiseledItems.RED_TERRACOTTA_BRICK_STAIRS), has(ChiseledItems.RED_TERRACOTTA_BRICKS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.RED_TERRACOTTA_BRICK_STAIRS, Blocks.DYED_TERRACOTTA.red());
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.RED_TERRACOTTA_BRICK_STAIRS, ChiseledItems.RED_TERRACOTTA_BRICKS);
                slab(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.RED_TERRACOTTA_BRICK_SLAB, ChiseledItems.RED_TERRACOTTA_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.RED_TERRACOTTA_BRICK_SLAB, Blocks.DYED_TERRACOTTA.red(),2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.RED_TERRACOTTA_BRICK_SLAB, ChiseledItems.RED_TERRACOTTA_BRICKS,2);
                wall(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.RED_TERRACOTTA_BRICK_WALL, ChiseledItems.RED_TERRACOTTA_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.RED_TERRACOTTA_BRICK_WALL, Blocks.DYED_TERRACOTTA.red());
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.RED_TERRACOTTA_BRICK_WALL, ChiseledItems.RED_TERRACOTTA_BRICKS);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.ORANGE_TERRACOTTA_BRICKS,4)
                        .pattern("##")
                        .pattern("##")
                        .define('#', Blocks.DYED_TERRACOTTA.orange())
                        .unlockedBy(getHasName(ChiseledItems.ORANGE_TERRACOTTA_BRICKS), has(Blocks.DYED_TERRACOTTA.orange()))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.ORANGE_TERRACOTTA_BRICKS, Blocks.DYED_TERRACOTTA.orange());
                stairBuilder(ChiseledItems.ORANGE_TERRACOTTA_BRICK_STAIRS, Ingredient.of(ChiseledItems.ORANGE_TERRACOTTA_BRICKS))
                        .unlockedBy(getHasName(ChiseledItems.ORANGE_TERRACOTTA_BRICK_STAIRS), has(ChiseledItems.ORANGE_TERRACOTTA_BRICKS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.ORANGE_TERRACOTTA_BRICK_STAIRS, Blocks.DYED_TERRACOTTA.orange());
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.ORANGE_TERRACOTTA_BRICK_STAIRS, ChiseledItems.ORANGE_TERRACOTTA_BRICKS);
                slab(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.ORANGE_TERRACOTTA_BRICK_SLAB, ChiseledItems.ORANGE_TERRACOTTA_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.ORANGE_TERRACOTTA_BRICK_SLAB, Blocks.DYED_TERRACOTTA.orange(),2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.ORANGE_TERRACOTTA_BRICK_SLAB, ChiseledItems.ORANGE_TERRACOTTA_BRICKS,2);
                wall(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.ORANGE_TERRACOTTA_BRICK_WALL, ChiseledItems.ORANGE_TERRACOTTA_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.ORANGE_TERRACOTTA_BRICK_WALL, Blocks.DYED_TERRACOTTA.orange());
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.ORANGE_TERRACOTTA_BRICK_WALL, ChiseledItems.ORANGE_TERRACOTTA_BRICKS);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.YELLOW_TERRACOTTA_BRICKS,4)
                        .pattern("##")
                        .pattern("##")
                        .define('#', Blocks.DYED_TERRACOTTA.yellow())
                        .unlockedBy(getHasName(ChiseledItems.YELLOW_TERRACOTTA_BRICKS), has(Blocks.DYED_TERRACOTTA.yellow()))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.YELLOW_TERRACOTTA_BRICKS, Blocks.DYED_TERRACOTTA.yellow());
                stairBuilder(ChiseledItems.YELLOW_TERRACOTTA_BRICK_STAIRS, Ingredient.of(ChiseledItems.YELLOW_TERRACOTTA_BRICKS))
                        .unlockedBy(getHasName(ChiseledItems.YELLOW_TERRACOTTA_BRICK_STAIRS), has(ChiseledItems.YELLOW_TERRACOTTA_BRICKS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.YELLOW_TERRACOTTA_BRICK_STAIRS, Blocks.DYED_TERRACOTTA.yellow());
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.YELLOW_TERRACOTTA_BRICK_STAIRS, ChiseledItems.YELLOW_TERRACOTTA_BRICKS);
                slab(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.YELLOW_TERRACOTTA_BRICK_SLAB, ChiseledItems.YELLOW_TERRACOTTA_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.YELLOW_TERRACOTTA_BRICK_SLAB, Blocks.DYED_TERRACOTTA.yellow(),2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.YELLOW_TERRACOTTA_BRICK_SLAB, ChiseledItems.YELLOW_TERRACOTTA_BRICKS,2);
                wall(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.YELLOW_TERRACOTTA_BRICK_WALL, ChiseledItems.YELLOW_TERRACOTTA_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.YELLOW_TERRACOTTA_BRICK_WALL, Blocks.DYED_TERRACOTTA.yellow());
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.YELLOW_TERRACOTTA_BRICK_WALL, ChiseledItems.YELLOW_TERRACOTTA_BRICKS);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.LIME_TERRACOTTA_BRICKS,4)
                        .pattern("##")
                        .pattern("##")
                        .define('#', Blocks.DYED_TERRACOTTA.lime())
                        .unlockedBy(getHasName(ChiseledItems.LIME_TERRACOTTA_BRICKS), has(Blocks.DYED_TERRACOTTA.lime()))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.LIME_TERRACOTTA_BRICKS, Blocks.DYED_TERRACOTTA.lime());
                stairBuilder(ChiseledItems.LIME_TERRACOTTA_BRICK_STAIRS, Ingredient.of(ChiseledItems.LIME_TERRACOTTA_BRICKS))
                        .unlockedBy(getHasName(ChiseledItems.LIME_TERRACOTTA_BRICK_STAIRS), has(ChiseledItems.LIME_TERRACOTTA_BRICKS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.LIME_TERRACOTTA_BRICK_STAIRS, Blocks.DYED_TERRACOTTA.lime());
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.LIME_TERRACOTTA_BRICK_STAIRS, ChiseledItems.LIME_TERRACOTTA_BRICKS);
                slab(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.LIME_TERRACOTTA_BRICK_SLAB, ChiseledItems.LIME_TERRACOTTA_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.LIME_TERRACOTTA_BRICK_SLAB, Blocks.DYED_TERRACOTTA.lime(),2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.LIME_TERRACOTTA_BRICK_SLAB, ChiseledItems.LIME_TERRACOTTA_BRICKS,2);
                wall(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.LIME_TERRACOTTA_BRICK_WALL, ChiseledItems.LIME_TERRACOTTA_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.LIME_TERRACOTTA_BRICK_WALL, Blocks.DYED_TERRACOTTA.lime());
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.LIME_TERRACOTTA_BRICK_WALL, ChiseledItems.LIME_TERRACOTTA_BRICKS);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.GREEN_TERRACOTTA_BRICKS,4)
                        .pattern("##")
                        .pattern("##")
                        .define('#', Blocks.DYED_TERRACOTTA.green())
                        .unlockedBy(getHasName(ChiseledItems.GREEN_TERRACOTTA_BRICKS), has(Blocks.DYED_TERRACOTTA.green()))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.GREEN_TERRACOTTA_BRICKS, Blocks.DYED_TERRACOTTA.green());
                stairBuilder(ChiseledItems.GREEN_TERRACOTTA_BRICK_STAIRS, Ingredient.of(ChiseledItems.GREEN_TERRACOTTA_BRICKS))
                        .unlockedBy(getHasName(ChiseledItems.GREEN_TERRACOTTA_BRICK_STAIRS), has(ChiseledItems.GREEN_TERRACOTTA_BRICKS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.GREEN_TERRACOTTA_BRICK_STAIRS, Blocks.DYED_TERRACOTTA.green());
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.GREEN_TERRACOTTA_BRICK_STAIRS, ChiseledItems.GREEN_TERRACOTTA_BRICKS);
                slab(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.GREEN_TERRACOTTA_BRICK_SLAB, ChiseledItems.GREEN_TERRACOTTA_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.GREEN_TERRACOTTA_BRICK_SLAB, Blocks.DYED_TERRACOTTA.green(),2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.GREEN_TERRACOTTA_BRICK_SLAB, ChiseledItems.GREEN_TERRACOTTA_BRICKS,2);
                wall(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.GREEN_TERRACOTTA_BRICK_WALL, ChiseledItems.GREEN_TERRACOTTA_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.GREEN_TERRACOTTA_BRICK_WALL, Blocks.DYED_TERRACOTTA.green());
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.GREEN_TERRACOTTA_BRICK_WALL, ChiseledItems.GREEN_TERRACOTTA_BRICKS);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CYAN_TERRACOTTA_BRICKS,4)
                        .pattern("##")
                        .pattern("##")
                        .define('#', Blocks.DYED_TERRACOTTA.cyan())
                        .unlockedBy(getHasName(ChiseledItems.CYAN_TERRACOTTA_BRICKS), has(Blocks.DYED_TERRACOTTA.cyan()))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CYAN_TERRACOTTA_BRICKS, Blocks.DYED_TERRACOTTA.cyan());
                stairBuilder(ChiseledItems.CYAN_TERRACOTTA_BRICK_STAIRS, Ingredient.of(ChiseledItems.CYAN_TERRACOTTA_BRICKS))
                        .unlockedBy(getHasName(ChiseledItems.CYAN_TERRACOTTA_BRICK_STAIRS), has(ChiseledItems.CYAN_TERRACOTTA_BRICKS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CYAN_TERRACOTTA_BRICK_STAIRS, Blocks.DYED_TERRACOTTA.cyan());
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CYAN_TERRACOTTA_BRICK_STAIRS, ChiseledItems.CYAN_TERRACOTTA_BRICKS);
                slab(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CYAN_TERRACOTTA_BRICK_SLAB, ChiseledItems.CYAN_TERRACOTTA_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CYAN_TERRACOTTA_BRICK_SLAB, Blocks.DYED_TERRACOTTA.cyan(),2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CYAN_TERRACOTTA_BRICK_SLAB, ChiseledItems.CYAN_TERRACOTTA_BRICKS,2);
                wall(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CYAN_TERRACOTTA_BRICK_WALL, ChiseledItems.CYAN_TERRACOTTA_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CYAN_TERRACOTTA_BRICK_WALL, Blocks.DYED_TERRACOTTA.cyan());
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CYAN_TERRACOTTA_BRICK_WALL, ChiseledItems.CYAN_TERRACOTTA_BRICKS);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.LIGHT_BLUE_TERRACOTTA_BRICKS,4)
                        .pattern("##")
                        .pattern("##")
                        .define('#', Blocks.DYED_TERRACOTTA.lightBlue())
                        .unlockedBy(getHasName(ChiseledItems.LIGHT_BLUE_TERRACOTTA_BRICKS), has(Blocks.DYED_TERRACOTTA.lightBlue()))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.LIGHT_BLUE_TERRACOTTA_BRICKS, Blocks.DYED_TERRACOTTA.lightBlue());
                stairBuilder(ChiseledItems.LIGHT_BLUE_TERRACOTTA_BRICK_STAIRS, Ingredient.of(ChiseledItems.LIGHT_BLUE_TERRACOTTA_BRICKS))
                        .unlockedBy(getHasName(ChiseledItems.LIGHT_BLUE_TERRACOTTA_BRICK_STAIRS), has(ChiseledItems.LIGHT_BLUE_TERRACOTTA_BRICKS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.LIGHT_BLUE_TERRACOTTA_BRICK_STAIRS, Blocks.DYED_TERRACOTTA.lightBlue());
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.LIGHT_BLUE_TERRACOTTA_BRICK_STAIRS, ChiseledItems.LIGHT_BLUE_TERRACOTTA_BRICKS);
                slab(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.LIGHT_BLUE_TERRACOTTA_BRICK_SLAB, ChiseledItems.LIGHT_BLUE_TERRACOTTA_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.LIGHT_BLUE_TERRACOTTA_BRICK_SLAB, Blocks.DYED_TERRACOTTA.lightBlue(),2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.LIGHT_BLUE_TERRACOTTA_BRICK_SLAB, ChiseledItems.LIGHT_BLUE_TERRACOTTA_BRICKS,2);
                wall(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.LIGHT_BLUE_TERRACOTTA_BRICK_WALL, ChiseledItems.LIGHT_BLUE_TERRACOTTA_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.LIGHT_BLUE_TERRACOTTA_BRICK_WALL, Blocks.DYED_TERRACOTTA.lightBlue());
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.LIGHT_BLUE_TERRACOTTA_BRICK_WALL, ChiseledItems.LIGHT_BLUE_TERRACOTTA_BRICKS);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.BLUE_TERRACOTTA_BRICKS,4)
                        .pattern("##")
                        .pattern("##")
                        .define('#', Blocks.DYED_TERRACOTTA.blue())
                        .unlockedBy(getHasName(ChiseledItems.BLUE_TERRACOTTA_BRICKS), has(Blocks.DYED_TERRACOTTA.blue()))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.BLUE_TERRACOTTA_BRICKS, Blocks.DYED_TERRACOTTA.blue());
                stairBuilder(ChiseledItems.BLUE_TERRACOTTA_BRICK_STAIRS, Ingredient.of(ChiseledItems.BLUE_TERRACOTTA_BRICKS))
                        .unlockedBy(getHasName(ChiseledItems.BLUE_TERRACOTTA_BRICK_STAIRS), has(ChiseledItems.BLUE_TERRACOTTA_BRICKS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.BLUE_TERRACOTTA_BRICK_STAIRS, Blocks.DYED_TERRACOTTA.blue());
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.BLUE_TERRACOTTA_BRICK_STAIRS, ChiseledItems.BLUE_TERRACOTTA_BRICKS);
                slab(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.BLUE_TERRACOTTA_BRICK_SLAB, ChiseledItems.BLUE_TERRACOTTA_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.BLUE_TERRACOTTA_BRICK_SLAB, Blocks.DYED_TERRACOTTA.blue(),2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.BLUE_TERRACOTTA_BRICK_SLAB, ChiseledItems.BLUE_TERRACOTTA_BRICKS,2);
                wall(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.BLUE_TERRACOTTA_BRICK_WALL, ChiseledItems.BLUE_TERRACOTTA_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.BLUE_TERRACOTTA_BRICK_WALL, Blocks.DYED_TERRACOTTA.blue());
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.BLUE_TERRACOTTA_BRICK_WALL, ChiseledItems.BLUE_TERRACOTTA_BRICKS);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.PURPLE_TERRACOTTA_BRICKS,4)
                        .pattern("##")
                        .pattern("##")
                        .define('#', Blocks.DYED_TERRACOTTA.purple())
                        .unlockedBy(getHasName(ChiseledItems.PURPLE_TERRACOTTA_BRICKS), has(Blocks.DYED_TERRACOTTA.purple()))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.PURPLE_TERRACOTTA_BRICKS, Blocks.DYED_TERRACOTTA.purple());
                stairBuilder(ChiseledItems.PURPLE_TERRACOTTA_BRICK_STAIRS, Ingredient.of(ChiseledItems.PURPLE_TERRACOTTA_BRICKS))
                        .unlockedBy(getHasName(ChiseledItems.PURPLE_TERRACOTTA_BRICK_STAIRS), has(ChiseledItems.PURPLE_TERRACOTTA_BRICKS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.PURPLE_TERRACOTTA_BRICK_STAIRS, Blocks.DYED_TERRACOTTA.purple());
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.PURPLE_TERRACOTTA_BRICK_STAIRS, ChiseledItems.PURPLE_TERRACOTTA_BRICKS);
                slab(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.PURPLE_TERRACOTTA_BRICK_SLAB, ChiseledItems.PURPLE_TERRACOTTA_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.PURPLE_TERRACOTTA_BRICK_SLAB, Blocks.DYED_TERRACOTTA.purple(),2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.PURPLE_TERRACOTTA_BRICK_SLAB, ChiseledItems.PURPLE_TERRACOTTA_BRICKS,2);
                wall(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.PURPLE_TERRACOTTA_BRICK_WALL, ChiseledItems.PURPLE_TERRACOTTA_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.PURPLE_TERRACOTTA_BRICK_WALL, Blocks.DYED_TERRACOTTA.purple());
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.PURPLE_TERRACOTTA_BRICK_WALL, ChiseledItems.PURPLE_TERRACOTTA_BRICKS);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.MAGENTA_TERRACOTTA_BRICKS,4)
                        .pattern("##")
                        .pattern("##")
                        .define('#', Blocks.DYED_TERRACOTTA.magenta())
                        .unlockedBy(getHasName(ChiseledItems.MAGENTA_TERRACOTTA_BRICKS), has(Blocks.DYED_TERRACOTTA.magenta()))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.MAGENTA_TERRACOTTA_BRICKS, Blocks.DYED_TERRACOTTA.magenta());
                stairBuilder(ChiseledItems.MAGENTA_TERRACOTTA_BRICK_STAIRS, Ingredient.of(ChiseledItems.MAGENTA_TERRACOTTA_BRICKS))
                        .unlockedBy(getHasName(ChiseledItems.MAGENTA_TERRACOTTA_BRICK_STAIRS), has(ChiseledItems.MAGENTA_TERRACOTTA_BRICKS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.MAGENTA_TERRACOTTA_BRICK_STAIRS, Blocks.DYED_TERRACOTTA.magenta());
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.MAGENTA_TERRACOTTA_BRICK_STAIRS, ChiseledItems.MAGENTA_TERRACOTTA_BRICKS);
                slab(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.MAGENTA_TERRACOTTA_BRICK_SLAB, ChiseledItems.MAGENTA_TERRACOTTA_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.MAGENTA_TERRACOTTA_BRICK_SLAB, Blocks.DYED_TERRACOTTA.magenta(),2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.MAGENTA_TERRACOTTA_BRICK_SLAB, ChiseledItems.MAGENTA_TERRACOTTA_BRICKS,2);
                wall(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.MAGENTA_TERRACOTTA_BRICK_WALL, ChiseledItems.MAGENTA_TERRACOTTA_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.MAGENTA_TERRACOTTA_BRICK_WALL, Blocks.DYED_TERRACOTTA.magenta());
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.MAGENTA_TERRACOTTA_BRICK_WALL, ChiseledItems.MAGENTA_TERRACOTTA_BRICKS);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.PINK_TERRACOTTA_BRICKS,4)
                        .pattern("##")
                        .pattern("##")
                        .define('#', Blocks.DYED_TERRACOTTA.pink())
                        .unlockedBy(getHasName(ChiseledItems.PINK_TERRACOTTA_BRICKS), has(Blocks.DYED_TERRACOTTA.pink()))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.PINK_TERRACOTTA_BRICKS, Blocks.DYED_TERRACOTTA.pink());
                stairBuilder(ChiseledItems.PINK_TERRACOTTA_BRICK_STAIRS, Ingredient.of(ChiseledItems.PINK_TERRACOTTA_BRICKS))
                        .unlockedBy(getHasName(ChiseledItems.PINK_TERRACOTTA_BRICK_STAIRS), has(ChiseledItems.PINK_TERRACOTTA_BRICKS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.PINK_TERRACOTTA_BRICK_STAIRS, Blocks.DYED_TERRACOTTA.pink());
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.PINK_TERRACOTTA_BRICK_STAIRS, ChiseledItems.PINK_TERRACOTTA_BRICKS);
                slab(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.PINK_TERRACOTTA_BRICK_SLAB, ChiseledItems.PINK_TERRACOTTA_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.PINK_TERRACOTTA_BRICK_SLAB, Blocks.DYED_TERRACOTTA.pink(),2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.PINK_TERRACOTTA_BRICK_SLAB, ChiseledItems.PINK_TERRACOTTA_BRICKS,2);
                wall(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.PINK_TERRACOTTA_BRICK_WALL, ChiseledItems.PINK_TERRACOTTA_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.PINK_TERRACOTTA_BRICK_WALL, Blocks.DYED_TERRACOTTA.pink());
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.PINK_TERRACOTTA_BRICK_WALL, ChiseledItems.PINK_TERRACOTTA_BRICKS);

                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.WHITE_TERRACOTTA_BRICKS, 8)
                        .pattern("###")
                        .pattern("#0#")
                        .pattern("###")
                        .define('#', ChiseledItems.TERRACOTTA_BRICKS)
                        .define('0', Items.DYE.white())
                        .unlockedBy(getHasName(ChiseledItems.WHITE_TERRACOTTA_BRICKS), has(ChiseledItems.TERRACOTTA_BRICKS))
                        .save(output, "white_terracotta_bricks_from_terracotta_bricks");
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.LIGHT_GRAY_TERRACOTTA_BRICKS, 8)
                        .pattern("###")
                        .pattern("#0#")
                        .pattern("###")
                        .define('#', ChiseledItems.TERRACOTTA_BRICKS)
                        .define('0', Items.DYE.lightGray())
                        .unlockedBy(getHasName(ChiseledItems.LIGHT_GRAY_TERRACOTTA_BRICKS), has(ChiseledItems.TERRACOTTA_BRICKS))
                        .save(output, "light_gray_terracotta_bricks_from_terracotta_bricks");
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.GRAY_TERRACOTTA_BRICKS, 8)
                        .pattern("###")
                        .pattern("#0#")
                        .pattern("###")
                        .define('#', ChiseledItems.TERRACOTTA_BRICKS)
                        .define('0', Items.DYE.gray())
                        .unlockedBy(getHasName(ChiseledItems.GRAY_TERRACOTTA_BRICKS), has(ChiseledItems.TERRACOTTA_BRICKS))
                        .save(output, "gray_terracotta_bricks_from_terracotta_bricks");
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.BLACK_TERRACOTTA_BRICKS, 8)
                        .pattern("###")
                        .pattern("#0#")
                        .pattern("###")
                        .define('#', ChiseledItems.TERRACOTTA_BRICKS)
                        .define('0', Items.DYE.black())
                        .unlockedBy(getHasName(ChiseledItems.BLACK_TERRACOTTA_BRICKS), has(ChiseledItems.TERRACOTTA_BRICKS))
                        .save(output, "black_terracotta_bricks_from_terracotta_bricks");
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.BROWN_TERRACOTTA_BRICKS, 8)
                        .pattern("###")
                        .pattern("#0#")
                        .pattern("###")
                        .define('#', ChiseledItems.TERRACOTTA_BRICKS)
                        .define('0', Items.DYE.brown())
                        .unlockedBy(getHasName(ChiseledItems.BROWN_TERRACOTTA_BRICKS), has(ChiseledItems.TERRACOTTA_BRICKS))
                        .save(output, "brown_terracotta_bricks_from_terracotta_bricks");
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.RED_TERRACOTTA_BRICKS, 8)
                        .pattern("###")
                        .pattern("#0#")
                        .pattern("###")
                        .define('#', ChiseledItems.TERRACOTTA_BRICKS)
                        .define('0', Items.DYE.red())
                        .unlockedBy(getHasName(ChiseledItems.RED_TERRACOTTA_BRICKS), has(ChiseledItems.TERRACOTTA_BRICKS))
                        .save(output, "red_terracotta_bricks_from_terracotta_bricks");
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.ORANGE_TERRACOTTA_BRICKS, 8)
                        .pattern("###")
                        .pattern("#0#")
                        .pattern("###")
                        .define('#', ChiseledItems.TERRACOTTA_BRICKS)
                        .define('0', Items.DYE.orange())
                        .unlockedBy(getHasName(ChiseledItems.ORANGE_TERRACOTTA_BRICKS), has(ChiseledItems.TERRACOTTA_BRICKS))
                        .save(output, "orange_terracotta_bricks_from_terracotta_bricks");
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.YELLOW_TERRACOTTA_BRICKS, 8)
                        .pattern("###")
                        .pattern("#0#")
                        .pattern("###")
                        .define('#', ChiseledItems.TERRACOTTA_BRICKS)
                        .define('0', Items.DYE.yellow())
                        .unlockedBy(getHasName(ChiseledItems.YELLOW_TERRACOTTA_BRICKS), has(ChiseledItems.TERRACOTTA_BRICKS))
                        .save(output, "yellow_terracotta_bricks_from_terracotta_bricks");
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.LIME_TERRACOTTA_BRICKS, 8)
                        .pattern("###")
                        .pattern("#0#")
                        .pattern("###")
                        .define('#', ChiseledItems.TERRACOTTA_BRICKS)
                        .define('0', Items.DYE.lime())
                        .unlockedBy(getHasName(ChiseledItems.LIME_TERRACOTTA_BRICKS), has(ChiseledItems.TERRACOTTA_BRICKS))
                        .save(output, "lime_terracotta_bricks_from_terracotta_bricks");
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.GREEN_TERRACOTTA_BRICKS, 8)
                        .pattern("###")
                        .pattern("#0#")
                        .pattern("###")
                        .define('#', ChiseledItems.TERRACOTTA_BRICKS)
                        .define('0', Items.DYE.green())
                        .unlockedBy(getHasName(ChiseledItems.GREEN_TERRACOTTA_BRICKS), has(ChiseledItems.TERRACOTTA_BRICKS))
                        .save(output, "green_terracotta_bricks_from_terracotta_bricks");
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CYAN_TERRACOTTA_BRICKS, 8)
                        .pattern("###")
                        .pattern("#0#")
                        .pattern("###")
                        .define('#', ChiseledItems.TERRACOTTA_BRICKS)
                        .define('0', Items.DYE.cyan())
                        .unlockedBy(getHasName(ChiseledItems.CYAN_TERRACOTTA_BRICKS), has(ChiseledItems.TERRACOTTA_BRICKS))
                        .save(output, "cyan_terracotta_bricks_from_terracotta_bricks");
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.LIGHT_BLUE_TERRACOTTA_BRICKS, 8)
                        .pattern("###")
                        .pattern("#0#")
                        .pattern("###")
                        .define('#', ChiseledItems.TERRACOTTA_BRICKS)
                        .define('0', Items.DYE.lightBlue())
                        .unlockedBy(getHasName(ChiseledItems.LIGHT_BLUE_TERRACOTTA_BRICKS), has(ChiseledItems.TERRACOTTA_BRICKS))
                        .save(output, "light_blue_terracotta_bricks_from_terracotta_bricks");
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.BLUE_TERRACOTTA_BRICKS, 8)
                        .pattern("###")
                        .pattern("#0#")
                        .pattern("###")
                        .define('#', ChiseledItems.TERRACOTTA_BRICKS)
                        .define('0', Items.DYE.blue())
                        .unlockedBy(getHasName(ChiseledItems.BLUE_TERRACOTTA_BRICKS), has(ChiseledItems.TERRACOTTA_BRICKS))
                        .save(output, "blue_terracotta_bricks_from_terracotta_bricks");
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.PURPLE_TERRACOTTA_BRICKS, 8)
                        .pattern("###")
                        .pattern("#0#")
                        .pattern("###")
                        .define('#', ChiseledItems.TERRACOTTA_BRICKS)
                        .define('0', Items.DYE.purple())
                        .unlockedBy(getHasName(ChiseledItems.PURPLE_TERRACOTTA_BRICKS), has(ChiseledItems.TERRACOTTA_BRICKS))
                        .save(output, "purple_terracotta_bricks_from_terracotta_bricks");
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.MAGENTA_TERRACOTTA_BRICKS, 8)
                        .pattern("###")
                        .pattern("#0#")
                        .pattern("###")
                        .define('#', ChiseledItems.TERRACOTTA_BRICKS)
                        .define('0', Items.DYE.magenta())
                        .unlockedBy(getHasName(ChiseledItems.MAGENTA_TERRACOTTA_BRICKS), has(ChiseledItems.TERRACOTTA_BRICKS))
                        .save(output, "magenta_terracotta_bricks_from_terracotta_bricks");
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.PINK_TERRACOTTA_BRICKS, 8)
                        .pattern("###")
                        .pattern("#0#")
                        .pattern("###")
                        .define('#', ChiseledItems.TERRACOTTA_BRICKS)
                        .define('0', Items.DYE.pink())
                        .unlockedBy(getHasName(ChiseledItems.PINK_TERRACOTTA_BRICKS), has(ChiseledItems.TERRACOTTA_BRICKS))
                        .save(output, "pink_terracotta_bricks_from_terracotta_bricks");

                smeltingResultFromBase(ChiseledItems.CRACKED_RED_NETHER_BRICKS, Blocks.RED_NETHER_BRICKS);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.RED_NETHER_BRICK_FENCE, 6)
                        .pattern("#0#")
                        .pattern("#0#")
                        .define('#', Blocks.RED_NETHER_BRICKS)
                        .define('0', Items.NETHER_BRICK)
                        .unlockedBy(getHasName(ChiseledItems.RED_NETHER_BRICK_FENCE), has(Blocks.RED_NETHER_BRICKS))
                        .save(output);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CHISELED_RED_NETHER_BRICKS)
                        .pattern("#")
                        .pattern("#")
                        .define('#', Blocks.RED_NETHER_BRICK_SLAB)
                        .unlockedBy(getHasName(ChiseledItems.CHISELED_RED_NETHER_BRICKS), has(Blocks.RED_NETHER_BRICK_SLAB))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CHISELED_RED_NETHER_BRICKS, Blocks.RED_NETHER_BRICKS);

                stairBuilder(ChiseledItems.SMOOTH_BASALT_STAIRS, Ingredient.of(Blocks.SMOOTH_BASALT))
                        .unlockedBy(getHasName(ChiseledItems.SMOOTH_BASALT_STAIRS), has(Blocks.SMOOTH_BASALT))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.SMOOTH_BASALT_STAIRS, Blocks.SMOOTH_BASALT);
                slab(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.SMOOTH_BASALT_SLAB, Blocks.SMOOTH_BASALT);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.SMOOTH_BASALT_SLAB, Blocks.SMOOTH_BASALT,2);
                wall(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.SMOOTH_BASALT_WALL, Blocks.SMOOTH_BASALT);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.SMOOTH_BASALT_WALL, Blocks.SMOOTH_BASALT);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.BASALT_BRICKS,4)
                        .pattern("##")
                        .pattern("##")
                        .define('#', Blocks.POLISHED_BASALT)
                        .unlockedBy(getHasName(ChiseledItems.BASALT_BRICKS), has(Blocks.POLISHED_BASALT))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.BASALT_BRICKS, Blocks.BASALT);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.BASALT_BRICKS, Blocks.POLISHED_BASALT);
                stairBuilder(ChiseledItems.BASALT_BRICK_STAIRS, Ingredient.of(ChiseledItems.BASALT_BRICKS))
                        .unlockedBy(getHasName(ChiseledItems.BASALT_BRICK_STAIRS), has(ChiseledItems.BASALT_BRICKS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.BASALT_BRICK_STAIRS, Blocks.BASALT);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.BASALT_BRICK_STAIRS, Blocks.POLISHED_BASALT);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.BASALT_BRICK_STAIRS, ChiseledItems.BASALT_BRICKS);
                slab(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.BASALT_BRICK_SLAB, ChiseledItems.BASALT_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.BASALT_BRICK_SLAB, Blocks.BASALT,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.BASALT_BRICK_SLAB, Blocks.POLISHED_BASALT,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.BASALT_BRICK_SLAB, ChiseledItems.BASALT_BRICKS,2);
                wall(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.BASALT_BRICK_WALL, ChiseledItems.BASALT_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.BASALT_BRICK_WALL, Blocks.BASALT);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.BASALT_BRICK_WALL, Blocks.POLISHED_BASALT);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.BASALT_BRICK_WALL, ChiseledItems.BASALT_BRICKS);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CUT_BASALT_BRICKS)
                        .pattern("#")
                        .pattern("#")
                        .define('#', ChiseledItems.SMOOTH_BASALT_SLAB)
                        .unlockedBy(getHasName(ChiseledItems.CUT_BASALT_BRICKS), has(Blocks.SMOOTH_BASALT))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CUT_BASALT_BRICKS, Blocks.SMOOTH_BASALT);
                stairBuilder(ChiseledItems.CUT_BASALT_BRICK_STAIRS, Ingredient.of(ChiseledItems.CUT_BASALT_BRICKS))
                        .unlockedBy(getHasName(ChiseledItems.CUT_BASALT_BRICK_STAIRS), has(ChiseledItems.CUT_BASALT_BRICKS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CUT_BASALT_BRICK_STAIRS, Blocks.SMOOTH_BASALT);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CUT_BASALT_BRICK_STAIRS, ChiseledItems.CUT_BASALT_BRICKS);
                slab(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CUT_BASALT_BRICK_SLAB, ChiseledItems.CUT_BASALT_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CUT_BASALT_BRICK_SLAB, Blocks.SMOOTH_BASALT,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CUT_BASALT_BRICK_SLAB, ChiseledItems.CUT_BASALT_BRICKS,2);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.BASALT_TILES,4)
                        .pattern("##")
                        .pattern("##")
                        .define('#', ChiseledItems.BASALT_BRICKS)
                        .unlockedBy(getHasName(ChiseledItems.BASALT_TILES), has(ChiseledItems.BASALT_BRICKS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.BASALT_TILES, Blocks.BASALT);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.BASALT_TILES, Blocks.POLISHED_BASALT);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.BASALT_TILES, ChiseledItems.BASALT_BRICKS);
                stairBuilder(ChiseledItems.BASALT_TILE_STAIRS, Ingredient.of(ChiseledItems.BASALT_TILES))
                        .unlockedBy(getHasName(ChiseledItems.BASALT_TILE_STAIRS), has(ChiseledItems.BASALT_TILES))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.BASALT_TILE_STAIRS, Blocks.BASALT);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.BASALT_TILE_STAIRS, Blocks.POLISHED_BASALT);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.BASALT_TILE_STAIRS, ChiseledItems.BASALT_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.BASALT_TILE_STAIRS, ChiseledItems.BASALT_TILES);
                slab(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.BASALT_TILE_SLAB, ChiseledItems.BASALT_TILES);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.BASALT_TILE_SLAB, Blocks.BASALT,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.BASALT_TILE_SLAB, Blocks.POLISHED_BASALT,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.BASALT_TILE_SLAB, ChiseledItems.BASALT_BRICKS,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.BASALT_TILE_SLAB, ChiseledItems.BASALT_TILES,2);
                wall(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.BASALT_TILE_WALL, ChiseledItems.BASALT_TILES);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.BASALT_TILE_WALL, Blocks.BASALT);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.BASALT_TILE_WALL, Blocks.POLISHED_BASALT);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.BASALT_TILE_WALL, ChiseledItems.BASALT_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.BASALT_TILE_WALL, ChiseledItems.BASALT_TILES);

                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CUT_POLISHED_BLACKSTONE_BRICKS)
                        .pattern("#")
                        .pattern("#")
                        .define('#', Blocks.POLISHED_BLACKSTONE_SLAB)
                        .unlockedBy(getHasName(ChiseledItems.CUT_POLISHED_BLACKSTONE_BRICKS), has(Blocks.POLISHED_BLACKSTONE))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CUT_POLISHED_BLACKSTONE_BRICKS, Blocks.BLACKSTONE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CUT_POLISHED_BLACKSTONE_BRICKS, Blocks.POLISHED_BLACKSTONE);
                smeltingResultFromBase(ChiseledItems.CRACKED_CUT_POLISHED_BLACKSTONE_BRICKS, ChiseledItems.CUT_POLISHED_BLACKSTONE_BRICKS);
                stairBuilder(ChiseledItems.CUT_POLISHED_BLACKSTONE_BRICK_STAIRS, Ingredient.of(ChiseledItems.CUT_POLISHED_BLACKSTONE_BRICKS))
                        .unlockedBy(getHasName(ChiseledItems.CUT_POLISHED_BLACKSTONE_BRICK_STAIRS), has(ChiseledItems.CUT_POLISHED_BLACKSTONE_BRICKS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CUT_POLISHED_BLACKSTONE_BRICK_STAIRS, Blocks.BLACKSTONE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CUT_POLISHED_BLACKSTONE_BRICK_STAIRS, Blocks.POLISHED_BLACKSTONE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CUT_POLISHED_BLACKSTONE_BRICK_STAIRS, ChiseledItems.CUT_POLISHED_BLACKSTONE_BRICKS);
                slab(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CUT_POLISHED_BLACKSTONE_BRICK_SLAB, ChiseledItems.CUT_POLISHED_BLACKSTONE_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CUT_POLISHED_BLACKSTONE_BRICK_SLAB, Blocks.BLACKSTONE,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CUT_POLISHED_BLACKSTONE_BRICK_SLAB, Blocks.POLISHED_BLACKSTONE,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CUT_POLISHED_BLACKSTONE_BRICK_SLAB, ChiseledItems.CUT_POLISHED_BLACKSTONE_BRICKS,2);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.POLISHED_BLACKSTONE_TILES,4)
                        .pattern("##")
                        .pattern("##")
                        .define('#', Blocks.POLISHED_BLACKSTONE_BRICKS)
                        .unlockedBy(getHasName(ChiseledItems.POLISHED_BLACKSTONE_TILES), has(Blocks.POLISHED_BLACKSTONE_BRICKS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.POLISHED_BLACKSTONE_TILES, Blocks.BLACKSTONE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.POLISHED_BLACKSTONE_TILES, Blocks.POLISHED_BLACKSTONE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.POLISHED_BLACKSTONE_TILES, Blocks.POLISHED_BLACKSTONE_BRICKS);
                smeltingResultFromBase(ChiseledItems.CRACKED_POLISHED_BLACKSTONE_TILES, ChiseledItems.POLISHED_BLACKSTONE_TILES);
                stairBuilder(ChiseledItems.POLISHED_BLACKSTONE_TILE_STAIRS, Ingredient.of(ChiseledItems.POLISHED_BLACKSTONE_TILES))
                        .unlockedBy(getHasName(ChiseledItems.POLISHED_BLACKSTONE_TILE_STAIRS), has(ChiseledItems.POLISHED_BLACKSTONE_TILES))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.POLISHED_BLACKSTONE_TILE_STAIRS, Blocks.BLACKSTONE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.POLISHED_BLACKSTONE_TILE_STAIRS, Blocks.POLISHED_BLACKSTONE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.POLISHED_BLACKSTONE_TILE_STAIRS, Blocks.POLISHED_BLACKSTONE_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.POLISHED_BLACKSTONE_TILE_STAIRS, ChiseledItems.POLISHED_BLACKSTONE_TILES);
                slab(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.POLISHED_BLACKSTONE_TILE_SLAB, ChiseledItems.POLISHED_BLACKSTONE_TILES);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.POLISHED_BLACKSTONE_TILE_SLAB, Blocks.BLACKSTONE,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.POLISHED_BLACKSTONE_TILE_SLAB, Blocks.POLISHED_BLACKSTONE,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.POLISHED_BLACKSTONE_TILE_SLAB, Blocks.POLISHED_BLACKSTONE_BRICKS, 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.POLISHED_BLACKSTONE_TILE_SLAB, ChiseledItems.POLISHED_BLACKSTONE_TILES,2);
                wall(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.POLISHED_BLACKSTONE_TILE_WALL, ChiseledItems.POLISHED_BLACKSTONE_TILES);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.POLISHED_BLACKSTONE_TILE_WALL, Blocks.BLACKSTONE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.POLISHED_BLACKSTONE_TILE_WALL, Blocks.POLISHED_BLACKSTONE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.POLISHED_BLACKSTONE_TILE_WALL, Blocks.POLISHED_BLACKSTONE_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.POLISHED_BLACKSTONE_TILE_WALL, ChiseledItems.POLISHED_BLACKSTONE_TILES);
                shaped(RecipeCategory.BUILDING_BLOCKS, Blocks.CHISELED_POLISHED_BLACKSTONE)
                        .pattern("#")
                        .pattern("#")
                        .define('#', Blocks.POLISHED_BLACKSTONE_BRICK_SLAB)
                        .unlockedBy(getHasName(Blocks.CHISELED_POLISHED_BLACKSTONE), has(Blocks.POLISHED_BLACKSTONE_BRICK_SLAB))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, Blocks.CHISELED_POLISHED_BLACKSTONE, Blocks.POLISHED_BLACKSTONE_BRICKS);
                
                stairBuilder(ChiseledItems.END_STONE_STAIRS, Ingredient.of(Blocks.END_STONE))
                        .unlockedBy(getHasName(ChiseledItems.END_STONE_STAIRS), has(Blocks.END_STONE))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.END_STONE_STAIRS, Blocks.END_STONE);
                slab(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.END_STONE_SLAB, Blocks.END_STONE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.END_STONE_SLAB, Blocks.END_STONE,2);
                wall(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.END_STONE_WALL, Blocks.END_STONE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.END_STONE_WALL, Blocks.END_STONE);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.POLISHED_END_STONE,4)
                        .pattern("##")
                        .pattern("##")
                        .define('#', Blocks.END_STONE)
                        .unlockedBy(getHasName(ChiseledItems.POLISHED_END_STONE), has(Blocks.END_STONE))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.POLISHED_END_STONE, Blocks.END_STONE);
                stairBuilder(ChiseledItems.POLISHED_END_STONE_STAIRS, Ingredient.of(ChiseledItems.POLISHED_END_STONE))
                        .unlockedBy(getHasName(ChiseledItems.POLISHED_END_STONE_STAIRS), has(ChiseledItems.POLISHED_END_STONE))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.POLISHED_END_STONE_STAIRS, Blocks.END_STONE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.POLISHED_END_STONE_STAIRS, ChiseledItems.POLISHED_END_STONE);
                slab(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.POLISHED_END_STONE_SLAB, ChiseledItems.POLISHED_END_STONE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.POLISHED_END_STONE_SLAB, Blocks.END_STONE,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.POLISHED_END_STONE_SLAB, ChiseledItems.POLISHED_END_STONE,2);
                wall(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.POLISHED_END_STONE_WALL, ChiseledItems.POLISHED_END_STONE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.POLISHED_END_STONE_WALL, Blocks.END_STONE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.POLISHED_END_STONE_WALL, ChiseledItems.POLISHED_END_STONE);
                smeltingResultFromBase(ChiseledItems.CRACKED_END_STONE_BRICKS, Blocks.END_STONE_BRICKS);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CUT_END_STONE_BRICKS)
                        .pattern("#")
                        .pattern("#")
                        .define('#', ChiseledItems.POLISHED_END_STONE_SLAB)
                        .unlockedBy(getHasName(ChiseledItems.CUT_END_STONE_BRICKS), has(ChiseledItems.POLISHED_END_STONE))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CUT_END_STONE_BRICKS, Blocks.END_STONE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CUT_END_STONE_BRICKS, ChiseledItems.POLISHED_END_STONE);
                smeltingResultFromBase(ChiseledItems.CRACKED_CUT_END_STONE_BRICKS, ChiseledItems.CUT_END_STONE_BRICKS);
                stairBuilder(ChiseledItems.CUT_END_STONE_BRICK_STAIRS, Ingredient.of(ChiseledItems.CUT_END_STONE_BRICKS))
                        .unlockedBy(getHasName(ChiseledItems.CUT_END_STONE_BRICK_STAIRS), has(ChiseledItems.CUT_END_STONE_BRICKS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CUT_END_STONE_BRICK_STAIRS, Blocks.END_STONE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CUT_END_STONE_BRICK_STAIRS, ChiseledItems.POLISHED_END_STONE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CUT_END_STONE_BRICK_STAIRS, ChiseledItems.CUT_END_STONE_BRICKS);
                slab(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CUT_END_STONE_BRICK_SLAB, ChiseledItems.CUT_END_STONE_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CUT_END_STONE_BRICK_SLAB, Blocks.END_STONE,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CUT_END_STONE_BRICK_SLAB, ChiseledItems.POLISHED_END_STONE,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CUT_END_STONE_BRICK_SLAB, ChiseledItems.CUT_END_STONE_BRICKS,2);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.END_STONE_TILES,4)
                        .pattern("##")
                        .pattern("##")
                        .define('#', Blocks.END_STONE_BRICKS)
                        .unlockedBy(getHasName(ChiseledItems.END_STONE_TILES), has(Blocks.END_STONE_BRICKS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.END_STONE_TILES, Blocks.END_STONE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.END_STONE_TILES, ChiseledItems.POLISHED_END_STONE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.END_STONE_TILES, Blocks.END_STONE_BRICKS);
                smeltingResultFromBase(ChiseledItems.CRACKED_END_STONE_TILES, ChiseledItems.END_STONE_TILES);
                stairBuilder(ChiseledItems.END_STONE_TILE_STAIRS, Ingredient.of(ChiseledItems.END_STONE_TILES))
                        .unlockedBy(getHasName(ChiseledItems.END_STONE_TILE_STAIRS), has(ChiseledItems.END_STONE_TILES))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.END_STONE_TILE_STAIRS, Blocks.END_STONE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.END_STONE_TILE_STAIRS, ChiseledItems.POLISHED_END_STONE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.END_STONE_TILE_STAIRS, Blocks.END_STONE_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.END_STONE_TILE_STAIRS, ChiseledItems.END_STONE_TILES);
                slab(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.END_STONE_TILE_SLAB, ChiseledItems.END_STONE_TILES);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.END_STONE_TILE_SLAB, Blocks.END_STONE,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.END_STONE_TILE_SLAB, ChiseledItems.POLISHED_END_STONE,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.END_STONE_TILE_SLAB, Blocks.END_STONE_BRICKS,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.END_STONE_TILE_SLAB, ChiseledItems.END_STONE_TILES,2);
                wall(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.END_STONE_TILE_WALL, ChiseledItems.END_STONE_TILES);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.END_STONE_TILE_WALL, Blocks.END_STONE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.END_STONE_TILE_WALL, ChiseledItems.POLISHED_END_STONE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.END_STONE_TILE_WALL, Blocks.END_STONE_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.END_STONE_TILE_WALL, ChiseledItems.END_STONE_TILES);

                wall(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.QUARTZ_WALL, Blocks.QUARTZ_BLOCK);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.QUARTZ_WALL, Blocks.QUARTZ_BLOCK);
                wall(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.SMOOTH_QUARTZ_WALL, Blocks.SMOOTH_QUARTZ);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.SMOOTH_QUARTZ_WALL, Blocks.SMOOTH_QUARTZ);
                stairBuilder(ChiseledItems.QUARTZ_BRICK_STAIRS, Ingredient.of(Blocks.QUARTZ_BRICKS))
                        .unlockedBy(getHasName(ChiseledItems.QUARTZ_BRICK_STAIRS), has((Blocks.QUARTZ_BRICKS)))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.QUARTZ_BRICK_STAIRS, Blocks.QUARTZ_BLOCK);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.QUARTZ_BRICK_STAIRS, Blocks.QUARTZ_BRICKS);
                slab(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.QUARTZ_BRICK_SLAB, (Blocks.QUARTZ_BRICKS));
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.QUARTZ_BRICK_SLAB, Blocks.QUARTZ_BLOCK,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.QUARTZ_BRICK_SLAB, Blocks.QUARTZ_BRICKS,2);
                wall(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.QUARTZ_BRICK_WALL, (Blocks.QUARTZ_BRICKS));
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.QUARTZ_BRICK_WALL, Blocks.QUARTZ_BLOCK);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.QUARTZ_BRICK_WALL, Blocks.QUARTZ_BRICKS);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CUT_QUARTZ_BRICKS)
                        .pattern("#")
                        .pattern("#")
                        .define('#', Blocks.SMOOTH_QUARTZ_SLAB)
                        .unlockedBy(getHasName(ChiseledItems.CUT_QUARTZ_BRICKS), has(Blocks.SMOOTH_QUARTZ))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CUT_QUARTZ_BRICKS, Blocks.SMOOTH_QUARTZ);
                stairBuilder(ChiseledItems.CUT_QUARTZ_BRICK_STAIRS, Ingredient.of((ChiseledItems.CUT_QUARTZ_BRICKS)))
                        .unlockedBy(getHasName(ChiseledItems.CUT_QUARTZ_BRICK_STAIRS), has(ChiseledItems.CUT_QUARTZ_BRICKS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CUT_QUARTZ_BRICK_STAIRS, Blocks.SMOOTH_QUARTZ);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CUT_QUARTZ_BRICK_STAIRS, ChiseledItems.CUT_QUARTZ_BRICKS);
                slab(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CUT_QUARTZ_BRICK_SLAB, ChiseledItems.CUT_QUARTZ_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CUT_QUARTZ_BRICK_SLAB, Blocks.SMOOTH_QUARTZ,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CUT_QUARTZ_BRICK_SLAB, ChiseledItems.CUT_QUARTZ_BRICKS,2);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.QUARTZ_TILES,4)
                        .pattern("##")
                        .pattern("##")
                        .define('#', Blocks.QUARTZ_BRICKS)
                        .unlockedBy(getHasName(ChiseledItems.QUARTZ_TILES), has(Blocks.QUARTZ_BRICKS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.QUARTZ_TILES, Blocks.QUARTZ_BLOCK);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.QUARTZ_TILES, Blocks.QUARTZ_BRICKS);
                stairBuilder(ChiseledItems.QUARTZ_TILE_STAIRS, Ingredient.of(ChiseledItems.QUARTZ_TILES))
                        .unlockedBy(getHasName(ChiseledItems.QUARTZ_TILE_STAIRS), has(ChiseledItems.QUARTZ_TILES))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.QUARTZ_TILE_STAIRS, Blocks.QUARTZ_BLOCK);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.QUARTZ_TILE_STAIRS, Blocks.QUARTZ_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.QUARTZ_TILE_STAIRS, ChiseledItems.QUARTZ_TILES);
                slab(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.QUARTZ_TILE_SLAB, ChiseledItems.QUARTZ_TILES);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.QUARTZ_TILE_SLAB, Blocks.QUARTZ_BLOCK,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.QUARTZ_TILE_SLAB, Blocks.QUARTZ_BRICKS,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.QUARTZ_TILE_SLAB, ChiseledItems.QUARTZ_TILES,2);
                wall(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.QUARTZ_TILE_WALL, ChiseledItems.QUARTZ_TILES);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.QUARTZ_TILE_WALL, Blocks.QUARTZ_BLOCK);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.QUARTZ_TILE_WALL, Blocks.QUARTZ_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.QUARTZ_TILE_WALL, ChiseledItems.QUARTZ_TILES);

                stairBuilder(ChiseledItems.AMETHYST_STAIRS, Ingredient.of(Blocks.AMETHYST_BLOCK))
                        .unlockedBy(getHasName(ChiseledItems.AMETHYST_STAIRS), has(Blocks.AMETHYST_BLOCK))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.AMETHYST_STAIRS, Blocks.AMETHYST_BLOCK);
                slab(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.AMETHYST_SLAB, Blocks.AMETHYST_BLOCK);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.AMETHYST_SLAB, Blocks.AMETHYST_BLOCK,2);
                wall(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.AMETHYST_WALL, Blocks.AMETHYST_BLOCK);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.AMETHYST_WALL, Blocks.AMETHYST_BLOCK);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.AMETHYST_BRICKS,4)
                        .pattern("##")
                        .pattern("##")
                        .define('#', Blocks.AMETHYST_BLOCK)
                        .unlockedBy(getHasName(ChiseledItems.AMETHYST_BRICKS), has(Blocks.AMETHYST_BLOCK))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.AMETHYST_BRICKS, Blocks.AMETHYST_BLOCK);
                stairBuilder(ChiseledItems.AMETHYST_BRICK_STAIRS, Ingredient.of(ChiseledItems.AMETHYST_BRICKS))
                        .unlockedBy(getHasName(ChiseledItems.AMETHYST_BRICK_STAIRS), has(ChiseledItems.AMETHYST_BRICKS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.AMETHYST_BRICK_STAIRS, Blocks.AMETHYST_BLOCK);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.AMETHYST_BRICK_STAIRS, ChiseledItems.AMETHYST_BRICKS);
                slab(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.AMETHYST_BRICK_SLAB, ChiseledItems.AMETHYST_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.AMETHYST_BRICK_SLAB, Blocks.AMETHYST_BLOCK,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.AMETHYST_BRICK_SLAB, ChiseledItems.AMETHYST_BRICKS,2);
                wall(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.AMETHYST_BRICK_WALL, ChiseledItems.AMETHYST_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.AMETHYST_BRICK_WALL, Blocks.AMETHYST_BLOCK);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.AMETHYST_BRICK_WALL, ChiseledItems.AMETHYST_BRICKS);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CUT_AMETHYST_BRICKS)
                        .pattern("#")
                        .pattern("#")
                        .define('#', ChiseledItems.AMETHYST_SLAB)
                        .unlockedBy(getHasName(ChiseledItems.CUT_AMETHYST_BRICKS), has(Blocks.AMETHYST_BLOCK))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CUT_AMETHYST_BRICKS, Blocks.AMETHYST_BLOCK);
                stairBuilder(ChiseledItems.CUT_AMETHYST_BRICK_STAIRS, Ingredient.of(ChiseledItems.CUT_AMETHYST_BRICKS))
                        .unlockedBy(getHasName(ChiseledItems.CUT_AMETHYST_BRICK_STAIRS), has(ChiseledItems.CUT_AMETHYST_BRICKS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CUT_AMETHYST_BRICK_STAIRS, Blocks.AMETHYST_BLOCK);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CUT_AMETHYST_BRICK_STAIRS, ChiseledItems.CUT_AMETHYST_BRICKS);
                slab(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CUT_AMETHYST_BRICK_SLAB, ChiseledItems.CUT_AMETHYST_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CUT_AMETHYST_BRICK_SLAB, Blocks.AMETHYST_BLOCK,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.CUT_AMETHYST_BRICK_SLAB, ChiseledItems.CUT_AMETHYST_BRICKS,2);
                
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.NETHERITE_STAIRS)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .define('#', Blocks.NETHERITE_BLOCK)
                        .unlockedBy(getHasName(ChiseledItems.NETHERITE_STAIRS), has(Blocks.NETHERITE_BLOCK))
                        .save(output);
                stonecuttingRecipes(ChiseledItems.CHISELED_LAPIS, Items.LAPIS_BLOCK);
            }
        };
    }
    @Override
    public String getName() {
        return "RecipeGen";
    }
}