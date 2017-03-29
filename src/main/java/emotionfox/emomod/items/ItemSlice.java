package emotionfox.emomod.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

public class ItemSlice extends ItemFood
{
	public static final String[] variants = new String[]
	{ "pear", "cherry", "orange", "apple", "blueberry", "redcurrant", "blackcurrant", "strawberry", "dreamcurrant", "chocolate", "bread" };

	public ItemSlice()
	{
		super(0, false);
		this.setHasSubtypes(true);
	}

	@Override
	public int getHealAmount(ItemStack stack)
	{
		int meta = stack.getItemDamage();
		return meta == 8 ? 8 : (meta == 10 ? 2 : 6);
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
				return this.getUnlocalizedName() + "_" + variants[i];
			else
				continue;
		}
		return this.getUnlocalizedName() + "_" + variants[0];
	}
}
