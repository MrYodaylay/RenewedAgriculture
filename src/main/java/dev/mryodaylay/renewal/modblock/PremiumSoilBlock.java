package dev.mryodaylay.renewal.modblock;

public class PremiumSoilBlock extends SoilBlock {

    public PremiumSoilBlock(Settings settings) {
        super(settings);

        setDefaultState(getDefaultState()
                .with(MOISTURE, 0)
        );
    }

}
