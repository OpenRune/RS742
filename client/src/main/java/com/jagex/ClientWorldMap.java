package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("aeq")
public class ClientWorldMap extends WorldMap {

    @ObfuscatedName("aeq.am")
    public static int field9764 = -1;

    @ObfuscatedName("aeq.ad")
    public static int loadingProgress = 0;

    @ObfuscatedName("aeq.ah")
    public static int field9762 = -1;

    @ObfuscatedName("aeq.au")
    public static int field9756 = -1;

    @ObfuscatedName("aeq.ab")
    public static boolean field9754 = false;

    @ObfuscatedName("aeq.bv")
    public static int field9759 = -1;

    @ObfuscatedName("aeq.bj")
    public static int field9757 = -1;

    @ObfuscatedName("aeq.bf")
    public static boolean field9760 = false;

    @ObfuscatedName("aeq.bc")
    public static String[] field9761 = new String[5];

    @ObfuscatedName("aeq.br")
    public static int field9755 = -1;

    @ObfuscatedName("aeq.bp")
    public static int field9763 = -1;

    @ObfuscatedName("aeq.bb")
    public static boolean disableElements = false;

    @ObfuscatedName("aeq.be")
    public static HashTable field9765 = new HashTable(8);

    @ObfuscatedName("aeq.bw")
    public static HashTable field9766 = new HashTable(8);

    @ObfuscatedName("aeq.bo")
    public static IterableQueueIterator field9767 = new IterableQueueIterator(new LinkedList());

    public ClientWorldMap() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("og.bp(Lra;Lma;I)V")
    public static final void method7164(RendererToolkit arg0, MaterialTypeList arg1) {
        if (Statics.currentArea == null) {
            return;
        }

        MonotonicTime.get();
        MonotonicTime.get();

        if (loadingProgress < 10) {
            if (!Statics.field4264.method5648(Statics.currentArea.debugname)) {
                loadingProgress = Statics.field4059.method5650(Statics.currentArea.debugname) / 10;
                return;
            }

            client.method7380();
            loadingProgress = 10;
        }

        if (loadingProgress == 10) {
            Statics.currentAreaDisplayMinX = Statics.currentArea.displayMinX >> 6 << 6;
            Statics.currentAreaDisplayMinZ = Statics.currentArea.displayMinZ >> 6 << 6;
            Statics.currentAreaDisplaySizeX = (Statics.currentArea.displayMaxX >> 6 << 6) - Statics.currentAreaDisplayMinX + 64;
            Statics.currentAreaDisplaySizeZ = (Statics.currentArea.displayMaxZ >> 6 << 6) - Statics.currentAreaDisplayMinZ + 64;
            int[] var2 = new int[3];
            int var3 = -1;
            int var4 = -1;
            Vector3 var5 = Statics.localPlayerEntity.getTransform().trans;
            CoordGrid var6 = client.world.getBase();
            if (Statics.currentArea.getDisplayCoord(Statics.localPlayerEntity.level, ((int) var5.x >> 9) + var6.x, ((int) var5.z >> 9) + var6.z, var2)) {
                var3 = var2[1] - Statics.currentAreaDisplayMinX;
                var4 = var2[2] - Statics.currentAreaDisplayMinZ;
            }
            if (!field9760 && var3 >= 0 && var3 < Statics.currentAreaDisplaySizeX && var4 >= 0 && var4 < Statics.currentAreaDisplaySizeZ) {
                int var7 = var3 + ((int) (Math.random() * 10.0D) - 5);
                int var8 = var4 + ((int) (Math.random() * 10.0D) - 5);
                Statics.displayX = var7;
                Statics.displayZ = var8;
            } else if (field9759 == -1 || field9757 == -1) {
                Statics.currentArea.method16708(Statics.currentArea.field10365 >> 14 & 0x3FFF, Statics.currentArea.field10365 & 0x3FFF, var2);
                Statics.displayX = var2[1] - Statics.currentAreaDisplayMinX;
                Statics.displayZ = var2[2] - Statics.currentAreaDisplayMinZ;
            } else {
                Statics.currentArea.method16708(field9759, field9757, var2);
                if (var2 != null) {
                    Statics.displayX = var2[1] - Statics.currentAreaDisplayMinX;
                    Statics.displayZ = var2[2] - Statics.currentAreaDisplayMinZ;
                }
                field9757 = -1;
                field9759 = -1;
                field9760 = false;
            }
            if (Statics.currentArea.zoom == 37) {
                Statics.zoom = 3.0F;
                Statics.targetZoom = 3.0F;
            } else if (Statics.currentArea.zoom == 50) {
                Statics.zoom = 4.0F;
                Statics.targetZoom = 4.0F;
            } else if (Statics.currentArea.zoom == 75) {
                Statics.zoom = 6.0F;
                Statics.targetZoom = 6.0F;
            } else if (Statics.currentArea.zoom == 100) {
                Statics.zoom = 8.0F;
                Statics.targetZoom = 8.0F;
            } else if (Statics.currentArea.zoom == 200) {
                Statics.zoom = 16.0F;
                Statics.targetZoom = 16.0F;
            } else {
                Statics.zoom = 8.0F;
                Statics.targetZoom = 8.0F;
            }
            Statics.tileSize = (int) Statics.zoom >> 1;
            Statics.tileShapes = WorldMapTileShapes.buildTileShapes(Statics.tileSize);
            clampDisplayCoord();
            createDataArrays();
            Statics.elements = new LinkedList();
            field4273 += (int) (Math.random() * 5.0D) - 2;
            if (field4273 < -8) {
                field4273 = -8;
            }
            if (field4273 > 8) {
                field4273 = 8;
            }
            field4274 += (int) (Math.random() * 5.0D) - 2;
            if (field4274 < -16) {
                field4274 = -16;
            }
            if (field4274 > 16) {
                field4274 = 16;
            }
            computeFloorOverlayColours(arg1, field4273 >> 2 << 10, field4274 >> 1);
            Statics.field4290.resizeCache(1024, 256);
            Statics.field4268.resizeCache(256, 256);
            Statics.field4266.resizeCache(4096);
            Statics.field4645.resizeCache(256);
            loadingProgress = 20;
        } else if (loadingProgress == 20) {
            MapLogicRelated.method8512(true);
            method7120(arg0, field4273, field4274);
            loadingProgress = 60;
            MapLogicRelated.method8512(true);
            GameShell.method2427();
        } else if (loadingProgress == 60) {
            if (Statics.field4264.method5680(Statics.currentArea.debugname + "_staticelements")) {
                if (!Statics.field4264.method5648(Statics.currentArea.debugname + "_staticelements")) {
                    return;
                }
                Statics.field4281 = WorldMapRelated.method2791(Statics.field4264, Statics.currentArea.debugname + "_staticelements", client.field9142);
            } else {
                Statics.field4281 = new WorldMapRelated(0);
            }

            method7093();
            loadingProgress = 70;
            MapLogicRelated.method8512(true);
            GameShell.method2427();
        } else if (loadingProgress == 70) {
            Statics.field4684 = new WorldMapFont(arg0, 11, true, GameShell.canvas);
            loadingProgress = 73;
            MapLogicRelated.method8512(true);
            GameShell.method2427();
        } else if (loadingProgress == 73) {
            Statics.field6790 = new WorldMapFont(arg0, 12, true, GameShell.canvas);
            loadingProgress = 76;
            MapLogicRelated.method8512(true);
            GameShell.method2427();
        } else if (loadingProgress == 76) {
            Statics.field1578 = new WorldMapFont(arg0, 14, true, GameShell.canvas);
            loadingProgress = 79;
            MapLogicRelated.method8512(true);
            GameShell.method2427();
        } else if (loadingProgress == 79) {
            Statics.field9549 = new WorldMapFont(arg0, 17, true, GameShell.canvas);
            loadingProgress = 82;
            MapLogicRelated.method8512(true);
            GameShell.method2427();
        } else if (loadingProgress == 82) {
            Statics.field3263 = new WorldMapFont(arg0, 19, true, GameShell.canvas);
            loadingProgress = 85;
            MapLogicRelated.method8512(true);
            GameShell.method2427();
        } else if (loadingProgress == 85) {
            Statics.field1388 = new WorldMapFont(arg0, 22, true, GameShell.canvas);
            loadingProgress = 88;
            MapLogicRelated.method8512(true);
            GameShell.method2427();
        } else if (loadingProgress == 88) {
            Statics.field7158 = new WorldMapFont(arg0, 26, true, GameShell.canvas);
            loadingProgress = 91;
            MapLogicRelated.method8512(true);
            GameShell.method2427();
        } else {
            Statics.field4325 = new WorldMapFont(arg0, 30, true, GameShell.canvas);
            loadingProgress = 100;
            MapLogicRelated.method8512(true);
            GameShell.method2427();
            System.gc();
        }
    }

