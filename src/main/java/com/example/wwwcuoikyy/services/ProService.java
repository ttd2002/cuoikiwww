package com.example.wwwcuoikyy.services;

import com.example.wwwcuoikyy.models.Product;

import java.util.List;

public interface ProService {
    public void addPro(Product product);
    public void delete(long id);
    public Product getById(long id);
    public List<Product> getAll();


}
