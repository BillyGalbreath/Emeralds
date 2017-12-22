package net.pl3x.emeralds;

import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.pl3x.emeralds.item.ModItems;
import net.pl3x.emeralds.proxy.ServerProxy;

@Mod(modid = Emeralds.modId, name = Emeralds.name, version = Emeralds.version,
        updateJSON = "http://pl3x.net/versions/emeralds.json")
public class Emeralds {
    public static final String modId = "emeralds";
    public static final String name = "Emeralds";
    public static final String version = "@DEV_BUILD@";

    @SidedProxy(serverSide = "net.pl3x.emeralds.proxy.ServerProxy", clientSide = "net.pl3x.emeralds.proxy.ClientProxy")
    public static ServerProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit(event);
    }

    @Mod.EventBusSubscriber
    public static class EventHandler {
        @SubscribeEvent
        public static void registerItems(RegistryEvent.Register<Item> event) {
            ModItems.register(event.getRegistry());
        }

        @SubscribeEvent
        public static void registerModels(ModelRegistryEvent event) {
            ModItems.registerModels();
        }
    }
}
