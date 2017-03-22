package emotionfox.emomod.init;

import java.awt.Color;

import emotionfox.emomod.MainRegistry;
import emotionfox.emomod.entity.EntityBeetle;
import emotionfox.emomod.entity.EntityChubby;
import emotionfox.emomod.entity.EntityLightningBug;
import emotionfox.emomod.entity.EntityMouse;
import emotionfox.emomod.entity.EntityNewBoat;
import emotionfox.emomod.entity.EntityScorpion;
import emotionfox.emomod.entity.EntitySittable;
import emotionfox.emomod.entity.EntitySmallSpider;
import emotionfox.emomod.entity.EntityWildBoar;
import emotionfox.emomod.util.Reference;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class EmotionEntity
{
	protected static int id = 420;
	
	public static void mainRegister()
	{		
		registerEntity("beetle", EntityBeetle.class, "Beetle", false,  new Color(28, 28, 28).getRGB(), new Color(66, 53, 41).getRGB());
		registerEntity("small_spider", EntitySmallSpider.class, "SmallSpider", false, new Color(28, 28, 28).getRGB(), new Color(60, 25, 25).getRGB());
		registerEntity("wild_boar", EntityWildBoar.class, "WildBoar", false, new Color(67, 67, 67).getRGB(), new Color(12, 12, 12).getRGB());
		registerEntity("lightning_bug", EntityLightningBug.class, "LightningBug", false, new Color(108, 89, 69).getRGB(), new Color(0, 255, 0).getRGB());
		registerEntity("new_boat", EntityNewBoat.class, "NewBoat", true);
		registerEntity("mouse", EntityMouse.class, "Mouse", false, new Color(206, 206, 206).getRGB(), new Color(191, 144, 113).getRGB());
		registerEntity("scorpion", EntityScorpion.class, "Scorpion", false, new Color(184, 137, 91).getRGB(), new Color(40, 27, 15).getRGB());
		registerEntity("chubby", EntityChubby.class, "Chubby", false, new Color(235, 235, 235).getRGB(), new Color(45, 223, 137).getRGB());
		registerEntity("sittable", EntitySittable.class, "Sittable", false);
	}
	
	public static void registerEntity(String registryName, Class<? extends Entity> entityClass, String entityName, boolean sendsVelocityUpdates)
	{
		System.out.println("Registrering " + entityName + " with id: " + id);
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID, registryName), entityClass, entityName, id, MainRegistry.instance, 40, 1, sendsVelocityUpdates);
		id++;
	}
	
	public static void registerEntity(String registryName, Class<? extends Entity> entityClass, String entityName, boolean sendsVelocityUpdates, int eggPrimary, int eggSecondary)
	{
		System.out.println("Registrering " + entityName + " with id: " + id);
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID, registryName), entityClass, entityName, id, MainRegistry.instance, 40, 1, sendsVelocityUpdates, eggPrimary, eggSecondary);
		id++;
	}
}
