package emotionfox.emomod.items;

import emotionfox.emomod.items.meta.MetaItem;
import net.minecraft.creativetab.CreativeTabs;

public class ItemBag extends MetaItem
{
	public static final String[] variants =
	{ "pear", "cherry", "orange", "tomato", "apple" };

	public ItemBag()
	{
		super(CreativeTabs.FOOD);
		this.addVariants(variants);
		this.setMaxStackSize(32);
	}
}
