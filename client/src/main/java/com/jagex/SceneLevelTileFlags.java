package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("lg")
public class SceneLevelTileFlags {

    @ObfuscatedName("lg.l")
    public byte[][][] levelTileFlags;

    public SceneLevelTileFlags(int arg0, int arg1, int arg2) {
        this.levelTileFlags = new byte[arg0][arg1][arg2];
    }

    @ObfuscatedName("lg.u(I)V")
    public void method5799() {
        for (int var1 = 0; var1 < this.levelTileFlags.length; var1++) {
            for (int var2 = 0; var2 < this.levelTileFlags[0].length; var2++) {
                for (int var3 = 0; var3 < this.levelTileFlags[0][0].length; var3++) {
                    this.levelTileFlags[var1][var2][var3] = 0;
                }
            }
        }
    }

    @ObfuscatedName("lg.j(III)Z")
    public boolean method5797(int arg0, int arg1) {
        if (arg0 >= 0 && arg1 >= 0 && arg0 < this.levelTileFlags[3].length && arg1 < this.levelTileFlags[3][arg0].length) {
            return (this.levelTileFlags[3][arg0][arg1] & 0x2) != 0;
        } else {
            return false;
        }
    }

    @ObfuscatedName("lg.a(III)Z")
    public boolean isLinkBelow(int arg0, int arg1) {
        if (arg0 >= 0 && arg1 >= 0 && arg0 < this.levelTileFlags[1].length && arg1 < this.levelTileFlags[1][arg0].length) {
            return (this.levelTileFlags[1][arg0][arg1] & 0x2) != 0;
        } else {
            return false;
        }
    }

    @ObfuscatedName("lg.s(IIIIB)Z")
    public boolean method5795(int arg0, int arg1, int arg2, int arg3) {
        if ((this.levelTileFlags[0][arg2][arg3] & 0x2) != 0) {
            return true;
        } else if ((this.levelTileFlags[arg1][arg2][arg3] & 0x10) == 0) {
            return this.method5793(arg1, arg2, arg3) == arg0;
        } else {
            return false;
        }
    }

    @ObfuscatedName("lg.c(IIII)I")
    public int method5793(int arg0, int arg1, int arg2) {
        if ((this.levelTileFlags[arg0][arg1][arg2] & 0x8) == 0) {
            return arg0 <= 0 || (this.levelTileFlags[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
        } else {
            return 0;
        }
    }
}
