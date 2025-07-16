package com.jagex;

import deob.ObfuscatedName;
import net.runelite.rs.api.RSAbstractRasterProvider;

import java.awt.*;

@ObfuscatedName("ahd")
public abstract class PureJavaSurface extends Surface implements RSAbstractRasterProvider {

    @ObfuscatedName("ahd.u")
    public final PureJavaToolkit field9937;

    @ObfuscatedName("ahd.j")
    public final Canvas field9935;

    @ObfuscatedName("ahd.a")
    public int width;

    @ObfuscatedName("ahd.s")
    public int height;

    @ObfuscatedName("ahd.c")
    public int[] pixels;

    @ObfuscatedName("ahd.m")
    public float[] pixelsFloat;

    @ObfuscatedName("ahd.t")
    public boolean field9934;

    @ObfuscatedName("aw.n(Lyt;Ljava/awt/Canvas;IIB)Lahd;")
    public static PureJavaSurface method1885(PureJavaToolkit arg0, Canvas arg1, int arg2, int arg3) {
        return new DefaultPureJavaSurface(arg0, arg1, arg2, arg3);
    }

    public PureJavaSurface(PureJavaToolkit arg0, Canvas arg1, int arg2, int arg3) {
        this.field9935 = arg1;
        this.field9937 = arg0;
        this.width = arg2;
        this.height = arg3;
    }

    @ObfuscatedName("ahd.x(I)V")
    public void method16008() {
        this.pixels = new int[this.height * this.width];
        this.pixelsFloat = new float[this.height * this.width];
        if (this.field9934) {
            this.field9937.method13197(this.width, this.height, this.pixels, this.pixelsFloat);
        }
    }

    @ObfuscatedName("ahd.ar(II)V")
    public final void method923(int arg0, int arg1) {
        if (this.width != arg0 || this.height != arg1) {
            this.width = arg0;
            this.height = arg1;
            this.method16008();
        }
    }

    @ObfuscatedName("ahd.u()I")
    public int method921() {
        return this.width;
    }

    @ObfuscatedName("ahd.j()I")
    public int method922() {
        return this.height;
    }

    @ObfuscatedName("ahd.s()Z")
    public final boolean method954() {
        this.field9937.method13197(this.width, this.height, this.pixels, this.pixelsFloat);
        this.field9934 = true;
        return true;
    }

    @ObfuscatedName("ahd.c()Z")
    public final boolean method925() {
        this.field9934 = false;
        return true;
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public int[] getPixels() {
        return pixels;
    }

    @Override
    public void setRaster() {
        method954();
    }
}
