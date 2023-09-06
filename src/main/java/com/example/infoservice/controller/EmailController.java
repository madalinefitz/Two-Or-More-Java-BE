package com.example.infoservice.controller;

import com.example.infoservice.entity.Email;
import com.example.infoservice.service.EmailService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmailController {

    private final EmailService emailService;

    public EmailController(EmailService emailService){
        this.emailService = emailService;
    }

    @GetMapping("/testemail")
    public String getHello(){
        return "howdy";
    }

    @GetMapping("/emails")
    public ResponseEntity<List<Email>> getAllEmails(){
        List<Email> allEmails = emailService.getAllEmails();
        return ResponseEntity.status(HttpStatus.OK).body(allEmails);
    }

    @PostMapping("/emails")
    public ResponseEntity<Email> createNewEmail(@RequestBody Email email){
        Email newEmail = emailService.createNewEmail(email.getEmail());
        return ResponseEntity.status(HttpStatus.CREATED).body(newEmail);
    }

}
