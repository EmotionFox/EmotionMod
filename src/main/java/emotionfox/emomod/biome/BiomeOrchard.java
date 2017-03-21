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
import emotionfox.emomod.entity.EntityMouse;
import emotionfox.emomod.entity.EntitySmallSpider;
import emotionfox.emomod.init.EmotionBlocks;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.init.Blocks;
import net.minecraft.util.WeightedRandom;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biome.BiomeProperties;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BiomeOrchard extends Biome
{
	private static final BiomeProperties properties = new BiomeProperties("Orchard").setTemperature(3F).setRainfall(0.5F).setBaseHeight(0F).setHeightVariation(0.01F).setWaterColor(0xff37e0);
	
	public BiomeOrchard()
	{
		super(properties);
		this.theBiomeDecorator.treesPerChunk = -999;
		this.theBiomeDecorator.grassPerChunk = 2;
		this.theBiomeDecorator.flowersPerChunk = -999;

		this.flowers.clear();
		this.addFlower(EmotionBlocks.baseFlower.getDefaultState().withProperty(EmotionFlower.VARIANT, EmotionFlower.EnumType.DELY), 15);
		this.addFlower(EmotionBlocks.baseFlower.getDefaultState().withProperty(EmotionFlower.VARIANT, EmotionFlower.EnumType.GNON), 3);
		this.addFlower(EmotionBlocks.baseFlower.getDefaultState().withProperty(EmotionFlower.VARIANT, EmotionFlower.EnumType.KITTY), 20);
		this.addFlower(EmotionBlocks.baseFlower.getDefaultState().withProperty(EmotionFlower.VARIANT, EmotionFlower.EnumType.NOX), 20);

		this.topBlock = Blocks.GRASS.getDefaultState();
		this.fillerBlock = Blocks.STONE.getDefaultState();
		
		this.spawnableCreatureList.add(new Biome.SpawnListEntry(EntityBeetle.class, 10, 1, 3));
		
		this.spawnableMonsterList.clear();
		this.spawnableMonsterList.add(new Biome.SpawnListEntry(EntitySpider.class, 100, 4, 4));
		this.spawnableMonsterList.add(new Biome.SpawnListEntry(EntitySmallSpider.class, 100, 4, 4));
	}

	@Override
	public void decorate(World worldIn, Random rand, BlockPos pos)
	{
		super.decorate(worldIn, rand, pos);

		int x = rand.nextInt(16) + 8;
		int z = rand.nextInt(16) + 8;

		BlockPos blockpos1 = worldIn.getHeight(pos.add(x, 0, z));

		// Generate Flower
		(new EmotionGenFlower(EmotionFlower.EnumType.DELY)).generate(worldIn, rand, blockpos1);
		(new EmotionGenFlower(EmotionFlower.EnumType.GNON)).generate(worldIn, rand, blockpos1);
		(new EmotionGenFlower(EmotionFlower.EnumType.KITTY)).generate(worldIn, rand, blockpos1);
		(new EmotionGenFlower(EmotionFlower.EnumType.NOX)).generate(worldIn, rand, blockpos1);

		// Generate Bush
		if (rand.nextInt(3) == 0)
		{
			(new EmotionGenBush(EnumBerry.BLACKCURRANT)).generate(worldIn, rand, blockpos1);
			(new EmotionGenBush(EnumBerry.STRAWBERRY)).generate(worldIn, rand, blockpos1);
		}

		// Generate Big Tree
		if (rand.nextInt(4) == 0)
		{
			if (rand.nextInt(3) == 0)
				(new EmotionGenBigTree(EmotionPlanks.EnumType.CHERRY)).generate(worldIn, rand, worldIn.getTopSolidOrLiquidBlock(pos.add(x, 0, z)));
			else if (rand.nextInt(2) == 0)
				(new EmotionGenBigTree(EmotionPlanks.EnumType.PEAR)).generate(worldIn, rand, worldIn.getTopSolidOrLiquidBlock(pos.add(x, 0, z)));
			else
				(new EmotionGenBigTree(EmotionPlanks.EnumType.ORANGE)).generate(worldIn, rand, worldIn.getTopSolidOrLiquidBlock(pos.add(x, 0, z)));
		}

		// Generate Tree
		if (rand.nextInt(3) == 0)
			(new EmotionGenTree(EmotionPlanks.EnumType.CHERRY)).generate(worldIn, rand, worldIn.getTopSolidOrLiquidBlock(pos.add(x, 0, z)));
		else if (rand.nextInt(2) == 0)
			(new EmotionGenTree(EmotionPlanks.EnumType.PEAR)).generate(worldIn, rand, worldIn.getTopSolidOrLiquidBlock(pos.add(x, 0, z)));
		else
			(new EmotionGenTree(EmotionPlanks.EnumType.ORANGE)).generate(worldIn, rand, worldIn.getTopSolidOrLiquidBlock(pos.add(x, 0, z)));
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
