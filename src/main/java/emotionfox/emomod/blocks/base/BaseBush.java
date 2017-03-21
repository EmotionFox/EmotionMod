package emotionfox.emomod.blocks.base;

import emotionfox.emomod.blocks.EmotionPlanks;
import emotionfox.emomod.blocks.EmotionSapling;
import emotionfox.emomod.init.EmotionBlocks;
import net.minecraft.block.BlockBush;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;

public class BaseBush extends BlockBush
{	
	@Override
	public boolean canSustainBush(IBlockState state)
	{
		return state.getBlock() == EmotionBlocks.dreamGrass || state.getBlock() == EmotionBlocks.dreamDirt || state.getBlock() == Blocks.GRASS || state.getBlock() == Blocks.DIRT
				|| state.getBlock() == Blocks.FARMLAND;
	}

	@Override
	public net.minecraftforge.common.EnumPlantType getPlantType(net.minecraft.world.IBlockAccess world, BlockPos pos)
	{
		if (this == EmotionBlocks.baseMushroom)
			return net.minecraftforge.common.EnumPlantType.Cave;
		if (this == EmotionBlocks.baseBush)
			return net.minecraftforge.common.EnumPlantType.Plains;
		if (this == EmotionBlocks.baseBushSimple)
			return net.minecraftforge.common.EnumPlantType.Plains;
		if(this == EmotionBlocks.emoSapling.getDefaultState().withProperty(EmotionSapling.TYPE, EmotionPlanks.EnumType.COCO))
			return net.minecraftforge.common.EnumPlantType.Desert;
		else if(this == EmotionBlocks.emoSapling)
			return net.minecraftforge.common.EnumPlantType.Plains;

		return super.getPlantType(world, pos);
	}
}
