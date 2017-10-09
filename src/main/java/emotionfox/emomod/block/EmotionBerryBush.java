package emotionfox.emomod.block;

import java.util.ArrayList;
import java.util.Random;

import emotionfox.emomod.block.base.BaseBush;
import emotionfox.emomod.block.enumeration.EnumBerry;
import emotionfox.emomod.block.meta.MetaBlockInterface;
import emotionfox.emomod.util.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class EmotionBerryBush extends BaseBush implements MetaBlockInterface
{
	private final ArrayList<String> variantList = new ArrayList<String>();

	public static final PropertyEnum<EnumBerry> BERRY = PropertyEnum.<EnumBerry>create("berry", EnumBerry.class);

	public EmotionBerryBush()
	{
		this.setTickRandomly(true);
		this.setDefaultState(this.blockState.getBaseState().withProperty(BERRY, EnumBerry.BLUEBERRY));
		this.setSoundType(SoundType.PLANT);

		for (int i = 0; i < EnumBerry.values().length; i++)
			this.variantList.add(EnumBerry.values()[i].getName());
	}

	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
	{
		return Block.FULL_BLOCK_AABB;
	}

	@Override
	protected BlockStateContainer createBlockState()
	{
		return new BlockStateContainer(this, new IProperty[]
		{ BERRY });
	}

	@Override
	public int getMetaFromState(IBlockState state)
	{
		EnumBerry variant = (EnumBerry) state.getValue(BERRY);
		return variant.getMetadata();
	}

	@Override
	public IBlockState getStateFromMeta(int meta)
	{
		return meta > EnumBerry.values().length ? this.getDefaultState().withProperty(BERRY, EnumBerry.values()[0]) : this.getDefaultState().withProperty(BERRY, EnumBerry.values()[meta]);
	}

	@Override
	public int damageDropped(IBlockState state)
	{
		return getMetaFromState(state);
	}

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune)
	{
		return null;
	}

	@Override
	public void onEntityCollidedWithBlock(World worldIn, BlockPos pos, IBlockState state, Entity entityIn)
	{
		entityIn.motionX *= 0.4D;
		entityIn.motionZ *= 0.4D;
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
