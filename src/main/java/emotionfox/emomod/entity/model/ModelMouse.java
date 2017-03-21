package emotionfox.emomod.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class ModelMouse extends ModelBase
{
	public ModelRenderer tail;
	public ModelRenderer body;
	public ModelRenderer head;

    public ModelMouse()
    {
        float expand = -0.25F;
        textureWidth = 16;
        textureHeight = 16;

        tail = new ModelRenderer(this, 0, 10);
        tail.addBox(0F, 0F, 0F, 1, 1, 4);
        tail.setRotationPoint(0F, 23F, 1F);
        tail.setTextureSize(16, 16);
        tail.mirror = true;
        setRotation(tail, 0F, 0F, 0F);

        body = new ModelRenderer(this, 0, 3);
        body.addBox(0F, 0F, 0F, 3, 3, 4);
        body.setRotationPoint(-1F, 21F, -3F);
        body.setTextureSize(16, 16);
        body.mirror = true;
        setRotation(body, 0F, 0F, 0F);

        head = new ModelRenderer(this, 0, 0);
        head.addBox(0F, 0F, 0F, 3, 2, 1);
        head.setRotationPoint(-1F, 22F, -4F);
        head.setTextureSize(16, 16);
        head.mirror = true;
        setRotation(head, 0F, 0F, 0F);
    }
    
    @Override
    public void render(Entity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale)
    {
    	super.render(entityIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
    	this.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, entityIn);
    	this.tail.render(scale);
    	this.body.render(scale);
    	this.head.render(scale);
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
    	this.tail.rotateAngleY = MathHelper.cos(limbSwing * 1.5F) * 0.5F * limbSwingAmount;
    }
}
