package com.pair4crm.productservice.repositories;

import com.pair4crm.productservice.entities.Categori;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CategoriRepository extends JpaRepository<Categori,Long> {


}
