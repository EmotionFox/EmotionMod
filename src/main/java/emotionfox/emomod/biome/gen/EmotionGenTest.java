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
		int x = position.getX();
		int y = position.getY();
		int z = position.getZ();

		BlockPos pos1 = new BlockPos(x - 2, y - 1, z + 2);
		BlockPos pos2 = new BlockPos(x + 2, y - 1, z - 2);
		BlockPos pos3 = new BlockPos(x - 2, y - 1, z - 2);
		BlockPos pos4 = new BlockPos(x + 2, y - 1, z + 2);

		if (worldIn.getBlockState(position.add(0, -1, 0)) == Blocks.GRASS.getDefaultState() && checkBlock(worldIn, Blocks.GRASS, position, 2, 2))
		{
			worldIn.setBlockState(position, Blocks.BEDROCK.getDefaultState());
			worldIn.setBlockState(position.add(0, 1, 0), Blocks.GLOWSTONE.getDefaultState());

			return true;
		}
		return false;
	}

	public boolean checkBlock(World worldIn, Block blockIn, BlockPos position, int xRadius, int zRadius)
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
