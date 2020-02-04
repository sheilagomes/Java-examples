package com.algaworks.cobranca.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.algaworks.cobranca.model.Titulo;

public interface Titulos extends JpaRepository<Titulo, Long>{

}
