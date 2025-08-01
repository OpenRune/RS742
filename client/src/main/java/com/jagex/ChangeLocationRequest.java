package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("ach")
public final class ChangeLocationRequest extends Node {

    @ObfuscatedName("ach.s")
    public int field9281;

    @ObfuscatedName("ach.c")
    public int field9293;

    @ObfuscatedName("ach.m")
    public int field9291;

    @ObfuscatedName("ach.t")
    public int field9280;

    @ObfuscatedName("ach.l")
    public int field9282;

    @ObfuscatedName("ach.f")
    public int field9283;

    @ObfuscatedName("ach.d")
    public int field9284;

    @ObfuscatedName("ach.z")
    public int field9285;

    @ObfuscatedName("ach.n")
    public int field9286;

    @ObfuscatedName("ach.o")
    public int field9287;

    @ObfuscatedName("ach.q")
    public LocTypeCustomisation field9288;

    @ObfuscatedName("ach.p")
    public boolean field9289 = true;

    @ObfuscatedName("ach.w")
    public boolean field9290 = false;

    @ObfuscatedName("ach.b")
    public static LinkedList field9278 = new LinkedList();

    @ObfuscatedName("ach.x")
    public static LinkedList field9292 = new LinkedList();

    @ObfuscatedName("ach.i")
    public static long field9279 = 1L;

    @ObfuscatedName("zb.u(IIIIIIII)V")
    public static void method13876(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ChangeLocationRequest var7 = null;
        for (ChangeLocationRequest var8 = (ChangeLocationRequest) field9278.head(); var8 != null; var8 = (ChangeLocationRequest) field9278.next()) {
            if (var8.field9281 == arg0 && var8.field9291 == arg1 && var8.field9280 == arg2 && var8.field9293 == arg3) {
                var7 = var8;
                break;
            }
        }
        if (var7 == null) {
            var7 = new ChangeLocationRequest();
            var7.field9281 = arg0;
            var7.field9293 = arg3;
            var7.field9291 = arg1;
            var7.field9280 = arg2;
            if (arg1 >= 0 && arg2 >= 0 && arg1 < client.world.getSizeX() && arg2 < client.world.getSizeZ()) {
                method3598(var7);
            }
            field9278.addTail(var7);
        }
        var7.field9285 = arg4;
        var7.field9287 = arg5;
        var7.field9286 = arg6;
        var7.field9289 = true;
        var7.field9290 = false;
    }

    @ObfuscatedName("abz.j(IIIIIILto;I)V")
    public static void method14721(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, LocTypeCustomisation arg6) {
        ChangeLocationRequest var7 = null;
        for (ChangeLocationRequest var8 = (ChangeLocationRequest) field9292.head(); var8 != null; var8 = (ChangeLocationRequest) field9292.next()) {
            if (var8.field9281 == arg0 && var8.field9291 == arg1 && var8.field9280 == arg2 && var8.field9293 == arg3) {
                var7 = var8;
                break;
            }
        }
        if (var7 == null) {
            var7 = new ChangeLocationRequest();
            var7.field9281 = arg0;
            var7.field9293 = arg3;
            var7.field9291 = arg1;
            var7.field9280 = arg2;
            field9292.addTail(var7);
        }
        var7.field9285 = arg4;
        var7.field9287 = arg5;
        var7.field9288 = arg6;
        var7.field9289 = true;
        var7.field9290 = false;
    }

    @ObfuscatedName("th.a(I)V")
    public static final void method11709() {
        for (ChangeLocationRequest var0 = (ChangeLocationRequest) field9278.head(); var0 != null; var0 = (ChangeLocationRequest) field9278.next()) {
            if (var0.field9290) {
                var0.unlink();
            } else {
                var0.field9289 = true;
                if (var0.field9291 >= 0 && var0.field9280 >= 0 && var0.field9291 < client.world.getSizeX() && var0.field9280 < client.world.getSizeZ()) {
                    method3598(var0);
                }
            }
        }
        for (ChangeLocationRequest var1 = (ChangeLocationRequest) field9292.head(); var1 != null; var1 = (ChangeLocationRequest) field9292.next()) {
            if (var1.field9290) {
                var1.unlink();
            } else {
                var1.field9289 = true;
            }
        }
    }

    @ObfuscatedName("fy.s(Lach;I)V")
    public static final void method3598(ChangeLocationRequest arg0) {
        Scene var1 = client.world.getScene();
        if (var1 == null) {
            return;
        }
        Location var2 = null;
        if (arg0.field9293 == 0) {
            var2 = (Location) var1.method7433(arg0.field9281, arg0.field9291, arg0.field9280);
        }
        if (arg0.field9293 == 1) {
            var2 = (Location) var1.method7435(arg0.field9281, arg0.field9291, arg0.field9280);
        }
        if (arg0.field9293 == 2) {
            var2 = (Location) var1.method7437(arg0.field9281, arg0.field9291, arg0.field9280, client.field9216);
        }
        if (arg0.field9293 == 3) {
            var2 = (Location) var1.method7517(arg0.field9281, arg0.field9291, arg0.field9280);
        }
        if (var2 == null) {
            arg0.field9282 = -1;
            arg0.field9284 = 0;
            arg0.field9283 = 0;
        } else {
            arg0.field9282 = var2.getType();
            arg0.field9284 = var2.method2390();
            arg0.field9283 = var2.method2391();
        }
    }

