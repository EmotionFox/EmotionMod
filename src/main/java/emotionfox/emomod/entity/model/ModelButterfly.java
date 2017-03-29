package emotionfox.emomod.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ModelButterfly extends ModelBase
{
	public ModelRenderer body;
    public ModelRenderer lWing;
    public ModelRenderer rWing;

    public ModelButterfly() {
        this.textureWidth = 18;
        this.textureHeight = 17;
        this.body = new ModelRenderer(this, 0, 0);
        this.body.setRotationPoint(0.0F, 21.0F, -4.0F);
        this.body.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 7, 0.0F);
        this.rWing = new ModelRenderer(this, -8, 9);
        this.rWing.setRotationPoint(-1.0F, 21.0F, 0.0F);
        this.rWing.addBox(-7.0F, 0.0F, -4.0F, 7, 0, 8, 0.0F);
        this.lWing = new ModelRenderer(this, -8, 9);
        this.lWing.mirror = true;
        this.lWing.setRotationPoint(1.0F, 21.0F, 0.0F);
        this.lWing.addBox(0.0F, 0.0F, -4.0F, 7, 0, 8, 0.0F);
    }
    
    @Override
    public void render(Entity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale)
    {
    	super.render(entityIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
    	this.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, entityIn);
    	GlStateManager.pushMatrix();
		GlStateManager.scale(0.5F, 0.5F, 0.5F);
		GlStateManager.translate(0.0F, 24.0F * scale, 0.0F);
    	body.render(scale);
    	rWing.render(scale);
    	lWing.render(scale);
    	GlStateManager.popMatrix();
    }
    
    private void setRotation(ModelRenderer model, float x, float y, float z)
    {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }
    
    @Override
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn)
    {
    	super.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor, entityIn);
        float f6 = (180F / (float)Math.PI);
        this.lWing.rotateAngleZ = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.rWing.rotateAngleZ = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
    }
}
