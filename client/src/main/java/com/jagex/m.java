package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("m")
public class m extends Font implements ua {

    public long nativeid;

    public m(ja arg0, ba arg1, FontMetrics arg2, PalettedSpriteData[] arg3, Sprite[] arg4) {
        super(arg0, arg2);
        byte[][] var6 = new byte[arg3.length][];
        int[] var7 = new int[arg3.length];
        int[] var8 = new int[arg3.length];
        int[] var9 = new int[arg3.length];
        int[] var10 = new int[arg3.length];
        for (int var11 = 0; var11 < arg3.length; var11++) {
            var6[var11] = arg3[var11].field8408;
            var7[var11] = arg3[var11].field8415;
            var8[var11] = arg3[var11].field8409;
            var9[var11] = arg3[var11].field8413;
            var10[var11] = arg3[var11].field8412;
        }
        this.n(arg0, arg1, var6, var7, var8, var9, var10);
    }

    public void finalize() {
        if (this.nativeid != 0L) {
            cp.method2358(this);
        }
    }

    @ObfuscatedName("m.b(CIIIZLta;II)V")
    public void method867(char arg0, int arg1, int arg2, int arg3, boolean arg4, GraphicsRelated arg5, int arg6, int arg7) {
        this.MA(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @ObfuscatedName("m.n(Lja;Lba;[[B[I[I[I[I)V")
    public native void n(ja arg0, ba arg1, byte[][] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6);

    @ObfuscatedName("m.ma(Z)V")
    public native void ma(boolean arg0);

    @ObfuscatedName("m.UA(CIIIZ)V")
    public native void UA(char arg0, int arg1, int arg2, int arg3, boolean arg4);

    @ObfuscatedName("m.MA(CIIIZLta;II)V")
    public native void MA(char arg0, int arg1, int arg2, int arg3, boolean arg4, GraphicsRelated arg5, int arg6, int arg7);
}
