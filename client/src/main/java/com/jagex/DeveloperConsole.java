package com.jagex;

import com.jagex.protocol.LoginManager;
import deob.ObfuscatedName;

import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

@ObfuscatedName("aw")
public class DeveloperConsole {

    @ObfuscatedName("aw.c")
    public static int field796 = 0;

    @ObfuscatedName("aw.m")
    public static int field797 = 0;

    @ObfuscatedName("aw.t")
    public static String field798 = "";

    @ObfuscatedName("aw.l")
    public static int field799 = 0;

    @ObfuscatedName("aw.f")
    public static int field806 = 0;

    @ObfuscatedName("aw.d")
    public static int field793 = 0;

    @ObfuscatedName("aw.z")
    public static boolean field795 = false;

    @ObfuscatedName("aw.o")
    public static int field802 = -1;

    public DeveloperConsole() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("kj.u(I)Z")
    public static boolean method5548() {
        return !client.isStateLoading(client.state);
    }

    @ObfuscatedName("tp.j(I)V")
    public static void method11726() {
        if (!method5548()) {
            return;
        }
        if (Statics.field792 == null) {
            method11854();
        }
        field795 = true;
        field793 = 0;
    }

    @ObfuscatedName("tl.a(I)V")
    public static void method11854() {
        Statics.field803 = Statics.field2399.field7177 + Statics.field2399.field7176 + 2;
        Statics.field794 = Statics.field9813.field7177 + Statics.field9813.field7176 + 2;
        Statics.field792 = new String[500];
        for (int var0 = 0; var0 < Statics.field792.length; var0++) {
            Statics.field792[var0] = "";
        }
        addLine(LocalisedText.field6975.get(Statics.language));
    }

    @ObfuscatedName("aji.s(S)V")
    public static void method16885() {
        field795 = false;
        client.method1703();
    }

    @ObfuscatedName("sd.c(I)V")
    public static void method11118() {
        if (Statics.field804 != null) {
            try {
                Statics.field804.close();
            } catch (IOException var1) {
            }
        }
        Statics.field804 = null;
    }

    @ObfuscatedName("acu.m(B)Z")
    public static boolean method14925() {
        return field795;
    }

    @ObfuscatedName("abv.t([Ljava/lang/String;I)V")
    public static void method14213(String[] arg0) {
        if (arg0.length <= 1) {
            field798 = field798 + arg0[0];
            field806 += arg0[0].length();
            return;
        }
        for (int var1 = 0; var1 < arg0.length; var1++) {
            if (arg0[var1].startsWith("pause")) {
                int var2 = 5;
                try {
                    var2 = Integer.parseInt(arg0[var1].substring(6));
                } catch (Exception var4) {
                }
                addLine("Pausing for " + var2 + " seconds...");
                Statics.field4817 = arg0;
                field802 = var1 + 1;
                Statics.field3306 = MonotonicTime.get() + (long) (var2 * 1000);
                return;
            }
            field798 = arg0[var1];
            method11379(false);
        }
    }

