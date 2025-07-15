package com.jagex.libs.jagtheora.theora;

import com.jagex.libs.jagtheora.misc.SimplePeer;
import com.jagex.libs.jagtheora.ogg.OggPacket;

public class SetupInfo extends SimplePeer {

    public native int decodeHeader(TheoraInfo arg0, TheoraComment arg1, OggPacket arg2);

    public native void clear();
}
