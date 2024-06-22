package srs.customerservice.Services.Abstract;

import srs.customerservice.Entities.Address;
import srs.customerservice.Entities.Customer;
import srs.customerservice.Repositories.CustomerRepository;
import srs.customerservice.Services.DTOs.Request.Address.AddAddressRequest;
import srs.customerservice.Services.DTOs.Request.Address.UpdateAddressRequest;
import srs.customerservice.Services.DTOs.Request.Customer.UpdateCustomerRequest;
import srs.customerservice.Services.DTOs.Response.getAddressResponse;

import java.util.List;

public interface AddressService {




    //adres güncelleme fr7 5.madde
    void updateAddress(int id, UpdateAddressRequest request);
    void addAddress(AddAddressRequest request);
 //  getAddressResponse getAddress(int id);
    List<Address> getAddressesByCustomerId(Long customerId);
    void deleteAddressById(Long addressId);
}