    @ObfuscatedName("ya.bi(I)V")
    public static void clampDisplayCoord() {
        if (Statics.displayX < 0) {
            Statics.displayX = 0;
            field9762 = -1;
            field9756 = -1;
        }
        if (Statics.displayX > Statics.currentAreaDisplaySizeX) {
            Statics.displayX = Statics.currentAreaDisplaySizeX;
            field9762 = -1;
            field9756 = -1;
        }
        if (Statics.displayZ < 0) {
            Statics.displayZ = 0;
            field9762 = -1;
            field9756 = -1;
        }
        if (Statics.displayZ > Statics.currentAreaDisplaySizeZ) {
            Statics.displayZ = Statics.currentAreaDisplaySizeZ;
            field9762 = -1;
            field9756 = -1;
        }
    }

    @ObfuscatedName("on.bx(ZI)V")
    public static void reset(boolean arg0) {
        if (arg0 && Statics.currentArea != null) {
            Statics.field809 = Statics.currentArea.id;
        } else {
            Statics.field809 = -1;
        }
        Statics.currentArea = null;
        Statics.elements = null;
        loadingProgress = 0;
        Statics.field4960 = null;
        method7082();
        field4301.clearBridged();
        Statics.field4281 = null;
        Statics.field2214 = null;
        field9762 = -1;
        field9756 = -1;
        Statics.field4684 = null;
        Statics.field6790 = null;
        Statics.field1578 = null;
        Statics.field9549 = null;
        Statics.field3263 = null;
        Statics.field1388 = null;
        Statics.field7158 = null;
        Statics.field4325 = null;
        if (Statics.field4290 != null) {
            Statics.field4290.clearCache();
            Statics.field4290.resizeCache(128, 64);
        }
        if (Statics.field4268 != null) {
            Statics.field4268.resizeCache(64, 64);
        }
        if (Statics.field4266 != null) {
            Statics.field4266.resizeCache(256);
        }
        Statics.field4645.resizeCache(64);
    }

