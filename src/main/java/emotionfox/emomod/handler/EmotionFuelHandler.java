package emotionfox.emomod.handler;

import emotionfox.emomod.init.EmotionBlock;
import emotionfox.emomod.init.EmotionItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.IFuelHandler;

public class EmotionFuelHandler implements IFuelHandler
{
	@Override
	public int getBurnTime(ItemStack fuel)
	{
		Item stack = fuel.getItem();

		if (stack == EmotionItem.LUME_STONE)
			return 5000;
		else if (stack == Item.getItemFromBlock(EmotionBlock.LUME_BLOCK))
			return 45000;
		else if (stack == Item.getItemFromBlock(EmotionBlock.SAPLING))
			return 100;
		else if (stack == Item.getItemFromBlock(EmotionBlock.PLANKS) || stack == Item.getItemFromBlock(EmotionBlock.LOG) || stack == Item.getItemFromBlock(EmotionBlock.NEW_LOG))
			return 300;
		else if (stack == Item.getItemFromBlock(EmotionBlock.CHERRY_STAIRS) || stack == Item.getItemFromBlock(EmotionBlock.PEAR_STAIRS) || stack == Item.getItemFromBlock(EmotionBlock.ORANGE_STAIRS)
				|| stack == Item.getItemFromBlock(EmotionBlock.ATLAS_STAIRS))
			return 300;
		else if (stack == Item.getItemFromBlock(EmotionBlock.PINE_STAIRS) || stack == Item.getItemFromBlock(EmotionBlock.COCO_STAIRS))
			return 300;
		else if (stack == EmotionItem.KNIFE)
			return 200;
		
		return 0;
	}
}
