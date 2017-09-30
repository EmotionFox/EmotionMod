package emotionfox.emomod.blocks;

import java.util.ArrayList;
import java.util.Random;

import javax.annotation.Nullable;

import com.google.common.base.Predicate;

import emotionfox.emomod.blocks.meta.MetaBlockInterface;
import emotionfox.emomod.init.EmotionBlock;
import emotionfox.emomod.util.Reference;
import net.minecraft.block.BlockLog;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class EmotionNewLog extends BlockLog implements MetaBlockInterface
{
	private static final ArrayList<String> variantList = new ArrayList<String>();

	public static final PropertyEnum<EmotionPlanks.EnumType> VARIANT = PropertyEnum.<EmotionPlanks.EnumType>create("variant", EmotionPlanks.EnumType.class, new Predicate<EmotionPlanks.EnumType>()
	{
		public boolean apply(@Nullable EmotionPlanks.EnumType type)
		{
			return type.getMetadata() >= 4;
		}
	});

	public EmotionNewLog()
	{
		this.setDefaultState(this.blockState.getBaseState().withProperty(VARIANT, EmotionPlanks.EnumType.PINE).withProperty(LOG_AXIS, BlockLog.EnumAxis.Y));
		
		for (int i = 0; i < 3; i++)
			this.variantList.add(EmotionPlanks.EnumType.values()[i + 4].getName());
	}

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune)
	{
		return Item.getItemFromBlock(EmotionBlock.NEW_LOG);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void getSubBlocks(CreativeTabs itemIn, NonNullList<ItemStack> items)
	{
		items.add(new ItemStack(this, 1, 0));
		items.add(new ItemStack(this, 1, 1));
		items.add(new ItemStack(this, 1, 2));
	}

	@Override
	public IBlockState getStateFromMeta(int meta)
	{
		IBlockState iblockstate = this.getDefaultState().withProperty(VARIANT, EmotionPlanks.EnumType.byMetadata((meta & 3) + 4));

		switch (meta & 12)
		{
		case 0:
			iblockstate = iblockstate.withProperty(LOG_AXIS, BlockLog.EnumAxis.Y);
			break;
		case 4:
			iblockstate = iblockstate.withProperty(LOG_AXIS, BlockLog.EnumAxis.X);
			break;
		case 8:
			iblockstate = iblockstate.withProperty(LOG_AXIS, BlockLog.EnumAxis.Z);
			break;
		default:
			iblockstate = iblockstate.withProperty(LOG_AXIS, BlockLog.EnumAxis.NONE);
		}

		return iblockstate;
	}

	@Override
	@SuppressWarnings("incomplete-switch")
	public int getMetaFromState(IBlockState state)
	{
		int i = 0;
		i = i | ((EmotionPlanks.EnumType) state.getValue(VARIANT)).getMetadata() - 4;

		switch ((BlockLog.EnumAxis) state.getValue(LOG_AXIS))
		{
		case X:
			i |= 4;
			break;
		case Z:
			i |= 8;
			break;
		case NONE:
			i |= 12;
		}

		return i;
	}

	@Override
	protected BlockStateContainer createBlockState()
	{
		return new BlockStateContainer(this, new IProperty[]
		{ VARIANT, LOG_AXIS });
	}

	@Override
	protected ItemStack getSilkTouchDrop(IBlockState state)
	{
		return new ItemStack(Item.getItemFromBlock(this), 1, ((EmotionPlanks.EnumType) state.getValue(VARIANT)).getMetadata() - 4);
	}

	@Override
	public int damageDropped(IBlockState state)
	{
		return ((EmotionPlanks.EnumType) state.getValue(VARIANT)).getMetadata() - 4;
	}

	@Override
	public String getVariant(int meta)
	{
		return this.variantList.get(meta);
	}

	@Override
	public String getVariantName(int meta)
	{
		String name = Reference.MOD_ID + ":" + "log";
		return meta > getMaxMeta() ? name + "_" + this.variantList.get(0) : name + "_" + this.variantList.get(meta);
	}

	@Override
	public int getMaxMeta()
	{
		return this.variantList.size() - 1;
	}
}
