package emotionfox.emomod.entity;

import emotionfox.emomod.handler.EmotionSoundHandler;
import emotionfox.emomod.init.EmotionItems;
import net.minecraft.block.Block;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIFollowParent;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMate;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWanderAvoidWater;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class EntityWildBoar extends EntityAnimal
{
	public EntityWildBoar(World worldIn)
	{
		super(worldIn);
		this.setSize(0.9F, 1.1F);
		this.height = 0.8F;
	}

	@Override
	protected void initEntityAI()
    {
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(1, new EntityAIPanic(this, 0.8D));
        this.tasks.addTask(2, new EntityAIMate(this, 0.7D));
        this.tasks.addTask(3, new EntityAITempt(this, 0.6D, EmotionItems.BERRY_STRAWBERRY, false));
        this.tasks.addTask(4, new EntityAIFollowParent(this, 0.6D));
        this.tasks.addTask(5, new EntityAIWanderAvoidWater(this, 1.0D));
        this.tasks.addTask(6, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
        this.tasks.addTask(7, new EntityAILookIdle(this));
    }
	
	@Override
    public void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(20.0D);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.4D);
    }

	@Override
	protected Item getDropItem()
	{
		return EmotionItems.WILDBOAR_RAW;
	}
	
	@Override
	protected void dropFewItems(boolean wasRecentlyHit, int lootingModifier)
	{
		super.dropFewItems(wasRecentlyHit, lootingModifier);
		
		if(wasRecentlyHit && (this.rand.nextInt(20) == 0 || this.rand.nextInt(1 + lootingModifier) > 0))
        {
            this.dropItem(EmotionItems.FRUIT_TOMATO, 1);
            this.dropItem(EmotionItems.WILDBOAR_RAW, 1);
        }
        else if(wasRecentlyHit && (this.rand.nextInt(15) == 0 || this.rand.nextInt(1 + lootingModifier) > 0))
        {
            this.dropItem(EmotionItems.HORN, 1);
            this.dropItem(EmotionItems.WILDBOAR_RAW, 1);
        }
	}
	
	@Override
	public boolean isBreedingItem(ItemStack stack)
    {
		return stack.getItem() == EmotionItems.BERRY_STRAWBERRY;
    }
	
    @Override
    protected net.minecraft.util.SoundEvent getAmbientSound()
    {
        return EmotionSoundHandler.ENTITY_WILD_BOAR_AMBIENT;
    }

    @Override
    protected net.minecraft.util.SoundEvent getHurtSound()
    {
        return EmotionSoundHandler.ENTITY_WILD_BOAR_HURT;
    }

    @Override
    protected net.minecraft.util.SoundEvent getDeathSound()
    {
        return EmotionSoundHandler.ENTITY_WILD_BOAR_DEATH;
    }

    @Override
    protected void playStepSound(BlockPos pos, Block block)
    {
        this.playSound(SoundEvents.ENTITY_COW_STEP, 0.15F, 1.0F);
    }

    @Override
    protected float getSoundVolume()
    {
        return 0.4F;
    }
	
	@Override
	public EntityAgeable createChild(EntityAgeable ageable)
	{
		return new EntityWildBoar(this.world);
	}
	
	@Override
	public float getEyeHeight()
    {
        return this.isChild() ? this.height : 1.2F;
    }
}
