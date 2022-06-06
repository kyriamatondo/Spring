package com.kyria.service;

import java.util.List;

import com.kyria.model.Categorie;

public interface CategorieSevice {
	
	public Categorie saveCategorie(Categorie categorie);
	
	public List<Categorie> getAllCategories();

}
