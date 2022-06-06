package com.kyria.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kyria.model.Categorie;
import com.kyria.model.Produit;
import com.kyria.repository.CategorieRepository;
import com.kyria.repository.ProduitRepository;

@Service
public class ProduitServiceImpl implements ProduitService {

	@Autowired
	private CategorieRepository categorieRepository;

	@Autowired
	ProduitRepository produitRepository;

	@Override
	public Produit save(Produit produit) {

		Categorie cat = this.categorieRepository.findCategoryById(produit.getCategorie().getId());
		produit.setCategorie(cat);
		return produitRepository.save(produit);
	}

	@Override
	public List<Produit> getAll() {

		return produitRepository.findAll();
	}

}
