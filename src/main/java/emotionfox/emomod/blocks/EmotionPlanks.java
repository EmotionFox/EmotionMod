package emotionfox.emomod.blocks;

import emotionfox.emomod.blocks.meta.MetaBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.NonNullList;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class EmotionPlanks extends MetaBlock
{
	public static final PropertyEnum<EmotionPlanks.EnumType> VARIANT = PropertyEnum.<EmotionPlanks.EnumType>create("variant", EmotionPlanks.EnumType.class);

	public EmotionPlanks()
	{
		super(Material.WOOD);
		this.setSoundType(SoundType.WOOD);
		this.setHardness(2.0F);
		this.setResistance(5.0F);
		this.setDefaultState(this.blockState.getBaseState().withProperty(VARIANT, EmotionPlanks.EnumType.CHERRY));
		this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);

		for (int i = 0; i < EmotionPlanks.EnumType.values().length; i++)
			variantList.add(EmotionPlanks.EnumType.values()[i].getName());
	}

	@Override
	public void getSubBlocks(CreativeTabs itemIn, NonNullList<ItemStack> items)
	{
		for (int i = 0; i < EmotionPlanks.EnumType.values().length; i++)
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
		EmotionPlanks.EnumType fruit = (EmotionPlanks.EnumType) state.getValue(VARIANT);
		return fruit.getMetadata();
	}

	@Override
	public IBlockState getStateFromMeta(int meta)
	{
		return meta > EmotionPlanks.EnumType.values().length ? this.getDefaultState().withProperty(VARIANT, EmotionPlanks.EnumType.values()[0])
				: this.getDefaultState().withProperty(VARIANT, EmotionPlanks.EnumType.values()[meta]);
	}

	@Override
	public int damageDropped(IBlockState state)
	{
		return getMetaFromState(state);
	}

	public static enum EnumType implements IStringSerializable
	{
		CHERRY(0, "cherry"), PEAR(1, "pear"), ORANGE(2, "orange"), ATLAS(3, "atlas"), PINE(4, "pine"), COCO(5, "coco"), DREAM(6, "dream");
		private static final EmotionPlanks.EnumType[] METADATA = new EmotionPlanks.EnumType[values().length];
		private final String name;
		private final int meta;

		private EnumType(int metadata, String name)
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

		public static EmotionPlanks.EnumType byMetadata(int meta)
		{
			if (meta < 0 || meta >= METADATA.length)
			{
				meta = 0;
			}

			return METADATA[meta];
		}

		static
		{
			for (EmotionPlanks.EnumType enumtype : values())
			{
				METADATA[enumtype.getMetadata()] = enumtype;
			}
		}
	}
}
