package com.pair4crm.productservice.services.mappers;

import com.pair4crm.productservice.dtos.requests.AddProdCharAndAddressRequest;
import com.pair4crm.productservice.dtos.requests.AddProductRequest;
import com.pair4crm.productservice.dtos.responses.getShowResponse;
import com.pair4crm.productservice.entities.Categori;
import com.pair4crm.productservice.entities.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

@Component
//@Mapper
public interface ProductMapper {


    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);

    Product productFromRequest (AddProductRequest request);

    Product productToListProductResponse(Product product);

    getShowResponse productToGetShowResponse(int id,String items);






/*
    @Mapping(target = "prodChar", source = "request.prodChar")
    @Mapping(target = "addresses", source = "request.addresses")
    Product addProdCharAndAddressRequestToProduct(AddProdCharAndAddressRequest request);

 */
}


