package net.hyper.chiseled.block;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.hyper.chiseled.Chiseled;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup CHISELED = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Chiseled.MOD_ID, "chiseled"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.TEST_BLOCK))
                    .displayName(Text.translatable("itemgroup.chiseled.chiseled"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.TEST_BLOCK);
                        entries.add(ModBlocks.TEST_BLOCK_STAIRS);
                        entries.add(ModBlocks.TEST_BLOCK_SLAB);
                        entries.add(ModBlocks.TEST_BLOCK_WALL);
                    })
                    .build());

    public static void registerItemGroups() {
        Chiseled.LOGGER.info("Registering Item Groups for" + Chiseled.MOD_ID);
    }
}
