package emotionfox.emomod.item;

import java.util.List;

import emotionfox.emomod.entity.EntityButterfly;
import emotionfox.emomod.item.meta.MetaItem;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class ItemButterfly extends MetaItem
{
	public static final String[] variantList = new String[EntityButterfly.Type.values().length];

	public static final String[] variants =
	{ "pink", "blue", "green", "brimstone" };

	public ItemButterfly()
	{
		super(CreativeTabs.MISC);
		this.setMaxStackSize(1);
		this.addVariants(variants);
	}

	public void setCustomName(String nameIn, ItemStack stack)
	{
		if (!stack.hasTagCompound())
		{
			stack.setTagCompound(new NBTTagCompound());
			stack.getTagCompound().setString("customName", nameIn);
		}
		else
		{
			stack.getTagCompound().setString("customName", nameIn);
		}
	}

	@Override
	public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn)
	{
		if (stack.hasTagCompound() && stack.getTagCompound().hasKey("customName"))
			tooltip.add("\u00A7n" + "Name" + "\u00A7r" + ": " + stack.getTagCompound().getString("customName"));
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
	{
		ItemStack stack = playerIn.getHeldItem(handIn);

		if (!worldIn.isRemote)
		{
			EntityButterfly butterfly = new EntityButterfly(worldIn);
			butterfly.setPosition(playerIn.getPosition().getX() + 0.5D, playerIn.getPosition().getY() + 1.0D, playerIn.getPosition().getZ() + 0.5D);
			butterfly.setButterflyType(EntityButterfly.Type.byId(stack.getItemDamage()));
			butterfly.rotationYaw = playerIn.rotationYaw;

			if (stack.hasTagCompound() && stack.getTagCompound().hasKey("customName"))
				butterfly.setCustomNameTag(stack.getTagCompound().getString("customName"));
			else if (stack.hasDisplayName())
				butterfly.setCustomNameTag(stack.getDisplayName());

			worldIn.spawnEntity(butterfly);

			if (!playerIn.capabilities.isCreativeMode)
				stack.shrink(1);

			return new ActionResult(EnumActionResult.SUCCESS, stack);
		}

		return super.onItemRightClick(worldIn, playerIn, handIn);
	}
}