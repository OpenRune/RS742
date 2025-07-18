package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("aaa")
public final class FixedFunctionSpriteShader extends SpriteShader {

    public FixedFunctionSpriteShader(GpuToolkit arg0) {
        super(arg0);
    }

    @ObfuscatedName("aaa.l()V")
    public void method14071() {
        this.field2278.method13597();
        this.method14069();
        this.field2278.method13587(0, this.field2283);
        this.field2278.method13688(this.field2285);
        this.field2278.method13619(PrimitiveType.field2580, this.field2277, 2);
    }

    @ObfuscatedName("aaa.f()V")
    public void method14069() {
        this.field2278.method13638(this.field2280);
        this.field2278.method13764(Matrix4x4.field3479, Matrix4x4.field3479, this.field2280);
        this.field2278.method13629(0);
        this.field2278.method13557(this.field2284);
        this.field2278.method13560(0, TextureCombiner.field2546);
        this.field2278.method13562(0, TextureCombiner.field2546);
        this.field2278.method13560(1, TextureCombiner.field2547);
        this.field2278.method13562(1, TextureCombiner.field2547);
        this.field2278.method13566().method5412(this.field2281);
        this.field2278.method13567(TextureTramsformType.field2549);
    }

    @ObfuscatedName("aaa.u(II)V")
    public void method3881(int arg0, int arg1) {
        this.field2278.method13791(arg0);
        this.field2278.method13621(arg1);
    }

    @ObfuscatedName("aaa.j()V")
    public void method3882() {
        this.method14071();
    }

    @ObfuscatedName("aaa.a()V")
    public void method3883() {
        this.field2278.method13629(1);
        this.field2278.method13557(this.field2279);
        this.field2278.method13566().method5412(this.field2282);
        this.field2278.method13567(TextureTramsformType.field2549);
        this.field2278.method13632(TextureCombineMode.field2573, TextureCombineMode.field2574);
        this.field2278.method13560(0, TextureCombiner.field2544);
        this.method14071();
        this.field2278.method13629(1);
        this.field2278.method13558();
    }
}
