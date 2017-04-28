package emotionfox.emomod.biome.gen;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class EmotionGenTest extends WorldGenerator
{
	@Override
	public boolean generate(World worldIn, Random rand, BlockPos position)
	{
		if (worldIn.getBlockState(position.add(0, -1, 0)) == Blocks.GRASS.getDefaultState() && checkBlocks(worldIn, Blocks.GRASS, position, 2, 2))
		{
			worldIn.setBlockState(position, Blocks.OBSIDIAN.getDefaultState());
			worldIn.setBlockState(position.add(0, 1, 0), Blocks.REDSTONE_BLOCK.getDefaultState());

			return true;
		}
		return false;
	}

	public boolean checkBlocks(World worldIn, Block blockIn, BlockPos position, int xRadius, int zRadius)
	{
		for (int x = -xRadius; x <= xRadius; x++)
		{
			for (int z = -zRadius; z <= zRadius; z++)
			{
				if (worldIn.getBlockState(position.add(x, -1, z)) == blockIn.getDefaultState() && !worldIn.getBlockState(position.add(x, 0, z)).isFullBlock())
					continue;
				else
					return false;
			}
		}
		return true;
	}
}
