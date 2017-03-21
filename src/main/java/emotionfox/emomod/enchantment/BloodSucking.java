package emotionfox.emomod.enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.inventory.EntityEquipmentSlot;

public class BloodSucking extends Enchantment
{
	public BloodSucking(Rarity rarityIn, EnumEnchantmentType typeIn, EntityEquipmentSlot[] slots)
	{
		super(rarityIn, typeIn, slots);
		this.setName("bloodSucking");
	}
	
	@Override
	public int getMaxLevel()
	{
		return 3;
	}

	@Override
	public int getMinEnchantability(int enchantmentLevel)
	{
		return 10 + 20 * (enchantmentLevel - 1);
	}

	@Override
	public int getMaxEnchantability(int enchantmentLevel)
	{
		return super.getMinEnchantability(enchantmentLevel) + 50;
	}
	
	@Override
	public boolean isCurse()
    {
        return true;
    }

	// Suck The Blood From The Entity
	@Override
	public void onEntityDamaged(EntityLivingBase user, Entity target, int level)
	{
		if (target instanceof EntityLivingBase)
		{
			EntityLivingBase entity = (EntityLivingBase) target;
			float lifeTarget = entity.getHealth();
			float lifeUser = user.getHealth();

			user.setHealth(lifeUser + (lifeTarget / 3) * level);
		}
	}
}
