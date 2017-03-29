package emotionfox.emomod.blocks.base;

import java.util.Random;

import javax.annotation.Nullable;

import emotionfox.emomod.init.EmotionItems;
import emotionfox.emomod.util.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.monster.EntitySilverfish;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BaseCristal extends Block
{
	protected static final float f = Reference.PIXEL;
	protected static final AxisAlignedBB CRISTAL_AABB = new AxisAlignedBB(0.0F + f * 4, 0.0F + f * 4, 0.0F + f * 4, 1.0F - f * 4, 1.0F - f * 4, 1.0F - f * 4);

	public BaseCristal()
	{
		super(Material.ROCK);
		this.setHarvestLevel("pickaxe", 4);
		this.setHardness(7.0F);
		this.setResistance(14.0F);
		this.setSoundType(SoundType.STONE);
	}

	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
	{
		return CRISTAL_AABB;
	}

	@Override
	public void harvestBlock(World world, EntityPlayer player, BlockPos pos, IBlockState state, @Nullable TileEntity te, ItemStack stack)
	{
		if (world.rand.nextInt(5) == 0)
		{
			EntitySilverfish silverfish = new EntitySilverfish(world);
			world.spawnEntity(silverfish);
			silverfish.setPosition((double) pos.getX() + 0.5D, (double) pos.getY() + 0.5D, (double) pos.getZ() + 0.5D);
		}
		
		super.harvestBlock(world, player, pos, state, te, stack);
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
		return EmotionItems.VIRIDIS_CRISTAL;
    }

	@Override
	@SideOnly(Side.CLIENT)
	public BlockRenderLayer getBlockLayer()
	{
		return BlockRenderLayer.CUTOUT;
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
