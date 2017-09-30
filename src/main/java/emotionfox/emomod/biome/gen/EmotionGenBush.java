package emotionfox.emomod.biome.gen;

import java.util.Random;

import emotionfox.emomod.blocks.EmotionBerry;
import emotionfox.emomod.blocks.EmotionBerryBush;
import emotionfox.emomod.blocks.enumeration.EnumBerry;
import emotionfox.emomod.init.EmotionBlock;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class EmotionGenBush extends WorldGenerator
{
	private EmotionBerry bush = (EmotionBerry) EmotionBlock.BUSH;
	private IBlockState state;

	public EmotionGenBush(EnumBerry berryIn)
	{
		setGeneratedBlock(berryIn);
	}

	public void setGeneratedBlock(EnumBerry berryIn)
	{
		this.state = bush.getDefaultState().withProperty(EmotionBerryBush.BERRY, berryIn);
	}

	@Override
	public boolean generate(World worldIn, Random rand, BlockPos position)
	{
		for (int i = 0; i < 5; ++i)
		{
			BlockPos blockpos = position.add(rand.nextInt(8) - rand.nextInt(8), rand.nextInt(4) - rand.nextInt(4), rand.nextInt(8) - rand.nextInt(8));

			if (worldIn.isAirBlock(blockpos) && (worldIn.provider.hasSkyLight() || blockpos.getY() < 255) && this.bush.canBlockStay(worldIn, blockpos, this.state))
			{
				worldIn.setBlockState(blockpos, this.state, 2);
			}
		}

		return true;
	}
}
