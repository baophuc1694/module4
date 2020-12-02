package com.codegym.form_dang_ky.repository;

import com.codegym.form_dang_ky.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
