package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("zm")
public class CutsceneAction_Sub17 extends CutsceneAction {

    @ObfuscatedName("zm.j")
    public final long field8483;

    @ObfuscatedName("zm.a")
    public final int field8482;

    public CutsceneAction_Sub17(Packet arg0, boolean arg1) {
        super(arg0);
        int var3 = arg0.g2();
        if (arg1) {
            this.field8483 = (long) var3 | 0x100000000L;
        } else {
            this.field8483 = var3;
        }
        this.field8482 = arg0.g4s();
    }

    @ObfuscatedName("zm.j(I)V")
    public void method2873() {
        IntNode var1 = (IntNode) CutsceneManager.field1529.get(this.field8483);
        if (var1 == null) {
            CutsceneManager.field1529.put(new IntNode(this.field8482), this.field8483);
        } else {
            var1.value = this.field8482;
        }
    }
}
