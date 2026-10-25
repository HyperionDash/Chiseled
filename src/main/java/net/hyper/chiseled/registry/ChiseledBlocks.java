package net.hyper.chiseled.registry;

import net.hyper.chiseled.reference.ChiseledBlockItemIds;
import net.minecraft.references.BlockItemId;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.phys.AABB;

import static net.hyper.silliestlib.utils.SilliestLibRegUtils.regBlock;

public interface ChiseledBlocks {
    // Copy+Paste from the vanilla "Blocks" class as its private and icba making an access-widener for a single method
    BlockBehaviour.StateArgumentPredicate<AABB> NEAR_PLANE_INTERSECTS_OUTLINE = (state, _, blockPos, nearPlaneBox) -> {
        for(AABB outlineBox : state.getOcclusionShape().toAabbs()) {
            if (outlineBox.move(blockPos).intersects(nearPlaneBox)) {
                return true;
            }
        }

        return false;
    };

    // Methods for easier Block Registration
    static Block regSimpleBlock(BlockItemId id, BlockBehaviour.Properties blockProperties) {
        return regBlock(id, _ -> new Block(blockProperties.setId(id.block())));
    }
    static Block regStairs(BlockItemId id, Block parentBlock, BlockBehaviour.Properties blockProperties) {
        return regBlock(id, _ -> new StairBlock(parentBlock.defaultBlockState(), blockProperties.setId(id.block()).isViewBlocking(NEAR_PLANE_INTERSECTS_OUTLINE)));
    }
    static Block regSlab(BlockItemId id, BlockBehaviour.Properties blockProperties) {
        return regBlock(id, _ -> new SlabBlock(blockProperties.setId(id.block()).isViewBlocking(NEAR_PLANE_INTERSECTS_OUTLINE)));
    }
    static Block regWall(BlockItemId id, BlockBehaviour.Properties blockProperties) {
        return regBlock(id, _ -> new WallBlock(blockProperties.setId(id.block()).forceSolidOn()));
    }
    static Block regFence(BlockItemId id, BlockBehaviour.Properties blockProperties) {
        return regBlock(id, _ -> new FenceBlock(blockProperties.setId(id.block())));
    }
    static Block regRotatedPillar(BlockItemId id, BlockBehaviour.Properties blockProperties) {
        return regBlock(id, _ -> new RotatedPillarBlock(blockProperties.setId(id.block())));
    }

    // Stone Blocks
    Block STONE_WALL = regWall(ChiseledBlockItemIds.STONE_WALL, Blocks.STONE.properties());
    Block POLISHED_STONE = regSimpleBlock(ChiseledBlockItemIds.POLISHED_STONE, Blocks.STONE_BRICKS.properties());
    Block POLISHED_STONE_STAIRS = regStairs(ChiseledBlockItemIds.POLISHED_STONE_STAIRS, POLISHED_STONE, Blocks.STONE_BRICK_STAIRS.properties());
    Block POLISHED_STONE_SLAB = regSlab(ChiseledBlockItemIds.POLISHED_STONE_SLAB, Blocks.STONE_BRICK_SLAB.properties());
    Block POLISHED_STONE_WALL = regWall(ChiseledBlockItemIds.POLISHED_STONE_WALL, Blocks.STONE_BRICK_WALL.properties());
    Block STONE_PILLAR = regRotatedPillar(ChiseledBlockItemIds.STONE_PILLAR, Blocks.STONE_BRICKS.properties());
    Block CUT_STONE_BRICKS = regSimpleBlock(ChiseledBlockItemIds.CUT_STONE_BRICKS, Blocks.STONE_BRICKS.properties());
    Block CRACKED_CUT_STONE_BRICKS = regSimpleBlock(ChiseledBlockItemIds.CRACKED_CUT_STONE_BRICKS, Blocks.STONE_BRICKS.properties());
    Block CUT_STONE_BRICK_STAIRS = regStairs(ChiseledBlockItemIds.CUT_STONE_BRICK_STAIRS, CUT_STONE_BRICKS, Blocks.STONE_BRICK_STAIRS.properties());
    Block CUT_STONE_BRICK_SLAB = regSlab(ChiseledBlockItemIds.CUT_STONE_BRICK_SLAB, Blocks.STONE_BRICK_SLAB.properties());
    Block MOSSY_CUT_STONE_BRICKS = regSimpleBlock(ChiseledBlockItemIds.MOSSY_CUT_STONE_BRICKS, Blocks.MOSSY_STONE_BRICKS.properties());
    Block MOSSY_CUT_STONE_BRICK_STAIRS = regStairs(ChiseledBlockItemIds.MOSSY_CUT_STONE_BRICK_STAIRS, MOSSY_CUT_STONE_BRICKS, Blocks.MOSSY_STONE_BRICK_STAIRS.properties());
    Block MOSSY_CUT_STONE_BRICK_SLAB = regSlab(ChiseledBlockItemIds.MOSSY_CUT_STONE_BRICK_SLAB, Blocks.MOSSY_STONE_BRICK_SLAB.properties());
    Block STONE_TILES = regSimpleBlock(ChiseledBlockItemIds.STONE_TILES, Blocks.STONE_BRICKS.properties());
    Block CRACKED_STONE_TILES = regSimpleBlock(ChiseledBlockItemIds.CRACKED_STONE_TILES, Blocks.STONE_BRICKS.properties());
    Block STONE_TILE_STAIRS = regStairs(ChiseledBlockItemIds.STONE_TILE_STAIRS, STONE_TILES, Blocks.STONE_BRICK_STAIRS.properties());
    Block STONE_TILE_SLAB = regSlab(ChiseledBlockItemIds.STONE_TILE_SLAB, Blocks.STONE_BRICK_SLAB.properties());
    Block STONE_TILE_WALL = regWall(ChiseledBlockItemIds.STONE_TILE_WALL, Blocks.STONE_BRICK_WALL.properties());
    Block MOSSY_STONE_TILES = regSimpleBlock(ChiseledBlockItemIds.MOSSY_STONE_TILES, Blocks.MOSSY_STONE_BRICKS.properties());
    Block MOSSY_STONE_TILE_STAIRS = regStairs(ChiseledBlockItemIds.MOSSY_STONE_TILE_STAIRS, MOSSY_STONE_TILES, Blocks.MOSSY_STONE_BRICK_STAIRS.properties());
    Block MOSSY_STONE_TILE_SLAB = regSlab(ChiseledBlockItemIds.MOSSY_STONE_TILE_SLAB, Blocks.MOSSY_STONE_BRICK_SLAB.properties());
    Block MOSSY_STONE_TILE_WALL = regWall(ChiseledBlockItemIds.MOSSY_STONE_TILE_WALL, Blocks.MOSSY_STONE_BRICK_WALL.properties());

    // Granite Blocks
    Block POLISHED_GRANITE_WALL = regWall(ChiseledBlockItemIds.POLISHED_GRANITE_WALL, Blocks.POLISHED_GRANITE.properties());
    Block POLISHED_GRANITE_PILLAR = regRotatedPillar(ChiseledBlockItemIds.POLISHED_GRANITE_PILLAR, Blocks.POLISHED_GRANITE.properties());
    Block POLISHED_GRANITE_BRICKS = regSimpleBlock(ChiseledBlockItemIds.POLISHED_GRANITE_BRICKS, Blocks.POLISHED_GRANITE.properties());
    Block CRACKED_POLISHED_GRANITE_BRICKS = regSimpleBlock(ChiseledBlockItemIds.CRACKED_POLISHED_GRANITE_BRICKS, Blocks.POLISHED_GRANITE.properties());
    Block POLISHED_GRANITE_BRICK_STAIRS = regStairs(ChiseledBlockItemIds.POLISHED_GRANITE_BRICK_STAIRS, POLISHED_GRANITE_BRICKS, Blocks.POLISHED_GRANITE_STAIRS.properties());
    Block POLISHED_GRANITE_BRICK_SLAB = regSlab(ChiseledBlockItemIds.POLISHED_GRANITE_BRICK_SLAB, Blocks.POLISHED_GRANITE_SLAB.properties());
    Block POLISHED_GRANITE_BRICK_WALL = regWall(ChiseledBlockItemIds.POLISHED_GRANITE_BRICK_WALL, POLISHED_GRANITE_WALL.properties());
    Block CUT_POLISHED_GRANITE_BRICKS = regSimpleBlock(ChiseledBlockItemIds.CUT_POLISHED_GRANITE_BRICKS, Blocks.POLISHED_GRANITE.properties());
    Block CRACKED_CUT_POLISHED_GRANITE_BRICKS = regSimpleBlock(ChiseledBlockItemIds.CRACKED_CUT_POLISHED_GRANITE_BRICKS, Blocks.POLISHED_GRANITE.properties());
    Block CUT_POLISHED_GRANITE_BRICK_STAIRS = regStairs(ChiseledBlockItemIds.CUT_POLISHED_GRANITE_BRICK_STAIRS, CUT_POLISHED_GRANITE_BRICKS, Blocks.POLISHED_GRANITE_STAIRS.properties());
    Block CUT_POLISHED_GRANITE_BRICK_SLAB = regSlab(ChiseledBlockItemIds.CUT_POLISHED_GRANITE_BRICK_SLAB, Blocks.POLISHED_GRANITE_SLAB.properties());
    Block POLISHED_GRANITE_TILES = regSimpleBlock(ChiseledBlockItemIds.POLISHED_GRANITE_TILES, Blocks.POLISHED_GRANITE.properties());
    Block CRACKED_POLISHED_GRANITE_TILES = regSimpleBlock(ChiseledBlockItemIds.CRACKED_POLISHED_GRANITE_TILES, Blocks.POLISHED_GRANITE.properties());
    Block POLISHED_GRANITE_TILE_STAIRS = regStairs(ChiseledBlockItemIds.POLISHED_GRANITE_TILE_STAIRS, POLISHED_GRANITE_TILES, Blocks.POLISHED_GRANITE_STAIRS.properties());
    Block POLISHED_GRANITE_TILE_SLAB = regSlab(ChiseledBlockItemIds.POLISHED_GRANITE_TILE_SLAB, Blocks.POLISHED_GRANITE_SLAB.properties());
    Block POLISHED_GRANITE_TILE_WALL = regWall(ChiseledBlockItemIds.POLISHED_GRANITE_TILE_WALL, POLISHED_GRANITE_WALL.properties());

