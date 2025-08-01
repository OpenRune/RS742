package com.jagex;

import deob.ObfuscatedName;
import com.jagex.libs.jagtheora.ogg.OggPacket;
import com.jagex.libs.jagtheora.ogg.OggStreamState;

@ObfuscatedName("adp")
public abstract class OggStream extends Node {

    @ObfuscatedName("adp.s")
    public final OggStreamState field9557;

    @ObfuscatedName("adp.c")
    public int field9558;

    public OggStream(OggStreamState arg0) {
        this.field9557 = arg0;
    }

    @ObfuscatedName("adp.u(Ljagtheora/ogg/OggPacket;I)V")
    public void method15152(OggPacket arg0) {
        this.method15150(arg0);
        this.field9558++;
    }

    @ObfuscatedName("adp.j(Ljagtheora/ogg/OggPacket;I)V")
    public abstract void method15150(OggPacket arg0);

    @ObfuscatedName("adp.a(I)V")
    public abstract void method15153();
}
