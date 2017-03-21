package emotionfox.emomod.items.model;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelViridisArmor extends ModelBiped
{
	ModelRenderer bodytop;
    ModelRenderer right1;
    ModelRenderer right2;
    ModelRenderer right3;
    ModelRenderer left1;
    ModelRenderer left2;
    ModelRenderer left3;
    
    public ModelViridisArmor(float expand)
    {
        super(expand, 0, 64, 64);

        bodytop = new ModelRenderer(this, 28, 32);
        bodytop.addBox(-4F, 0F, -3F, 8, 7, 6);
        bodytop.setRotationPoint(0F, 0F, 0F);
        bodytop.setTextureSize(64, 64);
        bodytop.mirror = true;
        setRotation(bodytop, 0F, 0F, 0F);

        right1 = new ModelRenderer(this, 0, 32);
        right1.addBox(-3F, -2F, -3F, 4, 1, 1);
        right1.setRotationPoint(0F, 0F, 0F);
        right1.setTextureSize(64, 64);
        right1.mirror = true;
        setRotation(right1, 0F, 0F, 0F);

        right2 = new ModelRenderer(this, 0, 34);
        right2.addBox(-3F, -2F, 2F, 4, 1, 1);
        right2.setRotationPoint(0F, 0F, 0F);
        right2.setTextureSize(64, 64);
        right2.mirror = true;
        setRotation(right2, 0F, 0F, 0F);

        right3 = new ModelRenderer(this, 0, 36);
        right3.addBox(-4F, -4F, -3F, 1, 3, 6);
        right3.setRotationPoint(0F, 0F, 0F);
        right3.setTextureSize(64, 64);
        right3.mirror = true;
        setRotation(right3, 0F, 0F, 0F);

        left1 = new ModelRenderer(this, 14, 32);
        left1.addBox(-1F, -2F, -3F, 4, 1, 1);
        left1.setRotationPoint(0F, 0F, 0F);
        left1.setTextureSize(64, 64);
        left1.mirror = true;
        setRotation(left1, 0F, 0F, 0F);

        left2 = new ModelRenderer(this, 14, 34);
        left2.addBox(-1F, -2F, 2F, 4, 1, 1);
        left2.setRotationPoint(0F, 0F, 0F);
        left2.setTextureSize(64, 64);
        left2.mirror = true;
        setRotation(left2, 0F, 0F, 0F);

        left3 = new ModelRenderer(this, 14, 36);
        left3.addBox(3F, -4F, -3F, 1, 3, 6);
        left3.setRotationPoint(0F, 0F, 0F);
        left3.setTextureSize(64, 64);
        left3.mirror = true;
        setRotation(left3, 0F, 0F, 0F);

        right2.addChild(right1);
        right3.addChild(right2);
        this.bipedRightArm.addChild(right3);

        left2.addChild(left1);
        left3.addChild(left2);
        this.bipedLeftArm.addChild(left3);

        this.bipedBody.addChild(bodytop);
    }
    
    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        super.render(entity, f, f1, f2, f3, f4, f5);
        setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    }
    
    private void setRotation(ModelRenderer model, float x, float y, float z)
    {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }
}
