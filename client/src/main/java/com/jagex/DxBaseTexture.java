package com.jagex;

import deob.ObfuscatedName;
import com.jagex.libs.jagdx.IUnknown;

@ObfuscatedName("jq")
public abstract class DxBaseTexture implements DeletableResource {

    @ObfuscatedName("jq.u")
    public final DxToolkit field3326;

    @ObfuscatedName("jq.j")
    public final TextureFormat field3327;

    @ObfuscatedName("jq.a")
    public final DataType field3329;

    @ObfuscatedName("jq.s")
    public boolean field3328;

    @ObfuscatedName("jq.c")
    public long field3325 = 0L;

    public DxBaseTexture(DxToolkit arg0, TextureFormat arg1, DataType arg2, boolean arg3, int arg4) {
        this.field3326 = arg0;
        this.field3327 = arg1;
        this.field3329 = arg2;
        this.field3328 = arg3;
        this.field3326.method13586(this);
    }

    @ObfuscatedName("jq.bg()J")
    public long method4923() {
        return this.field3325;
    }

    @ObfuscatedName("jq.ae(Lhd;)V")
    public void method4525(GpuTextureRelated arg0) {
    }

    @ObfuscatedName("jq.s()V")
    public void method168() {
        if (this.field3325 != 0L) {
            IUnknown.Release(this.field3325);
            this.field3325 = 0L;
        }
        this.field3326.method13485(this);
    }

    @ObfuscatedName("jq.bl()V")
    public void method4924() {
        if (this.field3325 != 0L) {
            this.field3326.method16038(this.field3325);
            this.field3325 = 0L;
        }
    }

    public void finalize() {
        this.method4924();
    }
}