    @ObfuscatedName("wc.l(I)V")
    public static void method12621() {
        if (field793 * 36 < 102) {
            field793 = field793 * 36 + 6;
        }
        if (field802 != -1 && Statics.field3306 < MonotonicTime.get()) {
            for (int var0 = field802; var0 < Statics.field4817.length; var0++) {
                if (Statics.field4817[var0].startsWith("pause")) {
                    int var1 = 5;
                    try {
                        var1 = Integer.parseInt(Statics.field4817[var0].substring(6));
                    } catch (Exception var14) {
                    }
                    addLine("Pausing for " + var1 + " seconds...");
                    field802 = var0 + 1;
                    Statics.field3306 = MonotonicTime.get() + (long) (var1 * 1000);
                    return;
                }
                field798 = Statics.field4817[var0];
                method11379(false);
            }
            field802 = -1;
        }
        if (client.field9002 != 0) {
            field797 -= client.field9002 * 5;
            if (field797 >= field796) {
                field797 = field796 - 1;
            }
            if (field797 < 0) {
                field797 = 0;
            }
            client.field9002 = 0;
        }
        for (int var3 = 0; var3 < client.field8950; var3++) {
            KeyboardEvent var4 = client.field8951[var3];
            int var5 = var4.method7286();
            char var6 = var4.method7298();
            int var7 = var4.method7285();
            if (var5 == 84) {
                method11379(false);
            }
            if (var5 == 80) {
                method11379(true);
            } else if (var5 == 66 && (var7 & 0x4) != 0) {
                if (Statics.field8726 != null) {
                    String var8 = "";
                    for (int var9 = Statics.field792.length - 1; var9 >= 0; var9--) {
                        if (Statics.field792[var9] != null && Statics.field792[var9].length() > 0) {
                            var8 = var8 + Statics.field792[var9] + '\n';
                        }
                    }
                    Statics.field8726.setContents(new StringSelection(var8), null);
                }
            } else if (var5 == 67 && (var7 & 0x4) != 0) {
                if (Statics.field8726 != null) {
                    try {
                        Transferable var10 = Statics.field8726.getContents(null);
                        if (var10 != null) {
                            String var11 = (String) var10.getTransferData(DataFlavor.stringFlavor);
                            if (var11 != null) {
                                String[] var12 = StringTools.method11508(var11, '\n');
                                method14213(var12);
                            }
                        }
                    } catch (Exception var15) {
                    }
                }
            } else if (var5 == 85 && field806 > 0) {
                field798 = field798.substring(0, field806 - 1) + field798.substring(field806);
                field806--;
            } else if (var5 == 101 && field806 < field798.length()) {
                field798 = field798.substring(0, field806) + field798.substring(field806 + 1);
            } else if (var5 == 96 && field806 > 0) {
                field806--;
            } else if (var5 == 97 && field806 < field798.length()) {
                field806++;
            } else if (var5 == 102) {
                field806 = 0;
            } else if (var5 == 103) {
                field806 = field798.length();
            } else if (var5 == 104 && field799 < Statics.field792.length) {
                field799++;
                method7737();
                field806 = field798.length();
            } else if (var5 == 105 && field799 > 0) {
                field799--;
                method7737();
                field806 = field798.length();
            } else if (StringTools.method8060(var6) || "\\/.:, _-+[]~@".indexOf(var6) != -1) {
                field798 = field798.substring(0, field806) + client.field8951[var3].method7298() + field798.substring(field806);
                field806++;
            }
        }
        client.field8950 = 0;
        client.field8953 = 0;
        client.method1703();
    }

    @ObfuscatedName("pt.f(I)V")
    public static void method7737() {
        if (field799 <= 0) {
            field798 = "";
            return;
        }
        int var0 = 0;
        for (int var1 = 0; var1 < Statics.field792.length; var1++) {
            if (Statics.field792[var1].indexOf("--> ") != -1) {
                var0++;
                if (field799 == var0) {
                    field798 = Statics.field792[var1].substring(Statics.field792[var1].indexOf(62) + 2);
                    break;
                }
            }
        }
    }

    @ObfuscatedName("sh.d(Ljava/lang/String;I)V")
    public static void method11224(String arg0) {
        field798 = arg0;
        field806 = field798.length();
    }

    @ObfuscatedName("tk.z(ZB)V")
    public static void method11379(boolean arg0) {
        field798 = field798.trim();
        if (field798.length() == 0) {
            return;
        }
        addLine("--> " + field798);
        method7065(field798, false, arg0);
        field799 = 0;
        if (arg0) {
            field806 = field798.length();
        } else {
            field806 = 0;
            field798 = "";
        }
    }

    @ObfuscatedName("aj.n(Ljava/lang/String;I)V")
    public static void addLine(String arg0) {
        if (Statics.field792 == null) {
            method11854();
        }
        client.field9214.setTime(new Date(MonotonicTime.get()));
        int var1 = client.field9214.get(11);
        int var2 = client.field9214.get(12);
        int var3 = client.field9214.get(13);
        String var4 = Integer.toString(var1 / 10) + var1 % 10 + ":" + var2 / 10 + var2 % 10 + ":" + var3 / 10 + var3 % 10;
        String[] var5 = StringTools.method11508(arg0, '\n');
        for (int var6 = 0; var6 < var5.length; var6++) {
            for (int var7 = field796; var7 > 0; var7--) {
                Statics.field792[var7] = Statics.field792[var7 - 1];
            }
            Statics.field792[0] = var4 + ": " + var5[var6];
            if (Statics.field804 != null) {
                try {
                    Statics.field804.write(Cp1252.method7652(Statics.field792[0] + "\n"));
                } catch (IOException var9) {
                }
            }
            if (field796 < Statics.field792.length - 1) {
                field796++;
                if (field797 > 0) {
                    field797++;
                }
            }
        }
    }

