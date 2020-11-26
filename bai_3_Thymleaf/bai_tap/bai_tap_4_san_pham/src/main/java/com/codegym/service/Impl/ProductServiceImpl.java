package com.codegym.service.Impl;

import com.codegym.model.Product;
import com.codegym.service.ProductService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService {
    private static Map<Integer, Product> products;
    static {
        products = new HashMap<>();
        products.put(1, new Product(1, "iPhone12", "5000", "Apple"));
        products.put(2, new Product(2, "SamSungNote10", "3400", "SamSung"));
        products.put(3, new Product(3, "DELL Core i11", "2000", "DELL"));
        products.put(4, new Product(4, "Exciter 2010", "10000", "YaMaHa"));
        products.put(5, new Product(5, "Tủ Lạnh ToShiBa", "6000", "ToShiBa"));
        products.put(6, new Product(6, "Đồng Hồ Orient 24k mạ vàng", "12000", "Orient"));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(), product);

    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id, product);

    }

    @Override
    public void remove(int id) {
        products.remove(id);

    }
}
