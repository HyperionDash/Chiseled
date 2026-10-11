package net.hyper.chiseled.datagen;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.hyper.chiseled.registry.ChiseledBlocks;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.client.data.models.model.TextureMapping;
import net.minecraft.client.data.models.model.TextureSlot;
import net.minecraft.client.data.models.model.TexturedModel;
import net.minecraft.client.resources.model.sprite.Material;
import net.minecraft.resources.Identifier;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import org.jspecify.annotations.NonNull;

import static net.hyper.silliestlib.utils.SilliestLibDataUtils.*;
import static net.minecraft.client.data.models.BlockModelGenerators.plainVariant;

public class ChiseledModelGen extends FabricModelProvider {
    public ChiseledModelGen(FabricPackOutput output) {
        super(output);
    }

    static void createStandaloneWallWithCustomMaterial(Block block, Material texture, BlockModelGenerators blockModelGenerators) {
        final TextureMapping textureMapping = (new TextureMapping()).put(TextureSlot.ALL, texture);
        final Identifier wallPost = ModelTemplates.WALL_POST.create(block, textureMapping, blockModelGenerators.modelOutput);
        final Identifier wallSide = ModelTemplates.WALL_LOW_SIDE.create(block, textureMapping, blockModelGenerators.modelOutput);
        final Identifier wallSideTall = ModelTemplates.WALL_TALL_SIDE.create(block, textureMapping, blockModelGenerators.modelOutput);
        final Identifier wallInventory = ModelTemplates.WALL_INVENTORY.create(block, textureMapping, blockModelGenerators.modelOutput);
        blockModelGenerators.blockStateOutput.accept(
                BlockModelGenerators.createWall(block,
                        plainVariant(wallPost),
                        plainVariant(wallSide),
                        plainVariant(wallSideTall)));
        blockModelGenerators.registerSimpleItemModel(block, wallInventory);
    }

