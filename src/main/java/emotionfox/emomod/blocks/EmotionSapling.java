package emotionfox.emomod.blocks;

import java.util.Random;

import emotionfox.emomod.biome.gen.EmotionGenAtlas;
import emotionfox.emomod.biome.gen.EmotionGenBigTree;
import emotionfox.emomod.biome.gen.EmotionGenPalmTree;
import emotionfox.emomod.biome.gen.EmotionGenPine;
import emotionfox.emomod.biome.gen.EmotionGenTree;
import emotionfox.emomod.blocks.base.BaseBush;
import emotionfox.emomod.blocks.item.IMetaBlockName;
import net.minecraft.block.IGrowable;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.event.terraingen.TerrainGen;

public class EmotionSapling extends BaseBush implements IGrowable, IMetaBlockName
{
	public static final PropertyEnum TYPE = PropertyEnum.create("type", EmotionPlanks.EnumType.class);
	public static final PropertyInteger STAGE = PropertyInteger.create("stage", 0, 1);
	public static final AxisAlignedBB SAPLING_AABB = new AxisAlignedBB(0.09999999403953552D, 0.0D, 0.09999999403953552D, 0.8999999761581421D, 0.800000011920929D, 0.8999999761581421D);

	public EmotionSapling()
	{
		this.setDefaultState(this.blockState.getBaseState().withProperty(TYPE, EmotionPlanks.EnumType.CHERRY).withProperty(STAGE, Integer.valueOf(0)));
		this.setCreativeTab(CreativeTabs.DECORATIONS);
	}

	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
	{
		return SAPLING_AABB;
	}

	@Override
	public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand)
	{
		if (!worldIn.isRemote)
		{
			super.updateTick(worldIn, pos, state, rand);

			if (worldIn.getLightFromNeighbors(pos.up()) >= 9 && rand.nextInt(7) == 0)
			{
				this.grow(worldIn, rand, pos, state);
			}
		}
	}

	@Override
	public void grow(World worldIn, Random rand, BlockPos pos, IBlockState state)
	{
		if (((Integer) state.getValue(STAGE)).intValue() == 0)
		{
			worldIn.setBlockState(pos, state.cycleProperty(STAGE), 4);
		}
		else
		{
			this.generateTree(worldIn, pos, state, rand);
		}
	}

	public void generateTree(World worldIn, BlockPos pos, IBlockState state, Random rand)
	{
		if (!TerrainGen.saplingGrowTree(worldIn, rand, pos))
			return;

		Object gen = new EmotionGenTree(EmotionPlanks.EnumType.CHERRY);

		switch ((EmotionPlanks.EnumType) state.getValue(TYPE))
		{
		case CHERRY:
			if (rand.nextInt(15) == 0)
				gen = new EmotionGenBigTree(EmotionPlanks.EnumType.CHERRY);
			else
				gen = new EmotionGenTree(EmotionPlanks.EnumType.CHERRY);
			break;
		case PEAR:
			if (rand.nextInt(15) == 0)
				gen = new EmotionGenBigTree(EmotionPlanks.EnumType.PEAR);
			else
				gen = new EmotionGenTree(EmotionPlanks.EnumType.PEAR);
		case ORANGE:
			if (rand.nextInt(15) == 0)
				gen = new EmotionGenBigTree(EmotionPlanks.EnumType.ORANGE);
			else
				gen = new EmotionGenTree(EmotionPlanks.EnumType.ORANGE);
			break;
		case ATLAS:
			gen = new EmotionGenAtlas();
			break;
		case PINE:
			gen = new EmotionGenPine();
			break;
		case COCO:
			gen = new EmotionGenPalmTree();
			break;
		case DREAM:
			if (rand.nextInt(15) != 0)
				gen = new EmotionGenPine();
			else
				gen = new EmotionGenPine();
			break;
		}

		int i = 0;
		int j = 0;
		boolean flag = false;

		IBlockState iblockstate1 = Blocks.AIR.getDefaultState();

		if (flag)
		{
			worldIn.setBlockState(pos.add(i, 0, j), iblockstate1, 4);
			worldIn.setBlockState(pos.add(i + 1, 0, j), iblockstate1, 4);
			worldIn.setBlockState(pos.add(i, 0, j + 1), iblockstate1, 4);
			worldIn.setBlockState(pos.add(i + 1, 0, j + 1), iblockstate1, 4);
		}
		else
		{
			worldIn.setBlockState(pos, iblockstate1, 4);
		}

		if (!((WorldGenerator) gen).generate(worldIn, rand, pos.add(i, 0, j)))
		{
			if (flag)
			{
				worldIn.setBlockState(pos.add(i, 0, j), state, 4);
				worldIn.setBlockState(pos.add(i + 1, 0, j), state, 4);
				worldIn.setBlockState(pos.add(i, 0, j + 1), state, 4);
				worldIn.setBlockState(pos.add(i + 1, 0, j + 1), state, 4);
			}
			else
			{
				worldIn.setBlockState(pos, state, 4);
			}
		}
	}

	public boolean isTypeAt(World worldIn, BlockPos pos, EmotionPlanks.EnumType type)
	{
		IBlockState iblockstate = worldIn.getBlockState(pos);
		return iblockstate.getBlock() == this && iblockstate.getValue(TYPE) == type;
	}

	@Override
	public int damageDropped(IBlockState state)
	{
		return ((EmotionPlanks.EnumType) state.getValue(TYPE)).getMetadata();
	}

	@Override
	public void getSubBlocks(Item itemIn, CreativeTabs tab, NonNullList<ItemStack> list)
	{
		for (int i = 0; i < EmotionPlanks.EnumType.values().length; i++)
		{
			list.add(new ItemStack(itemIn, 1, i));
		}
	}

	@Override
	public boolean canGrow(World worldIn, BlockPos pos, IBlockState state, boolean isClient)
	{
		return true;
	}

	@Override
	public boolean canUseBonemeal(World worldIn, Random rand, BlockPos pos, IBlockState state)
	{
		return (double) worldIn.rand.nextFloat() < 0.45D;
	}

	@Override
	public IBlockState getStateFromMeta(int meta)
	{
		return this.getDefaultState().withProperty(TYPE, EmotionPlanks.EnumType.byMetadata(meta & 7)).withProperty(STAGE, Integer.valueOf((meta & 8) >> 3));
	}

	public int getMetaFromState(IBlockState state)
	{
		int i = 0;
		i = i | ((EmotionPlanks.EnumType) state.getValue(TYPE)).getMetadata();
		i = i | ((Integer) state.getValue(STAGE)).intValue() << 3;
		return i;
	}

	@Override
	protected BlockStateContainer createBlockState()
	{
		return new BlockStateContainer(this, new IProperty[]
		{ TYPE, STAGE });
	}

	@Override
	public String getSpecialName(ItemStack stack)
	{
		return EmotionPlanks.EnumType.values()[stack.getItemDamage()].getName();
	}
}
