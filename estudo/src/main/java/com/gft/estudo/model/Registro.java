package com.gft.estudo.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Registro {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotEmpty(message="A descrição é obrigatória")
	private String descricao;
	
	@NotEmpty(message="O recurso é obrigatório")
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
	public boolean isIniciado() {
		return StatusRegistro.INICIADO.equals(this.status);
	}
	
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


//import javax.persistence.Temporal;
//import javax.persistence.TemporalType;
//import javax.validation.constraints.DecimalMax;
//import javax.validation.constraints.DecimalMin;
//import javax.validation.constraints.NotNull;
//import javax.validation.constraints.Size;
//import javax.validation.constraints.NotEmpty;
//
//import org.springframework.format.annotation.DateTimeFormat;
//import org.springframework.format.annotation.NumberFormat;
//
//
//@Entity
//public class Titulo {
//	
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private Long codigo;
//	
//	@NotEmpty(message="A descrição é obrigatória")
//	@Size(max = 60, message = "A descrição não pode ter mais de 60 caracteres")
//	private String descricao;
//	
//	@NotNull(message="A data é obrigatória")
//	@DateTimeFormat(pattern = "yyyy-MM-dd")
//	@Temporal(TemporalType.DATE)
//	private Date dataVencimento;
//	
//	@NotNull(message="O valor é obrigatório")
//	@DecimalMin(value = "0.01", message = "O valor não pode ser menor que R$ 0,01")
//	@DecimalMax(value = "999999.99", message = "O valor não pode ser maior que R$ 999.999,99")
//	@NumberFormat(pattern = "#,##0.00")
//	private BigDecimal valor;
//	
//	@Enumerated(EnumType.STRING)
//	private StatusTitulo status;
//	
//	public Long getCodigo() {
//		return codigo;
//	}
//	public void setCodigo(Long codigo) {
//		this.codigo = codigo;
//	}
//	public String getDescricao() {
//		return descricao;
//	}
//	public void setDescricao(String descricao) {
//		this.descricao = descricao;
//	}
//	public Date getDataVencimento() {
//		return dataVencimento;
//	}
//	public void setDataVencimento(Date dataVencimento) {
//		this.dataVencimento = dataVencimento;
//	}
//	public BigDecimal getValor() {
//		return valor;
//	}
//	public void setValor(BigDecimal valor) {
//		this.valor = valor;
//	}
//	public StatusTitulo getStatus() {
//		return status;
//	}
//	public void setStatus(StatusTitulo status) {
//		this.status = status;
//	}
//	public boolean isPendente() {
//		return StatusTitulo.PENDENTE.equals(this.status);
//	}
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
//		return result;
//	}
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Titulo other = (Titulo) obj;
//		if (codigo == null) {
//			if (other.codigo != null)
//				return false;
//		} else if (!codigo.equals(other.codigo))
//			return false;
//		return true;
//	}
//	
//	
//	
//}
