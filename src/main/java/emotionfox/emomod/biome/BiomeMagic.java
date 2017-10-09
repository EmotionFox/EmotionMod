package emotionfox.emomod.biome;

import java.util.Random;

import emotionfox.emomod.biome.gen.EmotionGenAtlas;
import emotionfox.emomod.biome.gen.EmotionGenBush;
import emotionfox.emomod.biome.gen.EmotionGenFlower;
import emotionfox.emomod.biome.gen.EmotionGenMushroom;
import emotionfox.emomod.block.EmotionFlower;
import emotionfox.emomod.block.EmotionMushroom;
import emotionfox.emomod.block.enumeration.EnumBerry;
import emotionfox.emomod.entity.EntityBeetle;
import emotionfox.emomod.entity.EntityMouse;
import emotionfox.emomod.init.EmotionBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BiomeMagic extends Biome
{
	private static final BiomeProperties properties = new BiomeProperties("Magic Plains").setTemperature(1F).setRainDisabled().setBaseHeight(0.1F).setHeightVariation(0.1F).setWaterColor(0x00ff82);

	public BiomeMagic()
	{
		super(properties);
		this.decorator.treesPerChunk = 1;
		this.decorator.grassPerChunk = 15;
		this.decorator.flowersPerChunk = -999;

		this.flowers.clear();
		this.addFlower(EmotionBlock.FLOWER.getDefaultState().withProperty(EmotionFlower.VARIANT, EmotionFlower.EnumType.NOX), 20);
		this.addFlower(EmotionBlock.FLOWER.getDefaultState().withProperty(EmotionFlower.VARIANT, EmotionFlower.EnumType.CENTUS), 20);
		this.addFlower(EmotionBlock.FLOWER.getDefaultState().withProperty(EmotionFlower.VARIANT, EmotionFlower.EnumType.THORNY), 15);

		this.spawnableCreatureList.add(new Biome.SpawnListEntry(EntityBeetle.class, 10, 4, 4));
		this.spawnableCreatureList.add(new Biome.SpawnListEntry(EntityMouse.class, 10, 1, 4));
	}

	@Override
	public void decorate(World worldIn, Random rand, BlockPos pos)
	{
		super.decorate(worldIn, rand, pos);

		int x = rand.nextInt(16) + 8;
		int z = rand.nextInt(16) + 8;

		BlockPos blockpos1 = worldIn.getHeight(pos.add(x, 0, z));

		// Generate Flower
		if (net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, rand, pos, net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.FLOWERS))
		{
			(new EmotionGenFlower(EmotionFlower.EnumType.CENTUS)).generate(worldIn, rand, blockpos1);
			(new EmotionGenFlower(EmotionFlower.EnumType.NOX)).generate(worldIn, rand, blockpos1);
			(new EmotionGenFlower(EmotionFlower.EnumType.THORNY)).generate(worldIn, rand, blockpos1);
		}

		// Generate Mushroom
		if (net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, rand, pos, net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.SHROOM))
			(new EmotionGenMushroom(EmotionMushroom.EnumType.BLUE)).generate(worldIn, rand, blockpos1);

		// Generate Bush
		if (net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, rand, pos, net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.CUSTOM))
		{
			if (rand.nextInt(3) == 0)
			{
				(new EmotionGenBush(EnumBerry.BLUEBERRY)).generate(worldIn, rand, blockpos1);
			}
		}

		if (net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, rand, pos, net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.TREE))
			(new EmotionGenAtlas()).generate(worldIn, rand, blockpos1);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public int getGrassColorAtPos(BlockPos pos)
	{
		return 0x35aaaf;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public int getFoliageColorAtPos(BlockPos pos)
	{
		return 0x35aaaf;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public int getSkyColorByTemp(float par1)
	{
		return 0x35aaaf;
	}
}
