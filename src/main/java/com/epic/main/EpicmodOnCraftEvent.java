package com.epic.main;

import com.epic.items.EpicmodItems;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;

public class EpicmodOnCraftEvent {
	
	@SubscribeEvent
	public void whenICraftAPickaxe(PlayerEvent.ItemCraftedEvent e){
		if(e.crafting.getItem().equals(EpicmodItems.MithrilPickaxe)){
			e.player.addStat(mainRegistry.achievementMithrilPick, 1);
		}
	}

}
