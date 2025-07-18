package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("aid")
public abstract class BasicSoundPacket extends SoundPacket {

    @ObfuscatedName("aid.c")
    public int field10295;

    @ObfuscatedName("aid.m")
    public int start;

    @ObfuscatedName("aid.t")
    public int field10292;

    @ObfuscatedName("aid.l")
    public boolean field10293;

    @ObfuscatedName("aid.u()I")
    public abstract int getSampleLength();

    @ObfuscatedName("aid.j(III)Laib;")
    public abstract SoundAudioBuss create(int arg0, int arg1, int arg2);
}
