package srs.customerservice.Services.Concretes;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import srs.customerservice.Entities.BillingAccount;
import srs.customerservice.Repositories.BillingAccountRepository;
import srs.customerservice.Services.Abstract.BillingAccountService;
import srs.customerservice.Services.DTOs.Request.BillingAccountRequest.createBillingAccountRequest;
import srs.customerservice.Services.DTOs.Response.BillingAccountResponse.createdBillingAccountResponse;
import srs.customerservice.Services.DTOs.Response.BillingAccountResponse.getAllBillingAccountResponse;
import srs.customerservice.Services.DTOs.Response.BillingAccountResponse.getBillingAccountResponse;
import srs.customerservice.Services.Mappers.BillingAccountMapper;
import srs.customerservice.core.entities.business.paging.PageInfo;
import srs.customerservice.core.entities.business.paging.PageInfoResponse;
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

    @Override
    public PageInfoResponse<getAllBillingAccountResponse> getAllPage(PageInfo pageInfo) {
        Pageable pageable = PageRequest.of(pageInfo.getPage(), pageInfo.getSize());

        Page<BillingAccount> response = billingAccountRepository.findAll(pageable);
        Page<getAllBillingAccountResponse> responsePage = response.map(billingAccount ->
                BillingAccountMapper.INSTANCE.getAllBillingAccountResponse(billingAccount));
        return new PageInfoResponse<>(responsePage);
    }

    @Override
    public createdBillingAccountResponse add(createBillingAccountRequest createBillingAccountRequest) {


        BillingAccount billingAccount =
                BillingAccountMapper.INSTANCE.billingAccountFromCreateBillingAccountRequest(createBillingAccountRequest);

        BillingAccount createdBillingAccount =
                billingAccountRepository.save(billingAccount);

        createdBillingAccountResponse createdBillingAccountResponse =
                BillingAccountMapper.INSTANCE.createdBillingAccountResponseFromBillingAccount(createdBillingAccount);

        return createdBillingAccountResponse;

    }


}
