package emotionfox.emomod.init;

import emotionfox.emomod.handler.EmotionFuelHandler;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
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
		ItemStack applePot = new ItemStack(EmotionBlocks.POT, 1, 0);
		ItemStack blackCurrantPot = new ItemStack(EmotionBlocks.POT, 1, 1);
		ItemStack blueberryPot = new ItemStack(EmotionBlocks.POT, 1, 2);
		ItemStack cherryPot = new ItemStack(EmotionBlocks.POT, 1, 3);
		ItemStack chocolatePot = new ItemStack(EmotionBlocks.POT, 1, 4);
		ItemStack orangePot = new ItemStack(EmotionBlocks.POT, 1, 5);
		ItemStack pearPot = new ItemStack(EmotionBlocks.POT, 1, 6);
		ItemStack redCurrantPot = new ItemStack(EmotionBlocks.POT, 1, 7);
		ItemStack strawberryPot = new ItemStack(EmotionBlocks.POT, 1, 8);
		ItemStack dreamCurrantPot = new ItemStack(EmotionBlocks.POT, 1, 9);
		ItemStack glassPot = new ItemStack(EmotionBlocks.POT, 1, 10);

		ItemStack slicePear = new ItemStack(EmotionItems.SLICE, 1, 0);
		ItemStack sliceCherry = new ItemStack(EmotionItems.SLICE, 1, 1);
		ItemStack sliceOrange = new ItemStack(EmotionItems.SLICE, 1, 2);
		ItemStack sliceApple = new ItemStack(EmotionItems.SLICE, 1, 3);
		ItemStack sliceBlueberry = new ItemStack(EmotionItems.SLICE, 1, 4);
		ItemStack sliceRedcurrant = new ItemStack(EmotionItems.SLICE, 1, 5);
		ItemStack sliceBlackcurrant = new ItemStack(EmotionItems.SLICE, 1, 6);
		ItemStack sliceStrawberry = new ItemStack(EmotionItems.SLICE, 1, 7);
		ItemStack sliceDreamcurrant = new ItemStack(EmotionItems.SLICE, 1, 8);
		ItemStack sliceChocolate = new ItemStack(EmotionItems.SLICE, 1, 9);
		ItemStack sliceBread = new ItemStack(EmotionItems.SLICE, 1, 10);

		// Ores +
		ItemStack bluePurpura = new ItemStack(EmotionItems.PURPURA_BLUE_SWORD, 1, 0);
		bluePurpura.addEnchantment(Enchantment.getEnchantmentByID(16), 2);
		bluePurpura.addEnchantment(Enchantment.getEnchantmentByID(21), 1);

		ItemStack redPurpura = new ItemStack(EmotionItems.PURPURA_RED_SWORD, 1, 0);
		redPurpura.addEnchantment(EmotionEnchantment.BLOOD_SUCKING, 2);
		redPurpura.addEnchantment(Enchantment.getEnchantmentByID(21), 1);

		// Flowers+
		ItemStack kittyStack = new ItemStack(EmotionBlocks.FLOWER, 1, 0);
		ItemStack noxStack = new ItemStack(EmotionBlocks.FLOWER, 1, 1);
		ItemStack delyStack = new ItemStack(EmotionBlocks.FLOWER, 1, 2);
		ItemStack gnonStack = new ItemStack(EmotionBlocks.FLOWER, 1, 3);
		ItemStack centusStack = new ItemStack(EmotionBlocks.FLOWER, 1, 5);
		ItemStack thornyStack = new ItemStack(EmotionBlocks.FLOWER, 1, 4);

		// Biomes +
		ItemStack redBrick = new ItemStack(EmotionBlocks.BRICK, 1, 0);
		ItemStack greenBrick = new ItemStack(EmotionBlocks.BRICK, 1, 1);
		ItemStack blueBrick = new ItemStack(EmotionBlocks.BRICK, 1, 2);

		// Ores +
		GameRegistry.addRecipe(new ItemStack(EmotionBlocks.PURPURA_BLOCK, 1), new Object[]
		{ "YYY", "YYY", "YYY", 'Y', EmotionItems.PURPURA_SHARD });
		GameRegistry.addShapelessRecipe(new ItemStack(EmotionItems.PURPURA_SHARD, 9), new Object[]
		{ EmotionBlocks.PURPURA_BLOCK });

		GameRegistry.addRecipe(new ItemStack(EmotionItems.PURPURA_AXE, 1), new Object[]
		{ "YY ", "YX ", " X ", 'Y', EmotionItems.PURPURA_SHARD, 'X', Items.IRON_INGOT });
		GameRegistry.addRecipe(new ItemStack(EmotionItems.PURPURA_HOE, 1), new Object[]
		{ "YY ", " X ", " X ", 'Y', EmotionItems.PURPURA_SHARD, 'X', Items.IRON_INGOT });
		GameRegistry.addRecipe(new ItemStack(EmotionItems.PURPURA_PICKAXE, 1), new Object[]
		{ "YYY", " X ", " X ", 'Y', EmotionItems.PURPURA_SHARD, 'X', Items.IRON_INGOT });
		GameRegistry.addRecipe(new ItemStack(EmotionItems.PURPURA_SHOVEL, 1), new Object[]
		{ " Y ", " X ", " X ", 'Y', EmotionItems.PURPURA_SHARD, 'X', Items.IRON_INGOT });
		GameRegistry.addRecipe(new ItemStack(EmotionItems.PURPURA_SWORD, 1), new Object[]
		{ " Y ", " Y ", " X ", 'Y', EmotionItems.PURPURA_SHARD, 'X', Items.IRON_INGOT });
		GameRegistry.addRecipe(bluePurpura, new Object[]
		{ "ZY ", "ZY ", " X ", 'Z', Items.DIAMOND, 'Y', EmotionItems.PURPURA_SHARD, 'X', Items.IRON_INGOT });
		GameRegistry.addShapelessRecipe(bluePurpura, new Object[]
		{ EmotionItems.PURPURA_SWORD, Items.DIAMOND, Items.DIAMOND });
		GameRegistry.addRecipe(redPurpura, new Object[]
		{ "ZY ", "ZY ", " X ", 'Z', Items.REDSTONE, 'Y', EmotionItems.PURPURA_SHARD, 'X', Items.IRON_INGOT });
		GameRegistry.addShapelessRecipe(redPurpura, new Object[]
		{ EmotionItems.PURPURA_SWORD, Items.REDSTONE, Items.REDSTONE });

		GameRegistry.addRecipe(new ItemStack(EmotionItems.FOSSIL_AXE, 1), new Object[]
		{ "YY ", "YX ", " X ", 'Y', EmotionItems.FOSSIL, 'X', Items.STICK });
		GameRegistry.addRecipe(new ItemStack(EmotionItems.FOSSIL_HOE, 1), new Object[]
		{ "YY ", " X ", " X ", 'Y', EmotionItems.FOSSIL, 'X', Items.STICK });
		GameRegistry.addRecipe(new ItemStack(EmotionItems.FOSSIL_PICKAXE, 1), new Object[]
		{ "YYY", " X ", " X ", 'Y', EmotionItems.FOSSIL, 'X', Items.STICK });
		GameRegistry.addRecipe(new ItemStack(EmotionItems.FOSSIL_SHOVEL, 1), new Object[]
		{ " Y ", " X ", " X ", 'Y', EmotionItems.FOSSIL, 'X', Items.STICK });
		GameRegistry.addRecipe(new ItemStack(EmotionItems.FOSSIL_SWORD, 1), new Object[]
		{ " Y ", " Y ", " X ", 'Y', EmotionItems.FOSSIL, 'X', Items.STICK });

		GameRegistry.addRecipe(new ItemStack(EmotionBlocks.VIRIDIS_BLOCK, 1), new Object[]
		{ "YYY", "YYY", "YYY", 'Y', EmotionItems.VIRIDIS_CRISTAL });
		GameRegistry.addShapelessRecipe(new ItemStack(EmotionItems.VIRIDIS_CRISTAL, 9), new Object[]
		{ EmotionBlocks.VIRIDIS_BLOCK });

		GameRegistry.addRecipe(new ItemStack(EmotionItems.VIRIDIS_HELMET, 1), new Object[]
		{ "YZY", "Z Z", 'Y', Items.IRON_INGOT, 'Z', EmotionItems.VIRIDIS_CRISTAL });
		GameRegistry.addRecipe(new ItemStack(EmotionItems.VIRIDIS_CHESTPLATE, 1), new Object[]
		{ "Y Y", "ZZZ", "YZY", 'Y', Items.IRON_INGOT, 'Z', EmotionItems.VIRIDIS_CRISTAL });
		GameRegistry.addRecipe(new ItemStack(EmotionItems.VIRIDIS_LEGGINGS, 1), new Object[]
		{ "ZYZ", "Z Z", "Y Y", 'Y', Items.IRON_INGOT, 'Z', EmotionItems.VIRIDIS_CRISTAL });
		GameRegistry.addRecipe(new ItemStack(EmotionItems.VIRIDIS_BOOTS, 1), new Object[]
		{ "Z Z", "Y Y", 'Y', Items.IRON_INGOT, 'Z', EmotionItems.VIRIDIS_CRISTAL });

		GameRegistry.addRecipe(new ItemStack(EmotionBlocks.LUME_BLOCK, 1), new Object[]
		{ "YYY", "YYY", "YYY", 'Y', EmotionItems.LUME_STONE });
		GameRegistry.addRecipe(new ItemStack(Item.getItemFromBlock(Blocks.TORCH), 8), new Object[]
		{ " Y ", " X ", 'Y', EmotionItems.LUME_STONE, 'X', Items.STICK });
		GameRegistry.addShapelessRecipe(new ItemStack(EmotionItems.LUME_STONE, 9), new Object[]
		{ EmotionBlocks.LUME_BLOCK });

		GameRegistry.addRecipe(new ItemStack(EmotionItems.STAFF_BLUE, 1), new Object[]
		{ "XYZ", " W ", " W ", 'X', Items.ENDER_EYE, 'Y', EmotionItems.PURPURA_SHARD, 'Z', lapisStack, 'W', Items.IRON_INGOT });
		GameRegistry.addShapelessRecipe(new ItemStack(EmotionItems.STAFF_BLUE, 1), new Object[]
		{ EmotionItems.STAFF_WHITE, lapisStack });
		GameRegistry.addRecipe(new ItemStack(EmotionItems.STAFF_GREEN, 1), new Object[]
		{ "XYZ", " W ", " W ", 'X', Items.ENDER_EYE, 'Y', EmotionItems.PURPURA_SHARD, 'Z', Items.EMERALD, 'W', Items.IRON_INGOT });
		GameRegistry.addShapelessRecipe(new ItemStack(EmotionItems.STAFF_GREEN, 1), new Object[]
		{ EmotionItems.STAFF_WHITE, Items.EMERALD });
		GameRegistry.addRecipe(new ItemStack(EmotionItems.STAFF_RED, 1), new Object[]
		{ "XYZ", " W ", " W ", 'X', Items.ENDER_EYE, 'Y', EmotionItems.PURPURA_SHARD, 'Z', Items.REDSTONE, 'W', Items.IRON_INGOT });
		GameRegistry.addShapelessRecipe(new ItemStack(EmotionItems.STAFF_RED, 1), new Object[]
		{ EmotionItems.STAFF_WHITE, Items.REDSTONE });
		GameRegistry.addRecipe(new ItemStack(EmotionItems.STAFF_WHITE, 1), new Object[]
		{ "XYW", " W ", " W ", 'X', Items.ENDER_EYE, 'Y', EmotionItems.PURPURA_SHARD, 'W', Items.IRON_INGOT });

		GameRegistry.addRecipe(new ItemStack(EmotionItems.STAFF_DREAM, 1), new Object[]
		{ "XYZ", " W ", " W ", 'X', Items.ENDER_EYE, 'Y', EmotionItems.PURPURA_SHARD, 'Z', EmotionItems.DREAM_STONE, 'W', Items.IRON_INGOT });
		GameRegistry.addShapelessRecipe(new ItemStack(EmotionItems.STAFF_DREAM), new Object[]
		{ EmotionItems.STAFF_WHITE, EmotionItems.DREAM_STONE });

		GameRegistry.addShapelessRecipe(new ItemStack(EmotionItems.DREAM_STONE), new Object[]
		{ Items.DIAMOND, lapisStack, Items.REDSTONE, Items.EMERALD });

		GameRegistry.addShapelessRecipe(new ItemStack(EmotionItems.AMULET_BLUE), new Object[]
		{ Items.STRING, Items.STRING, lapisStack, EmotionItems.PURPURA_SHARD, EmotionItems.PURPURA_SHARD });
		GameRegistry.addShapelessRecipe(new ItemStack(EmotionItems.AMULET_BLUE), new Object[]
		{ EmotionItems.AMULET_WHITE, lapisStack });
		GameRegistry.addShapelessRecipe(new ItemStack(EmotionItems.AMULET_GREEN), new Object[]
		{ Items.STRING, Items.STRING, Items.EMERALD, EmotionItems.PURPURA_SHARD, EmotionItems.PURPURA_SHARD });
		GameRegistry.addShapelessRecipe(new ItemStack(EmotionItems.AMULET_GREEN), new Object[]
		{ EmotionItems.AMULET_WHITE, Items.EMERALD });
		GameRegistry.addShapelessRecipe(new ItemStack(EmotionItems.AMULET_RED), new Object[]
		{ Items.STRING, Items.STRING, Items.REDSTONE, EmotionItems.PURPURA_SHARD, EmotionItems.PURPURA_SHARD });
		GameRegistry.addShapelessRecipe(new ItemStack(EmotionItems.AMULET_RED), new Object[]
		{ EmotionItems.AMULET_WHITE, Items.REDSTONE });
		GameRegistry.addShapelessRecipe(new ItemStack(EmotionItems.AMULET_WHITE), new Object[]
		{ Items.STRING, Items.STRING, Items.IRON_INGOT, EmotionItems.PURPURA_SHARD, EmotionItems.PURPURA_SHARD });

		GameRegistry.addShapelessRecipe(new ItemStack(EmotionItems.AMULET_BLUE), new Object[]
		{ EmotionItems.AMULET_BLUE_BROKEN, EmotionItems.SPORE_MAGIC, EmotionItems.SPORE_MAGIC });
		GameRegistry.addShapelessRecipe(new ItemStack(EmotionItems.AMULET_GREEN), new Object[]
		{ EmotionItems.AMULET_GREEN_BROKEN, EmotionItems.SPORE_MAGIC, EmotionItems.SPORE_MAGIC });
		GameRegistry.addShapelessRecipe(new ItemStack(EmotionItems.AMULET_RED), new Object[]
		{ EmotionItems.AMULET_RED_BROKEN, EmotionItems.SPORE_MAGIC, EmotionItems.SPORE_MAGIC });
		GameRegistry.addShapelessRecipe(new ItemStack(EmotionItems.AMULET_WHITE), new Object[]
		{ EmotionItems.AMULET_WHITE_BROKEN, EmotionItems.SPORE_MAGIC, EmotionItems.SPORE_MAGIC });

		GameRegistry.addRecipe(new ItemStack(EmotionItems.PURPURA_RING), new Object[]
		{ " X ", "YZY", " Y ", 'X', EmotionItems.PURPURA_SHARD, 'Y', Items.IRON_INGOT, 'Z', Items.DIAMOND });
		// GameRegistry.addRecipe(new ItemStack(EmotionItems.purpuraBag), new
		// Object[] {" Y ", "YXY", " Y ", 'X', EmotionItems.PURPURA_SHARD, 'Y',
		// Items.leather});

		GameRegistry.addShapelessRecipe(new ItemStack(EmotionItems.KNIFE), new Object[]
		{ Items.STICK, EmotionItems.HORN });
		GameRegistry.addShapelessRecipe(new ItemStack(Items.PAPER), new Object[]
		{ EmotionItems.BANDAGE });
		GameRegistry.addRecipe(new ItemStack(EmotionItems.BUTTERFLY_NET, 1), new Object[]
		{ "YYY", "YWY", " W ", 'Y', Items.STRING, 'W', Items.STICK });

		// Foods +
		GameRegistry.addShapelessRecipe(new ItemStack(EmotionItems.SEED_PEAR, 2), new Object[]
		{ EmotionItems.FRUIT_PEAR });
		GameRegistry.addShapelessRecipe(new ItemStack(EmotionItems.SEED_CHERRY, 2), new Object[]
		{ EmotionItems.FRUIT_CHERRY });
		GameRegistry.addShapelessRecipe(new ItemStack(EmotionItems.SEED_ORANGE, 2), new Object[]
		{ EmotionItems.FRUIT_ORANGE });
		GameRegistry.addShapelessRecipe(new ItemStack(EmotionItems.SEED_TOMATO, 2), new Object[]
		{ EmotionItems.FRUIT_TOMATO });
		GameRegistry.addShapelessRecipe(new ItemStack(EmotionItems.SEED_APPLE, 2), new Object[]
		{ Items.APPLE });

		GameRegistry.addShapelessRecipe(applePot, new Object[]
		{ glassPot, Items.APPLE, Items.APPLE, Items.APPLE, Items.SUGAR });
		GameRegistry.addShapelessRecipe(blackCurrantPot, new Object[]
		{ glassPot, EmotionItems.BERRY_BLACKCURRANT, EmotionItems.BERRY_BLACKCURRANT, EmotionItems.BERRY_BLACKCURRANT, Items.SUGAR });
		GameRegistry.addShapelessRecipe(blueberryPot, new Object[]
		{ glassPot, EmotionItems.BERRY_BLUEBERRY, EmotionItems.BERRY_BLUEBERRY, EmotionItems.BERRY_BLUEBERRY, Items.SUGAR });
		GameRegistry.addShapelessRecipe(cherryPot, new Object[]
		{ glassPot, EmotionItems.FRUIT_CHERRY, EmotionItems.FRUIT_CHERRY, EmotionItems.FRUIT_CHERRY, Items.SUGAR });
		GameRegistry.addShapelessRecipe(chocolatePot, new Object[]
		{ glassPot, cocoaStack, cocoaStack, cocoaStack, Items.SUGAR });
		GameRegistry.addShapelessRecipe(orangePot, new Object[]
		{ glassPot, EmotionItems.FRUIT_ORANGE, EmotionItems.FRUIT_ORANGE, EmotionItems.FRUIT_ORANGE, Items.SUGAR });
		GameRegistry.addShapelessRecipe(pearPot, new Object[]
		{ glassPot, EmotionItems.FRUIT_PEAR, EmotionItems.FRUIT_PEAR, EmotionItems.FRUIT_PEAR, Items.SUGAR });
		GameRegistry.addShapelessRecipe(redCurrantPot, new Object[]
		{ glassPot, EmotionItems.BERRY_REDCURRANT, EmotionItems.BERRY_REDCURRANT, EmotionItems.BERRY_REDCURRANT, Items.SUGAR });
		GameRegistry.addShapelessRecipe(strawberryPot, new Object[]
		{ glassPot, EmotionItems.BERRY_STRAWBERRY, EmotionItems.BERRY_STRAWBERRY, EmotionItems.BERRY_STRAWBERRY, Items.SUGAR });
		GameRegistry.addShapelessRecipe(dreamCurrantPot, new Object[]
		{ glassPot, EmotionItems.BERRY_DREAMCURRANT, EmotionItems.BERRY_DREAMCURRANT, EmotionItems.BERRY_DREAMCURRANT, Items.SUGAR });
		GameRegistry.addRecipe(glassPot, new Object[]
		{ "YXY", "Y Y", "YYY", 'X', Blocks.PLANKS, 'Y', Blocks.GLASS });
		GameRegistry.addRecipe(glassPot, new Object[]
		{ "YXY", "Y Y", "YYY", 'X', EmotionBlocks.PLANKS, 'Y', Blocks.GLASS });

		GameRegistry.addShapelessRecipe(new ItemStack(EmotionItems.SLICE, 4, 0), new Object[]
		{ pearPot, sliceBread, sliceBread, sliceBread, sliceBread });
		GameRegistry.addShapelessRecipe(new ItemStack(EmotionItems.SLICE, 4, 1), new Object[]
		{ cherryPot, sliceBread, sliceBread, sliceBread, sliceBread });
		GameRegistry.addShapelessRecipe(new ItemStack(EmotionItems.SLICE, 4, 2), new Object[]
		{ orangePot, sliceBread, sliceBread, sliceBread, sliceBread });
		GameRegistry.addShapelessRecipe(new ItemStack(EmotionItems.SLICE, 4, 3), new Object[]
		{ applePot, sliceBread, sliceBread, sliceBread, sliceBread });
		GameRegistry.addShapelessRecipe(new ItemStack(EmotionItems.SLICE, 4, 4), new Object[]
		{ blueberryPot, sliceBread, sliceBread, sliceBread, sliceBread });
		GameRegistry.addShapelessRecipe(new ItemStack(EmotionItems.SLICE, 4, 5), new Object[]
		{ redCurrantPot, sliceBread, sliceBread, sliceBread, sliceBread });
		GameRegistry.addShapelessRecipe(new ItemStack(EmotionItems.SLICE, 4, 6), new Object[]
		{ blackCurrantPot, sliceBread, sliceBread, sliceBread, sliceBread });
		GameRegistry.addShapelessRecipe(new ItemStack(EmotionItems.SLICE, 4, 7), new Object[]
		{ strawberryPot, sliceBread, sliceBread, sliceBread, sliceBread });
		GameRegistry.addShapelessRecipe(new ItemStack(EmotionItems.SLICE, 4, 8), new Object[]
		{ dreamCurrantPot, sliceBread, sliceBread, sliceBread, sliceBread });
		GameRegistry.addShapelessRecipe(new ItemStack(EmotionItems.SLICE, 4, 9), new Object[]
		{ chocolatePot, sliceBread, sliceBread, sliceBread, sliceBread });
		GameRegistry.addShapelessRecipe(new ItemStack(EmotionItems.SLICE, 4, 10), new Object[]
		{ Items.BREAD });

		GameRegistry.addRecipe(new ItemStack(EmotionItems.BAG, 1, 0), new Object[]
		{ "YY", "YY", 'Y', EmotionItems.FRUIT_PEAR });
		GameRegistry.addRecipe(new ItemStack(EmotionItems.BAG, 1, 1), new Object[]
		{ "YY", "YY", 'Y', EmotionItems.FRUIT_CHERRY });
		GameRegistry.addRecipe(new ItemStack(EmotionItems.BAG, 1, 2), new Object[]
		{ "YY", "YY", 'Y', EmotionItems.FRUIT_ORANGE });
		GameRegistry.addRecipe(new ItemStack(EmotionItems.BAG, 1, 3), new Object[]
		{ "YY", "YY", 'Y', EmotionItems.FRUIT_TOMATO });
		GameRegistry.addRecipe(new ItemStack(EmotionItems.BAG, 1, 4), new Object[]
		{ "YY", "YY", 'Y', Items.APPLE });

		GameRegistry.addShapelessRecipe(new ItemStack(EmotionItems.FRUIT_PEAR, 4), new Object[]
		{ new ItemStack(EmotionItems.BAG, 1, 0) });
		GameRegistry.addShapelessRecipe(new ItemStack(EmotionItems.FRUIT_CHERRY, 4), new Object[]
		{ new ItemStack(EmotionItems.BAG, 1, 1) });
		GameRegistry.addShapelessRecipe(new ItemStack(EmotionItems.FRUIT_ORANGE, 4), new Object[]
		{ new ItemStack(EmotionItems.BAG, 1, 2) });
		GameRegistry.addShapelessRecipe(new ItemStack(EmotionItems.FRUIT_TOMATO, 4), new Object[]
		{ new ItemStack(EmotionItems.BAG, 1, 3) });
		GameRegistry.addShapelessRecipe(new ItemStack(Items.APPLE, 4), new Object[]
		{ new ItemStack(EmotionItems.BAG, 1, 4) });

		GameRegistry.addShapelessRecipe(new ItemStack(EmotionItems.BERRY_STRAWBERRY_CHOCO, 1), new Object[]
		{ EmotionItems.BERRY_STRAWBERRY, cocoaStack });

		GameRegistry.addShapelessRecipe(new ItemStack(EmotionItems.SALAD_FRUIT, 1), new Object[]
		{ EmotionItems.FRUIT_PEAR, EmotionItems.FRUIT_CHERRY, EmotionItems.FRUIT_ORANGE, Items.APPLE, Items.BOWL });
		GameRegistry.addShapelessRecipe(new ItemStack(EmotionItems.SALAD_TOMATO, 1), new Object[]
		{ EmotionItems.FRUIT_TOMATO, EmotionItems.SALT, Items.WHEAT_SEEDS, Items.BOWL });
		GameRegistry.addShapelessRecipe(new ItemStack(EmotionItems.SALAD_PUMPKIN, 1), new Object[]
		{ Blocks.PUMPKIN, Items.BOWL });

		GameRegistry.addRecipe(new ItemStack(EmotionBlocks.CAKE_CHOCO, 1, 0), new Object[]
		{ "WYW", "XZX", "VVV", 'Y', Items.MILK_BUCKET, 'X', Items.SUGAR, 'Z', Items.EGG, 'W', cocoaStack, 'V', Items.WHEAT });
		GameRegistry.addRecipe(new ItemStack(EmotionBlocks.CAKE_TOFFEE, 1, 0), new Object[]
		{ "WYW", "XZX", "VVV", 'Y', Items.MILK_BUCKET, 'X', Items.SUGAR, 'Z', Items.EGG, 'W', EmotionItems.TOFFEE_CUBE, 'V', Items.WHEAT });
		GameRegistry.addRecipe(new ItemStack(EmotionBlocks.CAKE_STRAWBERRY, 1, 0), new Object[]
		{ "WYW", "XZX", "VVV", 'Y', Items.MILK_BUCKET, 'X', Items.SUGAR, 'Z', Items.EGG, 'W', EmotionItems.BERRY_STRAWBERRY, 'V', Items.WHEAT });
		GameRegistry.addRecipe(new ItemStack(EmotionBlocks.CAKE_FRUIT, 1, 0), new Object[]
		{ "WYU", "VZX", "TTT", 'W', EmotionItems.FRUIT_PEAR, 'Y', Items.SUGAR, 'U', EmotionItems.FRUIT_ORANGE, 'V', EmotionItems.FRUIT_CHERRY, 'Z', Items.EGG, 'X', Items.APPLE, 'T', Items.WHEAT });

		GameRegistry.addRecipe(new ItemStack(EmotionItems.BOWL_GLASS, 4), new Object[]
		{ "Y Y", "YYY", 'Y', Blocks.GLASS });
		GameRegistry.addShapelessRecipe(new ItemStack(EmotionItems.JUICE_PEAR, 1), new Object[]
		{ EmotionItems.BOWL_GLASS, EmotionItems.FRUIT_PEAR, EmotionItems.FRUIT_PEAR, Items.SUGAR });
		GameRegistry.addShapelessRecipe(new ItemStack(EmotionItems.JUICE_CHERRY, 1), new Object[]
		{ EmotionItems.BOWL_GLASS, EmotionItems.FRUIT_CHERRY, EmotionItems.FRUIT_CHERRY, Items.SUGAR });
		GameRegistry.addShapelessRecipe(new ItemStack(EmotionItems.JUICE_ORANGE, 1), new Object[]
		{ EmotionItems.BOWL_GLASS, EmotionItems.FRUIT_ORANGE, EmotionItems.FRUIT_ORANGE, Items.SUGAR });
		GameRegistry.addShapelessRecipe(new ItemStack(EmotionItems.JUICE_TOMATO, 1), new Object[]
		{ EmotionItems.BOWL_GLASS, EmotionItems.FRUIT_TOMATO, EmotionItems.FRUIT_TOMATO, EmotionItems.SALT });
		GameRegistry.addShapelessRecipe(new ItemStack(EmotionItems.JUICE_APPLE, 1), new Object[]
		{ EmotionItems.BOWL_GLASS, Items.APPLE, Items.APPLE, Items.SUGAR });

		GameRegistry.addShapelessRecipe(new ItemStack(EmotionItems.PIE_PEAR, 1), new Object[]
		{ Items.EGG, Items.SUGAR, EmotionItems.FRUIT_PEAR });
		GameRegistry.addShapelessRecipe(new ItemStack(EmotionItems.PIE_CHERRY, 1), new Object[]
		{ Items.EGG, Items.SUGAR, EmotionItems.FRUIT_CHERRY });
		GameRegistry.addShapelessRecipe(new ItemStack(EmotionItems.PIE_ORANGE, 1), new Object[]
		{ Items.EGG, Items.SUGAR, EmotionItems.FRUIT_ORANGE });
		GameRegistry.addShapelessRecipe(new ItemStack(EmotionItems.PIE_APPLE, 1), new Object[]
		{ Items.EGG, Items.SUGAR, Items.APPLE });
		GameRegistry.addShapelessRecipe(new ItemStack(EmotionItems.PIE_MELON, 1), new Object[]
		{ Items.EGG, Items.SUGAR, Items.MELON });

		GameRegistry.addRecipe(new ItemStack(EmotionItems.MUFFIN_PEAR, 2), new Object[]
		{ "VWV", "XYX", "ZZZ", 'V', EmotionItems.FRUIT_PEAR, 'W', Items.MILK_BUCKET, 'X', Items.SUGAR, 'Y', Items.EGG, 'Z', Items.WHEAT });
		GameRegistry.addRecipe(new ItemStack(EmotionItems.MUFFIN_CHERRY, 2), new Object[]
		{ "VWV", "XYX", "ZZZ", 'V', EmotionItems.FRUIT_CHERRY, 'W', Items.MILK_BUCKET, 'X', Items.SUGAR, 'Y', Items.EGG, 'Z', Items.WHEAT });
		GameRegistry.addRecipe(new ItemStack(EmotionItems.MUFFIN_ORANGE, 2), new Object[]
		{ "VWV", "XYX", "ZZZ", 'V', EmotionItems.FRUIT_ORANGE, 'W', Items.MILK_BUCKET, 'X', Items.SUGAR, 'Y', Items.EGG, 'Z', Items.WHEAT });
		GameRegistry.addRecipe(new ItemStack(EmotionItems.MUFFIN_APPLE, 2), new Object[]
		{ "VWV", "XYX", "ZZZ", 'V', Items.APPLE, 'W', Items.MILK_BUCKET, 'X', Items.SUGAR, 'Y', Items.EGG, 'Z', Items.WHEAT });
		GameRegistry.addRecipe(new ItemStack(EmotionItems.MUFFIN_BLUEBERRY, 2), new Object[]
		{ "VWV", "XYX", "ZZZ", 'V', EmotionItems.BERRY_BLUEBERRY, 'W', Items.MILK_BUCKET, 'X', Items.SUGAR, 'Y', Items.EGG, 'Z', Items.WHEAT });
		GameRegistry.addRecipe(new ItemStack(EmotionItems.MUFFIN_BLACKCURRANT, 2), new Object[]
		{ "VWV", "XYX", "ZZZ", 'V', EmotionItems.BERRY_BLACKCURRANT, 'W', Items.MILK_BUCKET, 'X', Items.SUGAR, 'Y', Items.EGG, 'Z', Items.WHEAT });
		GameRegistry.addRecipe(new ItemStack(EmotionItems.MUFFIN_REDCURRANT, 2), new Object[]
		{ "VWV", "XYX", "ZZZ", 'V', EmotionItems.BERRY_REDCURRANT, 'W', Items.MILK_BUCKET, 'X', Items.SUGAR, 'Y', Items.EGG, 'Z', Items.WHEAT });
		GameRegistry.addRecipe(new ItemStack(EmotionItems.MUFFIN_STRAWBERRY, 2), new Object[]
		{ "VWV", "XYX", "ZZZ", 'V', EmotionItems.BERRY_STRAWBERRY, 'W', Items.MILK_BUCKET, 'X', Items.SUGAR, 'Y', Items.EGG, 'Z', Items.WHEAT });
		GameRegistry.addRecipe(new ItemStack(EmotionItems.MUFFIN_DREAMCURRANT, 2), new Object[]
		{ "VWV", "XYX", "ZZZ", 'V', EmotionItems.BERRY_DREAMCURRANT, 'W', Items.MILK_BUCKET, 'X', Items.SUGAR, 'Y', Items.EGG, 'Z', Items.WHEAT });

		GameRegistry.addShapelessRecipe(new ItemStack(EmotionItems.TOFFEE_APPLE, 1), new Object[]
		{ EmotionItems.TOFFEE_CUBE, Items.APPLE, Items.STICK });

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

		GameRegistry.addShapelessRecipe(new ItemStack(EmotionItems.SPORE_MAGIC, 2), new Object[]
		{ EmotionBlocks.MUSHROOM });
		GameRegistry.addShapelessRecipe(new ItemStack(EmotionItems.SPORE_RED, 2), new Object[]
		{ Blocks.RED_MUSHROOM });
		GameRegistry.addShapelessRecipe(new ItemStack(EmotionItems.SPORE_BROWN, 2), new Object[]
		{ Blocks.BROWN_MUSHROOM });

		// Furnitures +
		for (int i = 0; i <= 12; ++i)
		{
			ItemStack emoPlanks = new ItemStack(EmotionBlocks.PLANKS, 1, i);
			ItemStack planks = new ItemStack(Blocks.PLANKS, 1, i - 7);

			if (i <= 6)
				GameRegistry.addRecipe(new ItemStack(EmotionBlocks.WOOD_CHAIR, 2, i), new Object[]
				{ "YYY", "X X", "X X", 'X', Items.STICK, 'Y', emoPlanks });
			if (i >= 7)
				GameRegistry.addRecipe(new ItemStack(EmotionBlocks.WOOD_CHAIR, 2, i), new Object[]
				{ "YYY", "X X", "X X", 'X', Items.STICK, 'Y', planks });
		}

		GameRegistry.addRecipe(new ItemStack(EmotionBlocks.WOOD_NIGHTSTAND_CHERRY, 2, 2), new Object[]
		{ "YYY", "XYX", "X X", 'X', Items.STICK, 'Y', new ItemStack(EmotionBlocks.PLANKS, 1, 0) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlocks.WOOD_NIGHTSTAND_PEAR, 2, 2), new Object[]
		{ "YYY", "XYX", "X X", 'X', Items.STICK, 'Y', new ItemStack(EmotionBlocks.PLANKS, 1, 1) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlocks.WOOD_NIGHTSTAND_ORANGE, 2, 2), new Object[]
		{ "YYY", "XYX", "X X", 'X', Items.STICK, 'Y', new ItemStack(EmotionBlocks.PLANKS, 1, 2) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlocks.WOOD_NIGHTSTAND_ATLAS, 2, 2), new Object[]
		{ "YYY", "XYX", "X X", 'X', Items.STICK, 'Y', new ItemStack(EmotionBlocks.PLANKS, 1, 3) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlocks.WOOD_NIGHTSTAND_PINE, 2, 2), new Object[]
		{ "YYY", "XYX", "X X", 'X', Items.STICK, 'Y', new ItemStack(EmotionBlocks.PLANKS, 1, 4) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlocks.WOOD_NIGHTSTAND_COCO, 2, 2), new Object[]
		{ "YYY", "XYX", "X X", 'X', Items.STICK, 'Y', new ItemStack(EmotionBlocks.PLANKS, 1, 5) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlocks.WOOD_NIGHTSTAND_DREAM, 2, 2), new Object[]
		{ "YYY", "XYX", "X X", 'X', Items.STICK, 'Y', new ItemStack(EmotionBlocks.PLANKS, 1, 6) });

		GameRegistry.addRecipe(new ItemStack(EmotionBlocks.WOOD_NIGHTSTAND_OAK, 2, 2), new Object[]
		{ "YYY", "XYX", "X X", 'X', Items.STICK, 'Y', new ItemStack(Blocks.PLANKS, 1, 0) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlocks.WOOD_NIGHTSTAND_SPRUCE, 2, 2), new Object[]
		{ "YYY", "XYX", "X X", 'X', Items.STICK, 'Y', new ItemStack(Blocks.PLANKS, 1, 1) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlocks.WOOD_NIGHTSTAND_BIRCH, 2, 2), new Object[]
		{ "YYY", "XYX", "X X", 'X', Items.STICK, 'Y', new ItemStack(Blocks.PLANKS, 1, 2) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlocks.WOOD_NIGHTSTAND_JUNGLE, 2, 2), new Object[]
		{ "YYY", "XYX", "X X", 'X', Items.STICK, 'Y', new ItemStack(Blocks.PLANKS, 1, 3) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlocks.WOOD_NIGHTSTAND_ACACIA, 2, 2), new Object[]
		{ "YYY", "XYX", "X X", 'X', Items.STICK, 'Y', new ItemStack(Blocks.PLANKS, 1, 4) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlocks.WOOD_NIGHTSTAND_BIG_OAK, 2, 2), new Object[]
		{ "YYY", "XYX", "X X", 'X', Items.STICK, 'Y', new ItemStack(Blocks.PLANKS, 1, 5) });

		GameRegistry.addRecipe(new ItemStack(EmotionBlocks.WOOD_TABLE_CHERRY, 2, 0), new Object[]
		{ "YYY", " Y ", "XYX", 'X', Items.STICK, 'Y', new ItemStack(EmotionBlocks.PLANKS, 1, 0) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlocks.WOOD_TABLE_PEAR, 2, 0), new Object[]
		{ "YYY", " Y ", "XYX", 'X', Items.STICK, 'Y', new ItemStack(EmotionBlocks.PLANKS, 1, 1) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlocks.WOOD_TABLE_ORANGE, 2, 0), new Object[]
		{ "YYY", " Y ", "XYX", 'X', Items.STICK, 'Y', new ItemStack(EmotionBlocks.PLANKS, 1, 2) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlocks.WOOD_TABLE_ATLAS, 2, 0), new Object[]
		{ "YYY", " Y ", "XYX", 'X', Items.STICK, 'Y', new ItemStack(EmotionBlocks.PLANKS, 1, 3) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlocks.WOOD_TABLE_PINE, 2, 0), new Object[]
		{ "YYY", " Y ", "XYX", 'X', Items.STICK, 'Y', new ItemStack(EmotionBlocks.PLANKS, 1, 4) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlocks.WOOD_TABLE_COCO, 2, 0), new Object[]
		{ "YYY", " Y ", "XYX", 'X', Items.STICK, 'Y', new ItemStack(EmotionBlocks.PLANKS, 1, 5) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlocks.WOOD_TABLE_DREAM, 2, 0), new Object[]
		{ "YYY", " Y ", "XYX", 'X', Items.STICK, 'Y', new ItemStack(EmotionBlocks.PLANKS, 1, 6) });

		GameRegistry.addRecipe(new ItemStack(EmotionBlocks.WOOD_TABLE_OAK, 2, 0), new Object[]
		{ "YYY", " Y ", "XYX", 'X', Items.STICK, 'Y', new ItemStack(Blocks.PLANKS, 1, 0) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlocks.WOOD_TABLE_SPRUCE, 2, 0), new Object[]
		{ "YYY", " Y ", "XYX", 'X', Items.STICK, 'Y', new ItemStack(Blocks.PLANKS, 1, 1) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlocks.WOOD_TABLE_BIRCH, 2, 0), new Object[]
		{ "YYY", " Y ", "XYX", 'X', Items.STICK, 'Y', new ItemStack(Blocks.PLANKS, 1, 2) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlocks.WOOD_TABLE_JUNGLE, 2, 0), new Object[]
		{ "YYY", " Y ", "XYX", 'X', Items.STICK, 'Y', new ItemStack(Blocks.PLANKS, 1, 3) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlocks.WOOD_TABLE_ACACIA, 2, 0), new Object[]
		{ "YYY", " Y ", "XYX", 'X', Items.STICK, 'Y', new ItemStack(Blocks.PLANKS, 1, 4) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlocks.WOOD_TABLE_BIG_OAK, 2, 0), new Object[]
		{ "YYY", " Y ", "XYX", 'X', Items.STICK, 'Y', new ItemStack(Blocks.PLANKS, 1, 5) });

		GameRegistry.addRecipe(new ItemStack(EmotionBlocks.STONE_TABLE_COBBLESTONE, 2, 0), new Object[]
		{ "YYY", " Y ", "YYY", 'Y', Blocks.COBBLESTONE });
		GameRegistry.addRecipe(new ItemStack(EmotionBlocks.STONE_TABLE_MOSSY_COBBLESTONE, 2, 0), new Object[]
		{ "YYY", " Y ", "YYY", 'Y', Blocks.MOSSY_COBBLESTONE });

		GameRegistry.addRecipe(new ItemStack(EmotionBlocks.STONE_TABLE_STONE_BRICK, 2, 0), new Object[]
		{ "YYY", " Y ", "YYY", 'Y', new ItemStack(Blocks.STONEBRICK, 1, 0) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlocks.STONE_TABLE_MOSSY_STONE_BRICK, 2, 0), new Object[]
		{ "YYY", " Y ", "YYY", 'Y', new ItemStack(Blocks.STONEBRICK, 1, 1) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlocks.STONE_TABLE_CRACKED_STONE_BRICK, 2, 0), new Object[]
		{ "YYY", " Y ", "YYY", 'Y', new ItemStack(Blocks.STONEBRICK, 1, 2) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlocks.STONE_TABLE_CHISELLED_STONE_BRICK, 2, 0), new Object[]
		{ "YYY", " Y ", "YYY", 'Y', new ItemStack(Blocks.STONEBRICK, 1, 3) });

		GameRegistry.addRecipe(new ItemStack(EmotionBlocks.STONE_TABLE_BRICK, 2, 0), new Object[]
		{ "YYY", " Y ", "YYY", 'Y', Blocks.BRICK_BLOCK });

		GameRegistry.addRecipe(new ItemStack(EmotionBlocks.STONE_CHAIR, 2, 0), new Object[]
		{ " YY", " YY", 'Y', Blocks.COBBLESTONE });
		GameRegistry.addRecipe(new ItemStack(EmotionBlocks.STONE_CHAIR, 2, 1), new Object[]
		{ " YY", " YY", 'Y', Blocks.MOSSY_COBBLESTONE });
		GameRegistry.addRecipe(new ItemStack(EmotionBlocks.STONE_CHAIR, 2, 2), new Object[]
		{ " YY", " YY", 'Y', new ItemStack(Blocks.STONEBRICK, 1, 0) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlocks.STONE_CHAIR, 2, 3), new Object[]
		{ " YY", " YY", 'Y', new ItemStack(Blocks.STONEBRICK, 1, 1) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlocks.STONE_CHAIR, 2, 4), new Object[]
		{ " YY", " YY", 'Y', new ItemStack(Blocks.STONEBRICK, 1, 2) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlocks.STONE_CHAIR, 2, 5), new Object[]
		{ " YY", " YY", 'Y', new ItemStack(Blocks.STONEBRICK, 1, 3) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlocks.STONE_CHAIR, 2, 6), new Object[]
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

		GameRegistry.addShapelessRecipe(new ItemStack(EmotionBlocks.BRICK, 4, 3), new Object[]
		{ EmotionBlocks.LIMESTONE, EmotionBlocks.LIMESTONE, EmotionBlocks.LIMESTONE, EmotionBlocks.LIMESTONE });

		GameRegistry.addShapelessRecipe(new ItemStack(EmotionBlocks.PLANKS, 1, 0), new Object[]
		{ EmotionBlocks.CHERRY_STAIRS });
		GameRegistry.addShapelessRecipe(new ItemStack(EmotionBlocks.PLANKS, 1, 1), new Object[]
		{ EmotionBlocks.PEAR_STAIRS });
		GameRegistry.addShapelessRecipe(new ItemStack(EmotionBlocks.PLANKS, 1, 2), new Object[]
		{ EmotionBlocks.ORANGE_STAIRS });
		GameRegistry.addShapelessRecipe(new ItemStack(EmotionBlocks.PLANKS, 1, 3), new Object[]
		{ EmotionBlocks.ATLAS_STAIRS });
		GameRegistry.addShapelessRecipe(new ItemStack(EmotionBlocks.PLANKS, 1, 4), new Object[]
		{ EmotionBlocks.PINE_STAIRS });
		GameRegistry.addShapelessRecipe(new ItemStack(EmotionBlocks.PLANKS, 1, 5), new Object[]
		{ EmotionBlocks.COCO_STAIRS });
		GameRegistry.addShapelessRecipe(new ItemStack(EmotionBlocks.PLANKS, 1, 6), new Object[]
		{ EmotionBlocks.DREAM_STAIRS });

		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 0), new Object[]
		{ EmotionBlocks.WHITE_CLAY_STAIRS });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 1), new Object[]
		{ EmotionBlocks.ORANGE_CLAY_STAIRS });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 2), new Object[]
		{ EmotionBlocks.MANGENTA_CLAY_STAIRS });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 3), new Object[]
		{ EmotionBlocks.LIGHT_BLUE_CLAY_STAIRS });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 4), new Object[]
		{ EmotionBlocks.YELLOW_CLAY_STAIRS });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 5), new Object[]
		{ EmotionBlocks.LIME_CLAY_STAIRS });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 6), new Object[]
		{ EmotionBlocks.PINK_CLAY_STAIRS });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 7), new Object[]
		{ EmotionBlocks.GRAY_CLAY_STAIRS });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 8), new Object[]
		{ EmotionBlocks.SILVER_CLAY_STAIRS });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 9), new Object[]
		{ EmotionBlocks.CYAN_CLAY_STAIRS });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 10), new Object[]
		{ EmotionBlocks.PURPLE_CLAY_STAIRS });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 11), new Object[]
		{ EmotionBlocks.BLUE_CLAY_STAIRS });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 12), new Object[]
		{ EmotionBlocks.BROWN_CLAY_STAIRS });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 13), new Object[]
		{ EmotionBlocks.GREEN_CLAY_STAIRS });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 14), new Object[]
		{ EmotionBlocks.RED_CLAY_STAIRS });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 15), new Object[]
		{ EmotionBlocks.BLACK_CLAY_STAIRS });

		GameRegistry.addRecipe(new ItemStack(EmotionBlocks.CHERRY_STAIRS, 4), new Object[]
		{ "Y  ", "YY ", "YYY", 'Y', new ItemStack(EmotionBlocks.PLANKS, 1, 0) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlocks.PEAR_STAIRS, 4), new Object[]
		{ "Y  ", "YY ", "YYY", 'Y', new ItemStack(EmotionBlocks.PLANKS, 1, 1) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlocks.ORANGE_STAIRS, 4), new Object[]
		{ "Y  ", "YY ", "YYY", 'Y', new ItemStack(EmotionBlocks.PLANKS, 1, 2) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlocks.ATLAS_STAIRS, 4), new Object[]
		{ "Y  ", "YY ", "YYY", 'Y', new ItemStack(EmotionBlocks.PLANKS, 1, 3) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlocks.PINE_STAIRS, 4), new Object[]
		{ "Y  ", "YY ", "YYY", 'Y', new ItemStack(EmotionBlocks.PLANKS, 1, 4) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlocks.COCO_STAIRS, 4), new Object[]
		{ "Y  ", "YY ", "YYY", 'Y', new ItemStack(EmotionBlocks.PLANKS, 1, 5) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlocks.DREAM_STAIRS, 4), new Object[]
		{ "Y  ", "YY ", "YYY", 'Y', new ItemStack(EmotionBlocks.PLANKS, 1, 6) });

		GameRegistry.addRecipe(new ItemStack(EmotionBlocks.WHITE_CLAY_STAIRS, 4), new Object[]
		{ "Y  ", "YY ", "YYY", 'Y', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 0) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlocks.ORANGE_CLAY_STAIRS, 4), new Object[]
		{ "Y  ", "YY ", "YYY", 'Y', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 1) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlocks.MANGENTA_CLAY_STAIRS, 4), new Object[]
		{ "Y  ", "YY ", "YYY", 'Y', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 2) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlocks.LIGHT_BLUE_CLAY_STAIRS, 4), new Object[]
		{ "Y  ", "YY ", "YYY", 'Y', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 3) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlocks.YELLOW_CLAY_STAIRS, 4), new Object[]
		{ "Y  ", "YY ", "YYY", 'Y', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 4) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlocks.LIME_CLAY_STAIRS, 4), new Object[]
		{ "Y  ", "YY ", "YYY", 'Y', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 5) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlocks.PINK_CLAY_STAIRS, 4), new Object[]
		{ "Y  ", "YY ", "YYY", 'Y', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 6) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlocks.GRAY_CLAY_STAIRS, 4), new Object[]
		{ "Y  ", "YY ", "YYY", 'Y', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 7) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlocks.SILVER_CLAY_STAIRS, 4), new Object[]
		{ "Y  ", "YY ", "YYY", 'Y', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 8) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlocks.CYAN_CLAY_STAIRS, 4), new Object[]
		{ "Y  ", "YY ", "YYY", 'Y', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 9) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlocks.PURPLE_CLAY_STAIRS, 4), new Object[]
		{ "Y  ", "YY ", "YYY", 'Y', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 10) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlocks.BLUE_CLAY_STAIRS, 4), new Object[]
		{ "Y  ", "YY ", "YYY", 'Y', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 11) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlocks.BROWN_CLAY_STAIRS, 4), new Object[]
		{ "Y  ", "YY ", "YYY", 'Y', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 12) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlocks.GREEN_CLAY_STAIRS, 4), new Object[]
		{ "Y  ", "YY ", "YYY", 'Y', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 13) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlocks.RED_CLAY_STAIRS, 4), new Object[]
		{ "Y  ", "YY ", "YYY", 'Y', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 14) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlocks.BLACK_CLAY_STAIRS, 4), new Object[]
		{ "Y  ", "YY ", "YYY", 'Y', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 15) });

		GameRegistry.addRecipe(new ItemStack(EmotionBlocks.CHERRY_FENCE, 3), new Object[]
		{ "YXY", "YXY", 'Y', new ItemStack(EmotionBlocks.PLANKS, 1, 0), 'X', Items.STICK });
		GameRegistry.addRecipe(new ItemStack(EmotionBlocks.PEAR_FENCE, 3), new Object[]
		{ "YXY", "YXY", 'Y', new ItemStack(EmotionBlocks.PLANKS, 1, 1), 'X', Items.STICK });
		GameRegistry.addRecipe(new ItemStack(EmotionBlocks.ORANGE_FENCE, 3), new Object[]
		{ "YXY", "YXY", 'Y', new ItemStack(EmotionBlocks.PLANKS, 1, 2), 'X', Items.STICK });
		GameRegistry.addRecipe(new ItemStack(EmotionBlocks.ATLAS_FENCE, 3), new Object[]
		{ "YXY", "YXY", 'Y', new ItemStack(EmotionBlocks.PLANKS, 1, 3), 'X', Items.STICK });
		GameRegistry.addRecipe(new ItemStack(EmotionBlocks.PINE_FENCE, 3), new Object[]
		{ "YXY", "YXY", 'Y', new ItemStack(EmotionBlocks.PLANKS, 1, 4), 'X', Items.STICK });
		GameRegistry.addRecipe(new ItemStack(EmotionBlocks.COCO_FENCE, 3), new Object[]
		{ "YXY", "YXY", 'Y', new ItemStack(EmotionBlocks.PLANKS, 1, 5), 'X', Items.STICK });
		GameRegistry.addRecipe(new ItemStack(EmotionBlocks.DREAM_FENCE, 3), new Object[]
		{ "YXY", "YXY", 'Y', new ItemStack(EmotionBlocks.PLANKS, 1, 6), 'X', Items.STICK });

		GameRegistry.addRecipe(new ItemStack(EmotionBlocks.CHERRY_FENCE_GATE, 1), new Object[]
		{ "XYX", "XYX", 'Y', new ItemStack(EmotionBlocks.PLANKS, 1, 0), 'X', Items.STICK });
		GameRegistry.addRecipe(new ItemStack(EmotionBlocks.PEAR_FENCE_GATE, 1), new Object[]
		{ "XYX", "XYX", 'Y', new ItemStack(EmotionBlocks.PLANKS, 1, 1), 'X', Items.STICK });
		GameRegistry.addRecipe(new ItemStack(EmotionBlocks.ORANGE_FENCE_GATE, 1), new Object[]
		{ "XYX", "XYX", 'Y', new ItemStack(EmotionBlocks.PLANKS, 1, 2), 'X', Items.STICK });
		GameRegistry.addRecipe(new ItemStack(EmotionBlocks.ATLAS_FENCE_GATE, 1), new Object[]
		{ "XYX", "XYX", 'Y', new ItemStack(EmotionBlocks.PLANKS, 1, 3), 'X', Items.STICK });
		GameRegistry.addRecipe(new ItemStack(EmotionBlocks.PINE_FENCE_GATE, 1), new Object[]
		{ "XYX", "XYX", 'Y', new ItemStack(EmotionBlocks.PLANKS, 1, 4), 'X', Items.STICK });
		GameRegistry.addRecipe(new ItemStack(EmotionBlocks.COCO_FENCE_GATE, 1), new Object[]
		{ "XYX", "XYX", 'Y', new ItemStack(EmotionBlocks.PLANKS, 1, 5), 'X', Items.STICK });
		GameRegistry.addRecipe(new ItemStack(EmotionBlocks.DREAM_FENCE_GATE, 1), new Object[]
		{ "XYX", "XYX", 'Y', new ItemStack(EmotionBlocks.PLANKS, 1, 6), 'X', Items.STICK });

		GameRegistry.addRecipe(new ItemStack(EmotionItems.CHERRY_BOAT, 1), new Object[]
		{ "Y Y", "YYY", 'Y', new ItemStack(EmotionBlocks.PLANKS, 1, 0) });
		GameRegistry.addRecipe(new ItemStack(EmotionItems.PEAR_BOAT, 1), new Object[]
		{ "Y Y", "YYY", 'Y', new ItemStack(EmotionBlocks.PLANKS, 1, 1) });
		GameRegistry.addRecipe(new ItemStack(EmotionItems.ORANGE_BOAT, 1), new Object[]
		{ "Y Y", "YYY", 'Y', new ItemStack(EmotionBlocks.PLANKS, 1, 2) });
		GameRegistry.addRecipe(new ItemStack(EmotionItems.ATLAS_BOAT, 1), new Object[]
		{ "Y Y", "YYY", 'Y', new ItemStack(EmotionBlocks.PLANKS, 1, 3) });
		GameRegistry.addRecipe(new ItemStack(EmotionItems.PINE_BOAT, 1), new Object[]
		{ "Y Y", "YYY", 'Y', new ItemStack(EmotionBlocks.PLANKS, 1, 4) });
		GameRegistry.addRecipe(new ItemStack(EmotionItems.COCO_BOAT, 1), new Object[]
		{ "Y Y", "YYY", 'Y', new ItemStack(EmotionBlocks.PLANKS, 1, 5) });
		GameRegistry.addRecipe(new ItemStack(EmotionItems.DREAM_BOAT, 1), new Object[]
		{ "Y Y", "YYY", 'Y', new ItemStack(EmotionBlocks.PLANKS, 1, 6) });

		GameRegistry.addRecipe(new ItemStack(EmotionItems.CHERRY_DOOR, 3), new Object[]
		{ " YY", " YY", " YY", 'Y', new ItemStack(EmotionBlocks.PLANKS, 1, 0) });
		GameRegistry.addRecipe(new ItemStack(EmotionItems.PEAR_DOOR, 3), new Object[]
		{ " YY", " YY", " YY", 'Y', new ItemStack(EmotionBlocks.PLANKS, 1, 1) });
		GameRegistry.addRecipe(new ItemStack(EmotionItems.ORANGE_DOOR, 3), new Object[]
		{ " YY", " YY", " YY", 'Y', new ItemStack(EmotionBlocks.PLANKS, 1, 2) });
		GameRegistry.addRecipe(new ItemStack(EmotionItems.ATLAS_DOOR, 3), new Object[]
		{ " YY", " YY", " YY", 'Y', new ItemStack(EmotionBlocks.PLANKS, 1, 3) });
		GameRegistry.addRecipe(new ItemStack(EmotionItems.PINE_DOOR, 3), new Object[]
		{ " YY", " YY", " YY", 'Y', new ItemStack(EmotionBlocks.PLANKS, 1, 4) });
		GameRegistry.addRecipe(new ItemStack(EmotionItems.COCO_DOOR, 3), new Object[]
		{ " YY", " YY", " YY", 'Y', new ItemStack(EmotionBlocks.PLANKS, 1, 5) });
		GameRegistry.addRecipe(new ItemStack(EmotionItems.DREAM_DOOR, 3), new Object[]
		{ " YY", " YY", " YY", 'Y', new ItemStack(EmotionBlocks.PLANKS, 1, 6) });

		GameRegistry.addRecipe(new ItemStack(EmotionBlocks.CHERRY_TRAPDOOR, 2), new Object[]
		{ "YYY", "YYY", 'Y', new ItemStack(EmotionBlocks.PLANKS, 1, 0) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlocks.PEAR_TRAPDOOR, 2), new Object[]
		{ "YYY", "YYY", 'Y', new ItemStack(EmotionBlocks.PLANKS, 1, 1) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlocks.ORANGE_TRAPDOOR, 2), new Object[]
		{ "YYY", "YYY", 'Y', new ItemStack(EmotionBlocks.PLANKS, 1, 2) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlocks.ATLAS_TRAPDOOR, 2), new Object[]
		{ "YYY", "YYY", 'Y', new ItemStack(EmotionBlocks.PLANKS, 1, 3) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlocks.PINE_TRAPDOOR, 2), new Object[]
		{ "YYY", "YYY", 'Y', new ItemStack(EmotionBlocks.PLANKS, 1, 4) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlocks.COCO_TRAPDOOR, 2), new Object[]
		{ "YYY", "YYY", 'Y', new ItemStack(EmotionBlocks.PLANKS, 1, 5) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlocks.DREAM_TRAPDOOR, 2), new Object[]
		{ "YYY", "YYY", 'Y', new ItemStack(EmotionBlocks.PLANKS, 1, 6) });

		GameRegistry.addRecipe(new ItemStack(EmotionBlocks.SPRUCE_TRAPDOOR, 2), new Object[]
		{ "YYY", "YYY", 'Y', new ItemStack(Blocks.PLANKS, 1, 1) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlocks.BIRCH_TRAPDOOR, 2), new Object[]
		{ "YYY", "YYY", 'Y', new ItemStack(Blocks.PLANKS, 1, 2) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlocks.JUNGLE_TRAPDOOR, 2), new Object[]
		{ "YYY", "YYY", 'Y', new ItemStack(Blocks.PLANKS, 1, 3) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlocks.ACACIA_TRAPDOOR, 2), new Object[]
		{ "YYY", "YYY", 'Y', new ItemStack(Blocks.PLANKS, 1, 4) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlocks.DARK_OAK_TRAPDOOR, 2), new Object[]
		{ "YYY", "YYY", 'Y', new ItemStack(Blocks.PLANKS, 1, 5) });

		GameRegistry.addShapelessRecipe(new ItemStack(EmotionBlocks.PLANKS, 1, 0), new Object[]
		{ EmotionBlocks.CHERRY_SLAB, EmotionBlocks.CHERRY_SLAB });
		GameRegistry.addShapelessRecipe(new ItemStack(EmotionBlocks.PLANKS, 1, 1), new Object[]
		{ EmotionBlocks.PEAR_SLAB, EmotionBlocks.PEAR_SLAB });
		GameRegistry.addShapelessRecipe(new ItemStack(EmotionBlocks.PLANKS, 1, 2), new Object[]
		{ EmotionBlocks.ORANGE_SLAB, EmotionBlocks.ORANGE_SLAB });
		GameRegistry.addShapelessRecipe(new ItemStack(EmotionBlocks.PLANKS, 1, 3), new Object[]
		{ EmotionBlocks.ATLAS_SLAB, EmotionBlocks.ATLAS_SLAB });
		GameRegistry.addShapelessRecipe(new ItemStack(EmotionBlocks.PLANKS, 1, 4), new Object[]
		{ EmotionBlocks.PINE_SLAB, EmotionBlocks.PINE_SLAB });
		GameRegistry.addShapelessRecipe(new ItemStack(EmotionBlocks.PLANKS, 1, 5), new Object[]
		{ EmotionBlocks.COCO_SLAB, EmotionBlocks.COCO_SLAB });
		GameRegistry.addShapelessRecipe(new ItemStack(EmotionBlocks.PLANKS, 1, 6), new Object[]
		{ EmotionBlocks.DREAM_SLAB, EmotionBlocks.DREAM_SLAB });

		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 0), new Object[]
		{ EmotionBlocks.WHITE_CLAY_SLAB, EmotionBlocks.WHITE_CLAY_SLAB });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 1), new Object[]
		{ EmotionBlocks.ORANGE_CLAY_SLAB, EmotionBlocks.ORANGE_CLAY_SLAB });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 2), new Object[]
		{ EmotionBlocks.MANGENTA_CLAY_SLAB, EmotionBlocks.MANGENTA_CLAY_SLAB });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 3), new Object[]
		{ EmotionBlocks.LIGHT_BLUE_CLAY_SLAB, EmotionBlocks.LIGHT_BLUE_CLAY_SLAB });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 4), new Object[]
		{ EmotionBlocks.YELLOW_CLAY_SLAB, EmotionBlocks.YELLOW_CLAY_SLAB });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 5), new Object[]
		{ EmotionBlocks.LIME_CLAY_SLAB, EmotionBlocks.LIME_CLAY_SLAB });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 6), new Object[]
		{ EmotionBlocks.PINK_CLAY_SLAB, EmotionBlocks.PINK_CLAY_SLAB });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 7), new Object[]
		{ EmotionBlocks.GRAY_CLAY_SLAB, EmotionBlocks.GRAY_CLAY_SLAB });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 8), new Object[]
		{ EmotionBlocks.SILVER_CLAY_SLAB, EmotionBlocks.SILVER_CLAY_SLAB });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 9), new Object[]
		{ EmotionBlocks.CYAN_CLAY_SLAB, EmotionBlocks.CYAN_CLAY_SLAB });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 10), new Object[]
		{ EmotionBlocks.PURPLE_CLAY_SLAB, EmotionBlocks.PURPLE_CLAY_SLAB });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 11), new Object[]
		{ EmotionBlocks.BLUE_CLAY_SLAB, EmotionBlocks.BLUE_CLAY_SLAB });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 12), new Object[]
		{ EmotionBlocks.BROWN_CLAY_SLAB, EmotionBlocks.BROWN_CLAY_SLAB });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 13), new Object[]
		{ EmotionBlocks.GREEN_CLAY_SLAB, EmotionBlocks.GREEN_CLAY_SLAB });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 14), new Object[]
		{ EmotionBlocks.RED_CLAY_SLAB, EmotionBlocks.RED_CLAY_SLAB });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 15), new Object[]
		{ EmotionBlocks.BLACK_CLAY_SLAB, EmotionBlocks.BLACK_CLAY_SLAB });

		GameRegistry.addRecipe(new ItemStack(EmotionBlocks.CHERRY_SLAB, 6), new Object[]
		{ "YYY", 'Y', new ItemStack(EmotionBlocks.PLANKS, 1, 0) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlocks.PEAR_SLAB, 6), new Object[]
		{ "YYY", 'Y', new ItemStack(EmotionBlocks.PLANKS, 1, 1) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlocks.ORANGE_SLAB, 6), new Object[]
		{ "YYY", 'Y', new ItemStack(EmotionBlocks.PLANKS, 1, 2) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlocks.ATLAS_SLAB, 6), new Object[]
		{ "YYY", 'Y', new ItemStack(EmotionBlocks.PLANKS, 1, 3) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlocks.PINE_SLAB, 6), new Object[]
		{ "YYY", 'Y', new ItemStack(EmotionBlocks.PLANKS, 1, 4) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlocks.COCO_SLAB, 6), new Object[]
		{ "YYY", 'Y', new ItemStack(EmotionBlocks.PLANKS, 1, 5) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlocks.DREAM_SLAB, 6), new Object[]
		{ "YYY", 'Y', new ItemStack(EmotionBlocks.PLANKS, 1, 6) });

		GameRegistry.addRecipe(new ItemStack(EmotionBlocks.WHITE_CLAY_SLAB, 6), new Object[]
		{ "YYY", 'Y', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 0) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlocks.ORANGE_CLAY_SLAB, 6), new Object[]
		{ "YYY", 'Y', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 1) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlocks.MANGENTA_CLAY_SLAB, 6), new Object[]
		{ "YYY", 'Y', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 2) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlocks.LIGHT_BLUE_CLAY_SLAB, 6), new Object[]
		{ "YYY", 'Y', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 3) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlocks.YELLOW_CLAY_SLAB, 6), new Object[]
		{ "YYY", 'Y', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 4) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlocks.LIME_CLAY_SLAB, 6), new Object[]
		{ "YYY", 'Y', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 5) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlocks.PINK_CLAY_SLAB, 6), new Object[]
		{ "YYY", 'Y', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 6) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlocks.GRAY_CLAY_SLAB, 6), new Object[]
		{ "YYY", 'Y', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 7) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlocks.SILVER_CLAY_SLAB, 6), new Object[]
		{ "YYY", 'Y', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 8) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlocks.CYAN_CLAY_SLAB, 6), new Object[]
		{ "YYY", 'Y', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 9) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlocks.PURPLE_CLAY_SLAB, 6), new Object[]
		{ "YYY", 'Y', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 10) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlocks.BLUE_CLAY_SLAB, 6), new Object[]
		{ "YYY", 'Y', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 11) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlocks.BROWN_CLAY_SLAB, 6), new Object[]
		{ "YYY", 'Y', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 12) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlocks.GREEN_CLAY_SLAB, 6), new Object[]
		{ "YYY", 'Y', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 13) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlocks.RED_CLAY_SLAB, 6), new Object[]
		{ "YYY", 'Y', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 14) });
		GameRegistry.addRecipe(new ItemStack(EmotionBlocks.BLACK_CLAY_SLAB, 6), new Object[]
		{ "YYY", 'Y', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 15) });

		normalCraft();
		extraCraft();
	}

	private static void addSmeltingRecipes()
	{
		GameRegistry.addSmelting(Items.WATER_BUCKET, new ItemStack(EmotionItems.SALT, 4), 0.5F);
		GameRegistry.addSmelting(Items.SUGAR, new ItemStack(EmotionItems.TOFFEE_CUBE), 0.2F);
		GameRegistry.addSmelting(EmotionItems.WILDBOAR_RAW, new ItemStack(EmotionItems.WILDBOAR_COOKED), 0.2F);
		GameRegistry.addSmelting(EmotionItems.FISH_TROUT_RAW, new ItemStack(EmotionItems.FISH_TROUT_COOKED), 0.2F);
		GameRegistry.addSmelting(EmotionItems.FISH_BASS_RAW, new ItemStack(EmotionItems.FISH_BASS_COOKED), 0.2F);
		GameRegistry.addSmelting(EmotionItems.FISH_SARDINE_RAW, new ItemStack(EmotionItems.FISH_SARDINE_COOKED), 0.2F);
		GameRegistry.addSmelting(EmotionItems.FISH_MACKEREL_RAW, new ItemStack(EmotionItems.FISH_MACKEREL_COOKED), 0.2F);
		GameRegistry.addSmelting(EmotionItems.FISH_WHITING_RAW, new ItemStack(EmotionItems.FISH_WHITING_COOKED), 0.2F);
		GameRegistry.addSmelting(EmotionItems.FISH_GOLDEN, new ItemStack(Items.GOLD_INGOT, 4), 0.8F);
		GameRegistry.addSmelting(EmotionItems.FISH_DIAMOND, new ItemStack(Items.DIAMOND, 2), 0.8F);

		GameRegistry.addSmelting(EmotionBlocks.LOG, new ItemStack(Items.COAL, 1, 1), 0.2F);
		GameRegistry.addSmelting(EmotionBlocks.NEW_LOG, new ItemStack(Items.COAL, 1, 1), 0.2F);
		GameRegistry.addSmelting(EmotionBlocks.SHIFTING_SAND, new ItemStack(Item.getItemFromBlock(Blocks.SAND)), 0.2F);

		GameRegistry.registerFuelHandler(new EmotionFuelHandler());
	}

	public static void normalCraft()
	{
		GameRegistry.addShapelessRecipe(new ItemStack(EmotionBlocks.PLANKS, 4, 0), new Object[]
		{ new ItemStack(EmotionBlocks.LOG, 1, 0) });
		GameRegistry.addShapelessRecipe(new ItemStack(EmotionBlocks.PLANKS, 4, 1), new Object[]
		{ new ItemStack(EmotionBlocks.LOG, 1, 1) });
		GameRegistry.addShapelessRecipe(new ItemStack(EmotionBlocks.PLANKS, 4, 2), new Object[]
		{ new ItemStack(EmotionBlocks.LOG, 1, 2) });
		GameRegistry.addShapelessRecipe(new ItemStack(EmotionBlocks.PLANKS, 4, 3), new Object[]
		{ new ItemStack(EmotionBlocks.LOG, 1, 3) });
		GameRegistry.addShapelessRecipe(new ItemStack(EmotionBlocks.PLANKS, 4, 4), new Object[]
		{ new ItemStack(EmotionBlocks.NEW_LOG, 1, 0) });
		GameRegistry.addShapelessRecipe(new ItemStack(EmotionBlocks.PLANKS, 4, 5), new Object[]
		{ new ItemStack(EmotionBlocks.NEW_LOG, 1, 1) });
		GameRegistry.addShapelessRecipe(new ItemStack(EmotionBlocks.PLANKS, 4, 6), new Object[]
		{ new ItemStack(EmotionBlocks.NEW_LOG, 1, 2) });

		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOODEN_BUTTON, 1), new Object[]
		{ EmotionBlocks.PLANKS });

		GameRegistry.addRecipe(new ItemStack(Blocks.CRAFTING_TABLE, 1), new Object[]
		{ " YY", " YY", 'Y', EmotionBlocks.PLANKS });
		GameRegistry.addRecipe(new ItemStack(Items.STICK, 4), new Object[]
		{ "Y", "Y", 'Y', EmotionBlocks.PLANKS });

		GameRegistry.addRecipe(new ItemStack(Items.WOODEN_AXE, 1), new Object[]
		{ "YY ", "YX ", " X ", 'Y', EmotionBlocks.PLANKS, 'X', Items.STICK });
		GameRegistry.addRecipe(new ItemStack(Items.WOODEN_HOE, 1), new Object[]
		{ "YY ", " X ", " X ", 'Y', EmotionBlocks.PLANKS, 'X', Items.STICK });
		GameRegistry.addRecipe(new ItemStack(Items.WOODEN_PICKAXE, 1), new Object[]
		{ "YYY", " X ", " X ", 'Y', EmotionBlocks.PLANKS, 'X', Items.STICK });
		GameRegistry.addRecipe(new ItemStack(Items.WOODEN_SHOVEL, 1), new Object[]
		{ " Y ", " X ", " X ", 'Y', EmotionBlocks.PLANKS, 'X', Items.STICK });
		GameRegistry.addRecipe(new ItemStack(Items.WOODEN_SWORD, 1), new Object[]
		{ " Y ", " Y ", " X ", 'Y', EmotionBlocks.PLANKS, 'X', Items.STICK });

		GameRegistry.addRecipe(new ItemStack(Blocks.CHEST, 1), new Object[]
		{ "YYY", "Y Y", "YYY", 'Y', EmotionBlocks.PLANKS });
		GameRegistry.addRecipe(new ItemStack(Blocks.WOODEN_PRESSURE_PLATE, 1), new Object[]
		{ " YY", 'Y', EmotionBlocks.PLANKS });
		GameRegistry.addRecipe(new ItemStack(Blocks.BOOKSHELF, 1), new Object[]
		{ "YYY", "XXX", "YYY", 'Y', EmotionBlocks.PLANKS, 'X', Items.BOOK });
		GameRegistry.addRecipe(new ItemStack(Blocks.JUKEBOX, 1), new Object[]
		{ "YYY", "YXY", "YYY", 'Y', EmotionBlocks.PLANKS, 'X', Items.DIAMOND });
		GameRegistry.addRecipe(new ItemStack(Blocks.NOTEBLOCK, 1), new Object[]
		{ "YYY", "YXY", "YYY", 'Y', EmotionBlocks.PLANKS, 'X', Items.REDSTONE });
		GameRegistry.addRecipe(new ItemStack(Blocks.TRIPWIRE_HOOK, 1), new Object[]
		{ " Z ", " X ", " Y ", 'Y', EmotionBlocks.PLANKS, 'X', Items.STICK, 'Z', Items.IRON_INGOT });
		GameRegistry.addRecipe(new ItemStack(Blocks.PISTON, 1), new Object[]
		{ "YYY", "ZXZ", "ZWZ", 'Y', EmotionBlocks.PLANKS, 'X', Items.IRON_INGOT, 'Z', Blocks.COBBLESTONE, 'W', Items.REDSTONE });

		GameRegistry.addRecipe(new ItemStack(Items.SIGN, 3), new Object[]
		{ "YYY", "YYY", " X ", 'Y', EmotionBlocks.PLANKS, 'X', Items.STICK });
		GameRegistry.addRecipe(new ItemStack(Items.PAINTING, 1), new Object[]
		{ "YYY", "YXY", "YYY", 'Y', EmotionBlocks.PLANKS, 'X', Blocks.WOOL });
		GameRegistry.addRecipe(new ItemStack(Items.BED, 1), new Object[]
		{ "XXX", "YYY", 'Y', EmotionBlocks.PLANKS, 'X', Blocks.WOOL });
		GameRegistry.addRecipe(new ItemStack(Items.BOWL, 1), new Object[]
		{ "Y Y", " Y ", 'Y', EmotionBlocks.PLANKS });
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
