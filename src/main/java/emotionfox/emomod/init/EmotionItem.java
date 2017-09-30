package emotionfox.emomod.init;

import java.util.HashSet;

import emotionfox.emomod.entity.EntityNewBoat;
import emotionfox.emomod.items.ItemAmulet;
import emotionfox.emomod.items.ItemBag;
import emotionfox.emomod.items.ItemBalloon;
import emotionfox.emomod.items.ItemButterfly;
import emotionfox.emomod.items.ItemButterflyNet;
import emotionfox.emomod.items.ItemDreamStaff;
import emotionfox.emomod.items.ItemPurpuraBag;
import emotionfox.emomod.items.ItemRing;
import emotionfox.emomod.items.ItemSlice;
import emotionfox.emomod.items.ItemStaff;
import emotionfox.emomod.items.ItemViridisArmor;
import emotionfox.emomod.items.base.BaseAxe;
import emotionfox.emomod.items.base.BaseBandage;
import emotionfox.emomod.items.base.BaseBoat;
import emotionfox.emomod.items.base.BaseHoe;
import emotionfox.emomod.items.base.BaseItem;
import emotionfox.emomod.items.base.BaseJuice;
import emotionfox.emomod.items.base.BasePickaxe;
import emotionfox.emomod.items.base.BaseShovel;
import emotionfox.emomod.items.base.BaseSoup;
import emotionfox.emomod.items.base.BaseSword;
import emotionfox.emomod.util.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemBlockSpecial;
import net.minecraft.item.ItemDoor;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemSeeds;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.util.EnumHelper;

/**
 * @author EmotionFox
 */

public class EmotionItem
{
	public static final HashSet<Item> ITEMS = new HashSet<Item>();

	public static final ToolMaterial TOOL_MAT_PURPURA = EnumHelper.addToolMaterial("PURPURA", 4, 1750, 10.0F, 3.5F, 8);
	public static final ToolMaterial TOOL_MAT_FOSSIL = EnumHelper.addToolMaterial("FOSSIL", 1, 1300, 5.0F, 1.5F, 16);

	public static final ArmorMaterial ARMOR_MAT_VIRIDIS = EnumHelper.addArmorMaterial("VIRIDIS", "viridis", 40, new int[]
	{ 3, 7, 6, 3 }, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 15);

	public static final Item PURPURA_SHARD = new BaseItem().setCreativeTab(CreativeTabs.MATERIALS);
	public static final Item PURPURA_RING = new ItemRing().setCreativeTab(CreativeTabs.TOOLS);
	public static final Item PURPURA_RED_BALLOON = new ItemBalloon();
	public static final Item PURPURA_GREEN_BALLOON = new ItemBalloon();
	public static final Item PURPURA_BLUE_BALLOON = new ItemBalloon();

	public static final Item PURPURA_AXE = new BaseAxe(TOOL_MAT_PURPURA);
	public static final Item PURPURA_HOE = new BaseHoe(TOOL_MAT_PURPURA);
	public static final Item PURPURA_PICKAXE = new BasePickaxe(TOOL_MAT_PURPURA);
	public static final Item PURPURA_SHOVEL = new BaseShovel(TOOL_MAT_PURPURA);
	public static final Item PURPURA_SWORD = new BaseSword(TOOL_MAT_PURPURA);
	public static final Item PURPURA_BLUE_SWORD = new BaseSword(TOOL_MAT_PURPURA);
	public static final Item PURPURA_RED_SWORD = new BaseSword(TOOL_MAT_PURPURA);

	public static final Item BAG_PURPURA = new ItemPurpuraBag();

	public static final Item FOSSIL_AXE = new BaseAxe(TOOL_MAT_FOSSIL);
	public static final Item FOSSIL_HOE = new BaseHoe(TOOL_MAT_FOSSIL);
	public static final Item FOSSIL_PICKAXE = new BasePickaxe(TOOL_MAT_FOSSIL);
	public static final Item FOSSIL_SHOVEL = new BaseShovel(TOOL_MAT_FOSSIL);
	public static final Item FOSSIL_SWORD = new BaseSword(TOOL_MAT_FOSSIL);

