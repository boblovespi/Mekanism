package mekanism.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ModelChemicalInfuser extends ModelBase
{
	ModelRenderer base;
	ModelRenderer tank2;
	ModelRenderer portRight;
	ModelRenderer portBack;
	ModelRenderer portLeft;
	ModelRenderer tank1;
	ModelRenderer portFront;
	ModelRenderer tank3;
	ModelRenderer pipeAngle2;
	ModelRenderer connectorAngle;
	ModelRenderer pipe2;
	ModelRenderer connector;
	ModelRenderer compressor;
	ModelRenderer tube10;
	ModelRenderer tube8;
	ModelRenderer tube9;
	ModelRenderer tube7;
	ModelRenderer tube6;
	ModelRenderer tube5;
	ModelRenderer tube4;
	ModelRenderer tube3;
	ModelRenderer tube2;
	ModelRenderer tube1;
	ModelRenderer pipe1;
	ModelRenderer pipeAngle1;
	ModelRenderer exhaust4;
	ModelRenderer exhaust3;
	ModelRenderer exhaust2;
	ModelRenderer exhaust1;

	public ModelChemicalInfuser() 
	{
		textureWidth = 128;
		textureHeight = 64;

		base = new ModelRenderer(this, 0, 0);
		base.addBox(0F, 0F, 0F, 16, 5, 16);
		base.setRotationPoint(-8F, 19F, -8F);
		base.setTextureSize(128, 64);
		base.mirror = true;
		setRotation(base, 0F, 0F, 0F);
		tank2 = new ModelRenderer(this, 0, 21);
		tank2.mirror = true;
		tank2.addBox(0F, 0F, 0F, 6, 11, 6);
		tank2.setRotationPoint(1F, 8F, 1F);
		tank2.setTextureSize(128, 64);
		setRotation(tank2, 0F, 0F, 0F);
		portRight = new ModelRenderer(this, 0, 38);
		portRight.addBox(0F, 0F, 0F, 1, 8, 8);
		portRight.setRotationPoint(7.01F, 12F, -4F);
		portRight.setTextureSize(128, 64);
		portRight.mirror = true;
		setRotation(portRight, 0F, 0F, 0F);
		portBack = new ModelRenderer(this, 0, 54);
		portBack.addBox(0F, 0F, 0F, 8, 8, 1);
		portBack.setRotationPoint(-4F, 12F, 7.01F);
		portBack.setTextureSize(128, 64);
		portBack.mirror = true;
		setRotation(portBack, 0F, 0F, 0F);
		portLeft = new ModelRenderer(this, 0, 38);
		portLeft.addBox(0F, 0F, 0F, 1, 8, 8);
		portLeft.setRotationPoint(-8.01F, 12F, -4F);
		portLeft.setTextureSize(128, 64);
		portLeft.mirror = true;
		setRotation(portLeft, 0F, 0F, 0F);
		tank1 = new ModelRenderer(this, 0, 21);
		tank1.addBox(0F, 0F, 0F, 6, 11, 6);
		tank1.setRotationPoint(-7F, 8F, 1F);
		tank1.setTextureSize(128, 64);
		tank1.mirror = true;
		setRotation(tank1, 0F, 0F, 0F);
		portFront = new ModelRenderer(this, 18, 38);
		portFront.addBox(0F, 0F, 0F, 8, 8, 1);
		portFront.setRotationPoint(-4F, 12F, -8.01F);
		portFront.setTextureSize(128, 64);
		portFront.mirror = true;
		setRotation(portFront, 0F, 0F, 0F);
		tank3 = new ModelRenderer(this, 24, 21);
		tank3.addBox(0F, 0F, 0F, 12, 7, 7);
		tank3.setRotationPoint(-6F, 12F, -7F);
		tank3.setTextureSize(128, 64);
		tank3.mirror = true;
		setRotation(tank3, 0F, 0F, 0F);
		pipeAngle2 = new ModelRenderer(this, 18, 55);
		pipeAngle2.addBox(-5F, 0F, 0F, 5, 6, 3);
		pipeAngle2.setRotationPoint(5F, 13.01F, -2F);
		pipeAngle2.setTextureSize(128, 64);
		pipeAngle2.mirror = true;
		//TODO
		setRotation(pipeAngle2, 0F, 0.7853982F, 0F);
		connectorAngle = new ModelRenderer(this, 40, 45);
		connectorAngle.addBox(0F, 0F, 0F, 2, 8, 2);
		connectorAngle.setRotationPoint(-1F, 13F, 5F);
		connectorAngle.setTextureSize(128, 64);
		connectorAngle.mirror = true;
		//TODO
		setRotation(connectorAngle, -0.4886922F, 0F, 0F);
		pipe2 = new ModelRenderer(this, 40, 35);
		pipe2.addBox(0F, 0F, 0F, 1, 6, 4);
		pipe2.setRotationPoint(6F, 13F, -3F);
		pipe2.setTextureSize(128, 64);
		pipe2.mirror = true;
		setRotation(pipe2, 0F, 0F, 0F);
		connector = new ModelRenderer(this, 50, 35);
		connector.addBox(0F, 0F, 0F, 2, 6, 2);
		connector.setRotationPoint(-1F, 13F, 5F);
		connector.setTextureSize(128, 64);
		connector.mirror = true;
		setRotation(connector, 0F, 0F, 0F);
		compressor = new ModelRenderer(this, 18, 49);
		compressor.addBox(0F, 0F, 0F, 6, 3, 3);
		compressor.setRotationPoint(-3F, 8.5F, -2.5F);
		compressor.setTextureSize(128, 64);
		compressor.mirror = true;
		setRotation(compressor, 0F, 0F, 0F);
		tube10 = new ModelRenderer(this, 0, 14);
		tube10.addBox(0F, 0F, 0F, 2, 1, 1);
		tube10.setRotationPoint(-1F, 9F, 5F);
		tube10.setTextureSize(128, 64);
		tube10.mirror = true;
		setRotation(tube10, 0F, 0F, 0F);
		tube8 = new ModelRenderer(this, 0, 2);
		tube8.addBox(0F, 0F, 0F, 1, 1, 2);
		tube8.setRotationPoint(4F, 9.5F, -0.5F);
		tube8.setTextureSize(128, 64);
		tube8.mirror = true;
		setRotation(tube8, 0F, 0F, 0F);
		tube9 = new ModelRenderer(this, 0, 14);
		tube9.addBox(0F, 0F, 0F, 2, 1, 1);
		tube9.setRotationPoint(-1F, 9F, 2F);
		tube9.setTextureSize(128, 64);
		tube9.mirror = true;
		setRotation(tube9, 0F, 0F, 0F);
		tube7 = new ModelRenderer(this, 0, 0);
		tube7.addBox(0F, 0F, 0F, 2, 1, 1);
		tube7.setRotationPoint(3F, 9.5F, -1.5F);
		tube7.setTextureSize(128, 64);
		tube7.mirror = true;
		setRotation(tube7, 0F, 0F, 0F);
		tube6 = new ModelRenderer(this, 12, 13);
		tube6.addBox(0F, 0F, 0F, 1, 2, 1);
		tube6.setRotationPoint(1F, 10.5F, -4F);
		tube6.setTextureSize(128, 64);
		tube6.mirror = true;
		setRotation(tube6, 0F, 0F, 0F);
		tube5 = new ModelRenderer(this, 0, 2);
		tube5.addBox(0F, 0F, 0F, 1, 1, 2);
		tube5.setRotationPoint(1F, 9.5F, -4F);
		tube5.setTextureSize(128, 64);
		tube5.mirror = true;
		setRotation(tube5, 0F, 0F, 0F);
		tube4 = new ModelRenderer(this, 0, 2);
		tube4.addBox(0F, 0F, 0F, 1, 1, 2);
		tube4.setRotationPoint(-2F, 9.5F, -4F);
		tube4.setTextureSize(128, 64);
		tube4.mirror = true;
		setRotation(tube4, 0F, 0F, 0F);
		tube3 = new ModelRenderer(this, 12, 13);
		tube3.addBox(0F, 0F, 0F, 1, 2, 1);
		tube3.setRotationPoint(-2F, 10.5F, -4F);
		tube3.setTextureSize(128, 64);
		tube3.mirror = true;
		setRotation(tube3, 0F, 0F, 0F);
		tube2 = new ModelRenderer(this, 0, 0);
		tube2.addBox(0F, 0F, 0F, 2, 1, 1);
		tube2.setRotationPoint(-5F, 9.5F, -1.5F);
		tube2.setTextureSize(128, 64);
		tube2.mirror = true;
		setRotation(tube2, 0F, 0F, 0F);
		tube1 = new ModelRenderer(this, 0, 2);
		tube1.addBox(0F, 0F, 0F, 1, 1, 2);
		tube1.setRotationPoint(-5F, 9.5F, -0.5F);
		tube1.setTextureSize(128, 64);
		tube1.mirror = true;
		setRotation(tube1, 0F, 0F, 0F);
		pipe1 = new ModelRenderer(this, 40, 35);
		pipe1.addBox(0F, 0F, 0F, 1, 6, 4);
		pipe1.setRotationPoint(-7F, 13F, -3F);
		pipe1.setTextureSize(128, 64);
		pipe1.mirror = true;
		setRotation(pipe1, 0F, 0F, 0F);
		pipeAngle1 = new ModelRenderer(this, 18, 55);
		pipeAngle1.addBox(0F, 0F, 0F, 5, 6, 3);
		pipeAngle1.setRotationPoint(-5F, 13.01F, -2F);
		pipeAngle1.setTextureSize(128, 64);
		pipeAngle1.mirror = true;
		//TODO
		setRotation(pipeAngle1, 0F, -0.7853982F, 0F);
		exhaust4 = new ModelRenderer(this, 0, 9);
		exhaust4.addBox(0F, 0F, 0F, 1, 1, 1);
		exhaust4.setRotationPoint(-1.33F, 11.5F, -6.2F);
		exhaust4.setTextureSize(128, 64);
		exhaust4.mirror = true;
		//TODO
		setRotation(exhaust4, 0.3490659F, 0F, 0F);
		exhaust3 = new ModelRenderer(this, 0, 9);
		exhaust3.addBox(0F, 0F, 0F, 1, 1, 1);
		exhaust3.setRotationPoint(-3F, 11.5F, -6.2F);
		exhaust3.setTextureSize(128, 64);
		exhaust3.mirror = true;
		//TODO
		setRotation(exhaust3, 0.3490659F, 0F, 0F);
		exhaust2 = new ModelRenderer(this, 0, 9);
		exhaust2.addBox(0F, 0F, 0F, 1, 1, 1);
		exhaust2.setRotationPoint(2F, 11.5F, -6.2F);
		exhaust2.setTextureSize(128, 64);
		exhaust2.mirror = true;
		//TODO
		setRotation(exhaust2, 0.3490659F, 0F, 0F);
		exhaust1 = new ModelRenderer(this, 0, 9);
		exhaust1.addBox(0F, 0F, 0F, 1, 1, 1);
		exhaust1.setRotationPoint(0.33F, 11.5F, -6.2F);
		exhaust1.setTextureSize(128, 64);
		exhaust1.mirror = true;
		//TODO
		setRotation(exhaust1, 0.3490659F, 0F, 0F);
	}

	public void render(float size)
	{
		base.render(size);
		tank2.render(size);
		portRight.render(size);
		portBack.render(size);
		portLeft.render(size);
		tank1.render(size);
		portFront.render(size);
		tank3.render(size);
		pipeAngle2.render(size);
		connectorAngle.render(size);
		pipe2.render(size);
		connector.render(size);
		compressor.render(size);
		tube10.render(size);
		tube8.render(size);
		tube9.render(size);
		tube7.render(size);
		tube6.render(size);
		tube5.render(size);
		tube4.render(size);
		tube3.render(size);
		tube2.render(size);
		tube1.render(size);
		pipe1.render(size);
		pipeAngle1.render(size);
		exhaust4.render(size);
		exhaust3.render(size);
		exhaust2.render(size);
		exhaust1.render(size);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z)
	{
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}
}
