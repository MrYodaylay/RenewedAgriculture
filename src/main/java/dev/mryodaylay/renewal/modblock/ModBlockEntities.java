package dev.mryodaylay.renewal.modblock;

import dev.mryodaylay.renewal.Renewal;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.Block;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlockEntities {

    public static final BlockEntityType<SoilBlockEntity> SOIL_BLOCK_ENTITY_TYPE;

    static {
        SOIL_BLOCK_ENTITY_TYPE = register("soil", SoilBlockEntity::new,
                ModBlocks.POOR_SOIL,
                ModBlocks.BASIC_SOIL,
                ModBlocks.IMPROVED_SOIL,
                ModBlocks.RICH_SOIL,
                ModBlocks.PREMIUM_SOIL
        );
    }

    private static <T extends BlockEntity> BlockEntityType<T> register(
            String id, FabricBlockEntityTypeBuilder.Factory<? extends T> entityFactory, Block... blocks) {
        return Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(Renewal.MOD_ID, id), FabricBlockEntityTypeBuilder.<T>create(entityFactory, blocks).build());
    }

    public static void init() {
        ;
    }
}
