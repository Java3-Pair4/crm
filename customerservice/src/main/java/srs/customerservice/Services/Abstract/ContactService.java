package srs.customerservice.Services.Abstract;

import srs.customerservice.Entities.Contact;
import srs.customerservice.Services.DTOs.Request.Address.UpdateAddressRequest;
import srs.customerservice.Services.DTOs.Request.Contact.UpdateContactRequest;

import java.util.Optional;

public interface ContactService {


    Optional<Contact> getContact(Long customerId);
    Optional<Contact> updateContact(int customerId, UpdateContactRequest request);


}
