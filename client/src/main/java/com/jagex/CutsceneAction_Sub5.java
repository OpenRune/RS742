package com.jagex;

import deob.ObfuscatedName;

import java.util.Arrays;

@ObfuscatedName("zh")
public class CutsceneAction_Sub5 extends CutsceneAction {

    @ObfuscatedName("zh.j")
    public final int field8493;

    @ObfuscatedName("zh.a")
    public final int field8492;

    @ObfuscatedName("zh.s")
    public final int field8494;

    @ObfuscatedName("zh.c")
    public final int[] field8495;

    public CutsceneAction_Sub5(Packet arg0) {
        super(arg0);
        this.field8493 = arg0.g2();
        this.field8495 = new int[MoveSpeed.values().length];
        this.field8492 = arg0.gSmart2or4null();
        Arrays.fill(this.field8495, 0, this.field8495.length, this.field8492);
        this.field8494 = arg0.g4s();
    }

    @ObfuscatedName("zh.j(I)V")
    public void method2873() {
        PathingEntity var1 = Statics.entities[this.field8493].method2854();
        if (this.field8494 == 0) {
            client.method8263(var1, this.field8495, 0, false);
        } else {
            client.method12477(var1, new int[]{this.field8492}, new int[]{0}, new int[]{this.field8494});
        }
    }

    @ObfuscatedName("zh.s(B)Z")
    public boolean method2883() {
        SeqType var1 = Statics.field566.method11144(this.field8492);
        return var1.method11129();
    }
}
