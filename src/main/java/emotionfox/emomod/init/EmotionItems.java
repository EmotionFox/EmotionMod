package emotionfox.emomod.init;

import java.util.HashSet;

import emotionfox.emomod.entity.EntityButterfly;
import emotionfox.emomod.entity.EntityNewBoat;
import emotionfox.emomod.items.ItemButterflyNet;
import emotionfox.emomod.items.ItemDreamStaff;
import emotionfox.emomod.items.ItemBag;
import emotionfox.emomod.items.ItemButterfly;
import emotionfox.emomod.items.ItemSlice;
import emotionfox.emomod.items.ItemAmulet;
import emotionfox.emomod.items.ItemPurpuraBag;
import emotionfox.emomod.items.ItemBalloon;
import emotionfox.emomod.items.ItemRing;
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
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class EmotionItems
{
	private final static HashSet<Item> emotionItems = new HashSet<Item>();

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

	public static final Item SEED_PEAR = new ItemSeeds(EmotionBlocks.PEAR_PLANT, Blocks.FARMLAND);
	public static final Item SEED_CHERRY = new ItemSeeds(EmotionBlocks.CHERRY_PLANT, Blocks.FARMLAND);
	public static final Item SEED_ORANGE = new ItemSeeds(EmotionBlocks.ORANGE_PLANT, Blocks.FARMLAND);
	public static final Item SEED_TOMATO = new ItemSeeds(EmotionBlocks.TOMATO_PLANT, Blocks.FARMLAND);
	public static final Item SEED_APPLE = new ItemSeeds(EmotionBlocks.APPLE_PLANT, Blocks.FARMLAND);

	public static final Item SPORE_MAGIC = new ItemSeeds(EmotionBlocks.BLUE_PLANT, Blocks.FARMLAND);
	public static final Item SPORE_RED = new ItemSeeds(EmotionBlocks.RED_PLANT, Blocks.FARMLAND);
	public static final Item SPORE_BROWN = new ItemSeeds(EmotionBlocks.BROWN_PLANT, Blocks.FARMLAND);

	public static final Item CAKE_CHOCO = new ItemBlockSpecial(EmotionBlocks.CAKE_CHOCO).setMaxStackSize(1).setCreativeTab(CreativeTabs.FOOD);
	public static final Item CAKE_FRUIT = new ItemBlockSpecial(EmotionBlocks.CAKE_FRUIT).setMaxStackSize(1).setCreativeTab(CreativeTabs.FOOD);
	public static final Item CAKE_TOFFEE = new ItemBlockSpecial(EmotionBlocks.CAKE_TOFFEE).setMaxStackSize(1).setCreativeTab(CreativeTabs.FOOD);
	public static final Item CAKE_STRAWBERRY = new ItemBlockSpecial(EmotionBlocks.CAKE_STRAWBERRY).setMaxStackSize(1).setCreativeTab(CreativeTabs.FOOD);

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
	public static final Item CHERRY_DOOR = new ItemDoor(EmotionBlocks.CHERRY_DOOR);
	public static final Item PEAR_BOAT = new BaseBoat(EntityNewBoat.Type.PEAR);
	public static final Item PEAR_DOOR = new ItemDoor(EmotionBlocks.PEAR_DOOR);
	public static final Item ORANGE_BOAT = new BaseBoat(EntityNewBoat.Type.ORANGE);
	public static final Item ORANGE_DOOR = new ItemDoor(EmotionBlocks.ORANGE_DOOR);
	public static final Item ATLAS_BOAT = new BaseBoat(EntityNewBoat.Type.ATLAS);
	public static final Item ATLAS_DOOR = new ItemDoor(EmotionBlocks.ATLAS_DOOR);

	public static final Item PINE_BOAT = new BaseBoat(EntityNewBoat.Type.PINE);
	public static final Item PINE_DOOR = new ItemDoor(EmotionBlocks.PINE_DOOR);
	public static final Item COCO_BOAT = new BaseBoat(EntityNewBoat.Type.COCO);
	public static final Item COCO_DOOR = new ItemDoor(EmotionBlocks.COCO_DOOR);
	public static final Item DREAM_BOAT = new BaseBoat(EntityNewBoat.Type.DREAM);
	public static final Item DREAM_DOOR = new ItemDoor(EmotionBlocks.DREAM_DOOR);

	public static void mainRegister()
	{
		registerItem(PURPURA_SHARD, "purpura_shard");
		registerItem(PURPURA_RING, "purpura_ring");
		registerItem(PURPURA_RED_BALLOON, "purpura_red_balloon");
		registerItem(PURPURA_GREEN_BALLOON, "purpura_green_balloon");
		registerItem(PURPURA_BLUE_BALLOON, "purpura_blue_balloon");

		registerItem(PURPURA_AXE, "purpura_axe");
		registerItem(PURPURA_HOE, "purpura_hoe");
		registerItem(PURPURA_PICKAXE, "purpura_pickaxe");
		registerItem(PURPURA_SHOVEL, "purpura_shovel");
		registerItem(PURPURA_SWORD, "purpura_sword");
		registerItem(PURPURA_BLUE_SWORD, "purpura_blue_sword");
		registerItem(PURPURA_RED_SWORD, "purpura_red_sword");

		registerItem(BAG_PURPURA, "bag_purpura");

		registerItem(FOSSIL_AXE, "fossil_axe");
		registerItem(FOSSIL_HOE, "fossil_hoe");
		registerItem(FOSSIL_PICKAXE, "fossil_pickaxe");
		registerItem(FOSSIL_SHOVEL, "fossil_shovel");
		registerItem(FOSSIL_SWORD, "fossil_sword");

		registerItem(VIRIDIS_CRISTAL, "viridis_cristal_item");

		registerItem(VIRIDIS_HELMET, "viridis_helmet");
		registerItem(VIRIDIS_CHESTPLATE, "viridis_chestplate");
		registerItem(VIRIDIS_LEGGINGS, "viridis_leggings");
		registerItem(VIRIDIS_BOOTS, "viridis_boots");

		registerItem(LUME_STONE, "lume_stone");

		registerItem(FOSSIL, "fossil");

		registerItem(SPORE_MAGIC, "spore_magic");
		registerItem(SPORE_RED, "spore_red");
		registerItem(SPORE_BROWN, "spore_brown");

		registerItem(CAKE_CHOCO, "cake_choco");
		registerItem(CAKE_FRUIT, "cake_fruit");
		registerItem(CAKE_TOFFEE, "cake_toffee");
		registerItem(CAKE_STRAWBERRY, "cake_strawberry");

		registerItem(STAFF_BLUE, "staff_blue");
		registerItem(STAFF_GREEN, "staff_green");
		registerItem(STAFF_RED, "staff_red");
		registerItem(STAFF_WHITE, "staff_white");

		registerItem(STAFF_DREAM, "dream_staff");
		registerItem(DREAM_STONE, "dream_stone");

		registerItem(AMULET_BLUE, "amulet_blue");
		registerItem(AMULET_BLUE_BROKEN, "amulet_blue_broken");
		registerItem(AMULET_GREEN, "amulet_green");
		registerItem(AMULET_GREEN_BROKEN, "amulet_green_broken");
		registerItem(AMULET_RED, "amulet_red");
		registerItem(AMULET_RED_BROKEN, "amulet_red_broken");
		registerItem(AMULET_WHITE, "amulet_white");
		registerItem(AMULET_WHITE_BROKEN, "amulet_white_broken");

		registerItem(KNIFE, "knife");
		registerItem(HORN, "horn");
		registerItem(BANDAGE, "bandage");

		registerItem(BUTTERFLY_NET, "butterfly_net");
		registerItem(BUTTERFLY, "butterfly");

		registerItem(FRUIT_PEAR, "fruit_pear");
		registerItem(FRUIT_CHERRY, "fruit_cherry");
		registerItem(FRUIT_ORANGE, "fruit_orange");
		registerItem(FRUIT_TOMATO, "fruit_tomato");

		registerItem(BERRY_BLUEBERRY, "berry_blueberry");
		registerItem(BERRY_REDCURRANT, "berry_redcurrant");
		registerItem(BERRY_BLACKCURRANT, "berry_blackcurrant");
		registerItem(BERRY_STRAWBERRY, "berry_strawberry");
		registerItem(BERRY_STRAWBERRY_CHOCO, "berry_strawberry_choco");
		registerItem(BERRY_DREAMCURRANT, "berry_dreamcurrant");

		registerItem(SLICE, "slice");

		registerItem(BAG, "bag");

		registerItem(SALAD_FRUIT, "salad_fruit");
		registerItem(SALAD_TOMATO, "salad_tomato");
		registerItem(SALAD_PUMPKIN, "salad_pumpkin");

		registerItem(SEED_PEAR, "seed_pear");
		registerItem(SEED_CHERRY, "seed_cherry");
		registerItem(SEED_ORANGE, "seed_orange");
		registerItem(SEED_TOMATO, "seed_tomato");
		registerItem(SEED_APPLE, "seed_apple");

		registerItem(SALT, "salt");

		registerItem(BOWL_GLASS, "bowl_glass");

		registerItem(JUICE_PEAR, "juice_pear");
		registerItem(JUICE_CHERRY, "juice_cherry");
		registerItem(JUICE_ORANGE, "juice_orange");
		registerItem(JUICE_TOMATO, "juice_tomato");
		registerItem(JUICE_APPLE, "juice_apple");

		registerItem(PIE_PEAR, "pie_pear");
		registerItem(PIE_CHERRY, "pie_cherry");
		registerItem(PIE_ORANGE, "pie_orange");
		registerItem(PIE_APPLE, "pie_apple");
		registerItem(PIE_MELON, "pie_melon");

		registerItem(MUFFIN_PEAR, "muffin_pear");
		registerItem(MUFFIN_CHERRY, "muffin_cherry");
		registerItem(MUFFIN_ORANGE, "muffin_orange");
		registerItem(MUFFIN_APPLE, "muffin_apple");
		registerItem(MUFFIN_BLUEBERRY, "muffin_blueberry");
		registerItem(MUFFIN_REDCURRANT, "muffin_redcurrant");
		registerItem(MUFFIN_BLACKCURRANT, "muffin_blackcurrant");
		registerItem(MUFFIN_STRAWBERRY, "muffin_strawberry");
		registerItem(MUFFIN_DREAMCURRANT, "muffin_dreamcurrant");

		registerItem(TOFFEE_CUBE, "toffee_cube");
		registerItem(TOFFEE_APPLE, "toffee_apple");

		registerItem(WILDBOAR_RAW, "wildboar_raw");
		registerItem(WILDBOAR_COOKED, "wildboar_cooked");

		registerItem(FISH_TROUT_RAW, "fish_trout_raw");
		registerItem(FISH_BASS_RAW, "fish_bass_raw");
		registerItem(FISH_SARDINE_RAW, "fish_sardine_raw");
		registerItem(FISH_MACKEREL_RAW, "fish_mackerel_raw");
		registerItem(FISH_WHITING_RAW, "fish_whiting_raw");

		registerItem(FISH_TROUT_COOKED, "fish_trout_cooked");
		registerItem(FISH_BASS_COOKED, "fish_bass_cooked");
		registerItem(FISH_SARDINE_COOKED, "fish_sardine_cooked");
		registerItem(FISH_MACKEREL_COOKED, "fish_mackerel_cooked");
		registerItem(FISH_WHITING_COOKED, "fish_whiting_cooked");

		registerItem(FISH_GOLDEN, "fish_golden");
		registerItem(FISH_DIAMOND, "fish_diamond");

		registerItem(TERRACOTTA_CUBE, "terracotta_cube");

		registerItem(CHERRY_BOAT, "cherry_boat");
		registerItem(CHERRY_DOOR, "cherry_door");
		registerItem(PEAR_BOAT, "pear_boat");
		registerItem(PEAR_DOOR, "pear_door");
		registerItem(ORANGE_BOAT, "orange_boat");
		registerItem(ORANGE_DOOR, "orange_door");
		registerItem(ATLAS_BOAT, "atlas_boat");
		registerItem(ATLAS_DOOR, "atlas_door");

		registerItem(PINE_BOAT, "pine_boat");
		registerItem(PINE_DOOR, "pine_door");
		registerItem(COCO_BOAT, "coco_boat");
		registerItem(COCO_DOOR, "coco_door");
		registerItem(DREAM_BOAT, "dream_boat");
		registerItem(DREAM_DOOR, "dream_door");
	}

	public static void registerItem(Item item, String name)
	{
		if (!item.getHasSubtypes())
			emotionItems.add(item);

		item.setUnlocalizedName(name);
		item.setRegistryName(new ResourceLocation(Reference.MOD_ID, name));
		GameRegistry.register(item);
	}

	// Called by ClientProxy.class
	public static void registerRenders()
	{
		// Regular Render
		for (Item item : emotionItems)
			registerRender(item);

		// Multiple Render
		for (int i = 0; i < EntityButterfly.Type.values().length; i++)
			registerRender(BUTTERFLY, i, "butterfly_" + EntityButterfly.Type.values()[i].getName());
		for (int i = 0; i < ItemBag.variants.length; i++)
			registerRender(BAG, i, "bag_" + ItemBag.variants[i]);
		for (int i = 0; i < ItemSlice.variants.length; i++)
			registerRender(SLICE, i, "slice_" + ItemSlice.variants[i]);
	}

	public static void registerRender(Item item)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0,
				new ModelResourceLocation(new ResourceLocation(Reference.MOD_ID, item.getUnlocalizedName().substring(5)), "inventory"));
	}

	public static void registerRender(Item item, int meta, String fileName)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, meta, new ModelResourceLocation(new ResourceLocation(Reference.MOD_ID, fileName), "inventory"));
	}
}
