package emotionfox.emomod.proxy;

import net.minecraft.block.Block;

public interface CommonProxy {
	public void registerModelBakeryStuff();
	public void registerEntityRendering();
	public void customStateMapper();
	public void registerRenders();
}