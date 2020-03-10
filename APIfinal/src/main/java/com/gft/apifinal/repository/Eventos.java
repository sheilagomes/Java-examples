package com.gft.apifinal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gft.apifinal.domain.Evento;


@Repository
public interface Eventos extends JpaRepository<Evento, Long> {

}
