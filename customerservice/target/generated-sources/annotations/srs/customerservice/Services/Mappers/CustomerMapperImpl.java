package srs.customerservice.Services.Mappers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.annotation.processing.Generated;
import srs.customerservice.Entities.Address;
import srs.customerservice.Entities.Customer;
import srs.customerservice.Services.DTOs.Request.AddCustomerRequest;
import srs.customerservice.Services.DTOs.Response.AddCustomerResponse;
import srs.customerservice.Services.DTOs.Response.getAddressResponse;
import srs.customerservice.Services.DTOs.Response.getContactResponse;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-06-27T14:22:10+0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.2 (Oracle Corporation)"
)
public class CustomerMapperImpl implements CustomerMapper {

    @Override
    public Customer customerFromAddRequest(AddCustomerRequest request) {
        if ( request == null ) {
            return null;
        }

        Customer customer = new Customer();

        if ( request.getCustomerID() != null ) {
            customer.setCustomerID( Integer.parseInt( request.getCustomerID() ) );
        }
        List<Address> list = request.getAddresses();
        if ( list != null ) {
            customer.setAddresses( new ArrayList<Address>( list ) );
        }
        customer.setNationalityID( request.getNationalityID() );
        customer.setAccountNumber( request.getAccountNumber() );
        customer.setFirstName( request.getFirstName() );
        customer.setLastName( request.getLastName() );
        customer.setMiddleName( request.getMiddleName() );
        customer.setMotherName( request.getMotherName() );
        customer.setFatherName( request.getFatherName() );
        customer.setGender( request.getGender() );
        customer.setBirthDate( request.getBirthDate() );

        return customer;
    }

    @Override
    public AddCustomerResponse customerFromAddResponse(Customer customer) {
        if ( customer == null ) {
            return null;
        }

        AddCustomerResponse addCustomerResponse = new AddCustomerResponse();

        addCustomerResponse.setId( customer.getId() );
        addCustomerResponse.setNationalityId( customer.getNationalityId() );
        addCustomerResponse.setAccountNumber( customer.getAccountNumber() );
        addCustomerResponse.setFirstName( customer.getFirstName() );
        addCustomerResponse.setMiddleName( customer.getMiddleName() );
        addCustomerResponse.setLastName( customer.getLastName() );
        addCustomerResponse.setFatherName( customer.getFatherName() );
        addCustomerResponse.setMotherName( customer.getMotherName() );
        addCustomerResponse.setGender( customer.getGender() );

        return addCustomerResponse;
    }

    @Override
    public getAddressResponse getAddressFromCustomer(Optional<Customer> customer) {
        if ( customer == null ) {
            return null;
        }

        getAddressResponse getAddressResponse = new getAddressResponse();

        return getAddressResponse;
    }

    @Override
    public getContactResponse getContactFromCustomer(Optional<Customer> customer) {
        if ( customer == null ) {
            return null;
        }

        int id = 0;
        String email = null;
        String gsmNumber = null;
        String homeNumber = null;
        String fax = null;

        getContactResponse getContactResponse = new getContactResponse( id, email, gsmNumber, homeNumber, fax );

        return getContactResponse;
    }
}
