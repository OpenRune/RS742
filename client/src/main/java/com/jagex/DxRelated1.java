package com.jagex;

import deob.ObfuscatedName;
import com.jagex.libs.jagdx.IDirect3DTexture;
import com.jagex.libs.jagdx.IUnknown;

@ObfuscatedName("jn")
public class DxRelated1 implements DxGraphicsDeletable, FrameBufferInterface {

    @ObfuscatedName("jn.u")
    public final int field3324;

    @ObfuscatedName("jn.j")
    public final DxTexture_Sub1 field3323;

    @ObfuscatedName("jn.a")
    public long field3322;

    public DxRelated1(DxTexture_Sub1 arg0, int arg1) {
        this.field3324 = arg1;
        this.field3323 = arg0;
        this.field3323.field3326.method13586(this);
    }

    @ObfuscatedName("jn.u()I")
    public int method164() {
        return this.field3323.method4409();
    }

    @ObfuscatedName("jn.a()I")
    public int method165() {
        return this.field3323.method4449();
    }

    @ObfuscatedName("jn.j()J")
    public long method4909() {
        if (this.field3322 == 0L) {
            this.field3322 = IDirect3DTexture.GetSurfaceLevel(this.field3323.field3325, this.field3324);
        }
        return this.field3322;
    }

    @ObfuscatedName("jn.s()V")
    public void method168() {
        if (this.field3322 != 0L) {
            IUnknown.Release(this.field3322);
            this.field3322 = 0L;
        }
        this.field3323.field3326.method13485(this);
    }

    @ObfuscatedName("jn.o()V")
    public void method4905() {
        if (this.field3322 != 0L) {
            this.field3323.field3326.method16038(this.field3322);
            this.field3322 = 0L;
        }
    }

    public void finalize() {
        this.method4905();
    }
}
