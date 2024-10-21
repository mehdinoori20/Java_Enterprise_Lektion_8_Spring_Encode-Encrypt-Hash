package com.mehdi.Enterprise_Lektion_56_Spring_Security_Intro.authority;

public enum UserPermission {

    GET("GET"),
    POST("POST"),
    PUT("PUT"),
    DELETE("DELETE");

    private final String permission;

    UserPermission(String permission) {
        this.permission = permission;
    }

    public String getPermission() {
        return permission;
    }
}
