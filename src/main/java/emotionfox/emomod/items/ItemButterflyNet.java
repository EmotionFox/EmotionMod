package emotionfox.emomod.items;

import emotionfox.emomod.entity.EntityButterfly;
import emotionfox.emomod.handler.EmotionSoundHandler;
import emotionfox.emomod.init.EmotionItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemButterflyNet extends Item
{
	public ItemButterflyNet()
	{
		this.setMaxStackSize(1);
		this.setMaxDamage(10);
		this.setCreativeTab(CreativeTabs.TOOLS);
	}

	@Override
	public boolean onLeftClickEntity(ItemStack stack, EntityPlayer player, Entity entity)
	{
		if (!player.world.isRemote)
		{
			if (entity instanceof EntityButterfly)
			{
				EntityButterfly butterfly = (EntityButterfly) entity;

				switch (butterfly.getButterflyType())
				{
				case PINK:
					butterfly.entityDropItem(new ItemStack(EmotionItems.BUTTERFLY, 1, 0),  0.0F);
					break;
				case BLUE:
					butterfly.entityDropItem(new ItemStack(EmotionItems.BUTTERFLY, 1, 1),  0.0F);
					break;
				case GREEN:
					butterfly.entityDropItem(new ItemStack(EmotionItems.BUTTERFLY, 1, 2),  0.0F);
					break;
				case CITRUS:
					butterfly.entityDropItem(new ItemStack(EmotionItems.BUTTERFLY, 1, 3),  0.0F);
					break;
				}
				player.playSound(EmotionSoundHandler.ITEM_BUTTERFLY_NET_USE, 1.0F, 1.0F);
				butterfly.setDead();
				stack.damageItem(1, player);
				return true;
			}
		}
		return super.onLeftClickEntity(stack, player, entity);
	}
}
