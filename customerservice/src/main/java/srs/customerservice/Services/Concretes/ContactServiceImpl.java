package srs.customerservice.Services.Concretes;

import org.springframework.stereotype.Service;
import srs.customerservice.Entities.Contact;
import srs.customerservice.Repositories.ContactRepository;
import srs.customerservice.Services.Abstract.ContactService;
import srs.customerservice.Services.DTOs.Request.Contact.AddContactRequest;
import srs.customerservice.Services.DTOs.Request.Contact.UpdateContactRequest;

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
    public Optional<Contact> updateContact(int customerId, UpdateContactRequest request) {

       Contact contact = contactRepository.findById(customerId);

       contact.setEmail(request.getEmail());
       contact.setGsmNumber(request.getMobilePhone());
       contact.setHomeNumber(request.getHomePhone());
       contact.setFax(request.getFax());

        return Optional.of(contactRepository.save(contact));
    }

    @Override
    public void addContact(AddContactRequest request) {

        Contact contact = new Contact();
        contact.setEmail(request.getEmail());
        contact.setGsmNumber(request.getMobilePhone());
        contact.setHomeNumber(request.getHomePhone());
        contact.setFax(request.getFax());

        contactRepository.save(contact);

    }
}
