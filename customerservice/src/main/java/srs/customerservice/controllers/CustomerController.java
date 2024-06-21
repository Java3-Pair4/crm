package srs.customerservice.controllers;


import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import srs.customerservice.Entities.Customer;
import srs.customerservice.Services.Abstract.CustomerService;
import srs.customerservice.Services.DTOs.Request.AddCustomerRequest;
import srs.customerservice.Services.DTOs.Request.Customer.AddCustomerDemografikRequest;
import srs.customerservice.Services.DTOs.Request.Customer.UpdateCustomerRequest;
import srs.customerservice.Services.DTOs.Response.AddCustomerResponse;
import srs.customerservice.Services.DTOs.Response.getAddressResponse;
import srs.customerservice.Services.DTOs.Response.getContactResponse;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {
    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping("/addCustomer")
    public AddCustomerResponse add(@RequestBody @Valid AddCustomerRequest request)
    {
        return customerService.add(request);
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

    @PutMapping("/updateCustomer/{id}")
    public Customer updateCustomer(@PathVariable int id, @Valid @RequestBody UpdateCustomerRequest request) {
        return customerService.updateCustomer(id, request);
    }
/*
    @PostMapping("/updateCustomer")
    public ResponseEntity<?> updateCustomer(@Valid @RequestBody UpdateCustomerRequest request,@RequestBody int id) {

            customerService.updateCustomer(id, request);
            return ResponseEntity.ok("Customer bilgilerinin güncellemesi başarılı.");

    }
*/



    @PostMapping("/addCustomerDemografikRequest")
    public void addCustomerDemografik(@RequestBody @Valid AddCustomerDemografikRequest request)
    {
      customerService.demografikAdd(request);
    }




}
