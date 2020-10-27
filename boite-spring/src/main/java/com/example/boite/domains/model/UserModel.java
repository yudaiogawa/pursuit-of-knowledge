package com.example.boite.domains.model;

import javax.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class UserModel {

    @NotEmpty(message = "Type your UserID here ;(")
    private String userId;
}
