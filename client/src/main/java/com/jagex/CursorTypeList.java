package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("vk")
public class CursorTypeList {

    @ObfuscatedName("vk.u")
    public final Js5 field7169;

    @ObfuscatedName("vk.j")
    public final Js5 field7167;

    @ObfuscatedName("vk.a")
    public final SoftLruHashTable field7166 = new SoftLruHashTable(64);

    @ObfuscatedName("vk.s")
    public final SoftLruHashTable field7168 = new SoftLruHashTable(2);

    public CursorTypeList(ModeGame arg0, Language arg1, Js5 arg2, Js5 arg3) {
        this.field7169 = arg2;
        this.field7167 = arg3;
        this.field7169.getGroupCapacity(Js5ConfigGroup.CURSORTYPE.field1668);
    }

    @ObfuscatedName("vk.u(II)Lvv;")
    public CursorType method12378(int arg0) {
        SoftLruHashTable var2 = this.field7166;
        CursorType var3;
        synchronized (this.field7166) {
            var3 = (CursorType) this.field7166.get((long) arg0);
        }
        if (var3 != null) {
            return var3;
        }
        Js5 var5 = this.field7169;
        byte[] var6;
        synchronized (this.field7169) {
            var6 = this.field7169.fetchFile(Js5ConfigGroup.CURSORTYPE.field1668, arg0);
        }
        CursorType var8 = new CursorType();
        var8.field7162 = this;
        if (var6 != null) {
            var8.method12367(new Packet(var6));
        }
        SoftLruHashTable var9 = this.field7166;
        synchronized (this.field7166) {
            this.field7166.method7937(var8, (long) arg0);
            return var8;
        }
    }

    @ObfuscatedName("vk.j(I)V")
    public void method12372() {
        SoftLruHashTable var1 = this.field7166;
        synchronized (this.field7166) {
            this.field7166.method7922();
        }
        SoftLruHashTable var3 = this.field7168;
        synchronized (this.field7168) {
            this.field7168.method7922();
        }
    }

    @ObfuscatedName("vk.a(II)V")
    public void method12373(int arg0) {
        SoftLruHashTable var2 = this.field7166;
        synchronized (this.field7166) {
            this.field7166.method7921(arg0);
        }
        SoftLruHashTable var4 = this.field7168;
        synchronized (this.field7168) {
            this.field7168.method7921(arg0);
        }
    }

    @ObfuscatedName("vk.s(I)V")
    public void method12374() {
        SoftLruHashTable var1 = this.field7166;
        synchronized (this.field7166) {
            this.field7166.removeSoft();
        }
        SoftLruHashTable var3 = this.field7168;
        synchronized (this.field7168) {
            this.field7168.removeSoft();
        }
    }
}
