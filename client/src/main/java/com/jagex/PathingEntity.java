package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("aay")
public abstract class PathingEntity extends PrimaryLayerEntity implements CameraTrackable {

    @ObfuscatedName("aay.o")
    public int slot;

    @ObfuscatedName("aay.q")
    public int field8594;

    @ObfuscatedName("aay.p")
    public int field9810;

    @ObfuscatedName("aay.w")
    public int field8622;

    @ObfuscatedName("aay.b")
    public boolean field8634;

    @ObfuscatedName("aay.x")
    public int field8598;

    @ObfuscatedName("aay.i")
    public int field8635;

    @ObfuscatedName("aay.v")
    public int field8600;

    @ObfuscatedName("aay.k")
    public int field8601;

    @ObfuscatedName("aay.h")
    public int field8644;

    @ObfuscatedName("aay.r")
    public int field8603;

    @ObfuscatedName("aay.g")
    public int field8604;

    @ObfuscatedName("aay.y")
    public EntityChatLine field8629;

    @ObfuscatedName("aay.e")
    public byte field8606;

    @ObfuscatedName("aay.ay")
    public int[] field8607;

    @ObfuscatedName("aay.af")
    public int[] field8608;

    @ObfuscatedName("aay.ar")
    public int[] field8609;

    @ObfuscatedName("aay.an")
    public int[] field8610;

    @ObfuscatedName("aay.ap")
    public int[] field8623;

    @ObfuscatedName("aay.ag")
    public LinkQueue field8612;

    @ObfuscatedName("aay.as")
    public int field8624;

    @ObfuscatedName("aay.ai")
    public int[] field8614;

    @ObfuscatedName("aay.ao")
    public int[] field8615;

    @ObfuscatedName("aay.al")
    public EntityWalkAnimationNode field8616;

    @ObfuscatedName("aay.at")
    public AnimationNode field8597;

    @ObfuscatedName("aay.ax")
    public EntitySpotAnim[] spotAnims;

    @ObfuscatedName("aay.aw")
    public int exactMoveX0;

    @ObfuscatedName("aay.aa")
    public int exactMoveX1;

    @ObfuscatedName("aay.am")
    public int exactMoveZ0;

    @ObfuscatedName("aay.ad")
    public int exactMoveZ1;

    @ObfuscatedName("aay.az")
    public int exactMoveT0;

    @ObfuscatedName("aay.ak")
    public int exactMoveT1;

    @ObfuscatedName("aay.av")
    public int exactMoveAngle;

    @ObfuscatedName("aay.aj")
    public int field8626;

    @ObfuscatedName("aay.ah")
    public int field8632;

    @ObfuscatedName("aay.au")
    public byte field8596;

    @ObfuscatedName("aay.ae")
    public byte field8602;

    @ObfuscatedName("aay.ac")
    public byte field8617;

    @ObfuscatedName("aay.aq")
    public byte field8631;

    @ObfuscatedName("aay.ab")
    public int field8618;

    @ObfuscatedName("aay.bq")
    public final UnknownEntityAnimationNode[] field8633;

    @ObfuscatedName("aay.bz")
    public int[] field8654;

    @ObfuscatedName("aay.bv")
    public int field8599;

    @ObfuscatedName("aay.bj")
    public int turnspeed;

    @ObfuscatedName("aay.bf")
    public int field8637;

    @ObfuscatedName("aay.bt")
    public EasedAngle field8638;

    @ObfuscatedName("aay.bg")
    public EasedAngle field8639;

    @ObfuscatedName("aay.bl")
    public EasedAngle field8611;

    @ObfuscatedName("aay.bk")
    public int routeLength;

    @ObfuscatedName("aay.bs")
    public int[] routeWaypointX;

    @ObfuscatedName("aay.bn")
    public int[] routeWaypointZ;

    @ObfuscatedName("aay.ba")
    public byte[] field8645;

    @ObfuscatedName("aay.bd")
    public int field8648;

    @ObfuscatedName("aay.bc")
    public int routeLength3;

