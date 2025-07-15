package com.jagex;

import deob.ObfuscatedName;
import com.jagex.libs.jaclib.memory.heap.NativeHeap;

@ObfuscatedName("ahp")
public class GpuHeap extends Heap {

    @ObfuscatedName("ahp.s")
    public NativeHeap field10174;

    public GpuHeap(int arg0) {
        this.field10174 = new NativeHeap(arg0);
    }

    @ObfuscatedName("ahp.u()V")
    public void method16230() {
        this.field10174.method71();
    }
}
