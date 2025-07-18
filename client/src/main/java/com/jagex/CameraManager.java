package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("r")
public class CameraManager {

    @ObfuscatedName("r.u")
    public static boolean field644 = false;

    public CameraManager() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ry.u(I)V")
    public static void method8497() {
        Statics.field3780 = new BasicCamera(client.field8948);
        Statics.field3780.method3691(CameraControlMode.field2203);
        try {
            PositionPoint var0 = (PositionPoint) Statics.field3780.method3693(PositionMode.POINT, false);
            LookatOrientation var1 = (LookatOrientation) Statics.field3780.method3692(LookatMode.field2169, false);
            var0.method14091(Statics.cam2.method3722());
            var1.method15923(new Quaternion(0.0F, 0.0F, 0.0F));
        } catch (CameraException var3) {
        }
        Statics.field643 = Statics.mouse.getX();
        Statics.field7432 = Statics.mouse.getY();
        field644 = true;
    }

    @ObfuscatedName("qs.j(I)V")
    public static void method8391() {
        Statics.field3780 = null;
        field644 = false;
    }

    @ObfuscatedName("acx.a(I)Z")
    public static boolean method14782() {
        return field644;
    }

    @ObfuscatedName("ex.s(B)V")
    public static void method3312() {
        PositionPoint var0 = (PositionPoint) Statics.field3780.getPosition();
        LookatOrientation var1 = (LookatOrientation) Statics.field3780.getLookat();
        Vector3 var2 = var0.method4016();
        Quaternion var3 = var1.method15921();
        if (client.gameScreen != null) {
            int var4 = client.gameScreen.renderwidth;
            int var5 = client.gameScreen.renderheight;
            float var6 = 1000.0F;
            float var7 = (float) (Math.atan((double) ((float) var4 / 2.0F / var6)) * 2.0D);
            float var8 = (float) (Math.atan((double) ((float) var5 / 2.0F / var6)) * 2.0D);
            try {
                Statics.field3780.setFieldOfView(var7, var8);
            } catch (CameraException var18) {
            }
        }
        if (Statics.mouse.method7251()) {
            Quaternion var10 = Quaternion.method5206();
            var10.method5216(1.0F, 0.0F, 0.0F, (float) (Statics.mouse.getY() - Statics.field7432) / 200.0F);
            var3.method5266(var10);
            Vector3 var11 = Vector3.create(0.0F, 1.0F, 0.0F);
            var11.method5318(var3);
            Quaternion var12 = Quaternion.method5206();
            var12.method5215(var11, (float) (Statics.field643 - Statics.mouse.getX()) / 200.0F);
            var3.method5266(var12);
            var1.method15923(var3);
        }
        Statics.field643 = Statics.mouse.getX();
        Statics.field7432 = Statics.mouse.getY();
        var3.method5220();
        if (Statics.keyboard.isKeyHeld(98)) {
            Vector3 var13 = Vector3.create(0.0F, 0.0F, 25.0F);
            var13.method5318(var3);
            var13.y *= -1.0F;
            var2.method5299(var13);
        }
        if (Statics.keyboard.isKeyHeld(99)) {
            Vector3 var14 = Vector3.create(0.0F, 0.0F, -25.0F);
            var14.method5318(var3);
            var14.y *= -1.0F;
            var2.method5299(var14);
        }
        if (Statics.keyboard.isKeyHeld(96)) {
            Vector3 var15 = Vector3.create(-25.0F, 0.0F, 0.0F);
            var15.method5318(var3);
            var15.y *= -1.0F;
            var2.method5299(var15);
        }
        if (Statics.keyboard.isKeyHeld(97)) {
            Vector3 var16 = Vector3.create(25.0F, 0.0F, 0.0F);
            var16.method5318(var3);
            var16.y *= -1.0F;
            var2.method5299(var16);
        }
        CoordFine var17 = new CoordFine(0, (int) var2.x, (int) var2.y, (int) var2.z);
        var0.method14091(var17);
        Statics.field3780.method3727(0.02F, client.world.method6101(Statics.currentPlayerLevel), client.world.method6157().field3697);
    }
}