    @ObfuscatedName("aay.br")
    public int field8647;

    @ObfuscatedName("aay.bp")
    public ParticleSystem field8640;

    @ObfuscatedName("aay.bi")
    public boolean field8613;

    @ObfuscatedName("aay.bx")
    public boolean field8650;

    @ObfuscatedName("aay.bm")
    public Model[] field8651;

    @ObfuscatedName("aay.bb")
    public Interface field8652;

    @ObfuscatedName("aay.be")
    public int field8653;

    @ObfuscatedName("aay.bw")
    public int field8630;

    public PathingEntity(Scene arg0, int arg1) {
        super(arg0, 0, 0, 0, 0, 0, 0, 0, 0, 0, false, (byte) 0);
        this.field8594 = 1;
        this.field8622 = -32768;
        this.field8634 = true;
        this.field8598 = 0;
        this.field8635 = -1;
        this.field8600 = 0;
        this.field8604 = 0;
        this.field8606 = 0;
        this.field8607 = new int[client.graphicsDefaults.field5147];
        this.field8608 = new int[client.graphicsDefaults.field5147];
        this.field8609 = new int[client.graphicsDefaults.field5147];
        this.field8610 = new int[client.graphicsDefaults.field5147];
        this.field8623 = new int[client.graphicsDefaults.field5147];
        this.field8612 = new LinkQueue();
        this.field8624 = -1;
        this.field8615 = null;
        this.field8616 = new EntityWalkAnimationNode(this, false);
        this.field8597 = new EntityAnimationNode(this, false);
        this.field8626 = -1;
        this.field8632 = -1;
        this.field8631 = 0;
        this.field8618 = 0;
        this.field8599 = 0;
        this.turnspeed = 256;
        this.field8638 = new EasedAngle();
        this.field8639 = new EasedAngle();
        this.field8611 = new EasedAngle();
        this.routeLength = 0;
        this.field8648 = 0;
        this.routeLength3 = 0;
        this.field8647 = 0;
        this.field8613 = false;
        this.field8650 = false;
        this.field8653 = -1;
        this.field8630 = -1;
        this.routeWaypointX = new int[arg1];
        this.routeWaypointZ = new int[arg1];
        this.field8645 = new byte[arg1];
        this.field8651 = new Model[5];
        this.spotAnims = new EntitySpotAnim[4];
        for (int var3 = 0; var3 < 4; var3++) {
            this.spotAnims[var3] = new EntitySpotAnim(this);
        }
        this.field8633 = new UnknownEntityAnimationNode[Statics.wearposDefaults.field5171.length];
    }

    public PathingEntity(Scene arg0) {
        this(arg0, 10);
    }

    @ObfuscatedName("aay.bc(I)I")
    public int method12809() {
        return this.field8622 == -32768 ? 0 : this.field8622;
    }

    @ObfuscatedName("aay.bn(I)Z")
    public boolean method12807() {
        return false;
    }

    @ObfuscatedName("aay.ba(I)Z")
    public boolean method12808() {
        return this.field8650;
    }

    @ObfuscatedName("aay.f(II)V")
    public void method14013(int arg0) {
        BASType var2 = this.getBASType();
        if (var2.field4723 == 0 && this.turnspeed == 0) {
            return;
        }
        this.field8638.method1388();
        int var3 = arg0 - this.field8638.field574 & 0x3FFF;
        if (var3 > 8192) {
            this.field8637 = this.field8638.field574 - (16384 - var3);
        } else {
            this.field8637 = this.field8638.field574 + var3;
        }
    }

    @ObfuscatedName("aay.d(IZI)V")
    public void turn(int arg0, boolean arg1) {
        BASType var3 = this.getBASType();
        if (arg1 || var3.field4723 != 0 || this.turnspeed != 0) {
            this.field8637 = arg0 & 0x3FFF;
            this.field8638.method1386(this.field8637);
        }
    }

