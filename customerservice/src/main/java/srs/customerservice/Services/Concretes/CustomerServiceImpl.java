package srs.customerservice.Services.Concretes;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import srs.customerservice.Entities.Customer;
import srs.customerservice.Repositories.CustomerRepository;
import srs.customerservice.Services.DTOs.Request.AddCustomerRequest;
import srs.customerservice.Services.Abstract.CustomerService;

import srs.customerservice.Services.DTOs.Request.SearchCustomerRequest;
import srs.customerservice.Services.DTOs.Response.AddCustomerResponse;

import srs.customerservice.Services.DTOs.Response.SearchCustomerResponse;
import srs.customerservice.Services.Mappers.CustomerMapper;

import java.util.List;


@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository customerRepository;

    /*@Override
    public Customer getById(String id) {
        return customerRepository.findById(id).get();
    }*/

    @Override
    public List<SearchCustomerResponse> search(SearchCustomerRequest request) {

        int result = customerRepository.findByNationalityId(request.getNationalityId());
        //Customer customer = CustomerMapper.INSTANCE.customerFromSearchRequest(request);
        //customer = customerRepository.save(customer);
        return List.of(CustomerMapper.INSTANCE.customerSearchResponse(customer));
    }

    @Override
   public AddCustomerResponse add(AddCustomerRequest request) {

        Customer customer = CustomerMapper.INSTANCE.customerFromAddRequest(request);
        customer = customerRepository.save(customer);
        return CustomerMapper.INSTANCE.customerFromAddResponse(customer);
    }



}
