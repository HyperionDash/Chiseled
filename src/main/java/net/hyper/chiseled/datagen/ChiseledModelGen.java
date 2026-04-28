package net.hyper.chiseled.datagen;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.hyper.chiseled.registry.ChiseledBlocks;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.client.data.models.model.TextureMapping;
import net.minecraft.resources.Identifier;
import net.minecraft.world.level.block.Blocks;

public class ChiseledModelGen extends FabricModelProvider {
    public ChiseledModelGen(FabricPackOutput output) {
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

        final TextureMapping stoneWall = TextureMapping.cube(Blocks.STONE);
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
        final TextureMapping smoothStone = TextureMapping.cube(Blocks.SMOOTH_STONE);
        final Identifier smoothStoneStairs = ModelTemplates.STAIRS_STRAIGHT.create(ChiseledBlocks.SMOOTH_STONE_STAIRS, smoothStone, blockStateModelGenerator.modelOutput);
        final Identifier innerSmoothStoneStairs = ModelTemplates.STAIRS_INNER.create(ChiseledBlocks.SMOOTH_STONE_STAIRS, smoothStone, blockStateModelGenerator.modelOutput);
        final Identifier outerSmoothStoneStairs = ModelTemplates.STAIRS_OUTER.create(ChiseledBlocks.SMOOTH_STONE_STAIRS, smoothStone, blockStateModelGenerator.modelOutput);
        blockStateModelGenerator.blockStateOutput.accept(
                BlockModelGenerators.createStairs(ChiseledBlocks.SMOOTH_STONE_STAIRS,
                        BlockModelGenerators.plainVariant(innerSmoothStoneStairs),
                        BlockModelGenerators.plainVariant(smoothStoneStairs),
                        BlockModelGenerators.plainVariant(outerSmoothStoneStairs)));
        blockStateModelGenerator.registerSimpleItemModel(ChiseledBlocks.SMOOTH_STONE_STAIRS, smoothStoneStairs);
        blockStateModelGenerator.createTrivialCube(ChiseledBlocks.MOSSY_CHISELED_STONE_BRICKS);
        BlockModelGenerators.BlockFamilyProvider cutStoneBrickPool = blockStateModelGenerator.family(ChiseledBlocks.CUT_STONE_BRICKS);
        blockStateModelGenerator.createTrivialCube(ChiseledBlocks.CRACKED_CUT_STONE_BRICKS);
        cutStoneBrickPool.stairs(ChiseledBlocks.CUT_STONE_BRICK_STAIRS);
        cutStoneBrickPool.slab(ChiseledBlocks.CUT_STONE_BRICK_SLAB);
        BlockModelGenerators.BlockFamilyProvider mossyCutStoneBrickPool = blockStateModelGenerator.family(ChiseledBlocks.MOSSY_CUT_STONE_BRICKS);
        mossyCutStoneBrickPool.stairs(ChiseledBlocks.MOSSY_CUT_STONE_BRICK_STAIRS);
        mossyCutStoneBrickPool.slab(ChiseledBlocks.MOSSY_CUT_STONE_BRICK_SLAB);

        BlockModelGenerators.BlockFamilyProvider stoneTilePool = blockStateModelGenerator.family(ChiseledBlocks.STONE_TILES);
        blockStateModelGenerator.createTrivialCube(ChiseledBlocks.CRACKED_STONE_TILES);
        stoneTilePool.stairs(ChiseledBlocks.STONE_TILE_STAIRS);
        stoneTilePool.slab(ChiseledBlocks.STONE_TILE_SLAB);
        stoneTilePool.wall(ChiseledBlocks.STONE_TILE_WALL);
        BlockModelGenerators.BlockFamilyProvider mossyStoneTilePool = blockStateModelGenerator.family(ChiseledBlocks.MOSSY_STONE_TILES);
        mossyStoneTilePool.stairs(ChiseledBlocks.MOSSY_STONE_TILE_STAIRS);
        mossyStoneTilePool.slab(ChiseledBlocks.MOSSY_STONE_TILE_SLAB);
        mossyStoneTilePool.wall(ChiseledBlocks.MOSSY_STONE_TILE_WALL);

        final TextureMapping polishedGraniteWall = TextureMapping.cube(Blocks.POLISHED_GRANITE);
        final Identifier polishedGraniteWallPost = ModelTemplates.WALL_POST.create(ChiseledBlocks.POLISHED_GRANITE_WALL, polishedGraniteWall, blockStateModelGenerator.modelOutput);
        final Identifier polishedGraniteWallSide = ModelTemplates.WALL_LOW_SIDE.create(ChiseledBlocks.POLISHED_GRANITE_WALL, polishedGraniteWall, blockStateModelGenerator.modelOutput);
        final Identifier polishedGraniteWallSideTall = ModelTemplates.WALL_TALL_SIDE.create(ChiseledBlocks.POLISHED_GRANITE_WALL, polishedGraniteWall, blockStateModelGenerator.modelOutput);
        final Identifier polishedGraniteWallInventory = ModelTemplates.WALL_INVENTORY.create(ChiseledBlocks.POLISHED_GRANITE_WALL, polishedGraniteWall, blockStateModelGenerator.modelOutput);
        blockStateModelGenerator.blockStateOutput.accept(
                BlockModelGenerators.createWall(ChiseledBlocks.POLISHED_GRANITE_WALL,
                        BlockModelGenerators.plainVariant(polishedGraniteWallPost),
                        BlockModelGenerators.plainVariant(polishedGraniteWallSide),
                        BlockModelGenerators.plainVariant(polishedGraniteWallSideTall)));
        blockStateModelGenerator.registerSimpleItemModel(ChiseledBlocks.POLISHED_GRANITE_WALL, polishedGraniteWallInventory);
        BlockModelGenerators.BlockFamilyProvider polishedGraniteBrickPool = blockStateModelGenerator.family(ChiseledBlocks.POLISHED_GRANITE_BRICKS);
        blockStateModelGenerator.createTrivialCube(ChiseledBlocks.CRACKED_POLISHED_GRANITE_BRICKS);
        polishedGraniteBrickPool.stairs(ChiseledBlocks.POLISHED_GRANITE_BRICK_STAIRS);
        polishedGraniteBrickPool.slab(ChiseledBlocks.POLISHED_GRANITE_BRICK_SLAB);
        polishedGraniteBrickPool.wall(ChiseledBlocks.POLISHED_GRANITE_BRICK_WALL);
        BlockModelGenerators.BlockFamilyProvider cutPolishedGraniteBrickPool = blockStateModelGenerator.family(ChiseledBlocks.CUT_POLISHED_GRANITE_BRICKS);
        blockStateModelGenerator.createTrivialCube(ChiseledBlocks.CRACKED_CUT_POLISHED_GRANITE_BRICKS);
        cutPolishedGraniteBrickPool.stairs(ChiseledBlocks.CUT_POLISHED_GRANITE_BRICK_STAIRS);
        cutPolishedGraniteBrickPool.slab(ChiseledBlocks.CUT_POLISHED_GRANITE_BRICK_SLAB);
        BlockModelGenerators.BlockFamilyProvider polishedGraniteTilePool = blockStateModelGenerator.family(ChiseledBlocks.POLISHED_GRANITE_TILES);
        blockStateModelGenerator.createTrivialCube(ChiseledBlocks.CRACKED_POLISHED_GRANITE_TILES);
        polishedGraniteTilePool.stairs(ChiseledBlocks.POLISHED_GRANITE_TILE_STAIRS);
        polishedGraniteTilePool.slab(ChiseledBlocks.POLISHED_GRANITE_TILE_SLAB);
        polishedGraniteTilePool.wall(ChiseledBlocks.POLISHED_GRANITE_TILE_WALL);

        final TextureMapping polishedDioriteWall = TextureMapping.cube(Blocks.POLISHED_DIORITE);
        final Identifier polishedDioriteWallPost = ModelTemplates.WALL_POST.create(ChiseledBlocks.POLISHED_DIORITE_WALL, polishedDioriteWall, blockStateModelGenerator.modelOutput);
        final Identifier polishedDioriteWallSide = ModelTemplates.WALL_LOW_SIDE.create(ChiseledBlocks.POLISHED_DIORITE_WALL, polishedDioriteWall, blockStateModelGenerator.modelOutput);
        final Identifier polishedDioriteWallSideTall = ModelTemplates.WALL_TALL_SIDE.create(ChiseledBlocks.POLISHED_DIORITE_WALL, polishedDioriteWall, blockStateModelGenerator.modelOutput);
        final Identifier polishedDioriteWallInventory = ModelTemplates.WALL_INVENTORY.create(ChiseledBlocks.POLISHED_DIORITE_WALL, polishedDioriteWall, blockStateModelGenerator.modelOutput);
        blockStateModelGenerator.blockStateOutput.accept(
                BlockModelGenerators.createWall(ChiseledBlocks.POLISHED_DIORITE_WALL,
                        BlockModelGenerators.plainVariant(polishedDioriteWallPost),
                        BlockModelGenerators.plainVariant(polishedDioriteWallSide),
                        BlockModelGenerators.plainVariant(polishedDioriteWallSideTall)));
        blockStateModelGenerator.registerSimpleItemModel(ChiseledBlocks.POLISHED_DIORITE_WALL, polishedDioriteWallInventory);
        BlockModelGenerators.BlockFamilyProvider polishedDioriteBrickPool = blockStateModelGenerator.family(ChiseledBlocks.POLISHED_DIORITE_BRICKS);
        blockStateModelGenerator.createTrivialCube(ChiseledBlocks.CRACKED_POLISHED_DIORITE_BRICKS);
        polishedDioriteBrickPool.stairs(ChiseledBlocks.POLISHED_DIORITE_BRICK_STAIRS);
        polishedDioriteBrickPool.slab(ChiseledBlocks.POLISHED_DIORITE_BRICK_SLAB);
        polishedDioriteBrickPool.wall(ChiseledBlocks.POLISHED_DIORITE_BRICK_WALL);
        BlockModelGenerators.BlockFamilyProvider cutPolishedDioriteBrickPool = blockStateModelGenerator.family(ChiseledBlocks.CUT_POLISHED_DIORITE_BRICKS);
        blockStateModelGenerator.createTrivialCube(ChiseledBlocks.CRACKED_CUT_POLISHED_DIORITE_BRICKS);
        cutPolishedDioriteBrickPool.stairs(ChiseledBlocks.CUT_POLISHED_DIORITE_BRICK_STAIRS);
        cutPolishedDioriteBrickPool.slab(ChiseledBlocks.CUT_POLISHED_DIORITE_BRICK_SLAB);
        BlockModelGenerators.BlockFamilyProvider polishedDioriteTilePool = blockStateModelGenerator.family(ChiseledBlocks.POLISHED_DIORITE_TILES);
        blockStateModelGenerator.createTrivialCube(ChiseledBlocks.CRACKED_POLISHED_DIORITE_TILES);
        polishedDioriteTilePool.stairs(ChiseledBlocks.POLISHED_DIORITE_TILE_STAIRS);
        polishedDioriteTilePool.slab(ChiseledBlocks.POLISHED_DIORITE_TILE_SLAB);
        polishedDioriteTilePool.wall(ChiseledBlocks.POLISHED_DIORITE_TILE_WALL);

        final TextureMapping polishedAndesiteWall = TextureMapping.cube(Blocks.POLISHED_ANDESITE);
        final Identifier polishedAndesiteWallPost = ModelTemplates.WALL_POST.create(ChiseledBlocks.POLISHED_ANDESITE_WALL, polishedAndesiteWall, blockStateModelGenerator.modelOutput);
        final Identifier polishedAndesiteWallSide = ModelTemplates.WALL_LOW_SIDE.create(ChiseledBlocks.POLISHED_ANDESITE_WALL, polishedAndesiteWall, blockStateModelGenerator.modelOutput);
        final Identifier polishedAndesiteWallSideTall = ModelTemplates.WALL_TALL_SIDE.create(ChiseledBlocks.POLISHED_ANDESITE_WALL, polishedAndesiteWall, blockStateModelGenerator.modelOutput);
        final Identifier polishedAndesiteWallInventory = ModelTemplates.WALL_INVENTORY.create(ChiseledBlocks.POLISHED_ANDESITE_WALL, polishedAndesiteWall, blockStateModelGenerator.modelOutput);
        blockStateModelGenerator.blockStateOutput.accept(
                BlockModelGenerators.createWall(ChiseledBlocks.POLISHED_ANDESITE_WALL,
                        BlockModelGenerators.plainVariant(polishedAndesiteWallPost),
                        BlockModelGenerators.plainVariant(polishedAndesiteWallSide),
                        BlockModelGenerators.plainVariant(polishedAndesiteWallSideTall)));
        blockStateModelGenerator.registerSimpleItemModel(ChiseledBlocks.POLISHED_ANDESITE_WALL, polishedAndesiteWallInventory);
        BlockModelGenerators.BlockFamilyProvider polishedAndesiteBrickPool = blockStateModelGenerator.family(ChiseledBlocks.POLISHED_ANDESITE_BRICKS);
        blockStateModelGenerator.createTrivialCube(ChiseledBlocks.CRACKED_POLISHED_ANDESITE_BRICKS);
        polishedAndesiteBrickPool.stairs(ChiseledBlocks.POLISHED_ANDESITE_BRICK_STAIRS);
        polishedAndesiteBrickPool.slab(ChiseledBlocks.POLISHED_ANDESITE_BRICK_SLAB);
        polishedAndesiteBrickPool.wall(ChiseledBlocks.POLISHED_ANDESITE_BRICK_WALL);
        BlockModelGenerators.BlockFamilyProvider cutPolishedAndesiteBrickPool = blockStateModelGenerator.family(ChiseledBlocks.CUT_POLISHED_ANDESITE_BRICKS);
        blockStateModelGenerator.createTrivialCube(ChiseledBlocks.CRACKED_CUT_POLISHED_ANDESITE_BRICKS);
        cutPolishedAndesiteBrickPool.stairs(ChiseledBlocks.CUT_POLISHED_ANDESITE_BRICK_STAIRS);
        cutPolishedAndesiteBrickPool.slab(ChiseledBlocks.CUT_POLISHED_ANDESITE_BRICK_SLAB);
        BlockModelGenerators.BlockFamilyProvider polishedAndesiteTilePool = blockStateModelGenerator.family(ChiseledBlocks.POLISHED_ANDESITE_TILES);
        blockStateModelGenerator.createTrivialCube(ChiseledBlocks.CRACKED_POLISHED_ANDESITE_TILES);
        polishedAndesiteTilePool.stairs(ChiseledBlocks.POLISHED_ANDESITE_TILE_STAIRS);
        polishedAndesiteTilePool.slab(ChiseledBlocks.POLISHED_ANDESITE_TILE_SLAB);
        polishedAndesiteTilePool.wall(ChiseledBlocks.POLISHED_ANDESITE_TILE_WALL);

        BlockModelGenerators.BlockFamilyProvider cutDeepslateBrickPool = blockStateModelGenerator.family(ChiseledBlocks.CUT_DEEPSLATE_BRICKS);
        blockStateModelGenerator.createTrivialCube(ChiseledBlocks.CRACKED_CUT_DEEPSLATE_BRICKS);
        cutDeepslateBrickPool.stairs(ChiseledBlocks.CUT_DEEPSLATE_BRICK_STAIRS);
        cutDeepslateBrickPool.slab(ChiseledBlocks.CUT_DEEPSLATE_BRICK_SLAB);

        final TextureMapping calcite = TextureMapping.cube(Blocks.CALCITE);
        final Identifier calciteStairs = ModelTemplates.STAIRS_STRAIGHT.create(ChiseledBlocks.CALCITE_STAIRS, calcite, blockStateModelGenerator.modelOutput);
        final Identifier innerCalciteStairs = ModelTemplates.STAIRS_INNER.create(ChiseledBlocks.CALCITE_STAIRS, calcite, blockStateModelGenerator.modelOutput);
        final Identifier outerCalciteStairs = ModelTemplates.STAIRS_OUTER.create(ChiseledBlocks.CALCITE_STAIRS, calcite, blockStateModelGenerator.modelOutput);
        blockStateModelGenerator.blockStateOutput.accept(
                BlockModelGenerators.createStairs(ChiseledBlocks.CALCITE_STAIRS,
                        BlockModelGenerators.plainVariant(innerCalciteStairs),
                        BlockModelGenerators.plainVariant(calciteStairs),
                        BlockModelGenerators.plainVariant(outerCalciteStairs)));
        blockStateModelGenerator.registerSimpleItemModel(ChiseledBlocks.CALCITE_STAIRS, calciteStairs);
        final Identifier calciteSlabBottom = ModelTemplates.SLAB_BOTTOM.create(ChiseledBlocks.CALCITE_SLAB, calcite, blockStateModelGenerator.modelOutput);
        final Identifier calciteSlabTop = ModelTemplates.SLAB_TOP.create(ChiseledBlocks.CALCITE_SLAB, calcite, blockStateModelGenerator.modelOutput);
        blockStateModelGenerator.blockStateOutput.accept(
                BlockModelGenerators.createSlab(ChiseledBlocks.CALCITE_SLAB,
                        BlockModelGenerators.plainVariant(calciteSlabBottom),
                        BlockModelGenerators.plainVariant(calciteSlabTop),
                        BlockModelGenerators.plainVariant(Identifier.withDefaultNamespace("block/calcite"))));
        blockStateModelGenerator.registerSimpleItemModel(ChiseledBlocks.CALCITE_SLAB, calciteSlabBottom);
        final Identifier calciteWallPost = ModelTemplates.WALL_POST.create(ChiseledBlocks.CALCITE_WALL, calcite, blockStateModelGenerator.modelOutput);
        final Identifier calciteWallSide = ModelTemplates.WALL_LOW_SIDE.create(ChiseledBlocks.CALCITE_WALL, calcite, blockStateModelGenerator.modelOutput);
        final Identifier calciteWallSideTall = ModelTemplates.WALL_TALL_SIDE.create(ChiseledBlocks.CALCITE_WALL, calcite, blockStateModelGenerator.modelOutput);
        final Identifier calciteWallInventory = ModelTemplates.WALL_INVENTORY.create(ChiseledBlocks.CALCITE_WALL, calcite, blockStateModelGenerator.modelOutput);
        blockStateModelGenerator.blockStateOutput.accept(
                BlockModelGenerators.createWall(ChiseledBlocks.CALCITE_WALL,
                        BlockModelGenerators.plainVariant(calciteWallPost),
                        BlockModelGenerators.plainVariant(calciteWallSide),
                        BlockModelGenerators.plainVariant(calciteWallSideTall)));
        blockStateModelGenerator.registerSimpleItemModel(ChiseledBlocks.CALCITE_WALL, calciteWallInventory);
        BlockModelGenerators.BlockFamilyProvider polishedCalcitePool = blockStateModelGenerator.family(ChiseledBlocks.POLISHED_CALCITE);
        polishedCalcitePool.stairs(ChiseledBlocks.POLISHED_CALCITE_STAIRS);
        polishedCalcitePool.slab(ChiseledBlocks.POLISHED_CALCITE_SLAB);
        polishedCalcitePool.wall(ChiseledBlocks.POLISHED_CALCITE_WALL);
        BlockModelGenerators.BlockFamilyProvider calciteBrickPool = blockStateModelGenerator.family(ChiseledBlocks.CALCITE_BRICKS);
        calciteBrickPool.stairs(ChiseledBlocks.CALCITE_BRICK_STAIRS);
        calciteBrickPool.slab(ChiseledBlocks.CALCITE_BRICK_SLAB);
        calciteBrickPool.wall(ChiseledBlocks.CALCITE_BRICK_WALL);
        BlockModelGenerators.BlockFamilyProvider cutCalciteBrickPool = blockStateModelGenerator.family(ChiseledBlocks.CUT_CALCITE_BRICKS);
        cutCalciteBrickPool.stairs(ChiseledBlocks.CUT_CALCITE_BRICK_STAIRS);
        cutCalciteBrickPool.slab(ChiseledBlocks.CUT_CALCITE_BRICK_SLAB);
        BlockModelGenerators.BlockFamilyProvider calciteTilePool = blockStateModelGenerator.family(ChiseledBlocks.CALCITE_TILES);
        calciteTilePool.stairs(ChiseledBlocks.CALCITE_TILE_STAIRS);
        calciteTilePool.slab(ChiseledBlocks.CALCITE_TILE_SLAB);
        calciteTilePool.wall(ChiseledBlocks.CALCITE_TILE_WALL);

        final TextureMapping dripstone = TextureMapping.cube(Blocks.DRIPSTONE_BLOCK);
        final Identifier dripstoneStairs = ModelTemplates.STAIRS_STRAIGHT.create(ChiseledBlocks.DRIPSTONE_STAIRS, dripstone, blockStateModelGenerator.modelOutput);
        final Identifier innerDripstoneStairs = ModelTemplates.STAIRS_INNER.create(ChiseledBlocks.DRIPSTONE_STAIRS, dripstone, blockStateModelGenerator.modelOutput);
        final Identifier outerDripstoneStairs = ModelTemplates.STAIRS_OUTER.create(ChiseledBlocks.DRIPSTONE_STAIRS, dripstone, blockStateModelGenerator.modelOutput);
        blockStateModelGenerator.blockStateOutput.accept(
                BlockModelGenerators.createStairs(ChiseledBlocks.DRIPSTONE_STAIRS,
                        BlockModelGenerators.plainVariant(innerDripstoneStairs),
                        BlockModelGenerators.plainVariant(dripstoneStairs),
                        BlockModelGenerators.plainVariant(outerDripstoneStairs)));
        blockStateModelGenerator.registerSimpleItemModel(ChiseledBlocks.DRIPSTONE_STAIRS, dripstoneStairs);
        final Identifier dripstoneSlabBottom = ModelTemplates.SLAB_BOTTOM.create(ChiseledBlocks.DRIPSTONE_SLAB, dripstone, blockStateModelGenerator.modelOutput);
        final Identifier dripstoneSlabTop = ModelTemplates.SLAB_TOP.create(ChiseledBlocks.DRIPSTONE_SLAB, dripstone, blockStateModelGenerator.modelOutput);
        blockStateModelGenerator.blockStateOutput.accept(
                BlockModelGenerators.createSlab(ChiseledBlocks.DRIPSTONE_SLAB,
                        BlockModelGenerators.plainVariant(dripstoneSlabBottom),
                        BlockModelGenerators.plainVariant(dripstoneSlabTop),
                        BlockModelGenerators.plainVariant(Identifier.withDefaultNamespace("block/dripstone"))));
        blockStateModelGenerator.registerSimpleItemModel(ChiseledBlocks.DRIPSTONE_SLAB, dripstoneSlabBottom);
        final Identifier dripstoneWallPost = ModelTemplates.WALL_POST.create(ChiseledBlocks.DRIPSTONE_WALL, dripstone, blockStateModelGenerator.modelOutput);
        final Identifier dripstoneWallSide = ModelTemplates.WALL_LOW_SIDE.create(ChiseledBlocks.DRIPSTONE_WALL, dripstone, blockStateModelGenerator.modelOutput);
        final Identifier dripstoneWallSideTall = ModelTemplates.WALL_TALL_SIDE.create(ChiseledBlocks.DRIPSTONE_WALL, dripstone, blockStateModelGenerator.modelOutput);
        final Identifier dripstoneWallInventory = ModelTemplates.WALL_INVENTORY.create(ChiseledBlocks.DRIPSTONE_WALL, dripstone, blockStateModelGenerator.modelOutput);
        blockStateModelGenerator.blockStateOutput.accept(
                BlockModelGenerators.createWall(ChiseledBlocks.DRIPSTONE_WALL,
                        BlockModelGenerators.plainVariant(dripstoneWallPost),
                        BlockModelGenerators.plainVariant(dripstoneWallSide),
                        BlockModelGenerators.plainVariant(dripstoneWallSideTall)));
        blockStateModelGenerator.registerSimpleItemModel(ChiseledBlocks.DRIPSTONE_WALL, dripstoneWallInventory);
        BlockModelGenerators.BlockFamilyProvider polishedDripstonePool = blockStateModelGenerator.family(ChiseledBlocks.POLISHED_DRIPSTONE);
        polishedDripstonePool.stairs(ChiseledBlocks.POLISHED_DRIPSTONE_STAIRS);
        polishedDripstonePool.slab(ChiseledBlocks.POLISHED_DRIPSTONE_SLAB);
        polishedDripstonePool.wall(ChiseledBlocks.POLISHED_DRIPSTONE_WALL);
        BlockModelGenerators.BlockFamilyProvider dripstoneBrickPool = blockStateModelGenerator.family(ChiseledBlocks.DRIPSTONE_BRICKS);
        dripstoneBrickPool.stairs(ChiseledBlocks.DRIPSTONE_BRICK_STAIRS);
        dripstoneBrickPool.slab(ChiseledBlocks.DRIPSTONE_BRICK_SLAB);
        dripstoneBrickPool.wall(ChiseledBlocks.DRIPSTONE_BRICK_WALL);
        BlockModelGenerators.BlockFamilyProvider cutDripstoneBrickPool = blockStateModelGenerator.family(ChiseledBlocks.CUT_DRIPSTONE_BRICKS);
        cutDripstoneBrickPool.stairs(ChiseledBlocks.CUT_DRIPSTONE_BRICK_STAIRS);
        cutDripstoneBrickPool.slab(ChiseledBlocks.CUT_DRIPSTONE_BRICK_SLAB);
        BlockModelGenerators.BlockFamilyProvider dripstoneTilePool = blockStateModelGenerator.family(ChiseledBlocks.DRIPSTONE_TILES);
        dripstoneTilePool.stairs(ChiseledBlocks.DRIPSTONE_TILE_STAIRS);
        dripstoneTilePool.slab(ChiseledBlocks.DRIPSTONE_TILE_SLAB);
        dripstoneTilePool.wall(ChiseledBlocks.DRIPSTONE_TILE_WALL);

        BlockModelGenerators.BlockFamilyProvider mixedBrickPool = blockStateModelGenerator.family(ChiseledBlocks.MIXED_BRICKS);
        mixedBrickPool.stairs(ChiseledBlocks.MIXED_BRICK_STAIRS);
        mixedBrickPool.slab(ChiseledBlocks.MIXED_BRICK_SLAB);
        mixedBrickPool.wall(ChiseledBlocks.MIXED_BRICK_WALL);
        BlockModelGenerators.BlockFamilyProvider mossyBrickPool = blockStateModelGenerator.family(ChiseledBlocks.MOSSY_BRICKS);
        mossyBrickPool.stairs(ChiseledBlocks.MOSSY_BRICK_STAIRS);
        mossyBrickPool.slab(ChiseledBlocks.MOSSY_BRICK_SLAB);
        mossyBrickPool.wall(ChiseledBlocks.MOSSY_BRICK_WALL);

        final TextureMapping packed_mud = TextureMapping.cube(Blocks.PACKED_MUD);
        final Identifier packedMudStairs = ModelTemplates.STAIRS_STRAIGHT.create(ChiseledBlocks.PACKED_MUD_STAIRS, packed_mud, blockStateModelGenerator.modelOutput);
        final Identifier innerPackedMudStairs = ModelTemplates.STAIRS_INNER.create(ChiseledBlocks.PACKED_MUD_STAIRS, packed_mud, blockStateModelGenerator.modelOutput);
        final Identifier outerPackedMudStairs = ModelTemplates.STAIRS_OUTER.create(ChiseledBlocks.PACKED_MUD_STAIRS, packed_mud, blockStateModelGenerator.modelOutput);
        blockStateModelGenerator.blockStateOutput.accept(
                BlockModelGenerators.createStairs(ChiseledBlocks.PACKED_MUD_STAIRS,
                        BlockModelGenerators.plainVariant(innerPackedMudStairs),
                        BlockModelGenerators.plainVariant(packedMudStairs),
                        BlockModelGenerators.plainVariant(outerPackedMudStairs)));
        blockStateModelGenerator.registerSimpleItemModel(ChiseledBlocks.PACKED_MUD_STAIRS, packedMudStairs);
        final Identifier packed_mudSlabBottom = ModelTemplates.SLAB_BOTTOM.create(ChiseledBlocks.PACKED_MUD_SLAB, packed_mud, blockStateModelGenerator.modelOutput);
        final Identifier packed_mudSlabTop = ModelTemplates.SLAB_TOP.create(ChiseledBlocks.PACKED_MUD_SLAB, packed_mud, blockStateModelGenerator.modelOutput);
        blockStateModelGenerator.blockStateOutput.accept(
                BlockModelGenerators.createSlab(ChiseledBlocks.PACKED_MUD_SLAB,
                        BlockModelGenerators.plainVariant(packed_mudSlabBottom),
                        BlockModelGenerators.plainVariant(packed_mudSlabTop),
                        BlockModelGenerators.plainVariant(Identifier.withDefaultNamespace("block/packed_mud"))));
        blockStateModelGenerator.registerSimpleItemModel(ChiseledBlocks.PACKED_MUD_SLAB, packed_mudSlabBottom);
        final Identifier packed_mudWallPost = ModelTemplates.WALL_POST.create(ChiseledBlocks.PACKED_MUD_WALL, packed_mud, blockStateModelGenerator.modelOutput);
        final Identifier packed_mudWallSide = ModelTemplates.WALL_LOW_SIDE.create(ChiseledBlocks.PACKED_MUD_WALL, packed_mud, blockStateModelGenerator.modelOutput);
        final Identifier packed_mudWallSideTall = ModelTemplates.WALL_TALL_SIDE.create(ChiseledBlocks.PACKED_MUD_WALL, packed_mud, blockStateModelGenerator.modelOutput);
        final Identifier packed_mudWallInventory = ModelTemplates.WALL_INVENTORY.create(ChiseledBlocks.PACKED_MUD_WALL, packed_mud, blockStateModelGenerator.modelOutput);
        blockStateModelGenerator.blockStateOutput.accept(
                BlockModelGenerators.createWall(ChiseledBlocks.PACKED_MUD_WALL,
                        BlockModelGenerators.plainVariant(packed_mudWallPost),
                        BlockModelGenerators.plainVariant(packed_mudWallSide),
                        BlockModelGenerators.plainVariant(packed_mudWallSideTall)));
        blockStateModelGenerator.registerSimpleItemModel(ChiseledBlocks.PACKED_MUD_WALL, packed_mudWallInventory);
        BlockModelGenerators.BlockFamilyProvider polishedMudPool = blockStateModelGenerator.family(ChiseledBlocks.POLISHED_MUD);
        polishedMudPool.stairs(ChiseledBlocks.POLISHED_MUD_STAIRS);
        polishedMudPool.slab(ChiseledBlocks.POLISHED_MUD_SLAB);
        polishedMudPool.wall(ChiseledBlocks.POLISHED_MUD_WALL);
        BlockModelGenerators.BlockFamilyProvider mossyMudBrickPool = blockStateModelGenerator.family(ChiseledBlocks.MOSSY_MUD_BRICKS);
        mossyMudBrickPool.stairs(ChiseledBlocks.MOSSY_MUD_BRICK_STAIRS);
        mossyMudBrickPool.slab(ChiseledBlocks.MOSSY_MUD_BRICK_SLAB);
        mossyMudBrickPool.wall(ChiseledBlocks.MOSSY_MUD_BRICK_WALL);
        BlockModelGenerators.BlockFamilyProvider cutMudBrickPool = blockStateModelGenerator.family(ChiseledBlocks.CUT_MUD_BRICKS);
        cutMudBrickPool.stairs(ChiseledBlocks.CUT_MUD_BRICK_STAIRS);
        cutMudBrickPool.slab(ChiseledBlocks.CUT_MUD_BRICK_SLAB);
        BlockModelGenerators.BlockFamilyProvider mossyCutMudBrickPool = blockStateModelGenerator.family(ChiseledBlocks.MOSSY_CUT_MUD_BRICKS);
        mossyCutMudBrickPool.stairs(ChiseledBlocks.MOSSY_CUT_MUD_BRICK_STAIRS);
        mossyCutMudBrickPool.slab(ChiseledBlocks.MOSSY_CUT_MUD_BRICK_SLAB);
        BlockModelGenerators.BlockFamilyProvider mudTilePool = blockStateModelGenerator.family(ChiseledBlocks.MUD_TILES);
        mudTilePool.stairs(ChiseledBlocks.MUD_TILE_STAIRS);
        mudTilePool.slab(ChiseledBlocks.MUD_TILE_SLAB);
        mudTilePool.wall(ChiseledBlocks.MUD_TILE_WALL);
        BlockModelGenerators.BlockFamilyProvider mossyMudTilePool = blockStateModelGenerator.family(ChiseledBlocks.MOSSY_MUD_TILES);
        mossyMudTilePool.stairs(ChiseledBlocks.MOSSY_MUD_TILE_STAIRS);
        mossyMudTilePool.slab(ChiseledBlocks.MOSSY_MUD_TILE_SLAB);
        mossyMudTilePool.wall(ChiseledBlocks.MOSSY_MUD_TILE_WALL);
    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerator) {
    }
}