package com.jagex;

import deob.ObfuscatedName;

import java.util.Arrays;

@ObfuscatedName("vn")
public class ObjType implements PlayerTypeRelated {

    @ObfuscatedName("vn.m")
    public static short[] field7118 = new short[256];

    @ObfuscatedName("vn.t")
    public ObjTypeList field7061;

    @ObfuscatedName("vn.l")
    public int field7062;

    @ObfuscatedName("vn.f")
    public int model;

    @ObfuscatedName("vn.d")
    public String name = "null";

    @ObfuscatedName("vn.z")
    public short[] recol_s;

    @ObfuscatedName("vn.n")
    public short[] recol_d;

    @ObfuscatedName("vn.o")
    public byte[] recolpalette;

    @ObfuscatedName("vn.q")
    public short[] retex_s;

    @ObfuscatedName("vn.p")
    public short[] retex_d;

    @ObfuscatedName("vn.w")
    public byte[] recolindex;

    @ObfuscatedName("vn.b")
    public byte[] retexindex;

    @ObfuscatedName("vn.x")
    public int zoom2d = 2000;

    @ObfuscatedName("vn.i")
    public int xan2d = 0;

    @ObfuscatedName("vn.v")
    public int yan2d = 0;

    @ObfuscatedName("vn.k")
    public int zan2d = 0;

    @ObfuscatedName("vn.h")
    public int xof2d = 0;

    @ObfuscatedName("vn.r")
    public int yof2d = 0;

    @ObfuscatedName("vn.g")
    public int stackable = 0;

    @ObfuscatedName("vn.y")
    public int field7068 = -1;

    @ObfuscatedName("vn.e")
    public int cost = 1;

    @ObfuscatedName("vn.ay")
    public boolean members = false;

    @ObfuscatedName("vn.af")
    public String[] op;

    @ObfuscatedName("vn.ar")
    public String[] iop;

    @ObfuscatedName("vn.an")
    public int[] cursor;

    @ObfuscatedName("vn.ap")
    public int[] icursor;

    @ObfuscatedName("vn.ag")
    public int wearpos = -1;

    @ObfuscatedName("vn.as")
    public int wearpos2 = -1;

    @ObfuscatedName("vn.ai")
    public int wearpos3 = -1;

    @ObfuscatedName("vn.ao")
    public int manwear = -1;

    @ObfuscatedName("vn.al")
    public int manwear2 = -1;

    @ObfuscatedName("vn.at")
    public int womanwear = -1;

    @ObfuscatedName("vn.ax")
    public int womanwear2 = -1;

    @ObfuscatedName("vn.aw")
    public int manwear3 = -1;

    @ObfuscatedName("vn.aa")
    public int womanwear3 = -1;

    @ObfuscatedName("vn.am")
    public int manwearxoff = 0;

    @ObfuscatedName("vn.ad")
    public int womanwearxoff = 0;

    @ObfuscatedName("vn.az")
    public int manwearyoff = 0;

    @ObfuscatedName("vn.ak")
    public int womanwearyoff = 0;

    @ObfuscatedName("vn.av")
    public int manwearzoff = 0;

    @ObfuscatedName("vn.aj")
    public int womanwearzoff = 0;

    @ObfuscatedName("vn.ah")
    public int manhead = -1;

    @ObfuscatedName("vn.au")
    public int manhead2 = -1;

    @ObfuscatedName("vn.ae")
    public int womanhead = -1;

    @ObfuscatedName("vn.ac")
    public int womanhead2 = -1;

    @ObfuscatedName("vn.aq")
    public int[] count_obj;

    @ObfuscatedName("vn.ab")
    public int[] count_co;

    @ObfuscatedName("vn.bq")
    public int certlink = -1;

    @ObfuscatedName("vn.bz")
    public int certtemplate = -1;

    @ObfuscatedName("vn.bv")
    public int lentlink = -1;

    @ObfuscatedName("vn.bj")
    public int lenttemplate = -1;

    @ObfuscatedName("vn.bf")
    public int resizex = 128;

    @ObfuscatedName("vn.bt")
    public int resizey = 128;

    @ObfuscatedName("vn.bg")
    public int resizez = 128;

    @ObfuscatedName("vn.bl")
    public int ambient = 0;

    @ObfuscatedName("vn.bk")
    public int contrast = 0;

    @ObfuscatedName("vn.bs")
    public int team = 0;

    @ObfuscatedName("vn.bn")
    public boolean stockmarket = false;

    @ObfuscatedName("vn.ba")
    public int dummyitem = 0;

    @ObfuscatedName("vn.bd")
    public HashTable params;

    @ObfuscatedName("vn.bc")
    public int[] quest;

    @ObfuscatedName("vn.br")
    public int picksizeshift = 0;

