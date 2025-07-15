package com.jagex.protocol.revisions.handlers;

import java.util.Map;
import com.jagex.protocol.revisions.LoginResponse742;

public interface LoginHandler {
    void decodeLogin();
    Map<Integer, LoginResponse742> getResponseMapping();
} 