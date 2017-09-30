package emotionfox.emomod.blocks.base;

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
		return this == EmotionBlock.CHERRY_DOOR ? EmotionItem.CHERRY_DOOR
				: (this == EmotionBlock.PEAR_DOOR ? EmotionItem.PEAR_DOOR
						: (this == EmotionBlock.ORANGE_DOOR ? EmotionItem.ORANGE_DOOR
								: (this == EmotionBlock.ATLAS_DOOR ? EmotionItem.ATLAS_DOOR
										: (this == EmotionBlock.PINE_DOOR ? EmotionItem.PINE_DOOR
												: (this == EmotionBlock.COCO_DOOR ? EmotionItem.COCO_DOOR
														: (this == EmotionBlock.DREAM_DOOR ? EmotionItem.DREAM_DOOR : Items.OAK_DOOR))))));
	}
}
