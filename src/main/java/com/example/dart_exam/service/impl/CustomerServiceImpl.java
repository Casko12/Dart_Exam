package com.example.dart_exam.service.impl;

import com.example.dart_exam.entity.Customer;
import com.example.dart_exam.repository.CustomerRepository;
import com.example.dart_exam.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepository customerRepository;
    @Override
    public List<Customer> getAllCustomer() {
        return customerRepository.findAll();
    }
    @Override
    public void createCustomer(Customer customer) {
        customerRepository.save(customer);
    }
}
