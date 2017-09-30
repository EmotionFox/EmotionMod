package emotionfox.emomod.biome;

import java.util.Random;

import emotionfox.emomod.biome.gen.EmotionGenBigTree;
import emotionfox.emomod.biome.gen.EmotionGenBush;
import emotionfox.emomod.biome.gen.EmotionGenFlower;
import emotionfox.emomod.biome.gen.EmotionGenTree;
import emotionfox.emomod.blocks.EmotionFlower;
import emotionfox.emomod.blocks.EmotionPlanks;
import emotionfox.emomod.blocks.enumeration.EnumBerry;
import emotionfox.emomod.entity.EntityBeetle;
import emotionfox.emomod.entity.EntityButterfly;
import emotionfox.emomod.entity.EntitySmallSpider;
import emotionfox.emomod.init.EmotionBlock;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.ChunkPrimer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BiomeOrchard extends Biome
{
	private static final BiomeProperties properties = new BiomeProperties("Orchard").setTemperature(3F).setRainfall(0.5F).setBaseHeight(0.1F).setHeightVariation(0.2F).setWaterColor(0xff37e0);
	private static boolean genOrchard = false;

	public BiomeOrchard()
	{
		super(properties);
		this.decorator.treesPerChunk = -999;
		this.decorator.flowersPerChunk = -999;

		this.flowers.clear();
		this.addFlower(EmotionBlock.FLOWER.getDefaultState().withProperty(EmotionFlower.VARIANT, EmotionFlower.EnumType.DELY), 15);
		this.addFlower(EmotionBlock.FLOWER.getDefaultState().withProperty(EmotionFlower.VARIANT, EmotionFlower.EnumType.GNON), 3);
		this.addFlower(EmotionBlock.FLOWER.getDefaultState().withProperty(EmotionFlower.VARIANT, EmotionFlower.EnumType.KITTY), 20);
		this.addFlower(EmotionBlock.FLOWER.getDefaultState().withProperty(EmotionFlower.VARIANT, EmotionFlower.EnumType.NOX), 20);

		this.topBlock = Blocks.GRASS.getDefaultState();
		this.fillerBlock = Blocks.STONE.getDefaultState();

		this.spawnableCreatureList.clear();
		this.spawnableMonsterList.clear();

		this.spawnableCreatureList.add(new Biome.SpawnListEntry(EntitySheep.class, 10, 4, 4));
		this.spawnableCreatureList.add(new Biome.SpawnListEntry(EntityBeetle.class, 50, 3, 4));
		this.spawnableCreatureList.add(new Biome.SpawnListEntry(EntityButterfly.class, 70, 3, 5));

		this.spawnableMonsterList.add(new Biome.SpawnListEntry(EntitySpider.class, 100, 4, 4));
		this.spawnableMonsterList.add(new Biome.SpawnListEntry(EntitySmallSpider.class, 70, 4, 4));
	}

	@Override
	public void decorate(World worldIn, Random rand, BlockPos pos)
	{
		super.decorate(worldIn, rand, pos);

		int x = rand.nextInt(16) + 8;
		int z = rand.nextInt(16) + 8;

		BlockPos height = worldIn.getHeight(pos.add(x, 0, z));

		// Generate a grid of tree
		for (int xPos = 0; xPos <= 16; xPos++)
		{
			for (int zPos = 0; zPos <= 16; zPos++)
			{
				if (xPos % 8 == 0 && zPos % 8 == 0 && genOrchard)
				{
					height = worldIn.getHeight(pos.add(xPos, 0, zPos));

					if (rand.nextInt(10) == 0)
					{
						int random = rand.nextInt(10);

						if (random > 5)
							(new EmotionGenBigTree(EmotionPlanks.EnumType.PEAR)).generate(worldIn, rand, height);
						else if (random > 0)
							(new EmotionGenBigTree(EmotionPlanks.EnumType.ORANGE)).generate(worldIn, rand, height);
						else
							(new EmotionGenBigTree(EmotionPlanks.EnumType.CHERRY)).generate(worldIn, rand, height);
					}
					else
					{
						int random = rand.nextInt(10);

						if (random > 5)
							(new EmotionGenTree(EmotionPlanks.EnumType.PEAR)).generate(worldIn, rand, height);
						else if (random > 0)
							(new EmotionGenTree(EmotionPlanks.EnumType.ORANGE)).generate(worldIn, rand, height);
						else
							(new EmotionGenTree(EmotionPlanks.EnumType.CHERRY)).generate(worldIn, rand, height);
					}
				}
			}
		}

		// Generate Flower
		(new EmotionGenFlower(EmotionFlower.EnumType.DELY)).generate(worldIn, rand, height);
		(new EmotionGenFlower(EmotionFlower.EnumType.GNON)).generate(worldIn, rand, height);
		(new EmotionGenFlower(EmotionFlower.EnumType.KITTY)).generate(worldIn, rand, height);
		(new EmotionGenFlower(EmotionFlower.EnumType.NOX)).generate(worldIn, rand, height);

		// (new EmotionGenTest()).generate(worldIn, rand, height);

		// Generate Bush
		if (rand.nextInt(5) == 0)
		{
			(new EmotionGenBush(EnumBerry.BLACKCURRANT)).generate(worldIn, rand, height);
			(new EmotionGenBush(EnumBerry.STRAWBERRY)).generate(worldIn, rand, height);
		}
	}

	@Override
	public void genTerrainBlocks(World worldIn, Random rand, ChunkPrimer chunkPrimerIn, int x, int z, double noiseVal)
	{
		if (noiseVal > -1.0D && noiseVal <= 1D)
		{
			genOrchard = false;
			this.decorator.grassPerChunk = 3;
		}
		else
		{
			genOrchard = true;
			this.decorator.grassPerChunk = 1;
		}

		super.genTerrainBlocks(worldIn, rand, chunkPrimerIn, x, z, noiseVal);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public int getGrassColorAtPos(BlockPos pos)
	{
		return 0x9dcc42;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public int getSkyColorByTemp(float p_76731_1_)
	{
		return 0xFFbcf2ff;
	}
}
