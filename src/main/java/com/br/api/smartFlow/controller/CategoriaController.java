package com.br.api.smartFlow.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.api.smartFlow.model.Categoria;

@RestController
@RequestMapping("/api/v1/categorias/")
public class CategoriaController {
   
	@GetMapping
	public List<Categoria> listar() {
		
		Categoria cat1 = new Categoria(1l,"Informatica");
		Categoria cat2 = new Categoria(2l,"Escritorio");
		
		List<Categoria> lista = new ArrayList<Categoria>();
		lista.add(cat1);
		lista.add(cat2);
		
		return lista;
	}
}
