package emotionfox.emomod.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
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
	public void render(Entity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale)
	{
		super.render(entityIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
		this.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, entityIn);
		leftLeg1.render(scale);
		rightLeg1.render(scale);
		body.render(scale);
		rightLeg2.render(scale);
		leftLeg2.render(scale);
		head.render(scale);
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
		float f6 = (180F / (float) Math.PI);
		this.head.rotateAngleX = headPitch / (180F / (float) Math.PI);
		this.head.rotateAngleY = netHeadYaw / (180F / (float) Math.PI);
		this.leftLeg1.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
		this.leftLeg2.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float) Math.PI) * 1.4F * limbSwingAmount;
		this.rightLeg1.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float) Math.PI) * 1.4F * limbSwingAmount;
		this.rightLeg2.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
	}
}
