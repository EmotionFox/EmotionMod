package emotionfox.emomod.init;

import emotionfox.emomod.handler.EmotionFuelHandler;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CraftingManager
{
	public static void mainRegister()
	{
		addCraftingRecipes();
		addSmeltingRecipes();
	}

	private static void addCraftingRecipes()
	{
		// Minecraft
		ItemStack redStack = new ItemStack(Items.DYE, 1, 1);
		ItemStack cactusStack = new ItemStack(Items.DYE, 1, 2);
		ItemStack cocoaStack = new ItemStack(Items.DYE, 1, 3);
		ItemStack lapisStack = new ItemStack(Items.DYE, 1, 4);

		// Foods +
		ItemStack applePot = new ItemStack(EmotionBlock.POT, 1, 0);
		ItemStack blackCurrantPot = new ItemStack(EmotionBlock.POT, 1, 1);
		ItemStack blueberryPot = new ItemStack(EmotionBlock.POT, 1, 2);
		ItemStack cherryPot = new ItemStack(EmotionBlock.POT, 1, 3);
		ItemStack chocolatePot = new ItemStack(EmotionBlock.POT, 1, 4);
		ItemStack orangePot = new ItemStack(EmotionBlock.POT, 1, 5);
		ItemStack pearPot = new ItemStack(EmotionBlock.POT, 1, 6);
		ItemStack redCurrantPot = new ItemStack(EmotionBlock.POT, 1, 7);
		ItemStack strawberryPot = new ItemStack(EmotionBlock.POT, 1, 8);
		ItemStack dreamCurrantPot = new ItemStack(EmotionBlock.POT, 1, 9);
		ItemStack glassPot = new ItemStack(EmotionBlock.POT, 1, 10);

		ItemStack slicePear = new ItemStack(EmotionItem.SLICE, 1, 0);
		ItemStack sliceCherry = new ItemStack(EmotionItem.SLICE, 1, 1);
		ItemStack sliceOrange = new ItemStack(EmotionItem.SLICE, 1, 2);
		ItemStack sliceApple = new ItemStack(EmotionItem.SLICE, 1, 3);
		ItemStack sliceBlueberry = new ItemStack(EmotionItem.SLICE, 1, 4);
		ItemStack sliceRedcurrant = new ItemStack(EmotionItem.SLICE, 1, 5);
		ItemStack sliceBlackcurrant = new ItemStack(EmotionItem.SLICE, 1, 6);
		ItemStack sliceStrawberry = new ItemStack(EmotionItem.SLICE, 1, 7);
		ItemStack sliceDreamcurrant = new ItemStack(EmotionItem.SLICE, 1, 8);
		ItemStack sliceChocolate = new ItemStack(EmotionItem.SLICE, 1, 9);
		ItemStack sliceBread = new ItemStack(EmotionItem.SLICE, 1, 10);

		// Ores +
		ItemStack bluePurpura = new ItemStack(EmotionItem.PURPURA_BLUE_SWORD, 1, 0);
		bluePurpura.addEnchantment(Enchantment.getEnchantmentByID(16), 2);
		bluePurpura.addEnchantment(Enchantment.getEnchantmentByID(21), 1);

		ItemStack redPurpura = new ItemStack(EmotionItem.PURPURA_RED_SWORD, 1, 0);
		redPurpura.addEnchantment(EmotionEnchantment.BLOOD_SUCKING, 2);
		redPurpura.addEnchantment(Enchantment.getEnchantmentByID(21), 1);

		// Flowers+
		ItemStack kittyStack = new ItemStack(EmotionBlock.FLOWER, 1, 0);
		ItemStack noxStack = new ItemStack(EmotionBlock.FLOWER, 1, 1);
		ItemStack delyStack = new ItemStack(EmotionBlock.FLOWER, 1, 2);
		ItemStack gnonStack = new ItemStack(EmotionBlock.FLOWER, 1, 3);
		ItemStack centusStack = new ItemStack(EmotionBlock.FLOWER, 1, 5);
		ItemStack thornyStack = new ItemStack(EmotionBlock.FLOWER, 1, 4);

		// Biomes +
		ItemStack redBrick = new ItemStack(EmotionBlock.BRICK, 1, 0);
		ItemStack greenBrick = new ItemStack(EmotionBlock.BRICK, 1, 1);
		ItemStack blueBrick = new ItemStack(EmotionBlock.BRICK, 1, 2);

		// Ores +
		GameRegistry.addRecipe(new ItemStack(EmotionBlock.PURPURA_BLOCK, 1), new Object[]
		{ "YYY", "YYY", "YYY", 'Y', EmotionItem.PURPURA_SHARD });
		GameRegistry.addShapelessRecipe(new ItemStack(EmotionItem.PURPURA_SHARD, 9), new Object[]
		{ EmotionBlock.PURPURA_BLOCK });

		GameRegistry.addRecipe(new ItemStack(EmotionItem.PURPURA_AXE, 1), new Object[]
		{ "YY ", "YX ", " X ", 'Y', EmotionItem.PURPURA_SHARD, 'X', Items.IRON_INGOT });
		GameRegistry.addRecipe(new ItemStack(EmotionItem.PURPURA_HOE, 1), new Object[]
		{ "YY ", " X ", " X ", 'Y', EmotionItem.PURPURA_SHARD, 'X', Items.IRON_INGOT });
		GameRegistry.addRecipe(new ItemStack(EmotionItem.PURPURA_PICKAXE, 1), new Object[]
		{ "YYY", " X ", " X ", 'Y', EmotionItem.PURPURA_SHARD, 'X', Items.IRON_INGOT });
		GameRegistry.addRecipe(new ItemStack(EmotionItem.PURPURA_SHOVEL, 1), new Object[]
		{ " Y ", " X ", " X ", 'Y', EmotionItem.PURPURA_SHARD, 'X', Items.IRON_INGOT });
		GameRegistry.addRecipe(new ItemStack(EmotionItem.PURPURA_SWORD, 1), new Object[]
		{ " Y ", " Y ", " X ", 'Y', EmotionItem.PURPURA_SHARD, 'X', Items.IRON_INGOT });
		GameRegistry.addRecipe(bluePurpura, new Object[]
		{ "ZY ", "ZY ", " X ", 'Z', Items.DIAMOND, 'Y', EmotionItem.PURPURA_SHARD, 'X', Items.IRON_INGOT });
		GameRegistry.addShapelessRecipe(bluePurpura, new Object[]
		{ EmotionItem.PURPURA_SWORD, Items.DIAMOND, Items.DIAMOND });
		GameRegistry.addRecipe(redPurpura, new Object[]
		{ "ZY ", "ZY ", " X ", 'Z', Items.REDSTONE, 'Y', EmotionItem.PURPURA_SHARD, 'X', Items.IRON_INGOT });
		GameRegistry.addShapelessRecipe(redPurpura, new Object[]
		{ EmotionItem.PURPURA_SWORD, Items.REDSTONE, Items.REDSTONE });

		GameRegistry.addRecipe(new ItemStack(EmotionItem.FOSSIL_AXE, 1), new Object[]
		{ "YY ", "YX ", " X ", 'Y', EmotionItem.FOSSIL, 'X', Items.STICK });
		GameRegistry.addRecipe(new ItemStack(EmotionItem.FOSSIL_HOE, 1), new Object[]
		{ "YY ", " X ", " X ", 'Y', EmotionItem.FOSSIL, 'X', Items.STICK });
		GameRegistry.addRecipe(new ItemStack(EmotionItem.FOSSIL_PICKAXE, 1), new Object[]
		{ "YYY", " X ", " X ", 'Y', EmotionItem.FOSSIL, 'X', Items.STICK });
		GameRegistry.addRecipe(new ItemStack(EmotionItem.FOSSIL_SHOVEL, 1), new Object[]
		{ " Y ", " X ", " X ", 'Y', EmotionItem.FOSSIL, 'X', Items.STICK });
		GameRegistry.addRecipe(new ItemStack(EmotionItem.FOSSIL_SWORD, 1), new Object[]
		{ " Y ", " Y ", " X ", 'Y', EmotionItem.FOSSIL, 'X', Items.STICK });

		GameRegistry.addRecipe(new ItemStack(EmotionBlock.VIRIDIS_BLOCK, 1), new Object[]
		{ "YYY", "YYY", "YYY", 'Y', EmotionItem.VIRIDIS_CRISTAL });
		GameRegistry.addShapelessRecipe(new ItemStack(EmotionItem.VIRIDIS_CRISTAL, 9), new Object[]
		{ EmotionBlock.VIRIDIS_BLOCK });

		GameRegistry.addRecipe(new ItemStack(EmotionItem.VIRIDIS_HELMET, 1), new Object[]
		{ "YZY", "Z Z", 'Y', Items.IRON_INGOT, 'Z', EmotionItem.VIRIDIS_CRISTAL });
		GameRegistry.addRecipe(new ItemStack(EmotionItem.VIRIDIS_CHESTPLATE, 1), new Object[]
		{ "Y Y", "ZZZ", "YZY", 'Y', Items.IRON_INGOT, 'Z', EmotionItem.VIRIDIS_CRISTAL });
		GameRegistry.addRecipe(new ItemStack(EmotionItem.VIRIDIS_LEGGINGS, 1), new Object[]
		{ "ZYZ", "Z Z", "Y Y", 'Y', Items.IRON_INGOT, 'Z', EmotionItem.VIRIDIS_CRISTAL });
		GameRegistry.addRecipe(new ItemStack(EmotionItem.VIRIDIS_BOOTS, 1), new Object[]
		{ "Z Z", "Y Y", 'Y', Items.IRON_INGOT, 'Z', EmotionItem.VIRIDIS_CRISTAL });

		GameRegistry.addRecipe(new ItemStack(EmotionBlock.LUME_BLOCK, 1), new Object[]
		{ "YYY", "YYY", "YYY", 'Y', EmotionItem.LUME_STONE });
		GameRegistry.addRecipe(new ItemStack(Item.getItemFromBlock(Blocks.TORCH), 8), new Object[]
		{ " Y ", " X ", 'Y', EmotionItem.LUME_STONE, 'X', Items.STICK });
		GameRegistry.addShapelessRecipe(new ItemStack(EmotionItem.LUME_STONE, 9), new Object[]
		{ EmotionBlock.LUME_BLOCK });

		GameRegistry.addRecipe(new ItemStack(EmotionItem.STAFF_BLUE, 1), new Object[]
		{ "XYZ", " W ", " W ", 'X', Items.ENDER_EYE, 'Y', EmotionItem.PURPURA_SHARD, 'Z', lapisStack, 'W', Items.IRON_INGOT });
		GameRegistry.addShapelessRecipe(new ItemStack(EmotionItem.STAFF_BLUE, 1), new Object[]
		{ EmotionItem.STAFF_WHITE, lapisStack });
		GameRegistry.addRecipe(new ItemStack(EmotionItem.STAFF_GREEN, 1), new Object[]
		{ "XYZ", " W ", " W ", 'X', Items.ENDER_EYE, 'Y', EmotionItem.PURPURA_SHARD, 'Z', Items.EMERALD, 'W', Items.IRON_INGOT });
		GameRegistry.addShapelessRecipe(new ItemStack(EmotionItem.STAFF_GREEN, 1), new Object[]
		{ EmotionItem.STAFF_WHITE, Items.EMERALD });
		GameRegistry.addRecipe(new ItemStack(EmotionItem.STAFF_RED, 1), new Object[]
		{ "XYZ", " W ", " W ", 'X', Items.ENDER_EYE, 'Y', EmotionItem.PURPURA_SHARD, 'Z', Items.REDSTONE, 'W', Items.IRON_INGOT });
		GameRegistry.addShapelessRecipe(new ItemStack(EmotionItem.STAFF_RED, 1), new Object[]
		{ EmotionItem.STAFF_WHITE, Items.REDSTONE });
		GameRegistry.addRecipe(new ItemStack(EmotionItem.STAFF_WHITE, 1), new Object[]
		{ "XYW", " W ", " W ", 'X', Items.ENDER_EYE, 'Y', EmotionItem.PURPURA_SHARD, 'W', Items.IRON_INGOT });

		GameRegistry.addRecipe(new ItemStack(EmotionItem.STAFF_DREAM, 1), new Object[]
		{ "XYZ", " W ", " W ", 'X', Items.ENDER_EYE, 'Y', EmotionItem.PURPURA_SHARD, 'Z', EmotionItem.DREAM_STONE, 'W', Items.IRON_INGOT });
		GameRegistry.addShapelessRecipe(new ItemStack(EmotionItem.STAFF_DREAM), new Object[]
		{ EmotionItem.STAFF_WHITE, EmotionItem.DREAM_STONE });

		GameRegistry.addShapelessRecipe(new ItemStack(EmotionItem.DREAM_STONE), new Object[]
		{ Items.DIAMOND, lapisStack, Items.REDSTONE, Items.EMERALD });

		GameRegistry.addShapelessRecipe(new ItemStack(EmotionItem.AMULET_BLUE), new Object[]
		{ Items.STRING, Items.STRING, lapisStack, EmotionItem.PURPURA_SHARD, EmotionItem.PURPURA_SHARD });
		GameRegistry.addShapelessRecipe(new ItemStack(EmotionItem.AMULET_BLUE), new Object[]
		{ EmotionItem.AMULET_WHITE, lapisStack });
		GameRegistry.addShapelessRecipe(new ItemStack(EmotionItem.AMULET_GREEN), new Object[]
		{ Items.STRING, Items.STRING, Items.EMERALD, EmotionItem.PURPURA_SHARD, EmotionItem.PURPURA_SHARD });
		GameRegistry.addShapelessRecipe(new ItemStack(EmotionItem.AMULET_GREEN), new Object[]
		{ EmotionItem.AMULET_WHITE, Items.EMERALD });
		GameRegistry.addShapelessRecipe(new ItemStack(EmotionItem.AMULET_RED), new Object[]
		{ Items.STRING, Items.STRING, Items.REDSTONE, EmotionItem.PURPURA_SHARD, EmotionItem.PURPURA_SHARD });
		GameRegistry.addShapelessRecipe(new ItemStack(EmotionItem.AMULET_RED), new Object[]
		{ EmotionItem.AMULET_WHITE, Items.REDSTONE });
		GameRegistry.addShapelessRecipe(new ItemStack(EmotionItem.AMULET_WHITE), new Object[]
		{ Items.STRING, Items.STRING, Items.IRON_INGOT, EmotionItem.PURPURA_SHARD, EmotionItem.PURPURA_SHARD });

		GameRegistry.addShapelessRecipe(new ItemStack(EmotionItem.AMULET_BLUE), new Object[]
		{ EmotionItem.AMULET_BLUE_BROKEN, EmotionItem.SPORE_MAGIC, EmotionItem.SPORE_MAGIC });
		GameRegistry.addShapelessRecipe(new ItemStack(EmotionItem.AMULET_GREEN), new Object[]
		{ EmotionItem.AMULET_GREEN_BROKEN, EmotionItem.SPORE_MAGIC, EmotionItem.SPORE_MAGIC });
		GameRegistry.addShapelessRecipe(new ItemStack(EmotionItem.AMULET_RED), new Object[]
		{ EmotionItem.AMULET_RED_BROKEN, EmotionItem.SPORE_MAGIC, EmotionItem.SPORE_MAGIC });
		GameRegistry.addShapelessRecipe(new ItemStack(EmotionItem.AMULET_WHITE), new Object[]
		{ EmotionItem.AMULET_WHITE_BROKEN, EmotionItem.SPORE_MAGIC, EmotionItem.SPORE_MAGIC });

		GameRegistry.addRecipe(new ItemStack(EmotionItem.PURPURA_RING), new Object[]
		{ " X ", "YZY", " Y ", 'X', EmotionItem.PURPURA_SHARD, 'Y', Items.IRON_INGOT, 'Z', Items.DIAMOND });
		// GameRegistry.addRecipe(new ItemStack(EmotionItems.purpuraBag), new
		// Object[] {" Y ", "YXY", " Y ", 'X', EmotionItems.PURPURA_SHARD, 'Y',
		// Items.leather});

		GameRegistry.addShapelessRecipe(new ItemStack(EmotionItem.KNIFE), new Object[]
		{ Items.STICK, EmotionItem.HORN });
		GameRegistry.addShapelessRecipe(new ItemStack(Items.PAPER), new Object[]
		{ EmotionItem.BANDAGE });
		GameRegistry.addRecipe(new ItemStack(EmotionItem.BUTTERFLY_NET, 1), new Object[]
		{ "YYY", "YWY", " W ", 'Y', Items.STRING, 'W', Items.STICK });

		// Foods +
		GameRegistry.addShapelessRecipe(new ItemStack(EmotionItem.SEED_PEAR, 2), new Object[]
		{ EmotionItem.FRUIT_PEAR });
		GameRegistry.addShapelessRecipe(new ItemStack(EmotionItem.SEED_CHERRY, 2), new Object[]
		{ EmotionItem.FRUIT_CHERRY });
		GameRegistry.addShapelessRecipe(new ItemStack(EmotionItem.SEED_ORANGE, 2), new Object[]
		{ EmotionItem.FRUIT_ORANGE });
		GameRegistry.addShapelessRecipe(new ItemStack(EmotionItem.SEED_TOMATO, 2), new Object[]
		{ EmotionItem.FRUIT_TOMATO });
		GameRegistry.addShapelessRecipe(new ItemStack(EmotionItem.SEED_APPLE, 2), new Object[]
		{ Items.APPLE });

		GameRegistry.addShapelessRecipe(applePot, new Object[]
		{ glassPot, Items.APPLE, Items.APPLE, Items.APPLE, Items.SUGAR });
		GameRegistry.addShapelessRecipe(blackCurrantPot, new Object[]
		{ glassPot, EmotionItem.BERRY_BLACKCURRANT, EmotionItem.BERRY_BLACKCURRANT, EmotionItem.BERRY_BLACKCURRANT, Items.SUGAR });
		GameRegistry.addShapelessRecipe(blueberryPot, new Object[]
		{ glassPot, EmotionItem.BERRY_BLUEBERRY, EmotionItem.BERRY_BLUEBERRY, EmotionItem.BERRY_BLUEBERRY, Items.SUGAR });
		GameRegistry.addShapelessRecipe(cherryPot, new Object[]
		{ glassPot, EmotionItem.FRUIT_CHERRY, EmotionItem.FRUIT_CHERRY, EmotionItem.FRUIT_CHERRY, Items.SUGAR });
		GameRegistry.addShapelessRecipe(chocolatePot, new Object[]
		{ glassPot, cocoaStack, cocoaStack, cocoaStack, Items.SUGAR });
		GameRegistry.addShapelessRecipe(orangePot, new Object[]
		{ glassPot, EmotionItem.FRUIT_ORANGE, EmotionItem.FRUIT_ORANGE, EmotionItem.FRUIT_ORANGE, Items.SUGAR });
		GameRegistry.addShapelessRecipe(pearPot, new Object[]
		{ glassPot, EmotionItem.FRUIT_PEAR, EmotionItem.FRUIT_PEAR, EmotionItem.FRUIT_PEAR, Items.SUGAR });
		GameRegistry.addShapelessRecipe(redCurrantPot, new Object[]
		{ glassPot, EmotionItem.BERRY_REDCURRANT, EmotionItem.BERRY_REDCURRANT, EmotionItem.BERRY_REDCURRANT, Items.SUGAR });
		GameRegistry.addShapelessRecipe(strawberryPot, new Object[]
		{ glassPot, EmotionItem.BERRY_STRAWBERRY, EmotionItem.BERRY_STRAWBERRY, EmotionItem.BERRY_STRAWBERRY, Items.SUGAR });
		GameRegistry.addShapelessRecipe(dreamCurrantPot, new Object[]
		{ glassPot, EmotionItem.BERRY_DREAMCURRANT, EmotionItem.BERRY_DREAMCURRANT, EmotionItem.BERRY_DREAMCURRANT, Items.SUGAR });
		GameRegistry.addRecipe(glassPot, new Object[]
		{ "YXY", "Y Y", "YYY", 'X', Blocks.PLANKS, 'Y', Blocks.GLASS });
		GameRegistry.addRecipe(glassPot, new Object[]
		{ "YXY", "Y Y", "YYY", 'X', EmotionBlock.PLANKS, 'Y', Blocks.GLASS });

		GameRegistry.addShapelessRecipe(new ItemStack(EmotionItem.SLICE, 4, 0), new Object[]
		{ pearPot, sliceBread, sliceBread, sliceBread, sliceBread });
		GameRegistry.addShapelessRecipe(new ItemStack(EmotionItem.SLICE, 4, 1), new Object[]
		{ cherryPot, sliceBread, sliceBread, sliceBread, sliceBread });
		GameRegistry.addShapelessRecipe(new ItemStack(EmotionItem.SLICE, 4, 2), new Object[]
		{ orangePot, sliceBread, sliceBread, sliceBread, sliceBread });
		GameRegistry.addShapelessRecipe(new ItemStack(EmotionItem.SLICE, 4, 3), new Object[]
		{ applePot, sliceBread, sliceBread, sliceBread, sliceBread });
		GameRegistry.addShapelessRecipe(new ItemStack(EmotionItem.SLICE, 4, 4), new Object[]
		{ blueberryPot, sliceBread, sliceBread, sliceBread, sliceBread });
		GameRegistry.addShapelessRecipe(new ItemStack(EmotionItem.SLICE, 4, 5), new Object[]
		{ redCurrantPot, sliceBread, sliceBread, sliceBread, sliceBread });
		GameRegistry.addShapelessRecipe(new ItemStack(EmotionItem.SLICE, 4, 6), new Object[]
		{ blackCurrantPot, sliceBread, sliceBread, sliceBread, sliceBread });
		GameRegistry.addShapelessRecipe(new ItemStack(EmotionItem.SLICE, 4, 7), new Object[]
		{ strawberryPot, sliceBread, sliceBread, sliceBread, sliceBread });
		GameRegistry.addShapelessRecipe(new ItemStack(EmotionItem.SLICE, 4, 8), new Object[]
		{ dreamCurrantPot, sliceBread, sliceBread, sliceBread, sliceBread });
		GameRegistry.addShapelessRecipe(new ItemStack(EmotionItem.SLICE, 4, 9), new Object[]
		{ chocolatePot, sliceBread, sliceBread, sliceBread, sliceBread });
		GameRegistry.addShapelessRecipe(new ItemStack(EmotionItem.SLICE, 4, 10), new Object[]
		{ Items.BREAD });

		GameRegistry.addRecipe(new ItemStack(EmotionItem.BAG, 1, 0), new Object[]
		{ "YY", "YY", 'Y', EmotionItem.FRUIT_PEAR });
		GameRegistry.addRecipe(new ItemStack(EmotionItem.BAG, 1, 1), new Object[]
		{ "YY", "YY", 'Y', EmotionItem.FRUIT_CHERRY });
		GameRegistry.addRecipe(new ItemStack(EmotionItem.BAG, 1, 2), new Object[]
		{ "YY", "YY", 'Y', EmotionItem.FRUIT_ORANGE });
		GameRegistry.addRecipe(new ItemStack(EmotionItem.BAG, 1, 3), new Object[]
		{ "YY", "YY", 'Y', EmotionItem.FRUIT_TOMATO });
		GameRegistry.addRecipe(new ItemStack(EmotionItem.BAG, 1, 4), new Object[]
		{ "YY", "YY", 'Y', Items.APPLE });

		GameRegistry.addShapelessRecipe(new ItemStack(EmotionItem.FRUIT_PEAR, 4), new Object[]
		{ new ItemStack(EmotionItem.BAG, 1, 0) });
		GameRegistry.addShapelessRecipe(new ItemStack(EmotionItem.FRUIT_CHERRY, 4), new Object[]
		{ new ItemStack(EmotionItem.BAG, 1, 1) });
		GameRegistry.addShapelessRecipe(new ItemStack(EmotionItem.FRUIT_ORANGE, 4), new Object[]
		{ new ItemStack(EmotionItem.BAG, 1, 2) });
		GameRegistry.addShapelessRecipe(new ItemStack(EmotionItem.FRUIT_TOMATO, 4), new Object[]
		{ new ItemStack(EmotionItem.BAG, 1, 3) });
		GameRegistry.addShapelessRecipe(new ItemStack(Items.APPLE, 4), new Object[]
		{ new ItemStack(EmotionItem.BAG, 1, 4) });

		GameRegistry.addShapelessRecipe(new ItemStack(EmotionItem.BERRY_STRAWBERRY_CHOCO, 1), new Object[]
		{ EmotionItem.BERRY_STRAWBERRY, cocoaStack });

		GameRegistry.addShapelessRecipe(new ItemStack(EmotionItem.SALAD_FRUIT, 1), new Object[]
		{ EmotionItem.FRUIT_PEAR, EmotionItem.FRUIT_CHERRY, EmotionItem.FRUIT_ORANGE, Items.APPLE, Items.BOWL });
		GameRegistry.addShapelessRecipe(new ItemStack(EmotionItem.SALAD_TOMATO, 1), new Object[]
		{ EmotionItem.FRUIT_TOMATO, EmotionItem.SALT, Items.WHEAT_SEEDS, Items.BOWL });
		GameRegistry.addShapelessRecipe(new ItemStack(EmotionItem.SALAD_PUMPKIN, 1), new Object[]
		{ Blocks.PUMPKIN, Items.BOWL });

		GameRegistry.addRecipe(new ItemStack(EmotionBlock.CAKE_CHOCO, 1, 0), new Object[]
		{ "WYW", "XZX", "VVV", 'Y', Items.MILK_BUCKET, 'X', Items.SUGAR, 'Z', Items.EGG, 'W', cocoaStack, 'V', Items.WHEAT });
		GameRegistry.addRecipe(new ItemStack(EmotionBlock.CAKE_TOFFEE, 1, 0), new Object[]
		{ "WYW", "XZX", "VVV", 'Y', Items.MILK_BUCKET, 'X', Items.SUGAR, 'Z', Items.EGG, 'W', EmotionItem.TOFFEE_CUBE, 'V', Items.WHEAT });
		GameRegistry.addRecipe(new ItemStack(EmotionBlock.CAKE_STRAWBERRY, 1, 0), new Object[]
		{ "WYW", "XZX", "VVV", 'Y', Items.MILK_BUCKET, 'X', Items.SUGAR, 'Z', Items.EGG, 'W', EmotionItem.BERRY_STRAWBERRY, 'V', Items.WHEAT });
		GameRegistry.addRecipe(new ItemStack(EmotionBlock.CAKE_FRUIT, 1, 0), new Object[]
		{ "WYU", "VZX", "TTT", 'W', EmotionItem.FRUIT_PEAR, 'Y', Items.SUGAR, 'U', EmotionItem.FRUIT_ORANGE, 'V', EmotionItem.FRUIT_CHERRY, 'Z', Items.EGG, 'X', Items.APPLE, 'T', Items.WHEAT });

		GameRegistry.addRecipe(new ItemStack(EmotionItem.BOWL_GLASS, 4), new Object[]
		{ "Y Y", "YYY", 'Y', Blocks.GLASS });
		GameRegistry.addShapelessRecipe(new ItemStack(EmotionItem.JUICE_PEAR, 1), new Object[]
		{ EmotionItem.BOWL_GLASS, EmotionItem.FRUIT_PEAR, EmotionItem.FRUIT_PEAR, Items.SUGAR });
		GameRegistry.addShapelessRecipe(new ItemStack(EmotionItem.JUICE_CHERRY, 1), new Object[]
		{ EmotionItem.BOWL_GLASS, EmotionItem.FRUIT_CHERRY, EmotionItem.FRUIT_CHERRY, Items.SUGAR });
		GameRegistry.addShapelessRecipe(new ItemStack(EmotionItem.JUICE_ORANGE, 1), new Object[]
		{ EmotionItem.BOWL_GLASS, EmotionItem.FRUIT_ORANGE, EmotionItem.FRUIT_ORANGE, Items.SUGAR });
		GameRegistry.addShapelessRecipe(new ItemStack(EmotionItem.JUICE_TOMATO, 1), new Object[]
		{ EmotionItem.BOWL_GLASS, EmotionItem.FRUIT_TOMATO, EmotionItem.FRUIT_TOMATO, EmotionItem.SALT });
		GameRegistry.addShapelessRecipe(new ItemStack(EmotionItem.JUICE_APPLE, 1), new Object[]
		{ EmotionItem.BOWL_GLASS, Items.APPLE, Items.APPLE, Items.SUGAR });

		GameRegistry.addShapelessRecipe(new ItemStack(EmotionItem.PIE_PEAR, 1), new Object[]
		{ Items.EGG, Items.SUGAR, EmotionItem.FRUIT_PEAR });
		GameRegistry.addShapelessRecipe(new ItemStack(EmotionItem.PIE_CHERRY, 1), new Object[]
		{ Items.EGG, Items.SUGAR, EmotionItem.FRUIT_CHERRY });
		GameRegistry.addShapelessRecipe(new ItemStack(EmotionItem.PIE_ORANGE, 1), new Object[]
		{ Items.EGG, Items.SUGAR, EmotionItem.FRUIT_ORANGE });
		GameRegistry.addShapelessRecipe(new ItemStack(EmotionItem.PIE_APPLE, 1), new Object[]
		{ Items.EGG, Items.SUGAR, Items.APPLE });
		GameRegistry.addShapelessRecipe(new ItemStack(EmotionItem.PIE_MELON, 1), new Object[]
		{ Items.EGG, Items.SUGAR, Items.MELON });

		GameRegistry.addRecipe(new ItemStack(EmotionItem.MUFFIN_PEAR, 2), new Object[]
		{ "VWV", "XYX", "ZZZ", 'V', EmotionItem.FRUIT_PEAR, 'W', Items.MILK_BUCKET, 'X', Items.SUGAR, 'Y', Items.EGG, 'Z', Items.WHEAT });
		GameRegistry.addRecipe(new ItemStack(EmotionItem.MUFFIN_CHERRY, 2), new Object[]
		{ "VWV", "XYX", "ZZZ", 'V', EmotionItem.FRUIT_CHERRY, 'W', Items.MILK_BUCKET, 'X', Items.SUGAR, 'Y', Items.EGG, 'Z', Items.WHEAT });
		GameRegistry.addRecipe(new ItemStack(EmotionItem.MUFFIN_ORANGE, 2), new Object[]
		{ "VWV", "XYX", "ZZZ", 'V', EmotionItem.FRUIT_ORANGE, 'W', Items.MILK_BUCKET, 'X', Items.SUGAR, 'Y', Items.EGG, 'Z', Items.WHEAT });
		GameRegistry.addRecipe(new ItemStack(EmotionItem.MUFFIN_APPLE, 2), new Object[]
		{ "VWV", "XYX", "ZZZ", 'V', Items.APPLE, 'W', Items.MILK_BUCKET, 'X', Items.SUGAR, 'Y', Items.EGG, 'Z', Items.WHEAT });
		GameRegistry.addRecipe(new ItemStack(EmotionItem.MUFFIN_BLUEBERRY, 2), new Object[]
		{ "VWV", "XYX", "ZZZ", 'V', EmotionItem.BERRY_BLUEBERRY, 'W', Items.MILK_BUCKET, 'X', Items.SUGAR, 'Y', Items.EGG, 'Z', Items.WHEAT });
		GameRegistry.addRecipe(new ItemStack(EmotionItem.MUFFIN_BLACKCURRANT, 2), new Object[]
		{ "VWV", "XYX", "ZZZ", 'V', EmotionItem.BERRY_BLACKCURRANT, 'W', Items.MILK_BUCKET, 'X', Items.SUGAR, 'Y', Items.EGG, 'Z', Items.WHEAT });
		GameRegistry.addRecipe(new ItemStack(EmotionItem.MUFFIN_REDCURRANT, 2), new Object[]
		{ "VWV", "XYX", "ZZZ", 'V', EmotionItem.BERRY_REDCURRANT, 'W', Items.MILK_BUCKET, 'X', Items.SUGAR, 'Y', Items.EGG, 'Z', Items.WHEAT });
		GameRegistry.addRecipe(new ItemStack(EmotionItem.MUFFIN_STRAWBERRY, 2), new Object[]
		{ "VWV", "XYX", "ZZZ", 'V', EmotionItem.BERRY_STRAWBERRY, 'W', Items.MILK_BUCKET, 'X', Items.SUGAR, 'Y', Items.EGG, 'Z', Items.WHEAT });
		GameRegistry.addRecipe(new ItemStack(EmotionItem.MUFFIN_DREAMCURRANT, 2), new Object[]
		{ "VWV", "XYX", "ZZZ", 'V', EmotionItem.BERRY_DREAMCURRANT, 'W', Items.MILK_BUCKET, 'X', Items.SUGAR, 'Y', Items.EGG, 'Z', Items.WHEAT });

		GameRegistry.addShapelessRecipe(new ItemStack(EmotionItem.TOFFEE_APPLE, 1), new Object[]
		{ EmotionItem.TOFFEE_CUBE, Items.APPLE, Items.STICK });

		// Flowers +
		GameRegistry.addShapelessRecipe(new ItemStack(Items.DYE, 1, 11), new Object[]
		{ kittyStack });
		GameRegistry.addShapelessRecipe(new ItemStack(Items.DYE, 1, 6), new Object[]
		{ noxStack });
		GameRegistry.addShapelessRecipe(new ItemStack(Items.DYE, 1, 5), new Object[]
		{ delyStack });
		GameRegistry.addShapelessRecipe(new ItemStack(Items.DYE, 1, 14), new Object[]
		{ gnonStack });
		GameRegistry.addShapelessRecipe(new ItemStack(Items.DYE, 1, 12), new Object[]
		{ centusStack });
		GameRegistry.addShapelessRecipe(new ItemStack(Items.STICK, 2, 0), new Object[]
		{ thornyStack });

		// GameRegistry.addRecipe(new
		// ItemStack(Item.getItemFromBlock(EmotionBlocks.windowBox), 1), new
		// Object[] {"Y Y", "YYY", 'Y', EmotionItems.terracottaCube});

		GameRegistry.addShapelessRecipe(new ItemStack(EmotionItem.SPORE_MAGIC, 2), new Object[]
		{ EmotionBlock.MUSHROOM });
		GameRegistry.addShapelessRecipe(new ItemStack(EmotionItem.SPORE_RED, 2), new Object[]
		{ Blocks.RED_MUSHROOM });
		GameRegistry.addShapelessRecipe(new ItemStack(EmotionItem.SPORE_BROWN, 2), new Object[]
		{ Blocks.BROWN_MUSHROOM });

		// Furnitures +
		for (int i = 0; i <= 12; ++i)
		{
			ItemStack emoPlanks = new ItemStack(EmotionBlock.PLANKS, 1, i);
			ItemStack planks = new ItemStack(Blocks.PLANKS, 1, i - 7);

			if (i <= 6)
				GameRegistry.addRecipe(new ItemStack(EmotionBlock.WOOD_CHAIR, 2, i), new Object[]
				{ "YYY", "X X", "X X", 'X', Items.STICK, 'Y', emoPlanks });
			if (i >= 7)
				GameRegistry.addRecipe(new ItemStack(EmotionBlock.WOOD_CHAIR, 2, i), new Object[]
				{ "YYY", "X X", "X X", 'X', Items.STICK, 'Y', planks });
		}

		GameRegistry.addRecipe(new ItemStack(EmotionBlock.WOOD_NIGHTSTAND_CHERRY, 2, 2), new Object[]
		{ "YYY", "XYX", "X X", 'X', Items.STICK, 'Y', new ItemStack(EmotionBlock.PLANKS, 1, 0) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlock.WOOD_NIGHTSTAND_PEAR, 2, 2), new Object[]
		{ "YYY", "XYX", "X X", 'X', Items.STICK, 'Y', new ItemStack(EmotionBlock.PLANKS, 1, 1) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlock.WOOD_NIGHTSTAND_ORANGE, 2, 2), new Object[]
		{ "YYY", "XYX", "X X", 'X', Items.STICK, 'Y', new ItemStack(EmotionBlock.PLANKS, 1, 2) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlock.WOOD_NIGHTSTAND_ATLAS, 2, 2), new Object[]
		{ "YYY", "XYX", "X X", 'X', Items.STICK, 'Y', new ItemStack(EmotionBlock.PLANKS, 1, 3) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlock.WOOD_NIGHTSTAND_PINE, 2, 2), new Object[]
		{ "YYY", "XYX", "X X", 'X', Items.STICK, 'Y', new ItemStack(EmotionBlock.PLANKS, 1, 4) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlock.WOOD_NIGHTSTAND_COCO, 2, 2), new Object[]
		{ "YYY", "XYX", "X X", 'X', Items.STICK, 'Y', new ItemStack(EmotionBlock.PLANKS, 1, 5) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlock.WOOD_NIGHTSTAND_DREAM, 2, 2), new Object[]
		{ "YYY", "XYX", "X X", 'X', Items.STICK, 'Y', new ItemStack(EmotionBlock.PLANKS, 1, 6) });

		GameRegistry.addRecipe(new ItemStack(EmotionBlock.WOOD_NIGHTSTAND_OAK, 2, 2), new Object[]
		{ "YYY", "XYX", "X X", 'X', Items.STICK, 'Y', new ItemStack(Blocks.PLANKS, 1, 0) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlock.WOOD_NIGHTSTAND_SPRUCE, 2, 2), new Object[]
		{ "YYY", "XYX", "X X", 'X', Items.STICK, 'Y', new ItemStack(Blocks.PLANKS, 1, 1) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlock.WOOD_NIGHTSTAND_BIRCH, 2, 2), new Object[]
		{ "YYY", "XYX", "X X", 'X', Items.STICK, 'Y', new ItemStack(Blocks.PLANKS, 1, 2) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlock.WOOD_NIGHTSTAND_JUNGLE, 2, 2), new Object[]
		{ "YYY", "XYX", "X X", 'X', Items.STICK, 'Y', new ItemStack(Blocks.PLANKS, 1, 3) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlock.WOOD_NIGHTSTAND_ACACIA, 2, 2), new Object[]
		{ "YYY", "XYX", "X X", 'X', Items.STICK, 'Y', new ItemStack(Blocks.PLANKS, 1, 4) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlock.WOOD_NIGHTSTAND_BIG_OAK, 2, 2), new Object[]
		{ "YYY", "XYX", "X X", 'X', Items.STICK, 'Y', new ItemStack(Blocks.PLANKS, 1, 5) });

		GameRegistry.addRecipe(new ItemStack(EmotionBlock.WOOD_TABLE_CHERRY, 2, 0), new Object[]
		{ "YYY", " Y ", "XYX", 'X', Items.STICK, 'Y', new ItemStack(EmotionBlock.PLANKS, 1, 0) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlock.WOOD_TABLE_PEAR, 2, 0), new Object[]
		{ "YYY", " Y ", "XYX", 'X', Items.STICK, 'Y', new ItemStack(EmotionBlock.PLANKS, 1, 1) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlock.WOOD_TABLE_ORANGE, 2, 0), new Object[]
		{ "YYY", " Y ", "XYX", 'X', Items.STICK, 'Y', new ItemStack(EmotionBlock.PLANKS, 1, 2) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlock.WOOD_TABLE_ATLAS, 2, 0), new Object[]
		{ "YYY", " Y ", "XYX", 'X', Items.STICK, 'Y', new ItemStack(EmotionBlock.PLANKS, 1, 3) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlock.WOOD_TABLE_PINE, 2, 0), new Object[]
		{ "YYY", " Y ", "XYX", 'X', Items.STICK, 'Y', new ItemStack(EmotionBlock.PLANKS, 1, 4) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlock.WOOD_TABLE_COCO, 2, 0), new Object[]
		{ "YYY", " Y ", "XYX", 'X', Items.STICK, 'Y', new ItemStack(EmotionBlock.PLANKS, 1, 5) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlock.WOOD_TABLE_DREAM, 2, 0), new Object[]
		{ "YYY", " Y ", "XYX", 'X', Items.STICK, 'Y', new ItemStack(EmotionBlock.PLANKS, 1, 6) });

		GameRegistry.addRecipe(new ItemStack(EmotionBlock.WOOD_TABLE_OAK, 2, 0), new Object[]
		{ "YYY", " Y ", "XYX", 'X', Items.STICK, 'Y', new ItemStack(Blocks.PLANKS, 1, 0) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlock.WOOD_TABLE_SPRUCE, 2, 0), new Object[]
		{ "YYY", " Y ", "XYX", 'X', Items.STICK, 'Y', new ItemStack(Blocks.PLANKS, 1, 1) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlock.WOOD_TABLE_BIRCH, 2, 0), new Object[]
		{ "YYY", " Y ", "XYX", 'X', Items.STICK, 'Y', new ItemStack(Blocks.PLANKS, 1, 2) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlock.WOOD_TABLE_JUNGLE, 2, 0), new Object[]
		{ "YYY", " Y ", "XYX", 'X', Items.STICK, 'Y', new ItemStack(Blocks.PLANKS, 1, 3) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlock.WOOD_TABLE_ACACIA, 2, 0), new Object[]
		{ "YYY", " Y ", "XYX", 'X', Items.STICK, 'Y', new ItemStack(Blocks.PLANKS, 1, 4) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlock.WOOD_TABLE_BIG_OAK, 2, 0), new Object[]
		{ "YYY", " Y ", "XYX", 'X', Items.STICK, 'Y', new ItemStack(Blocks.PLANKS, 1, 5) });

		GameRegistry.addRecipe(new ItemStack(EmotionBlock.STONE_TABLE_COBBLESTONE, 2, 0), new Object[]
		{ "YYY", " Y ", "YYY", 'Y', Blocks.COBBLESTONE });
		GameRegistry.addRecipe(new ItemStack(EmotionBlock.STONE_TABLE_MOSSY_COBBLESTONE, 2, 0), new Object[]
		{ "YYY", " Y ", "YYY", 'Y', Blocks.MOSSY_COBBLESTONE });

		GameRegistry.addRecipe(new ItemStack(EmotionBlock.STONE_TABLE_STONE_BRICK, 2, 0), new Object[]
		{ "YYY", " Y ", "YYY", 'Y', new ItemStack(Blocks.STONEBRICK, 1, 0) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlock.STONE_TABLE_MOSSY_STONE_BRICK, 2, 0), new Object[]
		{ "YYY", " Y ", "YYY", 'Y', new ItemStack(Blocks.STONEBRICK, 1, 1) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlock.STONE_TABLE_CRACKED_STONE_BRICK, 2, 0), new Object[]
		{ "YYY", " Y ", "YYY", 'Y', new ItemStack(Blocks.STONEBRICK, 1, 2) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlock.STONE_TABLE_CHISELLED_STONE_BRICK, 2, 0), new Object[]
		{ "YYY", " Y ", "YYY", 'Y', new ItemStack(Blocks.STONEBRICK, 1, 3) });

		GameRegistry.addRecipe(new ItemStack(EmotionBlock.STONE_TABLE_BRICK, 2, 0), new Object[]
		{ "YYY", " Y ", "YYY", 'Y', Blocks.BRICK_BLOCK });

		GameRegistry.addRecipe(new ItemStack(EmotionBlock.STONE_CHAIR, 2, 0), new Object[]
		{ " YY", " YY", 'Y', Blocks.COBBLESTONE });
		GameRegistry.addRecipe(new ItemStack(EmotionBlock.STONE_CHAIR, 2, 1), new Object[]
		{ " YY", " YY", 'Y', Blocks.MOSSY_COBBLESTONE });
		GameRegistry.addRecipe(new ItemStack(EmotionBlock.STONE_CHAIR, 2, 2), new Object[]
		{ " YY", " YY", 'Y', new ItemStack(Blocks.STONEBRICK, 1, 0) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlock.STONE_CHAIR, 2, 3), new Object[]
		{ " YY", " YY", 'Y', new ItemStack(Blocks.STONEBRICK, 1, 1) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlock.STONE_CHAIR, 2, 4), new Object[]
		{ " YY", " YY", 'Y', new ItemStack(Blocks.STONEBRICK, 1, 2) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlock.STONE_CHAIR, 2, 5), new Object[]
		{ " YY", " YY", 'Y', new ItemStack(Blocks.STONEBRICK, 1, 3) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlock.STONE_CHAIR, 2, 6), new Object[]
		{ " YY", " YY", 'Y', Blocks.BRICK_BLOCK });

		// GameRegistry.addRecipe(new ItemStack(EmotionBlocks.clayStatue, 1, 0),
		// new Object[] {"YYY", " Y ", "YYY", 'Y', Items.CLAY_BALL});

		// Biomes +
		GameRegistry.addShapelessRecipe(redBrick, new Object[]
		{ redStack, Blocks.BRICK_BLOCK });
		GameRegistry.addShapelessRecipe(greenBrick, new Object[]
		{ cactusStack, Blocks.BRICK_BLOCK });
		GameRegistry.addShapelessRecipe(blueBrick, new Object[]
		{ lapisStack, Blocks.BRICK_BLOCK });

		// GameRegistry.addShapelessRecipe(new
		// ItemStack(EmotionItems.terracottaCube, 4), new Object[]
		// {terracottaSimple});
		// GameRegistry.addShapelessRecipe(terracottaTiles, new Object[]
		// {EmotionItems.terracottaCube, EmotionItems.terracottaCube,
		// EmotionItems.terracottaCube, EmotionItems.terracottaCube});
		// GameRegistry.addShapelessRecipe(new
		// ItemStack(EmotionBlocks.terracotta, 2, 2), new Object[]
		// {EmotionItems.terracottaCube, EmotionItems.terracottaCube,
		// EmotionItems.terracottaCube, EmotionItems.terracottaCube,
		// EmotionBlocks.terracotta});

		GameRegistry.addShapelessRecipe(new ItemStack(EmotionBlock.BRICK, 4, 3), new Object[]
		{ EmotionBlock.LIMESTONE, EmotionBlock.LIMESTONE, EmotionBlock.LIMESTONE, EmotionBlock.LIMESTONE });

		GameRegistry.addShapelessRecipe(new ItemStack(EmotionBlock.PLANKS, 1, 0), new Object[]
		{ EmotionBlock.CHERRY_STAIRS });
		GameRegistry.addShapelessRecipe(new ItemStack(EmotionBlock.PLANKS, 1, 1), new Object[]
		{ EmotionBlock.PEAR_STAIRS });
		GameRegistry.addShapelessRecipe(new ItemStack(EmotionBlock.PLANKS, 1, 2), new Object[]
		{ EmotionBlock.ORANGE_STAIRS });
		GameRegistry.addShapelessRecipe(new ItemStack(EmotionBlock.PLANKS, 1, 3), new Object[]
		{ EmotionBlock.ATLAS_STAIRS });
		GameRegistry.addShapelessRecipe(new ItemStack(EmotionBlock.PLANKS, 1, 4), new Object[]
		{ EmotionBlock.PINE_STAIRS });
		GameRegistry.addShapelessRecipe(new ItemStack(EmotionBlock.PLANKS, 1, 5), new Object[]
		{ EmotionBlock.COCO_STAIRS });
		GameRegistry.addShapelessRecipe(new ItemStack(EmotionBlock.PLANKS, 1, 6), new Object[]
		{ EmotionBlock.DREAM_STAIRS });

		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 0), new Object[]
		{ EmotionBlock.WHITE_CLAY_STAIRS });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 1), new Object[]
		{ EmotionBlock.ORANGE_CLAY_STAIRS });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 2), new Object[]
		{ EmotionBlock.MANGENTA_CLAY_STAIRS });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 3), new Object[]
		{ EmotionBlock.LIGHT_BLUE_CLAY_STAIRS });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 4), new Object[]
		{ EmotionBlock.YELLOW_CLAY_STAIRS });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 5), new Object[]
		{ EmotionBlock.LIME_CLAY_STAIRS });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 6), new Object[]
		{ EmotionBlock.PINK_CLAY_STAIRS });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 7), new Object[]
		{ EmotionBlock.GRAY_CLAY_STAIRS });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 8), new Object[]
		{ EmotionBlock.SILVER_CLAY_STAIRS });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 9), new Object[]
		{ EmotionBlock.CYAN_CLAY_STAIRS });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 10), new Object[]
		{ EmotionBlock.PURPLE_CLAY_STAIRS });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 11), new Object[]
		{ EmotionBlock.BLUE_CLAY_STAIRS });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 12), new Object[]
		{ EmotionBlock.BROWN_CLAY_STAIRS });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 13), new Object[]
		{ EmotionBlock.GREEN_CLAY_STAIRS });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 14), new Object[]
		{ EmotionBlock.RED_CLAY_STAIRS });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 15), new Object[]
		{ EmotionBlock.BLACK_CLAY_STAIRS });

		GameRegistry.addRecipe(new ItemStack(EmotionBlock.CHERRY_STAIRS, 4), new Object[]
		{ "Y  ", "YY ", "YYY", 'Y', new ItemStack(EmotionBlock.PLANKS, 1, 0) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlock.PEAR_STAIRS, 4), new Object[]
		{ "Y  ", "YY ", "YYY", 'Y', new ItemStack(EmotionBlock.PLANKS, 1, 1) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlock.ORANGE_STAIRS, 4), new Object[]
		{ "Y  ", "YY ", "YYY", 'Y', new ItemStack(EmotionBlock.PLANKS, 1, 2) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlock.ATLAS_STAIRS, 4), new Object[]
		{ "Y  ", "YY ", "YYY", 'Y', new ItemStack(EmotionBlock.PLANKS, 1, 3) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlock.PINE_STAIRS, 4), new Object[]
		{ "Y  ", "YY ", "YYY", 'Y', new ItemStack(EmotionBlock.PLANKS, 1, 4) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlock.COCO_STAIRS, 4), new Object[]
		{ "Y  ", "YY ", "YYY", 'Y', new ItemStack(EmotionBlock.PLANKS, 1, 5) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlock.DREAM_STAIRS, 4), new Object[]
		{ "Y  ", "YY ", "YYY", 'Y', new ItemStack(EmotionBlock.PLANKS, 1, 6) });

		GameRegistry.addRecipe(new ItemStack(EmotionBlock.WHITE_CLAY_STAIRS, 4), new Object[]
		{ "Y  ", "YY ", "YYY", 'Y', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 0) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlock.ORANGE_CLAY_STAIRS, 4), new Object[]
		{ "Y  ", "YY ", "YYY", 'Y', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 1) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlock.MANGENTA_CLAY_STAIRS, 4), new Object[]
		{ "Y  ", "YY ", "YYY", 'Y', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 2) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlock.LIGHT_BLUE_CLAY_STAIRS, 4), new Object[]
		{ "Y  ", "YY ", "YYY", 'Y', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 3) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlock.YELLOW_CLAY_STAIRS, 4), new Object[]
		{ "Y  ", "YY ", "YYY", 'Y', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 4) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlock.LIME_CLAY_STAIRS, 4), new Object[]
		{ "Y  ", "YY ", "YYY", 'Y', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 5) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlock.PINK_CLAY_STAIRS, 4), new Object[]
		{ "Y  ", "YY ", "YYY", 'Y', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 6) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlock.GRAY_CLAY_STAIRS, 4), new Object[]
		{ "Y  ", "YY ", "YYY", 'Y', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 7) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlock.SILVER_CLAY_STAIRS, 4), new Object[]
		{ "Y  ", "YY ", "YYY", 'Y', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 8) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlock.CYAN_CLAY_STAIRS, 4), new Object[]
		{ "Y  ", "YY ", "YYY", 'Y', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 9) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlock.PURPLE_CLAY_STAIRS, 4), new Object[]
		{ "Y  ", "YY ", "YYY", 'Y', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 10) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlock.BLUE_CLAY_STAIRS, 4), new Object[]
		{ "Y  ", "YY ", "YYY", 'Y', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 11) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlock.BROWN_CLAY_STAIRS, 4), new Object[]
		{ "Y  ", "YY ", "YYY", 'Y', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 12) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlock.GREEN_CLAY_STAIRS, 4), new Object[]
		{ "Y  ", "YY ", "YYY", 'Y', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 13) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlock.RED_CLAY_STAIRS, 4), new Object[]
		{ "Y  ", "YY ", "YYY", 'Y', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 14) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlock.BLACK_CLAY_STAIRS, 4), new Object[]
		{ "Y  ", "YY ", "YYY", 'Y', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 15) });

		GameRegistry.addRecipe(new ItemStack(EmotionBlock.CHERRY_FENCE, 3), new Object[]
		{ "YXY", "YXY", 'Y', new ItemStack(EmotionBlock.PLANKS, 1, 0), 'X', Items.STICK });
		GameRegistry.addRecipe(new ItemStack(EmotionBlock.PEAR_FENCE, 3), new Object[]
		{ "YXY", "YXY", 'Y', new ItemStack(EmotionBlock.PLANKS, 1, 1), 'X', Items.STICK });
		GameRegistry.addRecipe(new ItemStack(EmotionBlock.ORANGE_FENCE, 3), new Object[]
		{ "YXY", "YXY", 'Y', new ItemStack(EmotionBlock.PLANKS, 1, 2), 'X', Items.STICK });
		GameRegistry.addRecipe(new ItemStack(EmotionBlock.ATLAS_FENCE, 3), new Object[]
		{ "YXY", "YXY", 'Y', new ItemStack(EmotionBlock.PLANKS, 1, 3), 'X', Items.STICK });
		GameRegistry.addRecipe(new ItemStack(EmotionBlock.PINE_FENCE, 3), new Object[]
		{ "YXY", "YXY", 'Y', new ItemStack(EmotionBlock.PLANKS, 1, 4), 'X', Items.STICK });
		GameRegistry.addRecipe(new ItemStack(EmotionBlock.COCO_FENCE, 3), new Object[]
		{ "YXY", "YXY", 'Y', new ItemStack(EmotionBlock.PLANKS, 1, 5), 'X', Items.STICK });
		GameRegistry.addRecipe(new ItemStack(EmotionBlock.DREAM_FENCE, 3), new Object[]
		{ "YXY", "YXY", 'Y', new ItemStack(EmotionBlock.PLANKS, 1, 6), 'X', Items.STICK });

		GameRegistry.addRecipe(new ItemStack(EmotionBlock.CHERRY_FENCE_GATE, 1), new Object[]
		{ "XYX", "XYX", 'Y', new ItemStack(EmotionBlock.PLANKS, 1, 0), 'X', Items.STICK });
		GameRegistry.addRecipe(new ItemStack(EmotionBlock.PEAR_FENCE_GATE, 1), new Object[]
		{ "XYX", "XYX", 'Y', new ItemStack(EmotionBlock.PLANKS, 1, 1), 'X', Items.STICK });
		GameRegistry.addRecipe(new ItemStack(EmotionBlock.ORANGE_FENCE_GATE, 1), new Object[]
		{ "XYX", "XYX", 'Y', new ItemStack(EmotionBlock.PLANKS, 1, 2), 'X', Items.STICK });
		GameRegistry.addRecipe(new ItemStack(EmotionBlock.ATLAS_FENCE_GATE, 1), new Object[]
		{ "XYX", "XYX", 'Y', new ItemStack(EmotionBlock.PLANKS, 1, 3), 'X', Items.STICK });
		GameRegistry.addRecipe(new ItemStack(EmotionBlock.PINE_FENCE_GATE, 1), new Object[]
		{ "XYX", "XYX", 'Y', new ItemStack(EmotionBlock.PLANKS, 1, 4), 'X', Items.STICK });
		GameRegistry.addRecipe(new ItemStack(EmotionBlock.COCO_FENCE_GATE, 1), new Object[]
		{ "XYX", "XYX", 'Y', new ItemStack(EmotionBlock.PLANKS, 1, 5), 'X', Items.STICK });
		GameRegistry.addRecipe(new ItemStack(EmotionBlock.DREAM_FENCE_GATE, 1), new Object[]
		{ "XYX", "XYX", 'Y', new ItemStack(EmotionBlock.PLANKS, 1, 6), 'X', Items.STICK });

		GameRegistry.addRecipe(new ItemStack(EmotionItem.CHERRY_BOAT, 1), new Object[]
		{ "Y Y", "YYY", 'Y', new ItemStack(EmotionBlock.PLANKS, 1, 0) });
		GameRegistry.addRecipe(new ItemStack(EmotionItem.PEAR_BOAT, 1), new Object[]
		{ "Y Y", "YYY", 'Y', new ItemStack(EmotionBlock.PLANKS, 1, 1) });
		GameRegistry.addRecipe(new ItemStack(EmotionItem.ORANGE_BOAT, 1), new Object[]
		{ "Y Y", "YYY", 'Y', new ItemStack(EmotionBlock.PLANKS, 1, 2) });
		GameRegistry.addRecipe(new ItemStack(EmotionItem.ATLAS_BOAT, 1), new Object[]
		{ "Y Y", "YYY", 'Y', new ItemStack(EmotionBlock.PLANKS, 1, 3) });
		GameRegistry.addRecipe(new ItemStack(EmotionItem.PINE_BOAT, 1), new Object[]
		{ "Y Y", "YYY", 'Y', new ItemStack(EmotionBlock.PLANKS, 1, 4) });
		GameRegistry.addRecipe(new ItemStack(EmotionItem.COCO_BOAT, 1), new Object[]
		{ "Y Y", "YYY", 'Y', new ItemStack(EmotionBlock.PLANKS, 1, 5) });
		GameRegistry.addRecipe(new ItemStack(EmotionItem.DREAM_BOAT, 1), new Object[]
		{ "Y Y", "YYY", 'Y', new ItemStack(EmotionBlock.PLANKS, 1, 6) });

		GameRegistry.addRecipe(new ItemStack(EmotionItem.CHERRY_DOOR, 3), new Object[]
		{ " YY", " YY", " YY", 'Y', new ItemStack(EmotionBlock.PLANKS, 1, 0) });
		GameRegistry.addRecipe(new ItemStack(EmotionItem.PEAR_DOOR, 3), new Object[]
		{ " YY", " YY", " YY", 'Y', new ItemStack(EmotionBlock.PLANKS, 1, 1) });
		GameRegistry.addRecipe(new ItemStack(EmotionItem.ORANGE_DOOR, 3), new Object[]
		{ " YY", " YY", " YY", 'Y', new ItemStack(EmotionBlock.PLANKS, 1, 2) });
		GameRegistry.addRecipe(new ItemStack(EmotionItem.ATLAS_DOOR, 3), new Object[]
		{ " YY", " YY", " YY", 'Y', new ItemStack(EmotionBlock.PLANKS, 1, 3) });
		GameRegistry.addRecipe(new ItemStack(EmotionItem.PINE_DOOR, 3), new Object[]
		{ " YY", " YY", " YY", 'Y', new ItemStack(EmotionBlock.PLANKS, 1, 4) });
		GameRegistry.addRecipe(new ItemStack(EmotionItem.COCO_DOOR, 3), new Object[]
		{ " YY", " YY", " YY", 'Y', new ItemStack(EmotionBlock.PLANKS, 1, 5) });
		GameRegistry.addRecipe(new ItemStack(EmotionItem.DREAM_DOOR, 3), new Object[]
		{ " YY", " YY", " YY", 'Y', new ItemStack(EmotionBlock.PLANKS, 1, 6) });

		GameRegistry.addRecipe(new ItemStack(EmotionBlock.CHERRY_TRAPDOOR, 2), new Object[]
		{ "YYY", "YYY", 'Y', new ItemStack(EmotionBlock.PLANKS, 1, 0) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlock.PEAR_TRAPDOOR, 2), new Object[]
		{ "YYY", "YYY", 'Y', new ItemStack(EmotionBlock.PLANKS, 1, 1) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlock.ORANGE_TRAPDOOR, 2), new Object[]
		{ "YYY", "YYY", 'Y', new ItemStack(EmotionBlock.PLANKS, 1, 2) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlock.ATLAS_TRAPDOOR, 2), new Object[]
		{ "YYY", "YYY", 'Y', new ItemStack(EmotionBlock.PLANKS, 1, 3) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlock.PINE_TRAPDOOR, 2), new Object[]
		{ "YYY", "YYY", 'Y', new ItemStack(EmotionBlock.PLANKS, 1, 4) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlock.COCO_TRAPDOOR, 2), new Object[]
		{ "YYY", "YYY", 'Y', new ItemStack(EmotionBlock.PLANKS, 1, 5) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlock.DREAM_TRAPDOOR, 2), new Object[]
		{ "YYY", "YYY", 'Y', new ItemStack(EmotionBlock.PLANKS, 1, 6) });

		GameRegistry.addRecipe(new ItemStack(EmotionBlock.SPRUCE_TRAPDOOR, 2), new Object[]
		{ "YYY", "YYY", 'Y', new ItemStack(Blocks.PLANKS, 1, 1) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlock.BIRCH_TRAPDOOR, 2), new Object[]
		{ "YYY", "YYY", 'Y', new ItemStack(Blocks.PLANKS, 1, 2) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlock.JUNGLE_TRAPDOOR, 2), new Object[]
		{ "YYY", "YYY", 'Y', new ItemStack(Blocks.PLANKS, 1, 3) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlock.ACACIA_TRAPDOOR, 2), new Object[]
		{ "YYY", "YYY", 'Y', new ItemStack(Blocks.PLANKS, 1, 4) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlock.DARK_OAK_TRAPDOOR, 2), new Object[]
		{ "YYY", "YYY", 'Y', new ItemStack(Blocks.PLANKS, 1, 5) });

		GameRegistry.addShapelessRecipe(new ItemStack(EmotionBlock.PLANKS, 1, 0), new Object[]
		{ EmotionBlock.CHERRY_SLAB, EmotionBlock.CHERRY_SLAB });
		GameRegistry.addShapelessRecipe(new ItemStack(EmotionBlock.PLANKS, 1, 1), new Object[]
		{ EmotionBlock.PEAR_SLAB, EmotionBlock.PEAR_SLAB });
		GameRegistry.addShapelessRecipe(new ItemStack(EmotionBlock.PLANKS, 1, 2), new Object[]
		{ EmotionBlock.ORANGE_SLAB, EmotionBlock.ORANGE_SLAB });
		GameRegistry.addShapelessRecipe(new ItemStack(EmotionBlock.PLANKS, 1, 3), new Object[]
		{ EmotionBlock.ATLAS_SLAB, EmotionBlock.ATLAS_SLAB });
		GameRegistry.addShapelessRecipe(new ItemStack(EmotionBlock.PLANKS, 1, 4), new Object[]
		{ EmotionBlock.PINE_SLAB, EmotionBlock.PINE_SLAB });
		GameRegistry.addShapelessRecipe(new ItemStack(EmotionBlock.PLANKS, 1, 5), new Object[]
		{ EmotionBlock.COCO_SLAB, EmotionBlock.COCO_SLAB });
		GameRegistry.addShapelessRecipe(new ItemStack(EmotionBlock.PLANKS, 1, 6), new Object[]
		{ EmotionBlock.DREAM_SLAB, EmotionBlock.DREAM_SLAB });

		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 0), new Object[]
		{ EmotionBlock.WHITE_CLAY_SLAB, EmotionBlock.WHITE_CLAY_SLAB });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 1), new Object[]
		{ EmotionBlock.ORANGE_CLAY_SLAB, EmotionBlock.ORANGE_CLAY_SLAB });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 2), new Object[]
		{ EmotionBlock.MANGENTA_CLAY_SLAB, EmotionBlock.MANGENTA_CLAY_SLAB });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 3), new Object[]
		{ EmotionBlock.LIGHT_BLUE_CLAY_SLAB, EmotionBlock.LIGHT_BLUE_CLAY_SLAB });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 4), new Object[]
		{ EmotionBlock.YELLOW_CLAY_SLAB, EmotionBlock.YELLOW_CLAY_SLAB });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 5), new Object[]
		{ EmotionBlock.LIME_CLAY_SLAB, EmotionBlock.LIME_CLAY_SLAB });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 6), new Object[]
		{ EmotionBlock.PINK_CLAY_SLAB, EmotionBlock.PINK_CLAY_SLAB });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 7), new Object[]
		{ EmotionBlock.GRAY_CLAY_SLAB, EmotionBlock.GRAY_CLAY_SLAB });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 8), new Object[]
		{ EmotionBlock.SILVER_CLAY_SLAB, EmotionBlock.SILVER_CLAY_SLAB });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 9), new Object[]
		{ EmotionBlock.CYAN_CLAY_SLAB, EmotionBlock.CYAN_CLAY_SLAB });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 10), new Object[]
		{ EmotionBlock.PURPLE_CLAY_SLAB, EmotionBlock.PURPLE_CLAY_SLAB });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 11), new Object[]
		{ EmotionBlock.BLUE_CLAY_SLAB, EmotionBlock.BLUE_CLAY_SLAB });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 12), new Object[]
		{ EmotionBlock.BROWN_CLAY_SLAB, EmotionBlock.BROWN_CLAY_SLAB });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 13), new Object[]
		{ EmotionBlock.GREEN_CLAY_SLAB, EmotionBlock.GREEN_CLAY_SLAB });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 14), new Object[]
		{ EmotionBlock.RED_CLAY_SLAB, EmotionBlock.RED_CLAY_SLAB });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 15), new Object[]
		{ EmotionBlock.BLACK_CLAY_SLAB, EmotionBlock.BLACK_CLAY_SLAB });

		GameRegistry.addRecipe(new ItemStack(EmotionBlock.CHERRY_SLAB, 6), new Object[]
		{ "YYY", 'Y', new ItemStack(EmotionBlock.PLANKS, 1, 0) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlock.PEAR_SLAB, 6), new Object[]
		{ "YYY", 'Y', new ItemStack(EmotionBlock.PLANKS, 1, 1) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlock.ORANGE_SLAB, 6), new Object[]
		{ "YYY", 'Y', new ItemStack(EmotionBlock.PLANKS, 1, 2) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlock.ATLAS_SLAB, 6), new Object[]
		{ "YYY", 'Y', new ItemStack(EmotionBlock.PLANKS, 1, 3) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlock.PINE_SLAB, 6), new Object[]
		{ "YYY", 'Y', new ItemStack(EmotionBlock.PLANKS, 1, 4) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlock.COCO_SLAB, 6), new Object[]
		{ "YYY", 'Y', new ItemStack(EmotionBlock.PLANKS, 1, 5) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlock.DREAM_SLAB, 6), new Object[]
		{ "YYY", 'Y', new ItemStack(EmotionBlock.PLANKS, 1, 6) });

		GameRegistry.addRecipe(new ItemStack(EmotionBlock.WHITE_CLAY_SLAB, 6), new Object[]
		{ "YYY", 'Y', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 0) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlock.ORANGE_CLAY_SLAB, 6), new Object[]
		{ "YYY", 'Y', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 1) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlock.MANGENTA_CLAY_SLAB, 6), new Object[]
		{ "YYY", 'Y', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 2) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlock.LIGHT_BLUE_CLAY_SLAB, 6), new Object[]
		{ "YYY", 'Y', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 3) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlock.YELLOW_CLAY_SLAB, 6), new Object[]
		{ "YYY", 'Y', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 4) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlock.LIME_CLAY_SLAB, 6), new Object[]
		{ "YYY", 'Y', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 5) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlock.PINK_CLAY_SLAB, 6), new Object[]
		{ "YYY", 'Y', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 6) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlock.GRAY_CLAY_SLAB, 6), new Object[]
		{ "YYY", 'Y', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 7) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlock.SILVER_CLAY_SLAB, 6), new Object[]
		{ "YYY", 'Y', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 8) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlock.CYAN_CLAY_SLAB, 6), new Object[]
		{ "YYY", 'Y', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 9) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlock.PURPLE_CLAY_SLAB, 6), new Object[]
		{ "YYY", 'Y', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 10) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlock.BLUE_CLAY_SLAB, 6), new Object[]
		{ "YYY", 'Y', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 11) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlock.BROWN_CLAY_SLAB, 6), new Object[]
		{ "YYY", 'Y', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 12) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlock.GREEN_CLAY_SLAB, 6), new Object[]
		{ "YYY", 'Y', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 13) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlock.RED_CLAY_SLAB, 6), new Object[]
		{ "YYY", 'Y', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 14) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlock.BLACK_CLAY_SLAB, 6), new Object[]
		{ "YYY", 'Y', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 15) });

		normalCraft();
		extraCraft();
	}

	private static void addSmeltingRecipes()
	{
		GameRegistry.addSmelting(Items.WATER_BUCKET, new ItemStack(EmotionItem.SALT, 4), 0.5F);
		GameRegistry.addSmelting(Items.SUGAR, new ItemStack(EmotionItem.TOFFEE_CUBE), 0.2F);
		GameRegistry.addSmelting(EmotionItem.WILDBOAR_RAW, new ItemStack(EmotionItem.WILDBOAR_COOKED), 0.2F);
		GameRegistry.addSmelting(EmotionItem.FISH_TROUT_RAW, new ItemStack(EmotionItem.FISH_TROUT_COOKED), 0.2F);
		GameRegistry.addSmelting(EmotionItem.FISH_BASS_RAW, new ItemStack(EmotionItem.FISH_BASS_COOKED), 0.2F);
		GameRegistry.addSmelting(EmotionItem.FISH_SARDINE_RAW, new ItemStack(EmotionItem.FISH_SARDINE_COOKED), 0.2F);
		GameRegistry.addSmelting(EmotionItem.FISH_MACKEREL_RAW, new ItemStack(EmotionItem.FISH_MACKEREL_COOKED), 0.2F);
		GameRegistry.addSmelting(EmotionItem.FISH_WHITING_RAW, new ItemStack(EmotionItem.FISH_WHITING_COOKED), 0.2F);
		GameRegistry.addSmelting(EmotionItem.FISH_GOLDEN, new ItemStack(Items.GOLD_INGOT, 4), 0.8F);
		GameRegistry.addSmelting(EmotionItem.FISH_DIAMOND, new ItemStack(Items.DIAMOND, 2), 0.8F);

		GameRegistry.addSmelting(EmotionBlock.LOG, new ItemStack(Items.COAL, 1, 1), 0.2F);
		GameRegistry.addSmelting(EmotionBlock.NEW_LOG, new ItemStack(Items.COAL, 1, 1), 0.2F);
		GameRegistry.addSmelting(EmotionBlock.SHIFTING_SAND, new ItemStack(Item.getItemFromBlock(Blocks.SAND)), 0.2F);

		GameRegistry.registerFuelHandler(new EmotionFuelHandler());
	}

	public static void normalCraft()
	{
		GameRegistry.addShapelessRecipe(new ItemStack(EmotionBlock.PLANKS, 4, 0), new Object[]
		{ new ItemStack(EmotionBlock.LOG, 1, 0) });
		GameRegistry.addShapelessRecipe(new ItemStack(EmotionBlock.PLANKS, 4, 1), new Object[]
		{ new ItemStack(EmotionBlock.LOG, 1, 1) });
		GameRegistry.addShapelessRecipe(new ItemStack(EmotionBlock.PLANKS, 4, 2), new Object[]
		{ new ItemStack(EmotionBlock.LOG, 1, 2) });
		GameRegistry.addShapelessRecipe(new ItemStack(EmotionBlock.PLANKS, 4, 3), new Object[]
		{ new ItemStack(EmotionBlock.LOG, 1, 3) });
		GameRegistry.addShapelessRecipe(new ItemStack(EmotionBlock.PLANKS, 4, 4), new Object[]
		{ new ItemStack(EmotionBlock.NEW_LOG, 1, 0) });
		GameRegistry.addShapelessRecipe(new ItemStack(EmotionBlock.PLANKS, 4, 5), new Object[]
		{ new ItemStack(EmotionBlock.NEW_LOG, 1, 1) });
		GameRegistry.addShapelessRecipe(new ItemStack(EmotionBlock.PLANKS, 4, 6), new Object[]
		{ new ItemStack(EmotionBlock.NEW_LOG, 1, 2) });

		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOODEN_BUTTON, 1), new Object[]
		{ EmotionBlock.PLANKS });

		GameRegistry.addRecipe(new ItemStack(Blocks.CRAFTING_TABLE, 1), new Object[]
		{ " YY", " YY", 'Y', EmotionBlock.PLANKS });
		GameRegistry.addRecipe(new ItemStack(Items.STICK, 4), new Object[]
		{ "Y", "Y", 'Y', EmotionBlock.PLANKS });

		GameRegistry.addRecipe(new ItemStack(Items.WOODEN_AXE, 1), new Object[]
		{ "YY ", "YX ", " X ", 'Y', EmotionBlock.PLANKS, 'X', Items.STICK });
		GameRegistry.addRecipe(new ItemStack(Items.WOODEN_HOE, 1), new Object[]
		{ "YY ", " X ", " X ", 'Y', EmotionBlock.PLANKS, 'X', Items.STICK });
		GameRegistry.addRecipe(new ItemStack(Items.WOODEN_PICKAXE, 1), new Object[]
		{ "YYY", " X ", " X ", 'Y', EmotionBlock.PLANKS, 'X', Items.STICK });
		GameRegistry.addRecipe(new ItemStack(Items.WOODEN_SHOVEL, 1), new Object[]
		{ " Y ", " X ", " X ", 'Y', EmotionBlock.PLANKS, 'X', Items.STICK });
		GameRegistry.addRecipe(new ItemStack(Items.WOODEN_SWORD, 1), new Object[]
		{ " Y ", " Y ", " X ", 'Y', EmotionBlock.PLANKS, 'X', Items.STICK });

		GameRegistry.addRecipe(new ItemStack(Blocks.CHEST, 1), new Object[]
		{ "YYY", "Y Y", "YYY", 'Y', EmotionBlock.PLANKS });
		GameRegistry.addRecipe(new ItemStack(Blocks.WOODEN_PRESSURE_PLATE, 1), new Object[]
		{ " YY", 'Y', EmotionBlock.PLANKS });
		GameRegistry.addRecipe(new ItemStack(Blocks.BOOKSHELF, 1), new Object[]
		{ "YYY", "XXX", "YYY", 'Y', EmotionBlock.PLANKS, 'X', Items.BOOK });
		GameRegistry.addRecipe(new ItemStack(Blocks.JUKEBOX, 1), new Object[]
		{ "YYY", "YXY", "YYY", 'Y', EmotionBlock.PLANKS, 'X', Items.DIAMOND });
		GameRegistry.addRecipe(new ItemStack(Blocks.NOTEBLOCK, 1), new Object[]
		{ "YYY", "YXY", "YYY", 'Y', EmotionBlock.PLANKS, 'X', Items.REDSTONE });
		GameRegistry.addRecipe(new ItemStack(Blocks.TRIPWIRE_HOOK, 1), new Object[]
		{ " Z ", " X ", " Y ", 'Y', EmotionBlock.PLANKS, 'X', Items.STICK, 'Z', Items.IRON_INGOT });
		GameRegistry.addRecipe(new ItemStack(Blocks.PISTON, 1), new Object[]
		{ "YYY", "ZXZ", "ZWZ", 'Y', EmotionBlock.PLANKS, 'X', Items.IRON_INGOT, 'Z', Blocks.COBBLESTONE, 'W', Items.REDSTONE });

		GameRegistry.addRecipe(new ItemStack(Items.SIGN, 3), new Object[]
		{ "YYY", "YYY", " X ", 'Y', EmotionBlock.PLANKS, 'X', Items.STICK });
		GameRegistry.addRecipe(new ItemStack(Items.PAINTING, 1), new Object[]
		{ "YYY", "YXY", "YYY", 'Y', EmotionBlock.PLANKS, 'X', Blocks.WOOL });
		GameRegistry.addRecipe(new ItemStack(Items.BED, 1), new Object[]
		{ "XXX", "YYY", 'Y', EmotionBlock.PLANKS, 'X', Blocks.WOOL });
		GameRegistry.addRecipe(new ItemStack(Items.BOWL, 1), new Object[]
		{ "Y Y", " Y ", 'Y', EmotionBlock.PLANKS });
	}

	public static void extraCraft()
	{
		GameRegistry.addShapelessRecipe(new ItemStack(Items.STICK, 2), new Object[]
		{ Blocks.LADDER });

		// Stairs
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.PLANKS, 1, 0), new Object[]
		{ Blocks.OAK_STAIRS });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.PLANKS, 1, 1), new Object[]
		{ Blocks.SPRUCE_STAIRS });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.PLANKS, 1, 2), new Object[]
		{ Blocks.BIRCH_STAIRS });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.PLANKS, 1, 3), new Object[]
		{ Blocks.JUNGLE_STAIRS });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.PLANKS, 1, 4), new Object[]
		{ Blocks.ACACIA_STAIRS });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.PLANKS, 1, 5), new Object[]
		{ Blocks.DARK_OAK_STAIRS });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.COBBLESTONE, 1, 0), new Object[]
		{ Blocks.STONE_STAIRS });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.BRICK_BLOCK, 1, 0), new Object[]
		{ Blocks.BRICK_STAIRS });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.STONEBRICK, 1, 0), new Object[]
		{ Blocks.STONE_BRICK_STAIRS });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.NETHER_BRICK, 1, 0), new Object[]
		{ Blocks.NETHER_BRICK_STAIRS });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.SANDSTONE, 1, 0), new Object[]
		{ Blocks.SANDSTONE_STAIRS });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.QUARTZ_BLOCK, 1, 0), new Object[]
		{ Blocks.QUARTZ_STAIRS });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.RED_SANDSTONE, 1, 0), new Object[]
		{ Blocks.RED_SANDSTONE_STAIRS });

		// Slab
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.PLANKS, 2, 0), new Object[]
		{ new ItemStack(Blocks.WOODEN_SLAB, 1), new ItemStack(Blocks.WOODEN_SLAB, 1) });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.PLANKS, 2, 1), new Object[]
		{ new ItemStack(Blocks.WOODEN_SLAB, 1, 1), new ItemStack(Blocks.WOODEN_SLAB, 1, 1) });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.PLANKS, 2, 2), new Object[]
		{ new ItemStack(Blocks.WOODEN_SLAB, 1, 2), new ItemStack(Blocks.WOODEN_SLAB, 1, 2) });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.PLANKS, 2, 3), new Object[]
		{ new ItemStack(Blocks.WOODEN_SLAB, 1, 3), new ItemStack(Blocks.WOODEN_SLAB, 1, 3) });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.PLANKS, 2, 4), new Object[]
		{ new ItemStack(Blocks.WOODEN_SLAB, 1, 4), new ItemStack(Blocks.WOODEN_SLAB, 1, 4) });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.PLANKS, 2, 5), new Object[]
		{ new ItemStack(Blocks.WOODEN_SLAB, 1, 5), new ItemStack(Blocks.WOODEN_SLAB, 1, 5) });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.STONE, 2, 0), new Object[]
		{ new ItemStack(Blocks.STONE_SLAB, 1, 0), new ItemStack(Blocks.STONE_SLAB, 1, 0) });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.SANDSTONE, 2, 0), new Object[]
		{ new ItemStack(Blocks.STONE_SLAB, 1, 1), new ItemStack(Blocks.STONE_SLAB, 1, 1) });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.COBBLESTONE, 2, 0), new Object[]
		{ new ItemStack(Blocks.STONE_SLAB, 1, 3), new ItemStack(Blocks.STONE_SLAB, 1, 3) });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.BRICK_BLOCK, 2, 0), new Object[]
		{ new ItemStack(Blocks.STONE_SLAB, 1, 4), new ItemStack(Blocks.STONE_SLAB, 1, 4) });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.STONEBRICK, 2, 0), new Object[]
		{ new ItemStack(Blocks.STONE_SLAB, 1, 5), new ItemStack(Blocks.STONE_SLAB, 1, 5) });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.NETHER_BRICK, 2, 0), new Object[]
		{ new ItemStack(Blocks.STONE_SLAB, 1, 6), new ItemStack(Blocks.STONE_SLAB, 1, 6) });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.QUARTZ_BLOCK, 2, 0), new Object[]
		{ new ItemStack(Blocks.STONE_SLAB, 1, 7), new ItemStack(Blocks.STONE_SLAB, 1, 7) });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.RED_SANDSTONE, 2, 0), new Object[]
		{ new ItemStack(Blocks.STONE_SLAB2, 1, 0), new ItemStack(Blocks.STONE_SLAB2, 1, 0) });
	}
}
