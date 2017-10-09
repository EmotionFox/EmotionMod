package emotionfox.emomod.item.meta;

/**
 * @author EmotionFox
 */

public interface MetaItemInterface
{
	/**
	 * Adding variants.
	 * 
	 * @param variants
	 */
	public void addVariants(String[] variants);

	/**
	 * Return this full name by meta with the domain and without the type
	 * (item.).
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
