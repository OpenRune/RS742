package com.jagex.protocol.revisions.impl.r742;

import com.jagex.*;
import com.jagex.protocol.LoginManager;
import com.jagex.protocol.revisions.handlers.LoginHandler;
import com.jagex.protocol.revisions.LoginResponse742;

import java.io.IOException;
import java.net.URL;
import java.util.Collections;
import java.util.Map;

public class R742LoginHandler implements LoginHandler {

    @Override
    public void decodeLogin() {
        if (LoginManager.loginState == 7 || LoginManager.loginState == 106) {
            return;
        }
        try {
            short var0;
            if (LoginManager.field516 == 0) {
                var0 = 500;
            } else {
                var0 = 2000;
            }
            if (LoginManager.field504 && LoginManager.loginState >= 61) {
                var0 = 6000;
            }
            if (Statics.field500 == 223 && LoginManager.loginState != 208 && LoginManager.enterGameReply != 42 || Statics.field500 == 154 && LoginManager.enterLobbyReply != 49 && LoginManager.enterLobbyReply != 52) {
                LoginManager.field535++;
            }
            if (LoginManager.field535 > var0) {
                Statics.connection.closeGracefully();
                if (LoginManager.field516 >= 3) {
                    LoginManager.loginState = 7;
                    LoginManager.method7972(-5);
                    LoginManager.updateLoginState();
                    return;
                }
                if (Statics.field500 == 223) {
                    WorldSwitcher.content.method12026();
                } else {
                    Statics.field6782.method12026();
                }
                LoginManager.field535 = 0;
                LoginManager.field516++;
                LoginManager.loginState = 12;
            }
            if (LoginManager.loginState == 12) {
                if (Statics.field500 == 223) {
                    Statics.connection.method1911(Stream.method12184(WorldSwitcher.content.getSocket(), 15000), WorldSwitcher.content.field6765);
                } else {
                    Statics.connection.method1911(Stream.method12184(Statics.field6782.getSocket(), 15000), Statics.field6782.field6765);
                }
                Statics.connection.method1935();
                ClientMessage var1 = ClientMessage.method4876();
                if (LoginManager.field504) {
                    var1.buf.p1(LoginProt.INIT_SOCIAL_NETWORK_CONNECTION.id);
                    var1.buf.p2(0);
                    int var2 = var1.buf.pos;
                    var1.buf.p4(client.REVISION);
                    var1.buf.p4(client.SUBREVISION);
                    if (Statics.field500 == 223) {
                        var1.buf.p1(client.state == 9 ? 1 : 0);
                    }
                    Packet var3 = LoginManager.method8625();
                    var3.p1(LoginManager.ssoKey);
                    var3.p2((int) (Math.random() * 9.9999999E7D));
                    var3.p1(Statics.language.getId());
                    var3.p4(client.field9043);
                    for (int var4 = 0; var4 < 6; var4++) {
                        var3.p4((int) (Math.random() * 9.9999999E7D));
                    }
                    var3.p8(client.field9138);
                    var3.p1(client.modeGame.game);
                    var3.p1((int) (Math.random() * 9.9999999E7D));
                    var3.rsaenc(PublicKeys.LOGIN_RSAE, PublicKeys.LOGIN_RSAN);
                    var1.buf.pdata(var3.data, 0, var3.pos);
                    var1.buf.psize2(var1.buf.pos - var2);
                } else {
                    var1.buf.p1(LoginProt.INIT_GAME_CONNECTION.id);
                }
                Statics.connection.queue(var1);
                Statics.connection.method1912();
                LoginManager.loginState = 35;
            }
            if (LoginManager.loginState == 35) {
                if (!Statics.connection.getStream().hasAvailable(1)) {
                    return;
                }
                Statics.connection.getStream().read(Statics.connection.in.data, 0, 1);
                Statics.connection.in.pos = 0;
                int var5 = Statics.connection.in.g1();
                if (var5 != 0) {
                    LoginManager.loginState = 7;
                    LoginManager.method2898(var5);
                    LoginManager.method7972(var5);
                    Statics.connection.closeGracefully();
                    LoginManager.updateLoginState();
                    return;
                }
                Statics.connection.in.pos = 0;
                if (LoginManager.field504) {
                    LoginManager.loginState = 40;
                } else {
                    LoginManager.loginState = 82;
                }
            }
            if (LoginManager.loginState == 40) {
                if (!Statics.connection.getStream().hasAvailable(2)) {
                    return;
                }
                Statics.connection.getStream().read(Statics.connection.in.data, 0, 2);
                Statics.connection.in.pos = 0;
                Statics.connection.in.pos = Statics.connection.in.g2();
                LoginManager.loginState = 55;
            }
            if (LoginManager.loginState == 55) {
                if (!Statics.connection.getStream().hasAvailable(Statics.connection.in.pos)) {
                    return;
                }
                Statics.connection.getStream().read(Statics.connection.in.data, 0, Statics.connection.in.pos);
                Statics.connection.in.tinydec(Statics.field541);
                Statics.connection.in.pos = 0;
                String var6 = Statics.connection.in.gjstr2();
                Statics.connection.in.pos = 0;
                String var7 = JavascriptFunction.field3152.method4757();
                if (!client.field8903 || !Browser.method1814(var6, 1, var7)) {
                    Browser.method5599(var6, true, client.options.toolkit.getValue() == 5, var7, client.field8915, client.field9218);
                }
                LoginManager.loginState = 61;
            }
            if (LoginManager.loginState == 61) {
                if (!Statics.connection.getStream().hasAvailable(1)) {
                    return;
                }
                Statics.connection.getStream().read(Statics.connection.in.data, 0, 1);
                if ((Statics.connection.in.data[0] & 0xFF) == 1) {
                    LoginManager.loginState = 76;
                }
            }
            if (LoginManager.loginState == 76) {
                if (!Statics.connection.getStream().hasAvailable(16)) {
                    return;
                }
                Statics.connection.getStream().read(Statics.connection.in.data, 0, 16);
                Statics.connection.in.pos = 16;
                Statics.connection.in.tinydec(Statics.field541);
                Statics.connection.in.pos = 0;
                LoginManager.socialKey = Statics.connection.in.g8();
                LoginManager.socialName = Statics.connection.in.g8();
                LoginManager.loginState = 82;
            }
            if (LoginManager.loginState == 82) {
                Statics.connection.in.pos = 0;
                Statics.connection.method1935();
                ClientMessage var8 = ClientMessage.method4876();
                PacketBit buf = var8.buf;
                if (Statics.field500 == 223) {
                    LoginProt var10;
                    if (LoginManager.field504) {
                        var10 = LoginProt.SOCIAL_NETWORK_LOGIN;
                    } else {
                        var10 = LoginProt.GAMELOGIN;
                    }
                    buf.p1(var10.id);
                    buf.p2(0);
                    int var11 = buf.pos;
                    int var12 = buf.pos;
                    if (!LoginManager.field504) {
                        buf.p4(client.REVISION);
                        buf.p4(client.SUBREVISION);
                        if (client.CUSTOM_SEND_MAC_ADDRESS) {
                            buf.pjstr("userMacAddress");
                        }
                        buf.p1(client.state == 9 ? 1 : 0);
                        if (client.CUSTOM_SEND_MAC_ADDRESS) {
                            buf.pjstr("userMacAddress");
                        }
                        int var13 = buf.pos;
                        Packet var14 = LoginManager.method5564();
                        buf.pdata(var14.data, 0, var14.pos);
                        var12 = buf.pos;
                        buf.p1(LoginManager.socialKey == -1L ? 1 : 0);
                        if (LoginManager.socialKey == -1L) {
                            buf.pjstr(LoginManager.username);
                        } else {
                            buf.p8(LoginManager.socialKey);
                        }
                    }
                    buf.p1(client.getWindowMode());
                    buf.p2(GameShell.canvasWid);
                    buf.p2(GameShell.canvasHei);
                    buf.p1(client.options.antialiasing.getValue());
                    GameShell.method3615(buf);
                    buf.pjstr(client.field8947);
                    buf.p4(client.field9043);
                    Packet var15 = client.options.createPreferencesBlock();
                    buf.p1(var15.pos);
                    buf.pdata(var15.data, 0, var15.pos);
                    client.preferencesChangeNotified = true;
                    Packet var16 = new Packet(Statics.hardwarePlatform.getBlockLength());
                    Statics.hardwarePlatform.createHardwareBlock(var16);
                    buf.pdata(var16.data, 0, var16.data.length);
                    buf.p4(client.currentIncrementVerifyId);
                    buf.p8(client.field8910);
                    buf.pjstr(Statics.field6817);
                    buf.p1(client.createAdditionalInfo == null ? 0 : 1);
                    if (client.createAdditionalInfo != null) {
                        buf.pjstr(client.createAdditionalInfo);
                    }
                    buf.p1(Statics.field2137.method6799("jagtheora") ? 1 : 0);
                    buf.p1(client.field8903 ? 1 : 0);
                    buf.p1(client.field8987 ? 1 : 0);
                    buf.p1(Statics.field7543);
                    buf.p4(client.field9015);
                    buf.pjstr(client.gamepack);
                    buf.p1(Statics.field6779 != null && Statics.field6779.field6768 == WorldSwitcher.content.field6768 ? 0 : 1);
                    LoginManager.method4896(buf);
                    buf.tinyenc(Statics.field541, var12, buf.pos);
                    buf.psize2(buf.pos - var11);
                } else {
                    LoginProt var17;
                    if (LoginManager.field504) {
                        var17 = LoginProt.SOCIAL_NETWORK_LOGIN;
                    } else {
                        var17 = LoginProt.LOBBYLOGIN;
                    }
                    buf.p1(var17.id);
                    buf.p2(0);
                    int var18 = buf.pos;
                    int var19 = buf.pos;
                    if (!LoginManager.field504) {
                        buf.p4(client.REVISION);
                        buf.p4(client.SUBREVISION);
                        Packet var20 = LoginManager.method5564();
                        buf.pdata(var20.data, 0, var20.pos);
                        var19 = buf.pos;
                        buf.p1(LoginManager.socialKey == -1L ? 1 : 0);
                        if (LoginManager.socialKey == -1L) {
                            buf.pjstr(LoginManager.username);
                        } else {
                            buf.p8(LoginManager.socialKey);
                        }
                    }
                    buf.p1(client.modeGame.game);
                    buf.p1(Statics.language.getId());
                    GameShell.method3615(buf);
                    buf.pjstr(client.field8947);
                    Packet var21 = client.options.createPreferencesBlock();
                    buf.p1(var21.pos);
                    buf.pdata(var21.data, 0, var21.pos);
                    Packet var22 = new Packet(Statics.hardwarePlatform.getBlockLength());
                    Statics.hardwarePlatform.createHardwareBlock(var22);
                    buf.pdata(var22.data, 0, var22.data.length);
                    buf.pjstr(Statics.field6817);
                    buf.p4(client.field9043);
                    buf.p4(client.field9015);
                    buf.pjstr(client.gamepack);
                    LoginManager.method4896(buf);
                    buf.tinyenc(Statics.field541, var19, buf.pos);
                    buf.psize2(buf.pos - var18);
                }
                Statics.connection.queue(var8);
                Statics.connection.method1912();
                Statics.connection.randomOut = new Isaac(Statics.field541);
                for (int var23 = 0; var23 < 4; var23++) {
                    Statics.field541[var23] += 50;
                }
                Statics.connection.randomIn = new Isaac(Statics.field541);
                new Isaac(Statics.field541);
                Statics.connection.in.setIsaac(Statics.connection.randomIn);
                Statics.field541 = null;
                LoginManager.loginState = 96;
            }
            if (LoginManager.loginState == 96) {
                if (!Statics.connection.getStream().hasAvailable(1)) {
                    return;
                }
                Statics.connection.getStream().read(Statics.connection.in.data, 0, 1);
                int var24 = Statics.connection.in.g1();
                Statics.connection.in.pos = 0;
                if (var24 == 21) {
                    LoginManager.loginState = 120;
                } else if (var24 == 29 || var24 == 45) {
                    Statics.field1025 = var24;
                    LoginManager.loginState = 183;
                } else if (var24 == 1) {
                    LoginManager.loginState = 106;
                    LoginManager.method7972(var24);
                    return;
                } else if (var24 == 52) {
                    Statics.field1025 = var24;
                    LoginManager.loginState = 213;
                } else if (var24 == 2) {
                    if (LoginManager.field548) {
                        LoginManager.field548 = false;
                        LoginManager.loginState = 12;
                        return;
                    }
                    LoginManager.loginState = 136;
                } else if (var24 == 15) {
                    Statics.connection.packetSize = -2;
                    LoginManager.loginState = 197;
                } else if (var24 == 23 && LoginManager.field516 < 3) {
                    LoginManager.field535 = 0;
                    LoginManager.field516++;
                    LoginManager.loginState = 12;
                    Statics.connection.closeGracefully();
                    return;
                } else if (var24 == 42) {
                    LoginManager.loginState = 208;
                    LoginManager.method7972(var24);
                    return;
                } else if (Statics.field500 == 154 && var24 == 49 && client.state != 4) {
                    if (LoginManager.enterLobbyReply != 52) {
                        LoginManager.method7972(var24);
                    }
                    return;
                } else if (!LoginManager.field498 || LoginManager.field504 || LoginManager.ssoKey == -1 || var24 != 35) {
                    if (var24 != 53) {
                        LoginManager.loginState = 7;
                        LoginManager.method7972(var24);
                        Statics.connection.closeGracefully();
                        LoginManager.updateLoginState();
                        return;
                    }
                    LoginManager.loginState = 235;
                } else {
                    LoginManager.field504 = true;
                    LoginManager.field535 = 0;
                    LoginManager.loginState = 12;
                    Statics.connection.closeGracefully();
                    return;
                }
            }
            if (LoginManager.loginState == 113) {
                Statics.connection.method1935();
                ClientMessage var25 = ClientMessage.method4876();
                PacketBit var26 = var25.buf;
                var26.setIsaac(Statics.connection.randomOut);
                var26.pIsaac1(LoginProt.GAMELOGIN_CONTINUE.id);
                Statics.connection.queue(var25);
                Statics.connection.method1912();
                LoginManager.loginState = 96;
                return;
            }
            if (LoginManager.loginState == 120) {
                if (!Statics.connection.getStream().hasAvailable(1)) {
                    return;
                }
                Statics.connection.getStream().read(Statics.connection.in.data, 0, 1);
                int var27 = Statics.connection.in.data[0] & 0xFF;
                LoginManager.field526 = var27 * 50;
                LoginManager.loginState = 7;
                LoginManager.method7972(21);
                Statics.connection.closeGracefully();
                LoginManager.updateLoginState();
                return;
            }
            if (LoginManager.loginState == 208) {
                if (!Statics.connection.getStream().hasAvailable(2)) {
                    return;
                }
                Statics.connection.getStream().read(Statics.connection.in.data, 0, 2);
                LoginManager.field545 = ((Statics.connection.in.data[0] & 0xFF) << 8) + (Statics.connection.in.data[1] & 0xFF);
                LoginManager.loginState = 96;
                return;
            }
            if (LoginManager.loginState == 235) {
                if (!Statics.connection.getStream().hasAvailable(4)) {
                    return;
                }
                Statics.connection.getStream().read(Statics.connection.in.data, 0, 4);
                LoginManager.field507 = Statics.connection.in.g4s();
                Statics.connection.in.pos = 0;
                LoginManager.loginState = 7;
                LoginManager.method7972(53);
                Statics.connection.closeGracefully();
                LoginManager.updateLoginState();
                return;
            }
            if (LoginManager.loginState == 183) {
                if (Statics.field1025 == 29) {
                    if (!Statics.connection.getStream().hasAvailable(1)) {
                        return;
                    }
                    Statics.connection.getStream().read(Statics.connection.in.data, 0, 1);
                    LoginManager.field509 = Statics.connection.in.data[0] & 0xFF;
                } else if (Statics.field1025 == 45) {
                    if (!Statics.connection.getStream().hasAvailable(3)) {
                        return;
                    }
                    Statics.connection.getStream().read(Statics.connection.in.data, 0, 3);
                    LoginManager.field509 = Statics.connection.in.data[0] & 0xFF;
                    LoginManager.field543 = ((Statics.connection.in.data[1] & 0xFF) << 8) + (Statics.connection.in.data[2] & 0xFF);
                } else {
                    throw new IllegalStateException();
                }
                LoginManager.loginState = 7;
                LoginManager.method7972(Statics.field1025);
                Statics.connection.closeGracefully();
                LoginManager.updateLoginState();
                return;
            }
            if (LoginManager.loginState == 213) {
                if (!Statics.connection.getStream().hasAvailable(2)) {
                    return;
                }
                Statics.connection.getStream().read(Statics.connection.in.data, 0, 2);
                Statics.connection.in.pos = 0;
                Statics.field10389 = Statics.connection.in.g2();
                Statics.connection.in.pos = 0;
                LoginManager.loginState = 225;
                return;
            }
            if (LoginManager.loginState == 225) {
                if (!Statics.connection.getStream().hasAvailable(Statics.field10389)) {
                    return;
                }
                Statics.connection.getStream().read(Statics.connection.in.data, 0, Statics.field10389);
                Statics.connection.in.pos = 0;
                byte[] var28 = new byte[Statics.field10389 + 1];
                Statics.connection.in.gIsaacArrayBuffer(var28, 0, Statics.field10389);
                Statics.connection.in.pos = 0;
                Packet var29 = new Packet(var28);
                String var30 = var29.gjstr();
                Browser.method3613(var30, true, client.options.toolkit.getValue() == 5, client.field8915, client.field9218);
                LoginManager.method7972(Statics.field1025);
                if (Statics.field500 == 154 && client.state != 4) {
                    LoginManager.loginState = 96;
                } else {
                    LoginManager.loginState = 7;
                    Statics.connection.closeGracefully();
                    LoginManager.updateLoginState();
                }
                return;
            }
            if (LoginManager.loginState == 136) {
                if (!Statics.connection.getStream().hasAvailable(1)) {
                    return;
                }
                Statics.connection.getStream().read(Statics.connection.in.data, 0, 1);
                Statics.field8459 = Statics.connection.in.data[0] & 0xFF;
                LoginManager.loginState = 145;
                return;
            }
            if (LoginManager.loginState == 145) {
                PacketBit var31 = Statics.connection.in;
                if (Statics.field500 == 223) {
                    if (!Statics.connection.getStream().hasAvailable(Statics.field8459)) {
                        return;
                    }
                    Statics.connection.getStream().read(var31.data, 0, Statics.field8459);
                    var31.pos = 0;
                    client.userStaffModLevel = var31.g1();
                    client.field8916 = var31.g1();
                    client.field9054 = var31.g1() == 1;
                    client.field9077 = var31.g1() == 1;
                    client.field9078 = var31.g1() == 1;
                    client.field9081 = var31.g1() == 1;
                    client.currentPlayerUid = var31.g2();
                    client.field8998 = var31.g1() == 1;
                    Statics.field8469 = var31.g3s();
                    client.field9142 = var31.g1() == 1;
                    Statics.field4685 = var31.gjstr();
                    client.world.getLocTypeList().method11472(client.field9142);
                    client.asyncRebuild.method6040().getLocTypeList().method11472(client.field9142);
                    client.objTypes.method12304(client.field9142);
                    client.npcTypes.method12561(client.field9142);
                } else if (Statics.connection.getStream().hasAvailable(Statics.field8459)) {
                    Statics.connection.getStream().read(var31.data, 0, Statics.field8459);
                    var31.pos = 0;
                    client.userStaffModLevel = var31.g1();
                    client.field8916 = var31.g1();
                    client.field9054 = var31.g1() == 1;
                    Statics.field8469 = var31.g3s();
                    Statics.localPlayerEntity.gender = (byte) var31.g1();
                    client.field9077 = var31.g1() == 1;
                    client.field9078 = var31.g1() == 1;
                    Statics.field6701 = var31.g8();
                    Statics.field3384 = Statics.field6701 - MonotonicTime.get() - var31.g5();
                    int var32 = var31.g1();
                    client.field8998 = (var32 & 0x1) != 0;
                    Statics.field628 = (var32 & 0x2) != 0;
                    Statics.field3210 = var31.g4s();
                    Statics.field3497 = var31.g1() == 1;
                    Statics.field3584 = var31.g4s();
                    Statics.field3585 = var31.g2();
                    Statics.field5056 = var31.g2();
                    Statics.field4225 = var31.g2();
                    Statics.field8466 = var31.g4s();
                    Statics.hostNameProvider = new HostNameProvider(Statics.field8466);
                    (new Thread(Statics.hostNameProvider)).start();
                    Statics.field1685 = var31.g1();
                    Statics.field1599 = var31.g2();
                    Statics.field7157 = var31.g2();
                    Statics.field8432 = var31.g1() == 1;
                    Statics.localPlayerEntity.nameUnfiltered = Statics.localPlayerEntity.name = Statics.user = var31.gjstr2();
                    Statics.field563 = var31.g1();
                    Statics.field8537 = var31.g4s();
                    client.field9079 = var31.g1() == 1;
                    Statics.field6779 = new ServerAddress();
                    Statics.field6779.field6768 = var31.g2();
                    if (Statics.field6779.field6768 == 65535) {
                        Statics.field6779.field6768 = -1;
                    }
                    Statics.field6779.field6765 = var31.gjstr2();
                    if (client.modewhere != ModeWhere.LIVE) {
                        Statics.field6779.field6764 = Statics.field6779.field6768 + 40000;
                        Statics.field6779.field6766 = Statics.field6779.field6768 + 50000;
                    }
                    if (client.modewhere != ModeWhere.field6363 && (client.modewhere != ModeWhere.field6362 || client.userStaffModLevel < 2) && WorldSwitcher.content.method12027(Statics.field6773)) {
                        Statics.method12022();
                    }
                } else {
                    return;
                }
                if (client.field9054 && !client.field9078 || client.field8998) {
                    try {
                        BrowserControl.method12167(Statics.field6387, "zap");
                    } catch (Throwable var44) {
                        if (client.field9193) {
                            try {
                                Statics.field6387.getAppletContext().showDocument(new URL(Statics.field6387.getCodeBase(), "blank.ws"), "tbi");
                            } catch (Exception var43) {
                            }
                        }
                    }
                } else {
                    try {
                        BrowserControl.method12167(Statics.field6387, "unzap");
                    } catch (Throwable var42) {
                    }
                }
                if (client.modewhere == ModeWhere.LIVE) {
                    JavascriptFunction.field3141.method4761();
                }
                if (Statics.field500 != 223) {
                    LoginManager.loginState = 7;
                    LoginManager.method7972(2);
                    LoginManager.method3222();
                    client.setState(15);
                    Statics.connection.packetType = null;
                    return;
                }
                LoginManager.loginState = 166;
            }
            if (LoginManager.loginState == 166) {
                if (!Statics.connection.getStream().hasAvailable(3)) {
                    return;
                }
                Statics.connection.getStream().read(Statics.connection.in.data, 0, 3);
                LoginManager.loginState = 173;
            }
            if (LoginManager.loginState == 173) {
                PacketBit var36 = Statics.connection.in;
                var36.pos = 0;
                if (var36.isIsaac1or2()) {
                    if (!Statics.connection.getStream().hasAvailable(1)) {
                        return;
                    }
                    Statics.connection.getStream().read(var36.data, 3, 1);
                }
                Statics.connection.packetType = ServerProt.values()[var36.gIsaac1or2()];
                Statics.connection.packetSize = var36.g2();
                LoginManager.loginState = 153;
            }
            if (LoginManager.loginState == 153) {
                if (!Statics.connection.getStream().hasAvailable(Statics.connection.packetSize)) {
                    return;
                }
                Statics.connection.getStream().read(Statics.connection.in.data, 0, Statics.connection.packetSize);
                Statics.connection.in.pos = 0;
                int var37 = Statics.connection.packetSize;
                LoginManager.loginState = 7;
                LoginManager.method7972(2);
                LoginManager.method3965();
                ReceivePlayerPositions.method12667(Statics.connection.in);
                int var38 = var37 - Statics.connection.in.pos;
                PacketBit var39 = new PacketBit(var38);
                System.arraycopy(Statics.connection.in.data, Statics.connection.in.pos, var39.data, 0, var38);
                Statics.connection.in.pos += var38;
                if (ServerProt.REBUILD_REGION == Statics.connection.packetType) {
                    client.world.method6135(new RebuildRequest(RebuildType.REBUILD_REGION, var39));
                } else {
                    client.world.method6135(new RebuildRequest(RebuildType.REBUILD_NORMAL, var39));
                }
                if (Statics.connection.in.pos != var37) {
                    throw new RuntimeException(Statics.connection.in.pos + " " + var37);
                }
                Statics.connection.packetType = null;
                return;
            }
            if (LoginManager.loginState == 197) {
                if (Statics.connection.packetSize == -2) {
                    if (!Statics.connection.getStream().hasAvailable(2)) {
                        return;
                    }
                    Statics.connection.getStream().read(Statics.connection.in.data, 0, 2);
                    Statics.connection.in.pos = 0;
                    Statics.connection.packetSize = Statics.connection.in.g2();
                }
                if (!Statics.connection.getStream().hasAvailable(Statics.connection.packetSize)) {
                    return;
                }
                Statics.connection.getStream().read(Statics.connection.in.data, 0, Statics.connection.packetSize);
                Statics.connection.in.pos = 0;
                int var40 = Statics.connection.packetSize;
                LoginManager.loginState = 7;
                LoginManager.method7972(15);
                Statics.method1237();
                ReceivePlayerPositions.method12667(Statics.connection.in);
                if (Statics.connection.in.pos != var40) {
                    throw new RuntimeException(Statics.connection.in.pos + " " + var40);
                }
                Statics.connection.packetType = null;
                return;
            }
        } catch (IOException var45) {
            Statics.connection.closeGracefully();
            if (LoginManager.field516 < 3) {
                if (Statics.field500 == 223) {
                    WorldSwitcher.content.method12026();
                } else {
                    Statics.field6782.method12026();
                }
                LoginManager.field535 = 0;
                LoginManager.field516++;
                LoginManager.loginState = 12;
            } else {
                LoginManager.loginState = 7;
                LoginManager.method7972(-4);
                LoginManager.updateLoginState();
            }
        }
    }

    @Override
    public Map<Integer, LoginResponse742> getResponseMapping() {
        return Collections.emptyMap();
    }
} 