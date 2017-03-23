package emotionfox.emomod.event;

import emotionfox.emomod.achievement.EmotionAchievement;
import emotionfox.emomod.init.EmotionBlocks;
import emotionfox.emomod.init.EmotionItems;
import emotionfox.emomod.items.PurpuraAmulet;
import emotionfox.emomod.items.PurpuraStaff;
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

		if (item == Item.getItemFromBlock(EmotionBlocks.cakeChoco) || item == Item.getItemFromBlock(EmotionBlocks.cakeFruit) || item == Item.getItemFromBlock(EmotionBlocks.cakeToffee)
				|| item == Item.getItemFromBlock(EmotionBlocks.cakeStrawberry))
			e.player.addStat(EmotionAchievement.EXTEND_CAKE, 1);

		if (item instanceof PurpuraAmulet)
			e.player.addStat(EmotionAchievement.AMULET, 2);

		if (item instanceof PurpuraStaff)
			e.player.addStat(EmotionAchievement.STAFF, 3);

		if (item instanceof ItemTool && ((ItemTool) item).getToolMaterial() == EmotionItems.TOOL_MAT_FOSSIL || item == EmotionItems.FOSSIL_HOE)
			e.player.addStat(EmotionAchievement.FOSSIL, 4);

		if (item instanceof ItemTool && ((ItemTool) item).getToolMaterial() == EmotionItems.TOOL_MAT_PURPURA || item == EmotionItems.PURPURA_HOE)
			e.player.addStat(EmotionAchievement.PURPURA, 5);

		if (item == EmotionItems.PIE_PEAR || item == EmotionItems.PIE_CHERRY || item == EmotionItems.PIE_ORANGE || item == EmotionItems.PIE_APPLE || item == EmotionItems.PIE_MELON)
			e.player.addStat(EmotionAchievement.EXTEND_PIE, 6);

		if (item.getUnlocalizedName().contains("Juice"))
			e.player.addStat(EmotionAchievement.SWEET_JUICE, 7);

		if (item != EmotionItems.SLICE_BREAD && item.getUnlocalizedName().contains("Slice"))
		{
			e.player.addStat(EmotionAchievement.FRUIT_TOAST, 8);

			if (!e.player.world.isRemote)
				e.player.dropItem(new ItemStack(Item.getItemFromBlock(EmotionBlocks.basePot), 1, 10), false);
		}
	}

	@SubscribeEvent
	public void whenSmelt(ItemSmeltedEvent e)
	{
		Item itemIn = e.smelting.getItem();

		if (itemIn == EmotionItems.SALT)
		{
			e.player.dropItem(new ItemStack(Items.BUCKET), false);
		}
	}

	@SubscribeEvent
	public void whenHarvest(EntityItemPickupEvent e)
	{
		ItemStack stack = e.getItem().getEntityItem();
		Item item = e.getItem().getEntityItem().getItem();
		EntityPlayer player = e.getEntityPlayer();

		if (item == EmotionItems.PURPURA_SHARD)
			player.addStat(EmotionAchievement.MINE_PURPURA);

		if (stack == new ItemStack(EmotionBlocks.emoLog, 1, 0) || stack == new ItemStack(EmotionBlocks.emoLog, 1, 1) || stack == new ItemStack(EmotionBlocks.emoLog, 1, 2)
				|| stack == new ItemStack(EmotionBlocks.emoLog, 1, 3) || stack == new ItemStack(EmotionBlocks.emoLog, 1, 4))
			player.addStat(AchievementList.MINE_WOOD);

		if (stack == new ItemStack(EmotionBlocks.emoNewLog, 1, 0) || stack == new ItemStack(EmotionBlocks.emoNewLog, 1, 1) || stack == new ItemStack(EmotionBlocks.emoNewLog, 1, 2))
			player.addStat(AchievementList.MINE_WOOD);

		if (item == EmotionItems.FISH_TROUT_RAW || item == EmotionItems.FISH_BASS_RAW || item == EmotionItems.FISH_SARDINE_RAW || item == EmotionItems.FISH_MACKEREL_RAW
				|| item == EmotionItems.FISH_WHITING_RAW)
			player.addStat(EmotionAchievement.EXTEND_FISH);

		if (item == EmotionItems.BUTTERFLY_PINK || item == EmotionItems.BUTTERFLY_GREEN || item == EmotionItems.BUTTERFLY_BLUE || item == EmotionItems.BUTTERFLY_CITRUS)
			player.addStat(EmotionAchievement.BUTTERFLY);
	}
}
