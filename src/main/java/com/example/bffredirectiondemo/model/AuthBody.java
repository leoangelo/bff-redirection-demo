package com.example.bffredirectiondemo.model;

public class AuthBody {

    String authCode;

    public String getAuthCode() {
        return authCode;
    }

    @Override
    public String toString() {
        return "AuthBody{" +
                "authCode='" + authCode + '\'' +
                '}';
    }
}
