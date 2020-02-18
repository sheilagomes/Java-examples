package com.gft.eventos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gft.eventos.model.Evento;

public interface Eventos extends JpaRepository<Evento, Long> {

}
