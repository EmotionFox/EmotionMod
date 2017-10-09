package emotionfox.emomod.block.meta;

import java.util.ArrayList;

import emotionfox.emomod.util.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class MetaBlock extends Block implements MetaBlockInterface
{
	protected final ArrayList<String> variantList = new ArrayList<String>();
	
	public MetaBlock(Material mat)
	{
		super(mat);
	}

	@Override
	public String getVariant(int meta)
	{
		return this.variantList.get(meta);
	}

	@Override
	public String getVariantName(int meta)
	{
		String name = Reference.MOD_ID + ":" + this.getUnlocalizedName().substring(5);
		return meta > getMaxMeta() ? name + "_" + this.variantList.get(0) : name + "_" + this.variantList.get(meta);
	}

	@Override
	public int getMaxMeta()
	{
		return this.variantList.size() - 1;
	}
}
