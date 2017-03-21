package emotionfox.emomod.blocks;

import emotionfox.emomod.blocks.enumeration.EnumStoneFurniture;
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
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class EmotionStoneChair extends Block implements IMetaBlockName
{
	public static final PropertyEnum<EnumStoneFurniture> STONE = PropertyEnum.<EnumStoneFurniture>create("stone", EnumStoneFurniture.class);
	
	public static final float f = 0.0625F; // One pixel
	public static final AxisAlignedBB STONE_CHAIR_AABB = new AxisAlignedBB(0.0F + f * 3, 0.0F, 0.0F + f * 3, 1.0F - f * 3, 1.0F - f * 4, 1.0F - f * 3);
	
	public EmotionStoneChair()
    {
        super(Material.ROCK);
        this.setHardness(2.0F);
        this.setResistance(5.0F);
        this.setSoundType(SoundType.STONE);
        this.setDefaultState(this.blockState.getBaseState().withProperty(STONE, EnumStoneFurniture.COBBLESTONE));
        this.setCreativeTab(CreativeTabs.DECORATIONS);
    }
	
	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
	{
		return STONE_CHAIR_AABB;
	}
	
	@Override
	public void getSubBlocks(Item item, CreativeTabs tab, NonNullList<ItemStack> list)
	{
		for (int i = 0; i < EnumStoneFurniture.values().length; i++)
		{
			list.add(new ItemStack(item, 1, i));
		}
	}

	@Override
	protected BlockStateContainer createBlockState()
	{
		return new BlockStateContainer(this, new IProperty[]
		{ STONE });
	}

	@Override
	public int getMetaFromState(IBlockState state)
	{
		EnumStoneFurniture stone = (EnumStoneFurniture) state.getValue(STONE);
		return stone.getMetadata();
	}

	@Override
	public IBlockState getStateFromMeta(int meta)
	{
		return this.getDefaultState().withProperty(STONE, EnumStoneFurniture.values()[meta]);
	}

	@Override
	public int damageDropped(IBlockState state)
	{
		return getMetaFromState(state);
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
	public String getSpecialName(ItemStack stack)
	{
		return EnumStoneFurniture.values()[stack.getItemDamage()].getName();
	}
}