    // Diorite Blocks
    Block POLISHED_DIORITE_WALL = regWall(ChiseledBlockItemIds.POLISHED_DIORITE_WALL, Blocks.POLISHED_DIORITE.properties());
    Block POLISHED_DIORITE_PILLAR = regRotatedPillar(ChiseledBlockItemIds.POLISHED_DIORITE_PILLAR, Blocks.POLISHED_DIORITE.properties());
    Block POLISHED_DIORITE_BRICKS = regSimpleBlock(ChiseledBlockItemIds.POLISHED_DIORITE_BRICKS, Blocks.POLISHED_DIORITE.properties());
    Block CRACKED_POLISHED_DIORITE_BRICKS = regSimpleBlock(ChiseledBlockItemIds.CRACKED_POLISHED_DIORITE_BRICKS, Blocks.POLISHED_DIORITE.properties());
    Block POLISHED_DIORITE_BRICK_STAIRS = regStairs(ChiseledBlockItemIds.POLISHED_DIORITE_BRICK_STAIRS, POLISHED_DIORITE_BRICKS, Blocks.POLISHED_DIORITE_STAIRS.properties());
    Block POLISHED_DIORITE_BRICK_SLAB = regSlab(ChiseledBlockItemIds.POLISHED_DIORITE_BRICK_SLAB, Blocks.POLISHED_DIORITE_SLAB.properties());
    Block POLISHED_DIORITE_BRICK_WALL = regWall(ChiseledBlockItemIds.POLISHED_DIORITE_BRICK_WALL, POLISHED_DIORITE_WALL.properties());
    Block CUT_POLISHED_DIORITE_BRICKS = regSimpleBlock(ChiseledBlockItemIds.CUT_POLISHED_DIORITE_BRICKS, Blocks.POLISHED_DIORITE.properties());
    Block CRACKED_CUT_POLISHED_DIORITE_BRICKS = regSimpleBlock(ChiseledBlockItemIds.CRACKED_CUT_POLISHED_DIORITE_BRICKS, Blocks.POLISHED_DIORITE.properties());
    Block CUT_POLISHED_DIORITE_BRICK_STAIRS = regStairs(ChiseledBlockItemIds.CUT_POLISHED_DIORITE_BRICK_STAIRS, CUT_POLISHED_DIORITE_BRICKS, Blocks.POLISHED_DIORITE_STAIRS.properties());
    Block CUT_POLISHED_DIORITE_BRICK_SLAB = regSlab(ChiseledBlockItemIds.CUT_POLISHED_DIORITE_BRICK_SLAB, Blocks.POLISHED_DIORITE_SLAB.properties());
    Block POLISHED_DIORITE_TILES = regSimpleBlock(ChiseledBlockItemIds.POLISHED_DIORITE_TILES, Blocks.POLISHED_DIORITE.properties());
    Block CRACKED_POLISHED_DIORITE_TILES = regSimpleBlock(ChiseledBlockItemIds.CRACKED_POLISHED_DIORITE_TILES, Blocks.POLISHED_DIORITE.properties());
    Block POLISHED_DIORITE_TILE_STAIRS = regStairs(ChiseledBlockItemIds.POLISHED_DIORITE_TILE_STAIRS, POLISHED_DIORITE_TILES, Blocks.POLISHED_DIORITE_STAIRS.properties());
    Block POLISHED_DIORITE_TILE_SLAB = regSlab(ChiseledBlockItemIds.POLISHED_DIORITE_TILE_SLAB, Blocks.POLISHED_DIORITE_SLAB.properties());
    Block POLISHED_DIORITE_TILE_WALL = regWall(ChiseledBlockItemIds.POLISHED_DIORITE_TILE_WALL, POLISHED_DIORITE_WALL.properties());

    // Andesite Blocks
    Block POLISHED_ANDESITE_WALL = regWall(ChiseledBlockItemIds.POLISHED_ANDESITE_WALL, Blocks.POLISHED_ANDESITE.properties());
    Block POLISHED_ANDESITE_PILLAR = regRotatedPillar(ChiseledBlockItemIds.POLISHED_ANDESITE_PILLAR, Blocks.POLISHED_ANDESITE.properties());
    Block POLISHED_ANDESITE_BRICKS = regSimpleBlock(ChiseledBlockItemIds.POLISHED_ANDESITE_BRICKS, Blocks.POLISHED_ANDESITE.properties());
    Block CRACKED_POLISHED_ANDESITE_BRICKS = regSimpleBlock(ChiseledBlockItemIds.CRACKED_POLISHED_ANDESITE_BRICKS, Blocks.POLISHED_ANDESITE.properties());
    Block POLISHED_ANDESITE_BRICK_STAIRS = regStairs(ChiseledBlockItemIds.POLISHED_ANDESITE_BRICK_STAIRS, POLISHED_ANDESITE_BRICKS, Blocks.POLISHED_ANDESITE_STAIRS.properties());
    Block POLISHED_ANDESITE_BRICK_SLAB = regSlab(ChiseledBlockItemIds.POLISHED_ANDESITE_BRICK_SLAB, Blocks.POLISHED_ANDESITE_SLAB.properties());
    Block POLISHED_ANDESITE_BRICK_WALL = regWall(ChiseledBlockItemIds.POLISHED_ANDESITE_BRICK_WALL, POLISHED_ANDESITE_WALL.properties());
    Block CUT_POLISHED_ANDESITE_BRICKS = regSimpleBlock(ChiseledBlockItemIds.CUT_POLISHED_ANDESITE_BRICKS, Blocks.POLISHED_ANDESITE.properties());
    Block CRACKED_CUT_POLISHED_ANDESITE_BRICKS = regSimpleBlock(ChiseledBlockItemIds.CRACKED_CUT_POLISHED_ANDESITE_BRICKS, Blocks.POLISHED_ANDESITE.properties());
    Block CUT_POLISHED_ANDESITE_BRICK_STAIRS = regStairs(ChiseledBlockItemIds.CUT_POLISHED_ANDESITE_BRICK_STAIRS, CUT_POLISHED_ANDESITE_BRICKS, Blocks.POLISHED_ANDESITE_STAIRS.properties());
    Block CUT_POLISHED_ANDESITE_BRICK_SLAB = regSlab(ChiseledBlockItemIds.CUT_POLISHED_ANDESITE_BRICK_SLAB, Blocks.POLISHED_ANDESITE_SLAB.properties());
    Block POLISHED_ANDESITE_TILES = regSimpleBlock(ChiseledBlockItemIds.POLISHED_ANDESITE_TILES, Blocks.POLISHED_ANDESITE.properties());
    Block CRACKED_POLISHED_ANDESITE_TILES = regSimpleBlock(ChiseledBlockItemIds.CRACKED_POLISHED_ANDESITE_TILES, Blocks.POLISHED_ANDESITE.properties());
    Block POLISHED_ANDESITE_TILE_STAIRS = regStairs(ChiseledBlockItemIds.POLISHED_ANDESITE_TILE_STAIRS, POLISHED_ANDESITE_TILES, Blocks.POLISHED_ANDESITE_STAIRS.properties());
    Block POLISHED_ANDESITE_TILE_SLAB = regSlab(ChiseledBlockItemIds.POLISHED_ANDESITE_TILE_SLAB, Blocks.POLISHED_ANDESITE_SLAB.properties());
    Block POLISHED_ANDESITE_TILE_WALL = regWall(ChiseledBlockItemIds.POLISHED_ANDESITE_TILE_WALL, POLISHED_ANDESITE_WALL.properties());

    // Deepslate Blocks
    Block DEEPSLATE_PILLAR = regRotatedPillar(ChiseledBlockItemIds.DEEPSLATE_PILLAR, Blocks.POLISHED_DEEPSLATE.properties());
    Block CUT_DEEPSLATE_BRICKS = regSimpleBlock(ChiseledBlockItemIds.CUT_DEEPSLATE_BRICKS, Blocks.DEEPSLATE_BRICKS.properties());
    Block CRACKED_CUT_DEEPSLATE_BRICKS = regSimpleBlock(ChiseledBlockItemIds.CRACKED_CUT_DEEPSLATE_BRICKS, Blocks.DEEPSLATE_BRICKS.properties());
    Block CUT_DEEPSLATE_BRICK_STAIRS = regStairs(ChiseledBlockItemIds.CUT_DEEPSLATE_BRICK_STAIRS, CUT_DEEPSLATE_BRICKS, Blocks.DEEPSLATE_BRICK_STAIRS.properties());
    Block CUT_DEEPSLATE_BRICK_SLAB = regSlab(ChiseledBlockItemIds.CUT_DEEPSLATE_BRICK_SLAB, Blocks.DEEPSLATE_BRICK_SLAB.properties());

    // Brick Blocks
    Block CRACKED_BRICKS = regSimpleBlock(ChiseledBlockItemIds.CRACKED_BRICKS, Blocks.BRICKS.properties());
    Block WEATHERED_BRICKS = regSimpleBlock(ChiseledBlockItemIds.WEATHERED_BRICKS, Blocks.BRICKS.properties());
    Block WEATHERED_BRICK_STAIRS = regStairs(ChiseledBlockItemIds.WEATHERED_BRICK_STAIRS, WEATHERED_BRICKS, Blocks.BRICK_STAIRS.properties());
    Block WEATHERED_BRICK_SLAB = regSlab(ChiseledBlockItemIds.WEATHERED_BRICK_SLAB, Blocks.BRICK_SLAB.properties());
    Block WEATHERED_BRICK_WALL = regWall(ChiseledBlockItemIds.WEATHERED_BRICK_WALL, Blocks.BRICK_WALL.properties());
    Block MOSSY_BRICKS = regSimpleBlock(ChiseledBlockItemIds.MOSSY_BRICKS, Blocks.BRICKS.properties());
    Block MOSSY_BRICK_STAIRS = regStairs(ChiseledBlockItemIds.MOSSY_BRICK_STAIRS, MOSSY_BRICKS, Blocks.BRICK_STAIRS.properties());
    Block MOSSY_BRICK_SLAB = regSlab(ChiseledBlockItemIds.MOSSY_BRICK_SLAB, Blocks.BRICK_SLAB.properties());
    Block MOSSY_BRICK_WALL = regWall(ChiseledBlockItemIds.MOSSY_BRICK_WALL, Blocks.BRICK_WALL.properties());

