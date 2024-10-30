package dev.west.fantasymod.data.provider;

import dev.west.fantasymod.init.BlockInit;
import dev.west.fantasymod.init.ItemInit;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class FantasyBlockLootTableProvider  extends FabricBlockLootTableProvider {
    public FantasyBlockLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(BlockInit.MITHRIL_COBBLE);
        addDrop(BlockInit.MITHRIL_STONE);
        addDrop(BlockInit.MITHRIL_BRICK);
        addDrop(BlockInit.MITHRIL_ORE);
        addDrop(BlockInit.DWARF_COBBLE);
        addDrop(BlockInit.DWARF_ORE);
        addDrop(BlockInit.DWARFSTEEL_ORE);
        addDrop(BlockInit.DWARFSILVER_ORE);
        addDrop(BlockInit.DWARFTINE_ORE);
        addDrop(BlockInit.DWARF_STONE);
        addDrop(BlockInit.DWARF_BRICK);
        addDrop(BlockInit.DWARFWHITE_BRICK);
        addDrop(BlockInit.SUNELF_LOG);
        addDrop(BlockInit.SUNELF_LEAVES);

    }
}