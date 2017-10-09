package emotionfox.emomod.block;

import emotionfox.emomod.block.meta.MetaBlock;
import emotionfox.emomod.init.EmotionBlock;
import emotionfox.emomod.util.Reference;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class EmotionPot extends MetaBlock
{
	public static final PropertyEnum<EnumPot> TYPE = PropertyEnum.<EnumPot>create("variant", EnumPot.class);

	protected static final float f = Reference.PIXEL;
	protected static final AxisAlignedBB POT_AABB = new AxisAlignedBB(0.0F + f * 3, 0.0F, 0.0F + f * 3, 1.0F - f * 3, 1.0F - f * 5, 1.0F - f * 3);

	public EmotionPot()
	{
		super(Material.GLASS);
		this.setSoundType(SoundType.GLASS);
		this.setCreativeTab(CreativeTabs.DECORATIONS);
		this.setDefaultState(this.blockState.getBaseState().withProperty(TYPE, EnumPot.APPLE));

		for (int i = 0; i < EnumPot.values().length; i++)
			variantList.add(EnumPot.values()[i].getName());
	}

	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
	{
		return POT_AABB;
	}

	// Need To Make A TileEntity
	@Override
	public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
	{
		Comparable type = state.getValue(TYPE);
		Item heldItem = player.getHeldItem(hand).getItem();

		ItemStack stack = null;
		boolean isLava = false;

		if (type == EnumPot.GLASS)
		{
			if (heldItem == Items.WATER_BUCKET)
			{
				world.setBlockState(pos, EmotionBlock.POT.getDefaultState().withProperty(TYPE, EnumPot.WATER));
				stack = new ItemStack(Items.BUCKET);
			}
			else if (heldItem == Items.LAVA_BUCKET)
			{
				world.setBlockState(pos, EmotionBlock.POT.getDefaultState().withProperty(TYPE, EnumPot.LAVA));
				stack = new ItemStack(Items.BUCKET);
				isLava = true;
			}
			else if (heldItem == Items.MILK_BUCKET)
			{
				world.setBlockState(pos, EmotionBlock.POT.getDefaultState().withProperty(TYPE, EnumPot.MILK));
				stack = new ItemStack(Items.BUCKET);
			}

			if (stack != null)
			{
				if (isLava)
					player.playSound(SoundEvents.ITEM_BUCKET_EMPTY_LAVA, 1.0F, 1.0F);
				else
					player.playSound(SoundEvents.ITEM_BUCKET_EMPTY, 1.0F, 1.0F);
			}
		}
		else if (heldItem == Items.BUCKET)
		{
			if (type == EnumPot.WATER)
				stack = new ItemStack(Items.WATER_BUCKET);
			else if (type == EnumPot.LAVA)
			{
				isLava = true;
				stack = new ItemStack(Items.LAVA_BUCKET);
			}
			else if (type == EnumPot.MILK)
				stack = new ItemStack(Items.MILK_BUCKET);

			if (stack != null)
			{
				world.setBlockState(pos, EmotionBlock.POT.getDefaultState().withProperty(TYPE, EnumPot.GLASS));

				if (isLava)
					player.playSound(SoundEvents.ITEM_BUCKET_FILL_LAVA, 1.0F, 1.0F);
				else
					player.playSound(SoundEvents.ITEM_BUCKET_FILL, 1.0F, 1.0F);
			}
		}

		if (stack != null)
		{
			if (!player.capabilities.isCreativeMode)
				player.setHeldItem(hand, stack);

			return true;
		}
		return false;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public BlockRenderLayer getBlockLayer()
	{
		return BlockRenderLayer.CUTOUT;
	}

	@Override
	public void getSubBlocks(CreativeTabs itemIn, NonNullList<ItemStack> items)
	{
		for (int i = 0; i < EnumPot.values().length; i++)
		{
			items.add(new ItemStack(this, 1, i));
		}
	}

	@Override
	protected BlockStateContainer createBlockState()
	{
		return new BlockStateContainer(this, new IProperty[]
		{ TYPE });
	}

	@Override
	public int getMetaFromState(IBlockState state)
	{
		EnumPot fruit = (EnumPot) state.getValue(TYPE);
		return fruit.getMetadata();
	}

	@Override
	public IBlockState getStateFromMeta(int meta)
	{
		return meta > EnumPot.values().length ? this.getDefaultState().withProperty(TYPE, EnumPot.values()[0]) : this.getDefaultState().withProperty(TYPE, EnumPot.values()[meta]);
	}

	@Override
	public int damageDropped(IBlockState state)
	{
		return getMetaFromState(state);
	}

	public static enum EnumPot implements IStringSerializable
	{
		APPLE(0, "apple"), BLACKCURRANT(1, "blackcurrant"), BLUEBERRY(2, "blueberry"), CHERRY(3, "cherry"), CHOCOLATE(4, "chocolate"), ORANGE(5, "orange"), PEAR(6, "pear"), REDCURRANT(7,
				"redcurrant"), STRAWBERRY(8, "strawberry"), DREAMCURRANT(9, "dreamcurrant"), GLASS(10, "glass"), WATER(11, "water"), LAVA(12, "lava"), MILK(13, "milk");
		private static final EmotionPot.EnumPot[] METADATA = new EmotionPot.EnumPot[values().length];
		private final String name;
		private final int meta;

		private EnumPot(int metadata, String name)
		{
			this.meta = metadata;
			this.name = name;
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
	public boolean isOpaqueCube(IBlockState state)
	{
		return false;
	}

	@Override
	public boolean isFullCube(IBlockState state)
	{
		return false;
	}

	@Override
	public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player)
	{
		return new ItemStack(Item.getItemFromBlock(this), 1, getMetaFromState(world.getBlockState(pos)));
	}
}
