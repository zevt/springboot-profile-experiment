package com.example.controller;


import com.example.profileExp.ExpProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MultipleProfilesController {

    @Autowired
    private ExpProfile expProfile;

    @GetMapping("/message")
    public ResponseEntity<?> getMessage() {
        return new ResponseEntity<>(expProfile.getMessage(), HttpStatus.OK);
    }
}
