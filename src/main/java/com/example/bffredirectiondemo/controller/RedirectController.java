package com.example.bffredirectiondemo.controller;

import com.example.bffredirectiondemo.model.AuthBody;
import com.example.bffredirectiondemo.service.RedirectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
public class RedirectController {

    private final RedirectionService redirectionService;

    @Autowired
    public RedirectController(RedirectionService redirectionService) {
        this.redirectionService = redirectionService;
    }

    @RequestMapping(value = "/redirect", method = RequestMethod.POST)
    public ResponseEntity<String> redirectToAngular(@RequestBody AuthBody authBody,
                                                    HttpServletRequest request,
                                                    HttpServletResponse response) {
        return redirectionService.redirectWithAuth(authBody, request, response);
    }
}
