package com.szilard.shlurdmod.item;
import com.szilard.shlurdmod.Shlurdmod;
import com.szilard.shlurdmod.item.custom.ChiselItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item PINK_GARNET = registerItem("pink_garnet", new Item(new Item.Settings()));
    public static final Item RAW_PINK_GARNET = registerItem("raw_pink_garnet", new Item(new Item.Settings()));

    public static final Item CHISEL = registerItem("chisel", new ChiselItem(new Item.Settings().maxDamage(32)));

    public static final Item CAULIFLOWER = registerItem("cauliflower", new Item(new Item.Settings().food(ModFoodComponents.CAULIFLOWER)));

    public static final Item NEUTRON_STAR = registerItem("neutron_star", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Shlurdmod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Shlurdmod.LOGGER.info("Registering Mod Items for " + Shlurdmod.MOD_ID);
    }
}
