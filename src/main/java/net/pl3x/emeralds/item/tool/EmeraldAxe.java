package net.pl3x.emeralds.item.tool;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;
import net.pl3x.emeralds.item.ModItems;
import net.pl3x.emeralds.material.EmeraldMaterial;

public class EmeraldAxe extends ItemAxe {
    public static final String name = "emerald_axe";

    public EmeraldAxe() {
        super(EmeraldMaterial.TOOL, 8f, -3.1f);
        setRegistryName(name);
        setUnlocalizedName(name);

        setCreativeTab(CreativeTabs.TOOLS);

        ModItems.__ITEMS__.add(this);
    }
}
