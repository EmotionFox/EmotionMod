package emotionfox.emomod.entity;

import javax.annotation.Nullable;

import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.passive.EntityBat;
import net.minecraft.init.Blocks;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;

public class EntityButterfly extends EntityBat
{
	private static final DataParameter<Integer> BUTTERFLY_TYPE = EntityDataManager.<Integer>createKey(EntityButterfly.class, DataSerializers.VARINT);

	public EntityButterfly(World worldIn)
	{
		super(worldIn);
		this.setIsBatHanging(false);
	}

	@Override
	public void onEntityUpdate()
	{
		if (this.world.getDifficulty() == EnumDifficulty.NORMAL)
			this.setSize(0.4F, 0.4F);
		else if (this.world.getDifficulty() == EnumDifficulty.HARD)
			this.setSize(0.3F, 0.3F);
		else
			this.setSize(0.5F, 0.5F);
		
		super.onEntityUpdate();
	}
	
	@Override
	protected void entityInit()
	{
		super.entityInit();
		this.dataManager.register(BUTTERFLY_TYPE, Integer.valueOf(EntityButterfly.Type.PINK.ordinal()));
	}

	@Override
	protected void applyEntityAttributes()
	{
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(1.0D);
	}

	@Override
	public void readEntityFromNBT(NBTTagCompound compound)
	{
		if (compound.hasKey("Type", 8))
		{
			this.setButterflyType(EntityButterfly.Type.getTypeFromString(compound.getString("Type")));
		}
	}

	@Override
	public void writeEntityToNBT(NBTTagCompound compound)
	{
		compound.setString("Type", this.getButterflyType().getName());
	}

	@Override
	public boolean getCanSpawnHere()
	{
		int i = MathHelper.floor(this.posX);
		int j = MathHelper.floor(this.getEntityBoundingBox().minY);
		int k = MathHelper.floor(this.posZ);
		BlockPos blockpos = new BlockPos(i, j, k);
		return this.world.getLight(blockpos) > 8 && super.getCanSpawnHere();
	}

	public void setButterflyType(EntityButterfly.Type butterflyType)
	{
		this.dataManager.set(BUTTERFLY_TYPE, Integer.valueOf(butterflyType.ordinal()));
	}

	public EntityButterfly.Type getButterflyType()
	{
		return EntityButterfly.Type.byId(((Integer) this.dataManager.get(BUTTERFLY_TYPE)).intValue());
	}

	@Nullable
	@Override
	public IEntityLivingData onInitialSpawn(DifficultyInstance difficulty, @Nullable IEntityLivingData livingdata)
	{
		if (this.world.getDifficulty() == EnumDifficulty.NORMAL)
			this.setSize(0.4F, 0.4F);
		else if (this.world.getDifficulty() == EnumDifficulty.HARD)
			this.setSize(0.3F, 0.3F);
		else
			this.setSize(0.5F, 0.5F);
		
		this.setButterflyType(EntityButterfly.Type.byId(this.world.rand.nextInt(EntityButterfly.Type.values().length)));
		return super.onInitialSpawn(difficulty, livingdata);
	}

	
	@Nullable
	@Override
	public SoundEvent getAmbientSound()
	{
		return null;
	}

	@Override
	protected SoundEvent getHurtSound(DamageSource damageSourceIn)
	{
		return null;
	}

	@Override
	protected SoundEvent getDeathSound()
	{
		return null;
	}

	public static enum Type
	{
		PINK(0, "pink"), BLUE(1, "blue"), GREEN(2, "green"), BRIMSTONE(3, "brimstone");

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
			return getName();
		}

		public static EntityButterfly.Type byId(int id)
		{
			if (id < 0 || id >= EntityButterfly.Type.values().length)
			{
				id = 0;
			}

			return EntityButterfly.Type.values()[id];
		}

		public static EntityButterfly.Type getTypeFromString(String nameIn)
		{
			for (int i = 0; i < EntityButterfly.Type.values().length; ++i)
			{
				if (EntityButterfly.Type.values()[i].getName().equals(nameIn))
				{
					return EntityButterfly.Type.values()[i];
				}
			}

			return EntityButterfly.Type.values()[0];
		}
	}
}
