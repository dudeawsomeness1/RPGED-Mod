package com.epic.main;

import net.minecraft.client.Minecraft;
import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;

import com.epic.blocks.EpicmodBlocks;
import com.epic.mob.EntityLichMob;
import com.epic.mob.RenderLichMob;
import com.epic.render.item.ItemRendererMithrilChest;
import com.epic.render.tile_entity.MithrilChestRenderer;
import com.epic.tile_entity.TileEntityMithrilChest;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.FMLCommonHandler;

public class ClientProxy extends ServerProxy{
	
	public void registerRenderThings(){
		
		//RenderingRegistry.registerEntityRenderingHandler(EntityLichMob.class, new RenderLichMob(new Lich(), 0));
		
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityMithrilChest.class, new MithrilChestRenderer());
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(EpicmodBlocks.MithrilChest), new ItemRendererMithrilChest());
		FMLCommonHandler.instance().bus().register(new ServerTickHandler(Minecraft.getMinecraft()));
	
	}

}
