package com.unicesumar.adsis4s2021.dozero.meu.pessoa;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unicesumar.adsis4s2021.dozero.meu.base.BaseCrudService;

@Service
@Transactional
public class MinhaPessoaService extends BaseCrudService<MinhaPessoa, MinhaPessoaRepository> {

	@Autowired
	private MinhaPessoaRepository repo;
	
//	public MeuAluno criarMeuAluno(String id, MeuAluno novo) {
//		
//	}
	
}
