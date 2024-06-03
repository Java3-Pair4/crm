package srs.customerservice.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import srs.customerservice.Entities.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address,Long> {
}
