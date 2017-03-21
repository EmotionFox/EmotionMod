package emotionfox.emomod.blocks.enumeration;

import net.minecraft.util.IStringSerializable;

public enum EnumBerry implements IStringSerializable
{
	BLUEBERRY(0, "blueberry"), REDCURRANT(1, "redcurrant"), BLACKCURRANT(2, "blackcurrant"), STRAWBERRY(3, "strawberry"), DREAMCURRANT(4, "dreamcurrant");
	private static final EnumBerry[] METADATA = new EnumBerry[values().length];
	private final String name;
	private final int meta;

	private EnumBerry(int metadata, String name)
	{
		this.meta = metadata;
		this.name = name;
	}

	@Override
	public String getName()
	{
		return this.name;
	}

	public int getMetadata()
	{
		return this.meta;
	}

	@Override
	public String toString()
	{
		return getName();
	}
}
