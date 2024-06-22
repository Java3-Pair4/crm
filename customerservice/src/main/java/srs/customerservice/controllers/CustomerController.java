package srs.customerservice.controllers;


import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import srs.customerservice.Entities.Customer;
import srs.customerservice.Services.Abstract.CustomerService;
import srs.customerservice.Services.DTOs.Request.AddCustomerRequest;
import srs.customerservice.Services.DTOs.Request.Address.AddAddressRequest;
import srs.customerservice.Services.DTOs.Request.Address.DeleteAddressRequest;
import srs.customerservice.Services.DTOs.Request.Contact.AddContactRequest;
import srs.customerservice.Services.DTOs.Request.Customer.AddCustomerDemografikRequest;
import srs.customerservice.Services.DTOs.Request.Customer.UpdateCustomerRequest;
import srs.customerservice.Services.DTOs.Response.AddCustomerResponse;
import srs.customerservice.Services.DTOs.Response.getAddressResponse;
import srs.customerservice.Services.DTOs.Response.getContactResponse;

import java.util.List;

@RestController
@RequestMapping("/api/v1/customers")
public class CustomerController {
    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping("/addCustomer")
    public  ResponseEntity<String> add(@RequestBody @Valid AddCustomerRequest request)
    {
       // return customerService.add(request);

        try {
            customerService.add(request);
            return ResponseEntity.status(HttpStatus.CREATED).body("Müşteri bilgileri başarıyla eklendi.");
        } catch (IllegalArgumentException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Müşteri  bilgileri eklenirken bir hata oluştu.");
        }
    }



    //fr4 3.madde
    @GetMapping("/address{id}")
    public getAddressResponse getAddres(@PathVariable int id) {
        return customerService.getAddress(id);

    }
    //fr4 4.madde
   @GetMapping("/contact/{id}")
    public getContactResponse getContact(@PathVariable int id){

        return  customerService.getContact(id);
   }
/*
    @PutMapping("/updateCustomer/{id}")
    public Customer updateCustomer(@PathVariable int id, @Valid @RequestBody UpdateCustomerRequest request) {
        return customerService.updateCustomer(id, request);
    }

    */

    @PutMapping("/updateCustomer/{id}")
    public ResponseEntity<Customer> updateCustomer(@PathVariable int id, @Valid @RequestBody UpdateCustomerRequest request) {
        try {
            Customer updatedCustomer = customerService.updateCustomer(id, request);
            if (updatedCustomer != null) {
                return ResponseEntity.ok(updatedCustomer);
            } else {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
            }
        } catch (IllegalArgumentException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }



    @PostMapping("/addCustomerDemografikRequest")
    public ResponseEntity<String> addContact(@Valid @RequestBody AddCustomerDemografikRequest request){
        try {
            customerService.demografikAdd(request);
            return ResponseEntity.status(HttpStatus.CREATED).body("Müşteri demografik bilgileri başarıyla eklendi.");
        } catch (IllegalArgumentException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Müşteri demografik  bilgileri eklenirken bir hata oluştu.");
        }

    }


    @GetMapping("/search")
    public List<Customer> searchCustomers(@RequestParam String query) {
        return customerService.searchCustomers(query);
    }


    @PostMapping("/addAddress")
    public ResponseEntity<String> addAddress( @Valid @RequestBody AddAddressRequest request) {
        try {
            customerService.addAddress(request);
            return ResponseEntity.status(HttpStatus.CREATED).body("Müşteri demografik bilgileri başarıyla eklendi.");
        } catch (IllegalArgumentException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Müşteri demografik  bilgileri eklenirken bir hata oluştu.");
        }

    }


    @PutMapping("/customerUpdateAddress/{customerId}")
    public void customerUpdateAddress(@PathVariable int customerId, @RequestBody DeleteAddressRequest request){
        customerService.updateAddress(customerId, request);

    }


}
