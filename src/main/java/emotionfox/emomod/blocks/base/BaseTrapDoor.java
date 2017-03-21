package emotionfox.emomod.blocks.base;

import net.minecraft.block.BlockTrapDoor;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

public class BaseTrapDoor extends BlockTrapDoor
{
	public BaseTrapDoor(MapColor mapColorIn)
	{
		super(Material.WOOD);
		this.setSoundType(SoundType.WOOD);
		this.setHardness(2.0F);
		this.setResistance(5.0F);
	}
}
