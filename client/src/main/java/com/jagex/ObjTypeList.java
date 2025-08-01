package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("vj")
public class ObjTypeList implements PlayerTypeListRelated {

    @ObfuscatedName("vj.u")
    public final ModeGame field7139;

    @ObfuscatedName("vj.j")
    public final Language field7140;

    @ObfuscatedName("vj.a")
    public boolean field7142;

    @ObfuscatedName("vj.s")
    public final Js5 field7143;

    @ObfuscatedName("vj.c")
    public final Js5 field7149;

    @ObfuscatedName("vj.m")
    public int field7144;

    @ObfuscatedName("vj.t")
    public final SoftLruHashTable field7145 = new SoftLruHashTable(64);

    @ObfuscatedName("vj.l")
    public final SoftLruHashTable field7146 = new SoftLruHashTable(50);

    @ObfuscatedName("vj.f")
    public final ObjTypeListRelated field7147 = new ObjTypeListRelated(250);

    @ObfuscatedName("vj.d")
    public final IconCacheKey field7148 = new IconCacheKey();

    @ObfuscatedName("vj.z")
    public final ParamTypeList field7141;

    @ObfuscatedName("vj.n")
    public int field7150;

    @ObfuscatedName("vj.o")
    public final String[] field7151;

    @ObfuscatedName("vj.q")
    public final String[] field7152;

    public ObjTypeList(ModeGame arg0, Language arg1, boolean arg2, ParamTypeList arg3, Js5 arg4, Js5 arg5) {
        this.field7139 = arg0;
        this.field7140 = arg1;
        this.field7142 = arg2;
        this.field7141 = arg3;
        this.field7143 = arg4;
        this.field7149 = arg5;
        if (this.field7143 == null) {
            this.field7144 = 0;
        } else {
            int var7 = this.field7143.capacity() - 1;
            this.field7144 = var7 * Js5ConfigGroup.OBJTYPE.method3071() + this.field7143.getGroupCapacity(var7);
        }
        if (ModeGame.RUNESCAPE == this.field7139) {
            this.field7151 = new String[]{null, null, LocalisedText.field6875.get(this.field7140), null, null, LocalisedText.field6874.get(this.field7140)};
        } else {
            this.field7151 = new String[]{null, null, LocalisedText.field6875.get(this.field7140), null, null, null};
        }
        this.field7152 = new String[]{null, null, null, null, LocalisedText.field6876.get(this.field7140)};
    }

    @ObfuscatedName("vj.u(II)Lvn;")
    public ObjType get(int arg0) {
        SoftLruHashTable var2 = this.field7145;
        ObjType var3;
        synchronized (this.field7145) {
            var3 = (ObjType) this.field7145.get((long) arg0);
        }
        if (var3 != null) {
            return var3;
        }
        Js5 var5 = this.field7143;
        byte[] var6;
        synchronized (this.field7143) {
            var6 = this.field7143.fetchFile(Js5ConfigGroup.OBJTYPE.method3073(arg0), Js5ConfigGroup.OBJTYPE.method3075(arg0));
        }
        ObjType var8 = new ObjType();
        var8.field7061 = this;
        var8.field7062 = arg0;
        var8.op = (String[]) this.field7151.clone();
        var8.iop = (String[]) this.field7152.clone();
        if (var6 != null) {
            var8.method12236(new Packet(var6));
        }
        var8.method12235();
        if (var8.certtemplate != -1) {
            var8.method12238(this.get(var8.certtemplate), this.get(var8.certlink));
        }
        if (var8.lenttemplate != -1) {
            var8.method12258(this.get(var8.lenttemplate), this.get(var8.lentlink));
        }
        if (var8.boughttemplate != -1) {
            var8.method12240(this.get(var8.boughttemplate), this.get(var8.boughtlink));
        }
        if (!this.field7142 && var8.members) {
            var8.team = 0;
            var8.op = this.field7151;
            var8.iop = this.field7152;
            var8.stockmarket = false;
            var8.quest = null;
            if (var8.params != null) {
                boolean var9 = false;
                for (Node var10 = var8.params.head(); var10 != null; var10 = var8.params.next()) {
                    ParamType var11 = this.field7141.get((int) var10.key);
                    if (var11.field7289) {
                        var10.unlink();
                    } else {
                        var9 = true;
                    }
                }
                if (!var9) {
                    var8.params = null;
                }
            }
        }
        SoftLruHashTable var12 = this.field7145;
        synchronized (this.field7145) {
            this.field7145.method7937(var8, (long) arg0);
            return var8;
        }
    }