	public static final Item VIRIDIS_CRISTAL = new BaseItem().setCreativeTab(CreativeTabs.MATERIALS);

	public static final Item VIRIDIS_HELMET = new ItemViridisArmor(5, EntityEquipmentSlot.HEAD).setCreativeTab(CreativeTabs.COMBAT);
	public static final Item VIRIDIS_CHESTPLATE = new ItemViridisArmor(5, EntityEquipmentSlot.CHEST).setCreativeTab(CreativeTabs.COMBAT);
	public static final Item VIRIDIS_LEGGINGS = new ItemViridisArmor(5, EntityEquipmentSlot.LEGS).setCreativeTab(CreativeTabs.COMBAT);
	public static final Item VIRIDIS_BOOTS = new ItemViridisArmor(5, EntityEquipmentSlot.FEET).setCreativeTab(CreativeTabs.COMBAT);

	public static final Item LUME_STONE = new BaseItem().setCreativeTab(CreativeTabs.MATERIALS);

	public static final Item FOSSIL = new BaseItem().setCreativeTab(CreativeTabs.MATERIALS);

	public static final Item STAFF_BLUE = new ItemStaff();
	public static final Item STAFF_GREEN = new ItemStaff();
	public static final Item STAFF_RED = new ItemStaff();
	public static final Item STAFF_WHITE = new ItemStaff();

	public static final Item STAFF_DREAM = new ItemDreamStaff().setMaxStackSize(1);
	public static final Item DREAM_STONE = new BaseItem().setCreativeTab(CreativeTabs.MATERIALS);

	public static final Item AMULET_BLUE = new ItemAmulet().setCreativeTab(CreativeTabs.TOOLS);
	public static final Item AMULET_BLUE_BROKEN = new BaseItem();
	public static final Item AMULET_GREEN = new ItemAmulet().setCreativeTab(CreativeTabs.TOOLS);
	public static final Item AMULET_GREEN_BROKEN = new BaseItem();
	public static final Item AMULET_RED = new ItemAmulet().setCreativeTab(CreativeTabs.TOOLS);
	public static final Item AMULET_RED_BROKEN = new BaseItem();
	public static final Item AMULET_WHITE = new ItemAmulet().setCreativeTab(CreativeTabs.TOOLS);
	public static final Item AMULET_WHITE_BROKEN = new BaseItem();

	public static final Item KNIFE = new BaseSword(ToolMaterial.WOOD).setCreativeTab(CreativeTabs.COMBAT);
	public static final Item HORN = new BaseItem().setCreativeTab(CreativeTabs.MISC);
	public static final Item BANDAGE = new BaseBandage(4.0f);

	public static final Item BUTTERFLY_NET = new ItemButterflyNet();
	public static final Item BUTTERFLY = new ItemButterfly();

	public static final Item FRUIT_PEAR = new ItemFood(3, false);
	public static final Item FRUIT_CHERRY = new ItemFood(2, false);
	public static final Item FRUIT_ORANGE = new ItemFood(5, false);
	public static final Item FRUIT_TOMATO = new ItemFood(4, false);

	public static final Item BERRY_BLUEBERRY = new ItemFood(2, false).setPotionEffect(new PotionEffect(Potion.getPotionById(9), 250, 0), 0.3F);
	public static final Item BERRY_REDCURRANT = new ItemFood(2, false).setPotionEffect(new PotionEffect(Potion.getPotionById(9), 250, 0), 0.3F);
	public static final Item BERRY_BLACKCURRANT = new ItemFood(2, false).setPotionEffect(new PotionEffect(Potion.getPotionById(9), 250, 0), 0.3F);
	public static final Item BERRY_STRAWBERRY = new ItemFood(3, false).setPotionEffect(new PotionEffect(Potion.getPotionById(9), 250, 0), 0.3F);
	public static final Item BERRY_STRAWBERRY_CHOCO = new ItemFood(6, false).setPotionEffect(new PotionEffect(Potion.getPotionById(9), 250, 0), 0.3F);
	public static final Item BERRY_DREAMCURRANT = new ItemFood(6, false).setPotionEffect(new PotionEffect(Potion.getPotionById(9), 250, 0), 0.3F);

