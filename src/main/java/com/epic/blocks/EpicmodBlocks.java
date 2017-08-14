package com.epic.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class EpicmodBlocks {
	
    public static void mainRegistry(){
    	initBlocks();
    	registerBlocks();
    }
    
    public static Block RubyOre;
    public static Block RubyBlock;
    public static Block MithrilOre;
    public static Block MithrilChest;
    public static Block MithrilPortal;
    
    public static CreativeTabs EpicmodTab = new CreativeTabs("Epicmod"){
    	public Item getTabIconItem(){
    		return Item.getItemFromBlock(MithrilOre);
    	}
    };
    
    public static void initBlocks(){
    	RubyOre = new RubyOre(Material.rock).setHardness(3.0F).setBlockName("Ruby Ore");
    	RubyBlock = new EpicModBlock(Material.iron, "epic:RubyBlock", "Ruby Block", 1.5F, 30.0F);
    	MithrilOre = new MithrilOre(Material.rock).setHardness(3.2F).setBlockName("Mithril Ore").setLightLevel(0.65F);
    	MithrilChest = new MithrilChest(0).setBlockName("Mithril Chest").setCreativeTab(EpicmodTab).setBlockTextureName("epic:MithrilChest");
    	MithrilPortal = new MithrilPortal();
    }
    
    public static void registerBlocks(){
    	GameRegistry.registerBlock(RubyOre, "RubyOre");
    	GameRegistry.registerBlock(RubyBlock, "Ruby_Block");
    	GameRegistry.registerBlock(MithrilOre, "MithrilOre");
    	GameRegistry.registerBlock(MithrilChest, "MithrilChest");
    	GameRegistry.registerBlock(MithrilPortal, "MithrilPortal");
    }
}
