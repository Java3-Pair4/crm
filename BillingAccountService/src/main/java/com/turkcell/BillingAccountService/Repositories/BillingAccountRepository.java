package com.turkcell.BillingAccountService.Repositories;

import com.turkcell.BillingAccountService.entities.BillingAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BillingAccountRepository extends JpaRepository<BillingAccount, Integer> {
}
