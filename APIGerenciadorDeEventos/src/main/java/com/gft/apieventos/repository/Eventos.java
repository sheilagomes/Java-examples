package com.gft.apieventos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gft.apieventos.domain.Evento;


@Repository
public interface Eventos extends JpaRepository<Evento, Long> {

}
