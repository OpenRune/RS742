package com.jagex.protocol.revisions;

import java.util.Map;

public class RevisionManager {

    private static RevisionType currentRevision = RevisionType.REV_317;

    public static void setRevision(RevisionType revision) {
        currentRevision = revision;
    }

    public static RevisionType getRevision() {
        return currentRevision;
    }

    /**
     * Overrides the default login opcode based on the current revision's response mapping.
     *
     * Negative opcodes (e.g., -4) represent internal client responses and are returned as-is,
     * without remapping. This method remaps positive opcodes from the revision-specific codes
     * to the standardized LoginResponse742 enum codes.
     *
     * @param response The original login opcode received.
     * @return The remapped login response code, or the original opcode if no remapping is needed.
     */
    public static int overrideLoginOpcode(int response) {
        if (response < 0) {
            return response;
        }

        Map<Integer, LoginResponse742> mapping = currentRevision.getLoginHandler().getResponseMapping();

        if (mapping.isEmpty()) {
            return response;
        }

        LoginResponse742 loginResponse = mapping.get(response);

        if (loginResponse == null) {
            System.err.println("Warning: Missing mapping for login opcode " + response);
            return response;
        }

        return loginResponse.code;
    }
} 