package emotionfox.emomod.items;

import emotionfox.emomod.init.EmotionItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ItemBalloon extends Item
{
	public ItemBalloon()
	{
		this.setCreativeTab(CreativeTabs.TOOLS);
		this.setMaxStackSize(1);
	}

	@Override
	public void onUpdate(ItemStack stack, World world, Entity entity, int itemSlot, boolean isSelected)
	{
		if (entity instanceof EntityPlayer)
		{
			EntityPlayer player = (EntityPlayer) entity;
			BlockPos pos = new BlockPos(player.posX, player.posY, player.posZ);

			if (!player.capabilities.isCreativeMode)
			{
				if (this == EmotionItems.PURPURA_RED_BALLOON && isSelected)
				{
					if (player.isSneaking())
					{
						player.motionX *= 1.07D;
						player.motionZ *= 1.07D;
						player.motionY *= 0.8D;
					}
					else
					{
						player.motionX *= 1.04D;
						player.motionZ *= 1.04D;
						player.motionY *= 0.5D;
					}
				}
				else if (!player.isInWater() && !player.isInLava() && this == EmotionItems.PURPURA_GREEN_BALLOON && isSelected)
				{
					if (player.isSneaking())
					{
						player.motionY *= 0.7D;
					}
					else
					{
						player.motionY += 0.084D;
					}
				}
				else if (!player.isInWater() && !player.isInLava() && this == EmotionItems.PURPURA_BLUE_BALLOON && isSelected)
				{
					player.motionY += 0.07D;
				}
			}
		}
	}
}
