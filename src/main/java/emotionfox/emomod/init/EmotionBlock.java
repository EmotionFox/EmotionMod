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
import emotionfox.emomod.blocks.meta.MetaItemBlock;
import emotionfox.emomod.util.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.BlockColored;
import net.minecraft.block.BlockPlanks;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemBlockSpecial;
import net.minecraft.item.ItemDoor;
import net.minecraft.item.ItemSlab;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;

/**
 * @author EmotionFox
 */

public class EmotionBlock
{
	public static final HashSet<Block> BLOCKS = new HashSet<Block>();
	public static final HashSet<Item> BLOCKS_ITEMS = new HashSet<Item>();

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
	public static final Block PEAR_PLANT = new BasePlant();
	public static final Block CHERRY_PLANT = new BasePlant();
	public static final Block ORANGE_PLANT = new BasePlant();
	public static final Block TOMATO_PLANT = new BasePlant();
	public static final Block APPLE_PLANT = new BasePlant();

	// Mushroom
	public static final Block BLUE_PLANT = new BasePlant();
	public static final Block RED_PLANT = new BasePlant();
	public static final Block BROWN_PLANT = new BasePlant();

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
	public static final Block CHERRY_STAIRS = new BaseStairs(EmotionBlock.PLANKS.getDefaultState().withProperty(EmotionPlanks.VARIANT, EmotionPlanks.EnumType.CHERRY));
	public static final Block PEAR_STAIRS = new BaseStairs(EmotionBlock.PLANKS.getDefaultState().withProperty(EmotionPlanks.VARIANT, EmotionPlanks.EnumType.PEAR));
	public static final Block ORANGE_STAIRS = new BaseStairs(EmotionBlock.PLANKS.getDefaultState().withProperty(EmotionPlanks.VARIANT, EmotionPlanks.EnumType.ORANGE));
	public static final Block ATLAS_STAIRS = new BaseStairs(EmotionBlock.PLANKS.getDefaultState().withProperty(EmotionPlanks.VARIANT, EmotionPlanks.EnumType.ATLAS));
	public static final Block PINE_STAIRS = new BaseStairs(EmotionBlock.PLANKS.getDefaultState().withProperty(EmotionPlanks.VARIANT, EmotionPlanks.EnumType.PINE));
	public static final Block COCO_STAIRS = new BaseStairs(EmotionBlock.PLANKS.getDefaultState().withProperty(EmotionPlanks.VARIANT, EmotionPlanks.EnumType.COCO));
	public static final Block DREAM_STAIRS = new BaseStairs(EmotionBlock.PLANKS.getDefaultState().withProperty(EmotionPlanks.VARIANT, EmotionPlanks.EnumType.DREAM));

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
//	public static final Block CHERRY_DOOR = new BaseDoor(MapColor.RED);
	public static final Block CHERRY_TRAPDOOR = new BaseTrapDoor(MapColor.RED);
//	public static final Block PEAR_DOOR = new BaseDoor(MapColor.WOOD);
	public static final Block PEAR_TRAPDOOR = new BaseTrapDoor(MapColor.WOOD);
//	public static final Block ORANGE_DOOR = new BaseDoor(MapColor.ADOBE);
	public static final Block ORANGE_TRAPDOOR = new BaseTrapDoor(MapColor.ADOBE);
//	public static final Block ATLAS_DOOR = new BaseDoor(MapColor.BLUE);
	public static final Block ATLAS_TRAPDOOR = new BaseTrapDoor(MapColor.BLUE);

	// New Emotion Door & Trapdoor
//	public static final Block PINE_DOOR = new BaseDoor(MapColor.BLACK);
	public static final Block PINE_TRAPDOOR = new BaseTrapDoor(MapColor.BLACK);
//	public static final Block COCO_DOOR = new BaseDoor(MapColor.YELLOW);
	public static final Block COCO_TRAPDOOR = new BaseTrapDoor(MapColor.YELLOW);
//	public static final Block DREAM_DOOR = new BaseDoor(MapColor.GREEN);
	public static final Block DREAM_TRAPDOOR = new BaseTrapDoor(MapColor.GREEN);