    @ObfuscatedName("eb.bm(B)V")
    public static void method3318() {
        field9765.clear();
        field9766.clear();
    }

    @ObfuscatedName("zb.bb(Lra;Lma;IIIIB)V")
    public static void drawMain(RendererToolkit arg0, MaterialTypeList arg1, int arg2, int arg3, int arg4, int arg5) {
        if (loadingProgress < 100) {
            method7164(arg0, arg1);
        }

        arg0.r(arg2, arg3, arg2 + arg4, arg3 + arg5);
        if (loadingProgress < 100) {
            byte var6 = 20;
            int var7 = arg4 / 2 + arg2;
            int var8 = arg5 / 2 + arg3 - 18 - var6;
            arg0.B(arg2, arg3, arg4, arg5, -16777216, 0);
            arg0.drawRectangle(var7 - 152, var8, 304, 34, client.loadingBarOutlineColour[client.loadingBarTheme].getRGB(), 0);
            arg0.B(var7 - 150, var8 + 2, loadingProgress * 3, 30, client.loadingBarFillColour[client.loadingBarTheme].getRGB(), 0);
            Statics.field670.drawStringCentered(LocalisedText.WORLDMAP_LOADING.get(Statics.language), var7, var6 + var8, client.loadingBarTextColour[client.loadingBarTheme].getRGB(), -1);
        } else {
            int var9 = Statics.displayX - (int) ((float) arg4 / Statics.zoom);
            int var10 = Statics.displayZ + (int) ((float) arg5 / Statics.zoom);
            int var11 = Statics.displayX + (int) ((float) arg4 / Statics.zoom);
            int var12 = Statics.displayZ - (int) ((float) arg5 / Statics.zoom);
            Statics.field6354 = Statics.displayX - (int) ((float) arg4 / Statics.zoom);
            Statics.field7054 = Statics.displayZ - (int) ((float) arg5 / Statics.zoom);
            Statics.field6423 = (int) ((float) (arg4 * 2) / Statics.zoom);
            Statics.field6344 = (int) ((float) (arg5 * 2) / Statics.zoom);
            method7094(Statics.currentAreaDisplayMinX + var9, Statics.currentAreaDisplayMinZ + var10, Statics.currentAreaDisplayMinX + var11, Statics.currentAreaDisplayMinZ + var12, arg2, arg3, arg2 + arg4, arg3 + arg5 + 1);
            method7095(arg0);
            LinkedList var13 = method7099(arg0);
            method2356(arg0, var13, 0, 0);
            if (Statics.field4469 > 0) {
                Statics.field10208--;
                if (Statics.field10208 == 0) {
                    Statics.field4469--;
                    Statics.field10208 = 20;
                }
            }

            if (client.field8926) {
                int var14 = arg2 + arg4 - 5;
                int var15 = arg3 + arg5 - 8;
                Statics.field560.method862("Fps:" + GameShell.field4121, var14, var15, 16776960, -1);
                int var19 = var15 - 15;
                Runtime var16 = Runtime.getRuntime();
                int var17 = (int) ((var16.totalMemory() - var16.freeMemory()) / 1024L);
                int var18 = 16776960;
                if (var17 > 65536) {
                    var18 = 16711680;
                }
                Statics.field560.method862("Mem:" + var17 + "k", var14, var19, var18, -1);
                var15 = var19 - 15;
            }
        }
    }

    @ObfuscatedName("cr.be(Lra;Ltq;III)V")
    public static void method2356(RendererToolkit arg0, LinkedList arg1, int arg2, int arg3) {
        Statics.elements.clearBridged();
        if (disableElements) {
            return;
        }
        for (WorldMapElement var4 = (WorldMapElement) arg1.head(); var4 != null; var4 = (WorldMapElement) arg1.next()) {
            MapElementType var5 = Statics.field4290.method7862(var4.field9564);
            if (method1371(var5)) {
                boolean var6 = method1358(arg0, var4, var5, arg2, arg3);
                if (var6) {
                    method14746(arg0, var4, var5);
                }
            }
        }
    }

    @ObfuscatedName("z.bw(Lpw;I)Z")
    public static boolean method1371(MapElementType arg0) {
        if (arg0 == null) {
            return false;
        } else if (!arg0.field4797) {
            return false;
        } else if (!arg0.method7835(Statics.field4299)) {
            return false;
        } else if (field9765.get((long) arg0.field4763) == null) {
            return field9766.get((long) arg0.field4775) == null;
        } else {
            return false;
        }
    }

