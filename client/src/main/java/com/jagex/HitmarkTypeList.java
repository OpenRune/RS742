package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("pb")
public class HitmarkTypeList {

    @ObfuscatedName("pb.u")
    public final Js5 field4760;

    @ObfuscatedName("pb.j")
    public final Js5 field4757;

    @ObfuscatedName("pb.a")
    public SoftLruHashTable field4759 = new SoftLruHashTable(20);

    @ObfuscatedName("pb.s")
    public final SoftLruHashTable field4758 = new SoftLruHashTable(64);

    public HitmarkTypeList(ModeGame arg0, Language arg1, Js5 arg2, Js5 arg3) {
        this.field4757 = arg3;
        this.field4760 = arg2;
        this.field4760.getGroupCapacity(Js5ConfigGroup.HITMARKTYPE.field1668);
    }

    @ObfuscatedName("pb.u(II)Lpo;")
    public HitmarkType method7826(int arg0) {
        SoftLruHashTable var2 = this.field4758;
        HitmarkType var3;
        synchronized (this.field4758) {
            var3 = (HitmarkType) this.field4758.get((long) arg0);
        }
        if (var3 != null) {
            return var3;
        }
        Js5 var5 = this.field4760;
        byte[] var6;
        synchronized (this.field4760) {
            var6 = this.field4760.fetchFile(Js5ConfigGroup.HITMARKTYPE.field1668, arg0);
        }
        HitmarkType var8 = new HitmarkType();
        var8.field4754 = this;
        if (var6 != null) {
            var8.method7791(new Packet(var6));
        }
        SoftLruHashTable var9 = this.field4758;
        synchronized (this.field4758) {
            this.field4758.method7937(var8, (long) arg0);
            return var8;
        }
    }

    @ObfuscatedName("pb.j(I)V")
    public void method7817() {
        SoftLruHashTable var1 = this.field4758;
        synchronized (this.field4758) {
            this.field4758.method7922();
        }
        SoftLruHashTable var3 = this.field4759;
        synchronized (this.field4759) {
            this.field4759.method7922();
        }
    }

    @ObfuscatedName("pb.a(II)V")
    public void method7818(int arg0) {
        SoftLruHashTable var2 = this.field4758;
        synchronized (this.field4758) {
            this.field4758.method7921(arg0);
        }
        SoftLruHashTable var4 = this.field4759;
        synchronized (this.field4759) {
            this.field4759.method7921(arg0);
        }
    }

    @ObfuscatedName("pb.s(I)V")
    public void method7819() {
        SoftLruHashTable var1 = this.field4758;
        synchronized (this.field4758) {
            this.field4758.removeSoft();
        }
        SoftLruHashTable var3 = this.field4759;
        synchronized (this.field4759) {
            this.field4759.removeSoft();
        }
    }
}
