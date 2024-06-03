package srs.customerservice.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import srs.customerservice.Entities.Customer;

import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer , Long> {

    Optional<Customer> findByNationalityId(int nationalityId);
}
