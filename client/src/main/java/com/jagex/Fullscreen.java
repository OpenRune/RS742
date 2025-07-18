package com.jagex;

import deob.ObfuscatedName;

import java.awt.*;

@ObfuscatedName("uw")
public final class Fullscreen {

    @ObfuscatedName("uw.u")
    public static boolean allowed = true;

    public Fullscreen() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("tm.u(Lub;I)[Lus;")
    public static FullscreenMode[] method11507(FullscreenImpl arg0) {
        int[] var1 = arg0.method11883();
        FullscreenMode[] var2 = new FullscreenMode[var1.length >> 2];
        for (int var3 = 0; var3 < var2.length; var3++) {
            FullscreenMode var4 = new FullscreenMode();
            var2[var3] = var4;
            var4.width = var1[var3 << 2];
            var4.height = var1[(var3 << 2) + 1];
            var4.bitDepth = var1[(var3 << 2) + 2];
            var4.field6706 = var1[(var3 << 2) + 3];
        }
        return var2;
    }

    @ObfuscatedName("lr.j(Lub;IIIII)Ljava/awt/Frame;")
    public static Frame method6036(FullscreenImpl arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 == 0) {
            FullscreenMode[] var5 = method11507(arg0);
            if (var5 == null) {
                return null;
            }
            boolean var6 = false;
            for (int var7 = 0; var7 < var5.length; var7++) {
                if (var5[var7].width == arg1 && var5[var7].height == arg2 && (arg4 == 0 || var5[var7].field6706 == arg4) && (!var6 || var5[var7].bitDepth > arg3)) {
                    arg3 = var5[var7].bitDepth;
                    var6 = true;
                }
            }
            if (!var6) {
                return null;
            }
        }
        Frame var8 = new Frame("Jagex Full Screen");
        var8.setResizable(false);
        arg0.method11884(var8, arg1, arg2, arg3, arg4);
        return var8;
    }

    @ObfuscatedName("cv.a(Lub;Ljava/awt/Frame;I)V")
    public static void method2431(FullscreenImpl arg0, Frame arg1) {
        arg0.method11885();
        arg1.setVisible(false);
        arg1.dispose();
    }
}
