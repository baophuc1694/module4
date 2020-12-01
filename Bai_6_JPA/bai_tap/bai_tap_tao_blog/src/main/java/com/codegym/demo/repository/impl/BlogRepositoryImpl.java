package com.codegym.demo.repository.impl;

import com.codegym.demo.model.Blog;
import com.codegym.demo.repository.BlogRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;
@Repository
public class BlogRepositoryImpl implements BlogRepository {

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Blog> findAll() {
        TypedQuery<Blog> typedQuery = em.createQuery("select p from blog p", Blog.class);
        return typedQuery.getResultList();
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
