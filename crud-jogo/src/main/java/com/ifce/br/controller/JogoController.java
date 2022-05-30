package com.ifce.br.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ifce.br.model.Jogo;
import com.ifce.br.service.JogoService;

@Controller
public class JogoController {

	@Autowired
	private JogoService jogoService;
	
	@GetMapping("/olaMundo")
	public String olaMundo() {
		return "ola-mundo";
		
	}
	
	@GetMapping("jogo/formulario")
	public String formulario() {
		return "formulario";
	}
	@GetMapping("/jogo/salvar")
	public String salvar(Jogo jogo) {
		jogoService.cadastrarJogo(jogo);
		return "sucesso";
	}
	
	@GetMapping("/jogo/listar")
	public ModelAndView listarJogos() {
		List<Jogo> jogos = jogoService.listarJogos();
		ModelAndView mv = new ModelAndView("listagem-jogo");
		
		mv.addObject("listaJogos", jogos);
		
		return mv;
		
	}
	
}
