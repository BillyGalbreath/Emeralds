package net.pl3x.emeralds.item.tool;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;
import net.pl3x.emeralds.item.ModItems;
import net.pl3x.emeralds.material.EmeraldMaterial;

public class EmeraldSpade extends ItemSpade {
    public static final String name = "emerald_shovel";

    public EmeraldSpade() {
        super(EmeraldMaterial.TOOL);
        setRegistryName(name);
        setUnlocalizedName(name);

        setCreativeTab(CreativeTabs.TOOLS);

        ModItems.__ITEMS__.add(this);
    }
}
