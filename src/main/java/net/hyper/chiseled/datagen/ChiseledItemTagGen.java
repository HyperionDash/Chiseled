package net.hyper.chiseled.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.hyper.chiseled.registry.ChiseledBlocks;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ChiseledItemTagGen extends FabricTagProvider.ItemTagProvider {
    public ChiseledItemTagGen(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        valueLookupBuilder(ItemTags.STAIRS)
                .add(ChiseledBlocks.VERTICAL_OAK_STAIRS.asItem());
        valueLookupBuilder(ItemTags.WOODEN_STAIRS)
                .add(ChiseledBlocks.VERTICAL_OAK_STAIRS.asItem());

        valueLookupBuilder(ItemTags.SLABS)
                .add(ChiseledBlocks.VERTICAL_OAK_SLAB.asItem());
        valueLookupBuilder(ItemTags.WOODEN_SLABS)
                .add(ChiseledBlocks.VERTICAL_OAK_SLAB.asItem());

        valueLookupBuilder(ItemTags.PLANKS)
                .add(ChiseledBlocks.VERTICAL_OAK_PLANKS.asItem());
    }
}