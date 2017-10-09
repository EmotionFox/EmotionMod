package emotionfox.emomod.item.base;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class BaseBandage extends Item
{
	private float healAmount;

	public BaseBandage(float amount)
	{
		this.setCreativeTab(CreativeTabs.MISC);
		this.setMaxDamage(3);
		healAmount = amount;
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
	{
		super.onItemUseFinish(playerIn.getHeldItem(handIn), worldIn, playerIn);

		playerIn.heal(healAmount);
		playerIn.getHeldItem(handIn).damageItem(2, playerIn);

		return ActionResult.newResult(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
	}
}
