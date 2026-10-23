package com.example.springbootstaticapi;

public class UserResponse {
    private final String name;
    private final String role;
    private final String status;

    public UserResponse(String name, String role, String status) {
        this.name = name;
        this.role = role;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public String getStatus() {
        return status;
    }
}
