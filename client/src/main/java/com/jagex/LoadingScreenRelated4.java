package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("aai")
public class LoadingScreenRelated4 extends LoadingScreenProgressDisplay {

    @ObfuscatedName("aai.t")
    public Sprite field8725;

    @ObfuscatedName("aai.l")
    public Sprite field8721;

    @ObfuscatedName("aai.f")
    public Sprite field8720;

    @ObfuscatedName("aai.d")
    public Sprite field8723;

    @ObfuscatedName("aai.z")
    public Sprite field8724;

    @ObfuscatedName("aai.n")
    public Sprite field8722;

    public LoadingScreenRelated4(Js5 arg0, Js5 arg1, LoadingScreenRelated4_Sub1 arg2) {
        super(arg0, arg1, arg2);
    }

    @ObfuscatedName("aai.u(B)V")
    public void method3936() {
        super.method3936();
        LoadingScreenRelated4_Sub1 var1 = (LoadingScreenRelated4_Sub1) this.field2311;
        this.field8725 = MainLoadingScreen.method1624(this.field2310, var1.field8822);
        this.field8721 = MainLoadingScreen.method1624(this.field2310, var1.field8820);
        this.field8720 = MainLoadingScreen.method1624(this.field2310, var1.field8821);
        this.field8723 = MainLoadingScreen.method1624(this.field2310, var1.field8824);
        this.field8724 = MainLoadingScreen.method1624(this.field2310, var1.field8823);
        this.field8722 = MainLoadingScreen.method1624(this.field2310, var1.field8819);
    }

    @ObfuscatedName("aai.f(ZIIS)V")
    public void method3957(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            return;
        }
        int[] var4 = new int[4];
        client.toolkit.qa(var4);
        client.toolkit.r(arg1, arg2, this.field2311.field2602 + arg1, this.field2311.field2607 + arg2);
        int var5 = this.field8720.method1042();
        int var6 = this.field8720.method1047();
        int var7 = this.field8723.method1042();
        int var8 = this.field8723.method1047();
        this.field8720.method2500(arg1, (this.field2311.field2607 - var6) / 2 + arg2);
        this.field8723.method2500(this.field2311.field2602 + arg1 - var7, (this.field2311.field2607 - var8) / 2 + arg2);
        client.toolkit.r(arg1, arg2, this.field2311.field2602 + arg1, arg2 + this.field8724.method1047());
        this.field8724.method2511(arg1 + var5, arg2, this.field2311.field2602 - var5 - var7, this.field2311.field2607);
        int var9 = this.field8722.method1047();
        client.toolkit.r(arg1, this.field2311.field2607 + arg2 - var9, this.field2311.field2602 + arg1, this.field2311.field2607 + arg2);
        this.field8722.method2511(arg1 + var5, this.field2311.field2607 + arg2 - var9, this.field2311.field2602 - var5 - var7, this.field2311.field2607);
        client.toolkit.r(var4[0], var4[1], var4[2], var4[3]);
    }

    @ObfuscatedName("aai.d(ZIII)V")
    public void method3955(boolean arg0, int arg1, int arg2) {
        int var4 = arg1 + this.field8720.method1042();
        int var5 = this.field2311.field2602 + arg1 - this.field8723.method1042();
        int var6 = arg2 + this.field8724.method1047();
        int var7 = this.field2311.field2607 + arg2 - this.field8722.method1047();
        int var8 = var5 - var4;
        int var9 = var7 - var6;
        int var10 = this.method3956() * var8 / 10000;
        int[] var11 = new int[4];
        client.toolkit.qa(var11);
        client.toolkit.r(var4, var6, var4 + var10, var7);
        this.method14085(var4, var6, var8, var9);
        client.toolkit.r(var4 + var10, var6, var5, var7);
        this.field8721.method2511(var4, var6, var8, var9);
        client.toolkit.r(var11[0], var11[1], var11[2], var11[3]);
    }

    @ObfuscatedName("aai.i(IIIII)V")
    public void method14085(int arg0, int arg1, int arg2, int arg3) {
        this.field8725.method2511(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("aai.a(I)Z")
    public boolean method3931() {
        if (!super.method3931()) {
            return false;
        }
        LoadingScreenRelated4_Sub1 var1 = (LoadingScreenRelated4_Sub1) this.field2311;
        if (!this.field2310.method5630(var1.field8822)) {
            return false;
        } else if (!this.field2310.method5630(var1.field8820)) {
            return false;
        } else if (!this.field2310.method5630(var1.field8821)) {
            return false;
        } else if (!this.field2310.method5630(var1.field8824)) {
            return false;
        } else if (this.field2310.method5630(var1.field8823)) {
            return this.field2310.method5630(var1.field8819);
        } else {
            return false;
        }
    }
}
