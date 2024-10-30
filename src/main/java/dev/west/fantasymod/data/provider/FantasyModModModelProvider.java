package dev.west.fantasymod.data.provider;

import dev.west.fantasymod.init.BlockInit;
import dev.west.fantasymod.init.ItemInit;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class FantasyModModModelProvider  extends FabricModelProvider {
    public FantasyModModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(BlockInit.MITHRIL_COBBLE);
        blockStateModelGenerator.registerSimpleCubeAll(BlockInit.MITHRIL_STONE);
        blockStateModelGenerator.registerSimpleCubeAll(BlockInit.MITHRIL_BRICK);
        blockStateModelGenerator.registerSimpleCubeAll(BlockInit.MITHRIL_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(BlockInit.DWARF_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(BlockInit.DWARFSTEEL_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(BlockInit.DWARFSILVER_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(BlockInit.DWARFTINE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(BlockInit.DWARF_COBBLE);
        blockStateModelGenerator.registerSimpleCubeAll(BlockInit.DWARF_STONE);
        blockStateModelGenerator.registerSimpleCubeAll(BlockInit.DWARF_BRICK);
        blockStateModelGenerator.registerSimpleCubeAll(BlockInit.DWARFWHITE_BRICK);
        blockStateModelGenerator.registerSimpleCubeAll(BlockInit.SUNELF_LEAVES);



        blockStateModelGenerator.registerLog(BlockInit.SUNELF_LOG)
                .log(BlockInit.SUNELF_LOG);



    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ItemInit.MITHRIL_ITEM, Models.GENERATED);
        itemModelGenerator.register(ItemInit.RAW_MITHRIL_ITEM, Models.GENERATED);
        itemModelGenerator.register(ItemInit.DWARFRUDY_ITEM, Models.GENERATED);
        itemModelGenerator.register(ItemInit.DWARFIRON_ITEM, Models.GENERATED);
    }
}
