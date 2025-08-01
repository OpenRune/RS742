package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("wp")
public class ParamTypeList {

    @ObfuscatedName("wp.u")
    public final Js5 field7291;

    @ObfuscatedName("wp.j")
    public final SoftLruHashTable field7292 = new SoftLruHashTable(64);

    public ParamTypeList(ModeGame arg0, Language arg1, Js5 arg2) {
        this.field7291 = arg2;
        if (this.field7291 != null) {
            this.field7291.getGroupCapacity(Js5ConfigGroup.PARAMTYPE.field1668);
        }
    }

    @ObfuscatedName("wp.u(IB)Lwv;")
    public ParamType get(int arg0) {
        SoftLruHashTable var2 = this.field7292;
        ParamType var3;
        synchronized (this.field7292) {
            var3 = (ParamType) this.field7292.get((long) arg0);
        }
        if (var3 != null) {
            return var3;
        }
        Js5 var5 = this.field7291;
        byte[] var6;
        synchronized (this.field7291) {
            var6 = this.field7291.fetchFile(Js5ConfigGroup.PARAMTYPE.field1668, arg0);
        }
        ParamType var8 = new ParamType();
        if (var6 != null) {
            var8.method12580(new Packet(var6));
        }
        SoftLruHashTable var9 = this.field7292;
        synchronized (this.field7292) {
            this.field7292.method7937(var8, (long) arg0);
            return var8;
        }
    }

    @ObfuscatedName("wp.j(B)V")
    public void method12595() {
        SoftLruHashTable var1 = this.field7292;
        synchronized (this.field7292) {
            this.field7292.method7922();
        }
    }

    @ObfuscatedName("wp.a(II)V")
    public void method12596(int arg0) {
        SoftLruHashTable var2 = this.field7292;
        synchronized (this.field7292) {
            this.field7292.method7921(arg0);
        }
    }

    @ObfuscatedName("wp.s(B)V")
    public void method12597() {
        SoftLruHashTable var1 = this.field7292;
        synchronized (this.field7292) {
            this.field7292.removeSoft();
        }
    }
}
