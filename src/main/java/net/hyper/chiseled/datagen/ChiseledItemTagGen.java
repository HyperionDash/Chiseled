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
                .add(ChiseledBlocks.VERTICAL_OAK_STAIRS.asItem())
                .add(ChiseledBlocks.VERTICAL_SPRUCE_STAIRS.asItem())
                .add(ChiseledBlocks.VERTICAL_BIRCH_STAIRS.asItem())
                .add(ChiseledBlocks.VERTICAL_JUNGLE_STAIRS.asItem())
                .add(ChiseledBlocks.VERTICAL_ACACIA_STAIRS.asItem())
                .add(ChiseledBlocks.VERTICAL_DARK_OAK_STAIRS.asItem())
                .add(ChiseledBlocks.VERTICAL_MANGROVE_STAIRS.asItem())
                .add(ChiseledBlocks.VERTICAL_CHERRY_STAIRS.asItem())
                .add(ChiseledBlocks.VERTICAL_PALE_OAK_STAIRS.asItem())
                .add(ChiseledBlocks.VERTICAL_BAMBOO_STAIRS.asItem())
                .add(ChiseledBlocks.VERTICAL_CRIMSON_STAIRS.asItem())
                .add(ChiseledBlocks.VERTICAL_WARPED_STAIRS.asItem())
                .add(ChiseledBlocks.POLISHED_STONE_STAIRS.asItem())
                .add(ChiseledBlocks.MOSSY_POLISHED_STONE_STAIRS.asItem())
                .add(ChiseledBlocks.SMOOTH_STONE_STAIRS.asItem());
        valueLookupBuilder(ItemTags.WOODEN_STAIRS)
                .add(ChiseledBlocks.VERTICAL_OAK_STAIRS.asItem())
                .add(ChiseledBlocks.VERTICAL_SPRUCE_STAIRS.asItem())
                .add(ChiseledBlocks.VERTICAL_BIRCH_STAIRS.asItem())
                .add(ChiseledBlocks.VERTICAL_JUNGLE_STAIRS.asItem())
                .add(ChiseledBlocks.VERTICAL_ACACIA_STAIRS.asItem())
                .add(ChiseledBlocks.VERTICAL_DARK_OAK_STAIRS.asItem())
                .add(ChiseledBlocks.VERTICAL_MANGROVE_STAIRS.asItem())
                .add(ChiseledBlocks.VERTICAL_CHERRY_STAIRS.asItem())
                .add(ChiseledBlocks.VERTICAL_PALE_OAK_STAIRS.asItem())
                .add(ChiseledBlocks.VERTICAL_BAMBOO_STAIRS.asItem())
                .add(ChiseledBlocks.VERTICAL_CRIMSON_STAIRS.asItem())
                .add(ChiseledBlocks.VERTICAL_WARPED_STAIRS.asItem());

        valueLookupBuilder(ItemTags.SLABS)
                .add(ChiseledBlocks.VERTICAL_OAK_SLAB.asItem())
                .add(ChiseledBlocks.VERTICAL_SPRUCE_SLAB.asItem())
                .add(ChiseledBlocks.VERTICAL_BIRCH_SLAB.asItem())
                .add(ChiseledBlocks.VERTICAL_JUNGLE_SLAB.asItem())
                .add(ChiseledBlocks.VERTICAL_ACACIA_SLAB.asItem())
                .add(ChiseledBlocks.VERTICAL_DARK_OAK_SLAB.asItem())
                .add(ChiseledBlocks.VERTICAL_MANGROVE_SLAB.asItem())
                .add(ChiseledBlocks.VERTICAL_CHERRY_SLAB.asItem())
                .add(ChiseledBlocks.VERTICAL_PALE_OAK_SLAB.asItem())
                .add(ChiseledBlocks.VERTICAL_BAMBOO_SLAB.asItem())
                .add(ChiseledBlocks.VERTICAL_CRIMSON_SLAB.asItem())
                .add(ChiseledBlocks.VERTICAL_WARPED_SLAB.asItem())
                .add(ChiseledBlocks.POLISHED_STONE_SLAB.asItem())
                .add(ChiseledBlocks.MOSSY_POLISHED_STONE_SLAB.asItem());
        valueLookupBuilder(ItemTags.WOODEN_SLABS)
                .add(ChiseledBlocks.VERTICAL_OAK_SLAB.asItem())
                .add(ChiseledBlocks.VERTICAL_SPRUCE_SLAB.asItem())
                .add(ChiseledBlocks.VERTICAL_BIRCH_SLAB.asItem())
                .add(ChiseledBlocks.VERTICAL_JUNGLE_SLAB.asItem())
                .add(ChiseledBlocks.VERTICAL_ACACIA_SLAB.asItem())
                .add(ChiseledBlocks.VERTICAL_DARK_OAK_SLAB.asItem())
                .add(ChiseledBlocks.VERTICAL_MANGROVE_SLAB.asItem())
                .add(ChiseledBlocks.VERTICAL_CHERRY_SLAB.asItem())
                .add(ChiseledBlocks.VERTICAL_PALE_OAK_SLAB.asItem())
                .add(ChiseledBlocks.VERTICAL_BAMBOO_SLAB.asItem())
                .add(ChiseledBlocks.VERTICAL_CRIMSON_SLAB.asItem())
                .add(ChiseledBlocks.VERTICAL_WARPED_SLAB.asItem());

        valueLookupBuilder(ItemTags.WALLS)
                .add(ChiseledBlocks.STONE_WALL.asItem())
                .add(ChiseledBlocks.POLISHED_STONE_WALL.asItem())
                .add(ChiseledBlocks.MOSSY_POLISHED_STONE_WALL.asItem());

        valueLookupBuilder(ItemTags.PLANKS)
                .add(ChiseledBlocks.VERTICAL_OAK_PLANKS.asItem())
                .add(ChiseledBlocks.VERTICAL_SPRUCE_PLANKS.asItem())
                .add(ChiseledBlocks.VERTICAL_BIRCH_PLANKS.asItem())
                .add(ChiseledBlocks.VERTICAL_JUNGLE_PLANKS.asItem())
                .add(ChiseledBlocks.VERTICAL_ACACIA_PLANKS.asItem())
                .add(ChiseledBlocks.VERTICAL_DARK_OAK_PLANKS.asItem())
                .add(ChiseledBlocks.VERTICAL_MANGROVE_PLANKS.asItem())
                .add(ChiseledBlocks.VERTICAL_CHERRY_PLANKS.asItem())
                .add(ChiseledBlocks.VERTICAL_PALE_OAK_PLANKS.asItem())
                .add(ChiseledBlocks.VERTICAL_BAMBOO_PLANKS.asItem())
                .add(ChiseledBlocks.VERTICAL_CRIMSON_PLANKS.asItem())
                .add(ChiseledBlocks.VERTICAL_WARPED_PLANKS.asItem());

        valueLookupBuilder(ItemTags.NON_FLAMMABLE_WOOD)
                .add(ChiseledBlocks.CRIMSON_TRIM.asItem())
                .add(ChiseledBlocks.VERTICAL_CRIMSON_PLANKS.asItem())
                .add(ChiseledBlocks.VERTICAL_CRIMSON_STAIRS.asItem())
                .add(ChiseledBlocks.VERTICAL_CRIMSON_SLAB.asItem())
                .add(ChiseledBlocks.WARPED_TRIM.asItem())
                .add(ChiseledBlocks.VERTICAL_WARPED_PLANKS.asItem())
                .add(ChiseledBlocks.VERTICAL_WARPED_STAIRS.asItem())
                .add(ChiseledBlocks.VERTICAL_WARPED_SLAB.asItem());
    }
}