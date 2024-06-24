package srs.customerservice.Services.Abstract;

import srs.customerservice.Services.DTOs.Request.BillingAccountRequest.createBillingAccountRequest;
import srs.customerservice.Services.DTOs.Request.BillingAccountRequest.updateBillingAccountRequest;
import srs.customerservice.Services.DTOs.Response.BillingAccountResponse.*;
import srs.customerservice.core.entities.business.paging.PageInfo;
import srs.customerservice.core.entities.business.paging.PageInfoResponse;

import java.util.List;
import java.util.UUID;

public interface BillingAccountService {


    List<getBillingAccountResponse> getById(int id);
    PageInfoResponse<getAllBillingAccountResponse> getAllPage(PageInfo pageInfo);
    createdBillingAccountResponse add(createBillingAccountRequest createBillingAccountRequest);
    updateBillingAccountResponse update(int id, updateBillingAccountRequest updateBillingAccountRequest);
    deleteBillingAccountResponse delete(int id);


}
