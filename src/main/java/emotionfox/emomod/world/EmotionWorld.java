package emotionfox.emomod.world;

import net.minecraftforge.fml.common.IWorldGenerator;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class EmotionWorld
{
	public static void mainRegister()
	{
		registerWorldGen(new WorldGenEmotion(), 1);
	}
	
	public static void registerWorldGen(IWorldGenerator worldGenClass, int weightedProbability)
	{
		GameRegistry.registerWorldGenerator(worldGenClass, weightedProbability);
	}
}
