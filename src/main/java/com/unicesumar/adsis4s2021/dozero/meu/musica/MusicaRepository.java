package com.unicesumar.adsis4s2021.dozero.meu.musica;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MusicaRepository extends JpaRepository<Musica, String> {
	
	@Query(name = "qr_encontrar_nome_album_dto", nativeQuery = true)
	List<NomeAlbumDTO> encontrarNomes();
	
}