    // Packed Mud Blocks
    Block PACKED_MUD_STAIRS = regStairs(ChiseledBlockItemIds.PACKED_MUD_STAIRS, Blocks.PACKED_MUD, Blocks.PACKED_MUD.properties());
    Block PACKED_MUD_SLAB = regSlab(ChiseledBlockItemIds.PACKED_MUD_SLAB, Blocks.PACKED_MUD.properties());
    Block PACKED_MUD_WALL = regWall(ChiseledBlockItemIds.PACKED_MUD_WALL, Blocks.PACKED_MUD.properties());
    Block MOSSY_MUD_BRICKS = regSimpleBlock(ChiseledBlockItemIds.MOSSY_MUD_BRICKS, Blocks.MUD_BRICKS.properties());
    Block MOSSY_MUD_BRICK_STAIRS = regStairs(ChiseledBlockItemIds.MOSSY_MUD_BRICK_STAIRS, MOSSY_MUD_BRICKS, Blocks.MUD_BRICK_STAIRS.properties());
    Block MOSSY_MUD_BRICK_SLAB = regSlab(ChiseledBlockItemIds.MOSSY_MUD_BRICK_SLAB, Blocks.MUD_BRICK_SLAB.properties());
    Block MOSSY_MUD_BRICK_WALL = regWall(ChiseledBlockItemIds.MOSSY_MUD_BRICK_WALL, Blocks.MUD_BRICK_WALL.properties());
    Block CUT_MUD_BRICKS = regSimpleBlock(ChiseledBlockItemIds.CUT_MUD_BRICKS, Blocks.MUD_BRICKS.properties());
    Block CUT_MUD_BRICK_STAIRS = regStairs(ChiseledBlockItemIds.CUT_MUD_BRICK_STAIRS, CUT_MUD_BRICKS, Blocks.MUD_BRICK_STAIRS.properties());
    Block CUT_MUD_BRICK_SLAB = regSlab(ChiseledBlockItemIds.CUT_MUD_BRICK_SLAB, Blocks.MUD_BRICK_SLAB.properties());
    Block MOSSY_CUT_MUD_BRICKS = regSimpleBlock(ChiseledBlockItemIds.MOSSY_CUT_MUD_BRICKS, Blocks.MUD_BRICKS.properties());
    Block MOSSY_CUT_MUD_BRICK_STAIRS = regStairs(ChiseledBlockItemIds.MOSSY_CUT_MUD_BRICK_STAIRS, MOSSY_CUT_MUD_BRICKS, Blocks.MUD_BRICK_STAIRS.properties());
    Block MOSSY_CUT_MUD_BRICK_SLAB = regSlab(ChiseledBlockItemIds.MOSSY_CUT_MUD_BRICK_SLAB, Blocks.MUD_BRICK_SLAB.properties());
    Block MUD_TILES = regSimpleBlock(ChiseledBlockItemIds.MUD_TILES, Blocks.MUD_BRICKS.properties());
    Block MUD_TILE_STAIRS = regStairs(ChiseledBlockItemIds.MUD_TILE_STAIRS, MUD_TILES, Blocks.MUD_BRICK_STAIRS.properties());
    Block MUD_TILE_SLAB = regSlab(ChiseledBlockItemIds.MUD_TILE_SLAB, Blocks.MUD_BRICK_SLAB.properties());
    Block MUD_TILE_WALL = regWall(ChiseledBlockItemIds.MUD_TILE_WALL, Blocks.MUD_BRICK_WALL.properties());
    Block MOSSY_MUD_TILES = regSimpleBlock(ChiseledBlockItemIds.MOSSY_MUD_TILES, Blocks.MUD_BRICKS.properties());
    Block MOSSY_MUD_TILE_STAIRS = regStairs(ChiseledBlockItemIds.MOSSY_MUD_TILE_STAIRS, MOSSY_MUD_TILES, Blocks.MUD_BRICK_STAIRS.properties());
    Block MOSSY_MUD_TILE_SLAB = regSlab(ChiseledBlockItemIds.MOSSY_MUD_TILE_SLAB, Blocks.MUD_BRICK_SLAB.properties());
    Block MOSSY_MUD_TILE_WALL = regWall(ChiseledBlockItemIds.MOSSY_MUD_TILE_WALL, Blocks.MUD_BRICK_WALL.properties());

    // Sandstone Blocks
    Block SMOOTH_SANDSTONE_WALL = regWall(ChiseledBlockItemIds.SMOOTH_SANDSTONE_WALL, Blocks.SMOOTH_SANDSTONE.properties());
    Block SMOOTH_SANDSTONE_PILLAR = regRotatedPillar(ChiseledBlockItemIds.SMOOTH_SANDSTONE_PILLAR, Blocks.SMOOTH_SANDSTONE.properties());
    Block SMOOTH_SANDSTONE_BRICKS = regSimpleBlock(ChiseledBlockItemIds.SMOOTH_SANDSTONE_BRICKS, Blocks.SMOOTH_SANDSTONE.properties());
    Block SMOOTH_SANDSTONE_BRICK_STAIRS = regStairs(ChiseledBlockItemIds.SMOOTH_SANDSTONE_BRICK_STAIRS, SMOOTH_SANDSTONE_BRICKS, Blocks.SMOOTH_SANDSTONE_STAIRS.properties());
    Block SMOOTH_SANDSTONE_BRICK_SLAB = regSlab(ChiseledBlockItemIds.SMOOTH_SANDSTONE_BRICK_SLAB, Blocks.SMOOTH_SANDSTONE_SLAB.properties());
    Block SMOOTH_SANDSTONE_BRICK_WALL = regWall(ChiseledBlockItemIds.SMOOTH_SANDSTONE_BRICK_WALL, SMOOTH_SANDSTONE_WALL.properties());
    Block CUT_SMOOTH_SANDSTONE_BRICKS = regSimpleBlock(ChiseledBlockItemIds.CUT_SMOOTH_SANDSTONE_BRICKS, Blocks.SMOOTH_SANDSTONE.properties());
    Block CUT_SMOOTH_SANDSTONE_BRICK_STAIRS = regStairs(ChiseledBlockItemIds.CUT_SMOOTH_SANDSTONE_BRICK_STAIRS, CUT_SMOOTH_SANDSTONE_BRICKS, Blocks.SMOOTH_SANDSTONE_STAIRS.properties());
    Block CUT_SMOOTH_SANDSTONE_BRICK_SLAB = regSlab(ChiseledBlockItemIds.CUT_SMOOTH_SANDSTONE_BRICK_SLAB, Blocks.SMOOTH_SANDSTONE_SLAB.properties());
    Block SMOOTH_SANDSTONE_TILES = regSimpleBlock(ChiseledBlockItemIds.SMOOTH_SANDSTONE_TILES, Blocks.SMOOTH_SANDSTONE.properties());
    Block SMOOTH_SANDSTONE_TILE_STAIRS = regStairs(ChiseledBlockItemIds.SMOOTH_SANDSTONE_TILE_STAIRS, SMOOTH_SANDSTONE_TILES, Blocks.SMOOTH_SANDSTONE_STAIRS.properties());
    Block SMOOTH_SANDSTONE_TILE_SLAB = regSlab(ChiseledBlockItemIds.SMOOTH_SANDSTONE_TILE_SLAB, Blocks.SMOOTH_SANDSTONE_SLAB.properties());
    Block SMOOTH_SANDSTONE_TILE_WALL = regWall(ChiseledBlockItemIds.SMOOTH_SANDSTONE_TILE_WALL, SMOOTH_SANDSTONE_WALL.properties());

    // Red Sandstone Blocks
    Block SMOOTH_RED_SANDSTONE_WALL = regWall(ChiseledBlockItemIds.SMOOTH_RED_SANDSTONE_WALL, Blocks.SMOOTH_RED_SANDSTONE.properties());
    Block SMOOTH_RED_SANDSTONE_PILLAR = regRotatedPillar(ChiseledBlockItemIds.SMOOTH_RED_SANDSTONE_PILLAR, Blocks.SMOOTH_RED_SANDSTONE.properties());
    Block SMOOTH_RED_SANDSTONE_BRICKS = regSimpleBlock(ChiseledBlockItemIds.SMOOTH_RED_SANDSTONE_BRICKS, Blocks.SMOOTH_RED_SANDSTONE.properties());
    Block SMOOTH_RED_SANDSTONE_BRICK_STAIRS = regStairs(ChiseledBlockItemIds.SMOOTH_RED_SANDSTONE_BRICK_STAIRS, SMOOTH_RED_SANDSTONE_BRICKS, Blocks.SMOOTH_RED_SANDSTONE_STAIRS.properties());
    Block SMOOTH_RED_SANDSTONE_BRICK_SLAB = regSlab(ChiseledBlockItemIds.SMOOTH_RED_SANDSTONE_BRICK_SLAB, Blocks.SMOOTH_RED_SANDSTONE_SLAB.properties());
    Block SMOOTH_RED_SANDSTONE_BRICK_WALL = regWall(ChiseledBlockItemIds.SMOOTH_RED_SANDSTONE_BRICK_WALL, SMOOTH_RED_SANDSTONE_WALL.properties());
    Block CUT_SMOOTH_RED_SANDSTONE_BRICKS = regSimpleBlock(ChiseledBlockItemIds.CUT_SMOOTH_RED_SANDSTONE_BRICKS, Blocks.SMOOTH_RED_SANDSTONE.properties());
    Block CUT_SMOOTH_RED_SANDSTONE_BRICK_STAIRS = regStairs(ChiseledBlockItemIds.CUT_SMOOTH_RED_SANDSTONE_BRICK_STAIRS, CUT_SMOOTH_RED_SANDSTONE_BRICKS, Blocks.SMOOTH_RED_SANDSTONE_STAIRS.properties());
    Block CUT_SMOOTH_RED_SANDSTONE_BRICK_SLAB = regSlab(ChiseledBlockItemIds.CUT_SMOOTH_RED_SANDSTONE_BRICK_SLAB, Blocks.SMOOTH_RED_SANDSTONE_SLAB.properties());
    Block SMOOTH_RED_SANDSTONE_TILES = regSimpleBlock(ChiseledBlockItemIds.SMOOTH_RED_SANDSTONE_TILES, Blocks.SMOOTH_RED_SANDSTONE.properties());
    Block SMOOTH_RED_SANDSTONE_TILE_STAIRS = regStairs(ChiseledBlockItemIds.SMOOTH_RED_SANDSTONE_TILE_STAIRS, SMOOTH_RED_SANDSTONE_TILES, Blocks.SMOOTH_RED_SANDSTONE_STAIRS.properties());
    Block SMOOTH_RED_SANDSTONE_TILE_SLAB = regSlab(ChiseledBlockItemIds.SMOOTH_RED_SANDSTONE_TILE_SLAB, Blocks.SMOOTH_RED_SANDSTONE_SLAB.properties());
    Block SMOOTH_RED_SANDSTONE_TILE_WALL = regWall(ChiseledBlockItemIds.SMOOTH_RED_SANDSTONE_TILE_WALL, SMOOTH_RED_SANDSTONE_WALL.properties());

