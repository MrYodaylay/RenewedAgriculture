package dev.mryodaylay.renewal.modblock;

import dev.mryodaylay.renewal.Renewal;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.AbstractBlock.Settings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class ModBlocks {

    public static final Block PEAT;
    public static final Block POOR_SOIL;
    public static final Block BASIC_SOIL;
    public static final Block IMPROVED_SOIL;
    public static final Block RICH_SOIL;
    public static final Block PREMIUM_SOIL;

    static {
        PEAT = registerWithItem("peat", Block::new, Settings.copy(Blocks.ROOTED_DIRT));

        POOR_SOIL = registerWithItem("poor_soil", PoorSoilBlock::new, Settings.copy(Blocks.ROOTED_DIRT));
        BASIC_SOIL = registerWithItem("basic_soil", BasicSoilBlock::new, Settings.copy(Blocks.ROOTED_DIRT));
        IMPROVED_SOIL = registerWithItem("improved_soil", ImprovedSoilBlock::new, Settings.copy(Blocks.ROOTED_DIRT));
        RICH_SOIL = registerWithItem("rich_soil", RichSoilBlock::new, Settings.copy(Blocks.ROOTED_DIRT));
        PREMIUM_SOIL = registerWithItem("premium_soil", PremiumSoilBlock::new, Settings.copy(Blocks.ROOTED_DIRT));
    }


    private static Block register(String id, Function<AbstractBlock.Settings, Block> factory, Settings settings) {
        RegistryKey<Block> key = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Renewal.MOD_ID, id));
        Block block = factory.apply(settings.registryKey(key));
        return Registry.register(Registries.BLOCK, key, block);
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
