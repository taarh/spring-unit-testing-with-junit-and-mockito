package com.in28minutes.unittesting.unittesting.data;

import com.in28minutes.unittesting.unittesting.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}
