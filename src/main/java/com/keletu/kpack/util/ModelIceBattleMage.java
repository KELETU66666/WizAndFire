package com.keletu.kpack.util;

import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelIceBattleMage extends ModelArmorStandFixed {
	private final ModelRenderer helmet;
	private final ModelRenderer head8_r1;
	private final ModelRenderer head7_r1;
	private final ModelRenderer head5_r1;
	private final ModelRenderer head6_r1;
	private final ModelRenderer head7_r2;
	private final ModelRenderer head8_r2;
	private final ModelRenderer head6_r2;
	private final ModelRenderer head7_r3;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer head4_r1;
	private final ModelRenderer armr;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer ShoulderR_r1;
	private final ModelRenderer arml;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
	private final ModelRenderer cube_r13;
	private final ModelRenderer cube_r14;
	private final ModelRenderer ShoulderR_r2;
	private final ModelRenderer torso;
	private final ModelRenderer legl;
	private final ModelRenderer ll4_r1;
	private final ModelRenderer ll3_r1;
	private final ModelRenderer ll3_r2;
	private final ModelRenderer ll2_r1;
	private final ModelRenderer ll2_r2;
	private final ModelRenderer ll1_r1;
	private final ModelRenderer legr;
	private final ModelRenderer lr6_r1;
	private final ModelRenderer lr5_r1;
	private final ModelRenderer lr4_r1;
	private final ModelRenderer lr3_r1;
	private final ModelRenderer lr2_r1;
	private final ModelRenderer lr1_r1;
	private final ModelRenderer bootl;
	private final ModelRenderer bootr;

	public ModelIceBattleMage(boolean legs) {
		textureWidth = 128;
		textureHeight = 64;

		helmet = new ModelRenderer(this);
		helmet.setRotationPoint(0.0F, -2.0F, -6.5F);
		helmet.cubeList.add(new ModelBox(helmet, 92, 37, -4.5F, -6.5F, 2.0F, 9, 9, 9, 0.0F, false));
		helmet.cubeList.add(new ModelBox(helmet, 0, 8, -3.5F, -5.5F, -1.5F, 7, 3, 4, 0.0F, false));

		head8_r1 = new ModelRenderer(this);
		head8_r1.setRotationPoint(-4.4F, 0.2F, 11.2F);
		helmet.addChild(head8_r1);
		setRotationAngle(head8_r1, -0.3491F, -0.3054F, 0.0F);
		head8_r1.cubeList.add(new ModelBox(head8_r1, 0, 0, -1.0F, -1.0F, -2.5F, 2, 2, 6, 0.0F, true));

		head7_r1 = new ModelRenderer(this);
		head7_r1.setRotationPoint(4.4F, 0.2F, 12.2F);
		helmet.addChild(head7_r1);
		setRotationAngle(head7_r1, -0.3491F, 0.3054F, 0.0F);
		head7_r1.cubeList.add(new ModelBox(head7_r1, 46, 0, -1.0F, -1.0F, -2.5F, 2, 2, 6, 0.0F, false));

		head5_r1 = new ModelRenderer(this);
		head5_r1.setRotationPoint(4.0F, -5.6F, 11.0F);
		helmet.addChild(head5_r1);
		setRotationAngle(head5_r1, 0.3289F, 0.3736F, 0.1239F);
		head5_r1.cubeList.add(new ModelBox(head5_r1, 30, 0, -1.5F, -1.5F, -2.5F, 3, 3, 5, 0.0F, false));

		head6_r1 = new ModelRenderer(this);
		head6_r1.setRotationPoint(6.1F, -6.8F, 15.2F);
		helmet.addChild(head6_r1);
		setRotationAngle(head6_r1, 0.294F, 0.3736F, 0.1239F);
		head6_r1.cubeList.add(new ModelBox(head6_r1, 22, 8, -1.5F, -1.5F, -2.5F, 2, 2, 5, 0.0F, false));

		head7_r2 = new ModelRenderer(this);
		head7_r2.setRotationPoint(1.4F, -6.2769F, 12.0496F);
		helmet.addChild(head7_r2);
		setRotationAngle(head7_r2, 0.3079F, 0.1248F, 0.0396F);
		head7_r2.cubeList.add(new ModelBox(head7_r2, 22, 8, -1.0F, -1.0F, -2.5F, 2, 2, 5, 0.0F, false));

		head8_r2 = new ModelRenderer(this);
		head8_r2.setRotationPoint(-1.4F, -6.2769F, 12.0496F);
		helmet.addChild(head8_r2);
		setRotationAngle(head8_r2, 0.3079F, -0.1248F, -0.0396F);
		head8_r2.cubeList.add(new ModelBox(head8_r2, 22, 8, -1.0F, -1.0F, -2.5F, 2, 2, 5, 0.0F, true));

		head6_r2 = new ModelRenderer(this);
		head6_r2.setRotationPoint(-4.0F, -5.6F, 11.0F);
		helmet.addChild(head6_r2);
		setRotationAngle(head6_r2, 0.3289F, -0.3736F, -0.1239F);
		head6_r2.cubeList.add(new ModelBox(head6_r2, 30, 0, -1.5F, -1.5F, -2.5F, 3, 3, 5, 0.0F, true));

		head7_r3 = new ModelRenderer(this);
		head7_r3.setRotationPoint(-6.1F, -6.8F, 15.2F);
		helmet.addChild(head7_r3);
		setRotationAngle(head7_r3, 0.294F, -0.3736F, -0.1239F);
		head7_r3.cubeList.add(new ModelBox(head7_r3, 16, 1, -0.5F, -1.5F, -2.5F, 2, 2, 5, 0.0F, true));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(5.0F, -2.5F, 10.5F);
		helmet.addChild(cube_r1);
		setRotationAngle(cube_r1, -1.0472F, 0.0F, 1.3526F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 32, 18, -0.5F, -2.0F, -0.5F, 1, 4, 1, 0.0F, true));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(3.0F, -7.5F, 6.5F);
		helmet.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.7021F, 0.031F, -0.0668F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 32, 18, -0.5F, -2.0F, -0.5F, 1, 4, 1, 0.0F, true));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(1.0F, -7.5F, 9.5F);
		helmet.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.685F, 0.1708F, 0.1016F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 32, 18, -0.5F, -2.0F, -0.5F, 1, 4, 1, 0.0F, true));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-1.0F, -7.5F, 9.5F);
		helmet.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.685F, -0.1708F, -0.1016F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 32, 18, -0.5F, -2.0F, -0.5F, 1, 4, 1, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-5.0F, -2.5F, 10.5F);
		helmet.addChild(cube_r5);
		setRotationAngle(cube_r5, -1.0472F, 0.0F, -1.3526F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 32, 18, -0.5F, -2.0F, -0.5F, 1, 4, 1, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-3.0F, -7.5F, 6.5F);
		helmet.addChild(cube_r6);
		setRotationAngle(cube_r6, -0.7021F, -0.031F, 0.0668F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 32, 18, -0.5F, -2.0F, -0.5F, 1, 4, 1, 0.0F, false));

		head4_r1 = new ModelRenderer(this);
		head4_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		helmet.addChild(head4_r1);
		setRotationAngle(head4_r1, -0.1309F, 0.0F, 0.0F);
		head4_r1.cubeList.add(new ModelBox(head4_r1, 42, 10, -3.5F, -1.5F, -1.5F, 7, 3, 4, 0.0F, false));

		armr = new ModelRenderer(this);
		armr.setRotationPoint(5F, 22F, 0.0F);
		armr.cubeList.add(new ModelBox(armr, 0, 15, -8.5F, -24.5F, -2.5F, 5, 12, 5, 0.0F, false));
		armr.cubeList.add(new ModelBox(armr, 56, 46, -8.9F, -19.5F, -3.0F, 2, 6, 6, 0.0F, false));
		armr.cubeList.add(new ModelBox(armr, 34, 36, -6.9F, -18.5F, -3.0F, 4, 1, 6, 0.0F, false));
		armr.cubeList.add(new ModelBox(armr, 34, 36, -6.9F, -15.5F, -3.0F, 4, 1, 6, 0.0F, false));
		armr.cubeList.add(new ModelBox(armr, 16, 36, -8.2F, -14.4F, -2.2F, 4, 2, 4, 0.0F, true));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-9.5F, -14.5F, 1.9F);
		armr.addChild(cube_r7);
		setRotationAngle(cube_r7, -1.5708F, -0.7418F, 0.0F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 32, 18, -0.5F, -2.0F, -0.5F, 1, 4, 1, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-9.5F, -16.0F, 3.3F);
		armr.addChild(cube_r8);
		setRotationAngle(cube_r8, -1.4835F, -0.48F, 0.0F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 32, 18, -0.5F, -2.0F, -0.5F, 1, 4, 1, 0.0F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-8.8F, -17.5F, 3.3F);
		armr.addChild(cube_r9);
		setRotationAngle(cube_r9, -1.2654F, -0.1745F, 0.0F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 32, 18, -0.5F, -2.0F, -0.5F, 1, 4, 1, 0.0F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-7.7F, -18.5F, 3.0F);
		armr.addChild(cube_r10);
		setRotationAngle(cube_r10, -1.2654F, 0.0F, 0.0F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 32, 18, -0.5F, -2.0F, -0.5F, 1, 4, 1, 0.0F, false));

		ShoulderR_r1 = new ModelRenderer(this);
		ShoulderR_r1.setRotationPoint(-6.5F, -23.2F, 0.0F);
		armr.addChild(ShoulderR_r1);
		setRotationAngle(ShoulderR_r1, 0.0F, 0.0F, -0.1745F);
		ShoulderR_r1.cubeList.add(new ModelBox(ShoulderR_r1, 66, 41, -3.0F, -2.5F, -3.0F, 6, 5, 6, 0.0F, false));

		arml = new ModelRenderer(this);
		arml.setRotationPoint(-5F, 22F, 0.0F);
		arml.cubeList.add(new ModelBox(arml, 34, 36, 2.9F, -18.5F, -3.0F, 4, 1, 6, 0.0F, true));
		arml.cubeList.add(new ModelBox(arml, 56, 46, 6.9F, -19.5F, -3.0F, 2, 6, 6, 0.0F, true));
		arml.cubeList.add(new ModelBox(arml, 34, 36, 2.9F, -15.5F, -3.0F, 4, 1, 6, 0.0F, true));
		arml.cubeList.add(new ModelBox(arml, 0, 15, 3.5F, -24.5F, -2.5F, 5, 12, 5, 0.0F, true));
		arml.cubeList.add(new ModelBox(arml, 16, 36, 3.7F, -14.4F, -2.2F, 4, 2, 4, 0.0F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(7.7F, -18.5F, 3.0F);
		arml.addChild(cube_r11);
		setRotationAngle(cube_r11, -1.2654F, 0.0F, 0.0F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 32, 18, -0.5F, -2.0F, -0.5F, 1, 4, 1, 0.0F, true));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(9.5F, -14.5F, 1.9F);
		arml.addChild(cube_r12);
		setRotationAngle(cube_r12, -1.5708F, 0.7418F, 0.0F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 32, 18, -0.5F, -2.0F, -0.5F, 1, 4, 1, 0.0F, true));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(9.5F, -16.0F, 3.3F);
		arml.addChild(cube_r13);
		setRotationAngle(cube_r13, -1.4835F, 0.48F, 0.0F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 32, 18, -0.5F, -2.0F, -0.5F, 1, 4, 1, 0.0F, true));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(8.8F, -17.5F, 3.3F);
		arml.addChild(cube_r14);
		setRotationAngle(cube_r14, -1.2654F, 0.1745F, 0.0F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 32, 18, -0.5F, -2.0F, -0.5F, 1, 4, 1, 0.0F, true));

		ShoulderR_r2 = new ModelRenderer(this);
		ShoulderR_r2.setRotationPoint(6.5F, -23.2F, 0.0F);
		arml.addChild(ShoulderR_r2);
		setRotationAngle(ShoulderR_r2, 0.0F, 0.0F, 0.1745F);
		ShoulderR_r2.cubeList.add(new ModelBox(ShoulderR_r2, 66, 41, -3.0F, -2.5F, -3.0F, 6, 5, 6, 0.0F, true));

		torso = new ModelRenderer(this);
		torso.setRotationPoint(0.0F, 24.0F, 0.0F);
		torso.cubeList.add(new ModelBox(torso, 0, 51, -4.0F, -24.0F, -3.0F, 8, 12, 1, 0.0F, true));
		torso.cubeList.add(new ModelBox(torso, 0, 39, -2.0F, -24.0F, -4.4F, 4, 7, 1, 0.0F, true));
		torso.cubeList.add(new ModelBox(torso, 21, 51, -4.0F, -24.0F, 2.0F, 8, 12, 1, 0.0F, true));
		torso.cubeList.add(new ModelBox(torso, 41, 47, 3.1F, -24.1F, -2.5F, 1, 12, 5, 0.0F, true));
		torso.cubeList.add(new ModelBox(torso, 41, 47, -4.1F, -24.1F, -2.5F, 1, 12, 5, 0.0F, true));
		torso.cubeList.add(new ModelBox(torso, 78, 37, -4.0F, -23.0F, -3.8F, 8, 7, 2, 0.0F, false));
		torso.cubeList.add(new ModelBox(torso, 108, 24, -4.0F, -24.0F, 2.0F, 8, 11, 2, 0.0F, false));

		legl = new ModelRenderer(this);
		legl.setRotationPoint(-1.9F, 4.0F, -2.7F);
		legl.cubeList.add(new ModelBox(legl, 108, 11, -0.5F, -3.9F, -0.1F, 5, 8, 5, 0.0F, true));

		ll4_r1 = new ModelRenderer(this);
		ll4_r1.setRotationPoint(3.33F, 16.2873F, 1.2F);
		legl.addChild(ll4_r1);
		setRotationAngle(ll4_r1, 0.0F, 0.0F, -0.1309F);
		ll4_r1.cubeList.add(new ModelBox(ll4_r1, 62, 25, 2.5F, -15.5F, -1.0F, 1, 3, 5, 0.0F, false));

		ll3_r1 = new ModelRenderer(this);
		ll3_r1.setRotationPoint(2.0F, 17.2F, 1.2F);
		legl.addChild(ll3_r1);
		setRotationAngle(ll3_r1, 0.0F, 0.0F, -0.0436F);
		ll3_r1.cubeList.add(new ModelBox(ll3_r1, 62, 12, 2.5F, -21.5F, -1.0F, 1, 5, 5, 0.0F, false));

		ll3_r2 = new ModelRenderer(this);
		ll3_r2.setRotationPoint(2.0F, 17.2408F, 5.9666F);
		legl.addChild(ll3_r2);
		setRotationAngle(ll3_r2, 0.2182F, 0.0F, 0.0F);
		ll3_r2.cubeList.add(new ModelBox(ll3_r2, 53, 27, -1.0F, -15.5F, 2.5F, 3, 3, 1, 0.0F, false));

		ll2_r1 = new ModelRenderer(this);
		ll2_r1.setRotationPoint(0.0F, 0.0F, 5.4F);
		legl.addChild(ll2_r1);
		setRotationAngle(ll2_r1, 0.0873F, 0.0F, 0.0F);
		ll2_r1.cubeList.add(new ModelBox(ll2_r1, 53, 17, 1.0F, -4.5F, -0.5F, 3, 6, 1, 0.0F, false));

		ll2_r2 = new ModelRenderer(this);
		ll2_r2.setRotationPoint(2.0F, 17.2408F, -0.5666F);
		legl.addChild(ll2_r2);
		setRotationAngle(ll2_r2, -0.2182F, 0.0F, 0.0F);
		ll2_r2.cubeList.add(new ModelBox(ll2_r2, 43, 27, -1.0F, -15.5F, -3.5F, 3, 3, 1, 0.0F, false));

		ll1_r1 = new ModelRenderer(this);
		ll1_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		legl.addChild(ll1_r1);
		setRotationAngle(ll1_r1, -0.0873F, 0.0F, 0.0F);
		ll1_r1.cubeList.add(new ModelBox(ll1_r1, 43, 17, 1.0F, -4.5F, -0.5F, 3, 6, 1, 0.0F, false));

		legr = new ModelRenderer(this);
		legr.setRotationPoint(1.9F, 4.0F, -2.7F);
		legr.cubeList.add(new ModelBox(legr, 108, 11, -4.5F, -3.9F, -0.1F, 5, 8, 5, 0.0F, false));

		lr6_r1 = new ModelRenderer(this);
		lr6_r1.setRotationPoint(-3.33F, 16.2873F, 1.2F);
		legr.addChild(lr6_r1);
		setRotationAngle(lr6_r1, 0.0F, 0.0F, 0.1309F);
		lr6_r1.cubeList.add(new ModelBox(lr6_r1, 96, 22, -3.5F, -15.5F, -1.0F, 1, 3, 5, 0.0F, true));

		lr5_r1 = new ModelRenderer(this);
		lr5_r1.setRotationPoint(-2.0F, 17.2F, 1.2F);
		legr.addChild(lr5_r1);
		setRotationAngle(lr5_r1, 0.0F, 0.0F, 0.0436F);
		lr5_r1.cubeList.add(new ModelBox(lr5_r1, 96, 9, -3.5F, -21.5F, -1.0F, 1, 5, 5, 0.0F, true));

		lr4_r1 = new ModelRenderer(this);
		lr4_r1.setRotationPoint(-2.0F, 17.2408F, 5.9666F);
		legr.addChild(lr4_r1);
		setRotationAngle(lr4_r1, 0.2182F, 0.0F, 0.0F);
		lr4_r1.cubeList.add(new ModelBox(lr4_r1, 86, 27, -2.0F, -15.5F, 2.5F, 3, 3, 1, 0.0F, true));

		lr3_r1 = new ModelRenderer(this);
		lr3_r1.setRotationPoint(0.0F, 0.0F, 5.4F);
		legr.addChild(lr3_r1);
		setRotationAngle(lr3_r1, 0.0873F, 0.0F, 0.0F);
		lr3_r1.cubeList.add(new ModelBox(lr3_r1, 86, 17, -4.0F, -4.5F, -0.5F, 3, 6, 1, 0.0F, true));

		lr2_r1 = new ModelRenderer(this);
		lr2_r1.setRotationPoint(-2.0F, 17.2408F, -0.5666F);
		legr.addChild(lr2_r1);
		setRotationAngle(lr2_r1, -0.2182F, 0.0F, 0.0F);
		lr2_r1.cubeList.add(new ModelBox(lr2_r1, 76, 27, -2.0F, -15.5F, -3.5F, 3, 3, 1, 0.0F, true));

		lr1_r1 = new ModelRenderer(this);
		lr1_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		legr.addChild(lr1_r1);
		setRotationAngle(lr1_r1, -0.0873F, 0.0F, 0.0F);
		lr1_r1.cubeList.add(new ModelBox(lr1_r1, 76, 17, -4.0F, -4.5F, -0.5F, 3, 6, 1, 0.0F, true));

		bootl = new ModelRenderer(this);
		bootl.setRotationPoint(-1.5F, 12.0F, 0.0F);
		bootl.cubeList.add(new ModelBox(bootl, 86, 55, -0.5F, -3.9F, -2.8F, 5, 4, 5, 0.0F, true));

		bootr = new ModelRenderer(this);
		bootr.setRotationPoint(1.5F, 12.0F, 0.0F);
		bootr.cubeList.add(new ModelBox(bootr, 86, 55, -4.5F, -3.9F, -2.8F, 5, 4, 5, 0.0F, false));

		bipedHeadwear.cubeList.clear();
		bipedHead.cubeList.clear();
		bipedHead.addChild(helmet);

		bipedLeftArm.cubeList.clear();
		bipedLeftArm.addChild(arml);

		bipedRightArm.cubeList.clear();
		bipedRightArm.addChild(armr);

		bipedBody.cubeList.clear();
		bipedLeftLeg.cubeList.clear();
		bipedRightLeg.cubeList.clear();

		if (legs) {
			bipedLeftLeg.addChild(legl);
			bipedRightLeg.addChild(legr);
		} else {
			bipedBody.addChild(torso);

			bipedLeftLeg.addChild(bootl);
			bipedRightLeg.addChild(bootr);
		}
	}


	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}