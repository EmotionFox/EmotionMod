package emotionfox.emomod.blocks;

import emotionfox.emomod.blocks.base.BaseTable;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class WoodTable extends BaseTable
{
	public WoodTable()
	{
		super(Material.WOOD);
		this.setHardness(2.0F);
		this.setResistance(5.0F);
		this.setSoundType(SoundType.WOOD);
		this.setDefaultState(this.blockState.getBaseState().withProperty(TABLE, EnumTable.NORMAL));
		this.setCreativeTab(CreativeTabs.DECORATIONS);
	}
}
