package net.TheMastr90.mymod;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLDedicatedServerSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

public class SideProxy {
	SideProxy() {
		FMLJavaModLoadingContext.get().getModEventBus().addListener(SideProxy::commonSetup);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(SideProxy::enqueueIMC);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(SideProxy::processIMC);
		
		MinecraftForge.EVENT_BUS.addListener(SideProxy::serverStarting);
	}
	
	private static void commonSetup(FMLCommonSetupEvent e) {
		MyMod.LOGGER.debug("commonSetup for my mod");
	}
	
	private static void enqueueIMC(final InterModEnqueueEvent e) {
		
	}
	
	private static void processIMC(final InterModEnqueueEvent e) {
		
	}
	
	private static void serverStarting(FMLServerStartingEvent e) {
		
	}
	
	static class Client extends SideProxy {
		Client() {
			FMLJavaModLoadingContext.get().getModEventBus().addListener(Client::clientSetup);
		}
		
		private static void clientSetup(FMLClientSetupEvent e) {
			
		}
	}
	
	static class Server extends SideProxy {
		Server() {
			FMLJavaModLoadingContext.get().getModEventBus().addListener(Server::serverSetup);
		}
		
		private static void serverSetup(FMLDedicatedServerSetupEvent e) {
			
		}
	}

}
