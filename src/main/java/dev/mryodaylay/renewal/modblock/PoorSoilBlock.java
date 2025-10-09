package dev.mryodaylay.renewal.modblock;

public class PoorSoilBlock extends SoilBlock {

    public PoorSoilBlock(Settings settings) {
        super(settings);

        setDefaultState(getDefaultState()
                .with(MOISTURE, 0)
        );
    }

}
