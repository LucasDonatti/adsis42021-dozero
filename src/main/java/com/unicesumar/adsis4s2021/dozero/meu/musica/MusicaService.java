package com.unicesumar.adsis4s2021.dozero.meu.musica;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unicesumar.adsis4s2021.dozero.meu.base.RegistroJáExistente;
import com.unicesumar.adsis4s2021.dozero.meu.base.RegistroNãoExistente;

@Service
@Transactional
public class MusicaService {

	@Autowired
	private MusicaRepository repo;
	
	public List<Musica> getAll() {
		return repo.findAll();
	}
	
	public Musica getById(String id) {
		try {
			return repo.findById(id).get();
		} catch (Exception e) {
			throw new RegistroNãoExistente();
		}
	}
	
	public Musica post(Musica nova) {
		if(repo.existsById(nova.getId())) {
			throw new RegistroJáExistente();
		}
		return repo.save(nova);
	}
	
	public void put(Musica modificada) {
		repo.save(modificada);
	}
	
	public void delete(String id) {
		repo.deleteById(id);
	}
	
}
