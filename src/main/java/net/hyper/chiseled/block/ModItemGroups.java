package net.hyper.chiseled.block;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.hyper.chiseled.Chiseled;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup CHISELED = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Chiseled.MOD_ID, "chiseled"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.STONE_TILES))
                    .displayName(Text.translatable("itemgroup.chiseled.chiseled"))
                    .entries((displayContext, entries) -> {
                        entries.add(Blocks.STONE);
                        entries.add(Blocks.STONE_STAIRS);
                        entries.add(Blocks.STONE_SLAB);
                        entries.add(ModBlocks.STONE_WALL);
                        entries.add(Blocks.STONE_PRESSURE_PLATE);
                        entries.add(Blocks.STONE_BUTTON);
                        entries.add(Blocks.COBBLESTONE);
                        entries.add(Blocks.COBBLESTONE_STAIRS);
                        entries.add(Blocks.COBBLESTONE_SLAB);
                        entries.add(Blocks.COBBLESTONE_WALL);
                        entries.add(ModBlocks.POLISHED_STONE);
                        entries.add(ModBlocks.POLISHED_STONE_STAIRS);
                        entries.add(ModBlocks.POLISHED_STONE_SLAB);
                        entries.add(ModBlocks.POLISHED_STONE_WALL);
                        entries.add(ModBlocks.CRACKED_POLISHED_STONE);
                        entries.add(Blocks.STONE_BRICKS);
                        entries.add(Blocks.CRACKED_STONE_BRICKS);
                        entries.add(Blocks.STONE_BRICK_STAIRS);
                        entries.add(Blocks.STONE_BRICK_SLAB);
                        entries.add(Blocks.STONE_BRICK_WALL);
                        entries.add(Blocks.CHISELED_STONE_BRICKS);
                        entries.add(ModBlocks.CRACKED_CHISELED_STONE_BRICKS);
                        entries.add(ModBlocks.STONE_TILES);
                        entries.add(ModBlocks.CRACKED_STONE_TILES);
                        entries.add(ModBlocks.STONE_TILES_STAIRS);
                        entries.add(ModBlocks.STONE_TILE_SLAB);
                        entries.add(ModBlocks.STONE_TILE_WALL);
                        entries.add(ModBlocks.SMALL_STONE_BRICKS);
                        entries.add(ModBlocks.CRACKED_SMALL_STONE_BRICKS);
                        entries.add(ModBlocks.SMALL_STONE_BRICK_STAIRS);
                        entries.add(ModBlocks.SMALL_STONE_BRICK_SLAB);
                        entries.add(ModBlocks.SMALL_STONE_BRICK_WALL);
                        entries.add(ModBlocks.STACKED_STONE_BRICKS);
                        entries.add(ModBlocks.CRACKED_STACKED_STONE_BRICKS);
                        entries.add(ModBlocks.STACKED_STONE_BRICK_STAIRS);
                        entries.add(ModBlocks.STACKED_STONE_BRICK_SLAB);
                        entries.add(ModBlocks.STACKED_STONE_BRICK_WALL);
                        entries.add(Blocks.MOSSY_COBBLESTONE);
                        entries.add(Blocks.MOSSY_COBBLESTONE_STAIRS);
                        entries.add(Blocks.MOSSY_COBBLESTONE_SLAB);
                        entries.add(Blocks.MOSSY_COBBLESTONE_WALL);
                        entries.add(ModBlocks.MOSSY_POLISHED_STONE);
                        entries.add(ModBlocks.MOSSY_POLISHED_STONE_STAIRS);
                        entries.add(ModBlocks.MOSSY_POLISHED_STONE_SLAB);
                        entries.add(ModBlocks.MOSSY_POLISHED_STONE_WALL);
                        entries.add(Blocks.MOSSY_STONE_BRICKS);
                        entries.add(Blocks.MOSSY_STONE_BRICK_STAIRS);
                        entries.add(Blocks.MOSSY_STONE_BRICK_SLAB);
                        entries.add(Blocks.MOSSY_STONE_BRICK_WALL);
                        entries.add(ModBlocks.MOSSY_CHISELED_STONE_BRICKS);
                        entries.add(ModBlocks.MOSSY_STONE_TILES);
                        entries.add(ModBlocks.MOSSY_STONE_TILES_STAIRS);
                        entries.add(ModBlocks.MOSSY_STONE_TILE_SLAB);
                        entries.add(ModBlocks.MOSSY_STONE_TILE_WALL);
                        entries.add(ModBlocks.MOSSY_SMALL_STONE_BRICKS);
                        entries.add(ModBlocks.MOSSY_SMALL_STONE_BRICK_STAIRS);
                        entries.add(ModBlocks.MOSSY_SMALL_STONE_BRICK_SLAB);
                        entries.add(ModBlocks.MOSSY_SMALL_STONE_BRICK_WALL);
                        entries.add(ModBlocks.MOSSY_STACKED_STONE_BRICKS);
                        entries.add(ModBlocks.MOSSY_STACKED_STONE_BRICK_STAIRS);
                        entries.add(ModBlocks.MOSSY_STACKED_STONE_BRICK_SLAB);
                        entries.add(ModBlocks.MOSSY_STACKED_STONE_BRICK_WALL);
                    })
                    .build());

    public static void registerItemGroups() {
        Chiseled.LOGGER.info("Registering Item Groups for " + Chiseled.MOD_ID);
    }
}
