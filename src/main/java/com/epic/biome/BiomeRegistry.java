package com.epic.biome;

import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager;

public class BiomeRegistry {
	
	public static void mainRegsitry(){
		initializeBiome();
		registerBiome();
	}
	
	public static BiomeGenBase biomeEpicmod;
	
	public static void initializeBiome(){
		
		biomeEpicmod = new BiomeGenEpicmod(137).setBiomeName("Epic").setTemperatureRainfall(1.2F, 0.9F);
		
	}
	
	public static void registerBiome(){
		BiomeDictionary.registerBiomeType(biomeEpicmod, Type.FOREST);
		BiomeManager.addSpawnBiome(biomeEpicmod);
		
	}

}
