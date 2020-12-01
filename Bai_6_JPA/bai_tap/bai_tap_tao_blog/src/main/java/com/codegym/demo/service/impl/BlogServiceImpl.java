package com.codegym.demo.service.impl;

import com.codegym.demo.model.Blog;
import com.codegym.demo.repository.BlogRepository;
import com.codegym.demo.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BlogServiceImpl implements BlogService {

    @Autowired
    private BlogRepository blogRepository;

    @Override
    public List<Blog> findAll() {
        return this.blogRepository.findAll();
    }

    @Override
    public void save(Blog blog) {

    }

    @Override
    public Blog findById(Integer id) {
        return null;
    }

    @Override
    public void update(Integer id, Blog blog) {

    }

    @Override
    public void remove(Integer id) {

    }
}
