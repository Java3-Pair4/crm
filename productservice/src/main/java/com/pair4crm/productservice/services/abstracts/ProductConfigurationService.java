package com.pair4crm.productservice.services.abstracts;

import com.pair4crm.productservice.dtos.requests.AddProdCharAndAddressRequest;
import com.pair4crm.productservice.dtos.requests.AddProdCharRequest;
import com.pair4crm.productservice.dtos.requests.AddServiceAddressRequest;
import com.pair4crm.productservice.dtos.responses.ProductConfigurationResponse;
import com.pair4crm.productservice.dtos.responses.getShowResponse;
import com.pair4crm.productservice.dtos.responses.getSubmitDetayResponse;

import java.util.List;

public interface ProductConfigurationService {

    ProductConfigurationResponse getProductConfiguration(int Id);
    ProductConfigurationResponse addProdChar(int productId, AddProdCharRequest request);
    ProductConfigurationResponse addServiceAddress(int id, AddServiceAddressRequest request);
    List<String> getServiceAddress(int id);
    void AddProdCharAndAddress(int id, AddProdCharAndAddressRequest request);
    getSubmitDetayResponse getSubmitDetal(int id);
    getShowResponse getShow(int id);

}
