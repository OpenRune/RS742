package com.jagex.protocol.revisions;

import com.jagex.protocol.revisions.handlers.LoginHandler;
import com.jagex.protocol.revisions.impl.r742.R742LoginHandler;

public enum RevisionType {
    REV_742(new R742LoginHandler());

    private final LoginHandler loginHandler;

    RevisionType(LoginHandler loginHandler) {
        this.loginHandler = loginHandler;
    }

    public LoginHandler getLoginHandler() {
        return loginHandler;
    }

    private static RevisionType current;

    public static void setCurrent(RevisionType rev) {
        current = rev;
    }

    public static RevisionType getCurrent() {
        return current;
    }
} 