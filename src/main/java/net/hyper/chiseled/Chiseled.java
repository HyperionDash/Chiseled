package net.hyper.chiseled;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.resource.v1.ResourceLoader;
import net.fabricmc.fabric.api.resource.v1.pack.PackActivationType;
import net.fabricmc.loader.api.FabricLoader;
import net.hyper.chiseled.registry.*;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.function.Function;

public class Chiseled implements ModInitializer {
	public static final String MOD_ID = "chiseled";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	private static Item registerItem(String name, Function<Item.Properties, Item> function) {
		return Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(MOD_ID, name),
				function.apply(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(MOD_ID, name)))));
	}

	@Override
	public void onInitialize() {
		ChiseledCreativeModeTabs.init();
		ChiseledBlocks.init();

		final Item NETHERITE_STAIRS = registerItem("netherite_stairs",
				properties -> new BlockItem(ChiseledBlocks.NETHERITE_STAIRS, properties.fireResistant().useBlockDescriptionPrefix()));

		LOGGER.info("Chiseling Bricks");
		FabricLoader.getInstance().getModContainer(MOD_ID).ifPresent(modContainer ->
				ResourceLoader.registerBuiltinPack(Identifier.fromNamespaceAndPath(MOD_ID,"data_overrides"), modContainer,
						Component.translatable("text.chiseled.data_overrides"),PackActivationType.ALWAYS_ENABLED));
	}
}