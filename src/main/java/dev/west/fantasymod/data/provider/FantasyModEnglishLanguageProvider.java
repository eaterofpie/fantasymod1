package dev.west.fantasymod.data.provider;

import dev.west.fantasymod.FantasyMod;
import dev.west.fantasymod.init.BlockInit;
import dev.west.fantasymod.init.ItemInit;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableTextContent;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class FantasyModEnglishLanguageProvider extends FabricLanguageProvider {


    public FantasyModEnglishLanguageProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }
    private static void addText(@NotNull TranslationBuilder builder, @NotNull Text text, @NotNull String value) {
        if (text.getContent() instanceof TranslatableTextContent translatableTextContent) {
            builder.add(translatableTextContent.getKey(), value);
        } else {
            FantasyMod.LOGGER.warn("Failed to add translation for text: {}", text.getString());
        }
    }


    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup registryLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add(ItemInit.MITHRIL_ITEM, "mithril_item");
        translationBuilder.add(ItemInit.RAW_MITHRIL_ITEM, "raw_mithril_item");
        translationBuilder.add(ItemInit.DWARFRUDY_ITEM, "dwarfrudy_item");
        translationBuilder.add(BlockInit.MITHRIL_COBBLE, "mithril_cobble");
        translationBuilder.add(BlockInit.MITHRIL_STONE, "mithril_stone");
        translationBuilder.add(BlockInit.MITHRIL_BRICK, "mithril_brick");
        translationBuilder.add(BlockInit.MITHRIL_ORE, "mithril_ore");
        translationBuilder.add(BlockInit.DWARF_ORE, "dwarf_ore");
        translationBuilder.add(BlockInit.DWARF_COBBLE, "dwarf_cobble");
        translationBuilder.add(BlockInit.DWARFSTEEL_ORE, "dwarfsteel_ore");
        translationBuilder.add(BlockInit.DWARFSILVER_ORE, "dwarfsilver_ore");
        translationBuilder.add(BlockInit.DWARFTINE_ORE, "dwarftine_ore");
        translationBuilder.add(BlockInit.DWARF_STONE, "dwarf_stone");
        translationBuilder.add(BlockInit.DWARF_BRICK, "dwarf_brick");
        translationBuilder.add(BlockInit.DWARFWHITE_BRICK, "dwarfwhite_brick");
        translationBuilder.add(BlockInit.SUNELF_LOG, "sunelf_log");
        translationBuilder.add(BlockInit.SUNELF_LEAVES,"sunelf_leaves");


    }
}
