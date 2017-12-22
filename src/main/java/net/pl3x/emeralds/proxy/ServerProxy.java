package net.pl3x.emeralds.proxy;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.pl3x.emeralds.item.EmeraldArmor;

public class ServerProxy {
    public void preInit(FMLPreInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(this);
    }

    public void registerItemRenderer(Item item, int meta, String id) {
    }

    @SubscribeEvent
    public void on(LivingHurtEvent event) {
        float reduction = event.getAmount() / 16 * 1.5F;
        for (ItemStack armor : event.getEntity().getArmorInventoryList()) {
            if (armor.getItem() instanceof EmeraldArmor) {
                event.setAmount(event.getAmount() - reduction);
            }
        }
    }
}
