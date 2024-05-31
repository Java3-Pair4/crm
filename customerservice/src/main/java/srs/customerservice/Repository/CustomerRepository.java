package srs.customerservice.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import srs.customerservice.Entities.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer , Long> {

}
