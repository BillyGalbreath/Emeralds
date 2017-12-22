package net.pl3x.emeralds.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.pl3x.emeralds.material.EmeraldMaterial;

public class EmeraldArmor extends net.minecraft.item.ItemArmor {
    public EmeraldArmor(EntityEquipmentSlot slot, String name) {
        super(EmeraldMaterial.ARMOR, 0, slot);
        setRegistryName(name);
        setUnlocalizedName(name);

        setCreativeTab(CreativeTabs.COMBAT);

        ModItems.__ITEMS__.add(this);
    }
}
