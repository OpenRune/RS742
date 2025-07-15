package com.jagex.protocol;

import com.jagex.*;
import com.jagex.protocol.revisions.RevisionManager;
import deob.ObfuscatedName;

@ObfuscatedName("s")
public class LoginManager {

    @ObfuscatedName("s.c")
    public static boolean field498 = false;

    @ObfuscatedName("s.t")
    public static boolean field504 = false;

    @ObfuscatedName("s.l")
    public static int ssoKey = -1;

    @ObfuscatedName("s.f")
    public static long socialKey = -1L;

    @ObfuscatedName("s.ai")
    public static int loginState = 7;

    @ObfuscatedName("s.ao")
    public static long socialName = 0L;

    @ObfuscatedName("s.al")
    public static String username = "";

    @ObfuscatedName("s.at")
    public static String password = "";

    @ObfuscatedName("s.ax")
    public static int field535 = 0;

    @ObfuscatedName("s.aw")
    public static int field516 = 0;

    @ObfuscatedName("s.az")
    public static int enterLobbyReply = -2;

    @ObfuscatedName("s.ak")
    public static int enterGameReply = -2;

    @ObfuscatedName("s.av")
    public static int field547 = -2;

    @ObfuscatedName("s.aj")
    public static int field540 = -1;

    @ObfuscatedName("s.ah")
    public static int field546 = -1;

    @ObfuscatedName("s.au")
    public static int field526 = 0;

    @ObfuscatedName("s.ae")
    public static int field543 = -1;

    @ObfuscatedName("s.ac")
    public static int field509 = -1;

    @ObfuscatedName("s.aq")
    public static int field545 = 0;

    @ObfuscatedName("s.ab")
    public static boolean field536 = false;

    @ObfuscatedName("s.bq")
    public static int field507 = 0;

    @ObfuscatedName("s.bz")
    public static boolean field548 = false;

    public LoginManager() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("gk.u(B)Z")
    public static boolean requestGameLogin() {
        if (client.field8909 == null) {
            return ssoKey == -1 ? method11239(username, password) : method1201();
        } else {
            return method11920();
        }
    }

    @ObfuscatedName("pw.j(I)Z")
    public static boolean requestLobbyLogin() {
        if (client.field8909 == null) {
            return ssoKey == -1 ? method4741(username, password) : method11994();
        } else {
            return method2710();
        }
    }

    @ObfuscatedName("aau.a(I)V")
    public static final void resetLoginState() {
        loginState = 7;
        enterGameReply = -2;
        enterLobbyReply = -2;
    }

    @ObfuscatedName("kj.s(I)V")
    public static final void resetSocialKeys() {
        socialKey = -1L;
        socialName = 0L;
        ssoKey = -1;
    }

    @ObfuscatedName("la.c(I)V")
    public static final void cancelLogin() {
        if (loginState != 7) {
            Statics.connection.closeGracefully();
            resetLoginState();
            updateLoginState();
        }
    }

    @ObfuscatedName("aiq.m(I)Z")
    public static final boolean isInProgress() {
        return loginState != 7;
    }

    @ObfuscatedName("gb.t(B)V")
    public static void continueLogin() {
        if (loginState == 106) {
            loginState = 113;
        }
    }

    @ObfuscatedName("vg.l(Ljava/lang/String;Ljava/lang/String;I)V")
    public static void requestLogin(String arg0, String arg1) {
        if (arg0.length() <= 320 && isLoginReady()) {
            resetSocialKeys();
            username = arg0;
            password = arg1;
            client.setState(18);
        }
    }

    @ObfuscatedName("st.f(II)V")
    public static void method11156(int arg0) {
        if (!isLoginReady()) {
            return;
        }
        if (ssoKey != arg0) {
            socialKey = -1L;
        }
        ssoKey = arg0;
        client.setState(18);
    }

    @ObfuscatedName("abm.d(Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method14208(String arg0, String arg1) {
        if (arg0.length() > 320 || !isLoginReady()) {
            return;
        }
        client.lobbyConnection.closeGracefully();
        resetSocialKeys();
        username = arg0;
        password = arg1;
        client.setState(3);
    }

