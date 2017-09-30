package emotionfox.emomod.entity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAIFindEntityNearest;
import net.minecraft.entity.ai.EntityAIFindEntityNearestPlayer;
import net.minecraft.entity.ai.EntityMoveHelper;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.pathfinding.PathNavigateGround;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;

//Simpler Slime Entity
public class EntityChubby extends EntityLiving
{
	public float squishAmount;
	public float squishFactor;
	public float prevSquishFactor;
	private boolean wasOnGround;

	public EntityChubby(World worldIn)
	{
		super(worldIn);
		this.setSize(0.5F, 0.6F);
		this.moveHelper = new EntityChubby.ChubbyMoveHelper(this);
	}

	protected void initEntityAI()
	{
		this.tasks.addTask(1, new EntityChubby.AIChubbyFloat(this));
		this.tasks.addTask(2, new EntityChubby.AIChubbyAttack(this));
		this.tasks.addTask(3, new EntityChubby.AIChubbyFaceRandom(this));
		this.tasks.addTask(5, new EntityChubby.AIChubbyHop(this));
		this.targetTasks.addTask(1, new EntityAIFindEntityNearestPlayer(this));
		this.targetTasks.addTask(3, new EntityAIFindEntityNearest(this, EntityIronGolem.class));
	}

	@Override
	public void onUpdate()
	{
		if (!this.world.isRemote && this.world.getDifficulty() == EnumDifficulty.PEACEFUL)
		{
			this.isDead = true;
		}

		this.squishFactor += (this.squishAmount - this.squishFactor) * 0.5F;
		this.prevSquishFactor = this.squishFactor;
		super.onUpdate();

		if (this.onGround && !this.wasOnGround)
		{
			float f = this.rand.nextFloat() * ((float) Math.PI * 2F);
			float f1 = this.rand.nextFloat() * 0.5F + 0.5F;
			float f2 = MathHelper.sin(f) * 0.5F * f1;
			float f3 = MathHelper.cos(f) * 0.5F * f1;
			World world = this.world;
			EnumParticleTypes enumparticletypes = EnumParticleTypes.CLOUD;
			double d0 = this.posX + (double) f2;
			double d1 = this.posZ + (double) f3;
			world.spawnParticle(enumparticletypes, d0, this.getEntityBoundingBox().minY, d1, 0.0D, 0.0D, 0.0D, new int[0]);

			this.squishAmount = -0.5F;
		}
		else if (!this.onGround && this.wasOnGround)
		{
			this.squishAmount = 1.0F;
		}

		this.wasOnGround = this.onGround;
		this.squishAmount *= 0.6F;
	}

	@Override
	public void onLivingUpdate()
	{
		super.onLivingUpdate();

		if (this.motionY > 0.3D && !this.isPotionActive(Potion.getPotionById(14)))
		{
			this.playSound(SoundEvents.BLOCK_CLOTH_FALL, 0.4F, ((this.rand.nextFloat() - this.rand.nextFloat()) * 0.2F + 1.0F) / 0.8F);
			this.addPotionEffect(new PotionEffect(Potion.getPotionById(14), 15, 0, false, false));
			this.addPotionEffect(new PotionEffect(Potion.getPotionById(11), 15, 0, false, false));
		}
	}

	public int getJumpDelay()
	{
		return this.rand.nextInt(20) + 15;
	}

	public void applyEntityCollision(Entity entityIn)
	{
		super.applyEntityCollision(entityIn);

		if (entityIn instanceof EntityIronGolem)
		{
			this.dealDamage((EntityLivingBase) entityIn);
		}
	}

	public void onCollideWithPlayer(EntityPlayer entityIn)
	{
		this.dealDamage(entityIn);
	}

	protected void dealDamage(EntityLivingBase entityIn)
	{
		if (this.canEntityBeSeen(entityIn) && this.getDistanceSqToEntity(entityIn) < 0.6D * 2D * 0.6D * 2D && entityIn.attackEntityFrom(DamageSource.causeMobDamage(this), 2F))
		{
			this.applyEnchantments(this, entityIn);
		}
	}

	@Override
	public float getEyeHeight()
	{
		return 0.6F;
	}

	@Override
	protected SoundEvent getHurtSound(DamageSource damageSourceIn)
	{
		return SoundEvents.ENTITY_SMALL_SLIME_HURT;
	}

	@Override
	protected SoundEvent getDeathSound()
	{
		return SoundEvents.ENTITY_SMALL_SLIME_DEATH;
	}

	@Override
	protected Item getDropItem()
	{
		return Item.getItemFromBlock(Blocks.WOOL);
	}

	@Override
	public int getVerticalFaceSpeed()
	{
		return 0;
	}

	@Override
	protected void jump()
	{
		this.motionY = 0.41999998688697815D;
		this.isAirBorne = true;
	}

	static class AIChubbyAttack extends EntityAIBase
	{
		private final EntityChubby chubby;
		private int growTieredTimer;

		public AIChubbyAttack(EntityChubby slimeIn)
		{
			this.chubby = slimeIn;
			this.setMutexBits(2);
		}

		public boolean shouldExecute()
		{
			EntityLivingBase entitylivingbase = this.chubby.getAttackTarget();
			return entitylivingbase == null ? false
					: (!entitylivingbase.isEntityAlive() ? false : !(entitylivingbase instanceof EntityPlayer) || !((EntityPlayer) entitylivingbase).capabilities.disableDamage);
		}

