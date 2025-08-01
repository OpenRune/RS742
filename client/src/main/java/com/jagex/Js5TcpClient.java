package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("lo")
public abstract class Js5TcpClient {

    @ObfuscatedName("lo.c")
    public SecondaryLinkedList field3594 = new SecondaryLinkedList();

    @ObfuscatedName("lo.m")
    public SecondaryLinkedList field3595 = new SecondaryLinkedList();

    @ObfuscatedName("lo.t")
    public SecondaryLinkedList field3605 = new SecondaryLinkedList();

    @ObfuscatedName("lo.l")
    public SecondaryLinkedList field3596 = new SecondaryLinkedList();

    @ObfuscatedName("lo.f")
    public int field3598;

    @ObfuscatedName("lo.d")
    public long field3599;

    @ObfuscatedName("lo.z")
    public Packet field3597 = new Packet(6);

    @ObfuscatedName("lo.n")
    public byte field3601 = 0;

    @ObfuscatedName("lo.o")
    public volatile int errorCount = 0;

    @ObfuscatedName("lo.q")
    public volatile int js5State = 0;

    @ObfuscatedName("lo.p")
    public Packet field3590 = new Packet(10);

    @ObfuscatedName("lo.w")
    public Js5NetRequest field3592;

    @ObfuscatedName("lo.u(IIBZB)Lalp;")
    public Js5NetRequest method5765(int arg0, int arg1, byte arg2, boolean arg3) {
        long var5 = ((long) arg0 << 32) + (long) arg1;
        Js5NetRequest var7 = new Js5NetRequest();
        var7.secondaryKey = var5;
        var7.field10598 = arg2;
        var7.field10354 = arg3;
        if (arg3) {
            if (this.method5764() >= 50) {
                throw new RuntimeException();
            }
            this.field3594.addFirst(var7);
        } else if (this.method5739() < 20) {
            this.field3605.addFirst(var7);
        } else {
            throw new RuntimeException();
        }
        return var7;
    }

    @ObfuscatedName("lo.j(I)Z")
    public boolean method5737() {
        return this.method5739() >= 20;
    }

    @ObfuscatedName("lo.a(I)Z")
    public boolean method5738() {
        return this.method5764() >= 50;
    }

    @ObfuscatedName("lo.s(B)I")
    public int method5739() {
        return this.field3605.size() + this.field3596.size();
    }

    @ObfuscatedName("lo.c(B)I")
    public int method5764() {
        return this.field3594.size() + this.field3595.size();
    }

    @ObfuscatedName("lo.m(I)V")
    public abstract void method5741();

    @ObfuscatedName("lo.t(I)Z")
    public abstract boolean process();

    @ObfuscatedName("lo.l(Ljava/lang/Object;ZI)V")
    public abstract void createNewJs5Stream(Object arg0, boolean arg1);

    @ObfuscatedName("lo.f(ZB)V")
    public abstract void method5744(boolean arg0);

    @ObfuscatedName("lo.d(B)V")
    public abstract void method5745();

    @ObfuscatedName("lo.n(B)V")
    public abstract void method5747();

    @ObfuscatedName("lo.z(I)V")
    public abstract void method5777();
}
