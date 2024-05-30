package srs.customerservice.Services.Mappers;

import javax.annotation.processing.Generated;
import srs.customerservice.Entities.Customer;
import srs.customerservice.Services.DTOs.Request.AddCustomerRequest;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-05-30T22:40:50+0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.11 (Amazon.com Inc.)"
)
public class CustomerMapperImpl implements CustomerMapper {

    @Override
    public Customer customerFromAddRequest(AddCustomerRequest request) {
        if ( request == null ) {
            return null;
        }

        Customer customer = new Customer();

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
}
