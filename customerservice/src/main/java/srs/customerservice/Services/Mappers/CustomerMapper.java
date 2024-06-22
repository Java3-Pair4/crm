package srs.customerservice.Services.Mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import srs.customerservice.Services.DTOs.Request.AddCustomerRequest;
import srs.customerservice.Entities.Customer;
import srs.customerservice.Services.DTOs.Response.AddCustomerResponse;
import srs.customerservice.Services.DTOs.Response.getAddressResponse;
import srs.customerservice.Services.DTOs.Response.getContactResponse;

import java.util.Optional;

@Mapper
public interface CustomerMapper {


    CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);

    Customer customerFromAddRequest(AddCustomerRequest request);
    AddCustomerResponse customerFromAddResponse(Customer customer);
    getAddressResponse getAddressFromCustomer(Optional<Customer> customer);
    getContactResponse getContactFromCustomer(Optional<Customer> customer);

    //Customer getAddressFromCustomer(Optional<Customer> customer);
    //Customer customerFromSearchRequest(SearchCustomerRequest request);
    //SearchCustomerResponse customerSearchResponse(Customer customer);
}
