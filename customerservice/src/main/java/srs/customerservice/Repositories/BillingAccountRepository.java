package srs.customerservice.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import srs.customerservice.Entities.BillingAccount;

import java.util.List;
import java.util.UUID;

public interface BillingAccountRepository extends JpaRepository<BillingAccount,Integer> {

    List<BillingAccount> findByCustomerId(int customerId);
}
