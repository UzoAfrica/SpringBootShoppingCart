package com.exampleshoppingcart.shoppingcartapp.services;

import com.exampleshoppingcart.shoppingcartapp.entities.Product;
import com.exampleshoppingcart.shoppingcartapp.repositories.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAllProducts() {
        return this.productRepository.findAll();
    }
}
