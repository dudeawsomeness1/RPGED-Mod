package com.epic.main;

import net.minecraft.item.ItemStack;

import com.epic.items.EpicmodItems;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;

public class EpicmodOnMineEvent {
	
	@SubscribeEvent
	public void whenIGetAMithrilIngot(PlayerEvent.ItemPickupEvent e){
		if(e.pickedUp.getEntityItem().isItemEqual(new ItemStack(EpicmodItems.MithrilIngot))){
			e.player.addStat(mainRegistry.achievementMithril, 1);
		}
	}

}
