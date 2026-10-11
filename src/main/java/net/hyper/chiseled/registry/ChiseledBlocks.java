package net.hyper.chiseled.registry;

import net.hyper.chiseled.refrence.ChiseledBlockItemIds;
import net.minecraft.references.BlockItemId;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.phys.AABB;

import static net.hyper.silliestlib.utils.SilliestLibRegUtils.regBlock;

public interface ChiseledBlocks {
    BlockBehaviour.StateArgumentPredicate<AABB> NEAR_PLANE_INTERSECTS_OUTLINE = (state, _, blockPos, nearPlaneBox) -> {
        for(AABB outlineBox : state.getOcclusionShape().toAabbs()) {
            if (outlineBox.move(blockPos).intersects(nearPlaneBox)) {
                return true;
            }
        }

        return false;
    };
    static Block regBasicBlock(BlockItemId id, BlockBehaviour.Properties blockProperties) {
        return regBlock(id, _ -> new Block(blockProperties.setId(id.block())));
    }
    static Block regBasicStairs(BlockItemId id, Block parentBlock, BlockBehaviour.Properties blockProperties) {
        return regBlock(id, _ -> new StairBlock(parentBlock.defaultBlockState(), blockProperties.setId(id.block()).isViewBlocking(NEAR_PLANE_INTERSECTS_OUTLINE)));
    }
    static Block regBasicSlab(BlockItemId id, BlockBehaviour.Properties blockProperties) {
        return regBlock(id, _ -> new SlabBlock(blockProperties.setId(id.block()).isViewBlocking(NEAR_PLANE_INTERSECTS_OUTLINE)));
    }
    static Block regBasicWall(BlockItemId id, BlockBehaviour.Properties blockProperties) {
        return regBlock(id, _ -> new WallBlock(blockProperties.setId(id.block()).forceSolidOn()));
    }
    static Block regBasicFence(BlockItemId id, BlockBehaviour.Properties blockProperties) {
        return regBlock(id, _ -> new FenceBlock(blockProperties.setId(id.block())));
    }
    static Block regBasicRotatedPillar(BlockItemId id, BlockBehaviour.Properties blockProperties) {
        return regBlock(id, _ -> new RotatedPillarBlock(blockProperties.setId(id.block())));
    }

    Block STONE_WALL = regBasicWall(ChiseledBlockItemIds.STONE_WALL, Blocks.STONE.properties());
    Block POLISHED_STONE = regBasicBlock(ChiseledBlockItemIds.POLISHED_STONE, Blocks.STONE_BRICKS.properties());
    Block POLISHED_STONE_STAIRS = regBasicStairs(ChiseledBlockItemIds.POLISHED_STONE_STAIRS, POLISHED_STONE, Blocks.STONE_BRICK_STAIRS.properties());
    Block POLISHED_STONE_SLAB = regBasicSlab(ChiseledBlockItemIds.POLISHED_STONE_SLAB, Blocks.STONE_BRICK_SLAB.properties());
    Block POLISHED_STONE_WALL = regBasicWall(ChiseledBlockItemIds.POLISHED_STONE_WALL, Blocks.STONE_BRICK_WALL.properties());
    Block STONE_PILLAR = regBasicRotatedPillar(ChiseledBlockItemIds.STONE_PILLAR, Blocks.STONE_BRICKS.properties());
    Block CUT_STONE_BRICKS = regBasicBlock(ChiseledBlockItemIds.CUT_STONE_BRICKS, Blocks.STONE_BRICKS.properties());
    Block CRACKED_CUT_STONE_BRICKS = regBasicBlock(ChiseledBlockItemIds.CRACKED_CUT_STONE_BRICKS, Blocks.STONE_BRICKS.properties());
    Block CUT_STONE_BRICK_STAIRS = regBasicStairs(ChiseledBlockItemIds.CUT_STONE_BRICK_STAIRS, CUT_STONE_BRICKS, Blocks.STONE_BRICK_STAIRS.properties());
    Block CUT_STONE_BRICK_SLAB = regBasicSlab(ChiseledBlockItemIds.CUT_STONE_BRICK_SLAB, Blocks.STONE_BRICK_SLAB.properties());
    Block MOSSY_CUT_STONE_BRICKS = regBasicBlock(ChiseledBlockItemIds.MOSSY_CUT_STONE_BRICKS, Blocks.MOSSY_STONE_BRICKS.properties());
    Block MOSSY_CUT_STONE_BRICK_STAIRS = regBasicStairs(ChiseledBlockItemIds.MOSSY_CUT_STONE_BRICK_STAIRS, MOSSY_CUT_STONE_BRICKS, Blocks.MOSSY_STONE_BRICK_STAIRS.properties());
    Block MOSSY_CUT_STONE_BRICK_SLAB = regBasicSlab(ChiseledBlockItemIds.MOSSY_CUT_STONE_BRICK_SLAB, Blocks.MOSSY_STONE_BRICK_SLAB.properties());
    Block STONE_TILES = regBasicBlock(ChiseledBlockItemIds.STONE_TILES, Blocks.STONE_BRICKS.properties());
    Block CRACKED_STONE_TILES = regBasicBlock(ChiseledBlockItemIds.CRACKED_STONE_TILES, Blocks.STONE_BRICKS.properties());
    Block STONE_TILE_STAIRS = regBasicStairs(ChiseledBlockItemIds.STONE_TILE_STAIRS, STONE_TILES, Blocks.STONE_BRICK_STAIRS.properties());
    Block STONE_TILE_SLAB = regBasicSlab(ChiseledBlockItemIds.STONE_TILE_SLAB, Blocks.STONE_BRICK_SLAB.properties());
    Block STONE_TILE_WALL = regBasicWall(ChiseledBlockItemIds.STONE_TILE_WALL, Blocks.STONE_BRICK_WALL.properties());
    Block MOSSY_STONE_TILES = regBasicBlock(ChiseledBlockItemIds.MOSSY_STONE_TILES, Blocks.MOSSY_STONE_BRICKS.properties());
    Block MOSSY_STONE_TILE_STAIRS = regBasicStairs(ChiseledBlockItemIds.MOSSY_STONE_TILE_STAIRS, MOSSY_STONE_TILES, Blocks.MOSSY_STONE_BRICK_STAIRS.properties());
    Block MOSSY_STONE_TILE_SLAB = regBasicSlab(ChiseledBlockItemIds.MOSSY_STONE_TILE_SLAB, Blocks.MOSSY_STONE_BRICK_SLAB.properties());
    Block MOSSY_STONE_TILE_WALL = regBasicWall(ChiseledBlockItemIds.MOSSY_STONE_TILE_WALL, Blocks.MOSSY_STONE_BRICK_WALL.properties());

    Block POLISHED_GRANITE_WALL = regBasicWall(ChiseledBlockItemIds.POLISHED_GRANITE_WALL, Blocks.POLISHED_GRANITE.properties());
    Block POLISHED_GRANITE_PILLAR = regBasicRotatedPillar(ChiseledBlockItemIds.POLISHED_GRANITE_PILLAR, Blocks.POLISHED_GRANITE.properties());
    Block POLISHED_GRANITE_BRICKS = regBasicBlock(ChiseledBlockItemIds.POLISHED_GRANITE_BRICKS, Blocks.POLISHED_GRANITE.properties());
    Block CRACKED_POLISHED_GRANITE_BRICKS = regBasicBlock(ChiseledBlockItemIds.CRACKED_POLISHED_GRANITE_BRICKS, Blocks.POLISHED_GRANITE.properties());
    Block POLISHED_GRANITE_BRICK_STAIRS = regBasicStairs(ChiseledBlockItemIds.POLISHED_GRANITE_BRICK_STAIRS, POLISHED_GRANITE_BRICKS, Blocks.POLISHED_GRANITE_STAIRS.properties());
    Block POLISHED_GRANITE_BRICK_SLAB = regBasicSlab(ChiseledBlockItemIds.POLISHED_GRANITE_BRICK_SLAB, Blocks.POLISHED_GRANITE_SLAB.properties());
    Block POLISHED_GRANITE_BRICK_WALL = regBasicWall(ChiseledBlockItemIds.POLISHED_GRANITE_BRICK_WALL, POLISHED_GRANITE_WALL.properties());
    Block CUT_POLISHED_GRANITE_BRICKS = regBasicBlock(ChiseledBlockItemIds.CUT_POLISHED_GRANITE_BRICKS, Blocks.POLISHED_GRANITE.properties());
    Block CRACKED_CUT_POLISHED_GRANITE_BRICKS = regBasicBlock(ChiseledBlockItemIds.CRACKED_CUT_POLISHED_GRANITE_BRICKS, Blocks.POLISHED_GRANITE.properties());
    Block CUT_POLISHED_GRANITE_BRICK_STAIRS = regBasicStairs(ChiseledBlockItemIds.CUT_POLISHED_GRANITE_BRICK_STAIRS, CUT_POLISHED_GRANITE_BRICKS, Blocks.POLISHED_GRANITE_STAIRS.properties());
    Block CUT_POLISHED_GRANITE_BRICK_SLAB = regBasicSlab(ChiseledBlockItemIds.CUT_POLISHED_GRANITE_BRICK_SLAB, Blocks.POLISHED_GRANITE_SLAB.properties());
    Block POLISHED_GRANITE_TILES = regBasicBlock(ChiseledBlockItemIds.POLISHED_GRANITE_TILES, Blocks.POLISHED_GRANITE.properties());
    Block CRACKED_POLISHED_GRANITE_TILES = regBasicBlock(ChiseledBlockItemIds.CRACKED_POLISHED_GRANITE_TILES, Blocks.POLISHED_GRANITE.properties());
    Block POLISHED_GRANITE_TILE_STAIRS = regBasicStairs(ChiseledBlockItemIds.POLISHED_GRANITE_TILE_STAIRS, POLISHED_GRANITE_TILES, Blocks.POLISHED_GRANITE_STAIRS.properties());
    Block POLISHED_GRANITE_TILE_SLAB = regBasicSlab(ChiseledBlockItemIds.POLISHED_GRANITE_TILE_SLAB, Blocks.POLISHED_GRANITE_SLAB.properties());
    Block POLISHED_GRANITE_TILE_WALL = regBasicWall(ChiseledBlockItemIds.POLISHED_GRANITE_TILE_WALL, POLISHED_GRANITE_WALL.properties());

