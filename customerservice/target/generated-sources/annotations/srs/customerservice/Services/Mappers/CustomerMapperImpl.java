package srs.customerservice.Services.Mappers;

import java.time.ZoneOffset;
import java.util.Date;
import javax.annotation.processing.Generated;
import srs.customerservice.Entities.Customer;
import srs.customerservice.Services.DTOs.Request.AddCustomerRequest;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-05-31T20:50:01+0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21 (Oracle Corporation)"
)
public class CustomerMapperImpl implements CustomerMapper {

    @Override
    public Customer customerFromAddRequest(AddCustomerRequest request) {
        if ( request == null ) {
            return null;
        }

        Customer customer = new Customer();

        if ( request.getNationalityID() != null ) {
            customer.setNationalityID( request.getNationalityID().intValue() );
        }
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
}
