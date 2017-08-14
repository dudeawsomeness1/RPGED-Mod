package com.epic.items;

import com.epic.blocks.EpicmodBlocks;
import com.epic.main.mainRegistry;

import net.minecraft.item.ItemFood;

public class FoodJellyBeans extends ItemFood{
	
	public FoodJellyBeans(int j, boolean b){
		super(j, b);
		this.setCreativeTab(EpicmodBlocks.EpicmodTab);
		this.setTextureName("epic:JellyBeans");
	}

}
