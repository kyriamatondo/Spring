package com.kyria.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kyria.model.Categorie;
import com.kyria.service.CategorieSevice;

@RestController
@RequestMapping("/categorie")
public class CategorieController {
	
	@Autowired
	private CategorieSevice categorieSevice;
	
	@PostMapping("/add")
	public String add(@RequestBody Categorie categorie) {
		categorieSevice.saveCategorie(categorie);
		return "Une categorie ajoutée";
	}
	
	@GetMapping("/getAll")
	public List<Categorie> getAllCategories(){
		return categorieSevice.getAllCategories();
	}

}