    @ObfuscatedName("aay.z(I)I")
    public int method13947() {
        BASType var1 = this.getBASType();
        int var2 = this.field8638.field574;
        boolean var3;
        if (var1.field4723 == 0) {
            var3 = this.field8638.method1385(this.field8637, this.turnspeed, this.turnspeed);
        } else {
            var3 = this.field8638.method1385(this.field8637, var1.field4723, var1.field4722);
        }
        int var4 = this.field8638.field574 - var2;
        if (var4 == 0) {
            this.field8599 = 0;
            this.field8638.method1386(this.field8637);
        } else {
            this.field8599++;
        }
        if (var3) {
            if (var1.field4687 != 0) {
                if (var4 > 0) {
                    this.field8639.method1385(var1.field4725, var1.field4687, var1.field4724);
                } else {
                    this.field8639.method1385(-var1.field4725, var1.field4687, var1.field4724);
                }
            }
            if (var1.field4721 != 0) {
                this.field8611.method1385(var1.field4728, var1.field4721, var1.field4727);
            }
        } else {
            if (var1.field4687 == 0) {
                this.field8639.method1386(0);
            } else {
                this.field8639.method1385(0, var1.field4687, var1.field4724);
            }
            if (var1.field4721 == 0) {
                this.field8611.method1386(0);
            } else {
                this.field8611.method1385(0, var1.field4721, var1.field4727);
            }
        }
        return var4;
    }

    @ObfuscatedName("aay.n([I[IB)V")
    public void method13948(int[] arg0, int[] arg1) {
        if (this.field8614 == null && arg0 != null) {
            this.field8614 = new int[Statics.wearposDefaults.field5171.length];
        } else if (arg0 == null) {
            this.field8614 = null;
            return;
        }
        for (int var3 = 0; var3 < this.field8614.length; var3++) {
            this.field8614[var3] = -1;
        }
        for (int var4 = 0; var4 < arg0.length; var4++) {
            int var5 = arg1[var4];
            int var6 = 0;
            while (var6 < this.field8614.length) {
                if ((var5 & 0x1) != 0) {
                    this.field8614[var6] = arg0[var4];
                }
                var6++;
                var5 >>= 0x1;
            }
        }
    }

    @ObfuscatedName("aay.o(III)Z")
    public boolean method13949(int arg0, int arg1) {
        if (this.field8654 == null) {
            if (arg1 == -1) {
                return true;
            }
            this.field8654 = new int[Statics.wearposDefaults.field5171.length];
            for (int var3 = 0; var3 < Statics.wearposDefaults.field5171.length; var3++) {
                this.field8654[var3] = -1;
            }
        }
        BASType var4 = this.getBASType();
        int var5 = 256;
        if (var4.field4719 != null && var4.field4719[arg0] > 0) {
            var5 = var4.field4719[arg0];
        }
        if (arg1 != -1) {
            if (this.field8654[arg0] == -1) {
                this.field8654[arg0] = this.field8638.method1387();
            }
            int var10 = this.field8654[arg0];
            int var11 = arg1 - var10;
            if (var11 >= -var5 && var11 <= var5) {
                this.field8654[arg0] = arg1;
                return true;
            }
            if ((var11 <= 0 || var11 > 8192) && var11 > -8192) {
                this.field8654[arg0] = var10 - var5 & 0x3FFF;
            } else {
                this.field8654[arg0] = var5 + var10 & 0x3FFF;
            }
            return false;
        } else if (this.field8654[arg0] == -1) {
            return true;
        } else {
            int var6 = this.field8638.method1387();
            int var7 = this.field8654[arg0];
            int var8 = var6 - var7;
            if (var8 < -var5 || var8 > var5) {
                if ((var8 <= 0 || var8 > 8192) && var8 > -8192) {
                    this.field8654[arg0] = var7 - var5 & 0x3FFF;
                } else {
                    this.field8654[arg0] = var5 + var7 & 0x3FFF;
                }
                return false;
            }
            this.field8654[arg0] = -1;
            for (int var9 = 0; var9 < Statics.wearposDefaults.field5171.length; var9++) {
                if (this.field8654[var9] != -1) {
                    return true;
                }
            }
            this.field8654 = null;
            return true;
        }
    }

