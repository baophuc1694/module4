package com.codegym.demo.repository;

import com.codegym.demo.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface BlogRepository  extends JpaRepository<Blog, Integer> {
    Page<Blog> findByNamePostContaining(Optional<String> keyword, Pageable pageable);

}
