package emotionfox.emomod.block;

import emotionfox.emomod.init.EmotionBlock;
import net.minecraft.block.BlockCake;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class EmotionCake extends BlockCake
{
	public EmotionCake()
	{
		this.setHardness(0.5F);
		this.setSoundType(SoundType.CLOTH);
	}

	public ItemStack getItem(World worldIn, BlockPos pos, IBlockState state)
	{
		if (this == EmotionBlock.CAKE_CHOCO)
			return new ItemStack(EmotionBlock.CAKE_CHOCO_ITEM);
		else if (this == EmotionBlock.CAKE_FRUIT)
			return new ItemStack(EmotionBlock.CAKE_FRUIT_ITEM);
		else if (this == EmotionBlock.CAKE_TOFFEE)
			return new ItemStack(EmotionBlock.CAKE_TOFFEE_ITEM);
		else if (this == EmotionBlock.CAKE_STRAWBERRY)
			return new ItemStack(EmotionBlock.CAKE_STRAWBERRY_ITEM);
		return new ItemStack(Items.CAKE); // Don't mind that
	}
}
