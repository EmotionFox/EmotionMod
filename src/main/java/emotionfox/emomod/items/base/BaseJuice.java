package emotionfox.emomod.items.base;

import emotionfox.emomod.init.EmotionItems;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Items;
import net.minecraft.item.ItemSoup;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class BaseJuice extends ItemSoup
{
	public BaseJuice(int amount)
	{
		super(amount);
	}

	@Override
	public ItemStack onItemUseFinish(ItemStack stack, World worldIn, EntityLivingBase entityLiving)
	{
		super.onItemUseFinish(stack, worldIn, entityLiving);
		return new ItemStack(EmotionItems.BOWL_GLASS);
	}
}
