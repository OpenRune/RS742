package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("p")
public class WorldMapRenderer {

    public WorldMapRenderer() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("rj.u(Lra;IILew;I)V")
    public static void method8599(RendererToolkit arg0, int arg1, int arg2, Component arg3) {
        byte var4 = 63;
        byte var5 = 7;
        for (int var6 = 63; var6 >= 0; var6--) {
            int var7 = (var6 & 0x3F) << 10 | (var5 & 0x7) << 7 | var4 & 0x7F;
            ColourUtils.method8092(false, true);
            int var8 = Statics.field5084[var7];
            ColourUtils.method2790(false, true);
            arg0.B(arg1, (arg3.renderheight * (63 - var6) >> 6) + arg2, arg3.renderwidth, (arg3.renderheight >> 6) + 1, var8 | 0xFF000000, 0);
        }
    }

    @ObfuscatedName("ef.j(Lra;IILew;II)V")
    public static void method3303(RendererToolkit arg0, int arg1, int arg2, Component arg3, int arg4) {
        for (int var5 = 7; var5 >= 0; var5--) {
            for (int var6 = 127; var6 >= 0; var6--) {
                int var7 = (arg4 & 0x3F) << 10 | (var5 & 0x7) << 7 | var6 & 0x7F;
                ColourUtils.method8092(false, true);
                int var8 = Statics.field5084[var7];
                ColourUtils.method2790(false, true);
                arg0.B((arg3.renderwidth * var6 >> 7) + arg1, (arg3.renderheight * (7 - var5) >> 3) + arg2, (arg3.renderwidth >> 7) + 1, (arg3.renderheight >> 3) + 1, var8 | 0xFF000000, 0);
            }
        }
    }
}
