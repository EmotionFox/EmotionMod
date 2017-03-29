package emotionfox.emomod.blocks.base;

import net.minecraft.block.BlockCrops;
import net.minecraft.item.Item;

public class BasePlant extends BlockCrops
{
	protected Item seed;
	protected Item crop;

	public BasePlant(Item seedIn, Item cropIn)
	{
		this.seed = seedIn;
		this.crop = cropIn;
	}

	@Override
	protected Item getSeed()
	{
		return this.seed;
	}

	@Override
	protected Item getCrop()
	{
		return this.crop;
	}
}