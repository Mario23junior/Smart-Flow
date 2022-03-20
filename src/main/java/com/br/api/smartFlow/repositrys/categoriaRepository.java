package com.br.api.smartFlow.repositrys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.api.smartFlow.model.Categoria;

@Repository
public interface categoriaRepository extends JpaRepository<Categoria, Long>{

}
