package emotionfox.emomod.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class ModelChubby extends ModelBase
{
	ModelRenderer leftLeg1;
    ModelRenderer rightLeg1;
    ModelRenderer body;
    ModelRenderer rightLeg2;
    ModelRenderer leftLeg2;
    ModelRenderer head;
    ModelRenderer rightHorn;
    ModelRenderer leftHorn;

    public ModelChubby()
    {
        textureWidth = 32;
        textureHeight = 32;

        leftLeg1 = new ModelRenderer(this, 4, 20);
        leftLeg1.addBox(-1F, 0F, 0F, 1, 4, 1);
        leftLeg1.setRotationPoint(-1F, 20F, 2F);
        leftLeg1.setTextureSize(32, 32);
        leftLeg1.mirror = true;
        setRotation(leftLeg1, 0F, 0F, 0F);
        
        rightLeg1 = new ModelRenderer(this, 4, 25);
        rightLeg1.addBox(0F, 0F, 0F, 1, 4, 1);
        rightLeg1.setRotationPoint(2F, 20F, 2F);
        rightLeg1.setTextureSize(32, 32);
        rightLeg1.mirror = true;
        setRotation(rightLeg1, 0F, 0F, 0F);
        
        body = new ModelRenderer(this, 0, 0);
        body.addBox(0F, 0F, 0F, 7, 7, 7);
        body.setRotationPoint(-3F, 14F, -3F);
        body.setTextureSize(32, 32);
        body.mirror = true;
        setRotation(body, 0F, 0F, 0F);
        
        rightLeg2 = new ModelRenderer(this, 0, 25);
        rightLeg2.addBox(0F, 0F, -1F, 1, 4, 1);
        rightLeg2.setRotationPoint(2F, 20F, -1F);
        rightLeg2.setTextureSize(32, 32);
        rightLeg2.mirror = true;
        setRotation(rightLeg2, 0F, 0F, 0F);
        
        leftLeg2 = new ModelRenderer(this, 0, 20);
        leftLeg2.addBox(-1F, 0F, -1F, 1, 4, 1);
        leftLeg2.setRotationPoint(-1F, 20F, -1F);
        leftLeg2.setTextureSize(32, 32);
        leftLeg2.mirror = true;
        setRotation(leftLeg2, 0F, 0F, 0F);
        
        head = new ModelRenderer(this, 0, 14);
        head.addBox(-1.5F, -1.5F, -3F, 3, 3, 3);
        head.setRotationPoint(0.5F, 14.5F, -1F);
        head.setTextureSize(32, 32);
        head.mirror = true;
        setRotation(head, 0F, 0F, 0F);
        
        rightHorn = new ModelRenderer(this, 0, 0);
        rightHorn.addBox(0F, -3F, 0F, 1, 3, 1);
        rightHorn.setRotationPoint(0.5F, 0F, -2F);
        rightHorn.setTextureSize(32, 32);
        rightHorn.mirror = true;
        setRotation(rightHorn, -0.2094395F, 0F, 0F);
        
        leftHorn = new ModelRenderer(this, 0, 0);
        leftHorn.addBox(-1F, -3F, 0F, 1, 3, 1);
        leftHorn.setRotationPoint(-0.5F, 0F, -2F);
        leftHorn.setTextureSize(32, 32);
        leftHorn.mirror = true;
        setRotation(leftHorn, -0.2094395F, 0F, 0F);
        
        head.addChild(leftHorn);
        head.addChild(rightHorn);
    }
    
    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        super.render(entity, f, f1, f2, f3, f4, f5);
        setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        leftLeg1.render(f5);
        rightLeg1.render(f5);
        body.render(f5);
        rightLeg2.render(f5);
        leftLeg2.render(f5);
        head.render(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z)
    {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }
    
    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
    {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        float f6 = (180F / (float)Math.PI);
        this.head.rotateAngleX = f4 / (180F / (float)Math.PI);
        this.head.rotateAngleY = f3 / (180F / (float)Math.PI);
        this.leftLeg1.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
        this.leftLeg2.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
        this.rightLeg1.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
        this.rightLeg2.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
    }
}
