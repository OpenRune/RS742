package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("ph")
public class MapElementTypeList {

    @ObfuscatedName("ph.u")
    public final Js5 field4809;

    @ObfuscatedName("ph.j")
    public final Js5 field4806;

    @ObfuscatedName("ph.c")
    public SoftLruHashTable field4808 = new SoftLruHashTable(128);

    @ObfuscatedName("ph.m")
    public SoftLruHashTable field4810 = new SoftLruHashTable(64);

    public MapElementTypeList(ModeGame arg0, Language arg1, Js5 arg2, Js5 arg3) {
        this.field4809 = arg2;
        this.field4806 = arg3;
        this.field4809.getGroupCapacity(Js5ConfigGroup.MELTYPE.field1668);
    }

    @ObfuscatedName("ph.u(II)Lpw;")
    public MapElementType method7862(int arg0) {
        SoftLruHashTable var2 = this.field4808;
        MapElementType var3;
        synchronized (this.field4808) {
            var3 = (MapElementType) this.field4808.get((long) arg0);
        }
        if (var3 != null) {
            return var3;
        }
        Js5 var5 = this.field4809;
        byte[] var6;
        synchronized (this.field4809) {
            var6 = this.field4809.fetchFile(Js5ConfigGroup.MELTYPE.field1668, arg0);
        }
        MapElementType var8 = new MapElementType();
        var8.field4763 = arg0;
        var8.field4798 = this;
        if (var6 != null) {
            var8.method7836(new Packet(var6));
        }
        var8.method7853();
        SoftLruHashTable var9 = this.field4808;
        synchronized (this.field4808) {
            this.field4808.method7937(var8, (long) arg0);
            return var8;
        }
    }

    @ObfuscatedName("ph.j(III)V")
    public void resizeCache(int arg0, int arg1) {
        this.field4808 = new SoftLruHashTable(arg0);
        this.field4810 = new SoftLruHashTable(arg1);
    }

    @ObfuscatedName("ph.a(I)V")
    public void clearCache() {
        SoftLruHashTable var1 = this.field4808;
        synchronized (this.field4808) {
            this.field4808.method7922();
        }
        SoftLruHashTable var3 = this.field4810;
        synchronized (this.field4810) {
            this.field4810.method7922();
        }
    }

    @ObfuscatedName("ph.s(IS)V")
    public void method7865(int arg0) {
        SoftLruHashTable var2 = this.field4808;
        synchronized (this.field4808) {
            this.field4808.method7921(arg0);
        }
        SoftLruHashTable var4 = this.field4810;
        synchronized (this.field4810) {
            this.field4810.method7921(arg0);
        }
    }

    @ObfuscatedName("ph.c(I)V")
    public void method7866() {
        SoftLruHashTable var1 = this.field4808;
        synchronized (this.field4808) {
            this.field4808.removeSoft();
        }
        SoftLruHashTable var3 = this.field4810;
        synchronized (this.field4810) {
            this.field4810.removeSoft();
        }
    }
}
