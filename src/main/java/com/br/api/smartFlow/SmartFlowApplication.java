package com.br.api.smartFlow;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.br.api.smartFlow.model.Categoria;
import com.br.api.smartFlow.repositrys.categoriaRepository;

@SpringBootApplication
public class SmartFlowApplication implements CommandLineRunner{

	@Autowired
	private categoriaRepository categoriaRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(SmartFlowApplication.class, args);
	}
	
	public void run (String... args) throws Exception {
		Categoria cat1 = new Categoria(null,"Informatica");
		Categoria cat2 = new Categoria(null, "Sport");
		Categoria cat3 = new Categoria(null, "AI");

		
		categoriaRepository.saveAll(Arrays.asList(cat1,cat2,cat3));
	}

}
