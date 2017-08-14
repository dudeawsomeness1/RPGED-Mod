package com.epic.tile_entity;

import com.epic.lib.Strings;

import cpw.mods.fml.common.registry.GameRegistry;

public class TileEntityEpicmod {
	
	public static void mainRegistry(){
		registerTileEntities();
	}
	
	private static void registerTileEntities(){
		GameRegistry.registerTileEntity(TileEntityMithrilChest.class, Strings.MODID);
	}

}
