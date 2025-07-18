package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("rd")
public class FloorOverlayTypeList {

    @ObfuscatedName("rd.u")
    public final Js5 field5106;

    @ObfuscatedName("rd.j")
    public int field5105;

    @ObfuscatedName("rd.a")
    public final SoftLruHashTable field5107 = new SoftLruHashTable(64);

    @ObfuscatedName("rd.s")
    public int field5108 = 0;

    public FloorOverlayTypeList(ModeGame arg0, Language arg1, Js5 arg2) {
        this.field5106 = arg2;
        this.field5105 = this.field5106.getGroupCapacity(Js5ConfigGroup.FLOTYPE.field1668);
    }

    @ObfuscatedName("rd.u(IS)Lry;")
    public FloorOverlayType method8503(int arg0) {
        SoftLruHashTable var2 = this.field5107;
        FloorOverlayType var3;
        synchronized (this.field5107) {
            var3 = (FloorOverlayType) this.field5107.get((long) arg0);
        }
        if (var3 != null) {
            return var3;
        }
        Js5 var5 = this.field5106;
        byte[] var6;
        synchronized (this.field5106) {
            var6 = this.field5106.fetchFile(Js5ConfigGroup.FLOTYPE.field1668, arg0);
        }
        FloorOverlayType var8 = new FloorOverlayType();
        var8.field5088 = this;
        var8.field5089 = arg0;
        if (var6 != null) {
            var8.method8494(new Packet(var6));
        }
        var8.method8489();
        SoftLruHashTable var9 = this.field5107;
        synchronized (this.field5107) {
            this.field5107.method7937(var8, (long) arg0);
            return var8;
        }
    }

    @ObfuscatedName("rd.j(I)V")
    public void method8500() {
        SoftLruHashTable var1 = this.field5107;
        synchronized (this.field5107) {
            this.field5107.method7922();
        }
    }

    @ObfuscatedName("rd.a(IB)V")
    public void method8501(int arg0) {
        SoftLruHashTable var2 = this.field5107;
        synchronized (this.field5107) {
            this.field5107.method7921(arg0);
        }
    }

    @ObfuscatedName("rd.s(I)V")
    public void method8502() {
        SoftLruHashTable var1 = this.field5107;
        synchronized (this.field5107) {
            this.field5107.removeSoft();
        }
    }
}
