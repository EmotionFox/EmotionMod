package emotionfox.emomod.block.meta;

import emotionfox.emomod.block.BurningBlock;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

/**
 * @author EmotionFox
 */

public class MetaItemBlock extends ItemBlock
{
	public MetaItemBlock(Block block)
	{
		super(block);

		// No simple block allowed here, sorry :'C
		if (!(block instanceof MetaBlockInterface))
			throw new IllegalArgumentException(String.format("The given Block %s is not an instance of MetaBlock!", block.getUnlocalizedName()));

		this.setHasSubtypes(true);
		this.setMaxDamage(0);
	}

	@Override
	public String getUnlocalizedName(ItemStack stack)
	{
		return super.getUnlocalizedName(stack) + "_" + ((MetaBlockInterface) this.block).getVariant(stack.getMetadata());
	}

	@Override
	public int getMetadata(int damage)
	{
		return damage;
	}
	
	@Override
	public int getItemBurnTime(ItemStack itemStack)
	{
		if(block instanceof BurningBlock)
			return ((BurningBlock) block).getBurningTime();
		return super.getItemBurnTime(itemStack);
	}
}