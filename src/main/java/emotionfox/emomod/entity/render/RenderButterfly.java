package emotionfox.emomod.entity.render;

import emotionfox.emomod.entity.EntityButterfly;
import emotionfox.emomod.entity.model.ModelButterfly;
import emotionfox.emomod.util.Reference;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderButterfly extends RenderLiving<EntityButterfly>
{
	private static final ResourceLocation[] BUTTERFLY_TEXTURES = new ResourceLocation[]{ 
			new ResourceLocation(Reference.MOD_ID, "textures/entity/butterfly/butterfly_pink.png"), 
			new ResourceLocation(Reference.MOD_ID, "textures/entity/butterfly/butterfly_blue.png"),
			new ResourceLocation(Reference.MOD_ID, "textures/entity/butterfly/butterfly_green.png"),
			new ResourceLocation(Reference.MOD_ID, "textures/entity/butterfly/butterfly_citrus.png") };
	
	public RenderButterfly(RenderManager rendermanagerIn)
	{
		super(rendermanagerIn, new ModelButterfly(), 0.0F);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityButterfly entity)
	{
		return BUTTERFLY_TEXTURES[entity.getButterflyType().ordinal()];
	}
}
