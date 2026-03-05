package net.hyper.chiseled.datagen;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.hyper.chiseled.registry.ChiseledBlocks;
import net.minecraft.client.data.*;
import net.minecraft.util.Identifier;

public class ChiseledModelGen extends FabricModelProvider {
    public ChiseledModelGen(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool verticalOakPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ChiseledBlocks.VERTICAL_OAK_PLANKS);
        verticalOakPool.stairs(ChiseledBlocks.VERTICAL_OAK_STAIRS);
        verticalOakPool.slab(ChiseledBlocks.VERTICAL_OAK_SLAB);
        BlockStateModelGenerator.BlockTexturePool verticalSprucePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ChiseledBlocks.VERTICAL_SPRUCE_PLANKS);
        verticalSprucePool.stairs(ChiseledBlocks.VERTICAL_SPRUCE_STAIRS);
        verticalSprucePool.slab(ChiseledBlocks.VERTICAL_SPRUCE_SLAB);
        BlockStateModelGenerator.BlockTexturePool verticalBirchPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ChiseledBlocks.VERTICAL_BIRCH_PLANKS);
        verticalBirchPool.stairs(ChiseledBlocks.VERTICAL_BIRCH_STAIRS);
        verticalBirchPool.slab(ChiseledBlocks.VERTICAL_BIRCH_SLAB);
        BlockStateModelGenerator.BlockTexturePool verticalJunglePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ChiseledBlocks.VERTICAL_JUNGLE_PLANKS);
        verticalJunglePool.stairs(ChiseledBlocks.VERTICAL_JUNGLE_STAIRS);
        verticalJunglePool.slab(ChiseledBlocks.VERTICAL_JUNGLE_SLAB);
        BlockStateModelGenerator.BlockTexturePool verticalAcaciaPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ChiseledBlocks.VERTICAL_ACACIA_PLANKS);
        verticalAcaciaPool.stairs(ChiseledBlocks.VERTICAL_ACACIA_STAIRS);
        verticalAcaciaPool.slab(ChiseledBlocks.VERTICAL_ACACIA_SLAB);
        BlockStateModelGenerator.BlockTexturePool verticalDark_OakPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ChiseledBlocks.VERTICAL_DARK_OAK_PLANKS);
        verticalDark_OakPool.stairs(ChiseledBlocks.VERTICAL_DARK_OAK_STAIRS);
        verticalDark_OakPool.slab(ChiseledBlocks.VERTICAL_DARK_OAK_SLAB);
        BlockStateModelGenerator.BlockTexturePool verticalMangrovePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ChiseledBlocks.VERTICAL_MANGROVE_PLANKS);
        verticalMangrovePool.stairs(ChiseledBlocks.VERTICAL_MANGROVE_STAIRS);
        verticalMangrovePool.slab(ChiseledBlocks.VERTICAL_MANGROVE_SLAB);
        BlockStateModelGenerator.BlockTexturePool verticalCherryPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ChiseledBlocks.VERTICAL_CHERRY_PLANKS);
        verticalCherryPool.stairs(ChiseledBlocks.VERTICAL_CHERRY_STAIRS);
        verticalCherryPool.slab(ChiseledBlocks.VERTICAL_CHERRY_SLAB);
        BlockStateModelGenerator.BlockTexturePool verticalPale_OakPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ChiseledBlocks.VERTICAL_PALE_OAK_PLANKS);
        verticalPale_OakPool.stairs(ChiseledBlocks.VERTICAL_PALE_OAK_STAIRS);
        verticalPale_OakPool.slab(ChiseledBlocks.VERTICAL_PALE_OAK_SLAB);
        BlockStateModelGenerator.BlockTexturePool verticalBambooPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ChiseledBlocks.VERTICAL_BAMBOO_PLANKS);
        verticalBambooPool.stairs(ChiseledBlocks.VERTICAL_BAMBOO_STAIRS);
        verticalBambooPool.slab(ChiseledBlocks.VERTICAL_BAMBOO_SLAB);
        BlockStateModelGenerator.BlockTexturePool verticalCrimsonPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ChiseledBlocks.VERTICAL_CRIMSON_PLANKS);
        verticalCrimsonPool.stairs(ChiseledBlocks.VERTICAL_CRIMSON_STAIRS);
        verticalCrimsonPool.slab(ChiseledBlocks.VERTICAL_CRIMSON_SLAB);
        BlockStateModelGenerator.BlockTexturePool verticalWarpedPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ChiseledBlocks.VERTICAL_WARPED_PLANKS);
        verticalWarpedPool.stairs(ChiseledBlocks.VERTICAL_WARPED_STAIRS);
        verticalWarpedPool.slab(ChiseledBlocks.VERTICAL_WARPED_SLAB);

        final TextureMap stoneWall = TextureMap.all(Identifier.ofVanilla("block/stone"));
        final Identifier stoneWallPost = Models.TEMPLATE_WALL_POST.upload(ChiseledBlocks.STONE_WALL, stoneWall, blockStateModelGenerator.modelCollector);
        final Identifier stoneWallSide = Models.TEMPLATE_WALL_SIDE.upload(ChiseledBlocks.STONE_WALL, stoneWall, blockStateModelGenerator.modelCollector);
        final Identifier stoneWallSideTall = Models.TEMPLATE_WALL_SIDE_TALL.upload(ChiseledBlocks.STONE_WALL, stoneWall, blockStateModelGenerator.modelCollector);
        final Identifier stoneWallInventory = Models.WALL_INVENTORY.upload(ChiseledBlocks.STONE_WALL, stoneWall, blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.blockStateCollector.accept(
                BlockStateModelGenerator.createWallBlockState(ChiseledBlocks.STONE_WALL,
                        BlockStateModelGenerator.createWeightedVariant(stoneWallPost),
                        BlockStateModelGenerator.createWeightedVariant(stoneWallSide),
                        BlockStateModelGenerator.createWeightedVariant(stoneWallSideTall)));
        blockStateModelGenerator.registerParentedItemModel(ChiseledBlocks.STONE_WALL, stoneWallInventory);
        BlockStateModelGenerator.BlockTexturePool polishedStonePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ChiseledBlocks.POLISHED_STONE);
        polishedStonePool.stairs(ChiseledBlocks.POLISHED_STONE_STAIRS);
        polishedStonePool.slab(ChiseledBlocks.POLISHED_STONE_SLAB);
        polishedStonePool.wall(ChiseledBlocks.POLISHED_STONE_WALL);
        BlockStateModelGenerator.BlockTexturePool mossyPolishedStonePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ChiseledBlocks.MOSSY_POLISHED_STONE);
        mossyPolishedStonePool.stairs(ChiseledBlocks.MOSSY_POLISHED_STONE_STAIRS);
        mossyPolishedStonePool.slab(ChiseledBlocks.MOSSY_POLISHED_STONE_SLAB);
        mossyPolishedStonePool.wall(ChiseledBlocks.MOSSY_POLISHED_STONE_WALL);
        final TextureMap smoothStone = TextureMap.all(Identifier.ofVanilla("block/smooth_stone"));
        final Identifier smoothStoneStairs = Models.STAIRS.upload(ChiseledBlocks.SMOOTH_STONE_STAIRS, smoothStone, blockStateModelGenerator.modelCollector);
        final Identifier innerSmoothStoneStairs = Models.INNER_STAIRS.upload(ChiseledBlocks.SMOOTH_STONE_STAIRS, smoothStone, blockStateModelGenerator.modelCollector);
        final Identifier outerSmoothStoneStairs = Models.OUTER_STAIRS.upload(ChiseledBlocks.SMOOTH_STONE_STAIRS, smoothStone, blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.blockStateCollector.accept(
                BlockStateModelGenerator.createStairsBlockState(ChiseledBlocks.SMOOTH_STONE_STAIRS,
                        BlockStateModelGenerator.createWeightedVariant(innerSmoothStoneStairs),
                        BlockStateModelGenerator.createWeightedVariant(smoothStoneStairs),
                        BlockStateModelGenerator.createWeightedVariant(outerSmoothStoneStairs)));
        blockStateModelGenerator.registerParentedItemModel(ChiseledBlocks.SMOOTH_STONE_STAIRS, smoothStoneStairs);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
    }
}