    @ObfuscatedName("va.o(Lra;B)V")
    public static void method12188(RendererToolkit arg0) {
        arg0.r(0, 0, GameShell.canvasWid, 350);
        arg0.B(0, 0, GameShell.canvasWid, 350, field793 * 36 << 24 | 0x332277, 1);
        int var1 = 350 / Statics.field794;
        if (field796 > 0) {
            int var2 = 346 - Statics.field794 - 4;
            int var3 = var1 * var2 / (field796 + var1 - 1);
            int var4 = 4;
            if (field796 > 1) {
                var4 += (field796 - 1 - field797) * (var2 - var3) / (field796 - 1);
            }
            arg0.B(GameShell.canvasWid - 16, var4, 12, var3, field793 * 36 << 24 | 0x332277, 2);
            for (int var5 = field797; var5 < field797 + var1 && var5 < field796; var5++) {
                String[] var6 = StringTools.method11508(Statics.field792[var5], '\b');
                int var7 = (GameShell.canvasWid - 8 - 16) / var6.length;
                for (int var8 = 0; var8 < var6.length; var8++) {
                    int var9 = var7 * var8 + 8;
                    arg0.r(var9, 0, var7 + var9 - 8, 350);
                    Statics.field560.method833(method3505(var6[var8]), var9, 350 - Statics.field803 - 2 - Statics.field9813.field7177 - Statics.field794 * (var5 - field797), -1, -16777216);
                }
            }
        }
        Statics.field2163.method862(client.REVISION + " " + client.SUBREVISION, GameShell.canvasWid - 25, 330, -1, -16777216);
        arg0.r(0, 0, GameShell.canvasWid, 350);
        arg0.method485(0, 350 - Statics.field803, GameShell.canvasWid, -1);
        Statics.field670.method833("--> " + method3505(field798), 10, 350 - Statics.field2399.field7177 - 1, -1, -16777216);
        if (Statics.field578) {
            int var10 = -1;
            if (client.loopCycle % 30 > 15) {
                var10 = 16777215;
            }
            arg0.method486(Statics.field2399.method12418("--> " + method3505(field798).substring(0, field806)) + 10, 350 - Statics.field2399.field7177 - 11, 12, var10);
        }
        arg0.L();
        Statics.method4693();
    }

    @ObfuscatedName("fd.q(Ljava/lang/String;I)Ljava/lang/String;")
    public static String method3505(String arg0) {
        String var1 = null;
        int var2 = arg0.indexOf("--> ");
        if (var2 >= 0) {
            var1 = arg0.substring(0, var2 + 4);
            arg0 = arg0.substring(var2 + 4);
        }
        if (arg0.startsWith("directlogin ")) {
            int var3 = arg0.indexOf(" ", "directlogin ".length());
            if (var3 >= 0) {
                int var4 = arg0.length();
                arg0 = arg0.substring(0, var3) + " ";
                for (int var5 = var3 + 1; var5 < var4; var5++) {
                    arg0 = arg0 + "*";
                }
            }
        }
        return var1 == null ? arg0 : var1 + arg0;
    }

