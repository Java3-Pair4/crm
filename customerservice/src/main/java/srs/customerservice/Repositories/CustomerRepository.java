package srs.customerservice.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import srs.customerservice.Entities.Customer;
import srs.customerservice.Services.DTOs.Request.SearchCustomerRequest;
import srs.customerservice.Services.DTOs.Response.SearchCustomerResponse;

import java.util.List;
import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer , Long> {


   /* List<SearchCustomerResponse> findByCriteria(String nationalityId, String customerId, String accountNumber,
                                                String gsmNumber, String firstName, String lastName);*/
}
