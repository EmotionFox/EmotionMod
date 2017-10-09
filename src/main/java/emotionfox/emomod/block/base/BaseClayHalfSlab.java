package emotionfox.emomod.block.base;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

public class BaseClayHalfSlab extends BaseSlab
{
	public BaseClayHalfSlab(MapColor mapColorIn)
	{
		super(Material.ROCK, mapColorIn);
		this.setSoundType(SoundType.STONE);
		this.setHardness(1.25F);
		this.setResistance(7.0F);
	}

	@Override
	public boolean isDouble()
	{
		return false;
	}
}
