package net.hyper.chiseled.registry;

import net.hyper.chiseled.Chiseled;
import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class ChiseledBlocks {
    public static final Block OAK_TRIM = registerBlock("oak_trim",
            properties -> new Block(properties
                    .mapColor(MapColor.OAK_TAN).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block VERTICAL_OAK_PLANKS = registerBlock("vertical_oak_planks",
            properties -> new Block(properties
                    .mapColor(MapColor.OAK_TAN).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block VERTICAL_OAK_STAIRS = registerBlock("vertical_oak_stairs",
            properties -> new StairsBlock(ChiseledBlocks.VERTICAL_OAK_PLANKS.getDefaultState(),properties
                    .mapColor(MapColor.OAK_TAN).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block VERTICAL_OAK_SLAB = registerBlock("vertical_oak_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.OAK_TAN).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable()));

    private static Block registerBlock(String name, Function<AbstractBlock.Settings, Block> function) {
        Block toRegister = function.apply(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Chiseled.MOD_ID, name))));
        registerBlockItem(name, toRegister);
        return Registry.register(Registries.BLOCK, Identifier.of(Chiseled.MOD_ID, name), toRegister);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(Chiseled.MOD_ID, name),
                new BlockItem(block, new Item.Settings().useBlockPrefixedTranslationKey()
                        .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Chiseled.MOD_ID, name)))));
    }

    public static void registerBlocks() {
        Chiseled.LOGGER.info("Chiseling Bricks");
    }
}