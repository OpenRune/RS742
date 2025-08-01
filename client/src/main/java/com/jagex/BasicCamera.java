package com.jagex;

import deob.ObfuscatedName;

import java.util.Iterator;

@ObfuscatedName("aax")
public class BasicCamera extends Camera {

    @ObfuscatedName("aax.an")
    public int field8657 = 0;

    public BasicCamera(CameraTrackableProvider arg0) {
        super(CameraRelated.field2189, arg0);
    }

    @ObfuscatedName("aax.ek(I)I")
    public int method14032() {
        this.field8657++;
        if (this.field8657 == 126) {
            this.field8657 = 0;
        }
        return this.field8657;
    }

    @ObfuscatedName("aax.ep(Laet;IB)V")
    public void method14033(Packet arg0, int arg1) {
        int var3 = arg0.pos;
        int var4 = arg0.g1();
        this.method3691(CameraControlMode.method1411(var4 & 0x1));
        LookatMode var5 = LookatMode.method12904(var4 >> 1 & 0x3);
        if (this.field2221 != var5) {
            try {
                this.method3692(var5, true);
            } catch (CameraException var20) {
                var20.printStackTrace();
            }
        }
        PositionMode var7 = PositionMode.method3450(var4 >> 3 & 0x3);
        if (this.field2234 != var7) {
            try {
                this.method3693(var7, true);
            } catch (CameraException var19) {
                var19.printStackTrace();
            }
        }
        if ((var4 >> 7 & 0x1) == 1) {
            int var9 = arg0.g2();
            if ((var9 >> CameraSettingType.field2180.field2186 & 0x1) == 1) {
                this.field2229.method5292(arg0);
            }
            if ((var9 >> CameraSettingType.field2181.field2186 & 0x1) == 1) {
                this.field2230.method5292(arg0);
            }
            if ((var9 >> CameraSettingType.field2173.field2186 & 0x1) == 1) {
                this.field2232.method5292(arg0);
            }
            if ((var9 >> CameraSettingType.field2174.field2186 & 0x1) == 1) {
                this.field2233.method5292(arg0);
            }
            if ((var9 >> CameraSettingType.field2177.field2186 & 0x1) == 1) {
                this.field2223 = arg0.gFloat();
                this.field2239 = arg0.gFloat();
            }
            if ((var9 >> CameraSettingType.field2176.field2186 & 0x1) == 1) {
                this.field2218 = arg0.gFloat();
                this.field2241 = arg0.gFloat();
            }
            if ((var9 >> CameraSettingType.field2171.field2186 & 0x1) == 1) {
                this.field2220 = CameraProjectionMode.method8664(arg0.g1());
            }
            if ((var9 >> CameraSettingType.field2178.field2186 & 0x1) == 1) {
                this.field2238 = arg0.g3();
                arg0.g1();
            }
            if ((var9 >> CameraSettingType.field2179.field2186 & 0x1) == 1) {
                int var10 = arg0.g1();
                this.field2242 = (var10 & 0x1) == 1;
                this.field2243 = (var10 & 0x2) == 2;
            }
            if ((var9 >> CameraSettingType.field2175.field2186 & 0x1) == 1) {
                int var11 = arg0.g1();
                for (int var12 = 0; var12 < var11; var12++) {
                    int var13 = arg0.g1();
                    int var14 = arg0.g1();
                    if (var13 == 0) {
                        this.removeEffect(var14);
                    } else {
                        CameraEffectType var15 = CameraEffectType.method7654(arg0.g1());
                        boolean var16 = true;
                        Iterator var17 = this.field2225.iterator();
                        while (var17.hasNext()) {
                            CameraEffect var18 = (CameraEffect) var17.next();
                            if (var18.field10351 == var14) {
                                var18.method16671(arg0);
                                var16 = false;
                                break;
                            }
                        }
                        if (var16) {
                            this.method3709(CameraEffect.method15441(var14, var15, arg0));
                        }
                    }
                }
            }
            if ((var9 >> CameraSettingType.field2172.field2186 & 0x1) == 1) {
                this.field2244 = arg0.g2();
                this.field2236 = arg0.gFloat();
            }
            if ((var9 >> CameraSettingType.field2182.field2186 & 0x1) == 1) {
                this.field2226 = CameraLinearMovementMode.method1955(arg0.g1());
            }
            if ((var9 >> CameraSettingType.field2183.field2186 & 0x1) == 1) {
                this.field2246.method5292(arg0);
                this.field2235.method5292(arg0);
                this.field2245 = arg0.gFloat();
                this.field2237 = arg0.gFloat();
            }
            if ((var9 >> CameraSettingType.field2184.field2186 & 0x1) == 1) {
                arg0.gFloat();
            }
            if ((var9 >> CameraSettingType.field2185.field2186 & 0x1) == 1) {
                this.field2228 = arg0.gFloat();
            }
        }
        if (this.field2222 != null && (var4 >> 5 & 0x1) == 1) {
            this.field2222.method11542(arg0);
        }
        if (this.field2224 != null && (var4 >> 6 & 0x1) == 1) {
            this.field2224.method4018(arg0);
        }
        if (arg0.pos - var3 != arg1) {
            throw new RuntimeException(arg0.pos - var3 + "," + arg1);
        }
    }
}
