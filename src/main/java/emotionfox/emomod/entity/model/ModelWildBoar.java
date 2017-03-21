package emotionfox.emomod.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ModelWildBoar extends ModelBase
{
	public ModelRenderer body;
	public ModelRenderer rightLeg1;
	public ModelRenderer rightLeg2;
	public ModelRenderer leftLeg1;
	public ModelRenderer leftLeg2;
	public ModelRenderer tail;
	public ModelRenderer head;
	public ModelRenderer snout;
	public ModelRenderer rightHorn;
	public ModelRenderer leftHorn;
	public ModelRenderer rightEar;
	public ModelRenderer leftEar;

	protected float childYOffset = 8.0F; // 8
	protected float childZOffset = 5.0F;

	public ModelWildBoar()
	{
		textureWidth = 64;
		textureHeight = 64;

		body = new ModelRenderer(this, 0, 16);
		body.addBox(0F, 0F, 0F, 12, 10, 18);
		body.setRotationPoint(-6F, 5F, -8F);
		body.setTextureSize(64, 64);
		body.mirror = true;
		setRotation(body, 0F, 0F, 0F);

		rightLeg1 = new ModelRenderer(this, 0, 45);
		rightLeg1.addBox(-2F, 0F, -2F, 3, 9, 3);
		rightLeg1.setRotationPoint(-3.066667F, 15F, -6F);
		rightLeg1.setTextureSize(64, 64);
		rightLeg1.mirror = true;
		setRotation(rightLeg1, 0F, 0F, 0F);

		rightLeg2 = new ModelRenderer(this, 0, 45);
		rightLeg2.addBox(-2F, 0F, -1F, 3, 9, 3);
		rightLeg2.setRotationPoint(-3F, 15F, 8F);
		rightLeg2.setTextureSize(64, 64);
		rightLeg2.mirror = true;
		setRotation(rightLeg2, 0F, 0F, 0F);

		leftLeg1 = new ModelRenderer(this, 0, 45);
		leftLeg1.addBox(-1F, 0F, -2F, 3, 9, 3);
		leftLeg1.setRotationPoint(3F, 15F, -6F);
		leftLeg1.setTextureSize(64, 64);
		leftLeg1.mirror = true;
		setRotation(leftLeg1, 0F, 0F, 0F);

		leftLeg2 = new ModelRenderer(this, 0, 45);
		leftLeg2.addBox(-1F, 0F, -1F, 3, 9, 3);
		leftLeg2.setRotationPoint(3F, 15F, 8F);
		leftLeg2.setTextureSize(64, 64);
		leftLeg2.mirror = true;
		setRotation(leftLeg2, 0F, 0F, 0F);

		tail = new ModelRenderer(this, 36, 0);
		tail.addBox(-1F, 0F, 0F, 2, 6, 1);
		tail.setRotationPoint(0F, 5F, 10F);
		tail.setTextureSize(64, 64);
		tail.mirror = true;
		setRotation(tail, 0F, 0F, 0F);

		head = new ModelRenderer(this, 0, 0);
		head.addBox(-3F, -1F, -7F, 6, 8, 7);
		head.setRotationPoint(0F, 4F, -8F);
		head.setTextureSize(64, 64);
		head.mirror = true;
		setRotation(head, 0F, 0F, 0F);

		snout = new ModelRenderer(this, 27, 0);
		snout.addBox(-1F, 3F, -9F, 2, 2, 2);
		snout.setRotationPoint(0F, 0F, 0F);
		snout.setTextureSize(64, 64);
		snout.mirror = true;
		setRotation(snout, 0F, 0F, 0F);

		rightHorn = new ModelRenderer(this, 27, 5);
		rightHorn.addBox(-2F, 4F, -8F, 2, 1, 1);
		rightHorn.setRotationPoint(0F, 0F, 0F);
		rightHorn.setTextureSize(64, 64);
		rightHorn.mirror = true;
		setRotation(rightHorn, 0F, -0.1047198F, 0.3490659F);

		leftHorn = new ModelRenderer(this, 27, 7);
		leftHorn.addBox(0F, 4F, -8F, 2, 1, 1);
		leftHorn.setRotationPoint(0F, 0F, 0F);
		leftHorn.setTextureSize(64, 64);
		leftHorn.mirror = true;
		setRotation(leftHorn, 0F, 0.1047198F, -0.3490659F);

		rightEar = new ModelRenderer(this, 43, 0);
		rightEar.addBox(-5F, 0F, -3F, 4, 3, 1);
		rightEar.setRotationPoint(0F, 0F, 0F);
		rightEar.setTextureSize(64, 64);
		rightEar.mirror = true;
		setRotation(rightEar, 0F, 0F, 0.7853982F);

		leftEar = new ModelRenderer(this, 43, 5);
		leftEar.addBox(1F, 0F, -3F, 4, 3, 1);
		leftEar.setRotationPoint(0F, 0F, 0F);
		leftEar.setTextureSize(64, 64);
		leftEar.mirror = true;
		setRotation(leftEar, 0F, 0F, -0.7853982F);

		head.addChild(rightHorn);
		head.addChild(leftHorn);
		head.addChild(snout);
		head.addChild(rightEar);
		head.addChild(leftEar);
	}

	@Override
	public void render(Entity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale)
	{
		super.render(entityIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
		this.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, entityIn);

		if (this.isChild)
		{
			float f = 2.0F;
			GlStateManager.pushMatrix();
			GlStateManager.translate(0.0F, this.childYOffset * scale, this.childZOffset * scale);
			this.head.render(scale);
			GlStateManager.popMatrix();
			GlStateManager.pushMatrix();
			GlStateManager.scale(0.5F, 0.5F, 0.5F);
			GlStateManager.translate(0.0F, 24.0F * scale, 0.0F);
			this.body.render(scale);
			this.rightLeg1.render(scale);
			this.rightLeg2.render(scale);
			this.leftLeg1.render(scale);
			this.leftLeg2.render(scale);
			this.tail.render(scale);
			GlStateManager.popMatrix();
		}
		else
		{
			this.head.render(scale);
			this.body.render(scale);
			this.rightLeg1.render(scale);
			this.rightLeg2.render(scale);
			this.leftLeg1.render(scale);
			this.leftLeg2.render(scale);
			this.tail.render(scale);
		}
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
		this.tail.rotateAngleZ = MathHelper.cos(limbSwing * 0.3F) * 1.2F * limbSwingAmount;
		this.leftLeg1.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
		this.leftLeg2.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float) Math.PI) * 1.4F * limbSwingAmount;
		this.rightLeg1.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float) Math.PI) * 1.4F * limbSwingAmount;
		this.rightLeg2.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
	}
}
