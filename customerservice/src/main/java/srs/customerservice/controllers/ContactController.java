package srs.customerservice.controllers;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import srs.customerservice.Entities.Contact;
import srs.customerservice.Entities.Customer;
import srs.customerservice.Services.Abstract.ContactService;
import srs.customerservice.Services.DTOs.Request.Contact.AddContactRequest;
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


    @GetMapping("/contact/{customerId}")
    public Optional<Contact> getContact(@PathVariable Long customerId){

        return contactService.getContact(customerId);
    }


    @PutMapping("/updateContact/{id}")
    public Optional<Contact> updateContact(@PathVariable int id, @Valid @RequestBody UpdateContactRequest request){

        return  contactService.updateContact(id, request);
    }



    @PostMapping("/addContact")
    public ResponseEntity<String> addContact(@Valid @RequestBody AddContactRequest request){
        try {
            contactService.addContact(request);
            return ResponseEntity.status(HttpStatus.CREATED).body("İletişim bilgileri başarıyla eklendi.");
        } catch (IllegalArgumentException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("İletişim bilgileri eklenirken bir hata oluştu.");
        }

    }



}
