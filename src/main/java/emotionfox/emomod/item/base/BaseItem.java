package emotionfox.emomod.item.base;

import java.util.List;

import emotionfox.emomod.init.EmotionItem;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BaseItem extends Item
{
	@Override
	public int getItemBurnTime(ItemStack itemStack)
	{
		if(this == EmotionItem.LUME_STONE)
			return 5000;
		return -1;
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn)
	{
		if (this == EmotionItem.AMULET_BLUE_BROKEN)
		{
			tooltip.add("Need Magic Spore");
		}
		else if (this == EmotionItem.AMULET_GREEN_BROKEN)
		{
			tooltip.add("Need Magic Spore");
		}
		else if (this == EmotionItem.AMULET_RED_BROKEN)
		{
			tooltip.add("Need Magic Spore");
		}
		else if (this == EmotionItem.AMULET_WHITE_BROKEN)
		{
			tooltip.add("Need Magic Spore");
		}
	}
}
