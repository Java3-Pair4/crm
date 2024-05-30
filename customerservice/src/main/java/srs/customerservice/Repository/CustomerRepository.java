package srs.customerservice.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import srs.customerservice.Entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer , Long> {

}