    Block POLISHED_DIORITE_WALL = regBasicWall(ChiseledBlockItemIds.POLISHED_DIORITE_WALL, Blocks.POLISHED_DIORITE.properties());
    Block POLISHED_DIORITE_PILLAR = regBasicRotatedPillar(ChiseledBlockItemIds.POLISHED_DIORITE_PILLAR, Blocks.POLISHED_DIORITE.properties());
    Block POLISHED_DIORITE_BRICKS = regBasicBlock(ChiseledBlockItemIds.POLISHED_DIORITE_BRICKS, Blocks.POLISHED_DIORITE.properties());
    Block CRACKED_POLISHED_DIORITE_BRICKS = regBasicBlock(ChiseledBlockItemIds.CRACKED_POLISHED_DIORITE_BRICKS, Blocks.POLISHED_DIORITE.properties());
    Block POLISHED_DIORITE_BRICK_STAIRS = regBasicStairs(ChiseledBlockItemIds.POLISHED_DIORITE_BRICK_STAIRS, POLISHED_DIORITE_BRICKS, Blocks.POLISHED_DIORITE_STAIRS.properties());
    Block POLISHED_DIORITE_BRICK_SLAB = regBasicSlab(ChiseledBlockItemIds.POLISHED_DIORITE_BRICK_SLAB, Blocks.POLISHED_DIORITE_SLAB.properties());
    Block POLISHED_DIORITE_BRICK_WALL = regBasicWall(ChiseledBlockItemIds.POLISHED_DIORITE_BRICK_WALL, POLISHED_DIORITE_WALL.properties());
    Block CUT_POLISHED_DIORITE_BRICKS = regBasicBlock(ChiseledBlockItemIds.CUT_POLISHED_DIORITE_BRICKS, Blocks.POLISHED_DIORITE.properties());
    Block CRACKED_CUT_POLISHED_DIORITE_BRICKS = regBasicBlock(ChiseledBlockItemIds.CRACKED_CUT_POLISHED_DIORITE_BRICKS, Blocks.POLISHED_DIORITE.properties());
    Block CUT_POLISHED_DIORITE_BRICK_STAIRS = regBasicStairs(ChiseledBlockItemIds.CUT_POLISHED_DIORITE_BRICK_STAIRS, CUT_POLISHED_DIORITE_BRICKS, Blocks.POLISHED_DIORITE_STAIRS.properties());
    Block CUT_POLISHED_DIORITE_BRICK_SLAB = regBasicSlab(ChiseledBlockItemIds.CUT_POLISHED_DIORITE_BRICK_SLAB, Blocks.POLISHED_DIORITE_SLAB.properties());
    Block POLISHED_DIORITE_TILES = regBasicBlock(ChiseledBlockItemIds.POLISHED_DIORITE_TILES, Blocks.POLISHED_DIORITE.properties());
    Block CRACKED_POLISHED_DIORITE_TILES = regBasicBlock(ChiseledBlockItemIds.CRACKED_POLISHED_DIORITE_TILES, Blocks.POLISHED_DIORITE.properties());
    Block POLISHED_DIORITE_TILE_STAIRS = regBasicStairs(ChiseledBlockItemIds.POLISHED_DIORITE_TILE_STAIRS, POLISHED_DIORITE_TILES, Blocks.POLISHED_DIORITE_STAIRS.properties());
    Block POLISHED_DIORITE_TILE_SLAB = regBasicSlab(ChiseledBlockItemIds.POLISHED_DIORITE_TILE_SLAB, Blocks.POLISHED_DIORITE_SLAB.properties());
    Block POLISHED_DIORITE_TILE_WALL = regBasicWall(ChiseledBlockItemIds.POLISHED_DIORITE_TILE_WALL, POLISHED_DIORITE_WALL.properties());

    Block POLISHED_ANDESITE_WALL = regBasicWall(ChiseledBlockItemIds.POLISHED_ANDESITE_WALL, Blocks.POLISHED_ANDESITE.properties());
    Block POLISHED_ANDESITE_PILLAR = regBasicRotatedPillar(ChiseledBlockItemIds.POLISHED_ANDESITE_PILLAR, Blocks.POLISHED_ANDESITE.properties());
    Block POLISHED_ANDESITE_BRICKS = regBasicBlock(ChiseledBlockItemIds.POLISHED_ANDESITE_BRICKS, Blocks.POLISHED_ANDESITE.properties());
    Block CRACKED_POLISHED_ANDESITE_BRICKS = regBasicBlock(ChiseledBlockItemIds.CRACKED_POLISHED_ANDESITE_BRICKS, Blocks.POLISHED_ANDESITE.properties());
    Block POLISHED_ANDESITE_BRICK_STAIRS = regBasicStairs(ChiseledBlockItemIds.POLISHED_ANDESITE_BRICK_STAIRS, POLISHED_ANDESITE_BRICKS, Blocks.POLISHED_ANDESITE_STAIRS.properties());
    Block POLISHED_ANDESITE_BRICK_SLAB = regBasicSlab(ChiseledBlockItemIds.POLISHED_ANDESITE_BRICK_SLAB, Blocks.POLISHED_ANDESITE_SLAB.properties());
    Block POLISHED_ANDESITE_BRICK_WALL = regBasicWall(ChiseledBlockItemIds.POLISHED_ANDESITE_BRICK_WALL, POLISHED_ANDESITE_WALL.properties());
    Block CUT_POLISHED_ANDESITE_BRICKS = regBasicBlock(ChiseledBlockItemIds.CUT_POLISHED_ANDESITE_BRICKS, Blocks.POLISHED_ANDESITE.properties());
    Block CRACKED_CUT_POLISHED_ANDESITE_BRICKS = regBasicBlock(ChiseledBlockItemIds.CRACKED_CUT_POLISHED_ANDESITE_BRICKS, Blocks.POLISHED_ANDESITE.properties());
    Block CUT_POLISHED_ANDESITE_BRICK_STAIRS = regBasicStairs(ChiseledBlockItemIds.CUT_POLISHED_ANDESITE_BRICK_STAIRS, CUT_POLISHED_ANDESITE_BRICKS, Blocks.POLISHED_ANDESITE_STAIRS.properties());
    Block CUT_POLISHED_ANDESITE_BRICK_SLAB = regBasicSlab(ChiseledBlockItemIds.CUT_POLISHED_ANDESITE_BRICK_SLAB, Blocks.POLISHED_ANDESITE_SLAB.properties());
    Block POLISHED_ANDESITE_TILES = regBasicBlock(ChiseledBlockItemIds.POLISHED_ANDESITE_TILES, Blocks.POLISHED_ANDESITE.properties());
    Block CRACKED_POLISHED_ANDESITE_TILES = regBasicBlock(ChiseledBlockItemIds.CRACKED_POLISHED_ANDESITE_TILES, Blocks.POLISHED_ANDESITE.properties());
    Block POLISHED_ANDESITE_TILE_STAIRS = regBasicStairs(ChiseledBlockItemIds.POLISHED_ANDESITE_TILE_STAIRS, POLISHED_ANDESITE_TILES, Blocks.POLISHED_ANDESITE_STAIRS.properties());
    Block POLISHED_ANDESITE_TILE_SLAB = regBasicSlab(ChiseledBlockItemIds.POLISHED_ANDESITE_TILE_SLAB, Blocks.POLISHED_ANDESITE_SLAB.properties());
    Block POLISHED_ANDESITE_TILE_WALL = regBasicWall(ChiseledBlockItemIds.POLISHED_ANDESITE_TILE_WALL, POLISHED_ANDESITE_WALL.properties());

    Block DEEPSLATE_PILLAR = regBasicRotatedPillar(ChiseledBlockItemIds.DEEPSLATE_PILLAR, Blocks.POLISHED_DEEPSLATE.properties());
    Block CUT_DEEPSLATE_BRICKS = regBasicBlock(ChiseledBlockItemIds.CUT_DEEPSLATE_BRICKS, Blocks.DEEPSLATE_BRICKS.properties());
    Block CRACKED_CUT_DEEPSLATE_BRICKS = regBasicBlock(ChiseledBlockItemIds.CRACKED_CUT_DEEPSLATE_BRICKS, Blocks.DEEPSLATE_BRICKS.properties());
    Block CUT_DEEPSLATE_BRICK_STAIRS = regBasicStairs(ChiseledBlockItemIds.CUT_DEEPSLATE_BRICK_STAIRS, CUT_DEEPSLATE_BRICKS, Blocks.DEEPSLATE_BRICK_STAIRS.properties());
    Block CUT_DEEPSLATE_BRICK_SLAB = regBasicSlab(ChiseledBlockItemIds.CUT_DEEPSLATE_BRICK_SLAB, Blocks.DEEPSLATE_BRICK_SLAB.properties());

    Block CRACKED_BRICKS = regBasicBlock(ChiseledBlockItemIds.CRACKED_BRICKS, Blocks.BRICKS.properties());
    Block WEATHERED_BRICKS = regBasicBlock(ChiseledBlockItemIds.WEATHERED_BRICKS, Blocks.BRICKS.properties());
    Block WEATHERED_BRICK_STAIRS = regBasicStairs(ChiseledBlockItemIds.WEATHERED_BRICK_STAIRS, WEATHERED_BRICKS, Blocks.BRICK_STAIRS.properties());
    Block WEATHERED_BRICK_SLAB = regBasicSlab(ChiseledBlockItemIds.WEATHERED_BRICK_SLAB, Blocks.BRICK_SLAB.properties());
    Block WEATHERED_BRICK_WALL = regBasicWall(ChiseledBlockItemIds.WEATHERED_BRICK_WALL, Blocks.BRICK_WALL.properties());
    Block MOSSY_BRICKS = regBasicBlock(ChiseledBlockItemIds.MOSSY_BRICKS, Blocks.BRICKS.properties());
    Block MOSSY_BRICK_STAIRS = regBasicStairs(ChiseledBlockItemIds.MOSSY_BRICK_STAIRS, MOSSY_BRICKS, Blocks.BRICK_STAIRS.properties());
    Block MOSSY_BRICK_SLAB = regBasicSlab(ChiseledBlockItemIds.MOSSY_BRICK_SLAB, Blocks.BRICK_SLAB.properties());
    Block MOSSY_BRICK_WALL = regBasicWall(ChiseledBlockItemIds.MOSSY_BRICK_WALL, Blocks.BRICK_WALL.properties());

