package emotionfox.emomod.biome.gen;

import java.util.Random;

import emotionfox.emomod.block.EmotionNewLeaves;
import emotionfox.emomod.block.EmotionNewLog;
import emotionfox.emomod.block.EmotionPlanks;
import emotionfox.emomod.block.EmotionSapling;
import emotionfox.emomod.init.EmotionBlock;
import net.minecraft.block.BlockLog;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class EmotionGenPalmTree extends WorldGenerator
{
	@Override
	public boolean generate(World world, Random rand, BlockPos pos)
	{
		IBlockState logs = EmotionBlock.NEW_LOG.getDefaultState().withProperty(EmotionNewLog.VARIANT, EmotionPlanks.EnumType.COCO);
		IBlockState leaves = EmotionBlock.NEW_LEAVES.getDefaultState().withProperty(EmotionNewLeaves.VARIANT, EmotionPlanks.EnumType.COCO);
		int height = 10 + rand.nextInt(4);

		if ((world.getBlockState(pos.down()).getBlock() == Blocks.SAND || ((EmotionSapling) EmotionBlock.SAPLING).canBlockStay(world, pos, EmotionBlock.SAPLING.getDefaultState()))
				&& pos.getY() < 245 && world.isAirBlock(pos))
		{
			for (int l = -5; l <= 5; l++)
			{
				if (l >= -4 && l <= 4)
				{
					world.setBlockState(pos.add(l, height - 1, 0), logs.withProperty(BlockLog.LOG_AXIS, BlockLog.EnumAxis.X));
					world.setBlockState(pos.add(0, height - 1, l), logs.withProperty(BlockLog.LOG_AXIS, BlockLog.EnumAxis.Z));
				}

				if (l >= -3 && l <= 3)
				{
					world.setBlockState(pos.add(l, height, l), logs);
					world.setBlockState(pos.add(l, height, -l), logs);
					world.setBlockState(pos.add(-l, height, l), logs);
					world.setBlockState(pos.add(-l, height, -l), logs);
				}

				if (l >= -2 && l <= 2)
				{
					world.setBlockState(pos.add(l, height, 0), logs.withProperty(BlockLog.LOG_AXIS, BlockLog.EnumAxis.X));
					world.setBlockState(pos.add(0, height, l), logs.withProperty(BlockLog.LOG_AXIS, BlockLog.EnumAxis.Z));
					world.setBlockToAir(pos.add(l, height - 1, 0));
					world.setBlockToAir(pos.add(0, height - 1, l));
				}
				if (l == -5 || l == 5)
				{
					for (int y = -1; y <= 0; y++)
					{
						world.setBlockState(pos.add(l, (height - 3) - y, 0), logs);
						world.setBlockState(pos.add(0, (height - 3) - y, l), logs);
					}
				}

				for (int x = -5; x <= 5; x++)
				{
					for (int y = -1; y <= 0; y++)
					{
						for (int z = -5; z <= 5; z++)
						{
							if ((x >= -4 && x <= 4) && (z >= -4 && z <= 4))
							{
								if ((x == -4 && (z == 4 || z == -4) || x == 4 && (z == 4 || z == -4)))
								{
									world.setBlockState(pos.add(x, height - 1, z), logs);
								}
							}

							if ((x == -5 || x <= 5) || (z == -5 || z == 5))
							{
								if ((x == -5 && (z == 5 || z == -5) || x == 5 && (z == 5 || z == -5)))
								{
									world.setBlockState(pos.add(x, (height - 3) - y, z), logs);
								}
							}
						}
					}
				}
			}

			for (int y = -5; y <= 1; y++)
			{
				for (int x = -6; x <= 6; x++)
				{
					for (int z = -6; z <= 6; z++)
					{
						BlockPos pos1 = pos.add(0, height, 0);

						if (world.getBlockState(pos1.add(x, y, z)).getBlock() != EmotionBlock.NEW_LOG)
						{
							// Don't judge me
							if (world.getBlockState(pos1.add(x, y, z).up()).getBlock() == EmotionBlock.NEW_LOG)
								world.setBlockState(pos1.add(x, y, z), leaves);
							if (world.getBlockState(pos1.add(x, y, z).down()).getBlock() == EmotionBlock.NEW_LOG)
								world.setBlockState(pos1.add(x, y, z), leaves);
							if (world.getBlockState(pos1.add(x, y, z).east()).getBlock() == EmotionBlock.NEW_LOG)
								world.setBlockState(pos1.add(x, y, z), leaves);
							if (world.getBlockState(pos1.add(x, y, z).west()).getBlock() == EmotionBlock.NEW_LOG)
								world.setBlockState(pos1.add(x, y, z), leaves);
							if (world.getBlockState(pos1.add(x, y, z).north()).getBlock() == EmotionBlock.NEW_LOG)
								world.setBlockState(pos1.add(x, y, z), leaves);
							if (world.getBlockState(pos1.add(x, y, z).south()).getBlock() == EmotionBlock.NEW_LOG)
								world.setBlockState(pos1.add(x, y, z), leaves);
						}
					}
				}
			}

			for (int y = 0; y <= height; y++)
			{
				world.setBlockState(pos.add(0, y, 0), logs);
			}

			return true;
		}
		return false;
	}
}
