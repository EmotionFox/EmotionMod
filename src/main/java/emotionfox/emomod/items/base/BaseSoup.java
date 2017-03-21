package emotionfox.emomod.items.base;

import emotionfox.emomod.init.EmotionItems;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemSoup;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class BaseSoup extends ItemSoup
{
	public BaseSoup(int amount)
	{
		super(amount);
	}

	@Override
	public ItemStack onItemUseFinish(ItemStack stack, World worldIn, EntityLivingBase entityLiving)
	{
		if (this == EmotionItems.SALAD_TOMATO)
		{
			entityLiving.addPotionEffect(new PotionEffect(Potion.getPotionById(11), 500, 0));
		}
		else if (this == EmotionItems.SALAD_FRUIT)
		{
			entityLiving.addPotionEffect(new PotionEffect(Potion.getPotionById(1), 1000, 0));
		}
		return super.onItemUseFinish(stack, worldIn, entityLiving);
	}
}
