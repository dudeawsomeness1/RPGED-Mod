package com.epic.dimension;

import net.minecraft.util.ChunkCoordinates;

public class MithrilPortalPosition extends ChunkCoordinates{
	public long seed;
    private final TeleporterMithril teleporter;

    public MithrilPortalPosition(TeleporterMithril mithrilTeleporter, int par2, int par3, int par4, long par5) {
        super(par2, par3, par4);
        this.teleporter = mithrilTeleporter;
        this.seed = par5;
    }
}