package dev.mryodaylay.renewal;

import dev.mryodaylay.renewal.modblock.ModBlocks;
import net.fabricmc.api.ModInitializer;

public class Renewal implements ModInitializer {

    public static final String MOD_ID = "renewal";

    @Override
    public void onInitialize() {

        ModBlocks.init();

    }
}
