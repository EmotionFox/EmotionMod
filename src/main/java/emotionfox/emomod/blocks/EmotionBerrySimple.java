package emotionfox.emomod.blocks;

import java.util.Random;

import emotionfox.emomod.blocks.enumeration.EnumBerry;
import emotionfox.emomod.init.EmotionBlock;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class EmotionBerrySimple extends EmotionBerryBush
{
	@Override
	public void getSubBlocks(CreativeTabs itemIn, NonNullList<ItemStack> items)
	{
		for (int i = 0; i < EnumBerry.values().length; i++)
		{
			items.add(new ItemStack(this, 1, i));
		}
	}

	@Override
	public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
	{
		if (player.getHeldItem(hand).getItem() == Items.DYE && player.getHeldItem(hand).getMetadata() == 15)
		{
			if (RANDOM.nextInt(4) == 0)
				spawnAsEntity(world, pos, new ItemStack(Item.getItemFromBlock(this), 1, this.getMetaFromState(state)));

			player.getHeldItem(hand).shrink(1);

			double d0 = world.rand.nextGaussian() * 0.02D;
			double d1 = world.rand.nextGaussian() * 0.02D;
			double d2 = world.rand.nextGaussian() * 0.02D;

			world.spawnParticle(EnumParticleTypes.VILLAGER_HAPPY, (double) ((float) pos.getX() + world.rand.nextFloat()), (double) pos.getY() + (double) world.rand.nextFloat() * 1.0f,
					(double) ((float) pos.getZ() + world.rand.nextFloat()), d0, d1, d2, new int[0]);

			return true;
		}

		return false;
	}

	@Override
	public void onBlockHarvested(World world, BlockPos pos, IBlockState state, EntityPlayer player)
	{
		if (!player.capabilities.isCreativeMode)
		{
			spawnAsEntity(world, pos, new ItemStack(Item.getItemFromBlock(this), 1, this.getMetaFromState(state)));
		}
	}

	@Override
	public void randomTick(World world, BlockPos pos, IBlockState state, Random random)
	{
		if (random.nextInt(40) == 0)
			world.setBlockState(pos, EmotionBlock.BUSH.getDefaultState().withProperty(EmotionBerryBush.BERRY, state.getValue(EmotionBerryBush.BERRY)));
	}
}
