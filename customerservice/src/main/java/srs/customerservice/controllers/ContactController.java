package srs.customerservice.controllers;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;
import srs.customerservice.Entities.Contact;
import srs.customerservice.Entities.Customer;
import srs.customerservice.Services.Abstract.ContactService;
import srs.customerservice.Services.DTOs.Request.Contact.UpdateContactRequest;
import srs.customerservice.Services.DTOs.Request.Customer.UpdateCustomerRequest;

import java.util.Optional;

@RestController
@RequestMapping("/api/contact")
public class ContactController {

    private final ContactService contactService;

    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }


    @GetMapping("{customerId}")
    public Optional<Contact> getContact(@PathVariable Long customerId){

        return contactService.getContact(customerId);
    }
/*
    @GetMapping("/contact/{customerId}")
    public getContactResponse getContact(@PathVariable int customerId){

        return  null;
    }


*/

    @PutMapping("/updateContact/{id}")
    public Optional<Contact> updateContact(@PathVariable int id, @Valid @RequestBody UpdateContactRequest request){

        return  contactService.updateContact(id, request);
    }




}
