package emotionfox.emomod.init;

import emotionfox.emomod.entity.EntityNewBoat;
import emotionfox.emomod.items.DreamStaff;
import emotionfox.emomod.items.PurpuraAmulet;
import emotionfox.emomod.items.PurpuraBag;
import emotionfox.emomod.items.PurpuraBalloon;
import emotionfox.emomod.items.PurpuraRing;
import emotionfox.emomod.items.PurpuraStaff;
import emotionfox.emomod.items.ViridisArmor;
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
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
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
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class EmotionItems
{
	public static ToolMaterial TOOL_MAT_PURPURA = EnumHelper.addToolMaterial("PURPURA", 4, 1750, 10.0F, 3.5F, 8);
	public static ToolMaterial TOOL_MAT_FOSSIL = EnumHelper.addToolMaterial("FOSSIL", 1, 1300, 5.0F, 1.5F, 16);
	public static ArmorMaterial ARMOR_MAT_VIRIDIS = EnumHelper.addArmorMaterial("VIRIDIS", "viridis", 40, new int[]
	{ 3, 7, 6, 3 }, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 15);

	public static Item PURPURA_SHARD = new BaseItem().setCreativeTab(CreativeTabs.MATERIALS);
	public static Item PURPURA_RING = new PurpuraRing().setCreativeTab(CreativeTabs.TOOLS);
	public static Item PURPURA_RED_BALLOON = new PurpuraBalloon();
	public static Item PURPURA_GREEN_BALLOON = new PurpuraBalloon();
	public static Item PURPURA_BLUE_BALLOON = new PurpuraBalloon();

	public static Item PURPURA_AXE = new BaseAxe(TOOL_MAT_PURPURA);
	public static Item PURPURA_HOE = new BaseHoe(TOOL_MAT_PURPURA);
	public static Item PURPURA_PICKAXE = new BasePickaxe(TOOL_MAT_PURPURA);
	public static Item PURPURA_SHOVEL = new BaseShovel(TOOL_MAT_PURPURA);
	public static Item PURPURA_SWORD = new BaseSword(TOOL_MAT_PURPURA);
	public static Item PURPURA_BLUE_SWORD = new BaseSword(TOOL_MAT_PURPURA);
	public static Item PURPURA_RED_SWORD = new BaseSword(TOOL_MAT_PURPURA);

	public static Item FOSSIL_AXE = new BaseAxe(TOOL_MAT_FOSSIL);
	public static Item FOSSIL_HOE = new BaseHoe(TOOL_MAT_FOSSIL);
	public static Item FOSSIL_PICKAXE = new BasePickaxe(TOOL_MAT_FOSSIL);
	public static Item FOSSIL_SHOVEL = new BaseShovel(TOOL_MAT_FOSSIL);
	public static Item FOSSIL_SWORD = new BaseSword(TOOL_MAT_FOSSIL);

	public static Item VIRIDIS_CRISTAL = new BaseItem().setCreativeTab(CreativeTabs.MATERIALS);

	public static Item VIRIDIS_HELMET = new ViridisArmor(5, EntityEquipmentSlot.HEAD).setCreativeTab(CreativeTabs.COMBAT);
	public static Item VIRIDIS_CHESTPLATE = new ViridisArmor(5, EntityEquipmentSlot.CHEST).setCreativeTab(CreativeTabs.COMBAT);
	public static Item VIRIDIS_LEGGINGS = new ViridisArmor(5, EntityEquipmentSlot.LEGS).setCreativeTab(CreativeTabs.COMBAT);
	public static Item VIRIDIS_BOOTS = new ViridisArmor(5, EntityEquipmentSlot.FEET).setCreativeTab(CreativeTabs.COMBAT);

	public static Item LUME_STONE = new BaseItem().setCreativeTab(CreativeTabs.MATERIALS);

	public static Item FOSSIL = new BaseItem().setCreativeTab(CreativeTabs.MATERIALS);

	public static Item STAFF_BLUE = new PurpuraStaff();
	public static Item STAFF_GREEN = new PurpuraStaff();
	public static Item STAFF_RED = new PurpuraStaff();
	public static Item STAFF_WHITE = new PurpuraStaff();

	public static Item STAFF_DREAM = new DreamStaff().setMaxStackSize(1);
	public static Item DREAM_STONE = new BaseItem().setCreativeTab(CreativeTabs.MATERIALS);

	public static Item AMULET_BLUE = new PurpuraAmulet().setCreativeTab(CreativeTabs.TOOLS);
	public static Item AMULET_BLUE_BROKEN = new BaseItem();
	public static Item AMULET_GREEN = new PurpuraAmulet().setCreativeTab(CreativeTabs.TOOLS);
	public static Item AMULET_GREEN_BROKEN = new BaseItem();
	public static Item AMULET_RED = new PurpuraAmulet().setCreativeTab(CreativeTabs.TOOLS);
	public static Item AMULET_RED_BROKEN = new BaseItem();
	public static Item AMULET_WHITE = new PurpuraAmulet().setCreativeTab(CreativeTabs.TOOLS);
	public static Item AMULET_WHITE_BROKEN = new BaseItem();

	public static Item KNIFE = new BaseSword(ToolMaterial.WOOD).setCreativeTab(CreativeTabs.COMBAT);
	public static Item HORN = new BaseItem().setCreativeTab(CreativeTabs.MISC);
	public static Item BANDAGE = new BaseBandage(4.0f);

	public static Item BUTTERFLY_NET = new BaseItem().setCreativeTab(CreativeTabs.TOOLS);
	public static Item BUTTERFLY_GREEN = new BaseItem().setCreativeTab(CreativeTabs.MISC);
	public static Item BUTTERFLY_PINK = new BaseItem().setCreativeTab(CreativeTabs.MISC);
	public static Item BUTTERFLY_BLUE = new BaseItem().setCreativeTab(CreativeTabs.MISC);
	public static Item BUTTERFLY_FLAME = new BaseItem().setCreativeTab(CreativeTabs.MISC);

	public static Item FRUIT_PEAR = new ItemFood(3, false);
	public static Item FRUIT_CHERRY = new ItemFood(2, false);
	public static Item FRUIT_ORANGE = new ItemFood(5, false);
	public static Item FRUIT_TOMATO = new ItemFood(4, false);

	public static Item BERRY_BLUEBERRY = new ItemFood(2, false).setPotionEffect(new PotionEffect(Potion.getPotionById(9), 250, 0), 0.3F);
	public static Item BERRY_REDCURRANT = new ItemFood(2, false).setPotionEffect(new PotionEffect(Potion.getPotionById(9), 250, 0), 0.3F);
	public static Item BERRY_BLACKCURRANT = new ItemFood(2, false).setPotionEffect(new PotionEffect(Potion.getPotionById(9), 250, 0), 0.3F);
	public static Item BERRY_STRAWBERRY = new ItemFood(3, false).setPotionEffect(new PotionEffect(Potion.getPotionById(9), 250, 0), 0.3F);
	public static Item BERRY_STRAWBERRY_CHOCO = new ItemFood(6, false).setPotionEffect(new PotionEffect(Potion.getPotionById(9), 250, 0), 0.3F);
	public static Item BERRY_DREAMCURRANT = new ItemFood(6, false).setPotionEffect(new PotionEffect(Potion.getPotionById(9), 250, 0), 0.3F);

	public static Item SLICE_APPLE = new ItemFood(6, false);
	public static Item SLICE_BLACKCURRANT = new ItemFood(6, false);
	public static Item SLICE_BLUEBERRY = new ItemFood(6, false);
	public static Item SLICE_CHERRY = new ItemFood(6, false);
	public static Item SLICE_CHOCOLATE = new ItemFood(6, false);
	public static Item SLICE_ORANGE = new ItemFood(6, false);
	public static Item SLICE_PEAR = new ItemFood(6, false);
	public static Item SLICE_REDCURRANT = new ItemFood(6, false);
	public static Item SLICE_STRAWBERRY = new ItemFood(6, false);
	public static Item SLICE_DREAMCURRANT = new ItemFood(8, false);
	public static Item SLICE_BREAD = new ItemFood(2, false);

	public static Item BAG_PEAR = new BaseItem().setCreativeTab(CreativeTabs.FOOD).setMaxStackSize(32);
	public static Item BAG_CHERRY = new BaseItem().setCreativeTab(CreativeTabs.FOOD).setMaxStackSize(32);
	public static Item BAG_ORANGE = new BaseItem().setCreativeTab(CreativeTabs.FOOD).setMaxStackSize(32);
	public static Item BAG_TOMATO = new BaseItem().setCreativeTab(CreativeTabs.FOOD).setMaxStackSize(32);
	public static Item BAG_APPLE = new BaseItem().setCreativeTab(CreativeTabs.FOOD).setMaxStackSize(32);

	public static Item SALAD_FRUIT = new BaseSoup(9);
	public static Item SALAD_TOMATO = new BaseSoup(7);
	public static Item SALAD_PUMPKIN = new BaseSoup(8);

	public static Item SEED_PEAR = new ItemSeeds(EmotionBlocks.pearPlant, Blocks.FARMLAND);
	public static Item SEED_CHERRY = new ItemSeeds(EmotionBlocks.cherryPlant, Blocks.FARMLAND);
	public static Item SEED_ORANGE = new ItemSeeds(EmotionBlocks.orangePlant, Blocks.FARMLAND);
	public static Item SEED_TOMATO = new ItemSeeds(EmotionBlocks.tomatoPlant, Blocks.FARMLAND);
	public static Item SEED_APPLE = new ItemSeeds(EmotionBlocks.applePlant, Blocks.FARMLAND);

	public static Item SPORE_MAGIC = new ItemSeeds(EmotionBlocks.bluePlant, Blocks.FARMLAND);
	public static Item SPORE_RED = new ItemSeeds(EmotionBlocks.redPlant, Blocks.FARMLAND);
	public static Item SPORE_BROWN = new ItemSeeds(EmotionBlocks.brownPlant, Blocks.FARMLAND);

	public static Item CAKE_CHOCO = new ItemBlockSpecial(EmotionBlocks.cakeChoco).setMaxStackSize(1).setCreativeTab(CreativeTabs.FOOD);
	public static Item CAKE_FRUIT = new ItemBlockSpecial(EmotionBlocks.cakeFruit).setMaxStackSize(1).setCreativeTab(CreativeTabs.FOOD);
	public static Item CAKE_TOFFEE = new ItemBlockSpecial(EmotionBlocks.cakeToffee).setMaxStackSize(1).setCreativeTab(CreativeTabs.FOOD);
	public static Item CAKE_STRAWBERRY = new ItemBlockSpecial(EmotionBlocks.cakeStrawberry).setMaxStackSize(1).setCreativeTab(CreativeTabs.FOOD);

	public static Item SALT = new BaseItem().setCreativeTab(CreativeTabs.MATERIALS);
	public static Item BOWL_GLASS = new BaseItem().setCreativeTab(CreativeTabs.MATERIALS);
	public static Item JUICE_PEAR = new BaseJuice(5).setCreativeTab(CreativeTabs.FOOD);
	public static Item JUICE_CHERRY = new BaseJuice(4).setCreativeTab(CreativeTabs.FOOD);
	public static Item JUICE_ORANGE = new BaseJuice(7).setCreativeTab(CreativeTabs.FOOD);
	public static Item JUICE_TOMATO = new BaseJuice(6).setCreativeTab(CreativeTabs.FOOD);
	public static Item JUICE_APPLE = new BaseJuice(5).setCreativeTab(CreativeTabs.FOOD);

	public static Item PIE_PEAR = new ItemFood(7, false).setCreativeTab(CreativeTabs.FOOD);
	public static Item PIE_CHERRY = new ItemFood(6, false).setCreativeTab(CreativeTabs.FOOD);
	public static Item PIE_ORANGE = new ItemFood(8, false).setCreativeTab(CreativeTabs.FOOD);
	public static Item PIE_APPLE = new ItemFood(7, false).setCreativeTab(CreativeTabs.FOOD);
	public static Item PIE_MELON = new ItemFood(8, false).setCreativeTab(CreativeTabs.FOOD);

	public static Item MUFFIN_PEAR = new ItemFood(8, false).setCreativeTab(CreativeTabs.FOOD);
	public static Item MUFFIN_CHERRY = new ItemFood(8, false).setCreativeTab(CreativeTabs.FOOD);
	public static Item MUFFIN_ORANGE = new ItemFood(8, false).setCreativeTab(CreativeTabs.FOOD);
	public static Item MUFFIN_APPLE = new ItemFood(8, false).setCreativeTab(CreativeTabs.FOOD);
	public static Item MUFFIN_BLUEBERRY = new ItemFood(8, false).setCreativeTab(CreativeTabs.FOOD);
	public static Item MUFFIN_REDCURRANT = new ItemFood(8, false).setCreativeTab(CreativeTabs.FOOD);
	public static Item MUFFIN_BLACKCURRANT = new ItemFood(8, false).setCreativeTab(CreativeTabs.FOOD);
	public static Item MUFFIN_STRAWBERRY = new ItemFood(8, false).setCreativeTab(CreativeTabs.FOOD);
	public static Item MUFFIN_DREAMCURRANT = new ItemFood(10, false).setCreativeTab(CreativeTabs.FOOD);

	public static Item TOFFEE_CUBE = new ItemFood(4, false).setCreativeTab(CreativeTabs.MATERIALS);
	public static Item TOFFEE_APPLE = new ItemFood(6, false).setCreativeTab(CreativeTabs.FOOD).setMaxStackSize(1);

	public static Item WILDBOAR_RAW = new ItemFood(4, true).setCreativeTab(CreativeTabs.FOOD);
	public static Item WILDBOAR_COOKED = new ItemFood(10, false).setCreativeTab(CreativeTabs.FOOD);

	public static Item FISH_TROUT_RAW = new ItemFood(2, false).setCreativeTab(CreativeTabs.FOOD);
	public static Item FISH_BASS_RAW = new ItemFood(2, false).setCreativeTab(CreativeTabs.FOOD);
	public static Item FISH_SARDINE_RAW = new ItemFood(2, false).setCreativeTab(CreativeTabs.FOOD);
	public static Item FISH_MACKEREL_RAW = new ItemFood(2, false).setCreativeTab(CreativeTabs.FOOD);
	public static Item FISH_WHITING_RAW = new ItemFood(2, false).setCreativeTab(CreativeTabs.FOOD);

	public static Item FISH_TROUT_COOKED = new ItemFood(6, false).setCreativeTab(CreativeTabs.FOOD);
	public static Item FISH_BASS_COOKED = new ItemFood(6, false).setCreativeTab(CreativeTabs.FOOD);
	public static Item FISH_SARDINE_COOKED = new ItemFood(6, false).setCreativeTab(CreativeTabs.FOOD);
	public static Item FISH_MACKEREL_COOKED = new ItemFood(6, false).setCreativeTab(CreativeTabs.FOOD);
	public static Item FISH_WHITING_COOKED = new ItemFood(6, false).setCreativeTab(CreativeTabs.FOOD);

	public static Item FISH_GOLDEN = new BaseItem().setCreativeTab(CreativeTabs.FOOD);
	public static Item FISH_DIAMOND = new BaseItem().setCreativeTab(CreativeTabs.FOOD);

	public static Item PURPURA_BAG = new PurpuraBag();

	public static Item TERRACOTTA_CUBE = new BaseItem().setCreativeTab(CreativeTabs.MATERIALS);

	public static Item CHERRY_BOAT = new BaseBoat(EntityNewBoat.Type.CHERRY);
	public static Item CHERRY_DOOR = new ItemDoor(EmotionBlocks.cherryDoor);
	public static Item PEAR_BOAT = new BaseBoat(EntityNewBoat.Type.PEAR);
	public static Item PEAR_DOOR = new ItemDoor(EmotionBlocks.pearDoor);
	public static Item ORANGE_BOAT = new BaseBoat(EntityNewBoat.Type.ORANGE);
	public static Item ORANGE_DOOR = new ItemDoor(EmotionBlocks.orangeDoor);
	public static Item ATLAS_BOAT = new BaseBoat(EntityNewBoat.Type.ATLAS);
	public static Item ATLAS_DOOR = new ItemDoor(EmotionBlocks.atlasDoor);

	public static Item PINE_BOAT = new BaseBoat(EntityNewBoat.Type.PINE);
	public static Item PINE_DOOR = new ItemDoor(EmotionBlocks.pineDoor);
	public static Item COCO_BOAT = new BaseBoat(EntityNewBoat.Type.COCO);
	public static Item COCO_DOOR = new ItemDoor(EmotionBlocks.cocoDoor);
	public static Item DREAM_BOAT = new BaseBoat(EntityNewBoat.Type.DREAM);
	public static Item DREAM_DOOR = new ItemDoor(EmotionBlocks.dreamDoor);

	public static void mainRegister()
	{
		registerItem(PURPURA_SHARD, "purpura_shard", "PurpuraShard");
		registerItem(PURPURA_RING, "purpura_ring", "PurpuraRing");
		registerItem(PURPURA_RED_BALLOON, "purpura_red_balloon", "PurpuraRedBalloon");
		registerItem(PURPURA_GREEN_BALLOON, "purpura_green_balloon", "PurpuraGreenBalloon");
		registerItem(PURPURA_BLUE_BALLOON, "purpura_blue_balloon", "PurpuraBlueBalloon");

		registerItem(PURPURA_AXE, "purpura_axe", "PurpuraAxe");
		registerItem(PURPURA_HOE, "purpura_hoe", "PurpuraHoe");
		registerItem(PURPURA_PICKAXE, "purpura_pickaxe", "PurpuraPickaxe");
		registerItem(PURPURA_SHOVEL, "purpura_shovel", "PurpuraShovel");
		registerItem(PURPURA_SWORD, "purpura_sword", "PurpuraSword");
		registerItem(PURPURA_BLUE_SWORD, "purpura_blue_sword", "PurpuraBlueSword");
		registerItem(PURPURA_RED_SWORD, "purpura_red_sword", "PurpuraRedSword");

		registerItem(FOSSIL_AXE, "fossil_axe", "FossilAxe");
		registerItem(FOSSIL_HOE, "fossil_hoe", "FossilHoe");
		registerItem(FOSSIL_PICKAXE, "fossil_pickaxe", "FossilPickaxe");
		registerItem(FOSSIL_SHOVEL, "fossil_shovel", "FossilShovel");
		registerItem(FOSSIL_SWORD, "fossil_sword", "FossilSword");

		registerItem(VIRIDIS_CRISTAL, "viridis_cristal_item", "ViridisCristalItem");

		registerItem(VIRIDIS_HELMET, "viridis_helmet", "ViridisHelmet");
		registerItem(VIRIDIS_CHESTPLATE, "viridis_chestplate", "ViridisChestplate");
		registerItem(VIRIDIS_LEGGINGS, "viridis_leggings", "ViridisLeggings");
		registerItem(VIRIDIS_BOOTS, "viridis_boots", "ViridisBoots");

		registerItem(LUME_STONE, "lume_stone", "LumeStone");

		registerItem(FOSSIL, "fossil", "Fossil");

		registerItem(STAFF_BLUE, "staff_blue", "BlueStaff");
		registerItem(STAFF_GREEN, "staff_green", "GreenStaff");
		registerItem(STAFF_RED, "staff_red", "RedStaff");
		registerItem(STAFF_WHITE, "staff_white", "WhiteStaff");

		registerItem(STAFF_DREAM, "dream_staff", "DreamStaff");
		registerItem(DREAM_STONE, "dream_stone", "DreamStone");

		registerItem(AMULET_BLUE, "amulet_blue", "BlueAmulet");
		registerItem(AMULET_BLUE_BROKEN, "amulet_blue_broken", "BlueAmuletBroken");
		registerItem(AMULET_GREEN, "amulet_green", "GreenAmulet");
		registerItem(AMULET_GREEN_BROKEN, "amulet_green_broken", "GreenAmuletBroken");
		registerItem(AMULET_RED, "amulet_red", "RedAmulet");
		registerItem(AMULET_RED_BROKEN, "amulet_red_broken", "RedAmuletBroken");
		registerItem(AMULET_WHITE, "amulet_white", "WhiteAmulet");
		registerItem(AMULET_WHITE_BROKEN, "amulet_white_broken", "WhiteAmuletBroken");

		registerItem(KNIFE, "knife", "Knife");
		registerItem(HORN, "horn", "Horn");
		registerItem(BANDAGE, "bandage", "Bandage");

		registerItem(BUTTERFLY_NET, "butterfly_net", "ButterflyNet");
		registerItem(BUTTERFLY_GREEN, "butterfly_green", "ButterflyGreen");
		registerItem(BUTTERFLY_PINK, "butterfly_pink", "ButterflyPink");
		registerItem(BUTTERFLY_BLUE, "butterfly_blue", "ButterflyBlue");
		registerItem(BUTTERFLY_FLAME, "butterfly_flame", "ButterflyFlame");

		registerItem(FRUIT_PEAR, "fruit_pear", "PearFruit");
		registerItem(FRUIT_CHERRY, "fruit_cherry", "CherryFruit");
		registerItem(FRUIT_ORANGE, "fruit_orange", "OrangeFruit");
		registerItem(FRUIT_TOMATO, "fruit_tomato", "TomatoFruit");

		registerItem(BERRY_BLUEBERRY, "berry_blueberry", "Blueberry");
		registerItem(BERRY_REDCURRANT, "berry_redcurrant", "RedCurrant");
		registerItem(BERRY_BLACKCURRANT, "berry_blackcurrant", "BlackCurrant");
		registerItem(BERRY_STRAWBERRY, "berry_strawberry", "Strawberry");
		registerItem(BERRY_STRAWBERRY_CHOCO, "berry_strawberry_choco", "StrawberryChoco");
		registerItem(BERRY_DREAMCURRANT, "berry_dreamcurrant", "DreamCurrant");

		registerItem(SLICE_APPLE, "slice_apple", "AppleSlice");
		registerItem(SLICE_BLACKCURRANT, "slice_blackcurrant", "BlackCurrantSlice");
		registerItem(SLICE_BLUEBERRY, "slice_blueberry", "BlueberrySlice");
		registerItem(SLICE_CHERRY, "slice_cherry", "CherrySlice");
		registerItem(SLICE_CHOCOLATE, "slice_chocolate", "ChocolateSlice");
		registerItem(SLICE_ORANGE, "slice_orange", "OrangeSlice");
		registerItem(SLICE_PEAR, "slice_pear", "PearSlice");
		registerItem(SLICE_REDCURRANT, "slice_redcurrant", "RedCurrantSlice");
		registerItem(SLICE_STRAWBERRY, "slice_strawberry", "StrawberrySlice");
		registerItem(SLICE_DREAMCURRANT, "slice_dreamcurrant", "DreamCurrantSlice");

		registerItem(SLICE_BREAD, "slice_bread", "BreadSlice");

		registerItem(BAG_PEAR, "bag_pear", "PearBag");
		registerItem(BAG_CHERRY, "bag_cherry", "CherryBag");
		registerItem(BAG_ORANGE, "bag_orange", "OrangeBag");
		registerItem(BAG_TOMATO, "bag_tomato", "TomatoBag");
		registerItem(BAG_APPLE, "bag_apple", "AppleBag");

		registerItem(SALAD_FRUIT, "salad_fruit", "FruitSalad");
		registerItem(SALAD_TOMATO, "salad_tomato", "TomatoSalad");
		registerItem(SALAD_PUMPKIN, "salad_pumpkin", "PumpkinSalad");

		registerItem(SEED_PEAR, "seed_pear", "PearSeed");
		registerItem(SEED_CHERRY, "seed_cherry", "CherrySeed");
		registerItem(SEED_ORANGE, "seed_orange", "OrangeSeed");
		registerItem(SEED_TOMATO, "seed_tomato", "TomatoSeed");
		registerItem(SEED_APPLE, "seed_apple", "AppleSeed");

		registerItem(SPORE_MAGIC, "spore_magic", "SporeMagic");
		registerItem(SPORE_RED, "spore_red", "SporeRed");
		registerItem(SPORE_BROWN, "spore_brown", "SporeBrown");

		registerItem(CAKE_CHOCO, "cake_choco", "CakeChoco");
		registerItem(CAKE_FRUIT, "cake_fruit", "CakeFruit");
		registerItem(CAKE_TOFFEE, "cake_toffee", "CakeToffee");
		registerItem(CAKE_STRAWBERRY, "cake_strawberry", "CakeStrawberry");

		registerItem(SALT, "salt", "Salt");

		registerItem(BOWL_GLASS, "bowl_glass", "GlassBowl");

		registerItem(JUICE_PEAR, "juice_pear", "PearJuice");
		registerItem(JUICE_CHERRY, "juice_cherry", "CherryJuice");
		registerItem(JUICE_ORANGE, "juice_orange", "OrangeJuice");
		registerItem(JUICE_TOMATO, "juice_tomato", "TomatoJuice");
		registerItem(JUICE_APPLE, "juice_apple", "AppleJuice");

		registerItem(PIE_PEAR, "pie_pear", "PearPie");
		registerItem(PIE_CHERRY, "pie_cherry", "CherryPie");
		registerItem(PIE_ORANGE, "pie_orange", "OrangePie");
		registerItem(PIE_APPLE, "pie_apple", "ApplePie");
		registerItem(PIE_MELON, "pie_melon", "MelonPie");

		registerItem(MUFFIN_PEAR, "muffin_pear", "MuffinPear");
		registerItem(MUFFIN_CHERRY, "muffin_cherry", "MuffinCherry");
		registerItem(MUFFIN_ORANGE, "muffin_orange", "MuffinOrange");
		registerItem(MUFFIN_APPLE, "muffin_apple", "MuffinApple");
		registerItem(MUFFIN_BLUEBERRY, "muffin_blueberry", "MuffinBlueberry");
		registerItem(MUFFIN_REDCURRANT, "muffin_redcurrant", "MuffinRedCurrant");
		registerItem(MUFFIN_BLACKCURRANT, "muffin_blackcurrant", "MuffinBlackCurrant");
		registerItem(MUFFIN_STRAWBERRY, "muffin_strawberry", "MuffinStrawberry");
		registerItem(MUFFIN_DREAMCURRANT, "muffin_dreamcurrant", "MuffinDreamCurrant");

		registerItem(TOFFEE_CUBE, "toffee_cube", "ToffeeCube");
		registerItem(TOFFEE_APPLE, "toffee_apple", "ToffeeApple");

		registerItem(WILDBOAR_RAW, "wildboar_raw", "WildBoarRaw");
		registerItem(WILDBOAR_COOKED, "wildboar_cooked", "WildBoarCooked");

		registerItem(FISH_TROUT_RAW, "fish_trout_raw", "TroutRaw");
		registerItem(FISH_BASS_RAW, "fish_bass_raw", "BassRaw");
		registerItem(FISH_SARDINE_RAW, "fish_sardine_raw", "SardineRaw");
		registerItem(FISH_MACKEREL_RAW, "fish_mackerel_raw", "MackerelRaw");
		registerItem(FISH_WHITING_RAW, "fish_whiting_raw", "WhitingRaw");

		registerItem(FISH_TROUT_COOKED, "fish_trout_cooked", "TroutCooked");
		registerItem(FISH_BASS_COOKED, "fish_bass_cooked", "BassCooked");
		registerItem(FISH_SARDINE_COOKED, "fish_sardine_cooked", "SardineCooked");
		registerItem(FISH_MACKEREL_COOKED, "fish_mackerel_cooked", "MackerelCooked");
		registerItem(FISH_WHITING_COOKED, "fish_whiting_cooked", "WhitingCooked");

		registerItem(FISH_GOLDEN, "fish_golden", "FishGolden");
		registerItem(FISH_DIAMOND, "fish_diamond", "FishDiamond");

		registerItem(PURPURA_BAG, "bag_purpura", "PurpuraBag");

		registerItem(TERRACOTTA_CUBE, "terracotta_cube", "TerracottaCube");

		registerItem(CHERRY_BOAT, "cherry_boat", "CherryBoat");
		registerItem(CHERRY_DOOR, "cherry_door", "CherryDoor");
		registerItem(PEAR_BOAT, "pear_boat", "PearBoat");
		registerItem(PEAR_DOOR, "pear_door", "PearDoor");
		registerItem(ORANGE_BOAT, "orange_boat", "OrangeBoat");
		registerItem(ORANGE_DOOR, "orange_door", "OrangeDoor");
		registerItem(ATLAS_BOAT, "atlas_boat", "AtlasBoat");
		registerItem(ATLAS_DOOR, "atlas_door", "AtlasDoor");

		registerItem(PINE_BOAT, "pine_boat", "PineBoat");
		registerItem(PINE_DOOR, "pine_door", "PineDoor");
		registerItem(COCO_BOAT, "coco_boat", "CocoBoat");
		registerItem(COCO_DOOR, "coco_door", "CocoDoor");
		registerItem(DREAM_BOAT, "dream_boat", "DreamBoat");
		registerItem(DREAM_DOOR, "dream_door", "DreamDoor");
	}

	public static void registerItem(Item item, String registryName, String unlocalizedName)
	{
		item.setRegistryName(registryName);
		item.setUnlocalizedName(unlocalizedName);
		GameRegistry.register(item);
	}

	// Called by ClientProxy.class
	public static void registerRenders()
	{
		registerRenders(PURPURA_SHARD);
		registerRenders(PURPURA_RING);
		registerRenders(PURPURA_RED_BALLOON);
		registerRenders(PURPURA_GREEN_BALLOON);
		registerRenders(PURPURA_BLUE_BALLOON);

		registerRenders(PURPURA_AXE);
		registerRenders(PURPURA_HOE);
		registerRenders(PURPURA_PICKAXE);
		registerRenders(PURPURA_SHOVEL);
		registerRenders(PURPURA_SWORD);
		registerRenders(PURPURA_BLUE_SWORD);
		registerRenders(PURPURA_RED_SWORD);

		registerRenders(FOSSIL_AXE);
		registerRenders(FOSSIL_HOE);
		registerRenders(FOSSIL_PICKAXE);
		registerRenders(FOSSIL_SHOVEL);
		registerRenders(FOSSIL_SWORD);

		registerRenders(VIRIDIS_CRISTAL);

		registerRenders(VIRIDIS_HELMET);
		registerRenders(VIRIDIS_CHESTPLATE);
		registerRenders(VIRIDIS_LEGGINGS);
		registerRenders(VIRIDIS_BOOTS);

		registerRenders(LUME_STONE);

		registerRenders(FOSSIL);

		registerRenders(STAFF_BLUE);
		registerRenders(STAFF_GREEN);
		registerRenders(STAFF_RED);
		registerRenders(STAFF_WHITE);

		registerRenders(STAFF_DREAM);
		registerRenders(DREAM_STONE);

		registerRenders(AMULET_BLUE);
		registerRenders(AMULET_BLUE_BROKEN);
		registerRenders(AMULET_GREEN);
		registerRenders(AMULET_GREEN_BROKEN);
		registerRenders(AMULET_RED);
		registerRenders(AMULET_RED_BROKEN);
		registerRenders(AMULET_WHITE);
		registerRenders(AMULET_WHITE_BROKEN);

		registerRenders(KNIFE);
		registerRenders(HORN);
		registerRenders(BANDAGE);

		registerRenders(BUTTERFLY_NET);
		registerRenders(BUTTERFLY_GREEN);
		registerRenders(BUTTERFLY_PINK);
		registerRenders(BUTTERFLY_BLUE);
		registerRenders(BUTTERFLY_FLAME);

		registerRenders(FRUIT_PEAR);
		registerRenders(FRUIT_CHERRY);
		registerRenders(FRUIT_ORANGE);
		registerRenders(FRUIT_TOMATO);

		registerRenders(BERRY_BLUEBERRY);
		registerRenders(BERRY_REDCURRANT);
		registerRenders(BERRY_BLACKCURRANT);
		registerRenders(BERRY_STRAWBERRY);
		registerRenders(BERRY_STRAWBERRY_CHOCO);
		registerRenders(BERRY_DREAMCURRANT);

		registerRenders(SLICE_APPLE);
		registerRenders(SLICE_BLACKCURRANT);
		registerRenders(SLICE_BLUEBERRY);
		registerRenders(SLICE_CHERRY);
		registerRenders(SLICE_CHOCOLATE);
		registerRenders(SLICE_ORANGE);
		registerRenders(SLICE_PEAR);
		registerRenders(SLICE_REDCURRANT);
		registerRenders(SLICE_STRAWBERRY);
		registerRenders(SLICE_DREAMCURRANT);

		registerRenders(SLICE_BREAD);

		registerRenders(BAG_PEAR);
		registerRenders(BAG_CHERRY);
		registerRenders(BAG_ORANGE);
		registerRenders(BAG_TOMATO);
		registerRenders(BAG_APPLE);

		registerRenders(SALAD_FRUIT);
		registerRenders(SALAD_TOMATO);
		registerRenders(SALAD_PUMPKIN);

		registerRenders(SEED_PEAR);
		registerRenders(SEED_CHERRY);
		registerRenders(SEED_ORANGE);
		registerRenders(SEED_TOMATO);
		registerRenders(SEED_APPLE);

		registerRenders(SPORE_MAGIC);
		registerRenders(SPORE_RED);
		registerRenders(SPORE_BROWN);

		registerRenders(CAKE_CHOCO);
		registerRenders(CAKE_FRUIT);
		registerRenders(CAKE_TOFFEE);
		registerRenders(CAKE_STRAWBERRY);

		registerRenders(SALT);

		registerRenders(BOWL_GLASS);

		registerRenders(JUICE_PEAR);
		registerRenders(JUICE_CHERRY);
		registerRenders(JUICE_ORANGE);
		registerRenders(JUICE_TOMATO);
		registerRenders(JUICE_APPLE);

		registerRenders(PIE_PEAR);
		registerRenders(PIE_CHERRY);
		registerRenders(PIE_ORANGE);
		registerRenders(PIE_APPLE);
		registerRenders(PIE_MELON);

		registerRenders(MUFFIN_PEAR);
		registerRenders(MUFFIN_CHERRY);
		registerRenders(MUFFIN_ORANGE);
		registerRenders(MUFFIN_APPLE);
		registerRenders(MUFFIN_BLUEBERRY);
		registerRenders(MUFFIN_REDCURRANT);
		registerRenders(MUFFIN_BLACKCURRANT);
		registerRenders(MUFFIN_STRAWBERRY);
		registerRenders(MUFFIN_DREAMCURRANT);

		registerRenders(TOFFEE_CUBE);
		registerRenders(TOFFEE_APPLE);

		registerRenders(WILDBOAR_RAW);
		registerRenders(WILDBOAR_COOKED);

		registerRenders(FISH_TROUT_RAW);
		registerRenders(FISH_BASS_RAW);
		registerRenders(FISH_SARDINE_RAW);
		registerRenders(FISH_MACKEREL_RAW);
		registerRenders(FISH_WHITING_RAW);

		registerRenders(FISH_TROUT_COOKED);
		registerRenders(FISH_BASS_COOKED);
		registerRenders(FISH_SARDINE_COOKED);
		registerRenders(FISH_MACKEREL_COOKED);
		registerRenders(FISH_WHITING_COOKED);

		registerRenders(FISH_GOLDEN);
		registerRenders(FISH_DIAMOND);

		registerRenders(PURPURA_BAG);

		registerRenders(TERRACOTTA_CUBE);

		registerRenders(CHERRY_BOAT);
		registerRenders(CHERRY_DOOR);
		registerRenders(PEAR_BOAT);
		registerRenders(PEAR_DOOR);
		registerRenders(ORANGE_BOAT);
		registerRenders(ORANGE_DOOR);
		registerRenders(ATLAS_BOAT);
		registerRenders(ATLAS_DOOR);

		registerRenders(PINE_BOAT);
		registerRenders(PINE_DOOR);
		registerRenders(COCO_BOAT);
		registerRenders(COCO_DOOR);
		registerRenders(DREAM_BOAT);
		registerRenders(DREAM_DOOR);
	}

	public static void registerRenders(Item item)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
