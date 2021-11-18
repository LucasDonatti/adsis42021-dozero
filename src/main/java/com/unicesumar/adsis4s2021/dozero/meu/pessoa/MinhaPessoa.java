package com.unicesumar.adsis4s2021.dozero.meu.pessoa;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import com.unicesumar.adsis4s2021.dozero.meu.base.BaseEntity;

@Entity
public class MinhaPessoa extends BaseEntity {

	private String nome;
	
	private String email;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<MeuPapel> meusPapeis = new ArrayList<>();
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
}
