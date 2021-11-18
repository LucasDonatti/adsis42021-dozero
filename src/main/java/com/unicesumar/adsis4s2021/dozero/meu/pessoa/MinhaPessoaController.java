package com.unicesumar.adsis4s2021.dozero.meu.pessoa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unicesumar.adsis4s2021.dozero.meu.base.BaseCrudController;

@RestController
@RequestMapping("/api/minha-pessoa")
public class MinhaPessoaController extends BaseCrudController<MinhaPessoa, MinhaPessoaRepository, MinhaPessoaService> {

	@Autowired
	private MinhaPessoaService service;
	
//	@PostMapping("{id}/meu-aluno")
//	public String postAluno(@PathVariable("id") String id, @RequestBody MeuAluno novo) {
//		novo = service.criarMeuAluno(id, novo);
//		return novo.getId();
//	}
	
}
