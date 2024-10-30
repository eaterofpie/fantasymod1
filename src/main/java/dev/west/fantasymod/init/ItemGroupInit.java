package dev.west.fantasymod.init;


import dev.west.fantasymod.FantasyMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;

import java.util.Optional;

public class ItemGroupInit {
    public static final Text FANTASY_TITLE = Text.translatable("itemGroup." + FantasyMod.MOD_ID + ".fantasy_group");

    public static final ItemGroup FANTASY_GROUP = register("fantasy_group", FabricItemGroup.builder()
            .displayName(FANTASY_TITLE)
            .icon(ItemInit.MITHRIL_ITEM::getDefaultStack)
            .entries((displayContext, entries) -> Registries.ITEM.getIds()
                    .stream()
                    .filter(key ->key.getNamespace().equals(FantasyMod.MOD_ID))
                    .map(Registries.ITEM::getOrEmpty)
                    .map(Optional::orElseThrow)
                    .forEach(entries::add))
            .build());



    public static <T extends ItemGroup> T register(String name, T itemGroup) {
        return Registry.register(Registries.ITEM_GROUP, FantasyMod.id(name), itemGroup);
    }


    public static void load() {}
}