    @ObfuscatedName("nd.w(Ljava/lang/String;ZZI)V")
    public static void method7065(String arg0, boolean arg1, boolean arg2) {
        try {
            if (arg0.equalsIgnoreCase("commands") || arg0.equalsIgnoreCase("help")) {
                addLine("commands - This command");
                addLine("cls - Clear console");
                addLine("displayfps - Toggle FPS and other information");
                addLine("renderer - Print graphics renderer information");
                addLine("heap - Print java memory information");
                addLine("getcamerapos - Print location and direction of camera for use in bug reports");
                return;
            }
            if (arg0.equalsIgnoreCase("cls")) {
                field796 = 0;
                field797 = 0;
                return;
            }
            if (arg0.equalsIgnoreCase("displayfps")) {
                client.field8926 = !client.field8926;
                if (client.field8926) {
                    addLine("FPS on");
                } else {
                    addLine("FPS off");
                }
                return;
            }
            if (arg0.equals("renderer")) {
                RendererInfo var3 = client.toolkit.method456();
                addLine("Toolkit ID: " + client.options.toolkit.getValue());
                addLine("Vendor: " + var3.field1285);
                addLine("Name: " + var3.field1288);
                addLine("Version: " + var3.field1281);
                addLine("Device: " + var3.field1280);
                addLine("Driver Version: " + var3.field1289);
                return;
            }
            if (arg0.equals("heap")) {
                addLine("Heap: " + GameShell.maxHeapMemoryMb + "MB");
                return;
            }
            if (arg0.equalsIgnoreCase("getcamerapos")) {
                CoordGrid var4 = client.world.getBase();
                addLine("Pos: " + Statics.localPlayerEntity.level + "," + ((client.cameraX >> 9) + var4.x >> 6) + "," + ((client.cameraZ >> 9) + var4.z >> 6) + "," + ((client.cameraX >> 9) + var4.x & 0x3F) + "," + ((client.cameraZ >> 9) + var4.z & 0x3F) + " Height: " + (client.getHeightmapY(client.cameraX, client.cameraZ, Statics.localPlayerEntity.level) - client.cameraY));
                addLine("Look: " + Statics.localPlayerEntity.level + "," + (Statics.cameraLookX + var4.x >> 6) + "," + (Statics.cameraLookZ + var4.z >> 6) + "," + (Statics.cameraLookX + var4.x & 0x3F) + "," + (Statics.cameraLookZ + var4.z & 0x3F) + " Height: " + (client.getHeightmapY(Statics.cameraLookX, Statics.cameraLookZ, Statics.localPlayerEntity.level) - Statics.cameraLookY));
                return;
            }
        } catch (Exception var33) {
            addLine(LocalisedText.field6867.get(Statics.language));
            return;
        }
        if (true || client.modewhere != ModeWhere.LIVE || client.userStaffModLevel >= 2) {
            try {
                if (arg0.equalsIgnoreCase("wm1")) {
                    client.setWindowMode(1, -1, -1, false);
                    if (client.getWindowMode() == 1) {
                        addLine("Success");
                    } else {
                        addLine("Failure");
                    }
                    return;
                }
                if (arg0.equalsIgnoreCase("wm2")) {
                    client.setWindowMode(2, -1, -1, false);
                    if (client.getWindowMode() == 2) {
                        addLine("Success");
                    } else {
                        addLine("Failure");
                    }
                    return;
                }
                if (Fullscreen.allowed && arg0.equalsIgnoreCase("wm3")) {
                    client.setWindowMode(3, 1024, 768, false);
                    if (client.getWindowMode() == 3) {
                        addLine("Success");
                    } else {
                        addLine("Failure");
                    }
                    return;
                }
                if (arg0.startsWith("setlobby ")) {
                    int var6 = -1;
                    Object var7 = null;
                    String var8 = arg0.substring(9);
                    int var9 = var8.indexOf(32);
                    if (var9 == -1) {
                        addLine("Failure");
                        return;
                    }
                    try {
                        var6 = Integer.parseInt(var8.substring(0, var9));
                    } catch (NumberFormatException var29) {
                    }
                    if (var6 == -1) {
                        addLine("Failure");
                        return;
                    }
                    String var11 = var8.substring(var9 + 1).trim() + ".runescape.com";
                    WorldSwitcher.method1716(var11, var6);
                    addLine("Success");
                    return;
                }
                if (arg0.equalsIgnoreCase("tk0")) {
                    Statics.method5600(0, false);
                    if (client.options.toolkit.getValue() == 0) {
                        addLine("Success");
                        client.options.method15448(client.options.toolkitDefault, 0);
                        Preferences.save();
                        client.preferencesChangeNotified = false;
                    } else {
                        addLine("Failure");
                    }
                    return;
                }
                if (arg0.equalsIgnoreCase("tk1")) {
                    Statics.method5600(1, false);
                    if (client.options.toolkit.getValue() == 1) {
                        addLine("Success");
                        client.options.method15448(client.options.toolkitDefault, 1);
                        Preferences.save();
                        client.preferencesChangeNotified = false;
                    } else {
                        addLine("Failure");
                    }
                    return;
                }
                if (arg0.equalsIgnoreCase("tk2")) {
                    Statics.method5600(2, false);
                    if (client.options.toolkit.getValue() == 2) {
                        addLine("Success");
                        client.options.method15448(client.options.toolkitDefault, 2);
                        Preferences.save();
                        client.preferencesChangeNotified = false;
                    } else {
                        addLine("Failure");
                    }
                    return;
                }
                if (arg0.equalsIgnoreCase("tk3")) {
                    Statics.method5600(3, false);
                    if (client.options.toolkit.getValue() == 3) {
                        addLine("Success");
                        client.options.method15448(client.options.toolkitDefault, 3);
                        Preferences.save();
                        client.preferencesChangeNotified = false;
                    } else {
                        addLine("Failure");
                    }
                    return;
                }
                if (arg0.equalsIgnoreCase("tk5")) {
                    Statics.method5600(5, false);
                    if (client.options.toolkit.getValue() == 5) {
                        addLine("Success");
                        client.options.method15448(client.options.toolkitDefault, 5);
                        Preferences.save();
                        client.preferencesChangeNotified = false;
                    } else {
                        addLine("Failure");
                    }
                    return;
                }
                if (arg0.equalsIgnoreCase("clientdrop")) {
                    if (client.state == 1) {
                        client.method8047();
                    } else if (client.state == 16) {
                        client.gameConnection.disconnected = true;
                    }
                    return;
                }
                if (arg0.equalsIgnoreCase("breakcon")) {
                    ServerConnection[] var12 = client.connections;
                    for (int var13 = 0; var13 < var12.length; var13++) {
                        ServerConnection var14 = var12[var13];
                        if (var14.getStream() != null) {
                            var14.getStream().method7203();
                        }
                    }
                    client.js5TcpClient.method5747();
                    return;
                }
                if (arg0.startsWith("getclientvarpbit")) {
                    int var15 = Integer.parseInt(arg0.substring(17));
                    addLine("varpbit=" + client.localPlayerGameState.getVarBit(var15));
                    return;
                }
                if (arg0.startsWith("getclientvarp")) {
                    int var16 = Integer.parseInt(arg0.substring(14));
                    addLine("varp=" + client.localPlayerGameState.garVarInt(var16));
                    return;
                }
                if (arg0.startsWith("directlogin")) {
                    String[] var17 = StringTools.method11508(arg0.substring(12), ' ');
                    if (var17.length == 2) {
                        LoginManager.requestLogin(var17[0], var17[1]);
                    }
                    return;
                }
                if (arg0.startsWith("snlogin ")) {
                    String[] var18 = StringTools.method11508(arg0.substring(8), ' ');
                    int var19 = Integer.parseInt(var18[0]);
                    LoginManager.method11156(var19);
                    return;
                }
                if (arg0.startsWith("setoutput ")) {
                    File var20 = new File(arg0.substring(10));
                    if (var20.exists()) {
                        var20 = new File(arg0.substring(10) + "." + MonotonicTime.get() + ".log");
                        if (var20.exists()) {
                            addLine("file already exists!");
                            return;
                        }
                    }
                    if (Statics.field804 != null) {
                        Statics.field804.close();
                        Statics.field804 = null;
                    }
                    try {
                        Statics.field804 = new FileOutputStream(var20);
                        return;
                    } catch (FileNotFoundException var30) {
                        addLine("Could not create " + var20.getName());
                        return;
                    } catch (SecurityException var31) {
                        addLine("Cannot write to " + var20.getName());
                        return;
                    }
                }
                if (arg0.equals("closeoutput")) {
                    if (Statics.field804 != null) {
                        Statics.field804.close();
                    }
                    Statics.field804 = null;
                    return;
                }
                if (arg0.startsWith("runscript ")) {
                    File var23 = new File(arg0.substring(10));
                    if (!var23.exists()) {
                        addLine("No such file");
                        return;
                    }
                    byte[] var24 = FileUtil.method15684(var23);
                    if (var24 == null) {
                        addLine("Failed to read file");
                        return;
                    }
                    String[] var25 = StringTools.method11508(Statics.method12093(Statics.method8318(var24), '\r', ""), '\n');
                    method14213(var25);
                }
                if (client.state == 1 || client.state == 15) {
                    ServerConnection var26 = client.getCurrentConnection();
                    ClientMessage var27 = ClientMessage.createMessage(ClientProt.CLIENT_CHEAT, var26.randomOut);
                    var27.buf.p1(arg0.length() + 3);
                    var27.buf.p1(arg1 ? 1 : 0);
                    var27.buf.p1(arg2 ? 1 : 0);
                    var27.buf.pjstr(arg0);
                    var26.queue(var27);
                }
            } catch (Exception var32) {
                addLine(LocalisedText.field6867.get(Statics.language));
                return;
            }
        }
        if (client.state != 1 && client.state != 15) {
            addLine(LocalisedText.field6894.get(Statics.language) + arg0);
        }
    }

