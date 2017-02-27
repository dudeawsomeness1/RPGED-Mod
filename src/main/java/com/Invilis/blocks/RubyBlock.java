package com.Invilis.blocks;

import com.Invilis.lib.RefStrings;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class RubyBlock {
	public static void mainRegistry() {
		initializeBlock();
		registerItem();
	}
	
	public static Block Ruby_Block;
	
	public static void initializeBlock() {
		Ruby_Block = new Ruby_Block(Material.iron).setBlockName("Ruby_Block").setCreativeTab(CreativeTabs.tabBlock).setBlockTextureName(RefStrings.MODID + ":Ruby_Block");
	}
	
	public static void registerItem() {
		GameRegistry.registerBlock(Ruby_Block, Ruby_Block.getUnlocalizedName());
	}
}
