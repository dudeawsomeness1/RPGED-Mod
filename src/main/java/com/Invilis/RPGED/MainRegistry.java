package com.Invilis.RPGED;

import com.Invilis.blocks.RubyBlock;
import com.Invilis.item.BalrogSword;
import com.Invilis.lib.RefStrings;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = RefStrings.MODID, name = RefStrings.NAME, version = RefStrings.VERSION)
public class MainRegistry {
	
	@SidedProxy(clientSide = RefStrings.CLIENTSIDE, serverSide = RefStrings.SERVERSIDE)
	public static ServerProxy proxy;
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent preEvent) {
		// Item/Block initialization and registering
		// Config handling
		BalrogSword.mainRegistry();
		RubyBlock.mainRegistry();
		proxy.registerRenderInfo();
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event) {
		// Proxy, TIleENtity, entity, GUI and Packet Registering
		
	}
	
	@EventHandler
	public static void postInit(FMLPostInitializationEvent postEvent) {
		
	}
}