	// Base Trapdoor
	public static final Block SPRUCE_TRAPDOOR = new BaseTrapDoor(BlockPlanks.EnumType.SPRUCE.getMapColor());
	public static final Block BIRCH_TRAPDOOR = new BaseTrapDoor(BlockPlanks.EnumType.BIRCH.getMapColor());
	public static final Block JUNGLE_TRAPDOOR = new BaseTrapDoor(BlockPlanks.EnumType.JUNGLE.getMapColor());
	public static final Block ACACIA_TRAPDOOR = new BaseTrapDoor(BlockPlanks.EnumType.ACACIA.getMapColor());
	public static final Block DARK_OAK_TRAPDOOR = new BaseTrapDoor(BlockPlanks.EnumType.DARK_OAK.getMapColor());

	// Emotion Slab
	public static final BaseWoodHalfSlab CHERRY_SLAB = new BaseWoodHalfSlab(MapColor.RED);
	public static final BaseWoodDoubleSlab CHERRY_DOUBLE_SLAB = new BaseWoodDoubleSlab(MapColor.RED, EmotionBlock.CHERRY_SLAB);
	public static final BaseWoodHalfSlab PEAR_SLAB = new BaseWoodHalfSlab(MapColor.WOOD);
	public static final BaseWoodDoubleSlab PEAR_DOUBLE_SLAB = new BaseWoodDoubleSlab(MapColor.WOOD, EmotionBlock.PEAR_SLAB);
	public static final BaseWoodHalfSlab ORANGE_SLAB = new BaseWoodHalfSlab(MapColor.ADOBE);
	public static final BaseWoodDoubleSlab ORANGE_DOUBLE_SLAB = new BaseWoodDoubleSlab(MapColor.ADOBE, EmotionBlock.ORANGE_SLAB);
	public static final BaseWoodHalfSlab ATLAS_SLAB = new BaseWoodHalfSlab(MapColor.BLUE);
	public static final BaseWoodDoubleSlab ATLAS_DOUBLE_SLAB = new BaseWoodDoubleSlab(MapColor.BLUE, EmotionBlock.ATLAS_SLAB);

	// New Emotion Slab
	public static final BaseWoodHalfSlab PINE_SLAB = new BaseWoodHalfSlab(MapColor.BLACK);
	public static final BaseWoodDoubleSlab PINE_DOUBLE_SLAB = new BaseWoodDoubleSlab(MapColor.BLACK, EmotionBlock.PINE_SLAB);
	public static final BaseWoodHalfSlab COCO_SLAB = new BaseWoodHalfSlab(MapColor.YELLOW);
	public static final BaseWoodDoubleSlab COCO_DOUBLE_SLAB = new BaseWoodDoubleSlab(MapColor.YELLOW, EmotionBlock.COCO_SLAB);
	public static final BaseWoodHalfSlab DREAM_SLAB = new BaseWoodHalfSlab(MapColor.GREEN);
	public static final BaseWoodDoubleSlab DREAM_DOUBLE_SLAB = new BaseWoodDoubleSlab(MapColor.GREEN, EmotionBlock.DREAM_SLAB);

