package net.hyper.chiseled.datagen;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.hyper.chiseled.block.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.ItemModelGenerator;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool stoneTilePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.STONE_TILES);
        stoneTilePool.stairs(ModBlocks.STONE_TILES_STAIRS);
        stoneTilePool.slab(ModBlocks.STONE_TILE_SLAB);
        stoneTilePool.wall(ModBlocks.STONE_TILE_WALL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CRACKED_STONE_TILES);

        BlockStateModelGenerator.BlockTexturePool mossyStoneTilePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MOSSY_STONE_TILES);
        mossyStoneTilePool.stairs(ModBlocks.MOSSY_STONE_TILES_STAIRS);
        mossyStoneTilePool.slab(ModBlocks.MOSSY_STONE_TILE_SLAB);
        mossyStoneTilePool.wall(ModBlocks.MOSSY_STONE_TILE_WALL);

        BlockStateModelGenerator.BlockTexturePool smallStoneBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SMALL_STONE_BRICKS);
        smallStoneBrickPool.stairs(ModBlocks.SMALL_STONE_BRICK_STAIRS);
        smallStoneBrickPool.slab(ModBlocks.SMALL_STONE_BRICK_SLAB);
        smallStoneBrickPool.wall(ModBlocks.SMALL_STONE_BRICK_WALL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CRACKED_SMALL_STONE_BRICKS);

        BlockStateModelGenerator.BlockTexturePool mossySmallStoneBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MOSSY_SMALL_STONE_BRICKS);
        mossySmallStoneBrickPool.stairs(ModBlocks.MOSSY_SMALL_STONE_BRICK_STAIRS);
        mossySmallStoneBrickPool.slab(ModBlocks.MOSSY_SMALL_STONE_BRICK_SLAB);
        mossySmallStoneBrickPool.wall(ModBlocks.MOSSY_SMALL_STONE_BRICK_WALL);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CRACKED_CHISELED_STONE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MOSSY_CHISELED_STONE_BRICKS);

        BlockStateModelGenerator.BlockTexturePool stackedStoneBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.STACKED_STONE_BRICKS);
        stackedStoneBrickPool.stairs(ModBlocks.STACKED_STONE_BRICK_STAIRS);
        stackedStoneBrickPool.slab(ModBlocks.STACKED_STONE_BRICK_SLAB);
        stackedStoneBrickPool.wall(ModBlocks.STACKED_STONE_BRICK_WALL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CRACKED_STACKED_STONE_BRICKS);

        BlockStateModelGenerator.BlockTexturePool mossyStackedStoneBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MOSSY_STACKED_STONE_BRICKS);
        mossyStackedStoneBrickPool.stairs(ModBlocks.MOSSY_STACKED_STONE_BRICK_STAIRS);
        mossyStackedStoneBrickPool.slab(ModBlocks.MOSSY_STACKED_STONE_BRICK_SLAB);
        mossyStackedStoneBrickPool.wall(ModBlocks.MOSSY_STACKED_STONE_BRICK_WALL);

        BlockStateModelGenerator.BlockTexturePool polishedStonePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.POLISHED_STONE);
        polishedStonePool.stairs(ModBlocks.POLISHED_STONE_STAIRS);
        polishedStonePool.slab(ModBlocks.POLISHED_STONE_SLAB);
        polishedStonePool.wall(ModBlocks.POLISHED_STONE_WALL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CRACKED_POLISHED_STONE);

        BlockStateModelGenerator.BlockTexturePool mossyPolishedStonePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MOSSY_POLISHED_STONE);
        mossyPolishedStonePool.stairs(ModBlocks.MOSSY_POLISHED_STONE_STAIRS);
        mossyPolishedStonePool.slab(ModBlocks.MOSSY_POLISHED_STONE_SLAB);
        mossyPolishedStonePool.wall(ModBlocks.MOSSY_POLISHED_STONE_WALL);


        BlockStateModelGenerator.BlockTexturePool stonePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.STONE);
        stonePool.wall(ModBlocks.STONE_WALL);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
    }
}
