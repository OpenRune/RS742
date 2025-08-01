package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("ow")
public class HeadbarTypeList {

    @ObfuscatedName("ow.u")
    public final Js5 field4452;

    @ObfuscatedName("ow.j")
    public final Js5 field4451;

    @ObfuscatedName("ow.a")
    public final SoftLruHashTable field4453 = new SoftLruHashTable(64);

    @ObfuscatedName("ow.s")
    public SoftLruHashTable field4454 = new SoftLruHashTable(20);

    public HeadbarTypeList(ModeGame arg0, Language arg1, Js5 arg2, Js5 arg3) {
        this.field4451 = arg3;
        this.field4452 = arg2;
        this.field4452.getGroupCapacity(Js5ConfigGroup.HEADBARTYPE.field1668);
    }

    @ObfuscatedName("ow.u(IB)Loe;")
    public HeadbarType method7334(int arg0) {
        SoftLruHashTable var2 = this.field4453;
        HeadbarType var3;
        synchronized (this.field4453) {
            var3 = (HeadbarType) this.field4453.get((long) arg0);
        }
        if (var3 != null) {
            return var3;
        }
        Js5 var5 = this.field4452;
        byte[] var6;
        synchronized (this.field4452) {
            var6 = this.field4452.fetchFile(Js5ConfigGroup.HEADBARTYPE.field1668, arg0);
        }
        HeadbarType var8 = new HeadbarType();
        var8.field4439 = this;
        if (var6 != null) {
            var8.method7302(new Packet(var6));
        }
        SoftLruHashTable var9 = this.field4453;
        synchronized (this.field4453) {
            this.field4453.method7937(var8, (long) arg0);
            return var8;
        }
    }

    @ObfuscatedName("ow.j(I)V")
    public void method7329() {
        SoftLruHashTable var1 = this.field4453;
        synchronized (this.field4453) {
            this.field4453.method7922();
        }
        SoftLruHashTable var3 = this.field4454;
        synchronized (this.field4454) {
            this.field4454.method7922();
        }
    }

    @ObfuscatedName("ow.a(II)V")
    public void method7327(int arg0) {
        SoftLruHashTable var2 = this.field4453;
        synchronized (this.field4453) {
            this.field4453.method7921(arg0);
        }
        SoftLruHashTable var4 = this.field4454;
        synchronized (this.field4454) {
            this.field4454.method7921(arg0);
        }
    }

    @ObfuscatedName("ow.s(I)V")
    public void method7331() {
        SoftLruHashTable var1 = this.field4453;
        synchronized (this.field4453) {
            this.field4453.removeSoft();
        }
        SoftLruHashTable var3 = this.field4454;
        synchronized (this.field4454) {
            this.field4454.removeSoft();
        }
    }
}
