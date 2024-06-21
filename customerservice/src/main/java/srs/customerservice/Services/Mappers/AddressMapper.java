package srs.customerservice.Services.Mappers;

import org.mapstruct.factory.Mappers;
import srs.customerservice.Entities.Address;
import srs.customerservice.Entities.Customer;
import srs.customerservice.Services.DTOs.Request.AddCustomerRequest;
import srs.customerservice.Services.DTOs.Request.Address.AddAddressRequest;
import srs.customerservice.Services.DTOs.Response.getAddressResponse;

public interface AddressMapper {
    AddressMapper INSTANCE = Mappers.getMapper(AddressMapper.class);


    Address addressFromAddRequest(AddAddressRequest request);

    getAddressResponse getAddressFromAddress(Address adres);
}
