package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("zd")
public class CutsceneAction_Sub19 extends CutsceneAction {

    @ObfuscatedName("zd.j")
    public final int field8516;

    @ObfuscatedName("zd.a")
    public final int field8517;

    public CutsceneAction_Sub19(Packet arg0) {
        super(arg0);
        this.field8516 = arg0.g2();
        this.field8517 = arg0.g1();
    }

    @ObfuscatedName("zd.j(I)V")
    public void method2873() {
        AudioRenderer.method5596(this.field8516, 0, this.field8517);
    }
}
