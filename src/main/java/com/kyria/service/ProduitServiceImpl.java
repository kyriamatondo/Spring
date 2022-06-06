package com.kyria.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.kyria.model.Produit;
import com.kyria.repository.ProduitRepository;

@Service
public class ProduitServiceImpl implements ProduitService {
	
	@Autowired
	ProduitRepository produitRepository;

	@Override
	public Produit Saveproduct(Produit produit) {
		
		return produitRepository.save(produit);
	}

	@Override
	public List<Produit> getAllProducts() {
		
		return produitRepository.findAll();
	}

	

}
