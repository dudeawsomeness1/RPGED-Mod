package com.epic.items;

import com.epic.blocks.EpicmodBlocks;
import com.epic.lib.Strings;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class EpicmodItems {
	
	public static ToolMaterial enumToolMaterialMithril = EnumHelper.addToolMaterial("MITHRIL", 3, 1777, 9.5F, 5.0F, 17);
    public static ArmorMaterial enumArmorMaterialMithril = EnumHelper.addArmorMaterial("MITHRIL", 40, new int[] {4, 9, 7, 4}, 19);
    public static ToolMaterial enumToolMaterialShadowFlame = EnumHelper.addToolMaterial("SHADOWFLAME", 3, 17777, 14.0F, 500.0F, 57);
    public static ArmorMaterial enumArmorMaterialShadowFlame = EnumHelper.addArmorMaterial("SHADOWFLAME", 250, new int[] {10, 24, 18, 10}, 60);
	
	public static void mainRegistry(){
    	initItems();
    	registerItems();
    }
	
	public static Item Ruby;
	public static Item BalrogSword;
	public static Item MithrilIngot;
    public static Item MithrilSword;
    public static Item MithrilPickaxe;
    public static Item MithrilAxe;
    public static Item MithrilHoe;
    public static Item MithrilShovel;
    public static Item MithrilHelmet;
    public static Item MithrilChestplate;
    public static Item MithrilLeggings;    
    public static Item MithrilBoots; 
    public static Item FoodJellyBeans = new ItemFood(32, 4, false);
	
	public static void initItems(){
		
		RenderingRegistry.addNewArmourRendererPrefix("5");
		RenderingRegistry.addNewArmourRendererPrefix("6");
		
		Ruby = new Ruby().setUnlocalizedName("Ruby");
		BalrogSword = new BalrogSword(enumToolMaterialShadowFlame, 777).setUnlocalizedName("Balrog Sword").setCreativeTab(EpicmodBlocks.EpicmodTab);
		MithrilIngot = new MithrilIngot().setUnlocalizedName("MithrilIngot");
    	MithrilSword = new MithrilSword(enumToolMaterialMithril, 6).setUnlocalizedName("Mithril Sword").setCreativeTab(EpicmodBlocks.EpicmodTab);
    	MithrilPickaxe = new MithrilPickaxe(enumToolMaterialMithril).setUnlocalizedName("Mithril Pickaxe").setCreativeTab(EpicmodBlocks.EpicmodTab);
    	MithrilShovel = new MithrilShovel(enumToolMaterialMithril).setUnlocalizedName("Mithril Shovel").setCreativeTab(EpicmodBlocks.EpicmodTab);
    	MithrilHoe = new MithrilHoe(enumToolMaterialMithril).setUnlocalizedName("Mithril Hoe").setCreativeTab(EpicmodBlocks.EpicmodTab);
    	MithrilAxe = new MithrilAxe(enumToolMaterialMithril).setUnlocalizedName("Mithril Axe").setCreativeTab(EpicmodBlocks.EpicmodTab);
    	MithrilHelmet = new MithrilArmor(enumArmorMaterialMithril, 5, 0).setUnlocalizedName("Mithril Helmet").setCreativeTab(EpicmodBlocks.EpicmodTab);
    	MithrilChestplate = new MithrilArmor(enumArmorMaterialMithril, 5, 1).setUnlocalizedName("Mithril Chestplate").setCreativeTab(EpicmodBlocks.EpicmodTab);
    	MithrilLeggings = new MithrilArmor(enumArmorMaterialMithril, 5, 2).setUnlocalizedName("Mithril Leggings").setCreativeTab(EpicmodBlocks.EpicmodTab);
    	MithrilBoots = new MithrilArmor(enumArmorMaterialMithril, 5, 3).setUnlocalizedName("Mithril Boots").setCreativeTab(EpicmodBlocks.EpicmodTab);
    	FoodJellyBeans = new FoodJellyBeans(4, false).setUnlocalizedName("Jelly Beans");
	}
	
	public static void registerItems(){
		
		GameRegistry.registerItem(Ruby, "Ruby");
		GameRegistry.registerItem(BalrogSword, "BalrogSword");
		GameRegistry.registerItem(MithrilIngot, "MithrilIngot");
    	GameRegistry.registerItem(MithrilSword, "MithrilSword");
    	GameRegistry.registerItem(MithrilPickaxe, "MithrilPickaxe");
    	GameRegistry.registerItem(MithrilAxe, "MithrilAxe");
    	GameRegistry.registerItem(MithrilHoe, "MithrilHoe");
    	GameRegistry.registerItem(MithrilShovel, "MithrilShovel");
    	GameRegistry.registerItem(MithrilHelmet, "MithrilHelmet");
    	GameRegistry.registerItem(MithrilChestplate, "MithrilChestplate");
    	GameRegistry.registerItem(MithrilLeggings, "MithrilLeggings");
    	GameRegistry.registerItem(MithrilBoots, "MithrilBoots");
    	GameRegistry.registerItem(FoodJellyBeans, "JellyBeans");
	}
	

}
