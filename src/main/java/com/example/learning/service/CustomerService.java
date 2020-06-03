package com.example.learning.service;

import com.example.learning.model.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerService {
     List<Customer> finalAll();
     void save(Customer customer);
     Optional<Customer> findById(Long id);
}
