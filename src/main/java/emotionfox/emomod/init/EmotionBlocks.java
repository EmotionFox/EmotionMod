package emotionfox.emomod.init;

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
import emotionfox.emomod.blocks.EmotionWoodChair;
import emotionfox.emomod.blocks.FossilOre;
import emotionfox.emomod.blocks.Glitch;
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
	// Ore & Block
	public static Block fossilOre = new FossilOre().setHardness(0.5F);

	public static Block purpuraOre = new BaseOre(3).setHardness(9F).setResistance(10F).setLightLevel(5);
	public static Block purpuraBlock = new BaseOreBlock();

	public static Block viridisOre = new BaseOre(2).setHardness(5F).setResistance(6F);
	public static Block viridisCristal = new BaseCristal();
	public static Block viridisBlock = new BaseOreBlock();

	public static Block lumeOre = new BaseOre(2).setHardness(4F).setResistance(4F);
	public static Block lumeOre2 = new BaseOre(4).setHardness(4F).setResistance(4F);
	public static Block lumeBlock = new BaseOreBlock();

	// Special
	public static Block glitch = new Glitch().setHardness(4F).setResistance(4F);
	// public static Block dreamPortal;

	// Plantation
	public static Block pearPlant = new BasePlant(EmotionItems.SEED_PEAR, EmotionItems.FRUIT_PEAR);
	public static Block cherryPlant = new BasePlant(EmotionItems.SEED_CHERRY, EmotionItems.FRUIT_CHERRY);
	public static Block orangePlant = new BasePlant(EmotionItems.SEED_ORANGE, EmotionItems.FRUIT_ORANGE);
	public static Block tomatoPlant = new BasePlant(EmotionItems.SEED_TOMATO, EmotionItems.FRUIT_TOMATO);
	public static Block applePlant = new BasePlant(EmotionItems.SEED_APPLE, Items.APPLE);

	// Mushroom
	public static Block bluePlant = new BasePlant(EmotionItems.SPORE_MAGIC, Item.getItemFromBlock(EmotionBlocks.baseMushroom));
	public static Block redPlant = new BasePlant(EmotionItems.SPORE_RED, Item.getItemFromBlock(Blocks.RED_MUSHROOM));
	public static Block brownPlant = new BasePlant(EmotionItems.SPORE_BROWN, Item.getItemFromBlock(Blocks.BROWN_MUSHROOM));

	// Pot
	public static Block basePot = new EmotionPot();

	// Cake
	public static Block cakeChoco = new EmotionCake();
	public static Block cakeFruit = new EmotionCake();
	public static Block cakeToffee = new EmotionCake();
	public static Block cakeStrawberry = new EmotionCake();

	public static Block baseBush = new EmotionBerry();
	public static Block baseBushSimple = new EmotionBerrySimple();

	public static Block baseBrick = new EmotionBrick();

	public static Block limestone = new BaseRock();
	public static Block buhrstone = new BaseRock();

	// Bush
	public static Block baseFlower = new EmotionFlower();
	public static Block baseMushroom = new EmotionMushroom();

	// Furnitures
	public static Block woodTableCherry = new WoodTable();
	public static Block woodTablePear = new WoodTable();
	public static Block woodTableOrange = new WoodTable();
	public static Block woodTableAtlas = new WoodTable();
	public static Block woodTablePine = new WoodTable();
	public static Block woodTableCoco = new WoodTable();
	public static Block woodTableDream = new WoodTable();

	public static Block woodTableOak = new WoodTable();
	public static Block woodTableSpruce = new WoodTable();
	public static Block woodTableBirch = new WoodTable();
	public static Block woodTableJungle = new WoodTable();
	public static Block woodTableAcacia = new WoodTable();
	public static Block woodTableBigOak = new WoodTable();

	public static Block woodNightstandCherry = new WoodNightstand();
	public static Block woodNightstandPear = new WoodNightstand();
	public static Block woodNightstandOrange = new WoodNightstand();
	public static Block woodNightstandAtlas = new WoodNightstand();
	public static Block woodNightstandPine = new WoodNightstand();
	public static Block woodNightstandCoco = new WoodNightstand();
	public static Block woodNightstandDream = new WoodNightstand();

	public static Block woodNightstandOak = new WoodNightstand();
	public static Block woodNightstandSpruce = new WoodNightstand();
	public static Block woodNightstandBirch = new WoodNightstand();
	public static Block woodNightstandJungle = new WoodNightstand();
	public static Block woodNightstandAcacia = new WoodNightstand();
	public static Block woodNightstandBigOak = new WoodNightstand();

	public static Block woodChair = new EmotionWoodChair();

	public static Block stoneTableCobblestone = new StoneTable();
	public static Block stoneTableMossyCobblestone = new StoneTable();
	public static Block stoneTableStoneBrick = new StoneTable();
	public static Block stoneTableMossyStoneBrick = new StoneTable();
	public static Block stoneTableCrackedStoneBrick = new StoneTable();
	public static Block stoneTableChiselledStoneBrick = new StoneTable();
	public static Block stoneTableBrick = new StoneTable();

	public static Block stoneChair = new EmotionStoneChair();

	// Emotion Leaves/Log/Sapling/Planks
	public static Block emoLeaves = new EmotionLeaves();
	public static Block emoNewLeaves = new EmotionNewLeaves();
	public static Block emoLog = new EmotionLog();
	public static Block emoNewLog = new EmotionNewLog();
	public static Block emoSapling = new EmotionSapling();
	public static Block emoPlanks = new EmotionPlanks();

	// Emotion Grass / Dirt
	public static Block dreamGrass;
	public static Block dreamDirt;
	public static Block dreamStone;

	// Emotion Stairs
	public static Block cherryStairs = new BaseStairs(EmotionBlocks.emoPlanks.getDefaultState().withProperty(EmotionPlanks.VARIANT, EmotionPlanks.EnumType.CHERRY));
	public static Block pearStairs = new BaseStairs(EmotionBlocks.emoPlanks.getDefaultState().withProperty(EmotionPlanks.VARIANT, EmotionPlanks.EnumType.PEAR));
	public static Block orangeStairs = new BaseStairs(EmotionBlocks.emoPlanks.getDefaultState().withProperty(EmotionPlanks.VARIANT, EmotionPlanks.EnumType.ORANGE));
	public static Block atlasStairs = new BaseStairs(EmotionBlocks.emoPlanks.getDefaultState().withProperty(EmotionPlanks.VARIANT, EmotionPlanks.EnumType.ATLAS));
	public static Block pineStairs = new BaseStairs(EmotionBlocks.emoPlanks.getDefaultState().withProperty(EmotionPlanks.VARIANT, EmotionPlanks.EnumType.PINE));
	public static Block cocoStairs = new BaseStairs(EmotionBlocks.emoPlanks.getDefaultState().withProperty(EmotionPlanks.VARIANT, EmotionPlanks.EnumType.COCO));
	public static Block dreamStairs = new BaseStairs(EmotionBlocks.emoPlanks.getDefaultState().withProperty(EmotionPlanks.VARIANT, EmotionPlanks.EnumType.DREAM));

	// Stained Hardened Clay Stairs
	public static Block whiteClayStairs = new BaseStairs(Blocks.STAINED_HARDENED_CLAY.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.WHITE));
	public static Block orangeClayStairs = new BaseStairs(Blocks.STAINED_HARDENED_CLAY.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.ORANGE));
	public static Block magentaClayStairs = new BaseStairs(Blocks.STAINED_HARDENED_CLAY.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.MAGENTA));
	public static Block lightBlueClayStairs = new BaseStairs(Blocks.STAINED_HARDENED_CLAY.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.LIGHT_BLUE));
	public static Block yellowClayStairs = new BaseStairs(Blocks.STAINED_HARDENED_CLAY.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.YELLOW));
	public static Block limeClayStairs = new BaseStairs(Blocks.STAINED_HARDENED_CLAY.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.LIME));
	public static Block pinkClayStairs = new BaseStairs(Blocks.STAINED_HARDENED_CLAY.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.PINK));
	public static Block grayClayStairs = new BaseStairs(Blocks.STAINED_HARDENED_CLAY.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.GRAY));
	public static Block silverClayStairs = new BaseStairs(Blocks.STAINED_HARDENED_CLAY.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.SILVER));
	public static Block cyanClayStairs = new BaseStairs(Blocks.STAINED_HARDENED_CLAY.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.CYAN));
	public static Block purpleClayStairs = new BaseStairs(Blocks.STAINED_HARDENED_CLAY.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.PURPLE));
	public static Block blueClayStairs = new BaseStairs(Blocks.STAINED_HARDENED_CLAY.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.BLUE));
	public static Block brownClayStairs = new BaseStairs(Blocks.STAINED_HARDENED_CLAY.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.BROWN));
	public static Block greenClayStairs = new BaseStairs(Blocks.STAINED_HARDENED_CLAY.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.GREEN));
	public static Block redClayStairs = new BaseStairs(Blocks.STAINED_HARDENED_CLAY.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.RED));
	public static Block blackClayStairs = new BaseStairs(Blocks.STAINED_HARDENED_CLAY.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.BLACK));

	// Emotion Fence & Gate
	public static Block cherryFence = new BaseFence(MapColor.RED);
	public static Block cherryFenceGate = new BaseFenceGate(MapColor.RED);
	public static Block pearFence = new BaseFence(MapColor.WOOD);
	public static Block pearFenceGate = new BaseFenceGate(MapColor.WOOD);
	public static Block orangeFence = new BaseFence(MapColor.ADOBE);
	public static Block orangeFenceGate = new BaseFenceGate(MapColor.ADOBE);
	public static Block atlasFence = new BaseFence(MapColor.BLUE);
	public static Block atlasFenceGate = new BaseFenceGate(MapColor.BLUE);

	// New Emotion Fence & Gate
	public static Block pineFence = new BaseFence(MapColor.BLACK);
	public static Block pineFenceGate = new BaseFenceGate(MapColor.BLACK);
	public static Block cocoFence = new BaseFence(MapColor.YELLOW);
	public static Block cocoFenceGate = new BaseFenceGate(MapColor.YELLOW);
	public static Block dreamFence = new BaseFence(MapColor.GREEN);
	public static Block dreamFenceGate = new BaseFenceGate(MapColor.GREEN);

	// Emotion Door & Trapdoor
	public static Block cherryDoor = new BaseDoor(MapColor.RED);
	public static Block cherryTrapdoor = new BaseTrapDoor(MapColor.RED);
	public static Block pearDoor = new BaseDoor(MapColor.WOOD);
	public static Block pearTrapdoor = new BaseTrapDoor(MapColor.WOOD);
	public static Block orangeDoor = new BaseDoor(MapColor.ADOBE);
	public static Block orangeTrapdoor = new BaseTrapDoor(MapColor.ADOBE);
	public static Block atlasDoor = new BaseDoor(MapColor.BLUE);
	public static Block atlasTrapdoor = new BaseTrapDoor(MapColor.BLUE);

	// New Emotion Door & Trapdoor
	public static Block pineDoor = new BaseDoor(MapColor.BLACK);
	public static Block pineTrapdoor = new BaseTrapDoor(MapColor.BLACK);
	public static Block cocoDoor = new BaseDoor(MapColor.YELLOW);
	public static Block cocoTrapdoor = new BaseTrapDoor(MapColor.YELLOW);
	public static Block dreamDoor = new BaseDoor(MapColor.GREEN);
	public static Block dreamTrapdoor = new BaseTrapDoor(MapColor.GREEN);

	// Base Trapdoor
	public static Block spruceTrapdoor = new BaseTrapDoor(BlockPlanks.EnumType.SPRUCE.getMapColor());
	public static Block birchTrapdoor = new BaseTrapDoor(BlockPlanks.EnumType.BIRCH.getMapColor());
	public static Block jungleTrapdoor = new BaseTrapDoor(BlockPlanks.EnumType.JUNGLE.getMapColor());
	public static Block acaciaTrapdoor = new BaseTrapDoor(BlockPlanks.EnumType.ACACIA.getMapColor());
	public static Block darkOakTrapdoor = new BaseTrapDoor(BlockPlanks.EnumType.DARK_OAK.getMapColor());

	// Emotion Slab
	public static BaseWoodHalfSlab cherrySlab = new BaseWoodHalfSlab(MapColor.RED);
	public static BaseWoodDoubleSlab cherryDoubleSlab = new BaseWoodDoubleSlab(MapColor.RED, EmotionBlocks.cherrySlab);
	public static BaseWoodHalfSlab pearSlab = new BaseWoodHalfSlab(MapColor.WOOD);
	public static BaseWoodDoubleSlab pearDoubleSlab = new BaseWoodDoubleSlab(MapColor.WOOD, EmotionBlocks.pearSlab);
	public static BaseWoodHalfSlab orangeSlab = new BaseWoodHalfSlab(MapColor.ADOBE);
	public static BaseWoodDoubleSlab orangeDoubleSlab = new BaseWoodDoubleSlab(MapColor.ADOBE, EmotionBlocks.orangeSlab);
	public static BaseWoodHalfSlab atlasSlab = new BaseWoodHalfSlab(MapColor.BLUE);
	public static BaseWoodDoubleSlab atlasDoubleSlab = new BaseWoodDoubleSlab(MapColor.BLUE, EmotionBlocks.atlasSlab);

	// New Emotion Slab
	public static BaseWoodHalfSlab pineSlab = new BaseWoodHalfSlab(MapColor.BLACK);
	public static BaseWoodDoubleSlab pineDoubleSlab = new BaseWoodDoubleSlab(MapColor.BLACK, EmotionBlocks.pineSlab);
	public static BaseWoodHalfSlab cocoSlab = new BaseWoodHalfSlab(MapColor.YELLOW);
	public static BaseWoodDoubleSlab cocoDoubleSlab = new BaseWoodDoubleSlab(MapColor.YELLOW, EmotionBlocks.cocoSlab);
	public static BaseWoodHalfSlab dreamSlab = new BaseWoodHalfSlab(MapColor.GREEN);
	public static BaseWoodDoubleSlab dreamDoubleSlab = new BaseWoodDoubleSlab(MapColor.GREEN, EmotionBlocks.dreamSlab);

	// Stained Hardened Clay Slab
	public static BaseClayHalfSlab whiteClaySlab = new BaseClayHalfSlab(MapColor.SNOW);
	public static BaseClayDoubleSlab whiteClayDoubleSlab = new BaseClayDoubleSlab(MapColor.SNOW, EmotionBlocks.whiteClaySlab);
	public static BaseClayHalfSlab orangeClaySlab = new BaseClayHalfSlab(MapColor.ADOBE);
	public static BaseClayDoubleSlab orangeClayDoubleSlab = new BaseClayDoubleSlab(MapColor.ADOBE, EmotionBlocks.orangeClaySlab);
	public static BaseClayHalfSlab magentaClaySlab = new BaseClayHalfSlab(MapColor.MAGENTA);
	public static BaseClayDoubleSlab magentaClayDoubleSlab = new BaseClayDoubleSlab(MapColor.MAGENTA, EmotionBlocks.magentaClaySlab);
	public static BaseClayHalfSlab lightBlueClaySlab = new BaseClayHalfSlab(MapColor.LIGHT_BLUE);
	public static BaseClayDoubleSlab lightBlueClayDoubleSlab = new BaseClayDoubleSlab(MapColor.LIGHT_BLUE, EmotionBlocks.lightBlueClaySlab);
	public static BaseClayHalfSlab yellowClaySlab = new BaseClayHalfSlab(MapColor.YELLOW);
	public static BaseClayDoubleSlab yellowClayDoubleSlab = new BaseClayDoubleSlab(MapColor.YELLOW, EmotionBlocks.yellowClaySlab);
	public static BaseClayHalfSlab limeClaySlab = new BaseClayHalfSlab(MapColor.LIME);
	public static BaseClayDoubleSlab limeClayDoubleSlab = new BaseClayDoubleSlab(MapColor.LIME, EmotionBlocks.limeClaySlab);
	public static BaseClayHalfSlab pinkClaySlab = new BaseClayHalfSlab(MapColor.PINK);
	public static BaseClayDoubleSlab pinkClayDoubleSlab = new BaseClayDoubleSlab(MapColor.PINK, EmotionBlocks.pinkClaySlab);
	public static BaseClayHalfSlab grayClaySlab = new BaseClayHalfSlab(MapColor.GRAY);
	public static BaseClayDoubleSlab grayClayDoubleSlab = new BaseClayDoubleSlab(MapColor.GRAY, EmotionBlocks.grayClaySlab);
	public static BaseClayHalfSlab silverClaySlab = new BaseClayHalfSlab(MapColor.SILVER);
	public static BaseClayDoubleSlab silverClayDoubleSlab = new BaseClayDoubleSlab(MapColor.SILVER, EmotionBlocks.silverClaySlab);
	public static BaseClayHalfSlab cyanClaySlab = new BaseClayHalfSlab(MapColor.CYAN);
	public static BaseClayDoubleSlab cyanClayDoubleSlab = new BaseClayDoubleSlab(MapColor.CYAN, EmotionBlocks.cyanClaySlab);
	public static BaseClayHalfSlab purpleClaySlab = new BaseClayHalfSlab(MapColor.PURPLE);
	public static BaseClayDoubleSlab purpleClayDoubleSlab = new BaseClayDoubleSlab(MapColor.PURPLE, EmotionBlocks.purpleClaySlab);
	public static BaseClayHalfSlab blueClaySlab = new BaseClayHalfSlab(MapColor.BLUE);
	public static BaseClayDoubleSlab blueClayDoubleSlab = new BaseClayDoubleSlab(MapColor.BLUE, EmotionBlocks.blueClaySlab);
	public static BaseClayHalfSlab brownClaySlab = new BaseClayHalfSlab(MapColor.BROWN);
	public static BaseClayDoubleSlab brownClayDoubleSlab = new BaseClayDoubleSlab(MapColor.BROWN, EmotionBlocks.brownClaySlab);
	public static BaseClayHalfSlab greenClaySlab = new BaseClayHalfSlab(MapColor.GREEN);
	public static BaseClayDoubleSlab greenClayDoubleSlab = new BaseClayDoubleSlab(MapColor.GREEN, EmotionBlocks.greenClaySlab);
	public static BaseClayHalfSlab redClaySlab = new BaseClayHalfSlab(MapColor.RED);
	public static BaseClayDoubleSlab redClayDoubleSlab = new BaseClayDoubleSlab(MapColor.RED, EmotionBlocks.redClaySlab);
	public static BaseClayHalfSlab blackClaySlab = new BaseClayHalfSlab(MapColor.BLACK);
	public static BaseClayDoubleSlab blackClayDoubleSlab = new BaseClayDoubleSlab(MapColor.BLACK, EmotionBlocks.blackClaySlab);

	// Viscous Block
	public static Block shiftingSand = new BaseViscous(Material.SAND, SoundType.SAND);
	public static Block mud = new BaseViscous(Material.GROUND, SoundType.GROUND);

	// Random Meter Block
	public static Block randomMeter;

	public static void mainRegister()
	{
		registerBlock(fossilOre, "fossil_ore");

		registerBlock(purpuraOre, "purpura_ore");
		registerBlock(purpuraBlock, "purpura_block");

		registerBlock(viridisOre, "viridis_ore");
		registerBlock(viridisCristal, "viridis_cristal");
		registerBlock(viridisBlock, "viridis_block");

		registerBlock(lumeOre, "lume_ore");
		registerBlock(lumeOre2, "lume_ore2");
		registerBlock(lumeBlock, "lume_block");

		registerBlock(glitch, "glitch");

		registerBlockNoItem(pearPlant, "plant_pear");
		registerBlockNoItem(cherryPlant, "plant_cherry");
		registerBlockNoItem(orangePlant, "plant_orange");
		registerBlockNoItem(tomatoPlant, "plant_tomato");
		registerBlockNoItem(applePlant, "plant_apple");

		registerBlockNoItem(bluePlant, "plant_blue");
		registerBlockNoItem(redPlant, "plant_red");
		registerBlockNoItem(brownPlant, "plant_brown");

		registerBlock(basePot, new ItemBaseBlock(basePot), "pot");

		registerBlockNoItem(cakeChoco, "cake_choco");
		registerBlockNoItem(cakeFruit, "cake_fruit");
		registerBlockNoItem(cakeToffee, "cake_toffee");
		registerBlockNoItem(cakeStrawberry, "cake_strawberry");

		registerBlockNoItem(baseBush, "bush");
		registerBlock(baseBushSimple, new ItemBaseBlock(baseBushSimple), "bush_simple");

		registerBlock(baseBrick, new ItemBaseBlock(baseBrick), "brick");

		registerBlock(baseFlower, new ItemBaseBlock(baseFlower), "flower");

		registerBlock(baseMushroom, new ItemBaseBlock(baseMushroom), "mushroom");

		registerBlock(woodTableCherry, "wood_table_cherry");
		registerBlock(woodTablePear, "wood_table_pear");
		registerBlock(woodTableOrange, "wood_table_orange");
		registerBlock(woodTableAtlas, "wood_table_atlas");
		registerBlock(woodTablePine, "wood_table_pine");
		registerBlock(woodTableCoco, "wood_table_coco");
		registerBlock(woodTableDream, "wood_table_dream");

		registerBlock(woodTableOak, "wood_table_oak");
		registerBlock(woodTableSpruce, "wood_table_spruce");
		registerBlock(woodTableBirch, "wood_table_birch");
		registerBlock(woodTableJungle, "wood_table_jungle");
		registerBlock(woodTableAcacia, "wood_table_acacia");
		registerBlock(woodTableBigOak, "wood_table_big_oak");

		registerBlock(woodNightstandCherry, "wood_nightstand_cherry");
		registerBlock(woodNightstandPear, "wood_nightstand_pear");
		registerBlock(woodNightstandOrange, "wood_nightstand_orange");
		registerBlock(woodNightstandAtlas, "wood_nightstand_atlas");
		registerBlock(woodNightstandPine, "wood_nightstand_pine");
		registerBlock(woodNightstandCoco, "wood_nightstand_coco");
		registerBlock(woodNightstandDream, "wood_nightstand_dream");

		registerBlock(woodNightstandOak, "wood_nightstand_oak");
		registerBlock(woodNightstandSpruce, "wood_nightstand_spruce");
		registerBlock(woodNightstandBirch, "wood_nightstand_birch");
		registerBlock(woodNightstandJungle, "wood_nightstand_jungle");
		registerBlock(woodNightstandAcacia, "wood_nightstand_acacia");
		registerBlock(woodNightstandBigOak, "wood_nightstand_big_oak");

		registerBlock(woodChair, new ItemBaseBlock(woodChair), "wood_chair");

		registerBlock(stoneTableCobblestone, "stone_table_cobblestone");
		registerBlock(stoneTableMossyCobblestone, "stone_table_mossy_cobblestone");
		registerBlock(stoneTableStoneBrick, "stone_table_stonebrick");
		registerBlock(stoneTableMossyStoneBrick, "stone_table_mossy_stonebrick");
		registerBlock(stoneTableCrackedStoneBrick, "stone_table_cracked_stonebrick");
		registerBlock(stoneTableChiselledStoneBrick, "stone_table_chiselled_stonebrick");
		registerBlock(stoneTableBrick, "stone_table_brick");

		registerBlock(stoneChair, new ItemBaseBlock(stoneChair), "stone_chair");

		registerBlock(emoLeaves, new ItemBaseBlock(emoLeaves), "leaves");
		registerBlock(emoNewLeaves, new ItemBaseBlock(emoNewLeaves), "new_leaves");
		registerBlock(emoLog, new ItemBaseBlock(emoLog), "log");
		registerBlock(emoNewLog, new ItemBaseBlock(emoNewLog), "new_log");
		registerBlock(emoSapling, new ItemBaseBlock(emoSapling), "sapling");
		registerBlock(emoPlanks, new ItemBaseBlock(emoPlanks), "planks");

		registerBlock(cherryStairs, "cherry_stairs");
		registerBlock(pearStairs, "pear_stairs");
		registerBlock(orangeStairs, "orange_stairs");
		registerBlock(atlasStairs, "atlas_stairs");
		registerBlock(pineStairs, "pine_stairs");
		registerBlock(cocoStairs, "coco_stairs");
		registerBlock(dreamStairs, "dream_stairs");

		registerBlock(whiteClayStairs, "white_clay_stairs");
		registerBlock(orangeClayStairs, "orange_clay_stairs");
		registerBlock(magentaClayStairs, "magenta_clay_stairs");
		registerBlock(lightBlueClayStairs, "light_blue_clay_stairs");
		registerBlock(yellowClayStairs, "yellow_clay_stairs");
		registerBlock(limeClayStairs, "lime_clay_stairs");
		registerBlock(pinkClayStairs, "pink_clay_stairs");
		registerBlock(grayClayStairs, "gray_clay_stairs");
		registerBlock(silverClayStairs, "silver_clay_stairs");
		registerBlock(cyanClayStairs, "cyan_clay_stairs");
		registerBlock(purpleClayStairs, "purple_clay_stairs");
		registerBlock(blueClayStairs, "blue_clay_stairs");
		registerBlock(brownClayStairs, "brown_clay_stairs");
		registerBlock(greenClayStairs, "green_clay_stairs");
		registerBlock(redClayStairs, "red_clay_stairs");
		registerBlock(blackClayStairs, "black_clay_stairs");

		registerBlock(cherryFence, "cherry_fence");
		registerBlock(cherryFenceGate, "cherry_fence_gate");
		registerBlock(pearFence, "pear_fence");
		registerBlock(pearFenceGate, "pear_fence_gate");
		registerBlock(orangeFence, "orange_fence");
		registerBlock(orangeFenceGate, "orange_fence_gate");
		registerBlock(atlasFence, "atlas_fence");
		registerBlock(atlasFenceGate, "atlas_fence_gate");

		registerBlock(pineFence, "pine_fence");
		registerBlock(pineFenceGate, "pine_fence_gate");
		registerBlock(cocoFence, "coco_fence");
		registerBlock(cocoFenceGate, "coco_fence_gate");
		registerBlock(dreamFence, "dream_fence");
		registerBlock(dreamFenceGate, "dream_fence_gate");

		registerBlockNoItem(cherryDoor, "cherry_door");
		registerBlock(cherryTrapdoor, "cherry_trapdoor");
		registerBlockNoItem(pearDoor, "pear_door");
		registerBlock(pearTrapdoor, "pear_trapdoor");
		registerBlockNoItem(orangeDoor, "orange_door");
		registerBlock(orangeTrapdoor, "orange_trapdoor");
		registerBlockNoItem(atlasDoor, "atlas_door");
		registerBlock(atlasTrapdoor, "atlas_trapdoor");

		registerBlockNoItem(pineDoor, "pine_door");
		registerBlock(pineTrapdoor, "pine_trapdoor");
		registerBlockNoItem(cocoDoor, "coco_door");
		registerBlock(cocoTrapdoor, "coco_trapdoor");
		registerBlockNoItem(dreamDoor, "dream_door");
		registerBlock(dreamTrapdoor, "dream_trapdoor");

		registerBlock(spruceTrapdoor, "spruce_trapdoor");
		registerBlock(birchTrapdoor, "birch_trapdoor");
		registerBlock(jungleTrapdoor, "jungle_trapdoor");
		registerBlock(acaciaTrapdoor, "acacia_trapdoor");
		registerBlock(darkOakTrapdoor, "dark_oak_trapdoor");

		registerBlock(cherrySlab, new ItemSlab(cherrySlab, cherrySlab, cherryDoubleSlab), "cherry_slab");
		registerBlockNoItem(cherryDoubleSlab, "cherry_double_slab");
		registerBlock(pearSlab, new ItemSlab(pearSlab, pearSlab, pearDoubleSlab), "pear_slab");
		registerBlockNoItem(pearDoubleSlab, "pear_double_slab");
		registerBlock(orangeSlab, new ItemSlab(orangeSlab, orangeSlab, orangeDoubleSlab), "orange_slab");
		registerBlockNoItem(orangeDoubleSlab, "orange_double_slab");
		registerBlock(atlasSlab, new ItemSlab(atlasSlab, atlasSlab, atlasDoubleSlab), "atlas_slab");
		registerBlockNoItem(atlasDoubleSlab, "atlas_double_slab");

		registerBlock(pineSlab, new ItemSlab(pineSlab, pineSlab, pineDoubleSlab), "pine_slab");
		registerBlockNoItem(pineDoubleSlab, "pine_double_slab");
		registerBlock(cocoSlab, new ItemSlab(cocoSlab, cocoSlab, cocoDoubleSlab), "coco_slab");
		registerBlockNoItem(cocoDoubleSlab, "coco_double_slab");
		registerBlock(dreamSlab, new ItemSlab(dreamSlab, dreamSlab, dreamDoubleSlab), "dream_slab");
		registerBlockNoItem(dreamDoubleSlab, "dream_double_slab");

		registerBlock(whiteClaySlab, new ItemSlab(whiteClaySlab, whiteClaySlab, whiteClayDoubleSlab), "white_clay_slab");
		registerBlockNoItem(whiteClayDoubleSlab, "white_clay_double_slab");
		registerBlock(orangeClaySlab, new ItemSlab(orangeClaySlab, orangeClaySlab, orangeClayDoubleSlab), "orange_clay_slab");
		registerBlockNoItem(orangeClayDoubleSlab, "orange_clay_double_slab");
		registerBlock(magentaClaySlab, new ItemSlab(magentaClaySlab, magentaClaySlab, magentaClayDoubleSlab), "magenta_clay_slab");
		registerBlockNoItem(magentaClayDoubleSlab, "magenta_clay_double_slab");
		registerBlock(lightBlueClaySlab, new ItemSlab(lightBlueClaySlab, lightBlueClaySlab, lightBlueClayDoubleSlab), "light_blue_clay_slab");
		registerBlockNoItem(lightBlueClayDoubleSlab, "light_blue_clay_double_slab");
		registerBlock(yellowClaySlab, new ItemSlab(yellowClaySlab, yellowClaySlab, yellowClayDoubleSlab), "yellow_clay_slab");
		registerBlockNoItem(yellowClayDoubleSlab, "yellow_clay_double_slab");
		registerBlock(limeClaySlab, new ItemSlab(limeClaySlab, limeClaySlab, limeClayDoubleSlab), "lime_clay_slab");
		registerBlockNoItem(limeClayDoubleSlab, "lime_clay_double_slab");
		registerBlock(pinkClaySlab, new ItemSlab(pinkClaySlab, pinkClaySlab, pinkClayDoubleSlab), "pink_clay_slab");
		registerBlockNoItem(pinkClayDoubleSlab, "pink_clay_double_slab");
		registerBlock(grayClaySlab, new ItemSlab(grayClaySlab, grayClaySlab, grayClaySlab), "gray_clay_slab");
		registerBlockNoItem(grayClayDoubleSlab, "gray_clay_double_slab");
		registerBlock(silverClaySlab, new ItemSlab(silverClaySlab, silverClaySlab, silverClayDoubleSlab), "silver_clay_slab");
		registerBlockNoItem(silverClayDoubleSlab, "silver_clay_double_slab");
		registerBlock(cyanClaySlab, new ItemSlab(cyanClaySlab, cyanClaySlab, cyanClayDoubleSlab), "cyan_clay_slab");
		registerBlockNoItem(cyanClayDoubleSlab, "cyan_clay_double_slab");
		registerBlock(purpleClaySlab, new ItemSlab(purpleClaySlab, purpleClaySlab, purpleClayDoubleSlab), "purple_clay_slab");
		registerBlockNoItem(purpleClayDoubleSlab, "purple_clay_double_slab");
		registerBlock(blueClaySlab, new ItemSlab(blueClaySlab, blueClaySlab, blueClayDoubleSlab), "blue_clay_slab");
		registerBlockNoItem(blueClayDoubleSlab, "blue_clay_double_slab");
		registerBlock(brownClaySlab, new ItemSlab(brownClaySlab, brownClaySlab, brownClayDoubleSlab), "brown_clay_slab");
		registerBlockNoItem(brownClayDoubleSlab, "brown_clay_double_slab");
		registerBlock(greenClaySlab, new ItemSlab(greenClaySlab, greenClaySlab, greenClayDoubleSlab), "green_clay_slab");
		registerBlockNoItem(greenClayDoubleSlab, "green_clay_double_slab");
		registerBlock(redClaySlab, new ItemSlab(redClaySlab, redClaySlab, redClayDoubleSlab), "red_clay_slab");
		registerBlockNoItem(redClayDoubleSlab, "red_clay_double_slab");
		registerBlock(blackClaySlab, new ItemSlab(blackClaySlab, blackClaySlab, blackClayDoubleSlab), "black_clay_slab");
		registerBlockNoItem(blackClayDoubleSlab, "black_clay_double_slab");

		registerBlock(shiftingSand, "shifting_sand");
		registerBlock(mud, "mud");
	}

	public static void registerBlockNoItem(Block block, String name)
	{
		block.setUnlocalizedName(name);
		block.setRegistryName(new ResourceLocation(Reference.MOD_ID, name));
		GameRegistry.register(block);
	}

	public static void registerBlock(Block block, String name)
	{
		block.setUnlocalizedName(name);
		block.setRegistryName(new ResourceLocation(Reference.MOD_ID, name));
		GameRegistry.register(block);
		GameRegistry.register(new ItemBlock(block).setRegistryName(name));
	}

	public static void registerBlock(Block block, ItemBlock itemBlock, String name)
	{
		block.setUnlocalizedName(name);
		block.setRegistryName(new ResourceLocation(Reference.MOD_ID, name));
		GameRegistry.register(block);
		GameRegistry.register(itemBlock.setRegistryName(name));
	}

	public static void registerRenders()
	{
		registerRender(fossilOre);

		registerRender(purpuraOre);
		registerRender(purpuraBlock);

		registerRender(viridisOre);
		registerRender(viridisCristal);
		registerRender(viridisBlock);

		registerRender(lumeOre);
		registerRender(lumeOre2);
		registerRender(lumeBlock);

		registerRender(glitch);

		registerRender(woodTableCherry);
		registerRender(woodTablePear);
		registerRender(woodTableOrange);
		registerRender(woodTableAtlas);
		registerRender(woodTablePine);
		registerRender(woodTableCoco);
		registerRender(woodTableDream);

		registerRender(woodTableOak);
		registerRender(woodTableSpruce);
		registerRender(woodTableBirch);
		registerRender(woodTableJungle);
		registerRender(woodTableAcacia);
		registerRender(woodTableBigOak);

		registerRender(woodNightstandCherry);
		registerRender(woodNightstandPear);
		registerRender(woodNightstandOrange);
		registerRender(woodNightstandAtlas);
		registerRender(woodNightstandPine);
		registerRender(woodNightstandCoco);
		registerRender(woodNightstandDream);

		registerRender(woodNightstandOak);
		registerRender(woodNightstandSpruce);
		registerRender(woodNightstandBirch);
		registerRender(woodNightstandJungle);
		registerRender(woodNightstandAcacia);
		registerRender(woodNightstandBigOak);

		registerRender(stoneTableCobblestone);
		registerRender(stoneTableMossyCobblestone);
		registerRender(stoneTableStoneBrick);
		registerRender(stoneTableMossyStoneBrick);
		registerRender(stoneTableCrackedStoneBrick);
		registerRender(stoneTableChiselledStoneBrick);
		registerRender(stoneTableBrick);

		registerRender(cherryStairs);
		registerRender(pearStairs);
		registerRender(orangeStairs);
		registerRender(atlasStairs);
		registerRender(pineStairs);
		registerRender(cocoStairs);
		registerRender(dreamStairs);

		registerRender(whiteClayStairs);
		registerRender(orangeClayStairs);
		registerRender(magentaClayStairs);
		registerRender(lightBlueClayStairs);
		registerRender(yellowClayStairs);
		registerRender(limeClayStairs);
		registerRender(pinkClayStairs);
		registerRender(grayClayStairs);
		registerRender(silverClayStairs);
		registerRender(cyanClayStairs);
		registerRender(purpleClayStairs);
		registerRender(blueClayStairs);
		registerRender(brownClayStairs);
		registerRender(greenClayStairs);
		registerRender(redClayStairs);
		registerRender(blackClayStairs);

		registerRender(cherryFence);
		registerRender(cherryFenceGate);
		registerRender(pearFence);
		registerRender(pearFenceGate);
		registerRender(orangeFence);
		registerRender(orangeFenceGate);
		registerRender(atlasFence);
		registerRender(atlasFenceGate);

		registerRender(pineFence);
		registerRender(pineFenceGate);
		registerRender(cocoFence);
		registerRender(cocoFenceGate);
		registerRender(dreamFence);
		registerRender(dreamFenceGate);

		registerRender(cherryTrapdoor);
		registerRender(pearTrapdoor);
		registerRender(orangeTrapdoor);
		registerRender(atlasTrapdoor);

		registerRender(pineTrapdoor);
		registerRender(cocoTrapdoor);
		registerRender(dreamTrapdoor);

		registerRender(spruceTrapdoor);
		registerRender(birchTrapdoor);
		registerRender(jungleTrapdoor);
		registerRender(acaciaTrapdoor);
		registerRender(darkOakTrapdoor);

		registerRender(cherrySlab);
		registerRender(pearSlab);
		registerRender(orangeSlab);
		registerRender(atlasSlab);

		registerRender(pineSlab);
		registerRender(cocoSlab);
		registerRender(dreamSlab);

		registerRender(whiteClaySlab);
		registerRender(orangeClaySlab);
		registerRender(magentaClaySlab);
		registerRender(lightBlueClaySlab);
		registerRender(yellowClaySlab);
		registerRender(limeClaySlab);
		registerRender(pinkClaySlab);
		registerRender(grayClaySlab);
		registerRender(silverClaySlab);
		registerRender(cyanClaySlab);
		registerRender(purpleClaySlab);
		registerRender(blueClaySlab);
		registerRender(brownClaySlab);
		registerRender(greenClaySlab);
		registerRender(redClaySlab);
		registerRender(blackClaySlab);

		registerRender(shiftingSand);
		registerRender(mud);

		// Loop On Max Meta (16)
		for (int i = 0; i < 16; i++)
		{
			if (i < EmotionPot.EnumPot.values().length)
				registerRender(basePot, i, "pot_" + EmotionPot.EnumPot.values()[i].getName());

			if (i < EnumBerry.values().length)
				registerRender(baseBushSimple, i, "bush_simple_" + EnumBerry.values()[i].getName());

			if (i < EmotionBrick.EnumType.values().length)
				registerRender(baseBrick, i, "brick_" + EmotionBrick.EnumType.values()[i].getName());

			if (i < EmotionFlower.EnumType.values().length)
				registerRender(baseFlower, i, "flower_" + EmotionFlower.EnumType.values()[i].getName());

			if (i < EmotionMushroom.EnumType.values().length)
				registerRender(baseMushroom, i, "mushroom_" + EmotionMushroom.EnumType.values()[i].getName());

			if (i < EnumWoodFurniture.values().length)
				registerRender(woodChair, i, "wood_chair_" + EnumWoodFurniture.values()[i].getName());

			if (i < EnumStoneFurniture.values().length)
				registerRender(stoneChair, i, "stone_chair_" + EnumStoneFurniture.values()[i].getName());

			if (i < 4)
			{
				registerRender(emoLeaves, i, "leaves_" + EmotionPlanks.EnumType.values()[i].getName());
				registerRender(emoLog, i, "log_" + EmotionPlanks.EnumType.values()[i].getName());
			}

			if (i < 3)
			{
				registerRender(emoNewLeaves, i, "leaves_" + EmotionPlanks.EnumType.values()[i + 4].getName());
				registerRender(emoNewLog, i, "log_" + EmotionPlanks.EnumType.values()[i + 4].getName());
			}

			if (i < EmotionPlanks.EnumType.values().length)
			{
				registerRender(emoSapling, i, "sapling_" + EmotionPlanks.EnumType.values()[i].getName());
				registerRender(emoPlanks, i, "planks_" + EmotionPlanks.EnumType.values()[i].getName());
			}
		}
	}

	// Function Without Meta
	public static void registerRender(Block block)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation(new ResourceLocation(Reference.MOD_ID, block.getUnlocalizedName().substring(5)), "inventory"));
	}

	// Function With Meta
	public static void registerRender(Block block, int meta, String fileName)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), meta,
				new ModelResourceLocation(new ResourceLocation(Reference.MOD_ID, fileName), "inventory"));
	}
}
