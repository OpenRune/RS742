package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("agf")
public class Lookat_Sub1 extends Lookat {

    @ObfuscatedName("agf.j")
    public Spline field9898 = null;

    @ObfuscatedName("agf.a")
    public PositionSpline field9897 = null;

    public Lookat_Sub1(Camera arg0) {
        super(arg0);
    }

    @ObfuscatedName("agf.u(FB)V")
    public void method11540(float arg0) {
    }

    @ObfuscatedName("agf.j(I)Z")
    public boolean method11541() {
        return this.field9898 != null && this.field9897 != null && this.field9897.method4030();
    }

    @ObfuscatedName("agf.a(S)Lko;")
    public Vector3 method11550() {
        return Vector3.create(this.field9898.method5517(this.field9897.method14129()));
    }

    @ObfuscatedName("agf.s(Lfi;Lkc;III)V")
    public void method11543(Vector3i arg0, Matrix4x3 arg1, int arg2, int arg3) {
        Vector3 var5 = Vector3.create(this.field6645.method3720());
        var5.x -= arg2;
        var5.z -= arg3;
        float var6 = this.field9897.method14129();
        Vector3 var7 = Vector3.create(this.field9898.method5517(var6));
        var7.x -= arg2;
        var7.z -= arg3;
        float var8 = this.field9898.method5519(var6);
        Vector3 var9 = Vector3.method5377(var7, var5);
        var9.method5313();
        Quaternion var10 = new Quaternion();
        var10.method5215(var9, var8);
        Vector3 var11 = Vector3.create(0.0F, 1.0F, 0.0F);
        Vector3 var12 = Vector3.method5308(var9, var11);
        Vector3 var13 = Vector3.method5308(var12, var9);
        var13.method5318(var10);
        var5.y *= -1.0F;
        var7.y *= -1.0F;
        arg1.method5103(var5.x, var5.y, var5.z, var7.x, var7.y, var7.z, var13.x, var13.y, var13.z);
        var5.release();
        var7.release();
        var13.release();
    }

    @ObfuscatedName("agf.c(Laet;I)V")
    public void method11542(Packet arg0) {
        this.field9898 = new Spline(arg0);
    }
}
