package com.example.wwwcuoikyy.services;

import com.example.wwwcuoikyy.models.Product;
import com.example.wwwcuoikyy.repos.ProRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProServiceImp implements ProService{
    @Autowired
    private ProRepo proRepo;

    @Override
    public void addPro(Product product) {
        proRepo.save(product);
    }

    @Override
    public void delete(long id) {
        this.proRepo.deleteById(id);
    }

    @Override
    public Product getById(long id) {
        return proRepo.findById(id).get();
    }

    @Override
    public List<Product> getAll() {
        return proRepo.findAll();
    }
}
