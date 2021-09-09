package com.cmc.users.controller.model;

public class SigninResponse {

    private String username;

    private String status;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public SigninResponse(String username, String status) {
        this.username = username;
        this.status = status;
    }
}
