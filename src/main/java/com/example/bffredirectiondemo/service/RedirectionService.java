package com.example.bffredirectiondemo.service;

import com.example.bffredirectiondemo.model.AuthBody;
import org.springframework.http.ResponseEntity;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface RedirectionService {
    ResponseEntity<String> redirectWithAuth(AuthBody authBody, HttpServletRequest request, HttpServletResponse response);
}
