package com.gft.estudo.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Registro {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String descricao;
	private String recursos;
	
	@Enumerated(EnumType.STRING)
	private StatusRegistro status;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getRecursos() {
		return recursos;
	}
	public void setRecursos(String recursos) {
		this.recursos = recursos;
	}
	public StatusRegistro getStatus() {
		return status;
	}
	public void setStatus(StatusRegistro status) {
		this.status = status;
	}
	public boolean isPendente() {
		return StatusRegistro.PENDENTE.equals(this.status);
	}
//	public boolean isIniciado() {
//		return StatusRegistro.INICIADO.equals(this.status);
//	}
//	public String getPendente() {
//		String r = "";
//		if (getDescricao() == "PENDENTE") {
//			r ="label-red";
//		}
//		if (getDescricao() == "INICIADO") {
//			r = "label-blue";
//		}
//		if (getDescricao() == "CONCLUIDO") {
//			r = "label-green";
//		}
//		return r;
		
//		switch(uso) {
//			case descricao:
//				return "label-red";
//			case INICIADO:
//				return "label-blue";
//			case CONCLUIDO:
//				return "label-green";
//		}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((recursos == null) ? 0 : recursos.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
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
		Registro other = (Registro) obj;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (recursos == null) {
			if (other.recursos != null)
				return false;
		} else if (!recursos.equals(other.recursos))
			return false;
		if (status != other.status)
			return false;
		return true;
	}
	
	
}
