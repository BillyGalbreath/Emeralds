package net.pl3x.emeralds.item;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;
import net.pl3x.emeralds.Emeralds;
import net.pl3x.emeralds.item.tool.EmeraldAxe;
import net.pl3x.emeralds.item.tool.EmeraldHoe;
import net.pl3x.emeralds.item.tool.EmeraldPickaxe;
import net.pl3x.emeralds.item.tool.EmeraldSpade;
import net.pl3x.emeralds.item.tool.EmeraldSword;

import java.util.HashSet;
import java.util.Set;

public class ModItems {
    public static final Set<Item> __ITEMS__ = new HashSet<>();

    public static final EmeraldAxe EMERALD_AXE = new EmeraldAxe();
    public static final EmeraldHoe EMERALD_HOE = new EmeraldHoe();
    public static final EmeraldPickaxe EMERALD_PICKAXE = new EmeraldPickaxe();
    public static final EmeraldSpade EMERALD_SHOVEL = new EmeraldSpade();
    public static final EmeraldSword EMERALD_SWORD = new EmeraldSword();

    public static final EmeraldArmor EMERALD_BOOTS = new EmeraldArmor(EntityEquipmentSlot.FEET, "emerald_boots");
    public static final EmeraldArmor EMERALD_CHESTPLATE = new EmeraldArmor(EntityEquipmentSlot.CHEST, "emerald_chestplate");
    public static final EmeraldArmor EMERALD_HELMET = new EmeraldArmor(EntityEquipmentSlot.HEAD, "emerald_helmet");
    public static final EmeraldArmor EMERALD_LEGGINGS = new EmeraldArmor(EntityEquipmentSlot.LEGS, "emerald_leggings");

    public static void register(IForgeRegistry<Item> registry) {
        __ITEMS__.forEach(registry::register);
    }

    public static void registerModels() {
        __ITEMS__.forEach(item -> Emeralds.proxy.registerItemRenderer(item, 0, item.getUnlocalizedName().substring(5)));
    }
}
