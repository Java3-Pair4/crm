package srs.customerservice.Services.Mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import srs.customerservice.Services.DTOs.Request.AddCustomerRequest;
import srs.customerservice.Entities.Customer;
import srs.customerservice.Services.DTOs.Request.SearchCustomerRequest;
import srs.customerservice.Services.DTOs.Response.AddCustomerResponse;
import srs.customerservice.Services.DTOs.Response.SearchCustomerResponse;

@Mapper
public interface CustomerMapper {


    CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);

    Customer customerFromAddRequest(AddCustomerRequest request);
    AddCustomerResponse customerFromAddResponse(Customer customer);

    //Customer customerFromSearchRequest(SearchCustomerRequest request);
    //SearchCustomerResponse customerSearchResponse(Customer customer);
}
