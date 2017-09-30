package emotionfox.emomod.handler;

import emotionfox.emomod.blocks.meta.MetaBlockInterface;
import emotionfox.emomod.blocks.meta.MetaItemBlock;
import emotionfox.emomod.init.EmotionBlock;
import emotionfox.emomod.init.EmotionItem;
import emotionfox.emomod.items.ItemSlice;
import emotionfox.emomod.items.meta.MetaItem;
import emotionfox.emomod.items.meta.MetaItemInterface;
import emotionfox.emomod.util.Reference;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

/**
 * @author EmotionFox
 */

@Mod.EventBusSubscriber(modid = Reference.MOD_ID)
public final class RegistrationHandler
{
	// Called by Forge.
	@SubscribeEvent
	public static void registerBlock(RegistryEvent.Register<Block> e)
	{
		e.getRegistry().registerAll(EmotionBlock.getBlocks());
	}

	// Called by Forge.
	@SubscribeEvent
	public static void registerItem(RegistryEvent.Register<Item> e)
	{
		e.getRegistry().registerAll(EmotionItem.getItems());
		e.getRegistry().registerAll(EmotionBlock.getItems());
	}

	// Called by Forge.
	@SubscribeEvent
	public static void registerItemTexture(ModelRegistryEvent event)
	{
		for (Item item : EmotionItem.ITEMS)
		{
			if (item instanceof MetaItemInterface)
			{
				MetaItemInterface metaItem = (MetaItemInterface) item;

				for (int i = 0; i <= metaItem.getMaxMeta(); i++)
					ModelLoader.setCustomModelResourceLocation(item, i, new ModelResourceLocation(metaItem.getVariantName(i), "inventory"));
			}
		}

		for (Item item : EmotionBlock.BLOCKS_ITEMS)
		{
			if (item instanceof MetaItemBlock)
			{
				MetaItemBlock itemBlock = (MetaItemBlock) item;
				MetaBlockInterface metaBlock = (MetaBlockInterface) itemBlock.getBlock();

				for (int i = 0; i <= metaBlock.getMaxMeta(); i++)
					ModelLoader.setCustomModelResourceLocation(item, i, new ModelResourceLocation(metaBlock.getVariantName(i), "inventory"));
			}
		}
	}

	// Called by Proxy.
	public static void registerItemRender()
	{
		ItemModelMesher modelMesher = Minecraft.getMinecraft().getRenderItem().getItemModelMesher();

		for (Item item : EmotionItem.ITEMS)
		{
			if (!(item instanceof MetaItemInterface))
				modelMesher.register(item, 0, new ModelResourceLocation(new ResourceLocation(Reference.MOD_ID, item.getUnlocalizedName().substring(5)), "inventory"));
		}

		for (Block block : EmotionBlock.BLOCKS)
		{
			if (!(block instanceof MetaBlockInterface))
			{
				modelMesher.register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(new ResourceLocation(Reference.MOD_ID, block.getUnlocalizedName().substring(5)), "inventory"));
			}
		}
	}
}
