package com.gft.eventos.model;

import org.hibernate.annotations.Entity;

@Entity
public class Casa {
	private int id;
	private String nome;
	private String endereço;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereço() {
		return endereço;
	}
	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((endereço == null) ? 0 : endereço.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Casa other = (Casa) obj;
		if (endereço == null) {
			if (other.endereço != null)
				return false;
		} else if (!endereço.equals(other.endereço))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	} 
}
