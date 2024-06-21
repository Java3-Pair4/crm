package srs.customerservice.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import srs.customerservice.Entities.Contact;
import srs.customerservice.Services.Abstract.ContactService;
import srs.customerservice.Services.DTOs.Response.getContactResponse;

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



}
