package emotionfox.emomod.items;

import java.util.List;
import java.util.Random;

import emotionfox.emomod.init.EmotionItems;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.storage.WorldInfo;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemStaff extends Item
{
	public ItemStaff()
	{
		this.setMaxStackSize(1);
		this.setMaxDamage(200);
		this.setCreativeTab(CreativeTabs.TOOLS);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, EntityPlayer playerIn, List<String> tooltip, boolean advanced)
	{
		tooltip.add("Invoke The Elements");
		
		if (this == EmotionItems.STAFF_BLUE)	
			tooltip.add("\u00a7b" + "Water");
		if (this == EmotionItems.STAFF_GREEN)
			tooltip.add("\u00a7a" + "Earth");
		if (this == EmotionItems.STAFF_RED)
			tooltip.add("\u00a7c" + "Fire");
		if (this == EmotionItems.STAFF_WHITE)
			tooltip.add("\u00a7e" + "Wind");
	}

	@Override
	public EnumActionResult onItemUse(EntityPlayer player, World world, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
	{
		IBlockState block;
		Long time = world.getWorldTime();
		IBlockState state = world.getBlockState(pos);
		WorldInfo worldInfo = world.getWorldInfo();
		ItemStack stack = player.getHeldItem(hand);
		int dimension = player.dimension;

		if (dimension == 0 || dimension == 1)
		{
			if (this == EmotionItems.STAFF_BLUE)
			{
				block = Blocks.FLOWING_WATER.getDefaultState();

				if (player.isSneaking())
				{
					if (state != Blocks.AIR.getDefaultState() & state != Blocks.BEDROCK.getDefaultState())
					{
						world.setBlockState(pos, block);
						stack.damageItem(1, player);
					}
				}
				else
				{
					if (state != Blocks.AIR.getDefaultState() & state != Blocks.BEDROCK.getDefaultState())
					{
						for (int x = -1; x < 2; x++)
						{
							for (int z = -1; z < 2; z++)
							{
								if (world.getBlockState(pos.add(x, 0, z)) != Blocks.BEDROCK.getDefaultState())
								{
									world.setBlockState(pos.add(x, 0, z), block);
								}
							}
						}
						stack.damageItem(4, player);
					}
				}
			}

			else if (this == EmotionItems.STAFF_WHITE)
			{
				if (time >= 13000 || time <= 1000)
					world.setWorldTime(1001);
				else
					world.setWorldTime(13001);

				worldInfo.setCleanWeatherTime((300 + (new Random()).nextInt(600)) * 20);
				worldInfo.setRainTime(0);
				worldInfo.setThunderTime(0);
				worldInfo.setRaining(false);
				world.spawnEntity(new EntityLightningBolt(world, pos.getX(), pos.getY(), pos.getZ(), false));
				worldInfo.setThundering(false);
				stack.damageItem(2, player);
			}
		}

		if (this == EmotionItems.STAFF_GREEN)
		{
			block = Blocks.GRASS.getDefaultState();

			if (player.isSneaking())
			{
				if (state != Blocks.AIR.getDefaultState() & state != Blocks.BEDROCK.getDefaultState())
				{
					world.setBlockState(pos, block);
					stack.damageItem(1, player);
				}
			}
			else
			{
				if (state != Blocks.AIR.getDefaultState() & state != Blocks.BEDROCK.getDefaultState())
				{
					for (int x = -1; x < 2; x++)
					{
						for (int z = -1; z < 2; z++)
						{
							if (world.getBlockState(pos.add(x, 0, z)) != Blocks.BEDROCK.getDefaultState())
							{
								world.setBlockState(pos.add(x, 0, z), block);
							}
						}
					}
					stack.damageItem(4, player);
				}
			}
		}

		else if (this == EmotionItems.STAFF_RED)
		{
			block = Blocks.FLOWING_LAVA.getDefaultState();

			if (player.isSneaking())
			{
				if (state != Blocks.AIR.getDefaultState() & state != Blocks.BEDROCK.getDefaultState())
				{
					world.setBlockState(pos, block);
					stack.damageItem(1, player);
				}
			}
			else
			{
				if (state != Blocks.AIR.getDefaultState() & state != Blocks.BEDROCK.getDefaultState())
				{
					for (int x = -1; x < 2; x++)
					{
						for (int z = -1; z < 2; z++)
						{
							if (world.getBlockState(pos.add(x, 0, z)) != Blocks.BEDROCK.getDefaultState())
							{
								world.setBlockState(pos.add(x, 0, z), block);
							}
						}
					}
					stack.damageItem(4, player);
				}
			}
		}

		double d0 = world.rand.nextGaussian() * 0.02D;
		double d1 = world.rand.nextGaussian() * 0.02D;
		double d2 = world.rand.nextGaussian() * 0.02D;

		world.spawnParticle(EnumParticleTypes.PORTAL, (double) ((float) pos.getX() + world.rand.nextFloat()), (double) pos.getY() + (double) world.rand.nextFloat() * 1.0f,
				(double) ((float) pos.getZ() + world.rand.nextFloat()), d0, d1, d2, new int[0]);
		world.playSound(player, new BlockPos(pos.getX(), pos.getY(), pos.getZ()), SoundEvents.ENTITY_FIREWORK_BLAST, SoundCategory.AMBIENT, 1.0F, itemRand.nextFloat() * 0.4F + 0.8F);

		return EnumActionResult.SUCCESS;
	}
}
