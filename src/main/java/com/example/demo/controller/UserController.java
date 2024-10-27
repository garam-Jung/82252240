package com.example.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RequestMapping("/api/vi")
@RestController
public class UserController {

    /**
     * 사번 리턴
     *
     * @param id
     * @return
     */
    @GetMapping("/user")
    public ResponseEntity<String> getUserId() {
    	String UserId = "82252240";
    	return ResponseEntity.ok(UserId);
    	
    }

}
