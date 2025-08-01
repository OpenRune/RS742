package com.jagex;

import deob.ObfuscatedName;
import com.jagex.libs.jaggl.OpenGL;

@ObfuscatedName("co")
public class GlPostProcessing {

    @ObfuscatedName("co.u")
    public final GlToolkit field1148;

    @ObfuscatedName("co.j")
    public GlFramebuffer field1149;

    @ObfuscatedName("co.a")
    public GlFramebuffer field1165;

    @ObfuscatedName("co.s")
    public GlFramebuffer field1151;

    @ObfuscatedName("co.c")
    public int field1154 = 0;

    @ObfuscatedName("co.m")
    public int field1153 = 0;

    @ObfuscatedName("co.t")
    public int field1150 = 1;

    @ObfuscatedName("co.l")
    public int field1155 = 1;

    @ObfuscatedName("co.f")
    public boolean field1164;

    @ObfuscatedName("co.d")
    public LinkedList field1157 = new LinkedList();

    @ObfuscatedName("co.z")
    public boolean field1158 = true;

    @ObfuscatedName("co.n")
    public boolean field1159 = true;

    @ObfuscatedName("co.o")
    public boolean field1160 = true;

    @ObfuscatedName("co.q")
    public boolean field1156 = true;

    @ObfuscatedName("co.p")
    public GlRelated2[] field1162 = new GlRelated2[2];

    @ObfuscatedName("co.w")
    public PostProcessingRelated field1163;

    @ObfuscatedName("co.b")
    public GlRelated2 field1166;

    @ObfuscatedName("co.x")
    public PostProcessingRelated field1152;

    @ObfuscatedName("co.i")
    public boolean field1168 = false;

    @ObfuscatedName("co.v")
    public int field1167 = 0;

    @ObfuscatedName("co.k")
    public DataType field1161 = DataType.field1501;

    public GlPostProcessing(GlToolkit arg0) {
        this.field1148 = arg0;
        if (this.field1148.field8176 && this.field1148.field8208) {
            this.field1151 = this.field1149 = new GlFramebuffer(this.field1148);
            if (this.field1148.field8080 > 1 && this.field1148.field8122 && this.field1148.field8200) {
                this.field1151 = this.field1165 = new GlFramebuffer(this.field1148);
            }
        }
    }

    @ObfuscatedName("co.u()V")
    public void method2297() {
        this.field1149 = null;
        this.field1165 = null;
        this.field1151 = null;
        this.field1152 = null;
        this.field1166 = null;
        this.field1162 = null;
        this.field1163 = null;
        if (!this.field1157.method11585()) {
            for (Node var1 = this.field1157.head(); var1 != this.field1157.sentinel; var1 = var1.next) {
                ((GlPostProcessEffect) var1).method14820();
            }
        }
        this.field1155 = 1;
        this.field1150 = 1;
    }

    @ObfuscatedName("co.j()Z")
    public boolean method2298() {
        return this.field1151 != null;
    }

    @ObfuscatedName("co.a()Z")
    public boolean method2299() {
        if (this.field1159) {
            if (this.field1152 != null) {
                this.field1152.method168();
                this.field1152 = null;
            }
            if (this.field1166 != null) {
                this.field1166.method2048();
                this.field1166 = null;
            }
        }
        if (this.field1158) {
            if (this.field1163 != null) {
                this.field1163.method168();
                this.field1163 = null;
            }
            if (this.field1162[0] != null) {
                this.field1162[0].method2048();
                this.field1162[0] = null;
            }
            if (this.field1162[1] != null) {
                this.field1162[1].method2048();
                this.field1162[1] = null;
            }
        }
        if (this.field1159) {
            if (this.field1165 != null) {
                this.field1152 = new PostProcessingRelated(this.field1148, TextureFormat.field1300, DataType.field1503, this.field1150, this.field1155, this.field1148.field8080);
            }
            if (this.field1168) {
                this.field1166 = new GlRelated2(this.field1148, 34037, TextureFormat.field1300, DataType.field1503, this.field1150, this.field1155);
            } else if (this.field1152 == null) {
                this.field1152 = new PostProcessingRelated(this.field1148, TextureFormat.field1300, DataType.field1503, this.field1150, this.field1155);
            }
            this.field1159 = false;
            this.field1160 = true;
            this.field1156 = true;
        }
        if (this.field1158) {
            if (this.field1165 != null) {
                this.field1163 = new PostProcessingRelated(this.field1148, TextureFormat.field1296, this.field1161, this.field1150, this.field1155, this.field1148.field8080);
            }
            this.field1162[0] = new GlRelated2(this.field1148, 34037, TextureFormat.field1296, this.field1161, this.field1150, this.field1155);
            this.field1162[1] = this.field1167 > 1 ? new GlRelated2(this.field1148, 34037, TextureFormat.field1296, this.field1161, this.field1150, this.field1155) : null;
            this.field1158 = false;
            this.field1160 = true;
            this.field1156 = true;
        }
        if (this.field1160) {
            if (this.field1165 == null) {
                this.field1148.method464(this.field1149);
                this.field1149.method1207(null);
                this.field1149.method1206(0, null);
                this.field1149.method1206(1, null);
                this.field1149.method1206(0, this.field1162[0].method12762(0));
                this.field1149.method1206(1, this.field1167 > 1 ? this.field1162[1].method12762(0) : null);
                if (this.field1168) {
                    this.field1149.method1207(this.field1166.method12764(0));
                } else {
                    this.field1149.method1207(this.field1152);
                }
                this.field1148.method696(this.field1149);
            } else {
                this.field1148.method464(this.field1149);
                this.field1149.method1207(null);
                this.field1149.method1206(0, null);
                this.field1149.method1206(1, null);
                this.field1149.method1206(0, this.field1162[0].method12762(0));
                this.field1149.method1206(1, this.field1167 > 1 ? this.field1162[1].method12762(0) : null);
                if (this.field1168) {
                    this.field1149.method1207(this.field1166.method12764(0));
                }
                this.field1148.method696(this.field1149);
                this.field1148.method464(this.field1165);
                this.field1165.method1207(null);
                this.field1165.method1206(0, null);
                this.field1165.method1206(0, this.field1163);
                this.field1165.method1207(this.field1152);
                this.field1148.method696(this.field1165);
            }
            this.field1160 = false;
            this.field1156 = true;
        }
        if (this.field1156) {
            this.field1148.method464(this.field1151);
            this.field1156 = !this.field1151.method1208();
            this.field1148.method696(this.field1151);
        }
        return !this.field1156;
    }

