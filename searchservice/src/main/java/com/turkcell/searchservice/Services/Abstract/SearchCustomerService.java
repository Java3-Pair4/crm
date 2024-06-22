package com.turkcell.searchservice.Services.Abstract;


import com.turkcell.searchservice.Entities.Customer;
import com.turkcell.searchservice.Services.Dto.Response.SearchCustomerResponse;

import java.util.List;

public interface SearchCustomerService {
    void addCustomer(Customer customer);
    void updateCustomer(Customer customer);
    void deleteCustomer(Customer customer);

    Customer getById(String customerId);
    List<SearchCustomerResponse> getAll();
    List<SearchCustomerResponse> search(
            String customerId, String nationalityId, String accountNumber,
             String firstName, String lastName);
}
