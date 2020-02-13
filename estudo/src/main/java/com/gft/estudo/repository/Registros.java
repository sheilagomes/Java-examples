package com.gft.estudo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gft.estudo.model.Registro;

public interface Registros  extends JpaRepository<Registro, Long> {

}