		public void startExecuting()
		{
			this.growTieredTimer = 300;
			super.startExecuting();
		}

		public boolean continueExecuting()
		{
			EntityLivingBase entitylivingbase = this.chubby.getAttackTarget();
			return entitylivingbase == null ? false
					: (!entitylivingbase.isEntityAlive() ? false
							: (entitylivingbase instanceof EntityPlayer && ((EntityPlayer) entitylivingbase).capabilities.disableDamage ? false : --this.growTieredTimer > 0));
		}

		public void updateTask()
		{
			this.chubby.faceEntity(this.chubby.getAttackTarget(), 10.0F, 10.0F);
			((EntityChubby.ChubbyMoveHelper) this.chubby.getMoveHelper()).setDirection(this.chubby.rotationYaw, true);
		}
	}

	static class AIChubbyFaceRandom extends EntityAIBase
	{
		private final EntityChubby chubby;
		private float chosenDegrees;
		private int nextRandomizeTime;

		public AIChubbyFaceRandom(EntityChubby slimeIn)
		{
			this.chubby = slimeIn;
			this.setMutexBits(2);
		}

		public boolean shouldExecute()
		{
			return this.chubby.getAttackTarget() == null && (this.chubby.onGround || this.chubby.isInWater() || this.chubby.isInLava() || this.chubby.isPotionActive(MobEffects.LEVITATION));
		}

		public void updateTask()
		{
			if (--this.nextRandomizeTime <= 0)
			{
				this.nextRandomizeTime = 40 + this.chubby.getRNG().nextInt(60);
				this.chosenDegrees = (float) this.chubby.getRNG().nextInt(360);
			}

			((EntityChubby.ChubbyMoveHelper) this.chubby.getMoveHelper()).setDirection(this.chosenDegrees, false);
		}
	}

	static class AIChubbyFloat extends EntityAIBase
	{
		private final EntityChubby chubby;

		public AIChubbyFloat(EntityChubby chubbyIn)
		{
			this.chubby = chubbyIn;
			this.setMutexBits(5);
			((PathNavigateGround) chubbyIn.getNavigator()).setCanSwim(true);
		}

		public boolean shouldExecute()
		{
			return this.chubby.isInWater() || this.chubby.isInLava();
		}

		public void updateTask()
		{
			if (this.chubby.getRNG().nextFloat() < 0.8F)
			{
				this.chubby.getJumpHelper().setJumping();
			}

			((EntityChubby.ChubbyMoveHelper) this.chubby.getMoveHelper()).setSpeed(1.2D);
		}
	}

	static class AIChubbyHop extends EntityAIBase
	{
		private final EntityChubby chubby;

		public AIChubbyHop(EntityChubby chubbyIn)
		{
			this.chubby = chubbyIn;
			this.setMutexBits(5);
		}

		public boolean shouldExecute()
		{
			return true;
		}

		public void updateTask()
		{
			((EntityChubby.ChubbyMoveHelper) this.chubby.getMoveHelper()).setSpeed(1.0D);
		}
	}

	static class ChubbyMoveHelper extends EntityMoveHelper
	{
		private float yRot;
		private int jumpDelay;
		private final EntityChubby chubby;
		private boolean isAggressive;

		public ChubbyMoveHelper(EntityChubby chubbyIn)
		{
			super(chubbyIn);
			this.chubby = chubbyIn;
			this.yRot = 180.0F * chubbyIn.rotationYaw / (float) Math.PI;
		}

		public void setDirection(float yRot, boolean aggressive)
		{
			this.yRot = yRot;
			this.isAggressive = aggressive;
		}

		public void setSpeed(double speedIn)
		{
			this.speed = speedIn;
			this.action = EntityMoveHelper.Action.MOVE_TO;
		}

		public void onUpdateMoveHelper()
		{
			this.entity.rotationYaw = this.limitAngle(this.entity.rotationYaw, this.yRot, 90.0F);
			this.entity.rotationYawHead = this.entity.rotationYaw;
			this.entity.renderYawOffset = this.entity.rotationYaw;

			if (this.action != EntityMoveHelper.Action.MOVE_TO)
			{
				this.entity.setMoveForward(0.0F);
			}
			else
			{
				this.action = EntityMoveHelper.Action.WAIT;

				if (this.entity.onGround)
				{
					this.entity.setAIMoveSpeed((float) (this.speed * this.entity.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).getAttributeValue()));

					if (this.jumpDelay-- <= 0)
					{
						this.jumpDelay = this.chubby.getJumpDelay();

						if (this.isAggressive)
						{
							this.jumpDelay /= 3;
						}

						this.chubby.getJumpHelper().setJumping();
						this.chubby.playSound(SoundEvents.ENTITY_SMALL_SLIME_JUMP, 0.4F, ((this.chubby.getRNG().nextFloat() - this.chubby.getRNG().nextFloat()) * 0.2F + 1.0F) * 0.8F);
					}
					else
					{
						this.chubby.moveStrafing = 0.0F;
						this.chubby.moveForward = 0.0F;
						this.entity.setAIMoveSpeed(0.0F);
					}
				}
				else
				{
					this.entity.setAIMoveSpeed((float) (this.speed * this.entity.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).getAttributeValue()));
				}
			}
		}
	}
}
