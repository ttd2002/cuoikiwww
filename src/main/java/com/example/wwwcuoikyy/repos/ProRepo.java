package com.example.wwwcuoikyy.repos;

import com.example.wwwcuoikyy.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProRepo extends JpaRepository<Product, Long> {
}
