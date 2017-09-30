package emotionfox.emomod.biome.gen;

import java.util.Random;

import emotionfox.emomod.blocks.EmotionFlower;
import emotionfox.emomod.init.EmotionBlock;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class EmotionGenFlower extends WorldGenerator
{
	private EmotionFlower flower = (EmotionFlower) EmotionBlock.FLOWER;
	private IBlockState state;

	public EmotionGenFlower(EmotionFlower.EnumType typeIn)
	{
		this.state = flower.getDefaultState().withProperty(flower.VARIANT, typeIn);
	}

	@Override
	public boolean generate(World worldIn, Random rand, BlockPos position)
	{
		for (int i = 0; i < 5; ++i)
		{
			BlockPos blockpos = position.add(rand.nextInt(8) - rand.nextInt(8), rand.nextInt(4) - rand.nextInt(4), rand.nextInt(8) - rand.nextInt(8));

			if (worldIn.isAirBlock(blockpos) && (worldIn.provider.hasSkyLight() || blockpos.getY() < 255) && this.flower.canBlockStay(worldIn, blockpos, this.state))
			{
				worldIn.setBlockState(blockpos, this.state, 2);
			}
		}

		return true;
	}
}
