package com.expo.customerservice.service;

import com.expo.customerservice.dto.CustomerDto;
import com.expo.customerservice.dto.CustomerToSaveDto;

import java.util.List;
import java.util.UUID;

public interface CustomerService {
    CustomerDto createCustomer(CustomerToSaveDto customerToSaveDTO);
    void deleteCustomer(UUID id);
    CustomerDto findCustomer(UUID id);
    List<CustomerDto> findAllCustomers();
}
