package com.unicesumar.adsis4s2021.dozero.meu.musica;

import javax.persistence.Column;
import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedNativeQuery;
import javax.persistence.SqlResultSetMapping;

import com.unicesumar.adsis4s2021.dozero.meu.album.Album;
import com.unicesumar.adsis4s2021.dozero.meu.base.BaseEntity;

@Entity
@NamedNativeQuery(
		   name = "qr_encontrar_nome_album_dto",
		   query = "SELECT nome from album",
		   resultSetMapping = "rs_mapping_nome_album_dto"
		)
@SqlResultSetMapping(
	    name = "rs_mapping_nome_album_dto",
	    classes = @ConstructorResult(
	        targetClass = NomeAlbumDTO.class,
	        columns = {
	            @ColumnResult(name = "nome", type = String.class)
	        }
	    )
	)
public class Musica extends BaseEntity {
	
	@Column(nullable = false)
	private String nome;
	
	@Column(nullable = false)
	private String duracao;
	
	@ManyToOne
	@JoinColumn(name = "album_id")
	private Album album;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getDuracao() {
		return duracao;
	}
	
	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}
	
	public Album getAlbum() {
		return album;
	}
	
	public void setAlbum(Album album) {
		this.album = album;
	}
	
}
