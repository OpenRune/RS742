package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("bj")
public class PureJavaDepthBuffer implements EffectInterface {

    @ObfuscatedName("bj.u")
    public int field1023;

    @ObfuscatedName("bj.j")
    public int field1022;

    @ObfuscatedName("bj.a")
    public float[] field1024;

    public PureJavaDepthBuffer(int arg0, int arg1) {
        this.field1023 = arg0;
        this.field1022 = arg1;
        this.field1024 = new float[this.field1023 * this.field1022];
    }

    @ObfuscatedName("bj.u()I")
    public int method164() {
        return this.field1023;
    }

    @ObfuscatedName("bj.a()I")
    public int method165() {
        return this.field1022;
    }

    @ObfuscatedName("bj.s()V")
    public void method168() {
    }
}
