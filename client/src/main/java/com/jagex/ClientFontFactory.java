package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("c")
public final class ClientFontFactory implements FontFactory {

    @ObfuscatedName("c.u([BLvm;ZI)Ljava/lang/Object;")
    public Object method1321(byte[] arg0, FontMetrics arg1, boolean arg2) {
        return client.toolkit.createFont(arg1, (PalettedSpriteData[]) SpriteDataProvider.method2594(arg0), arg2);
    }
}
