package srs.customerservice.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import srs.customerservice.Entities.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer , Integer> {


   /* List<SearchCustomerResponse> findByCriteria(String nationalityId, String customerId, String accountNumber,

                                               String gsmNumber, String firstName, String lastName);*/

   // boolean existsByNationalityId(String  nationalityID);


}
