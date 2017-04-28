package emotionfox.emomod.tileentity;

import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.SPacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.text.ITextComponent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class TileEntityStorage extends TileEntity
{
	private int maxSize;
	private int size;
	private int itemId;
	private int meta;

	public TileEntityStorage()
	{
		this.maxSize = 512;
		this.size = 0;
		this.itemId = -1;
		this.meta = 0;
	}

	@Override
	public void readFromNBT(NBTTagCompound compound)
	{
		super.readFromNBT(compound);
		this.size = compound.getInteger("Size");
		this.itemId = compound.getInteger("ItemId");
		this.meta = compound.getInteger("Meta");
	}

	@Override
	public NBTTagCompound writeToNBT(NBTTagCompound compound)
	{
		super.writeToNBT(compound);
		compound.setInteger("Size", this.size);
		compound.setInteger("ItemId", this.itemId);
		compound.setInteger("Meta", this.meta);
		return compound;
	}

	public boolean addItem(ItemStack stack, EntityPlayer playerIn)
	{
		if (stack.getItem() != Items.AIR)
		{
			int requested = stack.getCount();

			if (this.size == this.maxSize)
			{
				return false;
			}
			else if (this.size + stack.getCount() > this.maxSize)
			{
				requested = this.maxSize - this.size;
			}

			if (this.itemId == -1)
			{
				this.itemId = Item.getIdFromItem(stack.getItem());
				this.meta = stack.getItemDamage();
				this.size += requested;
				playerIn.getHeldItemMainhand().shrink(requested);
				return true;
			}
			else if (Item.getIdFromItem(stack.getItem()) == this.itemId && stack.getMetadata() == this.meta)
			{
				this.size += requested;
				playerIn.getHeldItemMainhand().shrink(requested);
				return true;
			}
		}
		return false;
	}

	public boolean getItem()
	{
		int requested = 8; // Default requested amount * 2

		if (this.size > 0)
		{
			if (requested > Item.getItemById(this.itemId).getItemStackLimit())
				requested = Item.getItemById(this.itemId).getItemStackLimit();

			if (this.size < requested)
				requested = this.size;

			System.out.println("Requested: " + requested + "(" + Item.getItemById(this.itemId) + ")");
			this.world.spawnEntity(new EntityItem(this.world, pos.getX() + 0.5D, pos.getY() + 1.0D, pos.getZ() + 0.5D, new ItemStack(Item.getItemById(this.itemId), requested, this.meta)));

			size -= requested;

			// Reset so we can store an another type of item
			if (size <= 0)
				this.resetItem();

			return true;
		}
		return false;
	}

	public void setMaxSize(int maxSize)
	{
		this.maxSize = maxSize;
	}

	public void resetItem()
	{
		this.itemId = -1;
		this.meta = 0;
	}
}