    @ObfuscatedName("dv.b(II)V")
    public static void method2848(int arg0) {
        if (arg0 == 7) {
            throw new Error();
        } else if (arg0 == 2) {
            throw new OutOfMemoryError();
        } else {
            try {
                if (arg0 == 25) {
                    method16885();
                } else if (arg0 == 9) {
                    addLine("" + GameShell.field4121);
                } else if (arg0 == 19) {
                    OcclusionManager var1 = client.world.getScene().field4493;
                    var1.field4624 = !var1.field4624;
                } else if (arg0 == 29) {
                    client.field8926 = true;
                } else if (arg0 == 15) {
                    client.field8926 = false;
                } else if (arg0 == 16) {
                    client.field9091.method11653();
                } else if (arg0 == 4) {
                    Statics.method5715();
                    for (int var2 = 0; var2 < 10; var2++) {
                        System.gc();
                    }
                    Runtime var3 = Runtime.getRuntime();
                    int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
                    addLine("" + var4);
                } else if (arg0 == 6) {
                    Statics.method5715();
                    for (int var5 = 0; var5 < 10; var5++) {
                        System.gc();
                    }
                    Runtime var6 = Runtime.getRuntime();
                    int var7 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
                    addLine("" + var7);
                    SceneManager.method16899();
                    Statics.method5715();
                    for (int var8 = 0; var8 < 10; var8++) {
                        System.gc();
                    }
                    int var9 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
                    addLine("" + var9);
                } else if (arg0 == 24) {
                    addLine(Statics.field2137.method6802() ? "Success" : "Failure");
                } else if (arg0 == 13) {
                    WorldSwitcher.content.method12026();
                } else if (arg0 == 14) {
                    client.js5TcpClient.method5777();
                } else if (arg0 == 21) {
                    client.js5TcpClient.method5745();
                } else if (arg0 == 11) {
                    GameShell.canvas.setLocation(50, 50);
                } else if (arg0 == 17) {
                    GameShell.canvas.setLocation(GameShell.leftMargin, GameShell.topMargin);
                } else if (arg0 == 8) {
                    method1623();
                } else if (arg0 == 28) {
                    client.world.field3789 = MonotonicTime.get();
                    client.world.field3833 = true;
                    method1623();
                } else if (arg0 == 22) {
                    Vector3 var10 = Statics.localPlayerEntity.getTransform().trans;
                    addLine(((int) var10.x >> 9) + " " + ((int) var10.z >> 9));
                } else if (arg0 == 26) {
                    Vector3 var11 = Statics.localPlayerEntity.getTransform().trans;
                    addLine("" + client.world.getScene().field4498[Statics.localPlayerEntity.level].method199((int) var11.x >> 9, (int) var11.z >> 9));
                } else if (arg0 == 1) {
                    addLine(Component.field1757.getAvailable() + " " + Component.field1757.method7923());
                    addLine(Component.field1760.getAvailable() + " " + Component.field1760.method7923());
                    addLine(client.objTypes.field7147.method8000() + " " + client.objTypes.field7147.method8008());
                } else if (arg0 == 10) {
                    client.method5025(false);
                } else if (arg0 == 27) {
                    client.field9169 = !client.field9169;
                    client.toolkit.method471(client.field9169);
                    Statics.method12860();
                    return;
                } else if (arg0 == 23) {
                    client.field8943 = 0;
                    client.world.method6102();
                } else if (arg0 == 20) {
                    client.field8943 = 1;
                    client.world.method6102();
                } else if (arg0 == 5) {
                    client.field8943 = 2;
                    client.world.method6102();
                }
            } catch (Exception var13) {
                addLine(LocalisedText.field6867.get(Statics.language));
            }
        }
    }

    @ObfuscatedName("r.x(I)V")
    public static void method1623() {
        if (client.options.field9667.method15884() == 1) {
            client.asyncRebuild.method6053(new RebuildRequest(RebuildType.field3842, null));
        } else {
            client.world.method6102();
            MiniMap.method7992();
        }
    }
}
