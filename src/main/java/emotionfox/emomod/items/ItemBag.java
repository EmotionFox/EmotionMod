package emotionfox.emomod.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

public class ItemBag extends Item
{
	public static final String[] variants = new String[]
	{ "pear", "cherry", "orange", "tomato", "apple" };

	public ItemBag()
	{
		this.setMaxStackSize(32);
		this.setCreativeTab(CreativeTabs.FOOD);
		this.setHasSubtypes(true);
	}
	
	@Override
	public void getSubItems(Item itemIn, CreativeTabs tab, NonNullList<ItemStack> subItems)
	{
		for (int i = 0; i < variants.length; i++)
		{
			subItems.add(new ItemStack(itemIn, 1, i));
		}
	}

	@Override
	public String getUnlocalizedName(ItemStack stack)
	{
		for (int i = 0; i < variants.length; i++)
		{
			if (stack.getItemDamage() == i)
			{
				return this.getUnlocalizedName() + "_" + variants[i];
			}
			else
			{
				continue;
			}
		}
		return this.getUnlocalizedName() + "_" + variants[0];
	}
}
