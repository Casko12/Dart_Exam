package com.example.dart_exam.service;

import com.example.dart_exam.entity.Customer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public interface CustomerService {
    List<Customer> getAllCustomer();
    void createCustomer(Customer customer);


}
