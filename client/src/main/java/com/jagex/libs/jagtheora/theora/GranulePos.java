package com.jagex.libs.jagtheora.theora;

import com.jagex.libs.jagtheora.misc.SimplePeer;

public class GranulePos extends SimplePeer {

    static {
        init();
    }

    public static native void init();

    public native void clear();
}
