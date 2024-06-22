package com.turkcell.searchservice.Repository;

import com.turkcell.searchservice.Entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

public interface SearchCustomerRepository {



    List<Customer> searchResult(String customerId , String nationalityId, String accountNumber,
                                 String firstName, String lastName);
}
