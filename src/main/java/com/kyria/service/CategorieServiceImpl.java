package com.kyria.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kyria.model.Categorie;
import com.kyria.repository.CategorieRepository;

@Service
public class CategorieServiceImpl implements CategorieSevice {

	@Autowired
	private CategorieRepository categorieRepository;

	@Override
	public Categorie saveCategorie(Categorie categorie) {

		return categorieRepository.save(categorie);
	}

	@Override
	public List<Categorie> getAllCategories() {

		return categorieRepository.findAll();
	}

}
