package emotionfox.emomod.main;

import emotionfox.emomod.items.PurpuraBag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraftforge.common.util.Constants;

public class InventoryBackPack implements IInventory
{
    public ItemStack[] content;
    public int size;

    public InventoryBackPack(ItemStack container, int size)
    {
        this.size = size;
        this.content = new ItemStack[size];
        if(!container.hasTagCompound())
            container.setTagCompound(new NBTTagCompound());
        this.readFromNBT(container.getTagCompound());
    }

    private void readFromNBT(NBTTagCompound comp)
    {
        NBTTagList nbtlist = comp.getTagList("Inventory", Constants.NBT.TAG_COMPOUND);
        
        for(int i = 0; i < nbtlist.tagCount(); i++)
        {
            NBTTagCompound comp1 = nbtlist.getCompoundTagAt(i);
            int slot = comp1.getInteger("Slot");
            this.content[slot] = new ItemStack(comp1);
        }
    }

    public void writeToNBT(NBTTagCompound comp)
    {
        NBTTagList nbtlist = new NBTTagList();

        for(int i = 0; i < this.size; i++)
        {
            if(this.content[i] != null)
            {
                NBTTagCompound comp1 = new NBTTagCompound();
                comp1.setInteger("Slot", i);
                this.content[i].writeToNBT(comp1);
                nbtlist.appendTag(comp1);
            }
        }
        comp.setTag("Inventory", nbtlist);
    }

    @Override
    public String getName()
    {
    	return "Bag";
    }

    @Override
    public boolean hasCustomName()
    {
        return false;
    }

    @Override
    public ITextComponent getDisplayName()
    {
        return (ITextComponent)(this.hasCustomName() ? new TextComponentString(this.getName()) : new TextComponentTranslation(this.getName(), new Object[0]));
    }

    @Override
    public int getSizeInventory()
    {
        return this.size;
    }

    @Override
    public ItemStack getStackInSlot(int index)
    {
        return this.content[index];
    }

    @Override
    public ItemStack decrStackSize(int index, int count)
    {
        ItemStack stack = getStackInSlot(index);
        
        if(stack != null)
        {
            if(stack.getMaxStackSize() > count)
            {
                stack = stack.splitStack(count);
                if(stack.getMaxStackSize() == 0)
                    this.content[index] = null;
            }
            else
            {
                this.content[index] = null;
            }
        }
        return stack;
    }
    
    @Override
	public ItemStack removeStackFromSlot(int index)
	{
        ItemStack stack = getStackInSlot(index);
        
        if(stack != null)
            this.content[index] = null;
        return stack;
    }

    @Override
    public void setInventorySlotContents(int index, ItemStack stack)
    {
        this.content[index] = stack;
    }

    @Override
    public int getInventoryStackLimit()
    {
        return 64;
    }

    @Override
    public void markDirty()
    {}

    @Override
    public boolean isUsableByPlayer(EntityPlayer player)
    {
    	return true;
    }

    @Override
    public void openInventory(EntityPlayer player)
    {}

    @Override
    public void closeInventory(EntityPlayer player)
    {}

    @Override
    public boolean isItemValidForSlot(int index, ItemStack stack)
    {
        return !(stack.getItem() instanceof PurpuraBag);
    }

    @Override
    public int getField(int id)
    {
        return 0;
    }

    @Override
    public void setField(int id, int value)
    {}

    @Override
    public int getFieldCount()
    {
        return 0;
    }

    @Override
    public void clear()
    {
        for(int i = 0; i < this.content.length; ++i)
        {
            this.content[i] = null;
        }
    }

	@Override
	public boolean isEmpty()
	{
		return false;
	}
}