    // Cinnabar Blocks
    Block CRACKED_CINNABAR_BRICKS = regSimpleBlock(ChiseledBlockItemIds.CRACKED_CINNABAR_BRICKS, Blocks.CINNABAR_BRICKS.properties());
    Block CUT_CINNABAR_BRICKS = regSimpleBlock(ChiseledBlockItemIds.CUT_CINNABAR_BRICKS, Blocks.CINNABAR_BRICKS.properties());
    Block CRACKED_CUT_CINNABAR_BRICKS = regSimpleBlock(ChiseledBlockItemIds.CRACKED_CUT_CINNABAR_BRICKS, Blocks.CINNABAR_BRICKS.properties());
    Block CUT_CINNABAR_BRICK_STAIRS = regStairs(ChiseledBlockItemIds.CUT_CINNABAR_BRICK_STAIRS, CUT_CINNABAR_BRICKS, Blocks.CINNABAR_BRICK_STAIRS.properties());
    Block CUT_CINNABAR_BRICK_SLAB = regSlab(ChiseledBlockItemIds.CUT_CINNABAR_BRICK_SLAB, Blocks.CINNABAR_BRICK_SLAB.properties());
    Block CINNABAR_TILES = regSimpleBlock(ChiseledBlockItemIds.CINNABAR_TILES, Blocks.CINNABAR_BRICKS.properties());
    Block CRACKED_CINNABAR_TILES = regSimpleBlock(ChiseledBlockItemIds.CRACKED_CINNABAR_TILES, Blocks.CINNABAR_BRICKS.properties());
    Block CINNABAR_TILE_STAIRS = regStairs(ChiseledBlockItemIds.CINNABAR_TILE_STAIRS, CINNABAR_TILES, Blocks.CINNABAR_BRICK_STAIRS.properties());
    Block CINNABAR_TILE_SLAB = regSlab(ChiseledBlockItemIds.CINNABAR_TILE_SLAB, Blocks.CINNABAR_BRICK_SLAB.properties());
    Block CINNABAR_TILE_WALL = regWall(ChiseledBlockItemIds.CINNABAR_TILE_WALL, Blocks.CINNABAR_BRICK_WALL.properties());

    // Sulfur Blocks
    Block CRACKED_SULFUR_BRICKS = regSimpleBlock(ChiseledBlockItemIds.CRACKED_SULFUR_BRICKS, Blocks.SULFUR_BRICKS.properties());
    Block CUT_SULFUR_BRICKS = regSimpleBlock(ChiseledBlockItemIds.CUT_SULFUR_BRICKS, Blocks.SULFUR_BRICKS.properties());
    Block CRACKED_CUT_SULFUR_BRICKS = regSimpleBlock(ChiseledBlockItemIds.CRACKED_CUT_SULFUR_BRICKS, Blocks.SULFUR_BRICKS.properties());
    Block CUT_SULFUR_BRICK_STAIRS = regStairs(ChiseledBlockItemIds.CUT_SULFUR_BRICK_STAIRS, CUT_SULFUR_BRICKS, Blocks.SULFUR_BRICK_STAIRS.properties());
    Block CUT_SULFUR_BRICK_SLAB = regSlab(ChiseledBlockItemIds.CUT_SULFUR_BRICK_SLAB, Blocks.SULFUR_BRICK_SLAB.properties());
    Block SULFUR_TILES = regSimpleBlock(ChiseledBlockItemIds.SULFUR_TILES, Blocks.SULFUR_BRICKS.properties());
    Block CRACKED_SULFUR_TILES = regSimpleBlock(ChiseledBlockItemIds.CRACKED_SULFUR_TILES, Blocks.SULFUR_BRICKS.properties());
    Block SULFUR_TILE_STAIRS = regStairs(ChiseledBlockItemIds.SULFUR_TILE_STAIRS, SULFUR_TILES, Blocks.SULFUR_BRICK_STAIRS.properties());
    Block SULFUR_TILE_SLAB = regSlab(ChiseledBlockItemIds.SULFUR_TILE_SLAB, Blocks.SULFUR_BRICK_SLAB.properties());
    Block SULFUR_TILE_WALL = regWall(ChiseledBlockItemIds.SULFUR_TILE_WALL, Blocks.SULFUR_BRICK_WALL.properties());

    // Prismarine Blocks
    Block POLISHED_PRISMARINE = regSimpleBlock(ChiseledBlockItemIds.POLISHED_PRISMARINE, Blocks.PRISMARINE_BRICKS.properties());
    Block POLISHED_PRISMARINE_STAIRS = regStairs(ChiseledBlockItemIds.POLISHED_PRISMARINE_STAIRS, POLISHED_PRISMARINE, Blocks.PRISMARINE_BRICK_STAIRS.properties());
    Block POLISHED_PRISMARINE_SLAB = regSlab(ChiseledBlockItemIds.POLISHED_PRISMARINE_SLAB, Blocks.PRISMARINE_BRICK_SLAB.properties());
    Block POLISHED_PRISMARINE_WALL = regWall(ChiseledBlockItemIds.POLISHED_PRISMARINE_WALL, Blocks.PRISMARINE_BRICKS.properties());
    Block PRISMARINE_BRICK_WALL = regWall(ChiseledBlockItemIds.PRISMARINE_BRICK_WALL, Blocks.PRISMARINE_BRICKS.properties());
    Block CUT_PRISMARINE_BRICKS = regSimpleBlock(ChiseledBlockItemIds.CUT_PRISMARINE_BRICKS, Blocks.PRISMARINE_BRICKS.properties());
    Block CUT_PRISMARINE_BRICK_STAIRS = regStairs(ChiseledBlockItemIds.CUT_PRISMARINE_BRICK_STAIRS, CUT_PRISMARINE_BRICKS, Blocks.PRISMARINE_BRICK_STAIRS.properties());
    Block CUT_PRISMARINE_BRICK_SLAB = regSlab(ChiseledBlockItemIds.CUT_PRISMARINE_BRICK_SLAB, Blocks.PRISMARINE_BRICK_SLAB.properties());

    // Dark Prismarine Blocks
    Block DARK_PRISMARINE_WALL = regWall(ChiseledBlockItemIds.DARK_PRISMARINE_WALL, Blocks.PRISMARINE_BRICKS.properties());
    Block POLISHED_DARK_PRISMARINE = regSimpleBlock(ChiseledBlockItemIds.POLISHED_DARK_PRISMARINE, Blocks.PRISMARINE_BRICKS.properties());
    Block POLISHED_DARK_PRISMARINE_STAIRS = regStairs(ChiseledBlockItemIds.POLISHED_DARK_PRISMARINE_STAIRS, POLISHED_DARK_PRISMARINE, Blocks.PRISMARINE_BRICK_STAIRS.properties());
    Block POLISHED_DARK_PRISMARINE_SLAB = regSlab(ChiseledBlockItemIds.POLISHED_DARK_PRISMARINE_SLAB, Blocks.PRISMARINE_BRICK_SLAB.properties());
    Block POLISHED_DARK_PRISMARINE_WALL = regWall(ChiseledBlockItemIds.POLISHED_DARK_PRISMARINE_WALL, Blocks.PRISMARINE_BRICKS.properties());
    Block DARK_PRISMARINE_BRICKS = regSimpleBlock(ChiseledBlockItemIds.DARK_PRISMARINE_BRICKS, Blocks.PRISMARINE_BRICKS.properties());
    Block DARK_PRISMARINE_BRICK_STAIRS = regStairs(ChiseledBlockItemIds.DARK_PRISMARINE_BRICK_STAIRS, DARK_PRISMARINE_BRICKS, Blocks.PRISMARINE_BRICK_STAIRS.properties());
    Block DARK_PRISMARINE_BRICK_SLAB = regSlab(ChiseledBlockItemIds.DARK_PRISMARINE_BRICK_SLAB, Blocks.PRISMARINE_BRICK_SLAB.properties());
    Block DARK_PRISMARINE_BRICK_WALL = regWall(ChiseledBlockItemIds.DARK_PRISMARINE_BRICK_WALL, Blocks.PRISMARINE_BRICKS.properties());
    Block CUT_DARK_PRISMARINE_BRICKS = regSimpleBlock(ChiseledBlockItemIds.CUT_DARK_PRISMARINE_BRICKS, Blocks.PRISMARINE_BRICKS.properties());
    Block CUT_DARK_PRISMARINE_BRICK_STAIRS = regStairs(ChiseledBlockItemIds.CUT_DARK_PRISMARINE_BRICK_STAIRS, CUT_DARK_PRISMARINE_BRICKS, Blocks.PRISMARINE_BRICK_STAIRS.properties());
    Block CUT_DARK_PRISMARINE_BRICK_SLAB = regSlab(ChiseledBlockItemIds.CUT_DARK_PRISMARINE_BRICK_SLAB, Blocks.PRISMARINE_BRICK_SLAB.properties());

