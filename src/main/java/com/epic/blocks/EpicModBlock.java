package com.epic.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class EpicModBlock extends Block{
	public String blockName;
	
	public EpicModBlock(Material mat, String tex, String name, float hard, float resist) {
		super(mat);
		this.setBlockTextureName(tex);
		this.setBlockName(name);
		this.setHardness(hard);
		this.setResistance(resist);
		this.setCreativeTab(EpicmodBlocks.EpicmodTab);
		
		blockName = name;
	}
}
