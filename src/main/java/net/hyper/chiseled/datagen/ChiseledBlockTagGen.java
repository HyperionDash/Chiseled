package net.hyper.chiseled.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.hyper.chiseled.registry.ChiseledBlocks;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ChiseledBlockTagGen extends FabricTagProvider.BlockTagProvider {
    public ChiseledBlockTagGen(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        valueLookupBuilder(BlockTags.AXE_MINEABLE)
                .add(ChiseledBlocks.OAK_TRIM)
                .add(ChiseledBlocks.VERTICAL_OAK_PLANKS)
                .add(ChiseledBlocks.VERTICAL_OAK_STAIRS)
                .add(ChiseledBlocks.VERTICAL_OAK_SLAB);

        valueLookupBuilder(BlockTags.STAIRS)
                .add(ChiseledBlocks.VERTICAL_OAK_STAIRS);
        valueLookupBuilder(BlockTags.WOODEN_STAIRS)
                .add(ChiseledBlocks.VERTICAL_OAK_STAIRS);

        valueLookupBuilder(BlockTags.SLABS)
                .add(ChiseledBlocks.VERTICAL_OAK_SLAB);
        valueLookupBuilder(BlockTags.WOODEN_SLABS)
                .add(ChiseledBlocks.VERTICAL_OAK_SLAB);

        valueLookupBuilder(BlockTags.PLANKS)
                .add(ChiseledBlocks.VERTICAL_OAK_PLANKS);
    }
}