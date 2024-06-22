package com.turkcell.searchservice.Services.Mapper;

import com.turkcell.searchservice.Entities.Customer;
import com.turkcell.searchservice.Services.Dto.Request.SearchCustomerRequest;
import com.turkcell.searchservice.Services.Dto.Response.SearchCustomerResponse;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public  interface SearchCustomerMapper {
    SearchCustomerMapper INSTANCE = Mappers.getMapper(SearchCustomerMapper.class);

    Customer customerFromSearchRequest(SearchCustomerRequest request);

    SearchCustomerResponse customerFromSearchResponse(Customer customer);
}
