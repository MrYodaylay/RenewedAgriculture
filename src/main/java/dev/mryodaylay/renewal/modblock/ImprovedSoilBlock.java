package dev.mryodaylay.renewal.modblock;

public class ImprovedSoilBlock extends SoilBlock {

    public ImprovedSoilBlock(Settings settings) {
        super(settings);

        setDefaultState(getDefaultState()
                .with(MOISTURE, 0)
        );
    }

}
