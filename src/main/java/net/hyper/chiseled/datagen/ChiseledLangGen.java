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
        // Items
        translationBuilder.add(ChiseledBlocks.OAK_TRIM, "Oak Trim");
        translationBuilder.add(ChiseledBlocks.VERTICAL_OAK_PLANKS, "Vertical Oak Planks");
        translationBuilder.add(ChiseledBlocks.VERTICAL_OAK_STAIRS, "Vertical Oak Stairs");
        translationBuilder.add(ChiseledBlocks.VERTICAL_OAK_SLAB, "Vertical Oak Slab");

        translationBuilder.add("itemgroup.chiseled.chiseled", "Chiseled");
    }
}