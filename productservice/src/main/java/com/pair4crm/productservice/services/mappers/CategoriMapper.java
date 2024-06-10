package com.pair4crm.productservice.services.mappers;

import com.pair4crm.productservice.dtos.responses.getCategoriResponse;
import com.pair4crm.productservice.entities.Categori;
import org.mapstruct.factory.Mappers;

public interface CategoriMapper {

    CategoriMapper INSTANCE = Mappers.getMapper(CategoriMapper.class);

    getCategoriResponse categoryToListCategoriResponse(Categori categori);




}
