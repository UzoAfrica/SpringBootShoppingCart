package com.exampleshoppingcart.shoppingcartapp.repositories;

import com.exampleshoppingcart.shoppingcartapp.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    public Customer getCustomerByEmailAndName(String email, String name);
}