	public static final Item SLICE = new ItemSlice();

	public static final Item BAG = new ItemBag();

	public static final Item SALAD_FRUIT = new BaseSoup(9);
	public static final Item SALAD_TOMATO = new BaseSoup(7);
	public static final Item SALAD_PUMPKIN = new BaseSoup(8);

	public static final Item SEED_PEAR = new ItemSeeds(EmotionBlock.PEAR_PLANT, Blocks.FARMLAND);
	public static final Item SEED_CHERRY = new ItemSeeds(EmotionBlock.CHERRY_PLANT, Blocks.FARMLAND);
	public static final Item SEED_ORANGE = new ItemSeeds(EmotionBlock.ORANGE_PLANT, Blocks.FARMLAND);
	public static final Item SEED_TOMATO = new ItemSeeds(EmotionBlock.TOMATO_PLANT, Blocks.FARMLAND);
	public static final Item SEED_APPLE = new ItemSeeds(EmotionBlock.APPLE_PLANT, Blocks.FARMLAND);

	public static final Item SPORE_MAGIC = new ItemSeeds(EmotionBlock.BLUE_PLANT, Blocks.FARMLAND);
	public static final Item SPORE_RED = new ItemSeeds(EmotionBlock.RED_PLANT, Blocks.FARMLAND);
	public static final Item SPORE_BROWN = new ItemSeeds(EmotionBlock.BROWN_PLANT, Blocks.FARMLAND);

//	public static final Item CAKE_CHOCO = new ItemBlockSpecial(EmotionBlock.CAKE_CHOCO).setMaxStackSize(1).setCreativeTab(CreativeTabs.FOOD);
//	public static final Item CAKE_FRUIT = new ItemBlockSpecial(EmotionBlock.CAKE_FRUIT).setMaxStackSize(1).setCreativeTab(CreativeTabs.FOOD);
//	public static final Item CAKE_TOFFEE = new ItemBlockSpecial(EmotionBlock.CAKE_TOFFEE).setMaxStackSize(1).setCreativeTab(CreativeTabs.FOOD);
//	public static final Item CAKE_STRAWBERRY = new ItemBlockSpecial(EmotionBlock.CAKE_STRAWBERRY).setMaxStackSize(1).setCreativeTab(CreativeTabs.FOOD);

	public static final Item SALT = new BaseItem().setCreativeTab(CreativeTabs.MATERIALS);
	public static final Item BOWL_GLASS = new BaseItem().setCreativeTab(CreativeTabs.MATERIALS);
	public static final Item JUICE_PEAR = new BaseJuice(5).setCreativeTab(CreativeTabs.FOOD);
	public static final Item JUICE_CHERRY = new BaseJuice(4).setCreativeTab(CreativeTabs.FOOD);
	public static final Item JUICE_ORANGE = new BaseJuice(7).setCreativeTab(CreativeTabs.FOOD);
	public static final Item JUICE_TOMATO = new BaseJuice(6).setCreativeTab(CreativeTabs.FOOD);
	public static final Item JUICE_APPLE = new BaseJuice(5).setCreativeTab(CreativeTabs.FOOD);

	public static final Item PIE_PEAR = new ItemFood(7, false).setCreativeTab(CreativeTabs.FOOD);
	public static final Item PIE_CHERRY = new ItemFood(6, false).setCreativeTab(CreativeTabs.FOOD);
	public static final Item PIE_ORANGE = new ItemFood(8, false).setCreativeTab(CreativeTabs.FOOD);
	public static final Item PIE_APPLE = new ItemFood(7, false).setCreativeTab(CreativeTabs.FOOD);
	public static final Item PIE_MELON = new ItemFood(8, false).setCreativeTab(CreativeTabs.FOOD);

