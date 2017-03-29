package emotionfox.emomod.entity;

import javax.annotation.Nullable;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.passive.EntityBat;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

public class EntityLightningBug extends EntityBat
{
	public EntityLightningBug(World worldIn)
	{
		super(worldIn);
		this.setSize(0.2F, 0.2F);
		this.setIsBatHanging(false);
	}

	@Override
	protected void applyEntityAttributes()
	{
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(1.0D);
	}
	
	@Nullable
	@Override
    protected SoundEvent getAmbientSound()
    {
        return null;
    }

	@Override
    protected SoundEvent getHurtSound()
    {
        return null;
    }

	@Override
    protected SoundEvent getDeathSound()
    {
        return null;
    }
}
