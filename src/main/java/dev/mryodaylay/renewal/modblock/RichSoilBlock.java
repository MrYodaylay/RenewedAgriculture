package dev.mryodaylay.renewal.modblock;

public class RichSoilBlock extends SoilBlock {

    public RichSoilBlock(Settings settings) {
        super(settings);

        setDefaultState(getDefaultState()
                .with(MOISTURE, 0)
        );
    }

}
