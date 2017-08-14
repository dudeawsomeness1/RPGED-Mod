package com.epic.main;

import com.epic.biome.BiomeRegistry;
import com.epic.biome.WorldTypeEpicmod;
import com.epic.blocks.EpicmodBlocks;
import com.epic.dimension.dimensionRegistry;
import com.epic.enchantments.EnchantmentSpeedBoost;
import com.epic.items.EpicmodItems;
import com.epic.lib.Strings;
import com.epic.mob.EntityEpicmod;
import com.epic.tile_entity.TileEntityEpicmod;
import com.epic.world.EpicmodWorld;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.Metadata;
import cpw.mods.fml.common.ModMetadata;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.Achievement;
import net.minecraft.world.WorldType;
import net.minecraftforge.common.AchievementPage;

@Mod(modid = Strings.MODID, name = Strings.name, version = Strings.version)
public class mainRegistry
{
	
	@SidedProxy(clientSide = "com.epic.main.ClientProxy", serverSide = "com.epic.main.ServerProxy")
	public static ServerProxy proxy;

    @Metadata
    public static ModMetadata meta;
    
    @Instance(Strings.MODID)
    public static mainRegistry modInstance;
    
    public static Achievement achievementMithril;
    public static Achievement achievementMithrilPick;
    
    public static final Enchantment speedBoost = new EnchantmentSpeedBoost(84, 5);
    
    @EventHandler
    public void PreLoad(FMLPreInitializationEvent PreEvent)
    {
    	
    	EpicmodBlocks.mainRegistry();
    	EpicmodItems.mainRegistry();
    	EpicmodWorld.mainRegistry();
    	TileEntityEpicmod.mainRegistry();
    	CraftingManager.mainRegistry();
    	BiomeRegistry.mainRegsitry();
    	EntityEpicmod.mainRegistry();
    	dimensionRegistry.mainRegistry();

    	proxy.registerRenderThings();
    }
    
    @EventHandler
    public void load(FMLInitializationEvent event)
    {
    	achievementMithril = new Achievement("achievement.mineMithril", "mineMithril", 0, 0, new ItemStack(EpicmodItems.MithrilIngot), (Achievement)null).initIndependentStat().registerStat();
    	achievementMithrilPick = new Achievement("achievement.craftPick", "craftPick", 2, 1, EpicmodItems.MithrilPickaxe, achievementMithril).registerStat();
    	
    	AchievementPage.registerAchievementPage(new AchievementPage("Epicmod Achievements", new Achievement[]{achievementMithril, achievementMithrilPick}));
    	
    	
    	FMLCommonHandler.instance().bus().register(new EpicmodOnMineEvent());
    	FMLCommonHandler.instance().bus().register(new EpicmodOnCraftEvent());
    	
    
    	
    	
    	
    	
    }
    
    @EventHandler
    public void PostLoad(FMLPostInitializationEvent PostEvent)
    {
    	
    	WorldType EPIC = new WorldTypeEpicmod(3, "Epic");
    	
    	
    }
}