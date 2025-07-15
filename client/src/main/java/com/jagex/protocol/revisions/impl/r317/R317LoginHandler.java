package com.jagex.protocol.revisions.impl.r317;

import com.jagex.*;
import com.jagex.protocol.LoginManager;
import com.jagex.protocol.revisions.LoginResponse742;
import com.jagex.protocol.revisions.handlers.LoginHandler;


import java.io.IOException;
import java.net.URL;
import java.util.Map;
import java.util.HashMap;

public class R317LoginHandler implements LoginHandler {

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
                Statics.connection.method1911(Stream.method12184(WorldSwitcher.content.getSocket(), 15000), WorldSwitcher.content.field6765);
                Statics.connection.method1935();
                ClientMessage var1 = ClientMessage.method4876();
                var1.buf.p1(LoginProt.INIT_GAME_CONNECTION.id);
                Statics.connection.queue(var1);
                Statics.connection.method1912();
                LoginManager.loginState = 35;
            }
            System.out.println("Login State: " + LoginManager.loginState);
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
                LoginManager.loginState = 82;
            }

            if (LoginManager.loginState == 82) {
                Statics.connection.getStream().read(Statics.connection.in.data, 0, 8);
                long serverSessionKey = Statics.connection.in.g8();

                Statics.connection.in.pos = 0;
                Statics.connection.method1935();
                ClientMessage var8 = ClientMessage.method4876();
                PacketBit outBuffer = var8.buf;

                Statics.field541 = new int[4];
                Statics.field541[0] = (int) (Math.random() * 99999999D);
                Statics.field541[1] = (int) (Math.random() * 99999999D);
                Statics.field541[2] = (int) (serverSessionKey >> 32);
                Statics.field541[3] = (int) serverSessionKey;

                outBuffer.pos = 0;
                outBuffer.p1(10);
                outBuffer.p4(Statics.field541[0]);
                outBuffer.p4(Statics.field541[1]);
                outBuffer.p4(Statics.field541[2]);
                outBuffer.p4(Statics.field541[3]);

                outBuffer.p4(8784521);
                outBuffer.writeString(LoginManager.username);
                outBuffer.writeString(LoginManager.password);

                outBuffer.encryptRSAContent();

                ClientMessage loginMessage = ClientMessage.method4876();
                PacketBit buf = loginMessage.buf;

                buf.p1(16);
                buf.p1(outBuffer.pos + 2);

                buf.p1(255);
                buf.p1(0);

                buf.pdata(outBuffer.data, 0, outBuffer.pos);

                Statics.connection.queue(loginMessage);
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
                if (!Statics.connection.getStream().hasAvailable(1)) {
                    return;
                }

                Statics.connection.getStream().read(var31.data, 0, 1);
                var31.pos = 0;
                client.userStaffModLevel = var31.g1();
                System.out.println("Mod Level: " + client.userStaffModLevel);
                client.field8916 = 0;
                client.field9054 = false;
                client.field9077 = false;
                client.field9078 = true;
                client.field9081 = false;
                client.currentPlayerUid = 1;
                client.field8998 = false;
                Statics.field8469 = 0;
                client.field9142 = true;
                Statics.field4685 = LoginManager.username;
                client.world.getLocTypeList().method11472(client.field9142);
                client.asyncRebuild.method6040().getLocTypeList().method11472(client.field9142);
                client.objTypes.method12304(client.field9142);
                client.npcTypes.method12561(client.field9142);

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
        Map<Integer, LoginResponse742> map = new HashMap<Integer,LoginResponse742>();
        map.put(2, LoginResponse742.SUCCESS);
        map.put(3, LoginResponse742.INVALID_LOGIN_OR_PASSWORD);
        map.put(4, LoginResponse742.ACCOUNT_DISABLED);
        map.put(5, LoginResponse742.ACCOUNT_ALREADY_LOGGED_IN);
        map.put(6, LoginResponse742.SERVER_UPDATING);
        map.put(7, LoginResponse742.SERVER_FULL);
        map.put(9, LoginResponse742.LOGIN_LIMIT_EXCEEDED);
        map.put(10, LoginResponse742.BAD_SESSION_ID);
        map.put(11, LoginResponse742.PASSWORD_TOO_COMMON); // aka REJECT_SESSION
        map.put(22, LoginResponse742.MALFORMED_PACKET);
        map.put(27, LoginResponse742.SERVICE_UNAVAILABLE);
        map.put(28, LoginResponse742.INVALID_LOGIN_OR_PASSWORD);
        map.put(30, LoginResponse742.GAME_UPDATED);
        return map;
    }
} 