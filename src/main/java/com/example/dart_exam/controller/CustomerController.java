package com.example.dart_exam.controller;

import com.example.dart_exam.entity.Customer;
import com.example.dart_exam.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController {
@Autowired
    private CustomerService customerService;
@GetMapping
    public String getAllCustomer(Model model) {
    List<Customer> customers =customerService.getAllCustomer();
    model.addAttribute("customers", customers);
    return "customers";
}
@PostMapping ("/create")
    public String createCustomer(@RequestBody Customer customer) {
    try{
    customerService.createCustomer(customer);
        return "create success";
    } catch (Exception ex){
        return ex.getMessage();
    }
}
}
