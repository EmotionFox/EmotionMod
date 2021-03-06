package emotionfox.emomod.block;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.annotation.Nullable;

import com.google.common.base.Predicate;

import emotionfox.emomod.block.meta.MetaBlockInterface;
import emotionfox.emomod.init.EmotionBlock;
import emotionfox.emomod.init.EmotionItem;
import emotionfox.emomod.util.Reference;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.BlockPlanks.EnumType;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class EmotionLeaves extends BlockLeaves implements MetaBlockInterface
{
	private static final ArrayList<String> variantList = new ArrayList<String>();

	public static final PropertyEnum<EmotionPlanks.EnumType> VARIANT = PropertyEnum.<EmotionPlanks.EnumType>create("variant", EmotionPlanks.EnumType.class, new Predicate<EmotionPlanks.EnumType>()
	{
		public boolean apply(@Nullable EmotionPlanks.EnumType type)
		{
			return type.getMetadata() < 4;
		}
	});

	public EmotionLeaves()
	{
		this.setDefaultState(
				this.blockState.getBaseState().withProperty(VARIANT, EmotionPlanks.EnumType.CHERRY).withProperty(CHECK_DECAY, Boolean.valueOf(true)).withProperty(DECAYABLE, Boolean.valueOf(true)));

		for (int i = 0; i < 4; i++)
			this.variantList.add(EmotionPlanks.EnumType.values()[i].getName());
	}

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune)
	{
		return Item.getItemFromBlock(EmotionBlock.SAPLING);
	}

	@Override
	protected void dropApple(World worldIn, BlockPos pos, IBlockState state, int chance)
	{
		if (state.getValue(VARIANT) == EmotionPlanks.EnumType.CHERRY && worldIn.rand.nextInt(chance) == 0)
			spawnAsEntity(worldIn, pos, new ItemStack(EmotionItem.FRUIT_CHERRY));
		if (state.getValue(VARIANT) == EmotionPlanks.EnumType.PEAR && worldIn.rand.nextInt(chance) == 0)
			spawnAsEntity(worldIn, pos, new ItemStack(EmotionItem.FRUIT_PEAR));
		if (state.getValue(VARIANT) == EmotionPlanks.EnumType.ORANGE && worldIn.rand.nextInt(chance) == 0)
			spawnAsEntity(worldIn, pos, new ItemStack(EmotionItem.FRUIT_ORANGE));
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
		items.add(new ItemStack(this, 1, 3));
	}

	@Override
	protected ItemStack getSilkTouchDrop(IBlockState state)
	{
		return new ItemStack(Item.getItemFromBlock(this), 1, ((EmotionPlanks.EnumType) state.getValue(VARIANT)).getMetadata());
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
		i = i | ((EmotionPlanks.EnumType) state.getValue(VARIANT)).getMetadata();

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
		return EmotionPlanks.EnumType.byMetadata((meta & 3) % 4);
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
	public List<ItemStack> onSheared(ItemStack item, IBlockAccess world, BlockPos pos, int fortune)
	{
		return NonNullList.withSize(1, new ItemStack(this, 1, world.getBlockState(pos).getValue(VARIANT).getMetadata()));
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
		String name = Reference.MOD_ID + ":" + this.getUnlocalizedName().substring(5);
		return meta > getMaxMeta() ? name + "_" + this.variantList.get(0) : name + "_" + this.variantList.get(meta);
	}

	@Override
	public int getMaxMeta()
	{
		return this.variantList.size() - 1;
	}
}
