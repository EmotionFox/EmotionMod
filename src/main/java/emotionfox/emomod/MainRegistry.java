package emotionfox.emomod;

import emotionfox.emomod.event.EmotionGuiHandler;
import emotionfox.emomod.event.EmotionLifeEvent;
import emotionfox.emomod.event.EmotionOverlayEvent;
import emotionfox.emomod.init.EmotionBiome;
import emotionfox.emomod.init.EmotionBlock;
import emotionfox.emomod.init.EmotionEnchantment;
import emotionfox.emomod.init.EmotionEntity;
import emotionfox.emomod.init.EmotionItem;
import emotionfox.emomod.proxy.CommonProxy;
import emotionfox.emomod.util.Reference;
import emotionfox.emomod.world.EmotionWorld;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION, acceptedMinecraftVersions = Reference.ACCEPTED_VERSIONS)
public class MainRegistry
{
	@Instance
	public static MainRegistry instance;

	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		// Load All Other Class By Type
		EmotionItem.mainRegister();
		EmotionBlock.mainRegister();
		EmotionWorld.mainRegister();
		EmotionEntity.mainRegister();
		EmotionEnchantment.mainRegister();
		EmotionBiome.mainRegister();

		proxy.registerTileEntities();
		proxy.registerEntityRendering();
	}

	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		// Register Event Class
		// MinecraftForge.EVENT_BUS.register(new EmotionAchievementEvent());
		MinecraftForge.EVENT_BUS.register(new EmotionLifeEvent());
		MinecraftForge.EVENT_BUS.register(new EmotionOverlayEvent());

		NetworkRegistry.INSTANCE.registerGuiHandler(instance, new EmotionGuiHandler());

		proxy.registerRenders();
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{}
}