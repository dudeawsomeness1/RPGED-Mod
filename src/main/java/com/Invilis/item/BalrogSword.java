package com.Invilis.item;

import com.Invilis.lib.RefStrings;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class BalrogSword {
	public static void mainRegistry() {
		initializeItem();
		registerItem();
	}
	
	public static Item balrogSword;
	
	public static void initializeItem() {
		balrogSword = new Item().setUnlocalizedName("balrogSword").setCreativeTab(CreativeTabs.tabCombat).setTextureName(RefStrings.MODID + ":balrogSword");
	}
	
	public static void registerItem() {
		GameRegistry.registerItem(balrogSword, balrogSword.getUnlocalizedName());
	}
}
