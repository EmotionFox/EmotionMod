package emotionfox.emomod.blocks.base;

import emotionfox.emomod.init.EmotionBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BaseViscous extends Block
{
	protected static final AxisAlignedBB MUD_AABB = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.875D, 1.0D);
	
	public BaseViscous(Material materialIn, SoundType sound)
	{
		super(materialIn);
		this.setSoundType(sound);
		this.setHardness(0.7F);
		this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	}
	
	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
    {
		return Block.FULL_BLOCK_AABB;
    }
	
	@Override
	public AxisAlignedBB getCollisionBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
    {
		return this == EmotionBlock.SHIFTING_SAND ? Block.NULL_AABB : (this == EmotionBlock.MUD ? MUD_AABB : Block.FULL_BLOCK_AABB);
    }
	
	@Override
    public void onEntityCollidedWithBlock(World worldIn, BlockPos pos, IBlockState state, Entity entityIn)
    {
		if(this == EmotionBlock.SHIFTING_SAND)
		{
			entityIn.motionX *= 0.02D;
	        entityIn.motionY *= 0.02D;
	        entityIn.motionZ *= 0.02D;
		}
		else
		{
			entityIn.motionX *= 0.4D;
	        entityIn.motionZ *= 0.4D;
		}
    }
}
