package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("fy")
public class SkyDecorType {

    @ObfuscatedName("fy.u")
    public int field2156;

    @ObfuscatedName("fy.j")
    public int field2151 = 8;

    @ObfuscatedName("fy.a")
    public int field2152;

    @ObfuscatedName("fy.s")
    public int field2153;

    @ObfuscatedName("fy.c")
    public int field2154;

    @ObfuscatedName("fy.m")
    public boolean field2159;

    @ObfuscatedName("fy.t")
    public int field2155 = 16777215;

    @ObfuscatedName("fy.l")
    public int field2150;

    @ObfuscatedName("fy.f")
    public int field2158;

    @ObfuscatedName("fy.d")
    public int field2157;

    @ObfuscatedName("fy.z")
    public int field2160;

    @ObfuscatedName("fy.u(Laet;B)V")
    public void method3595(Packet arg0) {
        while (true) {
            int var2 = arg0.g1();
            if (var2 == 0) {
                return;
            }
            this.method3593(arg0, var2);
        }
    }

    @ObfuscatedName("fy.j(Laet;II)V")
    public void method3593(Packet arg0, int arg1) {
        if (arg1 == 1) {
            this.field2151 = arg0.g2();
        } else if (arg1 == 2) {
            this.field2159 = true;
        } else if (arg1 == 3) {
            this.field2152 = arg0.g2s();
            this.field2153 = arg0.g2s();
            this.field2154 = arg0.g2s();
        } else if (arg1 == 4) {
            this.field2156 = arg0.g1();
        } else if (arg1 == 5) {
            this.field2150 = arg0.gSmart2or4null();
        } else if (arg1 == 6) {
            this.field2155 = arg0.g3();
        } else if (arg1 == 7) {
            this.field2158 = arg0.g2s();
            this.field2157 = arg0.g2s();
            this.field2160 = arg0.g2s();
        }
    }
}
