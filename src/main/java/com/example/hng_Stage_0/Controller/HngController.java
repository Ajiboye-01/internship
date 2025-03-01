package com.example.hng_Stage_0.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("")
@CrossOrigin(origins = "*")
public class HngController {

    @GetMapping("")
    public ResponseEntity<Map<String, String>> getInfo(){
        Map<String, String> response = new HashMap<>();
        response.put("email", "aariyo111@gmail.com");
        response.put("current_datetime", DateTimeFormatter.ISO_INSTANT.format(Instant.now()));
        response.put("github_url", "https://github.com/Ajiboye-01/internship");


        return ResponseEntity.ok(response);
    }
}
