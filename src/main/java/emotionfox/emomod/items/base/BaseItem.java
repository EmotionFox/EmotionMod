package emotionfox.emomod.items.base;

import java.util.List;

import emotionfox.emomod.init.EmotionItems;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BaseItem extends Item
{
	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, EntityPlayer playerIn, List<String> tooltip, boolean advanced)
	{
		if (this == EmotionItems.AMULET_BLUE_BROKEN)
		{
			tooltip.add("Need Magic Spore");
		}
		else if (this == EmotionItems.AMULET_GREEN_BROKEN)
		{
			tooltip.add("Need Magic Spore");
		}
		else if (this == EmotionItems.AMULET_RED_BROKEN)
		{
			tooltip.add("Need Magic Spore");
		}
		else if (this == EmotionItems.AMULET_WHITE_BROKEN)
		{
			tooltip.add("Need Magic Spore");
		}
	}
}
