package net.pl3x.emeralds.material;

import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;
import net.pl3x.emeralds.Emeralds;

public class EmeraldMaterial {
    public static final ItemArmor.ArmorMaterial ARMOR = EnumHelper.addArmorMaterial("EMERALD", Emeralds.modId + ":emerald", 35, new int[]{4, 9, 13, 4}, 25, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 3);
    public static final Item.ToolMaterial TOOL = EnumHelper.addToolMaterial("EMERALD", 4, 1776, 10, 4, 22);
}
