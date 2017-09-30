package emotionfox.emomod.items.base;

import emotionfox.emomod.init.EmotionItem;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class BaseSword extends ItemSword
{
	public BaseSword(ToolMaterial material)
	{
		super(material);
	}

	@Override
	public void onUpdate(ItemStack stack, World worldIn, Entity entity, int itemSlot, boolean isSelected)
	{
		super.onUpdate(stack, worldIn, entity, itemSlot, isSelected);

		EntityPlayer player = (EntityPlayer) entity;
		ItemStack equipped = player.getActiveItemStack();

		if (this == EmotionItem.PURPURA_SWORD)
		{
			if (equipped == stack)
				player.addPotionEffect(new PotionEffect(Potion.getPotionById(5), 10, 0, false, false));
		}
	}

	@Override
	public boolean getIsRepairable(ItemStack input, ItemStack repair)
	{
		if (this == EmotionItem.PURPURA_SWORD || this == EmotionItem.PURPURA_BLUE_SWORD || this == EmotionItem.PURPURA_RED_SWORD)
		{
			if (repair.getItem() == EmotionItem.PURPURA_SHARD)
				return true;
		}
		else if (this == EmotionItem.FOSSIL_SWORD)
		{
			if (repair.getItem() == EmotionItem.FOSSIL)
				return true;
		}
		return false;
	}
}
