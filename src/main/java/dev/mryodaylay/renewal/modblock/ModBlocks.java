package dev.mryodaylay.renewal.modblock;

import dev.mryodaylay.renewal.Renewal;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.AbstractBlock.Settings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class ModBlocks {

    public static final Block PEAT;

    static {
        PEAT = registerWithItem("peat", Block::new, Settings.create().sounds(BlockSoundGroup.ROOTED_DIRT));
    }


    private static Block register(String id, Function<AbstractBlock.Settings, Block> factory, Settings settings) {
        RegistryKey<Block> key = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Renewal.MOD_ID, id));
        Block block = factory.apply(settings.registryKey(key));
        return (Block) Registry.register(Registries.BLOCK, key, block);
    }

    private static Block registerWithItem(String id, Function<AbstractBlock.Settings, Block> factory, Settings settings) {
        Block block = register(id, factory, settings);

        RegistryKey<Item> key = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Renewal.MOD_ID, id));
        Item item = new BlockItem(block, new Item.Settings().registryKey(key));
        Registry.register(Registries.ITEM, key, item);

        return block ;
    }

    public static void init() {
        ;
    }
}
