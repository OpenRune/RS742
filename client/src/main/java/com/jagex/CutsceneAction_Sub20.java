package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("zl")
public class CutsceneAction_Sub20 extends CutsceneAction {

    @ObfuscatedName("zl.j")
    public final int field8484;

    public CutsceneAction_Sub20(Packet arg0) {
        super(arg0);
        this.field8484 = arg0.g2();
    }

    @ObfuscatedName("zl.j(I)V")
    public void method2873() {
        Statics.entities[this.field8484].method2852();
    }
}
