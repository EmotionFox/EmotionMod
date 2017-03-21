package emotionfox.emomod.blocks;

import emotionfox.emomod.blocks.enumeration.EnumWoodFurniture;
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

public class EmotionWoodChair extends Block implements IMetaBlockName
{
	public static final PropertyEnum<EnumWoodFurniture> WOOD = PropertyEnum.<EnumWoodFurniture>create("wood", EnumWoodFurniture.class);

	public static final float f = 0.0625F; // One pixel
	public static final AxisAlignedBB WOOD_CHAIR_AABB = new AxisAlignedBB(0.0F + f * 3, 0.0F, 0.0F + f * 3, 1.0F - f * 3, 1.0F - f * 4, 1.0F - f * 3);

	public EmotionWoodChair()
	{
		super(Material.WOOD);
		this.setHardness(2.0F);
		this.setResistance(5.0F);
		this.setSoundType(SoundType.WOOD);
		this.setDefaultState(this.blockState.getBaseState().withProperty(WOOD, EnumWoodFurniture.CHERRY));
		this.setCreativeTab(CreativeTabs.DECORATIONS);
	}

	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
	{
		return WOOD_CHAIR_AABB;
	}
	
	@Override
	public void getSubBlocks(Item item, CreativeTabs tab, NonNullList<ItemStack> list)
	{
		for (int i = 0; i < EnumWoodFurniture.values().length; i++)
		{
			list.add(new ItemStack(item, 1, i));
		}
	}

	@Override
	protected BlockStateContainer createBlockState()
	{
		return new BlockStateContainer(this, new IProperty[]
		{ WOOD });
	}

	@Override
	public int getMetaFromState(IBlockState state)
	{
		EnumWoodFurniture wood = (EnumWoodFurniture) state.getValue(WOOD);
		return wood.getMetadata();
	}

	@Override
	public IBlockState getStateFromMeta(int meta)
	{
		return this.getDefaultState().withProperty(WOOD, EnumWoodFurniture.values()[meta]);
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
		return EnumWoodFurniture.values()[stack.getItemDamage()].getName();
	}
}
