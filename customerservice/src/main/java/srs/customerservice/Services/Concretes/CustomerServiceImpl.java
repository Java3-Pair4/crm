package srs.customerservice.Services.Concretes;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import srs.customerservice.Repositories.CustomerRepository;
import srs.customerservice.Services.DTOs.Request.AddCustomerRequest;
import srs.customerservice.Services.Abstract.CustomerService;
import srs.customerservice.Services.DTOs.Request.SearchCustomerRequest;
import srs.customerservice.Services.DTOs.Response.AddCustomerResponse;
import srs.customerservice.Services.DTOs.Response.SearchCustomerResponse;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository customerRepository;
    @Override
    public List<SearchCustomerResponse> search(SearchCustomerRequest request) {
        return List.of();
    }

    @Override
   public AddCustomerResponse add(AddCustomerRequest request) {
        return null;
    }


}
