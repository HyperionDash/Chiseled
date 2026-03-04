package net.hyper.chiseled.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.hyper.chiseled.registry.ChiseledBlocks;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ChiseledLangGen extends FabricLanguageProvider {
    public ChiseledLangGen (FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    public void generateTranslations(RegistryWrapper.WrapperLookup registryLookup, TranslationBuilder translationBuilder) {
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

        translationBuilder.add("itemgroup.chiseled.chiseled", "Chiseled");
    }
}