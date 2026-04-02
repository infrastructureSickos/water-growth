package com.infrastructuresickos.water_growth;

import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("water_growth")
public class WaterGrowth {
    public static final Logger LOGGER = LogManager.getLogger();

    public WaterGrowth() {
        LOGGER.info("WaterGrowth mod initialized");
    }
}
