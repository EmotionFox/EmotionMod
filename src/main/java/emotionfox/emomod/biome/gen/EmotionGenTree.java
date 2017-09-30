package emotionfox.emomod.biome.gen;

import java.util.Random;

import emotionfox.emomod.blocks.EmotionLeaves;
import emotionfox.emomod.blocks.EmotionLog;
import emotionfox.emomod.blocks.EmotionPlanks;
import emotionfox.emomod.blocks.EmotionSapling;
import emotionfox.emomod.init.EmotionBlock;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class EmotionGenTree extends WorldGenerator
{
	private EmotionSapling sapling = (EmotionSapling) EmotionBlock.SAPLING;
	private EmotionPlanks.EnumType type;
	private IBlockState state;

	public EmotionGenTree(EmotionPlanks.EnumType typeIn)
	{
		this.type = typeIn;
		this.state = sapling.getDefaultState().withProperty(EmotionSapling.TYPE, typeIn);
	}

	@Override
	public boolean generate(World worldIn, Random rand, BlockPos position)
	{
		int height = 5 + rand.nextInt(2);

		IBlockState log = EmotionBlock.LOG.getDefaultState().withProperty(EmotionLog.VARIANT, type);
		IBlockState leave = EmotionBlock.LEAVES.getDefaultState().withProperty(EmotionLeaves.VARIANT, type);

		if (worldIn.isAirBlock(position) && position.getY() < 240 && this.sapling.canBlockStay(worldIn, position, this.state))
		{
			for (int x = -2; x <= 2; x++)
			{
				for (int z = -1; z <= 1; z++)
				{
					for (int y = -2; y <= 0; y++)
					{
						if (worldIn.isAirBlock(position.add(x, y + height, z)))
							worldIn.setBlockState(position.add(x, y + height, z), leave);
						if (worldIn.isAirBlock(position.add(z, y + height, x)))
							worldIn.setBlockState(position.add(z, y + height, x), leave);
					}
				}
			}
			for (int x = -1; x <= 1; x++)
			{
				for (int z = -1; z <= 1; z++)
				{
					if (worldIn.isAirBlock(position.add(x, height + 1, z)))
						worldIn.setBlockState(position.add(x, height + 1, z), leave);
				}
			}
			for (int x = -1; x <= 1; x++)
			{
				for (int z = -1; z <= 1; z++)
				{
					if (worldIn.getBlockState(position.add(x, height - 2, z)).getBlock() == EmotionBlock.LEAVES)
						worldIn.setBlockState(position.add(x, height - 2, z), Blocks.AIR.getDefaultState());
				}
			}
			for (int y = 0; y <= height; y++)
			{
				worldIn.setBlockState(position.add(0, y, 0), log);
			}
			return true;
		}
		return false;
	}
}
