package com.jagex.libs.jagtheora.vorbis;

import com.jagex.libs.jagtheora.misc.SimplePeer;

public class VorbisComment extends SimplePeer {

    public VorbisComment() {
        this.init();
        if (this.method52()) {
            throw new IllegalStateException();
        }
    }

    public native void init();

    public native void clear();
}
