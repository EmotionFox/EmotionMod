package emotionfox.emomod.blocks.base;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class BaseWoodDoubleSlab extends BaseSlab
{
	protected Block drop;
	
	public BaseWoodDoubleSlab(MapColor mapColorIn, Block drop)
	{
		super(Material.WOOD, mapColorIn);
		this.setSoundType(SoundType.WOOD);
		this.setHardness(2.0F);
		this.setResistance(5.0F);
		this.drop = drop;
	}

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune)
	{
		return Item.getItemFromBlock(drop);
	}
	
	@Override
	public boolean isDouble()
	{
		return true;
	}
}
