package net.hyper.chiseled.config;

import eu.midnightdust.lib.config.MidnightConfig;

public class ChiseledConfig extends MidnightConfig {
    @Entry public static boolean crackableBlocks = true;
    @Condition(requiredOption = "chiseled:crackableBlocks", visibleButLocked = true)
    @Entry public static boolean crackableBricks = true;
    @Condition(requiredOption = "chiseled:crackableBlocks", visibleButLocked = true)
    @Entry public static boolean crackableAmethyst = false;
}
