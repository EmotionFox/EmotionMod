package emotionfox.emomod.items;

import java.util.Map;

import com.google.common.collect.Maps;

import emotionfox.emomod.entity.EntityButterfly;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFishFood;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class ItemButterfly extends Item
{
	public ItemButterfly()
	{
		this.setMaxStackSize(1);
		this.setCreativeTab(CreativeTabs.MISC);
		this.setHasSubtypes(true);
	}
	
	@Override
	public void getSubItems(Item itemIn, CreativeTabs tab, NonNullList<ItemStack> subItems)
	{
		for(int i = 0; i < EntityButterfly.Type.values().length; i++)
		{
			subItems.add(new ItemStack(itemIn, 1, i));
		}
	}
	
	@Override
	public String getUnlocalizedName(ItemStack stack)
	{
		for(int i = 0; i < EntityButterfly.Type.values().length; i++)
		{
			if(stack.getItemDamage() == i)
			{
				return this.getUnlocalizedName() + "_" + EntityButterfly.Type.values()[i].getName();
			}
			else
			{
				continue;
			}
		}
		return this.getUnlocalizedName() + "_" + EntityButterfly.Type.values()[0].getName();
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
	{
		ItemStack itemStack = playerIn.getHeldItem(handIn);

		if (!worldIn.isRemote)
		{
			EntityButterfly butterfly = new EntityButterfly(worldIn);
			butterfly.setPosition(playerIn.getPosition().getX() + 0.5D, playerIn.getPosition().getY() + 1.0D, playerIn.getPosition().getZ() + 0.5D);
			butterfly.setButterflyType(EntityButterfly.Type.byId(itemStack.getItemDamage()));
			butterfly.rotationYaw = playerIn.rotationYaw;

			worldIn.spawnEntity(butterfly);

			if (!playerIn.capabilities.isCreativeMode)
			{
				itemStack.shrink(1);
			}
			
			return new ActionResult(EnumActionResult.SUCCESS, itemStack);
		}
		
		return super.onItemRightClick(worldIn, playerIn, handIn);
	}
}