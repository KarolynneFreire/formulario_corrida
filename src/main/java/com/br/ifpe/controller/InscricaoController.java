package com.br.ifpe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.br.ifpe.model.Inscricao;
import com.br.ifpe.model.InscricaoDAO;


@Controller
public class InscricaoController {
	
	@Autowired
	private InscricaoDAO dao;
	
	
	
	@GetMapping("/exibirInscricao")
	public String exibirForm(Inscricao inscricao) {
		return "form-inscricao";
	}
	
	@PostMapping("/salvarInscricao")
	public String salvarInscricao(Inscricao inscricao) {
		dao.save(inscricao);
		return "redirect:/listarInscricao";
	}
	
	@GetMapping("/listarInscricao")
	public String listarInscricao(Model model) {
		model.addAttribute("lista", dao.findAll());
		return "list-inscricao";
	}
	
	@GetMapping("/removerInscricao")
	public String removerInscricao(Integer codigo) {
		dao.deleteById(codigo);
		return "redirect:/listarinscricao";
	}
	
	@GetMapping("/editarInscricao")
	public String editarInscricao(Integer codigo, Model model) {
		Inscricao inscricao = dao.findById(codigo).orElse(null);
		model.addAttribute("inscricao", inscricao);
		return "form-inscricao";
	}

}
