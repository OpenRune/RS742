package com.jagex;

import deob.ObfuscatedName;
import com.jagex.libs.jaggl.OpenGL;

@ObfuscatedName("ld")
public class GlxRelated12 implements GlxRelated5 {

    @ObfuscatedName("ld.u")
    public final int field3725;

    @ObfuscatedName("ld.j")
    public final GlxTexture2 field3724;

    public GlxRelated12(GlxTexture2 arg0, int arg1) {
        this.field3725 = arg1;
        this.field3724 = arg0;
    }

    @ObfuscatedName("ld.u()I")
    public int method164() {
        return this.field3724.method4409();
    }

    @ObfuscatedName("ld.a()I")
    public int method165() {
        return this.field3724.method4449();
    }

    @ObfuscatedName("ld.j(I)V")
    public void method5970(int arg0) {
        OpenGL.glFramebufferTexture2DEXT(36160, arg0, this.field3724.field3737, this.field3724.field3734, this.field3725);
    }

    @ObfuscatedName("ld.s()V")
    public void method168() {
    }
}
