package com.unicesumar.adsis4s2021.dozero.meu.musica;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unicesumar.adsis4s2021.dozero.meu.base.BaseCrudService;

@Service
@Transactional
public class MusicaService extends BaseCrudService<Musica, MusicaRepository> {
	
	@Autowired
	MusicaRepository repo;
	
	public List<Musica> obterTodos() {
		List<NomeAlbumDTO> encontrarNomes = repo.encontrarNomes();
		for (NomeAlbumDTO nomeAlbumDTO : encontrarNomes) {
			System.out.println(nomeAlbumDTO.getNome());
		}
		return repo.findAll();
	}
	
}
