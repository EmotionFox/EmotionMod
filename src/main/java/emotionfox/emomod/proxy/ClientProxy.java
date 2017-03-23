package emotionfox.emomod.proxy;

import java.util.HashMap;
import java.util.Map;

import emotionfox.emomod.blocks.EmotionLeaves;
import emotionfox.emomod.blocks.EmotionNewLeaves;
import emotionfox.emomod.blocks.base.BaseDoor;
import emotionfox.emomod.blocks.base.BaseFenceGate;
import emotionfox.emomod.entity.EntityBeetle;
import emotionfox.emomod.entity.EntityButterfly;
import emotionfox.emomod.entity.EntityChubby;
import emotionfox.emomod.entity.EntityLightningBug;
import emotionfox.emomod.entity.EntityMouse;
import emotionfox.emomod.entity.EntityNewBoat;
import emotionfox.emomod.entity.EntityScorpion;
import emotionfox.emomod.entity.EntitySmallSpider;
import emotionfox.emomod.entity.EntityWildBoar;
import emotionfox.emomod.entity.model.ModelBeetle;
import emotionfox.emomod.entity.model.ModelChubby;
import emotionfox.emomod.entity.model.ModelLightningBug;
import emotionfox.emomod.entity.model.ModelScorpion;
import emotionfox.emomod.entity.model.ModelSmallSpider;
import emotionfox.emomod.entity.render.RenderBasic;
import emotionfox.emomod.entity.render.RenderButterfly;
import emotionfox.emomod.entity.render.RenderFactory;
import emotionfox.emomod.entity.render.RenderMouse;
import emotionfox.emomod.entity.render.RenderNewBoat;
import emotionfox.emomod.entity.render.RenderWildBoar;
import emotionfox.emomod.init.EmotionBlocks;
import emotionfox.emomod.init.EmotionItems;
import emotionfox.emomod.items.model.ModelViridisArmor;
import emotionfox.emomod.util.Reference;
import net.minecraft.block.properties.IProperty;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.client.renderer.block.statemap.StateMap;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class ClientProxy implements CommonProxy 
{
	// Textures
	public static final ResourceLocation BEETLE_TEXTURE = new ResourceLocation(Reference.MOD_ID, "textures/entity/beetle.png");
	public static final ResourceLocation SMALL_SPIDER_TEXTURE = new ResourceLocation(Reference.MOD_ID, "textures/entity/small_spider.png");
	public static final ResourceLocation WILDBOAR_TEXTURE = new ResourceLocation(Reference.MOD_ID, "textures/entity/wildboar.png");
	public static final ResourceLocation LIGHTNING_BUG_TEXTURE = new ResourceLocation(Reference.MOD_ID, "textures/entity/lightning_bug.png");
	public static final ResourceLocation SCORPION_TEXTURE = new ResourceLocation(Reference.MOD_ID, "textures/entity/scorpion.png");
	public static final ResourceLocation CHUBBY_TEXTURE = new ResourceLocation(Reference.MOD_ID, "textures/entity/chubby.png");
	
	public static final Map<Item, ModelBiped> armorModels = new HashMap<Item, ModelBiped>();
	
	@Override
	public void registerModelBakeryStuff() {
		ModelBakery.registerItemVariants(Item.getItemFromBlock(EmotionBlocks.basePot),
				new ResourceLocation(Reference.MOD_ID, "pot_apple"),
				new ResourceLocation(Reference.MOD_ID, "pot_blackcurrant"),
				new ResourceLocation(Reference.MOD_ID, "pot_blueberry"),
				new ResourceLocation(Reference.MOD_ID, "pot_cherry"),
				new ResourceLocation(Reference.MOD_ID, "pot_chocolate"),
				new ResourceLocation(Reference.MOD_ID, "pot_orange"),
				new ResourceLocation(Reference.MOD_ID, "pot_pear"),
				new ResourceLocation(Reference.MOD_ID, "pot_redcurrant"),
				new ResourceLocation(Reference.MOD_ID, "pot_strawberry"),
				new ResourceLocation(Reference.MOD_ID, "pot_dreamcurrant"),
				new ResourceLocation(Reference.MOD_ID, "pot_glass"),
				new ResourceLocation(Reference.MOD_ID, "pot_water"), 
				new ResourceLocation(Reference.MOD_ID, "pot_lava"),
				new ResourceLocation(Reference.MOD_ID, "pot_milk"));
		ModelBakery.registerItemVariants(Item.getItemFromBlock(EmotionBlocks.baseBush),
				new ResourceLocation(Reference.MOD_ID, "bush_blueberry"),
				new ResourceLocation(Reference.MOD_ID, "bush_redcurrant"),
				new ResourceLocation(Reference.MOD_ID, "bush_blackcurrant"),
				new ResourceLocation(Reference.MOD_ID, "bush_strawberry"),
				new ResourceLocation(Reference.MOD_ID, "bush_dreamcurrant"));
		ModelBakery.registerItemVariants(Item.getItemFromBlock(EmotionBlocks.baseBushSimple),
				new ResourceLocation(Reference.MOD_ID, "bush_simple_blueberry"),
				new ResourceLocation(Reference.MOD_ID, "bush_simple_redcurrant"),
				new ResourceLocation(Reference.MOD_ID, "bush_simple_blackcurrant"),
				new ResourceLocation(Reference.MOD_ID, "bush_simple_strawberry"),
				new ResourceLocation(Reference.MOD_ID, "bush_simple_dreamcurrant"));
		ModelBakery.registerItemVariants(Item.getItemFromBlock(EmotionBlocks.baseBrick),
				new ResourceLocation(Reference.MOD_ID, "brick_red"),
				new ResourceLocation(Reference.MOD_ID, "brick_green"),
				new ResourceLocation(Reference.MOD_ID, "brick_blue"),
				new ResourceLocation(Reference.MOD_ID, "brick_limestone"));
		ModelBakery.registerItemVariants(Item.getItemFromBlock(EmotionBlocks.baseFlower),
				new ResourceLocation(Reference.MOD_ID, "flower_kitty"),
				new ResourceLocation(Reference.MOD_ID, "flower_nox"),
				new ResourceLocation(Reference.MOD_ID, "flower_dely"),
				new ResourceLocation(Reference.MOD_ID, "flower_gnon"),
				new ResourceLocation(Reference.MOD_ID, "flower_thorny"),
				new ResourceLocation(Reference.MOD_ID, "flower_centus"),
				new ResourceLocation(Reference.MOD_ID, "flower_tallgrass"),
				new ResourceLocation(Reference.MOD_ID, "flower_nebula"),
				new ResourceLocation(Reference.MOD_ID, "flower_narcota"));
		ModelBakery.registerItemVariants(Item.getItemFromBlock(EmotionBlocks.baseMushroom),
				new ResourceLocation(Reference.MOD_ID, "mushroom_blue"),
				new ResourceLocation(Reference.MOD_ID, "mushroom_green"));
		ModelBakery.registerItemVariants(Item.getItemFromBlock(EmotionBlocks.woodChair),
				new ResourceLocation(Reference.MOD_ID, "wood_chair_cherry"),
				new ResourceLocation(Reference.MOD_ID, "wood_chair_pear"),
				new ResourceLocation(Reference.MOD_ID, "wood_chair_orange"),
				new ResourceLocation(Reference.MOD_ID, "wood_chair_atlas"),
				new ResourceLocation(Reference.MOD_ID, "wood_chair_pine"),
				new ResourceLocation(Reference.MOD_ID, "wood_chair_coco"),
				new ResourceLocation(Reference.MOD_ID, "wood_chair_dream"),
				new ResourceLocation(Reference.MOD_ID, "wood_chair_oak"),
				new ResourceLocation(Reference.MOD_ID, "wood_chair_spruce"),
				new ResourceLocation(Reference.MOD_ID, "wood_chair_birch"),
				new ResourceLocation(Reference.MOD_ID, "wood_chair_jungle"),
				new ResourceLocation(Reference.MOD_ID, "wood_chair_acacia"),
				new ResourceLocation(Reference.MOD_ID, "wood_chair_big_oak"));
		ModelBakery.registerItemVariants(Item.getItemFromBlock(EmotionBlocks.stoneChair),
				new ResourceLocation(Reference.MOD_ID, "stone_chair_cobblestone"),
				new ResourceLocation(Reference.MOD_ID, "stone_chair_mossy_cobblestone"),
				new ResourceLocation(Reference.MOD_ID, "stone_chair_stonebrick"),
				new ResourceLocation(Reference.MOD_ID, "stone_chair_mossy_stonebrick"),
				new ResourceLocation(Reference.MOD_ID, "stone_chair_cracked_stonebrick"),
				new ResourceLocation(Reference.MOD_ID, "stone_chair_chiselled_stonebrick"),
				new ResourceLocation(Reference.MOD_ID, "stone_chair_brick"));
		ModelBakery.registerItemVariants(Item.getItemFromBlock(EmotionBlocks.emoLeaves),
				new ResourceLocation(Reference.MOD_ID, "leaves_cherry"),
				new ResourceLocation(Reference.MOD_ID, "leaves_pear"),
				new ResourceLocation(Reference.MOD_ID, "leaves_orange"),
				new ResourceLocation(Reference.MOD_ID, "leaves_atlas"));
		ModelBakery.registerItemVariants(Item.getItemFromBlock(EmotionBlocks.emoNewLeaves),
				new ResourceLocation(Reference.MOD_ID, "leaves_pine"),
				new ResourceLocation(Reference.MOD_ID, "leaves_coco"),
				new ResourceLocation(Reference.MOD_ID, "leaves_dream"));
		ModelBakery.registerItemVariants(Item.getItemFromBlock(EmotionBlocks.emoLog),
				new ResourceLocation(Reference.MOD_ID, "log_cherry"),
				new ResourceLocation(Reference.MOD_ID, "log_pear"),
				new ResourceLocation(Reference.MOD_ID, "log_orange"),
				new ResourceLocation(Reference.MOD_ID, "log_atlas"));
		ModelBakery.registerItemVariants(Item.getItemFromBlock(EmotionBlocks.emoNewLog),
				new ResourceLocation(Reference.MOD_ID, "log_pine"),
				new ResourceLocation(Reference.MOD_ID, "log_coco"),
				new ResourceLocation(Reference.MOD_ID, "log_dream"));
		ModelBakery.registerItemVariants(Item.getItemFromBlock(EmotionBlocks.emoSapling),
				new ResourceLocation(Reference.MOD_ID, "sapling_cherry"),
				new ResourceLocation(Reference.MOD_ID, "sapling_pear"),
				new ResourceLocation(Reference.MOD_ID, "sapling_orange"),
				new ResourceLocation(Reference.MOD_ID, "sapling_atlas"),
				new ResourceLocation(Reference.MOD_ID, "sapling_pine"),
				new ResourceLocation(Reference.MOD_ID, "sapling_coco"),
				new ResourceLocation(Reference.MOD_ID, "sapling_dream"));
		ModelBakery.registerItemVariants(Item.getItemFromBlock(EmotionBlocks.emoPlanks),
				new ResourceLocation(Reference.MOD_ID, "planks_cherry"),
				new ResourceLocation(Reference.MOD_ID, "planks_pear"),
				new ResourceLocation(Reference.MOD_ID, "planks_orange"),
				new ResourceLocation(Reference.MOD_ID, "planks_atlas"),
				new ResourceLocation(Reference.MOD_ID, "planks_pine"),
				new ResourceLocation(Reference.MOD_ID, "planks_coco"),
				new ResourceLocation(Reference.MOD_ID, "planks_dream"));
	}
	
	@Override	
	public void registerEntityRendering()
	{
		RenderingRegistry.registerEntityRenderingHandler(EntityNewBoat.class, new RenderFactory(RenderNewBoat.class.getName()));
		RenderingRegistry.registerEntityRenderingHandler(EntityBeetle.class, new RenderFactory(RenderBasic.class.getName(), new ModelBeetle(), 0.1F, BEETLE_TEXTURE));
		RenderingRegistry.registerEntityRenderingHandler(EntitySmallSpider.class, new RenderFactory(RenderBasic.class.getName(), new ModelSmallSpider(), 0.15F, SMALL_SPIDER_TEXTURE));
		RenderingRegistry.registerEntityRenderingHandler(EntityWildBoar.class, new RenderFactory(RenderWildBoar.class.getName()));
		RenderingRegistry.registerEntityRenderingHandler(EntityLightningBug.class, new RenderFactory(RenderBasic.class.getName(), new ModelLightningBug(), 0.0F, LIGHTNING_BUG_TEXTURE));
		RenderingRegistry.registerEntityRenderingHandler(EntityMouse.class, new RenderFactory(RenderMouse.class.getName()));
		RenderingRegistry.registerEntityRenderingHandler(EntityButterfly.class, new RenderFactory(RenderButterfly.class.getName()));
		RenderingRegistry.registerEntityRenderingHandler(EntityScorpion.class, new RenderFactory(RenderBasic.class.getName(), new ModelScorpion(), 0.15F, SCORPION_TEXTURE));
		RenderingRegistry.registerEntityRenderingHandler(EntityChubby.class, new RenderFactory(RenderBasic.class.getName(), new ModelChubby(), 0.0F, CHUBBY_TEXTURE));
		
		ModelViridisArmor viridisArmor = new ModelViridisArmor(0.5F);
        armorModels.put(EmotionItems.VIRIDIS_HELMET, viridisArmor);
        armorModels.put(EmotionItems.VIRIDIS_CHESTPLATE, viridisArmor);
        armorModels.put(EmotionItems.VIRIDIS_BOOTS, viridisArmor);
        armorModels.put(EmotionItems.VIRIDIS_LEGGINGS, viridisArmor);
	}

	@Override
	public void customStateMapper()
	{
		// Ignore Properties
		ModelLoader.setCustomStateMapper(EmotionBlocks.emoLeaves, (new StateMap.Builder()).ignore(new IProperty[]
		{ EmotionLeaves.CHECK_DECAY, EmotionLeaves.DECAYABLE }).build());
		ModelLoader.setCustomStateMapper(EmotionBlocks.emoNewLeaves, (new StateMap.Builder()).ignore(new IProperty[]
		{ EmotionNewLeaves.CHECK_DECAY, EmotionNewLeaves.DECAYABLE }).build());

		ModelLoader.setCustomStateMapper(EmotionBlocks.cherryFenceGate, (new StateMap.Builder()).ignore(new IProperty[]
		{ BaseFenceGate.POWERED }).build());
		ModelLoader.setCustomStateMapper(EmotionBlocks.cherryDoor, (new StateMap.Builder()).ignore(new IProperty[]
		{ BaseDoor.POWERED }).build());

		ModelLoader.setCustomStateMapper(EmotionBlocks.pearFenceGate, (new StateMap.Builder()).ignore(new IProperty[]
		{ BaseFenceGate.POWERED }).build());
		ModelLoader.setCustomStateMapper(EmotionBlocks.pearDoor, (new StateMap.Builder()).ignore(new IProperty[]
		{ BaseDoor.POWERED }).build());

		ModelLoader.setCustomStateMapper(EmotionBlocks.orangeFenceGate, (new StateMap.Builder()).ignore(new IProperty[]
		{ BaseFenceGate.POWERED }).build());
		ModelLoader.setCustomStateMapper(EmotionBlocks.orangeDoor, (new StateMap.Builder()).ignore(new IProperty[]
		{ BaseDoor.POWERED }).build());

		ModelLoader.setCustomStateMapper(EmotionBlocks.atlasFenceGate, (new StateMap.Builder()).ignore(new IProperty[]
		{ BaseFenceGate.POWERED }).build());
		ModelLoader.setCustomStateMapper(EmotionBlocks.atlasDoor, (new StateMap.Builder()).ignore(new IProperty[]
		{ BaseDoor.POWERED }).build());

		ModelLoader.setCustomStateMapper(EmotionBlocks.pineFenceGate, (new StateMap.Builder()).ignore(new IProperty[]
		{ BaseFenceGate.POWERED }).build());
		ModelLoader.setCustomStateMapper(EmotionBlocks.pineDoor, (new StateMap.Builder()).ignore(new IProperty[]
		{ BaseDoor.POWERED }).build());

		ModelLoader.setCustomStateMapper(EmotionBlocks.cocoFenceGate, (new StateMap.Builder()).ignore(new IProperty[]
		{ BaseFenceGate.POWERED }).build());
		ModelLoader.setCustomStateMapper(EmotionBlocks.cocoDoor, (new StateMap.Builder()).ignore(new IProperty[]
		{ BaseDoor.POWERED }).build());

		ModelLoader.setCustomStateMapper(EmotionBlocks.dreamFenceGate, (new StateMap.Builder()).ignore(new IProperty[]
		{ BaseFenceGate.POWERED }).build());
		ModelLoader.setCustomStateMapper(EmotionBlocks.dreamDoor, (new StateMap.Builder()).ignore(new IProperty[]
		{ BaseDoor.POWERED }).build());
	}
	
	@Override
	public void registerRenders() {
		EmotionBlocks.registerRenders();
		EmotionItems.registerRenders();
	}
}