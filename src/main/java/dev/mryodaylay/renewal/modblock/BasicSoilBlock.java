package dev.mryodaylay.renewal.modblock;

public class BasicSoilBlock extends SoilBlock {

    public BasicSoilBlock(Settings settings) {
        super(settings);

        setDefaultState(getDefaultState()
                .with(MOISTURE, 0)
        );
    }

}