    // Red Nether Brick Blocks
    Block CRACKED_RED_NETHER_BRICKS = regSimpleBlock(ChiseledBlockItemIds.CRACKED_RED_NETHER_BRICKS, Blocks.RED_NETHER_BRICKS.properties());
    Block RED_NETHER_BRICK_FENCE = regFence(ChiseledBlockItemIds.RED_NETHER_BRICK_FENCE, Blocks.NETHER_BRICK_FENCE.properties());
    Block CHISELED_RED_NETHER_BRICKS = regSimpleBlock(ChiseledBlockItemIds.CHISELED_RED_NETHER_BRICKS, Blocks.RED_NETHER_BRICKS.properties());

    // Blackstone Blocks
    Block POLISHED_BLACKSTONE_PILLAR = regRotatedPillar(ChiseledBlockItemIds.POLISHED_BLACKSTONE_PILLAR, Blocks.POLISHED_BLACKSTONE_BRICKS.properties());
    Block CUT_POLISHED_BLACKSTONE_BRICKS = regSimpleBlock(ChiseledBlockItemIds.CUT_POLISHED_BLACKSTONE_BRICKS, Blocks.POLISHED_BLACKSTONE_BRICKS.properties());
    Block CRACKED_CUT_POLISHED_BLACKSTONE_BRICKS = regSimpleBlock(ChiseledBlockItemIds.CRACKED_CUT_POLISHED_BLACKSTONE_BRICKS, Blocks.POLISHED_BLACKSTONE_BRICKS.properties());
    Block CUT_POLISHED_BLACKSTONE_BRICK_STAIRS = regStairs(ChiseledBlockItemIds.CUT_POLISHED_BLACKSTONE_BRICK_STAIRS, CUT_POLISHED_BLACKSTONE_BRICKS, Blocks.POLISHED_BLACKSTONE_BRICK_STAIRS.properties());
    Block CUT_POLISHED_BLACKSTONE_BRICK_SLAB = regSlab(ChiseledBlockItemIds.CUT_POLISHED_BLACKSTONE_BRICK_SLAB, Blocks.POLISHED_BLACKSTONE_BRICK_SLAB.properties());
    Block POLISHED_BLACKSTONE_TILES = regSimpleBlock(ChiseledBlockItemIds.POLISHED_BLACKSTONE_TILES, Blocks.POLISHED_BLACKSTONE_BRICKS.properties());
    Block CRACKED_POLISHED_BLACKSTONE_TILES = regSimpleBlock(ChiseledBlockItemIds.CRACKED_POLISHED_BLACKSTONE_TILES, Blocks.POLISHED_BLACKSTONE_BRICKS.properties());
    Block POLISHED_BLACKSTONE_TILE_STAIRS = regStairs(ChiseledBlockItemIds.POLISHED_BLACKSTONE_TILE_STAIRS, POLISHED_BLACKSTONE_TILES, Blocks.POLISHED_BLACKSTONE_BRICK_STAIRS.properties());
    Block POLISHED_BLACKSTONE_TILE_SLAB = regSlab(ChiseledBlockItemIds.POLISHED_BLACKSTONE_TILE_SLAB, Blocks.POLISHED_BLACKSTONE_BRICK_SLAB.properties());
    Block POLISHED_BLACKSTONE_TILE_WALL = regWall(ChiseledBlockItemIds.POLISHED_BLACKSTONE_TILE_WALL, Blocks.POLISHED_BLACKSTONE_BRICK_WALL.properties());

    // End Stone Blocks
    Block END_STONE_STAIRS = regStairs(ChiseledBlockItemIds.END_STONE_STAIRS, Blocks.END_STONE, Blocks.END_STONE.properties());
    Block END_STONE_SLAB = regSlab(ChiseledBlockItemIds.END_STONE_SLAB, Blocks.END_STONE.properties());
    Block END_STONE_WALL = regWall(ChiseledBlockItemIds.END_STONE_WALL, Blocks.END_STONE.properties());
    Block POLISHED_END_STONE = regSimpleBlock(ChiseledBlockItemIds.POLISHED_END_STONE, Blocks.END_STONE_BRICKS.properties());
    Block POLISHED_END_STONE_STAIRS = regStairs(ChiseledBlockItemIds.POLISHED_END_STONE_STAIRS, POLISHED_END_STONE, Blocks.END_STONE_BRICK_STAIRS.properties());
    Block POLISHED_END_STONE_SLAB = regSlab(ChiseledBlockItemIds.POLISHED_END_STONE_SLAB, Blocks.END_STONE_BRICK_SLAB.properties());
    Block POLISHED_END_STONE_WALL = regWall(ChiseledBlockItemIds.POLISHED_END_STONE_WALL, Blocks.END_STONE_BRICK_WALL.properties());
    Block END_STONE_PILLAR = regRotatedPillar(ChiseledBlockItemIds.END_STONE_PILLAR, Blocks.END_STONE_BRICKS.properties());
    Block CRACKED_END_STONE_BRICKS = regSimpleBlock(ChiseledBlockItemIds.CRACKED_END_STONE_BRICKS, Blocks.END_STONE_BRICKS.properties());
    Block CUT_END_STONE_BRICKS = regSimpleBlock(ChiseledBlockItemIds.CUT_END_STONE_BRICKS, Blocks.END_STONE_BRICKS.properties());
    Block CRACKED_CUT_END_STONE_BRICKS = regSimpleBlock(ChiseledBlockItemIds.CRACKED_CUT_END_STONE_BRICKS, Blocks.END_STONE_BRICKS.properties());
    Block CUT_END_STONE_BRICK_STAIRS = regStairs(ChiseledBlockItemIds.CUT_END_STONE_BRICK_STAIRS, CUT_END_STONE_BRICKS, Blocks.END_STONE_BRICK_STAIRS.properties());
    Block CUT_END_STONE_BRICK_SLAB = regSlab(ChiseledBlockItemIds.CUT_END_STONE_BRICK_SLAB, Blocks.END_STONE_BRICK_SLAB.properties());
    Block END_STONE_TILES = regSimpleBlock(ChiseledBlockItemIds.END_STONE_TILES, Blocks.END_STONE_BRICKS.properties());
    Block CRACKED_END_STONE_TILES = regSimpleBlock(ChiseledBlockItemIds.CRACKED_END_STONE_TILES, Blocks.END_STONE_BRICKS.properties());
    Block END_STONE_TILE_STAIRS = regStairs(ChiseledBlockItemIds.END_STONE_TILE_STAIRS, END_STONE_TILES, Blocks.END_STONE_BRICK_STAIRS.properties());
    Block END_STONE_TILE_SLAB = regSlab(ChiseledBlockItemIds.END_STONE_TILE_SLAB, Blocks.END_STONE_BRICK_SLAB.properties());
    Block END_STONE_TILE_WALL = regWall(ChiseledBlockItemIds.END_STONE_TILE_WALL, Blocks.END_STONE_BRICK_WALL.properties());

    // Quartz Blocks
    Block QUARTZ_WALL = regWall(ChiseledBlockItemIds.QUARTZ_WALL, Blocks.QUARTZ_BLOCK.properties());
    Block SMOOTH_QUARTZ_WALL = regWall(ChiseledBlockItemIds.SMOOTH_QUARTZ_WALL, Blocks.SMOOTH_QUARTZ.properties());
    Block QUARTZ_BRICK_STAIRS = regStairs(ChiseledBlockItemIds.QUARTZ_BRICK_STAIRS, Blocks.QUARTZ_BRICKS, Blocks.QUARTZ_BRICKS.properties());
    Block QUARTZ_BRICK_SLAB = regSlab(ChiseledBlockItemIds.QUARTZ_BRICK_SLAB, Blocks.QUARTZ_BRICKS.properties());
    Block QUARTZ_BRICK_WALL = regWall(ChiseledBlockItemIds.QUARTZ_BRICK_WALL, Blocks.QUARTZ_BRICKS.properties());
    Block CUT_QUARTZ_BRICKS = regSimpleBlock(ChiseledBlockItemIds.CUT_QUARTZ_BRICKS, Blocks.QUARTZ_BRICKS.properties());
    Block CUT_QUARTZ_BRICK_STAIRS = regStairs(ChiseledBlockItemIds.CUT_QUARTZ_BRICK_STAIRS, CUT_QUARTZ_BRICKS, Blocks.QUARTZ_BRICKS.properties());
    Block CUT_QUARTZ_BRICK_SLAB = regSlab(ChiseledBlockItemIds.CUT_QUARTZ_BRICK_SLAB, Blocks.QUARTZ_BRICKS.properties());
    Block QUARTZ_TILES = regSimpleBlock(ChiseledBlockItemIds.QUARTZ_TILES, Blocks.QUARTZ_BRICKS.properties());
    Block QUARTZ_TILE_STAIRS = regStairs(ChiseledBlockItemIds.QUARTZ_TILE_STAIRS, QUARTZ_TILES, Blocks.QUARTZ_BRICKS.properties());
    Block QUARTZ_TILE_SLAB = regSlab(ChiseledBlockItemIds.QUARTZ_TILE_SLAB, Blocks.QUARTZ_BRICKS.properties());
    Block QUARTZ_TILE_WALL = regWall(ChiseledBlockItemIds.QUARTZ_TILE_WALL, Blocks.QUARTZ_BRICKS.properties());

