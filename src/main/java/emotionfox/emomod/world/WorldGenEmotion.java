package emotionfox.emomod.world;

import java.util.Random;

import emotionfox.emomod.biome.gen.EmotionGenPalmTree;
import emotionfox.emomod.init.EmotionBiome;
import emotionfox.emomod.init.EmotionBlocks;
import net.minecraft.block.BlockDirt;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

public class WorldGenEmotion implements IWorldGenerator
{
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider)
	{
		switch (world.provider.getDimension())
		{
		case -1:
			generateNether(world, random, chunkX * 16, chunkZ * 16);
		case 0:
			generateSurface(world, random, chunkX * 16, chunkZ * 16);
		case 1:
			generateEnd(world, random, chunkX * 16, chunkZ * 16);
		}
	}

	private void generateNether(World world, Random rand, int chunkX, int chunkZ)
	{
		int randPosX = chunkX + rand.nextInt(16);
		int randPosZ = chunkZ + rand.nextInt(16);

		for (int i = 0; i < 15; i++)
		{
			(new WorldGenMinable(EmotionBlocks.LUME_ORE.getDefaultState(), 7, BlockMatcher.forBlock(Blocks.NETHERRACK))).generate(world, rand, new BlockPos(randPosX, randPos(rand, 40, 120), randPosZ));
		}
	}

	private void generateSurface(World world, Random rand, int chunkX, int chunkZ)
	{
		int randPosX = chunkX + rand.nextInt(16);
		int randPosY;
		int randPosZ = chunkZ + rand.nextInt(16);

		for (int i = 0; i < 3; i++)
		{
			(new WorldGenMinable(EmotionBlocks.PURPURA_ORE.getDefaultState(), 3)).generate(world, rand, new BlockPos(randPosX, randPos(rand, 0, 10), randPosZ));
		}

		for (int i = 0; i < 1; i++)
		{
			randPosX = chunkX + (6 + rand.nextInt(32));
			randPosY = randPos(rand, 64, 66);
			randPosZ = chunkZ + (6 + rand.nextInt(32));

			if (world.getBiome(new BlockPos(randPosX, randPosY, randPosZ)) == Biome.getBiome(16))
			{
				(new EmotionGenPalmTree()).generate(world, rand, new BlockPos(randPosX, randPosY, randPosZ));
			}
		}

		for(int i = 0; i < 10; i++)
        {
            randPosY = randPos(rand, 60, 100);
            int randPosY2 = randPos(rand, 70, 100);
            
            if(world.getBiome(new BlockPos(randPosX, randPosY, randPosZ)) == EmotionBiome.ROCKY_LAND)
            {
                (new WorldGenMinable(EmotionBlocks.MUD.getDefaultState(), 15, BlockMatcher.forBlock(Blocks.GRASS))).generate(world, rand, new BlockPos(randPosX, randPosY, randPosZ));
            }
            if(world.getBiome(new BlockPos(randPosX, randPosY2, randPosZ)) == EmotionBiome.ROCKY_LAND)
            {
            	(new WorldGenMinable(Blocks.DIRT.getDefaultState().withProperty(BlockDirt.VARIANT, BlockDirt.DirtType.COARSE_DIRT), 30, BlockMatcher.forBlock(Blocks.GRASS_PATH))).generate(world, rand, new BlockPos(randPosX, randPosY2, randPosZ));
            }
        }
		
		for (int i = 0; i < 80; i++)
		{
			randPosY = randPos(rand, 30, 125);
			
			(new WorldGenMinable(EmotionBlocks.FOSSIL_ORE.getDefaultState(), 4, BlockMatcher.forBlock(Blocks.DIRT))).generate(world, rand, new BlockPos(randPosX, randPosY, randPosZ));
		}

		for (int i = 0; i < 80; i++)
		{
			randPosY = randPos(rand, 14, 64);

			if (world.getBiome(new BlockPos(randPosX, randPosY, randPosZ)) == EmotionBiome.ORCHARD)
			{
				(new WorldGenMinable(EmotionBlocks.LIMESTONE.getDefaultState(), 8)).generate(world, rand, new BlockPos(randPosX, randPosY, randPosZ));
			}
		}

		for (int i = 0; i < 80; i++)
		{
			randPosY = randPos(rand, 64, 74);

			if (world.getBiome(new BlockPos(randPosX, randPosY, randPosZ)) == Biome.getBiome(16) || world.getBiome(new BlockPos(randPosX, randPos(rand, 64, 74), randPosZ)) == Biome.getBiome(7))
			{
				(new WorldGenMinable(EmotionBlocks.SHIFTING_SAND.getDefaultState(), 8, BlockMatcher.forBlock(Blocks.SAND))).generate(world, rand, new BlockPos(randPosX, randPosY, randPosZ));
			}
		}

		if (rand.nextInt(4) == 0)
		{
			randPosX = chunkX + (6 + rand.nextInt(32));
			randPosY = randPos(rand, 64, 84);
			randPosZ = chunkZ + (6 + rand.nextInt(32));

			if (world.getBiome(new BlockPos(randPosX, randPosY, randPosZ)) == Biome.getBiome(2))
			{
				(new WorldGenDeadTree()).generate(world, rand, new BlockPos(randPosX, randPosY, randPosZ));
			}
		}
	}

	private void generateEnd(World world, Random rand, int chunkX, int chunkZ)
	{}

	private int randPos(Random rand, int yMin, int yMax)
	{
		int randPos = 0;

		return randPos = yMin + rand.nextInt(yMax - yMin);
	}
}
