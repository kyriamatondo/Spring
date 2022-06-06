package com.kyria.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kyria.model.Categorie;
import com.kyria.model.Produit;
import com.kyria.service.ProduitService;

@RestController
@RequestMapping()
public class ProduitController {

	@Autowired
	private ProduitService produitService;

	@PostMapping("/categories/{id}/produits")
	public ResponseEntity add(@RequestBody Produit produit, @PathVariable("id") Long id) {
		try {
			Categorie categorie = new Categorie();
			categorie.setId(id);
			produit.setCategorie(categorie);
			Produit pCreated = produitService.save(produit);
			if (pCreated != null)
				return ResponseEntity.status(HttpStatus.CREATED).body(pCreated);
			else
				return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Echec d'enregistrement");
		} catch (Exception e) {
			e.printStackTrace();
		}

		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);

	}

	@GetMapping("/getAll")
	public List<Produit> getAllProducts() {
		return produitService.getAll();
	}
}
