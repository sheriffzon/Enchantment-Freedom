package com.sheriffzon.enchantmentfreedom;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EnchantmentFreedom implements ModInitializer {

    public static final String MOD_ID = "enchantment_freedom";

    public static final Logger LOGGER =
            LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Enchantment Freedom has loaded!");
    }
}
