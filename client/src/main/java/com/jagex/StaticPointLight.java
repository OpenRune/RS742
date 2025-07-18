package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("or")
public class StaticPointLight {

    @ObfuscatedName("or.r")
    public Light field4588;

    @ObfuscatedName("or.g")
    public boolean field4587;

    @ObfuscatedName("or.y")
    public boolean field4591;

    @ObfuscatedName("or.e")
    public int field4592;

    @ObfuscatedName("or.ay")
    public short[] field4597;

    @ObfuscatedName("or.af")
    public int field4594;

    @ObfuscatedName("or.ar")
    public int field4595;

    @ObfuscatedName("or.an")
    public int field4596;

    @ObfuscatedName("or.ap")
    public int field4572;

    @ObfuscatedName("or.ag")
    public int field4598;

    @ObfuscatedName("or.as")
    public int field4599;

    public StaticPointLight(RendererToolkit arg0, int arg1, Packet arg2, int arg3) {
        if (Statics.field1598 == null) {
            method5967();
        }
        this.field4592 = arg2.g1();
        this.field4587 = (this.field4592 & 0x8) != 0;
        this.field4591 = (this.field4592 & 0x10) != 0;
        this.field4592 &= 0x7;
        int var5 = arg2.g2() << arg3;
        int var6 = arg2.g2() << arg3;
        int var7 = arg2.g2() << arg3;
        int var8 = arg2.g1();
        int var9 = var8 * 2 + 1;
        this.field4597 = new short[var9];
        for (int var10 = 0; var10 < this.field4597.length; var10++) {
            short var11 = (short) arg2.g2();
            int var12 = var11 >>> 8;
            int var13 = var11 & 0xFF;
            if (var12 >= var9) {
                var12 = var9 - 1;
            }
            if (var13 > var9 - var12) {
                var13 = var9 - var12;
            }
            this.field4597[var10] = (short) (var12 << 8 | var13);
        }
        int var14 = (var8 << arg1) + (0x1 << arg1 >> 1);
        int var15 = Statics.field5084 == null ? Statics.field5083[ColourUtils.method3444(arg2.g2()) & 0xFFFF] : Statics.field5084[arg2.g2()];
        int var16 = arg2.g1();
        this.field4594 = var16 & 0x1F;
        this.field4572 = (var16 & 0xE0) << 3;
        if (this.field4594 != 31) {
            this.method7583();
        }
        this.method7576(arg0, var5, var7, var6, var14, var15);
    }

    @ObfuscatedName("or.u(Lra;IIIIII)V")
    public void method7576(RendererToolkit arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field4588 = arg0.method534(arg1, arg2, arg3, arg4, arg5, 1.0F);
    }

    @ObfuscatedName("or.j(IIIII)V")
    public void method7577(int arg0, int arg1, int arg2, int arg3) {
        this.field4595 = arg0;
        this.field4599 = arg3;
        this.field4598 = arg2;
        this.field4596 = arg1;
    }

    @ObfuscatedName("or.a(I)V")
    public void method7583() {
        switch (this.field4594) {
            case 2:
                this.field4595 = 1;
                this.field4599 = 0;
                this.field4598 = 2048;
                this.field4596 = 2048;
                break;
            case 3:
                this.field4595 = 1;
                this.field4599 = 0;
                this.field4598 = 2048;
                this.field4596 = 4096;
                break;
            case 4:
                this.field4595 = 4;
                this.field4599 = 0;
                this.field4598 = 2048;
                this.field4596 = 2048;
                break;
            case 5:
                this.field4595 = 4;
                this.field4599 = 0;
                this.field4598 = 2048;
                this.field4596 = 8192;
                break;
            case 6:
                this.field4595 = 3;
                this.field4599 = 1280;
                this.field4598 = 768;
                this.field4596 = 2048;
                break;
            case 7:
                this.field4595 = 3;
                this.field4599 = 1280;
                this.field4598 = 768;
                this.field4596 = 4096;
                break;
            case 8:
                this.field4595 = 3;
                this.field4599 = 1024;
                this.field4598 = 1024;
                this.field4596 = 2048;
                break;
            case 9:
                this.field4595 = 3;
                this.field4599 = 1024;
                this.field4598 = 1024;
                this.field4596 = 4096;
                break;
            case 10:
                this.field4595 = 3;
                this.field4599 = 1536;
                this.field4598 = 512;
                this.field4596 = 2048;
                break;
            case 11:
                this.field4595 = 3;
                this.field4599 = 1536;
                this.field4598 = 512;
                this.field4596 = 4096;
                break;
            case 12:
                this.field4595 = 2;
                this.field4599 = 0;
                this.field4598 = 2048;
                this.field4596 = 2048;
                break;
            case 13:
                this.field4595 = 2;
                this.field4599 = 0;
                this.field4598 = 2048;
                this.field4596 = 8192;
                break;
            case 14:
                this.field4595 = 1;
                this.field4599 = 1280;
                this.field4598 = 768;
                this.field4596 = 2048;
                break;
            case 15:
                this.field4595 = 1;
                this.field4599 = 1536;
                this.field4598 = 512;
                this.field4596 = 4096;
                break;
            case 16:
                this.field4595 = 1;
                this.field4599 = 1792;
                this.field4598 = 256;
                this.field4596 = 8192;
                break;
            default:
                this.field4599 = 0;
                this.field4595 = 0;
                this.field4598 = 2048;
                this.field4596 = 2048;
        }
    }

    @ObfuscatedName("or.s(IZS)V")
    public void method7579(int arg0, boolean arg1) {
        int var4;
        if (arg1) {
            var4 = 2048;
        } else {
            int var3 = this.field4596 * arg0 / 50 + this.field4572 & 0x7FF;
            switch (this.field4595) {
                case 1:
                    var4 = (Trig1.sin[var3 << 3] >> 4) + 1024;
                    break;
                case 2:
                    var4 = var3;
                    break;
                case 3:
                    var4 = Statics.field1598[var3] >> 1;
                    break;
                case 4:
                    var4 = var3 >> 10 << 11;
                    break;
                case 5:
                    var4 = (var3 < 1024 ? var3 : 2048 - var3) << 1;
                    break;
                default:
                    var4 = 2048;
            }
        }
        this.field4588.method14883((float) ((this.field4598 * var4 >> 11) + this.field4599) / 2048.0F);
    }

    @ObfuscatedName("lc.c(I)V")
    public static void method5967() {
        Statics.field1598 = Statics.method15969(2048, 35, 8, 8, 4, 0.4F, true);
    }
}
