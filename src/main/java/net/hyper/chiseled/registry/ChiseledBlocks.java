package net.hyper.chiseled.registry;

import net.hyper.chiseled.block.*;
import net.hyper.chiseled.refrence.ChiseledBlockItemIds;
import net.minecraft.references.BlockItemId;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;

import static net.hyper.silliestlib.utils.SilliestLibRegUtils.*;

public interface ChiseledBlocks {
    static Block regBasicBlock(final BlockItemId id, final BlockBehaviour.Properties blockProperties) {
        return regBlock(id, properties -> new Block(blockProperties.setId(id.block())));
    }
    static Block regBasicBlock(BlockItemId id, Block baseProperties) {
        return regBlock(id, properties -> new Block(BlockBehaviour.Properties.ofFullCopy(baseProperties).setId(id.block())));
    }
    static Block regBasicRotatedPillar(BlockItemId id, Block baseProperties) {
        return regBlock(id, properties -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(baseProperties).setId(id.block())));
    }
    static Block regBasicStairs(BlockItemId id, Block parentBlock, BlockBehaviour.Properties blockProperties) {
        return regBlock(id, properties -> new StairBlock(parentBlock.defaultBlockState(), blockProperties.setId(id.block())));
    }
    static Block regBasicStairs(BlockItemId id, Block parentBlock, Block baseProperties) {
        return regBlock(id, properties -> new StairBlock(parentBlock.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(baseProperties).setId(id.block())));
    }
    static Block regBasicSlab(BlockItemId id, BlockBehaviour.Properties blockProperties) {
        return regBlock(id, properties -> new SlabBlock(blockProperties.setId(id.block())));
    }
    static Block regBasicSlab(BlockItemId id, Block baseProperties) {
        return regBlock(id, properties -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(baseProperties).setId(id.block())));
    }
    static Block regBasicWall(BlockItemId id, BlockBehaviour.Properties blockProperties) {
        return regBlock(id, properties -> new WallBlock(blockProperties.setId(id.block())));
    }
    static Block regBasicWall(BlockItemId id, Block baseProperties) {
        return regBlock(id, properties -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(baseProperties).setId(id.block())));
    }
    static Block regBasicFence(BlockItemId id, Block baseProperties) {
        return regBlock(id, properties -> new FenceBlock(BlockBehaviour.Properties.ofFullCopy(baseProperties).setId(id.block())));
    }

    Block STONE_WALL = regBasicWall(ChiseledBlockItemIds.STONE_WALL, Blocks.STONE);
    Block POLISHED_STONE = regBasicBlock(ChiseledBlockItemIds.POLISHED_STONE, Blocks.STONE_BRICKS);
    Block POLISHED_STONE_STAIRS = regBasicStairs(ChiseledBlockItemIds.POLISHED_STONE_STAIRS, POLISHED_STONE, Blocks.STONE_BRICK_STAIRS);
    Block POLISHED_STONE_SLAB = regBasicSlab(ChiseledBlockItemIds.POLISHED_STONE_SLAB, Blocks.STONE_BRICK_SLAB);
    Block POLISHED_STONE_WALL = regBasicWall(ChiseledBlockItemIds.POLISHED_STONE_WALL, Blocks.STONE_BRICK_WALL);
    Block SMOOTH_STONE_STAIRS = regBasicStairs(ChiseledBlockItemIds.SMOOTH_STONE_STAIRS, Blocks.SMOOTH_STONE, Blocks.SMOOTH_STONE);
    Block CUT_STONE_BRICKS = regBasicBlock(ChiseledBlockItemIds.CUT_STONE_BRICKS, Blocks.STONE_BRICKS);
    Block CRACKED_CUT_STONE_BRICKS = regBasicBlock(ChiseledBlockItemIds.CRACKED_CUT_STONE_BRICKS, Blocks.STONE_BRICKS);
    Block CUT_STONE_BRICK_STAIRS = regBasicStairs(ChiseledBlockItemIds.CUT_STONE_BRICK_STAIRS, CUT_STONE_BRICKS, Blocks.STONE_BRICK_STAIRS);
    Block CUT_STONE_BRICK_SLAB = regBasicSlab(ChiseledBlockItemIds.CUT_STONE_BRICK_SLAB, Blocks.STONE_BRICK_SLAB);
    Block MOSSY_CUT_STONE_BRICKS = regBasicBlock(ChiseledBlockItemIds.MOSSY_CUT_STONE_BRICKS, Blocks.MOSSY_STONE_BRICKS);
    Block MOSSY_CUT_STONE_BRICK_STAIRS = regBasicStairs(ChiseledBlockItemIds.MOSSY_CUT_STONE_BRICK_STAIRS, MOSSY_CUT_STONE_BRICKS, Blocks.MOSSY_STONE_BRICK_STAIRS);
    Block MOSSY_CUT_STONE_BRICK_SLAB = regBasicSlab(ChiseledBlockItemIds.MOSSY_CUT_STONE_BRICK_SLAB, Blocks.MOSSY_STONE_BRICK_SLAB);
    Block STONE_TILES = regBasicBlock(ChiseledBlockItemIds.STONE_TILES, Blocks.STONE_BRICKS);
    Block CRACKED_STONE_TILES = regBasicBlock(ChiseledBlockItemIds.CRACKED_STONE_TILES, Blocks.STONE_BRICKS);
    Block STONE_TILE_STAIRS = regBasicStairs(ChiseledBlockItemIds.STONE_TILE_STAIRS, STONE_TILES, Blocks.STONE_BRICK_STAIRS);
    Block STONE_TILE_SLAB = regBasicSlab(ChiseledBlockItemIds.STONE_TILE_SLAB, Blocks.STONE_BRICK_SLAB);
    Block STONE_TILE_WALL = regBasicWall(ChiseledBlockItemIds.STONE_TILE_WALL, Blocks.STONE_BRICK_WALL);
    Block MOSSY_STONE_TILES = regBasicBlock(ChiseledBlockItemIds.MOSSY_STONE_TILES, Blocks.MOSSY_STONE_BRICKS);
    Block MOSSY_STONE_TILE_STAIRS = regBasicStairs(ChiseledBlockItemIds.MOSSY_STONE_TILE_STAIRS, MOSSY_STONE_TILES, Blocks.MOSSY_STONE_BRICK_STAIRS);
    Block MOSSY_STONE_TILE_SLAB = regBasicSlab(ChiseledBlockItemIds.MOSSY_STONE_TILE_SLAB, Blocks.MOSSY_STONE_BRICK_SLAB);
    Block MOSSY_STONE_TILE_WALL = regBasicWall(ChiseledBlockItemIds.MOSSY_STONE_TILE_WALL, Blocks.MOSSY_STONE_BRICK_WALL);

    Block POLISHED_GRANITE_WALL = regBasicWall(ChiseledBlockItemIds.POLISHED_GRANITE_WALL, Blocks.POLISHED_GRANITE);
    Block POLISHED_GRANITE_BRICKS = regBasicBlock(ChiseledBlockItemIds.POLISHED_GRANITE_BRICKS, Blocks.POLISHED_GRANITE);
    Block CRACKED_POLISHED_GRANITE_BRICKS = regBasicBlock(ChiseledBlockItemIds.CRACKED_POLISHED_GRANITE_BRICKS, Blocks.POLISHED_GRANITE);
    Block POLISHED_GRANITE_BRICK_STAIRS = regBasicStairs(ChiseledBlockItemIds.POLISHED_GRANITE_BRICK_STAIRS, POLISHED_GRANITE_BRICKS, Blocks.POLISHED_GRANITE_STAIRS);
    Block POLISHED_GRANITE_BRICK_SLAB = regBasicSlab(ChiseledBlockItemIds.POLISHED_GRANITE_BRICK_SLAB, Blocks.POLISHED_GRANITE_SLAB);
    Block POLISHED_GRANITE_BRICK_WALL = regBasicWall(ChiseledBlockItemIds.POLISHED_GRANITE_BRICK_WALL, POLISHED_GRANITE_WALL);
    Block POLISHED_GRANITE_PILLAR = regBasicRotatedPillar(ChiseledBlockItemIds.POLISHED_GRANITE_PILLAR, Blocks.POLISHED_GRANITE);
    Block CUT_POLISHED_GRANITE_BRICKS = regBasicBlock(ChiseledBlockItemIds.CUT_POLISHED_GRANITE_BRICKS, Blocks.POLISHED_GRANITE);
    Block CRACKED_CUT_POLISHED_GRANITE_BRICKS = regBasicBlock(ChiseledBlockItemIds.CRACKED_CUT_POLISHED_GRANITE_BRICKS, Blocks.POLISHED_GRANITE);
    Block CUT_POLISHED_GRANITE_BRICK_STAIRS = regBasicStairs(ChiseledBlockItemIds.CUT_POLISHED_GRANITE_BRICK_STAIRS, CUT_POLISHED_GRANITE_BRICKS, Blocks.POLISHED_GRANITE_STAIRS);
    Block CUT_POLISHED_GRANITE_BRICK_SLAB = regBasicSlab(ChiseledBlockItemIds.CUT_POLISHED_GRANITE_BRICK_SLAB, Blocks.POLISHED_GRANITE_SLAB);
    Block POLISHED_GRANITE_TILES = regBasicBlock(ChiseledBlockItemIds.POLISHED_GRANITE_TILES, Blocks.POLISHED_GRANITE);
    Block CRACKED_POLISHED_GRANITE_TILES = regBasicBlock(ChiseledBlockItemIds.CRACKED_POLISHED_GRANITE_TILES, Blocks.POLISHED_GRANITE);
    Block POLISHED_GRANITE_TILE_STAIRS = regBasicStairs(ChiseledBlockItemIds.POLISHED_GRANITE_TILE_STAIRS, POLISHED_GRANITE_TILES, Blocks.POLISHED_GRANITE_STAIRS);
    Block POLISHED_GRANITE_TILE_SLAB = regBasicSlab(ChiseledBlockItemIds.POLISHED_GRANITE_TILE_SLAB, Blocks.POLISHED_GRANITE_SLAB);
    Block POLISHED_GRANITE_TILE_WALL = regBasicWall(ChiseledBlockItemIds.POLISHED_GRANITE_TILE_WALL, POLISHED_GRANITE_WALL);

    Block POLISHED_DIORITE_WALL = regBasicWall(ChiseledBlockItemIds.POLISHED_DIORITE_WALL, Blocks.POLISHED_DIORITE);
    Block POLISHED_DIORITE_BRICKS = regBasicBlock(ChiseledBlockItemIds.POLISHED_DIORITE_BRICKS, Blocks.POLISHED_DIORITE);
    Block CRACKED_POLISHED_DIORITE_BRICKS = regBasicBlock(ChiseledBlockItemIds.CRACKED_POLISHED_DIORITE_BRICKS, Blocks.POLISHED_DIORITE);
    Block POLISHED_DIORITE_BRICK_STAIRS = regBasicStairs(ChiseledBlockItemIds.POLISHED_DIORITE_BRICK_STAIRS, POLISHED_DIORITE_BRICKS, Blocks.POLISHED_DIORITE_STAIRS);
    Block POLISHED_DIORITE_BRICK_SLAB = regBasicSlab(ChiseledBlockItemIds.POLISHED_DIORITE_BRICK_SLAB, Blocks.POLISHED_DIORITE_SLAB);
    Block POLISHED_DIORITE_BRICK_WALL = regBasicWall(ChiseledBlockItemIds.POLISHED_DIORITE_BRICK_WALL, POLISHED_DIORITE_WALL);
    Block POLISHED_DIORITE_PILLAR = regBasicRotatedPillar(ChiseledBlockItemIds.POLISHED_DIORITE_PILLAR, Blocks.POLISHED_DIORITE);
    Block CUT_POLISHED_DIORITE_BRICKS = regBasicBlock(ChiseledBlockItemIds.CUT_POLISHED_DIORITE_BRICKS, Blocks.POLISHED_DIORITE);
    Block CRACKED_CUT_POLISHED_DIORITE_BRICKS = regBasicBlock(ChiseledBlockItemIds.CRACKED_CUT_POLISHED_DIORITE_BRICKS, Blocks.POLISHED_DIORITE);
    Block CUT_POLISHED_DIORITE_BRICK_STAIRS = regBasicStairs(ChiseledBlockItemIds.CUT_POLISHED_DIORITE_BRICK_STAIRS, CUT_POLISHED_DIORITE_BRICKS, Blocks.POLISHED_DIORITE_STAIRS);
    Block CUT_POLISHED_DIORITE_BRICK_SLAB = regBasicSlab(ChiseledBlockItemIds.CUT_POLISHED_DIORITE_BRICK_SLAB, Blocks.POLISHED_DIORITE_SLAB);
    Block POLISHED_DIORITE_TILES = regBasicBlock(ChiseledBlockItemIds.POLISHED_DIORITE_TILES, Blocks.POLISHED_DIORITE);
    Block CRACKED_POLISHED_DIORITE_TILES = regBasicBlock(ChiseledBlockItemIds.CRACKED_POLISHED_DIORITE_TILES, Blocks.POLISHED_DIORITE);
    Block POLISHED_DIORITE_TILE_STAIRS = regBasicStairs(ChiseledBlockItemIds.POLISHED_DIORITE_TILE_STAIRS, POLISHED_DIORITE_TILES, Blocks.POLISHED_DIORITE_STAIRS);
    Block POLISHED_DIORITE_TILE_SLAB = regBasicSlab(ChiseledBlockItemIds.POLISHED_DIORITE_TILE_SLAB, Blocks.POLISHED_DIORITE_SLAB);
    Block POLISHED_DIORITE_TILE_WALL = regBasicWall(ChiseledBlockItemIds.POLISHED_DIORITE_TILE_WALL, POLISHED_DIORITE_WALL);

    Block POLISHED_ANDESITE_WALL = regBasicWall(ChiseledBlockItemIds.POLISHED_ANDESITE_WALL, Blocks.POLISHED_ANDESITE);
    Block POLISHED_ANDESITE_BRICKS = regBasicBlock(ChiseledBlockItemIds.POLISHED_ANDESITE_BRICKS, Blocks.POLISHED_ANDESITE);
    Block CRACKED_POLISHED_ANDESITE_BRICKS = regBasicBlock(ChiseledBlockItemIds.CRACKED_POLISHED_ANDESITE_BRICKS, Blocks.POLISHED_ANDESITE);
    Block POLISHED_ANDESITE_BRICK_STAIRS = regBasicStairs(ChiseledBlockItemIds.POLISHED_ANDESITE_BRICK_STAIRS, POLISHED_ANDESITE_BRICKS, Blocks.POLISHED_ANDESITE_STAIRS);
    Block POLISHED_ANDESITE_BRICK_SLAB = regBasicSlab(ChiseledBlockItemIds.POLISHED_ANDESITE_BRICK_SLAB, Blocks.POLISHED_ANDESITE_SLAB);
    Block POLISHED_ANDESITE_BRICK_WALL = regBasicWall(ChiseledBlockItemIds.POLISHED_ANDESITE_BRICK_WALL, POLISHED_ANDESITE_WALL);
    Block POLISHED_ANDESITE_PILLAR = regBasicRotatedPillar(ChiseledBlockItemIds.POLISHED_ANDESITE_PILLAR, Blocks.POLISHED_ANDESITE);
    Block CUT_POLISHED_ANDESITE_BRICKS = regBasicBlock(ChiseledBlockItemIds.CUT_POLISHED_ANDESITE_BRICKS, Blocks.POLISHED_ANDESITE);
    Block CRACKED_CUT_POLISHED_ANDESITE_BRICKS = regBasicBlock(ChiseledBlockItemIds.CRACKED_CUT_POLISHED_ANDESITE_BRICKS, Blocks.POLISHED_ANDESITE);
    Block CUT_POLISHED_ANDESITE_BRICK_STAIRS = regBasicStairs(ChiseledBlockItemIds.CUT_POLISHED_ANDESITE_BRICK_STAIRS, CUT_POLISHED_ANDESITE_BRICKS, Blocks.POLISHED_ANDESITE_STAIRS);
    Block CUT_POLISHED_ANDESITE_BRICK_SLAB = regBasicSlab(ChiseledBlockItemIds.CUT_POLISHED_ANDESITE_BRICK_SLAB, Blocks.POLISHED_ANDESITE_SLAB);
    Block POLISHED_ANDESITE_TILES = regBasicBlock(ChiseledBlockItemIds.POLISHED_ANDESITE_TILES, Blocks.POLISHED_ANDESITE);
    Block CRACKED_POLISHED_ANDESITE_TILES = regBasicBlock(ChiseledBlockItemIds.CRACKED_POLISHED_ANDESITE_TILES, Blocks.POLISHED_ANDESITE);
    Block POLISHED_ANDESITE_TILE_STAIRS = regBasicStairs(ChiseledBlockItemIds.POLISHED_ANDESITE_TILE_STAIRS, POLISHED_ANDESITE_TILES, Blocks.POLISHED_ANDESITE_STAIRS);
    Block POLISHED_ANDESITE_TILE_SLAB = regBasicSlab(ChiseledBlockItemIds.POLISHED_ANDESITE_TILE_SLAB, Blocks.POLISHED_ANDESITE_SLAB);
    Block POLISHED_ANDESITE_TILE_WALL = regBasicWall(ChiseledBlockItemIds.POLISHED_ANDESITE_TILE_WALL, POLISHED_ANDESITE_WALL);

    Block CUT_DEEPSLATE_BRICKS = regBasicBlock(ChiseledBlockItemIds.CUT_DEEPSLATE_BRICKS, Blocks.DEEPSLATE_BRICKS);
    Block CRACKED_CUT_DEEPSLATE_BRICKS = regBasicBlock(ChiseledBlockItemIds.CRACKED_CUT_DEEPSLATE_BRICKS, Blocks.DEEPSLATE_BRICKS);
    Block CUT_DEEPSLATE_BRICK_STAIRS = regBasicStairs(ChiseledBlockItemIds.CUT_DEEPSLATE_BRICK_STAIRS, CUT_DEEPSLATE_BRICKS, Blocks.DEEPSLATE_BRICK_STAIRS);
    Block CUT_DEEPSLATE_BRICK_SLAB = regBasicSlab(ChiseledBlockItemIds.CUT_DEEPSLATE_BRICK_SLAB, Blocks.DEEPSLATE_BRICK_SLAB);

    Block CALCITE_STAIRS = regBasicStairs(ChiseledBlockItemIds.CALCITE_STAIRS, Blocks.CALCITE, Blocks.CALCITE);
    Block CALCITE_SLAB = regBasicSlab(ChiseledBlockItemIds.CALCITE_SLAB, BlockBehaviour.Properties.ofFullCopy(Blocks.CALCITE).strength(1.25F));
    Block CALCITE_WALL = regBasicWall(ChiseledBlockItemIds.CALCITE_WALL, Blocks.CALCITE);
    Block POLISHED_CALCITE = regBasicBlock(ChiseledBlockItemIds.POLISHED_CALCITE, BlockBehaviour.Properties.ofFullCopy(Blocks.CALCITE).strength(1.5F, 4.0F));
    Block POLISHED_CALCITE_STAIRS = regBasicStairs(ChiseledBlockItemIds.POLISHED_CALCITE_STAIRS, POLISHED_CALCITE, BlockBehaviour.Properties.ofFullCopy(Blocks.CALCITE).strength(1.5F, 4.0F));
    Block POLISHED_CALCITE_SLAB = regBasicSlab(ChiseledBlockItemIds.POLISHED_CALCITE_SLAB, BlockBehaviour.Properties.ofFullCopy(Blocks.CALCITE).strength(2.0F, 4.0F));
    Block POLISHED_CALCITE_WALL = regBasicWall(ChiseledBlockItemIds.POLISHED_CALCITE_WALL, BlockBehaviour.Properties.ofFullCopy(Blocks.CALCITE).strength(1.5F, 4.0F));
    Block CALCITE_BRICKS = regBasicBlock(ChiseledBlockItemIds.CALCITE_BRICKS, POLISHED_CALCITE);
    Block CALCITE_BRICK_STAIRS = regBasicStairs(ChiseledBlockItemIds.CALCITE_BRICK_STAIRS, CALCITE_BRICKS, POLISHED_CALCITE_STAIRS);
    Block CALCITE_BRICK_SLAB = regBasicSlab(ChiseledBlockItemIds.CALCITE_BRICK_SLAB, POLISHED_CALCITE_SLAB);
    Block CALCITE_BRICK_WALL = regBasicWall(ChiseledBlockItemIds.CALCITE_BRICK_WALL, POLISHED_CALCITE_WALL);
    Block CUT_CALCITE_BRICKS = regBasicBlock(ChiseledBlockItemIds.CUT_CALCITE_BRICKS, POLISHED_CALCITE);
    Block CUT_CALCITE_BRICK_STAIRS = regBasicStairs(ChiseledBlockItemIds.CUT_CALCITE_BRICK_STAIRS, CALCITE_BRICKS, POLISHED_CALCITE_STAIRS);
    Block CUT_CALCITE_BRICK_SLAB = regBasicSlab(ChiseledBlockItemIds.CUT_CALCITE_BRICK_SLAB, POLISHED_CALCITE_SLAB);
    Block CALCITE_TILES = regBasicBlock(ChiseledBlockItemIds.CALCITE_TILES, POLISHED_CALCITE);
    Block CALCITE_TILE_STAIRS = regBasicStairs(ChiseledBlockItemIds.CALCITE_TILE_STAIRS, CALCITE_BRICKS, POLISHED_CALCITE_STAIRS);
    Block CALCITE_TILE_SLAB = regBasicSlab(ChiseledBlockItemIds.CALCITE_TILE_SLAB, POLISHED_CALCITE_SLAB);
    Block CALCITE_TILE_WALL = regBasicWall(ChiseledBlockItemIds.CALCITE_TILE_WALL, POLISHED_CALCITE_WALL);

    Block DRIPSTONE_STAIRS = regBasicStairs(ChiseledBlockItemIds.DRIPSTONE_STAIRS, Blocks.DRIPSTONE_BLOCK, Blocks.DRIPSTONE_BLOCK);
    Block DRIPSTONE_SLAB = regBasicSlab(ChiseledBlockItemIds.DRIPSTONE_SLAB, BlockBehaviour.Properties.ofFullCopy(Blocks.DRIPSTONE_BLOCK).strength(2.0F, 1.0F));
    Block DRIPSTONE_WALL = regBasicWall(ChiseledBlockItemIds.DRIPSTONE_WALL, Blocks.DRIPSTONE_BLOCK);
    Block POLISHED_DRIPSTONE = regBasicBlock(ChiseledBlockItemIds.POLISHED_DRIPSTONE, BlockBehaviour.Properties.ofFullCopy(Blocks.DRIPSTONE_BLOCK).strength(1.5F, 4.0F));
    Block POLISHED_DRIPSTONE_STAIRS = regBasicStairs(ChiseledBlockItemIds.POLISHED_DRIPSTONE_STAIRS, POLISHED_DRIPSTONE, BlockBehaviour.Properties.ofFullCopy(Blocks.DRIPSTONE_BLOCK).strength(1.5F, 4.0F));
    Block POLISHED_DRIPSTONE_SLAB = regBasicSlab(ChiseledBlockItemIds.POLISHED_DRIPSTONE_SLAB, BlockBehaviour.Properties.ofFullCopy(Blocks.DRIPSTONE_BLOCK).strength(2.0F, 4.0F));
    Block POLISHED_DRIPSTONE_WALL = regBasicWall(ChiseledBlockItemIds.POLISHED_DRIPSTONE_WALL, BlockBehaviour.Properties.ofFullCopy(Blocks.DRIPSTONE_BLOCK).strength(1.5F, 4.0F));
    Block DRIPSTONE_BRICKS = regBasicBlock(ChiseledBlockItemIds.DRIPSTONE_BRICKS, POLISHED_DRIPSTONE);
    Block DRIPSTONE_BRICK_STAIRS = regBasicStairs(ChiseledBlockItemIds.DRIPSTONE_BRICK_STAIRS, DRIPSTONE_BRICKS, POLISHED_DRIPSTONE_STAIRS);
    Block DRIPSTONE_BRICK_SLAB = regBasicSlab(ChiseledBlockItemIds.DRIPSTONE_BRICK_SLAB, POLISHED_DRIPSTONE_SLAB);
    Block DRIPSTONE_BRICK_WALL = regBasicWall(ChiseledBlockItemIds.DRIPSTONE_BRICK_WALL, POLISHED_DRIPSTONE_WALL);
    Block CUT_DRIPSTONE_BRICKS = regBasicBlock(ChiseledBlockItemIds.CUT_DRIPSTONE_BRICKS, POLISHED_DRIPSTONE);
    Block CUT_DRIPSTONE_BRICK_STAIRS = regBasicStairs(ChiseledBlockItemIds.CUT_DRIPSTONE_BRICK_STAIRS, DRIPSTONE_BRICKS, POLISHED_DRIPSTONE_STAIRS);
    Block CUT_DRIPSTONE_BRICK_SLAB = regBasicSlab(ChiseledBlockItemIds.CUT_DRIPSTONE_BRICK_SLAB, POLISHED_DRIPSTONE_SLAB);
    Block DRIPSTONE_TILES = regBasicBlock(ChiseledBlockItemIds.DRIPSTONE_TILES, POLISHED_DRIPSTONE);
    Block DRIPSTONE_TILE_STAIRS = regBasicStairs(ChiseledBlockItemIds.DRIPSTONE_TILE_STAIRS, DRIPSTONE_BRICKS, POLISHED_DRIPSTONE_STAIRS);
    Block DRIPSTONE_TILE_SLAB = regBasicSlab(ChiseledBlockItemIds.DRIPSTONE_TILE_SLAB, POLISHED_DRIPSTONE_SLAB);
    Block DRIPSTONE_TILE_WALL = regBasicWall(ChiseledBlockItemIds.DRIPSTONE_TILE_WALL, POLISHED_DRIPSTONE_WALL);

    Block MIXED_BRICKS = regBasicBlock(ChiseledBlockItemIds.MIXED_BRICKS, Blocks.BRICKS);
    Block MIXED_BRICK_STAIRS = regBasicStairs(ChiseledBlockItemIds.MIXED_BRICK_STAIRS, Blocks.BRICKS, Blocks.BRICK_STAIRS);
    Block MIXED_BRICK_SLAB = regBasicSlab(ChiseledBlockItemIds.MIXED_BRICK_SLAB, Blocks.BRICK_SLAB);
    Block MIXED_BRICK_WALL = regBasicWall(ChiseledBlockItemIds.MIXED_BRICK_WALL, Blocks.BRICK_WALL);
    Block MOSSY_BRICKS = regBasicBlock(ChiseledBlockItemIds.MOSSY_BRICKS, Blocks.BRICKS);
    Block MOSSY_BRICK_STAIRS = regBasicStairs(ChiseledBlockItemIds.MOSSY_BRICK_STAIRS, Blocks.BRICKS, Blocks.BRICK_STAIRS);
    Block MOSSY_BRICK_SLAB = regBasicSlab(ChiseledBlockItemIds.MOSSY_BRICK_SLAB, Blocks.BRICK_SLAB);
    Block MOSSY_BRICK_WALL = regBasicWall(ChiseledBlockItemIds.MOSSY_BRICK_WALL, Blocks.BRICK_WALL);

    Block PACKED_MUD_STAIRS = regBasicStairs(ChiseledBlockItemIds.PACKED_MUD_STAIRS, Blocks.PACKED_MUD, Blocks.PACKED_MUD);
    Block PACKED_MUD_SLAB = regBasicSlab(ChiseledBlockItemIds.PACKED_MUD_SLAB, Blocks.PACKED_MUD);
    Block PACKED_MUD_WALL = regBasicWall(ChiseledBlockItemIds.PACKED_MUD_WALL, Blocks.PACKED_MUD);
    Block POLISHED_MUD = regBasicBlock(ChiseledBlockItemIds.POLISHED_MUD, Blocks.MUD_BRICKS);
    Block POLISHED_MUD_STAIRS = regBasicStairs(ChiseledBlockItemIds.POLISHED_MUD_STAIRS, POLISHED_MUD, Blocks.MUD_BRICK_STAIRS);
    Block POLISHED_MUD_SLAB = regBasicSlab(ChiseledBlockItemIds.POLISHED_MUD_SLAB, Blocks.MUD_BRICK_SLAB);
    Block POLISHED_MUD_WALL = regBasicWall(ChiseledBlockItemIds.POLISHED_MUD_WALL, Blocks.MUD_BRICK_WALL);
    Block MOSSY_MUD_BRICKS = regBasicBlock(ChiseledBlockItemIds.MOSSY_MUD_BRICKS, Blocks.MUD_BRICKS);
    Block MOSSY_MUD_BRICK_STAIRS = regBasicStairs(ChiseledBlockItemIds.MOSSY_MUD_BRICK_STAIRS, MOSSY_MUD_BRICKS, Blocks.MUD_BRICK_STAIRS);
    Block MOSSY_MUD_BRICK_SLAB = regBasicSlab(ChiseledBlockItemIds.MOSSY_MUD_BRICK_SLAB, Blocks.MUD_BRICK_SLAB);
    Block MOSSY_MUD_BRICK_WALL = regBasicWall(ChiseledBlockItemIds.MOSSY_MUD_BRICK_WALL, Blocks.MUD_BRICK_WALL);
    Block CUT_MUD_BRICKS = regBasicBlock(ChiseledBlockItemIds.CUT_MUD_BRICKS, Blocks.MUD_BRICKS);
    Block CUT_MUD_BRICK_STAIRS = regBasicStairs(ChiseledBlockItemIds.CUT_MUD_BRICK_STAIRS, CUT_MUD_BRICKS, Blocks.MUD_BRICK_STAIRS);
    Block CUT_MUD_BRICK_SLAB = regBasicSlab(ChiseledBlockItemIds.CUT_MUD_BRICK_SLAB, Blocks.MUD_BRICK_SLAB);
    Block MOSSY_CUT_MUD_BRICKS = regBasicBlock(ChiseledBlockItemIds.MOSSY_CUT_MUD_BRICKS, Blocks.MUD_BRICKS);
    Block MOSSY_CUT_MUD_BRICK_STAIRS = regBasicStairs(ChiseledBlockItemIds.MOSSY_CUT_MUD_BRICK_STAIRS, MOSSY_CUT_MUD_BRICKS, Blocks.MUD_BRICK_STAIRS);
    Block MOSSY_CUT_MUD_BRICK_SLAB = regBasicSlab(ChiseledBlockItemIds.MOSSY_CUT_MUD_BRICK_SLAB, Blocks.MUD_BRICK_SLAB);
    Block MUD_TILES = regBasicBlock(ChiseledBlockItemIds.MUD_TILES, Blocks.MUD_BRICKS);
    Block MUD_TILE_STAIRS = regBasicStairs(ChiseledBlockItemIds.MUD_TILE_STAIRS, MUD_TILES, Blocks.MUD_BRICK_STAIRS);
    Block MUD_TILE_SLAB = regBasicSlab(ChiseledBlockItemIds.MUD_TILE_SLAB, Blocks.MUD_BRICK_SLAB);
    Block MUD_TILE_WALL = regBasicWall(ChiseledBlockItemIds.MUD_TILE_WALL, Blocks.MUD_BRICK_WALL);
    Block MOSSY_MUD_TILES = regBasicBlock(ChiseledBlockItemIds.MOSSY_MUD_TILES, Blocks.MUD_BRICKS);
    Block MOSSY_MUD_TILE_STAIRS = regBasicStairs(ChiseledBlockItemIds.MOSSY_MUD_TILE_STAIRS, MOSSY_MUD_TILES, Blocks.MUD_BRICK_STAIRS);
    Block MOSSY_MUD_TILE_SLAB = regBasicSlab(ChiseledBlockItemIds.MOSSY_MUD_TILE_SLAB, Blocks.MUD_BRICK_SLAB);
    Block MOSSY_MUD_TILE_WALL = regBasicWall(ChiseledBlockItemIds.MOSSY_MUD_TILE_WALL, Blocks.MUD_BRICK_WALL);

    Block SMOOTH_SANDSTONE_WALL = regBasicWall(ChiseledBlockItemIds.SMOOTH_SANDSTONE_WALL, Blocks.SMOOTH_SANDSTONE);
    Block SANDSTONE_BRICKS = regBasicBlock(ChiseledBlockItemIds.SANDSTONE_BRICKS, Blocks.SMOOTH_SANDSTONE);
    Block SANDSTONE_BRICK_STAIRS = regBasicStairs(ChiseledBlockItemIds.SANDSTONE_BRICK_STAIRS, SANDSTONE_BRICKS, Blocks.SMOOTH_SANDSTONE_STAIRS);
    Block SANDSTONE_BRICK_SLAB = regBasicSlab(ChiseledBlockItemIds.SANDSTONE_BRICK_SLAB, Blocks.SMOOTH_SANDSTONE_SLAB);
    Block SANDSTONE_BRICK_WALL = regBasicWall(ChiseledBlockItemIds.SANDSTONE_BRICK_WALL, SMOOTH_SANDSTONE_WALL);
    Block CUT_SANDSTONE_BRICKS = regBasicBlock(ChiseledBlockItemIds.CUT_SANDSTONE_BRICKS, Blocks.SMOOTH_SANDSTONE);
    Block CUT_SANDSTONE_BRICK_STAIRS = regBasicStairs(ChiseledBlockItemIds.CUT_SANDSTONE_BRICK_STAIRS, CUT_SANDSTONE_BRICKS, Blocks.SMOOTH_SANDSTONE_STAIRS);
    Block CUT_SANDSTONE_BRICK_SLAB = regBasicSlab(ChiseledBlockItemIds.CUT_SANDSTONE_BRICK_SLAB, Blocks.SMOOTH_SANDSTONE_SLAB);
    Block SANDSTONE_TILES = regBasicBlock(ChiseledBlockItemIds.SANDSTONE_TILES, Blocks.SMOOTH_SANDSTONE);
    Block SANDSTONE_TILE_STAIRS = regBasicStairs(ChiseledBlockItemIds.SANDSTONE_TILE_STAIRS, SANDSTONE_TILES, Blocks.SMOOTH_SANDSTONE_STAIRS);
    Block SANDSTONE_TILE_SLAB = regBasicSlab(ChiseledBlockItemIds.SANDSTONE_TILE_SLAB, Blocks.SMOOTH_SANDSTONE_SLAB);
    Block SANDSTONE_TILE_WALL = regBasicWall(ChiseledBlockItemIds.SANDSTONE_TILE_WALL, SMOOTH_SANDSTONE_WALL);

    Block SMOOTH_RED_SANDSTONE_WALL = regBasicWall(ChiseledBlockItemIds.SMOOTH_RED_SANDSTONE_WALL, Blocks.SMOOTH_RED_SANDSTONE);
    Block RED_SANDSTONE_BRICKS = regBasicBlock(ChiseledBlockItemIds.RED_SANDSTONE_BRICKS, Blocks.SMOOTH_RED_SANDSTONE);
    Block RED_SANDSTONE_BRICK_STAIRS = regBasicStairs(ChiseledBlockItemIds.RED_SANDSTONE_BRICK_STAIRS, RED_SANDSTONE_BRICKS, Blocks.SMOOTH_RED_SANDSTONE_STAIRS);
    Block RED_SANDSTONE_BRICK_SLAB = regBasicSlab(ChiseledBlockItemIds.RED_SANDSTONE_BRICK_SLAB, Blocks.SMOOTH_RED_SANDSTONE_SLAB);
    Block RED_SANDSTONE_BRICK_WALL = regBasicWall(ChiseledBlockItemIds.RED_SANDSTONE_BRICK_WALL, SMOOTH_RED_SANDSTONE_WALL);
    Block CUT_RED_SANDSTONE_BRICKS = regBasicBlock(ChiseledBlockItemIds.CUT_RED_SANDSTONE_BRICKS, Blocks.SMOOTH_RED_SANDSTONE);
    Block CUT_RED_SANDSTONE_BRICK_STAIRS = regBasicStairs(ChiseledBlockItemIds.CUT_RED_SANDSTONE_BRICK_STAIRS, CUT_RED_SANDSTONE_BRICKS, Blocks.SMOOTH_RED_SANDSTONE_STAIRS);
    Block CUT_RED_SANDSTONE_BRICK_SLAB = regBasicSlab(ChiseledBlockItemIds.CUT_RED_SANDSTONE_BRICK_SLAB, Blocks.SMOOTH_RED_SANDSTONE_SLAB);
    Block RED_SANDSTONE_TILES = regBasicBlock(ChiseledBlockItemIds.RED_SANDSTONE_TILES, Blocks.SMOOTH_RED_SANDSTONE);
    Block RED_SANDSTONE_TILE_STAIRS = regBasicStairs(ChiseledBlockItemIds.RED_SANDSTONE_TILE_STAIRS, RED_SANDSTONE_TILES, Blocks.SMOOTH_RED_SANDSTONE_STAIRS);
    Block RED_SANDSTONE_TILE_SLAB = regBasicSlab(ChiseledBlockItemIds.RED_SANDSTONE_TILE_SLAB, Blocks.SMOOTH_RED_SANDSTONE_SLAB);
    Block RED_SANDSTONE_TILE_WALL = regBasicWall(ChiseledBlockItemIds.RED_SANDSTONE_TILE_WALL, SMOOTH_RED_SANDSTONE_WALL);

    Block CUT_CINNABAR_BRICKS = regBasicBlock(ChiseledBlockItemIds.CUT_CINNABAR_BRICKS, Blocks.CINNABAR_BRICKS);
    Block CUT_CINNABAR_BRICK_STAIRS = regBasicStairs(ChiseledBlockItemIds.CUT_CINNABAR_BRICK_STAIRS, CUT_CINNABAR_BRICKS, Blocks.CINNABAR_BRICK_STAIRS);
    Block CUT_CINNABAR_BRICK_SLAB = regBasicSlab(ChiseledBlockItemIds.CUT_CINNABAR_BRICK_SLAB, Blocks.CINNABAR_BRICK_SLAB);
    Block CINNABAR_TILES = regBasicBlock(ChiseledBlockItemIds.CINNABAR_TILES, Blocks.CINNABAR_BRICKS);
    Block CINNABAR_TILE_STAIRS = regBasicStairs(ChiseledBlockItemIds.CINNABAR_TILE_STAIRS, CINNABAR_TILES, Blocks.CINNABAR_BRICK_STAIRS);
    Block CINNABAR_TILE_SLAB = regBasicSlab(ChiseledBlockItemIds.CINNABAR_TILE_SLAB, Blocks.CINNABAR_BRICK_SLAB);
    Block CINNABAR_TILE_WALL = regBasicWall(ChiseledBlockItemIds.CINNABAR_TILE_WALL, Blocks.CINNABAR_BRICK_WALL);

    Block CUT_SULFUR_BRICKS = regBasicBlock(ChiseledBlockItemIds.CUT_SULFUR_BRICKS, Blocks.SULFUR_BRICKS);
    Block CUT_SULFUR_BRICK_STAIRS = regBasicStairs(ChiseledBlockItemIds.CUT_SULFUR_BRICK_STAIRS, CUT_SULFUR_BRICKS, Blocks.SULFUR_BRICK_STAIRS);
    Block CUT_SULFUR_BRICK_SLAB = regBasicSlab(ChiseledBlockItemIds.CUT_SULFUR_BRICK_SLAB, Blocks.SULFUR_BRICK_SLAB);
    Block SULFUR_TILES = regBasicBlock(ChiseledBlockItemIds.SULFUR_TILES, Blocks.SULFUR_BRICKS);
    Block SULFUR_TILE_STAIRS = regBasicStairs(ChiseledBlockItemIds.SULFUR_TILE_STAIRS, SULFUR_TILES, Blocks.SULFUR_BRICK_STAIRS);
    Block SULFUR_TILE_SLAB = regBasicSlab(ChiseledBlockItemIds.SULFUR_TILE_SLAB, Blocks.SULFUR_BRICK_SLAB);
    Block SULFUR_TILE_WALL = regBasicWall(ChiseledBlockItemIds.SULFUR_TILE_WALL, Blocks.SULFUR_BRICK_WALL);

    Block PRISMARINE_BRICK_WALL = regBasicWall(ChiseledBlockItemIds.PRISMARINE_BRICK_WALL, Blocks.PRISMARINE_BRICKS);
    Block CUT_PRISMARINE_BRICKS = regBasicBlock(ChiseledBlockItemIds.CUT_PRISMARINE_BRICKS, Blocks.PRISMARINE_BRICKS);
    Block CUT_PRISMARINE_BRICK_STAIRS = regBasicStairs(ChiseledBlockItemIds.CUT_PRISMARINE_BRICK_STAIRS, CUT_PRISMARINE_BRICKS, Blocks.PRISMARINE_BRICK_STAIRS);
    Block CUT_PRISMARINE_BRICK_SLAB = regBasicSlab(ChiseledBlockItemIds.CUT_PRISMARINE_BRICK_SLAB, Blocks.PRISMARINE_BRICK_SLAB);

    Block DARK_PRISMARINE_WALL = regBasicWall(ChiseledBlockItemIds.DARK_PRISMARINE_WALL, Blocks.DARK_PRISMARINE);
    Block DARK_PRISMARINE_BRICKS = regBasicBlock(ChiseledBlockItemIds.DARK_PRISMARINE_BRICKS, Blocks.DARK_PRISMARINE);
    Block DARK_PRISMARINE_BRICK_STAIRS = regBasicStairs(ChiseledBlockItemIds.DARK_PRISMARINE_BRICK_STAIRS, DARK_PRISMARINE_BRICKS, Blocks.DARK_PRISMARINE_STAIRS);
    Block DARK_PRISMARINE_BRICK_SLAB = regBasicSlab(ChiseledBlockItemIds.DARK_PRISMARINE_BRICK_SLAB, Blocks.DARK_PRISMARINE_SLAB);
    Block DARK_PRISMARINE_BRICK_WALL = regBasicWall(ChiseledBlockItemIds.DARK_PRISMARINE_BRICK_WALL, DARK_PRISMARINE_WALL);
    Block CUT_DARK_PRISMARINE_BRICKS = regBasicBlock(ChiseledBlockItemIds.CUT_DARK_PRISMARINE_BRICKS, Blocks.DARK_PRISMARINE);
    Block CUT_DARK_PRISMARINE_BRICK_STAIRS = regBasicStairs(ChiseledBlockItemIds.CUT_DARK_PRISMARINE_BRICK_STAIRS, CUT_DARK_PRISMARINE_BRICKS, Blocks.DARK_PRISMARINE_STAIRS);
    Block CUT_DARK_PRISMARINE_BRICK_SLAB = regBasicSlab(ChiseledBlockItemIds.CUT_DARK_PRISMARINE_BRICK_SLAB, Blocks.DARK_PRISMARINE_SLAB);

    Block TERRACOTTA_BRICKS = regBasicBlock(ChiseledBlockItemIds.TERRACOTTA_BRICKS, Blocks.TERRACOTTA);
    Block TERRACOTTA_BRICK_STAIRS = regBasicStairs(ChiseledBlockItemIds.TERRACOTTA_BRICK_STAIRS, TERRACOTTA_BRICKS, Blocks.TERRACOTTA);
    Block TERRACOTTA_BRICK_SLAB = regBasicSlab(ChiseledBlockItemIds.TERRACOTTA_BRICK_SLAB, BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA).strength(1.75F, 4.2F));
    Block TERRACOTTA_BRICK_WALL = regBasicWall(ChiseledBlockItemIds.TERRACOTTA_BRICK_WALL, Blocks.TERRACOTTA);
    Block WHITE_TERRACOTTA_BRICKS = regBasicBlock(ChiseledBlockItemIds.WHITE_TERRACOTTA_BRICKS, Blocks.DYED_TERRACOTTA.white());
    Block WHITE_TERRACOTTA_BRICK_STAIRS = regBasicStairs(ChiseledBlockItemIds.WHITE_TERRACOTTA_BRICK_STAIRS, TERRACOTTA_BRICKS, Blocks.DYED_TERRACOTTA.white());
    Block WHITE_TERRACOTTA_BRICK_SLAB = regBasicSlab(ChiseledBlockItemIds.WHITE_TERRACOTTA_BRICK_SLAB, BlockBehaviour.Properties.ofFullCopy(Blocks.DYED_TERRACOTTA.white()).strength(1.75F, 4.2F));
    Block WHITE_TERRACOTTA_BRICK_WALL = regBasicWall(ChiseledBlockItemIds.WHITE_TERRACOTTA_BRICK_WALL, Blocks.DYED_TERRACOTTA.white());
    Block LIGHT_GRAY_TERRACOTTA_BRICKS = regBasicBlock(ChiseledBlockItemIds.LIGHT_GRAY_TERRACOTTA_BRICKS, Blocks.DYED_TERRACOTTA.lightGray());
    Block LIGHT_GRAY_TERRACOTTA_BRICK_STAIRS = regBasicStairs(ChiseledBlockItemIds.LIGHT_GRAY_TERRACOTTA_BRICK_STAIRS, TERRACOTTA_BRICKS, Blocks.DYED_TERRACOTTA.lightGray());
    Block LIGHT_GRAY_TERRACOTTA_BRICK_SLAB = regBasicSlab(ChiseledBlockItemIds.LIGHT_GRAY_TERRACOTTA_BRICK_SLAB, BlockBehaviour.Properties.ofFullCopy(Blocks.DYED_TERRACOTTA.lightGray()).strength(1.75F, 4.2F));
    Block LIGHT_GRAY_TERRACOTTA_BRICK_WALL = regBasicWall(ChiseledBlockItemIds.LIGHT_GRAY_TERRACOTTA_BRICK_WALL, Blocks.DYED_TERRACOTTA.lightGray());
    Block GRAY_TERRACOTTA_BRICKS = regBasicBlock(ChiseledBlockItemIds.GRAY_TERRACOTTA_BRICKS, Blocks.DYED_TERRACOTTA.gray());
    Block GRAY_TERRACOTTA_BRICK_STAIRS = regBasicStairs(ChiseledBlockItemIds.GRAY_TERRACOTTA_BRICK_STAIRS, TERRACOTTA_BRICKS, Blocks.DYED_TERRACOTTA.gray());
    Block GRAY_TERRACOTTA_BRICK_SLAB = regBasicSlab(ChiseledBlockItemIds.GRAY_TERRACOTTA_BRICK_SLAB, BlockBehaviour.Properties.ofFullCopy(Blocks.DYED_TERRACOTTA.gray()).strength(1.75F, 4.2F));
    Block GRAY_TERRACOTTA_BRICK_WALL = regBasicWall(ChiseledBlockItemIds.GRAY_TERRACOTTA_BRICK_WALL, Blocks.DYED_TERRACOTTA.gray());
    Block BLACK_TERRACOTTA_BRICKS = regBasicBlock(ChiseledBlockItemIds.BLACK_TERRACOTTA_BRICKS, Blocks.DYED_TERRACOTTA.black());
    Block BLACK_TERRACOTTA_BRICK_STAIRS = regBasicStairs(ChiseledBlockItemIds.BLACK_TERRACOTTA_BRICK_STAIRS, TERRACOTTA_BRICKS, Blocks.DYED_TERRACOTTA.black());
    Block BLACK_TERRACOTTA_BRICK_SLAB = regBasicSlab(ChiseledBlockItemIds.BLACK_TERRACOTTA_BRICK_SLAB, BlockBehaviour.Properties.ofFullCopy(Blocks.DYED_TERRACOTTA.black()).strength(1.75F, 4.2F));
    Block BLACK_TERRACOTTA_BRICK_WALL = regBasicWall(ChiseledBlockItemIds.BLACK_TERRACOTTA_BRICK_WALL, Blocks.DYED_TERRACOTTA.black());
    Block BROWN_TERRACOTTA_BRICKS = regBasicBlock(ChiseledBlockItemIds.BROWN_TERRACOTTA_BRICKS, Blocks.DYED_TERRACOTTA.brown());
    Block BROWN_TERRACOTTA_BRICK_STAIRS = regBasicStairs(ChiseledBlockItemIds.BROWN_TERRACOTTA_BRICK_STAIRS, TERRACOTTA_BRICKS, Blocks.DYED_TERRACOTTA.brown());
    Block BROWN_TERRACOTTA_BRICK_SLAB = regBasicSlab(ChiseledBlockItemIds.BROWN_TERRACOTTA_BRICK_SLAB, BlockBehaviour.Properties.ofFullCopy(Blocks.DYED_TERRACOTTA.brown()).strength(1.75F, 4.2F));
    Block BROWN_TERRACOTTA_BRICK_WALL = regBasicWall(ChiseledBlockItemIds.BROWN_TERRACOTTA_BRICK_WALL, Blocks.DYED_TERRACOTTA.brown());
    Block RED_TERRACOTTA_BRICKS = regBasicBlock(ChiseledBlockItemIds.RED_TERRACOTTA_BRICKS, Blocks.DYED_TERRACOTTA.red());
    Block RED_TERRACOTTA_BRICK_STAIRS = regBasicStairs(ChiseledBlockItemIds.RED_TERRACOTTA_BRICK_STAIRS, TERRACOTTA_BRICKS, Blocks.DYED_TERRACOTTA.red());
    Block RED_TERRACOTTA_BRICK_SLAB = regBasicSlab(ChiseledBlockItemIds.RED_TERRACOTTA_BRICK_SLAB, BlockBehaviour.Properties.ofFullCopy(Blocks.DYED_TERRACOTTA.red()).strength(1.75F, 4.2F));
    Block RED_TERRACOTTA_BRICK_WALL = regBasicWall(ChiseledBlockItemIds.RED_TERRACOTTA_BRICK_WALL, Blocks.DYED_TERRACOTTA.red());
    Block ORANGE_TERRACOTTA_BRICKS = regBasicBlock(ChiseledBlockItemIds.ORANGE_TERRACOTTA_BRICKS, Blocks.DYED_TERRACOTTA.orange());
    Block ORANGE_TERRACOTTA_BRICK_STAIRS = regBasicStairs(ChiseledBlockItemIds.ORANGE_TERRACOTTA_BRICK_STAIRS, TERRACOTTA_BRICKS, Blocks.DYED_TERRACOTTA.orange());
    Block ORANGE_TERRACOTTA_BRICK_SLAB = regBasicSlab(ChiseledBlockItemIds.ORANGE_TERRACOTTA_BRICK_SLAB, BlockBehaviour.Properties.ofFullCopy(Blocks.DYED_TERRACOTTA.orange()).strength(1.75F, 4.2F));
    Block ORANGE_TERRACOTTA_BRICK_WALL = regBasicWall(ChiseledBlockItemIds.ORANGE_TERRACOTTA_BRICK_WALL, Blocks.DYED_TERRACOTTA.orange());
    Block YELLOW_TERRACOTTA_BRICKS = regBasicBlock(ChiseledBlockItemIds.YELLOW_TERRACOTTA_BRICKS, Blocks.DYED_TERRACOTTA.yellow());
    Block YELLOW_TERRACOTTA_BRICK_STAIRS = regBasicStairs(ChiseledBlockItemIds.YELLOW_TERRACOTTA_BRICK_STAIRS, TERRACOTTA_BRICKS, Blocks.DYED_TERRACOTTA.yellow());
    Block YELLOW_TERRACOTTA_BRICK_SLAB = regBasicSlab(ChiseledBlockItemIds.YELLOW_TERRACOTTA_BRICK_SLAB, BlockBehaviour.Properties.ofFullCopy(Blocks.DYED_TERRACOTTA.yellow()).strength(1.75F, 4.2F));
    Block YELLOW_TERRACOTTA_BRICK_WALL = regBasicWall(ChiseledBlockItemIds.YELLOW_TERRACOTTA_BRICK_WALL, Blocks.DYED_TERRACOTTA.yellow());
    Block LIME_TERRACOTTA_BRICKS = regBasicBlock(ChiseledBlockItemIds.LIME_TERRACOTTA_BRICKS, Blocks.DYED_TERRACOTTA.lime());
    Block LIME_TERRACOTTA_BRICK_STAIRS = regBasicStairs(ChiseledBlockItemIds.LIME_TERRACOTTA_BRICK_STAIRS, TERRACOTTA_BRICKS, Blocks.DYED_TERRACOTTA.lime());
    Block LIME_TERRACOTTA_BRICK_SLAB = regBasicSlab(ChiseledBlockItemIds.LIME_TERRACOTTA_BRICK_SLAB, BlockBehaviour.Properties.ofFullCopy(Blocks.DYED_TERRACOTTA.lime()).strength(1.75F, 4.2F));
    Block LIME_TERRACOTTA_BRICK_WALL = regBasicWall(ChiseledBlockItemIds.LIME_TERRACOTTA_BRICK_WALL, Blocks.DYED_TERRACOTTA.lime());
    Block GREEN_TERRACOTTA_BRICKS = regBasicBlock(ChiseledBlockItemIds.GREEN_TERRACOTTA_BRICKS, Blocks.DYED_TERRACOTTA.green());
    Block GREEN_TERRACOTTA_BRICK_STAIRS = regBasicStairs(ChiseledBlockItemIds.GREEN_TERRACOTTA_BRICK_STAIRS, TERRACOTTA_BRICKS, Blocks.DYED_TERRACOTTA.green());
    Block GREEN_TERRACOTTA_BRICK_SLAB = regBasicSlab(ChiseledBlockItemIds.GREEN_TERRACOTTA_BRICK_SLAB, BlockBehaviour.Properties.ofFullCopy(Blocks.DYED_TERRACOTTA.green()).strength(1.75F, 4.2F));
    Block GREEN_TERRACOTTA_BRICK_WALL = regBasicWall(ChiseledBlockItemIds.GREEN_TERRACOTTA_BRICK_WALL, Blocks.DYED_TERRACOTTA.green());
    Block CYAN_TERRACOTTA_BRICKS = regBasicBlock(ChiseledBlockItemIds.CYAN_TERRACOTTA_BRICKS, Blocks.DYED_TERRACOTTA.cyan());
    Block CYAN_TERRACOTTA_BRICK_STAIRS = regBasicStairs(ChiseledBlockItemIds.CYAN_TERRACOTTA_BRICK_STAIRS, TERRACOTTA_BRICKS, Blocks.DYED_TERRACOTTA.cyan());
    Block CYAN_TERRACOTTA_BRICK_SLAB = regBasicSlab(ChiseledBlockItemIds.CYAN_TERRACOTTA_BRICK_SLAB, BlockBehaviour.Properties.ofFullCopy(Blocks.DYED_TERRACOTTA.cyan()).strength(1.75F, 4.2F));
    Block CYAN_TERRACOTTA_BRICK_WALL = regBasicWall(ChiseledBlockItemIds.CYAN_TERRACOTTA_BRICK_WALL, Blocks.DYED_TERRACOTTA.cyan());
    Block LIGHT_BLUE_TERRACOTTA_BRICKS = regBasicBlock(ChiseledBlockItemIds.LIGHT_BLUE_TERRACOTTA_BRICKS, Blocks.DYED_TERRACOTTA.lightBlue());
    Block LIGHT_BLUE_TERRACOTTA_BRICK_STAIRS = regBasicStairs(ChiseledBlockItemIds.LIGHT_BLUE_TERRACOTTA_BRICK_STAIRS, TERRACOTTA_BRICKS, Blocks.DYED_TERRACOTTA.lightBlue());
    Block LIGHT_BLUE_TERRACOTTA_BRICK_SLAB = regBasicSlab(ChiseledBlockItemIds.LIGHT_BLUE_TERRACOTTA_BRICK_SLAB, BlockBehaviour.Properties.ofFullCopy(Blocks.DYED_TERRACOTTA.lightBlue()).strength(1.75F, 4.2F));
    Block LIGHT_BLUE_TERRACOTTA_BRICK_WALL = regBasicWall(ChiseledBlockItemIds.LIGHT_BLUE_TERRACOTTA_BRICK_WALL, Blocks.DYED_TERRACOTTA.lightBlue());
    Block BLUE_TERRACOTTA_BRICKS = regBasicBlock(ChiseledBlockItemIds.BLUE_TERRACOTTA_BRICKS, Blocks.DYED_TERRACOTTA.blue());
    Block BLUE_TERRACOTTA_BRICK_STAIRS = regBasicStairs(ChiseledBlockItemIds.BLUE_TERRACOTTA_BRICK_STAIRS, TERRACOTTA_BRICKS, Blocks.DYED_TERRACOTTA.blue());
    Block BLUE_TERRACOTTA_BRICK_SLAB = regBasicSlab(ChiseledBlockItemIds.BLUE_TERRACOTTA_BRICK_SLAB, BlockBehaviour.Properties.ofFullCopy(Blocks.DYED_TERRACOTTA.blue()).strength(1.75F, 4.2F));
    Block BLUE_TERRACOTTA_BRICK_WALL = regBasicWall(ChiseledBlockItemIds.BLUE_TERRACOTTA_BRICK_WALL, Blocks.DYED_TERRACOTTA.blue());
    Block PURPLE_TERRACOTTA_BRICKS = regBasicBlock(ChiseledBlockItemIds.PURPLE_TERRACOTTA_BRICKS, Blocks.DYED_TERRACOTTA.purple());
    Block PURPLE_TERRACOTTA_BRICK_STAIRS = regBasicStairs(ChiseledBlockItemIds.PURPLE_TERRACOTTA_BRICK_STAIRS, TERRACOTTA_BRICKS, Blocks.DYED_TERRACOTTA.purple());
    Block PURPLE_TERRACOTTA_BRICK_SLAB = regBasicSlab(ChiseledBlockItemIds.PURPLE_TERRACOTTA_BRICK_SLAB, BlockBehaviour.Properties.ofFullCopy(Blocks.DYED_TERRACOTTA.purple()).strength(1.75F, 4.2F));
    Block PURPLE_TERRACOTTA_BRICK_WALL = regBasicWall(ChiseledBlockItemIds.PURPLE_TERRACOTTA_BRICK_WALL, Blocks.DYED_TERRACOTTA.purple());
    Block MAGENTA_TERRACOTTA_BRICKS = regBasicBlock(ChiseledBlockItemIds.MAGENTA_TERRACOTTA_BRICKS, Blocks.DYED_TERRACOTTA.magenta());
    Block MAGENTA_TERRACOTTA_BRICK_STAIRS = regBasicStairs(ChiseledBlockItemIds.MAGENTA_TERRACOTTA_BRICK_STAIRS, TERRACOTTA_BRICKS, Blocks.DYED_TERRACOTTA.magenta());
    Block MAGENTA_TERRACOTTA_BRICK_SLAB = regBasicSlab(ChiseledBlockItemIds.MAGENTA_TERRACOTTA_BRICK_SLAB, BlockBehaviour.Properties.ofFullCopy(Blocks.DYED_TERRACOTTA.magenta()).strength(1.75F, 4.2F));
    Block MAGENTA_TERRACOTTA_BRICK_WALL = regBasicWall(ChiseledBlockItemIds.MAGENTA_TERRACOTTA_BRICK_WALL, Blocks.DYED_TERRACOTTA.magenta());
    Block PINK_TERRACOTTA_BRICKS = regBasicBlock(ChiseledBlockItemIds.PINK_TERRACOTTA_BRICKS, Blocks.DYED_TERRACOTTA.pink());
    Block PINK_TERRACOTTA_BRICK_STAIRS = regBasicStairs(ChiseledBlockItemIds.PINK_TERRACOTTA_BRICK_STAIRS, TERRACOTTA_BRICKS, Blocks.DYED_TERRACOTTA.pink());
    Block PINK_TERRACOTTA_BRICK_SLAB = regBasicSlab(ChiseledBlockItemIds.PINK_TERRACOTTA_BRICK_SLAB, BlockBehaviour.Properties.ofFullCopy(Blocks.DYED_TERRACOTTA.pink()).strength(1.75F, 4.2F));
    Block PINK_TERRACOTTA_BRICK_WALL = regBasicWall(ChiseledBlockItemIds.PINK_TERRACOTTA_BRICK_WALL, Blocks.DYED_TERRACOTTA.pink());

    Block CRACKED_RED_NETHER_BRICKS = regBasicBlock(ChiseledBlockItemIds.CRACKED_RED_NETHER_BRICKS, Blocks.RED_NETHER_BRICKS);
    Block RED_NETHER_BRICK_FENCE = regBasicFence(ChiseledBlockItemIds.RED_NETHER_BRICK_FENCE, Blocks.NETHER_BRICK_FENCE);
    Block CHISELED_RED_NETHER_BRICKS = regBasicBlock(ChiseledBlockItemIds.CHISELED_RED_NETHER_BRICKS, Blocks.RED_NETHER_BRICKS);

    Block SMOOTH_BASALT_STAIRS = regBlock(ChiseledBlockItemIds.SMOOTH_BASALT_STAIRS,
            properties -> new StairBlock(Blocks.SMOOTH_BASALT.defaultBlockState(),properties
                    .mapColor(MapColor.COLOR_BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.25F, 4.2F).sound(SoundType.BASALT)));
    Block SMOOTH_BASALT_SLAB = regBlock(ChiseledBlockItemIds.SMOOTH_BASALT_SLAB,
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.COLOR_BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.25F, 4.2F).sound(SoundType.BASALT)));
    Block SMOOTH_BASALT_WALL = regBlock(ChiseledBlockItemIds.SMOOTH_BASALT_WALL,
            properties -> new WallBlock(properties
                    .mapColor(MapColor.COLOR_BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.25F, 4.2F).sound(SoundType.BASALT)));
    Block BASALT_BRICKS = regBlock(ChiseledBlockItemIds.BASALT_BRICKS,
            properties -> new Block(properties
                    .mapColor(MapColor.COLOR_BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.BASALT)));
    Block BASALT_BRICK_STAIRS = regBlock(ChiseledBlockItemIds.BASALT_BRICK_STAIRS,
            properties -> new StairBlock(BASALT_BRICKS.defaultBlockState(),properties
                    .mapColor(MapColor.COLOR_BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.BASALT)));
    Block BASALT_BRICK_SLAB = regBlock(ChiseledBlockItemIds.BASALT_BRICK_SLAB,
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.COLOR_BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.BASALT)));
    Block BASALT_BRICK_WALL = regBlock(ChiseledBlockItemIds.BASALT_BRICK_WALL,
            properties -> new WallBlock(properties
                    .mapColor(MapColor.COLOR_BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.BASALT)));
    Block CUT_BASALT_BRICKS = regBlock(ChiseledBlockItemIds.CUT_BASALT_BRICKS,
            properties -> new Block(properties
                    .mapColor(MapColor.COLOR_BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.BASALT)));
    Block CUT_BASALT_BRICK_STAIRS = regBlock(ChiseledBlockItemIds.CUT_BASALT_BRICK_STAIRS,
            properties -> new StairBlock(CUT_BASALT_BRICKS.defaultBlockState(),properties
                    .mapColor(MapColor.COLOR_BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.BASALT)));
    Block CUT_BASALT_BRICK_SLAB = regBlock(ChiseledBlockItemIds.CUT_BASALT_BRICK_SLAB,
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.COLOR_BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.BASALT)));
    Block BASALT_TILES = regBlock(ChiseledBlockItemIds.BASALT_TILES,
            properties -> new Block(properties
                    .mapColor(MapColor.COLOR_BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.BASALT)));
    Block BASALT_TILE_STAIRS = regBlock(ChiseledBlockItemIds.BASALT_TILE_STAIRS,
            properties -> new StairBlock(BASALT_TILES.defaultBlockState(),properties
                    .mapColor(MapColor.COLOR_BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.BASALT)));
    Block BASALT_TILE_SLAB = regBlock(ChiseledBlockItemIds.BASALT_TILE_SLAB,
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.COLOR_BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.BASALT)));
    Block BASALT_TILE_WALL = regBlock(ChiseledBlockItemIds.BASALT_TILE_WALL,
            properties -> new WallBlock(properties
                    .mapColor(MapColor.COLOR_BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.BASALT)));

    Block CUT_POLISHED_BLACKSTONE_BRICKS = regBlock(ChiseledBlockItemIds.CUT_POLISHED_BLACKSTONE_BRICKS,
            properties -> new Block(properties
                    .mapColor(MapColor.COLOR_BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    Block CRACKED_CUT_POLISHED_BLACKSTONE_BRICKS = regBlock(ChiseledBlockItemIds.CRACKED_CUT_POLISHED_BLACKSTONE_BRICKS,
            properties -> new Block(properties
                    .mapColor(MapColor.COLOR_BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    Block CUT_POLISHED_BLACKSTONE_BRICK_STAIRS = regBlock(ChiseledBlockItemIds.CUT_POLISHED_BLACKSTONE_BRICK_STAIRS,
            properties -> new StairBlock(CUT_POLISHED_BLACKSTONE_BRICKS.defaultBlockState(),properties
                    .mapColor(MapColor.COLOR_BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    Block CUT_POLISHED_BLACKSTONE_BRICK_SLAB = regBlock(ChiseledBlockItemIds.CUT_POLISHED_BLACKSTONE_BRICK_SLAB,
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.COLOR_BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    Block POLISHED_BLACKSTONE_TILES = regBlock(ChiseledBlockItemIds.POLISHED_BLACKSTONE_TILES,
            properties -> new Block(properties
                    .mapColor(MapColor.COLOR_BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    Block CRACKED_POLISHED_BLACKSTONE_TILES = regBlock(ChiseledBlockItemIds.CRACKED_POLISHED_BLACKSTONE_TILES,
            properties -> new Block(properties
                    .mapColor(MapColor.COLOR_BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    Block POLISHED_BLACKSTONE_TILE_STAIRS = regBlock(ChiseledBlockItemIds.POLISHED_BLACKSTONE_TILE_STAIRS,
            properties -> new StairBlock(POLISHED_BLACKSTONE_TILES.defaultBlockState(),properties
                    .mapColor(MapColor.COLOR_BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    Block POLISHED_BLACKSTONE_TILE_SLAB = regBlock(ChiseledBlockItemIds.POLISHED_BLACKSTONE_TILE_SLAB,
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.COLOR_BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    Block POLISHED_BLACKSTONE_TILE_WALL = regBlock(ChiseledBlockItemIds.POLISHED_BLACKSTONE_TILE_WALL,
            properties -> new WallBlock(properties
                    .mapColor(MapColor.COLOR_BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));

    Block END_STONE_STAIRS = regBlock(ChiseledBlockItemIds.END_STONE_STAIRS,
            properties -> new StairBlock(Blocks.END_STONE.defaultBlockState(),properties
                    .mapColor(MapColor.SAND).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F, 9.0F)));
    Block END_STONE_SLAB = regBlock(ChiseledBlockItemIds.END_STONE_SLAB,
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.SAND).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F, 9.0F)));
    Block END_STONE_WALL = regBlock(ChiseledBlockItemIds.END_STONE_WALL,
            properties -> new WallBlock(properties
                    .mapColor(MapColor.SAND).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F, 9.0F)));
    Block POLISHED_END_STONE = regBlock(ChiseledBlockItemIds.POLISHED_END_STONE,
            properties -> new Block(properties
                    .mapColor(MapColor.SAND).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F, 9.0F)));
    Block POLISHED_END_STONE_STAIRS = regBlock(ChiseledBlockItemIds.POLISHED_END_STONE_STAIRS,
            properties -> new StairBlock(POLISHED_END_STONE.defaultBlockState(),properties
                    .mapColor(MapColor.SAND).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F, 9.0F)));
    Block POLISHED_END_STONE_SLAB = regBlock(ChiseledBlockItemIds.POLISHED_END_STONE_SLAB,
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.SAND).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F, 9.0F)));
    Block POLISHED_END_STONE_WALL = regBlock(ChiseledBlockItemIds.POLISHED_END_STONE_WALL,
            properties -> new WallBlock(properties
                    .mapColor(MapColor.SAND).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F, 9.0F)));
    Block CRACKED_END_STONE_BRICKS = regBlock(ChiseledBlockItemIds.CRACKED_END_STONE_BRICKS,
            properties -> new Block(properties
                    .mapColor(MapColor.SAND).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F, 9.0F)));
    Block CUT_END_STONE_BRICKS = regBlock(ChiseledBlockItemIds.CUT_END_STONE_BRICKS,
            properties -> new Block(properties
                    .mapColor(MapColor.SAND).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F, 9.0F)));
    Block CRACKED_CUT_END_STONE_BRICKS = regBlock(ChiseledBlockItemIds.CRACKED_CUT_END_STONE_BRICKS,
            properties -> new Block(properties
                    .mapColor(MapColor.SAND).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F, 9.0F)));
    Block CUT_END_STONE_BRICK_STAIRS = regBlock(ChiseledBlockItemIds.CUT_END_STONE_BRICK_STAIRS,
            properties -> new StairBlock(CUT_END_STONE_BRICKS.defaultBlockState(),properties
                    .mapColor(MapColor.SAND).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F, 9.0F)));
    Block CUT_END_STONE_BRICK_SLAB = regBlock(ChiseledBlockItemIds.CUT_END_STONE_BRICK_SLAB,
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.SAND).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F, 9.0F)));
    Block END_STONE_TILES = regBlock(ChiseledBlockItemIds.END_STONE_TILES,
            properties -> new Block(properties
                    .mapColor(MapColor.SAND).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F, 9.0F)));
    Block CRACKED_END_STONE_TILES = regBlock(ChiseledBlockItemIds.CRACKED_END_STONE_TILES,
            properties -> new Block(properties
                    .mapColor(MapColor.SAND).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F, 9.0F)));
    Block END_STONE_TILE_STAIRS = regBlock(ChiseledBlockItemIds.END_STONE_TILE_STAIRS,
            properties -> new StairBlock(END_STONE_TILES.defaultBlockState(),properties
                    .mapColor(MapColor.SAND).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F, 9.0F)));
    Block END_STONE_TILE_SLAB = regBlock(ChiseledBlockItemIds.END_STONE_TILE_SLAB,
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.SAND).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F, 9.0F)));
    Block END_STONE_TILE_WALL = regBlock(ChiseledBlockItemIds.END_STONE_TILE_WALL,
            properties -> new WallBlock(properties
                    .mapColor(MapColor.SAND).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F, 9.0F)));

    Block QUARTZ_WALL = regBlock(ChiseledBlockItemIds.QUARTZ_WALL,
            properties -> new WallBlock(properties
                    .mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(0.8F)));
    Block SMOOTH_QUARTZ_WALL = regBlock(ChiseledBlockItemIds.SMOOTH_QUARTZ_WALL,
            properties -> new WallBlock(properties
                    .mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    Block QUARTZ_BRICK_STAIRS = regBlock(ChiseledBlockItemIds.QUARTZ_BRICK_STAIRS,
            properties -> new StairBlock(Blocks.QUARTZ_BRICKS.defaultBlockState(),properties
                    .mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(0.8F)));
    Block QUARTZ_BRICK_SLAB = regBlock(ChiseledBlockItemIds.QUARTZ_BRICK_SLAB,
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(0.8F)));
    Block QUARTZ_BRICK_WALL = regBlock(ChiseledBlockItemIds.QUARTZ_BRICK_WALL,
            properties -> new WallBlock(properties
                    .mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(0.8F)));
    Block CUT_QUARTZ_BRICKS = regBlock(ChiseledBlockItemIds.CUT_QUARTZ_BRICKS,
            properties -> new Block(properties
                    .mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(0.8F)));
    Block CUT_QUARTZ_BRICK_STAIRS = regBlock(ChiseledBlockItemIds.CUT_QUARTZ_BRICK_STAIRS,
            properties -> new StairBlock(CUT_QUARTZ_BRICKS.defaultBlockState(),properties
                    .mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(0.8F)));
    Block CUT_QUARTZ_BRICK_SLAB = regBlock(ChiseledBlockItemIds.CUT_QUARTZ_BRICK_SLAB,
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(0.8F)));
    Block QUARTZ_TILES = regBlock(ChiseledBlockItemIds.QUARTZ_TILES,
            properties -> new Block(properties
                    .mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(0.8F)));
    Block QUARTZ_TILE_STAIRS = regBlock(ChiseledBlockItemIds.QUARTZ_TILE_STAIRS,
            properties -> new StairBlock(QUARTZ_TILES.defaultBlockState(),properties
                    .mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(0.8F)));
    Block QUARTZ_TILE_SLAB = regBlock(ChiseledBlockItemIds.QUARTZ_TILE_SLAB,
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(0.8F)));
    Block QUARTZ_TILE_WALL = regBlock(ChiseledBlockItemIds.QUARTZ_TILE_WALL,
            properties -> new WallBlock(properties
                    .mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(0.8F)));

    Block AMETHYST_STAIRS = regBlock(ChiseledBlockItemIds.AMETHYST_STAIRS,
            properties -> new AmethystStairBlock(Blocks.AMETHYST_BLOCK.defaultBlockState(),properties
                    .mapColor(MapColor.COLOR_PURPLE).strength(1.5F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()));
    Block AMETHYST_SLAB = regBlock(ChiseledBlockItemIds.AMETHYST_SLAB,
            properties -> new AmethystSlabBlock(properties
                    .mapColor(MapColor.COLOR_PURPLE).strength(1.5F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()));
    Block AMETHYST_WALL = regBlock(ChiseledBlockItemIds.AMETHYST_WALL,
            properties -> new AmethystWallBlock(properties
                    .mapColor(MapColor.COLOR_PURPLE).strength(1.5F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()));
    Block AMETHYST_BRICKS = regBlock(ChiseledBlockItemIds.AMETHYST_BRICKS,
            properties -> new AmethystBlock(properties
                    .mapColor(MapColor.COLOR_PURPLE).strength(1.5F, 3.0F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()));
    Block AMETHYST_BRICK_STAIRS = regBlock(ChiseledBlockItemIds.AMETHYST_BRICK_STAIRS,
            properties -> new AmethystStairBlock(AMETHYST_BRICKS.defaultBlockState(),properties
                    .mapColor(MapColor.COLOR_PURPLE).strength(1.5F, 3.0F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()));
    Block AMETHYST_BRICK_SLAB = regBlock(ChiseledBlockItemIds.AMETHYST_BRICK_SLAB,
            properties -> new AmethystSlabBlock(properties
                    .mapColor(MapColor.COLOR_PURPLE).strength(1.5F, 3.0F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()));
    Block AMETHYST_BRICK_WALL = regBlock(ChiseledBlockItemIds.AMETHYST_BRICK_WALL,
            properties -> new AmethystWallBlock(properties
                    .mapColor(MapColor.COLOR_PURPLE).strength(1.5F, 3.0F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()));
    Block CUT_AMETHYST_BRICKS = regBlock(ChiseledBlockItemIds.CUT_AMETHYST_BRICKS,
            properties -> new AmethystBlock(properties
                    .mapColor(MapColor.COLOR_PURPLE).strength(1.5F, 3.0F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()));
    Block CUT_AMETHYST_BRICK_STAIRS = regBlock(ChiseledBlockItemIds.CUT_AMETHYST_BRICK_STAIRS,
            properties -> new AmethystStairBlock(CUT_AMETHYST_BRICKS.defaultBlockState(),properties
                    .mapColor(MapColor.COLOR_PURPLE).strength(1.5F, 3.0F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()));
    Block CUT_AMETHYST_BRICK_SLAB = regBlock(ChiseledBlockItemIds.CUT_AMETHYST_BRICK_SLAB,
            properties -> new AmethystSlabBlock(properties
                    .mapColor(MapColor.COLOR_PURPLE).strength(1.5F, 3.0F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()));
    
    Block NETHERITE_STAIRS = regBlock(ChiseledBlockItemIds.NETHERITE_STAIRS,
            properties -> new StairBlock(Blocks.NETHERITE_BLOCK.defaultBlockState(),properties
                    .mapColor(MapColor.COLOR_BLACK).requiresCorrectToolForDrops().strength(50.0F, 1200.0F).sound(SoundType.NETHERITE_BLOCK)));

    static void init() {}
}