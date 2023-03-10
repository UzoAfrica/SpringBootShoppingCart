package com.exampleshoppingcart.shoppingcartapp.repositories;

import com.exampleshoppingcart.shoppingcartapp.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Integer> {
}
