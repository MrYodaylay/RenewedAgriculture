package dev.mryodaylay.renewal.modblock;

public class BasicSoilBlock extends SoilBlock {

    public BasicSoilBlock(Settings settings) {
        super(settings);

        setDefaultState(getDefaultState()
                .with(MOISTURE, 0)
                //.with(INTEGRITY, 7)
                //.with(VITALITY, 7)
                //.with(VIGOR, 7)
                //.with(BALANCE, 7)
        );
    }

}
