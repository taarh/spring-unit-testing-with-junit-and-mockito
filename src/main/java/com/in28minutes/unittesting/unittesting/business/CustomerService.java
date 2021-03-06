package com.in28minutes.unittesting.unittesting.business;

import com.in28minutes.unittesting.unittesting.data.CustomerRepository;
import com.in28minutes.unittesting.unittesting.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;



@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer> retrieveCustomer(){

        return customerRepository.findAll();
    }
    public Customer retrieveCustomer(int id){
        return customerRepository.findById(id).get();
    }


}
