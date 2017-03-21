package emotionfox.emomod.blocks.enumeration;

import net.minecraft.util.IStringSerializable;

public enum EnumWoodFurniture implements IStringSerializable
{
	CHERRY(0, "cherry"), PEAR(1, "pear"), ORANGE(2, "orange"), ATLAS(3, "atlas"), PINE(4, "pine"), COCO(5, "coco"), DREAM(6, "dream"), OAK(7, "oak"), SPRUCE(8, "spruce"), BIRCH(9, "birch"), JUNGLE(10,
			"jungle"), ACACIA(11, "acacia"), BIG_OAK(12, "big_oak");
	private static final EnumWoodFurniture[] METADATA = new EnumWoodFurniture[values().length];
	private final String name;
	private final int meta;

	private EnumWoodFurniture(int metadata, String name)
	{
		this.meta = metadata;
		this.name = name;
	}

	public int getMetadata()
	{
		return meta;
	}

	@Override
	public String toString()
	{
		return name;
	}

	@Override
	public String getName()
	{
		return name;
	}
}
