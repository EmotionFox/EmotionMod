package emotionfox.emomod.block;

import emotionfox.emomod.block.base.BaseTable;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class StoneTable extends BaseTable
{
	public StoneTable()
	{
		super(Material.ROCK);
		this.setHardness(2.0F);
		this.setResistance(10.0F);
		this.setSoundType(SoundType.STONE);
		this.setDefaultState(this.blockState.getBaseState().withProperty(TABLE, EnumTable.NORMAL));
		this.setCreativeTab(CreativeTabs.DECORATIONS);
	}
}
