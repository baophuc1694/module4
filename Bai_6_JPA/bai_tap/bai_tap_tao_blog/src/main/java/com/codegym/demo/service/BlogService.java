package com.codegym.demo.service;

import com.codegym.demo.model.Blog;


import java.util.List;

public interface BlogService  {

    List<Blog> findAll();

    void save(Blog blog);

    Blog findById(Integer id);

    void update(Integer id, Blog blog);

    void remove(Integer id);
}
