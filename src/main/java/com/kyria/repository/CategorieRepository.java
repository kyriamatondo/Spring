package com.kyria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.kyria.model.Categorie;

public interface CategorieRepository extends JpaRepository<Categorie, Long> {

    @Query("FROM Categorie r WHERE r.id=:categorieId")
    public Categorie findCategoryById(@Param("categorieId") long id);

}
