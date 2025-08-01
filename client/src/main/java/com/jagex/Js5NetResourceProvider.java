package com.jagex;

import deob.ObfuscatedName;

import java.util.zip.CRC32;

@ObfuscatedName("abt")
public class Js5NetResourceProvider extends Js5ResourceProvider {

    @ObfuscatedName("abt.u")
    public int field8860;

    @ObfuscatedName("abt.j")
    public Js5TcpClient field8853;

    @ObfuscatedName("abt.a")
    public Js5DiskCache field8876;

    @ObfuscatedName("abt.s")
    public DiskStore field8855;

    @ObfuscatedName("abt.c")
    public DiskStore field8869;

    @ObfuscatedName("abt.m")
    public Js5Request field8856;

    @ObfuscatedName("abt.t")
    public int field8859;

    @ObfuscatedName("abt.l")
    public byte[] field8854;

    @ObfuscatedName("abt.f")
    public int field8877;

    @ObfuscatedName("abt.d")
    public Js5Index field8862;

    @ObfuscatedName("abt.q")
    public byte[] field8866;

    @ObfuscatedName("abt.p")
    public int field8867 = 0;

    @ObfuscatedName("abt.w")
    public HashTable field8868 = new HashTable(16);

    @ObfuscatedName("abt.b")
    public boolean field8857;

    @ObfuscatedName("abt.x")
    public boolean field8870;

    @ObfuscatedName("abt.i")
    public int field8871 = 0;

    @ObfuscatedName("abt.v")
    public LinkedList field8872;

    @ObfuscatedName("abt.k")
    public LinkedList field8873 = new LinkedList();

    @ObfuscatedName("abt.h")
    public boolean field8874;

    @ObfuscatedName("abt.r")
    public long field8875 = 0L;

    @ObfuscatedName("abt.e")
    public static CRC32 field8878 = new CRC32();

    public Js5NetResourceProvider(int arg0, DiskStore arg1, DiskStore arg2, Js5TcpClient arg3, Js5DiskCache arg4, int arg5, byte[] arg6, int arg7, boolean arg8) {
        this.field8860 = arg0;
        this.field8855 = arg1;
        if (this.field8855 == null) {
            this.field8870 = false;
        } else {
            this.field8870 = true;
            this.field8872 = new LinkedList();
        }
        this.field8869 = arg2;
        this.field8853 = arg3;
        this.field8876 = arg4;
        this.field8859 = arg5;
        this.field8854 = arg6;
        this.field8877 = arg7;
        this.field8874 = arg8;
        if (this.field8869 != null) {
            this.field8856 = this.field8876.method5730(this.field8860, this.field8869);
        }
    }

    @ObfuscatedName("abt.o(I[BIB)V")
    public void method14234(int arg0, byte[] arg1, int arg2) {
        if (this.field8859 == arg0 && this.field8877 == arg2) {
            boolean var4 = true;
            for (int var5 = 0; var5 < this.field8854.length; var5++) {
                if (this.field8854[var5] != arg1[var5]) {
                    var4 = false;
                    break;
                }
            }
            if (var4) {
                return;
            }
        }
        this.field8859 = arg0;
        this.field8854 = arg1;
        this.field8877 = arg2;
        this.field8862 = null;
        this.field8856 = null;
        if (!this.field8853.method5738()) {
            this.field8856 = this.field8853.method5765(255, this.field8860, (byte) 0, true);
        }
    }

    @ObfuscatedName("abt.q(I)I")
    public int method14244() {
        if (this.method5604() == null) {
            return this.field8856 == null ? 0 : this.field8856.method16687();
        } else {
            return 100;
        }
    }

