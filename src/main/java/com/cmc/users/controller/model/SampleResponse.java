package com.cmc.users.controller.model;

public class SampleResponse {

    private String status;

    private String message;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public SampleResponse(String status, String message) {
        this.status = status;
        this.message = message;
    }
}
