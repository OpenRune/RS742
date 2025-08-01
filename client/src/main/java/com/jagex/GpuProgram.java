package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("eo")
public abstract class GpuProgram implements DeletableResource {

    @ObfuscatedName("eo.u")
    public String field1940 = null;

    @ObfuscatedName("eo.j")
    public String field1939;

    @ObfuscatedName("eo.a")
    public String field1938;

    @ObfuscatedName("eo.u(I)Ljava/lang/String;")
    public String method3244() {
        return this.field1940;
    }

    @ObfuscatedName("eo.a(Laig;F)V")
    public abstract void method3231(GpuProgramUniform arg0, float arg1);

    @ObfuscatedName("eo.z(Laig;Lka;)V")
    public abstract void method3232(GpuProgramUniform arg0, Matrix4x4 arg1);

    @ObfuscatedName("eo.l(Laig;FFF)V")
    public abstract void method3233(GpuProgramUniform arg0, float arg1, float arg2, float arg3);

    @ObfuscatedName("eo.f(Laig;FFFF)V")
    public abstract void method3234(GpuProgramUniform arg0, float arg1, float arg2, float arg3, float arg4);

    @ObfuscatedName("eo.d(Laig;[FI)V")
    public abstract void method3235(GpuProgramUniform arg0, float[] arg1, int arg2);

    @ObfuscatedName("eo.n(Laig;Lka;)V")
    public abstract void method3237(GpuProgramUniform arg0, Matrix4x4 arg1);

    @ObfuscatedName("eo.q(IFFF)V")
    public abstract void method3239(int arg0, float arg1, float arg2, float arg3);

    @ObfuscatedName("eo.p(IFFFF)V")
    public abstract void method3240(int arg0, float arg1, float arg2, float arg3, float arg4);

    @ObfuscatedName("eo.w(I[FI)V")
    public abstract void method3241(int arg0, float[] arg1, int arg2);

    @ObfuscatedName("eo.b(ILka;)V")
    public abstract void method3242(int arg0, Matrix4x4 arg1);

    @ObfuscatedName("eo.x(ILka;)V")
    public abstract void method3243(int arg0, Matrix4x4 arg1);

    @ObfuscatedName("eo.v(IILip;)V")
    public abstract void method3245(int arg0, int arg1, BaseTexture arg2);

    @ObfuscatedName("eo.t(Laig;FF)V")
    public abstract void method3267(GpuProgramUniform arg0, float arg1, float arg2);

    @ObfuscatedName("eo.o(Laig;ILip;)V")
    public abstract void method3271(GpuProgramUniform arg0, int arg1, BaseTexture arg2);

    @ObfuscatedName("eo.j()Z")
    public abstract boolean method3272();

    @ObfuscatedName("eo.i(ILka;)V")
    public abstract void method3284(int arg0, Matrix4x4 arg1);
}
