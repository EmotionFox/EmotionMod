package emotionfox.emomod.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ModelBeetle extends ModelBase
{
	public ModelRenderer body;

	public ModelBeetle()
	{
		textureWidth = 16;
		textureHeight = 16;

		body = new ModelRenderer(this, 0, 0);
		body.addBox(-1.5F, 22F, -2F, 3, 2, 4);
		body.setTextureSize(16, 16);
		body.mirror = true;
	}

	@Override
	public void render(Entity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale)
	{
		super.render(entityIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);

		this.body.render(scale);
	}
}
