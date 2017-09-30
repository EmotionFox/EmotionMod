package emotionfox.emomod.blocks.base;

import emotionfox.emomod.init.EmotionBlock;
import emotionfox.emomod.init.EmotionItem;
import net.minecraft.block.BlockCrops;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class BasePlant extends BlockCrops
{
	@Override
	protected Item getSeed()
	{
		return this == EmotionBlock.PEAR_PLANT ? EmotionItem.SEED_PEAR
				: (this == EmotionBlock.CHERRY_PLANT ? EmotionItem.SEED_CHERRY
						: (this == EmotionBlock.ORANGE_PLANT ? EmotionItem.SEED_ORANGE
								: (this == EmotionBlock.TOMATO_PLANT ? EmotionItem.SEED_TOMATO
										: (this == EmotionBlock.APPLE_PLANT ? EmotionItem.SEED_APPLE
												: (this == EmotionBlock.BLUE_PLANT ? EmotionItem.SPORE_MAGIC
														: (this == EmotionBlock.RED_PLANT ? EmotionItem.SPORE_RED
																: (this == EmotionBlock.BROWN_PLANT ? EmotionItem.SPORE_BROWN : EmotionItem.SEED_PEAR)))))));
	}

	@Override
	protected Item getCrop()
	{
		return this == EmotionBlock.PEAR_PLANT ? EmotionItem.FRUIT_PEAR
				: (this == EmotionBlock.CHERRY_PLANT ? EmotionItem.FRUIT_CHERRY
						: (this == EmotionBlock.ORANGE_PLANT ? EmotionItem.FRUIT_ORANGE
								: (this == EmotionBlock.TOMATO_PLANT ? EmotionItem.FRUIT_TOMATO
										: (this == EmotionBlock.APPLE_PLANT ? Items.APPLE
												: (this == EmotionBlock.BLUE_PLANT ? Item.getItemFromBlock(EmotionBlock.MUSHROOM)
														: (this == EmotionBlock.RED_PLANT ? Item.getItemFromBlock(Blocks.RED_MUSHROOM)
																: (this == EmotionBlock.BROWN_PLANT ? Item.getItemFromBlock(Blocks.BROWN_MUSHROOM) : EmotionItem.FRUIT_PEAR)))))));
	}
}