package emotionfox.emomod.event;

import emotionfox.emomod.init.EmotionAchievement;
import emotionfox.emomod.init.EmotionBlock;
import emotionfox.emomod.init.EmotionItem;
import emotionfox.emomod.item.ItemAmulet;
import emotionfox.emomod.item.ItemButterfly;
import emotionfox.emomod.item.ItemSlice;
import emotionfox.emomod.item.ItemStaff;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.stats.AchievementList;
import net.minecraftforge.event.entity.player.EntityItemPickupEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.ItemCraftedEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.ItemSmeltedEvent;

public class EmotionAchievementEvent
{
	@SubscribeEvent
	public void whenCraft(ItemCraftedEvent e)
	{
		Item item = e.crafting.getItem();
		ItemStack stack = e.crafting;

		if (item == Item.getItemFromBlock(EmotionBlock.CAKE_CHOCO) || item == Item.getItemFromBlock(EmotionBlock.CAKE_FRUIT) || item == Item.getItemFromBlock(EmotionBlock.CAKE_TOFFEE)
				|| item == Item.getItemFromBlock(EmotionBlock.CAKE_STRAWBERRY))
			e.player.addStat(EmotionAchievement.EXTEND_CAKE, 1);

		if (item instanceof ItemAmulet)
			e.player.addStat(EmotionAchievement.AMULET, 1);

		if (item instanceof ItemStaff)
			e.player.addStat(EmotionAchievement.STAFF, 1);

		if (item instanceof ItemTool && ((ItemTool) item).getToolMaterial() == EmotionItem.TOOL_MAT_FOSSIL || item == EmotionItem.FOSSIL_HOE)
			e.player.addStat(EmotionAchievement.FOSSIL, 1);

		if (item instanceof ItemTool && ((ItemTool) item).getToolMaterial() == EmotionItem.TOOL_MAT_PURPURA || item == EmotionItem.PURPURA_HOE)
			e.player.addStat(EmotionAchievement.PURPURA, 1);

		if (item == EmotionItem.PIE_PEAR || item == EmotionItem.PIE_CHERRY || item == EmotionItem.PIE_ORANGE || item == EmotionItem.PIE_APPLE || item == EmotionItem.PIE_MELON)
			e.player.addStat(EmotionAchievement.EXTEND_PIE, 1);

		if (item.getUnlocalizedName().contains("Juice"))
			e.player.addStat(EmotionAchievement.SWEET_JUICE, 1);

		if (item instanceof ItemSlice && stack.getItemDamage() != 10)
		{
			e.player.addStat(EmotionAchievement.FRUIT_TOAST, 1);

			if (!e.player.world.isRemote)
				e.player.dropItem(new ItemStack(Item.getItemFromBlock(EmotionBlock.POT), 1, 10), false);
		}
	}

	@SubscribeEvent
	public void whenSmelt(ItemSmeltedEvent e)
	{
		Item itemIn = e.smelting.getItem();

		if (itemIn == EmotionItem.SALT)
		{
			e.player.dropItem(new ItemStack(Items.BUCKET), false);
		}
	}

	@SubscribeEvent
	public void whenHarvest(EntityItemPickupEvent e)
	{
		ItemStack stack = e.getItem().getItem();
		Item item = e.getItem().getItem().getItem();
		EntityPlayer player = e.getEntityPlayer();

		if (item == EmotionItem.PURPURA_SHARD)
			player.addStat(EmotionAchievement.MINE_PURPURA);

		if (stack == new ItemStack(EmotionBlock.LOG, 1, 0) || stack == new ItemStack(EmotionBlock.LOG, 1, 1) || stack == new ItemStack(EmotionBlock.LOG, 1, 2)
				|| stack == new ItemStack(EmotionBlock.LOG, 1, 3) || stack == new ItemStack(EmotionBlock.LOG, 1, 4))
			player.addStat(AchievementList.MINE_WOOD);

		if (stack == new ItemStack(EmotionBlock.NEW_LOG, 1, 0) || stack == new ItemStack(EmotionBlock.NEW_LOG, 1, 1) || stack == new ItemStack(EmotionBlock.NEW_LOG, 1, 2))
			player.addStat(AchievementList.MINE_WOOD);

		if (item == EmotionItem.FISH_TROUT_RAW || item == EmotionItem.FISH_BASS_RAW || item == EmotionItem.FISH_SARDINE_RAW || item == EmotionItem.FISH_MACKEREL_RAW
				|| item == EmotionItem.FISH_WHITING_RAW)
			player.addStat(EmotionAchievement.EXTEND_FISH);

		if (item instanceof ItemButterfly)
			player.addStat(EmotionAchievement.BUTTERFLY);
	}
}
