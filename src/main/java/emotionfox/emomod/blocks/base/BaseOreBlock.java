package emotionfox.emomod.blocks.base;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BaseOreBlock extends Block
{
	public BaseOreBlock()
	{
		super(Material.ROCK);
		this.setHardness(7.0F);
		this.setResistance(14.0F);
		this.setSoundType(SoundType.STONE);
		this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	}
}
