package com.codegym.service;

import com.codegym.model.Email;

public interface EmailService {
    Email create();

    Email update(Email email);
}
