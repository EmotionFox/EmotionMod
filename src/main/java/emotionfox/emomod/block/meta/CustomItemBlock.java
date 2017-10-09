package emotionfox.emomod.block.meta;

import emotionfox.emomod.block.BurningBlock;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class CustomItemBlock extends ItemBlock
{
	public CustomItemBlock(Block block)
	{
		super(block);
	}
	
	@Override
	public int getItemBurnTime(ItemStack itemStack)
	{
		if(block instanceof BurningBlock)
			return ((BurningBlock) block).getBurningTime();
		return -1;
	}
}
