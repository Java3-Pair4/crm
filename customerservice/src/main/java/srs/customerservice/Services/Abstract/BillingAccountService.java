package srs.customerservice.Services.Abstract;

import srs.customerservice.Services.DTOs.Response.BillingAccountResponse.getBillingAccountResponse;

import java.util.List;
import java.util.UUID;

public interface BillingAccountService {


    List<getBillingAccountResponse> getById(int id);


}
