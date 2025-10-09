package dev.mryodaylay.renewal.modblock;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.storage.ReadView;
import net.minecraft.storage.WriteView;
import net.minecraft.util.math.BlockPos;

public class SoilBlockEntity extends BlockEntity {

    public SoilBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.SOIL_BLOCK_ENTITY_TYPE, pos, state);
    }


    private int NITROGEN = 0;
    private int PHOSPHOROUS = 0;
    private int POTASSIUM = 0;
    private int MINERALS = 0;


    @Override
    protected void readData(ReadView view) {
        super.readData(view);
        view.getInt("nitrogen", NITROGEN);
        view.getInt("phosphorous", PHOSPHOROUS);
        view.getInt("potassium", POTASSIUM);
        view.getInt("minerals", MINERALS);
    }

    @Override
    protected void writeData(WriteView view) {
        view.putInt("nitrogen", NITROGEN);
        view.putInt("phosphorous", PHOSPHOROUS);
        view.putInt("potassium", POTASSIUM);
        view.putInt("minerals", MINERALS);
        super.writeData(view);
    }

    public void update() {

    }
}
