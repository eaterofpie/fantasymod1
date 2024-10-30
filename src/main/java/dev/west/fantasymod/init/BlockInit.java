package dev.west.fantasymod.init;

import dev.west.fantasymod.FantasyMod;
import net.minecraft.block.*;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;

public class BlockInit {
    public static final Block MITHRIL_COBBLE =registerWithItem("mithril_cobble",
            new Block(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool().luminance(state -> 8)));
    public static final Block MITHRIL_ORE =registerWithItem("mithril_ore",
            new Block(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool().luminance(state -> 6)));
    public static final Block MITHRIL_STONE =registerWithItem("mithril_stone",
            new Block(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block DWARF_STONE =registerWithItem("dwarf_stone",
            new Block(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block DWARF_BRICK =registerWithItem("dwarf_brick",
            new Block(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block MITHRIL_BRICK =registerWithItem("mithril_brick",
            new Block(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block DWARF_COBBLE =registerWithItem("dwarf_cobble",
            new Block(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block DWARFWHITE_BRICK =registerWithItem("dwarfwhite_stone",
            new Block(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block DWARF_ORE =registerWithItem("dwarf_ore",
            new Block(AbstractBlock.Settings.create().strength(1.3F, 6.0F).requiresTool().luminance(state -> 8)));
    public static final Block DWARFSTEEL_ORE =registerWithItem("dwarfsteel_ore",
            new Block(AbstractBlock.Settings.create().strength(1.3F, 6.0F).requiresTool().luminance(state -> 5)));
    public static final Block DWARFSILVER_ORE =registerWithItem("dwarfsilver_ore",
            new Block(AbstractBlock.Settings.create().strength(1.3F, 6.0F).requiresTool().luminance(state -> 5)));
    public static final Block DWARFTINE_ORE =registerWithItem("dwarftine_ore",
            new Block(AbstractBlock.Settings.create().strength(1.3F, 6.0F).requiresTool().luminance(state -> 5)));
    public static final Block SUNELF_LOG =registerWithItem("sunelf_log",
            new PillarBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool().luminance(state -> 8)));
    public static final LeavesBlock SUNELF_LEAVES = registerWithItem("sunelf_leaves",
            new LeavesBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.PINK)
                    .strength(0.2F)
                    .ticksRandomly()
                    .sounds(BlockSoundGroup.GRASS)
                    .nonOpaque()
                    .allowsSpawning(Blocks::canSpawnOnLeaves)
                    .suffocates(Blocks::never)
                    .blockVision(Blocks::never)
                    .burnable()
                    .pistonBehavior(PistonBehavior.DESTROY)
                    .solidBlock(Blocks::never)));
    public static <T extends Block> T register(String name, T block) {
        return Registry.register(Registries.BLOCK, FantasyMod.id(name), block);
    }

    public static <T extends Block> T registerWithItem(String name, T block, Item.Settings settings) {
        T registered = register(name, block);
        ItemInit.register(name, new BlockItem(registered, settings));
        return registered;
    }

    public static <T extends Block> T registerWithItem(String name, T block) {
        return registerWithItem(name, block, new Item.Settings());
    }
    public static void load() {
    }
}

