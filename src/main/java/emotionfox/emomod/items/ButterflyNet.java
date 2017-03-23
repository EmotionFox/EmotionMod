package emotionfox.emomod.items;

import emotionfox.emomod.entity.EntityButterfly;
import emotionfox.emomod.handler.EmotionSoundHandler;
import emotionfox.emomod.init.EmotionItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ButterflyNet extends Item
{
	public ButterflyNet()
	{
		this.setMaxStackSize(1);
		this.setMaxDamage(10);
		this.setCreativeTab(CreativeTabs.TOOLS);
	}

	@Override
	public boolean onLeftClickEntity(ItemStack stack, EntityPlayer player, Entity entity)
	{
		if (entity instanceof EntityButterfly)
		{
			EntityButterfly butterfly = (EntityButterfly) entity;

			if (!player.world.isRemote)
			{
				if (!player.capabilities.isCreativeMode)
				{
					player.playSound(EmotionSoundHandler.ITEM_BUTTERFLY_NET_USE, 1.0F, 1.0F);

					if (butterfly.getButterflyType() == EntityButterfly.Type.PINK)
						entity.dropItem(EmotionItems.BUTTERFLY_PINK, 1);
					if (butterfly.getButterflyType() == EntityButterfly.Type.BLUE)
						entity.dropItem(EmotionItems.BUTTERFLY_BLUE, 1);
					if (butterfly.getButterflyType() == EntityButterfly.Type.GREEN)
						entity.dropItem(EmotionItems.BUTTERFLY_GREEN, 1);
					if (butterfly.getButterflyType() == EntityButterfly.Type.CITRUS)
						entity.dropItem(EmotionItems.BUTTERFLY_CITRUS, 1);

					stack.damageItem(1, player);
				}
			}

			entity.setDead();
			return true;
		}

		return super.onLeftClickEntity(stack, player, entity);
	}
}
