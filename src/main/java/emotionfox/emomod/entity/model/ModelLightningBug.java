package emotionfox.emomod.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelLightningBug extends ModelBase
{
	public ModelRenderer body;
	public ModelRenderer back;

    public ModelLightningBug()
    {
        textureWidth = 16;
        textureHeight = 16;

        body = new ModelRenderer(this, 0, 0);
        body.addBox(0F, 0F, 0F, 1, 1, 1);
        body.setTextureSize(16, 16);
        body.mirror = true;

        back = new ModelRenderer(this, 0, 2);
        back.addBox(0F, 0F, 0F, 1, 1, 1);
        back.setTextureSize(16, 16);
        back.mirror = true;
    }
    
    @Override
    public void render(Entity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale)
    {
    	super.render(entityIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
    	body.render(scale);
    	back.render(scale);
    }
}
