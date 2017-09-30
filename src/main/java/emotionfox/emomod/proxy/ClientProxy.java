package emotionfox.emomod.proxy;

import java.util.HashMap;
import java.util.Map;

import emotionfox.emomod.blocks.EmotionLeaves;
import emotionfox.emomod.blocks.EmotionNewLeaves;
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
import emotionfox.emomod.handler.RegistrationHandler;
import emotionfox.emomod.init.EmotionBlock;
import emotionfox.emomod.init.EmotionItem;
import emotionfox.emomod.items.model.ModelViridisArmor;
import emotionfox.emomod.util.Reference;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.block.statemap.StateMap;
import net.minecraft.client.renderer.block.statemap.StateMapperBase;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy 
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
        armorModels.put(EmotionItem.VIRIDIS_HELMET, viridisArmor);
        armorModels.put(EmotionItem.VIRIDIS_CHESTPLATE, viridisArmor);
        armorModels.put(EmotionItem.VIRIDIS_BOOTS, viridisArmor);
        armorModels.put(EmotionItem.VIRIDIS_LEGGINGS, viridisArmor);
	}

	@Override
	public void customStateMapper()
	{
		// Ignore Properties
		ModelLoader.setCustomStateMapper(EmotionBlock.LEAVES, (new StateMap.Builder()).ignore(new IProperty[]
		{ EmotionLeaves.CHECK_DECAY, EmotionLeaves.DECAYABLE }).build());
		ModelLoader.setCustomStateMapper(EmotionBlock.NEW_LEAVES, (new StateMap.Builder()).ignore(new IProperty[]
		{ EmotionNewLeaves.CHECK_DECAY, EmotionNewLeaves.DECAYABLE }).build());

		ModelLoader.setCustomStateMapper(EmotionBlock.CHERRY_FENCE_GATE, (new StateMap.Builder()).ignore(new IProperty[]
		{ BaseFenceGate.POWERED }).build());
//		ModelLoader.setCustomStateMapper(EmotionBlock.CHERRY_DOOR, (new StateMap.Builder()).ignore(new IProperty[]
//		{ BaseDoor.POWERED }).build());

		ModelLoader.setCustomStateMapper(EmotionBlock.PEAR_FENCE_GATE, (new StateMap.Builder()).ignore(new IProperty[]
		{ BaseFenceGate.POWERED }).build());
//		ModelLoader.setCustomStateMapper(EmotionBlock.PEAR_DOOR, (new StateMap.Builder()).ignore(new IProperty[]
//		{ BaseDoor.POWERED }).build());

		ModelLoader.setCustomStateMapper(EmotionBlock.ORANGE_FENCE_GATE, (new StateMap.Builder()).ignore(new IProperty[]
		{ BaseFenceGate.POWERED }).build());
//		ModelLoader.setCustomStateMapper(EmotionBlock.ORANGE_DOOR, (new StateMap.Builder()).ignore(new IProperty[]
//		{ BaseDoor.POWERED }).build());

		ModelLoader.setCustomStateMapper(EmotionBlock.ATLAS_FENCE_GATE, (new StateMap.Builder()).ignore(new IProperty[]
		{ BaseFenceGate.POWERED }).build());
//		ModelLoader.setCustomStateMapper(EmotionBlock.ATLAS_DOOR, (new StateMap.Builder()).ignore(new IProperty[]
//		{ BaseDoor.POWERED }).build());

		ModelLoader.setCustomStateMapper(EmotionBlock.PINE_FENCE_GATE, (new StateMap.Builder()).ignore(new IProperty[]
		{ BaseFenceGate.POWERED }).build());
//		ModelLoader.setCustomStateMapper(EmotionBlock.PINE_DOOR, (new StateMap.Builder()).ignore(new IProperty[]
//		{ BaseDoor.POWERED }).build());

		ModelLoader.setCustomStateMapper(EmotionBlock.COCO_FENCE_GATE, (new StateMap.Builder()).ignore(new IProperty[]
		{ BaseFenceGate.POWERED }).build());
//		ModelLoader.setCustomStateMapper(EmotionBlock.COCO_DOOR, (new StateMap.Builder()).ignore(new IProperty[]
//		{ BaseDoor.POWERED }).build());

		ModelLoader.setCustomStateMapper(EmotionBlock.DREAM_FENCE_GATE, (new StateMap.Builder()).ignore(new IProperty[]
		{ BaseFenceGate.POWERED }).build());
//		ModelLoader.setCustomStateMapper(EmotionBlock.DREAM_DOOR, (new StateMap.Builder()).ignore(new IProperty[]
//		{ BaseDoor.POWERED }).build());
	}
	
	@Override
	public void registerRenders()
	{
		RegistrationHandler.registerItemRender();
	}
}