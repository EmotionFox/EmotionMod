package emotionfox.emomod.blocks.meta;

/**
 * @author EmotionFox
 */

public interface MetaBlockInterface
{
	/**
	 * Return the variant name by meta.
	 * 
	 * @param meta
	 * @return
	 */
	public String getVariant(int meta);

	/**
	 * Return this full name by meta with the domain and without the type
	 * (tile.).
	 * 
	 * @param meta
	 * @return String
	 */
	public String getVariantName(int meta);

	/**
	 * Return the number of name (variants) available for this block therefore
	 * his maximum meta.
	 * 
	 * @return Integer
	 */
	public int getMaxMeta();
}