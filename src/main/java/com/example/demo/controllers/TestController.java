package com.example.demo.controllers;

import com.example.demo.dto.Test;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @PostMapping("/test")
    public ResponseEntity<String> test(@Valid @RequestBody Test test) {
        return ResponseEntity.ok("Ok");
    }
}
