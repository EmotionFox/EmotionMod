package emotionfox.emomod.item;

import emotionfox.emomod.entity.EntityButterfly;
import emotionfox.emomod.handler.EmotionSoundHandler;
import emotionfox.emomod.init.EmotionItem;
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

				ItemButterfly item = (ItemButterfly) EmotionItem.BUTTERFLY;

				switch (butterfly.getButterflyType())
				{
				case PINK:
					ItemStack butterflyPink = new ItemStack(item, 1, 0);

					if (butterfly.hasCustomName())
						item.setCustomName(butterfly.getCustomNameTag(), butterflyPink);

					butterfly.entityDropItem(butterflyPink, 0.0F);
					break;
				case BLUE:
					ItemStack butterflyBlue = new ItemStack(item, 1, 1);

					if (butterfly.hasCustomName())
						item.setCustomName(butterfly.getCustomNameTag(), butterflyBlue);

					butterfly.entityDropItem(new ItemStack(item, 1, 1), 0.0F);
					break;
				case GREEN:
					ItemStack butterflyGreen = new ItemStack(item, 1, 2);

					if (butterfly.hasCustomName())
						item.setCustomName(butterfly.getCustomNameTag(), butterflyGreen);

					butterfly.entityDropItem(new ItemStack(item, 1, 2), 0.0F);
					break;
				case BRIMSTONE:
					ItemStack butterflyCitrus = new ItemStack(item, 1, 3);

					if (butterfly.hasCustomName())
						item.setCustomName(butterfly.getCustomNameTag(), butterflyCitrus);

					butterfly.entityDropItem(new ItemStack(item, 1, 3), 0.0F);
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
