package emotionfox.emomod.biome.gen;

import java.util.Random;

import emotionfox.emomod.block.EmotionNewLeaves;
import emotionfox.emomod.block.EmotionNewLog;
import emotionfox.emomod.block.EmotionPlanks;
import emotionfox.emomod.block.EmotionSapling;
import emotionfox.emomod.init.EmotionBlock;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class EmotionGenPine extends WorldGenerator
{
	private EmotionSapling sapling = (EmotionSapling) EmotionBlock.SAPLING;

	@Override
	public boolean generate(World world, Random rand, BlockPos pos)
	{
		int height = 6 + rand.nextInt(4);

		IBlockState logs = EmotionBlock.NEW_LOG.getDefaultState().withProperty(EmotionNewLog.VARIANT, EmotionPlanks.EnumType.PINE);
		IBlockState leaves = EmotionBlock.NEW_LEAVES.getDefaultState().withProperty(EmotionNewLeaves.VARIANT, EmotionPlanks.EnumType.PINE);

		if (this.sapling.canBlockStay(world, pos, sapling.getDefaultState().withProperty(EmotionSapling.TYPE, EmotionPlanks.EnumType.PINE)) && world.isAirBlock(pos) && pos.getY() < 200
				&& (pos.getY() > 80 || rand.nextInt(10) == 0))
		{
			for (int x = -1; x <= 1; ++x)
			{
				for (int z = -1; z <= 1; ++z)
				{
					if (world.isAirBlock(pos.add(x, height + 1, 0)))
						world.setBlockState(pos.add(x, height + 1, 0), leaves);
					if (world.isAirBlock(pos.add(0, height + 1, z)))
						world.setBlockState(pos.add(0, height + 1, z), leaves);
					if (world.isAirBlock(pos.add(x, height, z)))
						world.setBlockState(pos.add(x, height, z), leaves);
					if (world.isAirBlock(pos.add(x, height - 1, z)))
						world.setBlockState(pos.add(x, height - 1, z), leaves);
				}
			}
			for (int x = -2; x <= 2; ++x)
			{
				for (int z = -2; z <= 2; ++z)
				{
					if (world.isAirBlock(pos.add(x, height - 1, 0)))
						world.setBlockState(pos.add(x, height - 1, 0), leaves);
					if (world.isAirBlock(pos.add(0, height - 1, z)))
						world.setBlockState(pos.add(0, height - 1, z), leaves);
				}
			}
			for (int x = -2; x <= 2; ++x)
			{
				for (int z = -1; z <= 1; ++z)
				{
					if (world.isAirBlock(pos.add(x, height - 2, z)))
						world.setBlockState(pos.add(x, height - 2, z), leaves);
					if (world.isAirBlock(pos.add(z, height - 2, x)))
						world.setBlockState(pos.add(z, height - 2, x), leaves);
				}
			}
			for (int z = -3; z <= 3; z++)
			{
				for (int x = -1; x <= 1; x++)
				{
					if (world.isAirBlock(pos.add(x, height - 3, z)))
						world.setBlockState(pos.add(x, height - 3, z), leaves);
					if (world.isAirBlock(pos.add(z, height - 3, x)))
						world.setBlockState(pos.add(z, height - 3, x), leaves);
				}
			}
			for (int x = -2; x <= 2; x++)
			{
				for (int z = -2; z <= 2; z++)
				{
					if (world.isAirBlock(pos.add(x, height - 3, z)))
						world.setBlockState(pos.add(x, height - 3, z), leaves);
				}
			}
			for (int y = 0; y <= height; ++y)
			{
				world.setBlockState(pos.add(0, y, 0), logs);
			}

			world.setBlockState(pos.add(0, height + 2, 0), leaves);

			return true;
		}
		else if (this.sapling.canBlockStay(world, pos, sapling.getDefaultState().withProperty(EmotionSapling.TYPE, EmotionPlanks.EnumType.PINE)) && world.isAirBlock(pos) && pos.getY() < 81)
		{
			for (int x = -2; x <= 2; x++)
			{
				for (int z = -1; z <= 1; z++)
				{
					if (world.isAirBlock(pos.add(x, 2, 0)))
						world.setBlockState(pos.add(x, 2, 0), leaves);
					if (world.isAirBlock(pos.add(0, 2, x)))
						world.setBlockState(pos.add(0, 2, x), leaves);
					if (world.isAirBlock(pos.add(z, 2, -1)))
						world.setBlockState(pos.add(z, 2, -1), leaves);
					if (world.isAirBlock(pos.add(z, 2, 1)))
						world.setBlockState(pos.add(z, 2, 1), leaves);
					if (world.isAirBlock(pos.add(-1, 2, z)))
						world.setBlockState(pos.add(-1, 2, z), leaves);
					if (world.isAirBlock(pos.add(1, 2, z)))
						world.setBlockState(pos.add(1, 2, z), leaves);
					if (world.isAirBlock(pos.add(z, 3, 0)))
						world.setBlockState(pos.add(z, 3, 0), leaves);
					if (world.isAirBlock(pos.add(0, 3, z)))
						world.setBlockState(pos.add(0, 3, z), leaves);
				}
			}
			for (int y = 0; y <= 4; y++)
			{
				world.setBlockState(pos.add(0, y, 0), logs);
			}

			world.setBlockState(pos.add(0, 4, 0), leaves);

			return true;
		}
		return false;
	}
}