	// Stained Hardened Clay Slab
	public static final BaseClayHalfSlab WHITE_CLAY_SLAB = new BaseClayHalfSlab(MapColor.SNOW);
	public static final BaseClayDoubleSlab WHITE_CLAY_DOUBLE_SLAB = new BaseClayDoubleSlab(MapColor.SNOW, EmotionBlock.WHITE_CLAY_SLAB);
	public static final BaseClayHalfSlab ORANGE_CLAY_SLAB = new BaseClayHalfSlab(MapColor.ADOBE);
	public static final BaseClayDoubleSlab ORANGE_CLAY_DOUBLE_SLAB = new BaseClayDoubleSlab(MapColor.ADOBE, EmotionBlock.ORANGE_CLAY_SLAB);
	public static final BaseClayHalfSlab MANGENTA_CLAY_SLAB = new BaseClayHalfSlab(MapColor.MAGENTA);
	public static final BaseClayDoubleSlab MANGENTA_CLAY_DOUBLE_SLAB = new BaseClayDoubleSlab(MapColor.MAGENTA, EmotionBlock.MANGENTA_CLAY_SLAB);
	public static final BaseClayHalfSlab LIGHT_BLUE_CLAY_SLAB = new BaseClayHalfSlab(MapColor.LIGHT_BLUE);
	public static final BaseClayDoubleSlab LIGHT_BLUE_CLAY_DOUBLE_SLAB = new BaseClayDoubleSlab(MapColor.LIGHT_BLUE, EmotionBlock.LIGHT_BLUE_CLAY_SLAB);
	public static final BaseClayHalfSlab YELLOW_CLAY_SLAB = new BaseClayHalfSlab(MapColor.YELLOW);
	public static final BaseClayDoubleSlab YELLOW_CLAY_DOUBLE_SLAB = new BaseClayDoubleSlab(MapColor.YELLOW, EmotionBlock.YELLOW_CLAY_SLAB);
	public static final BaseClayHalfSlab LIME_CLAY_SLAB = new BaseClayHalfSlab(MapColor.LIME);
	public static final BaseClayDoubleSlab LIME_CLAY_DOUBLE_SLAB = new BaseClayDoubleSlab(MapColor.LIME, EmotionBlock.LIME_CLAY_SLAB);
	public static final BaseClayHalfSlab PINK_CLAY_SLAB = new BaseClayHalfSlab(MapColor.PINK);
	public static final BaseClayDoubleSlab PINK_CLAY_DOUBLE_SLAB = new BaseClayDoubleSlab(MapColor.PINK, EmotionBlock.PINK_CLAY_SLAB);
	public static final BaseClayHalfSlab GRAY_CLAY_SLAB = new BaseClayHalfSlab(MapColor.GRAY);
	public static final BaseClayDoubleSlab GRAY_CLAY_DOUBLE_SLAB = new BaseClayDoubleSlab(MapColor.GRAY, EmotionBlock.GRAY_CLAY_SLAB);
	public static final BaseClayHalfSlab SILVER_CLAY_SLAB = new BaseClayHalfSlab(MapColor.SILVER);
	public static final BaseClayDoubleSlab SILVER_CLAY_DOUBLE_SLAB = new BaseClayDoubleSlab(MapColor.SILVER, EmotionBlock.SILVER_CLAY_SLAB);
	public static final BaseClayHalfSlab CYAN_CLAY_SLAB = new BaseClayHalfSlab(MapColor.CYAN);
	public static final BaseClayDoubleSlab CYAN_CLAY_DOUBLE_SLAB = new BaseClayDoubleSlab(MapColor.CYAN, EmotionBlock.CYAN_CLAY_SLAB);
	public static final BaseClayHalfSlab PURPLE_CLAY_SLAB = new BaseClayHalfSlab(MapColor.PURPLE);
	public static final BaseClayDoubleSlab PURPLE_CLAY_DOUBLE_SLAB = new BaseClayDoubleSlab(MapColor.PURPLE, EmotionBlock.PURPLE_CLAY_SLAB);
	public static final BaseClayHalfSlab BLUE_CLAY_SLAB = new BaseClayHalfSlab(MapColor.BLUE);
	public static final BaseClayDoubleSlab BLUE_CLAY_DOUBLE_SLAB = new BaseClayDoubleSlab(MapColor.BLUE, EmotionBlock.BLUE_CLAY_SLAB);
	public static final BaseClayHalfSlab BROWN_CLAY_SLAB = new BaseClayHalfSlab(MapColor.BROWN);
	public static final BaseClayDoubleSlab BROWN_CLAY_DOUBLE_SLAB = new BaseClayDoubleSlab(MapColor.BROWN, EmotionBlock.BROWN_CLAY_SLAB);
	public static final BaseClayHalfSlab GREEN_CLAY_SLAB = new BaseClayHalfSlab(MapColor.GREEN);
	public static final BaseClayDoubleSlab GREEN_CLAY_DOUBLE_SLAB = new BaseClayDoubleSlab(MapColor.GREEN, EmotionBlock.GREEN_CLAY_SLAB);
	public static final BaseClayHalfSlab RED_CLAY_SLAB = new BaseClayHalfSlab(MapColor.RED);
	public static final BaseClayDoubleSlab RED_CLAY_DOUBLE_SLAB = new BaseClayDoubleSlab(MapColor.RED, EmotionBlock.RED_CLAY_SLAB);
	public static final BaseClayHalfSlab BLACK_CLAY_SLAB = new BaseClayHalfSlab(MapColor.BLACK);
	public static final BaseClayDoubleSlab BLACK_CLAY_DOUBLE_SLAB = new BaseClayDoubleSlab(MapColor.BLACK, EmotionBlock.BLACK_CLAY_SLAB);

	// Viscous Block
	public static final Block SHIFTING_SAND = new BaseViscous(Material.SAND, SoundType.SAND);
	public static final Block MUD = new BaseViscous(Material.GROUND, SoundType.GROUND);

