package emotionfox.emomod.item.meta;

import java.util.ArrayList;

import emotionfox.emomod.util.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

/**
 * @author EmotionFox
 */

public class MetaItem extends Item implements MetaItemInterface
{
	protected final ArrayList<String> variantList = new ArrayList<String>();
	
	public MetaItem(CreativeTabs tab)
	{
		this.setCreativeTab(tab);
		this.setHasSubtypes(true);
		this.setMaxDamage(0);
	}

	@Override
	public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> items)
	{
		if (this.isInCreativeTab(tab))
		{
			for (int i = 0; i < this.variantList.size(); i++)
			{
				items.add(new ItemStack(this, 1, i));
			}
		}
	}

	@Override
	public String getUnlocalizedName(ItemStack stack)
	{
		return super.getUnlocalizedName(stack) + "_" + this.variantList.get(stack.getMetadata());
	}
	
	@Override
	public void addVariants(String[] variants)
	{
		for (int i = 0; i < variants.length; i++)
		{
			this.variantList.add(variants[i]);
		}
	}
	
	@Override
	public String getVariantName(int meta)
	{
		String name = Reference.MOD_ID + ":" + ((Item) this).getUnlocalizedName().substring(5);
		return meta > getMaxMeta() ? name + "_" + this.variantList.get(0) : name + "_" + this.variantList.get(meta);
	}
	
	@Override
	public int getMaxMeta()
	{
		// -1 because size return the number of elements but meta start at 0.
		return this.variantList.size() - 1;
	}
}