    @ObfuscatedName("aay.q(Lra;[Lqa;Lkc;ZI)V")
    public void method14023(RendererToolkit arg0, Model[] arg1, Matrix4x3 arg2, boolean arg3) {
        if (!arg3) {
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = -1;
            int var10 = -1;
            ModelParticleEmitter[][] var11 = new ModelParticleEmitter[arg1.length][];
            ModelParticleEffector[][] var12 = new ModelParticleEffector[arg1.length][];
            for (int var13 = 0; var13 < arg1.length; var13++) {
                if (arg1[var13] != null) {
                    arg1[var13].method294(arg2);
                    var11[var13] = arg1[var13].method276();
                    var12[var13] = arg1[var13].method413();
                    if (var11[var13] != null) {
                        var9 = var13;
                        var6++;
                        var5 += var11[var13].length;
                    }
                    if (var12[var13] != null) {
                        var10 = var13;
                        var8++;
                        var7 += var12[var13].length;
                    }
                }
            }
            if ((this.field8640 == null || this.field8640.field4945) && (var6 > 0 || var8 > 0)) {
                this.field8640 = ParticleSystem.method8123(client.loopCycle, true);
            }
            if (this.field8640 != null) {
                Object var14 = null;
                ModelParticleEmitter[] var15;
                if (var6 == 1) {
                    var15 = var11[var9];
                } else {
                    var15 = new ModelParticleEmitter[var5];
                    int var16 = 0;
                    for (int var17 = 0; var17 < arg1.length; var17++) {
                        if (var11[var17] != null) {
                            System.arraycopy(var11[var17], 0, var15, var16, var11[var17].length);
                            var16 += var11[var17].length;
                        }
                    }
                }
                Object var18 = null;
                ModelParticleEffector[] var19;
                if (var8 == 1) {
                    var19 = var12[var10];
                } else {
                    var19 = new ModelParticleEffector[var7];
                    int var20 = 0;
                    for (int var21 = 0; var21 < arg1.length; var21++) {
                        if (var12[var21] != null) {
                            System.arraycopy(var12[var21], 0, var19, var20, var12[var21].length);
                            var20 += var12[var21].length;
                        }
                    }
                }
                this.field8640.method8106(arg0, (long) client.loopCycle, var15, var19, false);
                this.field8613 = true;
            }
        } else if (this.field8640 != null) {
            this.field8640.method8105((long) client.loopCycle);
        }
        if (this.field8640 != null) {
            this.field8640.method8110(this.level, this.field10510, this.field10508, this.field10509, this.field10511);
        }
    }

    @ObfuscatedName("aay.p(IIIIZII)V")
    public final void method13950(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        EntitySpotAnim var7 = this.spotAnims[arg5];
        int var8 = var7.field1204;
        if (arg0 != -1 && var8 != -1) {
            if (arg0 == var8) {
                EffectAnimType var9 = client.field4213.method11082(arg0);
                if (var9.field5264 && var9.field5252 != -1) {
                    SeqType var10 = Statics.field566.method11144(var9.field5252);
                    int var11 = var10.field6331;
                    if (var11 == 0) {
                        return;
                    }
                    if (var11 == 2) {
                        var7.field1203.method11806();
                        return;
                    }
                }
            } else {
                EffectAnimType var12 = client.field4213.method11082(arg0);
                EffectAnimType var13 = client.field4213.method11082(var8);
                if (var12.field5252 != -1 && var13.field5252 != -1) {
                    SeqType var14 = Statics.field566.method11144(var12.field5252);
                    SeqType var15 = Statics.field566.method11144(var13.field5252);
                    if (var14.field6325 < var15.field6325) {
                        return;
                    }
                }
            }
        }
        byte var16 = 0;
        if (arg0 != -1 && !client.field4213.method11082(arg0).field5264) {
            var16 = 2;
        }
        if (arg0 != -1 && arg4) {
            var16 = 1;
        }
        var7.field1204 = arg0;
        var7.field1206 = arg3;
        var7.field1205 = arg1 >> 16;
        var7.field1207 = arg2;
        var7.field1203.method11803(arg0 == -1 ? -1 : client.field4213.method11082(arg0).field5252, arg1 & 0xFFFF, var16, false);
    }

