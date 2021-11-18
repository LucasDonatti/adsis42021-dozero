package com.unicesumar.adsis4s2021.dozero.meu.pessoa;

import javax.persistence.Entity;

@Entity
public class MeuAluno extends MeuPapel {

	private String ra;
	
	public String getRa() {
		return ra;
	}
	
	public void setRa(String ra) {
		this.ra = ra;
	}
	
}
