package net.hyper.chiseled.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.hyper.chiseled.registry.ChiseledBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
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
            }
        };
    }

    @Override
    public String getName() {
        return "Chiseled Recipes";
    }
}
