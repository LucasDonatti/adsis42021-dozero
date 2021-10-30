package com.unicesumar.adsis4s2021.dozero.meu.musica;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.unicesumar.adsis4s2021.dozero.meu.base.RequisiçãoPutInválida;

@RestController
@RequestMapping("/api/musicas")
public class MusicaController {
	
	@Autowired
	private MusicaService service;
	
	@GetMapping
	public List<Musica> getAll() {
		return service.getAll();
	}
	
	@GetMapping("/{id}")
	public Musica getById(@PathVariable("id") String id) {
		return service.getById(id);
	}
	
	@PostMapping
	@ResponseStatus(value = HttpStatus.CREATED)
	public String post(@RequestBody Musica nova) {
		nova = service.post(nova);
		return nova.getId();
	}
	
	@PutMapping("/{id}")
	public void put(@PathVariable("id") String id, @RequestBody Musica modificada) {
		if (!id.equals(modificada.getId())) {
			throw new RequisiçãoPutInválida();
		}
		service.put(modificada);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") String id) {
		service.delete(id);
	}
	
}
