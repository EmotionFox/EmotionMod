package emotionfox.emomod.items;

import java.util.List;

import emotionfox.emomod.init.EmotionItem;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemAmulet extends Item
{
	public ItemAmulet()
	{
		this.setMaxStackSize(1);
		this.setMaxDamage(5000);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn)
	{
		tooltip.add("Pray The Elements");

		if (this == EmotionItem.AMULET_BLUE)
		{
			tooltip.add("\u00a7b" + "Water");
		}
		else if (this == EmotionItem.AMULET_GREEN)
		{
			tooltip.add("\u00a7a" + "Earth");
		}
		else if (this == EmotionItem.AMULET_RED)
		{
			tooltip.add("\u00a7c" + "Fire");
		}
		else if (this == EmotionItem.AMULET_WHITE)
		{
			tooltip.add("\u00a7e" + "Wind");
		}
	}

	@Override
	public void onUpdate(ItemStack stack, World worldIn, Entity entity, int itemSlot, boolean isSelected)
	{
		super.onUpdate(stack, worldIn, entity, itemSlot, isSelected);
		EntityPlayer player = (EntityPlayer) entity;
		ItemStack mainHand = player.getHeldItemMainhand();
		ItemStack offHand = player.getHeldItemOffhand();

		if (mainHand == stack || offHand == stack)
		{
			if (this == EmotionItem.AMULET_BLUE)
			{
				if (stack.getItemDamage() != getMaxDamage(stack))
				{
					player.addPotionEffect(new PotionEffect(Potion.getPotionById(13), 10, 1));
					stack.damageItem(1, player);
				}
				else
				{
					if (!player.capabilities.isCreativeMode)
						player.inventory.setInventorySlotContents(player.inventory.currentItem, (ItemStack) new ItemStack(EmotionItem.AMULET_BLUE_BROKEN, 1, 0));
				}
			}
			else if (this == EmotionItem.AMULET_GREEN)
			{
				if (stack.getItemDamage() != getMaxDamage(stack))
				{
					player.addPotionEffect(new PotionEffect(Potion.getPotionById(8), 10, 1));
					stack.damageItem(1, player);
				}
				else
				{
					if (!player.capabilities.isCreativeMode)
						player.inventory.setInventorySlotContents(player.inventory.currentItem, (ItemStack) new ItemStack(EmotionItem.AMULET_GREEN_BROKEN, 1, 0));
				}
			}
			else if (this == EmotionItem.AMULET_RED)
			{
				if (stack.getItemDamage() != getMaxDamage(stack))
				{
					player.addPotionEffect(new PotionEffect(Potion.getPotionById(12), 10, 0));
					stack.damageItem(1, player);
				}
				else
				{
					if (!player.capabilities.isCreativeMode)
						player.inventory.setInventorySlotContents(player.inventory.currentItem, (ItemStack) new ItemStack(EmotionItem.AMULET_RED_BROKEN, 1, 0));
				}
			}
			else if (this == EmotionItem.AMULET_WHITE)
			{
				if (stack.getItemDamage() != getMaxDamage(stack))
				{
					player.addPotionEffect(new PotionEffect(Potion.getPotionById(1), 10, 1));
					stack.damageItem(1, player);
				}
				else
				{
					if (!player.capabilities.isCreativeMode)
						player.inventory.setInventorySlotContents(player.inventory.currentItem, (ItemStack) new ItemStack(EmotionItem.AMULET_WHITE_BROKEN, 1, 0));
				}
			}
		}
	}
}
