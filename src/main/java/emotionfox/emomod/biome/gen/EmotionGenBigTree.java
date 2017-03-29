package emotionfox.emomod.biome.gen;

import java.util.Random;

import emotionfox.emomod.blocks.EmotionLeaves;
import emotionfox.emomod.blocks.EmotionLog;
import emotionfox.emomod.blocks.EmotionPlanks;
import emotionfox.emomod.blocks.EmotionSapling;
import emotionfox.emomod.init.EmotionBlocks;
import net.minecraft.block.BlockLog;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class EmotionGenBigTree extends WorldGenerator
{
	private EmotionSapling sapling = (EmotionSapling) EmotionBlocks.SAPLING;
	private EmotionPlanks.EnumType type;
	private IBlockState state;

	public EmotionGenBigTree(EmotionPlanks.EnumType typeIn)
	{
		this.type = typeIn;
		this.state = sapling.getDefaultState().withProperty(EmotionSapling.TYPE, typeIn);
	}

	@Override
	public boolean generate(World world, Random rand, BlockPos pos)
	{
		int height = rand.nextInt(6) + 8;
		IBlockState log = EmotionBlocks.LOG.getDefaultState().withProperty(EmotionLog.VARIANT, type);
		IBlockState leave = EmotionBlocks.LEAVES.getDefaultState().withProperty(EmotionLeaves.VARIANT, type);

		if (pos.getY() < 245 && world.isAirBlock(pos) && this.sapling.canBlockStay(world, pos, state))
		{
			for (int l = -4; l <= 4; l++)
			{
				if (l <= 3 && l >= -3)
				{
					if (world.getBlockState(pos.add(l, height + 1, 0)).getBlock() != EmotionBlocks.LOG)
						world.setBlockState(pos.add(l, height + 1, 0), leave);
					if (world.getBlockState(pos.add(0, height + 1, l)).getBlock() != EmotionBlocks.LOG)
						world.setBlockState(pos.add(0, height + 1, l), leave);
				}
				for (int x = -2; x <= 2; x++)
				{
					for (int y = height - 2; y <= height; y++)
					{
						for (int z = -2; z <= 2; z++)
						{
							if (l == 3 || l == -3)
							{
								BlockPos pos1 = pos.add(l, height - 1, 0);
								BlockPos pos2 = pos.add(0, height - 1, l);

								if (world.getBlockState(pos1.add(x, 0, z)).getBlock() != EmotionBlocks.LOG)
									world.setBlockState(pos1.add(x, 0, z), leave);
								if (world.getBlockState(pos2.add(x, 0, z)).getBlock() != EmotionBlocks.LOG)
									world.setBlockState(pos2.add(x, 0, z), leave);

								if (x == 2 && (z == -2 || z == 2) || x == -2 && (z == -2 || z == 2))
								{
									world.setBlockToAir(pos1.add(x, 0, z));
									world.setBlockToAir(pos2.add(x, 0, z));
								}
							}
							if (l == 4 || l == -4)
							{
								BlockPos pos1 = pos.add(l, height - 2, 0);
								BlockPos pos2 = pos.add(0, height - 2, l);

								if (world.getBlockState(pos1.add(x, 0, z)).getBlock() != EmotionBlocks.LOG)
									world.setBlockState(pos1.add(x, 0, z), leave);
								if (world.getBlockState(pos2.add(x, 0, z)).getBlock() != EmotionBlocks.LOG)
									world.setBlockState(pos2.add(x, 0, z), leave);

								if (x == 2 && (z == -2 || z == 2) || x == -2 && (z == -2 || z == 2))
								{
									world.setBlockToAir(pos1.add(x, 0, z));
									world.setBlockToAir(pos2.add(x, 0, z));
								}
							}

							if (world.getBlockState(pos.add(x, y, z)).getBlock() != EmotionBlocks.LOG)
								world.setBlockState(pos.add(x, y, z), leave);
						}
					}
				}
				for (int x = -1; x <= 1; x++)
				{
					for (int z = -1; z <= 1; z++)
					{
						if (world.getBlockState(pos.add(x, height + 1, z)).getBlock() != EmotionBlocks.LOG)
							world.setBlockState(pos.add(x, height + 1, z), leave);

						if (l == 3 || l == -3)
						{
							BlockPos pos1 = pos.add(l, height, 0);
							BlockPos pos2 = pos.add(0, height, l);

							if (world.getBlockState(pos1.add(x, 0, z)).getBlock() != EmotionBlocks.LOG)
								world.setBlockState(pos1.add(x, 0, z), leave);
							if (world.getBlockState(pos2.add(x, 0, z)).getBlock() != EmotionBlocks.LOG)
								world.setBlockState(pos2.add(x, 0, z), leave);
						}
						if (l == 4 || l == -4)
						{
							BlockPos pos1 = pos.add(l, height - 3, 0);
							BlockPos pos2 = pos.add(0, height - 3, l);

							if (world.getBlockState(pos1.add(x, 0, z)).getBlock() != EmotionBlocks.LOG)
								world.setBlockState(pos1.add(x, 0, z), leave);
							if (world.getBlockState(pos2.add(x, 0, z)).getBlock() != EmotionBlocks.LOG)
								world.setBlockState(pos2.add(x, 0, z), leave);
						}
					}
				}

				world.setBlockState(pos.add(l, height - 3, 0), log.withProperty(BlockLog.LOG_AXIS, BlockLog.EnumAxis.X));
				world.setBlockState(pos.add(0, height - 3, l), log.withProperty(EmotionLog.LOG_AXIS, BlockLog.EnumAxis.Z));

				if (l == 1 || l == -1)
				{
					world.setBlockToAir(pos.add(l, height - 3, 0));
					world.setBlockToAir(pos.add(0, height - 3, l));
					world.setBlockState(pos.add(l, height - 4, 0), log.withProperty(EmotionLog.LOG_AXIS, BlockLog.EnumAxis.X));
					world.setBlockState(pos.add(0, height - 4, l), log.withProperty(EmotionLog.LOG_AXIS, BlockLog.EnumAxis.Z));
				}
				if (l <= 2 && l >= -2)
				{
					world.setBlockState(pos.add(l, height - 1, 0), log.withProperty(EmotionLog.LOG_AXIS, BlockLog.EnumAxis.X));
					world.setBlockState(pos.add(0, height - 1, l), log.withProperty(EmotionLog.LOG_AXIS, BlockLog.EnumAxis.Z));
				}
				if (l == 3 || l == -3)
				{
					world.setBlockState(pos.add(l, height, 0), log);
					world.setBlockState(pos.add(0, height, l), log);
				}
				if (l == 4 || l == -4)
				{
					world.setBlockState(pos.add(l, height - 2, 0), log);
					world.setBlockState(pos.add(0, height - 2, l), log);
					world.setBlockState(pos.add(l, height - 3, 0), leave);
					world.setBlockState(pos.add(0, height - 3, l), leave);
				}
			}

			for (int y = 0; y <= height; y++)
			{
				world.setBlockState(pos.add(0, y, 0), log);
			}

			return true;
		}
		return false;
	}
}
