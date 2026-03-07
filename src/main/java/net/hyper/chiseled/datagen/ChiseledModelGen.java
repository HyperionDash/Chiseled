package net.hyper.chiseled.datagen;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.hyper.chiseled.registry.ChiseledBlocks;
import net.minecraft.client.data.*;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.client.data.models.model.TextureMapping;
import net.minecraft.resources.Identifier;

public class ChiseledModelGen extends FabricModelProvider {
    public ChiseledModelGen(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockStateModelGenerator) {
        BlockModelGenerators.BlockFamilyProvider verticalOakPool = blockStateModelGenerator.family(ChiseledBlocks.VERTICAL_OAK_PLANKS);
        verticalOakPool.stairs(ChiseledBlocks.VERTICAL_OAK_STAIRS);
        verticalOakPool.slab(ChiseledBlocks.VERTICAL_OAK_SLAB);
        BlockModelGenerators.BlockFamilyProvider verticalSprucePool = blockStateModelGenerator.family(ChiseledBlocks.VERTICAL_SPRUCE_PLANKS);
        verticalSprucePool.stairs(ChiseledBlocks.VERTICAL_SPRUCE_STAIRS);
        verticalSprucePool.slab(ChiseledBlocks.VERTICAL_SPRUCE_SLAB);
        BlockModelGenerators.BlockFamilyProvider verticalBirchPool = blockStateModelGenerator.family(ChiseledBlocks.VERTICAL_BIRCH_PLANKS);
        verticalBirchPool.stairs(ChiseledBlocks.VERTICAL_BIRCH_STAIRS);
        verticalBirchPool.slab(ChiseledBlocks.VERTICAL_BIRCH_SLAB);
        BlockModelGenerators.BlockFamilyProvider verticalJunglePool = blockStateModelGenerator.family(ChiseledBlocks.VERTICAL_JUNGLE_PLANKS);
        verticalJunglePool.stairs(ChiseledBlocks.VERTICAL_JUNGLE_STAIRS);
        verticalJunglePool.slab(ChiseledBlocks.VERTICAL_JUNGLE_SLAB);
        BlockModelGenerators.BlockFamilyProvider verticalAcaciaPool = blockStateModelGenerator.family(ChiseledBlocks.VERTICAL_ACACIA_PLANKS);
        verticalAcaciaPool.stairs(ChiseledBlocks.VERTICAL_ACACIA_STAIRS);
        verticalAcaciaPool.slab(ChiseledBlocks.VERTICAL_ACACIA_SLAB);
        BlockModelGenerators.BlockFamilyProvider verticalDark_OakPool = blockStateModelGenerator.family(ChiseledBlocks.VERTICAL_DARK_OAK_PLANKS);
        verticalDark_OakPool.stairs(ChiseledBlocks.VERTICAL_DARK_OAK_STAIRS);
        verticalDark_OakPool.slab(ChiseledBlocks.VERTICAL_DARK_OAK_SLAB);
        BlockModelGenerators.BlockFamilyProvider verticalMangrovePool = blockStateModelGenerator.family(ChiseledBlocks.VERTICAL_MANGROVE_PLANKS);
        verticalMangrovePool.stairs(ChiseledBlocks.VERTICAL_MANGROVE_STAIRS);
        verticalMangrovePool.slab(ChiseledBlocks.VERTICAL_MANGROVE_SLAB);
        BlockModelGenerators.BlockFamilyProvider verticalCherryPool = blockStateModelGenerator.family(ChiseledBlocks.VERTICAL_CHERRY_PLANKS);
        verticalCherryPool.stairs(ChiseledBlocks.VERTICAL_CHERRY_STAIRS);
        verticalCherryPool.slab(ChiseledBlocks.VERTICAL_CHERRY_SLAB);
        BlockModelGenerators.BlockFamilyProvider verticalPale_OakPool = blockStateModelGenerator.family(ChiseledBlocks.VERTICAL_PALE_OAK_PLANKS);
        verticalPale_OakPool.stairs(ChiseledBlocks.VERTICAL_PALE_OAK_STAIRS);
        verticalPale_OakPool.slab(ChiseledBlocks.VERTICAL_PALE_OAK_SLAB);
        BlockModelGenerators.BlockFamilyProvider verticalBambooPool = blockStateModelGenerator.family(ChiseledBlocks.VERTICAL_BAMBOO_PLANKS);
        verticalBambooPool.stairs(ChiseledBlocks.VERTICAL_BAMBOO_STAIRS);
        verticalBambooPool.slab(ChiseledBlocks.VERTICAL_BAMBOO_SLAB);
        BlockModelGenerators.BlockFamilyProvider verticalCrimsonPool = blockStateModelGenerator.family(ChiseledBlocks.VERTICAL_CRIMSON_PLANKS);
        verticalCrimsonPool.stairs(ChiseledBlocks.VERTICAL_CRIMSON_STAIRS);
        verticalCrimsonPool.slab(ChiseledBlocks.VERTICAL_CRIMSON_SLAB);
        BlockModelGenerators.BlockFamilyProvider verticalWarpedPool = blockStateModelGenerator.family(ChiseledBlocks.VERTICAL_WARPED_PLANKS);
        verticalWarpedPool.stairs(ChiseledBlocks.VERTICAL_WARPED_STAIRS);
        verticalWarpedPool.slab(ChiseledBlocks.VERTICAL_WARPED_SLAB);

        final TextureMapping stoneWall = TextureMapping.cube(Identifier.withDefaultNamespace("block/stone"));
        final Identifier stoneWallPost = ModelTemplates.WALL_POST.create(ChiseledBlocks.STONE_WALL, stoneWall, blockStateModelGenerator.modelOutput);
        final Identifier stoneWallSide = ModelTemplates.WALL_LOW_SIDE.create(ChiseledBlocks.STONE_WALL, stoneWall, blockStateModelGenerator.modelOutput);
        final Identifier stoneWallSideTall = ModelTemplates.WALL_TALL_SIDE.create(ChiseledBlocks.STONE_WALL, stoneWall, blockStateModelGenerator.modelOutput);
        final Identifier stoneWallInventory = ModelTemplates.WALL_INVENTORY.create(ChiseledBlocks.STONE_WALL, stoneWall, blockStateModelGenerator.modelOutput);
        blockStateModelGenerator.blockStateOutput.accept(
                BlockModelGenerators.createWall(ChiseledBlocks.STONE_WALL,
                        BlockModelGenerators.plainVariant(stoneWallPost),
                        BlockModelGenerators.plainVariant(stoneWallSide),
                        BlockModelGenerators.plainVariant(stoneWallSideTall)));
        blockStateModelGenerator.registerSimpleItemModel(ChiseledBlocks.STONE_WALL, stoneWallInventory);
        BlockModelGenerators.BlockFamilyProvider polishedStonePool = blockStateModelGenerator.family(ChiseledBlocks.POLISHED_STONE);
        polishedStonePool.stairs(ChiseledBlocks.POLISHED_STONE_STAIRS);
        polishedStonePool.slab(ChiseledBlocks.POLISHED_STONE_SLAB);
        polishedStonePool.wall(ChiseledBlocks.POLISHED_STONE_WALL);
        BlockModelGenerators.BlockFamilyProvider mossyPolishedStonePool = blockStateModelGenerator.family(ChiseledBlocks.MOSSY_POLISHED_STONE);
        mossyPolishedStonePool.stairs(ChiseledBlocks.MOSSY_POLISHED_STONE_STAIRS);
        mossyPolishedStonePool.slab(ChiseledBlocks.MOSSY_POLISHED_STONE_SLAB);
        mossyPolishedStonePool.wall(ChiseledBlocks.MOSSY_POLISHED_STONE_WALL);
        final TextureMapping smoothStone = TextureMapping.cube(Identifier.withDefaultNamespace("block/smooth_stone"));
        final Identifier smoothStoneStairs = ModelTemplates.STAIRS_STRAIGHT.create(ChiseledBlocks.SMOOTH_STONE_STAIRS, smoothStone, blockStateModelGenerator.modelOutput);
        final Identifier innerSmoothStoneStairs = ModelTemplates.STAIRS_INNER.create(ChiseledBlocks.SMOOTH_STONE_STAIRS, smoothStone, blockStateModelGenerator.modelOutput);
        final Identifier outerSmoothStoneStairs = ModelTemplates.STAIRS_OUTER.create(ChiseledBlocks.SMOOTH_STONE_STAIRS, smoothStone, blockStateModelGenerator.modelOutput);
        blockStateModelGenerator.blockStateOutput.accept(
                BlockModelGenerators.createStairs(ChiseledBlocks.SMOOTH_STONE_STAIRS,
                        BlockModelGenerators.plainVariant(innerSmoothStoneStairs),
                        BlockModelGenerators.plainVariant(smoothStoneStairs),
                        BlockModelGenerators.plainVariant(outerSmoothStoneStairs)));
        blockStateModelGenerator.registerSimpleItemModel(ChiseledBlocks.SMOOTH_STONE_STAIRS, smoothStoneStairs);
    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerator) {
    }
}