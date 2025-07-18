package com.jagex;

import deob.ObfuscatedName;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.io.IOException;
import java.io.InputStream;

@ObfuscatedName("kb")
public class PreLoadingScreen implements LoadingScreen {

    @ObfuscatedName("kb.u")
    public boolean field3364;

    @ObfuscatedName("kb.j")
    public Font field3360;

    @ObfuscatedName("kb.a")
    public FontMetrics field3361;

    @ObfuscatedName("kb.s")
    public Color field3359;

    @ObfuscatedName("kb.c")
    public Image field3362;

    @ObfuscatedName("kb.m")
    public Image field3383;

    @ObfuscatedName("kb.t")
    public Image field3365;

    @ObfuscatedName("kb.l")
    public Image field3363;

    @ObfuscatedName("kb.f")
    public Image field3367;

    @ObfuscatedName("kb.d")
    public Image field3368;

    @ObfuscatedName("kb.z")
    public Image field3371;

    @ObfuscatedName("kb.n")
    public Image field3370;

    @ObfuscatedName("kb.o")
    public Image field3369;

    @ObfuscatedName("kb.q")
    public Image field3372;

    @ObfuscatedName("kb.p")
    public boolean field3373;

    @ObfuscatedName("kb.w")
    public boolean field3366;

    @ObfuscatedName("kb.b")
    public int field3375;

    @ObfuscatedName("kb.x")
    public int field3382;

    @ObfuscatedName("kb.i")
    public int field3377;

    @ObfuscatedName("kb.v")
    public int field3378;

    @ObfuscatedName("kb.k")
    public int field3379;

    @ObfuscatedName("kb.h")
    public int field3380;

    @ObfuscatedName("kb.r")
    public int field3381;

    @ObfuscatedName("kb.g")
    public int field3376;

    @ObfuscatedName("kb.y")
    public int field3374;

    @ObfuscatedName("kb.u(II)I")
    public final int method4980(int arg0) {
        return this.field3373 ? (GameShell.canvasWid - arg0) / 2 : 0;
    }

    @ObfuscatedName("kb.j(IB)I")
    public final int method4989(int arg0) {
        return this.field3366 ? (GameShell.canvasHei - arg0) / 2 : 0;
    }

