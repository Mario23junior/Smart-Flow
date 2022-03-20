package com.br.api.smartFlow.sevice;

import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.br.api.smartFlow.model.Categoria;
import com.br.api.smartFlow.repositrys.categoriaRepository;

@Service
public class categoriaService {
  
	private categoriaRepository repo;
	
	public categoriaService(categoriaRepository repo) {
		this.repo = repo;
 	}
	
	public ResponseEntity<?> buscar(Long id) {
 		Optional<Categoria> fetchId  = repo.findById(id);
		return ResponseEntity.ok().body(fetchId);
	}
}