    @ObfuscatedName("aay.w(I)V")
    public final void method13952() {
        this.routeLength = 0;
        this.routeLength3 = 0;
    }

    @ObfuscatedName("aay.b(IIIIIIB)V")
    public final void method13953(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = true;
        boolean var8 = true;
        for (int var9 = 0; var9 < client.graphicsDefaults.field5147; var9++) {
            if (this.field8609[var9] > arg4) {
                var7 = false;
            } else {
                var8 = false;
            }
        }
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        if (arg0 >= 0) {
            HitmarkType var13 = Statics.field5037.method7826(arg0);
            var11 = var13.field4743;
            var12 = var13.field4750;
        }
        if (var8) {
            if (var11 == -1) {
                return;
            }
            var10 = 0;
            int var14 = 0;
            if (var11 == 0) {
                var14 = this.field8609[0];
            } else if (var11 == 1) {
                var14 = this.field8608[0];
            }
            for (int var15 = 1; var15 < client.graphicsDefaults.field5147; var15++) {
                if (var11 == 0) {
                    if (this.field8609[var15] < var14) {
                        var10 = var15;
                        var14 = this.field8609[var15];
                    }
                } else if (var11 == 1 && this.field8608[var15] < var14) {
                    var10 = var15;
                    var14 = this.field8608[var15];
                }
            }
            if (var11 == 1 && var14 >= arg1) {
                return;
            }
        } else {
            if (var7) {
                this.field8606 = 0;
            }
            for (int var16 = 0; var16 < client.graphicsDefaults.field5147; var16++) {
                byte var17 = this.field8606;
                this.field8606 = (byte) ((this.field8606 + 1) % client.graphicsDefaults.field5147);
                if (this.field8609[var17] <= arg4) {
                    var10 = var17;
                    break;
                }
            }
        }
        if (var10 < 0) {
            return;
        }
        this.field8607[var10] = arg0;
        this.field8608[var10] = arg1;
        this.field8610[var10] = arg2;
        this.field8623[var10] = arg3;
        this.field8609[var10] = arg4 + var12 + arg5;
    }

    @ObfuscatedName("aay.x(IIIIIII)V")
    public final void method13944(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        HeadbarType var7 = Statics.field6705.method7334(arg0);
        Headbar var8 = null;
        Headbar var9 = null;
        int var10 = var7.field4442;
        int var11 = 0;
        for (Headbar var12 = (Headbar) this.field8612.method11649(); var12 != null; var12 = (Headbar) this.field8612.method11644()) {
            var11++;
            if (var12.field9268 == var7) {
                var12.method14733(arg1 + arg3, arg4, arg5, arg2);
                return;
            }
            if (var12.field9268.field4446 <= var7.field4446) {
                var8 = var12;
            }
            if (var12.field9268.field4442 > var10) {
                var9 = var12;
                var10 = var12.field9268.field4442;
            }
        }
        if (var9 == null && var11 >= client.graphicsDefaults.field5160) {
            return;
        }
        Headbar var13 = new Headbar(var7);
        if (var8 == null) {
            this.field8612.method11641(var13);
        } else {
            LinkQueue.method1968(var13, var8);
        }
        var13.method14733(arg1 + arg3, arg4, arg5, arg2);
        if (var11 >= client.graphicsDefaults.field5160) {
            var9.method6975();
        }
    }

    @ObfuscatedName("aay.i(II)V")
    public final void method13990(int arg0) {
        HeadbarType var2 = Statics.field6705.method7334(arg0);
        for (Headbar var3 = (Headbar) this.field8612.method11649(); var3 != null; var3 = (Headbar) this.field8612.method11644()) {
            if (var3.field9268 == var2) {
                var3.method6975();
                return;
            }
        }
    }

