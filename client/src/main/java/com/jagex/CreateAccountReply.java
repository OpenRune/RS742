package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("tk")
public class CreateAccountReply implements SerializableEnum {

    @ObfuscatedName("tk.u")
    public static final CreateAccountReply NONE = new CreateAccountReply(-2);

    @ObfuscatedName("tk.j")
    public static final CreateAccountReply field6437 = new CreateAccountReply(-3);

    @ObfuscatedName("tk.a")
    public static final CreateAccountReply field6438 = new CreateAccountReply(2);

    @ObfuscatedName("tk.s")
    public static final CreateAccountReply field6444 = new CreateAccountReply(3);

    @ObfuscatedName("tk.c")
    public static final CreateAccountReply field6440 = new CreateAccountReply(9);

    @ObfuscatedName("tk.m")
    public static final CreateAccountReply field6441 = new CreateAccountReply(10);

    @ObfuscatedName("tk.t")
    public static final CreateAccountReply field6442 = new CreateAccountReply(20);

    @ObfuscatedName("tk.l")
    public static final CreateAccountReply field6443 = new CreateAccountReply(21);

    @ObfuscatedName("tk.f")
    public static final CreateAccountReply field6439 = new CreateAccountReply(30);

    @ObfuscatedName("tk.d")
    public static final CreateAccountReply field6445 = new CreateAccountReply(31);

    @ObfuscatedName("tk.z")
    public static final CreateAccountReply field6436 = new CreateAccountReply(32);

    @ObfuscatedName("tk.n")
    public static final CreateAccountReply field6446 = new CreateAccountReply(33);

    @ObfuscatedName("tk.o")
    public static final CreateAccountReply field6448 = new CreateAccountReply(34);

    @ObfuscatedName("tk.q")
    public static final CreateAccountReply field6447 = new CreateAccountReply(38);

    @ObfuscatedName("tk.p")
    public final int field6450;

    public CreateAccountReply(int arg0) {
        this.field6450 = arg0;
    }

    @ObfuscatedName("dp.u(I)[Ltk;")
    public static CreateAccountReply[] method2615() {
        return new CreateAccountReply[]{field6439, field6446, field6448, field6440, field6436, field6443, field6437, field6442, field6438, field6445, field6447, NONE, field6444, field6441};
    }

    @ObfuscatedName("tk.j(B)I")
    public int getId() {
        return this.field6450;
    }
}
