package com.example.hng_Stage_0.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class HngController {

    @GetMapping("/info")
    public ResponseEntity<Map<String, String>> getInfo(){
        Map<String, String> response = new HashMap<>();
        response.put("Email: ", "aariyo111@gmail.com");
        response.put("TimeStamp: ", Instant.now().toString());
        response.put("Github URL: ", "");

        return ResponseEntity.ok(response);
    }
}
