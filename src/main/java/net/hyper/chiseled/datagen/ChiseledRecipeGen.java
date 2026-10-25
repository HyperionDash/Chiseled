package net.hyper.chiseled.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.hyper.chiseled.registry.ChiseledItems;
import net.minecraft.advancements.Advancement;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.Recipe;
import org.jspecify.annotations.NonNull;

import java.util.concurrent.CompletableFuture;

//return of the evil code

@SuppressWarnings("SameParameterValue")
public class ChiseledRecipeGen extends FabricRecipeProvider {
    public ChiseledRecipeGen(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected @NonNull RecipeProvider createRecipeProvider(HolderLookup.@NonNull Provider registries, @NonNull BootstrapContext<Recipe<?>> recipes, @NonNull BootstrapContext<Advancement> advancements) {
        return new RecipeProvider(recipes, advancements) {

            //this part defines recipes by block type


            //recipes for bricks, polished block and tiles.

            void brickRecipes(Item craftingOutput, Item craftingInput, Item... stonecutterInputs) {
                shaped(RecipeCategory.BUILDING_BLOCKS, craftingOutput,4).pattern("##").pattern("##").define('#', craftingInput).unlockedBy(getHasName(craftingInput), has(craftingInput)).save(output);
                stonecuttingRecipes(craftingOutput, stonecutterInputs);
            }

            //cut bricks recipes

            void cutBrickRecipes(Item craftingOutput, Item craftingInput, Item... stonecutterInputs) {
                shaped(RecipeCategory.BUILDING_BLOCKS, craftingOutput).pattern("#").pattern("#").define('#', craftingInput).unlockedBy(getHasName(craftingInput), has(craftingInput)).save(output);
                stonecuttingRecipes(craftingOutput, stonecutterInputs);
            }

            //stair recipes

            void stairRecipes(Item craftingOutput, Item craftingInput, Item... stonecutterInputs) {
                stairBuilder(craftingOutput, Ingredient.of(craftingInput)).unlockedBy(getHasName(craftingInput), has(craftingInput)).save(output);
                stonecuttingRecipes(craftingOutput, stonecutterInputs);
            }

            //slab recipes

            void slabRecipes(Item craftingOutput, Item craftingInput, Item... stonecutterInputs) {
                slab(RecipeCategory.BUILDING_BLOCKS, craftingOutput, craftingInput);
                stonecuttingRecipes(2, craftingOutput, stonecutterInputs);
            }

            //wall recipes

            void wallRecipes(Item craftingOutput, Item craftingInput, Item... stonecutterInputs) {
                wall(RecipeCategory.BUILDING_BLOCKS, craftingOutput, craftingInput);
                stonecuttingRecipes(craftingOutput, stonecutterInputs);
            }

            //pillar recipes

            void pillarRecipes(Item craftingOutput, Item craftingInput, Item... stonecutterInputs) {
                shaped(RecipeCategory.BUILDING_BLOCKS, craftingOutput, 2).pattern("#").pattern("#").define('#', craftingInput).unlockedBy(getHasName(craftingInput), has(craftingInput)).save(output);
                stonecuttingRecipes(craftingOutput, stonecutterInputs);
            }

            //mossy block recipes

            void mossyRecipes(Item craftingOutput, Item craftingInput) {
                shapeless(RecipeCategory.BUILDING_BLOCKS, craftingOutput).requires(craftingInput).requires(Items.MOSS_BLOCK).unlockedBy(getHasName(craftingInput), has(craftingInput)).save(output, getItemName(craftingOutput)+"_from_moss");
                shapeless(RecipeCategory.BUILDING_BLOCKS, craftingOutput).requires(craftingInput).requires(Items.VINE).unlockedBy(getHasName(craftingInput), has(craftingInput)).save(output, getItemName(craftingOutput)+"_from_vine");
            }

            //stonecutting recipes

            void stonecuttingRecipes(int count, Item output, Item... inputs) {
                for (Item input : inputs) stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, output, input, count);
            }
            void stonecuttingRecipes(Item output, Item... inputs) {
                stonecuttingRecipes(1, output, inputs);
            }

            //terracotta recipes

            void dyedTerracottaBricks(Item terracottaBricks, Item terracotta, Item dye) {
                brickRecipes(terracottaBricks, terracotta, terracotta);
                shaped(RecipeCategory.BUILDING_BLOCKS, terracottaBricks, 8).pattern("###").pattern("#0#").pattern("###").define('#', ChiseledItems.TERRACOTTA_BRICKS).define('0', dye).unlockedBy(getHasName(ChiseledItems.TERRACOTTA_BRICKS), has(ChiseledItems.TERRACOTTA_BRICKS)).save(output, getItemName(terracottaBricks) + "_from_" + getItemName(ChiseledItems.TERRACOTTA_BRICKS));
            }

            @Override
            public void buildRecipes() {

                //list of recipes by materiel

                //stone

                wallRecipes(ChiseledItems.STONE_WALL, Items.STONE, Items.STONE);
                brickRecipes(ChiseledItems.POLISHED_STONE, Items.STONE, Items.STONE);
                stairRecipes(ChiseledItems.POLISHED_STONE_STAIRS, ChiseledItems.POLISHED_STONE, Items.STONE, ChiseledItems.POLISHED_STONE);
                slabRecipes(ChiseledItems.POLISHED_STONE_SLAB, ChiseledItems.POLISHED_STONE, Items.STONE, ChiseledItems.POLISHED_STONE);
                wallRecipes(ChiseledItems.POLISHED_STONE_WALL, ChiseledItems.POLISHED_STONE, Items.STONE, ChiseledItems.POLISHED_STONE);
                pillarRecipes(ChiseledItems.STONE_PILLAR, ChiseledItems.POLISHED_STONE, Items.STONE, ChiseledItems.POLISHED_STONE);
                brickRecipes(Items.STONE_BRICKS, ChiseledItems.POLISHED_STONE, ChiseledItems.POLISHED_STONE);
                stonecuttingRecipes(Items.STONE_BRICK_STAIRS, ChiseledItems.POLISHED_STONE);
                stonecuttingRecipes(2, Items.STONE_BRICK_SLAB, ChiseledItems.POLISHED_STONE);
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

                //granite

                wallRecipes(ChiseledItems.POLISHED_GRANITE_WALL, Items.POLISHED_GRANITE, Items.GRANITE, Items.POLISHED_GRANITE);
                pillarRecipes(ChiseledItems.POLISHED_GRANITE_PILLAR, Items.POLISHED_GRANITE, Items.GRANITE, Items.POLISHED_GRANITE);
                brickRecipes(ChiseledItems.POLISHED_GRANITE_BRICKS, Items.POLISHED_GRANITE, Items.GRANITE, Items.POLISHED_GRANITE);
                smeltingResultFromBase(ChiseledItems.CRACKED_POLISHED_GRANITE_BRICKS, ChiseledItems.POLISHED_GRANITE_BRICKS);
                stairRecipes(ChiseledItems.POLISHED_GRANITE_BRICK_STAIRS, ChiseledItems.POLISHED_GRANITE_BRICKS, Items.GRANITE, Items.POLISHED_GRANITE, ChiseledItems.POLISHED_GRANITE_BRICKS);
                slabRecipes(ChiseledItems.POLISHED_GRANITE_BRICK_SLAB, ChiseledItems.POLISHED_GRANITE_BRICKS, Items.GRANITE, Items.POLISHED_GRANITE, ChiseledItems.POLISHED_GRANITE_BRICKS);
                wallRecipes(ChiseledItems.POLISHED_GRANITE_BRICK_WALL, ChiseledItems.POLISHED_GRANITE_BRICKS, Items.GRANITE, Items.POLISHED_GRANITE, ChiseledItems.POLISHED_GRANITE_BRICKS);
                cutBrickRecipes(ChiseledItems.CUT_POLISHED_GRANITE_BRICKS, Items.POLISHED_GRANITE_SLAB, Items.GRANITE, Items.POLISHED_GRANITE);
                smeltingResultFromBase(ChiseledItems.CRACKED_CUT_POLISHED_GRANITE_BRICKS, ChiseledItems.CUT_POLISHED_GRANITE_BRICKS);
                stairRecipes(ChiseledItems.CUT_POLISHED_GRANITE_BRICK_STAIRS, ChiseledItems.CUT_POLISHED_GRANITE_BRICKS, Items.GRANITE, Items.POLISHED_GRANITE, ChiseledItems.CUT_POLISHED_GRANITE_BRICKS);
                slabRecipes(ChiseledItems.CUT_POLISHED_GRANITE_BRICK_SLAB, ChiseledItems.CUT_POLISHED_GRANITE_BRICKS, Items.GRANITE, Items.POLISHED_GRANITE, ChiseledItems.CUT_POLISHED_GRANITE_BRICKS);
                brickRecipes(ChiseledItems.POLISHED_GRANITE_TILES, ChiseledItems.POLISHED_GRANITE_BRICKS, Items.GRANITE, Items.POLISHED_GRANITE, ChiseledItems.POLISHED_GRANITE_BRICKS);
                smeltingResultFromBase(ChiseledItems.CRACKED_POLISHED_GRANITE_TILES, ChiseledItems.POLISHED_GRANITE_TILES);
                stairRecipes(ChiseledItems.POLISHED_GRANITE_TILE_STAIRS, ChiseledItems.POLISHED_GRANITE_TILES, Items.GRANITE, Items.POLISHED_GRANITE, ChiseledItems.POLISHED_GRANITE_BRICKS, ChiseledItems.POLISHED_GRANITE_TILES);
                slabRecipes(ChiseledItems.POLISHED_GRANITE_TILE_SLAB, ChiseledItems.POLISHED_GRANITE_TILES, Items.GRANITE, Items.POLISHED_GRANITE, ChiseledItems.POLISHED_GRANITE_BRICKS, ChiseledItems.POLISHED_GRANITE_TILES);
                wallRecipes(ChiseledItems.POLISHED_GRANITE_TILE_WALL, ChiseledItems.POLISHED_GRANITE_TILES, Items.GRANITE, Items.POLISHED_GRANITE, ChiseledItems.POLISHED_GRANITE_BRICKS, ChiseledItems.POLISHED_GRANITE_TILES);

                //diorite

                wallRecipes(ChiseledItems.POLISHED_DIORITE_WALL, Items.POLISHED_DIORITE, Items.DIORITE, Items.POLISHED_DIORITE);
                pillarRecipes(ChiseledItems.POLISHED_DIORITE_PILLAR, Items.POLISHED_DIORITE, Items.DIORITE, Items.POLISHED_DIORITE);
                brickRecipes(ChiseledItems.POLISHED_DIORITE_BRICKS, Items.POLISHED_DIORITE, Items.DIORITE, Items.POLISHED_DIORITE);
                smeltingResultFromBase(ChiseledItems.CRACKED_POLISHED_DIORITE_BRICKS, ChiseledItems.POLISHED_DIORITE_BRICKS);
                stairRecipes(ChiseledItems.POLISHED_DIORITE_BRICK_STAIRS, ChiseledItems.POLISHED_DIORITE_BRICKS, Items.DIORITE, Items.POLISHED_DIORITE, ChiseledItems.POLISHED_DIORITE_BRICKS);
                slabRecipes(ChiseledItems.POLISHED_DIORITE_BRICK_SLAB, ChiseledItems.POLISHED_DIORITE_BRICKS, Items.DIORITE, Items.POLISHED_DIORITE, ChiseledItems.POLISHED_DIORITE_BRICKS);
                wallRecipes(ChiseledItems.POLISHED_DIORITE_BRICK_WALL, ChiseledItems.POLISHED_DIORITE_BRICKS, Items.DIORITE, Items.POLISHED_DIORITE, ChiseledItems.POLISHED_DIORITE_BRICKS);
                cutBrickRecipes(ChiseledItems.CUT_POLISHED_DIORITE_BRICKS, Items.POLISHED_DIORITE_SLAB, Items.DIORITE, Items.POLISHED_DIORITE);
                smeltingResultFromBase(ChiseledItems.CRACKED_CUT_POLISHED_DIORITE_BRICKS, ChiseledItems.CUT_POLISHED_DIORITE_BRICKS);
                stairRecipes(ChiseledItems.CUT_POLISHED_DIORITE_BRICK_STAIRS, ChiseledItems.CUT_POLISHED_DIORITE_BRICKS, Items.DIORITE, Items.POLISHED_DIORITE, ChiseledItems.CUT_POLISHED_DIORITE_BRICKS);
                slabRecipes(ChiseledItems.CUT_POLISHED_DIORITE_BRICK_SLAB, ChiseledItems.CUT_POLISHED_DIORITE_BRICKS, Items.DIORITE, Items.POLISHED_DIORITE, ChiseledItems.CUT_POLISHED_DIORITE_BRICKS);
                brickRecipes(ChiseledItems.POLISHED_DIORITE_TILES, ChiseledItems.POLISHED_DIORITE_BRICKS, Items.DIORITE, Items.POLISHED_DIORITE, ChiseledItems.POLISHED_DIORITE_BRICKS);
                smeltingResultFromBase(ChiseledItems.CRACKED_POLISHED_DIORITE_TILES, ChiseledItems.POLISHED_DIORITE_TILES);
                stairRecipes(ChiseledItems.POLISHED_DIORITE_TILE_STAIRS, ChiseledItems.POLISHED_DIORITE_TILES, Items.DIORITE, Items.POLISHED_DIORITE, ChiseledItems.POLISHED_DIORITE_BRICKS, ChiseledItems.POLISHED_DIORITE_TILES);
                slabRecipes(ChiseledItems.POLISHED_DIORITE_TILE_SLAB, ChiseledItems.POLISHED_DIORITE_TILES, Items.DIORITE, Items.POLISHED_DIORITE, ChiseledItems.POLISHED_DIORITE_BRICKS, ChiseledItems.POLISHED_DIORITE_TILES);
                wallRecipes(ChiseledItems.POLISHED_DIORITE_TILE_WALL, ChiseledItems.POLISHED_DIORITE_TILES, Items.DIORITE, Items.POLISHED_DIORITE, ChiseledItems.POLISHED_DIORITE_BRICKS, ChiseledItems.POLISHED_DIORITE_TILES);

                //andesite

                wallRecipes(ChiseledItems.POLISHED_ANDESITE_WALL, Items.POLISHED_ANDESITE, Items.ANDESITE, Items.POLISHED_ANDESITE);
                pillarRecipes(ChiseledItems.POLISHED_ANDESITE_PILLAR, Items.POLISHED_ANDESITE, Items.ANDESITE, Items.POLISHED_ANDESITE);
                brickRecipes(ChiseledItems.POLISHED_ANDESITE_BRICKS, Items.POLISHED_ANDESITE, Items.ANDESITE, Items.POLISHED_ANDESITE);
                smeltingResultFromBase(ChiseledItems.CRACKED_POLISHED_ANDESITE_BRICKS, ChiseledItems.POLISHED_ANDESITE_BRICKS);
                stairRecipes(ChiseledItems.POLISHED_ANDESITE_BRICK_STAIRS, ChiseledItems.POLISHED_ANDESITE_BRICKS, Items.ANDESITE, Items.POLISHED_ANDESITE, ChiseledItems.POLISHED_ANDESITE_BRICKS);
                slabRecipes(ChiseledItems.POLISHED_ANDESITE_BRICK_SLAB, ChiseledItems.POLISHED_ANDESITE_BRICKS, Items.ANDESITE, Items.POLISHED_ANDESITE, ChiseledItems.POLISHED_ANDESITE_BRICKS);
                wallRecipes(ChiseledItems.POLISHED_ANDESITE_BRICK_WALL, ChiseledItems.POLISHED_ANDESITE_BRICKS, Items.ANDESITE, Items.POLISHED_ANDESITE, ChiseledItems.POLISHED_ANDESITE_BRICKS);
                cutBrickRecipes(ChiseledItems.CUT_POLISHED_ANDESITE_BRICKS, Items.POLISHED_ANDESITE_SLAB, Items.ANDESITE, Items.POLISHED_ANDESITE);
                smeltingResultFromBase(ChiseledItems.CRACKED_CUT_POLISHED_ANDESITE_BRICKS, ChiseledItems.CUT_POLISHED_ANDESITE_BRICKS);
                stairRecipes(ChiseledItems.CUT_POLISHED_ANDESITE_BRICK_STAIRS, ChiseledItems.CUT_POLISHED_ANDESITE_BRICKS, Items.ANDESITE, Items.POLISHED_ANDESITE, ChiseledItems.CUT_POLISHED_ANDESITE_BRICKS);
                slabRecipes(ChiseledItems.CUT_POLISHED_ANDESITE_BRICK_SLAB, ChiseledItems.CUT_POLISHED_ANDESITE_BRICKS, Items.ANDESITE, Items.POLISHED_ANDESITE, ChiseledItems.CUT_POLISHED_ANDESITE_BRICKS);
                brickRecipes(ChiseledItems.POLISHED_ANDESITE_TILES, ChiseledItems.POLISHED_ANDESITE_BRICKS, Items.ANDESITE, Items.POLISHED_ANDESITE, ChiseledItems.POLISHED_ANDESITE_BRICKS);
                smeltingResultFromBase(ChiseledItems.CRACKED_POLISHED_ANDESITE_TILES, ChiseledItems.POLISHED_ANDESITE_TILES);
                stairRecipes(ChiseledItems.POLISHED_ANDESITE_TILE_STAIRS, ChiseledItems.POLISHED_ANDESITE_TILES, Items.ANDESITE, Items.POLISHED_ANDESITE, ChiseledItems.POLISHED_ANDESITE_BRICKS, ChiseledItems.POLISHED_ANDESITE_TILES);
                slabRecipes(ChiseledItems.POLISHED_ANDESITE_TILE_SLAB, ChiseledItems.POLISHED_ANDESITE_TILES, Items.ANDESITE, Items.POLISHED_ANDESITE, ChiseledItems.POLISHED_ANDESITE_BRICKS, ChiseledItems.POLISHED_ANDESITE_TILES);
                wallRecipes(ChiseledItems.POLISHED_ANDESITE_TILE_WALL, ChiseledItems.POLISHED_ANDESITE_TILES, Items.ANDESITE, Items.POLISHED_ANDESITE, ChiseledItems.POLISHED_ANDESITE_BRICKS, ChiseledItems.POLISHED_ANDESITE_TILES);

                //deepslate

                pillarRecipes(ChiseledItems.DEEPSLATE_PILLAR, Items.POLISHED_DEEPSLATE, Items.DEEPSLATE, Items.COBBLED_DEEPSLATE, Items.POLISHED_DEEPSLATE);
                cutBrickRecipes(ChiseledItems.CUT_DEEPSLATE_BRICKS, Items.POLISHED_DEEPSLATE_SLAB, Items.DEEPSLATE, Items.COBBLED_DEEPSLATE, Items.POLISHED_DEEPSLATE);
                smeltingResultFromBase(ChiseledItems.CRACKED_CUT_DEEPSLATE_BRICKS, ChiseledItems.CUT_DEEPSLATE_BRICKS);
                stairRecipes(ChiseledItems.CUT_DEEPSLATE_BRICK_STAIRS, ChiseledItems.CUT_DEEPSLATE_BRICKS, Items.DEEPSLATE, Items.COBBLED_DEEPSLATE, Items.POLISHED_DEEPSLATE, ChiseledItems.CUT_DEEPSLATE_BRICKS);
                slabRecipes(ChiseledItems.CUT_DEEPSLATE_BRICK_SLAB, ChiseledItems.CUT_DEEPSLATE_BRICKS, Items.DEEPSLATE, Items.COBBLED_DEEPSLATE, Items.POLISHED_DEEPSLATE, ChiseledItems.CUT_DEEPSLATE_BRICKS);

                //bricks

                smeltingResultFromBase(ChiseledItems.CRACKED_BRICKS, Items.BRICKS);
                brickRecipes(ChiseledItems.WEATHERED_BRICKS, Items.BRICKS, Items.BRICKS);
                stairRecipes(ChiseledItems.WEATHERED_BRICK_STAIRS, ChiseledItems.WEATHERED_BRICKS, ChiseledItems.WEATHERED_BRICKS, Items.BRICKS);
                slabRecipes(ChiseledItems.WEATHERED_BRICK_SLAB, ChiseledItems.WEATHERED_BRICKS, ChiseledItems.WEATHERED_BRICKS, Items.BRICKS);
                wallRecipes(ChiseledItems.WEATHERED_BRICK_WALL, ChiseledItems.WEATHERED_BRICKS, ChiseledItems.WEATHERED_BRICKS, Items.BRICKS);
                mossyRecipes(ChiseledItems.MOSSY_BRICKS, Items.BRICKS);
                stairRecipes(ChiseledItems.MOSSY_BRICK_STAIRS, ChiseledItems.MOSSY_BRICKS, ChiseledItems.MOSSY_BRICKS);
                slabRecipes(ChiseledItems.MOSSY_BRICK_SLAB, ChiseledItems.MOSSY_BRICKS, ChiseledItems.MOSSY_BRICKS);
                wallRecipes(ChiseledItems.MOSSY_BRICK_WALL, ChiseledItems.MOSSY_BRICKS, ChiseledItems.MOSSY_BRICKS);

                //mud

                stairRecipes(ChiseledItems.PACKED_MUD_STAIRS, Items.PACKED_MUD);
                slabRecipes(ChiseledItems.PACKED_MUD_SLAB, Items.PACKED_MUD);
                wallRecipes(ChiseledItems.PACKED_MUD_WALL, Items.PACKED_MUD);
                mossyRecipes(ChiseledItems.MOSSY_MUD_BRICKS, Items.MUD_BRICKS);
                stairRecipes(ChiseledItems.MOSSY_MUD_BRICK_STAIRS, ChiseledItems.MOSSY_MUD_BRICKS, ChiseledItems.MOSSY_MUD_BRICKS);
                slabRecipes(ChiseledItems.MOSSY_MUD_BRICK_SLAB, ChiseledItems.MOSSY_MUD_BRICKS, ChiseledItems.MOSSY_MUD_BRICKS);
                wallRecipes(ChiseledItems.MOSSY_MUD_BRICK_WALL, ChiseledItems.MOSSY_MUD_BRICKS, ChiseledItems.MOSSY_MUD_BRICKS);
                cutBrickRecipes(ChiseledItems.CUT_MUD_BRICKS, ChiseledItems.PACKED_MUD_SLAB);
                stairRecipes(ChiseledItems.CUT_MUD_BRICK_STAIRS, ChiseledItems.CUT_MUD_BRICKS, ChiseledItems.CUT_MUD_BRICKS);
                slabRecipes(ChiseledItems.CUT_MUD_BRICK_SLAB, ChiseledItems.CUT_MUD_BRICKS, ChiseledItems.CUT_MUD_BRICKS);
                mossyRecipes(ChiseledItems.MOSSY_CUT_MUD_BRICKS, ChiseledItems.CUT_MUD_BRICKS);
                stairRecipes(ChiseledItems.MOSSY_CUT_MUD_BRICK_STAIRS, ChiseledItems.MOSSY_CUT_MUD_BRICKS, ChiseledItems.MOSSY_CUT_MUD_BRICKS);
                slabRecipes(ChiseledItems.MOSSY_CUT_MUD_BRICK_SLAB, ChiseledItems.MOSSY_CUT_MUD_BRICKS, ChiseledItems.MOSSY_CUT_MUD_BRICKS);
                brickRecipes(ChiseledItems.MUD_TILES, Items.MUD_BRICKS, Items.MUD_BRICKS);
                stairRecipes(ChiseledItems.MUD_TILE_STAIRS, ChiseledItems.MUD_TILES, Items.MUD_BRICKS, ChiseledItems.MUD_TILES);
                slabRecipes(ChiseledItems.MUD_TILE_SLAB, ChiseledItems.MUD_TILES, Items.MUD_BRICKS, ChiseledItems.MUD_TILES);
                wallRecipes(ChiseledItems.MUD_TILE_WALL, ChiseledItems.MUD_TILES, Items.MUD_BRICKS, ChiseledItems.MUD_TILES);
                mossyRecipes(ChiseledItems.MOSSY_MUD_TILES, ChiseledItems.MUD_TILES);
                stairRecipes(ChiseledItems.MOSSY_MUD_TILE_STAIRS, ChiseledItems.MOSSY_MUD_TILES, ChiseledItems.MOSSY_MUD_TILES);
                slabRecipes(ChiseledItems.MOSSY_MUD_TILE_SLAB, ChiseledItems.MOSSY_MUD_TILES, ChiseledItems.MOSSY_MUD_TILES);
                wallRecipes(ChiseledItems.MOSSY_MUD_TILE_WALL, ChiseledItems.MOSSY_MUD_TILES, ChiseledItems.MOSSY_MUD_TILES);

                //sandstone

                wallRecipes(ChiseledItems.SMOOTH_SANDSTONE_WALL, Items.SMOOTH_SANDSTONE, Items.SANDSTONE, Items.SMOOTH_SANDSTONE);
                pillarRecipes(ChiseledItems.SMOOTH_SANDSTONE_PILLAR, Items.SMOOTH_SANDSTONE, Items.SANDSTONE, Items.SMOOTH_SANDSTONE);
                brickRecipes(ChiseledItems.SMOOTH_SANDSTONE_BRICKS, Items.SMOOTH_SANDSTONE, Items.SANDSTONE, Items.SMOOTH_SANDSTONE);
                stairRecipes(ChiseledItems.SMOOTH_SANDSTONE_BRICK_STAIRS, ChiseledItems.SMOOTH_SANDSTONE_BRICKS, Items.SANDSTONE, Items.SMOOTH_SANDSTONE, ChiseledItems.SMOOTH_SANDSTONE_BRICKS);
                slabRecipes(ChiseledItems.SMOOTH_SANDSTONE_BRICK_SLAB, ChiseledItems.SMOOTH_SANDSTONE_BRICKS, Items.SANDSTONE, Items.SMOOTH_SANDSTONE, ChiseledItems.SMOOTH_SANDSTONE_BRICKS);
                wallRecipes(ChiseledItems.SMOOTH_SANDSTONE_BRICK_WALL, ChiseledItems.SMOOTH_SANDSTONE_BRICKS, Items.SANDSTONE, Items.SMOOTH_SANDSTONE, ChiseledItems.SMOOTH_SANDSTONE_BRICKS);
                cutBrickRecipes(ChiseledItems.CUT_SMOOTH_SANDSTONE_BRICKS, Items.SMOOTH_SANDSTONE_SLAB, Items.SANDSTONE, Items.SMOOTH_SANDSTONE);
                stairRecipes(ChiseledItems.CUT_SMOOTH_SANDSTONE_BRICK_STAIRS, ChiseledItems.CUT_SMOOTH_SANDSTONE_BRICKS, Items.SANDSTONE, Items.SMOOTH_SANDSTONE, ChiseledItems.CUT_SMOOTH_SANDSTONE_BRICKS);
                slabRecipes(ChiseledItems.CUT_SMOOTH_SANDSTONE_BRICK_SLAB, ChiseledItems.CUT_SMOOTH_SANDSTONE_BRICKS, Items.SANDSTONE, Items.SMOOTH_SANDSTONE, ChiseledItems.CUT_SMOOTH_SANDSTONE_BRICKS);
                brickRecipes(ChiseledItems.SMOOTH_SANDSTONE_TILES, ChiseledItems.SMOOTH_SANDSTONE_BRICKS, Items.SANDSTONE, Items.SMOOTH_SANDSTONE, ChiseledItems.SMOOTH_SANDSTONE_BRICKS);
                stairRecipes(ChiseledItems.SMOOTH_SANDSTONE_TILE_STAIRS, ChiseledItems.SMOOTH_SANDSTONE_TILES, Items.SANDSTONE, Items.SMOOTH_SANDSTONE, ChiseledItems.SMOOTH_SANDSTONE_BRICKS, ChiseledItems.SMOOTH_SANDSTONE_TILES);
                slabRecipes(ChiseledItems.SMOOTH_SANDSTONE_TILE_SLAB, ChiseledItems.SMOOTH_SANDSTONE_TILES, Items.SANDSTONE, Items.SMOOTH_SANDSTONE, ChiseledItems.SMOOTH_SANDSTONE_BRICKS, ChiseledItems.SMOOTH_SANDSTONE_TILES);
                wallRecipes(ChiseledItems.SMOOTH_SANDSTONE_TILE_WALL, ChiseledItems.SMOOTH_SANDSTONE_TILES, Items.SANDSTONE, Items.SMOOTH_SANDSTONE, ChiseledItems.SMOOTH_SANDSTONE_BRICKS, ChiseledItems.SMOOTH_SANDSTONE_TILES);
                wallRecipes(ChiseledItems.SMOOTH_RED_SANDSTONE_WALL, Items.SMOOTH_RED_SANDSTONE, Items.RED_SANDSTONE, Items.SMOOTH_RED_SANDSTONE);
                pillarRecipes(ChiseledItems.SMOOTH_RED_SANDSTONE_PILLAR, Items.SMOOTH_RED_SANDSTONE, Items.RED_SANDSTONE, Items.SMOOTH_RED_SANDSTONE);
                brickRecipes(ChiseledItems.SMOOTH_RED_SANDSTONE_BRICKS, Items.SMOOTH_RED_SANDSTONE, Items.RED_SANDSTONE, Items.SMOOTH_RED_SANDSTONE);
                stairRecipes(ChiseledItems.SMOOTH_RED_SANDSTONE_BRICK_STAIRS, ChiseledItems.SMOOTH_RED_SANDSTONE_BRICKS, Items.RED_SANDSTONE, Items.SMOOTH_RED_SANDSTONE, ChiseledItems.SMOOTH_RED_SANDSTONE_BRICKS);
                slabRecipes(ChiseledItems.SMOOTH_RED_SANDSTONE_BRICK_SLAB, ChiseledItems.SMOOTH_RED_SANDSTONE_BRICKS, Items.RED_SANDSTONE, Items.SMOOTH_RED_SANDSTONE, ChiseledItems.SMOOTH_RED_SANDSTONE_BRICKS);
                wallRecipes(ChiseledItems.SMOOTH_RED_SANDSTONE_BRICK_WALL, ChiseledItems.SMOOTH_RED_SANDSTONE_BRICKS, Items.RED_SANDSTONE, Items.SMOOTH_RED_SANDSTONE, ChiseledItems.SMOOTH_RED_SANDSTONE_BRICKS);
                cutBrickRecipes(ChiseledItems.CUT_SMOOTH_RED_SANDSTONE_BRICKS, Items.SMOOTH_RED_SANDSTONE_SLAB, Items.RED_SANDSTONE, Items.SMOOTH_RED_SANDSTONE);
                stairRecipes(ChiseledItems.CUT_SMOOTH_RED_SANDSTONE_BRICK_STAIRS, ChiseledItems.CUT_SMOOTH_RED_SANDSTONE_BRICKS, Items.RED_SANDSTONE, Items.SMOOTH_RED_SANDSTONE, ChiseledItems.CUT_SMOOTH_RED_SANDSTONE_BRICKS);
                slabRecipes(ChiseledItems.CUT_SMOOTH_RED_SANDSTONE_BRICK_SLAB, ChiseledItems.CUT_SMOOTH_RED_SANDSTONE_BRICKS, Items.RED_SANDSTONE, Items.SMOOTH_RED_SANDSTONE, ChiseledItems.CUT_SMOOTH_RED_SANDSTONE_BRICKS);
                brickRecipes(ChiseledItems.SMOOTH_RED_SANDSTONE_TILES, ChiseledItems.SMOOTH_RED_SANDSTONE_BRICKS, Items.RED_SANDSTONE, Items.SMOOTH_RED_SANDSTONE, ChiseledItems.SMOOTH_RED_SANDSTONE_BRICKS);
                stairRecipes(ChiseledItems.SMOOTH_RED_SANDSTONE_TILE_STAIRS, ChiseledItems.SMOOTH_RED_SANDSTONE_TILES, Items.RED_SANDSTONE, Items.SMOOTH_RED_SANDSTONE, ChiseledItems.SMOOTH_RED_SANDSTONE_BRICKS, ChiseledItems.SMOOTH_RED_SANDSTONE_TILES);
                slabRecipes(ChiseledItems.SMOOTH_RED_SANDSTONE_TILE_SLAB, ChiseledItems.SMOOTH_RED_SANDSTONE_TILES, Items.RED_SANDSTONE, Items.SMOOTH_RED_SANDSTONE, ChiseledItems.SMOOTH_RED_SANDSTONE_BRICKS, ChiseledItems.SMOOTH_RED_SANDSTONE_TILES);
                wallRecipes(ChiseledItems.SMOOTH_RED_SANDSTONE_TILE_WALL, ChiseledItems.SMOOTH_RED_SANDSTONE_TILES, Items.RED_SANDSTONE, Items.SMOOTH_RED_SANDSTONE, ChiseledItems.SMOOTH_RED_SANDSTONE_BRICKS, ChiseledItems.SMOOTH_RED_SANDSTONE_TILES);

                //cinnabar

                smeltingResultFromBase(ChiseledItems.CRACKED_CINNABAR_BRICKS, Items.CINNABAR_BRICKS);
                cutBrickRecipes(ChiseledItems.CUT_CINNABAR_BRICKS, Items.POLISHED_CINNABAR_SLAB, Items.CINNABAR, Items.POLISHED_CINNABAR);
                smeltingResultFromBase(ChiseledItems.CRACKED_CUT_CINNABAR_BRICKS, ChiseledItems.CUT_CINNABAR_BRICKS);
                stairRecipes(ChiseledItems.CUT_CINNABAR_BRICK_STAIRS, ChiseledItems.CUT_CINNABAR_BRICKS, Items.CINNABAR, Items.POLISHED_CINNABAR, ChiseledItems.CUT_CINNABAR_BRICKS);
                slabRecipes(ChiseledItems.CUT_CINNABAR_BRICK_SLAB, ChiseledItems.CUT_CINNABAR_BRICKS, Items.CINNABAR, Items.POLISHED_CINNABAR, ChiseledItems.CUT_CINNABAR_BRICKS);
                brickRecipes(ChiseledItems.CINNABAR_TILES, Items.CINNABAR_BRICKS, Items.CINNABAR, Items.POLISHED_CINNABAR, Items.CINNABAR_BRICKS);
                smeltingResultFromBase(ChiseledItems.CRACKED_CINNABAR_TILES, ChiseledItems.CINNABAR_TILES);
                stairRecipes(ChiseledItems.CINNABAR_TILE_STAIRS, ChiseledItems.CINNABAR_TILES, Items.CINNABAR, Items.POLISHED_CINNABAR, Items.CINNABAR_BRICKS, ChiseledItems.CINNABAR_TILES);
                slabRecipes(ChiseledItems.CINNABAR_TILE_SLAB, ChiseledItems.CINNABAR_TILES, Items.CINNABAR, Items.POLISHED_CINNABAR, Items.CINNABAR_BRICKS, ChiseledItems.CINNABAR_TILES);
                wallRecipes(ChiseledItems.CINNABAR_TILE_WALL, ChiseledItems.CINNABAR_TILES, Items.CINNABAR, Items.POLISHED_CINNABAR, Items.CINNABAR_BRICKS, ChiseledItems.CINNABAR_TILES);

                //sulfur

                smeltingResultFromBase(ChiseledItems.CRACKED_SULFUR_BRICKS, Items.SULFUR_BRICKS);
                cutBrickRecipes(ChiseledItems.CUT_SULFUR_BRICKS, Items.POLISHED_SULFUR_SLAB, Items.SULFUR, Items.POLISHED_SULFUR);
                smeltingResultFromBase(ChiseledItems.CRACKED_CUT_SULFUR_BRICKS, ChiseledItems.CUT_SULFUR_BRICKS);
                stairRecipes(ChiseledItems.CUT_SULFUR_BRICK_STAIRS, ChiseledItems.CUT_SULFUR_BRICKS, Items.SULFUR, Items.POLISHED_SULFUR, ChiseledItems.CUT_SULFUR_BRICKS);
                slabRecipes(ChiseledItems.CUT_SULFUR_BRICK_SLAB, ChiseledItems.CUT_SULFUR_BRICKS, Items.SULFUR, Items.POLISHED_SULFUR, ChiseledItems.CUT_SULFUR_BRICKS);
                brickRecipes(ChiseledItems.SULFUR_TILES, Items.SULFUR_BRICKS, Items.SULFUR, Items.POLISHED_SULFUR, Items.SULFUR_BRICKS);
                smeltingResultFromBase(ChiseledItems.CRACKED_SULFUR_TILES, ChiseledItems.SULFUR_TILES);
                stairRecipes(ChiseledItems.SULFUR_TILE_STAIRS, ChiseledItems.SULFUR_TILES, Items.SULFUR, Items.POLISHED_SULFUR, Items.SULFUR_BRICKS, ChiseledItems.SULFUR_TILES);
                slabRecipes(ChiseledItems.SULFUR_TILE_SLAB, ChiseledItems.SULFUR_TILES, Items.SULFUR, Items.POLISHED_SULFUR, Items.SULFUR_BRICKS, ChiseledItems.SULFUR_TILES);
                wallRecipes(ChiseledItems.SULFUR_TILE_WALL, ChiseledItems.SULFUR_TILES, Items.SULFUR, Items.POLISHED_SULFUR, Items.SULFUR_BRICKS, ChiseledItems.SULFUR_TILES);

                //prismarine

                brickRecipes(ChiseledItems.POLISHED_PRISMARINE, Items.PRISMARINE, Items.PRISMARINE);
                stairRecipes(ChiseledItems.POLISHED_PRISMARINE_STAIRS, ChiseledItems.POLISHED_PRISMARINE, Items.PRISMARINE, ChiseledItems.POLISHED_PRISMARINE);
                slabRecipes(ChiseledItems.POLISHED_PRISMARINE_SLAB, ChiseledItems.POLISHED_PRISMARINE, Items.PRISMARINE, ChiseledItems.POLISHED_PRISMARINE);
                wallRecipes(ChiseledItems.POLISHED_PRISMARINE_WALL, ChiseledItems.POLISHED_PRISMARINE, Items.PRISMARINE, ChiseledItems.POLISHED_PRISMARINE);
                stonecuttingRecipes(Items.PRISMARINE_BRICKS, Items.PRISMARINE, ChiseledItems.POLISHED_PRISMARINE);
                stonecuttingRecipes(Items.PRISMARINE_BRICK_STAIRS, Items.PRISMARINE, ChiseledItems.POLISHED_PRISMARINE);
                stonecuttingRecipes(2, Items.PRISMARINE_BRICK_SLAB, Items.PRISMARINE, ChiseledItems.POLISHED_PRISMARINE);
                wallRecipes(ChiseledItems.PRISMARINE_BRICK_WALL, Items.PRISMARINE_BRICKS, Items.PRISMARINE, ChiseledItems.POLISHED_PRISMARINE, Items.PRISMARINE_BRICKS);
                cutBrickRecipes(ChiseledItems.CUT_PRISMARINE_BRICKS, ChiseledItems.POLISHED_PRISMARINE_SLAB, Items.PRISMARINE, ChiseledItems.POLISHED_PRISMARINE);
                stairRecipes(ChiseledItems.CUT_PRISMARINE_BRICK_STAIRS, ChiseledItems.CUT_PRISMARINE_BRICKS, Items.PRISMARINE, ChiseledItems.POLISHED_PRISMARINE, ChiseledItems.CUT_PRISMARINE_BRICKS);
                slabRecipes(ChiseledItems.CUT_PRISMARINE_BRICK_SLAB, ChiseledItems.CUT_PRISMARINE_BRICKS, Items.PRISMARINE, ChiseledItems.POLISHED_PRISMARINE, ChiseledItems.CUT_PRISMARINE_BRICKS);

                //dark prismarine

                wallRecipes(ChiseledItems.DARK_PRISMARINE_WALL, Items.DARK_PRISMARINE, Items.DARK_PRISMARINE);
                brickRecipes(ChiseledItems.POLISHED_DARK_PRISMARINE, Items.DARK_PRISMARINE, Items.DARK_PRISMARINE);
                stairRecipes(ChiseledItems.POLISHED_DARK_PRISMARINE_STAIRS, ChiseledItems.POLISHED_DARK_PRISMARINE, Items.DARK_PRISMARINE, ChiseledItems.POLISHED_DARK_PRISMARINE);
                slabRecipes(ChiseledItems.POLISHED_DARK_PRISMARINE_SLAB, ChiseledItems.POLISHED_DARK_PRISMARINE, Items.DARK_PRISMARINE, ChiseledItems.POLISHED_DARK_PRISMARINE);
                wallRecipes(ChiseledItems.POLISHED_DARK_PRISMARINE_WALL, ChiseledItems.POLISHED_DARK_PRISMARINE, Items.DARK_PRISMARINE, ChiseledItems.POLISHED_DARK_PRISMARINE);
                brickRecipes(ChiseledItems.DARK_PRISMARINE_BRICKS, ChiseledItems.POLISHED_DARK_PRISMARINE, Items.DARK_PRISMARINE, ChiseledItems.POLISHED_DARK_PRISMARINE);
                stairRecipes(ChiseledItems.DARK_PRISMARINE_BRICK_STAIRS, ChiseledItems.DARK_PRISMARINE_BRICKS, Items.DARK_PRISMARINE, ChiseledItems.POLISHED_DARK_PRISMARINE, ChiseledItems.DARK_PRISMARINE_BRICKS);
                slabRecipes(ChiseledItems.DARK_PRISMARINE_BRICK_SLAB, ChiseledItems.DARK_PRISMARINE_BRICKS, Items.DARK_PRISMARINE, ChiseledItems.POLISHED_DARK_PRISMARINE, ChiseledItems.DARK_PRISMARINE_BRICKS);
                wallRecipes(ChiseledItems.DARK_PRISMARINE_BRICK_WALL, ChiseledItems.DARK_PRISMARINE_BRICKS, Items.DARK_PRISMARINE, ChiseledItems.POLISHED_DARK_PRISMARINE, ChiseledItems.DARK_PRISMARINE_BRICKS);
                cutBrickRecipes(ChiseledItems.CUT_DARK_PRISMARINE_BRICKS, ChiseledItems.POLISHED_DARK_PRISMARINE_SLAB, Items.DARK_PRISMARINE, ChiseledItems.POLISHED_DARK_PRISMARINE);
                stairRecipes(ChiseledItems.CUT_DARK_PRISMARINE_BRICK_STAIRS, ChiseledItems.CUT_DARK_PRISMARINE_BRICKS, Items.DARK_PRISMARINE, ChiseledItems.POLISHED_DARK_PRISMARINE, ChiseledItems.CUT_DARK_PRISMARINE_BRICKS);
                slabRecipes(ChiseledItems.CUT_DARK_PRISMARINE_BRICK_SLAB, ChiseledItems.CUT_DARK_PRISMARINE_BRICKS, Items.DARK_PRISMARINE, ChiseledItems.POLISHED_DARK_PRISMARINE, ChiseledItems.CUT_DARK_PRISMARINE_BRICKS);

                //red nether bricks

                smeltingResultFromBase(ChiseledItems.CRACKED_RED_NETHER_BRICKS, Items.RED_NETHER_BRICKS);
                shaped(RecipeCategory.BUILDING_BLOCKS, ChiseledItems.RED_NETHER_BRICK_FENCE, 6)
                        .pattern("#0#")
                        .pattern("#0#")
                        .define('#', Items.RED_NETHER_BRICKS)
                        .define('0', Items.NETHER_BRICK)
                        .unlockedBy(getHasName(Items.RED_NETHER_BRICKS), has(Items.RED_NETHER_BRICKS))
                        .save(output);
                pillarRecipes(ChiseledItems.CHISELED_RED_NETHER_BRICKS, Items.RED_NETHER_BRICK_SLAB, Items.RED_NETHER_BRICKS);

                //blackstone

                pillarRecipes(ChiseledItems.POLISHED_BLACKSTONE_PILLAR, Items.POLISHED_BLACKSTONE, Items.BLACKSTONE, Items.POLISHED_BLACKSTONE);
                cutBrickRecipes(ChiseledItems.CUT_POLISHED_BLACKSTONE_BRICKS, Items.POLISHED_BLACKSTONE_SLAB, Items.BLACKSTONE, Items.POLISHED_BLACKSTONE);
                smeltingResultFromBase(ChiseledItems.CRACKED_CUT_POLISHED_BLACKSTONE_BRICKS, ChiseledItems.CUT_POLISHED_BLACKSTONE_BRICKS);
                stairRecipes(ChiseledItems.CUT_POLISHED_BLACKSTONE_BRICK_STAIRS, ChiseledItems.CUT_POLISHED_BLACKSTONE_BRICKS, Items.BLACKSTONE, Items.POLISHED_BLACKSTONE, ChiseledItems.CUT_POLISHED_BLACKSTONE_BRICKS);
                slabRecipes(ChiseledItems.CUT_POLISHED_BLACKSTONE_BRICK_SLAB, ChiseledItems.CUT_POLISHED_BLACKSTONE_BRICKS, Items.BLACKSTONE, Items.POLISHED_BLACKSTONE, ChiseledItems.CUT_POLISHED_BLACKSTONE_BRICKS);
                brickRecipes(ChiseledItems.POLISHED_BLACKSTONE_TILES, Items.POLISHED_BLACKSTONE_BRICKS, Items.BLACKSTONE, Items.POLISHED_BLACKSTONE, Items.POLISHED_BLACKSTONE_BRICKS);
                smeltingResultFromBase(ChiseledItems.CRACKED_POLISHED_BLACKSTONE_TILES, ChiseledItems.POLISHED_BLACKSTONE_TILES);
                stairRecipes(ChiseledItems.POLISHED_BLACKSTONE_TILE_STAIRS, ChiseledItems.POLISHED_BLACKSTONE_TILES, Items.BLACKSTONE, Items.POLISHED_BLACKSTONE, Items.POLISHED_BLACKSTONE_BRICKS, ChiseledItems.POLISHED_BLACKSTONE_TILES);
                slabRecipes(ChiseledItems.POLISHED_BLACKSTONE_TILE_SLAB, ChiseledItems.POLISHED_BLACKSTONE_TILES, Items.BLACKSTONE, Items.POLISHED_BLACKSTONE, Items.POLISHED_BLACKSTONE_BRICKS, ChiseledItems.POLISHED_BLACKSTONE_TILES);
                wallRecipes(ChiseledItems.POLISHED_BLACKSTONE_TILE_WALL, ChiseledItems.POLISHED_BLACKSTONE_TILES, Items.BLACKSTONE, Items.POLISHED_BLACKSTONE, Items.POLISHED_BLACKSTONE_BRICKS, ChiseledItems.POLISHED_BLACKSTONE_TILES);

                //end stone

                stairRecipes(ChiseledItems.END_STONE_STAIRS, Items.END_STONE, Items.END_STONE);
                slabRecipes(ChiseledItems.END_STONE_SLAB, Items.END_STONE, Items.END_STONE);
                wallRecipes(ChiseledItems.END_STONE_WALL, Items.END_STONE, Items.END_STONE);
                brickRecipes(ChiseledItems.POLISHED_END_STONE, Items.END_STONE, Items.END_STONE);
                stairRecipes(ChiseledItems.POLISHED_END_STONE_STAIRS, ChiseledItems.POLISHED_END_STONE, Items.END_STONE, ChiseledItems.POLISHED_END_STONE);
                slabRecipes(ChiseledItems.POLISHED_END_STONE_SLAB, ChiseledItems.POLISHED_END_STONE, Items.END_STONE, ChiseledItems.POLISHED_END_STONE);
                wallRecipes(ChiseledItems.POLISHED_END_STONE_WALL, ChiseledItems.POLISHED_END_STONE, Items.END_STONE, ChiseledItems.POLISHED_END_STONE);
                pillarRecipes(ChiseledItems.END_STONE_PILLAR, ChiseledItems.POLISHED_END_STONE, Items.END_STONE, ChiseledItems.POLISHED_END_STONE);
                brickRecipes(Items.END_STONE_BRICKS, ChiseledItems.POLISHED_END_STONE, ChiseledItems.POLISHED_END_STONE);
                stonecuttingRecipes(Items.END_STONE_BRICK_STAIRS, ChiseledItems.POLISHED_END_STONE);
                stonecuttingRecipes(2, Items.END_STONE_BRICK_SLAB, ChiseledItems.POLISHED_END_STONE);
                stonecuttingRecipes(Items.END_STONE_BRICK_WALL, ChiseledItems.POLISHED_END_STONE);
                smeltingResultFromBase(ChiseledItems.CRACKED_END_STONE_BRICKS, Items.END_STONE_BRICKS);
                cutBrickRecipes(ChiseledItems.CUT_END_STONE_BRICKS, ChiseledItems.POLISHED_END_STONE_SLAB, Items.END_STONE, ChiseledItems.POLISHED_END_STONE);
                smeltingResultFromBase(ChiseledItems.CRACKED_CUT_END_STONE_BRICKS, ChiseledItems.CUT_END_STONE_BRICKS);
                stairRecipes(ChiseledItems.CUT_END_STONE_BRICK_STAIRS, ChiseledItems.CUT_END_STONE_BRICKS, Items.END_STONE, ChiseledItems.POLISHED_END_STONE, ChiseledItems.CUT_END_STONE_BRICKS);
                slabRecipes(ChiseledItems.CUT_END_STONE_BRICK_SLAB, ChiseledItems.CUT_END_STONE_BRICKS, Items.END_STONE, ChiseledItems.POLISHED_END_STONE, ChiseledItems.CUT_END_STONE_BRICKS);
                brickRecipes(ChiseledItems.END_STONE_TILES, Items.END_STONE_BRICKS, Items.END_STONE, ChiseledItems.POLISHED_END_STONE, Items.END_STONE_BRICKS);
                smeltingResultFromBase(ChiseledItems.CRACKED_END_STONE_TILES, ChiseledItems.END_STONE_TILES);
                stairRecipes(ChiseledItems.END_STONE_TILE_STAIRS, ChiseledItems.END_STONE_TILES, Items.END_STONE, ChiseledItems.POLISHED_END_STONE, Items.END_STONE_BRICKS, ChiseledItems.END_STONE_TILES);
                slabRecipes(ChiseledItems.END_STONE_TILE_SLAB, ChiseledItems.END_STONE_TILES, Items.END_STONE, ChiseledItems.POLISHED_END_STONE, Items.END_STONE_BRICKS, ChiseledItems.END_STONE_TILES);
                wallRecipes(ChiseledItems.END_STONE_TILE_WALL, ChiseledItems.END_STONE_TILES, Items.END_STONE, ChiseledItems.POLISHED_END_STONE, Items.END_STONE_BRICKS, ChiseledItems.END_STONE_TILES);

                //quartz

                wallRecipes(ChiseledItems.QUARTZ_WALL, Items.QUARTZ_BLOCK, Items.QUARTZ_BLOCK);
                wallRecipes(ChiseledItems.SMOOTH_QUARTZ_WALL, Items.SMOOTH_QUARTZ, Items.SMOOTH_QUARTZ);
                stairRecipes(ChiseledItems.QUARTZ_BRICK_STAIRS, Items.QUARTZ_BRICKS, Items.SMOOTH_QUARTZ, Items.QUARTZ_BRICKS);
                slabRecipes(ChiseledItems.QUARTZ_BRICK_SLAB, Items.QUARTZ_BRICKS, Items.SMOOTH_QUARTZ, Items.QUARTZ_BRICKS);
                wallRecipes(ChiseledItems.QUARTZ_BRICK_WALL, Items.QUARTZ_BRICKS, Items.SMOOTH_QUARTZ, Items.QUARTZ_BRICKS);
                cutBrickRecipes(ChiseledItems.CUT_QUARTZ_BRICKS, Items.SMOOTH_QUARTZ_SLAB, Items.SMOOTH_QUARTZ);
                stairRecipes(ChiseledItems.CUT_QUARTZ_BRICK_STAIRS, ChiseledItems.CUT_QUARTZ_BRICKS, Items.SMOOTH_QUARTZ, ChiseledItems.CUT_QUARTZ_BRICKS);
                slabRecipes(ChiseledItems.CUT_QUARTZ_BRICK_SLAB, ChiseledItems.CUT_QUARTZ_BRICKS, Items.SMOOTH_QUARTZ, ChiseledItems.CUT_QUARTZ_BRICKS);
                brickRecipes(ChiseledItems.QUARTZ_TILES, Items.QUARTZ_BRICKS, Items.SMOOTH_QUARTZ, Items.QUARTZ_BRICKS);
                stairRecipes(ChiseledItems.QUARTZ_TILE_STAIRS, ChiseledItems.QUARTZ_TILES, Items.SMOOTH_QUARTZ, Items.QUARTZ_BRICKS, ChiseledItems.QUARTZ_TILES);
                slabRecipes(ChiseledItems.QUARTZ_TILE_SLAB, ChiseledItems.QUARTZ_TILES, Items.SMOOTH_QUARTZ, Items.QUARTZ_BRICKS, ChiseledItems.QUARTZ_TILES);
                wallRecipes(ChiseledItems.QUARTZ_TILE_WALL, ChiseledItems.QUARTZ_TILES, Items.SMOOTH_QUARTZ, Items.QUARTZ_BRICKS, ChiseledItems.QUARTZ_TILES);

                //terracotta

                stairRecipes(ChiseledItems.TERRACOTTA_STAIRS, Items.TERRACOTTA, Items.TERRACOTTA);
                slabRecipes(ChiseledItems.TERRACOTTA_SLAB, Items.TERRACOTTA, Items.TERRACOTTA);
                wallRecipes(ChiseledItems.TERRACOTTA_WALL, Items.TERRACOTTA, Items.TERRACOTTA);
                brickRecipes(ChiseledItems.TERRACOTTA_BRICKS, Items.TERRACOTTA, Items.TERRACOTTA);
                stairRecipes(ChiseledItems.TERRACOTTA_BRICK_STAIRS, ChiseledItems.TERRACOTTA_BRICKS, Items.TERRACOTTA, ChiseledItems.TERRACOTTA_BRICKS);
                slabRecipes(ChiseledItems.TERRACOTTA_BRICK_SLAB, ChiseledItems.TERRACOTTA_BRICKS, Items.TERRACOTTA, ChiseledItems.TERRACOTTA_BRICKS);
                wallRecipes(ChiseledItems.TERRACOTTA_BRICK_WALL, ChiseledItems.TERRACOTTA_BRICKS, Items.TERRACOTTA, ChiseledItems.TERRACOTTA_BRICKS);
                wallRecipes(ChiseledItems.WHITE_CONCRETE_WALL, Items.CONCRETE.white(), Items.CONCRETE.white());
                stairRecipes(ChiseledItems.WHITE_TERRACOTTA_STAIRS, Items.DYED_TERRACOTTA.white(), Items.DYED_TERRACOTTA.white());
                slabRecipes(ChiseledItems.WHITE_TERRACOTTA_SLAB, Items.DYED_TERRACOTTA.white(), Items.DYED_TERRACOTTA.white());
                wallRecipes(ChiseledItems.WHITE_TERRACOTTA_WALL, Items.DYED_TERRACOTTA.white(), Items.DYED_TERRACOTTA.white());
                dyedTerracottaBricks(ChiseledItems.WHITE_TERRACOTTA_BRICKS, Items.DYED_TERRACOTTA.white(), Items.DYE.white());
                stairRecipes(ChiseledItems.WHITE_TERRACOTTA_BRICK_STAIRS, ChiseledItems.WHITE_TERRACOTTA_BRICKS, Items.DYED_TERRACOTTA.white(), ChiseledItems.WHITE_TERRACOTTA_BRICKS);
                slabRecipes(ChiseledItems.WHITE_TERRACOTTA_BRICK_SLAB, ChiseledItems.WHITE_TERRACOTTA_BRICKS, Items.DYED_TERRACOTTA.white(), ChiseledItems.WHITE_TERRACOTTA_BRICKS);
                wallRecipes(ChiseledItems.WHITE_TERRACOTTA_BRICK_WALL, ChiseledItems.WHITE_TERRACOTTA_BRICKS, Items.DYED_TERRACOTTA.white(), ChiseledItems.WHITE_TERRACOTTA_BRICKS);
                wallRecipes(ChiseledItems.LIGHT_GRAY_CONCRETE_WALL, Items.CONCRETE.lightGray(), Items.CONCRETE.lightGray());
                stairRecipes(ChiseledItems.LIGHT_GRAY_TERRACOTTA_STAIRS, Items.DYED_TERRACOTTA.lightGray(), Items.DYED_TERRACOTTA.lightGray());
                slabRecipes(ChiseledItems.LIGHT_GRAY_TERRACOTTA_SLAB, Items.DYED_TERRACOTTA.lightGray(), Items.DYED_TERRACOTTA.lightGray());
                wallRecipes(ChiseledItems.LIGHT_GRAY_TERRACOTTA_WALL, Items.DYED_TERRACOTTA.lightGray(), Items.DYED_TERRACOTTA.lightGray());
                dyedTerracottaBricks(ChiseledItems.LIGHT_GRAY_TERRACOTTA_BRICKS, Items.DYED_TERRACOTTA.lightGray(), Items.DYE.lightGray());
                stairRecipes(ChiseledItems.LIGHT_GRAY_TERRACOTTA_BRICK_STAIRS, ChiseledItems.LIGHT_GRAY_TERRACOTTA_BRICKS, Items.DYED_TERRACOTTA.lightGray(), ChiseledItems.LIGHT_GRAY_TERRACOTTA_BRICKS);
                slabRecipes(ChiseledItems.LIGHT_GRAY_TERRACOTTA_BRICK_SLAB, ChiseledItems.LIGHT_GRAY_TERRACOTTA_BRICKS, Items.DYED_TERRACOTTA.lightGray(), ChiseledItems.LIGHT_GRAY_TERRACOTTA_BRICKS);
                wallRecipes(ChiseledItems.LIGHT_GRAY_TERRACOTTA_BRICK_WALL, ChiseledItems.LIGHT_GRAY_TERRACOTTA_BRICKS, Items.DYED_TERRACOTTA.lightGray(), ChiseledItems.LIGHT_GRAY_TERRACOTTA_BRICKS);
                wallRecipes(ChiseledItems.GRAY_CONCRETE_WALL, Items.CONCRETE.gray(), Items.CONCRETE.gray());
                stairRecipes(ChiseledItems.GRAY_TERRACOTTA_STAIRS, Items.DYED_TERRACOTTA.gray(), Items.DYED_TERRACOTTA.gray());
                slabRecipes(ChiseledItems.GRAY_TERRACOTTA_SLAB, Items.DYED_TERRACOTTA.gray(), Items.DYED_TERRACOTTA.gray());
                wallRecipes(ChiseledItems.GRAY_TERRACOTTA_WALL, Items.DYED_TERRACOTTA.gray(), Items.DYED_TERRACOTTA.gray());
                dyedTerracottaBricks(ChiseledItems.GRAY_TERRACOTTA_BRICKS, Items.DYED_TERRACOTTA.gray(), Items.DYE.gray());
                stairRecipes(ChiseledItems.GRAY_TERRACOTTA_BRICK_STAIRS, ChiseledItems.GRAY_TERRACOTTA_BRICKS, Items.DYED_TERRACOTTA.gray(), ChiseledItems.GRAY_TERRACOTTA_BRICKS);
                slabRecipes(ChiseledItems.GRAY_TERRACOTTA_BRICK_SLAB, ChiseledItems.GRAY_TERRACOTTA_BRICKS, Items.DYED_TERRACOTTA.gray(), ChiseledItems.GRAY_TERRACOTTA_BRICKS);
                wallRecipes(ChiseledItems.GRAY_TERRACOTTA_BRICK_WALL, ChiseledItems.GRAY_TERRACOTTA_BRICKS, Items.DYED_TERRACOTTA.gray(), ChiseledItems.GRAY_TERRACOTTA_BRICKS);
                wallRecipes(ChiseledItems.BLACK_CONCRETE_WALL, Items.CONCRETE.black(), Items.CONCRETE.black());
                stairRecipes(ChiseledItems.BLACK_TERRACOTTA_STAIRS, Items.DYED_TERRACOTTA.black(), Items.DYED_TERRACOTTA.black());
                slabRecipes(ChiseledItems.BLACK_TERRACOTTA_SLAB, Items.DYED_TERRACOTTA.black(), Items.DYED_TERRACOTTA.black());
                wallRecipes(ChiseledItems.BLACK_TERRACOTTA_WALL, Items.DYED_TERRACOTTA.black(), Items.DYED_TERRACOTTA.black());
                dyedTerracottaBricks(ChiseledItems.BLACK_TERRACOTTA_BRICKS, Items.DYED_TERRACOTTA.black(), Items.DYE.black());
                stairRecipes(ChiseledItems.BLACK_TERRACOTTA_BRICK_STAIRS, ChiseledItems.BLACK_TERRACOTTA_BRICKS, Items.DYED_TERRACOTTA.black(), ChiseledItems.BLACK_TERRACOTTA_BRICKS);
                slabRecipes(ChiseledItems.BLACK_TERRACOTTA_BRICK_SLAB, ChiseledItems.BLACK_TERRACOTTA_BRICKS, Items.DYED_TERRACOTTA.black(), ChiseledItems.BLACK_TERRACOTTA_BRICKS);
                wallRecipes(ChiseledItems.BLACK_TERRACOTTA_BRICK_WALL, ChiseledItems.BLACK_TERRACOTTA_BRICKS, Items.DYED_TERRACOTTA.black(), ChiseledItems.BLACK_TERRACOTTA_BRICKS);
                wallRecipes(ChiseledItems.BROWN_CONCRETE_WALL, Items.CONCRETE.brown(), Items.CONCRETE.brown());
                stairRecipes(ChiseledItems.BROWN_TERRACOTTA_STAIRS, Items.DYED_TERRACOTTA.brown(), Items.DYED_TERRACOTTA.brown());
                slabRecipes(ChiseledItems.BROWN_TERRACOTTA_SLAB, Items.DYED_TERRACOTTA.brown(), Items.DYED_TERRACOTTA.brown());
                wallRecipes(ChiseledItems.BROWN_TERRACOTTA_WALL, Items.DYED_TERRACOTTA.brown(), Items.DYED_TERRACOTTA.brown());
                dyedTerracottaBricks(ChiseledItems.BROWN_TERRACOTTA_BRICKS, Items.DYED_TERRACOTTA.brown(), Items.DYE.brown());
                stairRecipes(ChiseledItems.BROWN_TERRACOTTA_BRICK_STAIRS, ChiseledItems.BROWN_TERRACOTTA_BRICKS, Items.DYED_TERRACOTTA.brown(), ChiseledItems.BROWN_TERRACOTTA_BRICKS);
                slabRecipes(ChiseledItems.BROWN_TERRACOTTA_BRICK_SLAB, ChiseledItems.BROWN_TERRACOTTA_BRICKS, Items.DYED_TERRACOTTA.brown(), ChiseledItems.BROWN_TERRACOTTA_BRICKS);
                wallRecipes(ChiseledItems.BROWN_TERRACOTTA_BRICK_WALL, ChiseledItems.BROWN_TERRACOTTA_BRICKS, Items.DYED_TERRACOTTA.brown(), ChiseledItems.BROWN_TERRACOTTA_BRICKS);
                wallRecipes(ChiseledItems.RED_CONCRETE_WALL, Items.CONCRETE.red(), Items.CONCRETE.red());
                stairRecipes(ChiseledItems.RED_TERRACOTTA_STAIRS, Items.DYED_TERRACOTTA.red(), Items.DYED_TERRACOTTA.red());
                slabRecipes(ChiseledItems.RED_TERRACOTTA_SLAB, Items.DYED_TERRACOTTA.red(), Items.DYED_TERRACOTTA.red());
                wallRecipes(ChiseledItems.RED_TERRACOTTA_WALL, Items.DYED_TERRACOTTA.red(), Items.DYED_TERRACOTTA.red());
                dyedTerracottaBricks(ChiseledItems.RED_TERRACOTTA_BRICKS, Items.DYED_TERRACOTTA.red(), Items.DYE.red());
                stairRecipes(ChiseledItems.RED_TERRACOTTA_BRICK_STAIRS, ChiseledItems.RED_TERRACOTTA_BRICKS, Items.DYED_TERRACOTTA.red(), ChiseledItems.RED_TERRACOTTA_BRICKS);
                slabRecipes(ChiseledItems.RED_TERRACOTTA_BRICK_SLAB, ChiseledItems.RED_TERRACOTTA_BRICKS, Items.DYED_TERRACOTTA.red(), ChiseledItems.RED_TERRACOTTA_BRICKS);
                wallRecipes(ChiseledItems.RED_TERRACOTTA_BRICK_WALL, ChiseledItems.RED_TERRACOTTA_BRICKS, Items.DYED_TERRACOTTA.red(), ChiseledItems.RED_TERRACOTTA_BRICKS);
                wallRecipes(ChiseledItems.ORANGE_CONCRETE_WALL, Items.CONCRETE.orange(), Items.CONCRETE.orange());
                stairRecipes(ChiseledItems.ORANGE_TERRACOTTA_STAIRS, Items.DYED_TERRACOTTA.orange(), Items.DYED_TERRACOTTA.orange());
                slabRecipes(ChiseledItems.ORANGE_TERRACOTTA_SLAB, Items.DYED_TERRACOTTA.orange(), Items.DYED_TERRACOTTA.orange());
                wallRecipes(ChiseledItems.ORANGE_TERRACOTTA_WALL, Items.DYED_TERRACOTTA.orange(), Items.DYED_TERRACOTTA.orange());
                dyedTerracottaBricks(ChiseledItems.ORANGE_TERRACOTTA_BRICKS, Items.DYED_TERRACOTTA.orange(), Items.DYE.orange());
                stairRecipes(ChiseledItems.ORANGE_TERRACOTTA_BRICK_STAIRS, ChiseledItems.ORANGE_TERRACOTTA_BRICKS, Items.DYED_TERRACOTTA.orange(), ChiseledItems.ORANGE_TERRACOTTA_BRICKS);
                slabRecipes(ChiseledItems.ORANGE_TERRACOTTA_BRICK_SLAB, ChiseledItems.ORANGE_TERRACOTTA_BRICKS, Items.DYED_TERRACOTTA.orange(), ChiseledItems.ORANGE_TERRACOTTA_BRICKS);
                wallRecipes(ChiseledItems.ORANGE_TERRACOTTA_BRICK_WALL, ChiseledItems.ORANGE_TERRACOTTA_BRICKS, Items.DYED_TERRACOTTA.orange(), ChiseledItems.ORANGE_TERRACOTTA_BRICKS);
                wallRecipes(ChiseledItems.YELLOW_CONCRETE_WALL, Items.CONCRETE.yellow(), Items.CONCRETE.yellow());
                stairRecipes(ChiseledItems.YELLOW_TERRACOTTA_STAIRS, Items.DYED_TERRACOTTA.yellow(), Items.DYED_TERRACOTTA.yellow());
                slabRecipes(ChiseledItems.YELLOW_TERRACOTTA_SLAB, Items.DYED_TERRACOTTA.yellow(), Items.DYED_TERRACOTTA.yellow());
                wallRecipes(ChiseledItems.YELLOW_TERRACOTTA_WALL, Items.DYED_TERRACOTTA.yellow(), Items.DYED_TERRACOTTA.yellow());
                dyedTerracottaBricks(ChiseledItems.YELLOW_TERRACOTTA_BRICKS, Items.DYED_TERRACOTTA.yellow(), Items.DYE.yellow());
                stairRecipes(ChiseledItems.YELLOW_TERRACOTTA_BRICK_STAIRS, ChiseledItems.YELLOW_TERRACOTTA_BRICKS, Items.DYED_TERRACOTTA.yellow(), ChiseledItems.YELLOW_TERRACOTTA_BRICKS);
                slabRecipes(ChiseledItems.YELLOW_TERRACOTTA_BRICK_SLAB, ChiseledItems.YELLOW_TERRACOTTA_BRICKS, Items.DYED_TERRACOTTA.yellow(), ChiseledItems.YELLOW_TERRACOTTA_BRICKS);
                wallRecipes(ChiseledItems.YELLOW_TERRACOTTA_BRICK_WALL, ChiseledItems.YELLOW_TERRACOTTA_BRICKS, Items.DYED_TERRACOTTA.yellow(), ChiseledItems.YELLOW_TERRACOTTA_BRICKS);
                wallRecipes(ChiseledItems.LIME_CONCRETE_WALL, Items.CONCRETE.lime(), Items.CONCRETE.lime());
                stairRecipes(ChiseledItems.LIME_TERRACOTTA_STAIRS, Items.DYED_TERRACOTTA.lime(), Items.DYED_TERRACOTTA.lime());
                slabRecipes(ChiseledItems.LIME_TERRACOTTA_SLAB, Items.DYED_TERRACOTTA.lime(), Items.DYED_TERRACOTTA.lime());
                wallRecipes(ChiseledItems.LIME_TERRACOTTA_WALL, Items.DYED_TERRACOTTA.lime(), Items.DYED_TERRACOTTA.lime());
                dyedTerracottaBricks(ChiseledItems.LIME_TERRACOTTA_BRICKS, Items.DYED_TERRACOTTA.lime(), Items.DYE.lime());
                stairRecipes(ChiseledItems.LIME_TERRACOTTA_BRICK_STAIRS, ChiseledItems.LIME_TERRACOTTA_BRICKS, Items.DYED_TERRACOTTA.lime(), ChiseledItems.LIME_TERRACOTTA_BRICKS);
                slabRecipes(ChiseledItems.LIME_TERRACOTTA_BRICK_SLAB, ChiseledItems.LIME_TERRACOTTA_BRICKS, Items.DYED_TERRACOTTA.lime(), ChiseledItems.LIME_TERRACOTTA_BRICKS);
                wallRecipes(ChiseledItems.LIME_TERRACOTTA_BRICK_WALL, ChiseledItems.LIME_TERRACOTTA_BRICKS, Items.DYED_TERRACOTTA.lime(), ChiseledItems.LIME_TERRACOTTA_BRICKS);
                wallRecipes(ChiseledItems.GREEN_CONCRETE_WALL, Items.CONCRETE.green(), Items.CONCRETE.green());
                stairRecipes(ChiseledItems.GREEN_TERRACOTTA_STAIRS, Items.DYED_TERRACOTTA.green(), Items.DYED_TERRACOTTA.green());
                slabRecipes(ChiseledItems.GREEN_TERRACOTTA_SLAB, Items.DYED_TERRACOTTA.green(), Items.DYED_TERRACOTTA.green());
                wallRecipes(ChiseledItems.GREEN_TERRACOTTA_WALL, Items.DYED_TERRACOTTA.green(), Items.DYED_TERRACOTTA.green());
                dyedTerracottaBricks(ChiseledItems.GREEN_TERRACOTTA_BRICKS, Items.DYED_TERRACOTTA.green(), Items.DYE.green());
                stairRecipes(ChiseledItems.GREEN_TERRACOTTA_BRICK_STAIRS, ChiseledItems.GREEN_TERRACOTTA_BRICKS, Items.DYED_TERRACOTTA.green(), ChiseledItems.GREEN_TERRACOTTA_BRICKS);
                slabRecipes(ChiseledItems.GREEN_TERRACOTTA_BRICK_SLAB, ChiseledItems.GREEN_TERRACOTTA_BRICKS, Items.DYED_TERRACOTTA.green(), ChiseledItems.GREEN_TERRACOTTA_BRICKS);
                wallRecipes(ChiseledItems.GREEN_TERRACOTTA_BRICK_WALL, ChiseledItems.GREEN_TERRACOTTA_BRICKS, Items.DYED_TERRACOTTA.green(), ChiseledItems.GREEN_TERRACOTTA_BRICKS);
                wallRecipes(ChiseledItems.CYAN_CONCRETE_WALL, Items.CONCRETE.cyan(), Items.CONCRETE.cyan());
                stairRecipes(ChiseledItems.CYAN_TERRACOTTA_STAIRS, Items.DYED_TERRACOTTA.cyan(), Items.DYED_TERRACOTTA.cyan());
                slabRecipes(ChiseledItems.CYAN_TERRACOTTA_SLAB, Items.DYED_TERRACOTTA.cyan(), Items.DYED_TERRACOTTA.cyan());
                wallRecipes(ChiseledItems.CYAN_TERRACOTTA_WALL, Items.DYED_TERRACOTTA.cyan(), Items.DYED_TERRACOTTA.cyan());
                dyedTerracottaBricks(ChiseledItems.CYAN_TERRACOTTA_BRICKS, Items.DYED_TERRACOTTA.cyan(), Items.DYE.cyan());
                stairRecipes(ChiseledItems.CYAN_TERRACOTTA_BRICK_STAIRS, ChiseledItems.CYAN_TERRACOTTA_BRICKS, Items.DYED_TERRACOTTA.cyan(), ChiseledItems.CYAN_TERRACOTTA_BRICKS);
                slabRecipes(ChiseledItems.CYAN_TERRACOTTA_BRICK_SLAB, ChiseledItems.CYAN_TERRACOTTA_BRICKS, Items.DYED_TERRACOTTA.cyan(), ChiseledItems.CYAN_TERRACOTTA_BRICKS);
                wallRecipes(ChiseledItems.CYAN_TERRACOTTA_BRICK_WALL, ChiseledItems.CYAN_TERRACOTTA_BRICKS, Items.DYED_TERRACOTTA.cyan(), ChiseledItems.CYAN_TERRACOTTA_BRICKS);
                wallRecipes(ChiseledItems.LIGHT_BLUE_CONCRETE_WALL, Items.CONCRETE.lightBlue(), Items.CONCRETE.lightBlue());
                stairRecipes(ChiseledItems.LIGHT_BLUE_TERRACOTTA_STAIRS, Items.DYED_TERRACOTTA.lightBlue(), Items.DYED_TERRACOTTA.lightBlue());
                slabRecipes(ChiseledItems.LIGHT_BLUE_TERRACOTTA_SLAB, Items.DYED_TERRACOTTA.lightBlue(), Items.DYED_TERRACOTTA.lightBlue());
                wallRecipes(ChiseledItems.LIGHT_BLUE_TERRACOTTA_WALL, Items.DYED_TERRACOTTA.lightBlue(), Items.DYED_TERRACOTTA.lightBlue());
                dyedTerracottaBricks(ChiseledItems.LIGHT_BLUE_TERRACOTTA_BRICKS, Items.DYED_TERRACOTTA.lightBlue(), Items.DYE.lightBlue());
                stairRecipes(ChiseledItems.LIGHT_BLUE_TERRACOTTA_BRICK_STAIRS, ChiseledItems.LIGHT_BLUE_TERRACOTTA_BRICKS, Items.DYED_TERRACOTTA.lightBlue(), ChiseledItems.LIGHT_BLUE_TERRACOTTA_BRICKS);
                slabRecipes(ChiseledItems.LIGHT_BLUE_TERRACOTTA_BRICK_SLAB, ChiseledItems.LIGHT_BLUE_TERRACOTTA_BRICKS, Items.DYED_TERRACOTTA.lightBlue(), ChiseledItems.LIGHT_BLUE_TERRACOTTA_BRICKS);
                wallRecipes(ChiseledItems.LIGHT_BLUE_TERRACOTTA_BRICK_WALL, ChiseledItems.LIGHT_BLUE_TERRACOTTA_BRICKS, Items.DYED_TERRACOTTA.lightBlue(), ChiseledItems.LIGHT_BLUE_TERRACOTTA_BRICKS);
                wallRecipes(ChiseledItems.BLUE_CONCRETE_WALL, Items.CONCRETE.blue(), Items.CONCRETE.blue());
                stairRecipes(ChiseledItems.BLUE_TERRACOTTA_STAIRS, Items.DYED_TERRACOTTA.blue(), Items.DYED_TERRACOTTA.blue());
                slabRecipes(ChiseledItems.BLUE_TERRACOTTA_SLAB, Items.DYED_TERRACOTTA.blue(), Items.DYED_TERRACOTTA.blue());
                wallRecipes(ChiseledItems.BLUE_TERRACOTTA_WALL, Items.DYED_TERRACOTTA.blue(), Items.DYED_TERRACOTTA.blue());
                dyedTerracottaBricks(ChiseledItems.BLUE_TERRACOTTA_BRICKS, Items.DYED_TERRACOTTA.blue(), Items.DYE.blue());
                stairRecipes(ChiseledItems.BLUE_TERRACOTTA_BRICK_STAIRS, ChiseledItems.BLUE_TERRACOTTA_BRICKS, Items.DYED_TERRACOTTA.blue(), ChiseledItems.BLUE_TERRACOTTA_BRICKS);
                slabRecipes(ChiseledItems.BLUE_TERRACOTTA_BRICK_SLAB, ChiseledItems.BLUE_TERRACOTTA_BRICKS, Items.DYED_TERRACOTTA.blue(), ChiseledItems.BLUE_TERRACOTTA_BRICKS);
                wallRecipes(ChiseledItems.BLUE_TERRACOTTA_BRICK_WALL, ChiseledItems.BLUE_TERRACOTTA_BRICKS, Items.DYED_TERRACOTTA.blue(), ChiseledItems.BLUE_TERRACOTTA_BRICKS);
                wallRecipes(ChiseledItems.PURPLE_CONCRETE_WALL, Items.CONCRETE.purple(), Items.CONCRETE.purple());
                stairRecipes(ChiseledItems.PURPLE_TERRACOTTA_STAIRS, Items.DYED_TERRACOTTA.purple(), Items.DYED_TERRACOTTA.purple());
                slabRecipes(ChiseledItems.PURPLE_TERRACOTTA_SLAB, Items.DYED_TERRACOTTA.purple(), Items.DYED_TERRACOTTA.purple());
                wallRecipes(ChiseledItems.PURPLE_TERRACOTTA_WALL, Items.DYED_TERRACOTTA.purple(), Items.DYED_TERRACOTTA.purple());
                dyedTerracottaBricks(ChiseledItems.PURPLE_TERRACOTTA_BRICKS, Items.DYED_TERRACOTTA.purple(), Items.DYE.purple());
                stairRecipes(ChiseledItems.PURPLE_TERRACOTTA_BRICK_STAIRS, ChiseledItems.PURPLE_TERRACOTTA_BRICKS, Items.DYED_TERRACOTTA.purple(), ChiseledItems.PURPLE_TERRACOTTA_BRICKS);
                slabRecipes(ChiseledItems.PURPLE_TERRACOTTA_BRICK_SLAB, ChiseledItems.PURPLE_TERRACOTTA_BRICKS, Items.DYED_TERRACOTTA.purple(), ChiseledItems.PURPLE_TERRACOTTA_BRICKS);
                wallRecipes(ChiseledItems.PURPLE_TERRACOTTA_BRICK_WALL, ChiseledItems.PURPLE_TERRACOTTA_BRICKS, Items.DYED_TERRACOTTA.purple(), ChiseledItems.PURPLE_TERRACOTTA_BRICKS);
                wallRecipes(ChiseledItems.MAGENTA_CONCRETE_WALL, Items.CONCRETE.magenta(), Items.CONCRETE.magenta());
                stairRecipes(ChiseledItems.MAGENTA_TERRACOTTA_STAIRS, Items.DYED_TERRACOTTA.magenta(), Items.DYED_TERRACOTTA.magenta());
                slabRecipes(ChiseledItems.MAGENTA_TERRACOTTA_SLAB, Items.DYED_TERRACOTTA.magenta(), Items.DYED_TERRACOTTA.magenta());
                wallRecipes(ChiseledItems.MAGENTA_TERRACOTTA_WALL, Items.DYED_TERRACOTTA.magenta(), Items.DYED_TERRACOTTA.magenta());
                dyedTerracottaBricks(ChiseledItems.MAGENTA_TERRACOTTA_BRICKS, Items.DYED_TERRACOTTA.magenta(), Items.DYE.magenta());
                stairRecipes(ChiseledItems.MAGENTA_TERRACOTTA_BRICK_STAIRS, ChiseledItems.MAGENTA_TERRACOTTA_BRICKS, Items.DYED_TERRACOTTA.magenta(), ChiseledItems.MAGENTA_TERRACOTTA_BRICKS);
                slabRecipes(ChiseledItems.MAGENTA_TERRACOTTA_BRICK_SLAB, ChiseledItems.MAGENTA_TERRACOTTA_BRICKS, Items.DYED_TERRACOTTA.magenta(), ChiseledItems.MAGENTA_TERRACOTTA_BRICKS);
                wallRecipes(ChiseledItems.MAGENTA_TERRACOTTA_BRICK_WALL, ChiseledItems.MAGENTA_TERRACOTTA_BRICKS, Items.DYED_TERRACOTTA.magenta(), ChiseledItems.MAGENTA_TERRACOTTA_BRICKS);
                wallRecipes(ChiseledItems.PINK_CONCRETE_WALL, Items.CONCRETE.pink(), Items.CONCRETE.pink());
                stairRecipes(ChiseledItems.PINK_TERRACOTTA_STAIRS, Items.DYED_TERRACOTTA.pink(), Items.DYED_TERRACOTTA.pink());
                slabRecipes(ChiseledItems.PINK_TERRACOTTA_SLAB, Items.DYED_TERRACOTTA.pink(), Items.DYED_TERRACOTTA.pink());
                wallRecipes(ChiseledItems.PINK_TERRACOTTA_WALL, Items.DYED_TERRACOTTA.pink(), Items.DYED_TERRACOTTA.pink());
                dyedTerracottaBricks(ChiseledItems.PINK_TERRACOTTA_BRICKS, Items.DYED_TERRACOTTA.pink(), Items.DYE.pink());
                stairRecipes(ChiseledItems.PINK_TERRACOTTA_BRICK_STAIRS, ChiseledItems.PINK_TERRACOTTA_BRICKS, Items.DYED_TERRACOTTA.pink(), ChiseledItems.PINK_TERRACOTTA_BRICKS);
                slabRecipes(ChiseledItems.PINK_TERRACOTTA_BRICK_SLAB, ChiseledItems.PINK_TERRACOTTA_BRICKS, Items.DYED_TERRACOTTA.pink(), ChiseledItems.PINK_TERRACOTTA_BRICKS);
                wallRecipes(ChiseledItems.PINK_TERRACOTTA_BRICK_WALL, ChiseledItems.PINK_TERRACOTTA_BRICKS, Items.DYED_TERRACOTTA.pink(), ChiseledItems.PINK_TERRACOTTA_BRICKS);
            }
        };
    }
    @Override
    public @NonNull String getName() {
        return "RecipeGen";
    }
}
