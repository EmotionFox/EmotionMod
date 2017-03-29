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

public class EmotionGenAtlas extends WorldGenerator
{
	private EmotionSapling sapling = (EmotionSapling) EmotionBlocks.SAPLING;

	@Override
	public boolean generate(World world, Random rand, BlockPos pos)
	{
		int height = 8;
		IBlockState log = EmotionBlocks.LOG.getDefaultState().withProperty(EmotionLog.VARIANT, EmotionPlanks.EnumType.ATLAS);
		IBlockState leave = EmotionBlocks.LEAVES.getDefaultState().withProperty(EmotionLeaves.VARIANT, EmotionPlanks.EnumType.ATLAS);
		IBlockState xLog = log.withProperty(BlockLog.LOG_AXIS, BlockLog.EnumAxis.X);
		IBlockState zLog = log.withProperty(BlockLog.LOG_AXIS, BlockLog.EnumAxis.Z);

		BlockPos down = pos.down();
		
		if (pos.getY() < 245 && world.isAirBlock(pos) && this.sapling.canBlockStay(world, pos, sapling.getDefaultState().withProperty(EmotionSapling.TYPE, EmotionPlanks.EnumType.ATLAS)))
		{
			// Cross in the soil
			for (int x = -1; x < 2; x++)
			{
				world.setBlockState(down.add(x, 0, 0), xLog);
				world.setBlockState(down.add(x, 1, 0), leave);
			}
			for (int z = -1; z < 2; z++)
			{
				world.setBlockState(down.add(0, 0, z), zLog);
				world.setBlockState(down.add(0, 1, z), leave);
			}

			// Middle cross
			for (int x = -2; x < 3; x++)
			{
				world.setBlockState(down.add(x, height, 0), xLog);
			}
			for (int z = -2; z < 3; z++)
			{
				world.setBlockState(down.add(0, height, z), zLog);
			}

			// Leaves middle
			for (int x = -2; x < 3; x++)
			{
				world.setBlockState(down.add(x, height / 2, 0), leave);
			}
			for (int z = -2; z < 3; z++)
			{
				world.setBlockState(down.add(0, height / 2, z), leave);
			}
			for (int x = -1; x < 2; x++)
			{
				for (int z = -1; z < 2; z++)
				{
					world.setBlockState(down.add(x, height / 2, z), leave);
				}
			}

			// Leaves top
			for (int y = 0; y < 2; y++)
			{
				for (int x = -3; x < 4; x++)
				{
					BlockPos leavesPos = down.add(x, height - y, 0);
					if (world.isAirBlock(leavesPos))
						world.setBlockState(down.add(x, height - y, 0), leave);
				}
				for (int z = -3; z < 4; z++)
				{
					BlockPos leavesPos = down.add(0, height - y, z);
					if (world.isAirBlock(leavesPos))
						world.setBlockState(down.add(0, height - y, z), leave);
				}
			}

			for (int y = 0; y < 4; y++)
			{
				for (int x = -1; x < 2; x++)
				{
					for (int z = -1; z < 2; z++)
					{
						BlockPos leavesPos = down.add(x, height - 1 + y, z);
						if (world.isAirBlock(leavesPos))
							world.setBlockState(leavesPos, leave);
					}
				}
			}

			for (int y = 0; y < 2; y++)
			{
				for (int x = -2; x < 3; x++)
				{
					for (int z = -2; z < 3; z++)
					{
						if (!isCorner(x, z))
						{
							BlockPos leavesPos = down.add(x, height + y, z);
							if (world.isAirBlock(leavesPos))
								world.setBlockState(leavesPos, leave);
						}
					}
				}
			}

			// Tree
			for (int y = 0; y < height; y++)
			{
				world.setBlockState(pos.add(0, y, 0), log);
			}

			return true;
		}
		return false;
	}

	private boolean isCorner(int x, int z)
	{
		return (x == -2 && (z == 2 || z == -2)) || (x == 2 && (z == 2 || z == -2));
	}
}
