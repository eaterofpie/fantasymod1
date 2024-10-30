package dev.west.fantasymod.init;

import dev.west.fantasymod.FantasyMod;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class ItemInit {
    public static final Item MITHRIL_ITEM = register("mithril_item", new Item(new Item.Settings()));
    public static final Item RAW_MITHRIL_ITEM = register("raw_mithril_item", new Item(new Item.Settings()));
    public static final Item DWARFRUDY_ITEM = register("dwarfrudy_item", new Item(new Item.Settings()));
    public static final Item DWARFIRON_ITEM = register("dwarfiron_item", new Item(new Item.Settings()));
    public static <T extends Item> T register(String name, T item) {
        return Registry.register(Registries.ITEM, FantasyMod.id( name) ,item);
    }

    public static void load() {}
}
