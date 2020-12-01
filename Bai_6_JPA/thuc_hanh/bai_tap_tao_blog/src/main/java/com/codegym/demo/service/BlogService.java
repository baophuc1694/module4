package com.codegym.demo.service;

import com.codegym.demo.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface BlogService {
    Page<Blog> findAll(Optional<String> keyword, Pageable pageable);

    Blog findById(Integer id);

    void save(Blog blog);

    void edit(Blog blog);

    void delete(Integer id);
}
