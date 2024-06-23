package srs.customerservice.Services.Abstract;

import srs.customerservice.Services.DTOs.Response.BillingAccountResponse.getBillingAccountResponse;

import java.util.List;

public interface BillingAccountService {


    List<getBillingAccountResponse> getById(int id);


}
