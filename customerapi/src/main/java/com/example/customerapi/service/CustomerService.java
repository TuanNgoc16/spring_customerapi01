package com.example.customerapi.service;

import com.example.customerapi.entity.Customer;

import java.util.List;
public interface CustomerService {
    List<Customer> findAll();
    public List<Customer> getCustomers();

    public void saveCustomer(Customer theCustomer);

    public Customer getCustomer(int theId);

    public void deleteCustomer(int theId);

}
