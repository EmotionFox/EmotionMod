package emotionfox.emomod.blocks;

import java.util.ArrayList;
import java.util.Random;

import emotionfox.emomod.blocks.base.BaseBush;
import emotionfox.emomod.blocks.meta.MetaBlockInterface;
import emotionfox.emomod.util.Reference;
import net.minecraft.block.BlockDirt;
import net.minecraft.block.SoundType;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class EmotionMushroom extends BaseBush implements MetaBlockInterface
{
	private static final ArrayList<String> variantList = new ArrayList<String>();

	protected static final AxisAlignedBB MUSHROOM_AABB = new AxisAlignedBB(0.30000001192092896D, 0.0D, 0.30000001192092896D, 0.699999988079071D, 0.4000000059604645D, 0.699999988079071D);
	public static final PropertyEnum<EmotionMushroom.EnumType> VARIANT = PropertyEnum.<EmotionMushroom.EnumType>create("variant", EmotionMushroom.EnumType.class);

	public EmotionMushroom()
	{
		this.setSoundType(SoundType.PLANT);
		this.setDefaultState(this.blockState.getBaseState().withProperty(VARIANT, EmotionMushroom.EnumType.BLUE));
		this.setTickRandomly(true);
	}

	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
	{
		return MUSHROOM_AABB;
	}

	@Override
	public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand)
	{
		if (rand.nextInt(25) == 0)
		{
			int i = 5;
			int j = 4;

			for (BlockPos blockpos : BlockPos.getAllInBoxMutable(pos.add(-4, -1, -4), pos.add(4, 1, 4)))
			{
				if (worldIn.getBlockState(blockpos).getBlock() == this)
				{
					--i;

					if (i <= 0)
					{
						return;
					}
				}
			}

			BlockPos blockpos1 = pos.add(rand.nextInt(3) - 1, rand.nextInt(2) - rand.nextInt(2), rand.nextInt(3) - 1);

			for (int k = 0; k < 4; ++k)
			{
				if (worldIn.isAirBlock(blockpos1) && this.canBlockStay(worldIn, blockpos1, this.getDefaultState()))
				{
					pos = blockpos1;
				}

				blockpos1 = pos.add(rand.nextInt(3) - 1, rand.nextInt(2) - rand.nextInt(2), rand.nextInt(3) - 1);
			}

			if (worldIn.isAirBlock(blockpos1) && this.canBlockStay(worldIn, blockpos1, this.getDefaultState()))
			{
				worldIn.setBlockState(blockpos1, this.getDefaultState(), 2);
			}
		}
	}

	@Override
	public boolean canPlaceBlockAt(World worldIn, BlockPos pos)
	{
		return super.canPlaceBlockAt(worldIn, pos) && this.canBlockStay(worldIn, pos, this.getDefaultState());
	}

	@Override
	public boolean canSustainBush(IBlockState state)
	{
		return state.isFullBlock();
	}

	@Override
	public boolean canBlockStay(World worldIn, BlockPos pos, IBlockState state)
	{
		if (pos.getY() >= 0 && pos.getY() < 256)
		{
			IBlockState iblockstate = worldIn.getBlockState(pos.down());
			return iblockstate.getBlock() == Blocks.MYCELIUM ? true
					: (iblockstate.getBlock() == Blocks.DIRT && iblockstate.getValue(BlockDirt.VARIANT) == BlockDirt.DirtType.PODZOL ? true
							: worldIn.getLight(pos) < 13 && iblockstate.getBlock().canSustainPlant(iblockstate, worldIn, pos.down(), net.minecraft.util.EnumFacing.UP, this));
		}
		else
		{
			return false;
		}
	}

	@Override
	public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
	{
		Comparable variant = state.getValue(VARIANT);

		if (player.getHeldItem(hand) != null)
		{
			if (player.getHeldItem(hand).getItem() == Items.DYE && player.getHeldItem(hand).getMetadata() == 15)
			{
				if (RANDOM.nextInt(4) == 0)
				{
					spawnAsEntity(world, pos, new ItemStack(Item.getItemFromBlock(this), 1, getMetaFromState(state)));
				}

				player.getHeldItem(hand).shrink(1);

				double d0 = world.rand.nextGaussian() * 0.02D;
				double d1 = world.rand.nextGaussian() * 0.02D;
				double d2 = world.rand.nextGaussian() * 0.02D;
				world.spawnParticle(EnumParticleTypes.VILLAGER_HAPPY, (double) ((float) pos.getX() + world.rand.nextFloat()), (double) pos.getY() + (double) world.rand.nextFloat() * 1.0f,
						(double) ((float) pos.getZ() + world.rand.nextFloat()), d0, d1, d2, new int[0]);

				return true;
			}
		}
		return false;
	}

	@Override
	public void getSubBlocks(CreativeTabs itemIn, NonNullList<ItemStack> items)
	{
		for (int i = 0; i < EnumType.values().length; i++)
		{
			items.add(new ItemStack(this, 1, i));
		}
	}

	@Override
	protected BlockStateContainer createBlockState()
	{
		return new BlockStateContainer(this, new IProperty[]
		{ VARIANT });
	}

	@Override
	public int getMetaFromState(IBlockState state)
	{
		EnumType type = (EnumType) state.getValue(VARIANT);
		return type.getMetadata();
	}

	@Override
	public IBlockState getStateFromMeta(int meta)
	{
		return meta > EnumType.values().length ? this.getDefaultState().withProperty(VARIANT, EnumType.values()[0]) : this.getDefaultState().withProperty(VARIANT, EnumType.values()[meta]);
	}

	@Override
	public int damageDropped(IBlockState state)
	{
		return getMetaFromState(state);
	}

	public static enum EnumType implements IStringSerializable
	{
		BLUE(0, "blue"), GREEN(1, "green");
		private static final EmotionMushroom.EnumType[] METADATA = new EmotionMushroom.EnumType[values().length];
		private final String name;
		private final int meta;

		private EnumType(int metadata, String name)
		{
			this.meta = metadata;
			this.name = name;
			variantList.add(name);
		}

		@Override
		public String getName()
		{
			return this.name;
		}

		public int getMetadata()
		{
			return this.meta;
		}

		@Override
		public String toString()
		{
			return getName();
		}
	}

	@Override
	public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player)
	{
		return new ItemStack(Item.getItemFromBlock(this), 1, getMetaFromState(world.getBlockState(pos)));
	}

	@Override
	public String getVariant(int meta)
	{
		return this.variantList.get(meta);
	}

	@Override
	public String getVariantName(int meta)
	{
		String name = Reference.MOD_ID + ":" + this.getUnlocalizedName().substring(5);
		return meta > getMaxMeta() ? name + "_" + this.variantList.get(0) : name + "_" + this.variantList.get(meta);
	}

	@Override
	public int getMaxMeta()
	{
		return this.variantList.size() - 1;
	}
}
