package com.example.hpsus.mvplogin.Model;

import android.text.TextUtils;
import android.util.Patterns;

import java.util.regex.Pattern;

public class User implements IUser{

    private String email,password;

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public boolean isValidData() {
        return !TextUtils.isEmpty(getEmail())&&
                !TextUtils.isEmpty(getPassword())&&
                Patterns.EMAIL_ADDRESS.matcher(getEmail()).matches()&&
                getPassword().length()>6;
    }
}
