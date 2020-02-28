package com.gft.eventos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gft.eventos.model.Casa;

@Repository
public interface Casas extends JpaRepository<Casa, Long> {

}
