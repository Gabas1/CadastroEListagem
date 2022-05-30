package com.ifce.br.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ifce.br.model.Jogo;

@Repository
public interface JogoRepository extends JpaRepository<Jogo, Long>{

	
	
}
