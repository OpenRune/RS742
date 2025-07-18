package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("ev")
public class MidiPlayer {

    @ObfuscatedName("ev.d")
    public static int state = 0;

    public MidiPlayer() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("gr.j(Lls;IIIZI)V")
    public static void method3986(Js5 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        method11947(arg0, arg1, arg2, arg3, arg4, 0L);
    }

    @ObfuscatedName("mk.a(Lls;IIIZLaih;B)V")
    public static void method6359(Js5 arg0, int arg1, int arg2, int arg3, boolean arg4, MidiAudioBuss arg5) {
        method3986(arg0, arg1, arg2, arg3, arg4);
        Statics.field4262 = arg5;
    }

    @ObfuscatedName("uo.s(Lls;IIIZJ)V")
    public static void method11947(Js5 arg0, int arg1, int arg2, int arg3, boolean arg4, long arg5) {
        method6986(arg0, arg1, arg2, arg3, arg4, arg5, 0);
    }

    @ObfuscatedName("nz.c(Lls;IIIZJII)V")
    public static void method6986(Js5 arg0, int arg1, int arg2, int arg3, boolean arg4, long arg5, int arg6) {
        state = 1;
        Statics.field6702 = arg0;
        Statics.field7042 = arg1;
        Statics.field641 = arg2;
        Statics.field4262 = null;
        Statics.field3723 = arg3;
        Statics.field4930 = arg4;
        Statics.volumeFadeRate = 10000;
        Statics.field8515 = arg5;
        Statics.field4167 = arg6;
    }

    @ObfuscatedName("s.m(IB)V")
    public static void method1315(int arg0) {
        if (state == 0) {
            Statics.field1735.method16263(arg0);
        } else {
            Statics.field3723 = arg0;
        }
    }

    @ObfuscatedName("ig.t(II)V")
    public static void method4553(int arg0) {
        Statics.field1735.method16265(arg0 >> 8);
    }

    @ObfuscatedName("tt.l(III)V")
    public static void method11835(int arg0, int arg1) {
        if (state != 0) {
            if (arg0 < 0) {
                for (int var2 = 0; var2 < 16; var2++) {
                    Statics.field4559[var2] = arg1;
                }
            } else {
                Statics.field4559[arg0] = arg1;
            }
        }
        Statics.field1735.method16266(arg0, arg1);
    }

    @ObfuscatedName("re.f(I)V")
    public static void method8662() {
        Statics.field1735.method16273();
        state = 1;
        Statics.field6702 = null;
        Statics.field4262 = null;
    }

    @ObfuscatedName("tv.d(ILls;IIIZI)V")
    public static void method11764(int arg0, Js5 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        state = 1;
        Statics.field6702 = arg1;
        Statics.field7042 = arg2;
        Statics.field641 = arg3;
        Statics.field4262 = null;
        Statics.field3723 = arg4;
        Statics.field4930 = arg5;
        Statics.volumeFadeRate = arg0;
        Statics.field4058 = null;
    }

    @ObfuscatedName("ex.z(II)V")
    public static void method3311(int arg0) {
        state = 1;
        Statics.field6702 = null;
        Statics.field7042 = -1;
        Statics.field641 = -1;
        Statics.field4262 = null;
        Statics.field3723 = 0;
        Statics.field4930 = false;
        Statics.volumeFadeRate = arg0;
        Statics.field4058 = null;
    }

    @ObfuscatedName("aic.n(ILls;IIIZLer;B)V")
    public static void method16250(int arg0, Js5 arg1, int arg2, int arg3, int arg4, boolean arg5, MidiSoundRelated3 arg6) {
        if (arg0 <= 0) {
            if (arg6 != null) {
                arg6.method2988();
            }
            method3986(arg1, arg2, arg3, arg4, arg5);
            return;
        }
        state = 1;
        Statics.field6702 = arg1;
        Statics.field7042 = arg2;
        Statics.field641 = arg3;
        Statics.field4262 = null;
        Statics.field3723 = arg4;
        Statics.field4930 = arg5;
        Statics.volumeFadeRate = Statics.field1735.method16264() / arg0;
        if (Statics.volumeFadeRate < 1) {
            Statics.volumeFadeRate = 1;
        }
        Statics.field4058 = arg6;
    }

    @ObfuscatedName("zk.o(I)Z")
    public static boolean method13899() {
        return state == 0 ? Statics.field1735.method16299() : true;
    }

    @ObfuscatedName("adt.q(I)Z")
    public static boolean method15138() {
        return state != 0;
    }