    @ObfuscatedName("sf.z(II)V")
    public static void method11170(int arg0) {
        if (!isLoginReady()) {
            return;
        }
        if (ssoKey != arg0) {
            socialKey = -1L;
        }
        ssoKey = arg0;
        client.lobbyConnection.closeGracefully();
        client.setState(3);
    }

    @ObfuscatedName("yh.o(I)V")
    public static void method12896() {
        password = "";
        username = "";
    }

    @ObfuscatedName("jc.q(Ljava/lang/String;Ljava/lang/String;S)Z")
    public static boolean method4741(String arg0, String arg1) {
        if (!client.ENABLE_LOBBY) {
            return method11239(arg0, arg1);
        }

        Statics.field500 = 154;
        Statics.connection = client.lobbyConnection;
        return method6245(false, false, arg0, arg1, -1L);
    }

    @ObfuscatedName("dh.p(I)Z")
    public static boolean method2710() {
        Statics.field500 = 154;
        Statics.connection = client.lobbyConnection;
        if (client.field8909 != null) {
            Packet var0 = new Packet(client.field8909);
            socialKey = var0.g8();
            socialName = var0.g8();
        }
        if (socialKey < 0L) {
            method7972(35);
            return false;
        } else {
            return method6245(false, true, "", "", socialKey);
        }
    }

    @ObfuscatedName("sq.w(Ljava/lang/String;Ljava/lang/String;I)Z")
    public static boolean method11239(String arg0, String arg1) {
        Statics.field500 = 223;
        Statics.connection = client.gameConnection;
        return method6245(false, false, arg0, arg1, -1L);
    }

    @ObfuscatedName("uc.b(I)Z")
    public static boolean method11920() {
        Statics.field500 = 223;
        Statics.connection = client.gameConnection;
        if (client.field8909 != null) {
            Packet var0 = new Packet(client.field8909);
            socialKey = var0.g8();
            socialName = var0.g8();
        }
        if (socialKey < 0L) {
            method7972(35);
            return false;
        } else {
            return method6245(false, true, "", "", socialKey);
        }
    }

    @ObfuscatedName("v.x(B)Z")
    public static boolean method1201() {
        Statics.field500 = 223;
        Statics.connection = client.gameConnection;
        return method6245(socialKey == -1L, true, "", "", socialKey);
    }

    @ObfuscatedName("uj.i(S)Z")
    public static boolean method11994() {
        Statics.field500 = 154;
        Statics.connection = client.lobbyConnection;
        return method6245(socialKey == -1L, true, "", "", socialKey);
    }

    @ObfuscatedName("ml.v(ZZLjava/lang/String;Ljava/lang/String;J)Z")
    public static boolean method6245(boolean arg0, boolean arg1, String arg2, String arg3, long arg4) {
        field504 = arg0;
        if (!arg1) {
            ssoKey = -1;
        }
        field498 = arg1;
        username = arg2;
        password = arg3;
        socialKey = arg4;
        if (!field498 && (username.equals("") || password.equals(""))) {
            method7972(3);
            updateLoginState();
            return false;
        }
        if (Statics.field500 != 154) {
            field526 = 0;
            field509 = -1;
            field543 = -1;
        }
        Statics.connection.disconnected = false;
        method7972(-3);
        loginState = 12;
        field535 = 0;
        field516 = 0;
        return true;
    }

    @ObfuscatedName("nc.k(I)V")
    public static final void login() {
        RevisionManager.getRevision().getLoginHandler().decodeLogin();
    }

    @ObfuscatedName("dq.h(II)V")
    public static void method2898(int arg0) {
    }

    @ObfuscatedName("ru.r(I)Laet;")
    public static Packet method8625() {
        Packet var0 = new Packet(518);
        Statics.field541 = new int[4];
        Statics.field541[0] = (int) (Math.random() * 9.9999999E7D);
        Statics.field541[1] = (int) (Math.random() * 9.9999999E7D);
        Statics.field541[2] = (int) (Math.random() * 9.9999999E7D);
        Statics.field541[3] = (int) (Math.random() * 9.9999999E7D);
        var0.p1(10);
        var0.p4(Statics.field541[0]);
        var0.p4(Statics.field541[1]);
        var0.p4(Statics.field541[2]);
        var0.p4(Statics.field541[3]);
        return var0;
    }