    @ObfuscatedName("fx.c(I)V")
    public static final void method3590() {
        for (ChangeLocationRequest var0 = (ChangeLocationRequest) field9278.head(); var0 != null; var0 = (ChangeLocationRequest) field9278.next()) {
            method4624(var0, false);
        }
        for (ChangeLocationRequest var1 = (ChangeLocationRequest) field9292.head(); var1 != null; var1 = (ChangeLocationRequest) field9292.next()) {
            method4624(var1, true);
        }
    }

    @ObfuscatedName("iz.m(Lach;ZI)V")
    public static final void method4624(ChangeLocationRequest arg0, boolean arg1) {
        if (arg0.field9290) {
            if (arg0.field9282 < 0 || ClientMapLoader.method8598(client.world.getLocTypeList(), arg0.field9282, arg0.field9284)) {
                if (arg1) {
                    method12070(arg0.field9281, arg0.field9293, arg0.field9291, arg0.field9280, null);
                } else {
                    method11120(arg0.field9281, arg0.field9293, arg0.field9291, arg0.field9280, arg0.field9282, arg0.field9283, arg0.field9284, -1);
                }
                arg0.unlink();
            }
        } else if (arg0.field9289 && arg0.field9291 >= 1 && arg0.field9280 >= 1 && arg0.field9291 <= client.world.getSizeX() - 2 && arg0.field9280 <= client.world.getSizeZ() - 2 && (arg0.field9285 < 0 || ClientMapLoader.method8598(client.world.getLocTypeList(), arg0.field9285, arg0.field9287))) {
            if (arg1) {
                method12070(arg0.field9281, arg0.field9293, arg0.field9291, arg0.field9280, arg0.field9288);
            } else {
                method11120(arg0.field9281, arg0.field9293, arg0.field9291, arg0.field9280, arg0.field9285, arg0.field9286, arg0.field9287, -1);
            }
            arg0.field9289 = false;
            if (!arg1 && arg0.field9285 == arg0.field9282 && arg0.field9282 == -1) {
                arg0.unlink();
            } else if (!arg1 && arg0.field9285 == arg0.field9282 && arg0.field9286 == arg0.field9283 && arg0.field9287 == arg0.field9284) {
                arg0.unlink();
            }
        }
    }

    @ObfuscatedName("sd.t(IIIIIIIIB)V")
    public static final void method11120(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg2 < 1 || arg3 < 1 || arg2 > client.world.getSizeX() - 2 || arg3 > client.world.getSizeZ() - 2) {
            return;
        }
        int var8 = arg0;
        if (arg0 < 3 && client.world.getSceneLevelTileFlags().isLinkBelow(arg2, arg3)) {
            var8 = arg0 + 1;
        }
        if (client.world.getScene() == null) {
            return;
        }
        client.world.method6157().method14280(client.toolkit, arg0, arg1, arg2, arg3, client.world.method6101(arg0));
        if (arg4 >= 0) {
            int var9 = client.options.groundDecor.method15725();
            client.options.method15448(client.options.groundDecor, 1);
            client.world.method6157().method14304(client.toolkit, var8, arg0, arg2, arg3, arg4, arg5, arg6, client.world.method6101(arg0), arg7);
            client.options.method15448(client.options.groundDecor, var9);
        }
    }

    @ObfuscatedName("ut.l(IIIILto;I)V")
    public static final void method12070(int arg0, int arg1, int arg2, int arg3, LocTypeCustomisation arg4) {
        if (arg2 < 1 || arg3 < 1 || arg2 > client.world.getSizeX() - 2 || arg3 > client.world.getSizeZ() - 2) {
            return;
        }
        if (client.world.getScene() == null) {
            return;
        }
        Location var5 = client.world.method6157().method14289(arg0, arg1, arg2, arg3);
        if (var5 == null) {
            return;
        }
        if (var5 instanceof DynamicSceneryEntity) {
            ((DynamicSceneryEntity) var5).method12813(arg4);
        } else if (var5 instanceof DynamicGroundDecorEntity) {
            ((DynamicGroundDecorEntity) var5).method12858(arg4);
        } else if (var5 instanceof DynamicWallEntity) {
            ((DynamicWallEntity) var5).method12898(arg4);
        } else if (var5 instanceof DynamicWallDecorEntity) {
            ((DynamicWallDecorEntity) var5).method12893(arg4);
        }
    }
}
