package com.codegym.demo.service.impl;

import com.codegym.demo.model.Blog;
import com.codegym.demo.repository.BlogRepository;
import com.codegym.demo.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BlogServiceImpl implements BlogService {
    @Autowired
    private BlogRepository blogRepository;

    @Override
    public Page<Blog> findAll(Optional<String> keyword, Pageable pageable) {
        return this.blogRepository.findByNamePostContaining(keyword, pageable);
    }


    @Override
    public Blog findById(Integer id) {
        return this.blogRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Blog blog) {
        this.blogRepository.save(blog);

    }

    @Override
    public void edit(Blog blog) {
        this.blogRepository.save(blog);

    }

    @Override
    public void delete(Integer id) {
        this.blogRepository.deleteById(id);

    }
}