    @ObfuscatedName("vn.bp")
    public int boughtlink = -1;

    @ObfuscatedName("vn.bi")
    public int boughttemplate = -1;

    @ObfuscatedName("vn.bx")
    public boolean minimenucolouroverridden = false;

    @ObfuscatedName("vn.bm")
    public int minimenucolour;

    @ObfuscatedName("vn.u(I)V")
    public void method12235() {
    }

    @ObfuscatedName("vn.j(Laet;I)V")
    public void method12236(Packet arg0) {
        while (true) {
            int var2 = arg0.g1();
            if (var2 == 0) {
                return;
            }
            this.method12237(arg0, var2);
        }
    }

    @ObfuscatedName("vn.a(Laet;II)V")
    public void method12237(Packet buf, int code) {
        if (code == 1) {
            this.model = buf.gSmart2or4null();
        } else if (code == 2) {
            this.name = buf.gjstr();
        } else if (code == 4) {
            this.zoom2d = buf.g2();
        } else if (code == 5) {
            this.xan2d = buf.g2();
        } else if (code == 6) {
            this.yan2d = buf.g2();
        } else if (code == 7) {
            this.xof2d = buf.g2();
            if (this.xof2d > 32767) {
                this.xof2d -= 65536;
            }
        } else if (code == 8) {
            this.yof2d = buf.g2();
            if (this.yof2d > 32767) {
                this.yof2d -= 65536;
            }
        } else if (code == 11) {
            this.stackable = 1;
        } else if (code == 12) {
            this.cost = buf.g4s();
        } else if (code == 13) {
            this.wearpos = buf.g1();
        } else if (code == 14) {
            this.wearpos2 = buf.g1();
        } else if (code == 16) {
            this.members = true;
        } else if (code == 18) {
            this.field7068 = buf.g2();
        } else if (code == 23) {
            this.manwear = buf.gSmart2or4null();
        } else if (code == 24) {
            this.manwear2 = buf.gSmart2or4null();
        } else if (code == 25) {
            this.womanwear = buf.gSmart2or4null();
        } else if (code == 26) {
            this.womanwear2 = buf.gSmart2or4null();
        } else if (code == 27) {
            this.wearpos3 = buf.g1();
        } else if (code >= 30 && code < 35) {
            this.op[code - 30] = buf.gjstr();
        } else if (code >= 35 && code < 40) {
            this.iop[code - 35] = buf.gjstr();
        } else if (code == 40) {
            int var3 = buf.g1();
            this.recol_s = new short[var3];
            this.recol_d = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.recol_s[var4] = (short) buf.g2();
                this.recol_d[var4] = (short) buf.g2();
            }
        } else if (code == 41) {
            int var5 = buf.g1();
            this.retex_s = new short[var5];
            this.retex_d = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.retex_s[var6] = (short) buf.g2();
                this.retex_d[var6] = (short) buf.g2();
            }
        } else if (code == 42) {
            int var7 = buf.g1();
            this.recolpalette = new byte[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.recolpalette[var8] = buf.g1b();
            }
        } else if (code == 43) {
            this.minimenucolour = buf.g4s();
            this.minimenucolouroverridden = true;
        } else if (code == 44) {
            int var9 = buf.g2();
            int var10 = 0;
            for (int var11 = var9; var11 > 0; var11 >>= 0x1) {
                var10++;
            }
            this.recolindex = new byte[var10];
            byte var12 = 0;
            for (int var13 = 0; var13 < var10; var13++) {
                if ((var9 & 0x1 << var13) > 0) {
                    this.recolindex[var13] = var12++;
                } else {
                    this.recolindex[var13] = -1;
                }
            }
        } else if (code == 45) {
            int var14 = buf.g2();
            int var15 = 0;
            for (int var16 = var14; var16 > 0; var16 >>= 0x1) {
                var15++;
            }
            this.retexindex = new byte[var15];
            byte var17 = 0;
            for (int var18 = 0; var18 < var15; var18++) {
                if ((var14 & 0x1 << var18) > 0) {
                    this.retexindex[var18] = var17++;
                } else {
                    this.retexindex[var18] = -1;
                }
            }
        } else if (code == 65) {
            this.stockmarket = true;
        } else if (code == 78) {
            this.manwear3 = buf.gSmart2or4null();
        } else if (code == 79) {
            this.womanwear3 = buf.gSmart2or4null();
        } else if (code == 90) {
            this.manhead = buf.gSmart2or4null();
        } else if (code == 91) {
            this.womanhead = buf.gSmart2or4null();
        } else if (code == 92) {
            this.manhead2 = buf.gSmart2or4null();
        } else if (code == 93) {
            this.womanhead2 = buf.gSmart2or4null();
        } else if (code == 95) {
            this.zan2d = buf.g2();
        } else if (code == 96) {
            this.dummyitem = buf.g1();
        } else if (code == 97) {
            this.certlink = buf.g2();
        } else if (code == 98) {
            this.certtemplate = buf.g2();
        } else if (code >= 100 && code < 110) {
            if (this.count_obj == null) {
                this.count_obj = new int[10];
                this.count_co = new int[10];
            }
            this.count_obj[code - 100] = buf.g2();
            this.count_co[code - 100] = buf.g2();
        } else if (code == 110) {
            this.resizex = buf.g2();
        } else if (code == 111) {
            this.resizey = buf.g2();
        } else if (code == 112) {
            this.resizez = buf.g2();
        } else if (code == 113) {
            this.ambient = buf.g1b();
        } else if (code == 114) {
            this.contrast = buf.g1b();
        } else if (code == 115) {
            this.team = buf.g1();
        } else if (code == 121) {
            this.lentlink = buf.g2();
        } else if (code == 122) {
            this.lenttemplate = buf.g2();
        } else if (code == 125) {
            this.manwearxoff = buf.g1b() << 2;
            this.manwearyoff = buf.g1b() << 2;
            this.manwearzoff = buf.g1b() << 2;
        } else if (code == 126) {
            this.womanwearxoff = buf.g1b() << 2;
            this.womanwearyoff = buf.g1b() << 2;
            this.womanwearzoff = buf.g1b() << 2;
        } else if (code == 127 || code == 128 || code == 129 || code == 130) {
            buf.g1();
            buf.g2();
        } else if (code == 132) {
            int var19 = buf.g1();
            this.quest = new int[var19];
            for (int var20 = 0; var20 < var19; var20++) {
                this.quest[var20] = buf.g2();
            }
        } else if (code == 134) {
            this.picksizeshift = buf.g1();
        } else if (code == 139) {
            this.boughtlink = buf.g2();
        } else if (code == 140) {
            this.boughttemplate = buf.g2();
        } else if (code >= 142 && code < 147) {
            if (this.cursor == null) {
                this.cursor = new int[6];
                Arrays.fill(this.cursor, -1);
            }
            this.cursor[code - 142] = buf.g2();
        } else if (code >= 150 && code < 155) {
            if (this.icursor == null) {
                this.icursor = new int[5];
                Arrays.fill(this.icursor, -1);
            }
            this.icursor[code - 150] = buf.g2();
        } else if (code == 249) {
            int var21 = buf.g1();
            if (this.params == null) {
                int var22 = IntMath.bitceil(var21);
                this.params = new HashTable(var22);
            }
            for (int var23 = 0; var23 < var21; var23++) {
                boolean var24 = buf.g1() == 1;
                int var25 = buf.g3();
                Node var26;
                if (var24) {
                    var26 = new ObjectNode(buf.gjstr());
                } else {
                    var26 = new IntNode(buf.g4s());
                }
                this.params.put(var26, (long) var25);
            }
        } else if (code == 242) {
            buf.gSmart2or4();
            buf.gSmart2or4();
        } else if (code == 243) {
            buf.gSmart2or4();
        } else if (code == 244) {
            buf.gSmart2or4();
        } else if (code == 245) {
            buf.gSmart2or4();
        } else if (code == 246) {
            buf.gSmart2or4();
        } else if (code == 247) {
            buf.gSmart2or4();
        } else if (code == 248) {
            buf.gSmart2or4();
        } else if (code == 250) {
            buf.g1();
        } else if (code == 251) {
            int count = buf.g1();
            for (int i = 0; i < count; i++) {
                buf.g2();
                buf.g2();
            }
        } else if (code == 252) {
            int count = buf.g1();
            for (int i = 0; i < count; i++) {
                buf.g2();
                buf.g2();
            }
        } else if (code == 253) {
            buf.g2();
            buf.g2();
            buf.g2();
            buf.g2();
        }
    }

    @ObfuscatedName("vn.s(Lvn;Lvn;I)V")
    public void method12238(ObjType arg0, ObjType arg1) {
        this.model = arg0.model;
        this.zoom2d = arg0.zoom2d;
        this.xan2d = arg0.xan2d;
        this.yan2d = arg0.yan2d;
        this.zan2d = arg0.zan2d;
        this.xof2d = arg0.xof2d;
        this.yof2d = arg0.yof2d;
        this.recol_s = arg0.recol_s;
        this.recol_d = arg0.recol_d;
        this.recolpalette = arg0.recolpalette;
        this.retex_s = arg0.retex_s;
        this.retex_d = arg0.retex_d;
        this.name = arg1.name;
        this.members = arg1.members;
        this.cost = arg1.cost;
        this.stackable = 1;
    }

    @ObfuscatedName("vn.c(Lvn;Lvn;I)V")
    public void method12258(ObjType arg0, ObjType arg1) {
        this.cost = 0;
        this.model = arg0.model;
        this.zoom2d = arg0.zoom2d;
        this.xan2d = arg0.xan2d;
        this.yan2d = arg0.yan2d;
        this.zan2d = arg0.zan2d;
        this.xof2d = arg0.xof2d;
        this.yof2d = arg0.yof2d;
        this.recol_s = arg1.recol_s;
        this.recol_d = arg1.recol_d;
        this.recolpalette = arg1.recolpalette;
        this.retex_s = arg1.retex_s;
        this.retex_d = arg1.retex_d;
        this.name = arg1.name;
        this.members = arg1.members;
        this.wearpos = arg1.wearpos;
        this.wearpos2 = arg1.wearpos2;
        this.wearpos3 = arg1.wearpos3;
        this.manwear = arg1.manwear;
        this.manwear2 = arg1.manwear2;
        this.manwear3 = arg1.manwear3;
        this.womanwear = arg1.womanwear;
        this.womanwear2 = arg1.womanwear2;
        this.womanwear3 = arg1.womanwear3;
        this.manwearxoff = arg1.manwearxoff;
        this.womanwearxoff = arg1.womanwearxoff;
        this.manwearyoff = arg1.manwearyoff;
        this.womanwearyoff = arg1.womanwearyoff;
        this.manwearzoff = arg1.manwearzoff;
        this.womanwearzoff = arg1.womanwearzoff;
        this.manhead = arg1.manhead;
        this.manhead2 = arg1.manhead2;
        this.womanhead = arg1.womanhead;
        this.womanhead2 = arg1.womanhead2;
        this.team = arg1.team;
        this.op = arg1.op;
        this.params = arg1.params;
        this.iop = new String[5];
        if (arg1.iop != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.iop[var3] = arg1.iop[var3];
            }
        }
        this.iop[4] = LocalisedText.field6931.get(this.field7061.field7140);
    }

    @ObfuscatedName("vn.m(Lvn;Lvn;B)V")
    public void method12240(ObjType arg0, ObjType arg1) {
        this.cost = 0;
        this.model = arg0.model;
        this.zoom2d = arg0.zoom2d;
        this.xan2d = arg0.xan2d;
        this.yan2d = arg0.yan2d;
        this.zan2d = arg0.zan2d;
        this.xof2d = arg0.xof2d;
        this.yof2d = arg0.yof2d;
        this.recol_s = arg1.recol_s;
        this.recol_d = arg1.recol_d;
        this.recolpalette = arg1.recolpalette;
        this.retex_s = arg1.retex_s;
        this.retex_d = arg1.retex_d;
        this.name = arg1.name;
        this.members = arg1.members;
        this.wearpos = arg1.wearpos;
        this.wearpos2 = arg1.wearpos2;
        this.wearpos3 = arg1.wearpos3;
        this.manwear = arg1.manwear;
        this.manwear2 = arg1.manwear2;
        this.manwear3 = arg1.manwear3;
        this.womanwear = arg1.womanwear;
        this.womanwear2 = arg1.womanwear2;
        this.womanwear3 = arg1.womanwear3;
        this.manwearxoff = arg1.manwearxoff;
        this.womanwearxoff = arg1.womanwearxoff;
        this.manwearyoff = arg1.manwearyoff;
        this.womanwearyoff = arg1.womanwearyoff;
        this.manwearzoff = arg1.manwearzoff;
        this.womanwearzoff = arg1.womanwearzoff;
        this.manhead = arg1.manhead;
        this.manhead2 = arg1.manhead2;
        this.womanhead = arg1.womanhead;
        this.womanhead2 = arg1.womanhead2;
        this.team = arg1.team;
        this.op = arg1.op;
        this.params = arg1.params;
        this.stackable = arg1.stackable;
        this.iop = new String[5];
        if (arg1.iop != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.iop[var3] = arg1.iop[var3];
            }
        }
        this.iop[4] = LocalisedText.field6879.get(this.field7061.field7140);
    }

    @ObfuscatedName("vn.t(Lra;IILqc;Ltt;IIIII)Lqa;")
    public final Model method12241(RendererToolkit arg0, int arg1, int arg2, PlayerModel arg3, AnimationNode arg4, int arg5, int arg6, int arg7, int arg8) {
        if (this.count_obj != null && arg2 > 1) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg2 >= this.count_co[var11] && this.count_co[var11] != 0) {
                    var10 = this.count_obj[var11];
                }
            }
            if (var10 != -1) {
                return this.field7061.get(var10).method12241(arg0, arg1, 1, arg3, arg4, arg5, arg6, arg7, arg8);
            }
        }
        int var12 = arg1;
        if (arg4 != null) {
            var12 = arg1 | arg4.method11779();
        }
        SoftLruHashTable var13 = this.field7061.field7146;
        Model var14;
        synchronized (this.field7061.field7146) {
            var14 = (Model) this.field7061.field7146.get((long) (this.field7062 | arg0.field397 << 29));
        }
        if (var14 == null || arg0.method519(var14.m(), var12) != 0) {
            if (var14 != null) {
                var12 = arg0.method520(var12, var14.m());
            }
            int var16 = var12;
            if (this.retex_s != null) {
                var16 = var12 | 0x8000;
            }
            if (this.recol_s != null || arg3 != null) {
                var16 |= 0x4000;
            }
            if (this.resizex != 128) {
                var16 |= 0x1;
            }
            if (this.resizex != 128) {
                var16 |= 0x2;
            }
            if (this.resizex != 128) {
                var16 |= 0x4;
            }
            ModelUnlit var17 = ModelUnlit.method2664(this.field7061.field7149, this.model, 0);
            if (var17 == null) {
                return null;
            }
            if (var17.field1314 < 13) {
                var17.method2634(2);
            }
            var14 = arg0.createModel(var17, var16, this.field7061.field7150, this.ambient + 64, this.contrast * 5 + 850);
            if (this.resizex != 128 || this.resizey != 128 || this.resizez != 128) {
                var14.oa(this.resizex, this.resizey, this.resizez);
            }
            if (this.recol_s != null) {
                for (int var18 = 0; var18 < this.recol_s.length; var18++) {
                    if (this.recolpalette == null || var18 >= this.recolpalette.length) {
                        var14.X(this.recol_s[var18], this.recol_d[var18]);
                    } else {
                        var14.X(this.recol_s[var18], field7118[this.recolpalette[var18] & 0xFF]);
                    }
                }
            }
            if (this.retex_s != null) {
                for (int var19 = 0; var19 < this.retex_s.length; var19++) {
                    var14.W(this.retex_s[var19], this.retex_d[var19]);
                }
            }
            if (arg3 != null) {
                for (int var20 = 0; var20 < 10; var20++) {
                    for (int var21 = 0; var21 < Statics.field5009[var20].length; var21++) {
                        if (arg3.field5000[var20] < Statics.field5010[var20][var21].length) {
                            var14.X(Statics.field5009[var20][var21], Statics.field5010[var20][var21][arg3.field5000[var20]]);
                        }
                    }
                }
            }
            var14.KA(var12);
            SoftLruHashTable var22 = this.field7061.field7146;
            synchronized (this.field7061.field7146) {
                this.field7061.field7146.method7937(var14, (long) (this.field7062 | arg0.field397 << 29));
            }
        }
        if (arg4 != null || arg8 != 0) {
            var14 = var14.copy((byte) 1, var12, true);
            if (arg4 != null) {
                arg4.method11780(var14, 0);
            }
            if (arg8 != 0) {
                var14.PA(arg5, arg6, arg7, arg8);
            }
        }
        var14.KA(arg1);
        return var14;
    }

    @ObfuscatedName("vn.l(II)Lvn;")
    public ObjType method12242(int arg0) {
        if (this.count_obj != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.count_co[var3] && this.count_co[var3] != 0) {
                    var2 = this.count_obj[var3];
                }
            }
            if (var2 != -1) {
                return this.field7061.get(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("vn.f(Lra;Lra;IIIZILl;Lqc;B)[I")
    public int[] method12276(RendererToolkit arg0, RendererToolkit arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, Font arg7, PlayerModel arg8) {
        ModelUnlit var10 = ModelUnlit.method2664(this.field7061.field7149, this.model, 0);
        if (var10 == null) {
            return null;
        }
        if (var10.field1314 < 13) {
            var10.method2634(2);
        }
        if (this.recol_s != null) {
            for (int var11 = 0; var11 < this.recol_s.length; var11++) {
                if (this.recolpalette == null || var11 >= this.recolpalette.length) {
                    var10.method2661(this.recol_s[var11], this.recol_d[var11]);
                } else {
                    var10.method2661(this.recol_s[var11], field7118[this.recolpalette[var11] & 0xFF]);
                }
            }
        }
        if (this.retex_s != null) {
            for (int var12 = 0; var12 < this.retex_s.length; var12++) {
                var10.method2656(this.retex_s[var12], this.retex_d[var12]);
            }
        }
        if (arg8 != null) {
            for (int var13 = 0; var13 < 10; var13++) {
                for (int var14 = 0; var14 < Statics.field5009[var13].length; var14++) {
                    if (arg8.field5000[var13] < Statics.field5010[var13][var14].length) {
                        var10.method2661(Statics.field5009[var13][var14], Statics.field5010[var13][var14][arg8.field5000[var13]]);
                    }
                }
            }
        }
        int var15 = 2048;
        boolean var16 = false;
        if (this.resizex != 128 || this.resizey != 128 || this.resizez != 128) {
            var16 = true;
            var15 |= 0x7;
        }
        Model var17 = arg0.createModel(var10, var15, 64, this.ambient + 64, this.contrast * 5 + 768);
        if (!var17.method291()) {
            return null;
        }
        if (var16) {
            var17.oa(this.resizex, this.resizey, this.resizez);
        }
        Sprite var18 = null;
        if (this.certtemplate != -1) {
            var18 = this.field7061.getIcon(arg0, arg1, this.certlink, 10, 1, 0, true, true, 0, arg7, arg8);
            if (var18 == null) {
                return null;
            }
        } else if (this.lenttemplate != -1) {
            var18 = this.field7061.getIcon(arg0, arg1, this.lentlink, arg2, arg3, arg4, false, true, 0, arg7, arg8);
            if (var18 == null) {
                return null;
            }
        } else if (this.boughttemplate != -1) {
            var18 = this.field7061.getIcon(arg0, arg1, this.boughtlink, arg2, arg3, arg4, false, true, 0, arg7, arg8);
            if (var18 == null) {
                return null;
            }
        }
        int var19;
        if (arg5) {
            var19 = (int) ((double) this.zoom2d * 1.5D) << 2;
        } else if (arg3 == 2) {
            var19 = (int) ((double) this.zoom2d * 1.04D) << 2;
        } else {
            var19 = this.zoom2d << 2;
        }
        Matrix4x4 var20 = arg0.method528();
        Matrix4x4 var21 = arg0.method781();
        var21.method5397(16.0F, 16.0F, 512.0F, 512.0F, 50.0F, 2.14748365E9F, (float) arg0.method457().method921(), (float) arg0.method457().method922());
        arg0.method784(var21);
        arg0.method474(0, 0, arg0.method457().method921(), arg0.method457().method922());
        Matrix4x3 var22 = new Matrix4x3();
        arg0.method524(var22);
        arg0.IA((float) (Math.random() / 10.0D) + 0.95F);
        arg0.m(16777215, (float) (Math.random() / 10.0D) + 0.95F, (float) (Math.random() / 10.0D) + 0.95F, -50.0F, -10.0F, -50.0F);
        Matrix4x3 var23 = arg0.method516();
        var23.setToRotation(0.0F, 0.0F, 1.0F, Trig1.method5096(-this.zan2d << 3));
        var23.method5178(0.0F, 1.0F, 0.0F, Trig1.method5096(this.yan2d << 3));
        var23.method5116((float) (this.xof2d << 2), (float) ((Trig1.sin[this.xan2d << 3] * var19 >> 14) - var17.YA() / 2 + (this.yof2d << 2)), (float) ((this.yof2d << 2) + (Trig1.cos[this.xan2d << 3] * var19 >> 14)));
        var23.method5178(1.0F, 0.0F, 0.0F, Trig1.method5096(this.xan2d << 3));
        arg0.r(0, 0, 36, 32);
        arg0.ba(2, 0);
        arg0.B(0, 0, 36, 32, 0, 0);
        arg0.c(0, -1, 0);
        var17.method271(var23, null, 1);
        arg0.method784(var20);
        int[] var24 = arg0.ae(0, 0, 36, 32);
        if (arg3 >= 1) {
            var24 = this.method12244(var24, -16777214);
            if (arg3 >= 2) {
                var24 = this.method12244(var24, -1);
            }
        }
        if (arg4 != 0) {
            this.method12282(var24, arg4);
        }
        if (this.lenttemplate != -1) {
            var18.method2500(0, 0);
        } else if (this.boughttemplate != -1) {
            var18.method2500(0, 0);
        }
        arg0.method506(var24, 0, 36, 36, 32).method2500(0, 0);
        if (this.certtemplate != -1) {
            var18.method2500(0, 0);
        }
        if (arg6 == 1 || arg6 == 2 && (this.stackable == 1 || arg2 != 1) && arg2 != -1) {
            arg7.method833(method11975(arg2, this.field7061.field7140), 0, 9, -256, -16777215);
        }
        int[] var25 = arg0.ae(0, 0, 36, 32);
        for (int var26 = 0; var26 < var25.length; var26++) {
            if ((var25[var26] & 0xFFFFFF) == 0) {
                var25[var26] = 0;
            } else {
                var25[var26] |= 0xFF000000;
            }
        }
        return var25;
    }

    @ObfuscatedName("vn.d([III)[I")
    public int[] method12244(int[] arg0, int arg1) {
        int[] var3 = new int[1152];
        int var4 = 0;
        for (int var5 = 0; var5 < 32; var5++) {
            for (int var6 = 0; var6 < 36; var6++) {
                int var7 = arg0[var4];
                if (var7 == 0) {
                    if (var6 > 0 && arg0[var4 - 1] != 0) {
                        var7 = arg1;
                    } else if (var5 > 0 && arg0[var4 - 36] != 0) {
                        var7 = arg1;
                    } else if (var6 < 35 && arg0[var4 + 1] != 0) {
                        var7 = arg1;
                    } else if (var5 < 31 && arg0[var4 + 36] != 0) {
                        var7 = arg1;
                    }
                }
                var3[var4++] = var7;
            }
        }
        return var3;
    }

    @ObfuscatedName("vn.z([IIB)V")
    public void method12282(int[] arg0, int arg1) {
        for (int var3 = 31; var3 > 0; var3--) {
            int var4 = var3 * 36;
            for (int var5 = 35; var5 > 0; var5--) {
                if (arg0[var4 + var5] == 0 && arg0[var4 + var5 - 1 - 36] != 0) {
                    arg0[var4 + var5] = arg1;
                }
            }
        }
    }

    @ObfuscatedName("ue.n(ILsn;I)Ljava/lang/String;")
    public static String method11975(int arg0, Language arg1) {
        if (arg0 < 100000) {
            return "<col=ffff00>" + arg0 + "</col>";
        } else if (arg0 < 10000000) {
            return "<col=ffffff>" + arg0 / 1000 + LocalisedText.field7005.get(arg1) + "</col>";
        } else {
            return "<col=00ff80>" + arg0 / 1000000 + LocalisedText.field7001.get(arg1) + "</col>";
        }
    }

    @ObfuscatedName("vn.o(ZLvq;B)Z")
    public final boolean method12246(boolean arg0, ObjTypeCustomisation arg1) {
        int var3;
        int var4;
        int var5;
        if (arg0) {
            if (arg1 == null || arg1.field7128 == null) {
                var3 = this.womanwear;
                var4 = this.womanwear2;
                var5 = this.womanwear3;
            } else {
                var3 = arg1.field7128[0];
                var4 = arg1.field7128[1];
                var5 = arg1.field7128[2];
            }
        } else if (arg1 == null || arg1.field7130 == null) {
            var3 = this.manwear;
            var4 = this.manwear2;
            var5 = this.manwear3;
        } else {
            var3 = arg1.field7130[0];
            var4 = arg1.field7130[1];
            var5 = arg1.field7130[2];
        }
        if (var3 == -1) {
            return true;
        }
        boolean var6 = true;
        if (!this.field7061.field7149.loadFile(var3, 0)) {
            var6 = false;
        }
        if (var4 != -1 && !this.field7061.field7149.loadFile(var4, 0)) {
            var6 = false;
        }
        if (var5 != -1 && !this.field7061.field7149.loadFile(var5, 0)) {
            var6 = false;
        }
        return var6;
    }

    @ObfuscatedName("vn.q(ZLvq;I)Ldw;")
    public final ModelUnlit method12245(boolean arg0, ObjTypeCustomisation arg1) {
        int var3;
        int var4;
        int var5;
        if (arg0) {
            if (arg1 == null || arg1.field7128 == null) {
                var3 = this.womanwear;
                var4 = this.womanwear2;
                var5 = this.womanwear3;
            } else {
                var3 = arg1.field7128[0];
                var4 = arg1.field7128[1];
                var5 = arg1.field7128[2];
            }
        } else if (arg1 == null || arg1.field7130 == null) {
            var3 = this.manwear;
            var4 = this.manwear2;
            var5 = this.manwear3;
        } else {
            var3 = arg1.field7130[0];
            var4 = arg1.field7130[1];
            var5 = arg1.field7130[2];
        }
        if (var3 == -1) {
            return null;
        }
        ModelUnlit var6 = ModelUnlit.method2664(this.field7061.field7149, var3, 0);
        if (var6 == null) {
            return null;
        }
        if (var6.field1314 < 13) {
            var6.method2634(2);
        }
        if (var4 != -1) {
            ModelUnlit var7 = ModelUnlit.method2664(this.field7061.field7149, var4, 0);
            if (var7.field1314 < 13) {
                var7.method2634(2);
            }
            if (var5 == -1) {
                ModelUnlit[] var10 = new ModelUnlit[]{var6, var7};
                var6 = new ModelUnlit(var10, 2);
            } else {
                ModelUnlit var8 = ModelUnlit.method2664(this.field7061.field7149, var5, 0);
                if (var8.field1314 < 13) {
                    var8.method2634(2);
                }
                ModelUnlit[] var9 = new ModelUnlit[]{var6, var7, var8};
                var6 = new ModelUnlit(var9, 3);
            }
        }
        if (!arg0 && (this.manwearxoff != 0 || this.manwearyoff != 0 || this.manwearzoff != 0)) {
            var6.method2630(this.manwearxoff, this.manwearyoff, this.manwearzoff);
        }
        if (arg0 && (this.womanwearxoff != 0 || this.womanwearyoff != 0 || this.womanwearzoff != 0)) {
            var6.method2630(this.womanwearxoff, this.womanwearyoff, this.womanwearzoff);
        }
        if (this.recol_s != null) {
            short[] var11;
            if (arg1 == null || arg1.field7134 == null) {
                var11 = this.recol_d;
            } else {
                var11 = arg1.field7134;
            }
            for (int var12 = 0; var12 < this.recol_s.length; var12++) {
                var6.method2661(this.recol_s[var12], var11[var12]);
            }
        }
        if (this.retex_s != null) {
            short[] var13;
            if (arg1 == null || arg1.field7135 == null) {
                var13 = this.retex_d;
            } else {
                var13 = arg1.field7135;
            }
            for (int var14 = 0; var14 < this.retex_s.length; var14++) {
                var6.method2656(this.retex_s[var14], var13[var14]);
            }
        }
        return var6;
    }

    @ObfuscatedName("vn.p(ZLvq;B)Z")
    public final boolean method12275(boolean arg0, ObjTypeCustomisation arg1) {
        int var3;
        int var4;
        if (arg0) {
            if (arg1 == null || arg1.field7126 == null) {
                var3 = this.womanhead;
                var4 = this.womanhead2;
            } else {
                var3 = arg1.field7126[0];
                var4 = arg1.field7126[1];
            }
        } else if (arg1 == null || arg1.field7132 == null) {
            var3 = this.manhead;
            var4 = this.manhead2;
        } else {
            var3 = arg1.field7132[0];
            var4 = arg1.field7132[1];
        }
        if (var3 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!this.field7061.field7149.loadFile(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !this.field7061.field7149.loadFile(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("vn.w(ZLvq;I)Ldw;")
    public final ModelUnlit method12249(boolean arg0, ObjTypeCustomisation arg1) {
        int var3;
        int var4;
        if (arg0) {
            if (arg1 == null || arg1.field7126 == null) {
                var3 = this.womanhead;
                var4 = this.womanhead2;
            } else {
                var3 = arg1.field7126[0];
                var4 = arg1.field7126[1];
            }
        } else if (arg1 == null || arg1.field7132 == null) {
            var3 = this.manhead;
            var4 = this.manhead2;
        } else {
            var3 = arg1.field7132[0];
            var4 = arg1.field7132[1];
        }
        if (var3 == -1) {
            return null;
        }
        ModelUnlit var5 = ModelUnlit.method2664(this.field7061.field7149, var3, 0);
        if (var5.field1314 < 13) {
            var5.method2634(2);
        }
        if (var4 != -1) {
            ModelUnlit var6 = ModelUnlit.method2664(this.field7061.field7149, var4, 0);
            if (var6.field1314 < 13) {
                var6.method2634(2);
            }
            ModelUnlit[] var7 = new ModelUnlit[]{var5, var6};
            var5 = new ModelUnlit(var7, 2);
        }
        if (this.recol_s != null) {
            short[] var8;
            if (arg1 == null || arg1.field7134 == null) {
                var8 = this.recol_d;
            } else {
                var8 = arg1.field7134;
            }
            for (int var9 = 0; var9 < this.recol_s.length; var9++) {
                var5.method2661(this.recol_s[var9], var8[var9]);
            }
        }
        if (this.retex_s != null) {
            short[] var10;
            if (arg1 == null || arg1.field7135 == null) {
                var10 = this.retex_d;
            } else {
                var10 = arg1.field7135;
            }
            for (int var11 = 0; var11 < this.retex_s.length; var11++) {
                var5.method2656(this.retex_s[var11], var10[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("vn.b(III)I")
    public int method12250(int arg0, int arg1) {
        if (this.params == null) {
            return arg1;
        } else {
            IntNode var3 = (IntNode) this.params.get((long) arg0);
            return var3 == null ? arg1 : var3.value;
        }
    }

    @ObfuscatedName("vn.x(ILjava/lang/String;B)Ljava/lang/String;")
    public String method12248(int arg0, String arg1) {
        if (this.params == null) {
            return arg1;
        } else {
            ObjectNode var3 = (ObjectNode) this.params.get((long) arg0);
            return var3 == null ? arg1 : (String) var3.value;
        }
    }

    @ObfuscatedName("vn.i(II)I")
    public int method12251(int arg0) {
        return this.cursor == null ? -1 : this.cursor[arg0];
    }

    @ObfuscatedName("vn.v(II)I")
    public int method12252(int arg0) {
        return this.icursor == null ? -1 : this.icursor[arg0];
    }
}
