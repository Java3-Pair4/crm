package srs.customerservice.Services.Concretes;

import org.springframework.stereotype.Service;
import srs.customerservice.Entities.BillingAccount;
import srs.customerservice.Repositories.BillingAccountRepository;
import srs.customerservice.Services.Abstract.BillingAccountService;
import srs.customerservice.Services.DTOs.Response.BillingAccountResponse.getBillingAccountResponse;
import srs.customerservice.Services.Mappers.BillingAccountMapper;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BillingAccountServiceImpl implements BillingAccountService {


   private final BillingAccountRepository billingAccountRepository;

    public BillingAccountServiceImpl(BillingAccountRepository billingAccountRepository) {
        this.billingAccountRepository = billingAccountRepository;
    }


    @Override
    public List<getBillingAccountResponse> getById(int id) {

        List<BillingAccount> billingAccounts = billingAccountRepository.findByCustomerId(id);
        List<getBillingAccountResponse> getBillingAccountList =
                billingAccounts.stream().map(BillingAccountMapper.INSTANCE::getBillingAccountResponseFromBillingAccount).collect(Collectors.toList());

        return getBillingAccountList;


    }
}
