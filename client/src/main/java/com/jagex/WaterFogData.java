package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("dk")
public class WaterFogData {

    @ObfuscatedName("dk.u")
    public int colour;

    @ObfuscatedName("dk.j")
    public int scale;

    @ObfuscatedName("dk.a")
    public int field1474;

    @ObfuscatedName("dk.s")
    public int field1473;

    @ObfuscatedName("dk.c")
    public int field1470;

    @ObfuscatedName("dk.m")
    public int field1476;

    @ObfuscatedName("dk.t")
    public int field1472;

    public WaterFogData() {
    }

    public WaterFogData(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.colour = arg0;
        this.scale = arg1;
        this.field1474 = arg2;
        this.field1473 = arg3;
        this.field1470 = arg4;
        this.field1476 = arg5;
        this.field1472 = arg6;
    }

    @ObfuscatedName("dk.u(Ldk;B)Z")
    public boolean method2711(WaterFogData arg0) {
        return this.colour == arg0.colour && this.scale == arg0.scale && this.field1474 == arg0.field1474 && this.field1473 == arg0.field1473 && this.field1470 == arg0.field1470 && this.field1476 == arg0.field1476 && this.field1472 == arg0.field1472;
    }
}
