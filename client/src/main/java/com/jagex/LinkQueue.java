package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("tf")
public class LinkQueue {

    @ObfuscatedName("tf.u")
    public Link field6649 = new Link();

    @ObfuscatedName("tf.j")
    public Link field6650;

    public LinkQueue() {
        this.field6649.field4223 = this.field6649;
        this.field6649.field4224 = this.field6649;
    }

    @ObfuscatedName("tf.u(I)V")
    public void method11653() {
        while (true) {
            Link var1 = this.field6649.field4223;
            if (this.field6649 == var1) {
                this.field6650 = null;
                return;
            }
            var1.method6975();
        }
    }

    @ObfuscatedName("tf.j(Lnq;I)V")
    public void method11640(Link arg0) {
        if (arg0.field4224 != null) {
            arg0.method6975();
        }
        arg0.field4224 = this.field6649.field4224;
        arg0.field4223 = this.field6649;
        arg0.field4224.field4223 = arg0;
        arg0.field4223.field4224 = arg0;
    }

    @ObfuscatedName("tf.a(Lnq;B)V")
    public void method11641(Link arg0) {
        if (arg0.field4224 != null) {
            arg0.method6975();
        }
        arg0.field4224 = this.field6649;
        arg0.field4223 = this.field6649.field4223;
        arg0.field4224.field4223 = arg0;
        arg0.field4223.field4224 = arg0;
    }

    @ObfuscatedName("ae.s(Lnq;Lnq;I)V")
    public static void method1968(Link arg0, Link arg1) {
        if (arg0.field4224 != null) {
            arg0.method6975();
        }
        arg0.field4224 = arg1;
        arg0.field4223 = arg1.field4223;
        arg0.field4224.field4223 = arg0;
        arg0.field4223.field4224 = arg0;
    }

    @ObfuscatedName("tf.c(I)Lnq;")
    public Link method11642() {
        Link var1 = this.field6649.field4223;
        if (this.field6649 == var1) {
            return null;
        } else {
            var1.method6975();
            return var1;
        }
    }

    @ObfuscatedName("tf.m(I)Lnq;")
    public Link method11649() {
        Link var1 = this.field6649.field4223;
        if (this.field6649 == var1) {
            this.field6650 = null;
            return null;
        } else {
            this.field6650 = var1.field4223;
            return var1;
        }
    }

    @ObfuscatedName("tf.t(B)Lnq;")
    public Link method11644() {
        Link var1 = this.field6650;
        if (this.field6649 == var1) {
            this.field6650 = null;
            return null;
        } else {
            this.field6650 = var1.field4223;
            return var1;
        }
    }

    @ObfuscatedName("tf.l(B)Z")
    public boolean method11647() {
        return this.field6649.field4223 == this.field6649;
    }
}