    @ObfuscatedName("abt.u(I)Llb;")
    public Js5Index method5604() {
        if (this.field8862 != null) {
            return this.field8862;
        }
        if (this.field8856 == null) {
            if (this.field8853.method5738()) {
                return null;
            }
            this.field8856 = this.field8853.method5765(255, this.field8860, (byte) 0, true);
        }
        if (this.field8856.field10352) {
            return null;
        }
        byte[] var1 = this.field8856.method16685();
        if (this.field8856 instanceof Js5WorkerRequest) {
            try {
                if (var1 == null) {
                    throw new RuntimeException();
                }
                this.field8862 = new Js5Index(var1, this.field8859, this.field8854);
                if (this.field8862.field3547 != this.field8877) {
                    throw new RuntimeException();
                }
            } catch (RuntimeException var4) {
                this.field8862 = null;
                if (this.field8853.method5738()) {
                    this.field8856 = null;
                } else {
                    this.field8856 = this.field8853.method5765(255, this.field8860, (byte) 0, true);
                }
                return null;
            }
        } else {
            try {
                if (var1 == null) {
                    throw new RuntimeException();
                }
                this.field8862 = new Js5Index(var1, this.field8859, this.field8854);
            } catch (RuntimeException var5) {
                this.field8853.method5741();
                this.field8862 = null;
                if (this.field8853.method5738()) {
                    this.field8856 = null;
                } else {
                    this.field8856 = this.field8853.method5765(255, this.field8860, (byte) 0, true);
                }
                return null;
            }
            if (this.field8869 != null) {
                this.field8876.method5720(this.field8860, var1, this.field8869);
            }
        }
        this.field8856 = null;
        if (this.field8855 != null) {
            this.field8866 = new byte[this.field8862.field3553];
            this.field8867 = 0;
        }
        return this.field8862;
    }

    @ObfuscatedName("abt.j(II)[B")
    public byte[] method5605(int arg0) {
        Js5Request var2 = this.method14237(arg0, 0);
        if (var2 == null) {
            return null;
        } else {
            byte[] var3 = var2.method16685();
            var2.unlink();
            return var3;
        }
    }

