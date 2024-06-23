package com.turkcell.BillingAccountService.Services.Concretes;

import com.turkcell.BillingAccountService.Repositories.BillingAccountRepository;
import com.turkcell.BillingAccountService.Services.Abstract.BillingAccountService;
import org.springframework.stereotype.Service;

@Service
public class BillingAccountServiceImpl implements BillingAccountService {


    private  final BillingAccountRepository billingAccountRepository;

    public BillingAccountServiceImpl(BillingAccountRepository billingAccountRepository) {
        this.billingAccountRepository = billingAccountRepository;
    }






}