	public static final Item MUFFIN_PEAR = new ItemFood(8, false).setCreativeTab(CreativeTabs.FOOD);
	public static final Item MUFFIN_CHERRY = new ItemFood(8, false).setCreativeTab(CreativeTabs.FOOD);
	public static final Item MUFFIN_ORANGE = new ItemFood(8, false).setCreativeTab(CreativeTabs.FOOD);
	public static final Item MUFFIN_APPLE = new ItemFood(8, false).setCreativeTab(CreativeTabs.FOOD);
	public static final Item MUFFIN_BLUEBERRY = new ItemFood(8, false).setCreativeTab(CreativeTabs.FOOD);
	public static final Item MUFFIN_REDCURRANT = new ItemFood(8, false).setCreativeTab(CreativeTabs.FOOD);
	public static final Item MUFFIN_BLACKCURRANT = new ItemFood(8, false).setCreativeTab(CreativeTabs.FOOD);
	public static final Item MUFFIN_STRAWBERRY = new ItemFood(8, false).setCreativeTab(CreativeTabs.FOOD);
	public static final Item MUFFIN_DREAMCURRANT = new ItemFood(10, false).setCreativeTab(CreativeTabs.FOOD);

	public static final Item TOFFEE_CUBE = new ItemFood(4, false).setCreativeTab(CreativeTabs.MATERIALS);
	public static final Item TOFFEE_APPLE = new ItemFood(6, false).setCreativeTab(CreativeTabs.FOOD).setMaxStackSize(1);

	public static final Item WILDBOAR_RAW = new ItemFood(4, true).setCreativeTab(CreativeTabs.FOOD);
	public static final Item WILDBOAR_COOKED = new ItemFood(10, false).setCreativeTab(CreativeTabs.FOOD);

	public static final Item FISH_TROUT_RAW = new ItemFood(2, false).setCreativeTab(CreativeTabs.FOOD);
	public static final Item FISH_BASS_RAW = new ItemFood(2, false).setCreativeTab(CreativeTabs.FOOD);
	public static final Item FISH_SARDINE_RAW = new ItemFood(2, false).setCreativeTab(CreativeTabs.FOOD);
	public static final Item FISH_MACKEREL_RAW = new ItemFood(2, false).setCreativeTab(CreativeTabs.FOOD);
	public static final Item FISH_WHITING_RAW = new ItemFood(2, false).setCreativeTab(CreativeTabs.FOOD);

	public static final Item FISH_TROUT_COOKED = new ItemFood(6, false).setCreativeTab(CreativeTabs.FOOD);
	public static final Item FISH_BASS_COOKED = new ItemFood(6, false).setCreativeTab(CreativeTabs.FOOD);
	public static final Item FISH_SARDINE_COOKED = new ItemFood(6, false).setCreativeTab(CreativeTabs.FOOD);
	public static final Item FISH_MACKEREL_COOKED = new ItemFood(6, false).setCreativeTab(CreativeTabs.FOOD);
	public static final Item FISH_WHITING_COOKED = new ItemFood(6, false).setCreativeTab(CreativeTabs.FOOD);

	public static final Item FISH_GOLDEN = new BaseItem().setCreativeTab(CreativeTabs.FOOD);
	public static final Item FISH_DIAMOND = new BaseItem().setCreativeTab(CreativeTabs.FOOD);

	public static final Item TERRACOTTA_CUBE = new BaseItem().setCreativeTab(CreativeTabs.MATERIALS);

	public static final Item CHERRY_BOAT = new BaseBoat(EntityNewBoat.Type.CHERRY);
	public static final Item PEAR_BOAT = new BaseBoat(EntityNewBoat.Type.PEAR);
	public static final Item ORANGE_BOAT = new BaseBoat(EntityNewBoat.Type.ORANGE);
	public static final Item ATLAS_BOAT = new BaseBoat(EntityNewBoat.Type.ATLAS);

	public static final Item PINE_BOAT = new BaseBoat(EntityNewBoat.Type.PINE);
	public static final Item COCO_BOAT = new BaseBoat(EntityNewBoat.Type.COCO);
	public static final Item DREAM_BOAT = new BaseBoat(EntityNewBoat.Type.DREAM);

