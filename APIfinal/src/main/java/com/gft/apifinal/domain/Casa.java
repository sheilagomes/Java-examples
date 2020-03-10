package com.gft.apifinal.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import io.swagger.annotations.ApiModelProperty;

@Entity
public class Casa {

		@ApiModelProperty(example = "1")
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private long id;
		
		@ApiModelProperty(example = "Ágora")
		@NotEmpty(message="O nome é obrigatório")
		private String nome;
		
		@ApiModelProperty(example = "Rua Paulo Freire, 100")
		@NotEmpty(message="O endereço é obrigatório")
		private String endereco;
		
		@OneToMany(mappedBy="casa", cascade = CascadeType.ALL)
		private List<Evento> evento;

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

		public String getEndereco() {
			return endereco;
		}

		public void setEndereco(String endereco) {
			this.endereco = endereco;
		}

		public List<Evento> getEvento() {
			return evento;
		}

		public void setEvento(List<Evento> evento) {
			this.evento = evento;
		}
}
