package com.jagex.libs.jagtheora.vorbis;

import com.jagex.libs.jagtheora.misc.SimplePeer;
import com.jagex.libs.jagtheora.ogg.OggPacket;

public class VorbisInfo extends SimplePeer {

    public int channels;

    public int rate;

    static {
        initFields();
    }

    public VorbisInfo() {
        this.init();
        if (this.method52()) {
            throw new IllegalStateException();
        }
    }

    public static native void initFields();

    public native void init();

    public native int headerIn(VorbisComment arg0, OggPacket arg1);

    public native void clear();
}
