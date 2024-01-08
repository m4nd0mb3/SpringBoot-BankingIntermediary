/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/RestController.java to edit this template
 */
package com.ucan.banking_intermediary.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author jonathanm
 */
@RestController
@RequestMapping("/api/test")
public class Test {
    
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/hello")
    public String sayHello() {
        // Chama a API Node.js usando RestTemplate
        String nodeResponse = restTemplate.getForObject("http://localhost:3000/api/node/hello", String.class);

        return "Hello from Spring Boot! Node.js says: " + nodeResponse;
    }
}
