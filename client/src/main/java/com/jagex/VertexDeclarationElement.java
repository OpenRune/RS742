package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("hu")
public class VertexDeclarationElement {

    @ObfuscatedName("hu.u")
    public int field2520;

    @ObfuscatedName("hu.j")
    public long field2519;

    public VertexDeclarationElement(VertexDeclarationElementComponent arg0) {
        this.field2519 = arg0.field2494;
        this.field2520 = 1;
    }

    public VertexDeclarationElement(VertexDeclarationElementComponent[] arg0) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.method4486(arg0[var2]);
        }
    }

    @ObfuscatedName("hu.u()I")
    public final int method4484() {
        return this.field2520;
    }

    @ObfuscatedName("hu.j(I)Lha;")
    public final VertexDeclarationElementComponent method4482(int arg0) {
        return VertexDeclarationElementComponent.method4406(this.method4485(arg0));
    }

    @ObfuscatedName("hu.a(I)I")
    public final int method4485(int arg0) {
        return (int) (this.field2519 >> VertexDeclarationElementComponent.field2496 * arg0) & 0xF;
    }

    @ObfuscatedName("hu.s(Lha;)V")
    public final void method4486(VertexDeclarationElementComponent arg0) {
        this.field2519 |= arg0.field2494 << VertexDeclarationElementComponent.field2496 * this.field2520++;
    }
}