	// Random Meter Block
	public static final Block RANDOM_METER = new RandomMeter();

	public static final Block BOX = new EmotionTest();

	public static final Item CAKE_CHOCO_ITEM = new ItemBlockSpecial(CAKE_CHOCO).setMaxStackSize(1).setCreativeTab(CreativeTabs.FOOD);
	public static final Item CAKE_FRUIT_ITEM = new ItemBlockSpecial(CAKE_FRUIT).setMaxStackSize(1).setCreativeTab(CreativeTabs.FOOD);
	public static final Item CAKE_TOFFEE_ITEM = new ItemBlockSpecial(CAKE_TOFFEE).setMaxStackSize(1).setCreativeTab(CreativeTabs.FOOD);
	public static final Item CAKE_STRAWBERRY_ITEM = new ItemBlockSpecial(CAKE_STRAWBERRY).setMaxStackSize(1).setCreativeTab(CreativeTabs.FOOD);
	
//	public static final Item CHERRY_DOOR_ITEM = new ItemDoor(CHERRY_DOOR);
//	public static final Item PEAR_DOOR_ITEM = new ItemDoor(PEAR_DOOR);
//	public static final Item ORANGE_DOOR_ITEM = new ItemDoor(ORANGE_DOOR);
//	public static final Item ATLAS_DOOR_ITEM = new ItemDoor(ATLAS_DOOR);
//	
//	public static final Item PINE_DOOR_ITEM = new ItemDoor(PINE_DOOR);
//	public static final Item COCO_DOOR_ITEM = new ItemDoor(COCO_DOOR);
//	public static final Item DREAM_DOOR_ITEM = new ItemDoor(DREAM_DOOR);
	
