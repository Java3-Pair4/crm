package srs.customerservice.Services.Concretes;

import org.springframework.stereotype.Service;
import srs.customerservice.Entities.Customer;
import srs.customerservice.Repositories.CustomerRepository;
import srs.customerservice.Services.DTOs.Request.AddCustomerRequest;
import srs.customerservice.Services.Abstract.CustomerService;
import srs.customerservice.Services.DTOs.Request.Customer.UpdateCustomerRequest;
import srs.customerservice.Services.DTOs.Response.AddCustomerResponse;
import srs.customerservice.Services.DTOs.Response.getAddressResponse;
import srs.customerservice.Services.DTOs.Response.getContactResponse;
import srs.customerservice.Services.Mappers.CustomerMapper;

import java.util.Optional;


@Service
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
   public AddCustomerResponse add(AddCustomerRequest request) {

        Customer customer = CustomerMapper.INSTANCE.customerFromAddRequest(request);
        customer = customerRepository.save(customer);
        return CustomerMapper.INSTANCE.customerFromAddResponse(customer);
    }

    @Override
    public getAddressResponse getAddress(int id) {

        Optional<Customer> customer = customerRepository.findById(id);
        getAddressResponse customer1 = CustomerMapper.INSTANCE.getAddressFromCustomer(customer);


        return customer1;
    }

    @Override
    public getContactResponse getContact(int id) {
        Optional<Customer> customer = customerRepository.findById(id);
       getContactResponse customer2 = CustomerMapper.INSTANCE.getContactFromCustomer(customer);
        return customer2;
    }


    public Customer updateCustomer(int id, UpdateCustomerRequest request) {
        Customer customer = customerRepository.findById(id).orElseThrow(() -> new RuntimeException("Customer not found"));

        customer.setFirstName(request.getFirstName());
        customer.setMiddleName(request.getMiddleName());
        customer.setLastName(request.getLastName());
        customer.setMotherName(request.getMotherName());
        customer.setFatherName(request.getFatherName());
        customer.setGender(request.getGender());
        customer.setBirthDate(request.getBirthDate());
        customer.setNationalityID(request.getNationalityID());


        return customerRepository.save(customer);
    }

}
