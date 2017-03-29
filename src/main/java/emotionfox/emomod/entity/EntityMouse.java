package emotionfox.emomod.entity;

import javax.annotation.Nullable;

import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.World;

public class EntityMouse extends EntityCreature
{
	private static final DataParameter<Integer> MOUSE_TYPE = EntityDataManager.<Integer>createKey(EntityMouse.class, DataSerializers.VARINT);

	public EntityMouse(World worldIn)
	{
		super(worldIn);
		this.setSize(0.4F, 0.2F);
		this.tasks.addTask(0, new EntityAIWander(this, 0.3D));
		this.tasks.addTask(1, new EntityAIPanic(this, 0.6D));
	}

	@Override
	protected void entityInit()
	{
		super.entityInit();
		this.dataManager.register(MOUSE_TYPE, Integer.valueOf(EntityMouse.Type.WHITE.ordinal()));
	}

	@Override
	public void applyEntityAttributes()
	{
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(5.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.5D);
	}

	@Override
	public void writeEntityToNBT(NBTTagCompound compound)
	{
		compound.setString("Type", this.getMouseType().getName());
	}

	@Override
	public void readEntityFromNBT(NBTTagCompound compound)
	{
		if (compound.hasKey("Type", 8))
		{
			this.setMouseType(EntityMouse.Type.getTypeFromString(compound.getString("Type")));
		}
	}

	public void setMouseType(EntityMouse.Type mouseType)
	{
		this.dataManager.set(MOUSE_TYPE, Integer.valueOf(mouseType.ordinal()));
	}

	public EntityMouse.Type getMouseType()
	{
		return EntityMouse.Type.byId(((Integer) this.dataManager.get(MOUSE_TYPE)).intValue());
	}

	@Nullable
	@Override
    public IEntityLivingData onInitialSpawn(DifficultyInstance difficulty, @Nullable IEntityLivingData livingdata)
    {
        this.setMouseType(EntityMouse.Type.byId(this.world.rand.nextInt(EntityMouse.Type.values().length)));
        return super.onInitialSpawn(difficulty, livingdata);
    }
	
	public static enum Type
	{
		WHITE(0, "white"), BROWN(1, "brown"), GINGER(2, "ginger"), BLACK(3, "black");

		private final String name;
		private final int metadata;

		private Type(int metadataIn, String nameIn)
		{
			this.name = nameIn;
			this.metadata = metadataIn;
		}

		public String getName()
		{
			return this.name;
		}

		public int getMetadata()
		{
			return this.metadata;
		}

		public String toString()
		{
			return this.name;
		}

		public static EntityMouse.Type byId(int id)
		{
			if (id < 0 || id >= EntityMouse.Type.values().length)
			{
				id = 0;
			}

			return EntityMouse.Type.values()[id];
		}

		public static EntityMouse.Type getTypeFromString(String nameIn)
		{
			for (int i = 0; i < EntityMouse.Type.values().length; ++i)
			{
				if (EntityMouse.Type.values()[i].getName().equals(nameIn))
				{
					return EntityMouse.Type.values()[i];
				}
			}

			return EntityMouse.Type.values()[0];
		}
	}
	
	@Override
	public float getEyeHeight()
    {
        return 0.1F;
    }
}
