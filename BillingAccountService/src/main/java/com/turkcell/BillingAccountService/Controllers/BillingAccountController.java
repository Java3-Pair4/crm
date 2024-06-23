package com.turkcell.BillingAccountService.Controllers;

import com.turkcell.BillingAccountService.Services.Abstract.BillingAccountService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/BillingAccount")
public class BillingAccountController {


    private final BillingAccountService billingAccountService;


    public BillingAccountController(BillingAccountService billingAccountService) {
        this.billingAccountService = billingAccountService;
    }







}
