package net.pl3x.emeralds.item.tool;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemHoe;
import net.pl3x.emeralds.item.ModItems;
import net.pl3x.emeralds.material.EmeraldMaterial;

public class EmeraldHoe extends ItemHoe {
    public static final String name = "emerald_hoe";

    public EmeraldHoe() {
        super(EmeraldMaterial.TOOL);
        setRegistryName(name);
        setUnlocalizedName(name);

        setCreativeTab(CreativeTabs.TOOLS);

        ModItems.__ITEMS__.add(this);
    }
}
