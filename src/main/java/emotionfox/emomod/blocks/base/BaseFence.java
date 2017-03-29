package emotionfox.emomod.blocks.base;

import net.minecraft.block.BlockFence;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

public class BaseFence extends BlockFence
{
	public BaseFence(MapColor mapColorIn)
	{
		super(Material.WOOD, mapColorIn);
		this.setSoundType(SoundType.WOOD);
		this.setHardness(2.0F);
		this.setResistance(5.0F);
	}
}
