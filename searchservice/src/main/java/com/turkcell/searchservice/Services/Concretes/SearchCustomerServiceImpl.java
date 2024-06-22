package com.turkcell.searchservice.Services.Concretes;

import com.turkcell.searchservice.Entities.Customer;
import com.turkcell.searchservice.Repository.FilterRepository;
import com.turkcell.searchservice.Services.Dto.Response.SearchCustomerResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class SearchCustomerServiceImpl {
    private final FilterRepository filterRepository;



    public void addCustomer(Customer customer) {
        this.filterRepository.save(customer);
    }


    public void updateCustomer(Customer customer) {
        this.filterRepository.save(customer);
    }


    public void deleteCustomer(Customer customer) {
        this.filterRepository.save(customer);
    }


    public Customer getById(String id) {
        Customer customer = filterRepository.findById(id).get();
        return customer;
    }


    public List<SearchCustomerResponse> getAll() {

        List<Customer> customerList = filterRepository.findAllByDeletedDateIsNull();

        List<SearchCustomerResponse> searchResponses = new ArrayList<>();
        for (Customer customer : customerList) {
            SearchCustomerResponse searchResponse = new SearchCustomerResponse();
            searchResponse.setCustomerId(customer.getCustomerId());
            searchResponse.setFirstName(customer.getFirstName());
            searchResponse.setLastName(customer.getLastName());
            searchResponse.setNationalityId(customer.getNationalityId());
            searchResponse.setAccountNumber(customer.getAccountNumber());


            searchResponses.add(searchResponse);
        }
        return searchResponses;
    }


    public List<SearchCustomerResponse> search(
            String customerId,String
            nationalityId,
            String accountNumber,
            String firstName,
            String lastName) {

        List<Customer> customers =
                this.filterRepository.searchResult( customerId, nationalityId, accountNumber, firstName, lastName
                );
        List<SearchCustomerResponse> searchResponses = new ArrayList<>();

        for (Customer customer : customers) {
            SearchCustomerResponse searchResponse = new SearchCustomerResponse();
            searchResponse.setCustomerId(customer.getCustomerId());
            searchResponse.setFirstName(customer.getFirstName());
            searchResponse.setLastName(customer.getLastName());
            searchResponse.setNationalityId(customer.getNationalityId());
            searchResponse.setAccountNumber(customer.getAccountNumber());

            searchResponses.add(searchResponse);
        }
        return searchResponses;
    }


}