    @ObfuscatedName("aay.bp(I)I")
    public int method12811() {
        BASType var1 = this.getBASType();
        int var2;
        if (var1.field4730 != -1) {
            var2 = var1.field4730;
        } else if (this.field8622 == -32768) {
            var2 = 200;
        } else {
            var2 = -this.field8622;
        }
        ScaleRotTrans var3 = this.getTransform();
        int var4 = (int) var3.trans.x >> 9;
        int var5 = (int) var3.trans.z >> 9;
        if (this.field9808 != null && var4 >= 1 && var5 >= 1 && var4 <= client.world.getSizeX() - 1 && var5 <= client.world.getSizeZ() - 1) {
            Tile var6 = this.field9808.field4497[this.level][var4][var5];
            if (var6 != null && var6.field4552 != null) {
                return var6.field4552.field10495 + var2;
            }
        }
        return var2;
    }

    @ObfuscatedName("aay.v(II)V")
    public void setSize(int arg0) {
        this.field8594 = arg0;
    }

    @ObfuscatedName("aay.k(I)I")
    public int size() {
        return this.field8594;
    }

    @ObfuscatedName("aay.dz(I)V")
    public void method14006() {
        int var1 = (this.field8594 - 1 << 8) + 240;
        Vector3 var2 = this.getTransform().trans;
        this.field10510 = (short) ((int) var2.x - var1 >> 9);
        this.field10509 = (short) ((int) var2.z - var1 >> 9);
        this.field10508 = (short) ((int) var2.x + var1 >> 9);
        this.field10511 = (short) ((int) var2.z + var1 >> 9);
    }

    @ObfuscatedName("aay.h(Lqa;B)V")
    public void method13972(Model arg0) {
        int var2 = this.field8639.field574;
        int var3 = this.field8611.field574;
        if (var2 == 0 && var3 == 0) {
            return;
        }
        int var4 = arg0.YA() / 2;
        arg0.ia(0, -var4, 0);
        arg0.EA(var2 & 0x3FFF);
        arg0.t(var3 & 0x3FFF);
        arg0.ia(0, var4, 0);
    }

