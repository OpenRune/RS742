package com.jagex;

import deob.ObfuscatedName;

import java.io.IOException;

@ObfuscatedName("abs")
public class ClientJs5TcpClient extends Js5TcpClient {

    @ObfuscatedName("abs.b")
    public Stream field8882;

    @ObfuscatedName("abs.m(I)V")
    public void method5741() {
        try {
            this.field8882.closeGracefully();
        } catch (Exception var2) {
        }
        this.field8882 = null;
        this.errorCount++;
        this.js5State = -1;
        this.field3601 = (byte) (Math.random() * 255.0D + 1.0D);
    }

    @ObfuscatedName("abs.t(I)Z")
    public boolean process() {
        if (this.field8882 != null) {
            long var1 = MonotonicTime.get();
            int var3 = (int) (var1 - this.field3599);
            this.field3599 = var1;
            if (var3 > 200) {
                var3 = 200;
            }
            this.field3598 += var3;
            if (this.field3598 > 30000) {
                try {
                    this.field8882.closeGracefully();
                } catch (Exception var29) {
                }
                this.field8882 = null;
            }
        }
        if (this.field8882 == null) {
            return this.method5764() == 0 && this.method5739() == 0;
        }
        try {
            for (Js5NetRequest var5 = (Js5NetRequest) this.field3594.head(); var5 != null; var5 = (Js5NetRequest) this.field3594.next()) {
                this.field3597.pos = 0;
                this.field3597.p1(1);
                this.field3597.p5(var5.secondaryKey);
                this.field8882.write(this.field3597.data, 0, this.field3597.data.length);
                this.field3595.addFirst(var5);
            }
            for (Js5NetRequest var6 = (Js5NetRequest) this.field3605.head(); var6 != null; var6 = (Js5NetRequest) this.field3605.next()) {
                this.field3597.pos = 0;
                this.field3597.p1(0);
                this.field3597.p5(var6.secondaryKey);
                this.field8882.write(this.field3597.data, 0, this.field3597.data.length);
                this.field3596.addFirst(var6);
            }
            for (int var7 = 0; var7 < 100; var7++) {
                int var8 = this.field8882.method7189();
                if (var8 < 0) {
                    throw new IOException();
                }
                if (var8 == 0) {
                    break;
                }
                this.field3598 = 0;
                byte var9 = 0;
                if (this.field3592 == null) {
                    var9 = 10;
                } else if (this.field3592.field10600 == 0) {
                    var9 = 1;
                }
                if (var9 > 0) {
                    int var10 = var9 - this.field3590.pos;
                    if (var10 > var8) {
                        var10 = var8;
                    }
                    this.field8882.read(this.field3590.data, this.field3590.pos, var10);
                    if (this.field3601 != 0) {
                        for (int var11 = 0; var11 < var10; var11++) {
                            this.field3590.data[this.field3590.pos + var11] ^= this.field3601;
                        }
                    }
                    this.field3590.pos += var10;
                    if (this.field3590.pos >= var9) {
                        if (this.field3592 == null) {
                            this.field3590.pos = 0;
                            int var12 = this.field3590.g1();
                            int var13 = this.field3590.g4s();
                            int var14 = this.field3590.g1();
                            int var15 = this.field3590.g4s();
                            int var16 = var14 & 0x7F;
                            boolean var17 = (var14 & 0x80) != 0;
                            long var18 = ((long) var12 << 32) + (long) var13;
                            Object var20 = null;
                            Js5NetRequest var21;
                            if (var17) {
                                for (var21 = (Js5NetRequest) this.field3596.head(); var21 != null && var21.secondaryKey != var18; var21 = (Js5NetRequest) this.field3596.next()) {
                                }
                            } else {
                                for (var21 = (Js5NetRequest) this.field3595.head(); var21 != null && var21.secondaryKey != var18; var21 = (Js5NetRequest) this.field3595.next()) {
                                }
                            }
                            if (var21 == null) {
                                throw new IOException();
                            }
                            int var22 = var16 == 0 ? 5 : 9;
                            this.field3592 = var21;
                            this.field3592.field10599 = new Packet(var15 + var22 + this.field3592.field10598);
                            this.field3592.field10599.p1(var16);
                            this.field3592.field10599.p4(var15);
                            this.field3592.field10600 = 10;
                            this.field3590.pos = 0;
                        } else if (this.field3592.field10600 != 0) {
                            throw new IOException();
                        } else if (this.field3590.data[0] == -1) {
                            this.field3592.field10600 = 1;
                            this.field3590.pos = 0;
                        } else {
                            this.field3592 = null;
                        }
                    }
                } else {
                    int var23 = this.field3592.field10599.data.length - this.field3592.field10598;
                    int var24 = 512 - this.field3592.field10600;
                    if (var24 > var23 - this.field3592.field10599.pos) {
                        var24 = var23 - this.field3592.field10599.pos;
                    }
                    if (var24 > var8) {
                        var24 = var8;
                    }
                    this.field8882.read(this.field3592.field10599.data, this.field3592.field10599.pos, var24);
                    if (this.field3601 != 0) {
                        for (int var25 = 0; var25 < var24; var25++) {
                            this.field3592.field10599.data[this.field3592.field10599.pos + var25] ^= this.field3601;
                        }
                    }
                    this.field3592.field10599.pos += var24;
                    this.field3592.field10600 += var24;
                    if (this.field3592.field10599.pos == var23) {
                        this.field3592.unlinkSecondary();
                        this.field3592.field10352 = false;
                        this.field3592 = null;
                    } else if (this.field3592.field10600 == 512) {
                        this.field3592.field10600 = 0;
                    }
                }
            }
            return true;
        } catch (IOException var30) {
            try {
                this.field8882.closeGracefully();
            } catch (Exception var28) {
            }
            this.field8882 = null;
            this.errorCount++;
            this.js5State = -2;
            return this.method5764() == 0 && this.method5739() == 0;
        }
    }

