package emotionfox.emomod.blocks.meta;

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
		System.out.println("Block: " + this.block.getUnlocalizedName() + "; Variant for meta:" + " |" + stack.getMetadata() + "| " + ((MetaBlockInterface) this.block).getVariant(stack.getMetadata()));
		return super.getUnlocalizedName(stack) + "_" + ((MetaBlockInterface) this.block).getVariant(stack.getMetadata());
	}

	@Override
	public int getMetadata(int damage)
	{
		return damage;
	}
}