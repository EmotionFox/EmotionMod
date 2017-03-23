package emotionfox.emomod.entity.render;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

// Basic Renderer
@SideOnly(Side.CLIENT)
public class RenderBasic<T extends EntityLiving> extends RenderLiving<T>
{
	private ResourceLocation TEXTURE_BASIC;

	public RenderBasic(RenderManager rendermanagerIn, ModelBase modelbaseIn, float shadowsizeIn, ResourceLocation textureIn)
	{
		super(rendermanagerIn, modelbaseIn, shadowsizeIn);
		this.TEXTURE_BASIC = textureIn;
	}

	@Override
	protected ResourceLocation getEntityTexture(T entity)
	{
		return TEXTURE_BASIC;
	}
}