	public static void mainRegister()
	{
		addItem(PURPURA_SHARD, "purpura_shard");
		addItem(PURPURA_RING, "purpura_ring");
		addItem(PURPURA_RED_BALLOON, "purpura_red_balloon");
		addItem(PURPURA_GREEN_BALLOON, "purpura_green_balloon");
		addItem(PURPURA_BLUE_BALLOON, "purpura_blue_balloon");

		addItem(PURPURA_AXE, "purpura_axe");
		addItem(PURPURA_HOE, "purpura_hoe");
		addItem(PURPURA_PICKAXE, "purpura_pickaxe");
		addItem(PURPURA_SHOVEL, "purpura_shovel");
		addItem(PURPURA_SWORD, "purpura_sword");
		addItem(PURPURA_BLUE_SWORD, "purpura_blue_sword");
		addItem(PURPURA_RED_SWORD, "purpura_red_sword");

		addItem(BAG_PURPURA, "bag_purpura");

		addItem(FOSSIL_AXE, "fossil_axe");
		addItem(FOSSIL_HOE, "fossil_hoe");
		addItem(FOSSIL_PICKAXE, "fossil_pickaxe");
		addItem(FOSSIL_SHOVEL, "fossil_shovel");
		addItem(FOSSIL_SWORD, "fossil_sword");

		addItem(VIRIDIS_CRISTAL, "viridis_cristal_item");

		addItem(VIRIDIS_HELMET, "viridis_helmet");
		addItem(VIRIDIS_CHESTPLATE, "viridis_chestplate");
		addItem(VIRIDIS_LEGGINGS, "viridis_leggings");
		addItem(VIRIDIS_BOOTS, "viridis_boots");

		addItem(LUME_STONE, "lume_stone");

		addItem(FOSSIL, "fossil");

		addItem(SPORE_MAGIC, "spore_magic");
		addItem(SPORE_RED, "spore_red");
		addItem(SPORE_BROWN, "spore_brown");

//		addItem(CAKE_CHOCO, "cake_choco");
//		addItem(CAKE_FRUIT, "cake_fruit");
//		addItem(CAKE_TOFFEE, "cake_toffee");
//		addItem(CAKE_STRAWBERRY, "cake_strawberry");

		addItem(STAFF_BLUE, "staff_blue");
		addItem(STAFF_GREEN, "staff_green");
		addItem(STAFF_RED, "staff_red");
		addItem(STAFF_WHITE, "staff_white");

		addItem(STAFF_DREAM, "dream_staff");
		addItem(DREAM_STONE, "dream_stone");

		addItem(AMULET_BLUE, "amulet_blue");
		addItem(AMULET_BLUE_BROKEN, "amulet_blue_broken");
		addItem(AMULET_GREEN, "amulet_green");
		addItem(AMULET_GREEN_BROKEN, "amulet_green_broken");
		addItem(AMULET_RED, "amulet_red");
		addItem(AMULET_RED_BROKEN, "amulet_red_broken");
		addItem(AMULET_WHITE, "amulet_white");
		addItem(AMULET_WHITE_BROKEN, "amulet_white_broken");

		addItem(KNIFE, "knife");
		addItem(HORN, "horn");
		addItem(BANDAGE, "bandage");

		addItem(BUTTERFLY_NET, "butterfly_net");
		addItem(BUTTERFLY, "butterfly");

		addItem(FRUIT_PEAR, "fruit_pear");
		addItem(FRUIT_CHERRY, "fruit_cherry");
		addItem(FRUIT_ORANGE, "fruit_orange");
		addItem(FRUIT_TOMATO, "fruit_tomato");

		addItem(BERRY_BLUEBERRY, "berry_blueberry");
		addItem(BERRY_REDCURRANT, "berry_redcurrant");
		addItem(BERRY_BLACKCURRANT, "berry_blackcurrant");
		addItem(BERRY_STRAWBERRY, "berry_strawberry");
		addItem(BERRY_STRAWBERRY_CHOCO, "berry_strawberry_choco");
		addItem(BERRY_DREAMCURRANT, "berry_dreamcurrant");

		addItem(SLICE, "slice");

		addItem(BAG, "bag");

		addItem(SALAD_FRUIT, "salad_fruit");
		addItem(SALAD_TOMATO, "salad_tomato");
		addItem(SALAD_PUMPKIN, "salad_pumpkin");

		addItem(SEED_PEAR, "seed_pear");
		addItem(SEED_CHERRY, "seed_cherry");
		addItem(SEED_ORANGE, "seed_orange");
		addItem(SEED_TOMATO, "seed_tomato");
		addItem(SEED_APPLE, "seed_apple");

		addItem(SALT, "salt");

		addItem(BOWL_GLASS, "bowl_glass");

		addItem(JUICE_PEAR, "juice_pear");
		addItem(JUICE_CHERRY, "juice_cherry");
		addItem(JUICE_ORANGE, "juice_orange");
		addItem(JUICE_TOMATO, "juice_tomato");
		addItem(JUICE_APPLE, "juice_apple");

		addItem(PIE_PEAR, "pie_pear");
		addItem(PIE_CHERRY, "pie_cherry");
		addItem(PIE_ORANGE, "pie_orange");
		addItem(PIE_APPLE, "pie_apple");
		addItem(PIE_MELON, "pie_melon");

		addItem(MUFFIN_PEAR, "muffin_pear");
		addItem(MUFFIN_CHERRY, "muffin_cherry");
		addItem(MUFFIN_ORANGE, "muffin_orange");
		addItem(MUFFIN_APPLE, "muffin_apple");
		addItem(MUFFIN_BLUEBERRY, "muffin_blueberry");
		addItem(MUFFIN_REDCURRANT, "muffin_redcurrant");
		addItem(MUFFIN_BLACKCURRANT, "muffin_blackcurrant");
		addItem(MUFFIN_STRAWBERRY, "muffin_strawberry");
		addItem(MUFFIN_DREAMCURRANT, "muffin_dreamcurrant");

		addItem(TOFFEE_CUBE, "toffee_cube");
		addItem(TOFFEE_APPLE, "toffee_apple");

		addItem(WILDBOAR_RAW, "wildboar_raw");
		addItem(WILDBOAR_COOKED, "wildboar_cooked");

		addItem(FISH_TROUT_RAW, "fish_trout_raw");
		addItem(FISH_BASS_RAW, "fish_bass_raw");
		addItem(FISH_SARDINE_RAW, "fish_sardine_raw");
		addItem(FISH_MACKEREL_RAW, "fish_mackerel_raw");
		addItem(FISH_WHITING_RAW, "fish_whiting_raw");

		addItem(FISH_TROUT_COOKED, "fish_trout_cooked");
		addItem(FISH_BASS_COOKED, "fish_bass_cooked");
		addItem(FISH_SARDINE_COOKED, "fish_sardine_cooked");
		addItem(FISH_MACKEREL_COOKED, "fish_mackerel_cooked");
		addItem(FISH_WHITING_COOKED, "fish_whiting_cooked");

		addItem(FISH_GOLDEN, "fish_golden");
		addItem(FISH_DIAMOND, "fish_diamond");

		addItem(TERRACOTTA_CUBE, "terracotta_cube");

		addItem(CHERRY_BOAT, "cherry_boat");
		addItem(PEAR_BOAT, "pear_boat");
		addItem(ORANGE_BOAT, "orange_boat");
		addItem(ATLAS_BOAT, "atlas_boat");

		addItem(PINE_BOAT, "pine_boat");
		addItem(COCO_BOAT, "coco_boat");
		addItem(DREAM_BOAT, "dream_boat");
	}

	/**
	 * Adding item.
	 * 
	 * @param item
	 * @param name
	 */
	private static final void addItem(Item item, String name)
	{
		item.setUnlocalizedName(name);
		item.setRegistryName(new ResourceLocation(Reference.MOD_ID, name));
		ITEMS.add(item);
	}

	/**
	 * Get all items added.
	 * 
	 * @return Item[]
	 */
	public static final Item[] getItems()
	{
		final Item[] items = new Item[ITEMS.size()];
		int i = 0;

		for (Item item : ITEMS)
		{
			items[i] = item;
			i++;
		}

		return items;
	}
}
