package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("zt")
public class CutsceneAction_Sub2 extends CutsceneAction {

    @ObfuscatedName("zt.j")
    public final int field8467;

    @ObfuscatedName("zt.a")
    public final int field8468;

    public CutsceneAction_Sub2(Packet arg0) {
        super(arg0);
        this.field8467 = arg0.g2();
        this.field8468 = arg0.gSmart2or4null();
    }

    @ObfuscatedName("zt.j(I)V")
    public void method2873() {
        CutsceneLocation var1 = Statics.field1528[this.field8467];
        client.method3302(var1.field1553, var1.field1554, var1.field1555, var1.field1551.field6582, var1.field1551.field6590, var1.field1556, this.field8468);
    }

    @ObfuscatedName("zt.s(B)Z")
    public boolean method2883() {
        SeqType var1 = Statics.field566.method11144(this.field8468);
        return var1.method11129();
    }
}
