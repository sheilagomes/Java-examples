package com.gft.eventos.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.validation.constraints.NotEmpty;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;

@Entity
public class Evento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String nome;
	private int capacidade;
	
	@NotNull(message="A data é obrigatória")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	private Date data;
	
	@NotNull(message="O valor é obrigatório")
	@DecimalMin(value = "0.01", message = "O valor não pode ser menor que R$ 0,01")
	@DecimalMax(value = "999999.99", message = "O valor não pode ser maior que R$ 999.999,99")
	@NumberFormat(pattern = "#,##0.00")
	private BigDecimal precoIngresso;
	
//	@ManyToOne
//	@JoinColumn
	@Enumerated(EnumType.STRING)
	private CasaOpcoes casa;
	
	@Enumerated(EnumType.STRING)
	private GeneroOpcoes genero;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
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
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public BigDecimal getPrecoIngresso() {
		return precoIngresso;
	}
	public void setPrecoIngresso(BigDecimal precoIngresso) {
		this.precoIngresso = precoIngresso;
	}
	public CasaOpcoes getCasa() {
		return casa;
	}
	public void setCasa(CasaOpcoes casa) {
		this.casa = casa;
	}
	public GeneroOpcoes getGenero() {
		return genero;
	}
	public void setGenero(GeneroOpcoes genero) {
		this.genero = genero;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + capacidade;
		result = prime * result + ((casa == null) ? 0 : casa.hashCode());
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		result = prime * result + ((genero == null) ? 0 : genero.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((precoIngresso == null) ? 0 : precoIngresso.hashCode());
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
		if (casa != other.casa)
			return false;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		if (genero != other.genero)
			return false;
		if (id != other.id)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (precoIngresso == null) {
			if (other.precoIngresso != null)
				return false;
		} else if (!precoIngresso.equals(other.precoIngresso))
			return false;
		return true;
	}
}