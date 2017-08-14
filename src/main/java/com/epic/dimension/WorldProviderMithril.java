package com.epic.dimension;

import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.WorldChunkManagerHell;
import net.minecraft.world.chunk.IChunkProvider;

import com.epic.biome.BiomeRegistry;

public class WorldProviderMithril extends WorldProvider{

	public void registerWorldChunkManager(){
		this.worldChunkMgr = new WorldChunkManagerHell(BiomeRegistry.biomeEpicmod, 1.2F);
		this.dimensionId = dimensionRegistry.dimensionId;
	}
	
	/**
     * Creates the light to brightness table
     */
    @Override
    protected void generateLightBrightnessTable()
    {
        float var1 = 0.1F;

        for (int var2 = 0; var2 <= 15; ++var2)
        {
            float var3 = 1.0F - var2 / 15.0F;
            this.lightBrightnessTable[var2] = (1.0F - var3) / (var3 * 3.0F + 1.0F) * (1.0F - var1) + var1;
        }
    }
    
    /**
     * the y level at which clouds are rendered.
     */
    @Override
    public float getCloudHeight()
    {
        return 128.0F;
    }
	
    /**
     * Returns a new chunk provider which generates chunks for this world
     */
    @Override
    public IChunkProvider createChunkGenerator()
    {
        return new ChunkProviderMithril(this.worldObj, this.worldObj.getSeed(), "Arcana_Dungeon");
    }
    
    /**
     * Returns 'true' if in the "main surface world", but 'false' if in the Nether or End dimensions.
     */
    @Override
    public boolean isSurfaceWorld()
    {
        return false;
    }

    /**
     * Calculates the angle of sun and moon in the sky relative to a specified time (usually worldTime)
     */
    @Override
    public float calculateCelestialAngle(long var1, float var3)
    {
        return 0F;
    }

    /**
     * True if the player can respawn in this dimension (true = overworld, false = nether).
     */
    @Override
    public boolean canRespawnHere()
    {
        return true;
    }

    @Override
    public String getWelcomeMessage()
    {
        return "Entering the Elven Realm";
    }

    @Override
    public String getDepartMessage()
    {
        return "Leaving the Elven Realm";
    }
	
	@Override
	public String getDimensionName() {
		return "Elven Dimension";
	}

}
