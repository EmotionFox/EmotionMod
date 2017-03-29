package emotionfox.emomod.blocks;

import emotionfox.emomod.blocks.item.IMetaBlockName;
import net.minecraft.block.Block;
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

public class EmotionBrick extends Block implements IMetaBlockName
{
	public static final PropertyEnum<EmotionBrick.EnumType> VARIANT = PropertyEnum.<EmotionBrick.EnumType>create("variant", EmotionBrick.EnumType.class);
	
	public EmotionBrick()
	{
		super(Material.ROCK);
		this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		this.setHardness(2.0F);
		this.setResistance(10.0F);
		this.setDefaultState(this.blockState.getBaseState().withProperty(VARIANT, EmotionBrick.EnumType.RED));
		this.setSoundType(SoundType.STONE);
	}
	
	@Override
	public void getSubBlocks(Item item, CreativeTabs tab, NonNullList<ItemStack> list)
	{
		for (int i = 0; i < EmotionBrick.EnumType.values().length; i++)
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
		EmotionBrick.EnumType variant = (EmotionBrick.EnumType) state.getValue(VARIANT);
		return variant.getMetadata();
	}

	@Override
	public IBlockState getStateFromMeta(int meta)
	{
		return this.getDefaultState().withProperty(VARIANT, EmotionBrick.EnumType.values()[meta]);
	}

	@Override
	public int damageDropped(IBlockState state)
	{
		return getMetaFromState(state);
	}
	
	public static enum EnumType implements IStringSerializable
    {
        RED(0, "red"), GREEN(1, "green"), BLUE(2, "blue"), LIMESTONE(3, "limestone");
        private static final EmotionBrick.EnumType[] METADATA = new EmotionBrick.EnumType[values().length];
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
	public String getSpecialName(ItemStack stack)
	{
		return EmotionBrick.EnumType.values()[stack.getItemDamage()].getName();
	}
}
