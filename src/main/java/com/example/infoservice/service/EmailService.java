package com.example.infoservice.service;

import com.example.infoservice.entity.Email;
import com.example.infoservice.repository.EmailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmailService {

    private final EmailRepository emailRepository;

    @Autowired
    public EmailService( EmailRepository emailRepository) {
        this.emailRepository = emailRepository;
    }

    public Email createNewEmail(String email) {
        Email newEmail = new Email(email);
        return emailRepository.save(newEmail);
    }

    public List<Email> getAllEmails(){
       return emailRepository.findAll();
    }
}
