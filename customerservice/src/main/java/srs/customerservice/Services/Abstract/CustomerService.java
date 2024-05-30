package srs.customerservice.Services.Abstract;

import org.springframework.stereotype.Service;
import srs.customerservice.Services.DTOs.Request.AddCustomerRequest;

@Service
public interface CustomerService {


    void add(AddCustomerRequest request);
}
