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
        blockStateModelGenerator.createTrivialCube(ChiseledBlocks.CRACKED_CALCITE_BRICKS);
        calciteBrickPool.stairs(ChiseledBlocks.CALCITE_BRICK_STAIRS);
        calciteBrickPool.slab(ChiseledBlocks.CALCITE_BRICK_SLAB);
        calciteBrickPool.wall(ChiseledBlocks.CALCITE_BRICK_WALL);
        BlockModelGenerators.BlockFamilyProvider cutCalciteBrickPool = blockStateModelGenerator.family(ChiseledBlocks.CUT_CALCITE_BRICKS);
        blockStateModelGenerator.createTrivialCube(ChiseledBlocks.CRACKED_CUT_CALCITE_BRICKS);
        cutCalciteBrickPool.stairs(ChiseledBlocks.CUT_CALCITE_BRICK_STAIRS);
        cutCalciteBrickPool.slab(ChiseledBlocks.CUT_CALCITE_BRICK_SLAB);
        BlockModelGenerators.BlockFamilyProvider calciteTilePool = blockStateModelGenerator.family(ChiseledBlocks.CALCITE_TILES);
        blockStateModelGenerator.createTrivialCube(ChiseledBlocks.CRACKED_CALCITE_TILES);
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
        blockStateModelGenerator.createTrivialCube(ChiseledBlocks.CRACKED_DRIPSTONE_BRICKS);
        dripstoneBrickPool.stairs(ChiseledBlocks.DRIPSTONE_BRICK_STAIRS);
        dripstoneBrickPool.slab(ChiseledBlocks.DRIPSTONE_BRICK_SLAB);
        dripstoneBrickPool.wall(ChiseledBlocks.DRIPSTONE_BRICK_WALL);
        BlockModelGenerators.BlockFamilyProvider cutDripstoneBrickPool = blockStateModelGenerator.family(ChiseledBlocks.CUT_DRIPSTONE_BRICKS);
        blockStateModelGenerator.createTrivialCube(ChiseledBlocks.CRACKED_CUT_DRIPSTONE_BRICKS);
        cutDripstoneBrickPool.stairs(ChiseledBlocks.CUT_DRIPSTONE_BRICK_STAIRS);
        cutDripstoneBrickPool.slab(ChiseledBlocks.CUT_DRIPSTONE_BRICK_SLAB);
        BlockModelGenerators.BlockFamilyProvider dripstoneTilePool = blockStateModelGenerator.family(ChiseledBlocks.DRIPSTONE_TILES);
        blockStateModelGenerator.createTrivialCube(ChiseledBlocks.CRACKED_DRIPSTONE_TILES);
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

        final TextureMapping packedMud = TextureMapping.cube(Blocks.PACKED_MUD);
        final Identifier packedMudStairs = ModelTemplates.STAIRS_STRAIGHT.create(ChiseledBlocks.PACKED_MUD_STAIRS, packedMud, blockStateModelGenerator.modelOutput);
        final Identifier innerPackedMudStairs = ModelTemplates.STAIRS_INNER.create(ChiseledBlocks.PACKED_MUD_STAIRS, packedMud, blockStateModelGenerator.modelOutput);
        final Identifier outerPackedMudStairs = ModelTemplates.STAIRS_OUTER.create(ChiseledBlocks.PACKED_MUD_STAIRS, packedMud, blockStateModelGenerator.modelOutput);
        blockStateModelGenerator.blockStateOutput.accept(
                BlockModelGenerators.createStairs(ChiseledBlocks.PACKED_MUD_STAIRS,
                        BlockModelGenerators.plainVariant(innerPackedMudStairs),
                        BlockModelGenerators.plainVariant(packedMudStairs),
                        BlockModelGenerators.plainVariant(outerPackedMudStairs)));
        blockStateModelGenerator.registerSimpleItemModel(ChiseledBlocks.PACKED_MUD_STAIRS, packedMudStairs);
        final Identifier packedMudSlabBottom = ModelTemplates.SLAB_BOTTOM.create(ChiseledBlocks.PACKED_MUD_SLAB, packedMud, blockStateModelGenerator.modelOutput);
        final Identifier packedMudSlabTop = ModelTemplates.SLAB_TOP.create(ChiseledBlocks.PACKED_MUD_SLAB, packedMud, blockStateModelGenerator.modelOutput);
        blockStateModelGenerator.blockStateOutput.accept(
                BlockModelGenerators.createSlab(ChiseledBlocks.PACKED_MUD_SLAB,
                        BlockModelGenerators.plainVariant(packedMudSlabBottom),
                        BlockModelGenerators.plainVariant(packedMudSlabTop),
                        BlockModelGenerators.plainVariant(Identifier.withDefaultNamespace("block/packed_mud"))));
        blockStateModelGenerator.registerSimpleItemModel(ChiseledBlocks.PACKED_MUD_SLAB, packedMudSlabBottom);
        final Identifier packedMudWallPost = ModelTemplates.WALL_POST.create(ChiseledBlocks.PACKED_MUD_WALL, packedMud, blockStateModelGenerator.modelOutput);
        final Identifier packedMudWallSide = ModelTemplates.WALL_LOW_SIDE.create(ChiseledBlocks.PACKED_MUD_WALL, packedMud, blockStateModelGenerator.modelOutput);
        final Identifier packedMudWallSideTall = ModelTemplates.WALL_TALL_SIDE.create(ChiseledBlocks.PACKED_MUD_WALL, packedMud, blockStateModelGenerator.modelOutput);
        final Identifier packedMudWallInventory = ModelTemplates.WALL_INVENTORY.create(ChiseledBlocks.PACKED_MUD_WALL, packedMud, blockStateModelGenerator.modelOutput);
        blockStateModelGenerator.blockStateOutput.accept(
                BlockModelGenerators.createWall(ChiseledBlocks.PACKED_MUD_WALL,
                        BlockModelGenerators.plainVariant(packedMudWallPost),
                        BlockModelGenerators.plainVariant(packedMudWallSide),
                        BlockModelGenerators.plainVariant(packedMudWallSideTall)));
        blockStateModelGenerator.registerSimpleItemModel(ChiseledBlocks.PACKED_MUD_WALL, packedMudWallInventory);
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

        final TextureMapping honeycomb = TextureMapping.cube(Blocks.HONEYCOMB_BLOCK);
        final Identifier honeycombStairs = ModelTemplates.STAIRS_STRAIGHT.create(ChiseledBlocks.HONEYCOMB_STAIRS, honeycomb, blockStateModelGenerator.modelOutput);
        final Identifier innerHoneycombStairs = ModelTemplates.STAIRS_INNER.create(ChiseledBlocks.HONEYCOMB_STAIRS, honeycomb, blockStateModelGenerator.modelOutput);
        final Identifier outerHoneycombStairs = ModelTemplates.STAIRS_OUTER.create(ChiseledBlocks.HONEYCOMB_STAIRS, honeycomb, blockStateModelGenerator.modelOutput);
        blockStateModelGenerator.blockStateOutput.accept(
                BlockModelGenerators.createStairs(ChiseledBlocks.HONEYCOMB_STAIRS,
                        BlockModelGenerators.plainVariant(innerHoneycombStairs),
                        BlockModelGenerators.plainVariant(honeycombStairs),
                        BlockModelGenerators.plainVariant(outerHoneycombStairs)));
        blockStateModelGenerator.registerSimpleItemModel(ChiseledBlocks.HONEYCOMB_STAIRS, honeycombStairs);
        final Identifier honeycombSlabBottom = ModelTemplates.SLAB_BOTTOM.create(ChiseledBlocks.HONEYCOMB_SLAB, honeycomb, blockStateModelGenerator.modelOutput);
        final Identifier honeycombSlabTop = ModelTemplates.SLAB_TOP.create(ChiseledBlocks.HONEYCOMB_SLAB, honeycomb, blockStateModelGenerator.modelOutput);
        blockStateModelGenerator.blockStateOutput.accept(
                BlockModelGenerators.createSlab(ChiseledBlocks.HONEYCOMB_SLAB,
                        BlockModelGenerators.plainVariant(honeycombSlabBottom),
                        BlockModelGenerators.plainVariant(honeycombSlabTop),
                        BlockModelGenerators.plainVariant(Identifier.withDefaultNamespace("block/honeycomb_block"))));
        blockStateModelGenerator.registerSimpleItemModel(ChiseledBlocks.HONEYCOMB_SLAB, honeycombSlabBottom);
        final Identifier honeycombWallPost = ModelTemplates.WALL_POST.create(ChiseledBlocks.HONEYCOMB_WALL, honeycomb, blockStateModelGenerator.modelOutput);
        final Identifier honeycombWallSide = ModelTemplates.WALL_LOW_SIDE.create(ChiseledBlocks.HONEYCOMB_WALL, honeycomb, blockStateModelGenerator.modelOutput);
        final Identifier honeycombWallSideTall = ModelTemplates.WALL_TALL_SIDE.create(ChiseledBlocks.HONEYCOMB_WALL, honeycomb, blockStateModelGenerator.modelOutput);
        final Identifier honeycombWallInventory = ModelTemplates.WALL_INVENTORY.create(ChiseledBlocks.HONEYCOMB_WALL, honeycomb, blockStateModelGenerator.modelOutput);
        blockStateModelGenerator.blockStateOutput.accept(
                BlockModelGenerators.createWall(ChiseledBlocks.HONEYCOMB_WALL,
                        BlockModelGenerators.plainVariant(honeycombWallPost),
                        BlockModelGenerators.plainVariant(honeycombWallSide),
                        BlockModelGenerators.plainVariant(honeycombWallSideTall)));
        blockStateModelGenerator.registerSimpleItemModel(ChiseledBlocks.HONEYCOMB_WALL, honeycombWallInventory);
        BlockModelGenerators.BlockFamilyProvider honeycombBrickPool = blockStateModelGenerator.family(ChiseledBlocks.HONEYCOMB_BRICKS);
        honeycombBrickPool.stairs(ChiseledBlocks.HONEYCOMB_BRICK_STAIRS);
        honeycombBrickPool.slab(ChiseledBlocks.HONEYCOMB_BRICK_SLAB);
        honeycombBrickPool.wall(ChiseledBlocks.HONEYCOMB_BRICK_WALL);
        BlockModelGenerators.BlockFamilyProvider cutHoneycombBrickPool = blockStateModelGenerator.family(ChiseledBlocks.CUT_HONEYCOMB_BRICKS);
        cutHoneycombBrickPool.stairs(ChiseledBlocks.CUT_HONEYCOMB_BRICK_STAIRS);
        cutHoneycombBrickPool.slab(ChiseledBlocks.CUT_HONEYCOMB_BRICK_SLAB);
        BlockModelGenerators.BlockFamilyProvider honeycombTilePool = blockStateModelGenerator.family(ChiseledBlocks.HONEYCOMB_TILES);
        honeycombTilePool.stairs(ChiseledBlocks.HONEYCOMB_TILE_STAIRS);
        honeycombTilePool.slab(ChiseledBlocks.HONEYCOMB_TILE_SLAB);
        honeycombTilePool.wall(ChiseledBlocks.HONEYCOMB_TILE_WALL);
        
        BlockModelGenerators.BlockFamilyProvider sandstoneBrickPool = blockStateModelGenerator.family(ChiseledBlocks.SANDSTONE_BRICKS);
        sandstoneBrickPool.stairs(ChiseledBlocks.SANDSTONE_BRICK_STAIRS);
        sandstoneBrickPool.slab(ChiseledBlocks.SANDSTONE_BRICK_SLAB);
        sandstoneBrickPool.wall(ChiseledBlocks.SANDSTONE_BRICK_WALL);
        BlockModelGenerators.BlockFamilyProvider cutSandstoneBrickPool = blockStateModelGenerator.family(ChiseledBlocks.CUT_SANDSTONE_BRICKS);
        cutSandstoneBrickPool.stairs(ChiseledBlocks.CUT_SANDSTONE_BRICK_STAIRS);
        cutSandstoneBrickPool.slab(ChiseledBlocks.CUT_SANDSTONE_BRICK_SLAB);
        BlockModelGenerators.BlockFamilyProvider sandstoneTilePool = blockStateModelGenerator.family(ChiseledBlocks.SANDSTONE_TILES);
        sandstoneTilePool.stairs(ChiseledBlocks.SANDSTONE_TILE_STAIRS);
        sandstoneTilePool.slab(ChiseledBlocks.SANDSTONE_TILE_SLAB);
        sandstoneTilePool.wall(ChiseledBlocks.SANDSTONE_TILE_WALL);

        BlockModelGenerators.BlockFamilyProvider redSandstoneBrickPool = blockStateModelGenerator.family(ChiseledBlocks.RED_SANDSTONE_BRICKS);
        redSandstoneBrickPool.stairs(ChiseledBlocks.RED_SANDSTONE_BRICK_STAIRS);
        redSandstoneBrickPool.slab(ChiseledBlocks.RED_SANDSTONE_BRICK_SLAB);
        redSandstoneBrickPool.wall(ChiseledBlocks.RED_SANDSTONE_BRICK_WALL);
        BlockModelGenerators.BlockFamilyProvider cutRedSandstoneBrickPool = blockStateModelGenerator.family(ChiseledBlocks.CUT_RED_SANDSTONE_BRICKS);
        cutRedSandstoneBrickPool.stairs(ChiseledBlocks.CUT_RED_SANDSTONE_BRICK_STAIRS);
        cutRedSandstoneBrickPool.slab(ChiseledBlocks.CUT_RED_SANDSTONE_BRICK_SLAB);
        BlockModelGenerators.BlockFamilyProvider redSandstoneTilePool = blockStateModelGenerator.family(ChiseledBlocks.RED_SANDSTONE_TILES);
        redSandstoneTilePool.stairs(ChiseledBlocks.RED_SANDSTONE_TILE_STAIRS);
        redSandstoneTilePool.slab(ChiseledBlocks.RED_SANDSTONE_TILE_SLAB);
        redSandstoneTilePool.wall(ChiseledBlocks.RED_SANDSTONE_TILE_WALL);

        final TextureMapping prismarineBricks = TextureMapping.cube(Blocks.PRISMARINE_BRICKS);
        final Identifier prismarineBrickWallPost = ModelTemplates.WALL_POST.create(ChiseledBlocks.PRISMARINE_BRICK_WALL, prismarineBricks, blockStateModelGenerator.modelOutput);
        final Identifier prismarineBrickWallSide = ModelTemplates.WALL_LOW_SIDE.create(ChiseledBlocks.PRISMARINE_BRICK_WALL, prismarineBricks, blockStateModelGenerator.modelOutput);
        final Identifier prismarineBrickWallSideTall = ModelTemplates.WALL_TALL_SIDE.create(ChiseledBlocks.PRISMARINE_BRICK_WALL, prismarineBricks, blockStateModelGenerator.modelOutput);
        final Identifier prismarineBrickWallInventory = ModelTemplates.WALL_INVENTORY.create(ChiseledBlocks.PRISMARINE_BRICK_WALL, prismarineBricks, blockStateModelGenerator.modelOutput);
        blockStateModelGenerator.blockStateOutput.accept(
                BlockModelGenerators.createWall(ChiseledBlocks.PRISMARINE_BRICK_WALL,
                        BlockModelGenerators.plainVariant(prismarineBrickWallPost),
                        BlockModelGenerators.plainVariant(prismarineBrickWallSide),
                        BlockModelGenerators.plainVariant(prismarineBrickWallSideTall)));
        blockStateModelGenerator.registerSimpleItemModel(ChiseledBlocks.PRISMARINE_BRICK_WALL, prismarineBrickWallInventory);
        BlockModelGenerators.BlockFamilyProvider cutPrismarineBrickPool = blockStateModelGenerator.family(ChiseledBlocks.CUT_PRISMARINE_BRICKS);
        cutPrismarineBrickPool.stairs(ChiseledBlocks.CUT_PRISMARINE_BRICK_STAIRS);
        cutPrismarineBrickPool.slab(ChiseledBlocks.CUT_PRISMARINE_BRICK_SLAB);
        final TextureMapping darkPrismarine = TextureMapping.cube(Blocks.DARK_PRISMARINE);
        final Identifier darkPrismarineWallPost = ModelTemplates.WALL_POST.create(ChiseledBlocks.DARK_PRISMARINE_WALL, darkPrismarine, blockStateModelGenerator.modelOutput);
        final Identifier darkPrismarineWallSide = ModelTemplates.WALL_LOW_SIDE.create(ChiseledBlocks.DARK_PRISMARINE_WALL, darkPrismarine, blockStateModelGenerator.modelOutput);
        final Identifier darkPrismarineWallSideTall = ModelTemplates.WALL_TALL_SIDE.create(ChiseledBlocks.DARK_PRISMARINE_WALL, darkPrismarine, blockStateModelGenerator.modelOutput);
        final Identifier darkPrismarineWallInventory = ModelTemplates.WALL_INVENTORY.create(ChiseledBlocks.DARK_PRISMARINE_WALL, darkPrismarine, blockStateModelGenerator.modelOutput);
        blockStateModelGenerator.blockStateOutput.accept(
                BlockModelGenerators.createWall(ChiseledBlocks.DARK_PRISMARINE_WALL,
                        BlockModelGenerators.plainVariant(darkPrismarineWallPost),
                        BlockModelGenerators.plainVariant(darkPrismarineWallSide),
                        BlockModelGenerators.plainVariant(darkPrismarineWallSideTall)));
        blockStateModelGenerator.registerSimpleItemModel(ChiseledBlocks.DARK_PRISMARINE_WALL, darkPrismarineWallInventory);
        BlockModelGenerators.BlockFamilyProvider darkPrismarineBrickPool = blockStateModelGenerator.family(ChiseledBlocks.DARK_PRISMARINE_BRICKS);
        darkPrismarineBrickPool.stairs(ChiseledBlocks.DARK_PRISMARINE_BRICK_STAIRS);
        darkPrismarineBrickPool.slab(ChiseledBlocks.DARK_PRISMARINE_BRICK_SLAB);
        darkPrismarineBrickPool.wall(ChiseledBlocks.DARK_PRISMARINE_BRICK_WALL);
        BlockModelGenerators.BlockFamilyProvider cutDarkPrismarineBrickPool = blockStateModelGenerator.family(ChiseledBlocks.CUT_DARK_PRISMARINE_BRICKS);
        cutDarkPrismarineBrickPool.stairs(ChiseledBlocks.CUT_DARK_PRISMARINE_BRICK_STAIRS);
        cutDarkPrismarineBrickPool.slab(ChiseledBlocks.CUT_DARK_PRISMARINE_BRICK_SLAB);

        final TextureMapping netherite = TextureMapping.cube(Blocks.NETHERITE_BLOCK);
        final Identifier netheriteStairs = ModelTemplates.STAIRS_STRAIGHT.create(ChiseledBlocks.NETHERITE_STAIRS, netherite, blockStateModelGenerator.modelOutput);
        final Identifier innerNetheriteStairs = ModelTemplates.STAIRS_INNER.create(ChiseledBlocks.NETHERITE_STAIRS, netherite, blockStateModelGenerator.modelOutput);
        final Identifier outerNetheriteStairs = ModelTemplates.STAIRS_OUTER.create(ChiseledBlocks.NETHERITE_STAIRS, netherite, blockStateModelGenerator.modelOutput);
        blockStateModelGenerator.blockStateOutput.accept(
                BlockModelGenerators.createStairs(ChiseledBlocks.NETHERITE_STAIRS,
                        BlockModelGenerators.plainVariant(innerNetheriteStairs),
                        BlockModelGenerators.plainVariant(netheriteStairs),
                        BlockModelGenerators.plainVariant(outerNetheriteStairs)));
        blockStateModelGenerator.registerSimpleItemModel(ChiseledBlocks.NETHERITE_STAIRS, netheriteStairs);

        BlockModelGenerators.BlockFamilyProvider packedSnowBrickPool = blockStateModelGenerator.family(ChiseledBlocks.PACKED_SNOW_BRICKS);
        packedSnowBrickPool.stairs(ChiseledBlocks.PACKED_SNOW_BRICK_STAIRS);
        packedSnowBrickPool.slab(ChiseledBlocks.PACKED_SNOW_BRICK_SLAB);
        BlockModelGenerators.BlockFamilyProvider cutPackedSnowBrickPool = blockStateModelGenerator.family(ChiseledBlocks.CUT_PACKED_SNOW_BRICKS);
        cutPackedSnowBrickPool.stairs(ChiseledBlocks.CUT_PACKED_SNOW_BRICK_STAIRS);
        cutPackedSnowBrickPool.slab(ChiseledBlocks.CUT_PACKED_SNOW_BRICK_SLAB);
        BlockModelGenerators.BlockFamilyProvider packedSnowTilePool = blockStateModelGenerator.family(ChiseledBlocks.PACKED_SNOW_TILES);
        packedSnowTilePool.stairs(ChiseledBlocks.PACKED_SNOW_TILE_STAIRS);
        packedSnowTilePool.slab(ChiseledBlocks.PACKED_SNOW_TILE_SLAB);

        BlockModelGenerators.BlockFamilyProvider terracottaBrickPool = blockStateModelGenerator.family(ChiseledBlocks.TERRACOTTA_BRICKS);
        terracottaBrickPool.stairs(ChiseledBlocks.TERRACOTTA_BRICK_STAIRS);
        terracottaBrickPool.slab(ChiseledBlocks.TERRACOTTA_BRICK_SLAB);
        terracottaBrickPool.wall(ChiseledBlocks.TERRACOTTA_BRICK_WALL);
        BlockModelGenerators.BlockFamilyProvider whiteTerracottaBrickPool = blockStateModelGenerator.family(ChiseledBlocks.WHITE_TERRACOTTA_BRICKS);
        whiteTerracottaBrickPool.stairs(ChiseledBlocks.WHITE_TERRACOTTA_BRICK_STAIRS);
        whiteTerracottaBrickPool.slab(ChiseledBlocks.WHITE_TERRACOTTA_BRICK_SLAB);
        whiteTerracottaBrickPool.wall(ChiseledBlocks.WHITE_TERRACOTTA_BRICK_WALL);
        BlockModelGenerators.BlockFamilyProvider lightGrayTerracottaBrickPool = blockStateModelGenerator.family(ChiseledBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS);
        lightGrayTerracottaBrickPool.stairs(ChiseledBlocks.LIGHT_GRAY_TERRACOTTA_BRICK_STAIRS);
        lightGrayTerracottaBrickPool.slab(ChiseledBlocks.LIGHT_GRAY_TERRACOTTA_BRICK_SLAB);
        lightGrayTerracottaBrickPool.wall(ChiseledBlocks.LIGHT_GRAY_TERRACOTTA_BRICK_WALL);
        BlockModelGenerators.BlockFamilyProvider grayTerracottaBrickPool = blockStateModelGenerator.family(ChiseledBlocks.GRAY_TERRACOTTA_BRICKS);
        grayTerracottaBrickPool.stairs(ChiseledBlocks.GRAY_TERRACOTTA_BRICK_STAIRS);
        grayTerracottaBrickPool.slab(ChiseledBlocks.GRAY_TERRACOTTA_BRICK_SLAB);
        grayTerracottaBrickPool.wall(ChiseledBlocks.GRAY_TERRACOTTA_BRICK_WALL);
        BlockModelGenerators.BlockFamilyProvider blackTerracottaBrickPool = blockStateModelGenerator.family(ChiseledBlocks.BLACK_TERRACOTTA_BRICKS);
        blackTerracottaBrickPool.stairs(ChiseledBlocks.BLACK_TERRACOTTA_BRICK_STAIRS);
        blackTerracottaBrickPool.slab(ChiseledBlocks.BLACK_TERRACOTTA_BRICK_SLAB);
        blackTerracottaBrickPool.wall(ChiseledBlocks.BLACK_TERRACOTTA_BRICK_WALL);
        BlockModelGenerators.BlockFamilyProvider brownTerracottaBrickPool = blockStateModelGenerator.family(ChiseledBlocks.BROWN_TERRACOTTA_BRICKS);
        brownTerracottaBrickPool.stairs(ChiseledBlocks.BROWN_TERRACOTTA_BRICK_STAIRS);
        brownTerracottaBrickPool.slab(ChiseledBlocks.BROWN_TERRACOTTA_BRICK_SLAB);
        brownTerracottaBrickPool.wall(ChiseledBlocks.BROWN_TERRACOTTA_BRICK_WALL);
        BlockModelGenerators.BlockFamilyProvider redTerracottaBrickPool = blockStateModelGenerator.family(ChiseledBlocks.RED_TERRACOTTA_BRICKS);
        redTerracottaBrickPool.stairs(ChiseledBlocks.RED_TERRACOTTA_BRICK_STAIRS);
        redTerracottaBrickPool.slab(ChiseledBlocks.RED_TERRACOTTA_BRICK_SLAB);
        redTerracottaBrickPool.wall(ChiseledBlocks.RED_TERRACOTTA_BRICK_WALL);
        BlockModelGenerators.BlockFamilyProvider orangeTerracottaBrickPool = blockStateModelGenerator.family(ChiseledBlocks.ORANGE_TERRACOTTA_BRICKS);
        orangeTerracottaBrickPool.stairs(ChiseledBlocks.ORANGE_TERRACOTTA_BRICK_STAIRS);
        orangeTerracottaBrickPool.slab(ChiseledBlocks.ORANGE_TERRACOTTA_BRICK_SLAB);
        orangeTerracottaBrickPool.wall(ChiseledBlocks.ORANGE_TERRACOTTA_BRICK_WALL);
        BlockModelGenerators.BlockFamilyProvider yellowTerracottaBrickPool = blockStateModelGenerator.family(ChiseledBlocks.YELLOW_TERRACOTTA_BRICKS);
        yellowTerracottaBrickPool.stairs(ChiseledBlocks.YELLOW_TERRACOTTA_BRICK_STAIRS);
        yellowTerracottaBrickPool.slab(ChiseledBlocks.YELLOW_TERRACOTTA_BRICK_SLAB);
        yellowTerracottaBrickPool.wall(ChiseledBlocks.YELLOW_TERRACOTTA_BRICK_WALL);
        BlockModelGenerators.BlockFamilyProvider limeTerracottaBrickPool = blockStateModelGenerator.family(ChiseledBlocks.LIME_TERRACOTTA_BRICKS);
        limeTerracottaBrickPool.stairs(ChiseledBlocks.LIME_TERRACOTTA_BRICK_STAIRS);
        limeTerracottaBrickPool.slab(ChiseledBlocks.LIME_TERRACOTTA_BRICK_SLAB);
        limeTerracottaBrickPool.wall(ChiseledBlocks.LIME_TERRACOTTA_BRICK_WALL);
        BlockModelGenerators.BlockFamilyProvider greenTerracottaBrickPool = blockStateModelGenerator.family(ChiseledBlocks.GREEN_TERRACOTTA_BRICKS);
        greenTerracottaBrickPool.stairs(ChiseledBlocks.GREEN_TERRACOTTA_BRICK_STAIRS);
        greenTerracottaBrickPool.slab(ChiseledBlocks.GREEN_TERRACOTTA_BRICK_SLAB);
        greenTerracottaBrickPool.wall(ChiseledBlocks.GREEN_TERRACOTTA_BRICK_WALL);
        BlockModelGenerators.BlockFamilyProvider cyanTerracottaBrickPool = blockStateModelGenerator.family(ChiseledBlocks.CYAN_TERRACOTTA_BRICKS);
        cyanTerracottaBrickPool.stairs(ChiseledBlocks.CYAN_TERRACOTTA_BRICK_STAIRS);
        cyanTerracottaBrickPool.slab(ChiseledBlocks.CYAN_TERRACOTTA_BRICK_SLAB);
        cyanTerracottaBrickPool.wall(ChiseledBlocks.CYAN_TERRACOTTA_BRICK_WALL);
        BlockModelGenerators.BlockFamilyProvider lightBlueTerracottaBrickPool = blockStateModelGenerator.family(ChiseledBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS);
        lightBlueTerracottaBrickPool.stairs(ChiseledBlocks.LIGHT_BLUE_TERRACOTTA_BRICK_STAIRS);
        lightBlueTerracottaBrickPool.slab(ChiseledBlocks.LIGHT_BLUE_TERRACOTTA_BRICK_SLAB);
        lightBlueTerracottaBrickPool.wall(ChiseledBlocks.LIGHT_BLUE_TERRACOTTA_BRICK_WALL);
        BlockModelGenerators.BlockFamilyProvider blueTerracottaBrickPool = blockStateModelGenerator.family(ChiseledBlocks.BLUE_TERRACOTTA_BRICKS);
        blueTerracottaBrickPool.stairs(ChiseledBlocks.BLUE_TERRACOTTA_BRICK_STAIRS);
        blueTerracottaBrickPool.slab(ChiseledBlocks.BLUE_TERRACOTTA_BRICK_SLAB);
        blueTerracottaBrickPool.wall(ChiseledBlocks.BLUE_TERRACOTTA_BRICK_WALL);
        BlockModelGenerators.BlockFamilyProvider purpleTerracottaBrickPool = blockStateModelGenerator.family(ChiseledBlocks.PURPLE_TERRACOTTA_BRICKS);
        purpleTerracottaBrickPool.stairs(ChiseledBlocks.PURPLE_TERRACOTTA_BRICK_STAIRS);
        purpleTerracottaBrickPool.slab(ChiseledBlocks.PURPLE_TERRACOTTA_BRICK_SLAB);
        purpleTerracottaBrickPool.wall(ChiseledBlocks.PURPLE_TERRACOTTA_BRICK_WALL);
        BlockModelGenerators.BlockFamilyProvider magentaTerracottaBrickPool = blockStateModelGenerator.family(ChiseledBlocks.MAGENTA_TERRACOTTA_BRICKS);
        magentaTerracottaBrickPool.stairs(ChiseledBlocks.MAGENTA_TERRACOTTA_BRICK_STAIRS);
        magentaTerracottaBrickPool.slab(ChiseledBlocks.MAGENTA_TERRACOTTA_BRICK_SLAB);
        magentaTerracottaBrickPool.wall(ChiseledBlocks.MAGENTA_TERRACOTTA_BRICK_WALL);
        BlockModelGenerators.BlockFamilyProvider pinkTerracottaBrickPool = blockStateModelGenerator.family(ChiseledBlocks.PINK_TERRACOTTA_BRICKS);
        pinkTerracottaBrickPool.stairs(ChiseledBlocks.PINK_TERRACOTTA_BRICK_STAIRS);
        pinkTerracottaBrickPool.slab(ChiseledBlocks.PINK_TERRACOTTA_BRICK_SLAB);
        pinkTerracottaBrickPool.wall(ChiseledBlocks.PINK_TERRACOTTA_BRICK_WALL);
    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerator) {
    }
}