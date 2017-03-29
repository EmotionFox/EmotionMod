package emotionfox.emomod.blocks.base;

import net.minecraft.block.BlockTrapDoor;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

public class BaseTrapDoor extends BlockTrapDoor
{
	private MapColor mapColor;
	
	public BaseTrapDoor(MapColor mapColorIn)
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
}