    @ObfuscatedName("abs.l(Ljava/lang/Object;ZI)V")
    public void createNewJs5Stream(Object arg0, boolean arg1) {
        if (this.field8882 != null) {
            try {
                this.field8882.closeGracefully();
            } catch (Exception var10) {
            }
            this.field8882 = null;
        }
        this.field8882 = (Stream) arg0;
        this.method14261();
        this.method5744(arg1);
        this.field3590.pos = 0;
        this.field3592 = null;
        while (true) {
            Js5NetRequest var4 = (Js5NetRequest) this.field3595.removeHead();
            if (var4 == null) {
                while (true) {
                    Js5NetRequest var5 = (Js5NetRequest) this.field3596.removeHead();
                    if (var5 == null) {
                        if (this.field3601 != 0) {
                            try {
                                this.field3597.pos = 0;
                                this.field3597.p1(4);
                                this.field3597.p1(this.field3601);
                                this.field3597.p4(0);
                                this.field8882.write(this.field3597.data, 0, this.field3597.data.length);
                            } catch (IOException var9) {
                                try {
                                    this.field8882.closeGracefully();
                                } catch (Exception var8) {
                                }
                                this.field8882 = null;
                                this.errorCount++;
                                this.js5State = -2;
                            }
                        }
                        this.field3598 = 0;
                        this.field3599 = MonotonicTime.get();
                        return;
                    }
                    this.field3605.addFirst(var5);
                }
            }
            this.field3594.addFirst(var4);
        }
    }

    @ObfuscatedName("abs.bq(I)V")
    public void method14261() {
        if (this.field8882 == null) {
            return;
        }
        try {
            this.field3597.pos = 0;
            this.field3597.p1(6);
            this.field3597.p3(3);
            this.field3597.p2(0);
            this.field8882.write(this.field3597.data, 0, this.field3597.data.length);
        } catch (IOException var4) {
            try {
                this.field8882.closeGracefully();
            } catch (Exception var3) {
            }
            this.field8882 = null;
            this.errorCount++;
            this.js5State = -2;
        }
    }

    @ObfuscatedName("abs.f(ZB)V")
    public void method5744(boolean arg0) {
        if (this.field8882 == null) {
            return;
        }
        try {
            this.field3597.pos = 0;
            this.field3597.p1(arg0 ? 2 : 3);
            this.field3597.p5(0L);
            this.field8882.write(this.field3597.data, 0, this.field3597.data.length);
        } catch (IOException var5) {
            try {
                this.field8882.closeGracefully();
            } catch (Exception var4) {
            }
            this.field8882 = null;
            this.errorCount++;
            this.js5State = -2;
        }
    }

    @ObfuscatedName("abs.d(B)V")
    public void method5745() {
        if (this.field8882 == null) {
            return;
        }
        try {
            this.field3597.pos = 0;
            this.field3597.p1(7);
            this.field3597.p5(0L);
            this.field8882.write(this.field3597.data, 0, this.field3597.data.length);
        } catch (IOException var4) {
            try {
                this.field8882.closeGracefully();
            } catch (Exception var3) {
            }
            this.field8882 = null;
            this.errorCount++;
            this.js5State = -2;
        }
    }

    @ObfuscatedName("abs.z(I)V")
    public void method5777() {
        if (this.field8882 != null) {
            this.field8882.closeGracefully();
        }
    }

    @ObfuscatedName("abs.n(B)V")
    public void method5747() {
        if (this.field8882 != null) {
            this.field8882.method7203();
        }
    }
}
