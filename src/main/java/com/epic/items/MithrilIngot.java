package com.epic.items;

import com.epic.blocks.EpicmodBlocks;
import com.epic.main.mainRegistry;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class MithrilIngot extends Item{
	
	public MithrilIngot(){
		super();
		this.setCreativeTab(EpicmodBlocks.EpicmodTab);
		this.setMaxStackSize(64);
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister reg){
		this.itemIcon = reg.registerIcon("epic:Mithril Ingot");
	}

}
