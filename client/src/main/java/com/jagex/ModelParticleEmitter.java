package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("dx")
public class ModelParticleEmitter {

    @ObfuscatedName("dx.u")
    public final int field1383;

    @ObfuscatedName("dx.j")
    public ModelParticleEmitter field1372;

    @ObfuscatedName("dx.a")
    public final int field1374;

    @ObfuscatedName("dx.s")
    public final int field1375;

    @ObfuscatedName("dx.c")
    public final int field1376;

    @ObfuscatedName("dx.m")
    public final byte field1382;

    @ObfuscatedName("dx.t")
    public int field1378;

    @ObfuscatedName("dx.l")
    public int field1379;

    @ObfuscatedName("dx.f")
    public int field1380;

    @ObfuscatedName("dx.d")
    public int field1381;

    @ObfuscatedName("dx.z")
    public int field1377;

    @ObfuscatedName("dx.n")
    public int field1373;

    @ObfuscatedName("dx.o")
    public int field1384;

    @ObfuscatedName("dx.q")
    public int field1385;

    @ObfuscatedName("dx.p")
    public int field1386;

    public ModelParticleEmitter(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        this.field1383 = arg0;
        this.field1374 = arg1;
        this.field1375 = arg2;
        this.field1376 = arg3;
        this.field1382 = arg4;
    }

    @ObfuscatedName("dx.u(B)Liu;")
    public ParticleEmitterType method2702() {
        return ParticleEmitterType.method2841(this.field1383);
    }

    @ObfuscatedName("dx.j(IIIB)Ldx;")
    public ModelParticleEmitter method2701(int arg0, int arg1, int arg2) {
        return new ModelParticleEmitter(this.field1383, arg0, arg1, arg2, this.field1382);
    }
}