    @ObfuscatedName("co.s(IIII)Z")
    public boolean method2308(int arg0, int arg1, int arg2, int arg3) {
        if (this.field1151 == null || this.field1157.method11585()) {
            return false;
        }
        if (this.field1150 != arg2 || this.field1155 != arg3) {
            this.field1150 = arg2;
            this.field1155 = arg3;
            for (Node var5 = this.field1157.head(); var5 != this.field1157.sentinel; var5 = var5.next) {
                ((GlPostProcessEffect) var5).method14821(this.field1150, this.field1155);
            }
            this.field1158 = true;
            this.field1159 = true;
            this.field1160 = true;
        }
        if (!this.method2299()) {
            return false;
        }
        this.field1154 = arg0;
        this.field1153 = arg1;
        this.field1164 = true;
        this.field1148.method13379(-this.field1154, this.field1155 + this.field1153 - this.field1148.method457().method922());
        this.field1148.method464(this.field1151);
        this.field1148.ba(3, 0);
        this.field1151.method16000(0);
        return true;
    }

    @ObfuscatedName("co.c()V")
    public void method2300() {
        if (!this.field1164) {
            return;
        }
        if (this.field1165 != null) {
            this.field1148.method696(this.field1165);
            this.field1148.method464(this.field1149);
            this.field1149.method16000(0);
            this.field1165.method1210(0, 0, this.field1150, this.field1155, 0, 0, true, this.field1168);
        }
        this.field1148.method13309();
        this.field1148.method13327(0);
        this.field1148.method13316(1);
        this.field1148.L();
        int var1 = 0;
        int var2 = 1;
        GlPostProcessEffect var4;
        for (GlPostProcessEffect var3 = (GlPostProcessEffect) this.field1157.head(); var3 != null; var3 = var4) {
            var4 = (GlPostProcessEffect) this.field1157.next();
            int var5 = var3.method14832();
            for (int var6 = 0; var6 < var5; var6++) {
                var3.method14822(var6, this.field1162[var1], this.field1166);
                if (var4 == null && var5 - 1 == var6) {
                    this.field1148.method696(this.field1149);
                    this.field1148.method13379(0, 0);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field1155);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2i(this.field1154, this.field1153);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2i(this.field1154, this.field1155 + this.field1153);
                    OpenGL.glTexCoord2f((float) this.field1150, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2i(this.field1154 + this.field1150, this.field1155 + this.field1153);
                    OpenGL.glTexCoord2f((float) this.field1150, (float) this.field1155);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2i(this.field1154 + this.field1150, this.field1153);
                    OpenGL.glEnd();
                } else {
                    this.field1149.method16000(var2);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field1155);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2i(0, this.field1155);
                    OpenGL.glTexCoord2f((float) this.field1150, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2i(this.field1150, this.field1155);
                    OpenGL.glTexCoord2f((float) this.field1150, (float) this.field1155);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2i(this.field1150, 0);
                    OpenGL.glEnd();
                }
                var3.method14823(var6);
                var2 = var2 + 1 & 0x1;
                var1 = var1 + 1 & 0x1;
            }
        }
        this.field1164 = false;
    }

    @ObfuscatedName("co.m(Lacd;)Z")
    public boolean method2301(GlPostProcessEffect arg0) {
        if (this.field1151 != null) {
            if (arg0.method14840() || arg0.method14844()) {
                this.field1157.addTail(arg0);
                this.method2303();
                if (this.method2299()) {
                    if (this.field1150 != -1 && this.field1155 != -1) {
                        arg0.method14821(this.field1150, this.field1155);
                    }
                    arg0.field9321 = true;
                    return true;
                }
            }
            this.method2302(arg0);
        }
        return false;
    }

    @ObfuscatedName("co.t(Lacd;)V")
    public void method2302(GlPostProcessEffect arg0) {
        arg0.field9321 = false;
        arg0.method14820();
        arg0.unlink();
        this.method2303();
    }

    @ObfuscatedName("co.l()V")
    public void method2303() {
        int var1 = 0;
        boolean var2 = false;
        DataType var3 = DataType.field1501;
        for (GlPostProcessEffect var4 = (GlPostProcessEffect) this.field1157.head(); var4 != null; var4 = (GlPostProcessEffect) this.field1157.next()) {
            DataType var5 = var4.method14826();
            if (var5.field1508 > var3.field1508) {
                var3 = var5;
            }
            var2 |= var4.method14825();
            var1 += var4.method14832();
        }
        if (this.field1161 != var3) {
            this.field1161 = var3;
            this.field1158 = true;
        }
        int var6 = this.field1167 > 2 ? 2 : this.field1167;
        int var7 = var1 > 2 ? 2 : var1;
        if (var6 != var7) {
            this.field1158 = true;
            this.field1160 = true;
        }
        if (this.field1168 != var2) {
            this.field1168 = var2;
            this.field1159 = true;
        }
        this.field1167 = var1;
    }
}
