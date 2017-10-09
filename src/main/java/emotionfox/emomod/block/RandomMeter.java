package emotionfox.emomod.block;

import java.util.Random;

import emotionfox.emomod.tileentity.TileEntityRandom;
import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class RandomMeter extends Block implements ITileEntityProvider
{
	public RandomMeter()
	{
		super(Material.ROCK);
		this.setCreativeTab(CreativeTabs.REDSTONE);
	}

	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta)
	{
		return new TileEntityRandom();
	}

	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
	{
		if (!worldIn.isRemote)
		{
			if (worldIn.getTileEntity(pos) instanceof TileEntityRandom)
			{
				TileEntityRandom tile = (TileEntityRandom) worldIn.getTileEntity(pos);
				tile.randomize();
			}
		}

		IBlockState stateSouth = worldIn.getBlockState(pos.south());

		worldIn.setBlockToAir(pos.south());
		worldIn.setBlockState(pos.south(), stateSouth);

		return true;
	}

	@Override
	public boolean canProvidePower(IBlockState state)
	{
		return true;
	}

	@Override
	public boolean canConnectRedstone(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing side)
	{
		if (side == EnumFacing.NORTH)
			return true;
		return false;
	}

	@Override
	public int getWeakPower(IBlockState blockState, IBlockAccess blockAccess, BlockPos pos, EnumFacing side)
	{
		if (side == EnumFacing.NORTH)
		{
			if (blockAccess.getTileEntity(pos) instanceof TileEntityRandom)
			{
				TileEntityRandom tile = (TileEntityRandom) blockAccess.getTileEntity(pos);
				return tile.getRandom();
			}
		}
		return 0;
	}
}
