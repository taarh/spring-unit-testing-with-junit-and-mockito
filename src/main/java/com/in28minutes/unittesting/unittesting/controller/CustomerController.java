package com.in28minutes.unittesting.unittesting.controller;

import com.in28minutes.unittesting.unittesting.business.CustomerService;
import com.in28minutes.unittesting.unittesting.model.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class CustomerController {

    private CustomerService customerService;

    @GetMapping("/getCustomers")
    public List<Customer> retrieveCustomer(){
        return customerService.retrieveCustomer();
    }

    @GetMapping("/customer/{id}")
    public Optional<Customer> retrieveCustomer(@PathVariable("id") int id){
        return customerService.retrieveCustomer(id);
    }
}
