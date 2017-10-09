package emotionfox.emomod.block.base;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class BaseClayDoubleSlab extends BaseSlab
{
	protected Block drop;
	
	public BaseClayDoubleSlab(MapColor mapColorIn, Block drop)
	{
		super(Material.ROCK, mapColorIn);
		this.setSoundType(SoundType.STONE);
		this.setHardness(1.25F);
		this.setResistance(7.0F);
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
