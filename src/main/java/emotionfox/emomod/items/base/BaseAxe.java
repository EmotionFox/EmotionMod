package emotionfox.emomod.items.base;

import java.util.Set;

import com.google.common.collect.Sets;

import emotionfox.emomod.init.EmotionItems;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class BaseAxe extends ItemTool
{
	private static final Set<Block> EFFECTIVE_ON = Sets.newHashSet(new Block[]
	{ Blocks.PLANKS, Blocks.BOOKSHELF, Blocks.LOG, Blocks.LOG2, Blocks.CHEST, Blocks.PUMPKIN, Blocks.LIT_PUMPKIN, Blocks.MELON_BLOCK, Blocks.LADDER, Blocks.WOODEN_BUTTON,
			Blocks.WOODEN_PRESSURE_PLATE });

	public BaseAxe(ToolMaterial material)
	{
		super(material, EFFECTIVE_ON);
		this.damageVsEntity = 8.5F;
		this.attackSpeed = -3.0F;
		this.setCreativeTab(CreativeTabs.TOOLS);
	}

	@Override
	public void onUpdate(ItemStack stack, World worldIn, Entity entity, int itemSlot, boolean isSelected)
	{
		super.onUpdate(stack, worldIn, entity, itemSlot, isSelected);
		{
			EntityPlayer player = (EntityPlayer) entity;
			ItemStack equipped = player.getActiveItemStack();

			if (this == EmotionItems.PURPURA_AXE)
			{
				if (equipped == stack)
					player.addPotionEffect(new PotionEffect(Potion.getPotionById(3), 10, 0, false, false));
			}
		}
	}

	@Override
	public boolean getIsRepairable(ItemStack input, ItemStack repair)
	{
		if (this == EmotionItems.PURPURA_AXE)
		{
			if (repair.getItem() == EmotionItems.PURPURA_SHARD)
				return true;
		}
		else if (this == EmotionItems.FOSSIL_AXE)
		{
			if (repair.getItem() == EmotionItems.FOSSIL)
				return true;
		}
		return false;
	}
}
