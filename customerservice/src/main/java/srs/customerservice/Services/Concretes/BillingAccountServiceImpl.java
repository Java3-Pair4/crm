package srs.customerservice.Services.Concretes;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import srs.customerservice.Entities.BillingAccount;
import srs.customerservice.Repositories.BillingAccountRepository;
import srs.customerservice.Services.Abstract.BillingAccountService;
import srs.customerservice.Services.DTOs.Request.BillingAccountRequest.createBillingAccountRequest;
import srs.customerservice.Services.DTOs.Request.BillingAccountRequest.updateBillingAccountRequest;
import srs.customerservice.Services.DTOs.Response.BillingAccountResponse.*;
import srs.customerservice.Services.Mappers.BillingAccountMapper;
import srs.customerservice.core.entities.business.paging.PageInfo;
import srs.customerservice.core.entities.business.paging.PageInfoResponse;

import java.time.LocalDateTime;
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

    @Override
    public updateBillingAccountResponse update(int id, updateBillingAccountRequest updateBillingAccountRequest) {
        BillingAccount savedBillingAccount = billingAccountRepository.findById(id).get();

        BillingAccount billingAccount = BillingAccountMapper.INSTANCE.billingAccountFromUpdateBillingAccountRequest(updateBillingAccountRequest);

        billingAccount.setId(id);
        billingAccount.setCustomer(savedBillingAccount.getCustomer());
        billingAccount.setUpdatedDate(LocalDateTime.now());
        BillingAccount updatedBillingAccount = billingAccountRepository.save(billingAccount);

        updateBillingAccountResponse updatedBillingAccountResponse =
                BillingAccountMapper.INSTANCE.updatedBillingAccountResponseFromBillingAccount(updatedBillingAccount);

        return updatedBillingAccountResponse;
    }

    @Override
    public deleteBillingAccountResponse delete(int id) {
        BillingAccount billingAccount = billingAccountRepository.findById(id).get();
        //rule
        billingAccount.setId(id);
        billingAccount.setDeletedDate(LocalDateTime.now());
        BillingAccount deletedBillingAccount = billingAccountRepository.save(billingAccount);

        deleteBillingAccountResponse deletedBillingAccountResponse =
                BillingAccountMapper.INSTANCE.deletedBillingAccountResponseFromBillingAccount(deletedBillingAccount);
        deletedBillingAccountResponse.setDeletedDate(deletedBillingAccount.getDeletedDate());
        return deletedBillingAccountResponse;
    }


}
