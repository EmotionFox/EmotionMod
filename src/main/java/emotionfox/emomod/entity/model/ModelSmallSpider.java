package emotionfox.emomod.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ModelSmallSpider extends ModelBase
{
	public ModelRenderer pit;
	public ModelRenderer body;
	public ModelRenderer head;
	public ModelRenderer rightLeg3;
	public ModelRenderer rightLeg2;
	public ModelRenderer rightLeg1;
	public ModelRenderer leftLeg3;
	public ModelRenderer leftLeg2;
	public ModelRenderer leftLeg1;

	public ModelSmallSpider()
	{
		textureWidth = 16;
		textureHeight = 16;

		pit = new ModelRenderer(this, 0, 0);
		pit.addBox(-1F, -1F, 0F, 2, 2, 3);
		pit.setRotationPoint(0F, 22F, 1F);
		pit.setTextureSize(16, 16);
		pit.mirror = true;
		setRotation(pit, 0F, 0F, 0F);

		body = new ModelRenderer(this, 0, 5);
		body.addBox(-1F, -1F, 0F, 4, 2, 3);
		body.setRotationPoint(-1F, 22F, -2F);
		body.setTextureSize(16, 16);
		body.mirror = true;
		setRotation(body, 0F, 0F, 0F);

		head = new ModelRenderer(this, 10, 0);
		head.addBox(-1F, 0F, 0F, 2, 2, 1);
		head.setRotationPoint(0F, 21F, -3F);
		head.setTextureSize(16, 16);
		head.mirror = true;
		setRotation(head, 0F, 0F, 0F);

		rightLeg3 = new ModelRenderer(this, 0, 14);
		rightLeg3.addBox(0F, -1F, 0F, 4, 1, 1);
		rightLeg3.setRotationPoint(1F, 23F, 0F);
		rightLeg3.setTextureSize(16, 16);
		rightLeg3.mirror = true;
		setRotation(rightLeg3, 0F, -0.2617994F, 0.2617994F);

		rightLeg2 = new ModelRenderer(this, 0, 14);
		rightLeg2.addBox(0F, -1F, -1F, 4, 1, 1);
		rightLeg2.setRotationPoint(1F, 23F, 0F);
		rightLeg2.setTextureSize(16, 16);
		rightLeg2.mirror = true;
		setRotation(rightLeg2, 0F, 0F, 0.2617994F);

		rightLeg1 = new ModelRenderer(this, 0, 14);
		rightLeg1.addBox(0F, -1F, -1F, 4, 1, 1);
		rightLeg1.setRotationPoint(1F, 23F, -1F);
		rightLeg1.setTextureSize(16, 16);
		rightLeg1.mirror = true;
		setRotation(rightLeg1, 0F, 0.2617994F, 0.2617994F);

		leftLeg3 = new ModelRenderer(this, 0, 11);
		leftLeg3.addBox(-4F, -1F, 0F, 4, 1, 1);
		leftLeg3.setRotationPoint(-1F, 23F, 0F);
		leftLeg3.setTextureSize(16, 16);
		leftLeg3.mirror = true;
		setRotation(leftLeg3, 0F, 0.2617994F, -0.2617994F);

		leftLeg2 = new ModelRenderer(this, 0, 11);
		leftLeg2.addBox(-4F, -1F, -1F, 4, 1, 1);
		leftLeg2.setRotationPoint(-1F, 23F, 0F);
		leftLeg2.setTextureSize(16, 16);
		leftLeg2.mirror = true;
		setRotation(leftLeg2, 0F, 0F, -0.2617994F);

		leftLeg1 = new ModelRenderer(this, 0, 11);
		leftLeg1.addBox(-4F, -1F, -1F, 4, 1, 1);
		leftLeg1.setRotationPoint(-1F, 23F, -1F);
		leftLeg1.setTextureSize(16, 16);
		leftLeg1.mirror = true;
		setRotation(leftLeg1, 0F, -0.2617994F, -0.2617994F);
	}

	@Override
	public void render(Entity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale)
	{
		super.render(entityIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
		this.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, entityIn);

		this.pit.render(scale);
		this.body.render(scale);
		this.head.render(scale);
		this.rightLeg3.render(scale);
		this.rightLeg2.render(scale);
		this.rightLeg1.render(scale);
		this.leftLeg3.render(scale);
		this.leftLeg2.render(scale);
		this.leftLeg1.render(scale);
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
		this.leftLeg1.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
		this.leftLeg2.rotateAngleY = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
		this.leftLeg3.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
		this.rightLeg1.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float) Math.PI) * 1.4F * limbSwingAmount;
		this.rightLeg2.rotateAngleY = MathHelper.cos(limbSwing * 0.6662F + (float) Math.PI) * 1.4F * limbSwingAmount;
		this.rightLeg3.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float) Math.PI) * 1.4F * limbSwingAmount;
	}
}
