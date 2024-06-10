package srs.customerservice.Services.Mappers;

import java.time.ZoneOffset;
import java.util.Date;
import javax.annotation.processing.Generated;
import srs.customerservice.Entities.Customer;
import srs.customerservice.Services.DTOs.Request.AddCustomerRequest;
import srs.customerservice.Services.DTOs.Response.AddCustomerResponse;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-06-10T22:12:26+0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.3 (Amazon.com Inc.)"
)
public class CustomerMapperImpl implements CustomerMapper {

    @Override
    public Customer customerFromAddRequest(AddCustomerRequest request) {
        if ( request == null ) {
            return null;
        }

        Customer customer = new Customer();

        customer.setCustomerID( request.getCustomerID() );
        customer.setNationalityID( request.getNationalityID() );
        customer.setAccountNumber( request.getAccountNumber() );
        customer.setFirstName( request.getFirstName() );
        customer.setLastName( request.getLastName() );
        customer.setMiddleName( request.getMiddleName() );
        customer.setMotherName( request.getMotherName() );
        customer.setFatherName( request.getFatherName() );
        customer.setGender( request.getGender() );
        if ( request.getBirthDate() != null ) {
            customer.setBirthDate( Date.from( request.getBirthDate().atStartOfDay( ZoneOffset.UTC ).toInstant() ) );
        }

        return customer;
    }

    @Override
    public AddCustomerResponse customerFromAddResponse(Customer customer) {
        if ( customer == null ) {
            return null;
        }

        AddCustomerResponse addCustomerResponse = new AddCustomerResponse();

        if ( customer.getId() != null ) {
            addCustomerResponse.setId( customer.getId().intValue() );
        }
        addCustomerResponse.setAccountNumber( customer.getAccountNumber() );
        addCustomerResponse.setFirstName( customer.getFirstName() );
        addCustomerResponse.setMiddleName( customer.getMiddleName() );
        addCustomerResponse.setLastName( customer.getLastName() );
        addCustomerResponse.setFatherName( customer.getFatherName() );
        addCustomerResponse.setMotherName( customer.getMotherName() );
        addCustomerResponse.setGender( customer.getGender() );

        return addCustomerResponse;
    }
}
