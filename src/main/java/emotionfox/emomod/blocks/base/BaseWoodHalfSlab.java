package emotionfox.emomod.blocks.base;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.item.ItemStack;

public class BaseWoodHalfSlab extends BaseSlab
{
	public BaseWoodHalfSlab(MapColor mapColorIn)
	{
		super(Material.WOOD, mapColorIn);
		this.setSoundType(SoundType.WOOD);
		this.setHardness(2.0F);
		this.setResistance(5.0F);
	}
	
	public boolean isDouble()
    {
        return false;
    }
}
