package com.dictionaryapp.model.entity.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class UserRegisterDTO {

    @Size(min = 3, max = 20,message = "Username length must be between 3 and 20 characters!")
    private String username;


    @Email(message = "Enter valid email!")
    @NotBlank(message = "Email cannot be empty!")
    private String email;


    @Size(min = 3, max = 20,message = "Password length must be between 3 and 20 characters!")
    private String password;

    private String confirmPassword;

    public UserRegisterDTO() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }
}