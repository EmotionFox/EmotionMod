package emotionfox.emomod.blocks;

import emotionfox.emomod.tileentity.TileEntityStorage;
import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class EmotionTest extends Block implements ITileEntityProvider
{
	public EmotionTest()
	{
		super(Material.ROCK);
		this.setCreativeTab(CreativeTabs.REDSTONE);
	}

	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta)
	{
		return new TileEntityStorage();
	}

	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
	{
		if (!worldIn.isRemote)
		{
			ItemStack stack = playerIn.getHeldItemMainhand();

			if (worldIn.getTileEntity(pos) instanceof TileEntityStorage)
			{
				TileEntityStorage tile = (TileEntityStorage) worldIn.getTileEntity(pos);

				if (playerIn.isSneaking())
				{
					return tile.getItem();
				}
				else
				{
					return tile.addItem(stack, playerIn);
				}
			}
		}
		return false;
	}
}
