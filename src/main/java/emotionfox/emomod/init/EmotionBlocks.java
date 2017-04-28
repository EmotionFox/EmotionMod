package emotionfox.emomod.init;

import java.util.HashSet;

import emotionfox.emomod.blocks.EmotionBerry;
import emotionfox.emomod.blocks.EmotionBerrySimple;
import emotionfox.emomod.blocks.EmotionBrick;
import emotionfox.emomod.blocks.EmotionCake;
import emotionfox.emomod.blocks.EmotionFlower;
import emotionfox.emomod.blocks.EmotionLeaves;
import emotionfox.emomod.blocks.EmotionLog;
import emotionfox.emomod.blocks.EmotionMushroom;
import emotionfox.emomod.blocks.EmotionNewLeaves;
import emotionfox.emomod.blocks.EmotionNewLog;
import emotionfox.emomod.blocks.EmotionPlanks;
import emotionfox.emomod.blocks.EmotionPot;
import emotionfox.emomod.blocks.EmotionSapling;
import emotionfox.emomod.blocks.EmotionStoneChair;
import emotionfox.emomod.blocks.EmotionTest;
import emotionfox.emomod.blocks.EmotionWoodChair;
import emotionfox.emomod.blocks.FossilOre;
import emotionfox.emomod.blocks.Glitch;
import emotionfox.emomod.blocks.RandomMeter;
import emotionfox.emomod.blocks.StoneTable;
import emotionfox.emomod.blocks.WoodNightstand;
import emotionfox.emomod.blocks.WoodTable;
import emotionfox.emomod.blocks.base.BaseClayDoubleSlab;
import emotionfox.emomod.blocks.base.BaseClayHalfSlab;
import emotionfox.emomod.blocks.base.BaseCristal;
import emotionfox.emomod.blocks.base.BaseDoor;
import emotionfox.emomod.blocks.base.BaseFence;
import emotionfox.emomod.blocks.base.BaseFenceGate;
import emotionfox.emomod.blocks.base.BaseOre;
import emotionfox.emomod.blocks.base.BaseOreBlock;
import emotionfox.emomod.blocks.base.BasePlant;
import emotionfox.emomod.blocks.base.BaseRock;
import emotionfox.emomod.blocks.base.BaseStairs;
import emotionfox.emomod.blocks.base.BaseTrapDoor;
import emotionfox.emomod.blocks.base.BaseViscous;
import emotionfox.emomod.blocks.base.BaseWoodDoubleSlab;
import emotionfox.emomod.blocks.base.BaseWoodHalfSlab;
import emotionfox.emomod.blocks.enumeration.EnumBerry;
import emotionfox.emomod.blocks.enumeration.EnumStoneFurniture;
import emotionfox.emomod.blocks.enumeration.EnumWoodFurniture;
import emotionfox.emomod.blocks.item.ItemBaseBlock;
import emotionfox.emomod.util.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.BlockColored;
import net.minecraft.block.BlockPlanks;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemSlab;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class EmotionBlocks
{
	private static final HashSet<Block> emotionBlocks = new HashSet<Block>();

	// Ore & Block
	public static final Block FOSSIL_ORE = new FossilOre().setHardness(0.5F);

	public static final Block PURPURA_ORE = new BaseOre(3).setHardness(9F).setResistance(10F).setLightLevel(5);
	public static final Block PURPURA_BLOCK = new BaseOreBlock();

	public static final Block VIRIDIS_ORE = new BaseOre(2).setHardness(5F).setResistance(6F);
	public static final Block VIRIDIS_CRISTAL = new BaseCristal();
	public static final Block VIRIDIS_BLOCK = new BaseOreBlock();

	public static final Block LUME_ORE = new BaseOre(2).setHardness(4F).setResistance(4F);
	public static final Block DREAM_LUME_ORE = new BaseOre(4).setHardness(4F).setResistance(4F);
	public static final Block LUME_BLOCK = new BaseOreBlock();

	// Special
	public static final Block GLITCH = new Glitch().setHardness(4F).setResistance(4F);
	// public static final Block dreamPortal;

	// Plantation
	public static final Block PEAR_PLANT = new BasePlant(EmotionItems.SEED_PEAR, EmotionItems.FRUIT_PEAR);
	public static final Block CHERRY_PLANT = new BasePlant(EmotionItems.SEED_CHERRY, EmotionItems.FRUIT_CHERRY);
	public static final Block ORANGE_PLANT = new BasePlant(EmotionItems.SEED_ORANGE, EmotionItems.FRUIT_ORANGE);
	public static final Block TOMATO_PLANT = new BasePlant(EmotionItems.SEED_TOMATO, EmotionItems.FRUIT_TOMATO);
	public static final Block APPLE_PLANT = new BasePlant(EmotionItems.SEED_APPLE, Items.APPLE);

	// Mushroom
	public static final Block BLUE_PLANT = new BasePlant(EmotionItems.SPORE_MAGIC, Item.getItemFromBlock(EmotionBlocks.MUSHROOM));
	public static final Block RED_PLANT = new BasePlant(EmotionItems.SPORE_RED, Item.getItemFromBlock(Blocks.RED_MUSHROOM));
	public static final Block BROWN_PLANT = new BasePlant(EmotionItems.SPORE_BROWN, Item.getItemFromBlock(Blocks.BROWN_MUSHROOM));

	// Pot
	public static final Block POT = new EmotionPot();

	// Cake
	public static final Block CAKE_CHOCO = new EmotionCake();
	public static final Block CAKE_FRUIT = new EmotionCake();
	public static final Block CAKE_TOFFEE = new EmotionCake();
	public static final Block CAKE_STRAWBERRY = new EmotionCake();

	public static final Block BUSH = new EmotionBerry();
	public static final Block BUSH_SIMPLE = new EmotionBerrySimple();

	public static final Block BRICK = new EmotionBrick();

	public static final Block LIMESTONE = new BaseRock();
	public static final Block BUHRSTONE = new BaseRock();

	// Bush
	public static final Block FLOWER = new EmotionFlower();
	public static final Block MUSHROOM = new EmotionMushroom();

	// Furnitures
	public static final Block WOOD_TABLE_CHERRY = new WoodTable();
	public static final Block WOOD_TABLE_PEAR = new WoodTable();
	public static final Block WOOD_TABLE_ORANGE = new WoodTable();
	public static final Block WOOD_TABLE_ATLAS = new WoodTable();
	public static final Block WOOD_TABLE_PINE = new WoodTable();
	public static final Block WOOD_TABLE_COCO = new WoodTable();
	public static final Block WOOD_TABLE_DREAM = new WoodTable();

	public static final Block WOOD_TABLE_OAK = new WoodTable();
	public static final Block WOOD_TABLE_SPRUCE = new WoodTable();
	public static final Block WOOD_TABLE_BIRCH = new WoodTable();
	public static final Block WOOD_TABLE_JUNGLE = new WoodTable();
	public static final Block WOOD_TABLE_ACACIA = new WoodTable();
	public static final Block WOOD_TABLE_BIG_OAK = new WoodTable();

	public static final Block WOOD_NIGHTSTAND_CHERRY = new WoodNightstand();
	public static final Block WOOD_NIGHTSTAND_PEAR = new WoodNightstand();
	public static final Block WOOD_NIGHTSTAND_ORANGE = new WoodNightstand();
	public static final Block WOOD_NIGHTSTAND_ATLAS = new WoodNightstand();
	public static final Block WOOD_NIGHTSTAND_PINE = new WoodNightstand();
	public static final Block WOOD_NIGHTSTAND_COCO = new WoodNightstand();
	public static final Block WOOD_NIGHTSTAND_DREAM = new WoodNightstand();

	public static final Block WOOD_NIGHTSTAND_OAK = new WoodNightstand();
	public static final Block WOOD_NIGHTSTAND_SPRUCE = new WoodNightstand();
	public static final Block WOOD_NIGHTSTAND_BIRCH = new WoodNightstand();
	public static final Block WOOD_NIGHTSTAND_JUNGLE = new WoodNightstand();
	public static final Block WOOD_NIGHTSTAND_ACACIA = new WoodNightstand();
	public static final Block WOOD_NIGHTSTAND_BIG_OAK = new WoodNightstand();

	public static final Block WOOD_CHAIR = new EmotionWoodChair();

	public static final Block STONE_TABLE_COBBLESTONE = new StoneTable();
	public static final Block STONE_TABLE_MOSSY_COBBLESTONE = new StoneTable();
	public static final Block STONE_TABLE_STONE_BRICK = new StoneTable();
	public static final Block STONE_TABLE_MOSSY_STONE_BRICK = new StoneTable();
	public static final Block STONE_TABLE_CRACKED_STONE_BRICK = new StoneTable();
	public static final Block STONE_TABLE_CHISELLED_STONE_BRICK = new StoneTable();
	public static final Block STONE_TABLE_BRICK = new StoneTable();

	public static final Block STONE_CHAIR = new EmotionStoneChair();

	// Emotion Leaves/Log/Sapling/Planks
	public static final Block LEAVES = new EmotionLeaves();
	public static final Block NEW_LEAVES = new EmotionNewLeaves();
	public static final Block LOG = new EmotionLog();
	public static final Block NEW_LOG = new EmotionNewLog();
	public static final Block SAPLING = new EmotionSapling();
	public static final Block PLANKS = new EmotionPlanks();

	// Emotion Grass / Dirt
	// public static final Block DREAM_GRASS;
	// public static final Block DREAM_DIRT;
	// public static final Block DREAM_STONE;

	// Emotion Stairs
	public static final Block CHERRY_STAIRS = new BaseStairs(EmotionBlocks.PLANKS.getDefaultState().withProperty(EmotionPlanks.VARIANT, EmotionPlanks.EnumType.CHERRY));
	public static final Block PEAR_STAIRS = new BaseStairs(EmotionBlocks.PLANKS.getDefaultState().withProperty(EmotionPlanks.VARIANT, EmotionPlanks.EnumType.PEAR));
	public static final Block ORANGE_STAIRS = new BaseStairs(EmotionBlocks.PLANKS.getDefaultState().withProperty(EmotionPlanks.VARIANT, EmotionPlanks.EnumType.ORANGE));
	public static final Block ATLAS_STAIRS = new BaseStairs(EmotionBlocks.PLANKS.getDefaultState().withProperty(EmotionPlanks.VARIANT, EmotionPlanks.EnumType.ATLAS));
	public static final Block PINE_STAIRS = new BaseStairs(EmotionBlocks.PLANKS.getDefaultState().withProperty(EmotionPlanks.VARIANT, EmotionPlanks.EnumType.PINE));
	public static final Block COCO_STAIRS = new BaseStairs(EmotionBlocks.PLANKS.getDefaultState().withProperty(EmotionPlanks.VARIANT, EmotionPlanks.EnumType.COCO));
	public static final Block DREAM_STAIRS = new BaseStairs(EmotionBlocks.PLANKS.getDefaultState().withProperty(EmotionPlanks.VARIANT, EmotionPlanks.EnumType.DREAM));

	// Stained Hardened Clay Stairs
	public static final Block WHITE_CLAY_STAIRS = new BaseStairs(Blocks.STAINED_HARDENED_CLAY.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.WHITE));
	public static final Block ORANGE_CLAY_STAIRS = new BaseStairs(Blocks.STAINED_HARDENED_CLAY.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.ORANGE));
	public static final Block MANGENTA_CLAY_STAIRS = new BaseStairs(Blocks.STAINED_HARDENED_CLAY.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.MAGENTA));
	public static final Block LIGHT_BLUE_CLAY_STAIRS = new BaseStairs(Blocks.STAINED_HARDENED_CLAY.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.LIGHT_BLUE));
	public static final Block YELLOW_CLAY_STAIRS = new BaseStairs(Blocks.STAINED_HARDENED_CLAY.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.YELLOW));
	public static final Block LIME_CLAY_STAIRS = new BaseStairs(Blocks.STAINED_HARDENED_CLAY.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.LIME));
	public static final Block PINK_CLAY_STAIRS = new BaseStairs(Blocks.STAINED_HARDENED_CLAY.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.PINK));
	public static final Block GRAY_CLAY_STAIRS = new BaseStairs(Blocks.STAINED_HARDENED_CLAY.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.GRAY));
	public static final Block SILVER_CLAY_STAIRS = new BaseStairs(Blocks.STAINED_HARDENED_CLAY.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.SILVER));
	public static final Block CYAN_CLAY_STAIRS = new BaseStairs(Blocks.STAINED_HARDENED_CLAY.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.CYAN));
	public static final Block PURPLE_CLAY_STAIRS = new BaseStairs(Blocks.STAINED_HARDENED_CLAY.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.PURPLE));
	public static final Block BLUE_CLAY_STAIRS = new BaseStairs(Blocks.STAINED_HARDENED_CLAY.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.BLUE));
	public static final Block BROWN_CLAY_STAIRS = new BaseStairs(Blocks.STAINED_HARDENED_CLAY.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.BROWN));
	public static final Block GREEN_CLAY_STAIRS = new BaseStairs(Blocks.STAINED_HARDENED_CLAY.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.GREEN));
	public static final Block RED_CLAY_STAIRS = new BaseStairs(Blocks.STAINED_HARDENED_CLAY.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.RED));
	public static final Block BLACK_CLAY_STAIRS = new BaseStairs(Blocks.STAINED_HARDENED_CLAY.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.BLACK));

	// Emotion Fence & Gate
	public static final Block CHERRY_FENCE = new BaseFence(MapColor.RED);
	public static final Block CHERRY_FENCE_GATE = new BaseFenceGate(MapColor.RED);
	public static final Block PEAR_FENCE = new BaseFence(MapColor.WOOD);
	public static final Block PEAR_FENCE_GATE = new BaseFenceGate(MapColor.WOOD);
	public static final Block ORANGE_FENCE = new BaseFence(MapColor.ADOBE);
	public static final Block ORANGE_FENCE_GATE = new BaseFenceGate(MapColor.ADOBE);
	public static final Block ATLAS_FENCE = new BaseFence(MapColor.BLUE);
	public static final Block ATLAS_FENCE_GATE = new BaseFenceGate(MapColor.BLUE);

	// New Emotion Fence & Gate
	public static final Block PINE_FENCE = new BaseFence(MapColor.BLACK);
	public static final Block PINE_FENCE_GATE = new BaseFenceGate(MapColor.BLACK);
	public static final Block COCO_FENCE = new BaseFence(MapColor.YELLOW);
	public static final Block COCO_FENCE_GATE = new BaseFenceGate(MapColor.YELLOW);
	public static final Block DREAM_FENCE = new BaseFence(MapColor.GREEN);
	public static final Block DREAM_FENCE_GATE = new BaseFenceGate(MapColor.GREEN);

	// Emotion Door & Trapdoor
	public static final Block CHERRY_DOOR = new BaseDoor(MapColor.RED);
	public static final Block CHERRY_TRAPDOOR = new BaseTrapDoor(MapColor.RED);
	public static final Block PEAR_DOOR = new BaseDoor(MapColor.WOOD);
	public static final Block PEAR_TRAPDOOR = new BaseTrapDoor(MapColor.WOOD);
	public static final Block ORANGE_DOOR = new BaseDoor(MapColor.ADOBE);
	public static final Block ORANGE_TRAPDOOR = new BaseTrapDoor(MapColor.ADOBE);
	public static final Block ATLAS_DOOR = new BaseDoor(MapColor.BLUE);
	public static final Block ATLAS_TRAPDOOR = new BaseTrapDoor(MapColor.BLUE);

	// New Emotion Door & Trapdoor
	public static final Block PINE_DOOR = new BaseDoor(MapColor.BLACK);
	public static final Block PINE_TRAPDOOR = new BaseTrapDoor(MapColor.BLACK);
	public static final Block COCO_DOOR = new BaseDoor(MapColor.YELLOW);
	public static final Block COCO_TRAPDOOR = new BaseTrapDoor(MapColor.YELLOW);
	public static final Block DREAM_DOOR = new BaseDoor(MapColor.GREEN);
	public static final Block DREAM_TRAPDOOR = new BaseTrapDoor(MapColor.GREEN);

	// Base Trapdoor
	public static final Block SPRUCE_TRAPDOOR = new BaseTrapDoor(BlockPlanks.EnumType.SPRUCE.getMapColor());
	public static final Block BIRCH_TRAPDOOR = new BaseTrapDoor(BlockPlanks.EnumType.BIRCH.getMapColor());
	public static final Block JUNGLE_TRAPDOOR = new BaseTrapDoor(BlockPlanks.EnumType.JUNGLE.getMapColor());
	public static final Block ACACIA_TRAPDOOR = new BaseTrapDoor(BlockPlanks.EnumType.ACACIA.getMapColor());
	public static final Block DARK_OAK_TRAPDOOR = new BaseTrapDoor(BlockPlanks.EnumType.DARK_OAK.getMapColor());

	// Emotion Slab
	public static final BaseWoodHalfSlab CHERRY_SLAB = new BaseWoodHalfSlab(MapColor.RED);
	public static final BaseWoodDoubleSlab CHERRY_DOUBLE_SLAB = new BaseWoodDoubleSlab(MapColor.RED, EmotionBlocks.CHERRY_SLAB);
	public static final BaseWoodHalfSlab PEAR_SLAB = new BaseWoodHalfSlab(MapColor.WOOD);
	public static final BaseWoodDoubleSlab PEAR_DOUBLE_SLAB = new BaseWoodDoubleSlab(MapColor.WOOD, EmotionBlocks.PEAR_SLAB);
	public static final BaseWoodHalfSlab ORANGE_SLAB = new BaseWoodHalfSlab(MapColor.ADOBE);
	public static final BaseWoodDoubleSlab ORANGE_DOUBLE_SLAB = new BaseWoodDoubleSlab(MapColor.ADOBE, EmotionBlocks.ORANGE_SLAB);
	public static final BaseWoodHalfSlab ATLAS_SLAB = new BaseWoodHalfSlab(MapColor.BLUE);
	public static final BaseWoodDoubleSlab ATLAS_DOUBLE_SLAB = new BaseWoodDoubleSlab(MapColor.BLUE, EmotionBlocks.ATLAS_SLAB);

	// New Emotion Slab
	public static final BaseWoodHalfSlab PINE_SLAB = new BaseWoodHalfSlab(MapColor.BLACK);
	public static final BaseWoodDoubleSlab PINE_DOUBLE_SLAB = new BaseWoodDoubleSlab(MapColor.BLACK, EmotionBlocks.PINE_SLAB);
	public static final BaseWoodHalfSlab COCO_SLAB = new BaseWoodHalfSlab(MapColor.YELLOW);
	public static final BaseWoodDoubleSlab COCO_DOUBLE_SLAB = new BaseWoodDoubleSlab(MapColor.YELLOW, EmotionBlocks.COCO_SLAB);
	public static final BaseWoodHalfSlab DREAM_SLAB = new BaseWoodHalfSlab(MapColor.GREEN);
	public static final BaseWoodDoubleSlab DREAM_DOUBLE_SLAB = new BaseWoodDoubleSlab(MapColor.GREEN, EmotionBlocks.DREAM_SLAB);

	// Stained Hardened Clay Slab
	public static final BaseClayHalfSlab WHITE_CLAY_SLAB = new BaseClayHalfSlab(MapColor.SNOW);
	public static final BaseClayDoubleSlab WHITE_CLAY_DOUBLE_SLAB = new BaseClayDoubleSlab(MapColor.SNOW, EmotionBlocks.WHITE_CLAY_SLAB);
	public static final BaseClayHalfSlab ORANGE_CLAY_SLAB = new BaseClayHalfSlab(MapColor.ADOBE);
	public static final BaseClayDoubleSlab ORANGE_CLAY_DOUBLE_SLAB = new BaseClayDoubleSlab(MapColor.ADOBE, EmotionBlocks.ORANGE_CLAY_SLAB);
	public static final BaseClayHalfSlab MANGENTA_CLAY_SLAB = new BaseClayHalfSlab(MapColor.MAGENTA);
	public static final BaseClayDoubleSlab MANGENTA_CLAY_DOUBLE_SLAB = new BaseClayDoubleSlab(MapColor.MAGENTA, EmotionBlocks.MANGENTA_CLAY_SLAB);
	public static final BaseClayHalfSlab LIGHT_BLUE_CLAY_SLAB = new BaseClayHalfSlab(MapColor.LIGHT_BLUE);
	public static final BaseClayDoubleSlab LIGHT_BLUE_CLAY_DOUBLE_SLAB = new BaseClayDoubleSlab(MapColor.LIGHT_BLUE, EmotionBlocks.LIGHT_BLUE_CLAY_SLAB);
	public static final BaseClayHalfSlab YELLOW_CLAY_SLAB = new BaseClayHalfSlab(MapColor.YELLOW);
	public static final BaseClayDoubleSlab YELLOW_CLAY_DOUBLE_SLAB = new BaseClayDoubleSlab(MapColor.YELLOW, EmotionBlocks.YELLOW_CLAY_SLAB);
	public static final BaseClayHalfSlab LIME_CLAY_SLAB = new BaseClayHalfSlab(MapColor.LIME);
	public static final BaseClayDoubleSlab LIME_CLAY_DOUBLE_SLAB = new BaseClayDoubleSlab(MapColor.LIME, EmotionBlocks.LIME_CLAY_SLAB);
	public static final BaseClayHalfSlab PINK_CLAY_SLAB = new BaseClayHalfSlab(MapColor.PINK);
	public static final BaseClayDoubleSlab PINK_CLAY_DOUBLE_SLAB = new BaseClayDoubleSlab(MapColor.PINK, EmotionBlocks.PINK_CLAY_SLAB);
	public static final BaseClayHalfSlab GRAY_CLAY_SLAB = new BaseClayHalfSlab(MapColor.GRAY);
	public static final BaseClayDoubleSlab GRAY_CLAY_DOUBLE_SLAB = new BaseClayDoubleSlab(MapColor.GRAY, EmotionBlocks.GRAY_CLAY_SLAB);
	public static final BaseClayHalfSlab SILVER_CLAY_SLAB = new BaseClayHalfSlab(MapColor.SILVER);
	public static final BaseClayDoubleSlab SILVER_CLAY_DOUBLE_SLAB = new BaseClayDoubleSlab(MapColor.SILVER, EmotionBlocks.SILVER_CLAY_SLAB);
	public static final BaseClayHalfSlab CYAN_CLAY_SLAB = new BaseClayHalfSlab(MapColor.CYAN);
	public static final BaseClayDoubleSlab CYAN_CLAY_DOUBLE_SLAB = new BaseClayDoubleSlab(MapColor.CYAN, EmotionBlocks.CYAN_CLAY_SLAB);
	public static final BaseClayHalfSlab PURPLE_CLAY_SLAB = new BaseClayHalfSlab(MapColor.PURPLE);
	public static final BaseClayDoubleSlab PURPLE_CLAY_DOUBLE_SLAB = new BaseClayDoubleSlab(MapColor.PURPLE, EmotionBlocks.PURPLE_CLAY_SLAB);
	public static final BaseClayHalfSlab BLUE_CLAY_SLAB = new BaseClayHalfSlab(MapColor.BLUE);
	public static final BaseClayDoubleSlab BLUE_CLAY_DOUBLE_SLAB = new BaseClayDoubleSlab(MapColor.BLUE, EmotionBlocks.BLUE_CLAY_SLAB);
	public static final BaseClayHalfSlab BROWN_CLAY_SLAB = new BaseClayHalfSlab(MapColor.BROWN);
	public static final BaseClayDoubleSlab BROWN_CLAY_DOUBLE_SLAB = new BaseClayDoubleSlab(MapColor.BROWN, EmotionBlocks.BROWN_CLAY_SLAB);
	public static final BaseClayHalfSlab GREEN_CLAY_SLAB = new BaseClayHalfSlab(MapColor.GREEN);
	public static final BaseClayDoubleSlab GREEN_CLAY_DOUBLE_SLAB = new BaseClayDoubleSlab(MapColor.GREEN, EmotionBlocks.GREEN_CLAY_SLAB);
	public static final BaseClayHalfSlab RED_CLAY_SLAB = new BaseClayHalfSlab(MapColor.RED);
	public static final BaseClayDoubleSlab RED_CLAY_DOUBLE_SLAB = new BaseClayDoubleSlab(MapColor.RED, EmotionBlocks.RED_CLAY_SLAB);
	public static final BaseClayHalfSlab BLACK_CLAY_SLAB = new BaseClayHalfSlab(MapColor.BLACK);
	public static final BaseClayDoubleSlab BLACK_CLAY_DOUBLE_SLAB = new BaseClayDoubleSlab(MapColor.BLACK, EmotionBlocks.BLACK_CLAY_SLAB);

	// Viscous Block
	public static final Block SHIFTING_SAND = new BaseViscous(Material.SAND, SoundType.SAND);
	public static final Block MUD = new BaseViscous(Material.GROUND, SoundType.GROUND);

	// Random Meter Block
	public static final Block RANDOM_METER = new RandomMeter();

	public static final Block BOX = new EmotionTest();
	
	public static void mainRegister()
	{
		registerBlock(FOSSIL_ORE, "fossil_ore");

		registerBlock(PURPURA_ORE, "purpura_ore");
		registerBlock(PURPURA_BLOCK, "purpura_block");

		registerBlock(VIRIDIS_ORE, "viridis_ore");
		registerBlock(VIRIDIS_CRISTAL, "viridis_cristal");
		registerBlock(VIRIDIS_BLOCK, "viridis_block");

		registerBlock(LUME_ORE, "lume_ore");
		registerBlock(DREAM_LUME_ORE, "dream_lume_ore");
		registerBlock(LUME_BLOCK, "lume_block");

		registerBlock(GLITCH, "glitch");

		registerBlockNoItem(PEAR_PLANT, "plant_pear");
		registerBlockNoItem(CHERRY_PLANT, "plant_cherry");
		registerBlockNoItem(ORANGE_PLANT, "plant_orange");
		registerBlockNoItem(TOMATO_PLANT, "plant_tomato");
		registerBlockNoItem(APPLE_PLANT, "plant_apple");

		registerBlockNoItem(BLUE_PLANT, "plant_blue");
		registerBlockNoItem(RED_PLANT, "plant_red");
		registerBlockNoItem(BROWN_PLANT, "plant_brown");

		registerBlock(POT, new ItemBaseBlock(POT), "pot");

		registerBlockNoItem(CAKE_CHOCO, "cake_choco");
		registerBlockNoItem(CAKE_FRUIT, "cake_fruit");
		registerBlockNoItem(CAKE_TOFFEE, "cake_toffee");
		registerBlockNoItem(CAKE_STRAWBERRY, "cake_strawberry");

		registerBlockNoItem(BUSH, "bush");
		registerBlock(BUSH_SIMPLE, new ItemBaseBlock(BUSH_SIMPLE), "bush_simple");

		registerBlock(BRICK, new ItemBaseBlock(BRICK), "brick");

		registerBlock(LIMESTONE, "limestone");
		registerBlock(BUHRSTONE, "buhrstone");
		
		registerBlock(FLOWER, new ItemBaseBlock(FLOWER), "flower");

		registerBlock(MUSHROOM, new ItemBaseBlock(MUSHROOM), "mushroom");

		registerBlock(WOOD_TABLE_CHERRY, "wood_table_cherry");
		registerBlock(WOOD_TABLE_PEAR, "wood_table_pear");
		registerBlock(WOOD_TABLE_ORANGE, "wood_table_orange");
		registerBlock(WOOD_TABLE_ATLAS, "wood_table_atlas");
		registerBlock(WOOD_TABLE_PINE, "wood_table_pine");
		registerBlock(WOOD_TABLE_COCO, "wood_table_coco");
		registerBlock(WOOD_TABLE_DREAM, "wood_table_dream");

		registerBlock(WOOD_TABLE_OAK, "wood_table_oak");
		registerBlock(WOOD_TABLE_SPRUCE, "wood_table_spruce");
		registerBlock(WOOD_TABLE_BIRCH, "wood_table_birch");
		registerBlock(WOOD_TABLE_JUNGLE, "wood_table_jungle");
		registerBlock(WOOD_TABLE_ACACIA, "wood_table_acacia");
		registerBlock(WOOD_TABLE_BIG_OAK, "wood_table_big_oak");

		registerBlock(WOOD_NIGHTSTAND_CHERRY, "wood_nightstand_cherry");
		registerBlock(WOOD_NIGHTSTAND_PEAR, "wood_nightstand_pear");
		registerBlock(WOOD_NIGHTSTAND_ORANGE, "wood_nightstand_orange");
		registerBlock(WOOD_NIGHTSTAND_ATLAS, "wood_nightstand_atlas");
		registerBlock(WOOD_NIGHTSTAND_PINE, "wood_nightstand_pine");
		registerBlock(WOOD_NIGHTSTAND_COCO, "wood_nightstand_coco");
		registerBlock(WOOD_NIGHTSTAND_DREAM, "wood_nightstand_dream");

		registerBlock(WOOD_NIGHTSTAND_OAK, "wood_nightstand_oak");
		registerBlock(WOOD_NIGHTSTAND_SPRUCE, "wood_nightstand_spruce");
		registerBlock(WOOD_NIGHTSTAND_BIRCH, "wood_nightstand_birch");
		registerBlock(WOOD_NIGHTSTAND_JUNGLE, "wood_nightstand_jungle");
		registerBlock(WOOD_NIGHTSTAND_ACACIA, "wood_nightstand_acacia");
		registerBlock(WOOD_NIGHTSTAND_BIG_OAK, "wood_nightstand_big_oak");

		registerBlock(WOOD_CHAIR, new ItemBaseBlock(WOOD_CHAIR), "wood_chair");

		registerBlock(STONE_TABLE_COBBLESTONE, "stone_table_cobblestone");
		registerBlock(STONE_TABLE_MOSSY_COBBLESTONE, "stone_table_mossy_cobblestone");
		registerBlock(STONE_TABLE_STONE_BRICK, "stone_table_stonebrick");
		registerBlock(STONE_TABLE_MOSSY_STONE_BRICK, "stone_table_mossy_stonebrick");
		registerBlock(STONE_TABLE_CRACKED_STONE_BRICK, "stone_table_cracked_stonebrick");
		registerBlock(STONE_TABLE_CHISELLED_STONE_BRICK, "stone_table_chiselled_stonebrick");
		registerBlock(STONE_TABLE_BRICK, "stone_table_brick");

		registerBlock(STONE_CHAIR, new ItemBaseBlock(STONE_CHAIR), "stone_chair");

		registerBlock(LEAVES, new ItemBaseBlock(LEAVES), "leaves");
		registerBlock(NEW_LEAVES, new ItemBaseBlock(NEW_LEAVES), "new_leaves");
		registerBlock(LOG, new ItemBaseBlock(LOG), "log");
		registerBlock(NEW_LOG, new ItemBaseBlock(NEW_LOG), "new_log");
		registerBlock(SAPLING, new ItemBaseBlock(SAPLING), "sapling");
		registerBlock(PLANKS, new ItemBaseBlock(PLANKS), "planks");

		registerBlock(CHERRY_STAIRS, "cherry_stairs");
		registerBlock(PEAR_STAIRS, "pear_stairs");
		registerBlock(ORANGE_STAIRS, "orange_stairs");
		registerBlock(ATLAS_STAIRS, "atlas_stairs");
		registerBlock(PINE_STAIRS, "pine_stairs");
		registerBlock(COCO_STAIRS, "coco_stairs");
		registerBlock(DREAM_STAIRS, "dream_stairs");

		registerBlock(WHITE_CLAY_STAIRS, "white_clay_stairs");
		registerBlock(ORANGE_CLAY_STAIRS, "orange_clay_stairs");
		registerBlock(MANGENTA_CLAY_STAIRS, "magenta_clay_stairs");
		registerBlock(LIGHT_BLUE_CLAY_STAIRS, "light_blue_clay_stairs");
		registerBlock(YELLOW_CLAY_STAIRS, "yellow_clay_stairs");
		registerBlock(LIME_CLAY_STAIRS, "lime_clay_stairs");
		registerBlock(PINK_CLAY_STAIRS, "pink_clay_stairs");
		registerBlock(GRAY_CLAY_STAIRS, "gray_clay_stairs");
		registerBlock(SILVER_CLAY_STAIRS, "silver_clay_stairs");
		registerBlock(CYAN_CLAY_STAIRS, "cyan_clay_stairs");
		registerBlock(PURPLE_CLAY_STAIRS, "purple_clay_stairs");
		registerBlock(BLUE_CLAY_STAIRS, "blue_clay_stairs");
		registerBlock(BROWN_CLAY_STAIRS, "brown_clay_stairs");
		registerBlock(GREEN_CLAY_STAIRS, "green_clay_stairs");
		registerBlock(RED_CLAY_STAIRS, "red_clay_stairs");
		registerBlock(BLACK_CLAY_STAIRS, "black_clay_stairs");

		registerBlock(CHERRY_FENCE, "cherry_fence");
		registerBlock(CHERRY_FENCE_GATE, "cherry_fence_gate");
		registerBlock(PEAR_FENCE, "pear_fence");
		registerBlock(PEAR_FENCE_GATE, "pear_fence_gate");
		registerBlock(ORANGE_FENCE, "orange_fence");
		registerBlock(ORANGE_FENCE_GATE, "orange_fence_gate");
		registerBlock(ATLAS_FENCE, "atlas_fence");
		registerBlock(ATLAS_FENCE_GATE, "atlas_fence_gate");

		registerBlock(PINE_FENCE, "pine_fence");
		registerBlock(PINE_FENCE_GATE, "pine_fence_gate");
		registerBlock(COCO_FENCE, "coco_fence");
		registerBlock(COCO_FENCE_GATE, "coco_fence_gate");
		registerBlock(DREAM_FENCE, "dream_fence");
		registerBlock(DREAM_FENCE_GATE, "dream_fence_gate");

		registerBlockNoItem(CHERRY_DOOR, "cherry_door");
		registerBlock(CHERRY_TRAPDOOR, "cherry_trapdoor");
		registerBlockNoItem(PEAR_DOOR, "pear_door");
		registerBlock(PEAR_TRAPDOOR, "pear_trapdoor");
		registerBlockNoItem(ORANGE_DOOR, "orange_door");
		registerBlock(ORANGE_TRAPDOOR, "orange_trapdoor");
		registerBlockNoItem(ATLAS_DOOR, "atlas_door");
		registerBlock(ATLAS_TRAPDOOR, "atlas_trapdoor");

		registerBlockNoItem(PINE_DOOR, "pine_door");
		registerBlock(PINE_TRAPDOOR, "pine_trapdoor");
		registerBlockNoItem(COCO_DOOR, "coco_door");
		registerBlock(COCO_TRAPDOOR, "coco_trapdoor");
		registerBlockNoItem(DREAM_DOOR, "dream_door");
		registerBlock(DREAM_TRAPDOOR, "dream_trapdoor");

		registerBlock(SPRUCE_TRAPDOOR, "spruce_trapdoor");
		registerBlock(BIRCH_TRAPDOOR, "birch_trapdoor");
		registerBlock(JUNGLE_TRAPDOOR, "jungle_trapdoor");
		registerBlock(ACACIA_TRAPDOOR, "acacia_trapdoor");
		registerBlock(DARK_OAK_TRAPDOOR, "dark_oak_trapdoor");

		registerBlock(CHERRY_SLAB, new ItemSlab(CHERRY_SLAB, CHERRY_SLAB, CHERRY_DOUBLE_SLAB), "cherry_slab");
		registerBlockNoItem(CHERRY_DOUBLE_SLAB, "cherry_double_slab");
		registerBlock(PEAR_SLAB, new ItemSlab(PEAR_SLAB, PEAR_SLAB, PEAR_DOUBLE_SLAB), "pear_slab");
		registerBlockNoItem(PEAR_DOUBLE_SLAB, "pear_double_slab");
		registerBlock(ORANGE_SLAB, new ItemSlab(ORANGE_SLAB, ORANGE_SLAB, ORANGE_DOUBLE_SLAB), "orange_slab");
		registerBlockNoItem(ORANGE_DOUBLE_SLAB, "orange_double_slab");
		registerBlock(ATLAS_SLAB, new ItemSlab(ATLAS_SLAB, ATLAS_SLAB, ATLAS_DOUBLE_SLAB), "atlas_slab");
		registerBlockNoItem(ATLAS_DOUBLE_SLAB, "atlas_double_slab");

		registerBlock(PINE_SLAB, new ItemSlab(PINE_SLAB, PINE_SLAB, PINE_DOUBLE_SLAB), "pine_slab");
		registerBlockNoItem(PINE_DOUBLE_SLAB, "pine_double_slab");
		registerBlock(COCO_SLAB, new ItemSlab(COCO_SLAB, COCO_SLAB, COCO_DOUBLE_SLAB), "coco_slab");
		registerBlockNoItem(COCO_DOUBLE_SLAB, "coco_double_slab");
		registerBlock(DREAM_SLAB, new ItemSlab(DREAM_SLAB, DREAM_SLAB, DREAM_DOUBLE_SLAB), "dream_slab");
		registerBlockNoItem(DREAM_DOUBLE_SLAB, "dream_double_slab");

		registerBlock(WHITE_CLAY_SLAB, new ItemSlab(WHITE_CLAY_SLAB, WHITE_CLAY_SLAB, WHITE_CLAY_DOUBLE_SLAB), "white_clay_slab");
		registerBlockNoItem(WHITE_CLAY_DOUBLE_SLAB, "white_clay_double_slab");
		registerBlock(ORANGE_CLAY_SLAB, new ItemSlab(ORANGE_CLAY_SLAB, ORANGE_CLAY_SLAB, ORANGE_CLAY_DOUBLE_SLAB), "orange_clay_slab");
		registerBlockNoItem(ORANGE_CLAY_DOUBLE_SLAB, "orange_clay_double_slab");
		registerBlock(MANGENTA_CLAY_SLAB, new ItemSlab(MANGENTA_CLAY_SLAB, MANGENTA_CLAY_SLAB, MANGENTA_CLAY_DOUBLE_SLAB), "magenta_clay_slab");
		registerBlockNoItem(MANGENTA_CLAY_DOUBLE_SLAB, "magenta_clay_double_slab");
		registerBlock(LIGHT_BLUE_CLAY_SLAB, new ItemSlab(LIGHT_BLUE_CLAY_SLAB, LIGHT_BLUE_CLAY_SLAB, LIGHT_BLUE_CLAY_DOUBLE_SLAB), "light_blue_clay_slab");
		registerBlockNoItem(LIGHT_BLUE_CLAY_DOUBLE_SLAB, "light_blue_clay_double_slab");
		registerBlock(YELLOW_CLAY_SLAB, new ItemSlab(YELLOW_CLAY_SLAB, YELLOW_CLAY_SLAB, YELLOW_CLAY_DOUBLE_SLAB), "yellow_clay_slab");
		registerBlockNoItem(YELLOW_CLAY_DOUBLE_SLAB, "yellow_clay_double_slab");
		registerBlock(LIME_CLAY_SLAB, new ItemSlab(LIME_CLAY_SLAB, LIME_CLAY_SLAB, LIME_CLAY_DOUBLE_SLAB), "lime_clay_slab");
		registerBlockNoItem(LIME_CLAY_DOUBLE_SLAB, "lime_clay_double_slab");
		registerBlock(PINK_CLAY_SLAB, new ItemSlab(PINK_CLAY_SLAB, PINK_CLAY_SLAB, PINK_CLAY_DOUBLE_SLAB), "pink_clay_slab");
		registerBlockNoItem(PINK_CLAY_DOUBLE_SLAB, "pink_clay_double_slab");
		registerBlock(GRAY_CLAY_SLAB, new ItemSlab(GRAY_CLAY_SLAB, GRAY_CLAY_SLAB, GRAY_CLAY_SLAB), "gray_clay_slab");
		registerBlockNoItem(GRAY_CLAY_DOUBLE_SLAB, "gray_clay_double_slab");
		registerBlock(SILVER_CLAY_SLAB, new ItemSlab(SILVER_CLAY_SLAB, SILVER_CLAY_SLAB, SILVER_CLAY_DOUBLE_SLAB), "silver_clay_slab");
		registerBlockNoItem(SILVER_CLAY_DOUBLE_SLAB, "silver_clay_double_slab");
		registerBlock(CYAN_CLAY_SLAB, new ItemSlab(CYAN_CLAY_SLAB, CYAN_CLAY_SLAB, CYAN_CLAY_DOUBLE_SLAB), "cyan_clay_slab");
		registerBlockNoItem(CYAN_CLAY_DOUBLE_SLAB, "cyan_clay_double_slab");
		registerBlock(PURPLE_CLAY_SLAB, new ItemSlab(PURPLE_CLAY_SLAB, PURPLE_CLAY_SLAB, PURPLE_CLAY_DOUBLE_SLAB), "purple_clay_slab");
		registerBlockNoItem(PURPLE_CLAY_DOUBLE_SLAB, "purple_clay_double_slab");
		registerBlock(BLUE_CLAY_SLAB, new ItemSlab(BLUE_CLAY_SLAB, BLUE_CLAY_SLAB, BLUE_CLAY_DOUBLE_SLAB), "blue_clay_slab");
		registerBlockNoItem(BLUE_CLAY_DOUBLE_SLAB, "blue_clay_double_slab");
		registerBlock(BROWN_CLAY_SLAB, new ItemSlab(BROWN_CLAY_SLAB, BROWN_CLAY_SLAB, BROWN_CLAY_DOUBLE_SLAB), "brown_clay_slab");
		registerBlockNoItem(BROWN_CLAY_DOUBLE_SLAB, "brown_clay_double_slab");
		registerBlock(GREEN_CLAY_SLAB, new ItemSlab(GREEN_CLAY_SLAB, GREEN_CLAY_SLAB, GREEN_CLAY_DOUBLE_SLAB), "green_clay_slab");
		registerBlockNoItem(GREEN_CLAY_DOUBLE_SLAB, "green_clay_double_slab");
		registerBlock(RED_CLAY_SLAB, new ItemSlab(RED_CLAY_SLAB, RED_CLAY_SLAB, RED_CLAY_DOUBLE_SLAB), "red_clay_slab");
		registerBlockNoItem(RED_CLAY_DOUBLE_SLAB, "red_clay_double_slab");
		registerBlock(BLACK_CLAY_SLAB, new ItemSlab(BLACK_CLAY_SLAB, BLACK_CLAY_SLAB, BLACK_CLAY_DOUBLE_SLAB), "black_clay_slab");
		registerBlockNoItem(BLACK_CLAY_DOUBLE_SLAB, "black_clay_double_slab");

		registerBlock(SHIFTING_SAND, "shifting_sand");
		registerBlock(MUD, "mud");
		
		registerBlock(RANDOM_METER, "random_meter");
		
		registerBlock(BOX, "box");
	}

	private static void registerBlockNoItem(Block block, String name)
	{
		block.setUnlocalizedName(name);
		block.setRegistryName(new ResourceLocation(Reference.MOD_ID, name));
		GameRegistry.register(block);
	}

	private static void registerBlock(Block block, String name)
	{
		emotionBlocks.add(block);
		
		block.setUnlocalizedName(name);
		block.setRegistryName(new ResourceLocation(Reference.MOD_ID, name));
		GameRegistry.register(block);
		GameRegistry.register(new ItemBlock(block).setRegistryName(name));
	}

	private static void registerBlock(Block block, ItemBlock itemBlock, String name)
	{
		emotionBlocks.add(block);
		
		block.setUnlocalizedName(name);
		block.setRegistryName(new ResourceLocation(Reference.MOD_ID, name));
		GameRegistry.register(block);
		GameRegistry.register(itemBlock.setRegistryName(name));
	}

	public static void registerRenders()
	{
		for (Block block : emotionBlocks)
		{
			registerRender(block);
		}

		// Loop On Max Meta (16)
		for (int i = 0; i < 16; i++)
		{
			if (i < EmotionPot.EnumPot.values().length)
			{
				registerRender(POT, i, "pot_" + EmotionPot.EnumPot.values()[i].getName());
			}

			if (i < EnumBerry.values().length)
			{
				registerRender(BUSH_SIMPLE, i, "bush_simple_" + EnumBerry.values()[i].getName());
			}

			if (i < EmotionBrick.EnumType.values().length)
			{
				registerRender(BRICK, i, "brick_" + EmotionBrick.EnumType.values()[i].getName());
			}

			if (i < EmotionFlower.EnumType.values().length)
			{
				registerRender(FLOWER, i, "flower_" + EmotionFlower.EnumType.values()[i].getName());
			}

			if (i < EmotionMushroom.EnumType.values().length)
			{
				registerRender(MUSHROOM, i, "mushroom_" + EmotionMushroom.EnumType.values()[i].getName());
			}

			if (i < EnumWoodFurniture.values().length)
			{
				registerRender(WOOD_CHAIR, i, "wood_chair_" + EnumWoodFurniture.values()[i].getName());
			}

			if (i < EnumStoneFurniture.values().length)
			{
				registerRender(STONE_CHAIR, i, "stone_chair_" + EnumStoneFurniture.values()[i].getName());
			}

			if (i < 4)
			{
				registerRender(LEAVES, i, "leaves_" + EmotionPlanks.EnumType.values()[i].getName());
				registerRender(LOG, i, "log_" + EmotionPlanks.EnumType.values()[i].getName());
			}

			if (i < 3)
			{
				registerRender(NEW_LEAVES, i, "leaves_" + EmotionPlanks.EnumType.values()[i + 4].getName());
				registerRender(NEW_LOG, i, "log_" + EmotionPlanks.EnumType.values()[i + 4].getName());
			}

			if (i < EmotionPlanks.EnumType.values().length)
			{
				registerRender(SAPLING, i, "sapling_" + EmotionPlanks.EnumType.values()[i].getName());
				registerRender(PLANKS, i, "planks_" + EmotionPlanks.EnumType.values()[i].getName());
			}
		}
	}

	private static void registerRender(Block block)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation(new ResourceLocation(Reference.MOD_ID, block.getUnlocalizedName().substring(5)), "inventory"));
	}

	private static void registerRender(Block block, int meta, String fileName)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), meta,
				new ModelResourceLocation(new ResourceLocation(Reference.MOD_ID, fileName), "inventory"));
	}
}
