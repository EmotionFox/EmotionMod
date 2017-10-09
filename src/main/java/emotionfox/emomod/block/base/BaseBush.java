package emotionfox.emomod.block.base;

import emotionfox.emomod.block.EmotionPlanks;
import emotionfox.emomod.block.EmotionSapling;
import emotionfox.emomod.init.EmotionBlock;
import net.minecraft.block.BlockBush;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;

public class BaseBush extends BlockBush
{
	@Override
	public boolean canSustainBush(IBlockState state)
	{
		return state.getBlock() == Blocks.GRASS || state.getBlock() == Blocks.DIRT || state.getBlock() == Blocks.FARMLAND;
	}

	@Override
	public net.minecraftforge.common.EnumPlantType getPlantType(net.minecraft.world.IBlockAccess world, BlockPos pos)
	{
		if (this == EmotionBlock.MUSHROOM)
			return net.minecraftforge.common.EnumPlantType.Cave;
		if (this == EmotionBlock.BUSH)
			return net.minecraftforge.common.EnumPlantType.Plains;
		if (this == EmotionBlock.BUSH_SIMPLE)
			return net.minecraftforge.common.EnumPlantType.Plains;
		if (this == EmotionBlock.SAPLING.getDefaultState().withProperty(EmotionSapling.TYPE, EmotionPlanks.EnumType.COCO))
			return net.minecraftforge.common.EnumPlantType.Desert;
		else if (this == EmotionBlock.SAPLING)
			return net.minecraftforge.common.EnumPlantType.Plains;

		return super.getPlantType(world, pos);
	}
}