    @ObfuscatedName("d.bo(Lra;Ladw;Lpw;III)Z")
    public static boolean method1358(RendererToolkit arg0, WorldMapElement arg1, MapElementType arg2, int arg3, int arg4) {
        int var5 = Integer.MAX_VALUE;
        int var6 = Integer.MIN_VALUE;
        int var7 = Integer.MAX_VALUE;
        int var8 = Integer.MIN_VALUE;
        if (arg2.field4788 != null) {
            var5 = (arg1.field9566 + arg2.field4790 - Statics.field4296) * (Statics.field4270 - Statics.field4300) / (Statics.field4298 - Statics.field4296) + Statics.field4300;
            var6 = (arg1.field9566 + arg2.field4792 - Statics.field4296) * (Statics.field4270 - Statics.field4300) / (Statics.field4298 - Statics.field4296) + Statics.field4300;
            var8 = Statics.field4303 - (arg1.field9567 + arg2.field4791 - Statics.field4302) * (Statics.field4303 - Statics.field4286) / (Statics.field4297 - Statics.field4302);
            var7 = Statics.field4303 - (arg1.field9567 + arg2.field4773 - Statics.field4302) * (Statics.field4303 - Statics.field4286) / (Statics.field4297 - Statics.field4302);
        }
        Sprite var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        if (arg2.field4764 != -1) {
            if (arg1.field9570 && arg2.field4769 != -1) {
                var9 = arg2.method7847(arg0, true);
            } else {
                var9 = arg2.method7847(arg0, false);
            }
            if (var9 != null) {
                var10 = arg1.field9568 - (var9.method1042() + 1 >> 1);
                if (var10 < var5) {
                    var5 = var10;
                }
                var11 = arg1.field9568 + (var9.method1042() + 1 >> 1);
                if (var11 > var6) {
                    var6 = var11;
                }
                var12 = arg1.field9569 - (var9.method1047() + 1 >> 1);
                if (var12 < var7) {
                    var7 = var12;
                }
                var13 = arg1.field9569 + (var9.method1047() + 1 >> 1);
                if (var13 > var8) {
                    var8 = var13;
                }
            }
        }
        WorldMapFont var14 = null;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        if (arg2.field4766 != null) {
            var14 = method188(arg2.field4777);
            if (var14 != null) {
                var15 = Statics.field559.method12398(arg2.field4766, null, field9761, null);
                var16 = arg2.field4793 * (Statics.field4270 - Statics.field4300) / (Statics.field4298 - Statics.field4296) + arg1.field9568;
                int var23 = arg1.field9569 - arg2.field4799 * (Statics.field4303 - Statics.field4286) / (Statics.field4297 - Statics.field4302);
                if (var9 == null) {
                    var17 = var23 - var14.method1762() * var15 / 2;
                } else {
                    var17 = var23 - ((var9.method1047() >> 1) + var14.method1746() * var15);
                }
                for (int var24 = 0; var24 < var15; var24++) {
                    String var25 = field9761[var24];
                    if (var24 < var15 - 1) {
                        var25 = var25.substring(0, var25.length() - 4);
                    }
                    int var26 = var14.method1747(var25);
                    if (var26 > var18) {
                        var18 = var26;
                    }
                }
                var19 = var16 - var18 / 2 + arg3;
                if (var19 < var5) {
                    var5 = var19;
                }
                var20 = var18 / 2 + var16 + arg3;
                if (var20 > var6) {
                    var6 = var20;
                }
                var21 = arg4 + var17;
                if (var21 < var7) {
                    var7 = var21;
                }
                var22 = var17 + var15 * var14.method1746() + arg4;
                if (var22 > var8) {
                    var8 = var22;
                }
            }
        }
        if (var6 < Statics.field4300 || var5 > Statics.field4270 || var8 < Statics.field4286 || var7 > Statics.field4303) {
            return true;
        }
        method7102(arg0, arg1, arg2);
        if (var9 != null) {
            if (Statics.field4469 > 0 && (field9755 != -1 && field9755 == arg1.field9564 || field9763 != -1 && field9763 == arg2.field4775)) {
                int var27;
                if (Statics.field10208 > 50) {
                    var27 = 200 - Statics.field10208 * 2;
                } else {
                    var27 = Statics.field10208 * 2;
                }
                int var28 = var27 << 24 | 0xFFFF00;
                arg0.method484(arg1.field9568, arg1.field9569, var9.method1061() / 2 + 7, var28);
                arg0.method484(arg1.field9568, arg1.field9569, var9.method1061() / 2 + 5, var28);
                arg0.method484(arg1.field9568, arg1.field9569, var9.method1061() / 2 + 3, var28);
                arg0.method484(arg1.field9568, arg1.field9569, var9.method1061() / 2 + 1, var28);
                arg0.method484(arg1.field9568, arg1.field9569, var9.method1061() / 2, var28);
            }
            var9.method2500(arg1.field9568 - (var9.method1042() >> 1), arg1.field9569 - (var9.method1047() >> 1));
        }
        if (arg2.field4766 != null && var14 != null) {
            method6644(arg0, arg1, arg2, var15, var16, var17, var18, var14);
        }
        if (arg2.field4764 != -1 || arg2.field4766 != null) {
            MapElementContainer var29 = new MapElementContainer(arg1);
            var29.field9295 = var10;
            var29.field9296 = var11;
            var29.field9301 = var12;
            var29.field9298 = var13;
            var29.field9297 = var19;
            var29.field9300 = var20;
            var29.field9299 = var21;
            var29.field9302 = var22;
            Statics.elements.addTail(var29);
        }
        return false;
    }

