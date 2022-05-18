package com.example.cursach.Service.impl;

import com.example.cursach.Models.Product;
import com.example.cursach.Repositories.ProductRepository;
import com.example.cursach.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> findAllProducts() {
        return productRepository.findAll();
    }


    @Override
    public Optional<Product> findById(Long id) {
        return productRepository.findById(id);
    }
}