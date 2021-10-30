package com.unicesumar.adsis4s2021.dozero.meu.musica;

import java.util.Objects;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Musica {
	@Id
	private String id;
	@Column(nullable = false)
	private String nome;
	@Column(nullable = false)
	private String duracao;
	
	public Musica() {
		this.id = UUID.randomUUID().toString();
	}
	
	public Musica(String id) {
		this.id = id;
	}
	
	public String getId() {
		return id;
	}
	
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

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Musica other = (Musica) obj;
		return Objects.equals(id, other.id);
	}
	
}
