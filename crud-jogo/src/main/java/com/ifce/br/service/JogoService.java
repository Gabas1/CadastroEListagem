package com.ifce.br.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ifce.br.model.Jogo;
import com.ifce.br.repository.JogoRepository;

@Service
public class JogoService {

	@Autowired
	private  JogoRepository jogoRepo;
	
	public void cadastrarJogo(Jogo jogo) {
		jogoRepo.save(jogo);
	}
	
	public List<Jogo> listarJogos(){
		return jogoRepo.findAll();
		
	}
	
}
