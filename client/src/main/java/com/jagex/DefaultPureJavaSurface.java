package com.jagex;

import deob.ObfuscatedName;
import net.runelite.rs.api.RSRasterProvider;

import java.awt.*;
import java.awt.Component;
import java.awt.image.*;
import java.util.Hashtable;

@ObfuscatedName("akl")
public final class DefaultPureJavaSurface extends PureJavaSurface implements RSRasterProvider {

    @ObfuscatedName("akl.l")
    public Image image;

    public DefaultPureJavaSurface(PureJavaToolkit arg0, Canvas arg1, int arg2, int arg3) {
        super(arg0, arg1, arg2, arg3);
        new Rectangle();
        this.method16008();
    }

    @ObfuscatedName("akl.x(I)V")
    public void method16008() {
        super.method16008();
        DataBufferInt var1 = new DataBufferInt(this.pixels, this.pixels.length);
        DirectColorModel var2 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var3 = Raster.createWritableRaster(var2.createCompatibleSampleModel(this.width, this.height), var1, null);
        this.image = new BufferedImage(var2, var3, false, new Hashtable());
    }

    @ObfuscatedName("akl.ay()I")
    public int method918() {
        return this.method919(0, 0);
    }



    @ObfuscatedName("akl.af(II)I")
    public final int method919(int arg0, int arg1) {
        Graphics var3 = this.field9935.getGraphics();
        if (var3 == null) {
            return 0;
        } else {
            client.instance.getCallbacks().draw(this, this.field9935.getGraphics(), arg0, arg1);
            return 0;
        }
    }

    @ObfuscatedName("akl.a()V")
    public void method944() {
    }

    @Override
    public Image getImage() {
        return image;
    }

    @Override
    public void setImage(Image image) {
        this.image = image;
    }

    @Override
    public Component getCanvas() {
        return field9935;
    }
}
