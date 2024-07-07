package com.docgen.documentapi.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api")
public class DocumentController {

    @GetMapping("/hello")
    public ResponseEntity<String> submitDocument() {
        // Log the received data (you would typically save this data to a database)
        System.out.println("Hello Wordl");
        
        // Respond back to the client
        return ResponseEntity.ok("Document submitted successfully!");
    }
}