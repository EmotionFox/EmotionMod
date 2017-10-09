package emotionfox.emomod.item.base;

import emotionfox.emomod.init.EmotionItem;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemSoup;
import net.minecraft.item.ItemStack;
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
		return new ItemStack(EmotionItem.BOWL_GLASS);
	}
}
