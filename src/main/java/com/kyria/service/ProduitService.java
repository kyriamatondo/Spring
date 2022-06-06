package com.kyria.service;

import java.util.List;


import com.kyria.model.Produit;

public interface ProduitService {

	public Produit Saveproduct(Produit produit);
	
	public List<Produit> getAllProducts();
	
}
