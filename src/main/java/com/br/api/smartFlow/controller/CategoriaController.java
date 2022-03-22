package com.br.api.smartFlow.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.api.smartFlow.model.Categoria;
import com.br.api.smartFlow.sevice.categoriaService;

@RestController
@RequestMapping("/api/v1/categorias/")
public class CategoriaController {
   
	private categoriaService service;
	
	public CategoriaController(categoriaService service) {
		this.service = service;
 	}
	
	@GetMapping("{id}")
	public ResponseEntity<?> find(@PathVariable Long id) {
		Categoria findId = service.buscar(id);
		return ResponseEntity.ok().body(findId);
 	}
}
