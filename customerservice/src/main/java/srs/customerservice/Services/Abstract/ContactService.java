package srs.customerservice.Services.Abstract;

import srs.customerservice.Entities.Contact;
import srs.customerservice.Services.DTOs.Request.Address.UpdateAddressRequest;

import java.util.Optional;

public interface ContactService {


    Optional<Contact> getContact(Long customerId);
    void updateContact(int  customerId, UpdateAddressRequest request);










}
