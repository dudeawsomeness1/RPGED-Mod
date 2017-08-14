package com.epic.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.world.IBlockAccess;

import com.epic.items.EpicmodItems;

public class MithrilOre extends Block {
	
	public MithrilOre(Material mat){
		super(mat);
		this.setCreativeTab(EpicmodBlocks.EpicmodTab);
		this.setHarvestLevel("pickaxe", 3);
	}
	
	@Override
	public void registerBlockIcons(IIconRegister reg)
    {
        this.blockIcon = reg.registerIcon("epic:oreMithril");
    }
}