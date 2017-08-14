package com.epic.items;

import com.epic.blocks.EpicmodBlocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

public class Ruby extends Item{
	public Ruby() {
		super();
		this.setCreativeTab(EpicmodBlocks.EpicmodTab);
		this.setMaxStackSize(64);
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister reg){
		this.itemIcon = reg.registerIcon("epic:Ruby");
	}
}
