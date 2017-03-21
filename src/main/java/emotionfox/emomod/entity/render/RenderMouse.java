package emotionfox.emomod.entity.render;

import emotionfox.emomod.entity.EntityMouse;
import emotionfox.emomod.entity.model.ModelMouse;
import emotionfox.emomod.util.Reference;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderMouse extends RenderLiving<EntityMouse>
{
	private static final ResourceLocation[] MOUSE_TEXTURES = new ResourceLocation[]{ 
			new ResourceLocation(Reference.MOD_ID, "textures/entity/mouse/mouse_white.png"), 
			new ResourceLocation(Reference.MOD_ID, "textures/entity/mouse/mouse_brown.png"),
			new ResourceLocation(Reference.MOD_ID, "textures/entity/mouse/mouse_ginger.png"),
			new ResourceLocation(Reference.MOD_ID, "textures/entity/mouse/mouse_black.png") };
	
	public RenderMouse(RenderManager rendermanagerIn)
	{
		super(rendermanagerIn, new ModelMouse(), 0.07F);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityMouse entity)
	{
		return MOUSE_TEXTURES[entity.getMouseType().ordinal()];
	}
}
