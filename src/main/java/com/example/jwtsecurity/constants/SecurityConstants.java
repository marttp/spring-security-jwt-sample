package com.example.jwtsecurity.constants;

public final class SecurityConstants {

    public static final String AUTH_LOGIN_URL = "/api/auth";

    public static final String JWT_SECRET = "y$B&E)H@McQfTjWnZr4t7w!z%C*F-JaNdRgUkXp2s5v8x/A?D(G+KbPeShVmYq3t";

    // JWT token defaults
    public static final String TOKEN_HEADER = "Authorization";
    public static final String TOKEN_PREFIX = "Bearer ";
    public static final String TOKEN_TYPE = "JWT";
    public static final String TOKEN_ISSUER = "secure-api";
    public static final String TOKEN_AUDIENCE = "secure-app";
    public static final String TOKEN_BODY = "token";

    private SecurityConstants() {
        throw new IllegalStateException("Cannot create instance of static util class");
    }
}