package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("dq")
public class CutsceneRoute {

    @ObfuscatedName("dq.a")
    public final int[] field1569;

    @ObfuscatedName("dq.s")
    public final int[] field1570;

    public CutsceneRoute(Packet arg0) {
        int var2 = arg0.gSmart1or2();
        this.field1569 = new int[var2];
        this.field1570 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = arg0.g1();
            this.field1569[var3] = var4;
            int var5 = arg0.g2();
            int var6 = arg0.g2();
            this.field1570[var3] = (var5 << 16) + var6;
        }
    }

    @ObfuscatedName("dq.u(Ldn;IS)V")
    public void method2891(CutsceneEntity arg0, int arg1) {
        int var3 = this.field1570[0];
        arg0.method2853(arg1, var3 >>> 16, var3 & 0xFFFF);
        PathingEntity var4 = arg0.method2854();
        var4.routeLength = 0;
        for (int var5 = this.field1569.length - 1; var5 >= 0; var5--) {
            int var6 = this.field1569[var5];
            int var7 = this.field1570[var5];
            var4.routeWaypointX[var4.routeLength] = var7 >> 16;
            var4.routeWaypointZ[var4.routeLength] = var7 & 0xFFFF;
            byte var8 = MoveSpeed.WALK.id;
            if (var6 == 0) {
                var8 = MoveSpeed.CRAWL.id;
            } else if (var6 == 2) {
                var8 = MoveSpeed.RUN.id;
            }
            var4.field8645[var4.routeLength] = var8;
            var4.routeLength++;
        }
    }
}