    @ObfuscatedName("acr.bh(Lra;Ladw;Lpw;I)V")
    public static void method14746(RendererToolkit arg0, WorldMapElement arg1, MapElementType arg2) {
        Sprite var3 = arg2.method7841(arg0);
        if (var3 == null) {
            return;
        }
        int var4 = var3.method1061();
        if (var3.method1045() > var4) {
            var4 = var3.method1045();
        }
        byte var5 = 10;
        int var6 = arg1.field9568;
        int var7 = arg1.field9569;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (arg2.field4766 != null) {
            var8 = Statics.field559.method12398(arg2.field4766, null, field9761, null);
            for (int var11 = 0; var11 < var8; var11++) {
                String var12 = field9761[var11];
                if (var11 < var8 - 1) {
                    var12 = var12.substring(0, var12.length() - 4);
                }
                int var13 = Statics.field1578.method1747(var12);
                if (var13 > var9) {
                    var9 = var13;
                }
            }
            var10 = Statics.field1578.method1746() * var8 + Statics.field1578.method1762() / 2;
        }
        int var14 = var4 / 2 + arg1.field9568;
        int var15 = arg1.field9569;
        if (var6 < Statics.field4300 + var4) {
            var6 = Statics.field4300;
            var14 = var9 / 2 + var4 / 2 + Statics.field4300 + var5 + 5;
        } else if (var6 > Statics.field4270 - var4) {
            var6 = Statics.field4270 - var4;
            var14 = Statics.field4270 - var4 / 2 - var5 - var9 / 2 - 5;
        }
        if (var7 < Statics.field4286 + var4) {
            var7 = Statics.field4286;
            var15 = var4 / 2 + Statics.field4286 + var5;
        } else if (var7 > Statics.field4303 - var4) {
            var7 = Statics.field4303 - var4;
            var15 = Statics.field4303 - var4 / 2 - var5 - var10;
        }
        int var16 = (int) (Math.atan2((double) (var6 - arg1.field9568), (double) (var7 - arg1.field9569)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
        var3.method2503((float) var4 / 2.0F + (float) var6, (float) var4 / 2.0F + (float) var7, 4096, var16);
        int var17 = -2;
        int var18 = -2;
        int var19 = -2;
        int var20 = -2;
        if (arg2.field4766 != null) {
            var17 = var14 - var9 / 2 - 5;
            var18 = var15;
            var19 = var9 + var17 + 10;
            var20 = var15 + Statics.field1578.method1746() * var8 + 3;
            if (arg2.field4801 != 0) {
                arg0.fillRectangle(var17, var15, var19 - var17, var20 - var15, arg2.field4801);
            }
            if (arg2.field4782 != 0) {
                arg0.drawRectangle(var17, var15, var19 - var17, var20 - var15, arg2.field4782);
            }
            for (int var21 = 0; var21 < var8; var21++) {
                String var22 = field9761[var21];
                if (var21 < var8 - 1) {
                    var22 = var22.substring(0, var22.length() - 4);
                }
                Statics.field1578.method1749(arg0, var22, var14, var15, arg2.field4767, true);
                var15 += Statics.field1578.method1746();
            }
        }
        if (arg2.field4764 == -1 && arg2.field4766 == null) {
            return;
        }
        MapElementContainer var23 = new MapElementContainer(arg1);
        int var24 = var4 >> 1;
        var23.field9295 = var6 - var24;
        var23.field9296 = var6 + var24;
        var23.field9301 = var7 - var24;
        var23.field9298 = var7 + var24;
        var23.field9297 = var17;
        var23.field9300 = var19;
        var23.field9299 = var18;
        var23.field9302 = var20;
        Statics.elements.addTail(var23);
    }

    @ObfuscatedName("ta.by(IB)Las;")
    public static WorldMapFont method188(int arg0) {
        if (arg0 == 0) {
            if ((double) Statics.zoom == 3.0D) {
                return Statics.field4684;
            }
            if ((double) Statics.zoom == 4.0D) {
                return Statics.field6790;
            }
            if ((double) Statics.zoom == 6.0D) {
                return Statics.field1578;
            }
            if ((double) Statics.zoom >= 8.0D) {
                return Statics.field9549;
            }
        } else if (arg0 == 1) {
            if ((double) Statics.zoom == 3.0D) {
                return Statics.field1578;
            }
            if ((double) Statics.zoom == 4.0D) {
                return Statics.field9549;
            }
            if ((double) Statics.zoom == 6.0D) {
                return Statics.field3263;
            }
            if ((double) Statics.zoom >= 8.0D) {
                return Statics.field1388;
            }
        } else if (arg0 == 2) {
            if ((double) Statics.zoom == 3.0D) {
                return Statics.field3263;
            }
            if ((double) Statics.zoom == 4.0D) {
                return Statics.field1388;
            }
            if ((double) Statics.zoom == 6.0D) {
                return Statics.field7158;
            }
            if ((double) Statics.zoom >= 8.0D) {
                return Statics.field4325;
            }
        }
        return null;
    }

    @ObfuscatedName("nf.bu(Lra;Ladw;Lpw;IIIILas;B)V")
    public static void method6644(RendererToolkit arg0, WorldMapElement arg1, MapElementType arg2, int arg3, int arg4, int arg5, int arg6, WorldMapFont arg7) {
        int var8 = arg4 - arg6 / 2 - 5;
        int var9 = arg5 + 2;
        if (arg2.field4801 != 0) {
            arg0.fillRectangle(var8, var9, arg6 + 10, arg5 + arg3 * arg7.method1746() - var9 + 1, arg2.field4801);
        }
        if (arg2.field4782 != 0) {
            arg0.drawRectangle(var8, var9, arg6 + 10, arg5 + arg3 * arg7.method1746() - var9 + 1, arg2.field4782);
        }
        int var10 = arg2.field4767;
        if (arg1.field9570 && arg2.field4768 != -1) {
            var10 = arg2.field4768;
        }
        for (int var11 = 0; var11 < arg3; var11++) {
            String var12 = field9761[var11];
            if (var11 < arg3 - 1) {
                var12 = var12.substring(0, var12.length() - 4);
            }
            arg7.method1749(arg0, var12, arg4, arg5, var10, true);
            arg5 += arg7.method1746();
        }
    }

    @ObfuscatedName("if.cl(Lra;IIIII)V")
    public static final void drawOverview(RendererToolkit arg0, int arg1, int arg2, int arg3, int arg4) {
        arg0.r(arg1, arg2, arg1 + arg3, arg2 + arg4);
        arg0.fillRectangle(arg1, arg2, arg3, arg4, -16777216);
        if (loadingProgress < 100) {
            return;
        }
        float var5 = (float) Statics.currentAreaDisplaySizeZ / (float) Statics.currentAreaDisplaySizeX;
        int var6 = arg3;
        int var7 = arg4;
        if (var5 < 1.0F) {
            var7 = (int) ((float) arg3 * var5);
        } else {
            var6 = (int) ((float) arg4 / var5);
        }
        int var8 = (arg3 - var6) / 2 + arg1;
        int var9 = (arg4 - var7) / 2 + arg2;
        if (Statics.field2214 == null || Statics.field2214.method1061() != arg3 || Statics.field2214.method1045() != arg4) {
            method7094(Statics.currentAreaDisplayMinX, Statics.currentAreaDisplayMinZ + Statics.currentAreaDisplaySizeZ, Statics.currentAreaDisplaySizeX + Statics.currentAreaDisplayMinX, Statics.currentAreaDisplayMinZ, var8, var9, var6 + var8, var7 + var9);
            method7095(arg0);
            Statics.field2214 = arg0.method508(var8, var9, var6, var7, false);
        }
        Statics.field2214.method2500(var8, var9);
        int var10 = Statics.field6423 * var6 / Statics.currentAreaDisplaySizeX;
        int var11 = Statics.field6344 * var7 / Statics.currentAreaDisplaySizeZ;
        int var12 = Statics.field6354 * var6 / Statics.currentAreaDisplaySizeX + var8;
        int var13 = var7 + var9 - Statics.field7054 * var7 / Statics.currentAreaDisplaySizeZ - var11;
        int var14 = -1996554240;
        if (client.modeGame == ModeGame.STELLARDAWN) {
            var14 = -1996488705;
        }
        arg0.B(var12, var13, var10, var11, var14, 1);
        arg0.drawRectangle(var12, var13, var10, var11, var14, 0);
        if (Statics.field4469 <= 0) {
            return;
        }
        int var15;
        if (Statics.field10208 > 50) {
            var15 = 500 - Statics.field10208 * 5;
        } else {
            var15 = Statics.field10208 * 5;
        }
        for (WorldMapElement var16 = (WorldMapElement) field4301.head(); var16 != null; var16 = (WorldMapElement) field4301.next()) {
            MapElementType var17 = Statics.field4290.method7862(var16.field9564);
            if (method1371(var17)) {
                if (field9755 == var16.field9564) {
                    int var18 = var16.field9566 * var6 / Statics.currentAreaDisplaySizeX + var8;
                    int var19 = (Statics.currentAreaDisplaySizeZ - var16.field9567) * var7 / Statics.currentAreaDisplaySizeZ + var9;
                    arg0.fillRectangle(var18 - 2, var19 - 2, 4, 4, var15 << 24 | 0xFFFF00);
                } else if (field9763 != -1 && field9763 == var17.field4775) {
                    int var20 = var16.field9566 * var6 / Statics.currentAreaDisplaySizeX + var8;
                    int var21 = (Statics.currentAreaDisplaySizeZ - var16.field9567) * var7 / Statics.currentAreaDisplaySizeZ + var9;
                    arg0.fillRectangle(var20 - 2, var21 - 2, 4, 4, var15 << 24 | 0xFFFF00);
                }
            }
        }
    }

    @ObfuscatedName("ud.cq(IIB)V")
    public static final void updateComponent(int arg0, int arg1) {
        if (Statics.zoom < Statics.targetZoom) {
            Statics.zoom = (float) ((double) Statics.zoom / 30.0D + (double) Statics.zoom);
            if (Statics.zoom > Statics.targetZoom) {
                Statics.zoom = Statics.targetZoom;
            }
            clampDisplayCoord();
            Statics.tileSize = (int) Statics.zoom >> 1;
            Statics.tileShapes = WorldMapTileShapes.buildTileShapes(Statics.tileSize);
        } else if (Statics.zoom > Statics.targetZoom) {
            Statics.zoom = (float) ((double) Statics.zoom - (double) Statics.zoom / 30.0D);
            if (Statics.zoom < Statics.targetZoom) {
                Statics.zoom = Statics.targetZoom;
            }
            clampDisplayCoord();
            Statics.tileSize = (int) Statics.zoom >> 1;
            Statics.tileShapes = WorldMapTileShapes.buildTileShapes(Statics.tileSize);
        }
        if (field9762 != -1 && field9756 != -1) {
            int var2 = field9762 - Statics.displayX;
            if (var2 < 2 || var2 > 2) {
                var2 /= 8;
            }
            int var3 = field9756 - Statics.displayZ;
            if (var3 < 2 || var3 > 2) {
                var3 /= 8;
            }
            Statics.displayX += var2;
            Statics.displayZ += var3;
            if (var2 == 0 && var3 == 0) {
                field9762 = -1;
                field9756 = -1;
            }
            clampDisplayCoord();
        }
        if (Statics.field4469 > 0) {
            Statics.field10208--;
            if (Statics.field10208 == 0) {
                Statics.field4469--;
                Statics.field10208 = 100;
            }
        } else {
            field9755 = -1;
            field9763 = -1;
        }
        if (!field9754 || Statics.elements == null) {
            return;
        }
        for (MapElementContainer var4 = (MapElementContainer) Statics.elements.head(); var4 != null; var4 = (MapElementContainer) Statics.elements.next()) {
            MapElementType var5 = Statics.field4290.method7862(var4.field9303.field9564);
            if (var4.method14803(arg0, arg1)) {
                if (var5.field4778 != null) {
                    if (var5.field4778[4] != null) {
                        Statics.addEntry(var5.field4778[4], var5.field4779, -1, 1012, -1, (long) var4.field9303.field9564, var5.field4775, 0, true, false, (long) var4.field9303.field9564, false);
                    }
                    if (var5.field4778[3] != null) {
                        Statics.addEntry(var5.field4778[3], var5.field4779, -1, 1011, -1, (long) var4.field9303.field9564, var5.field4775, 0, true, false, (long) var4.field9303.field9564, false);
                    }
                    if (var5.field4778[2] != null) {
                        Statics.addEntry(var5.field4778[2], var5.field4779, -1, 1010, -1, (long) var4.field9303.field9564, var5.field4775, 0, true, false, (long) var4.field9303.field9564, false);
                    }
                    if (var5.field4778[1] != null) {
                        Statics.addEntry(var5.field4778[1], var5.field4779, -1, 1009, -1, (long) var4.field9303.field9564, var5.field4775, 0, true, false, (long) var4.field9303.field9564, false);
                    }
                    if (var5.field4778[0] != null) {
                        Statics.addEntry(var5.field4778[0], var5.field4779, -1, 1008, -1, (long) var4.field9303.field9564, var5.field4775, 0, true, false, (long) var4.field9303.field9564, false);
                    }
                }
                if (!var4.field9303.field9570) {
                    var4.field9303.field9570 = true;
                    ScriptRunner.method1372(ClientTriggerType.field7304, var4.field9303.field9564, var5.field4775);
                }
                if (var4.field9303.field9570) {
                    ScriptRunner.method1372(ClientTriggerType.field7311, var4.field9303.field9564, var5.field4775);
                }
            } else if (var4.field9303.field9570) {
                var4.field9303.field9570 = false;
                ScriptRunner.method1372(ClientTriggerType.field7319, var4.field9303.field9564, var5.field4775);
            }
        }
    }

    @ObfuscatedName("ze.co(IIII)V")
    public static void method13878(int arg0, int arg1, int arg2) {
        if (arg0 == 1008) {
            ScriptRunner.method1372(ClientTriggerType.OPWORLDMAPELEMENT1, arg1, arg2);
        } else if (arg0 == 1009) {
            ScriptRunner.method1372(ClientTriggerType.OPWORLDMAPELEMENT2, arg1, arg2);
        } else if (arg0 == 1010) {
            ScriptRunner.method1372(ClientTriggerType.OPWORLDMAPELEMENT3, arg1, arg2);
        } else if (arg0 == 1011) {
            ScriptRunner.method1372(ClientTriggerType.OPWORLDMAPELEMENT4, arg1, arg2);
        } else if (arg0 == 1012) {
            ScriptRunner.method1372(ClientTriggerType.OPWORLDMAPELEMENT5, arg1, arg2);
        }
    }

    @ObfuscatedName("ru.cb(IIIZB)V")
    public static void setMap(int arg0, int arg1, int arg2, boolean arg3) {
        if (client.options.toolkit.getValue() == 0) {
            reset(false);
        } else {
            field9764 = client.options.toolkit.getValue();
            Statics.method5600(0, true);
        }
        field9759 = arg1;
        field9757 = arg2;
        field9760 = arg3;
        method7122(arg0);
    }

    @ObfuscatedName("em.cm(I)V")
    public static void method3465() {
        reset(false);
        if (field9764 < 0 || field9764 == 0) {
            return;
        }
        Statics.method5600(field9764, false);
        if (client.options.toolkit.getValue() != field9764) {
            switch (field9764) {
                case 1:
                    GraphicsPacketQueue.method12023(ToolkitType.field7359);
                    break;
                case 2:
                    GraphicsPacketQueue.method12023(ToolkitType.field7360);
                    break;
                case 3:
                    GraphicsPacketQueue.method12023(ToolkitType.field7361);
                    break;
            }
        }
        field9764 = -1;
    }

    @ObfuscatedName("of.cw(B)V")
    public static void method7071() {
        if (Statics.field809 != -1) {
            setMap(Statics.field809, -1, -1, false);
            Statics.field809 = -1;
        }
    }

    @ObfuscatedName("uh.cx(I)Lajo;")
    public static WorldMapAreaMetadata getCurrentArea() {
        return Statics.currentArea;
    }

    @ObfuscatedName("jf.cn(II)V")
    public static void setDisplayX(int arg0) {
        Statics.displayX = arg0;
        field9762 = -1;
        field9756 = -1;
        clampDisplayCoord();
    }

    @ObfuscatedName("uv.cf(II)V")
    public static void setDisplayY(int arg0) {
        Statics.displayZ = arg0;
        field9756 = -1;
        field9756 = -1;
        clampDisplayCoord();
    }

    @ObfuscatedName("yf.cs(II)V")
    public static void method12903(int arg0) {
        if (arg0 == 37) {
            Statics.targetZoom = 3.0F;
        } else if (arg0 == 50) {
            Statics.targetZoom = 4.0F;
        } else if (arg0 == 75) {
            Statics.targetZoom = 6.0F;
        } else if (arg0 == 100) {
            Statics.targetZoom = 8.0F;
        } else if (arg0 == 200) {
            Statics.targetZoom = 16.0F;
        }
        field9756 = -1;
        field9756 = -1;
    }

    @ObfuscatedName("we.cr(IIIIB)V")
    public static void method12692(int arg0, int arg1, int arg2, int arg3) {
        float var4 = (float) Statics.currentAreaDisplaySizeZ / (float) Statics.currentAreaDisplaySizeX;
        int var5 = arg2;
        int var6 = arg3;
        if (var4 < 1.0F) {
            var6 = (int) ((float) arg2 * var4);
        } else {
            var5 = (int) ((float) arg3 / var4);
        }
        int var7 = arg0 - (arg2 - var5) / 2;
        int var8 = arg1 - (arg3 - var6) / 2;
        Statics.displayX = Statics.currentAreaDisplaySizeX * var7 / var5;
        Statics.displayZ = Statics.currentAreaDisplaySizeZ - Statics.currentAreaDisplaySizeZ * var8 / var6;
        field9762 = -1;
        field9756 = -1;
        clampDisplayCoord();
    }

    @ObfuscatedName("x.cp(I)I")
    public static int method1603() {
        if ((double) Statics.targetZoom == 3.0D) {
            return 37;
        } else if ((double) Statics.targetZoom == 4.0D) {
            return 50;
        } else if ((double) Statics.targetZoom == 6.0D) {
            return 75;
        } else if ((double) Statics.targetZoom == 8.0D) {
            return 100;
        } else {
            return 200;
        }
    }

    @ObfuscatedName("ss.ci(II)V")
    public static void flashElement(int arg0) {
        field9755 = arg0;
        field9763 = -1;
        Statics.field4469 = 3;
        Statics.field10208 = 100;
    }

    @ObfuscatedName("ed.ca(II)V")
    public static void method3087(int arg0) {
        field9755 = -1;
        field9763 = arg0;
        Statics.field4469 = 3;
        Statics.field10208 = 100;
    }

    @ObfuscatedName("py.ch(IIII)I")
    public static int method7984(int arg0, int arg1, int arg2) {
        if (loadingProgress < 100) {
            return -2;
        }
        int var3 = -2;
        int var4 = Integer.MAX_VALUE;
        int var5 = arg1 - Statics.currentAreaDisplayMinX;
        int var6 = arg2 - Statics.currentAreaDisplayMinZ;
        for (WorldMapElement var7 = (WorldMapElement) field4301.head(); var7 != null; var7 = (WorldMapElement) field4301.next()) {
            if (var7.field9564 == arg0) {
                int var8 = var7.field9566;
                int var9 = var7.field9567;
                int var10 = Statics.currentAreaDisplayMinX + var8 << 14 | Statics.currentAreaDisplayMinZ + var9;
                int var11 = (var5 - var8) * (var5 - var8) + (var6 - var9) * (var6 - var9);
                if (var3 < 0 || var11 < var4) {
                    var3 = var10;
                    var4 = var11;
                }
            }
        }
        return var3;
    }

    @ObfuscatedName("wb.cv(I)Ladw;")
    public static WorldMapElement method12725() {
        if (field4301 == null || field9767 == null) {
            return null;
        }
        field9767.method11691(field4301);
        WorldMapElement var0 = (WorldMapElement) field9767.method11701();
        if (var0 == null) {
            return null;
        } else {
            MapElementType var1 = Statics.field4290.method7862(var0.field9564);
            return var1 != null && var1.field4802 && var1.method7835(Statics.field4299) ? var0 : method11468();
        }
    }

    @ObfuscatedName("tg.ck(S)Ladw;")
    public static WorldMapElement method11468() {
        if (field4301 == null || field9767 == null) {
            return null;
        }
        for (WorldMapElement var0 = (WorldMapElement) field9767.next(); var0 != null; var0 = (WorldMapElement) field9767.next()) {
            MapElementType var1 = Statics.field4290.method7862(var0.field9564);
            if (var1 != null && var1.field4802 && var1.method7835(Statics.field4299)) {
                return var0;
            }
        }
        return null;
    }

    @ObfuscatedName("wh.cd(III)V")
    public static void method12730(int arg0, int arg1) {
        field9762 = arg0 - Statics.currentAreaDisplayMinX;
        field9756 = arg1 - Statics.currentAreaDisplayMinZ;
    }
}
