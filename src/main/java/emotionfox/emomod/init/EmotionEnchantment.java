package emotionfox.emomod.init;

import emotionfox.emomod.enchantment.BloodSucking;
import emotionfox.emomod.enchantment.FinalFrost;
import emotionfox.emomod.util.Reference;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;

@ObjectHolder(Reference.MOD_ID)
@Mod.EventBusSubscriber(modid = Reference.MOD_ID)
public class EmotionEnchantment
{
	public static final Enchantment BLOOD_SUCKING = new BloodSucking(Enchantment.Rarity.RARE, EnumEnchantmentType.WEAPON, new EntityEquipmentSlot[]
	{ EntityEquipmentSlot.MAINHAND });
	public static final Enchantment FINAL_FROST = new FinalFrost(Enchantment.Rarity.VERY_RARE, EnumEnchantmentType.WEAPON, new EntityEquipmentSlot[]
	{ EntityEquipmentSlot.MAINHAND });

	public static void mainRegister()
	{
		BLOOD_SUCKING.setRegistryName(new ResourceLocation(Reference.MOD_ID, "blood_sucking"));
		FINAL_FROST.setRegistryName(new ResourceLocation(Reference.MOD_ID, "final_frost"));
	}

	@SubscribeEvent
	public static void registerEnchantment(RegistryEvent.Register<Enchantment> event)
	{
		final Enchantment[] emotionEnchantments =
		{ BLOOD_SUCKING, FINAL_FROST };
		event.getRegistry().registerAll(emotionEnchantments);
	}
}
