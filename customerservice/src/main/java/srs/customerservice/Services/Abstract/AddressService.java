package srs.customerservice.Services.Abstract;

import srs.customerservice.Entities.Address;
import srs.customerservice.Services.DTOs.Request.Address.AddAddressRequest;
import srs.customerservice.Services.DTOs.Request.Address.DeleteAddressRequest;
import srs.customerservice.Services.DTOs.Response.getAddressResponse;

import java.util.List;

public interface AddressService {


    //adres güncelleme fr7 5.madde
    boolean updateAddress(int id, DeleteAddressRequest request);

    void addAddress(AddAddressRequest request);

    //  getAddressResponse getAddress(int id);
    List<Address> getAddressesByCustomerId(Long customerId);

    void deleteAddressById(Long addressId);



}