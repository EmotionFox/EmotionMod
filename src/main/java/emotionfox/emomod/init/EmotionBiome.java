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
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;

@ObjectHolder(Reference.MOD_ID)
@Mod.EventBusSubscriber(modid = Reference.MOD_ID)
public class EmotionBiome
{
	public static final Biome ORCHARD = new BiomeOrchard();
	public static final Biome MAGIC_PLAINS = new BiomeMagic();
	public static final Biome ROCKY_LAND = new BiomeRock();
	// public static final Biome biomeDream;

	public static void mainRegister()
	{
		ORCHARD.setRegistryName(new ResourceLocation(Reference.MOD_ID, "orchard"));
		MAGIC_PLAINS.setRegistryName(new ResourceLocation(Reference.MOD_ID, "magic_plains"));
		ROCKY_LAND.setRegistryName(new ResourceLocation(Reference.MOD_ID, "rocky_land"));
	}

	@SubscribeEvent
	public static void registerBiome(RegistryEvent.Register<Biome> event)
	{
		final Biome[] emotionBiomes =
		{ ORCHARD, MAGIC_PLAINS, ROCKY_LAND };
		event.getRegistry().registerAll(emotionBiomes);

		net.minecraftforge.common.BiomeManager.addBiome(BiomeType.WARM, new BiomeEntry(ORCHARD, 10));
		net.minecraftforge.common.BiomeManager.addBiome(BiomeType.COOL, new BiomeEntry(MAGIC_PLAINS, 7));
		net.minecraftforge.common.BiomeManager.addBiome(BiomeType.WARM, new BiomeEntry(ROCKY_LAND, 10));

		net.minecraftforge.common.BiomeDictionary.addTypes(ORCHARD, Type.LUSH);
		net.minecraftforge.common.BiomeDictionary.addTypes(MAGIC_PLAINS, Type.MAGICAL);
		net.minecraftforge.common.BiomeDictionary.addTypes(ROCKY_LAND, Type.CONIFEROUS);

		net.minecraftforge.common.BiomeManager.addSpawnBiome(ORCHARD);
		net.minecraftforge.common.BiomeManager.addSpawnBiome(MAGIC_PLAINS);
		net.minecraftforge.common.BiomeManager.addSpawnBiome(ROCKY_LAND);
	}
}
