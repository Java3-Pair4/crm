package srs.customerservice.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import srs.customerservice.Entities.Address;

import java.util.List;

@Repository
public interface AddressRepository extends JpaRepository<Address,Long> {
    Address findById(int id);
    List<Address> findByCustomerId(Long customerId);
}
