package com.pair4crm.productservice.services.concretes;

import com.pair4crm.productservice.repositories.CatalogRepository;
import com.pair4crm.productservice.services.abstracts.CatalogService;
import org.springframework.stereotype.Service;

@Service
public class CatalogServiceImpl implements CatalogService {

    private final CatalogRepository catalogRepository;

    public CatalogServiceImpl(CatalogRepository catalogRepository) {
        this.catalogRepository = catalogRepository;
    }
}
