package com.pair4crm.productservice.services.concretes;

import com.pair4crm.productservice.dtos.responses.getCategoriResponse;
import com.pair4crm.productservice.entities.Categori;
import com.pair4crm.productservice.repositories.CategoriRepository;
import com.pair4crm.productservice.services.abstracts.CategoriService;
import com.pair4crm.productservice.services.mappers.CategoriMapper;
import com.pair4crm.productservice.services.mappers.ProductMapper;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.List;


@Service
public class CategoriServiceImpl implements CategoriService {

    private final CategoriRepository categoriRepository;

    public CategoriServiceImpl(CategoriRepository categoriRepository) {
        this.categoriRepository = categoriRepository;
    }

    @Override
    public List<getCategoriResponse> getAll() {
       List<Categori>  getCategory =  categoriRepository.findAll();
       List<getCategoriResponse> getCategoriResponses = new ArrayList<>();


        getCategory.forEach(categori -> getCategoriResponses.add(CategoriMapper.INSTANCE.categoryToListCategoriResponse(categori)));


        // Customer customer = (Customer) CustomerMapper.INSTANCE.customerFromRequest(request);


        //Customer savedCustomer = customerRepository.save(customer);

       // return new AddCustomerResponse(savedCustomer.getFirstName());

        return getCategoriResponses;

    }


}