    // Terracotta Blocks
    Block TERRACOTTA_STAIRS = regStairs(ChiseledBlockItemIds.TERRACOTTA_STAIRS, Blocks.TERRACOTTA, Blocks.TERRACOTTA.properties());
    Block TERRACOTTA_SLAB = regSlab(ChiseledBlockItemIds.TERRACOTTA_SLAB, Blocks.TERRACOTTA.properties());
    Block TERRACOTTA_WALL = regWall(ChiseledBlockItemIds.TERRACOTTA_WALL, Blocks.TERRACOTTA.properties());
    Block TERRACOTTA_BRICKS = regSimpleBlock(ChiseledBlockItemIds.TERRACOTTA_BRICKS, Blocks.TERRACOTTA.properties());
    Block TERRACOTTA_BRICK_STAIRS = regStairs(ChiseledBlockItemIds.TERRACOTTA_BRICK_STAIRS, TERRACOTTA_BRICKS, Blocks.TERRACOTTA.properties());
    Block TERRACOTTA_BRICK_SLAB = regSlab(ChiseledBlockItemIds.TERRACOTTA_BRICK_SLAB, Blocks.TERRACOTTA.properties());
    Block TERRACOTTA_BRICK_WALL = regWall(ChiseledBlockItemIds.TERRACOTTA_BRICK_WALL, Blocks.TERRACOTTA.properties());
    Block WHITE_CONCRETE_WALL = regWall(ChiseledBlockItemIds.WHITE_CONCRETE_WALL, Blocks.CONCRETE.white().properties());
    Block WHITE_TERRACOTTA_STAIRS = regStairs(ChiseledBlockItemIds.WHITE_TERRACOTTA_STAIRS, Blocks.DYED_TERRACOTTA.white(), Blocks.DYED_TERRACOTTA.white().properties());
    Block WHITE_TERRACOTTA_SLAB = regSlab(ChiseledBlockItemIds.WHITE_TERRACOTTA_SLAB, Blocks.DYED_TERRACOTTA.white().properties());
    Block WHITE_TERRACOTTA_WALL = regWall(ChiseledBlockItemIds.WHITE_TERRACOTTA_WALL, Blocks.DYED_TERRACOTTA.white().properties());
    Block WHITE_TERRACOTTA_BRICKS = regSimpleBlock(ChiseledBlockItemIds.WHITE_TERRACOTTA_BRICKS, Blocks.DYED_TERRACOTTA.white().properties());
    Block WHITE_TERRACOTTA_BRICK_STAIRS = regStairs(ChiseledBlockItemIds.WHITE_TERRACOTTA_BRICK_STAIRS, WHITE_TERRACOTTA_BRICKS, Blocks.DYED_TERRACOTTA.white().properties());
    Block WHITE_TERRACOTTA_BRICK_SLAB = regSlab(ChiseledBlockItemIds.WHITE_TERRACOTTA_BRICK_SLAB, Blocks.DYED_TERRACOTTA.white().properties());
    Block WHITE_TERRACOTTA_BRICK_WALL = regWall(ChiseledBlockItemIds.WHITE_TERRACOTTA_BRICK_WALL, Blocks.DYED_TERRACOTTA.white().properties());
    Block LIGHT_GRAY_CONCRETE_WALL = regWall(ChiseledBlockItemIds.LIGHT_GRAY_CONCRETE_WALL, Blocks.CONCRETE.lightGray().properties());
    Block LIGHT_GRAY_TERRACOTTA_STAIRS = regStairs(ChiseledBlockItemIds.LIGHT_GRAY_TERRACOTTA_STAIRS, Blocks.DYED_TERRACOTTA.lightGray(), Blocks.DYED_TERRACOTTA.lightGray().properties());
    Block LIGHT_GRAY_TERRACOTTA_SLAB = regSlab(ChiseledBlockItemIds.LIGHT_GRAY_TERRACOTTA_SLAB, Blocks.DYED_TERRACOTTA.lightGray().properties());
    Block LIGHT_GRAY_TERRACOTTA_WALL = regWall(ChiseledBlockItemIds.LIGHT_GRAY_TERRACOTTA_WALL, Blocks.DYED_TERRACOTTA.lightGray().properties());
    Block LIGHT_GRAY_TERRACOTTA_BRICKS = regSimpleBlock(ChiseledBlockItemIds.LIGHT_GRAY_TERRACOTTA_BRICKS, Blocks.DYED_TERRACOTTA.lightGray().properties());
    Block LIGHT_GRAY_TERRACOTTA_BRICK_STAIRS = regStairs(ChiseledBlockItemIds.LIGHT_GRAY_TERRACOTTA_BRICK_STAIRS, LIGHT_GRAY_TERRACOTTA_BRICKS, Blocks.DYED_TERRACOTTA.lightGray().properties());
    Block LIGHT_GRAY_TERRACOTTA_BRICK_SLAB = regSlab(ChiseledBlockItemIds.LIGHT_GRAY_TERRACOTTA_BRICK_SLAB, Blocks.DYED_TERRACOTTA.lightGray().properties());
    Block LIGHT_GRAY_TERRACOTTA_BRICK_WALL = regWall(ChiseledBlockItemIds.LIGHT_GRAY_TERRACOTTA_BRICK_WALL, Blocks.DYED_TERRACOTTA.lightGray().properties());
    Block GRAY_CONCRETE_WALL = regWall(ChiseledBlockItemIds.GRAY_CONCRETE_WALL, Blocks.CONCRETE.gray().properties());
    Block GRAY_TERRACOTTA_STAIRS = regStairs(ChiseledBlockItemIds.GRAY_TERRACOTTA_STAIRS, Blocks.DYED_TERRACOTTA.gray(), Blocks.DYED_TERRACOTTA.gray().properties());
    Block GRAY_TERRACOTTA_SLAB = regSlab(ChiseledBlockItemIds.GRAY_TERRACOTTA_SLAB, Blocks.DYED_TERRACOTTA.gray().properties());
    Block GRAY_TERRACOTTA_WALL = regWall(ChiseledBlockItemIds.GRAY_TERRACOTTA_WALL, Blocks.DYED_TERRACOTTA.gray().properties());
    Block GRAY_TERRACOTTA_BRICKS = regSimpleBlock(ChiseledBlockItemIds.GRAY_TERRACOTTA_BRICKS, Blocks.DYED_TERRACOTTA.gray().properties());
    Block GRAY_TERRACOTTA_BRICK_STAIRS = regStairs(ChiseledBlockItemIds.GRAY_TERRACOTTA_BRICK_STAIRS, GRAY_TERRACOTTA_BRICKS, Blocks.DYED_TERRACOTTA.gray().properties());
    Block GRAY_TERRACOTTA_BRICK_SLAB = regSlab(ChiseledBlockItemIds.GRAY_TERRACOTTA_BRICK_SLAB, Blocks.DYED_TERRACOTTA.gray().properties());
    Block GRAY_TERRACOTTA_BRICK_WALL = regWall(ChiseledBlockItemIds.GRAY_TERRACOTTA_BRICK_WALL, Blocks.DYED_TERRACOTTA.gray().properties());
    Block BLACK_CONCRETE_WALL = regWall(ChiseledBlockItemIds.BLACK_CONCRETE_WALL, Blocks.CONCRETE.black().properties());
    Block BLACK_TERRACOTTA_STAIRS = regStairs(ChiseledBlockItemIds.BLACK_TERRACOTTA_STAIRS, Blocks.DYED_TERRACOTTA.black(), Blocks.DYED_TERRACOTTA.black().properties());
    Block BLACK_TERRACOTTA_SLAB = regSlab(ChiseledBlockItemIds.BLACK_TERRACOTTA_SLAB, Blocks.DYED_TERRACOTTA.black().properties());
    Block BLACK_TERRACOTTA_WALL = regWall(ChiseledBlockItemIds.BLACK_TERRACOTTA_WALL, Blocks.DYED_TERRACOTTA.black().properties());
    Block BLACK_TERRACOTTA_BRICKS = regSimpleBlock(ChiseledBlockItemIds.BLACK_TERRACOTTA_BRICKS, Blocks.DYED_TERRACOTTA.black().properties());
    Block BLACK_TERRACOTTA_BRICK_STAIRS = regStairs(ChiseledBlockItemIds.BLACK_TERRACOTTA_BRICK_STAIRS, BLACK_TERRACOTTA_BRICKS, Blocks.DYED_TERRACOTTA.black().properties());
    Block BLACK_TERRACOTTA_BRICK_SLAB = regSlab(ChiseledBlockItemIds.BLACK_TERRACOTTA_BRICK_SLAB, Blocks.DYED_TERRACOTTA.black().properties());
    Block BLACK_TERRACOTTA_BRICK_WALL = regWall(ChiseledBlockItemIds.BLACK_TERRACOTTA_BRICK_WALL, Blocks.DYED_TERRACOTTA.black().properties());
    Block BROWN_CONCRETE_WALL = regWall(ChiseledBlockItemIds.BROWN_CONCRETE_WALL, Blocks.CONCRETE.brown().properties());
    Block BROWN_TERRACOTTA_STAIRS = regStairs(ChiseledBlockItemIds.BROWN_TERRACOTTA_STAIRS, Blocks.DYED_TERRACOTTA.brown(), Blocks.DYED_TERRACOTTA.brown().properties());
    Block BROWN_TERRACOTTA_SLAB = regSlab(ChiseledBlockItemIds.BROWN_TERRACOTTA_SLAB, Blocks.DYED_TERRACOTTA.brown().properties());
    Block BROWN_TERRACOTTA_WALL = regWall(ChiseledBlockItemIds.BROWN_TERRACOTTA_WALL, Blocks.DYED_TERRACOTTA.brown().properties());
    Block BROWN_TERRACOTTA_BRICKS = regSimpleBlock(ChiseledBlockItemIds.BROWN_TERRACOTTA_BRICKS, Blocks.DYED_TERRACOTTA.brown().properties());
    Block BROWN_TERRACOTTA_BRICK_STAIRS = regStairs(ChiseledBlockItemIds.BROWN_TERRACOTTA_BRICK_STAIRS, BROWN_TERRACOTTA_BRICKS, Blocks.DYED_TERRACOTTA.brown().properties());
    Block BROWN_TERRACOTTA_BRICK_SLAB = regSlab(ChiseledBlockItemIds.BROWN_TERRACOTTA_BRICK_SLAB, Blocks.DYED_TERRACOTTA.brown().properties());
    Block BROWN_TERRACOTTA_BRICK_WALL = regWall(ChiseledBlockItemIds.BROWN_TERRACOTTA_BRICK_WALL, Blocks.DYED_TERRACOTTA.brown().properties());
    Block RED_CONCRETE_WALL = regWall(ChiseledBlockItemIds.RED_CONCRETE_WALL, Blocks.CONCRETE.red().properties());
    Block RED_TERRACOTTA_STAIRS = regStairs(ChiseledBlockItemIds.RED_TERRACOTTA_STAIRS, Blocks.DYED_TERRACOTTA.red(), Blocks.DYED_TERRACOTTA.red().properties());
    Block RED_TERRACOTTA_SLAB = regSlab(ChiseledBlockItemIds.RED_TERRACOTTA_SLAB, Blocks.DYED_TERRACOTTA.red().properties());
    Block RED_TERRACOTTA_WALL = regWall(ChiseledBlockItemIds.RED_TERRACOTTA_WALL, Blocks.DYED_TERRACOTTA.red().properties());
    Block RED_TERRACOTTA_BRICKS = regSimpleBlock(ChiseledBlockItemIds.RED_TERRACOTTA_BRICKS, Blocks.DYED_TERRACOTTA.red().properties());
    Block RED_TERRACOTTA_BRICK_STAIRS = regStairs(ChiseledBlockItemIds.RED_TERRACOTTA_BRICK_STAIRS, RED_TERRACOTTA_BRICKS, Blocks.DYED_TERRACOTTA.red().properties());
    Block RED_TERRACOTTA_BRICK_SLAB = regSlab(ChiseledBlockItemIds.RED_TERRACOTTA_BRICK_SLAB, Blocks.DYED_TERRACOTTA.red().properties());
    Block RED_TERRACOTTA_BRICK_WALL = regWall(ChiseledBlockItemIds.RED_TERRACOTTA_BRICK_WALL, Blocks.DYED_TERRACOTTA.red().properties());
    Block ORANGE_CONCRETE_WALL = regWall(ChiseledBlockItemIds.ORANGE_CONCRETE_WALL, Blocks.CONCRETE.orange().properties());
    Block ORANGE_TERRACOTTA_STAIRS = regStairs(ChiseledBlockItemIds.ORANGE_TERRACOTTA_STAIRS, Blocks.DYED_TERRACOTTA.orange(), Blocks.DYED_TERRACOTTA.orange().properties());
    Block ORANGE_TERRACOTTA_SLAB = regSlab(ChiseledBlockItemIds.ORANGE_TERRACOTTA_SLAB, Blocks.DYED_TERRACOTTA.orange().properties());
    Block ORANGE_TERRACOTTA_WALL = regWall(ChiseledBlockItemIds.ORANGE_TERRACOTTA_WALL, Blocks.DYED_TERRACOTTA.orange().properties());
    Block ORANGE_TERRACOTTA_BRICKS = regSimpleBlock(ChiseledBlockItemIds.ORANGE_TERRACOTTA_BRICKS, Blocks.DYED_TERRACOTTA.orange().properties());
    Block ORANGE_TERRACOTTA_BRICK_STAIRS = regStairs(ChiseledBlockItemIds.ORANGE_TERRACOTTA_BRICK_STAIRS, ORANGE_TERRACOTTA_BRICKS, Blocks.DYED_TERRACOTTA.orange().properties());
    Block ORANGE_TERRACOTTA_BRICK_SLAB = regSlab(ChiseledBlockItemIds.ORANGE_TERRACOTTA_BRICK_SLAB, Blocks.DYED_TERRACOTTA.orange().properties());
    Block ORANGE_TERRACOTTA_BRICK_WALL = regWall(ChiseledBlockItemIds.ORANGE_TERRACOTTA_BRICK_WALL, Blocks.DYED_TERRACOTTA.orange().properties());
    Block YELLOW_CONCRETE_WALL = regWall(ChiseledBlockItemIds.YELLOW_CONCRETE_WALL, Blocks.CONCRETE.yellow().properties());
    Block YELLOW_TERRACOTTA_STAIRS = regStairs(ChiseledBlockItemIds.YELLOW_TERRACOTTA_STAIRS, Blocks.DYED_TERRACOTTA.yellow(), Blocks.DYED_TERRACOTTA.yellow().properties());
    Block YELLOW_TERRACOTTA_SLAB = regSlab(ChiseledBlockItemIds.YELLOW_TERRACOTTA_SLAB, Blocks.DYED_TERRACOTTA.yellow().properties());
    Block YELLOW_TERRACOTTA_WALL = regWall(ChiseledBlockItemIds.YELLOW_TERRACOTTA_WALL, Blocks.DYED_TERRACOTTA.yellow().properties());
    Block YELLOW_TERRACOTTA_BRICKS = regSimpleBlock(ChiseledBlockItemIds.YELLOW_TERRACOTTA_BRICKS, Blocks.DYED_TERRACOTTA.yellow().properties());
    Block YELLOW_TERRACOTTA_BRICK_STAIRS = regStairs(ChiseledBlockItemIds.YELLOW_TERRACOTTA_BRICK_STAIRS, YELLOW_TERRACOTTA_BRICKS, Blocks.DYED_TERRACOTTA.yellow().properties());
    Block YELLOW_TERRACOTTA_BRICK_SLAB = regSlab(ChiseledBlockItemIds.YELLOW_TERRACOTTA_BRICK_SLAB, Blocks.DYED_TERRACOTTA.yellow().properties());
    Block YELLOW_TERRACOTTA_BRICK_WALL = regWall(ChiseledBlockItemIds.YELLOW_TERRACOTTA_BRICK_WALL, Blocks.DYED_TERRACOTTA.yellow().properties());
    Block LIME_CONCRETE_WALL = regWall(ChiseledBlockItemIds.LIME_CONCRETE_WALL, Blocks.CONCRETE.lime().properties());
    Block LIME_TERRACOTTA_STAIRS = regStairs(ChiseledBlockItemIds.LIME_TERRACOTTA_STAIRS, Blocks.DYED_TERRACOTTA.lime(), Blocks.DYED_TERRACOTTA.lime().properties());
    Block LIME_TERRACOTTA_SLAB = regSlab(ChiseledBlockItemIds.LIME_TERRACOTTA_SLAB, Blocks.DYED_TERRACOTTA.lime().properties());
    Block LIME_TERRACOTTA_WALL = regWall(ChiseledBlockItemIds.LIME_TERRACOTTA_WALL, Blocks.DYED_TERRACOTTA.lime().properties());
    Block LIME_TERRACOTTA_BRICKS = regSimpleBlock(ChiseledBlockItemIds.LIME_TERRACOTTA_BRICKS, Blocks.DYED_TERRACOTTA.lime().properties());
    Block LIME_TERRACOTTA_BRICK_STAIRS = regStairs(ChiseledBlockItemIds.LIME_TERRACOTTA_BRICK_STAIRS, LIME_TERRACOTTA_BRICKS, Blocks.DYED_TERRACOTTA.lime().properties());
    Block LIME_TERRACOTTA_BRICK_SLAB = regSlab(ChiseledBlockItemIds.LIME_TERRACOTTA_BRICK_SLAB, Blocks.DYED_TERRACOTTA.lime().properties());
    Block LIME_TERRACOTTA_BRICK_WALL = regWall(ChiseledBlockItemIds.LIME_TERRACOTTA_BRICK_WALL, Blocks.DYED_TERRACOTTA.lime().properties());
    Block CYAN_CONCRETE_WALL = regWall(ChiseledBlockItemIds.CYAN_CONCRETE_WALL, Blocks.CONCRETE.cyan().properties());
    Block CYAN_TERRACOTTA_STAIRS = regStairs(ChiseledBlockItemIds.CYAN_TERRACOTTA_STAIRS, Blocks.DYED_TERRACOTTA.cyan(), Blocks.DYED_TERRACOTTA.cyan().properties());
    Block CYAN_TERRACOTTA_SLAB = regSlab(ChiseledBlockItemIds.CYAN_TERRACOTTA_SLAB, Blocks.DYED_TERRACOTTA.cyan().properties());
    Block CYAN_TERRACOTTA_WALL = regWall(ChiseledBlockItemIds.CYAN_TERRACOTTA_WALL, Blocks.DYED_TERRACOTTA.cyan().properties());
    Block CYAN_TERRACOTTA_BRICKS = regSimpleBlock(ChiseledBlockItemIds.CYAN_TERRACOTTA_BRICKS, Blocks.DYED_TERRACOTTA.cyan().properties());
    Block CYAN_TERRACOTTA_BRICK_STAIRS = regStairs(ChiseledBlockItemIds.CYAN_TERRACOTTA_BRICK_STAIRS, CYAN_TERRACOTTA_BRICKS, Blocks.DYED_TERRACOTTA.cyan().properties());
    Block CYAN_TERRACOTTA_BRICK_SLAB = regSlab(ChiseledBlockItemIds.CYAN_TERRACOTTA_BRICK_SLAB, Blocks.DYED_TERRACOTTA.cyan().properties());
    Block CYAN_TERRACOTTA_BRICK_WALL = regWall(ChiseledBlockItemIds.CYAN_TERRACOTTA_BRICK_WALL, Blocks.DYED_TERRACOTTA.cyan().properties());
    Block GREEN_CONCRETE_WALL = regWall(ChiseledBlockItemIds.GREEN_CONCRETE_WALL, Blocks.CONCRETE.green().properties());
    Block GREEN_TERRACOTTA_STAIRS = regStairs(ChiseledBlockItemIds.GREEN_TERRACOTTA_STAIRS, Blocks.DYED_TERRACOTTA.green(), Blocks.DYED_TERRACOTTA.green().properties());
    Block GREEN_TERRACOTTA_SLAB = regSlab(ChiseledBlockItemIds.GREEN_TERRACOTTA_SLAB, Blocks.DYED_TERRACOTTA.green().properties());
    Block GREEN_TERRACOTTA_WALL = regWall(ChiseledBlockItemIds.GREEN_TERRACOTTA_WALL, Blocks.DYED_TERRACOTTA.green().properties());
    Block GREEN_TERRACOTTA_BRICKS = regSimpleBlock(ChiseledBlockItemIds.GREEN_TERRACOTTA_BRICKS, Blocks.DYED_TERRACOTTA.green().properties());
    Block GREEN_TERRACOTTA_BRICK_STAIRS = regStairs(ChiseledBlockItemIds.GREEN_TERRACOTTA_BRICK_STAIRS, GREEN_TERRACOTTA_BRICKS, Blocks.DYED_TERRACOTTA.green().properties());
    Block GREEN_TERRACOTTA_BRICK_SLAB = regSlab(ChiseledBlockItemIds.GREEN_TERRACOTTA_BRICK_SLAB, Blocks.DYED_TERRACOTTA.green().properties());
    Block GREEN_TERRACOTTA_BRICK_WALL = regWall(ChiseledBlockItemIds.GREEN_TERRACOTTA_BRICK_WALL, Blocks.DYED_TERRACOTTA.green().properties());
    Block LIGHT_BLUE_CONCRETE_WALL = regWall(ChiseledBlockItemIds.LIGHT_BLUE_CONCRETE_WALL, Blocks.CONCRETE.lightBlue().properties());
    Block LIGHT_BLUE_TERRACOTTA_STAIRS = regStairs(ChiseledBlockItemIds.LIGHT_BLUE_TERRACOTTA_STAIRS, Blocks.DYED_TERRACOTTA.lightBlue(), Blocks.DYED_TERRACOTTA.lightBlue().properties());
    Block LIGHT_BLUE_TERRACOTTA_SLAB = regSlab(ChiseledBlockItemIds.LIGHT_BLUE_TERRACOTTA_SLAB, Blocks.DYED_TERRACOTTA.lightBlue().properties());
    Block LIGHT_BLUE_TERRACOTTA_WALL = regWall(ChiseledBlockItemIds.LIGHT_BLUE_TERRACOTTA_WALL, Blocks.DYED_TERRACOTTA.lightBlue().properties());
    Block LIGHT_BLUE_TERRACOTTA_BRICKS = regSimpleBlock(ChiseledBlockItemIds.LIGHT_BLUE_TERRACOTTA_BRICKS, Blocks.DYED_TERRACOTTA.lightBlue().properties());
    Block LIGHT_BLUE_TERRACOTTA_BRICK_STAIRS = regStairs(ChiseledBlockItemIds.LIGHT_BLUE_TERRACOTTA_BRICK_STAIRS, LIGHT_BLUE_TERRACOTTA_BRICKS, Blocks.DYED_TERRACOTTA.lightBlue().properties());
    Block LIGHT_BLUE_TERRACOTTA_BRICK_SLAB = regSlab(ChiseledBlockItemIds.LIGHT_BLUE_TERRACOTTA_BRICK_SLAB, Blocks.DYED_TERRACOTTA.lightBlue().properties());
    Block LIGHT_BLUE_TERRACOTTA_BRICK_WALL = regWall(ChiseledBlockItemIds.LIGHT_BLUE_TERRACOTTA_BRICK_WALL, Blocks.DYED_TERRACOTTA.lightBlue().properties());
    Block BLUE_CONCRETE_WALL = regWall(ChiseledBlockItemIds.BLUE_CONCRETE_WALL, Blocks.CONCRETE.blue().properties());
    Block BLUE_TERRACOTTA_STAIRS = regStairs(ChiseledBlockItemIds.BLUE_TERRACOTTA_STAIRS, Blocks.DYED_TERRACOTTA.blue(), Blocks.DYED_TERRACOTTA.blue().properties());
    Block BLUE_TERRACOTTA_SLAB = regSlab(ChiseledBlockItemIds.BLUE_TERRACOTTA_SLAB, Blocks.DYED_TERRACOTTA.blue().properties());
    Block BLUE_TERRACOTTA_WALL = regWall(ChiseledBlockItemIds.BLUE_TERRACOTTA_WALL, Blocks.DYED_TERRACOTTA.blue().properties());
    Block BLUE_TERRACOTTA_BRICKS = regSimpleBlock(ChiseledBlockItemIds.BLUE_TERRACOTTA_BRICKS, Blocks.DYED_TERRACOTTA.blue().properties());
    Block BLUE_TERRACOTTA_BRICK_STAIRS = regStairs(ChiseledBlockItemIds.BLUE_TERRACOTTA_BRICK_STAIRS, BLUE_TERRACOTTA_BRICKS, Blocks.DYED_TERRACOTTA.blue().properties());
    Block BLUE_TERRACOTTA_BRICK_SLAB = regSlab(ChiseledBlockItemIds.BLUE_TERRACOTTA_BRICK_SLAB, Blocks.DYED_TERRACOTTA.blue().properties());
    Block BLUE_TERRACOTTA_BRICK_WALL = regWall(ChiseledBlockItemIds.BLUE_TERRACOTTA_BRICK_WALL, Blocks.DYED_TERRACOTTA.blue().properties());
    Block PURPLE_CONCRETE_WALL = regWall(ChiseledBlockItemIds.PURPLE_CONCRETE_WALL, Blocks.CONCRETE.purple().properties());
    Block PURPLE_TERRACOTTA_STAIRS = regStairs(ChiseledBlockItemIds.PURPLE_TERRACOTTA_STAIRS, Blocks.DYED_TERRACOTTA.purple(), Blocks.DYED_TERRACOTTA.purple().properties());
    Block PURPLE_TERRACOTTA_SLAB = regSlab(ChiseledBlockItemIds.PURPLE_TERRACOTTA_SLAB, Blocks.DYED_TERRACOTTA.purple().properties());
    Block PURPLE_TERRACOTTA_WALL = regWall(ChiseledBlockItemIds.PURPLE_TERRACOTTA_WALL, Blocks.DYED_TERRACOTTA.purple().properties());
    Block PURPLE_TERRACOTTA_BRICKS = regSimpleBlock(ChiseledBlockItemIds.PURPLE_TERRACOTTA_BRICKS, Blocks.DYED_TERRACOTTA.purple().properties());
    Block PURPLE_TERRACOTTA_BRICK_STAIRS = regStairs(ChiseledBlockItemIds.PURPLE_TERRACOTTA_BRICK_STAIRS, PURPLE_TERRACOTTA_BRICKS, Blocks.DYED_TERRACOTTA.purple().properties());
    Block PURPLE_TERRACOTTA_BRICK_SLAB = regSlab(ChiseledBlockItemIds.PURPLE_TERRACOTTA_BRICK_SLAB, Blocks.DYED_TERRACOTTA.purple().properties());
    Block PURPLE_TERRACOTTA_BRICK_WALL = regWall(ChiseledBlockItemIds.PURPLE_TERRACOTTA_BRICK_WALL, Blocks.DYED_TERRACOTTA.purple().properties());
    Block MAGENTA_CONCRETE_WALL = regWall(ChiseledBlockItemIds.MAGENTA_CONCRETE_WALL, Blocks.CONCRETE.magenta().properties());
    Block MAGENTA_TERRACOTTA_STAIRS = regStairs(ChiseledBlockItemIds.MAGENTA_TERRACOTTA_STAIRS, Blocks.DYED_TERRACOTTA.magenta(), Blocks.DYED_TERRACOTTA.magenta().properties());
    Block MAGENTA_TERRACOTTA_SLAB = regSlab(ChiseledBlockItemIds.MAGENTA_TERRACOTTA_SLAB, Blocks.DYED_TERRACOTTA.magenta().properties());
    Block MAGENTA_TERRACOTTA_WALL = regWall(ChiseledBlockItemIds.MAGENTA_TERRACOTTA_WALL, Blocks.DYED_TERRACOTTA.magenta().properties());
    Block MAGENTA_TERRACOTTA_BRICKS = regSimpleBlock(ChiseledBlockItemIds.MAGENTA_TERRACOTTA_BRICKS, Blocks.DYED_TERRACOTTA.magenta().properties());
    Block MAGENTA_TERRACOTTA_BRICK_STAIRS = regStairs(ChiseledBlockItemIds.MAGENTA_TERRACOTTA_BRICK_STAIRS, MAGENTA_TERRACOTTA_BRICKS, Blocks.DYED_TERRACOTTA.magenta().properties());
    Block MAGENTA_TERRACOTTA_BRICK_SLAB = regSlab(ChiseledBlockItemIds.MAGENTA_TERRACOTTA_BRICK_SLAB, Blocks.DYED_TERRACOTTA.magenta().properties());
    Block MAGENTA_TERRACOTTA_BRICK_WALL = regWall(ChiseledBlockItemIds.MAGENTA_TERRACOTTA_BRICK_WALL, Blocks.DYED_TERRACOTTA.magenta().properties());
    Block PINK_CONCRETE_WALL = regWall(ChiseledBlockItemIds.PINK_CONCRETE_WALL, Blocks.CONCRETE.pink().properties());
    Block PINK_TERRACOTTA_STAIRS = regStairs(ChiseledBlockItemIds.PINK_TERRACOTTA_STAIRS, Blocks.DYED_TERRACOTTA.pink(), Blocks.DYED_TERRACOTTA.pink().properties());
    Block PINK_TERRACOTTA_SLAB = regSlab(ChiseledBlockItemIds.PINK_TERRACOTTA_SLAB, Blocks.DYED_TERRACOTTA.pink().properties());
    Block PINK_TERRACOTTA_WALL = regWall(ChiseledBlockItemIds.PINK_TERRACOTTA_WALL, Blocks.DYED_TERRACOTTA.pink().properties());
    Block PINK_TERRACOTTA_BRICKS = regSimpleBlock(ChiseledBlockItemIds.PINK_TERRACOTTA_BRICKS, Blocks.DYED_TERRACOTTA.pink().properties());
    Block PINK_TERRACOTTA_BRICK_STAIRS = regStairs(ChiseledBlockItemIds.PINK_TERRACOTTA_BRICK_STAIRS, PINK_TERRACOTTA_BRICKS, Blocks.DYED_TERRACOTTA.pink().properties());
    Block PINK_TERRACOTTA_BRICK_SLAB = regSlab(ChiseledBlockItemIds.PINK_TERRACOTTA_BRICK_SLAB, Blocks.DYED_TERRACOTTA.pink().properties());
    Block PINK_TERRACOTTA_BRICK_WALL = regWall(ChiseledBlockItemIds.PINK_TERRACOTTA_BRICK_WALL, Blocks.DYED_TERRACOTTA.pink().properties());

    static void init() {}
}
