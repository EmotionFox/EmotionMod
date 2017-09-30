package emotionfox.emomod.items.base;

import emotionfox.emomod.init.EmotionItem;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class BaseShovel extends ItemSpade
{
	public BaseShovel(ToolMaterial material)
	{
		super(material);
	}

	@Override
	public void onUpdate(ItemStack stack, World worldIn, Entity entity, int itemSlot, boolean isSelected)
	{
		super.onUpdate(stack, worldIn, entity, itemSlot, isSelected);

		EntityPlayer player = (EntityPlayer) entity;
		ItemStack equipped = player.getActiveItemStack();

		if (this == EmotionItem.PURPURA_SHOVEL)
		{
			if (equipped == stack)
				player.addPotionEffect(new PotionEffect(Potion.getPotionById(11), 10, 0, false, false));
		}
	}

	@Override
	public boolean getIsRepairable(ItemStack input, ItemStack repair)
	{
		if (this == EmotionItem.PURPURA_SHOVEL)
		{
			if (repair.getItem() == EmotionItem.PURPURA_SHARD)
				return true;
		}
		else if (this == EmotionItem.FOSSIL_SHOVEL)
		{
			if (repair.getItem() == EmotionItem.FOSSIL)
				return true;
		}
		return false;
	}
}
