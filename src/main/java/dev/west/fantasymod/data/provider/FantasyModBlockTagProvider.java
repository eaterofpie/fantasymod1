package dev.west.fantasymod.data.provider;

import dev.west.fantasymod.init.BlockInit;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class FantasyModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public FantasyModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(BlockInit.MITHRIL_STONE)
                .add(BlockInit.MITHRIL_BRICK)
                .add(BlockInit.DWARF_COBBLE)
                .add(BlockInit.DWARF_STONE)
                .add(BlockInit.DWARF_BRICK)
                .add(BlockInit.DWARFWHITE_BRICK)
                .add(BlockInit.MITHRIL_COBBLE);



        getOrCreateTagBuilder(BlockTags.COPPER_ORES)
                .add(BlockInit.DWARFTINE_ORE)
                .add(BlockInit.DWARFSILVER_ORE)
                .add(BlockInit.DWARF_ORE)
                .add(BlockInit.DWARFSTEEL_ORE)
                .add(BlockInit.MITHRIL_ORE);

        getOrCreateTagBuilder(BlockTags.LOGS)
                .add(BlockInit.SUNELF_LOG);


        getOrCreateTagBuilder(BlockTags.LEAVES)
                .add(BlockInit.SUNELF_LEAVES);
    }
}