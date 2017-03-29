package emotionfox.emomod.handler;

import java.util.HashSet;
import java.util.Set;

import emotionfox.emomod.util.Reference;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.LootTableList;

public class EmotionLootTableHandler
{
	public static final ResourceLocation LOOT_TABLE_FISH = LootTableHandler.create("loot_table_fish");
	public static final ResourceLocation LOOT_TABLE_TREASURE = LootTableHandler.create("loot_table_treasure");
	
	public static void init()
	{
		LootTableHandler.LOOT_TABLES.forEach(LootTableList::register);
	}

	public static class LootTableHandler
	{
		private static final Set<ResourceLocation> LOOT_TABLES = new HashSet<>();

		protected static ResourceLocation create(String id)
		{
			final ResourceLocation lootTable = new ResourceLocation(Reference.MOD_ID, id);
			LootTableHandler.LOOT_TABLES.add(lootTable);
			return lootTable;
		}
	}
}
