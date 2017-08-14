package com.epic.blocks;

import java.util.Random;

import com.epic.items.EpicmodItems;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.world.IBlockAccess;

public class RubyOre extends Block{
	public RubyOre(Material mat){
		super(mat);
		this.setCreativeTab(EpicmodBlocks.EpicmodTab);
		this.setHarvestLevel("pickaxe", 2);
	}
	
	@Override
	public void registerBlockIcons(IIconRegister reg)
    {
        this.blockIcon = reg.registerIcon("epic:oreRuby");
    }
	
	public Item getItemDropped(int par1, Random rand, int par2){
		return EpicmodItems.Ruby;
	}
	
	public int quantityDropped(){
		return 1;
	}
	
	private Random rand = new Random();
	@Override
	public int getExpDrop(IBlockAccess p_149690_1_, int p_149690_5_, int p_149690_7_){
		if (this.getItemDropped(p_149690_5_, rand, p_149690_7_) != Item.getItemFromBlock(this))
		{
			return 1 + rand.nextInt(5);
		}
		return 0;
	}
}