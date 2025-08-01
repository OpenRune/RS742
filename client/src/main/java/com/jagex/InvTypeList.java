package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("wo")
public class InvTypeList implements PlayerTypeListRelated {

    @ObfuscatedName("wo.u")
    public final Js5 field7325;

    @ObfuscatedName("wo.j")
    public final SoftLruHashTable field7326 = new SoftLruHashTable(64);

    public InvTypeList(ModeGame arg0, Language arg1, Js5 arg2) {
        this.field7325 = arg2;
        this.field7325.getGroupCapacity(Js5ConfigGroup.INVTYPE.field1668);
    }

    @ObfuscatedName("wo.u(II)Laez;")
    public InvType method12644(int arg0) {
        SoftLruHashTable var2 = this.field7326;
        InvType var3;
        synchronized (this.field7326) {
            var3 = (InvType) this.field7326.get((long) arg0);
        }
        if (var3 != null) {
            return var3;
        }
        Js5 var5 = this.field7325;
        byte[] var6;
        synchronized (this.field7325) {
            var6 = this.field7325.fetchFile(Js5ConfigGroup.INVTYPE.field1668, arg0);
        }
        InvType var8 = new InvType();
        if (var6 != null) {
            var8.method15624(new Packet(var6));
        }
        SoftLruHashTable var9 = this.field7326;
        synchronized (this.field7326) {
            this.field7326.method7937(var8, (long) arg0);
            return var8;
        }
    }
}