    @Override
    public void generateBlockStateModels(@NonNull BlockModelGenerators blockModelGenerators) {
        createStandaloneWall(ChiseledBlocks.STONE_WALL, Blocks.STONE, blockModelGenerators);
        blockModelGenerators.family(ChiseledBlocks.POLISHED_STONE).stairs(ChiseledBlocks.POLISHED_STONE_STAIRS).slab(ChiseledBlocks.POLISHED_STONE_SLAB).wall(ChiseledBlocks.POLISHED_STONE_WALL);
        blockModelGenerators.createRotatedPillarWithHorizontalVariant(ChiseledBlocks.STONE_PILLAR, TexturedModel.COLUMN, TexturedModel.COLUMN_HORIZONTAL);
        blockModelGenerators.family(ChiseledBlocks.CUT_STONE_BRICKS).stairs(ChiseledBlocks.CUT_STONE_BRICK_STAIRS).slab(ChiseledBlocks.CUT_STONE_BRICK_SLAB);
        blockModelGenerators.createTrivialCube(ChiseledBlocks.CRACKED_CUT_STONE_BRICKS);
        blockModelGenerators.family(ChiseledBlocks.MOSSY_CUT_STONE_BRICKS).stairs(ChiseledBlocks.MOSSY_CUT_STONE_BRICK_STAIRS).slab(ChiseledBlocks.MOSSY_CUT_STONE_BRICK_SLAB);
        blockModelGenerators.family(ChiseledBlocks.STONE_TILES).stairs(ChiseledBlocks.STONE_TILE_STAIRS).slab(ChiseledBlocks.STONE_TILE_SLAB).wall(ChiseledBlocks.STONE_TILE_WALL);
        blockModelGenerators.createTrivialCube(ChiseledBlocks.CRACKED_STONE_TILES);
        blockModelGenerators.family(ChiseledBlocks.MOSSY_STONE_TILES).stairs(ChiseledBlocks.MOSSY_STONE_TILE_STAIRS).slab(ChiseledBlocks.MOSSY_STONE_TILE_SLAB).wall(ChiseledBlocks.MOSSY_STONE_TILE_WALL);

        createStandaloneWall(ChiseledBlocks.POLISHED_GRANITE_WALL, Blocks.POLISHED_GRANITE, blockModelGenerators);
        blockModelGenerators.createRotatedPillarWithHorizontalVariant(ChiseledBlocks.POLISHED_GRANITE_PILLAR, TexturedModel.COLUMN, TexturedModel.COLUMN_HORIZONTAL);
        blockModelGenerators.family(ChiseledBlocks.POLISHED_GRANITE_BRICKS).stairs(ChiseledBlocks.POLISHED_GRANITE_BRICK_STAIRS).slab(ChiseledBlocks.POLISHED_GRANITE_BRICK_SLAB).wall(ChiseledBlocks.POLISHED_GRANITE_BRICK_WALL);
        blockModelGenerators.createTrivialCube(ChiseledBlocks.CRACKED_POLISHED_GRANITE_BRICKS);
        blockModelGenerators.family(ChiseledBlocks.CUT_POLISHED_GRANITE_BRICKS).stairs(ChiseledBlocks.CUT_POLISHED_GRANITE_BRICK_STAIRS).slab(ChiseledBlocks.CUT_POLISHED_GRANITE_BRICK_SLAB);
        blockModelGenerators.createTrivialCube(ChiseledBlocks.CRACKED_CUT_POLISHED_GRANITE_BRICKS);
        blockModelGenerators.family(ChiseledBlocks.POLISHED_GRANITE_TILES).stairs(ChiseledBlocks.POLISHED_GRANITE_TILE_STAIRS).slab(ChiseledBlocks.POLISHED_GRANITE_TILE_SLAB).wall(ChiseledBlocks.POLISHED_GRANITE_TILE_WALL);
        blockModelGenerators.createTrivialCube(ChiseledBlocks.CRACKED_POLISHED_GRANITE_TILES);

        createStandaloneWall(ChiseledBlocks.POLISHED_DIORITE_WALL, Blocks.POLISHED_DIORITE, blockModelGenerators);
        blockModelGenerators.createRotatedPillarWithHorizontalVariant(ChiseledBlocks.POLISHED_DIORITE_PILLAR, TexturedModel.COLUMN, TexturedModel.COLUMN_HORIZONTAL);
        blockModelGenerators.family(ChiseledBlocks.POLISHED_DIORITE_BRICKS).stairs(ChiseledBlocks.POLISHED_DIORITE_BRICK_STAIRS).slab(ChiseledBlocks.POLISHED_DIORITE_BRICK_SLAB).wall(ChiseledBlocks.POLISHED_DIORITE_BRICK_WALL);
        blockModelGenerators.createTrivialCube(ChiseledBlocks.CRACKED_POLISHED_DIORITE_BRICKS);
        blockModelGenerators.family(ChiseledBlocks.CUT_POLISHED_DIORITE_BRICKS).stairs(ChiseledBlocks.CUT_POLISHED_DIORITE_BRICK_STAIRS).slab(ChiseledBlocks.CUT_POLISHED_DIORITE_BRICK_SLAB);
        blockModelGenerators.createTrivialCube(ChiseledBlocks.CRACKED_CUT_POLISHED_DIORITE_BRICKS);
        blockModelGenerators.family(ChiseledBlocks.POLISHED_DIORITE_TILES).stairs(ChiseledBlocks.POLISHED_DIORITE_TILE_STAIRS).slab(ChiseledBlocks.POLISHED_DIORITE_TILE_SLAB).wall(ChiseledBlocks.POLISHED_DIORITE_TILE_WALL);
        blockModelGenerators.createTrivialCube(ChiseledBlocks.CRACKED_POLISHED_DIORITE_TILES);

        createStandaloneWall(ChiseledBlocks.POLISHED_ANDESITE_WALL, Blocks.POLISHED_ANDESITE, blockModelGenerators);
        blockModelGenerators.createRotatedPillarWithHorizontalVariant(ChiseledBlocks.POLISHED_ANDESITE_PILLAR, TexturedModel.COLUMN, TexturedModel.COLUMN_HORIZONTAL);
        blockModelGenerators.family(ChiseledBlocks.POLISHED_ANDESITE_BRICKS).stairs(ChiseledBlocks.POLISHED_ANDESITE_BRICK_STAIRS).slab(ChiseledBlocks.POLISHED_ANDESITE_BRICK_SLAB).wall(ChiseledBlocks.POLISHED_ANDESITE_BRICK_WALL);
        blockModelGenerators.createTrivialCube(ChiseledBlocks.CRACKED_POLISHED_ANDESITE_BRICKS);
        blockModelGenerators.family(ChiseledBlocks.CUT_POLISHED_ANDESITE_BRICKS).stairs(ChiseledBlocks.CUT_POLISHED_ANDESITE_BRICK_STAIRS).slab(ChiseledBlocks.CUT_POLISHED_ANDESITE_BRICK_SLAB);
        blockModelGenerators.createTrivialCube(ChiseledBlocks.CRACKED_CUT_POLISHED_ANDESITE_BRICKS);
        blockModelGenerators.family(ChiseledBlocks.POLISHED_ANDESITE_TILES).stairs(ChiseledBlocks.POLISHED_ANDESITE_TILE_STAIRS).slab(ChiseledBlocks.POLISHED_ANDESITE_TILE_SLAB).wall(ChiseledBlocks.POLISHED_ANDESITE_TILE_WALL);
        blockModelGenerators.createTrivialCube(ChiseledBlocks.CRACKED_POLISHED_ANDESITE_TILES);

        blockModelGenerators.createRotatedPillarWithHorizontalVariant(ChiseledBlocks.DEEPSLATE_PILLAR, TexturedModel.COLUMN, TexturedModel.COLUMN_HORIZONTAL);
        blockModelGenerators.family(ChiseledBlocks.CUT_DEEPSLATE_BRICKS).stairs(ChiseledBlocks.CUT_DEEPSLATE_BRICK_STAIRS).slab(ChiseledBlocks.CUT_DEEPSLATE_BRICK_SLAB);
        blockModelGenerators.createTrivialCube(ChiseledBlocks.CRACKED_CUT_DEEPSLATE_BRICKS);

        blockModelGenerators.createTrivialCube(ChiseledBlocks.CRACKED_BRICKS);
        blockModelGenerators.family(ChiseledBlocks.WEATHERED_BRICKS).stairs(ChiseledBlocks.WEATHERED_BRICK_STAIRS).slab(ChiseledBlocks.WEATHERED_BRICK_SLAB).wall(ChiseledBlocks.WEATHERED_BRICK_WALL);
        blockModelGenerators.family(ChiseledBlocks.MOSSY_BRICKS).stairs(ChiseledBlocks.MOSSY_BRICK_STAIRS).slab(ChiseledBlocks.MOSSY_BRICK_SLAB).wall(ChiseledBlocks.MOSSY_BRICK_WALL);

        createStandaloneStairs(ChiseledBlocks.PACKED_MUD_STAIRS, Blocks.PACKED_MUD, blockModelGenerators);
        createStandaloneSlab(ChiseledBlocks.PACKED_MUD_SLAB, Blocks.PACKED_MUD, blockModelGenerators);
        createStandaloneWall(ChiseledBlocks.PACKED_MUD_WALL, Blocks.PACKED_MUD, blockModelGenerators);
        blockModelGenerators.family(ChiseledBlocks.MOSSY_MUD_BRICKS).stairs(ChiseledBlocks.MOSSY_MUD_BRICK_STAIRS).slab(ChiseledBlocks.MOSSY_MUD_BRICK_SLAB).wall(ChiseledBlocks.MOSSY_MUD_BRICK_WALL);
        blockModelGenerators.family(ChiseledBlocks.CUT_MUD_BRICKS).stairs(ChiseledBlocks.CUT_MUD_BRICK_STAIRS).slab(ChiseledBlocks.CUT_MUD_BRICK_SLAB);
        blockModelGenerators.family(ChiseledBlocks.MOSSY_CUT_MUD_BRICKS).stairs(ChiseledBlocks.MOSSY_CUT_MUD_BRICK_STAIRS).slab(ChiseledBlocks.MOSSY_CUT_MUD_BRICK_SLAB);
        blockModelGenerators.family(ChiseledBlocks.MUD_TILES).stairs(ChiseledBlocks.MUD_TILE_STAIRS).slab(ChiseledBlocks.MUD_TILE_SLAB).wall(ChiseledBlocks.MUD_TILE_WALL);
        blockModelGenerators.family(ChiseledBlocks.MOSSY_MUD_TILES).stairs(ChiseledBlocks.MOSSY_MUD_TILE_STAIRS).slab(ChiseledBlocks.MOSSY_MUD_TILE_SLAB).wall(ChiseledBlocks.MOSSY_MUD_TILE_WALL);

        createStandaloneWallWithCustomMaterial(ChiseledBlocks.SMOOTH_SANDSTONE_WALL, TextureMapping.getBlockTexture(Blocks.SANDSTONE, "_top"), blockModelGenerators);
        blockModelGenerators.createRotatedPillarWithHorizontalVariant(ChiseledBlocks.SMOOTH_SANDSTONE_PILLAR, TexturedModel.COLUMN, TexturedModel.COLUMN_HORIZONTAL);
        blockModelGenerators.family(ChiseledBlocks.SMOOTH_SANDSTONE_BRICKS).stairs(ChiseledBlocks.SMOOTH_SANDSTONE_BRICK_STAIRS).slab(ChiseledBlocks.SMOOTH_SANDSTONE_BRICK_SLAB).wall(ChiseledBlocks.SMOOTH_SANDSTONE_BRICK_WALL);
        blockModelGenerators.family(ChiseledBlocks.CUT_SMOOTH_SANDSTONE_BRICKS).stairs(ChiseledBlocks.CUT_SMOOTH_SANDSTONE_BRICK_STAIRS).slab(ChiseledBlocks.CUT_SMOOTH_SANDSTONE_BRICK_SLAB);
        blockModelGenerators.family(ChiseledBlocks.SMOOTH_SANDSTONE_TILES).stairs(ChiseledBlocks.SMOOTH_SANDSTONE_TILE_STAIRS).slab(ChiseledBlocks.SMOOTH_SANDSTONE_TILE_SLAB).wall(ChiseledBlocks.SMOOTH_SANDSTONE_TILE_WALL);
        createStandaloneWallWithCustomMaterial(ChiseledBlocks.SMOOTH_RED_SANDSTONE_WALL, TextureMapping.getBlockTexture(Blocks.RED_SANDSTONE, "_top"), blockModelGenerators);
        blockModelGenerators.createRotatedPillarWithHorizontalVariant(ChiseledBlocks.SMOOTH_RED_SANDSTONE_PILLAR, TexturedModel.COLUMN, TexturedModel.COLUMN_HORIZONTAL);
        blockModelGenerators.family(ChiseledBlocks.SMOOTH_RED_SANDSTONE_BRICKS).stairs(ChiseledBlocks.SMOOTH_RED_SANDSTONE_BRICK_STAIRS).slab(ChiseledBlocks.SMOOTH_RED_SANDSTONE_BRICK_SLAB).wall(ChiseledBlocks.SMOOTH_RED_SANDSTONE_BRICK_WALL);
        blockModelGenerators.family(ChiseledBlocks.CUT_SMOOTH_RED_SANDSTONE_BRICKS).stairs(ChiseledBlocks.CUT_SMOOTH_RED_SANDSTONE_BRICK_STAIRS).slab(ChiseledBlocks.CUT_SMOOTH_RED_SANDSTONE_BRICK_SLAB);
        blockModelGenerators.family(ChiseledBlocks.SMOOTH_RED_SANDSTONE_TILES).stairs(ChiseledBlocks.SMOOTH_RED_SANDSTONE_TILE_STAIRS).slab(ChiseledBlocks.SMOOTH_RED_SANDSTONE_TILE_SLAB).wall(ChiseledBlocks.SMOOTH_RED_SANDSTONE_TILE_WALL);

        blockModelGenerators.createTrivialCube(ChiseledBlocks.CRACKED_CINNABAR_BRICKS);
        blockModelGenerators.family(ChiseledBlocks.CUT_CINNABAR_BRICKS).stairs(ChiseledBlocks.CUT_CINNABAR_BRICK_STAIRS).slab(ChiseledBlocks.CUT_CINNABAR_BRICK_SLAB);
        blockModelGenerators.createTrivialCube(ChiseledBlocks.CRACKED_CUT_CINNABAR_BRICKS);
        blockModelGenerators.family(ChiseledBlocks.CINNABAR_TILES).stairs(ChiseledBlocks.CINNABAR_TILE_STAIRS).slab(ChiseledBlocks.CINNABAR_TILE_SLAB).wall(ChiseledBlocks.CINNABAR_TILE_WALL);
        blockModelGenerators.createTrivialCube(ChiseledBlocks.CRACKED_CINNABAR_TILES);

        blockModelGenerators.createTrivialCube(ChiseledBlocks.CRACKED_SULFUR_BRICKS);
        blockModelGenerators.family(ChiseledBlocks.CUT_SULFUR_BRICKS).stairs(ChiseledBlocks.CUT_SULFUR_BRICK_STAIRS).slab(ChiseledBlocks.CUT_SULFUR_BRICK_SLAB);
        blockModelGenerators.createTrivialCube(ChiseledBlocks.CRACKED_CUT_SULFUR_BRICKS);
        blockModelGenerators.family(ChiseledBlocks.SULFUR_TILES).stairs(ChiseledBlocks.SULFUR_TILE_STAIRS).slab(ChiseledBlocks.SULFUR_TILE_SLAB).wall(ChiseledBlocks.SULFUR_TILE_WALL);
        blockModelGenerators.createTrivialCube(ChiseledBlocks.CRACKED_SULFUR_TILES);

        blockModelGenerators.family(ChiseledBlocks.POLISHED_PRISMARINE).stairs(ChiseledBlocks.POLISHED_PRISMARINE_STAIRS).slab(ChiseledBlocks.POLISHED_PRISMARINE_SLAB).wall(ChiseledBlocks.POLISHED_PRISMARINE_WALL);
        createStandaloneWall(ChiseledBlocks.PRISMARINE_BRICK_WALL, Blocks.PRISMARINE_BRICKS, blockModelGenerators);
        blockModelGenerators.family(ChiseledBlocks.CUT_PRISMARINE_BRICKS).stairs(ChiseledBlocks.CUT_PRISMARINE_BRICK_STAIRS).slab(ChiseledBlocks.CUT_PRISMARINE_BRICK_SLAB);

        createStandaloneWall(ChiseledBlocks.DARK_PRISMARINE_WALL, Blocks.DARK_PRISMARINE, blockModelGenerators);
        blockModelGenerators.family(ChiseledBlocks.POLISHED_DARK_PRISMARINE).stairs(ChiseledBlocks.POLISHED_DARK_PRISMARINE_STAIRS).slab(ChiseledBlocks.POLISHED_DARK_PRISMARINE_SLAB).wall(ChiseledBlocks.POLISHED_DARK_PRISMARINE_WALL);
        blockModelGenerators.family(ChiseledBlocks.DARK_PRISMARINE_BRICKS).stairs(ChiseledBlocks.DARK_PRISMARINE_BRICK_STAIRS).slab(ChiseledBlocks.DARK_PRISMARINE_BRICK_SLAB).wall(ChiseledBlocks.DARK_PRISMARINE_BRICK_WALL);
        blockModelGenerators.family(ChiseledBlocks.CUT_DARK_PRISMARINE_BRICKS).stairs(ChiseledBlocks.CUT_DARK_PRISMARINE_BRICK_STAIRS).slab(ChiseledBlocks.CUT_DARK_PRISMARINE_BRICK_SLAB);

        blockModelGenerators.createTrivialCube(ChiseledBlocks.CRACKED_RED_NETHER_BRICKS);
        createStandaloneFence(ChiseledBlocks.RED_NETHER_BRICK_FENCE, Blocks.RED_NETHER_BRICKS, blockModelGenerators);
        blockModelGenerators.createTrivialCube(ChiseledBlocks.CHISELED_RED_NETHER_BRICKS);

        blockModelGenerators.createRotatedPillarWithHorizontalVariant(ChiseledBlocks.POLISHED_BLACKSTONE_PILLAR, TexturedModel.COLUMN, TexturedModel.COLUMN_HORIZONTAL);
        blockModelGenerators.family(ChiseledBlocks.CUT_POLISHED_BLACKSTONE_BRICKS).stairs(ChiseledBlocks.CUT_POLISHED_BLACKSTONE_BRICK_STAIRS).slab(ChiseledBlocks.CUT_POLISHED_BLACKSTONE_BRICK_SLAB);
        blockModelGenerators.createTrivialCube(ChiseledBlocks.CRACKED_CUT_POLISHED_BLACKSTONE_BRICKS);
        blockModelGenerators.family(ChiseledBlocks.POLISHED_BLACKSTONE_TILES).stairs(ChiseledBlocks.POLISHED_BLACKSTONE_TILE_STAIRS).slab(ChiseledBlocks.POLISHED_BLACKSTONE_TILE_SLAB).wall(ChiseledBlocks.POLISHED_BLACKSTONE_TILE_WALL);
        blockModelGenerators.createTrivialCube(ChiseledBlocks.CRACKED_POLISHED_BLACKSTONE_TILES);

        createStandaloneStairs(ChiseledBlocks.END_STONE_STAIRS, Blocks.END_STONE, blockModelGenerators);
        createStandaloneSlab(ChiseledBlocks.END_STONE_SLAB, Blocks.END_STONE, blockModelGenerators);
        createStandaloneWall(ChiseledBlocks.END_STONE_WALL, Blocks.END_STONE, blockModelGenerators);
        blockModelGenerators.family(ChiseledBlocks.POLISHED_END_STONE).stairs(ChiseledBlocks.POLISHED_END_STONE_STAIRS).slab(ChiseledBlocks.POLISHED_END_STONE_SLAB).wall(ChiseledBlocks.POLISHED_END_STONE_WALL);
        blockModelGenerators.createRotatedPillarWithHorizontalVariant(ChiseledBlocks.END_STONE_PILLAR, TexturedModel.COLUMN, TexturedModel.COLUMN_HORIZONTAL);
        blockModelGenerators.createTrivialCube(ChiseledBlocks.CRACKED_END_STONE_BRICKS);
        blockModelGenerators.family(ChiseledBlocks.CUT_END_STONE_BRICKS).stairs(ChiseledBlocks.CUT_END_STONE_BRICK_STAIRS).slab(ChiseledBlocks.CUT_END_STONE_BRICK_SLAB);
        blockModelGenerators.createTrivialCube(ChiseledBlocks.CRACKED_CUT_END_STONE_BRICKS);
        blockModelGenerators.family(ChiseledBlocks.END_STONE_TILES).stairs(ChiseledBlocks.END_STONE_TILE_STAIRS).slab(ChiseledBlocks.END_STONE_TILE_SLAB).wall(ChiseledBlocks.END_STONE_TILE_WALL);
        blockModelGenerators.createTrivialCube(ChiseledBlocks.CRACKED_END_STONE_TILES);

        createStandaloneWallWithCustomMaterial(ChiseledBlocks.QUARTZ_WALL, TextureMapping.getBlockTexture(Blocks.QUARTZ_BLOCK, "_side"), blockModelGenerators);
        createStandaloneWallWithCustomMaterial(ChiseledBlocks.SMOOTH_QUARTZ_WALL, TextureMapping.getBlockTexture(Blocks.QUARTZ_BLOCK, "_bottom"), blockModelGenerators);
        createStandaloneStairs(ChiseledBlocks.QUARTZ_BRICK_STAIRS, Blocks.QUARTZ_BRICKS, blockModelGenerators);
        createStandaloneSlab(ChiseledBlocks.QUARTZ_BRICK_SLAB, Blocks.QUARTZ_BRICKS, blockModelGenerators);
        createStandaloneWall(ChiseledBlocks.QUARTZ_BRICK_WALL, Blocks.QUARTZ_BRICKS, blockModelGenerators);
        blockModelGenerators.family(ChiseledBlocks.CUT_QUARTZ_BRICKS).stairs(ChiseledBlocks.CUT_QUARTZ_BRICK_STAIRS).slab(ChiseledBlocks.CUT_QUARTZ_BRICK_SLAB);
        blockModelGenerators.family(ChiseledBlocks.QUARTZ_TILES).stairs(ChiseledBlocks.QUARTZ_TILE_STAIRS).slab(ChiseledBlocks.QUARTZ_TILE_SLAB).wall(ChiseledBlocks.QUARTZ_TILE_WALL);

        createStandaloneStairs(ChiseledBlocks.TERRACOTTA_STAIRS, Blocks.TERRACOTTA, blockModelGenerators);
        createStandaloneSlab(ChiseledBlocks.TERRACOTTA_SLAB, Blocks.TERRACOTTA, blockModelGenerators);
        createStandaloneWall(ChiseledBlocks.TERRACOTTA_WALL, Blocks.TERRACOTTA, blockModelGenerators);
        blockModelGenerators.family(ChiseledBlocks.TERRACOTTA_BRICKS).stairs(ChiseledBlocks.TERRACOTTA_BRICK_STAIRS).slab(ChiseledBlocks.TERRACOTTA_BRICK_SLAB).wall(ChiseledBlocks.TERRACOTTA_BRICK_WALL);
        createStandaloneWall(ChiseledBlocks.WHITE_CONCRETE_WALL, Blocks.CONCRETE.white(), blockModelGenerators);
        createStandaloneStairs(ChiseledBlocks.WHITE_TERRACOTTA_STAIRS, Blocks.DYED_TERRACOTTA.white(), blockModelGenerators);
        createStandaloneSlab(ChiseledBlocks.WHITE_TERRACOTTA_SLAB, Blocks.DYED_TERRACOTTA.white(), blockModelGenerators);
        createStandaloneWall(ChiseledBlocks.WHITE_TERRACOTTA_WALL, Blocks.DYED_TERRACOTTA.white(), blockModelGenerators);
        blockModelGenerators.family(ChiseledBlocks.WHITE_TERRACOTTA_BRICKS).stairs(ChiseledBlocks.WHITE_TERRACOTTA_BRICK_STAIRS).slab(ChiseledBlocks.WHITE_TERRACOTTA_BRICK_SLAB).wall(ChiseledBlocks.WHITE_TERRACOTTA_BRICK_WALL);
        createStandaloneWall(ChiseledBlocks.LIGHT_GRAY_CONCRETE_WALL, Blocks.CONCRETE.lightGray(), blockModelGenerators);
        createStandaloneStairs(ChiseledBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS, Blocks.DYED_TERRACOTTA.lightGray(), blockModelGenerators);
        createStandaloneSlab(ChiseledBlocks.LIGHT_GRAY_TERRACOTTA_SLAB, Blocks.DYED_TERRACOTTA.lightGray(), blockModelGenerators);
        createStandaloneWall(ChiseledBlocks.LIGHT_GRAY_TERRACOTTA_WALL, Blocks.DYED_TERRACOTTA.lightGray(), blockModelGenerators);
        blockModelGenerators.family(ChiseledBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS).stairs(ChiseledBlocks.LIGHT_GRAY_TERRACOTTA_BRICK_STAIRS).slab(ChiseledBlocks.LIGHT_GRAY_TERRACOTTA_BRICK_SLAB).wall(ChiseledBlocks.LIGHT_GRAY_TERRACOTTA_BRICK_WALL);
        createStandaloneWall(ChiseledBlocks.GRAY_CONCRETE_WALL, Blocks.CONCRETE.gray(), blockModelGenerators);
        createStandaloneStairs(ChiseledBlocks.GRAY_TERRACOTTA_STAIRS, Blocks.DYED_TERRACOTTA.gray(), blockModelGenerators);
        createStandaloneSlab(ChiseledBlocks.GRAY_TERRACOTTA_SLAB, Blocks.DYED_TERRACOTTA.gray(), blockModelGenerators);
        createStandaloneWall(ChiseledBlocks.GRAY_TERRACOTTA_WALL, Blocks.DYED_TERRACOTTA.gray(), blockModelGenerators);
        blockModelGenerators.family(ChiseledBlocks.GRAY_TERRACOTTA_BRICKS).stairs(ChiseledBlocks.GRAY_TERRACOTTA_BRICK_STAIRS).slab(ChiseledBlocks.GRAY_TERRACOTTA_BRICK_SLAB).wall(ChiseledBlocks.GRAY_TERRACOTTA_BRICK_WALL);
        createStandaloneWall(ChiseledBlocks.BLACK_CONCRETE_WALL, Blocks.CONCRETE.black(), blockModelGenerators);
        createStandaloneStairs(ChiseledBlocks.BLACK_TERRACOTTA_STAIRS, Blocks.DYED_TERRACOTTA.black(), blockModelGenerators);
        createStandaloneSlab(ChiseledBlocks.BLACK_TERRACOTTA_SLAB, Blocks.DYED_TERRACOTTA.black(), blockModelGenerators);
        createStandaloneWall(ChiseledBlocks.BLACK_TERRACOTTA_WALL, Blocks.DYED_TERRACOTTA.black(), blockModelGenerators);
        blockModelGenerators.family(ChiseledBlocks.BLACK_TERRACOTTA_BRICKS).stairs(ChiseledBlocks.BLACK_TERRACOTTA_BRICK_STAIRS).slab(ChiseledBlocks.BLACK_TERRACOTTA_BRICK_SLAB).wall(ChiseledBlocks.BLACK_TERRACOTTA_BRICK_WALL);
        createStandaloneWall(ChiseledBlocks.BROWN_CONCRETE_WALL, Blocks.CONCRETE.brown(), blockModelGenerators);
        createStandaloneStairs(ChiseledBlocks.BROWN_TERRACOTTA_STAIRS, Blocks.DYED_TERRACOTTA.brown(), blockModelGenerators);
        createStandaloneSlab(ChiseledBlocks.BROWN_TERRACOTTA_SLAB, Blocks.DYED_TERRACOTTA.brown(), blockModelGenerators);
        createStandaloneWall(ChiseledBlocks.BROWN_TERRACOTTA_WALL, Blocks.DYED_TERRACOTTA.brown(), blockModelGenerators);
        blockModelGenerators.family(ChiseledBlocks.BROWN_TERRACOTTA_BRICKS).stairs(ChiseledBlocks.BROWN_TERRACOTTA_BRICK_STAIRS).slab(ChiseledBlocks.BROWN_TERRACOTTA_BRICK_SLAB).wall(ChiseledBlocks.BROWN_TERRACOTTA_BRICK_WALL);
        createStandaloneWall(ChiseledBlocks.RED_CONCRETE_WALL, Blocks.CONCRETE.red(), blockModelGenerators);
        createStandaloneStairs(ChiseledBlocks.RED_TERRACOTTA_STAIRS, Blocks.DYED_TERRACOTTA.red(), blockModelGenerators);
        createStandaloneSlab(ChiseledBlocks.RED_TERRACOTTA_SLAB, Blocks.DYED_TERRACOTTA.red(), blockModelGenerators);
        createStandaloneWall(ChiseledBlocks.RED_TERRACOTTA_WALL, Blocks.DYED_TERRACOTTA.red(), blockModelGenerators);
        blockModelGenerators.family(ChiseledBlocks.RED_TERRACOTTA_BRICKS).stairs(ChiseledBlocks.RED_TERRACOTTA_BRICK_STAIRS).slab(ChiseledBlocks.RED_TERRACOTTA_BRICK_SLAB).wall(ChiseledBlocks.RED_TERRACOTTA_BRICK_WALL);
        createStandaloneWall(ChiseledBlocks.ORANGE_CONCRETE_WALL, Blocks.CONCRETE.orange(), blockModelGenerators);
        createStandaloneStairs(ChiseledBlocks.ORANGE_TERRACOTTA_STAIRS, Blocks.DYED_TERRACOTTA.orange(), blockModelGenerators);
        createStandaloneSlab(ChiseledBlocks.ORANGE_TERRACOTTA_SLAB, Blocks.DYED_TERRACOTTA.orange(), blockModelGenerators);
        createStandaloneWall(ChiseledBlocks.ORANGE_TERRACOTTA_WALL, Blocks.DYED_TERRACOTTA.orange(), blockModelGenerators);
        blockModelGenerators.family(ChiseledBlocks.ORANGE_TERRACOTTA_BRICKS).stairs(ChiseledBlocks.ORANGE_TERRACOTTA_BRICK_STAIRS).slab(ChiseledBlocks.ORANGE_TERRACOTTA_BRICK_SLAB).wall(ChiseledBlocks.ORANGE_TERRACOTTA_BRICK_WALL);
        createStandaloneWall(ChiseledBlocks.YELLOW_CONCRETE_WALL, Blocks.CONCRETE.yellow(), blockModelGenerators);
        createStandaloneStairs(ChiseledBlocks.YELLOW_TERRACOTTA_STAIRS, Blocks.DYED_TERRACOTTA.yellow(), blockModelGenerators);
        createStandaloneSlab(ChiseledBlocks.YELLOW_TERRACOTTA_SLAB, Blocks.DYED_TERRACOTTA.yellow(), blockModelGenerators);
        createStandaloneWall(ChiseledBlocks.YELLOW_TERRACOTTA_WALL, Blocks.DYED_TERRACOTTA.yellow(), blockModelGenerators);
        blockModelGenerators.family(ChiseledBlocks.YELLOW_TERRACOTTA_BRICKS).stairs(ChiseledBlocks.YELLOW_TERRACOTTA_BRICK_STAIRS).slab(ChiseledBlocks.YELLOW_TERRACOTTA_BRICK_SLAB).wall(ChiseledBlocks.YELLOW_TERRACOTTA_BRICK_WALL);
        createStandaloneWall(ChiseledBlocks.LIME_CONCRETE_WALL, Blocks.CONCRETE.lime(), blockModelGenerators);
        createStandaloneStairs(ChiseledBlocks.LIME_TERRACOTTA_STAIRS, Blocks.DYED_TERRACOTTA.lime(), blockModelGenerators);
        createStandaloneSlab(ChiseledBlocks.LIME_TERRACOTTA_SLAB, Blocks.DYED_TERRACOTTA.lime(), blockModelGenerators);
        createStandaloneWall(ChiseledBlocks.LIME_TERRACOTTA_WALL, Blocks.DYED_TERRACOTTA.lime(), blockModelGenerators);
        blockModelGenerators.family(ChiseledBlocks.LIME_TERRACOTTA_BRICKS).stairs(ChiseledBlocks.LIME_TERRACOTTA_BRICK_STAIRS).slab(ChiseledBlocks.LIME_TERRACOTTA_BRICK_SLAB).wall(ChiseledBlocks.LIME_TERRACOTTA_BRICK_WALL);
        createStandaloneWall(ChiseledBlocks.GREEN_CONCRETE_WALL, Blocks.CONCRETE.green(), blockModelGenerators);
        createStandaloneStairs(ChiseledBlocks.GREEN_TERRACOTTA_STAIRS, Blocks.DYED_TERRACOTTA.green(), blockModelGenerators);
        createStandaloneSlab(ChiseledBlocks.GREEN_TERRACOTTA_SLAB, Blocks.DYED_TERRACOTTA.green(), blockModelGenerators);
        createStandaloneWall(ChiseledBlocks.GREEN_TERRACOTTA_WALL, Blocks.DYED_TERRACOTTA.green(), blockModelGenerators);
        blockModelGenerators.family(ChiseledBlocks.GREEN_TERRACOTTA_BRICKS).stairs(ChiseledBlocks.GREEN_TERRACOTTA_BRICK_STAIRS).slab(ChiseledBlocks.GREEN_TERRACOTTA_BRICK_SLAB).wall(ChiseledBlocks.GREEN_TERRACOTTA_BRICK_WALL);
        createStandaloneWall(ChiseledBlocks.CYAN_CONCRETE_WALL, Blocks.CONCRETE.cyan(), blockModelGenerators);
        createStandaloneStairs(ChiseledBlocks.CYAN_TERRACOTTA_STAIRS, Blocks.DYED_TERRACOTTA.cyan(), blockModelGenerators);
        createStandaloneSlab(ChiseledBlocks.CYAN_TERRACOTTA_SLAB, Blocks.DYED_TERRACOTTA.cyan(), blockModelGenerators);
        createStandaloneWall(ChiseledBlocks.CYAN_TERRACOTTA_WALL, Blocks.DYED_TERRACOTTA.cyan(), blockModelGenerators);
        blockModelGenerators.family(ChiseledBlocks.CYAN_TERRACOTTA_BRICKS).stairs(ChiseledBlocks.CYAN_TERRACOTTA_BRICK_STAIRS).slab(ChiseledBlocks.CYAN_TERRACOTTA_BRICK_SLAB).wall(ChiseledBlocks.CYAN_TERRACOTTA_BRICK_WALL);
        createStandaloneWall(ChiseledBlocks.LIGHT_BLUE_CONCRETE_WALL, Blocks.CONCRETE.lightBlue(), blockModelGenerators);
        createStandaloneStairs(ChiseledBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS, Blocks.DYED_TERRACOTTA.lightBlue(), blockModelGenerators);
        createStandaloneSlab(ChiseledBlocks.LIGHT_BLUE_TERRACOTTA_SLAB, Blocks.DYED_TERRACOTTA.lightBlue(), blockModelGenerators);
        createStandaloneWall(ChiseledBlocks.LIGHT_BLUE_TERRACOTTA_WALL, Blocks.DYED_TERRACOTTA.lightBlue(), blockModelGenerators);
        blockModelGenerators.family(ChiseledBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS).stairs(ChiseledBlocks.LIGHT_BLUE_TERRACOTTA_BRICK_STAIRS).slab(ChiseledBlocks.LIGHT_BLUE_TERRACOTTA_BRICK_SLAB).wall(ChiseledBlocks.LIGHT_BLUE_TERRACOTTA_BRICK_WALL);
        createStandaloneWall(ChiseledBlocks.BLUE_CONCRETE_WALL, Blocks.CONCRETE.blue(), blockModelGenerators);
        createStandaloneStairs(ChiseledBlocks.BLUE_TERRACOTTA_STAIRS, Blocks.DYED_TERRACOTTA.blue(), blockModelGenerators);
        createStandaloneSlab(ChiseledBlocks.BLUE_TERRACOTTA_SLAB, Blocks.DYED_TERRACOTTA.blue(), blockModelGenerators);
        createStandaloneWall(ChiseledBlocks.BLUE_TERRACOTTA_WALL, Blocks.DYED_TERRACOTTA.blue(), blockModelGenerators);
        blockModelGenerators.family(ChiseledBlocks.BLUE_TERRACOTTA_BRICKS).stairs(ChiseledBlocks.BLUE_TERRACOTTA_BRICK_STAIRS).slab(ChiseledBlocks.BLUE_TERRACOTTA_BRICK_SLAB).wall(ChiseledBlocks.BLUE_TERRACOTTA_BRICK_WALL);
        createStandaloneWall(ChiseledBlocks.PURPLE_CONCRETE_WALL, Blocks.CONCRETE.purple(), blockModelGenerators);
        createStandaloneStairs(ChiseledBlocks.PURPLE_TERRACOTTA_STAIRS, Blocks.DYED_TERRACOTTA.purple(), blockModelGenerators);
        createStandaloneSlab(ChiseledBlocks.PURPLE_TERRACOTTA_SLAB, Blocks.DYED_TERRACOTTA.purple(), blockModelGenerators);
        createStandaloneWall(ChiseledBlocks.PURPLE_TERRACOTTA_WALL, Blocks.DYED_TERRACOTTA.purple(), blockModelGenerators);
        blockModelGenerators.family(ChiseledBlocks.PURPLE_TERRACOTTA_BRICKS).stairs(ChiseledBlocks.PURPLE_TERRACOTTA_BRICK_STAIRS).slab(ChiseledBlocks.PURPLE_TERRACOTTA_BRICK_SLAB).wall(ChiseledBlocks.PURPLE_TERRACOTTA_BRICK_WALL);
        createStandaloneWall(ChiseledBlocks.MAGENTA_CONCRETE_WALL, Blocks.CONCRETE.magenta(), blockModelGenerators);
        createStandaloneStairs(ChiseledBlocks.MAGENTA_TERRACOTTA_STAIRS, Blocks.DYED_TERRACOTTA.magenta(), blockModelGenerators);
        createStandaloneSlab(ChiseledBlocks.MAGENTA_TERRACOTTA_SLAB, Blocks.DYED_TERRACOTTA.magenta(), blockModelGenerators);
        createStandaloneWall(ChiseledBlocks.MAGENTA_TERRACOTTA_WALL, Blocks.DYED_TERRACOTTA.magenta(), blockModelGenerators);
        blockModelGenerators.family(ChiseledBlocks.MAGENTA_TERRACOTTA_BRICKS).stairs(ChiseledBlocks.MAGENTA_TERRACOTTA_BRICK_STAIRS).slab(ChiseledBlocks.MAGENTA_TERRACOTTA_BRICK_SLAB).wall(ChiseledBlocks.MAGENTA_TERRACOTTA_BRICK_WALL);
        createStandaloneWall(ChiseledBlocks.PINK_CONCRETE_WALL, Blocks.CONCRETE.pink(), blockModelGenerators);
        createStandaloneStairs(ChiseledBlocks.PINK_TERRACOTTA_STAIRS, Blocks.DYED_TERRACOTTA.pink(), blockModelGenerators);
        createStandaloneSlab(ChiseledBlocks.PINK_TERRACOTTA_SLAB, Blocks.DYED_TERRACOTTA.pink(), blockModelGenerators);
        createStandaloneWall(ChiseledBlocks.PINK_TERRACOTTA_WALL, Blocks.DYED_TERRACOTTA.pink(), blockModelGenerators);
        blockModelGenerators.family(ChiseledBlocks.PINK_TERRACOTTA_BRICKS).stairs(ChiseledBlocks.PINK_TERRACOTTA_BRICK_STAIRS).slab(ChiseledBlocks.PINK_TERRACOTTA_BRICK_SLAB).wall(ChiseledBlocks.PINK_TERRACOTTA_BRICK_WALL);
    }

    @Override
    public void generateItemModels(@NonNull ItemModelGenerators itemModelGenerators) {}
}
