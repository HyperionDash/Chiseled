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

                shaped(RecipeCategory.MISC, ChiseledBlocks.OAK_TRIM, 2)
                        .pattern(" # ")
                        .pattern(" 0 ")
                        .pattern(" # ")
                        .define('#', Blocks.OAK_SLAB)
                        .define('0', Blocks.OAK_PLANKS)
                        .unlockedBy(getHasName(ChiseledBlocks.OAK_TRIM), has(ChiseledBlocks.OAK_TRIM))
                        .save(output);
                shaped(RecipeCategory.MISC, ChiseledBlocks.VERTICAL_OAK_PLANKS, 3)
                        .pattern(" # ")
                        .pattern(" # ")
                        .pattern(" # ")
                        .define('#', Blocks.OAK_PLANKS)
                        .unlockedBy(getHasName(ChiseledBlocks.VERTICAL_OAK_PLANKS), has(ChiseledBlocks.VERTICAL_OAK_PLANKS))
                        .save(output);
                shaped(RecipeCategory.MISC, ChiseledBlocks.VERTICAL_OAK_STAIRS, 4)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .define('#', ChiseledBlocks.VERTICAL_OAK_PLANKS)
                        .unlockedBy(getHasName(ChiseledBlocks.VERTICAL_OAK_STAIRS), has(ChiseledBlocks.VERTICAL_OAK_STAIRS))
                        .save(output);
                shaped(RecipeCategory.MISC, ChiseledBlocks.VERTICAL_OAK_SLAB, 6)
                        .pattern("   ")
                        .pattern("###")
                        .pattern("   ")
                        .define('#', ChiseledBlocks.VERTICAL_OAK_PLANKS)
                        .unlockedBy(getHasName(ChiseledBlocks.VERTICAL_OAK_SLAB), has(ChiseledBlocks.VERTICAL_OAK_SLAB))
                        .save(output);
                shaped(RecipeCategory.MISC, ChiseledBlocks.SPRUCE_TRIM, 2)
                        .pattern(" # ")
                        .pattern(" 0 ")
                        .pattern(" # ")
                        .define('#', Blocks.SPRUCE_SLAB)
                        .define('0', Blocks.SPRUCE_PLANKS)
                        .unlockedBy(getHasName(ChiseledBlocks.SPRUCE_TRIM), has(ChiseledBlocks.SPRUCE_TRIM))
                        .save(output);
                shaped(RecipeCategory.MISC, ChiseledBlocks.VERTICAL_SPRUCE_PLANKS, 3)
                        .pattern(" # ")
                        .pattern(" # ")
                        .pattern(" # ")
                        .define('#', Blocks.SPRUCE_PLANKS)
                        .unlockedBy(getHasName(ChiseledBlocks.VERTICAL_SPRUCE_PLANKS), has(ChiseledBlocks.VERTICAL_SPRUCE_PLANKS))
                        .save(output);
                shaped(RecipeCategory.MISC, ChiseledBlocks.VERTICAL_SPRUCE_STAIRS, 4)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .define('#', ChiseledBlocks.VERTICAL_SPRUCE_PLANKS)
                        .unlockedBy(getHasName(ChiseledBlocks.VERTICAL_SPRUCE_STAIRS), has(ChiseledBlocks.VERTICAL_SPRUCE_STAIRS))
                        .save(output);
                shaped(RecipeCategory.MISC, ChiseledBlocks.VERTICAL_SPRUCE_SLAB, 6)
                        .pattern("   ")
                        .pattern("###")
                        .pattern("   ")
                        .define('#', ChiseledBlocks.VERTICAL_SPRUCE_PLANKS)
                        .unlockedBy(getHasName(ChiseledBlocks.VERTICAL_SPRUCE_SLAB), has(ChiseledBlocks.VERTICAL_SPRUCE_SLAB))
                        .save(output);
                shaped(RecipeCategory.MISC, ChiseledBlocks.BIRCH_TRIM, 2)
                        .pattern(" # ")
                        .pattern(" 0 ")
                        .pattern(" # ")
                        .define('#', Blocks.BIRCH_SLAB)
                        .define('0', Blocks.BIRCH_PLANKS)
                        .unlockedBy(getHasName(ChiseledBlocks.BIRCH_TRIM), has(ChiseledBlocks.BIRCH_TRIM))
                        .save(output);
                shaped(RecipeCategory.MISC, ChiseledBlocks.VERTICAL_BIRCH_PLANKS, 3)
                        .pattern(" # ")
                        .pattern(" # ")
                        .pattern(" # ")
                        .define('#', Blocks.BIRCH_PLANKS)
                        .unlockedBy(getHasName(ChiseledBlocks.VERTICAL_BIRCH_PLANKS), has(ChiseledBlocks.VERTICAL_BIRCH_PLANKS))
                        .save(output);
                shaped(RecipeCategory.MISC, ChiseledBlocks.VERTICAL_BIRCH_STAIRS, 4)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .define('#', ChiseledBlocks.VERTICAL_BIRCH_PLANKS)
                        .unlockedBy(getHasName(ChiseledBlocks.VERTICAL_BIRCH_STAIRS), has(ChiseledBlocks.VERTICAL_BIRCH_STAIRS))
                        .save(output);
                shaped(RecipeCategory.MISC, ChiseledBlocks.VERTICAL_BIRCH_SLAB, 6)
                        .pattern("   ")
                        .pattern("###")
                        .pattern("   ")
                        .define('#', ChiseledBlocks.VERTICAL_BIRCH_PLANKS)
                        .unlockedBy(getHasName(ChiseledBlocks.VERTICAL_BIRCH_SLAB), has(ChiseledBlocks.VERTICAL_BIRCH_SLAB))
                        .save(output);
                shaped(RecipeCategory.MISC, ChiseledBlocks.JUNGLE_TRIM, 2)
                        .pattern(" # ")
                        .pattern(" 0 ")
                        .pattern(" # ")
                        .define('#', Blocks.JUNGLE_SLAB)
                        .define('0', Blocks.JUNGLE_PLANKS)
                        .unlockedBy(getHasName(ChiseledBlocks.JUNGLE_TRIM), has(ChiseledBlocks.JUNGLE_TRIM))
                        .save(output);
                shaped(RecipeCategory.MISC, ChiseledBlocks.VERTICAL_JUNGLE_PLANKS, 3)
                        .pattern(" # ")
                        .pattern(" # ")
                        .pattern(" # ")
                        .define('#', Blocks.JUNGLE_PLANKS)
                        .unlockedBy(getHasName(ChiseledBlocks.VERTICAL_JUNGLE_PLANKS), has(ChiseledBlocks.VERTICAL_JUNGLE_PLANKS))
                        .save(output);
                shaped(RecipeCategory.MISC, ChiseledBlocks.VERTICAL_JUNGLE_STAIRS, 4)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .define('#', ChiseledBlocks.VERTICAL_JUNGLE_PLANKS)
                        .unlockedBy(getHasName(ChiseledBlocks.VERTICAL_JUNGLE_STAIRS), has(ChiseledBlocks.VERTICAL_JUNGLE_STAIRS))
                        .save(output);
                shaped(RecipeCategory.MISC, ChiseledBlocks.VERTICAL_JUNGLE_SLAB, 6)
                        .pattern("   ")
                        .pattern("###")
                        .pattern("   ")
                        .define('#', ChiseledBlocks.VERTICAL_JUNGLE_PLANKS)
                        .unlockedBy(getHasName(ChiseledBlocks.VERTICAL_JUNGLE_SLAB), has(ChiseledBlocks.VERTICAL_JUNGLE_SLAB))
                        .save(output);
                shaped(RecipeCategory.MISC, ChiseledBlocks.ACACIA_TRIM, 2)
                        .pattern(" # ")
                        .pattern(" 0 ")
                        .pattern(" # ")
                        .define('#', Blocks.ACACIA_SLAB)
                        .define('0', Blocks.ACACIA_PLANKS)
                        .unlockedBy(getHasName(ChiseledBlocks.ACACIA_TRIM), has(ChiseledBlocks.ACACIA_TRIM))
                        .save(output);
                shaped(RecipeCategory.MISC, ChiseledBlocks.VERTICAL_ACACIA_PLANKS, 3)
                        .pattern(" # ")
                        .pattern(" # ")
                        .pattern(" # ")
                        .define('#', Blocks.ACACIA_PLANKS)
                        .unlockedBy(getHasName(ChiseledBlocks.VERTICAL_ACACIA_PLANKS), has(ChiseledBlocks.VERTICAL_ACACIA_PLANKS))
                        .save(output);
                shaped(RecipeCategory.MISC, ChiseledBlocks.VERTICAL_ACACIA_STAIRS, 4)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .define('#', ChiseledBlocks.VERTICAL_ACACIA_PLANKS)
                        .unlockedBy(getHasName(ChiseledBlocks.VERTICAL_ACACIA_STAIRS), has(ChiseledBlocks.VERTICAL_ACACIA_STAIRS))
                        .save(output);
                shaped(RecipeCategory.MISC, ChiseledBlocks.VERTICAL_ACACIA_SLAB, 6)
                        .pattern("   ")
                        .pattern("###")
                        .pattern("   ")
                        .define('#', ChiseledBlocks.VERTICAL_ACACIA_PLANKS)
                        .unlockedBy(getHasName(ChiseledBlocks.VERTICAL_ACACIA_SLAB), has(ChiseledBlocks.VERTICAL_ACACIA_SLAB))
                        .save(output);
                shaped(RecipeCategory.MISC, ChiseledBlocks.DARK_OAK_TRIM, 2)
                        .pattern(" # ")
                        .pattern(" 0 ")
                        .pattern(" # ")
                        .define('#', Blocks.DARK_OAK_SLAB)
                        .define('0', Blocks.DARK_OAK_PLANKS)
                        .unlockedBy(getHasName(ChiseledBlocks.DARK_OAK_TRIM), has(ChiseledBlocks.DARK_OAK_TRIM))
                        .save(output);
                shaped(RecipeCategory.MISC, ChiseledBlocks.VERTICAL_DARK_OAK_PLANKS, 3)
                        .pattern(" # ")
                        .pattern(" # ")
                        .pattern(" # ")
                        .define('#', Blocks.DARK_OAK_PLANKS)
                        .unlockedBy(getHasName(ChiseledBlocks.VERTICAL_DARK_OAK_PLANKS), has(ChiseledBlocks.VERTICAL_DARK_OAK_PLANKS))
                        .save(output);
                shaped(RecipeCategory.MISC, ChiseledBlocks.VERTICAL_DARK_OAK_STAIRS, 4)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .define('#', ChiseledBlocks.VERTICAL_DARK_OAK_PLANKS)
                        .unlockedBy(getHasName(ChiseledBlocks.VERTICAL_DARK_OAK_STAIRS), has(ChiseledBlocks.VERTICAL_DARK_OAK_STAIRS))
                        .save(output);
                shaped(RecipeCategory.MISC, ChiseledBlocks.VERTICAL_DARK_OAK_SLAB, 6)
                        .pattern("   ")
                        .pattern("###")
                        .pattern("   ")
                        .define('#', ChiseledBlocks.VERTICAL_DARK_OAK_PLANKS)
                        .unlockedBy(getHasName(ChiseledBlocks.VERTICAL_DARK_OAK_SLAB), has(ChiseledBlocks.VERTICAL_DARK_OAK_SLAB))
                        .save(output);
                shaped(RecipeCategory.MISC, ChiseledBlocks.MANGROVE_TRIM, 2)
                        .pattern(" # ")
                        .pattern(" 0 ")
                        .pattern(" # ")
                        .define('#', Blocks.MANGROVE_SLAB)
                        .define('0', Blocks.MANGROVE_PLANKS)
                        .unlockedBy(getHasName(ChiseledBlocks.MANGROVE_TRIM), has(ChiseledBlocks.MANGROVE_TRIM))
                        .save(output);
                shaped(RecipeCategory.MISC, ChiseledBlocks.VERTICAL_MANGROVE_PLANKS, 3)
                        .pattern(" # ")
                        .pattern(" # ")
                        .pattern(" # ")
                        .define('#', Blocks.MANGROVE_PLANKS)
                        .unlockedBy(getHasName(ChiseledBlocks.VERTICAL_MANGROVE_PLANKS), has(ChiseledBlocks.VERTICAL_MANGROVE_PLANKS))
                        .save(output);
                shaped(RecipeCategory.MISC, ChiseledBlocks.VERTICAL_MANGROVE_STAIRS, 4)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .define('#', ChiseledBlocks.VERTICAL_MANGROVE_PLANKS)
                        .unlockedBy(getHasName(ChiseledBlocks.VERTICAL_MANGROVE_STAIRS), has(ChiseledBlocks.VERTICAL_MANGROVE_STAIRS))
                        .save(output);
                shaped(RecipeCategory.MISC, ChiseledBlocks.VERTICAL_MANGROVE_SLAB, 6)
                        .pattern("   ")
                        .pattern("###")
                        .pattern("   ")
                        .define('#', ChiseledBlocks.VERTICAL_MANGROVE_PLANKS)
                        .unlockedBy(getHasName(ChiseledBlocks.VERTICAL_MANGROVE_SLAB), has(ChiseledBlocks.VERTICAL_MANGROVE_SLAB))
                        .save(output);
                shaped(RecipeCategory.MISC, ChiseledBlocks.CHERRY_TRIM, 2)
                        .pattern(" # ")
                        .pattern(" 0 ")
                        .pattern(" # ")
                        .define('#', Blocks.CHERRY_SLAB)
                        .define('0', Blocks.CHERRY_PLANKS)
                        .unlockedBy(getHasName(ChiseledBlocks.CHERRY_TRIM), has(ChiseledBlocks.CHERRY_TRIM))
                        .save(output);
                shaped(RecipeCategory.MISC, ChiseledBlocks.VERTICAL_CHERRY_PLANKS, 3)
                        .pattern(" # ")
                        .pattern(" # ")
                        .pattern(" # ")
                        .define('#', Blocks.CHERRY_PLANKS)
                        .unlockedBy(getHasName(ChiseledBlocks.VERTICAL_CHERRY_PLANKS), has(ChiseledBlocks.VERTICAL_CHERRY_PLANKS))
                        .save(output);
                shaped(RecipeCategory.MISC, ChiseledBlocks.VERTICAL_CHERRY_STAIRS, 4)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .define('#', ChiseledBlocks.VERTICAL_CHERRY_PLANKS)
                        .unlockedBy(getHasName(ChiseledBlocks.VERTICAL_CHERRY_STAIRS), has(ChiseledBlocks.VERTICAL_CHERRY_STAIRS))
                        .save(output);
                shaped(RecipeCategory.MISC, ChiseledBlocks.VERTICAL_CHERRY_SLAB, 6)
                        .pattern("   ")
                        .pattern("###")
                        .pattern("   ")
                        .define('#', ChiseledBlocks.VERTICAL_CHERRY_PLANKS)
                        .unlockedBy(getHasName(ChiseledBlocks.VERTICAL_CHERRY_SLAB), has(ChiseledBlocks.VERTICAL_CHERRY_SLAB))
                        .save(output);
                shaped(RecipeCategory.MISC, ChiseledBlocks.PALE_OAK_TRIM, 2)
                        .pattern(" # ")
                        .pattern(" 0 ")
                        .pattern(" # ")
                        .define('#', Blocks.PALE_OAK_SLAB)
                        .define('0', Blocks.PALE_OAK_PLANKS)
                        .unlockedBy(getHasName(ChiseledBlocks.PALE_OAK_TRIM), has(ChiseledBlocks.PALE_OAK_TRIM))
                        .save(output);
                shaped(RecipeCategory.MISC, ChiseledBlocks.VERTICAL_PALE_OAK_PLANKS, 3)
                        .pattern(" # ")
                        .pattern(" # ")
                        .pattern(" # ")
                        .define('#', Blocks.PALE_OAK_PLANKS)
                        .unlockedBy(getHasName(ChiseledBlocks.VERTICAL_PALE_OAK_PLANKS), has(ChiseledBlocks.VERTICAL_PALE_OAK_PLANKS))
                        .save(output);
                shaped(RecipeCategory.MISC, ChiseledBlocks.VERTICAL_PALE_OAK_STAIRS, 4)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .define('#', ChiseledBlocks.VERTICAL_PALE_OAK_PLANKS)
                        .unlockedBy(getHasName(ChiseledBlocks.VERTICAL_PALE_OAK_STAIRS), has(ChiseledBlocks.VERTICAL_PALE_OAK_STAIRS))
                        .save(output);
                shaped(RecipeCategory.MISC, ChiseledBlocks.VERTICAL_PALE_OAK_SLAB, 6)
                        .pattern("   ")
                        .pattern("###")
                        .pattern("   ")
                        .define('#', ChiseledBlocks.VERTICAL_PALE_OAK_PLANKS)
                        .unlockedBy(getHasName(ChiseledBlocks.VERTICAL_PALE_OAK_SLAB), has(ChiseledBlocks.VERTICAL_PALE_OAK_SLAB))
                        .save(output);
                shaped(RecipeCategory.MISC, ChiseledBlocks.BAMBOO_TRIM, 2)
                        .pattern(" # ")
                        .pattern(" 0 ")
                        .pattern(" # ")
                        .define('#', Blocks.BAMBOO_SLAB)
                        .define('0', Blocks.BAMBOO_PLANKS)
                        .unlockedBy(getHasName(ChiseledBlocks.BAMBOO_TRIM), has(ChiseledBlocks.BAMBOO_TRIM))
                        .save(output);
                shaped(RecipeCategory.MISC, ChiseledBlocks.VERTICAL_BAMBOO_PLANKS, 3)
                        .pattern(" # ")
                        .pattern(" # ")
                        .pattern(" # ")
                        .define('#', Blocks.BAMBOO_PLANKS)
                        .unlockedBy(getHasName(ChiseledBlocks.VERTICAL_BAMBOO_PLANKS), has(ChiseledBlocks.VERTICAL_BAMBOO_PLANKS))
                        .save(output);
                shaped(RecipeCategory.MISC, ChiseledBlocks.VERTICAL_BAMBOO_STAIRS, 4)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .define('#', ChiseledBlocks.VERTICAL_BAMBOO_PLANKS)
                        .unlockedBy(getHasName(ChiseledBlocks.VERTICAL_BAMBOO_STAIRS), has(ChiseledBlocks.VERTICAL_BAMBOO_STAIRS))
                        .save(output);
                shaped(RecipeCategory.MISC, ChiseledBlocks.VERTICAL_BAMBOO_SLAB, 6)
                        .pattern("   ")
                        .pattern("###")
                        .pattern("   ")
                        .define('#', ChiseledBlocks.VERTICAL_BAMBOO_PLANKS)
                        .unlockedBy(getHasName(ChiseledBlocks.VERTICAL_BAMBOO_SLAB), has(ChiseledBlocks.VERTICAL_BAMBOO_SLAB))
                        .save(output);
                shaped(RecipeCategory.MISC, ChiseledBlocks.CRIMSON_TRIM, 2)
                        .pattern(" # ")
                        .pattern(" 0 ")
                        .pattern(" # ")
                        .define('#', Blocks.CRIMSON_SLAB)
                        .define('0', Blocks.CRIMSON_PLANKS)
                        .unlockedBy(getHasName(ChiseledBlocks.CRIMSON_TRIM), has(ChiseledBlocks.CRIMSON_TRIM))
                        .save(output);
                shaped(RecipeCategory.MISC, ChiseledBlocks.VERTICAL_CRIMSON_PLANKS, 3)
                        .pattern(" # ")
                        .pattern(" # ")
                        .pattern(" # ")
                        .define('#', Blocks.CRIMSON_PLANKS)
                        .unlockedBy(getHasName(ChiseledBlocks.VERTICAL_CRIMSON_PLANKS), has(ChiseledBlocks.VERTICAL_CRIMSON_PLANKS))
                        .save(output);
                shaped(RecipeCategory.MISC, ChiseledBlocks.VERTICAL_CRIMSON_STAIRS, 4)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .define('#', ChiseledBlocks.VERTICAL_CRIMSON_PLANKS)
                        .unlockedBy(getHasName(ChiseledBlocks.VERTICAL_CRIMSON_STAIRS), has(ChiseledBlocks.VERTICAL_CRIMSON_STAIRS))
                        .save(output);
                shaped(RecipeCategory.MISC, ChiseledBlocks.VERTICAL_CRIMSON_SLAB, 6)
                        .pattern("   ")
                        .pattern("###")
                        .pattern("   ")
                        .define('#', ChiseledBlocks.VERTICAL_CRIMSON_PLANKS)
                        .unlockedBy(getHasName(ChiseledBlocks.VERTICAL_CRIMSON_SLAB), has(ChiseledBlocks.VERTICAL_CRIMSON_SLAB))
                        .save(output);
                shaped(RecipeCategory.MISC, ChiseledBlocks.WARPED_TRIM, 2)
                        .pattern(" # ")
                        .pattern(" 0 ")
                        .pattern(" # ")
                        .define('#', Blocks.WARPED_SLAB)
                        .define('0', Blocks.WARPED_PLANKS)
                        .unlockedBy(getHasName(ChiseledBlocks.WARPED_TRIM), has(ChiseledBlocks.WARPED_TRIM))
                        .save(output);
                shaped(RecipeCategory.MISC, ChiseledBlocks.VERTICAL_WARPED_PLANKS, 3)
                        .pattern(" # ")
                        .pattern(" # ")
                        .pattern(" # ")
                        .define('#', Blocks.WARPED_PLANKS)
                        .unlockedBy(getHasName(ChiseledBlocks.VERTICAL_WARPED_PLANKS), has(ChiseledBlocks.VERTICAL_WARPED_PLANKS))
                        .save(output);
                shaped(RecipeCategory.MISC, ChiseledBlocks.VERTICAL_WARPED_STAIRS, 4)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .define('#', ChiseledBlocks.VERTICAL_WARPED_PLANKS)
                        .unlockedBy(getHasName(ChiseledBlocks.VERTICAL_WARPED_STAIRS), has(ChiseledBlocks.VERTICAL_WARPED_STAIRS))
                        .save(output);
                shaped(RecipeCategory.MISC, ChiseledBlocks.VERTICAL_WARPED_SLAB, 6)
                        .pattern("   ")
                        .pattern("###")
                        .pattern("   ")
                        .define('#', ChiseledBlocks.VERTICAL_WARPED_PLANKS)
                        .unlockedBy(getHasName(ChiseledBlocks.VERTICAL_WARPED_SLAB), has(ChiseledBlocks.VERTICAL_WARPED_SLAB))
                        .save(output);

                shaped(RecipeCategory.MISC, ChiseledBlocks.STONE_WALL, 6)
                        .pattern("   ")
                        .pattern("###")
                        .pattern("###")
                        .define('#', Blocks.STONE)
                        .unlockedBy(getHasName(ChiseledBlocks.STONE_WALL), has(ChiseledBlocks.STONE_WALL))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.STONE_WALL, Blocks.STONE);
                shaped(RecipeCategory.MISC, ChiseledBlocks.POLISHED_STONE, 4)
                        .pattern("## ")
                        .pattern("## ")
                        .pattern("   ")
                        .define('#', Blocks.STONE)
                        .unlockedBy(getHasName(ChiseledBlocks.POLISHED_STONE), has(ChiseledBlocks.POLISHED_STONE))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_STONE, Blocks.STONE);
                shaped(RecipeCategory.MISC, ChiseledBlocks.POLISHED_STONE_STAIRS, 4)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .define('#', ChiseledBlocks.POLISHED_STONE)
                        .unlockedBy(getHasName(ChiseledBlocks.POLISHED_STONE_STAIRS), has(ChiseledBlocks.POLISHED_STONE_STAIRS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_STONE_STAIRS, Blocks.STONE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_STONE_STAIRS, ChiseledBlocks.POLISHED_STONE);
                shaped(RecipeCategory.MISC, ChiseledBlocks.POLISHED_STONE_SLAB, 6)
                        .pattern("   ")
                        .pattern("###")
                        .pattern("   ")
                        .define('#', ChiseledBlocks.POLISHED_STONE)
                        .unlockedBy(getHasName(ChiseledBlocks.POLISHED_STONE_SLAB), has(ChiseledBlocks.POLISHED_STONE_SLAB))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_STONE_SLAB, Blocks.STONE,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_STONE_SLAB, ChiseledBlocks.POLISHED_STONE,2);
                shaped(RecipeCategory.MISC, ChiseledBlocks.POLISHED_STONE_WALL, 6)
                        .pattern("   ")
                        .pattern("###")
                        .pattern("###")
                        .define('#', ChiseledBlocks.POLISHED_STONE)
                        .unlockedBy(getHasName(ChiseledBlocks.POLISHED_STONE_WALL), has(ChiseledBlocks.POLISHED_STONE_WALL))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_STONE_WALL, Blocks.STONE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_STONE_WALL, ChiseledBlocks.POLISHED_STONE);
                shaped(RecipeCategory.MISC, ChiseledBlocks.SMOOTH_STONE_STAIRS, 4)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .define('#', Blocks.SMOOTH_STONE)
                        .unlockedBy(getHasName(ChiseledBlocks.SMOOTH_STONE_STAIRS), has(ChiseledBlocks.SMOOTH_STONE_STAIRS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.SMOOTH_STONE_STAIRS, Blocks.SMOOTH_STONE);
                shaped(RecipeCategory.MISC, Blocks.STONE_BRICKS, 4)
                        .pattern("## ")
                        .pattern("## ")
                        .pattern("   ")
                        .define('#', ChiseledBlocks.POLISHED_STONE)
                        .unlockedBy(getHasName(Blocks.STONE_BRICKS), has(Blocks.STONE_BRICKS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, Blocks.STONE_BRICKS, ChiseledBlocks.POLISHED_STONE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, Blocks.STONE_BRICK_STAIRS, ChiseledBlocks.POLISHED_STONE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, Blocks.STONE_BRICK_SLAB, ChiseledBlocks.POLISHED_STONE, 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, Blocks.STONE_BRICK_WALL, ChiseledBlocks.POLISHED_STONE);
                shapeless(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MOSSY_CHISELED_STONE_BRICKS)
                        .requires(Blocks.CHISELED_STONE_BRICKS)
                        .requires(Blocks.MOSS_BLOCK)
                        .unlockedBy(getHasName(ChiseledBlocks.MOSSY_CHISELED_STONE_BRICKS), has(ChiseledBlocks.MOSSY_CHISELED_STONE_BRICKS))
                        .save(output, "mossy_chiseled_stone_bricks_from_moss");
                shapeless(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MOSSY_CHISELED_STONE_BRICKS)
                        .requires(Blocks.CHISELED_STONE_BRICKS)
                        .requires(Blocks.VINE)
                        .unlockedBy(getHasName(ChiseledBlocks.MOSSY_CHISELED_STONE_BRICKS), has(ChiseledBlocks.MOSSY_CHISELED_STONE_BRICKS))
                        .save(output, "mossy_chiseled_stone_bricks_from_vine");
                shaped(RecipeCategory.MISC, ChiseledBlocks.CUT_STONE_BRICKS)
                        .pattern(" # ")
                        .pattern(" # ")
                        .pattern("   ")
                        .define('#', ChiseledBlocks.POLISHED_STONE_SLAB)
                        .unlockedBy(getHasName(ChiseledBlocks.CUT_STONE_BRICKS), has(ChiseledBlocks.CUT_STONE_BRICKS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_STONE_BRICKS, Blocks.STONE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_STONE_BRICKS, ChiseledBlocks.POLISHED_STONE);
                oreSmelting(List.of(ChiseledBlocks.CUT_STONE_BRICKS), RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS, ChiseledBlocks.CRACKED_CUT_STONE_BRICKS, 0.1f, 200, "cracked_cut_stone_bricks");
                shaped(RecipeCategory.MISC, ChiseledBlocks.CUT_STONE_BRICK_STAIRS, 4)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .define('#', ChiseledBlocks.CUT_STONE_BRICKS)
                        .unlockedBy(getHasName(ChiseledBlocks.CUT_STONE_BRICK_STAIRS), has(ChiseledBlocks.CUT_STONE_BRICK_STAIRS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_STONE_BRICK_STAIRS, Blocks.STONE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_STONE_BRICK_STAIRS, ChiseledBlocks.POLISHED_STONE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_STONE_BRICK_STAIRS, ChiseledBlocks.CUT_STONE_BRICKS);
                shaped(RecipeCategory.MISC, ChiseledBlocks.CUT_STONE_BRICK_SLAB, 6)
                        .pattern("   ")
                        .pattern("###")
                        .pattern("   ")
                        .define('#', ChiseledBlocks.CUT_STONE_BRICKS)
                        .unlockedBy(getHasName(ChiseledBlocks.CUT_STONE_BRICK_SLAB), has(ChiseledBlocks.CUT_STONE_BRICK_SLAB))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_STONE_BRICK_SLAB, Blocks.STONE,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_STONE_BRICK_SLAB, ChiseledBlocks.POLISHED_STONE,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CUT_STONE_BRICK_SLAB, ChiseledBlocks.CUT_STONE_BRICKS,2);
                shapeless(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MOSSY_CUT_STONE_BRICKS)
                        .requires(ChiseledBlocks.CUT_STONE_BRICKS)
                        .requires(Blocks.MOSS_BLOCK)
                        .unlockedBy(getHasName(ChiseledBlocks.MOSSY_CUT_STONE_BRICKS), has(ChiseledBlocks.MOSSY_CUT_STONE_BRICKS))
                        .save(output, "mossy_cut_stone_bricks_from_moss");
                shapeless(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MOSSY_CUT_STONE_BRICKS)
                        .requires(ChiseledBlocks.CUT_STONE_BRICKS)
                        .requires(Blocks.VINE)
                        .unlockedBy(getHasName(ChiseledBlocks.MOSSY_CUT_STONE_BRICKS), has(ChiseledBlocks.MOSSY_CUT_STONE_BRICKS))
                        .save(output, "mossy_cut_bricks_stone_from_vine");
                shaped(RecipeCategory.MISC, ChiseledBlocks.MOSSY_CUT_STONE_BRICK_STAIRS, 4)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .define('#', ChiseledBlocks.MOSSY_CUT_STONE_BRICKS)
                        .unlockedBy(getHasName(ChiseledBlocks.MOSSY_CUT_STONE_BRICK_STAIRS), has(ChiseledBlocks.MOSSY_CUT_STONE_BRICK_STAIRS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MOSSY_CUT_STONE_BRICK_STAIRS, ChiseledBlocks.MOSSY_CUT_STONE_BRICKS);
                shaped(RecipeCategory.MISC, ChiseledBlocks.MOSSY_CUT_STONE_BRICK_SLAB, 6)
                        .pattern("   ")
                        .pattern("###")
                        .pattern("   ")
                        .define('#', ChiseledBlocks.MOSSY_CUT_STONE_BRICKS)
                        .unlockedBy(getHasName(ChiseledBlocks.MOSSY_CUT_STONE_BRICK_SLAB), has(ChiseledBlocks.MOSSY_CUT_STONE_BRICK_SLAB))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MOSSY_CUT_STONE_BRICK_SLAB, ChiseledBlocks.MOSSY_CUT_STONE_BRICKS,2);

                shaped(RecipeCategory.MISC, ChiseledBlocks.STONE_TILES, 4)
                        .pattern("## ")
                        .pattern("## ")
                        .pattern("   ")
                        .define('#', Blocks.STONE_BRICKS)
                        .unlockedBy(getHasName(ChiseledBlocks.STONE_TILES), has(ChiseledBlocks.STONE_TILES))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.STONE_TILES, Blocks.STONE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.STONE_TILES, ChiseledBlocks.POLISHED_STONE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.STONE_TILES, Blocks.STONE_BRICKS);
                shaped(RecipeCategory.MISC, ChiseledBlocks.STONE_TILE_STAIRS, 4)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .define('#', ChiseledBlocks.STONE_TILES)
                        .unlockedBy(getHasName(ChiseledBlocks.STONE_TILE_STAIRS), has(ChiseledBlocks.STONE_TILE_STAIRS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.STONE_TILE_STAIRS, Blocks.STONE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.STONE_TILE_STAIRS, ChiseledBlocks.POLISHED_STONE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.STONE_TILE_STAIRS, Blocks.STONE_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.STONE_TILE_STAIRS, ChiseledBlocks.STONE_TILES);
                shaped(RecipeCategory.MISC, ChiseledBlocks.STONE_TILE_SLAB, 6)
                        .pattern("   ")
                        .pattern("###")
                        .pattern("   ")
                        .define('#', ChiseledBlocks.STONE_TILES)
                        .unlockedBy(getHasName(ChiseledBlocks.STONE_TILE_SLAB), has(ChiseledBlocks.STONE_TILE_SLAB))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.STONE_TILE_SLAB, Blocks.STONE,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.STONE_TILE_SLAB, ChiseledBlocks.POLISHED_STONE, 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.STONE_TILE_SLAB, Blocks.STONE_BRICKS, 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.STONE_TILE_SLAB, ChiseledBlocks.STONE_TILES,2);
                shaped(RecipeCategory.MISC, ChiseledBlocks.STONE_TILE_WALL, 6)
                        .pattern("   ")
                        .pattern("###")
                        .pattern("###")
                        .define('#', ChiseledBlocks.STONE_TILES)
                        .unlockedBy(getHasName(ChiseledBlocks.STONE_TILE_WALL), has(ChiseledBlocks.STONE_TILE_WALL))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.STONE_TILE_WALL, Blocks.STONE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.STONE_TILE_WALL, ChiseledBlocks.POLISHED_STONE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.STONE_TILE_WALL, Blocks.STONE_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.STONE_TILE_WALL, ChiseledBlocks.STONE_TILES);
                shapeless(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MOSSY_STONE_TILES)
                        .requires(ChiseledBlocks.STONE_TILES)
                        .requires(Blocks.MOSS_BLOCK)
                        .unlockedBy(getHasName(ChiseledBlocks.MOSSY_STONE_TILES), has(ChiseledBlocks.MOSSY_STONE_TILES))
                        .save(output, "mossy_stone_tiles_from_moss");
                shapeless(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MOSSY_STONE_TILES)
                        .requires(ChiseledBlocks.STONE_TILES)
                        .requires(Blocks.VINE)
                        .unlockedBy(getHasName(ChiseledBlocks.MOSSY_STONE_TILES), has(ChiseledBlocks.MOSSY_STONE_TILES))
                        .save(output, "mossy_stone_tiles_from_vine");
                shaped(RecipeCategory.MISC, ChiseledBlocks.MOSSY_STONE_TILE_STAIRS, 4)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .define('#', ChiseledBlocks.MOSSY_STONE_TILES)
                        .unlockedBy(getHasName(ChiseledBlocks.MOSSY_STONE_TILE_STAIRS), has(ChiseledBlocks.MOSSY_STONE_TILE_STAIRS))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MOSSY_STONE_TILE_STAIRS, ChiseledBlocks.MOSSY_STONE_TILES);
                shaped(RecipeCategory.MISC, ChiseledBlocks.MOSSY_STONE_TILE_SLAB, 6)
                        .pattern("   ")
                        .pattern("###")
                        .pattern("   ")
                        .define('#', ChiseledBlocks.MOSSY_STONE_TILES)
                        .unlockedBy(getHasName(ChiseledBlocks.MOSSY_STONE_TILE_SLAB), has(ChiseledBlocks.MOSSY_STONE_TILE_SLAB))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MOSSY_STONE_TILE_SLAB, ChiseledBlocks.MOSSY_STONE_TILES,2);
                shaped(RecipeCategory.MISC, ChiseledBlocks.MOSSY_STONE_TILE_WALL, 6)
                        .pattern("   ")
                        .pattern("###")
                        .pattern("###")
                        .define('#', ChiseledBlocks.MOSSY_STONE_TILES)
                        .unlockedBy(getHasName(ChiseledBlocks.MOSSY_STONE_TILE_WALL), has(ChiseledBlocks.MOSSY_STONE_TILE_WALL))
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MOSSY_STONE_TILE_WALL, ChiseledBlocks.MOSSY_STONE_TILES);
            }
        };
    }

    @Override
    public String getName() {
        return "recipegen";
    }
}