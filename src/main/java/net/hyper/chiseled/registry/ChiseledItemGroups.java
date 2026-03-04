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
            FabricItemGroup.builder().icon(() -> new ItemStack(ChiseledBlocks.OAK_TRIM))
                    .displayName(Text.translatable("itemgroup.chiseled.chiseled"))
                    .entries((displayContext, entries) -> {
                        entries.add(ChiseledBlocks.OAK_TRIM);
                        entries.add(ChiseledBlocks.VERTICAL_OAK_PLANKS);
                        entries.add(ChiseledBlocks.VERTICAL_OAK_STAIRS);
                        entries.add(ChiseledBlocks.VERTICAL_OAK_SLAB);
                    }).build());

    public static void registerItemGroups() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.addAfter(Blocks.OAK_PLANKS, ChiseledBlocks.OAK_TRIM, ChiseledBlocks.VERTICAL_OAK_PLANKS);
            entries.addAfter(Blocks.OAK_STAIRS, ChiseledBlocks.VERTICAL_OAK_STAIRS);
            entries.addAfter(Blocks.OAK_SLAB, ChiseledBlocks.VERTICAL_OAK_SLAB);
        });
    }
}