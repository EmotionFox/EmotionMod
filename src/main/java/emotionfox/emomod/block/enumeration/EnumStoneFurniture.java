package emotionfox.emomod.block.enumeration;

import net.minecraft.util.IStringSerializable;

public enum EnumStoneFurniture implements IStringSerializable
{
	COBBLESTONE(0, "cobblestone"), MOSSYCOBBLESTONE(1, "mossy_cobblestone"), STONEBRICK(2, "stonebrick"), MOSSYSTONEBRICK(3, "mossy_stonebrick"), CRACKEDSTONEBRICK(4, "cracked_stonebrick"), CHISELLEDSTONEBRICK(5, "chiselled_stonebrick"), BRICK(6, "brick");
    private static final EnumStoneFurniture[] METADATA = new EnumStoneFurniture[values().length];
    private final String name;
    private final int meta;

    private EnumStoneFurniture(int metadata, String name)
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
