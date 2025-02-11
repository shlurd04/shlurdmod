package com.szilard.shlurdmod.item;

import com.szilard.shlurdmod.Shlurdmod;
import com.szilard.shlurdmod.block.ModBlocks;
import com.szilard.shlurdmod.item.custom.ChiselItem;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup PINK_GARNET_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Shlurdmod.MOD_ID, "pink_garnet_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.PINK_GARNET))
                    .displayName(Text.translatable("itemgroup.shlurdmod.pink_garnet_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.PINK_GARNET);
                        entries.add(ModItems.RAW_PINK_GARNET);
                    }).build());

    public static final ItemGroup PINK_GARNET_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Shlurdmod.MOD_ID, "pink_garnet_blocks"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.PINK_GARNET_BLOCK))
                    .displayName(Text.translatable("itemgroup.shlurdmod.pink_garnet_blocks"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.PINK_GARNET_BLOCK);
                        entries.add(ModBlocks.RAW_PINK_GARNET_BLOCK);
                        entries.add(ModBlocks.PINK_GARNET_ORE);
                        entries.add(ModBlocks.PINK_GARNET_DEEPSLATE_ORE);
                        entries.add(ModBlocks.MAGIC_BLOCK);
                    }).build());

    public static final ItemGroup SHLURDMOD_ITEMS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Shlurdmod.MOD_ID, "shlurdmod_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.CHISEL))
                    .displayName(Text.translatable("itemgroup.shlurdmod.shlurdmod_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.CHISEL);
                    }).build());

    public static final ItemGroup SHLURDMOD_FOOD = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Shlurdmod.MOD_ID, "shlurdmod_food"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.CAULIFLOWER))
                    .displayName(Text.translatable("itemgroup.shlurdmod.shlurdmod_food"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.CAULIFLOWER);
                    }).build());

    public static final ItemGroup SHLURDMOD_INGREDIENTS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Shlurdmod.MOD_ID, "shlurdmod_ingredients"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.NEUTRON_STAR))
                    .displayName(Text.translatable("itemgroup.shlurdmod.shlurdmod_ingredients"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.NEUTRON_STAR);
                    }).build());

    public static void registerItemGroups() {

        Shlurdmod.LOGGER.info("Registering Item Groups for : " + Shlurdmod.MOD_ID);
    }
}
