package srs.customerservice.Services.Mappers;

import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import srs.customerservice.Entities.BillingAccount;
import srs.customerservice.Services.DTOs.Response.BillingAccountResponse.getBillingAccountResponse;

public interface BillingAccountMapper {

    BillingAccountMapper INSTANCE = Mappers.getMapper(BillingAccountMapper.class);

    @Mapping(source = "customer.id", target = "customerId")
    @Mapping(source = "address.id", target = "addressId")
    getBillingAccountResponse getBillingAccountResponseFromBillingAccount(BillingAccount billingAccount);
}
