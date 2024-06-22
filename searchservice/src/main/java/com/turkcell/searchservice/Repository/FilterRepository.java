package com.turkcell.searchservice.Repository;

import com.turkcell.searchservice.Entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FilterRepository extends JpaRepository<Customer, String>, SearchCustomerRepository {

    List<Customer> findAllByDeletedDateIsNull();
}
