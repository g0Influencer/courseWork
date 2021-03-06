package com.example.cursach.Service;

import com.example.cursach.Models.Product;

import java.math.BigDecimal;
import java.util.Map;

public interface ShoppingCartService {

    void addProduct(Product product);

    void removeProduct(Product product);

    Map<Product, Integer> getProductsInCart();


    BigDecimal getTotal();
}