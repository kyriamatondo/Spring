package com.kyria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kyria.model.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long> {

}
