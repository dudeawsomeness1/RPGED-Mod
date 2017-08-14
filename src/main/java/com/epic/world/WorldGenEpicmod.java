package com.epic.world;

import java.util.Random;

import com.epic.blocks.EpicmodBlocks;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class WorldGenEpicmod implements IWorldGenerator{
	
	public void generate(Random rand, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider){
		switch(world.provider.dimensionId){
		case -1:
			generateNether(world, rand, chunkX, chunkZ);
			break;
		case 0:
			generateSurface(world, rand, chunkX, chunkZ);
			break;
		case 8:
			generateElven(world, rand, chunkX, chunkZ);
			break;
		}
		
	}
	
	private void generateSurface(World world, Random rand, int x, int z){
		generateOre(EpicmodBlocks.MithrilOre, world, rand, x, z, 2, 7, 5, 0, 15, Blocks.stone);
	}

	private void generateNether(World world, Random rand, int x, int z) {
		
		
	}
	
	// Mithril dimension
	public void generateElven(World world, Random rand, int x, int z) {
		generateOre(EpicmodBlocks.MithrilOre, world, rand, x, z, 2, 7, 9, 0, 17, Blocks.stone);
	}

	public void generateOre(Block block, World world, Random random, int chunkX, int chunkZ, int minVienSize, int maxVienSize, int chance, int minY, int maxY, Block generateIn) {
		int vienSize = minVienSize + random.nextInt(maxVienSize - minVienSize);
		int heightRange = maxY - minY;
		WorldGenMinable gen = new WorldGenMinable(block, vienSize, generateIn);
		for (int i = 0; i < chance; i++) {
			int xRand = chunkX * 16 + random.nextInt(16);
			int yRand = random.nextInt(heightRange) + minY;
			int zRand = chunkZ * 16 + random.nextInt(16);
			gen.generate(world, random, xRand, yRand, zRand);
		}
	}
}
