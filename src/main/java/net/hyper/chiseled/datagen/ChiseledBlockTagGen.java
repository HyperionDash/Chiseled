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
                .add(ChiseledBlocks.VERTICAL_OAK_SLAB)
                .add(ChiseledBlocks.SPRUCE_TRIM)
                .add(ChiseledBlocks.VERTICAL_SPRUCE_PLANKS)
                .add(ChiseledBlocks.VERTICAL_SPRUCE_STAIRS)
                .add(ChiseledBlocks.VERTICAL_SPRUCE_SLAB)
                .add(ChiseledBlocks.BIRCH_TRIM)
                .add(ChiseledBlocks.VERTICAL_BIRCH_PLANKS)
                .add(ChiseledBlocks.VERTICAL_BIRCH_STAIRS)
                .add(ChiseledBlocks.VERTICAL_BIRCH_SLAB)
                .add(ChiseledBlocks.JUNGLE_TRIM)
                .add(ChiseledBlocks.VERTICAL_JUNGLE_PLANKS)
                .add(ChiseledBlocks.VERTICAL_JUNGLE_STAIRS)
                .add(ChiseledBlocks.VERTICAL_JUNGLE_SLAB)
                .add(ChiseledBlocks.ACACIA_TRIM)
                .add(ChiseledBlocks.VERTICAL_ACACIA_PLANKS)
                .add(ChiseledBlocks.VERTICAL_ACACIA_STAIRS)
                .add(ChiseledBlocks.VERTICAL_ACACIA_SLAB)
                .add(ChiseledBlocks.DARK_OAK_TRIM)
                .add(ChiseledBlocks.VERTICAL_DARK_OAK_PLANKS)
                .add(ChiseledBlocks.VERTICAL_DARK_OAK_STAIRS)
                .add(ChiseledBlocks.VERTICAL_DARK_OAK_SLAB)
                .add(ChiseledBlocks.MANGROVE_TRIM)
                .add(ChiseledBlocks.VERTICAL_MANGROVE_PLANKS)
                .add(ChiseledBlocks.VERTICAL_MANGROVE_STAIRS)
                .add(ChiseledBlocks.VERTICAL_MANGROVE_SLAB)
                .add(ChiseledBlocks.CHERRY_TRIM)
                .add(ChiseledBlocks.VERTICAL_CHERRY_PLANKS)
                .add(ChiseledBlocks.VERTICAL_CHERRY_STAIRS)
                .add(ChiseledBlocks.VERTICAL_CHERRY_SLAB)
                .add(ChiseledBlocks.PALE_OAK_TRIM)
                .add(ChiseledBlocks.VERTICAL_PALE_OAK_PLANKS)
                .add(ChiseledBlocks.VERTICAL_PALE_OAK_STAIRS)
                .add(ChiseledBlocks.VERTICAL_PALE_OAK_SLAB)
                .add(ChiseledBlocks.BAMBOO_TRIM)
                .add(ChiseledBlocks.VERTICAL_BAMBOO_PLANKS)
                .add(ChiseledBlocks.VERTICAL_BAMBOO_STAIRS)
                .add(ChiseledBlocks.VERTICAL_BAMBOO_SLAB)
                .add(ChiseledBlocks.CRIMSON_TRIM)
                .add(ChiseledBlocks.VERTICAL_CRIMSON_PLANKS)
                .add(ChiseledBlocks.VERTICAL_CRIMSON_STAIRS)
                .add(ChiseledBlocks.VERTICAL_CRIMSON_SLAB)
                .add(ChiseledBlocks.WARPED_TRIM)
                .add(ChiseledBlocks.VERTICAL_WARPED_PLANKS)
                .add(ChiseledBlocks.VERTICAL_WARPED_STAIRS)
                .add(ChiseledBlocks.VERTICAL_WARPED_SLAB);

        valueLookupBuilder(BlockTags.STAIRS)
                .add(ChiseledBlocks.VERTICAL_OAK_STAIRS)
                .add(ChiseledBlocks.VERTICAL_SPRUCE_STAIRS)
                .add(ChiseledBlocks.VERTICAL_BIRCH_STAIRS)
                .add(ChiseledBlocks.VERTICAL_JUNGLE_STAIRS)
                .add(ChiseledBlocks.VERTICAL_ACACIA_STAIRS)
                .add(ChiseledBlocks.VERTICAL_DARK_OAK_STAIRS)
                .add(ChiseledBlocks.VERTICAL_MANGROVE_STAIRS)
                .add(ChiseledBlocks.VERTICAL_CHERRY_STAIRS)
                .add(ChiseledBlocks.VERTICAL_PALE_OAK_STAIRS)
                .add(ChiseledBlocks.VERTICAL_BAMBOO_STAIRS)
                .add(ChiseledBlocks.VERTICAL_CRIMSON_STAIRS)
                .add(ChiseledBlocks.VERTICAL_WARPED_STAIRS);
        valueLookupBuilder(BlockTags.WOODEN_STAIRS)
                .add(ChiseledBlocks.VERTICAL_OAK_STAIRS)
                .add(ChiseledBlocks.VERTICAL_SPRUCE_STAIRS)
                .add(ChiseledBlocks.VERTICAL_BIRCH_STAIRS)
                .add(ChiseledBlocks.VERTICAL_JUNGLE_STAIRS)
                .add(ChiseledBlocks.VERTICAL_ACACIA_STAIRS)
                .add(ChiseledBlocks.VERTICAL_DARK_OAK_STAIRS)
                .add(ChiseledBlocks.VERTICAL_MANGROVE_STAIRS)
                .add(ChiseledBlocks.VERTICAL_CHERRY_STAIRS)
                .add(ChiseledBlocks.VERTICAL_PALE_OAK_STAIRS)
                .add(ChiseledBlocks.VERTICAL_BAMBOO_STAIRS)
                .add(ChiseledBlocks.VERTICAL_CRIMSON_STAIRS)
                .add(ChiseledBlocks.VERTICAL_WARPED_STAIRS);

        valueLookupBuilder(BlockTags.SLABS)
                .add(ChiseledBlocks.VERTICAL_OAK_SLAB)
                .add(ChiseledBlocks.VERTICAL_SPRUCE_SLAB)
                .add(ChiseledBlocks.VERTICAL_BIRCH_SLAB)
                .add(ChiseledBlocks.VERTICAL_JUNGLE_SLAB)
                .add(ChiseledBlocks.VERTICAL_ACACIA_SLAB)
                .add(ChiseledBlocks.VERTICAL_DARK_OAK_SLAB)
                .add(ChiseledBlocks.VERTICAL_MANGROVE_SLAB)
                .add(ChiseledBlocks.VERTICAL_CHERRY_SLAB)
                .add(ChiseledBlocks.VERTICAL_PALE_OAK_SLAB)
                .add(ChiseledBlocks.VERTICAL_BAMBOO_SLAB)
                .add(ChiseledBlocks.VERTICAL_CRIMSON_SLAB)
                .add(ChiseledBlocks.VERTICAL_WARPED_SLAB);
        valueLookupBuilder(BlockTags.WOODEN_SLABS)
                .add(ChiseledBlocks.VERTICAL_OAK_SLAB)
                .add(ChiseledBlocks.VERTICAL_SPRUCE_SLAB)
                .add(ChiseledBlocks.VERTICAL_BIRCH_SLAB)
                .add(ChiseledBlocks.VERTICAL_JUNGLE_SLAB)
                .add(ChiseledBlocks.VERTICAL_ACACIA_SLAB)
                .add(ChiseledBlocks.VERTICAL_DARK_OAK_SLAB)
                .add(ChiseledBlocks.VERTICAL_MANGROVE_SLAB)
                .add(ChiseledBlocks.VERTICAL_CHERRY_SLAB)
                .add(ChiseledBlocks.VERTICAL_PALE_OAK_SLAB)
                .add(ChiseledBlocks.VERTICAL_BAMBOO_SLAB)
                .add(ChiseledBlocks.VERTICAL_CRIMSON_SLAB)
                .add(ChiseledBlocks.VERTICAL_WARPED_SLAB);

        valueLookupBuilder(BlockTags.PLANKS)
                .add(ChiseledBlocks.VERTICAL_OAK_PLANKS)
                .add(ChiseledBlocks.VERTICAL_SPRUCE_PLANKS)
                .add(ChiseledBlocks.VERTICAL_BIRCH_PLANKS)
                .add(ChiseledBlocks.VERTICAL_JUNGLE_PLANKS)
                .add(ChiseledBlocks.VERTICAL_ACACIA_PLANKS)
                .add(ChiseledBlocks.VERTICAL_DARK_OAK_PLANKS)
                .add(ChiseledBlocks.VERTICAL_MANGROVE_PLANKS)
                .add(ChiseledBlocks.VERTICAL_CHERRY_PLANKS)
                .add(ChiseledBlocks.VERTICAL_PALE_OAK_PLANKS)
                .add(ChiseledBlocks.VERTICAL_BAMBOO_PLANKS)
                .add(ChiseledBlocks.VERTICAL_CRIMSON_PLANKS)
                .add(ChiseledBlocks.VERTICAL_WARPED_PLANKS);
    }
}