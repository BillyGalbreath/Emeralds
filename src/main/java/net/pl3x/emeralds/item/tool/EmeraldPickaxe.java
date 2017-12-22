package net.pl3x.emeralds.item.tool;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;
import net.pl3x.emeralds.item.ModItems;
import net.pl3x.emeralds.material.EmeraldMaterial;

public class EmeraldPickaxe extends ItemPickaxe {
    public static final String name = "emerald_pickaxe";

    public EmeraldPickaxe() {
        super(EmeraldMaterial.TOOL);
        setRegistryName(name);
        setUnlocalizedName(name);

        setCreativeTab(CreativeTabs.TOOLS);

        ModItems.__ITEMS__.add(this);
    }
}
