package com.br.api.smartFlow.repositrys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.api.smartFlow.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{

}
