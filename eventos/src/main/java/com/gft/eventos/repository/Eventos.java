package com.gft.eventos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gft.eventos.model.Evento;

@Repository
public interface Eventos extends JpaRepository<Evento, Long> {

}