	public static void mainRegister()
	{
		addBlock(FOSSIL_ORE, "fossil_ore");

		addBlock(PURPURA_ORE, "purpura_ore");
		addBlock(PURPURA_BLOCK, "purpura_block");

		addBlock(VIRIDIS_ORE, "viridis_ore");
		addBlock(VIRIDIS_CRISTAL, "viridis_cristal");
		addBlock(VIRIDIS_BLOCK, "viridis_block");

		addBlock(LUME_ORE, "lume_ore");
		addBlock(DREAM_LUME_ORE, "dream_lume_ore");
		addBlock(LUME_BLOCK, "lume_block");

		addBlock(GLITCH, "glitch");

		addBlock(PEAR_PLANT, "plant_pear");
		addBlock(CHERRY_PLANT, "plant_cherry");
		addBlock(ORANGE_PLANT, "plant_orange");
		addBlock(TOMATO_PLANT, "plant_tomato");
		addBlock(APPLE_PLANT, "plant_apple");

		addBlock(BLUE_PLANT, "plant_blue");
		addBlock(RED_PLANT, "plant_red");
		addBlock(BROWN_PLANT, "plant_brown");

		addBlock(POT, new MetaItemBlock(POT), "pot");

//		addBlock(CAKE_CHOCO, "cake_choco");
//		addBlock(CAKE_FRUIT, "cake_fruit");
//		addBlock(CAKE_TOFFEE, "cake_toffee");
//		addBlock(CAKE_STRAWBERRY, "cake_strawberry");

		addBlock(BUSH, "bush");
		addBlock(BUSH_SIMPLE, new MetaItemBlock(BUSH_SIMPLE), "bush_simple");

		addBlock(BRICK, new MetaItemBlock(BRICK), "brick");

		addBlock(LIMESTONE, "limestone");
		addBlock(BUHRSTONE, "buhrstone");

		addBlock(FLOWER, new MetaItemBlock(FLOWER), "flower");

		addBlock(MUSHROOM, new MetaItemBlock(MUSHROOM), "mushroom");

		addBlock(WOOD_TABLE_CHERRY, "wood_table_cherry");
		addBlock(WOOD_TABLE_PEAR, "wood_table_pear");
		addBlock(WOOD_TABLE_ORANGE, "wood_table_orange");
		addBlock(WOOD_TABLE_ATLAS, "wood_table_atlas");
		addBlock(WOOD_TABLE_PINE, "wood_table_pine");
		addBlock(WOOD_TABLE_COCO, "wood_table_coco");
		addBlock(WOOD_TABLE_DREAM, "wood_table_dream");

		addBlock(WOOD_TABLE_OAK, "wood_table_oak");
		addBlock(WOOD_TABLE_SPRUCE, "wood_table_spruce");
		addBlock(WOOD_TABLE_BIRCH, "wood_table_birch");
		addBlock(WOOD_TABLE_JUNGLE, "wood_table_jungle");
		addBlock(WOOD_TABLE_ACACIA, "wood_table_acacia");
		addBlock(WOOD_TABLE_BIG_OAK, "wood_table_big_oak");

		addBlock(WOOD_NIGHTSTAND_CHERRY, "wood_nightstand_cherry");
		addBlock(WOOD_NIGHTSTAND_PEAR, "wood_nightstand_pear");
		addBlock(WOOD_NIGHTSTAND_ORANGE, "wood_nightstand_orange");
		addBlock(WOOD_NIGHTSTAND_ATLAS, "wood_nightstand_atlas");
		addBlock(WOOD_NIGHTSTAND_PINE, "wood_nightstand_pine");
		addBlock(WOOD_NIGHTSTAND_COCO, "wood_nightstand_coco");
		addBlock(WOOD_NIGHTSTAND_DREAM, "wood_nightstand_dream");

		addBlock(WOOD_NIGHTSTAND_OAK, "wood_nightstand_oak");
		addBlock(WOOD_NIGHTSTAND_SPRUCE, "wood_nightstand_spruce");
		addBlock(WOOD_NIGHTSTAND_BIRCH, "wood_nightstand_birch");
		addBlock(WOOD_NIGHTSTAND_JUNGLE, "wood_nightstand_jungle");
		addBlock(WOOD_NIGHTSTAND_ACACIA, "wood_nightstand_acacia");
		addBlock(WOOD_NIGHTSTAND_BIG_OAK, "wood_nightstand_big_oak");

		addBlock(WOOD_CHAIR, new MetaItemBlock(WOOD_CHAIR), "wood_chair");

		addBlock(STONE_TABLE_COBBLESTONE, "stone_table_cobblestone");
		addBlock(STONE_TABLE_MOSSY_COBBLESTONE, "stone_table_mossy_cobblestone");
		addBlock(STONE_TABLE_STONE_BRICK, "stone_table_stonebrick");
		addBlock(STONE_TABLE_MOSSY_STONE_BRICK, "stone_table_mossy_stonebrick");
		addBlock(STONE_TABLE_CRACKED_STONE_BRICK, "stone_table_cracked_stonebrick");
		addBlock(STONE_TABLE_CHISELLED_STONE_BRICK, "stone_table_chiselled_stonebrick");
		addBlock(STONE_TABLE_BRICK, "stone_table_brick");

		addBlock(STONE_CHAIR, new MetaItemBlock(STONE_CHAIR), "stone_chair");

		addBlock(LEAVES, new MetaItemBlock(LEAVES), "leaves");
		addBlock(NEW_LEAVES, new MetaItemBlock(NEW_LEAVES), "new_leaves");
		addBlock(LOG, new MetaItemBlock(LOG), "log");
		addBlock(NEW_LOG, new MetaItemBlock(NEW_LOG), "new_log");
		addBlock(SAPLING, new MetaItemBlock(SAPLING), "sapling");
		addBlock(PLANKS, new MetaItemBlock(PLANKS), "planks");

		addBlock(CHERRY_STAIRS, "cherry_stairs");
		addBlock(PEAR_STAIRS, "pear_stairs");
		addBlock(ORANGE_STAIRS, "orange_stairs");
		addBlock(ATLAS_STAIRS, "atlas_stairs");
		addBlock(PINE_STAIRS, "pine_stairs");
		addBlock(COCO_STAIRS, "coco_stairs");
		addBlock(DREAM_STAIRS, "dream_stairs");

		addBlock(WHITE_CLAY_STAIRS, "white_clay_stairs");
		addBlock(ORANGE_CLAY_STAIRS, "orange_clay_stairs");
		addBlock(MANGENTA_CLAY_STAIRS, "magenta_clay_stairs");
		addBlock(LIGHT_BLUE_CLAY_STAIRS, "light_blue_clay_stairs");
		addBlock(YELLOW_CLAY_STAIRS, "yellow_clay_stairs");
		addBlock(LIME_CLAY_STAIRS, "lime_clay_stairs");
		addBlock(PINK_CLAY_STAIRS, "pink_clay_stairs");
		addBlock(GRAY_CLAY_STAIRS, "gray_clay_stairs");
		addBlock(SILVER_CLAY_STAIRS, "silver_clay_stairs");
		addBlock(CYAN_CLAY_STAIRS, "cyan_clay_stairs");
		addBlock(PURPLE_CLAY_STAIRS, "purple_clay_stairs");
		addBlock(BLUE_CLAY_STAIRS, "blue_clay_stairs");
		addBlock(BROWN_CLAY_STAIRS, "brown_clay_stairs");
		addBlock(GREEN_CLAY_STAIRS, "green_clay_stairs");
		addBlock(RED_CLAY_STAIRS, "red_clay_stairs");
		addBlock(BLACK_CLAY_STAIRS, "black_clay_stairs");

		addBlock(CHERRY_FENCE, "cherry_fence");
		addBlock(CHERRY_FENCE_GATE, "cherry_fence_gate");
		addBlock(PEAR_FENCE, "pear_fence");
		addBlock(PEAR_FENCE_GATE, "pear_fence_gate");
		addBlock(ORANGE_FENCE, "orange_fence");
		addBlock(ORANGE_FENCE_GATE, "orange_fence_gate");
		addBlock(ATLAS_FENCE, "atlas_fence");
		addBlock(ATLAS_FENCE_GATE, "atlas_fence_gate");

		addBlock(PINE_FENCE, "pine_fence");
		addBlock(PINE_FENCE_GATE, "pine_fence_gate");
		addBlock(COCO_FENCE, "coco_fence");
		addBlock(COCO_FENCE_GATE, "coco_fence_gate");
		addBlock(DREAM_FENCE, "dream_fence");
		addBlock(DREAM_FENCE_GATE, "dream_fence_gate");

//		addBlock(CHERRY_DOOR, "cherry_door");
		addBlock(CHERRY_TRAPDOOR, "cherry_trapdoor");
//		addBlock(PEAR_DOOR, "pear_door");
		addBlock(PEAR_TRAPDOOR, "pear_trapdoor");
//		addBlock(ORANGE_DOOR, "orange_door");
		addBlock(ORANGE_TRAPDOOR, "orange_trapdoor");
//		addBlock(ATLAS_DOOR, "atlas_door");
		addBlock(ATLAS_TRAPDOOR, "atlas_trapdoor");

//		addBlock(PINE_DOOR, "pine_door");
		addBlock(PINE_TRAPDOOR, "pine_trapdoor");
//		addBlock(COCO_DOOR, "coco_door");
		addBlock(COCO_TRAPDOOR, "coco_trapdoor");
//		addBlock(DREAM_DOOR, "dream_door");
		addBlock(DREAM_TRAPDOOR, "dream_trapdoor");

		addBlock(SPRUCE_TRAPDOOR, "spruce_trapdoor");
		addBlock(BIRCH_TRAPDOOR, "birch_trapdoor");
		addBlock(JUNGLE_TRAPDOOR, "jungle_trapdoor");
		addBlock(ACACIA_TRAPDOOR, "acacia_trapdoor");
		addBlock(DARK_OAK_TRAPDOOR, "dark_oak_trapdoor");

		addBlock(CHERRY_SLAB, new ItemSlab(CHERRY_SLAB, CHERRY_SLAB, CHERRY_DOUBLE_SLAB), "cherry_slab");
		addBlock(CHERRY_DOUBLE_SLAB, "cherry_double_slab");
		addBlock(PEAR_SLAB, new ItemSlab(PEAR_SLAB, PEAR_SLAB, PEAR_DOUBLE_SLAB), "pear_slab");
		addBlock(PEAR_DOUBLE_SLAB, "pear_double_slab");
		addBlock(ORANGE_SLAB, new ItemSlab(ORANGE_SLAB, ORANGE_SLAB, ORANGE_DOUBLE_SLAB), "orange_slab");
		addBlock(ORANGE_DOUBLE_SLAB, "orange_double_slab");
		addBlock(ATLAS_SLAB, new ItemSlab(ATLAS_SLAB, ATLAS_SLAB, ATLAS_DOUBLE_SLAB), "atlas_slab");
		addBlock(ATLAS_DOUBLE_SLAB, "atlas_double_slab");

		addBlock(PINE_SLAB, new ItemSlab(PINE_SLAB, PINE_SLAB, PINE_DOUBLE_SLAB), "pine_slab");
		addBlock(PINE_DOUBLE_SLAB, "pine_double_slab");
		addBlock(COCO_SLAB, new ItemSlab(COCO_SLAB, COCO_SLAB, COCO_DOUBLE_SLAB), "coco_slab");
		addBlock(COCO_DOUBLE_SLAB, "coco_double_slab");
		addBlock(DREAM_SLAB, new ItemSlab(DREAM_SLAB, DREAM_SLAB, DREAM_DOUBLE_SLAB), "dream_slab");
		addBlock(DREAM_DOUBLE_SLAB, "dream_double_slab");

		addBlock(WHITE_CLAY_SLAB, new ItemSlab(WHITE_CLAY_SLAB, WHITE_CLAY_SLAB, WHITE_CLAY_DOUBLE_SLAB), "white_clay_slab");
		addBlock(WHITE_CLAY_DOUBLE_SLAB, "white_clay_double_slab");
		addBlock(ORANGE_CLAY_SLAB, new ItemSlab(ORANGE_CLAY_SLAB, ORANGE_CLAY_SLAB, ORANGE_CLAY_DOUBLE_SLAB), "orange_clay_slab");
		addBlock(ORANGE_CLAY_DOUBLE_SLAB, "orange_clay_double_slab");
		addBlock(MANGENTA_CLAY_SLAB, new ItemSlab(MANGENTA_CLAY_SLAB, MANGENTA_CLAY_SLAB, MANGENTA_CLAY_DOUBLE_SLAB), "magenta_clay_slab");
		addBlock(MANGENTA_CLAY_DOUBLE_SLAB, "magenta_clay_double_slab");
		addBlock(LIGHT_BLUE_CLAY_SLAB, new ItemSlab(LIGHT_BLUE_CLAY_SLAB, LIGHT_BLUE_CLAY_SLAB, LIGHT_BLUE_CLAY_DOUBLE_SLAB), "light_blue_clay_slab");
		addBlock(LIGHT_BLUE_CLAY_DOUBLE_SLAB, "light_blue_clay_double_slab");
		addBlock(YELLOW_CLAY_SLAB, new ItemSlab(YELLOW_CLAY_SLAB, YELLOW_CLAY_SLAB, YELLOW_CLAY_DOUBLE_SLAB), "yellow_clay_slab");
		addBlock(YELLOW_CLAY_DOUBLE_SLAB, "yellow_clay_double_slab");
		addBlock(LIME_CLAY_SLAB, new ItemSlab(LIME_CLAY_SLAB, LIME_CLAY_SLAB, LIME_CLAY_DOUBLE_SLAB), "lime_clay_slab");
		addBlock(LIME_CLAY_DOUBLE_SLAB, "lime_clay_double_slab");
		addBlock(PINK_CLAY_SLAB, new ItemSlab(PINK_CLAY_SLAB, PINK_CLAY_SLAB, PINK_CLAY_DOUBLE_SLAB), "pink_clay_slab");
		addBlock(PINK_CLAY_DOUBLE_SLAB, "pink_clay_double_slab");
		addBlock(GRAY_CLAY_SLAB, new ItemSlab(GRAY_CLAY_SLAB, GRAY_CLAY_SLAB, GRAY_CLAY_SLAB), "gray_clay_slab");
		addBlock(GRAY_CLAY_DOUBLE_SLAB, "gray_clay_double_slab");
		addBlock(SILVER_CLAY_SLAB, new ItemSlab(SILVER_CLAY_SLAB, SILVER_CLAY_SLAB, SILVER_CLAY_DOUBLE_SLAB), "silver_clay_slab");
		addBlock(SILVER_CLAY_DOUBLE_SLAB, "silver_clay_double_slab");
		addBlock(CYAN_CLAY_SLAB, new ItemSlab(CYAN_CLAY_SLAB, CYAN_CLAY_SLAB, CYAN_CLAY_DOUBLE_SLAB), "cyan_clay_slab");
		addBlock(CYAN_CLAY_DOUBLE_SLAB, "cyan_clay_double_slab");
		addBlock(PURPLE_CLAY_SLAB, new ItemSlab(PURPLE_CLAY_SLAB, PURPLE_CLAY_SLAB, PURPLE_CLAY_DOUBLE_SLAB), "purple_clay_slab");
		addBlock(PURPLE_CLAY_DOUBLE_SLAB, "purple_clay_double_slab");
		addBlock(BLUE_CLAY_SLAB, new ItemSlab(BLUE_CLAY_SLAB, BLUE_CLAY_SLAB, BLUE_CLAY_DOUBLE_SLAB), "blue_clay_slab");
		addBlock(BLUE_CLAY_DOUBLE_SLAB, "blue_clay_double_slab");
		addBlock(BROWN_CLAY_SLAB, new ItemSlab(BROWN_CLAY_SLAB, BROWN_CLAY_SLAB, BROWN_CLAY_DOUBLE_SLAB), "brown_clay_slab");
		addBlock(BROWN_CLAY_DOUBLE_SLAB, "brown_clay_double_slab");
		addBlock(GREEN_CLAY_SLAB, new ItemSlab(GREEN_CLAY_SLAB, GREEN_CLAY_SLAB, GREEN_CLAY_DOUBLE_SLAB), "green_clay_slab");
		addBlock(GREEN_CLAY_DOUBLE_SLAB, "green_clay_double_slab");
		addBlock(RED_CLAY_SLAB, new ItemSlab(RED_CLAY_SLAB, RED_CLAY_SLAB, RED_CLAY_DOUBLE_SLAB), "red_clay_slab");
		addBlock(RED_CLAY_DOUBLE_SLAB, "red_clay_double_slab");
		addBlock(BLACK_CLAY_SLAB, new ItemSlab(BLACK_CLAY_SLAB, BLACK_CLAY_SLAB, BLACK_CLAY_DOUBLE_SLAB), "black_clay_slab");
		addBlock(BLACK_CLAY_DOUBLE_SLAB, "black_clay_double_slab");

		addBlock(SHIFTING_SAND, "shifting_sand");
		addBlock(MUD, "mud");

		addBlock(RANDOM_METER, "random_meter");

		addBlock(BOX, "box");
		
		addItem(CAKE_CHOCO_ITEM, "cake_choco");
		addItem(CAKE_FRUIT_ITEM, "cake_fruit");
		addItem(CAKE_TOFFEE_ITEM, "cake_toffee");
		addItem(CAKE_STRAWBERRY_ITEM, "cake_strawberry");
		
//		addItem(CHERRY_DOOR_ITEM, "cherry_door");
//		addItem(PEAR_DOOR_ITEM, "pear_door");
//		addItem(ORANGE_DOOR_ITEM, "orange_door");
//		addItem(ATLAS_DOOR_ITEM, "atlas_door");
//		
//		addItem(PINE_DOOR_ITEM, "pine_door");
//		addItem(COCO_DOOR_ITEM, "coco_door");
//		addItem(DREAM_DOOR_ITEM, "dream_door");
	}

