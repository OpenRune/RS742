package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("mj")
public class CameraHelpers {

    public CameraHelpers() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("or.u(Lkn;I)F")
    public static float method7588(Quaternion arg0) {
        Vector3 var1 = Vector3.create(0.0F, 0.0F, 1.0F);
        var1.method5318(arg0);
        double var2 = 1.5707963267948966D - Math.acos((double) var1.y);
        var1.release();
        return (float) var2;
    }

    @ObfuscatedName("gi.j(FFI)F")
    public static float method4037(float arg0, float arg1) {
        double var2 = Math.atan2((double) arg0, (double) arg1);
        if (var2 < 0.0D) {
            var2 = var2 + 3.141592653589793D + 3.141592653589793D;
        }
        return (float) var2;
    }

    @ObfuscatedName("ap.a(Lkn;I)F")
    public static float method1721(Quaternion arg0) {
        Vector3 var1 = Vector3.create(0.0F, 0.0F, 1.0F);
        var1.method5318(arg0);
        double var2 = Math.atan2((double) var1.x, (double) var1.z);
        var1.release();
        if (var2 < 0.0D) {
            var2 = var2 + 3.141592653589793D + 3.141592653589793D;
        }
        return (float) var2;
    }
}
