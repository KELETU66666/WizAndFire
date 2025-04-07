package com.keletu.kpack.util;

import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelIceMageArmor extends ModelArmorStandFixed {
    private final ModelRenderer cowl;
    private final ModelRenderer head4_r1;
    private final ModelRenderer head4_r2;
    private final ModelRenderer head3_r1;
    private final ModelRenderer head5_r1;
    private final ModelRenderer head4_r3;
    private final ModelRenderer head4_r4;
    private final ModelRenderer head3_r2;
    private final ModelRenderer head2_r1;
    private final ModelRenderer head5_r2;
    private final ModelRenderer head4_r5;
    private final ModelRenderer head3_r3;
    private final ModelRenderer head4_r6;
    private final ModelRenderer head2_r2;
    private final ModelRenderer armr;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer arml;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer cube_r8;
    private final ModelRenderer torso;
    private final ModelRenderer legl;
    private final ModelRenderer Scroll5_r1;
    private final ModelRenderer Scroll4_r1;
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

    public ModelIceMageArmor(boolean legs) {
        textureWidth = 128;
        textureHeight = 64;

        cowl = new ModelRenderer(this);
        cowl.setRotationPoint(0.0F, -2.0F, -6.5F);
        cowl.cubeList.add(new ModelBox(cowl, 0, 0, -3.5F, -6.9F, 1.5F, 7, 2, 2, 0.0F, false));
        cowl.cubeList.add(new ModelBox(cowl, 0, 8, -3.5F, -5.5F, -1.5F, 7, 3, 4, 0.0F, false));
        cowl.cubeList.add(new ModelBox(cowl, 22, 10, -4.5F, -5.5F, 2.0F, 9, 7, 1, 0.0F, false));

        head4_r1 = new ModelRenderer(this);
        head4_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        cowl.addChild(head4_r1);
        setRotationAngle(head4_r1, -0.1309F, 0.0F, 0.0F);
        head4_r1.cubeList.add(new ModelBox(head4_r1, 42, 10, -3.5F, -1.5F, -1.5F, 7, 3, 4, 0.0F, false));

        head4_r2 = new ModelRenderer(this);
        head4_r2.setRotationPoint(0.0F, -1.0F, 9.2F);
        cowl.addChild(head4_r2);
        setRotationAngle(head4_r2, -1.0036F, 0.0F, 0.0F);
        head4_r2.cubeList.add(new ModelBox(head4_r2, 0, 4, -4.48F, -1.0F, 3.0F, 9, 3, 1, 0.0F, false));

        head3_r1 = new ModelRenderer(this);
        head3_r1.setRotationPoint(0.0F, -4.9F, 7.6F);
        cowl.addChild(head3_r1);
        setRotationAngle(head3_r1, 0.0873F, 0.0F, 0.0F);
        head3_r1.cubeList.add(new ModelBox(head3_r1, 90, 0, -4.5F, -1.0F, 3.0F, 9, 8, 1, 0.0F, false));

        head5_r1 = new ModelRenderer(this);
        head5_r1.setRotationPoint(-2.6F, 5.6971F, 7.2691F);
        cowl.addChild(head5_r1);
        setRotationAngle(head5_r1, -0.0873F, 0.0F, -0.6109F);
        head5_r1.cubeList.add(new ModelBox(head5_r1, 64, 0, -0.5F, -4.0F, -4.0F, 1, 2, 6, 0.0F, true));

        head4_r3 = new ModelRenderer(this);
        head4_r3.setRotationPoint(-4.4F, -2.4029F, 7.2691F);
        cowl.addChild(head4_r3);
        setRotationAngle(head4_r3, -0.0436F, 0.0F, 0.0873F);
        head4_r3.cubeList.add(new ModelBox(head4_r3, 72, 0, -0.5F, -4.0F, -4.0F, 1, 9, 8, 0.0F, true));

        head4_r4 = new ModelRenderer(this);
        head4_r4.setRotationPoint(2.6F, 5.6971F, 7.2691F);
        cowl.addChild(head4_r4);
        setRotationAngle(head4_r4, -0.0873F, 0.0F, 0.6109F);
        head4_r4.cubeList.add(new ModelBox(head4_r4, 64, 0, -0.5F, -4.0F, -4.0F, 1, 2, 6, 0.0F, false));

        head3_r2 = new ModelRenderer(this);
        head3_r2.setRotationPoint(4.4F, -2.4029F, 7.2691F);
        cowl.addChild(head3_r2);
        setRotationAngle(head3_r2, -0.0436F, 0.0F, -0.0873F);
        head3_r2.cubeList.add(new ModelBox(head3_r2, 72, 0, -0.5F, -4.0F, -4.0F, 1, 9, 8, 0.0F, false));

        head2_r1 = new ModelRenderer(this);
        head2_r1.setRotationPoint(0.0F, -5.5F, 7.4F);
        cowl.addChild(head2_r1);
        setRotationAngle(head2_r1, -0.0436F, 0.0F, 0.0F);
        head2_r1.cubeList.add(new ModelBox(head2_r1, 38, 0, -4.5F, -1.0F, -4.0F, 9, 2, 8, 0.0F, false));

        head5_r2 = new ModelRenderer(this);
        head5_r2.setRotationPoint(-3.3893F, 2.0516F, 3.0F);
        cowl.addChild(head5_r2);
        setRotationAngle(head5_r2, 0.0436F, 0.0F, -0.7854F);
        head5_r2.cubeList.add(new ModelBox(head5_r2, 38, 0, -1.0F, -2.5F, -1.0F, 2, 4, 2, 0.0F, true));

        head4_r5 = new ModelRenderer(this);
        head4_r5.setRotationPoint(-3.8893F, -2.7484F, 2.7F);
        cowl.addChild(head4_r5);
        setRotationAngle(head4_r5, 0.0436F, 0.0F, 0.0F);
        head4_r5.cubeList.add(new ModelBox(head4_r5, 30, 0, -2.0F, -1.0F, -1.0F, 2, 5, 2, 0.0F, true));
        head4_r5.cubeList.add(new ModelBox(head4_r5, 30, 0, 7.7786F, -1.0F, -1.0F, 2, 5, 2, 0.0F, false));

        head3_r3 = new ModelRenderer(this);
        head3_r3.setRotationPoint(-3.8893F, -4.7484F, 2.6F);
        cowl.addChild(head3_r3);
        setRotationAngle(head3_r3, 0.0436F, 0.0F, -0.9163F);
        head3_r3.cubeList.add(new ModelBox(head3_r3, 18, 0, -2.0F, -1.0F, -1.0F, 4, 2, 2, 0.0F, true));

        head4_r6 = new ModelRenderer(this);
        head4_r6.setRotationPoint(3.3893F, 2.0516F, 3.0F);
        cowl.addChild(head4_r6);
        setRotationAngle(head4_r6, 0.0436F, 0.0F, 0.7854F);
        head4_r6.cubeList.add(new ModelBox(head4_r6, 38, 0, -1.0F, -2.5F, -1.0F, 2, 4, 2, 0.0F, false));

        head2_r2 = new ModelRenderer(this);
        head2_r2.setRotationPoint(3.8893F, -4.7484F, 2.6F);
        cowl.addChild(head2_r2);
        setRotationAngle(head2_r2, 0.0436F, 0.0F, 0.9163F);
        head2_r2.cubeList.add(new ModelBox(head2_r2, 18, 0, -2.0F, -1.0F, -1.0F, 4, 2, 2, 0.0F, false));

        armr = new ModelRenderer(this);
        armr.setRotationPoint(5F, 22F, 0.0F);
        armr.cubeList.add(new ModelBox(armr, 0, 15, -8.5F, -24.5F, -2.5F, 5, 12, 5, 0.0F, false));
        armr.cubeList.add(new ModelBox(armr, 20, 18, -8.5F, -17.5F, 2.5F, 5, 5, 1, 0.0F, false));

        cube_r1 = new ModelRenderer(this);
        cube_r1.setRotationPoint(-8.5F, -17.5F, 2.9F);
        armr.addChild(cube_r1);
        setRotationAngle(cube_r1, -1.5708F, -0.7418F, 0.0F);
        cube_r1.cubeList.add(new ModelBox(cube_r1, 32, 18, -0.5F, -2.0F, -0.5F, 1, 4, 1, 0.0F, false));

        cube_r2 = new ModelRenderer(this);
        cube_r2.setRotationPoint(-7.9F, -19.5F, 3.3F);
        armr.addChild(cube_r2);
        setRotationAngle(cube_r2, -1.4835F, -0.48F, 0.0F);
        cube_r2.cubeList.add(new ModelBox(cube_r2, 32, 18, -0.5F, -2.0F, -0.5F, 1, 4, 1, 0.0F, false));

        cube_r3 = new ModelRenderer(this);
        cube_r3.setRotationPoint(-7.5F, -21.5F, 3.3F);
        armr.addChild(cube_r3);
        setRotationAngle(cube_r3, -1.2654F, -0.1745F, 0.0F);
        cube_r3.cubeList.add(new ModelBox(cube_r3, 32, 18, -0.5F, -2.0F, -0.5F, 1, 4, 1, 0.0F, false));

        cube_r4 = new ModelRenderer(this);
        cube_r4.setRotationPoint(-7.0F, -23.5F, 3.0F);
        armr.addChild(cube_r4);
        setRotationAngle(cube_r4, -1.2654F, 0.0F, 0.0F);
        cube_r4.cubeList.add(new ModelBox(cube_r4, 32, 18, -0.5F, -2.0F, -0.5F, 1, 4, 1, 0.0F, false));

        arml = new ModelRenderer(this);
        arml.setRotationPoint(-5F, 22F, 0.0F);
        arml.cubeList.add(new ModelBox(arml, 0, 15, 3.5F, -24.5F, -2.5F, 5, 12, 5, 0.0F, true));
        arml.cubeList.add(new ModelBox(arml, 20, 18, 3.5F, -17.5F, 2.5F, 5, 5, 1, 0.0F, true));

        cube_r5 = new ModelRenderer(this);
        cube_r5.setRotationPoint(8.5F, -17.5F, 2.9F);
        arml.addChild(cube_r5);
        setRotationAngle(cube_r5, -1.5708F, 0.7418F, 0.0F);
        cube_r5.cubeList.add(new ModelBox(cube_r5, 32, 18, -0.5F, -2.0F, -0.5F, 1, 4, 1, 0.0F, true));

        cube_r6 = new ModelRenderer(this);
        cube_r6.setRotationPoint(7.9F, -19.5F, 3.3F);
        arml.addChild(cube_r6);
        setRotationAngle(cube_r6, -1.4835F, 0.48F, 0.0F);
        cube_r6.cubeList.add(new ModelBox(cube_r6, 32, 18, -0.5F, -2.0F, -0.5F, 1, 4, 1, 0.0F, true));

        cube_r7 = new ModelRenderer(this);
        cube_r7.setRotationPoint(7.5F, -21.5F, 3.3F);
        arml.addChild(cube_r7);
        setRotationAngle(cube_r7, -1.2654F, 0.1745F, 0.0F);
        cube_r7.cubeList.add(new ModelBox(cube_r7, 32, 18, -0.5F, -2.0F, -0.5F, 1, 4, 1, 0.0F, true));

        cube_r8 = new ModelRenderer(this);
        cube_r8.setRotationPoint(7.0F, -23.5F, 3.0F);
        arml.addChild(cube_r8);
        setRotationAngle(cube_r8, -1.2654F, 0.0F, 0.0F);
        cube_r8.cubeList.add(new ModelBox(cube_r8, 32, 18, -0.5F, -2.0F, -0.5F, 1, 4, 1, 0.0F, true));

        torso = new ModelRenderer(this);
        torso.setRotationPoint(0.0F, 24.0F, 0.0F);
        torso.cubeList.add(new ModelBox(torso, 0, 51, -4.0F, -24.0F, -3.0F, 8, 12, 1, 0.0F, true));
        torso.cubeList.add(new ModelBox(torso, 0, 39, -2.0F, -24.0F, -4.0F, 4, 7, 1, 0.0F, true));
        torso.cubeList.add(new ModelBox(torso, 21, 51, -4.0F, -24.0F, 2.0F, 8, 12, 1, 0.0F, true));
        torso.cubeList.add(new ModelBox(torso, 41, 47, 3.1F, -24.1F, -2.5F, 1, 12, 5, 0.0F, true));
        torso.cubeList.add(new ModelBox(torso, 41, 47, -4.1F, -24.1F, -2.5F, 1, 12, 5, 0.0F, true));

        legl = new ModelRenderer(this);
        legl.setRotationPoint(-1.9F, 4.0F, -2.7F);

        Scroll5_r1 = new ModelRenderer(this);
        Scroll5_r1.setRotationPoint(11.1F, 13.2F, -0.9F);
        legl.addChild(Scroll5_r1);
        setRotationAngle(Scroll5_r1, -0.2618F, 0.0F, -0.1309F);
        Scroll5_r1.cubeList.add(new ModelBox(Scroll5_r1, 106, 53, -5.0F, -14.0F, -4.0F, 3, 3, 8, 0.0F, true));

        Scroll4_r1 = new ModelRenderer(this);
        Scroll4_r1.setRotationPoint(9.4F, 10.0F, -1.8F);
        legl.addChild(Scroll4_r1);
        setRotationAngle(Scroll4_r1, -0.3491F, 0.0F, 0.0F);
        Scroll4_r1.cubeList.add(new ModelBox(Scroll4_r1, 106, 53, -5.0F, -14.0F, -4.0F, 3, 3, 8, 0.0F, true));

        ll4_r1 = new ModelRenderer(this);
        ll4_r1.setRotationPoint(3.5F, 19.3F, 1.2F);
        legl.addChild(ll4_r1);
        setRotationAngle(ll4_r1, 0.0F, 0.0F, -0.1309F);
        ll4_r1.cubeList.add(new ModelBox(ll4_r1, 62, 25, 2.5F, -15.5F, -1.0F, 1, 3, 5, 0.0F, false));

        ll3_r1 = new ModelRenderer(this);
        ll3_r1.setRotationPoint(2.0F, 17.2F, 1.2F);
        legl.addChild(ll3_r1);
        setRotationAngle(ll3_r1, 0.0F, 0.0F, -0.0436F);
        ll3_r1.cubeList.add(new ModelBox(ll3_r1, 62, 12, 2.5F, -21.5F, -1.0F, 1, 8, 5, 0.0F, false));

        ll3_r2 = new ModelRenderer(this);
        ll3_r2.setRotationPoint(2.0F, 20.2F, 6.2F);
        legl.addChild(ll3_r2);
        setRotationAngle(ll3_r2, 0.2182F, 0.0F, 0.0F);
        ll3_r2.cubeList.add(new ModelBox(ll3_r2, 52, 27, -2.0F, -15.5F, 2.5F, 4, 3, 1, 0.0F, false));

        ll2_r1 = new ModelRenderer(this);
        ll2_r1.setRotationPoint(0.0F, 0.0F, 5.4F);
        legl.addChild(ll2_r1);
        setRotationAngle(ll2_r1, 0.0873F, 0.0F, 0.0F);
        ll2_r1.cubeList.add(new ModelBox(ll2_r1, 52, 17, 0.0F, -4.5F, -0.5F, 4, 9, 1, 0.0F, false));

        ll2_r2 = new ModelRenderer(this);
        ll2_r2.setRotationPoint(2.0F, 20.2F, -0.8F);
        legl.addChild(ll2_r2);
        setRotationAngle(ll2_r2, -0.2182F, 0.0F, 0.0F);
        ll2_r2.cubeList.add(new ModelBox(ll2_r2, 42, 27, -2.0F, -15.5F, -3.5F, 4, 3, 1, 0.0F, false));

        ll1_r1 = new ModelRenderer(this);
        ll1_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        legl.addChild(ll1_r1);
        setRotationAngle(ll1_r1, -0.0873F, 0.0F, 0.0F);
        ll1_r1.cubeList.add(new ModelBox(ll1_r1, 42, 17, 0.0F, -4.5F, -0.5F, 4, 9, 1, 0.0F, false));

        legr = new ModelRenderer(this);
        legr.setRotationPoint(1.9F, 4.0F, -2.7F);


        lr6_r1 = new ModelRenderer(this);
        lr6_r1.setRotationPoint(-3.5F, 19.3F, 1.2F);
        legr.addChild(lr6_r1);
        setRotationAngle(lr6_r1, 0.0F, 0.0F, 0.1309F);
        lr6_r1.cubeList.add(new ModelBox(lr6_r1, 96, 22, -3.5F, -15.5F, -1.0F, 1, 3, 5, 0.0F, true));

        lr5_r1 = new ModelRenderer(this);
        lr5_r1.setRotationPoint(-2.0F, 17.2F, 1.2F);
        legr.addChild(lr5_r1);
        setRotationAngle(lr5_r1, 0.0F, 0.0F, 0.0436F);
        lr5_r1.cubeList.add(new ModelBox(lr5_r1, 96, 9, -3.5F, -21.5F, -1.0F, 1, 8, 5, 0.0F, true));

        lr4_r1 = new ModelRenderer(this);
        lr4_r1.setRotationPoint(-2.0F, 20.2F, 6.2F);
        legr.addChild(lr4_r1);
        setRotationAngle(lr4_r1, 0.2182F, 0.0F, 0.0F);
        lr4_r1.cubeList.add(new ModelBox(lr4_r1, 86, 27, -2.0F, -15.5F, 2.5F, 4, 3, 1, 0.0F, true));

        lr3_r1 = new ModelRenderer(this);
        lr3_r1.setRotationPoint(0.0F, 0.0F, 5.4F);
        legr.addChild(lr3_r1);
        setRotationAngle(lr3_r1, 0.0873F, 0.0F, 0.0F);
        lr3_r1.cubeList.add(new ModelBox(lr3_r1, 86, 17, -4.0F, -4.5F, -0.5F, 4, 9, 1, 0.0F, true));

        lr2_r1 = new ModelRenderer(this);
        lr2_r1.setRotationPoint(-2.0F, 20.2F, -0.8F);
        legr.addChild(lr2_r1);
        setRotationAngle(lr2_r1, -0.2182F, 0.0F, 0.0F);
        lr2_r1.cubeList.add(new ModelBox(lr2_r1, 76, 27, -2.0F, -15.5F, -3.5F, 4, 3, 1, 0.0F, true));

        lr1_r1 = new ModelRenderer(this);
        lr1_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        legr.addChild(lr1_r1);
        setRotationAngle(lr1_r1, -0.0873F, 0.0F, 0.0F);
        lr1_r1.cubeList.add(new ModelBox(lr1_r1, 76, 17, -4.0F, -4.5F, -0.5F, 4, 9, 1, 0.0F, true));

        bootl = new ModelRenderer(this);
        bootl.setRotationPoint(-1.5F, 12.0F, 0.0F);
        bootl.cubeList.add(new ModelBox(bootl, 86, 55, -0.5F, -3.9F, -2.8F, 5, 4, 5, 0.0F, true));

        bootr = new ModelRenderer(this);
        bootr.setRotationPoint(1.5F, 12.0F, 0.0F);
        bootr.cubeList.add(new ModelBox(bootr, 86, 55, -4.5F, -3.9F, -2.8F, 5, 4, 5, 0.0F, false));

        bipedHeadwear.cubeList.clear();
        bipedHead.cubeList.clear();
        bipedHead.addChild(cowl);

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