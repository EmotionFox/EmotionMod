package emotionfox.emomod.achievement;

import emotionfox.emomod.init.EmotionItems;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.Achievement;
import net.minecraftforge.common.AchievementPage;

public class EmotionAchievement
{
	public static Achievement FOSSIL;
	public static Achievement MINE_PURPURA;
	public static Achievement AMULET;
	public static Achievement STAFF;
	public static Achievement PURPURA;

	public static Achievement EXTEND_CAKE;
	public static Achievement EXTEND_PIE;
	public static Achievement SWEET_JUICE;
	public static Achievement FRUIT_TOAST;
	
	public static Achievement EXTEND_FISH;
	public static Achievement EXTEND_COOKED_FISH;
	
	public static Achievement BUTTERFLY;

	public static void mainRegister()
	{
		FOSSIL = (new Achievement("achievement.fossil", "fossil", -2, 0, new ItemStack(EmotionItems.FOSSIL_PICKAXE), (Achievement) null)).registerStat();
		MINE_PURPURA = (new Achievement("achievement.minePurpura", "minePurpura", 0, 0, new ItemStack(EmotionItems.PURPURA_SHARD), FOSSIL)).initIndependentStat().registerStat();
		AMULET = (new Achievement("achievement.amulet", "amulet", 2, -2, new ItemStack(EmotionItems.AMULET_GREEN), MINE_PURPURA)).registerStat();
		STAFF = (new Achievement("achievement.staff", "staff", 2, -4, new ItemStack(EmotionItems.STAFF_RED), AMULET)).registerStat();
		PURPURA = (new Achievement("achievement.purpura", "purpura", 4, -2, new ItemStack(EmotionItems.PURPURA_PICKAXE), AMULET)).setSpecial().registerStat();

		EXTEND_CAKE = (new Achievement("achievement.extendCake", "extendCake", 2, 0, new ItemStack(EmotionItems.CAKE_TOFFEE), (Achievement) null)).initIndependentStat().registerStat();
		EXTEND_PIE = (new Achievement("achievement.extendPie", "extendPie", 4, 2, new ItemStack(EmotionItems.PIE_ORANGE), EXTEND_CAKE)).registerStat();
		SWEET_JUICE = (new Achievement("achievement.sweetJuice", "sweetJuice", 6, 2, new ItemStack(EmotionItems.JUICE_CHERRY), EXTEND_PIE)).setSpecial().registerStat();
		FRUIT_TOAST = (new Achievement("achievement.fruitToast", "fruitToast", 4, 0, new ItemStack(EmotionItems.SLICE_APPLE), EXTEND_PIE)).setSpecial().registerStat();
		
		EXTEND_FISH = (new Achievement("achievement.extendFish", "extendFish", 0, 2, new ItemStack(EmotionItems.FISH_BASS_RAW), (Achievement) null)).initIndependentStat().registerStat();
		EXTEND_COOKED_FISH = (new Achievement("achievement.extendCookedFish", "extendCookedFish", -2, 2, new ItemStack(EmotionItems.FISH_BASS_COOKED), EXTEND_FISH)).registerStat();

		BUTTERFLY = (new Achievement("achievement.butterfly", "butterfly", -2, -2, new ItemStack(EmotionItems.BUTTERFLY_BLUE), (Achievement) null)).initIndependentStat().registerStat();
		
		AchievementPage.registerAchievementPage(new AchievementPage("Emotion's Mod", new Achievement[]
		{ FOSSIL, MINE_PURPURA, AMULET, STAFF, PURPURA, EXTEND_CAKE, EXTEND_PIE, SWEET_JUICE, FRUIT_TOAST, EXTEND_FISH, EXTEND_COOKED_FISH, BUTTERFLY }));
	}
}
