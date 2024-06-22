package srs.customerservice.controllers;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;
import srs.customerservice.Entities.Address;
import srs.customerservice.Entities.Customer;
import srs.customerservice.Services.Abstract.AddressService;
import srs.customerservice.Services.DTOs.Request.Address.AddAddressRequest;
import srs.customerservice.Services.DTOs.Request.Address.UpdateAddressRequest;
import srs.customerservice.Services.DTOs.Request.Customer.UpdateCustomerRequest;
import srs.customerservice.Services.DTOs.Response.getAddressResponse;

import java.util.List;

@RestController
@RequestMapping("/api/v1/Address")
public class AddressController {

   private final AddressService addressService;

    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }

    @PostMapping
    public void addAddress(@RequestBody AddAddressRequest request){

        addressService.addAddress(request);
    }


    @PutMapping("/{id}")
    public void updateAddress(@PathVariable int id, @Valid @RequestBody UpdateAddressRequest request) {
        addressService.updateAddress(id,request);
    }

    @GetMapping("{id}")
    public List<Address> getAddress(@RequestParam Long customerId){
       return  addressService.getAddressesByCustomerId(customerId);

    }
    @DeleteMapping("/addresses/{addressId}")
    public void deleteAddress(@PathVariable Long addressId) {
        addressService.deleteAddressById(addressId);
    }

}