    @ObfuscatedName("vj.j(Lra;IIIIILqc;I)Lce;")
    public Sprite getCachedIcon(RendererToolkit arg0, int arg1, int arg2, int arg3, int arg4, int arg5, PlayerModel arg6) {
        this.field7148.field7047 = arg0.field397;
        this.field7148.field7052 = arg1;
        this.field7148.field7049 = arg2;
        this.field7148.field7050 = arg3;
        this.field7148.field7048 = arg4;
        this.field7148.field7051 = arg5;
        this.field7148.field7053 = arg6 != null;
        return (Sprite) this.field7147.method8006(this.field7148);
    }

    @ObfuscatedName("vj.a(Lra;Lra;IIIIZZILl;Lqc;I)Lce;")
    public Sprite getIcon(RendererToolkit arg0, RendererToolkit arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7, int arg8, Font arg9, PlayerModel arg10) {
        if (!arg7) {
            Sprite var12 = this.getCachedIcon(arg1, arg2, arg3, arg4, arg5, arg8, arg10);
            if (var12 != null) {
                return var12;
            }
        }
        ObjType var13 = this.get(arg2);
        if (arg3 > 1 && var13.count_obj != null) {
            int var14 = -1;
            for (int var15 = 0; var15 < 10; var15++) {
                if (arg3 >= var13.count_co[var15] && var13.count_co[var15] != 0) {
                    var14 = var13.count_obj[var15];
                }
            }
            if (var14 != -1) {
                var13 = this.get(var14);
            }
        }
        int[] var16 = var13.method12276(arg0, arg1, arg3, arg4, arg5, arg6, arg8, arg9, arg10);
        if (var16 == null) {
            return null;
        }
        Sprite var17;
        if (arg7) {
            var17 = arg0.method506(var16, 0, 36, 36, 32);
        } else {
            var17 = arg1.method506(var16, 0, 36, 36, 32);
        }
        if (!arg7) {
            IconCacheKey var18 = new IconCacheKey();
            var18.field7047 = arg1.field397;
            var18.field7052 = arg2;
            var18.field7049 = arg3;
            var18.field7050 = arg4;
            var18.field7048 = arg5;
            var18.field7051 = arg8;
            var18.field7053 = arg10 != null;
            this.field7147.method8009(var17, var18);
        }
        return var17;
    }

    @ObfuscatedName("vj.s(ZS)V")
    public void method12304(boolean arg0) {
        if (this.field7142 != arg0) {
            this.field7142 = arg0;
            this.method12296();
        }
    }

    @ObfuscatedName("vj.c(IB)V")
    public void method12295(int arg0) {
        this.field7150 = arg0;
        SoftLruHashTable var2 = this.field7146;
        synchronized (this.field7146) {
            this.field7146.method7922();
        }
    }

    @ObfuscatedName("vj.m(I)V")
    public void method12296() {
        SoftLruHashTable var1 = this.field7145;
        synchronized (this.field7145) {
            this.field7145.method7922();
        }
        SoftLruHashTable var3 = this.field7146;
        synchronized (this.field7146) {
            this.field7146.method7922();
        }
        ObjTypeListRelated var5 = this.field7147;
        synchronized (this.field7147) {
            this.field7147.method8026();
        }
    }

    @ObfuscatedName("vj.t(B)V")
    public void method12297() {
        ObjTypeListRelated var1 = this.field7147;
        synchronized (this.field7147) {
            this.field7147.method8026();
        }
    }

    @ObfuscatedName("vj.l(I)V")
    public void method12298() {
        SoftLruHashTable var1 = this.field7146;
        synchronized (this.field7146) {
            this.field7146.method7922();
        }
    }

    @ObfuscatedName("vj.f(II)V")
    public void method12291(int arg0) {
        SoftLruHashTable var2 = this.field7145;
        synchronized (this.field7145) {
            this.field7145.method7921(arg0);
        }
        SoftLruHashTable var4 = this.field7146;
        synchronized (this.field7146) {
            this.field7146.method7921(arg0);
        }
        ObjTypeListRelated var6 = this.field7147;
        synchronized (this.field7147) {
            this.field7147.method8022(arg0);
        }
    }

    @ObfuscatedName("vj.d(S)V")
    public void method12300() {
        SoftLruHashTable var1 = this.field7145;
        synchronized (this.field7145) {
            this.field7145.removeSoft();
        }
        SoftLruHashTable var3 = this.field7146;
        synchronized (this.field7146) {
            this.field7146.removeSoft();
        }
        ObjTypeListRelated var5 = this.field7147;
        synchronized (this.field7147) {
            this.field7147.method8010();
        }
    }
}
