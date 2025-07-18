package com.jagex;

import deob.ObfuscatedName;
import com.jagex.libs.jaclib.memory.Stream;

@ObfuscatedName("ajy")
public class GpuPacket extends Packet {

    public GpuPacket(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("ajy.ir(F)V")
    public void method16851(float arg0) {
        int var2 = Stream.floatToRawIntBits(arg0);
        this.data[++this.pos - 1] = (byte) (var2 >> 24);
        this.data[++this.pos - 1] = (byte) (var2 >> 16);
        this.data[++this.pos - 1] = (byte) (var2 >> 8);
        this.data[++this.pos - 1] = (byte) var2;
    }

    @ObfuscatedName("ajy.ie(F)V")
    public void method16855(float arg0) {
        int var2 = Stream.floatToRawIntBits(arg0);
        this.data[++this.pos - 1] = (byte) var2;
        this.data[++this.pos - 1] = (byte) (var2 >> 8);
        this.data[++this.pos - 1] = (byte) (var2 >> 16);
        this.data[++this.pos - 1] = (byte) (var2 >> 24);
    }
}
