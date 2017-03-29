package emotionfox.emomod.blocks;

import emotionfox.emomod.init.EmotionBlocks;
import emotionfox.emomod.init.EmotionItems;
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
		if (this == EmotionBlocks.CAKE_CHOCO)
			return new ItemStack(EmotionItems.CAKE_CHOCO);
		else if (this == EmotionBlocks.CAKE_FRUIT)
			return new ItemStack(EmotionItems.CAKE_FRUIT);
		else if (this == EmotionBlocks.CAKE_TOFFEE)
			return new ItemStack(EmotionItems.CAKE_TOFFEE);
		else if (this == EmotionBlocks.CAKE_STRAWBERRY)
			return new ItemStack(EmotionItems.CAKE_STRAWBERRY);
		return new ItemStack(Items.CAKE); // Don't mind that
	}
}
