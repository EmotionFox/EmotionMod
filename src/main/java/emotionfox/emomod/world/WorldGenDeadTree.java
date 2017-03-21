package emotionfox.emomod.world;

import java.util.Random;

import net.minecraft.block.BlockDirt;
import net.minecraft.block.BlockDirt.DirtType;
import net.minecraft.block.BlockLog;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WorldGenDeadTree extends WorldGenerator
{
	@Override
	public boolean generate(World world, Random rand, BlockPos pos)
	{
		if(world.getBlockState(pos).getBlock() == Blocks.SAND && world.isAirBlock(pos.add(0, 1, 0)))
        {
            for(int x = -2; x <= 2; x++)
            {
                for(int y = -2; y <= 2; y++)
                {
                    for(int z = -2; z <= 2; z++)
                    {
                        if(world.getBlockState(pos.add(x, y, z)).getBlock() == Blocks.SAND && world.isAirBlock(pos.add(x, y + 1, z)))
                        {
                            world.setBlockState(pos.add(x, y, z), Blocks.DIRT.getDefaultState().withProperty(BlockDirt.VARIANT, DirtType.PODZOL));
                            world.setBlockState(pos.add(x, y - 1, z), Blocks.DIRT.getDefaultState());

                            if(x == -2 && (z == -2 || z == 2) || x == 2 && (z == -2 || z == 2))
                            {
                                world.setBlockState(pos.add(x, y, z), Blocks.SAND.getDefaultState());
                                world.setBlockState(pos.add(x, y - 1, z), Blocks.SAND.getDefaultState());
                            }
                        }
                    }
                }
            }
            for(int y = 0; y <= 4; y++)
            {
                world.setBlockState(pos.add(0, 1 + y, 0), Blocks.LOG.getDefaultState());
            }

            if(rand.nextInt(4) == 0)
            {
                world.setBlockState(pos.add(-1, 4, 0), Blocks.LOG.getDefaultState().withProperty(BlockLog.LOG_AXIS, BlockLog.EnumAxis.X));
                world.setBlockState(pos.add(1, 3, 0), Blocks.LOG.getDefaultState().withProperty(BlockLog.LOG_AXIS, BlockLog.EnumAxis.X));
            }
            else if(rand.nextInt(4) == 0)
            {
                world.setBlockState(pos.add(-1, 3, 0), Blocks.LOG.getDefaultState().withProperty(BlockLog.LOG_AXIS, BlockLog.EnumAxis.X));
                world.setBlockState(pos.add(1, 4, 0), Blocks.LOG.getDefaultState().withProperty(BlockLog.LOG_AXIS, BlockLog.EnumAxis.X));
            }
            else if(rand.nextInt(4) == 0)
            {
                world.setBlockState(pos.add(0, 3, -1), Blocks.LOG.getDefaultState().withProperty(BlockLog.LOG_AXIS, BlockLog.EnumAxis.Z));
                world.setBlockState(pos.add(0, 4, 1), Blocks.LOG.getDefaultState().withProperty(BlockLog.LOG_AXIS, BlockLog.EnumAxis.Z));
            }
            else
            {
                world.setBlockState(pos.add(0, 4, -1), Blocks.LOG.getDefaultState().withProperty(BlockLog.LOG_AXIS, BlockLog.EnumAxis.Z));
                world.setBlockState(pos.add(0, 3, 1), Blocks.LOG.getDefaultState().withProperty(BlockLog.LOG_AXIS, BlockLog.EnumAxis.Z));
            }
        }
        return true;
	}
}
