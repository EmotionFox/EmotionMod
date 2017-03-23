package emotionfox.emomod.entity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

// Useful In BlockChair
public class EntitySittable extends Entity
{
	public double blockPosX;
	public double blockPosY;
	public double blockPosZ;
	public int lifeTime;

	public EntitySittable(World worldIn)
	{
		super(worldIn);
		this.noClip = true;
		this.preventEntitySpawning = true;
		this.setSize(0.0F, 0.0F);
	}

	public EntitySittable(World world, EntityPlayer entityplayer, Double x, Double y, Double z)
	{
		this(world);
		this.blockPosX = x;
		this.blockPosY = y;
		this.blockPosZ = z;
		this.setPosition(x + 0.5D, y + 0.5D, z + 0.5D); // Get the center
	}

	@Override
	public boolean processInitialInteract(EntityPlayer player, EnumHand hand)
	{
		player.startRiding(this, true);
		return super.processInitialInteract(player, hand);
	}

	@Override
	public void onEntityUpdate()
	{
		if (this.lifeTime >= 50 && !this.isBeingRidden())
			this.setDead(); // Poor entity... 50 ticks is only what you have
		else if (this.lifeTime < 50)
			this.lifeTime++;

		super.onEntityUpdate();
	}

	@Override
	protected void entityInit()
	{
		this.lifeTime = 0;
	}

	@Override
	protected void readEntityFromNBT(NBTTagCompound compound)
	{
		this.blockPosX = compound.getDouble("blockPosX");
		this.blockPosY = compound.getDouble("blockPosY");
		this.blockPosZ = compound.getDouble("blockPosZ");
		this.lifeTime = compound.getInteger("lifeTime");
	}

	@Override
	protected void writeEntityToNBT(NBTTagCompound compound)
	{
		compound.setDouble("blockPosX", this.blockPosX);
		compound.setDouble("blockPosY", this.blockPosY);
		compound.setDouble("blockPosZ", this.blockPosZ);
		compound.setInteger("lifeTime", this.lifeTime);
	}
}
