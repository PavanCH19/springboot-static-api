package com.example.springbootstaticapi;

import java.util.List;

public class UserResponse {
    private String name;
    private String role;
    private String status;

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
