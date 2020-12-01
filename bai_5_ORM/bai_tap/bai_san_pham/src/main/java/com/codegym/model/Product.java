package com.codegym.model;

import javax.persistence.*;

@Entity (name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "product_name")
    private String name;
    @Column(name = "product_price")
    private String price;
    @Column(name = "product_producer")
    private String producer;

    public Product() {
    }

    public Product(Integer id, String name, String price, String producer) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.producer = producer;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }
}