    Block PACKED_MUD_STAIRS = regBasicStairs(ChiseledBlockItemIds.PACKED_MUD_STAIRS, Blocks.PACKED_MUD, Blocks.PACKED_MUD.properties());
    Block PACKED_MUD_SLAB = regBasicSlab(ChiseledBlockItemIds.PACKED_MUD_SLAB, Blocks.PACKED_MUD.properties());
    Block PACKED_MUD_WALL = regBasicWall(ChiseledBlockItemIds.PACKED_MUD_WALL, Blocks.PACKED_MUD.properties());
    Block MOSSY_MUD_BRICKS = regBasicBlock(ChiseledBlockItemIds.MOSSY_MUD_BRICKS, Blocks.MUD_BRICKS.properties());
    Block MOSSY_MUD_BRICK_STAIRS = regBasicStairs(ChiseledBlockItemIds.MOSSY_MUD_BRICK_STAIRS, MOSSY_MUD_BRICKS, Blocks.MUD_BRICK_STAIRS.properties());
    Block MOSSY_MUD_BRICK_SLAB = regBasicSlab(ChiseledBlockItemIds.MOSSY_MUD_BRICK_SLAB, Blocks.MUD_BRICK_SLAB.properties());
    Block MOSSY_MUD_BRICK_WALL = regBasicWall(ChiseledBlockItemIds.MOSSY_MUD_BRICK_WALL, Blocks.MUD_BRICK_WALL.properties());
    Block CUT_MUD_BRICKS = regBasicBlock(ChiseledBlockItemIds.CUT_MUD_BRICKS, Blocks.MUD_BRICKS.properties());
    Block CUT_MUD_BRICK_STAIRS = regBasicStairs(ChiseledBlockItemIds.CUT_MUD_BRICK_STAIRS, CUT_MUD_BRICKS, Blocks.MUD_BRICK_STAIRS.properties());
    Block CUT_MUD_BRICK_SLAB = regBasicSlab(ChiseledBlockItemIds.CUT_MUD_BRICK_SLAB, Blocks.MUD_BRICK_SLAB.properties());
    Block MOSSY_CUT_MUD_BRICKS = regBasicBlock(ChiseledBlockItemIds.MOSSY_CUT_MUD_BRICKS, Blocks.MUD_BRICKS.properties());
    Block MOSSY_CUT_MUD_BRICK_STAIRS = regBasicStairs(ChiseledBlockItemIds.MOSSY_CUT_MUD_BRICK_STAIRS, MOSSY_CUT_MUD_BRICKS, Blocks.MUD_BRICK_STAIRS.properties());
    Block MOSSY_CUT_MUD_BRICK_SLAB = regBasicSlab(ChiseledBlockItemIds.MOSSY_CUT_MUD_BRICK_SLAB, Blocks.MUD_BRICK_SLAB.properties());
    Block MUD_TILES = regBasicBlock(ChiseledBlockItemIds.MUD_TILES, Blocks.MUD_BRICKS.properties());
    Block MUD_TILE_STAIRS = regBasicStairs(ChiseledBlockItemIds.MUD_TILE_STAIRS, MUD_TILES, Blocks.MUD_BRICK_STAIRS.properties());
    Block MUD_TILE_SLAB = regBasicSlab(ChiseledBlockItemIds.MUD_TILE_SLAB, Blocks.MUD_BRICK_SLAB.properties());
    Block MUD_TILE_WALL = regBasicWall(ChiseledBlockItemIds.MUD_TILE_WALL, Blocks.MUD_BRICK_WALL.properties());
    Block MOSSY_MUD_TILES = regBasicBlock(ChiseledBlockItemIds.MOSSY_MUD_TILES, Blocks.MUD_BRICKS.properties());
    Block MOSSY_MUD_TILE_STAIRS = regBasicStairs(ChiseledBlockItemIds.MOSSY_MUD_TILE_STAIRS, MOSSY_MUD_TILES, Blocks.MUD_BRICK_STAIRS.properties());
    Block MOSSY_MUD_TILE_SLAB = regBasicSlab(ChiseledBlockItemIds.MOSSY_MUD_TILE_SLAB, Blocks.MUD_BRICK_SLAB.properties());
    Block MOSSY_MUD_TILE_WALL = regBasicWall(ChiseledBlockItemIds.MOSSY_MUD_TILE_WALL, Blocks.MUD_BRICK_WALL.properties());

    Block SMOOTH_SANDSTONE_WALL = regBasicWall(ChiseledBlockItemIds.SMOOTH_SANDSTONE_WALL, Blocks.SMOOTH_SANDSTONE.properties());
    Block SMOOTH_SANDSTONE_PILLAR = regBasicRotatedPillar(ChiseledBlockItemIds.SMOOTH_SANDSTONE_PILLAR, Blocks.SMOOTH_SANDSTONE.properties());
    Block SMOOTH_SANDSTONE_BRICKS = regBasicBlock(ChiseledBlockItemIds.SMOOTH_SANDSTONE_BRICKS, Blocks.SMOOTH_SANDSTONE.properties());
    Block SMOOTH_SANDSTONE_BRICK_STAIRS = regBasicStairs(ChiseledBlockItemIds.SMOOTH_SANDSTONE_BRICK_STAIRS, SMOOTH_SANDSTONE_BRICKS, Blocks.SMOOTH_SANDSTONE_STAIRS.properties());
    Block SMOOTH_SANDSTONE_BRICK_SLAB = regBasicSlab(ChiseledBlockItemIds.SMOOTH_SANDSTONE_BRICK_SLAB, Blocks.SMOOTH_SANDSTONE_SLAB.properties());
    Block SMOOTH_SANDSTONE_BRICK_WALL = regBasicWall(ChiseledBlockItemIds.SMOOTH_SANDSTONE_BRICK_WALL, SMOOTH_SANDSTONE_WALL.properties());
    Block CUT_SMOOTH_SANDSTONE_BRICKS = regBasicBlock(ChiseledBlockItemIds.CUT_SMOOTH_SANDSTONE_BRICKS, Blocks.SMOOTH_SANDSTONE.properties());
    Block CUT_SMOOTH_SANDSTONE_BRICK_STAIRS = regBasicStairs(ChiseledBlockItemIds.CUT_SMOOTH_SANDSTONE_BRICK_STAIRS, CUT_SMOOTH_SANDSTONE_BRICKS, Blocks.SMOOTH_SANDSTONE_STAIRS.properties());
    Block CUT_SMOOTH_SANDSTONE_BRICK_SLAB = regBasicSlab(ChiseledBlockItemIds.CUT_SMOOTH_SANDSTONE_BRICK_SLAB, Blocks.SMOOTH_SANDSTONE_SLAB.properties());
    Block SMOOTH_SANDSTONE_TILES = regBasicBlock(ChiseledBlockItemIds.SMOOTH_SANDSTONE_TILES, Blocks.SMOOTH_SANDSTONE.properties());
    Block SMOOTH_SANDSTONE_TILE_STAIRS = regBasicStairs(ChiseledBlockItemIds.SMOOTH_SANDSTONE_TILE_STAIRS, SMOOTH_SANDSTONE_TILES, Blocks.SMOOTH_SANDSTONE_STAIRS.properties());
    Block SMOOTH_SANDSTONE_TILE_SLAB = regBasicSlab(ChiseledBlockItemIds.SMOOTH_SANDSTONE_TILE_SLAB, Blocks.SMOOTH_SANDSTONE_SLAB.properties());
    Block SMOOTH_SANDSTONE_TILE_WALL = regBasicWall(ChiseledBlockItemIds.SMOOTH_SANDSTONE_TILE_WALL, SMOOTH_SANDSTONE_WALL.properties());
    Block SMOOTH_RED_SANDSTONE_WALL = regBasicWall(ChiseledBlockItemIds.SMOOTH_RED_SANDSTONE_WALL, Blocks.SMOOTH_RED_SANDSTONE.properties());
    Block SMOOTH_RED_SANDSTONE_PILLAR = regBasicRotatedPillar(ChiseledBlockItemIds.SMOOTH_RED_SANDSTONE_PILLAR, Blocks.SMOOTH_RED_SANDSTONE.properties());
    Block SMOOTH_RED_SANDSTONE_BRICKS = regBasicBlock(ChiseledBlockItemIds.SMOOTH_RED_SANDSTONE_BRICKS, Blocks.SMOOTH_RED_SANDSTONE.properties());
    Block SMOOTH_RED_SANDSTONE_BRICK_STAIRS = regBasicStairs(ChiseledBlockItemIds.SMOOTH_RED_SANDSTONE_BRICK_STAIRS, SMOOTH_RED_SANDSTONE_BRICKS, Blocks.SMOOTH_RED_SANDSTONE_STAIRS.properties());
    Block SMOOTH_RED_SANDSTONE_BRICK_SLAB = regBasicSlab(ChiseledBlockItemIds.SMOOTH_RED_SANDSTONE_BRICK_SLAB, Blocks.SMOOTH_RED_SANDSTONE_SLAB.properties());
    Block SMOOTH_RED_SANDSTONE_BRICK_WALL = regBasicWall(ChiseledBlockItemIds.SMOOTH_RED_SANDSTONE_BRICK_WALL, SMOOTH_RED_SANDSTONE_WALL.properties());
    Block CUT_SMOOTH_RED_SANDSTONE_BRICKS = regBasicBlock(ChiseledBlockItemIds.CUT_SMOOTH_RED_SANDSTONE_BRICKS, Blocks.SMOOTH_RED_SANDSTONE.properties());
    Block CUT_SMOOTH_RED_SANDSTONE_BRICK_STAIRS = regBasicStairs(ChiseledBlockItemIds.CUT_SMOOTH_RED_SANDSTONE_BRICK_STAIRS, CUT_SMOOTH_RED_SANDSTONE_BRICKS, Blocks.SMOOTH_RED_SANDSTONE_STAIRS.properties());
    Block CUT_SMOOTH_RED_SANDSTONE_BRICK_SLAB = regBasicSlab(ChiseledBlockItemIds.CUT_SMOOTH_RED_SANDSTONE_BRICK_SLAB, Blocks.SMOOTH_RED_SANDSTONE_SLAB.properties());
    Block SMOOTH_RED_SANDSTONE_TILES = regBasicBlock(ChiseledBlockItemIds.SMOOTH_RED_SANDSTONE_TILES, Blocks.SMOOTH_RED_SANDSTONE.properties());
    Block SMOOTH_RED_SANDSTONE_TILE_STAIRS = regBasicStairs(ChiseledBlockItemIds.SMOOTH_RED_SANDSTONE_TILE_STAIRS, SMOOTH_RED_SANDSTONE_TILES, Blocks.SMOOTH_RED_SANDSTONE_STAIRS.properties());
    Block SMOOTH_RED_SANDSTONE_TILE_SLAB = regBasicSlab(ChiseledBlockItemIds.SMOOTH_RED_SANDSTONE_TILE_SLAB, Blocks.SMOOTH_RED_SANDSTONE_SLAB.properties());
    Block SMOOTH_RED_SANDSTONE_TILE_WALL = regBasicWall(ChiseledBlockItemIds.SMOOTH_RED_SANDSTONE_TILE_WALL, SMOOTH_RED_SANDSTONE_WALL.properties());

