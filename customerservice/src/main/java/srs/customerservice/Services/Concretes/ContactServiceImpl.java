package srs.customerservice.Services.Concretes;

import org.springframework.stereotype.Service;
import srs.customerservice.Entities.Contact;
import srs.customerservice.Repositories.ContactRepository;
import srs.customerservice.Services.Abstract.ContactService;
import srs.customerservice.Services.DTOs.Request.Address.UpdateAddressRequest;

import java.util.Optional;

@Service
public class ContactServiceImpl implements ContactService {

   private final ContactRepository contactRepository;

    public ContactServiceImpl(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }


    @Override
    public Optional<Contact> getContact(Long customerId) {
        return contactRepository.findById(customerId);
    }

    @Override
    public void updateContact(int customerId, UpdateAddressRequest request) {

    }
}
