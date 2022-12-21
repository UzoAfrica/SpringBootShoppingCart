package com.exampleshoppingcart.shoppingcartapp.repositories;

import com.exampleshoppingcart.shoppingcartapp.entities.ShoppingCart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShoppingCartRepository extends JpaRepository <ShoppingCart, Integer>{

}
