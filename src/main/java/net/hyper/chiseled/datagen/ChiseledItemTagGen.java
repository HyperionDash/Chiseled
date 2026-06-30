package net.hyper.chiseled.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.hyper.chiseled.refrence.ChiseledBlockItemIds;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.ItemTags;
import java.util.concurrent.CompletableFuture;

public class ChiseledItemTagGen extends FabricTagsProvider.ItemTagsProvider {
    public ChiseledItemTagGen(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider wrapperLookup) {
        builder(ItemTags.WALLS)
                .add(ChiseledBlockItemIds.STONE_WALL)
                .add(ChiseledBlockItemIds.POLISHED_STONE_WALL)
                .add(ChiseledBlockItemIds.STONE_TILE_WALL)
                .add(ChiseledBlockItemIds.MOSSY_STONE_TILE_WALL)
                .add(ChiseledBlockItemIds.POLISHED_GRANITE_WALL)
                .add(ChiseledBlockItemIds.POLISHED_GRANITE_BRICK_WALL)
                .add(ChiseledBlockItemIds.POLISHED_GRANITE_TILE_WALL)
                .add(ChiseledBlockItemIds.POLISHED_DIORITE_WALL)
                .add(ChiseledBlockItemIds.POLISHED_DIORITE_BRICK_WALL)
                .add(ChiseledBlockItemIds.POLISHED_DIORITE_TILE_WALL)
                .add(ChiseledBlockItemIds.POLISHED_ANDESITE_WALL)
                .add(ChiseledBlockItemIds.POLISHED_ANDESITE_BRICK_WALL)
                .add(ChiseledBlockItemIds.POLISHED_ANDESITE_TILE_WALL)
                .add(ChiseledBlockItemIds.CALCITE_WALL)
                .add(ChiseledBlockItemIds.POLISHED_CALCITE_WALL)
                .add(ChiseledBlockItemIds.CALCITE_BRICK_WALL)
                .add(ChiseledBlockItemIds.CALCITE_TILE_WALL)
                .add(ChiseledBlockItemIds.DRIPSTONE_WALL)
                .add(ChiseledBlockItemIds.POLISHED_DRIPSTONE_WALL)
                .add(ChiseledBlockItemIds.DRIPSTONE_BRICK_WALL)
                .add(ChiseledBlockItemIds.DRIPSTONE_TILE_WALL)
                .add(ChiseledBlockItemIds.MIXED_BRICK_WALL)
                .add(ChiseledBlockItemIds.MOSSY_BRICK_WALL)
                .add(ChiseledBlockItemIds.PACKED_MUD_WALL)
                .add(ChiseledBlockItemIds.POLISHED_MUD_WALL)
                .add(ChiseledBlockItemIds.MOSSY_MUD_BRICK_WALL)
                .add(ChiseledBlockItemIds.MUD_TILE_WALL)
                .add(ChiseledBlockItemIds.MOSSY_MUD_TILE_WALL)
                .add(ChiseledBlockItemIds.HONEYCOMB_WALL)
                .add(ChiseledBlockItemIds.HONEYCOMB_BRICK_WALL)
                .add(ChiseledBlockItemIds.HONEYCOMB_TILE_WALL)
                .add(ChiseledBlockItemIds.SMOOTH_SANDSTONE_WALL)
                .add(ChiseledBlockItemIds.SANDSTONE_BRICK_WALL)
                .add(ChiseledBlockItemIds.SANDSTONE_TILE_WALL)
                .add(ChiseledBlockItemIds.SMOOTH_RED_SANDSTONE_WALL)
                .add(ChiseledBlockItemIds.RED_SANDSTONE_BRICK_WALL)
                .add(ChiseledBlockItemIds.RED_SANDSTONE_TILE_WALL)
                .add(ChiseledBlockItemIds.CINNABAR_TILE_WALL)
                .add(ChiseledBlockItemIds.SULFUR_TILE_WALL)
                .add(ChiseledBlockItemIds.PRISMARINE_BRICK_WALL)
                .add(ChiseledBlockItemIds.DARK_PRISMARINE_WALL)
                .add(ChiseledBlockItemIds.DARK_PRISMARINE_BRICK_WALL)
                .add(ChiseledBlockItemIds.TERRACOTTA_BRICK_WALL)
                .add(ChiseledBlockItemIds.WHITE_TERRACOTTA_BRICK_WALL)
                .add(ChiseledBlockItemIds.LIGHT_GRAY_TERRACOTTA_BRICK_WALL)
                .add(ChiseledBlockItemIds.GRAY_TERRACOTTA_BRICK_WALL)
                .add(ChiseledBlockItemIds.BLACK_TERRACOTTA_BRICK_WALL)
                .add(ChiseledBlockItemIds.BROWN_TERRACOTTA_BRICK_WALL)
                .add(ChiseledBlockItemIds.RED_TERRACOTTA_BRICK_WALL)
                .add(ChiseledBlockItemIds.ORANGE_TERRACOTTA_BRICK_WALL)
                .add(ChiseledBlockItemIds.YELLOW_TERRACOTTA_BRICK_WALL)
                .add(ChiseledBlockItemIds.LIME_TERRACOTTA_BRICK_WALL)
                .add(ChiseledBlockItemIds.GREEN_TERRACOTTA_BRICK_WALL)
                .add(ChiseledBlockItemIds.CYAN_TERRACOTTA_BRICK_WALL)
                .add(ChiseledBlockItemIds.LIGHT_BLUE_TERRACOTTA_BRICK_WALL)
                .add(ChiseledBlockItemIds.BLUE_TERRACOTTA_BRICK_WALL)
                .add(ChiseledBlockItemIds.PURPLE_TERRACOTTA_BRICK_WALL)
                .add(ChiseledBlockItemIds.MAGENTA_TERRACOTTA_BRICK_WALL)
                .add(ChiseledBlockItemIds.PINK_TERRACOTTA_BRICK_WALL)
                .add(ChiseledBlockItemIds.SMOOTH_BASALT_WALL)
                .add(ChiseledBlockItemIds.BASALT_BRICK_WALL)
                .add(ChiseledBlockItemIds.BASALT_TILE_WALL)
                .add(ChiseledBlockItemIds.POLISHED_BLACKSTONE_TILE_WALL)
                .add(ChiseledBlockItemIds.END_STONE_WALL)
                .add(ChiseledBlockItemIds.POLISHED_END_STONE_WALL)
                .add(ChiseledBlockItemIds.END_STONE_TILE_WALL)
                .add(ChiseledBlockItemIds.QUARTZ_WALL)
                .add(ChiseledBlockItemIds.SMOOTH_QUARTZ_WALL)
                .add(ChiseledBlockItemIds.QUARTZ_BRICK_WALL)
                .add(ChiseledBlockItemIds.QUARTZ_TILE_WALL)
                .add(ChiseledBlockItemIds.AMETHYST_WALL)
                .add(ChiseledBlockItemIds.AMETHYST_BRICK_WALL)
                .add(ChiseledBlockItemIds.AMETHYST_TILE_WALL);

        builder(ItemTags.STONE_BRICKS)
                .add(ChiseledBlockItemIds.POLISHED_STONE)
                .add(ChiseledBlockItemIds.CUT_STONE_BRICKS)
                .add(ChiseledBlockItemIds.MOSSY_CUT_STONE_BRICKS)
                .add(ChiseledBlockItemIds.CRACKED_CUT_STONE_BRICKS)
                .add(ChiseledBlockItemIds.STONE_TILES)
                .add(ChiseledBlockItemIds.CRACKED_STONE_TILES)
                .add(ChiseledBlockItemIds.MOSSY_STONE_TILES);
    }
}