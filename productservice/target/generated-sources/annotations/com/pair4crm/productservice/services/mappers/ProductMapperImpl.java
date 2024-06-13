package com.pair4crm.productservice.services.mappers;

import com.pair4crm.productservice.dtos.requests.AddProductRequest;
import com.pair4crm.productservice.entities.Product;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-06-13T19:23:38+0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.2 (Oracle Corporation)"
)
public class ProductMapperImpl implements ProductMapper {

    @Override
    public Product productFromRequest(AddProductRequest request) {
        if ( request == null ) {
            return null;
        }

        Product product = new Product();

        return product;
    }

    @Override
    public Product productToListProductResponse(Product product) {
        if ( product == null ) {
            return null;
        }

        Product product1 = new Product();

        product1.setId( product.getId() );
        product1.setName( product.getName() );
        product1.setProdChar( product.getProdChar() );
        product1.setAdress( product.getAdress() );
        product1.setStartDate( product.getStartDate() );
        product1.setCategori( product.getCategori() );

        return product1;
    }
}
