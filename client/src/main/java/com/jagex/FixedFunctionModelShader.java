package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("aad")
public class FixedFunctionModelShader extends ModelShader {

    public FixedFunctionModelShader(GpuToolkit arg0) {
        super(arg0);
    }

    @ObfuscatedName("aad.j(Lka;)V")
    public void method3848(Matrix4x4 arg0) {
        this.field2270.method13764(arg0, this.field2270.field8258, this.field2270.field8332);
    }

    @ObfuscatedName("aad.a(Z)V")
    public void method3849(boolean arg0) {
        this.field2270.method13629(0);
        this.field2270.method13560(0, TextureCombiner.field2546);
        this.field2270.method13562(0, TextureCombiner.field2546);
        this.field2270.method13560(1, TextureCombiner.field2545);
        this.field2270.method13562(1, TextureCombiner.field2545);
        this.field2270.method13632(TextureCombineMode.field2574, TextureCombineMode.field2574);
        this.method14039();
    }

    @ObfuscatedName("aad.r()V")
    public void method14039() {
        this.field2270.method13557(this.field2268);
        this.field2270.method13566().method5412(this.field2248);
        this.field2270.method13567(TextureTramsformType.field2549);
        this.field2270.method13596(PrimitiveType.field2582, this.field2267, this.field2261, this.field2269, this.field2252);
    }

    @ObfuscatedName("aad.s(I)V")
    public void method3850(int arg0) {
        this.field2270.method13629(0);
        this.field2270.method13632(TextureCombineMode.field2574, TextureCombineMode.field2574);
        this.field2270.method13560(0, TextureCombiner.field2546);
        this.field2270.method13562(0, TextureCombiner.field2546);
        this.field2270.method13560(1, TextureCombiner.field2545);
        this.field2270.method13562(1, TextureCombiner.field2545);
        this.method14039();
    }

    @ObfuscatedName("aad.c(I)V")
    public void method3851(int arg0) {
        this.field2270.method13629(0);
        this.field2270.method13632(TextureCombineMode.field2574, TextureCombineMode.field2573);
        this.field2270.method13560(0, TextureCombiner.field2546);
        this.field2270.method13562(0, TextureCombiner.field2545);
        this.field2270.method13560(1, TextureCombiner.field2545);
        this.field2270.method13562(1, TextureCombiner.field2545);
        this.method14039();
    }

    @ObfuscatedName("aad.m(I)V")
    public void method3852(int arg0) {
        this.field2270.method13629(0);
        this.field2270.method13632(TextureCombineMode.field2574, TextureCombineMode.field2573);
        this.field2270.method13560(0, TextureCombiner.field2546);
        this.field2270.method13562(0, TextureCombiner.field2545);
        this.field2270.method13560(1, TextureCombiner.field2545);
        this.field2270.method13562(1, TextureCombiner.field2545);
        this.method14039();
    }

    @ObfuscatedName("aad.t()V")
    public void method3853() {
        this.method3850(0);
    }

    @ObfuscatedName("aad.l()V")
    public void method3854() {
        this.method3850(0);
    }
}
