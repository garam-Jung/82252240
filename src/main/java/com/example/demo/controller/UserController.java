package com.example.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@Slf4j

@RestController
@RequestMapping("/api/v1")
public class UserController {

    @GetMapping("/user")
    public ResponseEntity<String> getUser() {
        return ResponseEntity.ok("82252240");
    }
}
