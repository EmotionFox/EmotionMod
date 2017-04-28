package emotionfox.emomod.entity;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.util.datafix.DataFixer;
import net.minecraft.world.World;

public class EntitySmallSpider extends EntitySpider
{
	public EntitySmallSpider(World worldIn)
	{
		super(worldIn);
		this.setSize(0.45F, 0.32F);
		this.height = 0.3F;
	}

	public static void registerFixesSpider(DataFixer fixer)
	{
		EntityLiving.registerFixesMob(fixer, EntitySmallSpider.class);
	}

	@Override
	public void applyEntityAttributes()
	{
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(10.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.6D);
	}

	@Override
	public float getEyeHeight()
	{
		return this.height;
	}
}