    Block CRACKED_CINNABAR_BRICKS = regBasicBlock(ChiseledBlockItemIds.CRACKED_CINNABAR_BRICKS, Blocks.CINNABAR_BRICKS.properties());
    Block CUT_CINNABAR_BRICKS = regBasicBlock(ChiseledBlockItemIds.CUT_CINNABAR_BRICKS, Blocks.CINNABAR_BRICKS.properties());
    Block CRACKED_CUT_CINNABAR_BRICKS = regBasicBlock(ChiseledBlockItemIds.CRACKED_CUT_CINNABAR_BRICKS, Blocks.CINNABAR_BRICKS.properties());
    Block CUT_CINNABAR_BRICK_STAIRS = regBasicStairs(ChiseledBlockItemIds.CUT_CINNABAR_BRICK_STAIRS, CUT_CINNABAR_BRICKS, Blocks.CINNABAR_BRICK_STAIRS.properties());
    Block CUT_CINNABAR_BRICK_SLAB = regBasicSlab(ChiseledBlockItemIds.CUT_CINNABAR_BRICK_SLAB, Blocks.CINNABAR_BRICK_SLAB.properties());
    Block CINNABAR_TILES = regBasicBlock(ChiseledBlockItemIds.CINNABAR_TILES, Blocks.CINNABAR_BRICKS.properties());
    Block CRACKED_CINNABAR_TILES = regBasicBlock(ChiseledBlockItemIds.CRACKED_CINNABAR_TILES, Blocks.CINNABAR_BRICKS.properties());
    Block CINNABAR_TILE_STAIRS = regBasicStairs(ChiseledBlockItemIds.CINNABAR_TILE_STAIRS, CINNABAR_TILES, Blocks.CINNABAR_BRICK_STAIRS.properties());
    Block CINNABAR_TILE_SLAB = regBasicSlab(ChiseledBlockItemIds.CINNABAR_TILE_SLAB, Blocks.CINNABAR_BRICK_SLAB.properties());
    Block CINNABAR_TILE_WALL = regBasicWall(ChiseledBlockItemIds.CINNABAR_TILE_WALL, Blocks.CINNABAR_BRICK_WALL.properties());

    Block CRACKED_SULFUR_BRICKS = regBasicBlock(ChiseledBlockItemIds.CRACKED_SULFUR_BRICKS, Blocks.SULFUR_BRICKS.properties());
    Block CUT_SULFUR_BRICKS = regBasicBlock(ChiseledBlockItemIds.CUT_SULFUR_BRICKS, Blocks.SULFUR_BRICKS.properties());
    Block CRACKED_CUT_SULFUR_BRICKS = regBasicBlock(ChiseledBlockItemIds.CRACKED_CUT_SULFUR_BRICKS, Blocks.SULFUR_BRICKS.properties());
    Block CUT_SULFUR_BRICK_STAIRS = regBasicStairs(ChiseledBlockItemIds.CUT_SULFUR_BRICK_STAIRS, CUT_SULFUR_BRICKS, Blocks.SULFUR_BRICK_STAIRS.properties());
    Block CUT_SULFUR_BRICK_SLAB = regBasicSlab(ChiseledBlockItemIds.CUT_SULFUR_BRICK_SLAB, Blocks.SULFUR_BRICK_SLAB.properties());
    Block SULFUR_TILES = regBasicBlock(ChiseledBlockItemIds.SULFUR_TILES, Blocks.SULFUR_BRICKS.properties());
    Block CRACKED_SULFUR_TILES = regBasicBlock(ChiseledBlockItemIds.CRACKED_SULFUR_TILES, Blocks.SULFUR_BRICKS.properties());
    Block SULFUR_TILE_STAIRS = regBasicStairs(ChiseledBlockItemIds.SULFUR_TILE_STAIRS, SULFUR_TILES, Blocks.SULFUR_BRICK_STAIRS.properties());
    Block SULFUR_TILE_SLAB = regBasicSlab(ChiseledBlockItemIds.SULFUR_TILE_SLAB, Blocks.SULFUR_BRICK_SLAB.properties());
    Block SULFUR_TILE_WALL = regBasicWall(ChiseledBlockItemIds.SULFUR_TILE_WALL, Blocks.SULFUR_BRICK_WALL.properties());

    Block POLISHED_PRISMARINE = regBasicBlock(ChiseledBlockItemIds.POLISHED_PRISMARINE, Blocks.PRISMARINE_BRICKS.properties());
    Block POLISHED_PRISMARINE_STAIRS = regBasicStairs(ChiseledBlockItemIds.POLISHED_PRISMARINE_STAIRS, POLISHED_PRISMARINE, Blocks.PRISMARINE_BRICK_STAIRS.properties());
    Block POLISHED_PRISMARINE_SLAB = regBasicSlab(ChiseledBlockItemIds.POLISHED_PRISMARINE_SLAB, Blocks.PRISMARINE_BRICK_SLAB.properties());
    Block POLISHED_PRISMARINE_WALL = regBasicWall(ChiseledBlockItemIds.POLISHED_PRISMARINE_WALL, Blocks.PRISMARINE_BRICKS.properties());
    Block PRISMARINE_BRICK_WALL = regBasicWall(ChiseledBlockItemIds.PRISMARINE_BRICK_WALL, Blocks.PRISMARINE_BRICKS.properties());
    Block CUT_PRISMARINE_BRICKS = regBasicBlock(ChiseledBlockItemIds.CUT_PRISMARINE_BRICKS, Blocks.PRISMARINE_BRICKS.properties());
    Block CUT_PRISMARINE_BRICK_STAIRS = regBasicStairs(ChiseledBlockItemIds.CUT_PRISMARINE_BRICK_STAIRS, CUT_PRISMARINE_BRICKS, Blocks.PRISMARINE_BRICK_STAIRS.properties());
    Block CUT_PRISMARINE_BRICK_SLAB = regBasicSlab(ChiseledBlockItemIds.CUT_PRISMARINE_BRICK_SLAB, Blocks.PRISMARINE_BRICK_SLAB.properties());

    Block DARK_PRISMARINE_WALL = regBasicWall(ChiseledBlockItemIds.DARK_PRISMARINE_WALL, Blocks.PRISMARINE_BRICKS.properties());
    Block POLISHED_DARK_PRISMARINE = regBasicBlock(ChiseledBlockItemIds.POLISHED_DARK_PRISMARINE, Blocks.PRISMARINE_BRICKS.properties());
    Block POLISHED_DARK_PRISMARINE_STAIRS = regBasicStairs(ChiseledBlockItemIds.POLISHED_DARK_PRISMARINE_STAIRS, POLISHED_DARK_PRISMARINE, Blocks.PRISMARINE_BRICK_STAIRS.properties());
    Block POLISHED_DARK_PRISMARINE_SLAB = regBasicSlab(ChiseledBlockItemIds.POLISHED_DARK_PRISMARINE_SLAB, Blocks.PRISMARINE_BRICK_SLAB.properties());
    Block POLISHED_DARK_PRISMARINE_WALL = regBasicWall(ChiseledBlockItemIds.POLISHED_DARK_PRISMARINE_WALL, Blocks.PRISMARINE_BRICKS.properties());
    Block DARK_PRISMARINE_BRICKS = regBasicBlock(ChiseledBlockItemIds.DARK_PRISMARINE_BRICKS, Blocks.PRISMARINE_BRICKS.properties());
    Block DARK_PRISMARINE_BRICK_STAIRS = regBasicStairs(ChiseledBlockItemIds.DARK_PRISMARINE_BRICK_STAIRS, DARK_PRISMARINE_BRICKS, Blocks.PRISMARINE_BRICK_STAIRS.properties());
    Block DARK_PRISMARINE_BRICK_SLAB = regBasicSlab(ChiseledBlockItemIds.DARK_PRISMARINE_BRICK_SLAB, Blocks.PRISMARINE_BRICK_SLAB.properties());
    Block DARK_PRISMARINE_BRICK_WALL = regBasicWall(ChiseledBlockItemIds.DARK_PRISMARINE_BRICK_WALL, Blocks.PRISMARINE_BRICKS.properties());
    Block CUT_DARK_PRISMARINE_BRICKS = regBasicBlock(ChiseledBlockItemIds.CUT_DARK_PRISMARINE_BRICKS, Blocks.PRISMARINE_BRICKS.properties());
    Block CUT_DARK_PRISMARINE_BRICK_STAIRS = regBasicStairs(ChiseledBlockItemIds.CUT_DARK_PRISMARINE_BRICK_STAIRS, CUT_DARK_PRISMARINE_BRICKS, Blocks.PRISMARINE_BRICK_STAIRS.properties());
    Block CUT_DARK_PRISMARINE_BRICK_SLAB = regBasicSlab(ChiseledBlockItemIds.CUT_DARK_PRISMARINE_BRICK_SLAB, Blocks.PRISMARINE_BRICK_SLAB.properties());