    @ObfuscatedName("abt.p(III)Lajf;")
    public Js5Request method14237(int arg0, int arg1) {
        Js5Request var3 = (Js5Request) this.field8868.get((long) arg0);
        if (var3 != null && arg1 == 0 && !var3.field10354 && var3.field10352) {
            var3.unlink();
            var3 = null;
        }
        if (var3 == null) {
            if (arg1 == 0) {
                if (this.field8855 == null || this.field8866[arg0] == -1) {
                    if (this.field8853.method5738()) {
                        return null;
                    }
                    var3 = this.field8853.method5765(this.field8860, arg0, (byte) 2, true);
                } else {
                    var3 = this.field8876.method5730(arg0, this.field8855);
                }
            } else if (arg1 == 1) {
                if (this.field8855 == null) {
                    throw new RuntimeException();
                }
                var3 = this.field8876.method5721(arg0, this.field8855);
            } else if (arg1 == 2) {
                if (this.field8855 == null) {
                    throw new RuntimeException();
                }
                if (this.field8866[arg0] != -1) {
                    throw new RuntimeException();
                }
                if (this.field8853.method5737()) {
                    return null;
                }
                var3 = this.field8853.method5765(this.field8860, arg0, (byte) 2, false);
            } else {
                throw new RuntimeException();
            }
            this.field8868.put(var3, (long) arg0);
        }
        if (var3.field10352) {
            return null;
        }
        byte[] var4 = var3.method16685();
        if (!(var3 instanceof Js5WorkerRequest)) {
            try {
                label161:
                {
                    if (var4 != null && var4.length > 2) {
                        field8878.reset();
                        field8878.update(var4, 0, var4.length - 2);
                        int var12 = (int) field8878.getValue();
                        if (this.field8862.field3548[arg0] != var12) {
                            throw new RuntimeException();
                        }
                        if (this.field8862.field3555 == null || this.field8862.field3555[arg0] == null) {
                            break label161;
                        }
                        byte[] var13 = this.field8862.field3555[arg0];
                        byte[] var14 = Whirlpool.method2920(var4, 0, var4.length - 2);
                        int var15 = 0;
                        while (true) {
                            if (var15 >= 64) {
                                break label161;
                            }
                            if (var13[var15] != var14[var15]) {
                                throw new RuntimeException();
                            }
                            var15++;
                        }
                    }
                    throw new RuntimeException();
                }
                this.field8853.errorCount = 0;
                this.field8853.js5State = 0;
            } catch (RuntimeException var19) {
                this.field8853.method5741();
                var3.unlink();
                if (var3.field10354 && !this.field8853.method5738()) {
                    Js5NetRequest var17 = this.field8853.method5765(this.field8860, arg0, (byte) 2, true);
                    this.field8868.put(var17, (long) arg0);
                }
                return null;
            }
            var4[var4.length - 2] = (byte) (this.field8862.field3545[arg0] >>> 8);
            var4[var4.length - 1] = (byte) this.field8862.field3545[arg0];
            if (this.field8855 != null) {
                this.field8876.method5720(arg0, var4, this.field8855);
                if (this.field8866[arg0] != 1) {
                    this.field8867++;
                    this.field8866[arg0] = 1;
                }
            }
            if (!var3.field10354) {
                var3.unlink();
            }
            return var3;
        }
        try {
            if (var4 == null || var4.length <= 2) {
                throw new RuntimeException();
            }
            field8878.reset();
            field8878.update(var4, 0, var4.length - 2);
            int var5 = (int) field8878.getValue();
            if (this.field8862.field3548[arg0] != var5) {
                throw new RuntimeException();
            }
            if (this.field8862.field3555 != null && this.field8862.field3555[arg0] != null) {
                byte[] var6 = this.field8862.field3555[arg0];
                byte[] var7 = Whirlpool.method2920(var4, 0, var4.length - 2);
                for (int var8 = 0; var8 < 64; var8++) {
                    if (var6[var8] != var7[var8]) {
                        throw new RuntimeException();
                    }
                }
            }
            int var9 = ((var4[var4.length - 2] & 0xFF) << 8) + (var4[var4.length - 1] & 0xFF);
            if ((this.field8862.field3545[arg0] & 0xFFFF) != var9) {
                throw new RuntimeException();
            }
            if (this.field8866[arg0] != 1) {
                if (this.field8866[arg0] == 0) {
                }
                this.field8867++;
                this.field8866[arg0] = 1;
            }
            if (!var3.field10354) {
                var3.unlink();
            }
            return var3;
        } catch (Exception var18) {
            this.field8866[arg0] = -1;
            var3.unlink();
            if (var3.field10354 && !this.field8853.method5738()) {
                Js5NetRequest var11 = this.field8853.method5765(this.field8860, arg0, (byte) 2, true);
                this.field8868.put(var11, (long) arg0);
            }
            return null;
        }
    }

    @ObfuscatedName("abt.w(S)V")
    public void method14238() {
        if (this.field8872 == null || this.method5604() == null) {
            return;
        }
        for (Node var1 = this.field8873.head(); var1 != null; var1 = this.field8873.next()) {
            int var2 = (int) var1.key;
            if (var2 < 0 || var2 >= this.field8862.field3553 || this.field8862.field3557[var2] == 0) {
                var1.unlink();
            } else {
                if (this.field8866[var2] == 0) {
                    this.method14237(var2, 1);
                }
                if (this.field8866[var2] == -1) {
                    this.method14237(var2, 2);
                }
                if (this.field8866[var2] == 1) {
                    var1.unlink();
                }
            }
        }
    }

