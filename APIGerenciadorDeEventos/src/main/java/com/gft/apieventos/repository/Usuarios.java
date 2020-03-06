package com.gft.apieventos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gft.apieventos.domain.Usuario;

@Repository
public interface Usuarios extends JpaRepository<Usuario, Long> {

}
