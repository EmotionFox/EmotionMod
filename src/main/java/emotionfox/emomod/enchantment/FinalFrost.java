package emotionfox.emomod.enchantment;

import emotionfox.emomod.util.Reference;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;

public class FinalFrost extends Enchantment
{
	public FinalFrost(Rarity rarityIn, EnumEnchantmentType typeIn, EntityEquipmentSlot[] slots)
	{
		super(rarityIn, typeIn, slots);
		this.setName("finalFrost");
	}

	@Override
	public int getMaxLevel()
	{
		return 1;
	}

	@Override
	public int getMinEnchantability(int enchantmentLevel)
	{
		return enchantmentLevel * 10;
	}

	@Override
	public int getMaxEnchantability(int enchantmentLevel)
	{
		return this.getMinEnchantability(enchantmentLevel) + 15;
	}

	// Make The Entity Static
	@Override
	public void onEntityDamaged(EntityLivingBase user, Entity target, int level)
	{
		if (target instanceof EntityLivingBase)
		{
			EntityLivingBase entity = (EntityLivingBase) target;
			entity.addPotionEffect(new PotionEffect(Potion.getPotionById(2), 200, 8, false, false));
		}
	}
}
