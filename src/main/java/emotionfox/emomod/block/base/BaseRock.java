package emotionfox.emomod.block.base;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BaseRock extends Block
{
	public BaseRock()
	{
		super(Material.ROCK);
		this.setHardness(2F);
        this.setResistance(12F);
        this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	}
}
