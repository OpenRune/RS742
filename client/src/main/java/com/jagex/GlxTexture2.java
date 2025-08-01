package com.jagex;

import deob.ObfuscatedName;
import com.jagex.libs.jaggl.OpenGL;

@ObfuscatedName("abl")
public class GlxTexture2 extends GlxBaseTexture implements GpuTextureRelated1 {

    @ObfuscatedName("abl.p")
    public final int field8815;

    @ObfuscatedName("abl.w")
    public final int field8814;

    public GlxTexture2(GlxToolkit arg0, TextureFormat arg1, DataType arg2, int arg3, int arg4) {
        super(arg0, 34037, arg1, arg2, arg3 * arg4, false);
        this.field8815 = arg3;
        this.field8814 = arg4;
        this.field3733.method13557(this);
        OpenGL.glTexImage2Dub(this.field3737, 0, GlxToolkit.method16100(this.field3736, this.field3731), arg3, arg4, 0, GlxToolkit.method16093(this.field3736), GlxToolkit.method16090(this.field3731), null, 0);
    }

    public GlxTexture2(GlxToolkit arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        super(arg0, 34037, TextureFormat.field1296, DataType.field1501, arg1 * arg2, false);
        this.field8815 = arg1;
        this.field8814 = arg2;
        this.field3733.method13557(this);
        OpenGL.glPixelStorei(3314, arg5);
        OpenGL.glTexImage2Di(this.field3737, 0, 6408, this.field8815, this.field8814, 0, 32993, this.field3733.field10024, arg3, arg4 * 4);
        OpenGL.glPixelStorei(3314, 0);
    }

    public GlxTexture2(GlxToolkit arg0, TextureFormat arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6) {
        super(arg0, 34037, arg1, DataType.field1501, arg2 * arg3, false);
        this.field8815 = arg2;
        this.field8814 = arg3;
        this.field3733.method13557(this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glPixelStorei(3314, arg6);
        OpenGL.glTexImage2Dub(this.field3737, 0, GlxToolkit.method16100(this.field3736, this.field3731), arg2, arg3, 0, GlxToolkit.method16093(this.field3736), 5121, arg4, arg5);
        OpenGL.glPixelStorei(3314, 0);
        OpenGL.glPixelStorei(3317, 4);
    }

    public GlxTexture2(GlxToolkit arg0, TextureFormat arg1, int arg2, int arg3, float[] arg4, int arg5, int arg6) {
        super(arg0, 34037, arg1, DataType.field1506, arg2 * arg3, false);
        this.field8815 = arg2;
        this.field8814 = arg3;
        this.field3733.method13557(this);
        OpenGL.glPixelStorei(3314, arg6);
        OpenGL.glTexImage2Df(this.field3737, 0, GlxToolkit.method16100(this.field3736, this.field3731), arg2, arg3, 0, GlxToolkit.method16093(this.field3736), 5126, arg4, arg5 * 4);
        OpenGL.glPixelStorei(3314, 0);
    }

    @ObfuscatedName("abl.u()I")
    public int method4409() {
        return this.field8815;
    }

    @ObfuscatedName("abl.j()I")
    public int method4449() {
        return this.field8814;
    }

    @ObfuscatedName("abl.a(F)F")
    public float method4437(float arg0) {
        return arg0;
    }

    @ObfuscatedName("abl.t(F)F")
    public float method4439(float arg0) {
        return arg0;
    }

    @ObfuscatedName("abl.o()F")
    public float method4433() {
        return 1.0F;
    }

    @ObfuscatedName("abl.q()F")
    public float method4443() {
        return 1.0F;
    }

    @ObfuscatedName("abl.l()Z")
    public boolean method4408() {
        return false;
    }

    @ObfuscatedName("abl.f(ZZ)V")
    public void method4412(boolean arg0, boolean arg1) {
    }

    @ObfuscatedName("abl.d(IIII[III)V")
    public void method4413(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6) {
        if (arg6 == 0) {
            arg6 = arg2;
        }
        this.field3733.method13557(this);
        if (arg2 != arg6) {
            OpenGL.glPixelStorei(3314, arg6);
        }
        OpenGL.glTexSubImage2Di(this.field3737, 0, arg0, arg1, arg2, arg3, 32993, this.field3733.field10024, arg4, arg5);
        if (arg2 != arg6) {
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @ObfuscatedName("abl.z(IIII[BLcy;II)V")
    public void method4414(int arg0, int arg1, int arg2, int arg3, byte[] arg4, TextureFormat arg5, int arg6, int arg7) {
        if (arg7 == 0) {
            arg7 = arg2;
        }
        this.field3733.method13557(this);
        OpenGL.glPixelStorei(3317, 1);
        if (arg2 != arg7) {
            OpenGL.glPixelStorei(3314, arg7);
        }
        OpenGL.glTexSubImage2Dub(this.field3737, 0, arg0, arg1, arg2, arg3, GlxToolkit.method16093(arg5), 5121, arg4, arg6);
        if (arg2 != arg7) {
            OpenGL.glPixelStorei(3314, 0);
        }
        OpenGL.glPixelStorei(3317, 4);
    }

    @ObfuscatedName("abl.n(IIII[II)V")
    public void method4415(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5) {
        int[] var7 = new int[this.field8815 * this.field8814];
        this.field3733.method13557(this);
        OpenGL.glGetTexImagei(this.field3737, 0, 32993, 5121, var7, 0);
        for (int var8 = 0; var8 < arg3; var8++) {
            System.arraycopy(var7, (arg3 - 1 + arg1 - var8) * this.field8815, arg4, arg2 * var8 + arg5, arg2);
        }
    }

    @ObfuscatedName("abl.bf(I)Lde;")
    public GraphicsDeletable method4534(int arg0) {
        return new GlxRelated12(this, arg0);
    }

    @ObfuscatedName("abl.p()Z")
    public boolean method4418() {
        return super.method4418();
    }

    @ObfuscatedName("abl.au()V")
    public void method4527() {
        super.method4527();
    }

    @ObfuscatedName("abl.ae(Lhd;)V")
    public void method4525(GpuTextureRelated arg0) {
        super.method4525(arg0);
    }

    @ObfuscatedName("abl.s()V")
    public void method168() {
        super.method168();
    }
}
