package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("eu")
public final class MonotonicTime {

    public MonotonicTime() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("kw.u(I)J")
    public static final synchronized long get() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field1575) {
            Statics.field1576 += Statics.field1575 - var0;
        }
        Statics.field1575 = var0;
        return Statics.field1576 + var0;
    }
}
