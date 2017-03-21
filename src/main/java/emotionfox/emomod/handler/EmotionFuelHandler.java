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
		else if (stack == Item.getItemFromBlock(EmotionBlocks.lumeBlock))
			return 45000;
		else if (stack == Item.getItemFromBlock(EmotionBlocks.emoSapling))
			return 100;
		else if (stack == Item.getItemFromBlock(EmotionBlocks.emoPlanks) || stack == Item.getItemFromBlock(EmotionBlocks.emoLog) || stack == Item.getItemFromBlock(EmotionBlocks.emoNewLog))
			return 300;
		else if (stack == Item.getItemFromBlock(EmotionBlocks.cherryStairs) || stack == Item.getItemFromBlock(EmotionBlocks.pearStairs) || stack == Item.getItemFromBlock(EmotionBlocks.orangeStairs)
				|| stack == Item.getItemFromBlock(EmotionBlocks.atlasStairs))
			return 300;
		else if (stack == Item.getItemFromBlock(EmotionBlocks.pineStairs) || stack == Item.getItemFromBlock(EmotionBlocks.cocoStairs))
			return 300;
		else if (stack == EmotionItems.KNIFE)
			return 200;
		
		return 0;
	}
}
