package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("at")
public class HintArrow {

    @ObfuscatedName("at.u")
    public int field776;

    @ObfuscatedName("at.j")
    public int field773;

    @ObfuscatedName("at.a")
    public int field772;

    @ObfuscatedName("at.s")
    public int field775;

    @ObfuscatedName("at.c")
    public int field778;

    @ObfuscatedName("at.m")
    public int field777;

    @ObfuscatedName("at.t")
    public int field781;

    @ObfuscatedName("at.l")
    public int field779 = -1;

    @ObfuscatedName("at.f")
    public int field780;

    @ObfuscatedName("at.d")
    public int field774;

    @ObfuscatedName("at.z")
    public static SoftLruHashTable field782 = new SoftLruHashTable(4);

    @ObfuscatedName("rx.u(Lra;IIIIIB)Lqa;")
    public static Model method8588(RendererToolkit arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        long var6 = (long) arg5;
        Model var8 = (Model) field782.get(var6);
        short var9 = 2055;
        if (var8 == null) {
            ModelUnlit var10 = ModelUnlit.method2664(Statics.field4560, arg5, 0);
            if (var10 == null) {
                return null;
            }
            if (var10.field1314 < 13) {
                var10.method2634(2);
            }
            var8 = arg0.createModel(var10, var9, Statics.field783, 64, 768);
            field782.method7937(var8, var6);
        }
        Model var11 = var8.copy((byte) 6, var9, true);
        if (arg1 != 0) {
            var11.f(arg1);
        }
        if (arg2 != 0) {
            var11.t(arg2);
        }
        if (arg3 != 0) {
            var11.EA(arg3);
        }
        if (arg4 != 0) {
            var11.ia(0, arg4, 0);
        }
        return var11;
    }

    @ObfuscatedName("kb.j(II)V")
    public static void method5011(int arg0) {
        Statics.field783 = arg0;
        field782.method7922();
    }

    @ObfuscatedName("oo.a(I)V")
    public static void method7558() {
        field782.method7922();
    }

    @ObfuscatedName("qr.s(II)V")
    public static void method8096(int arg0) {
        field782.method7921(arg0);
    }

    @ObfuscatedName("ls.c(B)V")
    public static void method5713() {
        field782.removeSoft();
    }
}
