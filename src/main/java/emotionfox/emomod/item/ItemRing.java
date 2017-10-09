package emotionfox.emomod.item;

import java.util.List;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemRing extends Item
{
	public ItemRing()
	{
		this.setMaxStackSize(1);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn)
	{
		// BlockPos position = playerIn.getPosition();
		// int posX = position.getX();
		// int posZ = position.getZ();
		//
		// tooltip.add("Rise Like Phoenix");
		// tooltip.add("\u00a7d" + "\u00a7k" + "At You'r Death");
		// tooltip.add("Pos: X (" + posX + "); Z (" + posZ + ")");
	}
}
