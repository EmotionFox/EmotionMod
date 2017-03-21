package emotionfox.emomod.blocks.base;

import net.minecraft.block.BlockCrops;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BasePlant extends BlockCrops
{
	protected Item seed;
	protected Item crop;

	public BasePlant(Item seed, Item crop)
	{
		this.seed = seed;
		this.crop = crop;
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

	@Override
	public boolean canBlockStay(World worldIn, BlockPos pos, IBlockState state)
	{
		IBlockState soil = worldIn.getBlockState(pos.down());
		if ((worldIn.getLight(pos) >= 8 || worldIn.canSeeSky(pos)) && soil.getBlock() == Blocks.FARMLAND)
		{
			return true;
		}
		return false;
	}
}
