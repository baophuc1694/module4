package com.codegym.demo.model;

import javax.persistence.*;

@Entity (name = "blog")
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "blog_title")
    private String title;
    @Column(name = "blog_content")
    private String content;
    @Column(name = "name_post")
    private String namePost;
    @Column(name = "date_post")
    private String datePost;

    public Blog() {
    }

    public Blog(int id, String title, String content, String namePost, String datePost) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.namePost = namePost;
        this.datePost = datePost;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNamePost() {
        return namePost;
    }

    public void setNamePost(String namePost) {
        this.namePost = namePost;
    }

    public String getDatePost() {
        return datePost;
    }

    public void setDatePost(String datePost) {
        this.datePost = datePost;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
