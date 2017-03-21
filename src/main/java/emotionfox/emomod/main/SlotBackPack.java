package emotionfox.emomod.main;

import emotionfox.emomod.items.PurpuraBag;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class SlotBackPack extends Slot
{
    public SlotBackPack(IInventory inv, int index, int x, int y)
    {
        super(inv, index, x, y);
    }

    @Override
    public boolean isItemValid(ItemStack stack)
    {
        return !(stack.getItem() instanceof PurpuraBag);
    }
}
