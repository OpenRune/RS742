package com.jagex.libs.jagtheora.theora;

import deob.ObfuscatedName;
import com.jagex.libs.jagtheora.misc.SimplePeer;

public class Frame extends SimplePeer {

    public int[] pixels;

    @ObfuscatedName("jagtheora/theora/Frame.u")
    public final int field360;

    @ObfuscatedName("jagtheora/theora/Frame.j")
    public final int field361;

    static {
        init();
    }

    public Frame(int arg0, int arg1) {
        this.field360 = arg0;
        this.field361 = arg1;
        this.pixels = new int[this.field361 * this.field360];
    }

    public static native void init();

    public native void clear();
}
