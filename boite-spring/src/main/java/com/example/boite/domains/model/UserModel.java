package com.example.boite.domains.model;

import javax.validation.constraints.NotEmpty;

// FIXME: use lombok
public class UserModel {

    @NotEmpty(message = "Type your UserID here ;(")
    private String userId;

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
