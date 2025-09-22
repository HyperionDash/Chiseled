package net.hyper.chiseled.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.hyper.chiseled.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        valueLookupBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.STONE_TILES)
                .add(ModBlocks.CRACKED_STONE_TILES)
                .add(ModBlocks.STONE_TILES_STAIRS)
                .add(ModBlocks.STONE_TILE_SLAB)
                .add(ModBlocks.STONE_TILE_WALL)
                .add(ModBlocks.MOSSY_STONE_TILES)
                .add(ModBlocks.MOSSY_STONE_TILES_STAIRS)
                .add(ModBlocks.MOSSY_STONE_TILE_SLAB)
                .add(ModBlocks.MOSSY_STONE_TILE_WALL)
                .add(ModBlocks.SMALL_STONE_BRICKS)
                .add(ModBlocks.CRACKED_SMALL_STONE_BRICKS)
                .add(ModBlocks.SMALL_STONE_BRICK_STAIRS)
                .add(ModBlocks.SMALL_STONE_BRICK_SLAB)
                .add(ModBlocks.SMALL_STONE_BRICK_WALL)
                .add(ModBlocks.MOSSY_SMALL_STONE_BRICKS)
                .add(ModBlocks.MOSSY_SMALL_STONE_BRICK_STAIRS)
                .add(ModBlocks.MOSSY_SMALL_STONE_BRICK_SLAB)
                .add(ModBlocks.MOSSY_SMALL_STONE_BRICK_WALL)
                .add(ModBlocks.CRACKED_CHISELED_STONE_BRICKS)
                .add(ModBlocks.MOSSY_CHISELED_STONE_BRICKS)
                .add(ModBlocks.STACKED_STONE_BRICKS)
                .add(ModBlocks.CRACKED_STACKED_STONE_BRICKS)
                .add(ModBlocks.STACKED_STONE_BRICK_STAIRS)
                .add(ModBlocks.STACKED_STONE_BRICK_SLAB)
                .add(ModBlocks.STACKED_STONE_BRICK_WALL)
                .add(ModBlocks.MOSSY_STACKED_STONE_BRICKS)
                .add(ModBlocks.MOSSY_STACKED_STONE_BRICK_STAIRS)
                .add(ModBlocks.MOSSY_STACKED_STONE_BRICK_SLAB)
                .add(ModBlocks.MOSSY_STACKED_STONE_BRICK_WALL)
                .add(ModBlocks.CRACKED_POLISHED_STONE)
                .add(ModBlocks.POLISHED_STONE)
                .add(ModBlocks.MOSSY_POLISHED_STONE)
                .add(ModBlocks.STONE_WALL)
                .add(ModBlocks.MOSSY_POLISHED_STONE_SLAB)
                .add(ModBlocks.POLISHED_STONE_SLAB)
                .add(ModBlocks.POLISHED_STONE_WALL)
                .add(ModBlocks.MOSSY_POLISHED_STONE_WALL)
                .add(ModBlocks.POLISHED_STONE_STAIRS)
                .add(ModBlocks.MOSSY_POLISHED_STONE_STAIRS)
                ;

        valueLookupBuilder(BlockTags.WALLS)
                .add(ModBlocks.STONE_TILE_WALL)
                .add(ModBlocks.MOSSY_STONE_TILE_WALL)
                .add(ModBlocks.SMALL_STONE_BRICK_WALL)
                .add(ModBlocks.MOSSY_SMALL_STONE_BRICK_WALL)
                .add(ModBlocks.STACKED_STONE_BRICK_WALL)
                .add(ModBlocks.MOSSY_STACKED_STONE_BRICK_WALL)
                .add(ModBlocks.STONE_WALL)
                .add(ModBlocks.POLISHED_STONE_WALL)
                .add(ModBlocks.MOSSY_POLISHED_STONE_WALL)
                ;
    }
}
