package emotionfox.emomod.handler;

import emotionfox.emomod.init.EmotionBlocks;
import emotionfox.emomod.init.EmotionItems;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.IFuelHandler;

public class EmotionFuelHandler implements IFuelHandler
{
	@Override
	public int getBurnTime(ItemStack fuel)
	{
		Item stack = fuel.getItem();

		if (stack == EmotionItems.LUME_STONE)
			return 5000;
		else if (stack == Item.getItemFromBlock(EmotionBlocks.LUME_BLOCK))
			return 45000;
		else if (stack == Item.getItemFromBlock(EmotionBlocks.SAPLING))
			return 100;
		else if (stack == Item.getItemFromBlock(EmotionBlocks.PLANKS) || stack == Item.getItemFromBlock(EmotionBlocks.LOG) || stack == Item.getItemFromBlock(EmotionBlocks.NEW_LOG))
			return 300;
		else if (stack == Item.getItemFromBlock(EmotionBlocks.CHERRY_STAIRS) || stack == Item.getItemFromBlock(EmotionBlocks.PEAR_STAIRS) || stack == Item.getItemFromBlock(EmotionBlocks.ORANGE_STAIRS)
				|| stack == Item.getItemFromBlock(EmotionBlocks.ATLAS_STAIRS))
			return 300;
		else if (stack == Item.getItemFromBlock(EmotionBlocks.PINE_STAIRS) || stack == Item.getItemFromBlock(EmotionBlocks.COCO_STAIRS))
			return 300;
		else if (stack == EmotionItems.KNIFE)
			return 200;
		
		return 0;
	}
}
