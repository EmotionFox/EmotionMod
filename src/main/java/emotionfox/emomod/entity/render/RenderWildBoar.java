package emotionfox.emomod.entity.render;

import emotionfox.emomod.entity.EntityWildBoar;
import emotionfox.emomod.entity.model.ModelWildBoar;
import emotionfox.emomod.util.Reference;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderWildBoar extends RenderLiving<EntityWildBoar>
{
	public static ResourceLocation[] WILD_BOAR_TEXTURE = new ResourceLocation[]
	{ new ResourceLocation(Reference.MOD_ID, "textures/entity/wild_boar/wild_boar.png"), new ResourceLocation(Reference.MOD_ID, "textures/entity/wild_boar/wild_boar_child.png") };

	public RenderWildBoar(RenderManager renderManager)
	{
		super(renderManager, new ModelWildBoar(), 0.5F);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityWildBoar entity)
	{
		return this.getMainModel().isChild ? WILD_BOAR_TEXTURE[1] : WILD_BOAR_TEXTURE[0];
	}
}
