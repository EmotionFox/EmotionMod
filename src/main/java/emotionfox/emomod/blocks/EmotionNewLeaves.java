package emotionfox.emomod.blocks;

import java.util.ArrayList;
import java.util.Random;

import javax.annotation.Nullable;

import com.google.common.base.Predicate;

import emotionfox.emomod.blocks.meta.MetaBlockInterface;
import emotionfox.emomod.init.EmotionBlock;
import emotionfox.emomod.util.Reference;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.BlockPlanks.EnumType;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class EmotionNewLeaves extends BlockLeaves implements MetaBlockInterface
{
	private static final ArrayList<String> variantList = new ArrayList<String>();

	public static final PropertyEnum<EmotionPlanks.EnumType> VARIANT = PropertyEnum.<EmotionPlanks.EnumType>create("variant", EmotionPlanks.EnumType.class, new Predicate<EmotionPlanks.EnumType>()
	{
		public boolean apply(@Nullable EmotionPlanks.EnumType type)
		{
			return type.getMetadata() >= 4;
		}
	});

	public EmotionNewLeaves()
	{

		this.setDefaultState(
				this.blockState.getBaseState().withProperty(VARIANT, EmotionPlanks.EnumType.PINE).withProperty(CHECK_DECAY, Boolean.valueOf(true)).withProperty(DECAYABLE, Boolean.valueOf(true)));

		for (int i = 0; i < 3; i++)
			this.variantList.add(EmotionPlanks.EnumType.values()[i + 4].getName());
	}

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune)
	{
		return Item.getItemFromBlock(EmotionBlock.SAPLING);
	}

	@Override
	public boolean isOpaqueCube(IBlockState state)
	{
		return false;
	}

	@Override
	public BlockRenderLayer getBlockLayer()
	{
		return BlockRenderLayer.CUTOUT_MIPPED;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void getSubBlocks(CreativeTabs itemIn, NonNullList<ItemStack> items)
	{
		items.add(new ItemStack(this, 1, 0));
		items.add(new ItemStack(this, 1, 1));
		items.add(new ItemStack(this, 1, 2));
	}

	@Override
	protected ItemStack getSilkTouchDrop(IBlockState state)
	{
		return new ItemStack(Item.getItemFromBlock(this), 1, ((EmotionPlanks.EnumType) state.getValue(VARIANT)).getMetadata() - 4);
	}

	@Override
	public IBlockState getStateFromMeta(int meta)
	{
		return this.getDefaultState().withProperty(VARIANT, this.getNewWoodType(meta)).withProperty(DECAYABLE, Boolean.valueOf((meta & 4) == 0)).withProperty(CHECK_DECAY,
				Boolean.valueOf((meta & 8) > 0));
	}

	@Override
	public int getMetaFromState(IBlockState state)
	{
		int i = 0;
		i = i | ((EmotionPlanks.EnumType) state.getValue(VARIANT)).getMetadata() - 4;

		if (!((Boolean) state.getValue(DECAYABLE)).booleanValue())
		{
			i |= 4;
		}

		if (((Boolean) state.getValue(CHECK_DECAY)).booleanValue())
		{
			i |= 8;
		}

		return i;
	}

	@Override
	public EnumType getWoodType(int meta)
	{
		return EnumType.OAK;
	}

	public EmotionPlanks.EnumType getNewWoodType(int meta)
	{
		return EmotionPlanks.EnumType.byMetadata((meta & 3) + 4);
	}

	@Override
	protected BlockStateContainer createBlockState()
	{
		return new BlockStateContainer(this, new IProperty[]
		{ VARIANT, CHECK_DECAY, DECAYABLE });
	}

	@Override
	public int damageDropped(IBlockState state)
	{
		return ((EmotionPlanks.EnumType) state.getValue(VARIANT)).getMetadata();
	}

	@Override
	public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player)
	{
		return new ItemStack(this, 1, state.getBlock().getMetaFromState(state) & 3);
	}

	@Override
	public NonNullList<ItemStack> onSheared(ItemStack item, net.minecraft.world.IBlockAccess world, BlockPos pos, int fortune)
	{
		return NonNullList.withSize(1, new ItemStack(this, 1, world.getBlockState(pos).getValue(VARIANT).getMetadata() - 4));
	}

	@SideOnly(Side.CLIENT)
	public boolean shouldSideBeRendered(IBlockState blockState, IBlockAccess blockAccess, BlockPos pos, EnumFacing side)
	{
		return true;
	}

	@Override
	public String getVariant(int meta)
	{
		return this.variantList.get(meta);
	}

	@Override
	public String getVariantName(int meta)
	{
		String name = Reference.MOD_ID + ":" + "leaves";
		return meta > getMaxMeta() ? name + "_" + this.variantList.get(0) : name + "_" + this.variantList.get(meta);
	}

	@Override
	public int getMaxMeta()
	{
		return this.variantList.size() - 1;
	}
}
