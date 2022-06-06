package com.kyria.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kyria.model.Produit;
import com.kyria.service.CategorieSevice;
import com.kyria.service.ProduitService;

@RestController
@RequestMapping("/produit")
public class ProduitController {
	
	@Autowired
	private	ProduitService produitService;
	
	@Autowired
	private CategorieSevice categorieSevice;
	
	
	
	@PostMapping("/add")
	public String add(@RequestBody Produit produit) {
		categorieSevice.getAllCategories();
		produitService.Saveproduct(produit);
		return "Un produit ajouté";
	}

	@GetMapping("/getAll")
	public List<Produit> getAllProducts(){
		return produitService.getAllProducts();
	}
}
