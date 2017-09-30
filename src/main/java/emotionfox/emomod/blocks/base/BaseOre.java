package emotionfox.emomod.blocks.base;

import java.util.Random;

import javax.annotation.Nullable;

import emotionfox.emomod.init.EmotionBlock;
import emotionfox.emomod.init.EmotionItem;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BaseOre extends Block
{
	public BaseOre(int harvestLevel)
	{
		super(Material.ROCK);
		this.setSoundType(SoundType.STONE);
		this.setHarvestLevel("pickaxe", harvestLevel);
		this.setTickRandomly(true);
		this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	}

	@Nullable
	@Override
	public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, IBlockAccess worldIn, BlockPos pos)
	{
		if (this == EmotionBlock.LUME_ORE)
			return new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.875D, 1.0D);
		else
			return Block.FULL_BLOCK_AABB;
	}

	@Override
	public void harvestBlock(World world, EntityPlayer player, BlockPos pos, IBlockState state, @Nullable TileEntity te, ItemStack stack)
	{
		super.harvestBlock(world, player, pos, state, te, stack);

		if (this == EmotionBlock.VIRIDIS_ORE)
		{
			world.setBlockState(pos, EmotionBlock.VIRIDIS_CRISTAL.getDefaultState());
		}
	}

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune)
	{
		return this == EmotionBlock.PURPURA_ORE ? EmotionItem.PURPURA_SHARD
				: (this == EmotionBlock.LUME_ORE ? EmotionItem.LUME_STONE : (this == EmotionBlock.DREAM_LUME_ORE ? EmotionItem.LUME_STONE : null));
	}

	@Override
	public int quantityDropped(Random random)
	{
		return this == EmotionBlock.PURPURA_ORE ? 1 : 1 + random.nextInt(5);
	}

	@Override
	public int quantityDroppedWithBonus(int fortune, Random random)
	{
		if (fortune > 0 && Item.getItemFromBlock(this) != this.getItemDropped((IBlockState) this.getBlockState().getValidStates().iterator().next(), random, fortune))
		{
			int i = random.nextInt(fortune + 2) - 1;

			if (i < 0)
			{
				i = 0;
			}

			return this.quantityDropped(random) * (i + 1);
		}
		else
		{
			return this.quantityDropped(random);
		}
	}

	@Override
	public void dropBlockAsItemWithChance(World worldIn, BlockPos pos, IBlockState state, float chance, int fortune)
	{
		super.dropBlockAsItemWithChance(worldIn, pos, state, chance, fortune);
	}

	@Override
	public int getExpDrop(IBlockState state, IBlockAccess world, BlockPos pos, int fortune)
	{
		Random rand = world instanceof World ? ((World) world).rand : new Random();

		if (this.getItemDropped(state, rand, fortune) != Item.getItemFromBlock(this))
		{
			int j = 0;

			if (this == EmotionBlock.PURPURA_ORE)
				j = MathHelper.getInt(rand, 3, 7);
			else
				j = MathHelper.getInt(rand, 2, 5);

			return j;
		}

		return 0;
	}

	@Override
	public void onEntityCollidedWithBlock(World world, BlockPos pos, IBlockState state, Entity entity)
	{
		if (entity instanceof EntityPlayer)
		{
			EntityPlayer player = (EntityPlayer) entity;

			if (this == EmotionBlock.LUME_ORE && !player.isBurning())
			{
				player.setFire(5);
			}
		}
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void randomDisplayTick(IBlockState stateIn, World worldIn, BlockPos pos, Random rand)
	{
		double d0 = (double) pos.getX();
		double d1 = (double) pos.getY();
		double d2 = (double) pos.getZ();

		if (this == EmotionBlock.LUME_ORE)
		{
			worldIn.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, d0 + (double) rand.nextFloat(), d1 + 1D, d2 + (double) rand.nextFloat(), 0.0D, 0.0D, 0.0D, new int[0]);
			worldIn.spawnParticle(EnumParticleTypes.FLAME, d0 + (double) rand.nextFloat(), d1 + 1D, d2 + (double) rand.nextFloat(), 0.0D, 0.0D, 0.0D, new int[0]);
		}
	}
}