    @ObfuscatedName("kb.a(ZB)V")
    public void method4982(boolean arg0) {
        if (!this.field3364 && this.field3360 == null) {
            try {
                String[] var2 = StringTools.method11508(client.field9020, ',');
                if (var2.length != 23) {
                    this.field3364 = true;
                }
                this.field3373 = Boolean.parseBoolean(var2[0]);
                this.field3366 = Boolean.parseBoolean(var2[1]);
                this.field3375 = StringTools.parseInt(var2[2]);
                this.field3382 = StringTools.parseInt(var2[3]);
                this.field3377 = StringTools.parseInt(var2[4]);
                this.field3378 = StringTools.parseInt(var2[5]);
                this.field3379 = StringTools.parseInt(var2[6]);
                this.field3380 = StringTools.parseInt(var2[7]);
                this.field3381 = StringTools.parseInt(var2[8]);
                this.field3376 = StringTools.parseInt(var2[9]);
                String var3 = var2[10];
                int var4 = StringTools.parseInt(var2[11]);
                int var5 = StringTools.method4773(var2[12].substring(2), 16);
                this.field3360 = new Font(var3, 0, var4);
                this.field3361 = GameShell.canvas.getFontMetrics(this.field3360);
                this.field3359 = new Color(var5);
                MediaTracker var6 = new MediaTracker(GameShell.canvas);
                this.field3362 = this.method5008(var2[13]);
                var6.addImage(this.field3362, 0);
                this.field3383 = this.method5008(var2[14]);
                var6.addImage(this.field3383, 1);
                this.field3365 = this.method5008(var2[15]);
                var6.addImage(this.field3365, 2);
                this.field3363 = this.method5008(var2[16]);
                var6.addImage(this.field3363, 3);
                this.field3367 = this.method5008(var2[17]);
                var6.addImage(this.field3367, 4);
                this.field3368 = this.method5008(var2[18]);
                var6.addImage(this.field3368, 5);
                this.field3371 = this.method5008(var2[19]);
                var6.addImage(this.field3371, 6);
                this.field3370 = this.method5008(var2[20]);
                var6.addImage(this.field3370, 7);
                this.field3369 = this.method5008(var2[21]);
                var6.addImage(this.field3369, 8);
                var6.waitForAll();
                this.field3374 = StringTools.parseInt(var2[22]);
            } catch (Exception var49) {
                this.field3364 = true;
            }
        }
        if (this.field3364) {
            this.method4984();
            return;
        }
        Graphics var8 = GameShell.canvas.getGraphics();
        if (var8 == null) {
            GameShell.canvas.repaint();
            return;
        }
        try {
            int var9 = Statics.field6789.method4974();
            String var10 = Statics.field6789.method4959();
            if (Statics.field1209 == null) {
                Statics.field1209 = GameShell.canvas.createImage(GameShell.canvasWid, GameShell.canvasHei);
            }
            Graphics var11 = Statics.field1209.getGraphics();
            var11.setColor(Color.BLACK);
            var11.fillRect(0, 0, GameShell.canvasWid, GameShell.canvasHei);
            int var12 = this.field3371.getWidth(null);
            int var13 = this.field3370.getWidth(null);
            int var14 = this.field3369.getWidth(null);
            int var15 = this.field3371.getHeight(null);
            int var16 = this.field3370.getHeight(null);
            int var17 = this.field3369.getHeight(null);
            var11.drawImage(this.field3371, this.method4980(var12) + this.field3379 - this.field3381 / 2, this.method4989(var15) + this.field3380, null);
            int var18 = this.field3379 - this.field3381 / 2 + var12;
            int var19 = this.field3381 / 2 + this.field3379;
            for (int var20 = var18; var20 <= var19; var20 += var14) {
                var11.drawImage(this.field3369, this.method4980(var12) + this.field3379 + var20, this.method4989(var17) + this.field3380, null);
            }
            var11.drawImage(this.field3370, this.method4980(var13) + this.field3379 + this.field3381 / 2, this.method4989(var16) + this.field3380, null);
            int var21 = this.field3365.getWidth(null);
            int var22 = this.field3365.getHeight(null);
            int var23 = this.field3363.getWidth(null);
            int var24 = this.field3363.getHeight(null);
            int var25 = this.field3368.getHeight(null);
            int var26 = this.field3367.getWidth(null);
            int var27 = this.field3367.getHeight(null);
            int var28 = this.field3368.getWidth(null);
            int var29 = this.field3362.getWidth(null);
            int var30 = this.field3383.getWidth(null);
            int var31 = this.method4980(this.field3377) + this.field3375;
            int var32 = this.method4989(this.field3378) + this.field3382;
            var11.drawImage(this.field3365, var31, (this.field3378 - var22) / 2 + var32, null);
            var11.drawImage(this.field3363, this.field3377 + var31 - var23, (this.field3378 - var24) / 2 + var32, null);
            if (this.field3372 == null) {
                this.field3372 = GameShell.canvas.createImage(this.field3377 - var21 - var23, this.field3378);
            }
            Graphics var33 = this.field3372.getGraphics();
            for (int var34 = 0; var34 < this.field3377 - var21 - var23; var34 += var26) {
                var33.drawImage(this.field3367, var34, 0, null);
            }
            for (int var35 = 0; var35 < this.field3377 - var21 - var23; var35 += var28) {
                var33.drawImage(this.field3368, var35, this.field3378 - var25, null);
            }
            int var36 = (this.field3377 - var21 - var23) * var9 / 100;
            if (var36 > 0) {
                Image var37 = GameShell.canvas.createImage(var36, this.field3378 - var27 - var25);
                int var38 = var37.getWidth(null);
                Graphics var39 = var37.getGraphics();
                int var40 = this.field3374 * Loading.method3587() / 10 % var29;
                for (int var41 = var40 - var29; var41 < var38; var41 += var29) {
                    var39.drawImage(this.field3362, var41, 0, null);
                }
                var33.drawImage(var37, 0, var27, null);
            }
            int var43 = this.field3377 - var21 - var23 - var36;
            if (var43 > 0) {
                Image var44 = GameShell.canvas.createImage(var43, this.field3378 - var27 - var25);
                int var45 = var44.getWidth(null);
                Graphics var46 = var44.getGraphics();
                for (int var47 = 0; var47 < var45; var47 += var30) {
                    var46.drawImage(this.field3383, var47, 0, null);
                }
                var33.drawImage(var44, var36, var27, null);
            }
            var11.drawImage(this.field3372, var21 + var31, var32, null);
            var11.setFont(this.field3360);
            var11.setColor(this.field3359);
            var11.drawString(var10, var31 + (this.field3377 - this.field3361.stringWidth(var10)) / 2, this.field3376 + this.field3378 / 2 + var32 + 4);
            var8.drawImage(Statics.field1209, 0, 0, null);
        } catch (Exception var50) {
            this.field3364 = true;
        }
    }

    @ObfuscatedName("kb.s(Ljava/lang/String;I)Ljava/awt/Image;")
    public Image method5008(String arg0) throws IOException {
        try {
            InputStream var2 = Statics.field6387.getClass().getClassLoader().getResourceAsStream(arg0);
            byte[] var3 = new byte[4000];
            int var4 = 0;
            int var5;
            while ((var5 = var2.read()) != -1) {
                var3[var4++] = (byte) var5;
            }
            return Toolkit.getDefaultToolkit().createImage(var3);
        } catch (Exception var8) {
            throw new IOException();
        }
    }

    @ObfuscatedName("kb.c(I)V")
    public void method4984() {
        GameShell.method4801(Statics.field6789.method4974(), Statics.field6789.method4959(), client.loadingBarFillColour[client.loadingBarTheme], client.loadingBarOutlineColour[client.loadingBarTheme], client.loadingBarTextColour[client.loadingBarTheme]);
    }

    @ObfuscatedName("kb.m(I)V")
    public void method4985() {
        GameShell.method1947();
    }

    @ObfuscatedName("kb.t(B)V")
    public void method5006() {
    }

    @ObfuscatedName("kb.l(I)I")
    public int method4981() {
        return 100;
    }

    @ObfuscatedName("kb.f(J)Z")
    public boolean method4988(long arg0) {
        return true;
    }

    @ObfuscatedName("kb.d(I)I")
    public int method4983() {
        return 0;
    }
}
