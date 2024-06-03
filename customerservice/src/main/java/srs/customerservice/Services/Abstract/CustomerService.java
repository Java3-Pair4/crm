package srs.customerservice.Services.Abstract;


import srs.customerservice.Entities.Customer;
import srs.customerservice.Services.DTOs.Request.AddCustomerRequest;
import srs.customerservice.Services.DTOs.Request.SearchCustomerRequest;
import srs.customerservice.Services.DTOs.Response.AddCustomerResponse;
import srs.customerservice.Services.DTOs.Response.SearchCustomerResponse;

import java.util.List;


public interface CustomerService {
    List<SearchCustomerResponse> search(SearchCustomerRequest request);
    AddCustomerResponse add(AddCustomerRequest request);

    //Customer getById(String id);
    //void add(AddCustomerRequest request);
}