    @ObfuscatedName("aay.r(Lra;Lps;IIIII)V")
    public void method13957(RendererToolkit arg0, BASType arg1, int arg2, int arg3, int arg4, int arg5) {
        for (int var7 = 0; var7 < this.spotAnims.length; var7++) {
            byte var8 = 0;
            if (var7 == 0) {
                var8 = 2;
            } else if (var7 == 1) {
                var8 = 5;
            } else if (var7 == 2) {
                var8 = 1;
            } else if (var7 == 3) {
                var8 = 7;
            }
            EntitySpotAnim var9 = this.spotAnims[var7];
            if (var9.field1204 == -1 || var9.field1203.method11776()) {
                this.field8651[var7 + 1] = null;
            } else {
                EffectAnimType var10 = client.field4213.method11082(var9.field1204);
                boolean var11 = var10.field5262 == 3 && (arg3 != 0 || arg4 != 0);
                int var12 = arg2;
                if (var11) {
                    var12 = arg2 | 0x7;
                } else {
                    if (var9.field1207 != 0) {
                        var12 = arg2 | 0x5;
                    }
                    if (var9.field1205 != 0) {
                        var12 |= 0x2;
                    }
                    if (var9.field1206 >= 0) {
                        var12 |= 0x7;
                    }
                }
                Model var13 = this.field8651[var7 + 1] = var10.method11102(arg0, var12, var9.field1203, var8);
                if (var13 != null) {
                    if (var9.field1206 >= 0 && arg1.field4716 != null && arg1.field4716[var9.field1206] != null) {
                        int var14 = 0;
                        int var15 = 0;
                        int var16 = 0;
                        if (arg1.field4716 != null && arg1.field4716[var9.field1206] != null) {
                            var14 += arg1.field4716[var9.field1206][0];
                            var15 += arg1.field4716[var9.field1206][1];
                            var16 += arg1.field4716[var9.field1206][2];
                        }
                        if (arg1.field4729 != null && arg1.field4729[var9.field1206] != null) {
                            var14 += arg1.field4729[var9.field1206][0];
                            var15 += arg1.field4729[var9.field1206][1];
                            var16 += arg1.field4729[var9.field1206][2];
                        }
                        if (var16 != 0 || var14 != 0) {
                            int var17 = arg5;
                            if (this.field8654 != null && this.field8654[var9.field1206] != -1) {
                                var17 = this.field8654[var9.field1206];
                            }
                            int var18 = var9.field1207 * 2048 + var17 - arg5 & 0x3FFF;
                            if (var18 != 0) {
                                var13.f(var18);
                            }
                            int var19 = Trig1.sin[var18];
                            int var20 = Trig1.cos[var18];
                            int var21 = var14 * var20 + var16 * var19 >> 14;
                            var16 = var16 * var20 - var14 * var19 >> 14;
                            var14 = var21;
                        }
                        var13.ia(var14, var15, var16);
                    } else if (var9.field1207 != 0) {
                        var13.f(var9.field1207 * 2048);
                    }
                    if (var9.field1205 != 0) {
                        var13.ia(0, -var9.field1205 << 2, 0);
                    }
                    if (var11) {
                        if (this.field8601 != 0) {
                            var13.t(this.field8601);
                        }
                        if (this.field8644 != 0) {
                            var13.EA(this.field8644);
                        }
                        if (this.field8603 != 0) {
                            var13.ia(0, this.field8603, 0);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("aay.g(IIIIII)V")
    public void method13958(int arg0, int arg1, int arg2, int arg3, int arg4) {
        Vector3 var6 = this.getTransform().trans;
        int var7 = this.field10510 + this.field10508 >> 1;
        int var8 = this.field10511 + this.field10509 >> 1;
        int var9 = Trig1.sin[arg0];
        int var10 = Trig1.cos[arg0];
        int var11 = -arg1 / 2;
        int var12 = -arg2 / 2;
        int var13 = var9 * var12 + var10 * var11 >> 14;
        int var14 = var10 * var12 - var9 * var11 >> 14;
        int var15 = client.method12385((int) var6.x + var13, (int) var6.z + var14, var7, var8, this.level);
        int var16 = arg1 / 2;
        int var17 = -arg2 / 2;
        int var18 = var9 * var17 + var10 * var16 >> 14;
        int var19 = var10 * var17 - var9 * var16 >> 14;
        int var20 = client.method12385((int) var6.x + var18, (int) var6.z + var19, var7, var8, this.level);
        int var21 = -arg1 / 2;
        int var22 = arg2 / 2;
        int var23 = var9 * var22 + var10 * var21 >> 14;
        int var24 = var10 * var22 - var9 * var21 >> 14;
        int var25 = client.method12385((int) var6.x + var23, (int) var6.z + var24, var7, var8, this.level);
        int var26 = arg1 / 2;
        int var27 = arg2 / 2;
        int var28 = var9 * var27 + var10 * var26 >> 14;
        int var29 = var10 * var27 - var9 * var26 >> 14;
        int var30 = client.method12385((int) var6.x + var28, (int) var6.z + var29, var7, var8, this.level);
        int var31 = var15 < var20 ? var15 : var20;
        int var32 = var25 < var30 ? var25 : var30;
        int var33 = var20 < var30 ? var20 : var30;
        int var34 = var15 < var25 ? var15 : var25;
        this.field8601 = (int) (Math.atan2((double) (var31 - var32), (double) arg2) * 2607.5945876176133D) & 0x3FFF;
        this.field8644 = (int) (Math.atan2((double) (var34 - var33), (double) arg1) * 2607.5945876176133D) & 0x3FFF;
        if (this.field8601 != 0 && arg3 != 0) {
            int var35 = 16384 - arg3;
            if (this.field8601 > 8192) {
                if (this.field8601 < var35) {
                    this.field8601 = var35;
                }
            } else if (this.field8601 > arg3) {
                this.field8601 = arg3;
            }
        }
        if (this.field8644 != 0 && arg4 != 0) {
            int var36 = 16384 - arg4;
            if (this.field8644 > 8192) {
                if (this.field8644 < var36) {
                    this.field8644 = var36;
                }
            } else if (this.field8644 > arg4) {
                this.field8644 = arg4;
            }
        }
        this.field8603 = var15 + var30;
        if (var20 + var25 < this.field8603) {
            this.field8603 = var20 + var25;
        }
        this.field8603 = (this.field8603 >> 1) - (int) var6.y;
    }

    @ObfuscatedName("aay.bd(I)Lps;")
    public BASType getBASType() {
        int var1 = this.method13960();
        return var1 == -1 ? BASTypeList.field4733 : Statics.field3769.method7784(var1);
    }

    @ObfuscatedName("aay.cn(B)V")
    public void removeChatLine() {
        if (this.field8629 != null && this.field8629.field1232 != null) {
            this.field8629.field1236--;
            if (this.field8629.field1236 == 0) {
                this.field8629.field1232 = null;
            }
        }
    }

    @ObfuscatedName("aay.cr(Ljava/lang/String;IIII)V")
    public void method13998(String arg0, int arg1, int arg2, int arg3) {
        if (this.field8629 == null) {
            this.field8629 = new EntityChatLine();
        }
        this.field8629.field1232 = arg0;
        this.field8629.field1233 = arg1;
        this.field8629.field1234 = arg2;
        this.field8629.field1236 = this.field8629.field1235 = arg3;
    }

    @ObfuscatedName("aay.cg(II)V")
    public void method13965(int arg0) {
        if (this.field8653 != this.field8630) {
            this.method14002();
        }
        this.field8630 = arg0;
    }

    @ObfuscatedName("aay.cj(I)Z")
    public boolean method13976() {
        return this.field8630 == -1 ? false : this.method13966(this.field8630);
    }

    @ObfuscatedName("aay.cy(II)Z")
    public boolean method13966(int arg0) {
        if (this.field8653 == arg0) {
            return true;
        }
        this.field8652 = Component.method3971(arg0, null, null, true);
        if (this.field8652 == null) {
            return false;
        } else {
            this.field8653 = arg0;
            ScriptRunner.method11374(this.field8652.field1732);
            return true;
        }
    }

    @ObfuscatedName("aay.cz(S)V")
    public void method14002() {
        if (this.field8653 != -1) {
            Component.method7691(this.field8653);
            this.field8652 = null;
            this.field8653 = -1;
        }
    }

    @ObfuscatedName("aay.dx(IIIIIIIIB)V")
    public void method13967(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (this.method13976()) {
            client.updateLayer(this.field8652, this.field8652.getComponents(), -1, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
        }
    }

    @ObfuscatedName("aay.dh(IIIIIIII)V")
    public void method13968(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.method13976()) {
            client.method2709(this.field8652.getComponents(), -1, arg1, arg2, arg3, arg4, arg5, arg6, arg0, false);
        } else if (arg0 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                client.topLevelComponentRedrawRequestedTemp[var8] = true;
            }
        } else {
            client.topLevelComponentRedrawRequestedTemp[arg0] = true;
        }
    }

    @ObfuscatedName("aay.de(IIZI)V")
    public void method13969(int arg0, int arg1, boolean arg2) {
        if (this.method13976()) {
            client.method11323(this.field8652.field1732, -1, arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("aay.cf(I)Z")
    public abstract boolean method13942();

    @ObfuscatedName("aay.bm(I)I")
    public abstract int method13960();

    @ObfuscatedName("aay.cx(I)I")
    public abstract int method13961();

    @ObfuscatedName("aay.cs(S)Lcd;")
    public abstract EntityChatLine method13963();

    @ObfuscatedName("aay.dk(S)I")
    public abstract int method13970();
}
