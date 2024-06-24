package srs.customerservice.controllers;

import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import srs.customerservice.Services.Abstract.BillingAccountService;
import srs.customerservice.Services.DTOs.Request.BillingAccountRequest.createBillingAccountRequest;
import srs.customerservice.Services.DTOs.Response.BillingAccountResponse.createdBillingAccountResponse;
import srs.customerservice.Services.DTOs.Response.BillingAccountResponse.getAllBillingAccountResponse;
import srs.customerservice.Services.DTOs.Response.BillingAccountResponse.getBillingAccountResponse;
import srs.customerservice.core.entities.business.paging.PageInfo;
import srs.customerservice.core.entities.business.paging.PageInfoResponse;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/BillingAccount")
public class BillingAccountController {


    private final BillingAccountService billingAccountService;


    public BillingAccountController(BillingAccountService billingAccountService) {
        this.billingAccountService = billingAccountService;
    }

   // müşterinin mevcut fatura hesapları liste şeklinde gösterilmelidir. FR14-3.madde
    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    @Operation(summary = "GetById")
    public List<getBillingAccountResponse> getById(@PathVariable int id){
        return billingAccountService.getById(id);
    }


    @GetMapping("/paging")
    @ResponseStatus(HttpStatus.OK)
    @Operation(summary = "GetAll")
    public PageInfoResponse<getAllBillingAccountResponse> getAllPage(PageInfo pageInfo) {
        return billingAccountService.getAllPage(pageInfo);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @Operation(summary = "Add")
    public createdBillingAccountResponse add(@Valid @RequestBody createBillingAccountRequest createBillingAccountRequest) {
        return billingAccountService.add(createBillingAccountRequest);
    }



}
