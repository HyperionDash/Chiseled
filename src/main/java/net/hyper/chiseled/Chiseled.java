package net.hyper.chiseled;

import net.fabricmc.api.ModInitializer;

import net.hyper.chiseled.block.ModBlocks;
import net.hyper.chiseled.block.ModItemGroups;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Chiseled implements ModInitializer {
	public static final String MOD_ID = "chiseled";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Chiseling Bricks!");
		ModBlocks.initialize();
		ModItemGroups.registerItemGroups();
    }
}