    @ObfuscatedName("kg.g(S)Laet;")
    public static Packet method5564() {
        Packet var0 = method8625();
        var0.p8(0L);
        var0.pjstr(password);
        var0.p8(socialName);
        var0.p8(client.field9138);
        var0.rsaenc(PublicKeys.LOGIN_RSAE, PublicKeys.LOGIN_RSAN);
        return var0;
    }

    @ObfuscatedName("pz.y(II)V")
    public static void method7972(int arg0) {
        int overridden = RevisionManager.overrideLoginOpcode(arg0);

        if (!client.ENABLE_LOBBY || Statics.field500 == 223) {
            enterGameReply = overridden;
        } else if (Statics.field500 == 154) {
            enterLobbyReply = overridden;
        }
    }
    @ObfuscatedName("ta.e(I)V")
    public static void updateLoginState() {
        if (client.method12490(client.state)) {
            if (client.lobbyConnection.getStream() == null) {
                client.setState(3);
            } else {
                client.setState(15);
            }
        } else if (client.state == 3 || client.state == 18) {
            client.setState(6);
        } else if (client.state == 4) {
            client.setState(6);
        }
    }

    @ObfuscatedName("jw.ay(Lajl;I)V")
    public static void method4896(PacketBit arg0) {
        arg0.p4(Statics.field7567.method5622());
        arg0.p4(Statics.field6690.method5622());
        arg0.p4(Statics.field7435.method5622());
        arg0.p4(Statics.field2653.method5622());
        arg0.p4(Statics.synthSounds.method5622());
        arg0.p4(Statics.field7343.method5622());
        arg0.p4(Statics.midiSongs.method5622());
        arg0.p4(Statics.field4560.method5622());
        arg0.p4(Statics.field7387.method5622());
        arg0.p4(Statics.field808.method5622());
        arg0.p4(Statics.field3523.method5622());
        arg0.p4(Statics.field1509.method5622());
        arg0.p4(Statics.field6651.method5622());
        arg0.p4(Statics.field8745.method5622());
        arg0.p4(Statics.vorbis.method5622());
        arg0.p4(Statics.midiInstruments.method5622());
        arg0.p4(Statics.field1565.method5622());
        arg0.p4(Statics.field6451.method5622());
        arg0.p4(Statics.field5080.method5622());
        arg0.p4(Statics.field5130.method5622());
        arg0.p4(Statics.field3897.method5622());
        arg0.p4(Statics.field2070.method5622());
        arg0.p4(Statics.field4229.method5622());
        arg0.p4(Statics.field4059.method5622());
        arg0.p4(Statics.field6343.method5622());
        arg0.p4(Statics.field6712.method5622());
        arg0.p4(Statics.field7572.method5622());
        arg0.p4(Statics.field8655.method5622());
        arg0.p4(Statics.field849.method5622());
        arg0.p4(Statics.field8734.method5622());
        arg0.p4(Statics.field663.method5622());
        arg0.p4(Statics.field2670.method5622());
        arg0.p4(Loading.method6307());
        arg0.p4(Loading.method4671());
        arg0.p4(Statics.field4824.method5622());
        arg0.p4(Statics.field2117.method5622());
        arg0.p4(Statics.field6435.method5622());
    }

    @ObfuscatedName("gr.af(I)V")
    public static void method3988() {
        Statics.connection.method1935();
        Statics.connection.in.pos = 0;
        Statics.connection.lastPacketType0 = null;
        Statics.connection.lastPacketType1 = null;
        Statics.connection.lastPacketType2 = null;
        Statics.connection.idleNetCycles = 0;
        client.systemUpdateTimer = 0;
        Statics.method12634();
        client.field9121 = 0;
        client.field9206 = 0;
        client.field9211 = 0;
        client.field9182 = null;
        Statics.field7045 = 0;
        Statics.field5180 = null;
        Statics.field913 = null;
        Statics.field2972 = null;
        ClientWatch.method5946();
        for (int var0 = 0; var0 < 25; var0++) {
            client.field9092[var0] = 0;
            client.field9093[var0] = 0;
            client.field9094[var0] = 0;
        }
    }