	/**
	 * Adding block without proper item.
	 * 
	 * @param block
	 * @param name
	 */
	private static final void addBlock(Block block, String name)
	{
		ItemBlock itemBlock = new ItemBlock(block);

		itemBlock.setRegistryName(new ResourceLocation(Reference.MOD_ID, name));
		BLOCKS_ITEMS.add(itemBlock);

		block.setUnlocalizedName(name);
		block.setRegistryName(new ResourceLocation(Reference.MOD_ID, name));
		BLOCKS.add(block);
	}

	/**
	 * Adding block with proper item, always instance of MetaBlock class.
	 * 
	 * @param block
	 * @param itemBlock
	 * @param name
	 */
	private static final void addBlock(Block block, ItemBlock itemBlock, String name)
	{
		itemBlock.setRegistryName(new ResourceLocation(Reference.MOD_ID, name));
		BLOCKS_ITEMS.add(itemBlock);

		block.setUnlocalizedName(name);
		block.setRegistryName(new ResourceLocation(Reference.MOD_ID, name));
		BLOCKS.add(block);
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
		EmotionItem.ITEMS.add(item);
	}

	/**
	 * Get all blocks added.
	 * 
	 * @return Block[]
	 */
	public static final Block[] getBlocks()
	{
		final Block[] blocks = new Block[BLOCKS.size()];
		int i = 0;

		for (Block block : BLOCKS)
		{
			blocks[i] = block;
			i++;
		}

		return blocks;
	}

	/**
	 * Get all block items added.
	 * 
	 * @return Item[]
	 */
	public static final Item[] getItems()
	{
		final Item[] items = new Item[BLOCKS_ITEMS.size()];
		int i = 0;

		for (Item item : BLOCKS_ITEMS)
		{
			items[i] = item;
			i++;
		}

		return items;
	}
}
