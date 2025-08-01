package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("fq")
public abstract class ModelShader {

    @ObfuscatedName("fq.j")
    public GpuToolkit field2270;

    @ObfuscatedName("fq.a")
    public float[] field2250 = new float[16];

    @ObfuscatedName("fq.s")
    public float[] field2251 = new float[16];

    @ObfuscatedName("fq.c")
    public GpuTexture field2268;

    @ObfuscatedName("fq.m")
    public GpuCubeTexture field2253;

    @ObfuscatedName("fq.t")
    public final Matrix4x4 field2248 = new Matrix4x4();

    @ObfuscatedName("fq.l")
    public final Vector3 field2258 = new Vector3();

    @ObfuscatedName("fq.f")
    public float field2254;

    @ObfuscatedName("fq.d")
    public float field2257;

    @ObfuscatedName("fq.z")
    public final Vector4 field2266 = new Vector4();

    @ObfuscatedName("fq.n")
    public final Vector3 field2259 = new Vector3();

    @ObfuscatedName("fq.o")
    public final Vector4 field2260 = new Vector4();

    @ObfuscatedName("fq.q")
    public final Vector3 field2249 = new Vector3();

    @ObfuscatedName("fq.p")
    public final Vector3 field2262 = new Vector3();

    @ObfuscatedName("fq.w")
    public final Vector3 field2263 = new Vector3();

    @ObfuscatedName("fq.b")
    public final Vector3 field2264 = new Vector3();

    @ObfuscatedName("fq.x")
    public final Vector3 field2265 = new Vector3();

    @ObfuscatedName("fq.i")
    public final Matrix4x4 field2256 = new Matrix4x4();

    @ObfuscatedName("fq.v")
    public int field2267;

    @ObfuscatedName("fq.k")
    public int field2261;

    @ObfuscatedName("fq.h")
    public int field2269;

    @ObfuscatedName("fq.r")
    public int field2252;

    public ModelShader(GpuToolkit arg0) {
        this.field2270 = arg0;
    }

    @ObfuscatedName("fq.u(Lcu;)V")
    public void method3862(Material arg0) {
        switch (arg0.field1248) {
            case 1:
                this.field2254 = 32.0F;
                this.field2257 = 0.0F;
                break;
            case 2:
                this.field2254 = 4.0F;
                this.field2257 = 0.0F;
                break;
            case 3:
                this.field2254 = 1.0F;
                this.field2257 = 0.0F;
        }
    }

    @ObfuscatedName("fq.j(Lka;)V")
    public abstract void method3848(Matrix4x4 arg0);

    @ObfuscatedName("fq.a(Z)V")
    public abstract void method3849(boolean arg0);

    @ObfuscatedName("fq.s(I)V")
    public abstract void method3850(int arg0);

    @ObfuscatedName("fq.c(I)V")
    public abstract void method3851(int arg0);

    @ObfuscatedName("fq.m(I)V")
    public abstract void method3852(int arg0);

    @ObfuscatedName("fq.t()V")
    public abstract void method3853();

    @ObfuscatedName("fq.l()V")
    public abstract void method3854();
}
