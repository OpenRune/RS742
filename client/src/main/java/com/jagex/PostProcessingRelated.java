package com.jagex;

import deob.ObfuscatedName;
import com.jagex.libs.jaggl.OpenGL;

@ObfuscatedName("xc")
public class PostProcessingRelated extends SecondaryNode implements GlRelated5 {

    @ObfuscatedName("xc.s")
    public final GlToolkit field7522;

    @ObfuscatedName("xc.c")
    public int field7520;

    @ObfuscatedName("xc.m")
    public final int field7518;

    @ObfuscatedName("xc.t")
    public final int field7519;

    @ObfuscatedName("xc.l")
    public final DataType field7523;

    @ObfuscatedName("xc.f")
    public final TextureFormat field7521;

    @ObfuscatedName("xc.d")
    public final int field7516;

    @ObfuscatedName("xc.z")
    public static final int[] field7517 = new int[1];

    public PostProcessingRelated(GlToolkit arg0, TextureFormat arg1, DataType arg2, int arg3, int arg4) {
        this.field7522 = arg0;
        this.field7518 = arg3;
        this.field7519 = arg4;
        this.field7521 = arg1;
        this.field7523 = arg2;
        OpenGL.glGenRenderbuffersEXT(1, field7517, 0);
        this.field7520 = field7517[0];
        OpenGL.glBindRenderbufferEXT(36161, this.field7520);
        OpenGL.glRenderbufferStorageEXT(36161, GlToolkit.method13335(this.field7521, this.field7523), this.field7518, this.field7519);
        this.field7516 = this.field7521.field1306 * this.field7519 * this.field7518 * this.field7523.field1508;
    }

    public PostProcessingRelated(GlToolkit arg0, TextureFormat arg1, DataType arg2, int arg3, int arg4, int arg5) {
        this.field7522 = arg0;
        this.field7518 = arg3;
        this.field7519 = arg4;
        this.field7521 = arg1;
        this.field7523 = arg2;
        OpenGL.glGenRenderbuffersEXT(1, field7517, 0);
        this.field7520 = field7517[0];
        OpenGL.glBindRenderbufferEXT(36161, this.field7520);
        OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg5, GlToolkit.method13335(this.field7521, this.field7523), this.field7518, this.field7519);
        this.field7516 = this.field7521.field1306 * this.field7519 * this.field7518 * this.field7523.field1508;
    }

    @ObfuscatedName("xc.u()I")
    public int method164() {
        return this.field7518;
    }

    @ObfuscatedName("xc.a()I")
    public int method165() {
        return this.field7519;
    }

    @ObfuscatedName("xc.j(I)V")
    public void method2260(int arg0) {
        OpenGL.glFramebufferRenderbufferEXT(36160, arg0, 36161, this.field7520);
    }

    @ObfuscatedName("xc.s()V")
    public void method168() {
        if (this.field7520 > 0) {
            int[] var1 = new int[]{this.field7520};
            OpenGL.glDeleteRenderbuffersEXT(1, var1, 0);
            this.field7520 = 0;
        }
    }

    @ObfuscatedName("xc.x()V")
    public void method12801() {
        if (this.field7520 > 0) {
            this.field7522.method13331(this.field7520, this.field7516);
            this.field7520 = 0;
        }
    }

    public void finalize() throws Throwable {
        this.method12801();
        super.finalize();
    }
}
