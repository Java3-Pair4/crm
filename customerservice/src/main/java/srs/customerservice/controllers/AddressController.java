package srs.customerservice.controllers;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import srs.customerservice.Entities.Address;
import srs.customerservice.Services.Abstract.AddressService;
import srs.customerservice.Services.DTOs.Request.Address.AddAddressRequest;
import srs.customerservice.Services.DTOs.Request.Address.DeleteAddressRequest;

import java.util.List;

@RestController
@RequestMapping("/api/v1/Address")
public class AddressController {

   private final AddressService addressService;

    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }

    @PostMapping("/addAdres")
    public ResponseEntity<String> addAddress(@Valid @RequestBody AddAddressRequest request) {
        try {
            addressService.addAddress(request);
            return ResponseEntity.status(HttpStatus.CREATED).body("Adres başarıyla eklendi.");
        } catch (IllegalArgumentException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Adres eklenirken bir hata oluştu.");
        }
    }


    @PutMapping("/{id}")
    public void updateAddress(@PathVariable int id, @Valid @RequestBody DeleteAddressRequest request) {
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
