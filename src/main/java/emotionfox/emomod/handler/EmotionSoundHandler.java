package emotionfox.emomod.handler;

import emotionfox.emomod.util.Reference;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;

public class EmotionSoundHandler
{
	private static int size = 0;
	
	public static SoundEvent ENTITY_WILD_BOAR_AMBIENT;
	public static SoundEvent ENTITY_WILD_BOAR_HURT;
	public static SoundEvent ENTITY_WILD_BOAR_DEATH;
	public static SoundEvent ITEM_BUTTERFLY_NET_USE;
	
	public static void init()
	{
		size = SoundEvent.REGISTRY.getKeys().size();
		
		ENTITY_WILD_BOAR_AMBIENT = register("entity.wild_boar.ambient");
		ENTITY_WILD_BOAR_HURT = register("entity.wild_boar.hurt");
		ENTITY_WILD_BOAR_DEATH = register("entity.wild_boar.death");
		ITEM_BUTTERFLY_NET_USE = register("item.butterfly_net.use");
	}
	
	public static SoundEvent register(String nameIn)
	{
		ResourceLocation location = new ResourceLocation(Reference.MOD_ID, nameIn);
		SoundEvent sound = new SoundEvent(location).setRegistryName(location);
		
		SoundEvent.REGISTRY.register(size, location, sound);
		size++;
		
		return sound;
	}
}
