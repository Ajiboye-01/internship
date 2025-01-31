package com.example.hng_Stage_0.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class HngController {

    @GetMapping("/info")
    public ResponseEntity<Map<String, String>> getInfo(){
        Map<String, String> response = new HashMap<>();
        response.put("email", "aariyo111@gmail.com");
        response.put("github_url", "https://github.com/Ajiboye-01/internship.git");
        response.put("current_datetime", Instant.now().toString());

        return ResponseEntity.ok(response);
    }
}
