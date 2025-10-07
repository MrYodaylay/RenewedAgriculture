package dev.mryodaylay.renewal.modblock;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;

public abstract class SoilBlock extends Block {

    public static final IntProperty MOISTURE = IntProperty.of("moisture", 0, 7);
    //public static final IntProperty INTEGRITY = IntProperty.of("integrity", 0, 7);
    //public static final IntProperty VITALITY = IntProperty.of("vitality", 0, 7);
    //public static final IntProperty VIGOR = IntProperty.of("vigor", 0, 7);
    //public static final IntProperty BALANCE = IntProperty.of("balance", 0, 7);

    public SoilBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(MOISTURE);
        //builder.add(INTEGRITY);
        //builder.add(VITALITY);
        //builder.add(VIGOR);
        //builder.add(BALANCE);
    }

}
