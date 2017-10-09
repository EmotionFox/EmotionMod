package emotionfox.emomod.entity;

import emotionfox.emomod.block.EmotionPlanks;
import emotionfox.emomod.init.EmotionItem;
import net.minecraft.entity.item.EntityBoat;
import net.minecraft.item.Item;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.world.World;

public class EntityNewBoat extends EntityBoat
{
	private static final DataParameter<Integer> BOAT_NEW_TYPE = EntityDataManager.<Integer>createKey(EntityNewBoat.class, DataSerializers.VARINT);
	
	public EntityNewBoat(World worldIn)
	{
		super(worldIn);
	}
	
	public EntityNewBoat(World worldIn, double x, double y, double z)
    {
		super(worldIn, x, y, z);
    }
	
	@Override
	protected void entityInit()
    {
		super.entityInit();
		
        this.dataManager.register(BOAT_NEW_TYPE, Integer.valueOf(EntityNewBoat.Type.CHERRY.ordinal()));
    }
	
	@Override
	public Item getItemBoat()
    {
		switch (this.getBoatNewType())
        {
        case CHERRY:
        default:
            return EmotionItem.CHERRY_BOAT;
        case PEAR:
            return EmotionItem.PEAR_BOAT;
        case ORANGE:
            return EmotionItem.ORANGE_BOAT;
        case ATLAS:
            return EmotionItem.ATLAS_BOAT;
        case PINE:
            return EmotionItem.PINE_BOAT;
        case COCO:
            return EmotionItem.COCO_BOAT;
        case DREAM:
        	return EmotionItem.DREAM_BOAT;
        }
    }
	
	@Override
	protected void writeEntityToNBT(NBTTagCompound compound)
    {
        compound.setString("Type", this.getBoatNewType().getName());
    }
	
	@Override
	protected void readEntityFromNBT(NBTTagCompound compound)
    {
		if (compound.hasKey("Type", 8))
        {
            this.setBoatNewType(EntityNewBoat.Type.getTypeFromString(compound.getString("Type")));
        }
    }
	
	public void setBoatNewType(EntityNewBoat.Type boatType)
    {
		this.dataManager.set(BOAT_NEW_TYPE, Integer.valueOf(boatType.ordinal()));
    }
	
	public EntityNewBoat.Type getBoatNewType()
    {
		return EntityNewBoat.Type.byId(((Integer)this.dataManager.get(BOAT_NEW_TYPE)).intValue());
    }
	
	public static enum Type
    {
		CHERRY(EmotionPlanks.EnumType.CHERRY.getMetadata(), "cherry"),
        PEAR(EmotionPlanks.EnumType.PEAR.getMetadata(), "pear"),
        ORANGE(EmotionPlanks.EnumType.ORANGE.getMetadata(), "orange"),
        ATLAS(EmotionPlanks.EnumType.ATLAS.getMetadata(), "atlas"),
        PINE(EmotionPlanks.EnumType.PINE.getMetadata(), "pine"),
        COCO(EmotionPlanks.EnumType.COCO.getMetadata(), "coco"),
		DREAM(EmotionPlanks.EnumType.DREAM.getMetadata(), "dream");

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
        
        public static EntityNewBoat.Type byId(int id)
        {
            if (id < 0 || id >= values().length)
            {
                id = 0;
            }

            return values()[id];
        }

        public static EntityNewBoat.Type getTypeFromString(String nameIn)
        {
            for (int i = 0; i < values().length; ++i)
            {
                if (values()[i].getName().equals(nameIn))
                {
                    return values()[i];
                }
            }

            return values()[0];
        }
    }
}
