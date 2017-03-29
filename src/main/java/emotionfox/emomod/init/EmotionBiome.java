package emotionfox.emomod.init;

import emotionfox.emomod.biome.BiomeMagic;
import emotionfox.emomod.biome.BiomeOrchard;
import emotionfox.emomod.biome.BiomeRock;
import emotionfox.emomod.util.Reference;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager.BiomeEntry;
import net.minecraftforge.common.BiomeManager.BiomeType;

public class EmotionBiome
{
	public static final Biome ORCHARD = new BiomeOrchard();
	public static final Biome MAGIC_PLAINS = new BiomeMagic();
	public static final Biome ROCKY_LAND = new BiomeRock();
	// public static final Biome biomeDream;

	public static void mainRegister()
	{
		registerBiome(ORCHARD, "orchard", BiomeType.WARM, Type.LUSH, 100); // 8
		registerBiome(MAGIC_PLAINS, "magic_plains", BiomeType.COOL, Type.MAGICAL, 7);
		registerBiome(ROCKY_LAND, "rocky_land", BiomeType.WARM, Type.CONIFEROUS, 10);
	}

	public static void registerBiome(Biome biome, String name, net.minecraftforge.common.BiomeManager.BiomeType type, net.minecraftforge.common.BiomeDictionary.Type gender, int weight)
	{
		net.minecraftforge.fml.common.registry.GameRegistry.register(biome, new ResourceLocation(Reference.MOD_ID, name));
		net.minecraftforge.common.BiomeManager.addBiome(type, new BiomeEntry(biome, weight));
		net.minecraftforge.common.BiomeDictionary.addTypes(biome, gender);
		net.minecraftforge.common.BiomeManager.addSpawnBiome(biome);
	}
}
