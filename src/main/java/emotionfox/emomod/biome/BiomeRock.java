package emotionfox.emomod.biome;

import java.util.Random;

import emotionfox.emomod.biome.gen.EmotionGenBush;
import emotionfox.emomod.biome.gen.EmotionGenLittleTree;
import emotionfox.emomod.biome.gen.EmotionGenPine;
import emotionfox.emomod.blocks.enumeration.EnumBerry;
import emotionfox.emomod.entity.EntityBeetle;
import emotionfox.emomod.entity.EntitySmallSpider;
import emotionfox.emomod.init.EmotionBlock;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.ChunkPrimer;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BiomeRock extends Biome
{
	private static final BiomeProperties properties = new BiomeProperties("Rocky Land").setTemperature(2F).setRainfall(0.5F).setBaseHeight(1F).setHeightVariation(0.3F).setWaterColor(0xFFa0a0a0);

	public BiomeRock()
	{
		super(properties);
		this.decorator.treesPerChunk = -999;
		this.decorator.grassPerChunk = 10;
		this.decorator.flowersPerChunk = 2;

		this.spawnableCreatureList.add(new Biome.SpawnListEntry(EntityBeetle.class, 8, 3, 5));
		this.spawnableMonsterList.add(new Biome.SpawnListEntry(EntitySmallSpider.class, 50, 4, 4));
	}

	@Override
	public void decorate(World worldIn, Random rand, BlockPos pos)
	{
		super.decorate(worldIn, rand, pos);

		WorldGenerator viridis = new ViridisGenerator();
		if (net.minecraftforge.event.terraingen.TerrainGen.generateOre(worldIn, rand, viridis, pos, net.minecraftforge.event.terraingen.OreGenEvent.GenerateMinable.EventType.CUSTOM))
			viridis.generate(worldIn, rand, pos);

		int x = rand.nextInt(16) + 8;
		int z = rand.nextInt(16) + 8;

		BlockPos blockpos1 = worldIn.getHeight(pos.add(x, 0, z));

		// Generate Bush
		if (rand.nextInt(5) == 0)
		{
			(new EmotionGenBush(EnumBerry.REDCURRANT)).generate(worldIn, rand, blockpos1);
		}

		for (int i = 0; i < 4; i++)
		{
			x = rand.nextInt(16) + 8;
			z = rand.nextInt(16) + 8;

			(new EmotionGenLittleTree()).generate(worldIn, rand, worldIn.getTopSolidOrLiquidBlock(pos.add(x, 0, z)));
		}

		for (int i = 0; i < 8; i++)
		{
			x = rand.nextInt(16) + 8;
			z = rand.nextInt(16) + 8;

			(new EmotionGenPine()).generate(worldIn, rand, worldIn.getTopSolidOrLiquidBlock(pos.add(x, 0, z)));
		}
	}

	@Override
	public void genTerrainBlocks(World worldIn, Random rand, ChunkPrimer chunkPrimerIn, int x, int z, double noiseVal)
	{
		this.topBlock = Blocks.GRASS.getDefaultState();
		this.fillerBlock = Blocks.DIRT.getDefaultState();

		if (noiseVal > 1.0D && noiseVal <= 1.7D)
		{
			if (rand.nextInt(8) == 0)
			{
				this.topBlock = Blocks.GRASS.getDefaultState();
				this.fillerBlock = Blocks.DIRT.getDefaultState();
			}
			else
			{
				this.topBlock = Blocks.GRASS_PATH.getDefaultState();
				this.fillerBlock = Blocks.DIRT.getDefaultState();
			}
		}

		this.generateBiomeTerrain(worldIn, rand, chunkPrimerIn, x, z, noiseVal);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public int getGrassColorAtPos(BlockPos pos)
	{
		return 0xFF4ab16c;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public int getFoliageColorAtPos(BlockPos pos)
	{
		return 0xFF4ab16c;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public int getSkyColorByTemp(float p_76731_1_)
	{
		return 0xFF93fbd0;
	}

	private static class ViridisGenerator extends WorldGenerator
	{
		@Override
		public boolean generate(World worldIn, Random rand, BlockPos pos)
		{
			int count = 6 + rand.nextInt(8);

			for (int i = 0; i < count; i++)
			{
				BlockPos blockpos = pos.add(rand.nextInt(16), rand.nextInt(28) + 4, rand.nextInt(16));

				net.minecraft.block.state.IBlockState state = worldIn.getBlockState(blockpos);
				if (state.getBlock().isReplaceableOreGen(state, worldIn, blockpos, net.minecraft.block.state.pattern.BlockMatcher.forBlock(Blocks.STONE)))
				{
					worldIn.setBlockState(blockpos, EmotionBlock.VIRIDIS_ORE.getDefaultState(), 2);
				}
			}
			return true;
		}
	}
}
