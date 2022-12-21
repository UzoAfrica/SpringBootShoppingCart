package com.exampleshoppingcart.shoppingcartapp.repositories;

import com.exampleshoppingcart.shoppingcartapp.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
