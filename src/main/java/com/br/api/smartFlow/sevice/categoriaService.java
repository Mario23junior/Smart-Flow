package com.br.api.smartFlow.sevice;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.br.api.smartFlow.exceptions.ObjectNotFoundException;
import com.br.api.smartFlow.model.Categoria;
import com.br.api.smartFlow.repositrys.CategoriaRepository;

@Service
public class categoriaService {
  
	private CategoriaRepository repo;
	
	public categoriaService(CategoriaRepository repo) {
		this.repo = repo;
 	}
	
	public Categoria buscar(Long id) {
 		Optional<Categoria> fetchId  = repo.findById(id);
		return fetchId.orElseThrow(() -> new ObjectNotFoundException("O id "+ id +" de identificação de "
				+ "categoria não encontrada"));
	}
}