    Block CRACKED_RED_NETHER_BRICKS = regBasicBlock(ChiseledBlockItemIds.CRACKED_RED_NETHER_BRICKS, Blocks.RED_NETHER_BRICKS.properties());
    Block RED_NETHER_BRICK_FENCE = regBasicFence(ChiseledBlockItemIds.RED_NETHER_BRICK_FENCE, Blocks.NETHER_BRICK_FENCE.properties());
    Block CHISELED_RED_NETHER_BRICKS = regBasicBlock(ChiseledBlockItemIds.CHISELED_RED_NETHER_BRICKS, Blocks.RED_NETHER_BRICKS.properties());

    Block POLISHED_BLACKSTONE_PILLAR = regBasicRotatedPillar(ChiseledBlockItemIds.POLISHED_BLACKSTONE_PILLAR, Blocks.POLISHED_BLACKSTONE_BRICKS.properties());
    Block CUT_POLISHED_BLACKSTONE_BRICKS = regBasicBlock(ChiseledBlockItemIds.CUT_POLISHED_BLACKSTONE_BRICKS, Blocks.POLISHED_BLACKSTONE_BRICKS.properties());
    Block CRACKED_CUT_POLISHED_BLACKSTONE_BRICKS = regBasicBlock(ChiseledBlockItemIds.CRACKED_CUT_POLISHED_BLACKSTONE_BRICKS, Blocks.POLISHED_BLACKSTONE_BRICKS.properties());
    Block CUT_POLISHED_BLACKSTONE_BRICK_STAIRS = regBasicStairs(ChiseledBlockItemIds.CUT_POLISHED_BLACKSTONE_BRICK_STAIRS, CUT_POLISHED_BLACKSTONE_BRICKS, Blocks.POLISHED_BLACKSTONE_BRICK_STAIRS.properties());
    Block CUT_POLISHED_BLACKSTONE_BRICK_SLAB = regBasicSlab(ChiseledBlockItemIds.CUT_POLISHED_BLACKSTONE_BRICK_SLAB, Blocks.POLISHED_BLACKSTONE_BRICK_SLAB.properties());
    Block POLISHED_BLACKSTONE_TILES = regBasicBlock(ChiseledBlockItemIds.POLISHED_BLACKSTONE_TILES, Blocks.POLISHED_BLACKSTONE_BRICKS.properties());
    Block CRACKED_POLISHED_BLACKSTONE_TILES = regBasicBlock(ChiseledBlockItemIds.CRACKED_POLISHED_BLACKSTONE_TILES, Blocks.POLISHED_BLACKSTONE_BRICKS.properties());
    Block POLISHED_BLACKSTONE_TILE_STAIRS = regBasicStairs(ChiseledBlockItemIds.POLISHED_BLACKSTONE_TILE_STAIRS, POLISHED_BLACKSTONE_TILES, Blocks.POLISHED_BLACKSTONE_BRICK_STAIRS.properties());
    Block POLISHED_BLACKSTONE_TILE_SLAB = regBasicSlab(ChiseledBlockItemIds.POLISHED_BLACKSTONE_TILE_SLAB, Blocks.POLISHED_BLACKSTONE_BRICK_SLAB.properties());
    Block POLISHED_BLACKSTONE_TILE_WALL = regBasicWall(ChiseledBlockItemIds.POLISHED_BLACKSTONE_TILE_WALL, Blocks.POLISHED_BLACKSTONE_BRICK_WALL.properties());

    Block END_STONE_STAIRS = regBasicStairs(ChiseledBlockItemIds.END_STONE_STAIRS, Blocks.END_STONE, Blocks.END_STONE.properties());
    Block END_STONE_SLAB = regBasicSlab(ChiseledBlockItemIds.END_STONE_SLAB, Blocks.END_STONE.properties());
    Block END_STONE_WALL = regBasicWall(ChiseledBlockItemIds.END_STONE_WALL, Blocks.END_STONE.properties());
    Block POLISHED_END_STONE = regBasicBlock(ChiseledBlockItemIds.POLISHED_END_STONE, Blocks.END_STONE_BRICKS.properties());
    Block POLISHED_END_STONE_STAIRS = regBasicStairs(ChiseledBlockItemIds.POLISHED_END_STONE_STAIRS, POLISHED_END_STONE, Blocks.END_STONE_BRICK_STAIRS.properties());
    Block POLISHED_END_STONE_SLAB = regBasicSlab(ChiseledBlockItemIds.POLISHED_END_STONE_SLAB, Blocks.END_STONE_BRICK_SLAB.properties());
    Block POLISHED_END_STONE_WALL = regBasicWall(ChiseledBlockItemIds.POLISHED_END_STONE_WALL, Blocks.END_STONE_BRICK_WALL.properties());
    Block END_STONE_PILLAR = regBasicRotatedPillar(ChiseledBlockItemIds.END_STONE_PILLAR, Blocks.END_STONE_BRICKS.properties());
    Block CRACKED_END_STONE_BRICKS = regBasicBlock(ChiseledBlockItemIds.CRACKED_END_STONE_BRICKS, Blocks.END_STONE_BRICKS.properties());
    Block CUT_END_STONE_BRICKS = regBasicBlock(ChiseledBlockItemIds.CUT_END_STONE_BRICKS, Blocks.END_STONE_BRICKS.properties());
    Block CRACKED_CUT_END_STONE_BRICKS = regBasicBlock(ChiseledBlockItemIds.CRACKED_CUT_END_STONE_BRICKS, Blocks.END_STONE_BRICKS.properties());
    Block CUT_END_STONE_BRICK_STAIRS = regBasicStairs(ChiseledBlockItemIds.CUT_END_STONE_BRICK_STAIRS, CUT_END_STONE_BRICKS, Blocks.END_STONE_BRICK_STAIRS.properties());
    Block CUT_END_STONE_BRICK_SLAB = regBasicSlab(ChiseledBlockItemIds.CUT_END_STONE_BRICK_SLAB, Blocks.END_STONE_BRICK_SLAB.properties());
    Block END_STONE_TILES = regBasicBlock(ChiseledBlockItemIds.END_STONE_TILES, Blocks.END_STONE_BRICKS.properties());
    Block CRACKED_END_STONE_TILES = regBasicBlock(ChiseledBlockItemIds.CRACKED_END_STONE_TILES, Blocks.END_STONE_BRICKS.properties());
    Block END_STONE_TILE_STAIRS = regBasicStairs(ChiseledBlockItemIds.END_STONE_TILE_STAIRS, END_STONE_TILES, Blocks.END_STONE_BRICK_STAIRS.properties());
    Block END_STONE_TILE_SLAB = regBasicSlab(ChiseledBlockItemIds.END_STONE_TILE_SLAB, Blocks.END_STONE_BRICK_SLAB.properties());
    Block END_STONE_TILE_WALL = regBasicWall(ChiseledBlockItemIds.END_STONE_TILE_WALL, Blocks.END_STONE_BRICK_WALL.properties());

    Block QUARTZ_WALL = regBasicWall(ChiseledBlockItemIds.QUARTZ_WALL, Blocks.QUARTZ_BLOCK.properties());
    Block SMOOTH_QUARTZ_WALL = regBasicWall(ChiseledBlockItemIds.SMOOTH_QUARTZ_WALL, Blocks.SMOOTH_QUARTZ.properties());
    Block QUARTZ_BRICK_STAIRS = regBasicStairs(ChiseledBlockItemIds.QUARTZ_BRICK_STAIRS, Blocks.QUARTZ_BRICKS, Blocks.QUARTZ_BRICKS.properties());
    Block QUARTZ_BRICK_SLAB = regBasicSlab(ChiseledBlockItemIds.QUARTZ_BRICK_SLAB, Blocks.QUARTZ_BRICKS.properties());
    Block QUARTZ_BRICK_WALL = regBasicWall(ChiseledBlockItemIds.QUARTZ_BRICK_WALL, Blocks.QUARTZ_BRICKS.properties());
    Block CUT_QUARTZ_BRICKS = regBasicBlock(ChiseledBlockItemIds.CUT_QUARTZ_BRICKS, Blocks.QUARTZ_BRICKS.properties());
    Block CUT_QUARTZ_BRICK_STAIRS = regBasicStairs(ChiseledBlockItemIds.CUT_QUARTZ_BRICK_STAIRS, CUT_QUARTZ_BRICKS, Blocks.QUARTZ_BRICKS.properties());
    Block CUT_QUARTZ_BRICK_SLAB = regBasicSlab(ChiseledBlockItemIds.CUT_QUARTZ_BRICK_SLAB, Blocks.QUARTZ_BRICKS.properties());
    Block QUARTZ_TILES = regBasicBlock(ChiseledBlockItemIds.QUARTZ_TILES, Blocks.QUARTZ_BRICKS.properties());
    Block QUARTZ_TILE_STAIRS = regBasicStairs(ChiseledBlockItemIds.QUARTZ_TILE_STAIRS, QUARTZ_TILES, Blocks.QUARTZ_BRICKS.properties());
    Block QUARTZ_TILE_SLAB = regBasicSlab(ChiseledBlockItemIds.QUARTZ_TILE_SLAB, Blocks.QUARTZ_BRICKS.properties());
    Block QUARTZ_TILE_WALL = regBasicWall(ChiseledBlockItemIds.QUARTZ_TILE_WALL, Blocks.QUARTZ_BRICKS.properties());

