package emotionfox.emomod.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class ModelScorpion extends ModelBase
{
	ModelRenderer body;
	ModelRenderer rightleg1;
	ModelRenderer rightleg2;
	ModelRenderer rightleg3;
	ModelRenderer leftleg1;
	ModelRenderer leftleg2;
	ModelRenderer leftleg3;
	ModelRenderer tail1;
	ModelRenderer tail2;
	ModelRenderer tail3;
	ModelRenderer sting;
	ModelRenderer rightpincer;
	ModelRenderer leftpincer;

	public ModelScorpion()
	{
		textureWidth = 32;
		textureHeight = 32;

		body = new ModelRenderer(this, 0, 0);
		body.addBox(-2F, -1F, -2F, 3, 2, 5);
		body.setRotationPoint(0F, 22F, 0F);
		body.setTextureSize(32, 32);
		body.mirror = true;
		setRotation(body, 0F, 0F, 0F);

		rightleg1 = new ModelRenderer(this, 0, 23);
		rightleg1.addBox(-3F, 0F, 0F, 3, 1, 1);
		rightleg1.setRotationPoint(-1F, 22F, -1.9F);
		rightleg1.setTextureSize(32, 32);
		rightleg1.mirror = true;
		setRotation(rightleg1, 0F, 0F, -0.3490659F);

		rightleg2 = new ModelRenderer(this, 0, 21);
		rightleg2.addBox(-3F, 0F, 0F, 3, 1, 1);
		rightleg2.setRotationPoint(-1F, 22F, 0F);
		rightleg2.setTextureSize(32, 32);
		rightleg2.mirror = true;
		setRotation(rightleg2, 0F, 0F, -0.3490659F);

		rightleg3 = new ModelRenderer(this, 0, 19);
		rightleg3.addBox(-3F, 0F, 0F, 3, 1, 1);
		rightleg3.setRotationPoint(-1F, 22F, 1.9F);
		rightleg3.setTextureSize(32, 32);
		rightleg3.mirror = true;
		setRotation(rightleg3, 0F, 0F, -0.3490659F);

		leftleg1 = new ModelRenderer(this, 0, 16);
		leftleg1.addBox(0F, 0F, 0F, 3, 1, 1);
		leftleg1.setRotationPoint(0F, 22F, -1.9F);
		leftleg1.setTextureSize(32, 32);
		leftleg1.mirror = true;
		setRotation(leftleg1, 0F, 0F, 0.3490659F);

		leftleg2 = new ModelRenderer(this, 0, 14);
		leftleg2.addBox(0F, 0F, 0F, 3, 1, 1);
		leftleg2.setRotationPoint(0F, 22F, 0F);
		leftleg2.setTextureSize(32, 32);
		leftleg2.mirror = true;
		setRotation(leftleg2, 0F, 0F, 0.3490659F);

		leftleg3 = new ModelRenderer(this, 0, 12);
		leftleg3.addBox(0F, 0F, 0F, 3, 1, 1);
		leftleg3.setRotationPoint(0F, 22F, 1.9F);
		leftleg3.setTextureSize(32, 32);
		leftleg3.mirror = true;
		setRotation(leftleg3, 0F, 0F, 0.3490659F);

		tail1 = new ModelRenderer(this, 0, 7);
		tail1.addBox(-1F, 0F, 0F, 1, 1, 1);
		tail1.setRotationPoint(0F, 22F, 3F);
		tail1.setTextureSize(32, 32);
		tail1.mirror = true;
		setRotation(tail1, 0F, 0F, 0F);

		tail2 = new ModelRenderer(this, 4, 7);
		tail2.addBox(0F, 0F, 0F, 1, 4, 1);
		tail2.setRotationPoint(-1F, 19F, 4F);
		tail2.setTextureSize(32, 32);
		tail2.mirror = true;
		setRotation(tail2, 0F, 0F, 0F);

		tail3 = new ModelRenderer(this, 8, 7);
		tail3.addBox(0F, 0F, 0F, 1, 1, 4);
		tail3.setRotationPoint(-1F, 18F, 1F);
		tail3.setTextureSize(32, 32);
		tail3.mirror = true;
		setRotation(tail3, 0F, 0F, 0F);

		sting = new ModelRenderer(this, 18, 7);
		sting.addBox(0F, 0F, 0F, 1, 1, 1);
		sting.setRotationPoint(-1F, 19F, 1F);
		sting.setTextureSize(32, 32);
		sting.mirror = true;
		setRotation(sting, 0F, 0F, 0F);

		rightpincer = new ModelRenderer(this, 9, 13);
		rightpincer.addBox(0F, 0F, 0F, 1, 1, 3);
		rightpincer.setRotationPoint(-3F, 22F, -4F);
		rightpincer.setTextureSize(32, 32);
		rightpincer.mirror = true;
		setRotation(rightpincer, 0F, 0F, 0F);

		leftpincer = new ModelRenderer(this, 17, 13);
		leftpincer.addBox(0F, 0F, 0F, 1, 1, 3);
		leftpincer.setRotationPoint(1F, 22F, -4F);
		leftpincer.setTextureSize(32, 32);
		leftpincer.mirror = true;
		setRotation(leftpincer, 0F, 0F, 0F);
	}

	@Override
	public void render(Entity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale)
	{
		super.render(entityIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
		this.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, entityIn);
		body.render(scale);
		rightleg1.render(scale);
		rightleg2.render(scale);
		rightleg3.render(scale);
		leftleg1.render(scale);
		leftleg2.render(scale);
		leftleg3.render(scale);
		tail1.render(scale);
		tail2.render(scale);
		tail3.render(scale);
		sting.render(scale);
		rightpincer.render(scale);
		leftpincer.render(scale);
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
		this.leftleg1.rotateAngleY = MathHelper.cos(limbSwing * 1F) * 0.5F * limbSwingAmount;
		this.leftleg2.rotateAngleY = -MathHelper.cos(limbSwing * 1F) * 0.5F * limbSwingAmount;
		this.leftleg3.rotateAngleY = MathHelper.cos(limbSwing * 1F) * 0.5F * limbSwingAmount;
		this.rightleg1.rotateAngleY = MathHelper.cos(limbSwing * 1F + (float) Math.PI) * 0.5F * limbSwingAmount;
		this.rightleg2.rotateAngleY = -MathHelper.cos(limbSwing * 1F + (float) Math.PI) * 0.5F * limbSwingAmount;
		this.rightleg3.rotateAngleY = MathHelper.cos(limbSwing * 1F + (float) Math.PI) * 0.5F * limbSwingAmount;
	}
}