    @ObfuscatedName("lv.p(I)V")
    public static void loop() {
        try {
            if (state == 1) {
                int var0 = Statics.field1735.method16264();
                if (var0 > 0 && Statics.field1735.method16299()) {
                    int var1 = var0 - Statics.volumeFadeRate;
                    if (var1 < 0) {
                        var1 = 0;
                    }
                    Statics.field1735.method16263(var1);
                    return;
                }
                Statics.field1735.method16273();
                Statics.field1735.method16269();
                if (Statics.field6702 == null) {
                    state = 0;
                } else {
                    state = 2;
                }
                Statics.field4835 = null;
                Statics.field1279 = null;
            }
            if (state == 3) {
                int var2 = Statics.field1735.method16264();
                if (var2 < Statics.field3723 && Statics.field1735.method16299()) {
                    int var3 = Statics.field4167 + var2;
                    if (var3 > Statics.field3723) {
                        var3 = Statics.field3723;
                    }
                    Statics.field1735.method16263(var3);
                    return;
                }
                Statics.field4167 = 0;
                state = 0;
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field1735.method16273();
            method7561();
        }
    }

    @ObfuscatedName("ol.w(I)Z")
    public static boolean method7075() {
        try {
            if (state == 2) {
                if (Statics.field4835 == null) {
                    Statics.field4835 = MidiSong.method14909(Statics.field6702, Statics.field7042, Statics.field641);
                    if (Statics.field4835 == null) {
                        return false;
                    }
                }
                if (Statics.field1279 == null) {
                    Statics.field1279 = new SoundBank(Statics.field1581, Statics.field1580);
                }
                MidiAudioBuss var0 = Statics.field1735;
                if (Statics.field4262 != null) {
                    var0 = Statics.field4262;
                }
                if (var0.method16375(Statics.field4835, Statics.field1586, Statics.field1279, 22050)) {
                    Statics.field1735 = var0;
                    Statics.field1735.method16324();
                    if (Statics.field4167 > 0) {
                        state = 3;
                        Statics.field1735.method16263(Statics.field4167 > Statics.field3723 ? Statics.field3723 : Statics.field4167);
                        for (int var1 = 0; var1 < Statics.field4559.length; var1++) {
                            Statics.field1735.method16266(var1, Statics.field4559[var1]);
                            Statics.field4559[var1] = 255;
                        }
                    } else {
                        state = 0;
                        Statics.field1735.method16263(Statics.field3723);
                        for (int var2 = 0; var2 < Statics.field4559.length; var2++) {
                            Statics.field1735.method16266(var2, Statics.field4559[var2]);
                            Statics.field4559[var2] = 255;
                        }
                    }
                    if (Statics.field4262 == null) {
                        if (Statics.field8515 > 0L) {
                            Statics.field1735.method16272(Statics.field4835, Statics.field4930, true, Statics.field8515);
                        } else {
                            Statics.field1735.method16311(Statics.field4835, Statics.field4930);
                        }
                        if (Statics.field4058 != null) {
                            Statics.field4058.method2988();
                        }
                    }
                    if (Statics.field4165 != null) {
                        Statics.field4165.setStream(Statics.field1735);
                    }
                    Statics.field4835 = null;
                    Statics.field1279 = null;
                    Statics.field6702 = null;
                    Statics.field8515 = 0L;
                    Statics.field4262 = null;
                    Statics.field4058 = null;
                    return true;
                }
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            Statics.field1735.method16273();
            method7561();
        }
        return false;
    }

    @ObfuscatedName("pl.b(Leq;IB)V")
    public static void method7908(MidiSoundRelated4 arg0, int arg1) {
        Statics.field1735.method16273();
        MidiAudioBuss var2 = arg0.method3002();
        if (var2 == null) {
            return;
        }
        Statics.field4165.method6497();
        Statics.field1735 = var2;
        Statics.field1735.method16311(arg0.method3009(), false);
        Statics.field1735.method16263(arg1);
        if (Statics.field4165 != null) {
            Statics.field4165.setStream(Statics.field1735);
        }
        method7561();
    }

    @ObfuscatedName("ou.x(I)V")
    public static void method7561() {
        state = 0;
        Statics.field4835 = null;
        Statics.field1279 = null;
        Statics.field6702 = null;
        Statics.field4262 = null;
    }

    @ObfuscatedName("pp.i(I)Laih;")
    public static MidiAudioBuss method7705() {
        return Statics.field1735;
    }
}
