package com.jagex.protocol.revisions;

import java.util.Map;

public class RevisionManager {

    private static RevisionType currentRevision = RevisionType.REV_742;

    public static void setRevision(RevisionType revision) {
        currentRevision = revision;
    }

    public static RevisionType getRevision() {
        return currentRevision;
    }

    public static int overrideLoginOpcode(int defaultOpcode) {
        Map<Integer,LoginResponse742> mapping = currentRevision.getLoginHandler().getResponseMapping();

        if (mapping.isEmpty()) {
            return defaultOpcode;
        }

        if (!mapping.containsKey(defaultOpcode)) {
            System.err.println("Warning: Missing mapping for login opcode " + defaultOpcode);
            return defaultOpcode;
        }

        return mapping.get(defaultOpcode).ordinal();
    }
} 