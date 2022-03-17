package com.example.bffredirectiondemo.service;

import com.example.bffredirectiondemo.model.AuthBody;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Service
public class RedirectionServiceImpl implements RedirectionService {

    private final Logger logger = LoggerFactory.getLogger(RedirectionServiceImpl.class);

    @Override
    public ResponseEntity<String> redirectWithAuth(AuthBody authBody, HttpServletRequest request, HttpServletResponse response) {

        // TODO: Move to a config file
        String urlAndParam = "http://localhost:3000?authCode=";

        response.setHeader("Location", urlAndParam + authBody.getAuthCode());
        return new ResponseEntity<>(HttpStatus.FOUND);
    }
}
