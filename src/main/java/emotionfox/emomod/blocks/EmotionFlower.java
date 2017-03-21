package emotionfox.emomod.blocks;

import java.util.Random;

import emotionfox.emomod.blocks.base.BaseBush;
import emotionfox.emomod.blocks.item.IMetaBlockName;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class EmotionFlower extends BaseBush implements IMetaBlockName
{
	public static final PropertyEnum<EmotionFlower.EnumType> VARIANT = PropertyEnum.<EmotionFlower.EnumType>create("variant", EmotionFlower.EnumType.class);

	protected AxisAlignedBB NARCOTA_AABB = new AxisAlignedBB(0.0F, 0.0F, 0.0F, 1.0F, 0.0652F * 3, 1.0F);

	public EmotionFlower()
	{
		this.setSoundType(SoundType.PLANT);
		this.setDefaultState(this.blockState.getBaseState().withProperty(VARIANT, EmotionFlower.EnumType.KITTY));
		this.setCreativeTab(CreativeTabs.DECORATIONS);
	}

	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
	{
		Comparable value = state.getValue(VARIANT);

		return value == EnumType.TALLGRASS ? Block.FULL_BLOCK_AABB : (value == EnumType.NARCOTA ? NARCOTA_AABB : super.getBoundingBox(state, source, pos).move(state.getOffset(source, pos)));
	}

	@Override
	public boolean isReplaceable(IBlockAccess worldIn, BlockPos pos)
	{
		IBlockState state = worldIn.getBlockState(pos);
		Comparable value = state.getValue(VARIANT);

		if (value == EnumType.TALLGRASS)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune)
	{
		Comparable value = state.getValue(VARIANT);

		if (value == EnumType.TALLGRASS)
		{
			return null;
		}
		return Item.getItemFromBlock(this);
	}

	@Override
	public void getSubBlocks(Item item, CreativeTabs tab, NonNullList<ItemStack> list)
	{
		for (int i = 0; i < EmotionFlower.EnumType.values().length; i++)
		{
			list.add(new ItemStack(item, 1, i));
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
		EmotionFlower.EnumType variant = (EmotionFlower.EnumType) state.getValue(VARIANT);
		return variant.getMetadata();
	}

	@Override
	public IBlockState getStateFromMeta(int meta)
	{
		return this.getDefaultState().withProperty(VARIANT, EmotionFlower.EnumType.values()[meta]);
	}

	@Override
	public int damageDropped(IBlockState state)
	{
		return getMetaFromState(state);
	}

	@Override
	public Block.EnumOffsetType getOffsetType()
	{
		return Block.EnumOffsetType.XZ;
	}

	public static enum EnumType implements IStringSerializable
	{
		KITTY(0, "kitty"), NOX(1, "nox"), DELY(2, "dely"), GNON(3, "gnon"), THORNY(4, "thorny"), CENTUS(5, "centus"), TALLGRASS(6, "tallgrass"), NEBULA(7, "nebula"), NARCOTA(8, "narcota");
		private static final EmotionFlower.EnumType[] METADATA = new EmotionFlower.EnumType[values().length];
		private final String name;
		private final int meta;

		private EnumType(int metadata, String name)
		{
			this.meta = metadata;
			this.name = name;
		}

		public int getMetadata()
		{
			return meta;
		}

		@Override
		public String toString()
		{
			return name;
		}

		@Override
		public String getName()
		{
			return name;
		}
	}

	@Override
	public void onEntityCollidedWithBlock(World worldIn, BlockPos pos, IBlockState state, Entity entityIn)
	{
		if (state.getValue(VARIANT) == EnumType.THORNY)
		{
			entityIn.attackEntityFrom(DamageSource.GENERIC, 1.0F);
		}
	}

	@Override
	public String getSpecialName(ItemStack stack)
	{
		return EmotionFlower.EnumType.values()[stack.getItemDamage()].getName();
	}
}
