package com.codegym.form_dang_ky.service;

import com.codegym.form_dang_ky.model.User;

import java.util.List;

public interface UserService {
    List<User> findAll();

    String save(User user);
}
