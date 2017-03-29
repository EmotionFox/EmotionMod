package emotionfox.emomod.init;

import emotionfox.emomod.enchantment.BloodSucking;
import emotionfox.emomod.enchantment.FinalFrost;
import emotionfox.emomod.util.Reference;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.util.ResourceLocation;

public class EmotionEnchantment
{
	public static final Enchantment BLOOD_SUCKING = new BloodSucking(Enchantment.Rarity.RARE, EnumEnchantmentType.WEAPON, new EntityEquipmentSlot[]
	{ EntityEquipmentSlot.MAINHAND });
	public static final Enchantment FINAL_FROST = new FinalFrost(Enchantment.Rarity.VERY_RARE, EnumEnchantmentType.WEAPON, new EntityEquipmentSlot[]
	{ EntityEquipmentSlot.MAINHAND });

	public static void mainRegister()
	{
		registerEnchant(BLOOD_SUCKING, "blood_sucking");
		registerEnchant(FINAL_FROST, "final_frost");
	}

	public static void registerEnchant(Enchantment enchantment, String name)
	{
		net.minecraftforge.fml.common.registry.GameRegistry.register(enchantment, new ResourceLocation(Reference.MOD_ID, name));
	}
}