    @ObfuscatedName("abt.b(I)V")
    public void method14239() {
        if (this.field8872 != null) {
            if (this.method5604() == null) {
                return;
            }
            if (this.field8870) {
                boolean var1 = true;
                for (Node var2 = this.field8872.head(); var2 != null; var2 = this.field8872.next()) {
                    int var3 = (int) var2.key;
                    if (this.field8866[var3] == 0) {
                        this.method14237(var3, 1);
                    }
                    if (this.field8866[var3] == 0) {
                        var1 = false;
                    } else {
                        var2.unlink();
                    }
                }
                while (this.field8871 < this.field8862.field3557.length) {
                    if (this.field8862.field3557[this.field8871] == 0) {
                        this.field8871++;
                    } else {
                        if (this.field8876.field3587 >= 250) {
                            var1 = false;
                            break;
                        }
                        if (this.field8866[this.field8871] == 0) {
                            this.method14237(this.field8871, 1);
                        }
                        if (this.field8866[this.field8871] == 0) {
                            Node var4 = new Node();
                            var4.key = this.field8871;
                            this.field8872.addTail(var4);
                            var1 = false;
                        }
                        this.field8871++;
                    }
                }
                if (var1) {
                    this.field8870 = false;
                    this.field8871 = 0;
                }
            } else if (this.field8857) {
                boolean var5 = true;
                for (Node var6 = this.field8872.head(); var6 != null; var6 = this.field8872.next()) {
                    int var7 = (int) var6.key;
                    if (this.field8866[var7] != 1) {
                        this.method14237(var7, 2);
                    }
                    if (this.field8866[var7] == 1) {
                        var6.unlink();
                    } else {
                        var5 = false;
                    }
                }
                while (this.field8871 < this.field8862.field3557.length) {
                    if (this.field8862.field3557[this.field8871] == 0) {
                        this.field8871++;
                    } else {
                        if (this.field8853.method5737()) {
                            var5 = false;
                            break;
                        }
                        if (this.field8866[this.field8871] != 1) {
                            this.method14237(this.field8871, 2);
                        }
                        if (this.field8866[this.field8871] != 1) {
                            Node var8 = new Node();
                            var8.key = this.field8871;
                            this.field8872.addTail(var8);
                            var5 = false;
                        }
                        this.field8871++;
                    }
                }
                if (var5) {
                    this.field8857 = false;
                    this.field8871 = 0;
                }
            } else {
                this.field8872 = null;
            }
        }
        if (!this.field8874 || MonotonicTime.get() < this.field8875) {
            return;
        }
        for (Js5Request var9 = (Js5Request) this.field8868.head(); var9 != null; var9 = (Js5Request) this.field8868.next()) {
            if (!var9.field10352) {
                if (var9.field10353) {
                    if (!var9.field10354) {
                        throw new RuntimeException();
                    }
                    var9.unlink();
                } else {
                    var9.field10353 = true;
                }
            }
        }
        this.field8875 = MonotonicTime.get() + 1000L;
    }

    @ObfuscatedName("abt.x(I)I")
    public int method14245() {
        return this.field8862 == null ? 0 : this.field8862.field3549;
    }

    @ObfuscatedName("abt.i(I)I")
    public int method14241() {
        return this.field8867;
    }

    @ObfuscatedName("abt.v(B)I")
    public int method14242() {
        if (this.field8862 == null) {
            return 0;
        } else if (this.field8870) {
            Node var1 = this.field8872.head();
            return var1 == null ? 0 : (int) var1.key;
        } else {
            return this.field8862.field3549;
        }
    }

    @ObfuscatedName("abt.k(I)V")
    public void method14250() {
        if (this.field8855 != null) {
            this.field8857 = true;
            if (this.field8872 == null) {
                this.field8872 = new LinkedList();
            }
        }
    }

    @ObfuscatedName("abt.a(II)V")
    public void method5606(int arg0) {
        if (this.field8855 == null) {
            return;
        }
        for (Node var2 = this.field8873.head(); var2 != null; var2 = this.field8873.next()) {
            if (var2.key == (long) arg0) {
                return;
            }
        }
        Node var3 = new Node();
        var3.key = arg0;
        this.field8873.addTail(var3);
    }

    @ObfuscatedName("abt.s(IB)I")
    public int method5607(int arg0) {
        Js5Request var2 = (Js5Request) this.field8868.get((long) arg0);
        return var2 == null ? 0 : var2.method16687();
    }
}
