package com.example.cursach.Service;


import com.example.cursach.Models.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    Optional<Product> findById(Long id);

    List<Product> findAllProducts();


}