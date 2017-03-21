package emotionfox.emomod.blocks.base;

import net.minecraft.block.BlockStairs;
import net.minecraft.block.state.IBlockState;

public class BaseStairs extends BlockStairs
{
	// A Class Just Because BlockStairs Is Protected...
	
	public BaseStairs(IBlockState modelState)
	{
		super(modelState);
	}
}
