package net.pl3x.emeralds.item.tool;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;
import net.pl3x.emeralds.item.ModItems;
import net.pl3x.emeralds.material.EmeraldMaterial;

public class EmeraldSword extends ItemSword {
    public static final String name = "emerald_sword";

    public EmeraldSword() {
        super(EmeraldMaterial.TOOL);
        setRegistryName(name);
        setUnlocalizedName(name);

        setCreativeTab(CreativeTabs.COMBAT);

        ModItems.__ITEMS__.add(this);
    }
}
