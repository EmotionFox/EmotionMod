package emotionfox.emomod.entity;

import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

public class EntityBeetle extends EntityCreature
{
	public EntityBeetle(World worldIn)
	{
		super(worldIn);
		this.setSize(0.4F, 0.3F);
		this.tasks.addTask(0, new EntityAIWander(this, 0.3D)); // Deplacement
		this.tasks.addTask(1, new EntityAIPanic(this, 0.6D)); // Deplacement
	}

	@Override
	protected void applyEntityAttributes()
	{
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(5.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.5D);
	}
	
	@Override
    public boolean getCanSpawnHere()
    {
        int i = MathHelper.floor(this.posX);
        int j = MathHelper.floor(this.getEntityBoundingBox().minY);
        int k = MathHelper.floor(this.posZ);
        BlockPos blockpos = new BlockPos(i, j, k);
        return this.world.getBlockState(blockpos.down()).getBlock() == Blocks.GRASS.getDefaultState() && this.world.getLight(blockpos) > 8 && super.getCanSpawnHere();
    }
}
