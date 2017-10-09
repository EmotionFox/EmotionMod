package emotionfox.emomod.proxy;

import emotionfox.emomod.tileentity.TileEntityRandom;
import emotionfox.emomod.tileentity.TileEntityStorage;
import emotionfox.emomod.util.Reference;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy
{
	public void registerTileEntities()
	{
		GameRegistry.registerTileEntity(TileEntityStorage.class, Reference.MOD_ID + ":TileEntityStorage");
		GameRegistry.registerTileEntity(TileEntityRandom.class, Reference.MOD_ID + ":TileEntityRandom");
	}

	public void registerEntityRendering()
	{}

	public void registerRenders()
	{}
}