package net.hyper.chiseled.registry;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.hyper.chiseled.Chiseled;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ChiseledItemGroups {
    public static final ItemGroup CHISELED = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Chiseled.MOD_ID, "chiseled"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ChiseledBlocks.POLISHED_STONE))
                    .displayName(Text.translatable("itemgroup.chiseled.chiseled"))
                    .entries((displayContext, entries) -> {
                        entries.add(ChiseledBlocks.OAK_TRIM);
                        entries.add(ChiseledBlocks.VERTICAL_OAK_PLANKS);
                        entries.add(ChiseledBlocks.VERTICAL_OAK_STAIRS);
                        entries.add(ChiseledBlocks.VERTICAL_OAK_SLAB);
                        entries.add(ChiseledBlocks.SPRUCE_TRIM);
                        entries.add(ChiseledBlocks.VERTICAL_SPRUCE_PLANKS);
                        entries.add(ChiseledBlocks.VERTICAL_SPRUCE_STAIRS);
                        entries.add(ChiseledBlocks.VERTICAL_SPRUCE_SLAB);
                        entries.add(ChiseledBlocks.BIRCH_TRIM);
                        entries.add(ChiseledBlocks.VERTICAL_BIRCH_PLANKS);
                        entries.add(ChiseledBlocks.VERTICAL_BIRCH_STAIRS);
                        entries.add(ChiseledBlocks.VERTICAL_BIRCH_SLAB);
                        entries.add(ChiseledBlocks.JUNGLE_TRIM);
                        entries.add(ChiseledBlocks.VERTICAL_JUNGLE_PLANKS);
                        entries.add(ChiseledBlocks.VERTICAL_JUNGLE_STAIRS);
                        entries.add(ChiseledBlocks.VERTICAL_JUNGLE_SLAB);
                        entries.add(ChiseledBlocks.ACACIA_TRIM);
                        entries.add(ChiseledBlocks.VERTICAL_ACACIA_PLANKS);
                        entries.add(ChiseledBlocks.VERTICAL_ACACIA_STAIRS);
                        entries.add(ChiseledBlocks.VERTICAL_ACACIA_SLAB);
                        entries.add(ChiseledBlocks.DARK_OAK_TRIM);
                        entries.add(ChiseledBlocks.VERTICAL_DARK_OAK_PLANKS);
                        entries.add(ChiseledBlocks.VERTICAL_DARK_OAK_STAIRS);
                        entries.add(ChiseledBlocks.VERTICAL_DARK_OAK_SLAB);
                        entries.add(ChiseledBlocks.MANGROVE_TRIM);
                        entries.add(ChiseledBlocks.VERTICAL_MANGROVE_PLANKS);
                        entries.add(ChiseledBlocks.VERTICAL_MANGROVE_STAIRS);
                        entries.add(ChiseledBlocks.VERTICAL_MANGROVE_SLAB);
                        entries.add(ChiseledBlocks.CHERRY_TRIM);
                        entries.add(ChiseledBlocks.VERTICAL_CHERRY_PLANKS);
                        entries.add(ChiseledBlocks.VERTICAL_CHERRY_STAIRS);
                        entries.add(ChiseledBlocks.VERTICAL_CHERRY_SLAB);
                        entries.add(ChiseledBlocks.PALE_OAK_TRIM);
                        entries.add(ChiseledBlocks.VERTICAL_PALE_OAK_PLANKS);
                        entries.add(ChiseledBlocks.VERTICAL_PALE_OAK_STAIRS);
                        entries.add(ChiseledBlocks.VERTICAL_PALE_OAK_SLAB);
                        entries.add(ChiseledBlocks.BAMBOO_TRIM);
                        entries.add(ChiseledBlocks.VERTICAL_BAMBOO_PLANKS);
                        entries.add(ChiseledBlocks.VERTICAL_BAMBOO_STAIRS);
                        entries.add(ChiseledBlocks.VERTICAL_BAMBOO_SLAB);
                        entries.add(ChiseledBlocks.CRIMSON_TRIM);
                        entries.add(ChiseledBlocks.VERTICAL_CRIMSON_PLANKS);
                        entries.add(ChiseledBlocks.VERTICAL_CRIMSON_STAIRS);
                        entries.add(ChiseledBlocks.VERTICAL_CRIMSON_SLAB);
                        entries.add(ChiseledBlocks.WARPED_TRIM);
                        entries.add(ChiseledBlocks.VERTICAL_WARPED_PLANKS);
                        entries.add(ChiseledBlocks.VERTICAL_WARPED_STAIRS);
                        entries.add(ChiseledBlocks.VERTICAL_WARPED_SLAB);

                        entries.add(ChiseledBlocks.STONE_WALL);
                        entries.add(ChiseledBlocks.POLISHED_STONE);
                        entries.add(ChiseledBlocks.POLISHED_STONE_STAIRS);
                        entries.add(ChiseledBlocks.POLISHED_STONE_SLAB);
                        entries.add(ChiseledBlocks.POLISHED_STONE_WALL);
                        entries.add(ChiseledBlocks.MOSSY_POLISHED_STONE);
                        entries.add(ChiseledBlocks.MOSSY_POLISHED_STONE_STAIRS);
                        entries.add(ChiseledBlocks.MOSSY_POLISHED_STONE_SLAB);
                        entries.add(ChiseledBlocks.MOSSY_POLISHED_STONE_WALL);
                        entries.add(ChiseledBlocks.SMOOTH_STONE_STAIRS);
                    }).build());

    public static void registerItemGroups() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.addAfter(Blocks.OAK_PLANKS, ChiseledBlocks.OAK_TRIM,
                    ChiseledBlocks.VERTICAL_OAK_PLANKS);
            entries.addAfter(Blocks.OAK_STAIRS, ChiseledBlocks.VERTICAL_OAK_STAIRS);
            entries.addAfter(Blocks.OAK_SLAB, ChiseledBlocks.VERTICAL_OAK_SLAB);
            entries.addAfter(Blocks.SPRUCE_PLANKS, ChiseledBlocks.SPRUCE_TRIM,
                    ChiseledBlocks.VERTICAL_SPRUCE_PLANKS);
            entries.addAfter(Blocks.SPRUCE_STAIRS, ChiseledBlocks.VERTICAL_SPRUCE_STAIRS);
            entries.addAfter(Blocks.SPRUCE_SLAB, ChiseledBlocks.VERTICAL_SPRUCE_SLAB);
            entries.addAfter(Blocks.BIRCH_PLANKS, ChiseledBlocks.BIRCH_TRIM,
                    ChiseledBlocks.VERTICAL_BIRCH_PLANKS);
            entries.addAfter(Blocks.BIRCH_STAIRS, ChiseledBlocks.VERTICAL_BIRCH_STAIRS);
            entries.addAfter(Blocks.BIRCH_SLAB, ChiseledBlocks.VERTICAL_BIRCH_SLAB);
            entries.addAfter(Blocks.JUNGLE_PLANKS, ChiseledBlocks.JUNGLE_TRIM,
                    ChiseledBlocks.VERTICAL_JUNGLE_PLANKS);
            entries.addAfter(Blocks.JUNGLE_STAIRS, ChiseledBlocks.VERTICAL_JUNGLE_STAIRS);
            entries.addAfter(Blocks.JUNGLE_SLAB, ChiseledBlocks.VERTICAL_JUNGLE_SLAB);
            entries.addAfter(Blocks.ACACIA_PLANKS, ChiseledBlocks.ACACIA_TRIM,
                    ChiseledBlocks.VERTICAL_ACACIA_PLANKS);
            entries.addAfter(Blocks.ACACIA_STAIRS, ChiseledBlocks.VERTICAL_ACACIA_STAIRS);
            entries.addAfter(Blocks.ACACIA_SLAB, ChiseledBlocks.VERTICAL_ACACIA_SLAB);
            entries.addAfter(Blocks.DARK_OAK_PLANKS, ChiseledBlocks.DARK_OAK_TRIM,
                    ChiseledBlocks.VERTICAL_DARK_OAK_PLANKS);
            entries.addAfter(Blocks.DARK_OAK_STAIRS, ChiseledBlocks.VERTICAL_DARK_OAK_STAIRS);
            entries.addAfter(Blocks.DARK_OAK_SLAB, ChiseledBlocks.VERTICAL_DARK_OAK_SLAB);
            entries.addAfter(Blocks.MANGROVE_PLANKS, ChiseledBlocks.MANGROVE_TRIM,
                    ChiseledBlocks.VERTICAL_MANGROVE_PLANKS);
            entries.addAfter(Blocks.MANGROVE_STAIRS, ChiseledBlocks.VERTICAL_MANGROVE_STAIRS);
            entries.addAfter(Blocks.MANGROVE_SLAB, ChiseledBlocks.VERTICAL_MANGROVE_SLAB);
            entries.addAfter(Blocks.CHERRY_PLANKS, ChiseledBlocks.CHERRY_TRIM,
                    ChiseledBlocks.VERTICAL_CHERRY_PLANKS);
            entries.addAfter(Blocks.CHERRY_STAIRS, ChiseledBlocks.VERTICAL_CHERRY_STAIRS);
            entries.addAfter(Blocks.CHERRY_SLAB, ChiseledBlocks.VERTICAL_CHERRY_SLAB);
            entries.addAfter(Blocks.PALE_OAK_PLANKS, ChiseledBlocks.PALE_OAK_TRIM,
                    ChiseledBlocks.VERTICAL_PALE_OAK_PLANKS);
            entries.addAfter(Blocks.PALE_OAK_STAIRS, ChiseledBlocks.VERTICAL_PALE_OAK_STAIRS);
            entries.addAfter(Blocks.PALE_OAK_SLAB, ChiseledBlocks.VERTICAL_PALE_OAK_SLAB);
            entries.addAfter(Blocks.BAMBOO_PLANKS, ChiseledBlocks.BAMBOO_TRIM,
                    ChiseledBlocks.VERTICAL_BAMBOO_PLANKS);
            entries.addAfter(Blocks.BAMBOO_STAIRS, ChiseledBlocks.VERTICAL_BAMBOO_STAIRS);
            entries.addAfter(Blocks.BAMBOO_SLAB, ChiseledBlocks.VERTICAL_BAMBOO_SLAB);
            entries.addAfter(Blocks.CRIMSON_PLANKS, ChiseledBlocks.CRIMSON_TRIM,
                    ChiseledBlocks.VERTICAL_CRIMSON_PLANKS);
            entries.addAfter(Blocks.CRIMSON_STAIRS, ChiseledBlocks.VERTICAL_CRIMSON_STAIRS);
            entries.addAfter(Blocks.CRIMSON_SLAB, ChiseledBlocks.VERTICAL_CRIMSON_SLAB);
            entries.addAfter(Blocks.WARPED_PLANKS, ChiseledBlocks.WARPED_TRIM,
                    ChiseledBlocks.VERTICAL_WARPED_PLANKS);
            entries.addAfter(Blocks.WARPED_STAIRS, ChiseledBlocks.VERTICAL_WARPED_STAIRS);
            entries.addAfter(Blocks.WARPED_SLAB, ChiseledBlocks.VERTICAL_WARPED_SLAB);

            entries.addAfter(Blocks.STONE_SLAB, ChiseledBlocks.STONE_WALL);
            entries.addAfter(Blocks.MOSSY_COBBLESTONE_WALL, ChiseledBlocks.POLISHED_STONE,
                    ChiseledBlocks.POLISHED_STONE_STAIRS,
                    ChiseledBlocks.POLISHED_STONE_SLAB,
                    ChiseledBlocks.POLISHED_STONE_WALL,
                    ChiseledBlocks.MOSSY_POLISHED_STONE,
                    ChiseledBlocks.MOSSY_POLISHED_STONE_STAIRS,
                    ChiseledBlocks.MOSSY_POLISHED_STONE_SLAB,
                    ChiseledBlocks.MOSSY_POLISHED_STONE_WALL);
            entries.addAfter(Blocks.SMOOTH_STONE, ChiseledBlocks.SMOOTH_STONE_STAIRS);
        });
    }
}