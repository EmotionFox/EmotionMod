package emotionfox.emomod.event;

import emotionfox.emomod.items.ItemPurpuraBag;
import emotionfox.emomod.main.ContainerBackPack;
import emotionfox.emomod.main.GuiBackPack;
import emotionfox.emomod.main.InventoryBackPack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class EmotionGuiHandler implements IGuiHandler
{
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
	{
		switch (ID)
		{
		case 0:
			System.out.println(player.inventory.getItemStack().getItem());
			if (player.inventory.getItemStack() == null || !(player.inventory.getItemStack().getItem() instanceof ItemPurpuraBag))
				return null;
			return new ContainerBackPack(player.inventory, new InventoryBackPack(player.inventory.getItemStack(), 9));
		}
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
	{
		switch (ID)
		{
		case 0:
			System.out.println(player.inventory.getItemStack().getItem());
			if (player.inventory.getItemStack() == null || !(player.inventory.getItemStack().getItem() instanceof ItemPurpuraBag))
				return null;
			return new GuiBackPack(player.inventory, new InventoryBackPack(player.inventory.getItemStack(), 9));
		}
		return null;
	}
}
