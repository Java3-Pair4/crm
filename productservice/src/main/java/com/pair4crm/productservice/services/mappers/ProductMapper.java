package com.pair4crm.productservice.services.mappers;

import com.pair4crm.productservice.dtos.requests.AddProductRequest;
import com.pair4crm.productservice.entities.Product;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ProductMapper {
    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);
    Product productFromRequest (AddProductRequest request);

    Product productToListProductResponse(Product product);
}
