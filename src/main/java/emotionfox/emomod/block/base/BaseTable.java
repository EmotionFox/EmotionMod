package emotionfox.emomod.block.base;

import emotionfox.emomod.block.StoneTable;
import emotionfox.emomod.block.WoodTable;
import emotionfox.emomod.block.meta.MetaBlockInterface;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class BaseTable extends Block
{
	public static final PropertyEnum TABLE = PropertyEnum.create("table", EnumTable.class);

	public BaseTable(Material mat)
	{
		super(mat);
	}

	@Override
	public boolean canBeConnectedTo(IBlockAccess world, BlockPos pos, EnumFacing facing)
	{
		return false;
	}

	private boolean canConnectTo(IBlockAccess worldIn, BlockPos pos)
	{
		IBlockState iblockstate = worldIn.getBlockState(pos);
		Block block = iblockstate.getBlock();

		if (this instanceof WoodTable)
			return block instanceof WoodTable ? true : false;
		else if (this instanceof StoneTable)
			return block instanceof StoneTable ? true : false;

		return false;
	}
	
	private boolean canTableConnectTo(IBlockAccess world, BlockPos pos, EnumFacing facing)
	{
		Block block = world.getBlockState(pos.offset(facing)).getBlock();
		return block.canBeConnectedTo(world, pos.offset(facing), facing.getOpposite()) || canConnectTo(world, pos.offset(facing));
	}

	@Override
	public IBlockState getActualState(IBlockState state, IBlockAccess worldIn, BlockPos pos)
	{
		if (this.canTableConnectTo(worldIn, pos, EnumFacing.NORTH) && this.canTableConnectTo(worldIn, pos, EnumFacing.SOUTH) && this.canTableConnectTo(worldIn, pos, EnumFacing.EAST)
				&& this.canTableConnectTo(worldIn, pos, EnumFacing.WEST))
		{
			return state.withProperty(BaseTable.TABLE, BaseTable.EnumTable.FULL);
		}
		else if (this.canTableConnectTo(worldIn, pos, EnumFacing.NORTH) && this.canTableConnectTo(worldIn, pos, EnumFacing.SOUTH))
		{
			return state.withProperty(BaseTable.TABLE, BaseTable.EnumTable.STRAIGHT_NS);
		}
		else if (this.canTableConnectTo(worldIn, pos, EnumFacing.EAST) && this.canTableConnectTo(worldIn, pos, EnumFacing.WEST))
		{
			return state.withProperty(BaseTable.TABLE, BaseTable.EnumTable.STRAIGHT_EW);
		}
		else
		{
			return state.withProperty(BaseTable.TABLE, BaseTable.EnumTable.NORMAL);
		}
	}

	@Override
	public IBlockState getStateFromMeta(int meta)
	{
		return this.getDefaultState().withProperty(TABLE, BaseTable.EnumTable.values()[meta]);
	}

	@Override
	public int getMetaFromState(IBlockState state)
	{
		EnumTable table = (EnumTable) state.getValue(TABLE);
		return table.getMetadata();
	}

	@Override
	protected BlockStateContainer createBlockState()
	{
		return new BlockStateContainer(this, new IProperty[]
		{ TABLE });
	}

	public enum EnumTable implements IStringSerializable
	{
		NORMAL(0, "normal"), STRAIGHT_NS(1, "ns"), STRAIGHT_EW(2, "ew"), FULL(3, "full");
		private static final EnumTable[] METADATA = new EnumTable[values().length];
		private final String name;
		private final int meta;

		private EnumTable(int metadata, String name)
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
	public boolean canPlaceTorchOnTop(IBlockState state, IBlockAccess world, BlockPos pos)
	{
		return true;
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
}
