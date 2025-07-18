package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("po")
public class HitmarkType {

    @ObfuscatedName("po.u")
    public HitmarkTypeList field4754;

    @ObfuscatedName("po.t")
    public boolean field4742 = false;

    @ObfuscatedName("po.l")
    public int field4744 = -1;

    @ObfuscatedName("po.f")
    public int field4736 = 16777215;

    @ObfuscatedName("po.d")
    public int field4750 = 70;

    @ObfuscatedName("po.z")
    public int field4746 = -1;

    @ObfuscatedName("po.n")
    public int field4747 = -1;

    @ObfuscatedName("po.o")
    public int field4748 = -1;

    @ObfuscatedName("po.q")
    public int field4749 = -1;

    @ObfuscatedName("po.p")
    public int field4738 = 0;

    @ObfuscatedName("po.w")
    public int field4751 = 0;

    @ObfuscatedName("po.b")
    public int field4752 = -1;

    @ObfuscatedName("po.x")
    public String field4753 = "";

    @ObfuscatedName("po.i")
    public int field4743 = -1;

    @ObfuscatedName("po.v")
    public int field4755 = 0;

    @ObfuscatedName("po.u(Laet;I)V")
    public void method7791(Packet arg0) {
        while (true) {
            int var2 = arg0.g1();
            if (var2 == 0) {
                return;
            }
            this.method7792(arg0, var2);
        }
    }

    @ObfuscatedName("po.j(Laet;II)V")
    public void method7792(Packet arg0, int arg1) {
        if (arg1 == 1) {
            this.field4744 = arg0.gSmart2or4null();
        } else if (arg1 == 2) {
            this.field4736 = arg0.g3();
            this.field4742 = true;
        } else if (arg1 == 3) {
            this.field4746 = arg0.gSmart2or4null();
        } else if (arg1 == 4) {
            this.field4748 = arg0.gSmart2or4null();
        } else if (arg1 == 5) {
            this.field4747 = arg0.gSmart2or4null();
        } else if (arg1 == 6) {
            this.field4749 = arg0.gSmart2or4null();
        } else if (arg1 == 7) {
            this.field4738 = arg0.g2s();
        } else if (arg1 == 8) {
            this.field4753 = arg0.gjstr2();
        } else if (arg1 == 9) {
            this.field4750 = arg0.g2();
        } else if (arg1 == 10) {
            this.field4751 = arg0.g2s();
        } else if (arg1 == 11) {
            this.field4752 = 0;
        } else if (arg1 == 12) {
            this.field4743 = arg0.g1();
        } else if (arg1 == 13) {
            this.field4755 = arg0.g2s();
        } else if (arg1 == 14) {
            this.field4752 = arg0.g2();
        }
    }

    @ObfuscatedName("po.a(II)Ljava/lang/String;")
    public String method7793(int arg0) {
        String var2 = this.field4753;
        while (true) {
            int var3 = var2.indexOf("%1");
            if (var3 < 0) {
                return var2;
            }
            var2 = var2.substring(0, var3) + StringTools.method1601(arg0, false) + var2.substring(var3 + 2);
        }
    }

    @ObfuscatedName("po.s(Lra;B)Lce;")
    public Sprite method7794(RendererToolkit arg0) {
        if (this.field4746 < 0) {
            return null;
        }
        Sprite var2 = (Sprite) this.field4754.field4759.get((long) this.field4746);
        if (var2 == null) {
            this.method7798(arg0);
            var2 = (Sprite) this.field4754.field4759.get((long) this.field4746);
        }
        return var2;
    }

    @ObfuscatedName("po.c(Lra;B)Lce;")
    public Sprite method7796(RendererToolkit arg0) {
        if (this.field4747 < 0) {
            return null;
        }
        Sprite var2 = (Sprite) this.field4754.field4759.get((long) this.field4747);
        if (var2 == null) {
            this.method7798(arg0);
            var2 = (Sprite) this.field4754.field4759.get((long) this.field4747);
        }
        return var2;
    }

    @ObfuscatedName("po.m(Lra;I)Lce;")
    public Sprite method7797(RendererToolkit arg0) {
        if (this.field4748 < 0) {
            return null;
        }
        Sprite var2 = (Sprite) this.field4754.field4759.get((long) this.field4748);
        if (var2 == null) {
            this.method7798(arg0);
            var2 = (Sprite) this.field4754.field4759.get((long) this.field4748);
        }
        return var2;
    }

    @ObfuscatedName("po.t(Lra;B)Lce;")
    public Sprite method7804(RendererToolkit arg0) {
        if (this.field4749 < 0) {
            return null;
        }
        Sprite var2 = (Sprite) this.field4754.field4759.get((long) this.field4749);
        if (var2 == null) {
            this.method7798(arg0);
            var2 = (Sprite) this.field4754.field4759.get((long) this.field4749);
        }
        return var2;
    }

    @ObfuscatedName("po.l(Lra;I)V")
    public void method7798(RendererToolkit arg0) {
        Js5 var2 = this.field4754.field4757;
        if (this.field4746 >= 0 && this.field4754.field4759.get((long) this.field4746) == null && var2.method5630(this.field4746)) {
            SpriteData var3 = SpriteDataProvider.method2598(var2, this.field4746);
            this.field4754.field4759.method7937(arg0.method517(var3, true), (long) this.field4746);
        }
        if (this.field4747 >= 0 && this.field4754.field4759.get((long) this.field4747) == null && var2.method5630(this.field4747)) {
            SpriteData var4 = SpriteDataProvider.method2598(var2, this.field4747);
            this.field4754.field4759.method7937(arg0.method517(var4, true), (long) this.field4747);
        }
        if (this.field4748 >= 0 && this.field4754.field4759.get((long) this.field4748) == null && var2.method5630(this.field4748)) {
            SpriteData var5 = SpriteDataProvider.method2598(var2, this.field4748);
            this.field4754.field4759.method7937(arg0.method517(var5, true), (long) this.field4748);
        }
        if (this.field4749 >= 0 && this.field4754.field4759.get((long) this.field4749) == null && var2.method5630(this.field4749)) {
            SpriteData var6 = SpriteDataProvider.method2598(var2, this.field4749);
            this.field4754.field4759.method7937(arg0.method517(var6, true), (long) this.field4749);
        }
    }
}
