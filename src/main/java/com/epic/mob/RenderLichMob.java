package com.epic.mob;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

import com.epic.lib.Strings;

public class RenderLichMob extends RenderLiving{

	private static final ResourceLocation mobTextures = new ResourceLocation(Strings.MODID + ":textures/entity/Lich.png");
	private static final String __OBFID = "CL_00000984";
	
	public RenderLichMob(ModelBase par1ModelBase, float par2) {
		super(par1ModelBase, par2);
		
	}
	
	protected ResourceLocation getEntityTexture(EntityLichMob entity){
		return mobTextures;
	}
	
	protected ResourceLocation getEntityTexture(Entity entity){
		return this.getEntityTexture((EntityLichMob)entity);
	}

}
