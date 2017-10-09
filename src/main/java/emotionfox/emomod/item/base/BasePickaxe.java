package emotionfox.emomod.item.base;

import emotionfox.emomod.init.EmotionItem;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class BasePickaxe extends ItemPickaxe
{
	public BasePickaxe(ToolMaterial material)
	{
		super(material);
		this.setCreativeTab(CreativeTabs.TOOLS);
	}

	@Override
	public void onUpdate(ItemStack stack, World worldIn, Entity entity, int itemSlot, boolean isSelected)
	{
		super.onUpdate(stack, worldIn, entity, itemSlot, isSelected);
		{
			EntityPlayer player = (EntityPlayer) entity;
			ItemStack equipped = player.getActiveItemStack();

			if (this == EmotionItem.PURPURA_PICKAXE)
			{
				if (equipped == stack)
					player.addPotionEffect(new PotionEffect(Potion.getPotionById(3), 10, 0, false, false));
			}
		}
	}

	@Override
	public boolean getIsRepairable(ItemStack input, ItemStack repair)
	{
		if (this == EmotionItem.PURPURA_PICKAXE)
		{
			if (repair.getItem() == EmotionItem.PURPURA_SHARD)
				return true;
		}
		else if (this == EmotionItem.FOSSIL_PICKAXE)
		{
			if (repair.getItem() == EmotionItem.FOSSIL)
				return true;
		}
		return false;
	}
}
