package emotionfox.emomod.biome.gen;

import java.util.Random;

import emotionfox.emomod.blocks.EmotionMushroom;
import emotionfox.emomod.init.EmotionBlocks;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class EmotionGenMushroom extends WorldGenerator
{
	private EmotionMushroom mushroom = (EmotionMushroom) EmotionBlocks.baseMushroom;
	private IBlockState state;

	public EmotionGenMushroom(EmotionMushroom.EnumType mushroomIn)
	{
		this.state = mushroom.getDefaultState().withProperty(EmotionMushroom.VARIANT, mushroomIn);
	}

	@Override
	public boolean generate(World world, Random rand, BlockPos pos)
	{
		BlockPos blockpos = pos.add(rand.nextInt(8) - rand.nextInt(8), rand.nextInt(4) - rand.nextInt(4), rand.nextInt(8) - rand.nextInt(8));

		if (world.isAirBlock(blockpos) && (!world.provider.hasNoSky() || blockpos.getY() < 255) && this.mushroom.canBlockStay(world, blockpos, this.state))
		{
			world.setBlockState(blockpos, this.state);
			return true;
		}
		return false;
	}

}
