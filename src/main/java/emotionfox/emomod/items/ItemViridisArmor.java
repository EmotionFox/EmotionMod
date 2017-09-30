package emotionfox.emomod.items;

import emotionfox.emomod.init.EmotionBlock;
import emotionfox.emomod.init.EmotionItem;
import emotionfox.emomod.proxy.ClientProxy;
import emotionfox.emomod.util.Reference;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemViridisArmor extends ItemArmor
{
	public ItemViridisArmor(int renderIndexIn, EntityEquipmentSlot equipmentSlotIn)
	{
		super(EmotionItem.ARMOR_MAT_VIRIDIS, renderIndexIn, equipmentSlotIn);
	}

	@Override
	public ModelBiped getArmorModel(EntityLivingBase entityLiving, ItemStack itemStack, EntityEquipmentSlot armorSlot, ModelBiped _default)
	{
		ModelBiped armorModel = ClientProxy.armorModels.get(this);

		if (armorModel != null)
		{
			armorModel.bipedHead.showModel = armorSlot == EntityEquipmentSlot.HEAD;
			armorModel.bipedHeadwear.showModel = armorSlot == EntityEquipmentSlot.HEAD;
			armorModel.bipedBody.showModel = armorSlot == EntityEquipmentSlot.CHEST || armorSlot == EntityEquipmentSlot.LEGS;
			armorModel.bipedRightArm.showModel = armorSlot == EntityEquipmentSlot.CHEST;
			armorModel.bipedLeftArm.showModel = armorSlot == EntityEquipmentSlot.CHEST;
			armorModel.bipedRightLeg.showModel = armorSlot == EntityEquipmentSlot.LEGS || armorSlot == EntityEquipmentSlot.FEET;
			armorModel.bipedLeftLeg.showModel = armorSlot == EntityEquipmentSlot.LEGS || armorSlot == EntityEquipmentSlot.FEET;

			armorModel.isSneak = entityLiving.isSneaking();
			armorModel.isRiding = entityLiving.isRiding();
			armorModel.isChild = entityLiving.isChild();
			armorModel.swingProgress = entityLiving.swingProgress;

			armorModel.rightArmPose = ModelBiped.ArmPose.EMPTY;
			armorModel.leftArmPose = ModelBiped.ArmPose.EMPTY;

			EntityPlayer player = (EntityPlayer) entityLiving;
			ItemStack mainHand = player.getHeldItemMainhand();
			ItemStack offHand = player.getHeldItemOffhand();

			if (mainHand != null)
			{
				armorModel.rightArmPose = ModelBiped.ArmPose.ITEM;

				if (player.getItemInUseCount() > 0)
				{
					EnumAction enumAction = mainHand.getItemUseAction();

					if (enumAction == EnumAction.BOW)
					{
						armorModel.rightArmPose = ModelBiped.ArmPose.BOW_AND_ARROW;
					}
					else if (enumAction == EnumAction.BLOCK)
					{
						armorModel.rightArmPose = ModelBiped.ArmPose.BLOCK;
					}
				}
				return armorModel;
			}

			if (offHand != null)
			{
				armorModel.leftArmPose = ModelBiped.ArmPose.ITEM;

				if (player.getItemInUseCount() > 0)
				{
					EnumAction enumAction = offHand.getItemUseAction();

					if (enumAction == EnumAction.BOW)
					{
						armorModel.leftArmPose = ModelBiped.ArmPose.BOW_AND_ARROW;
					}
					else if (enumAction == EnumAction.BLOCK)
					{
						armorModel.leftArmPose = ModelBiped.ArmPose.BLOCK;
					}
				}
				return armorModel;
			}
		}
		return armorModel;
	}

	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type)
	{
		if (slot == EntityEquipmentSlot.LEGS)
			return Reference.MOD_ID + ":textures/models/armor/viridis_layer_2.png";

		return Reference.MOD_ID + ":textures/models/armor/viridis_layer_1.png";
	}

	@Override
	public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
	{
		return repair.getItem() == Item.getItemFromBlock(EmotionBlock.VIRIDIS_CRISTAL) ? true : false;
	}
}
