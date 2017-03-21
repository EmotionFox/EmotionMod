package emotionfox.emomod.biome.gen;

import java.util.Random;

import emotionfox.emomod.blocks.base.BaseBush;
import net.minecraft.block.BlockSapling;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class EmotionGenLittleTree extends WorldGenerator
{
	private BlockSapling sapling = (BlockSapling)Blocks.SAPLING;
	
	@Override
	public boolean generate(World world, Random rand, BlockPos pos)
	{
		IBlockState logs = Blocks.LOG.getDefaultState();
        IBlockState leaves = Blocks.LEAVES.getDefaultState();

        if(this.sapling.canBlockStay(world, pos, this.sapling.getDefaultState()) && pos.getY() < 245 && world.isAirBlock(pos))
        {
            for(int l = -1; l <= 1; l++)
            {
                if(world.isAirBlock(pos.add(l, 0, 0)) || world.getBlockState(pos.add(l, 0, 0)).getBlock() == Blocks.TALLGRASS)
                    world.setBlockState(pos.add(l, 0, 0), leaves);
                if(world.isAirBlock(pos.add(0, 0, l)) || world.getBlockState(pos.add(0, 0, l)).getBlock() == Blocks.TALLGRASS)
                    world.setBlockState(pos.add(0, 0, l), leaves);
            }

            world.setBlockState(pos, logs);
            world.setBlockState(pos.up(), leaves);

            return true;
        }
        return false;
	}
}
