package emotionfox.emomod.block;

import emotionfox.emomod.block.enumeration.EnumBerry;
import emotionfox.emomod.block.meta.MetaBlockInterface;
import emotionfox.emomod.init.EmotionBlock;
import emotionfox.emomod.init.EmotionItem;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public class EmotionBerry extends EmotionBerryBush
{
	@Override
	public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
	{
		world.setBlockState(pos, EmotionBlock.BUSH_SIMPLE.getDefaultState().withProperty(BERRY, state.getValue(BERRY)));
		dropBerry(world, pos, state, false);
		return true;
	}

	protected void dropBerry(World world, BlockPos pos, IBlockState state, boolean destroy)
	{
		Comparable variant = state.getValue(BERRY);

		if (variant == EnumBerry.BLUEBERRY)
			spawnAsEntity(world, pos, new ItemStack(EmotionItem.BERRY_BLUEBERRY, 1 + RANDOM.nextInt(3)));
		else if (variant == EnumBerry.REDCURRANT)
			spawnAsEntity(world, pos, new ItemStack(EmotionItem.BERRY_REDCURRANT, 1 + RANDOM.nextInt(3)));
		else if (variant == EnumBerry.BLACKCURRANT)
			spawnAsEntity(world, pos, new ItemStack(EmotionItem.BERRY_BLACKCURRANT, 1 + RANDOM.nextInt(3)));
		else if (variant == EnumBerry.STRAWBERRY)
			spawnAsEntity(world, pos, new ItemStack(EmotionItem.BERRY_STRAWBERRY, 1 + RANDOM.nextInt(2)));
		else if (variant == EnumBerry.DREAMCURRANT)
			spawnAsEntity(world, pos, new ItemStack(EmotionItem.BERRY_DREAMCURRANT, 1 + RANDOM.nextInt(3)));

		if (destroy)
			spawnAsEntity(world, pos, new ItemStack(Item.getItemFromBlock(EmotionBlock.BUSH_SIMPLE), 1, this.getMetaFromState(state)));
	}

	@Override
	public void onBlockHarvested(World world, BlockPos pos, IBlockState state, EntityPlayer player)
	{
		if (!player.capabilities.isCreativeMode)
		{
			dropBerry(world, pos, state, true);
		}
	}

	@Override
	public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player)
	{
		return new ItemStack(Item.getItemFromBlock(EmotionBlock.BUSH_SIMPLE), 1, getMetaFromState(world.getBlockState(pos)));
	}

	@Override
	public void onEntityCollidedWithBlock(World worldIn, BlockPos pos, IBlockState state, Entity entityIn)
	{
		entityIn.motionX *= 0.4D;
		entityIn.motionZ *= 0.4D;
	}
}
