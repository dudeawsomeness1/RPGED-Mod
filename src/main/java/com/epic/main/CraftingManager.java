package com.epic.main;

import com.epic.blocks.EpicmodBlocks;
import com.epic.items.EpicmodItems;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class CraftingManager {
	
	public static void mainRegistry(){
		addCraftingRecipes();
		addSmeltingRecipes();
	}
	
	public static void addCraftingRecipes(){//add AngelicMithril Armor & Tools with enchants/potion effects; normal Mithril textures with gold decor.
		/**ItemStack enchantedBoots = new ItemStack(EpicmodItems.AngelicMithrilBoots);
		enchantedBoots.addEnchantment(mainRegistry.speedBoost, 1);
		enchantedBoots.addEnchantment(Enchantment.featherFalling, 3);
		
		ItemStack enchantedChest = new ItemStack(EpicmodItems.AngelicMithrilChestplate);
		enchantedChest.addEnchantment(Enchantment.protection, 7);
		enchantedChest.addEnchantment(Enchantment.thorns, 3);**/
		
		//ItemStack enchantedSword = new ItemStack(EpicmodItems.BalrogSword);
		//enchantedSword.addEnchantment(Enchantment.fireAspect, 2);
		
		GameRegistry.addShapelessRecipe(new ItemStack(EpicmodItems.FoodJellyBeans), new Object[] {Items.sugar, Blocks.red_mushroom});
		GameRegistry.addShapelessRecipe(new ItemStack(EpicmodItems.Ruby, 9), new Object[] {EpicmodBlocks.RubyBlock});
		GameRegistry.addShapedRecipe(new ItemStack(EpicmodBlocks.RubyBlock), "RRR", "RRR", "RRR", 'R', EpicmodItems.Ruby);
		GameRegistry.addShapedRecipe(new ItemStack(EpicmodBlocks.MithrilChest), "PPP", "I I", "PPP", 'I', EpicmodItems.MithrilIngot, 'P', Blocks.planks);
		GameRegistry.addShapedRecipe(new ItemStack(EpicmodItems.MithrilPickaxe), "III", " S ", " S ", 'I', EpicmodItems.MithrilIngot, 'S', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(EpicmodItems.MithrilSword), "I", "I", "S", 'I', EpicmodItems.MithrilIngot, 'S', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(EpicmodItems.MithrilShovel), "I", "S", "S", 'I', EpicmodItems.MithrilIngot, 'S', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(EpicmodItems.MithrilAxe), "II ", "IS ", " S ", 'I', EpicmodItems.MithrilIngot, 'S', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(EpicmodItems.MithrilHoe), "II ", " S ", " S ", 'I', EpicmodItems.MithrilIngot, 'S', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(EpicmodItems.MithrilLeggings), "III", "I I", "I I", 'I', EpicmodItems.MithrilIngot);
		GameRegistry.addShapedRecipe(new ItemStack(EpicmodItems.MithrilHelmet), "III", "I I", 'I', EpicmodItems.MithrilIngot);
		GameRegistry.addShapedRecipe(new ItemStack(EpicmodItems.MithrilChestplate), "I I", "III", "III", 'I', EpicmodItems.MithrilIngot);
		GameRegistry.addShapedRecipe(new ItemStack(EpicmodItems.MithrilBoots), "I I", "I I", 'I', EpicmodItems.MithrilIngot);
		//GameRegistry.addShapedRecipe((enchantedBoots), "I I", "I I", 'I', EpicmodItems.MithrilIngot);
		//GameRegistry.addShapedRecipe((enchantedChest), "I I", "III", "III", 'I', EpicmodItems.MithrilIngot);
	}//these^ are for the AngelicMithril Chest & Boots crafting remember to change recipe.
	
	public static void addSmeltingRecipes(){
		GameRegistry.addSmelting(EpicmodBlocks.RubyOre, new ItemStack(EpicmodItems.Ruby, 1), 9.5F);
		GameRegistry.addSmelting(EpicmodBlocks.MithrilOre, new ItemStack(EpicmodItems.MithrilIngot, 1), 10.0F);
	}

}