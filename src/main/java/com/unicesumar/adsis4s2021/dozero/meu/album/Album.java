package com.unicesumar.adsis4s2021.dozero.meu.album;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;

import com.unicesumar.adsis4s2021.dozero.meu.base.BaseEntity;

@Entity
public class Album extends BaseEntity {

	@Column(nullable = false)
	private String nome;
	
	@Column(nullable = false)
	private String duracao;
	
	@Column(nullable = false)
	private Integer quantidadeDeMusicas;
	
	@Column(nullable = false)
	private Date dataDeLancamento;

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

	public Integer getQuantidadeDeMusicas() {
		return quantidadeDeMusicas;
	}

	public void setQuantidadeDeMusicas(Integer quantidadeDeMusicas) {
		this.quantidadeDeMusicas = quantidadeDeMusicas;
	}

	public Date getDataDeLancamento() {
		return dataDeLancamento;
	}

	public void setDataDeLancamento(Date dataDeLancamento) {
		this.dataDeLancamento = dataDeLancamento;
	}
	
}
