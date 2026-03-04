package net.hyper.chiseled.registry;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.hyper.chiseled.Chiseled;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ChiseledItemGroups {
    public static final ItemGroup CHISELED = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Chiseled.MOD_ID, "chiseled"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ChiseledBlocks.OAK_TRIM))
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
                    }).build());

    public static void registerItemGroups() {
    }
}