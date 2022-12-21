package com.exampleshoppingcart.shoppingcartapp.services;

import com.exampleshoppingcart.shoppingcartapp.entities.Customer;
import com.exampleshoppingcart.shoppingcartapp.repositories.CustomerRepository;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    private CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }
    public Customer saveCustomer(Customer customer){
        return customerRepository.save(customer);
    }
    public Integer isCustomerPresent(Customer customer){
        Customer customer1 =
                customerRepository.getCustomerByEmailAndName(customer.getEmail(), customer.getName());
        return customer1!= null ? customer1.getId(): null;
    }
}
