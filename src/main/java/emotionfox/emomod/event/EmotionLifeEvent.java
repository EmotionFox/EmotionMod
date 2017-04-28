package emotionfox.emomod.event;

import emotionfox.emomod.init.EmotionItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLog;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.world.BlockEvent.HarvestDropsEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerRespawnEvent;

public class EmotionLifeEvent
{
	@SubscribeEvent
	public void onLivingDeath(LivingDeathEvent e)
	{
		if (e.getEntityLiving() instanceof EntityPlayer)
		{
			EntityPlayer player = (EntityPlayer) e.getEntityLiving();

			for (int i = 0; i < player.inventory.getSizeInventory(); i++)
			{
				if (player.inventory.getStackInSlot(i) != null && player.inventory.getStackInSlot(i).getItem() == EmotionItems.PURPURA_RING)
				{
					BlockPos pos = player.getPosition();
					player.getEntityData().setBoolean("ring", true);
					player.getEntityData().setInteger("posX", pos.getX());
					player.getEntityData().setInteger("posY", pos.getY());
					player.getEntityData().setInteger("posZ", pos.getZ());
				}
			}
		}
	}

	@SubscribeEvent
	public void onPlayerSpawn(PlayerEvent.Clone e)
	{
		EntityPlayer player = e.getOriginal();

		if (player.getEntityData().getBoolean("ring"))
		{
			if (e.isWasDeath())
			{
				e.getEntityPlayer().getEntityData().setBoolean("ring", player.getEntityData().getBoolean("ring"));
				e.getEntityPlayer().getEntityData().setInteger("posX", player.getEntityData().getInteger("posX"));
				e.getEntityPlayer().getEntityData().setInteger("posY", player.getEntityData().getInteger("posY"));
				e.getEntityPlayer().getEntityData().setInteger("posZ", player.getEntityData().getInteger("posZ"));
			}
		}
	}

	@SubscribeEvent
	public void onPlayerWake(PlayerRespawnEvent e)
	{
		EntityPlayer player = e.player;

		if (player.getEntityData().getBoolean("ring"))
		{
			if (player.dimension == 0)
			{
				if (player.isBurning())
				{
					player.addPotionEffect(new PotionEffect(Potion.getPotionById(12), 800, 0, true, false));
				}
				player.setPosition(player.getEntityData().getInteger("posX"), player.getEntityData().getInteger("posY"), player.getEntityData().getInteger("posZ"));
			}
			player.getEntityData().removeTag("ring");
			player.getEntityData().removeTag("posX");
			player.getEntityData().removeTag("posY");
			player.getEntityData().removeTag("posZ");
		}
	}

	@SubscribeEvent
	public void onHarvestDrops(HarvestDropsEvent e)
	{
		if (e.getHarvester() instanceof EntityPlayerMP)
		{
			EntityPlayer player = e.getHarvester();
			ItemStack mainHeld = player.getHeldItemMainhand();
			World world = e.getWorld();
			Block block = e.getState().getBlock();

			if (block == Blocks.GRASS)
			{
				if (world.rand.nextInt(15) == 0)
				{
					e.getDrops().clear();
					e.getDrops().add(new ItemStack(Items.WHEAT_SEEDS, 2));
				}
			}
			if (block instanceof BlockLog)
			{
				if (mainHeld.getItem().getHarvestLevel(mainHeld, "axe", player, e.getState()) == 1)
				{
					if (world.rand.nextInt(20) == 0)
					{
						e.getDrops().clear();
						e.getDrops().add(new ItemStack(Items.STICK, 2));
					}
				}
				else if (mainHeld.getItem().getHarvestLevel(mainHeld, "axe", player, e.getState()) > 1)
				{}
				else
				{
					if (world.rand.nextInt(10) == 0)
					{
						e.getDrops().clear();
						e.getDrops().add(new ItemStack(Items.STICK, 2));
					}
				}
			}
			if (block == Blocks.STONE)
			{
				if (mainHeld.getItem().getHarvestLevel(mainHeld, "pickaxe", player, e.getState()) == 1)
				{
					if (world.rand.nextInt(10) == 0)
					{
						e.getDrops().clear();
					}
				}
				else if (mainHeld.getItem().getHarvestLevel(mainHeld, "pickaxe", player, e.getState()) == 2)
				{
					if (world.rand.nextInt(20) == 0)
					{
						e.getDrops().clear();
						e.getDrops().add(new ItemStack(Item.getItemFromBlock(Blocks.STONE)));
					}
				}
				else if (mainHeld.getItem().getHarvestLevel(mainHeld, "pickaxe", player, e.getState()) >= 3)
				{
					if (world.rand.nextInt(10) == 0)
					{
						e.getDrops().clear();
						e.getDrops().add(new ItemStack(Item.getItemFromBlock(Blocks.STONE)));
					}
				}
			}
			if (block == Blocks.DIRT && world.getBlockState(e.getPos().up()).getBlock() == Blocks.FLOWING_WATER)
			{
				if (world.rand.nextInt(10) == 0)
				{
					e.getDrops().clear();
					e.getDrops().add(new ItemStack(Items.CLAY_BALL, 2));
				}
			}
		}
	}
}
