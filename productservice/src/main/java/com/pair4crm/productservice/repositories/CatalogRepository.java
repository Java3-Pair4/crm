package com.pair4crm.productservice.repositories;

import com.pair4crm.productservice.entities.Catalog;
import com.pair4crm.productservice.entities.Categori;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CatalogRepository extends JpaRepository<Catalog,Long> {
}
