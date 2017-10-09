package emotionfox.emomod.block.base;

import java.util.Random;

import emotionfox.emomod.init.EmotionBlock;
import emotionfox.emomod.init.EmotionItem;
import net.minecraft.block.BlockDoor;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BaseDoor extends BlockDoor
{
	private MapColor mapColor;

	public BaseDoor(MapColor mapColorIn)
	{
		super(Material.WOOD);
		this.mapColor = mapColorIn;
		this.setSoundType(SoundType.WOOD);
		this.setHardness(2.0F);
		this.setResistance(5.0F);
	}

	@Override
	public MapColor getMapColor(IBlockState state, IBlockAccess worldIn, BlockPos pos)
	{
		return this.mapColor;
	}

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune)
	{
		return state.getValue(HALF) == BlockDoor.EnumDoorHalf.UPPER ? Items.AIR : this.getCustomItem();
	}

	@Override
	public ItemStack getItem(World worldIn, BlockPos pos, IBlockState state)
	{
		return new ItemStack(this.getCustomItem());
	}

	private Item getCustomItem()
	{
		return this == EmotionBlock.CHERRY_DOOR ? EmotionBlock.CHERRY_DOOR_ITEM
				: (this == EmotionBlock.PEAR_DOOR ? EmotionBlock.PEAR_DOOR_ITEM
						: (this == EmotionBlock.ORANGE_DOOR ? EmotionBlock.ORANGE_DOOR_ITEM
								: (this == EmotionBlock.ATLAS_DOOR ? EmotionBlock.ATLAS_DOOR_ITEM
										: (this == EmotionBlock.PINE_DOOR ? EmotionBlock.PINE_DOOR_ITEM
												: (this == EmotionBlock.COCO_DOOR ? EmotionBlock.COCO_DOOR_ITEM
														: (this == EmotionBlock.DREAM_DOOR ? EmotionBlock.DREAM_DOOR_ITEM : Items.OAK_DOOR))))));
	}
}
