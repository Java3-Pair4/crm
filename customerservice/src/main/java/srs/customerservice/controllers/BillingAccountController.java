package srs.customerservice.controllers;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import srs.customerservice.Services.Abstract.BillingAccountService;
import srs.customerservice.Services.DTOs.Response.BillingAccountResponse.getBillingAccountResponse;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/BillingAccount")
public class BillingAccountController {


    private final BillingAccountService billingAccountService;


    public BillingAccountController(BillingAccountService billingAccountService) {
        this.billingAccountService = billingAccountService;
    }


    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    @Operation(summary = "GetById")
    public List<getBillingAccountResponse> getById(@PathVariable int id){
        return billingAccountService.getById(id);
    }






}