    Block TERRACOTTA_STAIRS = regBasicStairs(ChiseledBlockItemIds.TERRACOTTA_STAIRS, Blocks.TERRACOTTA, Blocks.TERRACOTTA.properties());
    Block TERRACOTTA_SLAB = regBasicSlab(ChiseledBlockItemIds.TERRACOTTA_SLAB, Blocks.TERRACOTTA.properties());
    Block TERRACOTTA_WALL = regBasicWall(ChiseledBlockItemIds.TERRACOTTA_WALL, Blocks.TERRACOTTA.properties());
    Block TERRACOTTA_BRICKS = regBasicBlock(ChiseledBlockItemIds.TERRACOTTA_BRICKS, Blocks.TERRACOTTA.properties());
    Block TERRACOTTA_BRICK_STAIRS = regBasicStairs(ChiseledBlockItemIds.TERRACOTTA_BRICK_STAIRS, TERRACOTTA_BRICKS, Blocks.TERRACOTTA.properties());
    Block TERRACOTTA_BRICK_SLAB = regBasicSlab(ChiseledBlockItemIds.TERRACOTTA_BRICK_SLAB, Blocks.TERRACOTTA.properties());
    Block TERRACOTTA_BRICK_WALL = regBasicWall(ChiseledBlockItemIds.TERRACOTTA_BRICK_WALL, Blocks.TERRACOTTA.properties());
    Block WHITE_CONCRETE_WALL = regBasicWall(ChiseledBlockItemIds.WHITE_CONCRETE_WALL, Blocks.CONCRETE.white().properties());
    Block WHITE_TERRACOTTA_STAIRS = regBasicStairs(ChiseledBlockItemIds.WHITE_TERRACOTTA_STAIRS, Blocks.DYED_TERRACOTTA.white(), Blocks.DYED_TERRACOTTA.white().properties());
    Block WHITE_TERRACOTTA_SLAB = regBasicSlab(ChiseledBlockItemIds.WHITE_TERRACOTTA_SLAB, Blocks.DYED_TERRACOTTA.white().properties());
    Block WHITE_TERRACOTTA_WALL = regBasicWall(ChiseledBlockItemIds.WHITE_TERRACOTTA_WALL, Blocks.DYED_TERRACOTTA.white().properties());
    Block WHITE_TERRACOTTA_BRICKS = regBasicBlock(ChiseledBlockItemIds.WHITE_TERRACOTTA_BRICKS, Blocks.DYED_TERRACOTTA.white().properties());
    Block WHITE_TERRACOTTA_BRICK_STAIRS = regBasicStairs(ChiseledBlockItemIds.WHITE_TERRACOTTA_BRICK_STAIRS, WHITE_TERRACOTTA_BRICKS, Blocks.DYED_TERRACOTTA.white().properties());
    Block WHITE_TERRACOTTA_BRICK_SLAB = regBasicSlab(ChiseledBlockItemIds.WHITE_TERRACOTTA_BRICK_SLAB, Blocks.DYED_TERRACOTTA.white().properties());
    Block WHITE_TERRACOTTA_BRICK_WALL = regBasicWall(ChiseledBlockItemIds.WHITE_TERRACOTTA_BRICK_WALL, Blocks.DYED_TERRACOTTA.white().properties());
    Block LIGHT_GRAY_CONCRETE_WALL = regBasicWall(ChiseledBlockItemIds.LIGHT_GRAY_CONCRETE_WALL, Blocks.CONCRETE.lightGray().properties());
    Block LIGHT_GRAY_TERRACOTTA_STAIRS = regBasicStairs(ChiseledBlockItemIds.LIGHT_GRAY_TERRACOTTA_STAIRS, Blocks.DYED_TERRACOTTA.lightGray(), Blocks.DYED_TERRACOTTA.lightGray().properties());
    Block LIGHT_GRAY_TERRACOTTA_SLAB = regBasicSlab(ChiseledBlockItemIds.LIGHT_GRAY_TERRACOTTA_SLAB, Blocks.DYED_TERRACOTTA.lightGray().properties());
    Block LIGHT_GRAY_TERRACOTTA_WALL = regBasicWall(ChiseledBlockItemIds.LIGHT_GRAY_TERRACOTTA_WALL, Blocks.DYED_TERRACOTTA.lightGray().properties());
    Block LIGHT_GRAY_TERRACOTTA_BRICKS = regBasicBlock(ChiseledBlockItemIds.LIGHT_GRAY_TERRACOTTA_BRICKS, Blocks.DYED_TERRACOTTA.lightGray().properties());
    Block LIGHT_GRAY_TERRACOTTA_BRICK_STAIRS = regBasicStairs(ChiseledBlockItemIds.LIGHT_GRAY_TERRACOTTA_BRICK_STAIRS, LIGHT_GRAY_TERRACOTTA_BRICKS, Blocks.DYED_TERRACOTTA.lightGray().properties());
    Block LIGHT_GRAY_TERRACOTTA_BRICK_SLAB = regBasicSlab(ChiseledBlockItemIds.LIGHT_GRAY_TERRACOTTA_BRICK_SLAB, Blocks.DYED_TERRACOTTA.lightGray().properties());
    Block LIGHT_GRAY_TERRACOTTA_BRICK_WALL = regBasicWall(ChiseledBlockItemIds.LIGHT_GRAY_TERRACOTTA_BRICK_WALL, Blocks.DYED_TERRACOTTA.lightGray().properties());
    Block GRAY_CONCRETE_WALL = regBasicWall(ChiseledBlockItemIds.GRAY_CONCRETE_WALL, Blocks.CONCRETE.gray().properties());
    Block GRAY_TERRACOTTA_STAIRS = regBasicStairs(ChiseledBlockItemIds.GRAY_TERRACOTTA_STAIRS, Blocks.DYED_TERRACOTTA.gray(), Blocks.DYED_TERRACOTTA.gray().properties());
    Block GRAY_TERRACOTTA_SLAB = regBasicSlab(ChiseledBlockItemIds.GRAY_TERRACOTTA_SLAB, Blocks.DYED_TERRACOTTA.gray().properties());
    Block GRAY_TERRACOTTA_WALL = regBasicWall(ChiseledBlockItemIds.GRAY_TERRACOTTA_WALL, Blocks.DYED_TERRACOTTA.gray().properties());
    Block GRAY_TERRACOTTA_BRICKS = regBasicBlock(ChiseledBlockItemIds.GRAY_TERRACOTTA_BRICKS, Blocks.DYED_TERRACOTTA.gray().properties());
    Block GRAY_TERRACOTTA_BRICK_STAIRS = regBasicStairs(ChiseledBlockItemIds.GRAY_TERRACOTTA_BRICK_STAIRS, GRAY_TERRACOTTA_BRICKS, Blocks.DYED_TERRACOTTA.gray().properties());
    Block GRAY_TERRACOTTA_BRICK_SLAB = regBasicSlab(ChiseledBlockItemIds.GRAY_TERRACOTTA_BRICK_SLAB, Blocks.DYED_TERRACOTTA.gray().properties());
    Block GRAY_TERRACOTTA_BRICK_WALL = regBasicWall(ChiseledBlockItemIds.GRAY_TERRACOTTA_BRICK_WALL, Blocks.DYED_TERRACOTTA.gray().properties());
    Block BLACK_CONCRETE_WALL = regBasicWall(ChiseledBlockItemIds.BLACK_CONCRETE_WALL, Blocks.CONCRETE.black().properties());
    Block BLACK_TERRACOTTA_STAIRS = regBasicStairs(ChiseledBlockItemIds.BLACK_TERRACOTTA_STAIRS, Blocks.DYED_TERRACOTTA.black(), Blocks.DYED_TERRACOTTA.black().properties());
    Block BLACK_TERRACOTTA_SLAB = regBasicSlab(ChiseledBlockItemIds.BLACK_TERRACOTTA_SLAB, Blocks.DYED_TERRACOTTA.black().properties());
    Block BLACK_TERRACOTTA_WALL = regBasicWall(ChiseledBlockItemIds.BLACK_TERRACOTTA_WALL, Blocks.DYED_TERRACOTTA.black().properties());
    Block BLACK_TERRACOTTA_BRICKS = regBasicBlock(ChiseledBlockItemIds.BLACK_TERRACOTTA_BRICKS, Blocks.DYED_TERRACOTTA.black().properties());
    Block BLACK_TERRACOTTA_BRICK_STAIRS = regBasicStairs(ChiseledBlockItemIds.BLACK_TERRACOTTA_BRICK_STAIRS, BLACK_TERRACOTTA_BRICKS, Blocks.DYED_TERRACOTTA.black().properties());
    Block BLACK_TERRACOTTA_BRICK_SLAB = regBasicSlab(ChiseledBlockItemIds.BLACK_TERRACOTTA_BRICK_SLAB, Blocks.DYED_TERRACOTTA.black().properties());
    Block BLACK_TERRACOTTA_BRICK_WALL = regBasicWall(ChiseledBlockItemIds.BLACK_TERRACOTTA_BRICK_WALL, Blocks.DYED_TERRACOTTA.black().properties());
    Block BROWN_CONCRETE_WALL = regBasicWall(ChiseledBlockItemIds.BROWN_CONCRETE_WALL, Blocks.CONCRETE.brown().properties());
    Block BROWN_TERRACOTTA_STAIRS = regBasicStairs(ChiseledBlockItemIds.BROWN_TERRACOTTA_STAIRS, Blocks.DYED_TERRACOTTA.brown(), Blocks.DYED_TERRACOTTA.brown().properties());
    Block BROWN_TERRACOTTA_SLAB = regBasicSlab(ChiseledBlockItemIds.BROWN_TERRACOTTA_SLAB, Blocks.DYED_TERRACOTTA.brown().properties());
    Block BROWN_TERRACOTTA_WALL = regBasicWall(ChiseledBlockItemIds.BROWN_TERRACOTTA_WALL, Blocks.DYED_TERRACOTTA.brown().properties());
    Block BROWN_TERRACOTTA_BRICKS = regBasicBlock(ChiseledBlockItemIds.BROWN_TERRACOTTA_BRICKS, Blocks.DYED_TERRACOTTA.brown().properties());
    Block BROWN_TERRACOTTA_BRICK_STAIRS = regBasicStairs(ChiseledBlockItemIds.BROWN_TERRACOTTA_BRICK_STAIRS, BROWN_TERRACOTTA_BRICKS, Blocks.DYED_TERRACOTTA.brown().properties());
    Block BROWN_TERRACOTTA_BRICK_SLAB = regBasicSlab(ChiseledBlockItemIds.BROWN_TERRACOTTA_BRICK_SLAB, Blocks.DYED_TERRACOTTA.brown().properties());
    Block BROWN_TERRACOTTA_BRICK_WALL = regBasicWall(ChiseledBlockItemIds.BROWN_TERRACOTTA_BRICK_WALL, Blocks.DYED_TERRACOTTA.brown().properties());
    Block RED_CONCRETE_WALL = regBasicWall(ChiseledBlockItemIds.RED_CONCRETE_WALL, Blocks.CONCRETE.red().properties());
    Block RED_TERRACOTTA_STAIRS = regBasicStairs(ChiseledBlockItemIds.RED_TERRACOTTA_STAIRS, Blocks.DYED_TERRACOTTA.red(), Blocks.DYED_TERRACOTTA.red().properties());
    Block RED_TERRACOTTA_SLAB = regBasicSlab(ChiseledBlockItemIds.RED_TERRACOTTA_SLAB, Blocks.DYED_TERRACOTTA.red().properties());
    Block RED_TERRACOTTA_WALL = regBasicWall(ChiseledBlockItemIds.RED_TERRACOTTA_WALL, Blocks.DYED_TERRACOTTA.red().properties());
    Block RED_TERRACOTTA_BRICKS = regBasicBlock(ChiseledBlockItemIds.RED_TERRACOTTA_BRICKS, Blocks.DYED_TERRACOTTA.red().properties());
    Block RED_TERRACOTTA_BRICK_STAIRS = regBasicStairs(ChiseledBlockItemIds.RED_TERRACOTTA_BRICK_STAIRS, RED_TERRACOTTA_BRICKS, Blocks.DYED_TERRACOTTA.red().properties());
    Block RED_TERRACOTTA_BRICK_SLAB = regBasicSlab(ChiseledBlockItemIds.RED_TERRACOTTA_BRICK_SLAB, Blocks.DYED_TERRACOTTA.red().properties());
    Block RED_TERRACOTTA_BRICK_WALL = regBasicWall(ChiseledBlockItemIds.RED_TERRACOTTA_BRICK_WALL, Blocks.DYED_TERRACOTTA.red().properties());
    Block ORANGE_CONCRETE_WALL = regBasicWall(ChiseledBlockItemIds.ORANGE_CONCRETE_WALL, Blocks.CONCRETE.orange().properties());
    Block ORANGE_TERRACOTTA_STAIRS = regBasicStairs(ChiseledBlockItemIds.ORANGE_TERRACOTTA_STAIRS, Blocks.DYED_TERRACOTTA.orange(), Blocks.DYED_TERRACOTTA.orange().properties());
    Block ORANGE_TERRACOTTA_SLAB = regBasicSlab(ChiseledBlockItemIds.ORANGE_TERRACOTTA_SLAB, Blocks.DYED_TERRACOTTA.orange().properties());
    Block ORANGE_TERRACOTTA_WALL = regBasicWall(ChiseledBlockItemIds.ORANGE_TERRACOTTA_WALL, Blocks.DYED_TERRACOTTA.orange().properties());
    Block ORANGE_TERRACOTTA_BRICKS = regBasicBlock(ChiseledBlockItemIds.ORANGE_TERRACOTTA_BRICKS, Blocks.DYED_TERRACOTTA.orange().properties());
    Block ORANGE_TERRACOTTA_BRICK_STAIRS = regBasicStairs(ChiseledBlockItemIds.ORANGE_TERRACOTTA_BRICK_STAIRS, ORANGE_TERRACOTTA_BRICKS, Blocks.DYED_TERRACOTTA.orange().properties());
    Block ORANGE_TERRACOTTA_BRICK_SLAB = regBasicSlab(ChiseledBlockItemIds.ORANGE_TERRACOTTA_BRICK_SLAB, Blocks.DYED_TERRACOTTA.orange().properties());
    Block ORANGE_TERRACOTTA_BRICK_WALL = regBasicWall(ChiseledBlockItemIds.ORANGE_TERRACOTTA_BRICK_WALL, Blocks.DYED_TERRACOTTA.orange().properties());
    Block YELLOW_CONCRETE_WALL = regBasicWall(ChiseledBlockItemIds.YELLOW_CONCRETE_WALL, Blocks.CONCRETE.yellow().properties());
    Block YELLOW_TERRACOTTA_STAIRS = regBasicStairs(ChiseledBlockItemIds.YELLOW_TERRACOTTA_STAIRS, Blocks.DYED_TERRACOTTA.yellow(), Blocks.DYED_TERRACOTTA.yellow().properties());
    Block YELLOW_TERRACOTTA_SLAB = regBasicSlab(ChiseledBlockItemIds.YELLOW_TERRACOTTA_SLAB, Blocks.DYED_TERRACOTTA.yellow().properties());
    Block YELLOW_TERRACOTTA_WALL = regBasicWall(ChiseledBlockItemIds.YELLOW_TERRACOTTA_WALL, Blocks.DYED_TERRACOTTA.yellow().properties());
    Block YELLOW_TERRACOTTA_BRICKS = regBasicBlock(ChiseledBlockItemIds.YELLOW_TERRACOTTA_BRICKS, Blocks.DYED_TERRACOTTA.yellow().properties());
    Block YELLOW_TERRACOTTA_BRICK_STAIRS = regBasicStairs(ChiseledBlockItemIds.YELLOW_TERRACOTTA_BRICK_STAIRS, YELLOW_TERRACOTTA_BRICKS, Blocks.DYED_TERRACOTTA.yellow().properties());
    Block YELLOW_TERRACOTTA_BRICK_SLAB = regBasicSlab(ChiseledBlockItemIds.YELLOW_TERRACOTTA_BRICK_SLAB, Blocks.DYED_TERRACOTTA.yellow().properties());
    Block YELLOW_TERRACOTTA_BRICK_WALL = regBasicWall(ChiseledBlockItemIds.YELLOW_TERRACOTTA_BRICK_WALL, Blocks.DYED_TERRACOTTA.yellow().properties());
    Block LIME_CONCRETE_WALL = regBasicWall(ChiseledBlockItemIds.LIME_CONCRETE_WALL, Blocks.CONCRETE.lime().properties());
    Block LIME_TERRACOTTA_STAIRS = regBasicStairs(ChiseledBlockItemIds.LIME_TERRACOTTA_STAIRS, Blocks.DYED_TERRACOTTA.lime(), Blocks.DYED_TERRACOTTA.lime().properties());
    Block LIME_TERRACOTTA_SLAB = regBasicSlab(ChiseledBlockItemIds.LIME_TERRACOTTA_SLAB, Blocks.DYED_TERRACOTTA.lime().properties());
    Block LIME_TERRACOTTA_WALL = regBasicWall(ChiseledBlockItemIds.LIME_TERRACOTTA_WALL, Blocks.DYED_TERRACOTTA.lime().properties());
    Block LIME_TERRACOTTA_BRICKS = regBasicBlock(ChiseledBlockItemIds.LIME_TERRACOTTA_BRICKS, Blocks.DYED_TERRACOTTA.lime().properties());
    Block LIME_TERRACOTTA_BRICK_STAIRS = regBasicStairs(ChiseledBlockItemIds.LIME_TERRACOTTA_BRICK_STAIRS, LIME_TERRACOTTA_BRICKS, Blocks.DYED_TERRACOTTA.lime().properties());
    Block LIME_TERRACOTTA_BRICK_SLAB = regBasicSlab(ChiseledBlockItemIds.LIME_TERRACOTTA_BRICK_SLAB, Blocks.DYED_TERRACOTTA.lime().properties());
    Block LIME_TERRACOTTA_BRICK_WALL = regBasicWall(ChiseledBlockItemIds.LIME_TERRACOTTA_BRICK_WALL, Blocks.DYED_TERRACOTTA.lime().properties());
    Block CYAN_CONCRETE_WALL = regBasicWall(ChiseledBlockItemIds.CYAN_CONCRETE_WALL, Blocks.CONCRETE.cyan().properties());
    Block CYAN_TERRACOTTA_STAIRS = regBasicStairs(ChiseledBlockItemIds.CYAN_TERRACOTTA_STAIRS, Blocks.DYED_TERRACOTTA.cyan(), Blocks.DYED_TERRACOTTA.cyan().properties());
    Block CYAN_TERRACOTTA_SLAB = regBasicSlab(ChiseledBlockItemIds.CYAN_TERRACOTTA_SLAB, Blocks.DYED_TERRACOTTA.cyan().properties());
    Block CYAN_TERRACOTTA_WALL = regBasicWall(ChiseledBlockItemIds.CYAN_TERRACOTTA_WALL, Blocks.DYED_TERRACOTTA.cyan().properties());
    Block CYAN_TERRACOTTA_BRICKS = regBasicBlock(ChiseledBlockItemIds.CYAN_TERRACOTTA_BRICKS, Blocks.DYED_TERRACOTTA.cyan().properties());
    Block CYAN_TERRACOTTA_BRICK_STAIRS = regBasicStairs(ChiseledBlockItemIds.CYAN_TERRACOTTA_BRICK_STAIRS, CYAN_TERRACOTTA_BRICKS, Blocks.DYED_TERRACOTTA.cyan().properties());
    Block CYAN_TERRACOTTA_BRICK_SLAB = regBasicSlab(ChiseledBlockItemIds.CYAN_TERRACOTTA_BRICK_SLAB, Blocks.DYED_TERRACOTTA.cyan().properties());
    Block CYAN_TERRACOTTA_BRICK_WALL = regBasicWall(ChiseledBlockItemIds.CYAN_TERRACOTTA_BRICK_WALL, Blocks.DYED_TERRACOTTA.cyan().properties());
    Block GREEN_CONCRETE_WALL = regBasicWall(ChiseledBlockItemIds.GREEN_CONCRETE_WALL, Blocks.CONCRETE.green().properties());
    Block GREEN_TERRACOTTA_STAIRS = regBasicStairs(ChiseledBlockItemIds.GREEN_TERRACOTTA_STAIRS, Blocks.DYED_TERRACOTTA.green(), Blocks.DYED_TERRACOTTA.green().properties());
    Block GREEN_TERRACOTTA_SLAB = regBasicSlab(ChiseledBlockItemIds.GREEN_TERRACOTTA_SLAB, Blocks.DYED_TERRACOTTA.green().properties());
    Block GREEN_TERRACOTTA_WALL = regBasicWall(ChiseledBlockItemIds.GREEN_TERRACOTTA_WALL, Blocks.DYED_TERRACOTTA.green().properties());
    Block GREEN_TERRACOTTA_BRICKS = regBasicBlock(ChiseledBlockItemIds.GREEN_TERRACOTTA_BRICKS, Blocks.DYED_TERRACOTTA.green().properties());
    Block GREEN_TERRACOTTA_BRICK_STAIRS = regBasicStairs(ChiseledBlockItemIds.GREEN_TERRACOTTA_BRICK_STAIRS, GREEN_TERRACOTTA_BRICKS, Blocks.DYED_TERRACOTTA.green().properties());
    Block GREEN_TERRACOTTA_BRICK_SLAB = regBasicSlab(ChiseledBlockItemIds.GREEN_TERRACOTTA_BRICK_SLAB, Blocks.DYED_TERRACOTTA.green().properties());
    Block GREEN_TERRACOTTA_BRICK_WALL = regBasicWall(ChiseledBlockItemIds.GREEN_TERRACOTTA_BRICK_WALL, Blocks.DYED_TERRACOTTA.green().properties());
    Block LIGHT_BLUE_CONCRETE_WALL = regBasicWall(ChiseledBlockItemIds.LIGHT_BLUE_CONCRETE_WALL, Blocks.CONCRETE.lightBlue().properties());
    Block LIGHT_BLUE_TERRACOTTA_STAIRS = regBasicStairs(ChiseledBlockItemIds.LIGHT_BLUE_TERRACOTTA_STAIRS, Blocks.DYED_TERRACOTTA.lightBlue(), Blocks.DYED_TERRACOTTA.lightBlue().properties());
    Block LIGHT_BLUE_TERRACOTTA_SLAB = regBasicSlab(ChiseledBlockItemIds.LIGHT_BLUE_TERRACOTTA_SLAB, Blocks.DYED_TERRACOTTA.lightBlue().properties());
    Block LIGHT_BLUE_TERRACOTTA_WALL = regBasicWall(ChiseledBlockItemIds.LIGHT_BLUE_TERRACOTTA_WALL, Blocks.DYED_TERRACOTTA.lightBlue().properties());
    Block LIGHT_BLUE_TERRACOTTA_BRICKS = regBasicBlock(ChiseledBlockItemIds.LIGHT_BLUE_TERRACOTTA_BRICKS, Blocks.DYED_TERRACOTTA.lightBlue().properties());
    Block LIGHT_BLUE_TERRACOTTA_BRICK_STAIRS = regBasicStairs(ChiseledBlockItemIds.LIGHT_BLUE_TERRACOTTA_BRICK_STAIRS, LIGHT_BLUE_TERRACOTTA_BRICKS, Blocks.DYED_TERRACOTTA.lightBlue().properties());
    Block LIGHT_BLUE_TERRACOTTA_BRICK_SLAB = regBasicSlab(ChiseledBlockItemIds.LIGHT_BLUE_TERRACOTTA_BRICK_SLAB, Blocks.DYED_TERRACOTTA.lightBlue().properties());
    Block LIGHT_BLUE_TERRACOTTA_BRICK_WALL = regBasicWall(ChiseledBlockItemIds.LIGHT_BLUE_TERRACOTTA_BRICK_WALL, Blocks.DYED_TERRACOTTA.lightBlue().properties());
    Block BLUE_CONCRETE_WALL = regBasicWall(ChiseledBlockItemIds.BLUE_CONCRETE_WALL, Blocks.CONCRETE.blue().properties());
    Block BLUE_TERRACOTTA_STAIRS = regBasicStairs(ChiseledBlockItemIds.BLUE_TERRACOTTA_STAIRS, Blocks.DYED_TERRACOTTA.blue(), Blocks.DYED_TERRACOTTA.blue().properties());
    Block BLUE_TERRACOTTA_SLAB = regBasicSlab(ChiseledBlockItemIds.BLUE_TERRACOTTA_SLAB, Blocks.DYED_TERRACOTTA.blue().properties());
    Block BLUE_TERRACOTTA_WALL = regBasicWall(ChiseledBlockItemIds.BLUE_TERRACOTTA_WALL, Blocks.DYED_TERRACOTTA.blue().properties());
    Block BLUE_TERRACOTTA_BRICKS = regBasicBlock(ChiseledBlockItemIds.BLUE_TERRACOTTA_BRICKS, Blocks.DYED_TERRACOTTA.blue().properties());
    Block BLUE_TERRACOTTA_BRICK_STAIRS = regBasicStairs(ChiseledBlockItemIds.BLUE_TERRACOTTA_BRICK_STAIRS, BLUE_TERRACOTTA_BRICKS, Blocks.DYED_TERRACOTTA.blue().properties());
    Block BLUE_TERRACOTTA_BRICK_SLAB = regBasicSlab(ChiseledBlockItemIds.BLUE_TERRACOTTA_BRICK_SLAB, Blocks.DYED_TERRACOTTA.blue().properties());
    Block BLUE_TERRACOTTA_BRICK_WALL = regBasicWall(ChiseledBlockItemIds.BLUE_TERRACOTTA_BRICK_WALL, Blocks.DYED_TERRACOTTA.blue().properties());
    Block PURPLE_CONCRETE_WALL = regBasicWall(ChiseledBlockItemIds.PURPLE_CONCRETE_WALL, Blocks.CONCRETE.purple().properties());
    Block PURPLE_TERRACOTTA_STAIRS = regBasicStairs(ChiseledBlockItemIds.PURPLE_TERRACOTTA_STAIRS, Blocks.DYED_TERRACOTTA.purple(), Blocks.DYED_TERRACOTTA.purple().properties());
    Block PURPLE_TERRACOTTA_SLAB = regBasicSlab(ChiseledBlockItemIds.PURPLE_TERRACOTTA_SLAB, Blocks.DYED_TERRACOTTA.purple().properties());
    Block PURPLE_TERRACOTTA_WALL = regBasicWall(ChiseledBlockItemIds.PURPLE_TERRACOTTA_WALL, Blocks.DYED_TERRACOTTA.purple().properties());
    Block PURPLE_TERRACOTTA_BRICKS = regBasicBlock(ChiseledBlockItemIds.PURPLE_TERRACOTTA_BRICKS, Blocks.DYED_TERRACOTTA.purple().properties());
    Block PURPLE_TERRACOTTA_BRICK_STAIRS = regBasicStairs(ChiseledBlockItemIds.PURPLE_TERRACOTTA_BRICK_STAIRS, PURPLE_TERRACOTTA_BRICKS, Blocks.DYED_TERRACOTTA.purple().properties());
    Block PURPLE_TERRACOTTA_BRICK_SLAB = regBasicSlab(ChiseledBlockItemIds.PURPLE_TERRACOTTA_BRICK_SLAB, Blocks.DYED_TERRACOTTA.purple().properties());
    Block PURPLE_TERRACOTTA_BRICK_WALL = regBasicWall(ChiseledBlockItemIds.PURPLE_TERRACOTTA_BRICK_WALL, Blocks.DYED_TERRACOTTA.purple().properties());
    Block MAGENTA_CONCRETE_WALL = regBasicWall(ChiseledBlockItemIds.MAGENTA_CONCRETE_WALL, Blocks.CONCRETE.magenta().properties());
    Block MAGENTA_TERRACOTTA_STAIRS = regBasicStairs(ChiseledBlockItemIds.MAGENTA_TERRACOTTA_STAIRS, Blocks.DYED_TERRACOTTA.magenta(), Blocks.DYED_TERRACOTTA.magenta().properties());
    Block MAGENTA_TERRACOTTA_SLAB = regBasicSlab(ChiseledBlockItemIds.MAGENTA_TERRACOTTA_SLAB, Blocks.DYED_TERRACOTTA.magenta().properties());
    Block MAGENTA_TERRACOTTA_WALL = regBasicWall(ChiseledBlockItemIds.MAGENTA_TERRACOTTA_WALL, Blocks.DYED_TERRACOTTA.magenta().properties());
    Block MAGENTA_TERRACOTTA_BRICKS = regBasicBlock(ChiseledBlockItemIds.MAGENTA_TERRACOTTA_BRICKS, Blocks.DYED_TERRACOTTA.magenta().properties());
    Block MAGENTA_TERRACOTTA_BRICK_STAIRS = regBasicStairs(ChiseledBlockItemIds.MAGENTA_TERRACOTTA_BRICK_STAIRS, MAGENTA_TERRACOTTA_BRICKS, Blocks.DYED_TERRACOTTA.magenta().properties());
    Block MAGENTA_TERRACOTTA_BRICK_SLAB = regBasicSlab(ChiseledBlockItemIds.MAGENTA_TERRACOTTA_BRICK_SLAB, Blocks.DYED_TERRACOTTA.magenta().properties());
    Block MAGENTA_TERRACOTTA_BRICK_WALL = regBasicWall(ChiseledBlockItemIds.MAGENTA_TERRACOTTA_BRICK_WALL, Blocks.DYED_TERRACOTTA.magenta().properties());
    Block PINK_CONCRETE_WALL = regBasicWall(ChiseledBlockItemIds.PINK_CONCRETE_WALL, Blocks.CONCRETE.pink().properties());
    Block PINK_TERRACOTTA_STAIRS = regBasicStairs(ChiseledBlockItemIds.PINK_TERRACOTTA_STAIRS, Blocks.DYED_TERRACOTTA.pink(), Blocks.DYED_TERRACOTTA.pink().properties());
    Block PINK_TERRACOTTA_SLAB = regBasicSlab(ChiseledBlockItemIds.PINK_TERRACOTTA_SLAB, Blocks.DYED_TERRACOTTA.pink().properties());
    Block PINK_TERRACOTTA_WALL = regBasicWall(ChiseledBlockItemIds.PINK_TERRACOTTA_WALL, Blocks.DYED_TERRACOTTA.pink().properties());
    Block PINK_TERRACOTTA_BRICKS = regBasicBlock(ChiseledBlockItemIds.PINK_TERRACOTTA_BRICKS, Blocks.DYED_TERRACOTTA.pink().properties());
    Block PINK_TERRACOTTA_BRICK_STAIRS = regBasicStairs(ChiseledBlockItemIds.PINK_TERRACOTTA_BRICK_STAIRS, PINK_TERRACOTTA_BRICKS, Blocks.DYED_TERRACOTTA.pink().properties());
    Block PINK_TERRACOTTA_BRICK_SLAB = regBasicSlab(ChiseledBlockItemIds.PINK_TERRACOTTA_BRICK_SLAB, Blocks.DYED_TERRACOTTA.pink().properties());
    Block PINK_TERRACOTTA_BRICK_WALL = regBasicWall(ChiseledBlockItemIds.PINK_TERRACOTTA_BRICK_WALL, Blocks.DYED_TERRACOTTA.pink().properties());

    static void init() {}
}
