package emotionfox.emomod.block.base;

import emotionfox.emomod.block.BurningBlock;
import emotionfox.emomod.init.EmotionBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BaseOreBlock extends Block implements BurningBlock
{
	public BaseOreBlock()
	{
		super(Material.ROCK);
		this.setHardness(7.0F);
		this.setResistance(14.0F);
		this.setSoundType(SoundType.STONE);
		this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	}

	@Override
	public int getBurningTime()
	{
		if (this == EmotionBlock.LUME_ORE)
			return 45000;
		return 0;
	}
}
