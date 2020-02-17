package com.gft.eventos.model;

public class Evento {
	private int id;
	private String nome;
	private int capacidade;
	private float precoIngresso;
	private String casa;
	
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
	public int getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	public float getPrecoIngresso() {
		return precoIngresso;
	}
	public void setPrecoIngresso(float precoIngresso) {
		this.precoIngresso = precoIngresso;
	}
	public String getCasa() {
		return casa;
	}
	public void setCasa(String casa) {
		this.casa = casa;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + capacidade;
		result = prime * result + ((casa == null) ? 0 : casa.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + Float.floatToIntBits(precoIngresso);
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
		Evento other = (Evento) obj;
		if (capacidade != other.capacidade)
			return false;
		if (casa == null) {
			if (other.casa != null)
				return false;
		} else if (!casa.equals(other.casa))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (Float.floatToIntBits(precoIngresso) != Float.floatToIntBits(other.precoIngresso))
			return false;
		return true;
	}
}