    @ObfuscatedName("ei.ar(I)V")
    public static void method3222() {
        method3988();
    }

    @ObfuscatedName("gc.an(B)V")
    public static void method3965() {
        if (client.state == 0) {
            Statics.method1681();
        }
        method3988();
        client.lobbyConnection.closeGracefully();
        Statics.field578 = true;
        ReflectionCheck.clear();
        for (int var0 = 0; var0 < client.field8936.length; var0++) {
            client.field8936[var0] = null;
        }
        client.targetModeActive = false;
        AudioRenderer.method2387();
        client.field9050 = (int) (Math.random() * 100.0D) - 50;
        client.field9006 = (int) (Math.random() * 110.0D) - 55;
        client.field9008 = (int) (Math.random() * 80.0D) - 40;
        client.field9087 = (int) (Math.random() * 120.0D) - 60;
        client.field8976 = (int) (Math.random() * 30.0D) - 20;
        client.field9021 = (int) (Math.random() * 160.0D) - 80 & 0x3FFF;
        MiniMap.method7163();
        for (int var1 = 0; var1 < 2048; var1++) {
            client.players[var1] = null;
        }
        Statics.localPlayerEntity = null;
        client.npcSlotCount = 0;
        client.npcCount = 0;
        client.npcEntities.clear();
        client.field9007.clearBridged();
        client.field9090.clear();
        client.field9091.method11653();
        client.field9088.clear();
        ChangeLocationRequest.field9278 = new LinkedList();
        ChangeLocationRequest.field9292 = new LinkedList();
        client.localPlayerGameState.method1647();
        DelayedStateChange.method12620();
        client.cameraMoveToX = 0;
        client.cameraMoveToZ = 0;
        Statics.cameraMoveToY = 0;
        Statics.cameraMoveToStep = 0;
        client.cameraMoveToRate = 0;
        Statics.cameraLookX = 0;
        Statics.cameraLookZ = 0;
        Statics.cameraLookY = 0;
        Statics.cameraRotateAcceleration = 0;
        Statics.cameraRotateSpeed = 0;
        for (int var2 = 0; var2 < Statics.field6666.length; var2++) {
            if (!Statics.field2210[var2]) {
                Statics.field6666[var2] = -1;
            }
        }
        if (client.topLevelInterface != -1) {
            Component.method13890(client.topLevelInterface);
        }
        for (SubInterface var3 = (SubInterface) client.field9075.head(); var3 != null; var3 = (SubInterface) client.field9075.next()) {
            if (!var3.isLinked()) {
                var3 = (SubInterface) client.field9075.head();
                if (var3 == null) {
                    break;
                }
            }
            client.closeSubInterface(var3, true, false);
        }
        client.topLevelInterface = -1;
        client.field9075 = new HashTable(8);
        Statics.method4591();
        client.field9108 = null;
        for (int var4 = 0; var4 < 8; var4++) {
            client.field9085[var4] = null;
            client.field9086[var4] = false;
            client.field9084[var4] = -1;
        }
        ClientInvCache.method8048();
        client.field9226 = true;
        for (int var5 = 0; var5 < 100; var5++) {
            client.topLevelComponentRedrawRequestedTemp[var5] = true;
        }
        for (int var6 = 0; var6 < 6; var6++) {
            client.field9184[var6] = new StockMarketSlot();
        }
        client.world.getEnvironmentManager().method8154();
        client.field9028 = true;
        Statics.field2744 = LocType.field6530 = NPCType.field7209 = ObjType.field7118 = new short[256];
        Statics.field2400 = LocalisedText.field6994.get(Statics.language);
        client.options.method15448(client.options.removeRoofOverride, client.options.removeRoof.getValue());
        client.currentIncrementVerifyId = 0;
        MiniMenu.method11300();
        client.notifyWindowStatus();
        Statics.field3357 = null;
        Statics.field3307 = 0L;
    }

    @ObfuscatedName("vq.ag(I)Z")
    public static boolean isLoginReady() {
        if (client.state == 6) {
            return !isInProgress() && !Statics.method8399();
        } else {
            return false;
        }
    }

}
