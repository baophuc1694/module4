package com.codegym.form_dang_ky.service.impl;

import com.codegym.form_dang_ky.model.User;
import com.codegym.form_dang_ky.repository.UserRepository;
import com.codegym.form_dang_ky.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    public UserRepository userRepository;

    @Override
    public List<User> findAll() {
        return this.userRepository.findAll();
    }

    @Override
    public String save(User user) {
        List<User> userList = findAll();
        boolean check = true;
        String warning = null;
        for (User userExist : userList) {
            if (user.getEmail().equals(userExist.getEmail())) {
                check = false;
                warning = "Email is Exist ! Please sign up email other !";
                break;
            }
        }
        if (check) {
            this.userRepository.save(user);
            warning = "Sign up complete !";
        }
        return warning;
    }
}
