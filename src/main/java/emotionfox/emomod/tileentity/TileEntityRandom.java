package emotionfox.emomod.tileentity;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;

public class TileEntityRandom extends TileEntity
{
	private int random;

	public TileEntityRandom()
	{
		random = 0;
	}

	@Override
	public void readFromNBT(NBTTagCompound compound)
	{
		super.readFromNBT(compound);
		this.random = compound.getInteger("Random");
	}

	@Override
	public NBTTagCompound writeToNBT(NBTTagCompound compound)
	{
		super.writeToNBT(compound);
		compound.setInteger("Random", this.random);
		return compound;
	}

	public void randomize()
	{
		this.random = this.world.rand.nextInt(16);
	}

	public int getRandom()
	{
		return this.random;
	}
}
