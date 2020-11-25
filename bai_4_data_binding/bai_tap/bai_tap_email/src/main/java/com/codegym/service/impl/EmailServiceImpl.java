package com.codegym.service.impl;

import com.codegym.model.Email;
import org.springframework.stereotype.Service;
import com.codegym.service.EmailService;
@Service
public class EmailServiceImpl implements EmailService {
    @Override
    public Email create() {
        return new Email("Vietnamese", "25", true, "SS");
    }

    @Override
    public Email update(Email email) {
        Email emailResult = new Email();

        emailResult.setLanguage(email.getLanguage());
        emailResult.setPageSize(email.getPageSize());
        emailResult.setSpamsFilter(email.isSpamsFilter());
        emailResult.setSignature(email.getSignature());

        return emailResult;
    }
}
