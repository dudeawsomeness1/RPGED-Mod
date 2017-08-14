package com.epic.items;

import com.epic.main.mainRegistry;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class MithrilArmor extends ItemArmor{
	private String [] armourTypes = new String [] {"MithrilHelmet", "MithrilChestplate", "MithrilLeggings", "MithrilBoots"};

	public MithrilArmor(ArmorMaterial armorMaterial, int renderIndex, int armourType){
		super(armorMaterial, renderIndex, armourType);
	}
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String layer){
		if(stack.getItem().equals(EpicmodItems.MithrilHelmet)|| stack.getItem().equals(EpicmodItems.MithrilChestplate)|| stack.getItem().equals(EpicmodItems.MithrilBoots)){
			return "epic:textures/armor/Mithril_1.png";
		}
		
		if(stack.getItem().equals(EpicmodItems.MithrilLeggings)){
			return "epic:textures/armor/Mithril_2.png";
		}
		
		else return null;
	}
	
	@Override
	public void registerIcons(IIconRegister reg){
		if(this == EpicmodItems.MithrilHelmet)
			this.itemIcon = reg.registerIcon("epic:Mithril Helmet");
		if(this == EpicmodItems.MithrilChestplate)
			this.itemIcon = reg.registerIcon("epic:Mithril Chestplate");
		if(this == EpicmodItems.MithrilLeggings)
			this.itemIcon = reg.registerIcon("epic:Mithril Leggings");
		if(this == EpicmodItems.MithrilBoots)
			this.itemIcon = reg.registerIcon("epic:Mithril Boots");
	}
	
	
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack stack){
		if(player.getCurrentArmor(0) != null && player.getCurrentArmor(1) != null && player.getCurrentArmor(2) != null && player.getCurrentArmor(3) != null){
			ItemStack boots = player.getCurrentArmor(0);
			ItemStack legs = player.getCurrentArmor(1);
			ItemStack chest = player.getCurrentArmor(2);
			ItemStack helmet = player.getCurrentArmor(3);
			
			if(boots.getItem() == EpicmodItems.MithrilBoots && legs.getItem() == EpicmodItems.MithrilLeggings && chest.getItem() == EpicmodItems.MithrilChestplate && helmet.getItem() == EpicmodItems.MithrilHelmet){
				player.addPotionEffect(new PotionEffect(Potion.resistance.getId(), 100, 1));
				player.addPotionEffect(new PotionEffect(Potion.regeneration.getId(), 100, 0));
				player.addPotionEffect(new PotionEffect(Potion.field_76444_x.getId(), 100, 0));
			}
			
		}
	}
	
}
