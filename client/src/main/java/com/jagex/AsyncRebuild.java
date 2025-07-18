package com.jagex;

import deob.ObfuscatedName;

import java.util.LinkedList;

@ObfuscatedName("la")
public class AsyncRebuild implements Runnable {

    @ObfuscatedName("la.u")
    public volatile boolean field3771 = false;

    @ObfuscatedName("la.j")
    public LinkedList field3772 = new LinkedList();

    @ObfuscatedName("la.a")
    public World field3773 = new World(true);

    @ObfuscatedName("la.u(Ltz;I)V")
    public void method6038(LocTypeList arg0) {
        this.field3773.method6159(arg0);
    }

    @ObfuscatedName("la.j(Lmo;B)V")
    public void method6053(RebuildRequest arg0) {
        LinkedList var2 = this.field3772;
        synchronized (this.field3772) {
            this.field3772.add(arg0);
            this.field3772.notify();
        }
    }

    @ObfuscatedName("la.a(S)Z")
    public boolean processingRequest() {
        return this.field3771;
    }

    @ObfuscatedName("la.s(I)Lml;")
    public World method6040() {
        return this.field3773;
    }

    @ObfuscatedName("la.c(Lml;I)V")
    public void method6041(World arg0) {
        this.field3773 = arg0;
    }

    public void run() {
        while (true) {
            this.method6043();
        }
    }

    @ObfuscatedName("la.m(B)V")
    public void method6043() {
        Object var1 = null;
        LinkedList var2 = this.field3772;
        RebuildRequest var4;
        synchronized (this.field3772) {
            try {
                this.field3772.wait();
            } catch (InterruptedException var14) {
            }
            var4 = (RebuildRequest) this.field3772.pollFirst();
        }
        try {
            if (var4 != null) {
                this.field3771 = true;
                this.method6044(var4);
            }
        } catch (Exception var12) {
        } finally {
            this.field3771 = false;
        }
    }

    @ObfuscatedName("la.t(Lmo;I)V")
    public void method6044(RebuildRequest arg0) {
        if (RebuildType.field3842 == arg0.rebuildType) {
            this.field3773.method6102();
        } else {
            this.field3773.method6135(arg0);
        }
        for (boolean var2 = this.field3773.method6128(); !var2; var2 = this.field3773.method6128()) {
        }
        this.field3773.completeRebuild();
        client.world.completeRebuild();
    }
}
