package emotionfox.emomod.blocks.base;

import java.util.Random;

import emotionfox.emomod.init.EmotionBlocks;
import emotionfox.emomod.init.EmotionItems;
import net.minecraft.block.BlockDoor;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
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
	public MapColor getMapColor(IBlockState state)
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
		return this == EmotionBlocks.CHERRY_DOOR ? EmotionItems.CHERRY_DOOR
				: (this == EmotionBlocks.PEAR_DOOR ? EmotionItems.PEAR_DOOR
						: (this == EmotionBlocks.ORANGE_DOOR ? EmotionItems.ORANGE_DOOR
								: (this == EmotionBlocks.ATLAS_DOOR ? EmotionItems.ATLAS_DOOR
										: (this == EmotionBlocks.PINE_DOOR ? EmotionItems.PINE_DOOR
												: (this == EmotionBlocks.COCO_DOOR ? EmotionItems.COCO_DOOR
														: (this == EmotionBlocks.DREAM_DOOR ? EmotionItems.DREAM_DOOR : Items.OAK_DOOR))))));
	}
}
