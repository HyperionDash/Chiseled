package net.hyper.chiseled.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.hyper.chiseled.registry.ChiseledBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.data.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ChiseledRecipeGen extends FabricRecipeProvider {
    public ChiseledRecipeGen(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup wrapperLookup, RecipeExporter recipeExporter) {
        return new RecipeGenerator(wrapperLookup, recipeExporter) {
            @Override
            public void generate() {

                createShaped(RecipeCategory.MISC, ChiseledBlocks.OAK_TRIM, 2)
                        .pattern(" # ")
                        .pattern(" 0 ")
                        .pattern(" # ")
                        .input('#', Blocks.OAK_SLAB)
                        .input('0', Blocks.OAK_PLANKS)
                        .criterion(hasItem(ChiseledBlocks.OAK_TRIM), conditionsFromItem(ChiseledBlocks.OAK_TRIM))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ChiseledBlocks.VERTICAL_OAK_PLANKS, 3)
                        .pattern(" # ")
                        .pattern(" # ")
                        .pattern(" # ")
                        .input('#', Blocks.OAK_PLANKS)
                        .criterion(hasItem(ChiseledBlocks.VERTICAL_OAK_PLANKS), conditionsFromItem(ChiseledBlocks.VERTICAL_OAK_PLANKS))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ChiseledBlocks.VERTICAL_OAK_STAIRS, 4)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .input('#', ChiseledBlocks.VERTICAL_OAK_PLANKS)
                        .criterion(hasItem(ChiseledBlocks.VERTICAL_OAK_STAIRS), conditionsFromItem(ChiseledBlocks.VERTICAL_OAK_STAIRS))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ChiseledBlocks.VERTICAL_OAK_SLAB, 6)
                        .pattern("   ")
                        .pattern("###")
                        .pattern("   ")
                        .input('#', ChiseledBlocks.VERTICAL_OAK_PLANKS)
                        .criterion(hasItem(ChiseledBlocks.VERTICAL_OAK_SLAB), conditionsFromItem(ChiseledBlocks.VERTICAL_OAK_SLAB))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ChiseledBlocks.SPRUCE_TRIM, 2)
                        .pattern(" # ")
                        .pattern(" 0 ")
                        .pattern(" # ")
                        .input('#', Blocks.SPRUCE_SLAB)
                        .input('0', Blocks.SPRUCE_PLANKS)
                        .criterion(hasItem(ChiseledBlocks.SPRUCE_TRIM), conditionsFromItem(ChiseledBlocks.SPRUCE_TRIM))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ChiseledBlocks.VERTICAL_SPRUCE_PLANKS, 3)
                        .pattern(" # ")
                        .pattern(" # ")
                        .pattern(" # ")
                        .input('#', Blocks.SPRUCE_PLANKS)
                        .criterion(hasItem(ChiseledBlocks.VERTICAL_SPRUCE_PLANKS), conditionsFromItem(ChiseledBlocks.VERTICAL_SPRUCE_PLANKS))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ChiseledBlocks.VERTICAL_SPRUCE_STAIRS, 4)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .input('#', ChiseledBlocks.VERTICAL_SPRUCE_PLANKS)
                        .criterion(hasItem(ChiseledBlocks.VERTICAL_SPRUCE_STAIRS), conditionsFromItem(ChiseledBlocks.VERTICAL_SPRUCE_STAIRS))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ChiseledBlocks.VERTICAL_SPRUCE_SLAB, 6)
                        .pattern("   ")
                        .pattern("###")
                        .pattern("   ")
                        .input('#', ChiseledBlocks.VERTICAL_SPRUCE_PLANKS)
                        .criterion(hasItem(ChiseledBlocks.VERTICAL_SPRUCE_SLAB), conditionsFromItem(ChiseledBlocks.VERTICAL_SPRUCE_SLAB))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ChiseledBlocks.BIRCH_TRIM, 2)
                        .pattern(" # ")
                        .pattern(" 0 ")
                        .pattern(" # ")
                        .input('#', Blocks.BIRCH_SLAB)
                        .input('0', Blocks.BIRCH_PLANKS)
                        .criterion(hasItem(ChiseledBlocks.BIRCH_TRIM), conditionsFromItem(ChiseledBlocks.BIRCH_TRIM))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ChiseledBlocks.VERTICAL_BIRCH_PLANKS, 3)
                        .pattern(" # ")
                        .pattern(" # ")
                        .pattern(" # ")
                        .input('#', Blocks.BIRCH_PLANKS)
                        .criterion(hasItem(ChiseledBlocks.VERTICAL_BIRCH_PLANKS), conditionsFromItem(ChiseledBlocks.VERTICAL_BIRCH_PLANKS))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ChiseledBlocks.VERTICAL_BIRCH_STAIRS, 4)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .input('#', ChiseledBlocks.VERTICAL_BIRCH_PLANKS)
                        .criterion(hasItem(ChiseledBlocks.VERTICAL_BIRCH_STAIRS), conditionsFromItem(ChiseledBlocks.VERTICAL_BIRCH_STAIRS))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ChiseledBlocks.VERTICAL_BIRCH_SLAB, 6)
                        .pattern("   ")
                        .pattern("###")
                        .pattern("   ")
                        .input('#', ChiseledBlocks.VERTICAL_BIRCH_PLANKS)
                        .criterion(hasItem(ChiseledBlocks.VERTICAL_BIRCH_SLAB), conditionsFromItem(ChiseledBlocks.VERTICAL_BIRCH_SLAB))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ChiseledBlocks.JUNGLE_TRIM, 2)
                        .pattern(" # ")
                        .pattern(" 0 ")
                        .pattern(" # ")
                        .input('#', Blocks.JUNGLE_SLAB)
                        .input('0', Blocks.JUNGLE_PLANKS)
                        .criterion(hasItem(ChiseledBlocks.JUNGLE_TRIM), conditionsFromItem(ChiseledBlocks.JUNGLE_TRIM))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ChiseledBlocks.VERTICAL_JUNGLE_PLANKS, 3)
                        .pattern(" # ")
                        .pattern(" # ")
                        .pattern(" # ")
                        .input('#', Blocks.JUNGLE_PLANKS)
                        .criterion(hasItem(ChiseledBlocks.VERTICAL_JUNGLE_PLANKS), conditionsFromItem(ChiseledBlocks.VERTICAL_JUNGLE_PLANKS))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ChiseledBlocks.VERTICAL_JUNGLE_STAIRS, 4)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .input('#', ChiseledBlocks.VERTICAL_JUNGLE_PLANKS)
                        .criterion(hasItem(ChiseledBlocks.VERTICAL_JUNGLE_STAIRS), conditionsFromItem(ChiseledBlocks.VERTICAL_JUNGLE_STAIRS))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ChiseledBlocks.VERTICAL_JUNGLE_SLAB, 6)
                        .pattern("   ")
                        .pattern("###")
                        .pattern("   ")
                        .input('#', ChiseledBlocks.VERTICAL_JUNGLE_PLANKS)
                        .criterion(hasItem(ChiseledBlocks.VERTICAL_JUNGLE_SLAB), conditionsFromItem(ChiseledBlocks.VERTICAL_JUNGLE_SLAB))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ChiseledBlocks.ACACIA_TRIM, 2)
                        .pattern(" # ")
                        .pattern(" 0 ")
                        .pattern(" # ")
                        .input('#', Blocks.ACACIA_SLAB)
                        .input('0', Blocks.ACACIA_PLANKS)
                        .criterion(hasItem(ChiseledBlocks.ACACIA_TRIM), conditionsFromItem(ChiseledBlocks.ACACIA_TRIM))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ChiseledBlocks.VERTICAL_ACACIA_PLANKS, 3)
                        .pattern(" # ")
                        .pattern(" # ")
                        .pattern(" # ")
                        .input('#', Blocks.ACACIA_PLANKS)
                        .criterion(hasItem(ChiseledBlocks.VERTICAL_ACACIA_PLANKS), conditionsFromItem(ChiseledBlocks.VERTICAL_ACACIA_PLANKS))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ChiseledBlocks.VERTICAL_ACACIA_STAIRS, 4)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .input('#', ChiseledBlocks.VERTICAL_ACACIA_PLANKS)
                        .criterion(hasItem(ChiseledBlocks.VERTICAL_ACACIA_STAIRS), conditionsFromItem(ChiseledBlocks.VERTICAL_ACACIA_STAIRS))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ChiseledBlocks.VERTICAL_ACACIA_SLAB, 6)
                        .pattern("   ")
                        .pattern("###")
                        .pattern("   ")
                        .input('#', ChiseledBlocks.VERTICAL_ACACIA_PLANKS)
                        .criterion(hasItem(ChiseledBlocks.VERTICAL_ACACIA_SLAB), conditionsFromItem(ChiseledBlocks.VERTICAL_ACACIA_SLAB))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ChiseledBlocks.DARK_OAK_TRIM, 2)
                        .pattern(" # ")
                        .pattern(" 0 ")
                        .pattern(" # ")
                        .input('#', Blocks.DARK_OAK_SLAB)
                        .input('0', Blocks.DARK_OAK_PLANKS)
                        .criterion(hasItem(ChiseledBlocks.DARK_OAK_TRIM), conditionsFromItem(ChiseledBlocks.DARK_OAK_TRIM))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ChiseledBlocks.VERTICAL_DARK_OAK_PLANKS, 3)
                        .pattern(" # ")
                        .pattern(" # ")
                        .pattern(" # ")
                        .input('#', Blocks.DARK_OAK_PLANKS)
                        .criterion(hasItem(ChiseledBlocks.VERTICAL_DARK_OAK_PLANKS), conditionsFromItem(ChiseledBlocks.VERTICAL_DARK_OAK_PLANKS))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ChiseledBlocks.VERTICAL_DARK_OAK_STAIRS, 4)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .input('#', ChiseledBlocks.VERTICAL_DARK_OAK_PLANKS)
                        .criterion(hasItem(ChiseledBlocks.VERTICAL_DARK_OAK_STAIRS), conditionsFromItem(ChiseledBlocks.VERTICAL_DARK_OAK_STAIRS))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ChiseledBlocks.VERTICAL_DARK_OAK_SLAB, 6)
                        .pattern("   ")
                        .pattern("###")
                        .pattern("   ")
                        .input('#', ChiseledBlocks.VERTICAL_DARK_OAK_PLANKS)
                        .criterion(hasItem(ChiseledBlocks.VERTICAL_DARK_OAK_SLAB), conditionsFromItem(ChiseledBlocks.VERTICAL_DARK_OAK_SLAB))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ChiseledBlocks.MANGROVE_TRIM, 2)
                        .pattern(" # ")
                        .pattern(" 0 ")
                        .pattern(" # ")
                        .input('#', Blocks.MANGROVE_SLAB)
                        .input('0', Blocks.MANGROVE_PLANKS)
                        .criterion(hasItem(ChiseledBlocks.MANGROVE_TRIM), conditionsFromItem(ChiseledBlocks.MANGROVE_TRIM))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ChiseledBlocks.VERTICAL_MANGROVE_PLANKS, 3)
                        .pattern(" # ")
                        .pattern(" # ")
                        .pattern(" # ")
                        .input('#', Blocks.MANGROVE_PLANKS)
                        .criterion(hasItem(ChiseledBlocks.VERTICAL_MANGROVE_PLANKS), conditionsFromItem(ChiseledBlocks.VERTICAL_MANGROVE_PLANKS))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ChiseledBlocks.VERTICAL_MANGROVE_STAIRS, 4)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .input('#', ChiseledBlocks.VERTICAL_MANGROVE_PLANKS)
                        .criterion(hasItem(ChiseledBlocks.VERTICAL_MANGROVE_STAIRS), conditionsFromItem(ChiseledBlocks.VERTICAL_MANGROVE_STAIRS))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ChiseledBlocks.VERTICAL_MANGROVE_SLAB, 6)
                        .pattern("   ")
                        .pattern("###")
                        .pattern("   ")
                        .input('#', ChiseledBlocks.VERTICAL_MANGROVE_PLANKS)
                        .criterion(hasItem(ChiseledBlocks.VERTICAL_MANGROVE_SLAB), conditionsFromItem(ChiseledBlocks.VERTICAL_MANGROVE_SLAB))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ChiseledBlocks.CHERRY_TRIM, 2)
                        .pattern(" # ")
                        .pattern(" 0 ")
                        .pattern(" # ")
                        .input('#', Blocks.CHERRY_SLAB)
                        .input('0', Blocks.CHERRY_PLANKS)
                        .criterion(hasItem(ChiseledBlocks.CHERRY_TRIM), conditionsFromItem(ChiseledBlocks.CHERRY_TRIM))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ChiseledBlocks.VERTICAL_CHERRY_PLANKS, 3)
                        .pattern(" # ")
                        .pattern(" # ")
                        .pattern(" # ")
                        .input('#', Blocks.CHERRY_PLANKS)
                        .criterion(hasItem(ChiseledBlocks.VERTICAL_CHERRY_PLANKS), conditionsFromItem(ChiseledBlocks.VERTICAL_CHERRY_PLANKS))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ChiseledBlocks.VERTICAL_CHERRY_STAIRS, 4)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .input('#', ChiseledBlocks.VERTICAL_CHERRY_PLANKS)
                        .criterion(hasItem(ChiseledBlocks.VERTICAL_CHERRY_STAIRS), conditionsFromItem(ChiseledBlocks.VERTICAL_CHERRY_STAIRS))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ChiseledBlocks.VERTICAL_CHERRY_SLAB, 6)
                        .pattern("   ")
                        .pattern("###")
                        .pattern("   ")
                        .input('#', ChiseledBlocks.VERTICAL_CHERRY_PLANKS)
                        .criterion(hasItem(ChiseledBlocks.VERTICAL_CHERRY_SLAB), conditionsFromItem(ChiseledBlocks.VERTICAL_CHERRY_SLAB))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ChiseledBlocks.PALE_OAK_TRIM, 2)
                        .pattern(" # ")
                        .pattern(" 0 ")
                        .pattern(" # ")
                        .input('#', Blocks.PALE_OAK_SLAB)
                        .input('0', Blocks.PALE_OAK_PLANKS)
                        .criterion(hasItem(ChiseledBlocks.PALE_OAK_TRIM), conditionsFromItem(ChiseledBlocks.PALE_OAK_TRIM))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ChiseledBlocks.VERTICAL_PALE_OAK_PLANKS, 3)
                        .pattern(" # ")
                        .pattern(" # ")
                        .pattern(" # ")
                        .input('#', Blocks.PALE_OAK_PLANKS)
                        .criterion(hasItem(ChiseledBlocks.VERTICAL_PALE_OAK_PLANKS), conditionsFromItem(ChiseledBlocks.VERTICAL_PALE_OAK_PLANKS))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ChiseledBlocks.VERTICAL_PALE_OAK_STAIRS, 4)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .input('#', ChiseledBlocks.VERTICAL_PALE_OAK_PLANKS)
                        .criterion(hasItem(ChiseledBlocks.VERTICAL_PALE_OAK_STAIRS), conditionsFromItem(ChiseledBlocks.VERTICAL_PALE_OAK_STAIRS))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ChiseledBlocks.VERTICAL_PALE_OAK_SLAB, 6)
                        .pattern("   ")
                        .pattern("###")
                        .pattern("   ")
                        .input('#', ChiseledBlocks.VERTICAL_PALE_OAK_PLANKS)
                        .criterion(hasItem(ChiseledBlocks.VERTICAL_PALE_OAK_SLAB), conditionsFromItem(ChiseledBlocks.VERTICAL_PALE_OAK_SLAB))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ChiseledBlocks.BAMBOO_TRIM, 2)
                        .pattern(" # ")
                        .pattern(" 0 ")
                        .pattern(" # ")
                        .input('#', Blocks.BAMBOO_SLAB)
                        .input('0', Blocks.BAMBOO_PLANKS)
                        .criterion(hasItem(ChiseledBlocks.BAMBOO_TRIM), conditionsFromItem(ChiseledBlocks.BAMBOO_TRIM))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ChiseledBlocks.VERTICAL_BAMBOO_PLANKS, 3)
                        .pattern(" # ")
                        .pattern(" # ")
                        .pattern(" # ")
                        .input('#', Blocks.BAMBOO_PLANKS)
                        .criterion(hasItem(ChiseledBlocks.VERTICAL_BAMBOO_PLANKS), conditionsFromItem(ChiseledBlocks.VERTICAL_BAMBOO_PLANKS))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ChiseledBlocks.VERTICAL_BAMBOO_STAIRS, 4)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .input('#', ChiseledBlocks.VERTICAL_BAMBOO_PLANKS)
                        .criterion(hasItem(ChiseledBlocks.VERTICAL_BAMBOO_STAIRS), conditionsFromItem(ChiseledBlocks.VERTICAL_BAMBOO_STAIRS))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ChiseledBlocks.VERTICAL_BAMBOO_SLAB, 6)
                        .pattern("   ")
                        .pattern("###")
                        .pattern("   ")
                        .input('#', ChiseledBlocks.VERTICAL_BAMBOO_PLANKS)
                        .criterion(hasItem(ChiseledBlocks.VERTICAL_BAMBOO_SLAB), conditionsFromItem(ChiseledBlocks.VERTICAL_BAMBOO_SLAB))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ChiseledBlocks.CRIMSON_TRIM, 2)
                        .pattern(" # ")
                        .pattern(" 0 ")
                        .pattern(" # ")
                        .input('#', Blocks.CRIMSON_SLAB)
                        .input('0', Blocks.CRIMSON_PLANKS)
                        .criterion(hasItem(ChiseledBlocks.CRIMSON_TRIM), conditionsFromItem(ChiseledBlocks.CRIMSON_TRIM))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ChiseledBlocks.VERTICAL_CRIMSON_PLANKS, 3)
                        .pattern(" # ")
                        .pattern(" # ")
                        .pattern(" # ")
                        .input('#', Blocks.CRIMSON_PLANKS)
                        .criterion(hasItem(ChiseledBlocks.VERTICAL_CRIMSON_PLANKS), conditionsFromItem(ChiseledBlocks.VERTICAL_CRIMSON_PLANKS))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ChiseledBlocks.VERTICAL_CRIMSON_STAIRS, 4)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .input('#', ChiseledBlocks.VERTICAL_CRIMSON_PLANKS)
                        .criterion(hasItem(ChiseledBlocks.VERTICAL_CRIMSON_STAIRS), conditionsFromItem(ChiseledBlocks.VERTICAL_CRIMSON_STAIRS))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ChiseledBlocks.VERTICAL_CRIMSON_SLAB, 6)
                        .pattern("   ")
                        .pattern("###")
                        .pattern("   ")
                        .input('#', ChiseledBlocks.VERTICAL_CRIMSON_PLANKS)
                        .criterion(hasItem(ChiseledBlocks.VERTICAL_CRIMSON_SLAB), conditionsFromItem(ChiseledBlocks.VERTICAL_CRIMSON_SLAB))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ChiseledBlocks.WARPED_TRIM, 2)
                        .pattern(" # ")
                        .pattern(" 0 ")
                        .pattern(" # ")
                        .input('#', Blocks.WARPED_SLAB)
                        .input('0', Blocks.WARPED_PLANKS)
                        .criterion(hasItem(ChiseledBlocks.WARPED_TRIM), conditionsFromItem(ChiseledBlocks.WARPED_TRIM))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ChiseledBlocks.VERTICAL_WARPED_PLANKS, 3)
                        .pattern(" # ")
                        .pattern(" # ")
                        .pattern(" # ")
                        .input('#', Blocks.WARPED_PLANKS)
                        .criterion(hasItem(ChiseledBlocks.VERTICAL_WARPED_PLANKS), conditionsFromItem(ChiseledBlocks.VERTICAL_WARPED_PLANKS))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ChiseledBlocks.VERTICAL_WARPED_STAIRS, 4)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .input('#', ChiseledBlocks.VERTICAL_WARPED_PLANKS)
                        .criterion(hasItem(ChiseledBlocks.VERTICAL_WARPED_STAIRS), conditionsFromItem(ChiseledBlocks.VERTICAL_WARPED_STAIRS))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ChiseledBlocks.VERTICAL_WARPED_SLAB, 6)
                        .pattern("   ")
                        .pattern("###")
                        .pattern("   ")
                        .input('#', ChiseledBlocks.VERTICAL_WARPED_PLANKS)
                        .criterion(hasItem(ChiseledBlocks.VERTICAL_WARPED_SLAB), conditionsFromItem(ChiseledBlocks.VERTICAL_WARPED_SLAB))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, ChiseledBlocks.STONE_WALL, 6)
                        .pattern("   ")
                        .pattern("###")
                        .pattern("###")
                        .input('#', Blocks.STONE)
                        .criterion(hasItem(ChiseledBlocks.STONE_WALL), conditionsFromItem(ChiseledBlocks.STONE_WALL))
                        .offerTo(exporter);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.STONE_WALL, Blocks.STONE);
                createShaped(RecipeCategory.MISC, ChiseledBlocks.POLISHED_STONE, 4)
                        .pattern("## ")
                        .pattern("## ")
                        .pattern("   ")
                        .input('#', Blocks.STONE)
                        .criterion(hasItem(ChiseledBlocks.POLISHED_STONE), conditionsFromItem(ChiseledBlocks.POLISHED_STONE))
                        .offerTo(exporter);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_STONE, Blocks.STONE);
                createShaped(RecipeCategory.MISC, ChiseledBlocks.POLISHED_STONE_STAIRS, 4)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .input('#', ChiseledBlocks.POLISHED_STONE)
                        .criterion(hasItem(ChiseledBlocks.POLISHED_STONE_STAIRS), conditionsFromItem(ChiseledBlocks.POLISHED_STONE_STAIRS))
                        .offerTo(exporter);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_STONE_STAIRS, Blocks.STONE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_STONE_STAIRS, ChiseledBlocks.POLISHED_STONE);
                createShaped(RecipeCategory.MISC, ChiseledBlocks.POLISHED_STONE_SLAB, 6)
                        .pattern("   ")
                        .pattern("###")
                        .pattern("   ")
                        .input('#', ChiseledBlocks.POLISHED_STONE)
                        .criterion(hasItem(ChiseledBlocks.POLISHED_STONE_SLAB), conditionsFromItem(ChiseledBlocks.POLISHED_STONE_SLAB))
                        .offerTo(exporter);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_STONE_SLAB, Blocks.STONE,2);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_STONE_SLAB, ChiseledBlocks.POLISHED_STONE,2);
                createShaped(RecipeCategory.MISC, ChiseledBlocks.POLISHED_STONE_WALL, 6)
                        .pattern("   ")
                        .pattern("###")
                        .pattern("###")
                        .input('#', ChiseledBlocks.POLISHED_STONE)
                        .criterion(hasItem(ChiseledBlocks.POLISHED_STONE_WALL), conditionsFromItem(ChiseledBlocks.POLISHED_STONE_WALL))
                        .offerTo(exporter);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_STONE_WALL, Blocks.STONE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_STONE_WALL, ChiseledBlocks.POLISHED_STONE);
                createShapeless(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MOSSY_POLISHED_STONE)
                        .input(ChiseledBlocks.POLISHED_STONE)
                        .input(Blocks.MOSS_BLOCK)
                        .criterion(hasItem(ChiseledBlocks.MOSSY_POLISHED_STONE), conditionsFromItem(ChiseledBlocks.MOSSY_POLISHED_STONE))
                        .offerTo(exporter, "mossy_polished_stone_from_moss");
                createShapeless(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MOSSY_POLISHED_STONE)
                        .input(ChiseledBlocks.POLISHED_STONE)
                        .input(Blocks.VINE)
                        .criterion(hasItem(ChiseledBlocks.MOSSY_POLISHED_STONE), conditionsFromItem(ChiseledBlocks.MOSSY_POLISHED_STONE))
                        .offerTo(exporter, "mossy_polished_stone_from_vine");
                createShaped(RecipeCategory.MISC, ChiseledBlocks.MOSSY_POLISHED_STONE_STAIRS, 4)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .input('#', ChiseledBlocks.MOSSY_POLISHED_STONE)
                        .criterion(hasItem(ChiseledBlocks.MOSSY_POLISHED_STONE_STAIRS), conditionsFromItem(ChiseledBlocks.MOSSY_POLISHED_STONE_STAIRS))
                        .offerTo(exporter);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MOSSY_POLISHED_STONE_STAIRS, ChiseledBlocks.MOSSY_POLISHED_STONE);
                createShaped(RecipeCategory.MISC, ChiseledBlocks.MOSSY_POLISHED_STONE_SLAB, 6)
                        .pattern("   ")
                        .pattern("###")
                        .pattern("   ")
                        .input('#', ChiseledBlocks.MOSSY_POLISHED_STONE)
                        .criterion(hasItem(ChiseledBlocks.MOSSY_POLISHED_STONE_SLAB), conditionsFromItem(ChiseledBlocks.MOSSY_POLISHED_STONE_SLAB))
                        .offerTo(exporter);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MOSSY_POLISHED_STONE_SLAB, ChiseledBlocks.MOSSY_POLISHED_STONE,2);
                createShaped(RecipeCategory.MISC, ChiseledBlocks.MOSSY_POLISHED_STONE_WALL, 6)
                        .pattern("   ")
                        .pattern("###")
                        .pattern("###")
                        .input('#', ChiseledBlocks.MOSSY_POLISHED_STONE)
                        .criterion(hasItem(ChiseledBlocks.MOSSY_POLISHED_STONE_WALL), conditionsFromItem(ChiseledBlocks.MOSSY_POLISHED_STONE_WALL))
                        .offerTo(exporter);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MOSSY_POLISHED_STONE_WALL, ChiseledBlocks.MOSSY_POLISHED_STONE);
                createShaped(RecipeCategory.MISC, ChiseledBlocks.SMOOTH_STONE_STAIRS, 4)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .input('#', Blocks.SMOOTH_STONE)
                        .criterion(hasItem(ChiseledBlocks.SMOOTH_STONE_STAIRS), conditionsFromItem(ChiseledBlocks.SMOOTH_STONE_STAIRS))
                        .offerTo(exporter);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.SMOOTH_STONE_STAIRS, Blocks.SMOOTH_STONE);

                createShaped(RecipeCategory.MISC, Blocks.STONE_BRICKS, 4)
                        .pattern("## ")
                        .pattern("## ")
                        .pattern("   ")
                        .input('#', ChiseledBlocks.POLISHED_STONE)
                        .criterion(hasItem(Blocks.STONE_BRICKS), conditionsFromItem(Blocks.STONE_BRICKS))
                        .offerTo(exporter);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.STONE_BRICKS, ChiseledBlocks.POLISHED_STONE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.STONE_BRICK_STAIRS, ChiseledBlocks.POLISHED_STONE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.STONE_BRICK_SLAB, ChiseledBlocks.POLISHED_STONE, 2);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.STONE_BRICK_WALL, ChiseledBlocks.POLISHED_STONE);
            }
        };
    }

    @Override
    public String getName() {
        return "Chiseled Recipes";
    }
}