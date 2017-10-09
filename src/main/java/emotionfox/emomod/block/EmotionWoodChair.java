package emotionfox.emomod.block;

import java.util.List;

import emotionfox.emomod.block.enumeration.EnumWoodFurniture;
import emotionfox.emomod.block.meta.MetaBlock;
import emotionfox.emomod.entity.EntitySittable;
import emotionfox.emomod.util.Reference;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class EmotionWoodChair extends MetaBlock
{
	public static final PropertyEnum<EnumWoodFurniture> WOOD = PropertyEnum.<EnumWoodFurniture>create("wood", EnumWoodFurniture.class);

	public static final float f = Reference.PIXEL;
	public static final AxisAlignedBB WOOD_CHAIR_AABB = new AxisAlignedBB(0.0F + f * 3, 0.0F, 0.0F + f * 3, 1.0F - f * 3, 1.0F - f * 4, 1.0F - f * 3);

	public EmotionWoodChair()
	{
		super(Material.WOOD);
		this.setHardness(2.0F);
		this.setResistance(5.0F);
		this.setSoundType(SoundType.WOOD);
		this.setDefaultState(this.blockState.getBaseState().withProperty(WOOD, EnumWoodFurniture.CHERRY));
		this.setCreativeTab(CreativeTabs.DECORATIONS);

		for (int i = 0; i < EnumWoodFurniture.values().length; i++)
			this.variantList.add(EnumWoodFurniture.values()[i].getName());
	}

	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
	{
		return sitPlayer(worldIn, pos, playerIn, hand);
	}

	private static boolean sitPlayer(World world, BlockPos pos, EntityPlayer player, EnumHand hand)
	{
		double x = pos.getX();
		double y = pos.getY();
		double z = pos.getZ();

		if (!world.isRemote)
		{
			List<EntitySittable> listEMB = world.getEntitiesWithinAABB(EntitySittable.class, new AxisAlignedBB(x, y, z, x + 1.0D, y + 1.0D, z + 1.0D).expand(1.0D, 1.0D, 1.0D));

			for (EntitySittable entitytocheck : listEMB)
			{
				if ((entitytocheck.blockPosX == x) && (entitytocheck.blockPosY == y) && (entitytocheck.blockPosZ == z))
				{
					entitytocheck.processInitialInteract(player, hand);
					return true;
				}
			}

			EntitySittable entity = new EntitySittable(world, player, x, y, z);
			world.spawnEntity(entity);
			entity.processInitialInteract(player, hand);
		}
		return true;
	}

	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
	{
		return WOOD_CHAIR_AABB;
	}

	@Override
	public void getSubBlocks(CreativeTabs itemIn, NonNullList<ItemStack> items)
	{
		for (int i = 0; i < EnumWoodFurniture.values().length; i++)
		{
			items.add(new ItemStack(this, 1, i));
		}
	}

	@Override
	protected BlockStateContainer createBlockState()
	{
		return new BlockStateContainer(this, new IProperty[]
		{ WOOD });
	}

	@Override
	public int getMetaFromState(IBlockState state)
	{
		EnumWoodFurniture wood = (EnumWoodFurniture) state.getValue(WOOD);
		return wood.getMetadata();
	}

	@Override
	public IBlockState getStateFromMeta(int meta)
	{
		return meta > EnumWoodFurniture.values().length ? this.getDefaultState().withProperty(WOOD, EnumWoodFurniture.values()[0])
				: this.getDefaultState().withProperty(WOOD, EnumWoodFurniture.values()[meta]);
	}

	@Override
	public int damageDropped(IBlockState state)
	{
		return getMetaFromState(state);
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