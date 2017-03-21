package emotionfox.emomod.items;

import java.util.List;

import emotionfox.emomod.util.Reference;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;

public class PurpuraRing extends Item
{
	public PurpuraRing()
	{
		this.setMaxStackSize(1);
	}

	@Override
	public void addInformation(ItemStack stack, EntityPlayer playerIn, List<String> tooltip, boolean advanced)
	{
		BlockPos position = playerIn.getPosition();
		int posX = position.getX();
		int posZ = position.getZ();

		tooltip.add("Rise Like Phoenix");
		tooltip.add("\u00a7d" + "\u00a7k" + "At You'r Death");
		tooltip.add("Pos: X (" + posX + "); Z (" + posZ + ")");
	}
}
