package com.unicesumar.adsis4s2021.dozero.meu.musica;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unicesumar.adsis4s2021.dozero.meu.base.BaseCrudController;

@RestController
@RequestMapping("/api/musicas")
public class MusicaController extends BaseCrudController<Musica, MusicaRepository, MusicaService> {
	
}
