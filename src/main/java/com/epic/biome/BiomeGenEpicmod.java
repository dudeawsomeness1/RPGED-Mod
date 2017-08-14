package com.epic.biome;

import com.epic.blocks.EpicmodBlocks;

import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.init.Blocks;
import net.minecraft.world.biome.BiomeGenBase;

public class BiomeGenEpicmod extends BiomeGenBase{

	public BiomeGenEpicmod(int id){
		super(id);
		
		this.setBiomeName("Elven");
		
		this.spawnableCreatureList.add(new SpawnListEntry(EntitySlime.class, 5, 2, 10));
		this.spawnableMonsterList.clear();
		
		this.theBiomeDecorator.treesPerChunk = 5;
		this.theBiomeDecorator.grassPerChunk = 2;
		this.theBiomeDecorator.bigMushroomsPerChunk = 2;
		
		
		this.topBlock = Blocks.grass;
		this.fillerBlock = EpicmodBlocks.MithrilOre;
		this.waterColorMultiplier = 2368548;
	}
	
}
