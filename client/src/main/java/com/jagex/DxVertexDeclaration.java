package com.jagex;

import deob.ObfuscatedName;
import com.jagex.libs.jagdx.IDirect3DDevice;
import com.jagex.libs.jagdx.IUnknown;

import java.nio.ByteBuffer;

@ObfuscatedName("abj")
public class DxVertexDeclaration extends VertexDeclaration {

    @ObfuscatedName("abj.j")
    public DxToolkit field8787;

    @ObfuscatedName("abj.a")
    public long field8786 = 0L;

    public DxVertexDeclaration(DxToolkit arg0, VertexDeclarationElement[] arg1) {
        super(arg1);
        this.field8787 = arg0;
        byte var3 = 0;
        ByteBuffer var4 = this.field8787.field8244;
        var4.clear();
        for (short var5 = 0; var5 < this.field2422.length; var5++) {
            short var6 = 0;
            VertexDeclarationElement var7 = this.field2422[var5];
            for (int var8 = 0; var8 < var7.method4484(); var8++) {
                VertexDeclarationElementComponent var9 = var7.method4482(var8);
                if (VertexDeclarationElementComponent.field2495 == var9) {
                    this.method14172(var4, var5, var6, (byte) 2, (byte) 0, (byte) 0, (byte) 0);
                } else if (VertexDeclarationElementComponent.field2480 == var9) {
                    this.method14172(var4, var5, var6, (byte) 2, (byte) 0, (byte) 3, (byte) 0);
                } else if (VertexDeclarationElementComponent.field2488 == var9) {
                    this.method14172(var4, var5, var6, (byte) 4, (byte) 0, (byte) 10, (byte) 0);
                } else if (VertexDeclarationElementComponent.field2482 == var9) {
                    this.method14172(var4, var5, var6, (byte) 0, (byte) 0, (byte) 5, var3++);
                } else if (VertexDeclarationElementComponent.field2483 == var9) {
                    this.method14172(var4, var5, var6, (byte) 1, (byte) 0, (byte) 5, var3++);
                } else if (VertexDeclarationElementComponent.field2484 == var9) {
                    this.method14172(var4, var5, var6, (byte) 2, (byte) 0, (byte) 5, var3++);
                } else if (VertexDeclarationElementComponent.field2485 == var9) {
                    this.method14172(var4, var5, var6, (byte) 3, (byte) 0, (byte) 5, var3++);
                }
                var6 = (short) (var9.field2486 + var6);
            }
        }
        this.method14172(var4, (short) 255, (short) 0, (byte) 17, (byte) 0, (byte) 0, (byte) 0);
        this.field8786 = IDirect3DDevice.CreateVertexDeclaration(this.field8787.field9975, this.field8787.field8245);
        this.field8787.method13586(this);
    }

    @ObfuscatedName("abj.u(Ljava/nio/ByteBuffer;SSBBBB)V")
    public void method14172(ByteBuffer arg0, short arg1, short arg2, byte arg3, byte arg4, byte arg5, byte arg6) {
        arg0.putShort(arg1);
        arg0.putShort(arg2);
        arg0.put(arg3);
        arg0.put(arg4);
        arg0.put(arg5);
        arg0.put(arg6);
    }

    @ObfuscatedName("abj.s()V")
    public void method168() {
        if (this.field8786 != 0L) {
            IUnknown.Release(this.field8786);
            this.field8786 = 0L;
        }
        this.field8787.method13485(this);
    }

    @ObfuscatedName("abj.j()V")
    public void method14170() {
        if (this.field8786 != 0L) {
            this.field8787.method16038(this.field8786);
            this.field8786 = 0L;
        }
    }

    public void finalize() {
        this.method14170();
    }
}
