package emotionfox.emomod.blocks;

import emotionfox.emomod.blocks.item.IMetaBlockName;
import emotionfox.emomod.init.EmotionBlocks;
import emotionfox.emomod.util.Reference;
import net.minecraft.block.Block;
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

public class EmotionPot extends Block implements IMetaBlockName
{
	public static final PropertyEnum<EnumPot> TYPE = PropertyEnum.<EnumPot>create("variant", EnumPot.class);

	protected static final float f = Reference.PIXEL;
	protected static final AxisAlignedBB POT_AABB = new AxisAlignedBB(0.0F + f * 3, 0.0F, 0.0F + f * 3, 1.0F - f * 3, 1.0F - f * 5, 1.0F - f * 3);

	public EmotionPot()
	{
		super(Material.GLASS);
		this.setSoundType(SoundType.GLASS);
		this.setCreativeTab(CreativeTabs.FOOD);
		this.setDefaultState(this.blockState.getBaseState().withProperty(TYPE, EnumPot.APPLE));
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

		if (type == EnumPot.GLASS)
		{
			if (heldItem == Items.WATER_BUCKET)
			{
				world.setBlockState(pos, EmotionBlocks.POT.getDefaultState().withProperty(TYPE, EnumPot.WATER));

				if (!player.capabilities.isCreativeMode)
				{
					player.playSound(SoundEvents.ITEM_BUCKET_EMPTY, 1.0F, 1.0F);
					player.setHeldItem(hand, new ItemStack(Items.BUCKET));
				}
				return true;
			}
			else if (heldItem == Items.LAVA_BUCKET)
			{
				world.setBlockState(pos, EmotionBlocks.POT.getDefaultState().withProperty(TYPE, EnumPot.LAVA));

				if (!player.capabilities.isCreativeMode)
				{
					player.playSound(SoundEvents.ITEM_BUCKET_EMPTY_LAVA, 1.0F, 1.0F);
					player.setHeldItem(hand, new ItemStack(Items.BUCKET));
				}
				return true;
			}
			else if (heldItem == Items.MILK_BUCKET)
			{
				world.setBlockState(pos, EmotionBlocks.POT.getDefaultState().withProperty(TYPE, EnumPot.MILK));

				if (!player.capabilities.isCreativeMode)
				{
					player.playSound(SoundEvents.ITEM_BUCKET_EMPTY, 1.0F, 1.0F);
					player.setHeldItem(hand, new ItemStack(Items.BUCKET));
				}
				return true;
			}
		}
		else if (type == EnumPot.WATER)
		{
			if (heldItem == Items.BUCKET)
			{
				world.setBlockState(pos, EmotionBlocks.POT.getDefaultState().withProperty(TYPE, EnumPot.GLASS));
				player.getHeldItem(hand).shrink(1);

				if (!player.capabilities.isCreativeMode)
				{
					player.playSound(SoundEvents.ITEM_BUCKET_FILL, 1.0F, 1.0F);

					if (!player.inventory.addItemStackToInventory(new ItemStack(Items.WATER_BUCKET)))
					{
						player.dropItem(new ItemStack(Items.WATER_BUCKET), false);
					}
					else
					{
						player.inventory.addItemStackToInventory(new ItemStack(Items.WATER_BUCKET));
					}
				}
				return true;
			}
		}
		else if (type == EnumPot.LAVA)
		{
			if (heldItem == Items.BUCKET)
			{
				world.setBlockState(pos, EmotionBlocks.POT.getDefaultState().withProperty(TYPE, EnumPot.GLASS));
				player.getHeldItem(hand).shrink(1);

				if (!player.capabilities.isCreativeMode)
				{
					player.playSound(SoundEvents.ITEM_BUCKET_FILL_LAVA, 1.0F, 1.0F);

					if (!player.inventory.addItemStackToInventory(new ItemStack(Items.LAVA_BUCKET)))
					{
						player.dropItem(new ItemStack(Items.LAVA_BUCKET), false);
					}
					else
					{
						player.inventory.addItemStackToInventory(new ItemStack(Items.LAVA_BUCKET));
					}
				}
				return true;
			}
		}
		else if (type == EnumPot.MILK)
		{
			if (heldItem == Items.BUCKET)
			{
				world.setBlockState(pos, EmotionBlocks.POT.getDefaultState().withProperty(TYPE, EnumPot.GLASS));
				player.getHeldItem(hand).shrink(1);

				if (!player.capabilities.isCreativeMode)
				{
					player.playSound(SoundEvents.ITEM_BUCKET_FILL, 1.0F, 1.0F);

					if (!player.inventory.addItemStackToInventory(new ItemStack(Items.MILK_BUCKET)))
					{
						player.dropItem(new ItemStack(Items.MILK_BUCKET), false);
					}
					else
					{
						player.inventory.addItemStackToInventory(new ItemStack(Items.MILK_BUCKET));
					}
				}
				return true;
			}
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
	public void getSubBlocks(Item item, CreativeTabs tab, NonNullList<ItemStack> list)
	{
		for (int i = 0; i < EnumPot.values().length; i++)
		{
			list.add(new ItemStack(item, 1, i));
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
		return this.getDefaultState().withProperty(TYPE, EnumPot.values()[meta]);
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

	@Override
	public String getSpecialName(ItemStack stack)
	{
		return EnumPot.values()[stack.getItemDamage()].getName();
	}
}
