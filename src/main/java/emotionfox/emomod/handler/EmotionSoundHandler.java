package emotionfox.emomod.handler;

import emotionfox.emomod.util.Reference;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;

@ObjectHolder(Reference.MOD_ID)
@Mod.EventBusSubscriber(modid = Reference.MOD_ID)
public class EmotionSoundHandler
{
	public static final SoundEvent ENTITY_WILD_BOAR_AMBIENT = createSoundEvent("entity.wild_boar.ambient");
	public static final SoundEvent ENTITY_WILD_BOAR_HURT = createSoundEvent("entity.wild_boar.hurt");
	public static final SoundEvent ENTITY_WILD_BOAR_DEATH = createSoundEvent("entity.wild_boar.death");
	public static final SoundEvent ITEM_BUTTERFLY_NET_USE = createSoundEvent("item.butterfly_net.use");

	public static void init()
	{
		ENTITY_WILD_BOAR_AMBIENT.setRegistryName(new ResourceLocation(Reference.MOD_ID, "entity.wild_boar.ambient"));
		ENTITY_WILD_BOAR_HURT.setRegistryName(new ResourceLocation(Reference.MOD_ID, "entity.wild_boar.hurt"));
		ENTITY_WILD_BOAR_DEATH.setRegistryName(new ResourceLocation(Reference.MOD_ID, "entity.wild_boar.death"));
		ITEM_BUTTERFLY_NET_USE.setRegistryName(new ResourceLocation(Reference.MOD_ID, "item.butterfly_net.use"));
	}

	private static SoundEvent createSoundEvent(final String soundName)
	{
		final ResourceLocation soundID = new ResourceLocation(Reference.MOD_ID, soundName);
		return new SoundEvent(soundID).setRegistryName(soundID);
	}

	@SubscribeEvent
	public static void registerSound(RegistryEvent.Register<SoundEvent> event)
	{
		event.getRegistry().registerAll(ENTITY_WILD_BOAR_AMBIENT, ENTITY_WILD_BOAR_HURT, ENTITY_WILD_BOAR_DEATH, ITEM_BUTTERFLY_NET_USE);
	}
}
